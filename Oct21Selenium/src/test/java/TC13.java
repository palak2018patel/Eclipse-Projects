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

public class TC13 {

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
		 test=extent.createTest("TC13.MergeAccounts_TC13");
		 System.out.println(" creating report..................................");	   
		 
		 TC13.MergeAccounts_TC13(); 
		 extent.flush();  
		 
		 action=new Actions(driver);		
	}
	public static void MergeAccounts_TC13() throws InterruptedException{
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
		driver.findElement(By.xpath("//*[@id=\"toolsContent\"]/tbody/tr/td[2]/div/div/div/ul/li[4]/span/a")).click();
		System.out.println("Clicked on Merge Account link ");
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[(@id='srch')]")).sendKeys("Palak");
		System.out.println("Entered account name  ");
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[4]/input[2]")).click();
		System.out.println("Clicked on find accounts button ");
		
		//Thread.sleep(9000); bcos auto chkd
		//driver.findElement(By.xpath("//input[(@id=\"cid0\")]")).click();
		//System.out.println("Clicked on the checkBox");
		
		//Thread.sleep(9000);//use below two to select or deselect some accts
		//driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[1]")).click();
		//System.out.println("Selected account 1 ");
		
		//Thread.sleep(9000);
		//driver.findElement(By.xpath("//*[@id=\"stageForm\"]/div/div[2]/div[5]/div/input[2]")).click();
		//System.out.println("Selected account 2");
		
		Thread.sleep(9000);//use to deselect or select only
		driver.findElement(By.xpath("//input[(@name=\"goNext\")]")).click();
		System.out.println("Clicked on  Next button");
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[(@value=\" Merge \")]"));//.click();
		System.out.println("Have commented for future running the same tc:Clicked on Merge by accounts step 2 page");
		
		Thread.sleep(9000);
		driver.findElement(By.xpath("//input[(@value=\"Cancel\")]")).click();
		System.out.println("Clicked on cancel on page /not cancel button on the pop up");
		
		//Thread.sleep(9000);
		//driver.findElement(By.xpath("")).click();
		//System.out.println("Clicked on ");
		
	}	
}	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

