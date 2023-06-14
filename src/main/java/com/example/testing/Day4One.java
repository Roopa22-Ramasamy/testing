package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4One 
{
         public static void main(String[] args) throws InterruptedException 
         {
        	 WebDriverManager.edgedriver().setup();
     	  	WebDriver driver=new EdgeDriver();
     	    driver.manage().window().maximize();
     	    driver.navigate().to("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
     	    WebElement fname = driver.findElement(By.xpath("//*[@id=\"input-firstname\"]"));
     	    fname.sendKeys("Roopa Thangam");
     	    WebElement lname = driver.findElement(By.xpath("//*[@id=\"input-lastname\"]"));
     	    lname.sendKeys("R");
     	    driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("sample@gmail.com");
     	    driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("sample");
     	    JavascriptExecutor js = (JavascriptExecutor)driver;
            js.executeScript("window.scrollBy(0,3000)", "");
            Thread.sleep(3000); 
     	    driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div/button")).click();
         }
}
