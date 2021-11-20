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

public class TC14 {
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
			 test=extent.createTest("CreateAccountReport_TC14");
			 System.out.println(" creating report..................................");	   
			 
			 TC14.CreateAccountReport_TC14();;		 
			 extent.flush();  			 
			 	
			 action=new Actions(driver);		
		
	}

	public static void CreateAccountReport_TC14() throws InterruptedException{
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
		
		driver.findElement(By.xpath("//a[(@title=\"Accounts Tab\")]")).click();
		System.out.println("Clicked on Accounts link on the Home Page");		
		Thread.sleep(9000);
		
		Thread.sleep(9000);
		driver.findElement(By.linkText("Accounts with last activity > 30 days")).click();
		System.out.println("Clicked on Accounts with last activity>30 days link in reports area ");
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[(@name='dateColumn')]")).click();
		System.out.println("Clicked on the date field drop down ");		
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//*[@id=\"ext-gen265\"]/div[3]")).click();
		System.out.println("Clicked on select created date in the date field drop down ");		
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[(@name='startDate')]")).sendKeys("10/30/2021");
		System.out.println("Clicked on <todays date> in From field on the unsaved report field ");
		
		Thread.sleep(2000);
		WebElement endDate=driver.findElement(By.xpath("//input[(@name='endDate')]"));
		endDate.clear();
		endDate.sendKeys("10/30/2021");		
		Thread.sleep(9000);
		//driver.findElement(By.xpath("//input[(@name='endDate')]")).sendKeys("10/30/2021");
		driver.findElement(By.xpath("//input[(@name='endDate')]")).click();
		System.out.println("Clicked on <todays date> in To fields on the unsaved report field ");
				
		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[(@id='ext-gen49')]")).click();
		System.out.println("Clicked on save button on unsaved report page ");
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[(@name='reportName')]")).sendKeys("Patelpa");
		System.out.println("Provide report name on  pop up window");
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[(@name='reportDevName')]")).click();//.click() instead od .sendKeys() because it auto takes the unique name as report name and as I want same Uname, saving hassle of clearing field
		System.out.println("Provide report unique name on window ");
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//button[(@id='ext-gen286')]")).click();
		System.out.println("Clicked on save and run report ");
		
		driver.findElement(By.xpath("//*[@id=\"thePage:sectionHeader\"]/div/div/div[1]"));
		
		/*Thread.sleep(9000);
		driver.findElement(By.xpath("")).click();
		System.out.println("Clicked on  ");*/
				
		//WebElement createdDate =driver.findElement(By.xpath("//*[@id=\"ext-gen265\"]/div[3]"));
				//Actions action1=new Actions(driver);
				//action1.moveToElement(createdDate).click();
				
}
}