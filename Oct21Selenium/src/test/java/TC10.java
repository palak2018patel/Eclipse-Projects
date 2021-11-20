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

public class TC10 {
	static WebDriver driver;
	static WebDriverWait wait;	
	static Actions action;
	static ExtentTest test;
	static ExtentReports extent;
	
	public static void main(String[] args) throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 
		 wait = new WebDriverWait(driver,20);
		 
		    String reportPath = System.getProperty("user.dir") + "//target//createview.html";
			extent = new ExtentReports();
			ExtentHtmlReporter htmlReport = new ExtentHtmlReporter(reportPath);
			extent.attachReporter(htmlReport);
			test = extent.createTest("create_An_Account_TC10");
			System.out.println(" creating report..................................");
			
		 TC10.create_An_Account_TC10();
		 extent.flush();
		action=new Actions(driver);
	}
public static void create_An_Account_TC10() throws InterruptedException{
		
		driver.navigate().to("https://login.salesforce.com/");
		System.out.println("Salesforce application is launched");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]")));         //Thread.sleep(1000);BadPractice		
		
		driver.findElement(By.id("username")).sendKeys("palak@tekarch.com");
		System.out.println("Username is entered");
		
		driver.findElement(By.id("password")).sendKeys("salesforce@1");
		System.out.println(" password is entered");
		
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		System.out.println("Login done by clicking the login button");
		System.out.println(" home page is displayed");			
		Thread.sleep(3000);		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		driver.findElement(By.xpath("//a[(@title=\"Accounts Tab\")]")).click();
		System.out.println("Clicked on Accounts link on the Home Page");
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//input[(@title=\"New\")]")).click();
		System.out.println("Clicked on the New button for creating new account");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[(@id=\"acc2\")]")).sendKeys("Pete Patel");
		System.out.println("Entered new account name");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[(@title=\"Save\")]")).click();
		System.out.println("Clicked on save button");	
	
		Thread.sleep(9000);
		driver.close();
}
}
	

