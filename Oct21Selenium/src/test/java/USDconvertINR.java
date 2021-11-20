import java.util.NoSuchElementException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class USDconvertINR {
	static WebDriver driver;
	static WebDriverWait wait;	
	static Actions action;		
	public static void main(String[] args)throws InterruptedException{
		 WebDriverManager.chromedriver().setup();
		 driver =new ChromeDriver();
		 wait = new WebDriverWait(driver,20);
		 USDconvertINR.amount();	
		 action=new Actions(driver);	
	}		
	public static void amount() throws InterruptedException, NoSuchElementException{
		driver.navigate().to("https://www.xe.com/");
		System.out.println("xe application is launched");
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/section/div[2]/div/main/form/div[1]/div[1]")));  
		Thread.sleep(2000);				
		driver.findElement(By.xpath("//input[(@id='midmarketFromCurrency')]")).sendKeys("USD");
		System.out.println("USD is entered in the from feild box");
		Thread.sleep(2000);	
		driver.findElement(By.xpath("//input[(@id='midmarketFromCurrency')]")).click();
		System.out.println("Clicked the from feild box");
		driver.findElement(By.xpath("//input[(@id='midmarketToCurrency')]")).sendKeys("Indian Rupee");
		System.out.println("INR is entered in the To feild box");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[(@href='/currency/inr-indian-rupee/')]")).click();
		/*driver.switchTo().frame(0);
		driver.findElement(By.xpath("//input[(@id='midmarketToCurrency')]")).click();
		System.out.println("INR is clicked in the To feild box");
	    driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/section/div[2]/div/main/form/div[1]/div[8]"));
		WebElement to=driver.findElement(By.xpath("//input[(@aria-activedescendant='midmarketToCurrency-option-3')]"));
		Thread.sleep(5000);
		//to.click();
		//Select select=new Select(to);
		//select.selectByVisibleText("INR- Indian Rupee");
		//select.selectByIndex(3);
		Actions action1=new Actions(driver);
		action1.moveToElement(to).build().perform();
		Thread.sleep(9000);
		to.click();
		//driver.findElement(By.xpath("//input[(@aria-activedescendant='midmarketToCurrency-option-3')]")).click();
		System.out.println("clicked the To feild box");*/
		driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/section/form/button")).click();
		Thread.sleep(5000);	
		driver.findElement(By.xpath("//button[(@type='submit')]")).click();
		System.out.println("clicked on convert button");			
		//driver.findElement(By.xpath("//input[(@id='midmarketToCurrency')]")).sendKeys("INR");
		//System.out.println("INR is entered in the from feild box");
		//driver.findElement(By.xpath("//input[(@id='midmarketToCurrency')]")).sendKeys("INR");
		//System.out.println("INR is entered in the from feild box");
		//driver.findElement(By.xpath("//input[(@id='midmarketToCurrency')]")).sendKeys("INR");
		//System.out.println("INR is entered in the from feild box");
		}
}