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

public class TC36 {
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
		 test=extent.createTest("BlockingEventInCalendar_TC36");
		 System.out.println(" creating report..................................");	   
		 
		 TC36.BlockingEventInCalendar_TC36();		 
		 extent.flush();  
		
		 action=new Actions(driver);	

	}
	public static void BlockingEventInCalendar_TC36() throws InterruptedException{
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
		driver.findElement(By.xpath("//a[(@title='Home Tab')]")).click();		
		System.out.println("Clicked on Home Tab");
		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//*[@id=\"ptBody\"]/div/div[2]/span[2]/a")).click();
		System.out.println("Clicked on current date Link");
		
		Thread.sleep(15000);
		//WebElement timeSelect =driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id61:28:j_id64\"]/a"));
		//Actions action1=new Actions(driver);
		//action1.moveToElement(timeSelect).click();
		driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id61:28:j_id64\"]/a")).click();		
		System.out.println("Clicked on 8pm Link");
		
		Thread.sleep(15000);	
		driver.findElement(By.xpath("//img[(@class='comboboxIcon')]")).click();		
		System.out.println("Clicked on subject combo icon");
		Thread.sleep(15000);
		driver.findElement(By.xpath("//input[(@name='evt5')]")).sendKeys("Other");	
		Thread .sleep(5000);
		driver.findElement(By.xpath("//input[(@name='evt5')]")).click();
		System.out.println("Clicked on other icon");
		Thread.sleep(5000);
		//WebElement myFrame3=driver.findElement(By.xpath("/html/body/div[2]"));
		//driver.switchTo().frame(myFrame3);		
		//driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]')]")).click();
		//Thread.sleep(11000);
		//driver.findElement(By.xpath("")).sendKeys("Hi all, I am using Automation!");
		//WebElement other =driver.findElement(By.xpath("/html/body/div[2]/ul/li[5]')]"));
		//Actions action2=new Actions(driver);
		//action2.moveToElement(other).click();
		//driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/script/text()")).click();		////*[@id="ep"]/div[2]/div[4]/table/tbody/tr[2]/td[2]/div/script/text()
		System.out.println("Clicked on Other from combo box");
		
		Thread.sleep(15000);	
		driver.findElement(By.xpath("//input[(@id='EndDateTime_time')]")).click();		
		System.out.println("Clicked on end time field");
		
		Thread.sleep(11000);	
		driver.findElement(By.xpath("//div[(@id='timePickerItem_42')]")).click();		
		System.out.println("Clicked on 9.00pm from drop down");
		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//input[(@name='save')]")).click();		
		System.out.println("Clicked on Save button");
		
	}	
}
