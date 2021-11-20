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

public class TC35 {
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
		 test=extent.createTest("VerifyTabCustomization_TC35");
		 System.out.println(" creating report..................................");	   
		 

		 TC35.VerifyTabCustomization_TC35(); 
		 extent.flush();  
		 
		 	
		 action=new Actions(driver);	

	}
	public static void VerifyTabCustomization_TC35() throws InterruptedException{
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
		driver.findElement(By.xpath("//img[(@class='allTabsArrow')]")).click();		
		System.out.println("Clicked on +  all Tab");
		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//input[(@name='customize')]")).click();		
		System.out.println("Clicked on customize my tabs button");
		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//option[(@value='Chatter')]")).click();		
		System.out.println("Clicked on a selection tab in Selected tabs to remove");
		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//img[(@class='leftArrowIcon')]")).click();		
		System.out.println("Clicked on remove button");
		
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//input[(@name='save')]")).click();		
		System.out.println("Clicked on Save button");
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//span[(@id='userNavLabel')]")).click();  
		System.out.println("Clicked on the user menu drop down ");
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//a[(@title='Logout')]")).click();  
		System.out.println("Clicked on the log out link from the user menu drop down list");
		System.out.println("Login sales force page is displayed with unchecked remember_me and unpopulated user name field");
		
		Thread.sleep(5000);
		driver.findElement(By.id("username")).sendKeys("palak@tekarch.com");
		System.out.println("Username is entered");
		
		driver.findElement(By.id("password")).sendKeys("salesforce@1");
		System.out.println(" password is entered");
		
		driver.findElement(By.xpath("//input[(@id='Login')]")).click();
		System.out.println("Login done by clicking the login button");
		System.out.println(" home page is displayed without the Chatter tab");			
					
	}
		
}
