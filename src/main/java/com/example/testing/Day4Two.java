package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day4Two 
{
     public static void main(String[] args) throws InterruptedException
     {
    	 WebDriverManager.edgedriver().setup();
  	  	WebDriver driver=new EdgeDriver();
  	    driver.manage().window().maximize();
  	    driver.navigate().to("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
  	    driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("sample@gmail.com");
  	    driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("sample");
  	    driver.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();
     }
}
