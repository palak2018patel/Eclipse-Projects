import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC05 {
	static WebDriver driver;
	static WebDriverWait wait;	
	static ExtentTest test;
	static ExtentReports extent;

	public static void main(String[] args)throws InterruptedException {	
		
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 wait = new WebDriverWait(driver,20);
		 
		 String reportPath = System.getProperty("user.dir") + "//target//createview.html";
			extent = new ExtentReports();
			ExtentHtmlReporter htmlReport = new ExtentHtmlReporter(reportPath);
			extent.attachReporter(htmlReport);
			test = extent.createTest("loginErrorMessage_TC05");
			System.out.println(" creating report..................................");
			extent.flush();	 
		 
		 TC05.select_UserMenu_Dropdown_TC05();	
		
	}		
		 public static void select_UserMenu_Dropdown_TC05() throws InterruptedException{
		
		driver.navigate().to("https://login.salesforce.com/");
		System.out.println("Salesforce application is launched");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]")));         //Thread.sleep(1000);BadPractice		
		driver.findElement(By.id("username")).sendKeys("palak@tekarch.com");
		System.out.println("Username is entered");
		driver.findElement(By.id("password")).sendKeys("salesforce@1");
		System.out.println(" password is entered");
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		System.out.println("Login attempted by clicking the login button");
		System.out.println(" home page is displayed");	
		driver.findElement(By.xpath("//*[@id=\"userNav\"]")).click();
		System.out.println("Clicked on the user menu drop down ");		
		
		
	}

}
