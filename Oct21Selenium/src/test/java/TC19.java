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

public class TC19 {
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
		 test=extent.createTest("testQuarterlySummaryReport_TC19");
		 System.out.println(" creating report..................................");	   
		 
		 TC19.testQuarterlySummaryReport_TC19();		 
		 extent.flush();  	 
		
		 action=new Actions(driver);
		 }
	public static void testQuarterlySummaryReport_TC19() throws InterruptedException{
		driver.navigate().to("https://login.salesforce.com/");
		System.out.println("Salesforce application is launched");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]")));  //Thread.sleep(1000);BadPractice		
		
		driver.findElement(By.id("username")).sendKeys("palak@tekarch.com");
		System.out.println("Username is entered");
		
		driver.findElement(By.id("password")).sendKeys("salesforce@1");
		System.out.println(" password is entered");
		
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		System.out.println("Login done by clicking the login button");
		System.out.println(" home page is displayed");			
		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//a[(@title='Opportunities Tab')]")).click();
		System.out.println("Clicked on opportunities link ");
		
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("")).click();//Not needed because was open table
		System.out.println("Clicked on Quarterly Summary link  ");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//select[(@id='quarter_q')]")).click();
		System.out.println("Clicked on selection Interval list");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"quarter_q\"]/option[2]")).click();
		System.out.println("Clicked on selection  Current & Next FQ from interval");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//select[(@id='open')]")).click();
		System.out.println("Clicked on  Include box for drop down list ALL/open/closed opty");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"open\"]/option[1]")).click();
		System.out.println("Clicked on a  interval selection ");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[(@value='Run Report')]")).click();
		System.out.println("Clicked on Run report button ");
		
		driver.findElement(By.xpath("//*[@id=\"noTableContainer\"]/div/div[1]/div[1]/div[1]/h1")).isDisplayed();
		
		//Thread.sleep(5000);
		//driver.findElement(By.xpath("")).click();
		//System.out.println("Clicked on selection ");
		
	}
}
