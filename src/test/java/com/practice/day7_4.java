package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day7_4 {
	WebDriver driver;  
	@Test
  public void Login()  throws InterruptedException
  {
	  WebDriverManager.edgedriver().setup();
	  driver=  new EdgeDriver();
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  Thread.sleep(3000);
	   driver.manage().window().maximize();
	   String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
	   Assert.assertEquals(url,driver.getCurrentUrl());
	   
	   WebElement userName = driver.findElement(By.xpath("//input[@name=\"username\"]"));
		  userName.sendKeys("Admin");
		  
		  WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
		  password.sendKeys("admin123");
		  
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		  
		  Thread.sleep(4000);
  }
	@Test(dependsOnMethods = {"Login"})
	  public void Logout() 
	{
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul")).click();
		  driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/header/div[1]/div[2]/ul/li/ul/li[4]/a")).click();
		  //System.out.println("Logoout");
	
    }
}
