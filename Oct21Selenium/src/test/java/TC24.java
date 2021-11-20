import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.CaptureScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC24 {
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
		 test=extent.createTest("TodaysLeads_TC24");
		 System.out.println(" creating report..................................");	   
		 
		 TC24.TodaysLeads_TC24();	 
		 extent.flush();  
		 
		
		 action=new Actions(driver);	

	}
	public static void TodaysLeads_TC24() throws InterruptedException{
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
		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//input[(@title='New')]")).click();
		System.out.println("Clicked on new button in the recent leads frame ");
		
		Thread.sleep(5000);
		WebElement lastName=driver.findElement(By.xpath("//input[(@id='name_lastlea2')]"));
		lastName.clear();
		lastName.sendKeys("ABCD");
		//driver.findElement(By.xpath("")).click();
		System.out.println("Clicked on  last name and entered ABCD");
		
		Thread.sleep(5000);	
		WebElement companyName=driver.findElement(By.xpath("//input[(@id='lea3')]"));
		companyName.clear();
		companyName.sendKeys("ABCD");
		//driver.findElement(By.xpath("")).click();
		System.out.println("Clicked on company name and entered ABCD ");
		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//input[(@name='save')]")).click();
		System.out.println("Clicked on  Save button");
		
		String text=driver.findElement(By.xpath("//*[@id=\"contactHeaderRow\"]/div[2]/h2")).getText();
		//Thread.sleep(5000);	
		//driver.findElement(By.xpath("")).click();
		System.out.println(text);
		
	
		
		
	}
		
}
