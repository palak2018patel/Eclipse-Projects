package com.demo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumSession2 {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
		//driver.get("http://google.com");
		driver.get("https://selenium-prd.firebaseapp.com/");
		driver.findElement(By.id("email_field")).sendKeys("admin123@gmail.com");
		driver.findElement(By.id("password_field")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"login_div\"]/button")).click();
		Thread.sleep(5000);
	
		driver.findElement(By.xpath("//*[@id=\"user_div\"]/div[1]/a[1]")).click();
		driver.findElement(By.name("name")).sendKeys("Mithun");
		//driver.close();
		driver.quit();
		
			
	
	}

}
