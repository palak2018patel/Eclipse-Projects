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

public class TC20 {
	static WebDriver driver;
	static WebDriverWait wait;	
	static Actions action;	
	static ExtentTest test; 
	static ExtentReports extent;

	public static void main(String[] args)  throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 
		 wait = new WebDriverWait(driver,20);
		 
		 String path= System.getProperty("user.dir")+"//target//basicReport.html"; 
		 extent=new ExtentReports();
		 ExtentHtmlReporter htmlReport =new ExtentHtmlReporter(path);
		 extent.attachReporter(htmlReport);	
		 test=extent.createTest("checkLeadsTabLink_TC20");
		 System.out.println(" creating report..................................");	   
		 
		 TC20.checkLeadsTabLink_TC20();	 
		 extent.flush();   
		 	
		 action=new Actions(driver);
		
	}
	
	public static void checkLeadsTabLink_TC20() throws InterruptedException{
		driver.navigate().to("https://login.salesforce.com/");
		System.out.println("Salesforce application is launched");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]")));  //Thread.sleep(1000);BadPractice		
		
		driver.findElement(By.id("username")).sendKeys("palak@tekarch.com");
		System.out.println("Username is entered");
		
		driver.findElement(By.id("password")).sendKeys("salesforce@1");
		System.out.println(" password is entered");
		
		driver.findElement(By.xpath("//input[(@id='Login')]")).click();
		System.out.println("Login done by clicking the login button");
		System.out.println(" home page is displayed");			
		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//a[(@title='Leads Tab')]")).click();
		System.out.println("Clicked on Leads tab link ");
		
		driver.findElement(By.xpath("//*[@id=\"bodyCell\"]/div[3]/div[1]/div")).isDisplayed();
		System.out.println("Leads Page is displayed");
	
	}
}
