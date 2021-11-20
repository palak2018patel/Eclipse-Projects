import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC5 {
	static WebDriver driver;
	static WebDriverWait wait;
	 static ExtentTest test; 
	 static ExtentReports extent;
	
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 
		 wait = new WebDriverWait(driver,20);
		 
		 String path= System.getProperty("user.dir")+"//target//basicReport.html"; 
		 extent=new ExtentReports();
		 ExtentHtmlReporter htmlReport =new ExtentHtmlReporter(path);
		 extent.attachReporter(htmlReport);	
		 test=extent.createTest("rememberUsername_TC5");
		 System.out.println(" creating report..................................");	   
		 
		 TC5.rememberUsername_TC5();
		 extent.flush();
	
	}

	 public static void rememberUsername_TC5() throws InterruptedException{
		 	driver.navigate().to("https://login.salesforce.com/");
			System.out.println("Salesforce application is launched");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]")));         //Thread.sleep(1000);BadPractice		
			driver.findElement(By.id("username")).sendKeys("palak@tekarch.com");
			System.out.println("Username is entered");
			driver.findElement(By.id("password")).sendKeys("salesforce@1");
			System.out.println(" password is entered");
			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/label")).click();
			System.out.println(" Clicked remember Me button");
			driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
			
			System.out.println(" Clicked the login button");
			Thread.sleep(20000);
			System.out.println(" Home page is displayed");	
			Thread .sleep(9000);			
			driver.findElement(By.xpath("//*[@id=\"userNav\"]")).click();
			System.out.println("Clicked on the user menu drop down ");
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"userNav-menuItems\\\"]/a[5]")));
			Thread.sleep(9000);
			driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]")).click();
			System.out.println("Clicked on the log out link from the user menu drop down list");
			System.out.println("Login sales force page is displayed with <username> populated");
			/*Thread.sleep(10000);
			driver.findElement(By.xpath("//*[@id=\"login_form\"]/div[3]/label")).click();
			System.out.println(" Clicked remember Me button to uncheck");
			driver.findElement(By.xpath("//*[@id=\"hint_back_chooser\"]")).click();
			System.out.println("clicked on 1 username saved button");
			driver.findElement(By.id("edit")).click();
			System.out.println("Clicked edit button to clear user name");
			driver.findElement(By.className("hintclearicon")).click();
			System.out.println("clicked clear icon");
			driver.findElement(By.name("Save")).click();
			System.out.println("Saved the changes");
			Thread.sleep(10000);
			driver.findElement(By.id("username")).sendKeys("palak@tekarch.com");
			System.out.println("Username is entered");			
			driver.findElement(By.id("password")).sendKeys("salesforce@12345");
			System.out.println(" password is entered");
			driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
			System.out.println("Clicked the login button");
			System.out.println(" Home page is displayed");				
			driver.findElement(By.xpath("//*[@id=\"userNav\"]")).click();
			System.out.println("Clicked on the user menu drop down ");
			//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"userNav-menuItems\\\"]/a[5]")));
			Thread.sleep(9000);
			driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[5]")).click();
			System.out.println("Clicked on the log out link from the user menu drop down list");
			System.out.println("Login sales force page is displayed with unchecked remember_me and unpopulated user name field");
			
			*/
		}	

	
}
