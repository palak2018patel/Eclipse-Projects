package com.demo;

import org.openqa.selenium.*;
import org.openga.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Scanner;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Session1 {

	public static void main(String[] args) throws InterruptedException {
 
  WebDriver driver1;
  WebDriver driver2;
  
  
  //WebDriverManager.chromedriver().setup();
 // WebDriverManager.firefoxdriver().setup();
System.setProperty("webdriver.chrome.driver","C:\\Users\\palak\\Desktop\\Pjava\\libs\\chromedriver.exe");
 // System.setProperty("webdriver.gecko.driver","C:\\Users\\palak\\Desktop\\Pjava\\libs\\geckodriver-v0.30.0-win64\\geckodriver.exe");
 driver1 = new ChromeDriver();
  //driver2 = new FirefoxDriver();
driver1.get("https://google.com");
Thread.sleep(5000);
//driver2.get("https://facebook.com");
driver1.manage().window().maximize();
driver1.manage().window().fullscreen();
driver1.findElement(By.name("q")).sendKeys("Selenium");
Thread.sleep(5000);
driver1.quit();

}}