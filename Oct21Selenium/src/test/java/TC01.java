import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC01 {	
	 static WebDriver driver;	 
	 static ExtentTest test; 
	 static ExtentReports extent;	
	
	 public static void main(String[] args) throws IOException, InterruptedException{
		 WebDriverManager.chromedriver().setup();
		 driver = new ChromeDriver();		 
		 driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		 String path= System.getProperty("user.dir")+"/target/basicReport.html"; 
		 extent=new ExtentReports();
		 ExtentHtmlReporter htmlReport =new ExtentHtmlReporter("path");
		 extent.attachReporter(htmlReport);	
		// test.info("pageloaded");
		// test.debug("username is entered");
		// test.fail("loginErrorMessage_TC01:FAILED");// test.pass("loginErrorMessage_TC01:PASSED");// test.log(Status.Fail),"");
		 
		 TC01.loginErrorMessage_TC01();
		 extent.flush();  
		 
	}	
	 public static void  loginErrorMessage_TC01() throws IOException,InterruptedException {	
	
	    test=extent.createTest("loginErrorMessage_TC01"); 
		driver.navigate().to("https://selenium-prd.firebaseapp.com/");
		//wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"login_div\"]"))); 
		Thread.sleep(3000);
		System.out.println("Application launched");
		test.log(Status.INFO,"URL of the application is launched");//Thread.sleep(1000);BadPractice			
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		test.log(Status.INFO,"email entered");		
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		test.log(Status.INFO,"password entered");		
		driver.findElement(By.xpath("//*[@id=\"login_div\"]/button")).click();
		test.log(Status.INFO,"login clicked");			
		
		driver.findElement(By.linkText("Home")).click();	
		test.log(Status.INFO,"home page tab is clicked");
		
		if(driver.findElement(By.linkText("HOME")).isDisplayed()) {  
			test.log(Status.PASS,"loginErrorMessage_TC01:PASSED"); 
		}
		else {
			test.log(Status.PASS, "loginErrorMessage_TC01:FAILED");
		}
		
		//driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/a[1]")).click();// this is xpath method
		/*driver.findElement(By.name("name")).sendKeys("Mithun");
		test.log(Status.INFO,"username entered");   		
		
	    driver.findElement(By.xpath("//*[@id=\"lname\"]")).sendKeys("Chakravarty");		    																					
	    driver.findElement(By.xpath("//input[(@value='female')]")).click();//driver.findElement(By.xpath("//*[@id=\"radiobut\"]"));//General xpath selects first radiobutton,here,male
	    wait.until(ExpectedConditions.alertIsPresent());
		driver.close();		*/

	}
	
}

