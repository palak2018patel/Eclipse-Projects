package sfdc_35_testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TC1_LoginErrorMessage extends ReusableMethods {
		 static WebDriver driver;
		public static void main(String[] args) throws Exception {
			  WebDriverManager.chromedriver().setup();
//			  WebDriverManager.firefoxdriver().setup();
			  driver =new ChromeDriver();
			  driver.get("https://login.salesforce.com");
			  driver.manage().window().maximize();
			WebElement Uname=driver.findElement(By.xpath("//input[@id='username']"));
			enterText(Uname, "mithun.r@tekarch.com", "UserName");
			
			WebElement pwd=driver.findElement(By.xpath("//input[@id='password']"));
			pwd.clear();
//			enterText(pwd, "Anoop12345", "Password");
		    WebElement login = driver.findElement(By.xpath("//*[@id='Login']"));
		    clickObj(login, "login");
		    String errormessage = driver.findElement(By.xpath("//div[@id='error']")).getText();
			if (errormessage.equals("Please enter your password.")){
				System.out.println("Error message is been be displayed");
			}
			else {
				System.out.println("Error message is not been be displayed");
			}
			
			driver.close();
			System.out.println("TC_1 Login Error Message completed");
		
		}
}
