import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC3  {
	static WebDriver driver;
	static WebDriverWait wait;
	public static void main(String[] args)throws InterruptedException {
		
		 WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 wait = new WebDriverWait(driver,20);
		 TC3.forgotPassword_TC3();	
	}
		 public static void forgotPassword_TC3() throws InterruptedException{
				driver.navigate().to("https://login.salesforce.com/");
				System.out.println("Salesforce application is launched");
				wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"content\"]"))); //Thread.sleep(1000);BadPractice		
				driver.findElement(By.id("forgot_password_link")).click();
				System.out.println("Forgot password link is pressed and Forgot password page is opened");				
				driver.findElement(By.id("un")).sendKeys("palak@tekarch.com");
				System.out.println("Username is entered in the forgot password page");
				driver.findElement(By.id("continue")).click();
				System.out.println("Continue button is clicked ");			
				System.out.println(" Password reset message is displayed and email- Check your email- asscociated with username is sent");		
				
			}	
		 
	}
