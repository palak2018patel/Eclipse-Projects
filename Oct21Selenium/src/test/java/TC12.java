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

public class TC12 {
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
		 test=extent.createTest("Editview_TC12");
		 System.out.println(" creating report..................................");	   
		 
		 TC12.Editview_TC12();	 
		 extent.flush(); 
		 
		action=new Actions(driver);
		
	}
	public static void Editview_TC12() throws InterruptedException{
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
	
	//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("")));
	driver.findElement(By.xpath("//a[(@title=\"Accounts Tab\")]")).click();
	System.out.println("Clicked on Accounts link on the Home Page");
	
	Thread.sleep(10000);
	driver.findElement(By.xpath("//select[(@title=\"View:\")]")).click();
	System.out.println("Select <view name> on accounts page to edit");
	
	Thread.sleep(5000);
	driver.findElement(By.xpath("//*[@id=\"filter_element\"]/div/span/span[2]/a[1]")).click();
	System.out.println("clicked the edit link");	
	
	Thread.sleep(10000);
	WebElement viewName=driver.findElement(By.xpath("//input[@id=\"fname\"]"));
	viewName.clear();
	Thread.sleep(3000);
	viewName.sendKeys("Palak_Patel");

	//driver.findElement(By.xpath("//input[@id=\"fname\"]")).sendKeys("Palak_Patel");
	System.out.println("changed to new view name");
	
	Thread.sleep(10000);
	driver.findElement(By.xpath("//select[(@id=\"fcol1\")]")).click();
	driver.findElement(By.xpath("//option[(@value=\"ACCOUNT.NAME\")]")).click();
	
	Thread.sleep(10000);
	driver.findElement(By.xpath("//select[(@id=\"fop1\")]")).click();
	driver.findElement(By.xpath("//option[(@value='c')]")).click();
	Thread.sleep(10000);
	driver.findElement(By.xpath("//input[(@id=\"fval1\")]")).sendKeys("<a>");
	
	System.out.println("selected filters field<Account name>,operator<contains>,value<a>");	
	Thread.sleep(10000);
	
	
	driver.findElement(By.xpath("//*[@id=\"colselector_select_0\"]/option[31]")).click();
	//driver.findElement(By.xpath("//option[(@value=\"ACCOUNT.LAST_ACTIVITY\")]")).click(); //did error work
	System.out.println("Selected Last Activity tab from available tab list");
	driver.findElement(By.xpath("//img[(@class=\"rightArrowIcon\")]")).click();
	System.out.println("Clicked the add button");	
	System.out.println("selected Last activity text from available Fields");	
	Thread.sleep(5000);
	
	driver.findElement(By.xpath("//input[(@name=\"save\")]")).click();
	System.out.println("click on save button");	

}	



}
