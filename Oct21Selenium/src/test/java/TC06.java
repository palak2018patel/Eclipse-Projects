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

public class TC06 {
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
		 test=extent.createTest("select_MyProfile_In_usermenu_TC06");
		 action=new Actions(driver);
		 		 
		 TC06.select_MyProfile_In_usermenu_TC06();
		 extent.flush(); 
	}		
public static void select_MyProfile_In_usermenu_TC06() throws InterruptedException{		
		
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
		
		driver.findElement(By.xpath("//*[@id=\"userNav\"]")).click();
		System.out.println("Clicked on the user menu drop down ");	
		Thread.sleep(3000);
		
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]")));
		driver.findElement(By.xpath("//*[@id=\"userNav-menuItems\"]/a[1]")).click();
		System.out.println("Clicked on the My profile button");
		
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"chatterTab\"]/div[2]/div[2]/div[1]/h3/div")).click();
		System.out.println("Clicked on the edit profile button");
		
		System.out.println("switch to iframe");
		Thread.sleep(5000);
		WebElement myFrame1=driver.findElement(By.xpath("//iframe[(@id='contactInfoContentId')]"));
		driver.switchTo().frame(myFrame1);
		driver.findElement(By.xpath("//*[@id=\"aboutTab\"]/a")).click(); 		
		System.out.println("Clicked on the About Tab");
		WebElement lastName=driver.findElement(By.id("lastName"));
		lastName.clear();
		lastName.sendKeys("Patel");
		System.out.println("Entered the last name");		
		driver.findElement(By.xpath("//*[@id=\"TabPanel\"]/div/div[2]/form/div/input[1]")).click();
		System.out.println("Clicked on save all button");	
					
		Thread.sleep(5000);
		driver.findElement(By.xpath("//*[@id=\"publisherAttachTextPost\"]/span[1]")).click();
		System.out.println("Clicked on post link button");
		System.out.println("switch to iframe");
		Thread.sleep(5000);
		WebElement myFrame2=driver.findElement(By.xpath("//iframe[(@class='cke_wysiwyg_frame cke_reset')]"));
		driver.switchTo().frame(myFrame2);		
		driver.findElement(By.xpath("/html/body")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body")).sendKeys("Hi all, I am using Automation!");
		System.out.println("Entered the text");
		Thread.sleep(9000);
		driver.switchTo().defaultContent();
		//WebElement myFrame3=driver.findElement(By.xpath("//iframe[(@class='cke_wysiwyg_frame cke_reset')]"));
		//driver.switchTo().frame(myFrame3);	
		driver.findElement(By.xpath("//input[(@id='publishersharebutton')]")).click();
		//WebElement share =driver.findElement(By.xpath("//*[@id=\"publisherBottomBar\"]/div[1]/span"));
		//Actions action1=new Actions(driver);
		//action1.moveToElement(share).click();
		//Thread.sleep(4000);
		//driver.findElement(By.xpath("//*[@id=\"publisherBottomBar\"]/div[1]/span")).click();
		//driver.findElement(By.xpath("//[@class=\"publisherBottomBar\"]/div[1]")).click();
		//driver.findElement(By.xpath("/html/body/div[1]/div[2]/table/tbody/tr/td/div/div[3]/div[1]/div/div[1]/div/div[2]/ul/li[1]/div/div/div[1]/div[1]/div[1]/div[2]/div/div[1]/span/input")).click();
		System.out.println("Clicked on share button");	
		

/*12:12 PM: Set<String> windowids = driver.getWindowHandles();
  // String secondwindow = iterator.
  Iterator<String> iter = windowids.iterator();
  String mainWindow = iter.next();
  String childwindow = iter.next();
  driver.switchTo().window(childwindow);
  driver.close();
  driver.switchTo().window(mainWindow);

Set<String> windowids = driver.getWindowHandles();
  // String secondwindow = iterator.
  Iterator<String> iter = windowids.iterator();
  String mainWindow = iter.next();
  String childwindow = iter.next();
  driver.switchTo().window(childwindow);
  driver.close();
  driver.switchTo().window(mainWindow);				
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//*[@id=\"publisherAttachContentPost\"]/span[1]")).click();
		System.out.println("Clicked on the file link button");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//*[@id=\"chatterUploadFileAction\"]")).click();
		System.out.println("clicked upload a file button");
		//driver.findElement(By.xpath("//*[@id=\"chatterFile\"]")).click();
		//System.out.println("Clicked on choose file button");
		//driver.findElement(By.xpath("")).click();
		//System.out.println("selected a file to upload and clicked open from the user end only");
		//driver.findElement(By.xpath("//*[@id=\"publishersharebutton\"]")).click();
		//System.out.println("Clicked on share button");		
		
		System.out.println("Hover the mouse on myprofilephoto and add or(Update if already a photo is present) photo link appears");
		driver.findElement(By.xpath("//*[@id=\"displayBadge\"]")).click(); ////*[@id="photoSection"]/span[2]/img[1]
		//action.moveToElement (By.xpath("//*[@id=\"photoSection\"]/span[2]/img[1])"));//maybe a mouse hover 		
		driver.findElement(By.xpath("//*[@id=\"uploadLink\"]")).click();
		System.out.println("Clicked on the add/update link to upload a photo");
		//driver.findElement(By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadInputFile\"]")).click();
		//System.out.println("Clicked on the choose file button and select the image to upload photo");
		//driver.findElement(By.xpath("//*[@id=\"j_id0:uploadFileForm:uploadBtn\"]")).click();
		try {
			  Actions act = new Actions(driver);
			   Thread.sleep(2000);
			  WebElement photo = driver.findElement(By.xpath("//span[@class='moderatorBadge']"));
			   act.click(photo).build().perform();
			   test.log(Status.PASS, "Clicked on the link to upload profile pic");
			   Thread.sleep(3000);
			  driver.switchTo().frame(driver.findElement(By.id("uploadPhotoContentId")));
			  String imgFile = System.getProperty("user.dir")+"/resource/pic.png";
			  WebElement uploadImg = driver.findElement(By.xpath("//input[@class='fileInput']"));
			   Thread.sleep(3000);
			   uploadImg.sendKeys(imgFile);
			   test.log(Status.PASS, "Uploaded profile file");
			  driver.findElement(By.xpath("//input[contains(@id,'uploadBtn')]")).click();
			  driver.findElement(By.xpath("//input[@type='submit']")).click();
			  test.log(Status.PASS, "profile pic is uploaded");
			  } catch(NoSuchElementException e) {
			   System.out.println("Profile pic is already uploaded");
			   test.log(Status.PASS, "profile pic is already exisiting");
			  }test.pass("myProfileOptions_TC06 : PASSED");
			  extent.flush();

		
		
		
}*/
}}
