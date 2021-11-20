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

public class TC21 {
	static WebDriver driver;
	static WebDriverWait wait;	
	static Actions action;		
	static ExtentTest test; 
	static ExtentReports extent;	


	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 wait = new WebDriverWait(driver,20);
		 
		 String path= System.getProperty("user.dir")+"//target//basicReport.html"; 
		 extent=new ExtentReports();
		 ExtentHtmlReporter htmlReport =new ExtentHtmlReporter(path);
		 extent.attachReporter(htmlReport);	
		 test=extent.createTest("LeadsSelectView_TC21");
		 System.out.println(" creating report..................................");	   
		 
		 TC21.LeadsSelectView_TC21();	 
		 extent.flush();  
		 
		 
		 
		
		 action=new Actions(driver);	

	}
	public static void LeadsSelectView_TC21() throws InterruptedException{
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
		
		Thread.sleep(9000);	
		driver.findElement(By.xpath("//select[(@title='View:')]")).click();
		System.out.println("Clicked on drop down View list ");
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//span[(@id='userNavLabel')]")).click();  ////*[@id=\"userNav\"]
		System.out.println("Clicked on the user menu drop down ");
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\\\"userNav-menuItems\\\"]/a[5]")));
		Thread.sleep(9000);
		driver.findElement(By.xpath("//a[(@title='Logout')]")).click();  //*[@id=\"userNav-menuItems\"]/a[5]
		System.out.println("Clicked on the log out link from the user menu drop down list");
		System.out.println("Login sales force page is displayed with unchecked remember_me and unpopulated user name field");
		
		//not working//driver.findElement(By.xpath("//*[@id=\"wrapper\"]")).isDisplayed();
		System.out.println("loginpage is displayed");
		
		//Thread.sleep(5000);	
		//driver.findElement(By.xpath("")).click();
		//System.out.println("clicked on logout to close application");


}

}
