package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task5 
{
	public static void main( String[] args ) throws InterruptedException
	{
		WebDriverManager.edgedriver().setup();
	   WebDriver driver = new EdgeDriver();
	   String url = "https://demo.opencart.com/index.php?route=checkout/voucher&language=en-gb";
	   driver.navigate().to(url);
	   driver.manage().window().maximize();
	   driver.findElement(By.xpath("//*[@id=\"input-to-name\"]")).sendKeys("Roopa Thangam");
	   driver.findElement(By.xpath("//*[@id=\"input-to-email\"]")).sendKeys("roopa.thangam06@gmail.com");
	   driver.findElement(By.xpath("//*[@id=\"input-from-name\"]")).sendKeys("Roopa");
	   driver.findElement(By.xpath("//*[@id=\"input-theme\"]/div[1]/label")).click();
	   driver.findElement(By.xpath("//*[@id=\"input-message\"]")).sendKeys("Fill out the form");
	   driver.findElement(By.xpath("//*[@id=\"input-amount\"]")).sendKeys("2");
	   JavascriptExecutor js = (JavascriptExecutor)driver;	
       js.executeScript("window.scrollBy(0,3000)", "");
       js.executeScript("window.scrollBy(0,3000)", "");
       Thread.sleep(3000);
	  // driver.quit();       
	} 

} 
