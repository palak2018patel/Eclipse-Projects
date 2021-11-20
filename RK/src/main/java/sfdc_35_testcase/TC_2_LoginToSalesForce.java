package sfdc_35_testcase;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import io.github.bonigarcia.wdm.WebDriverManager;

	public class TC_2_LoginToSalesForce extends ReusableMethods {
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
			enterText(pwd, "Test4321", "Password");
			WebElement remember=driver.findElement(By.xpath("//*[@id='rememberUn']"));
			//remember.click();
			selectCheckBox(remember, "RememberMe");
		    WebElement login = driver.findElement(By.xpath("//*[@id='Login']"));
		    clickObj(login, "login");
		    String actualTitle = driver.getTitle();
			driver.manage().window().maximize();
			String expectedTitle = "Home Page ~ Salesforce - Developer Edition";
			if(actualTitle.equalsIgnoreCase(expectedTitle))
				System.out.println("User is on home page");
			else
				System.out.println("home page is not Lunched");
		    driver.close();
			System.out.println("TC_2 Login To SalesForce completed");
		}

	}

	


