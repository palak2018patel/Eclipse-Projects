import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.gargoylesoftware.htmlunit.javascript.host.Window;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TCAmazon {	
		static WebDriver driver;
		static WebDriverWait wait;	
		static Actions action;		
		public static void main(String[] args) throws InterruptedException{
			 WebDriverManager.chromedriver().setup();
			 driver =new ChromeDriver();
			 wait = new WebDriverWait(driver,20);
			 TCAmazon.checkCart();	
			 action=new Actions(driver);	
		}		
		public static void checkCart() throws InterruptedException{
			driver.navigate().to("https://www.amazon.com/");
			System.out.println("Amazon application is launched");
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//input[(@id='twotabsearchtextbox')]")));  
			Thread.sleep(2000);				
			driver.findElement(By.xpath("//input[(@id='twotabsearchtextbox')]")).sendKeys("kindle 10th generation 6 inch touch display 167 ppi");
			System.out.println("Kindle is entered in the search box");
			Thread.sleep(2000);				
			//driver.findElement(By.xpath("//input[(@value=\"kindle 10th generation 6 inch touch display 167 ppi\")]"));
			//Thread.sleep(5000);
			driver.findElement(By.xpath("//input[(@id='nav-search-submit-button')]")).click();
			Thread.sleep(5000);
			Actions action =new Actions(driver);
			WebElement t= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span"));
			Thread.sleep(9000);
			action.doubleClick(t).build().perform();			
			 //driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a")).click();
			//driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span")).click();
           //driver.findElement(By.linkText("Kindle-Now-with-Built-in-Front-Light/dp/B07978J597/ref=sr 1 3?keywords...01M8LKA87%2CB07MSYMNSW%2CB07X7614T1%2CB07PZ8J966%2CB082F4R7XG%2CB08JGJP91B")).click();
			//WebElement t= driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[3]/div/span/div/div/div[2]/div[2]/div/div/div[1]/h2/a/span"));
			//t.click();
			Thread.sleep(25000);
			 //driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[4]/div/div/div/div/div/div[2]/div/div/div[3]/div[1]/div/div[1]/div[2]/a")).click();
			 //List<String> windows = (List<String>) driver.getWindowHandles();
			 //driver.switchTo().window(Window.get(1));
			 //driver.findElement(By.xpath("//input[(@value=\"kindle 10th generation 6 inch touch display 167 ppi\")]")).click();
			 //driver.switchTo().parentFrame();
			 //driver.switchTo().window(Window.get(0));
			//Select select=new Select(t);
			//select.selectByVisibleText("Kindle-Now with a Built-in Front Light-Black-Ad-Supported");			
			System.out.println("Kindle 10th generation is selected ");
			Thread.sleep(15000);
			//WebElement addToCart =driver.findElement(By.xpath(""));		
			//Actions action1=new Actions(driver);
			//action1.moveToElement(share).click();			
			WebElement c=driver.findElement(By.xpath("//input[(@title='Add to Shopping Cart')]"));
			Thread.sleep(5000);			c.click();
			System.out.println("Kindle is added to cart");
			Thread.sleep(9000);				
			driver.findElement(By.xpath("//i[(@class='a-icon a-icon-close')]")).click();
			System.out.println("Clicked on close icon on the pop up window for warranty");
			Thread.sleep(9000);			
			driver.findElement(By.xpath("//span[(@id=\"nav-cart-count\")]")).click();
			System.out.println("Cliked on Go to Cart button");
			Thread.sleep(5000);				
			driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[1]/div/span[3]/div[2]/div[2]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).isDisplayed();
			System.out.println("Kindle is verified as added in the cart");
	}

}
