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

public class TC16 {
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
		 test=extent.createTest("createNewOpportunity_TC16");
		 System.out.println(" creating report..................................");	   
		 
		 TC16.createNewOpportunity_TC16();		 
		 extent.flush();  
		
		 action=new Actions(driver);	
	}
public static void createNewOpportunity_TC16() throws InterruptedException{
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
	
	Thread.sleep(3000);	
	driver.findElement(By.xpath("//a[(@title='Opportunities Tab')]")).click();
	System.out.println("Clicked on opportunities link ");
	
	Thread.sleep(9000);
	driver.findElement(By.xpath("//select[(@id='fcf')]")).click();
	System.out.println("Clicked on opprtunities drop down list ");
	
	Thread.sleep(9000);
	driver.findElement(By.xpath("//input[(@title='New')]")).click();
	System.out.println("Clicked on new button to create new opty  ");
	
	Thread.sleep(9000);
	driver.findElement(By.xpath("//input[(@id='opp3')]")).sendKeys("Lesson2(automation)");
	System.out.println("Clicked on Opportunity name and entered name  ");
	
	Thread.sleep(9000);
	driver.findElement(By.xpath("//input[(@id='opp4')]")).sendKeys("Palak_Patel");
	System.out.println("Clicked on Account name and entered acc name ");
	
	Thread.sleep(9000);
	driver.findElement(By.xpath("//input[(@id='opp9')]")).sendKeys("10/31/2022");
	System.out.println("Clicked and entered a close Date box ");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//select[(@name='calYearPicker')]")).click();
	System.out.println("Clicked on year drop down ");
	Thread.sleep(9000);
	//driver.findElement(By.xpath("//*[@id=\"calYearPicker\"]/option[2]")).click();
	//driver.findElement(By.xpath("//option[(@value='2031')]")).click();////*[@id="calYearPicker"]/option[8]
	driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[3]/table/tbody/tr[2]/td[4]/div/span/span/a")).click();
	System.out.println("Clicked on possible !!!!!!max year ");
	
	//WebElement closeDate =driver.findElement(By.xpath("//*[@id=\"calYearPicker\"]/option[2]"));//not able to choose year
	//Actions action1=new Actions(driver);
	//action1.moveToElement(closeDate).click();
	//driver.findElement(By.xpath("//*[@id=\"ep\"]/div[2]/div[3]/table/tbody/tr[2]/td[4]/div/span/span/a")).click();
	System.out.println("Clicked on choosen close Date ");
	
	Thread.sleep(9000);
	driver.findElement(By.xpath("//select[(@id='opp11')]")).click();
	System.out.println("Clicked on  Stage");
	
	Thread.sleep(9000);
	driver.findElement(By.xpath("//option[(@value='Needs Analysis')]")).click();
	System.out.println("Clicked and selected stage from drop down  ");
	
	Thread.sleep(9000);
	WebElement probability=driver.findElement(By.xpath("//input[(@id='opp12')]"));
	probability.clear();
	probability.sendKeys("11");	
	
	//Thread.sleep(9000);
	//driver.findElement(By.xpath("//input[(@id='opp12')]")).sendKeys("11");
	System.out.println("Clicked on Probability ");
	
	//Thread.sleep(9000);
	//driver.findElement(By.xpath("")).click();
	//System.out.println("Clicked on  ");
	
	Thread.sleep(9000);
	driver.findElement(By.xpath("//select[(@id='opp6')]")).click();
	System.out.println("Clicked on Lead source ");
	
	Thread.sleep(9000);
	driver.findElement(By.xpath("//option[(@value='Partner Referral')]")).click();
	System.out.println("Clicked and selected from lead source drop down ");
	
	Thread.sleep(9000);
	driver.findElement(By.xpath("//input[(@id='opp17')]")).sendKeys("");
	System.out.println("Clicked on Primary campaign source ");
	
	//Thread.sleep(9000);
	//driver.findElement(By.xpath("")).click();
	//System.out.println("Clicked on  ");
	
	Thread.sleep(9000);
	driver.findElement(By.xpath("//input[(@name='save')]")).click();
	System.out.println("Clicked on Save Button ");
	
	
	
}
}
	
	
