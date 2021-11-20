import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC4 {
	static WebDriver driver;
	static WebDriverWait wait;
	 static ExtentTest test; 
	 static ExtentReports extent;
	 static Actions action;
	public static void main(String[] args) throws InterruptedException {
		//action=new Actions(driver);	//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);	
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 
		 wait = new WebDriverWait(driver,20);
		 
		 String path= System.getProperty("user.dir")+"//target//basicReport.html"; 
		 extent=new ExtentReports();
		 ExtentHtmlReporter htmlReport =new ExtentHtmlReporter(path);
		 extent.attachReporter(htmlReport);	
		 test=extent.createTest("validateLoginErrorMessage_TC4");
		 System.out.println(" creating report..................................");	   
		 
		 TC4.validateLoginErrorMessage_TC4();	
		 extent.flush();
	}
	
	 public static void validateLoginErrorMessage_TC4() throws InterruptedException{
		 	
		 
		 
		 	driver.navigate().to("https://login.salesforce.com/");
			System.out.println("Salesforce application is launched");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]")));         //Thread.sleep(1000);BadPractice		
			driver.findElement(By.id("username")).sendKeys("123");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.id("password")));
			System.out.println("Wrong Username is entered");
			driver.findElement(By.id("password")).sendKeys("22131");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"Login\"]"))); 
			System.out.println(" Wrong password is entered");
			driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
			System.out.println("Login attempted by clicking the login button");
			System.out.println(" Error message-Login attempt failed-user name or password is incorrect- is displayed");		
		    //driver.close(); // closes very fast so if you need to see result keep it commented else uncomment
}
}