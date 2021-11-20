import org.eclipse.jetty.io.ByteBufferPool.Bucket;
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

public class TC15 {
		static WebDriver driver;
		static WebDriverWait wait;	
		static Actions action;
		static ExtentTest test; 
		static ExtentReports extent;
	
	public static void main(String[] args) throws InterruptedException{
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 
		 wait = new WebDriverWait(driver,20);
		 
		 String path= System.getProperty("user.dir")+"//target//basicReport.html"; 
		 extent=new ExtentReports();
		 ExtentHtmlReporter htmlReport =new ExtentHtmlReporter(path);
		 extent.attachReporter(htmlReport);	
		 test=extent.createTest("selectOpportunitiesLink_TC15");
		 System.out.println(" creating report..................................");	   
		 
		 TC15.selectOpportunitiesLink_TC15();			 
		 extent.flush();  
		 		 
		 action=new Actions(driver);			
	}
	
	public static void selectOpportunitiesLink_TC15() throws InterruptedException{
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
		driver.findElement(By.xpath("//a[(@title='Opportunities Tab')]")).click();
		System.out.println("Clicked on opportunities link ");
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//select[(@id='fcf')]")).click();
		System.out.println("Clicked on opprtunities drop down list ");
		
	
		/*Thread.sleep(9000);
		driver.findElement(By.xpath("")).click();
		System.out.println("Clicked on  ");*/
		}
}