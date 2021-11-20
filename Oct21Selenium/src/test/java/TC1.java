import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1 {
		static WebDriver driver;
		static WebDriverWait wait;
		 static ExtentTest test;
		  static ExtentReports extent;	
		  	
	 public static void main(String[] args) throws InterruptedException{
		 WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 wait = new WebDriverWait(driver,20);
		 //TC1.loginErrorMessage_TC1();	
		
		 
		 String path=System.getProperty("user.dir")+"//target//basicReport.html";
		 extent=new ExtentReports();
		 ExtentHtmlReporter htmlReport =new ExtentHtmlReporter(path);
		 extent.attachReporter(htmlReport);
		 //driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 //test.info("pageloaded");
		 //test.debug("username is entered");		
		 //test.fail("loginErrorMessage_TC1:FAILED");// test.pass("loginErrorMessage_TC01:PASSED");// test.log(Status.Fail),"");
		 test=extent.createTest("loginErrorMessage_TC1");
		
		 TC1.loginErrorMessage_TC1();
		 extent.flush();  		 
	}	 
	public static void loginErrorMessage_TC1() throws InterruptedException{
		driver.navigate().to("https://login.salesforce.com/");
		System.out.println("Salesforce application is launched");
		test.log(Status.INFO, "URL of the application is launched");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]")));         //Thread.sleep(1000);BadPractice		
		driver.findElement(By.id("username")).sendKeys("palak@tekarch.com");
		System.out.println("Username is entered");
		test.log(Status.INFO, "email entered");
		driver.findElement(By.id("password")).sendKeys("xyz");
		System.out.println("Wrong password is entered");
		driver.findElement(By.id("password")).clear();
		System.out.println("password is cleared");
		test.log(Status.INFO, "password not entered");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		System.out.println("Login attempted by clicking the login button");
		test.log(Status.INFO, "login clicked");
		driver.findElement(By.xpath("//div[(@id=\"error\")]")).getText();
		
		System.out.println("Error message is displayed");		
		
	}	

}
