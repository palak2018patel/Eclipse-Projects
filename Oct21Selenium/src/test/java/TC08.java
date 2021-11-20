import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC08 {
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
			test = extent.createTest("select_DevelopersConsole_In_usermenu_TC08");
			System.out.println(" creating report..................................");
			
		 TC08.select_DevelopersConsole_In_usermenu_TC08();
		 extent.flush();
		action=new Actions(driver);
	}	
	
	public static void select_DevelopersConsole_In_usermenu_TC08() throws InterruptedException{
		
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
		
		driver.findElement(By.xpath("//*[@id=\"userNav\"]")).click();
		System.out.println("Clicked on the user menu drop down ");	
		Thread.sleep(3000);
		
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		driver.findElement(By.xpath("//a[(@class=\"debugLogLink menuButtonMenuLink\")]")).click();
		System.out.println("Clicked on the Developer Console button");
	
		Thread.sleep(5000);
		//driver.findElement(By.id("PersonalInfo_font")).click();//how did you bring this one here???
		//System.out.println("Clicked on the personal link ");
		//Thread.sleep(3000);
		
		driver.close();
	}		
		
	

}
