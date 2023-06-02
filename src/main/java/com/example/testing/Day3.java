package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day3  
{
	 public static void main( String[] args ) throws InterruptedException
	 {
	WebDriverManager.edgedriver().setup();
    WebDriver driver = new EdgeDriver();
    String url = "https://demo.opencart.com/";
    driver.navigate().to(url);
    driver.manage().window().maximize();
   WebElement search = driver.findElement(By.name("search"));
 //to scrolldown
   JavascriptExecutor js = (JavascriptExecutor)driver;	
   js.executeScript("window.scrollBy(0,1500)", "");
//    search.sendKeys("mobiles");
     Thread.sleep(2000);
    
    js.executeScript("window.scrollBy(0,1500)", "");
    WebElement returns = driver.findElement(By.linkText("Returns"));
    returns.click();
    driver.navigate().back();
    
    WebElement GiftCertificates = driver.findElement(By.linkText("Gift Certificates"));
    GiftCertificates.click();
    Thread.sleep(3000);
  
    driver.quit();
} 
}
