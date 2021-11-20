
//import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Sesion2 {
	static WebDriver driver;
	static ExtentTest test;
	static ExtentReports extent;


	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		// reportPath="C:\\Users\\palak\\eclipse-workspace\\Oct21Selenium\\target\\basicReport.html";
		
		String reportPath = System.getProperty("user.dir") + "//target//createview.html";
		extent = new ExtentReports();
		ExtentHtmlReporter htmlReport = new ExtentHtmlReporter(reportPath);
		extent.attachReporter(htmlReport);
		test = extent.createTest("loginErrorMessage_TC01");
		System.out.println(" creating report..................................");
		
		Sesion2.loginErrorMessage_TC01();
		extent.flush();
		// test.info("pageloaded");
		// test.debug("username is entered");
		// test.fail("loginErrorMessage_TC01:FAILED");//
		// test.pass("loginErrorMessage_TC01:PASSED");// test.log(Status.Fail),"");

	}

	public static void loginErrorMessage_TC01() throws InterruptedException {

		
		driver.navigate().to("https://selenium-prd.firebaseapp.com/");
		System.out.println("Application launched");
		test.log(Status.INFO, "URL of the application is launched");
		// wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(""")))
		Thread.sleep(1000);
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		test.log(Status.INFO, "email entered");
		Thread.sleep(3000);
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		test.log(Status.INFO, "password entered");
		Thread.sleep(3000);
		// wait.until(ExpectedConditions.alertIsPresent());
		driver.findElement(By.xpath("//*[@id=\"login_div\"]/button")).click();
		test.log(Status.INFO, "login clicked");
		Thread.sleep(5000);
		driver.findElement(By.linkText("Home")).click();
		test.log(Status.INFO, "home page tab is clicked");
		test.log(Status.INFO, "username entered");
		if (driver.findElement(By.linkText("Home")).isDisplayed()) {
			test.log(Status.PASS, "loginErrorMessage_TC01:PASSED");
		} else {
			test.log(Status.PASS, "loginErrorMessage_TC01:FAILED");
		}
		// driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/a[1]")).click();
		// driver.findElement(By.name("name")).sendKeys("Mithun");
		// wait.until(ExpectedConditions.alertIsPresent());
		// driver.close();

	}
}

/*
 * //Wait<WebDriver> wait1=new
 * FluentWait<WebDriver>(driver).withTimeout(30,TimeUnit.SECONDS).pollingEvery(
 * 30,TimeUnit.SECONDS).ignoring(NoSuchElementException.class);
 * //if(driver.findElement(By.id("male")).isSelected()) { //
 * driver.findElement(By.name("submit")).click(); //} //else {
 * //driver.findElement(By.id("male")).click(); }
 * 
 * String value;
 * 
 * for (int row=1;row<=10;row++) { for(int col=row; col<=3;col++) { value =
 * driver.findElement(By.xpath("//table/tbody/tr["+row+"]/td["+col+"]")).getText
 * ();
 */
