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

public class TC37 {
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
		 test=extent.createTest("BlockingEventInCalendarWithRecurrence_TC37");
		 System.out.println(" creating report..................................");	   
		 
		 TC37.BlockingEventInCalendarWithRecurrence_TC37();		 
		 extent.flush();  
		 
		 
		 action=new Actions(driver);	

	}
	public static void BlockingEventInCalendarWithRecurrence_TC37() throws InterruptedException{
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
		driver.findElement(By.xpath("//*[@id=\"p:f:j_id25:j_id61:20:j_id64\"]/a")).click();		
		System.out.println("Clicked on 4pm Link");
		
		Thread.sleep(15000);	
		driver.findElement(By.xpath("//img[(@class='comboboxIcon')]")).click();		
		System.out.println("Clicked on subject combo icon");
		Thread.sleep(11000);
		driver.findElement(By.xpath("//input[(@name='evt5')]")).sendKeys("Other");	
		Thread .sleep(5000);
		driver.findElement(By.xpath("//input[(@name='evt5')]")).click();
		System.out.println("Clicked on Other from combo box");
		Thread.sleep(5000);
				
		Thread.sleep(15000);	
		driver.findElement(By.xpath("//input[(@id='EndDateTime_time')]")).click();		
		System.out.println("Clicked on end time field");
		
		Thread.sleep(11000);	
		driver.findElement(By.xpath("//div[(@id='timePickerItem_38')]")).click();		
		System.out.println("Clicked on 7.00pm from drop down");
		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//input[(@id='IsRecurrence')]")).click();		
		System.out.println("Clicked on create recurring series of event");
		Thread.sleep(5000);	
		
		driver.findElement(By.xpath("//input[(@id='rectypeftw')]")).click();		
		System.out.println("Clicked on Weekly button");
		Thread.sleep(5000);	
		
		driver.findElement(By.xpath("//input[(@id='RecurrenceEndDateOnly')]")).click();		
		System.out.println("Clicked on end date field later button");
		
		
		driver.findElement(By.xpath("//*[@id=\"calRow3\"]/td[2]")).click();		
		System.out.println("Clicked on end date two weeks later button");
				
		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//input[(@name='save')]")).click();		
		System.out.println("Clicked on Save button");
		
		driver.findElement(By.xpath("//img[(@class='monthViewIcon')]")).click();		
		System.out.println("Clicked on month view icon ");
		
		driver.findElement(By.xpath("//td[(@id=\"bodyCell\")]")).isDisplayed();
		
}

}
