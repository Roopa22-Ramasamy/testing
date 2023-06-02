package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws InterruptedException
    {
    	//day 4(test3.1)
       // System.out.println( "Hello World!" );
    	WebDriverManager.edgedriver().setup();
        WebDriver driver = new EdgeDriver();
        //launching the url 
        driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
        //maximize the window
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Roopa Thangam");
        
        
        driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("R");
        
        driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("727821tuec201@skct.edu.in");
        
        driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("roopa");
        
        JavascriptExecutor js = (JavascriptExecutor)driver;	
        js.executeScript("window.scrollBy(0,3000)", "");
//       
        driver.findElement(By.xpath("//*[@id=\"input-newsletter-yes\"]")).click();
    	
//    	//day4(test3.2)
//    	WebDriverManager.edgedriver().setup();
//       WebDriver driver = new EdgeDriver();
//       String url = "https://demo.opencart.com/";
//       driver.navigate().to(url);
//       driver.manage().window().maximize();
//      WebElement search = driver.findElement(By.name("search"));
//    //to scrolldown
//      JavascriptExecutor js = (JavascriptExecutor)driver;	
//      js.executeScript("window.scrollBy(0,1500)", "");
////       search.sendKeys("mobiles");
//        Thread.sleep(2000);
//       
//       js.executeScript("window.scrollBy(0,1500)", "");
//       WebElement returns = driver.findElement(By.linkText("Returns"));
//       returns.click();
//       driver.navigate().back();
//       WebElement GiftCertificates = driver.findElement(By.linkText("Gift Certificates"));
//       GiftCertificates.click();
//       Thread.sleep(3000);
//
//       driver.quit();
//    	 
    } 
}

