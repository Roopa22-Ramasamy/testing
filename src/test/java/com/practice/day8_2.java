package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day8_2 
{
	WebDriver driver;
  @Test
  public void f() throws InterruptedException 
  {
	  WebDriverManager.edgedriver().setup();
	  driver=  new EdgeDriver();
	  driver.get("https://demoqa.com/droppable/");
	  driver.manage().window().maximize();
	  driver.switchTo().frame(0);
	  WebElement src = driver.findElement(By.id("draggable"));
	  WebElement res = driver.findElement(By.id("droppable"));
	  Actions ac = new Actions(driver);
	  ac.clickAndHold(src).release(res).build().perform();
	  Thread.sleep(3000);
  }
}
