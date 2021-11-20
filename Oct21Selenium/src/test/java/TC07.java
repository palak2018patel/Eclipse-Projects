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

public class TC07 {
	static WebDriver driver;
	static WebDriverWait wait;	
	static Actions action;
	static ExtentTest test;
	static ExtentReports extent;
	
	public static void main(String[] args) throws InterruptedException{
		
		 WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 
		 wait = new WebDriverWait(driver,20);
		
		 	String reportPath = System.getProperty("user.dir")+"//target//createview.html";
			extent = new ExtentReports();
			ExtentHtmlReporter htmlReport = new ExtentHtmlReporter(reportPath);
			extent.attachReporter(htmlReport);
			test=extent.createTest("select_MySettings_In_usermenu_TC07");
			System.out.println(" creating report..................................");	   
			
		 TC07.select_MySettings_In_usermenu_TC07();	
		 extent.flush();	 
		
	}		
public static void select_MySettings_In_usermenu_TC07() throws InterruptedException{
		
		driver.navigate().to("https://login.salesforce.com/");
		System.out.println("Salesforce application is launched");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]")));         //Thread.sleep(1000);BadPractice		
		
		driver.findElement(By.id("username")).sendKeys("palak@tekarch.com");
		System.out.println("Username is entered");
		
		driver.findElement(By.id("password")).sendKeys("salesforce@1");
		
		driver.findElement(By.xpath("//*[@id=\"Login\"]")).click();
		System.out.println("Login done by clicking the login button");
		System.out.println(" home page is displayed");	
		
		driver.findElement(By.xpath("//*[@id=\"userNav\"]")).click();
		System.out.println("Clicked on the user menu drop down ");	
		Thread.sleep(3000);				//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
		driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[2]")).click();
		System.out.println("Clicked on the My Settings button");
		
		Thread.sleep(5000);
		driver.findElement(By.id("PersonalInfo")).click();
		System.out.println("Clicked on the personal link ");
		driver.findElement(By.xpath("//a[(@id=\"LoginHistory_font\")]")).click();
		System.out.println("Clicked on the Login History ");
		driver.findElement(By.xpath("//*[@id=\"RelatedUserLoginHistoryList_body\"]/div/a")).click();
		System.out.println("Clicked on Download login history link");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[(@id=\"DisplayAndLayout_font\")]")).click();
		System.out.println("Clicked on Display and layout link");
		driver.findElement(By.xpath("//span[(@id=\"CustomizeTabs_font\")]")).click();
		System.out.println("Clicked on Customize my Tabs link");
		driver.findElement(By.xpath("//option[(@value=\"Chatter\")]")).click();
		System.out.println("Selected Salesforce Chatter from custom app drop down");
		driver.findElement(By.xpath("//option[(@value=\"report\")]")).click();
		System.out.println("Selected reports tab from available tab list");
		driver.findElement(By.xpath("//img[(@class=\"leftArrowIcon\")]")).click();
		System.out.println("Clicked the remove button");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[(@id=\"CustomizeTabs_font\")]")).click();
		System.out.println("Clicked on Customize my Tabs link");
		driver.findElement(By.xpath("//option[(@value=\"Chatter\")]")).click();
		System.out.println("Selected Salesforce Chatter from custom app drop down");
		driver.findElement(By.xpath("//option[(@value=\"report\")]")).click();
		System.out.println("Selected reports tab from available tab list");
		driver.findElement(By.xpath("//img[(@class=\"rightArrowIcon\")]")).click();
		System.out.println("Clicked the add button");
				
		driver.findElement(By.xpath("//span[(@id=\"EmailSetup_font\")]")).click();
		System.out.println("Clicked email link");
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//span[(@id=\"EmailSettings_font\")]")).click();
		System.out.println("Clicked email settings");
		Thread.sleep(5000);
		WebElement emailName=driver.findElement(By.id("sender_name"));
		emailName.clear();
		Thread.sleep(3000);
		emailName.sendKeys("Palak Patel");
		System.out.println("Entered the email sender name");
		Thread.sleep(5000);
		WebElement emailAddress=driver.findElement(By.id("sender_email"));
		emailAddress.clear();
		Thread.sleep(3000);
		emailAddress.sendKeys("palak2018patel@gmail.com");
		System.out.println("Entered the email address");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[(@id=\"auto_bcc1\")]")).click();
		System.out.println("Selected automatic BCC");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[(@name=\"save\")]")).click();
		System.out.println("Selected Save button");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[(@id=\"CalendarAndReminders_font\")]")).click();
		System.out.println("clicked Calendar and reminder");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//span[(@id=\"Reminders_font\")]")).click();
		System.out.println("clicked Activity reminder link");		
		System.out.println("Reminders page is clicked");
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[(@id=\"testbtn\")]")).click();
		System.out.println("clicked Open a test Reminder button");
				
		
		
	}

}
