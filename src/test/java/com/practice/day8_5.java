package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day8_5 {
	WebDriver driver;
  @Test
  public void f() throws InterruptedException
  {
	  WebDriverManager.edgedriver().setup();
	  driver=  new EdgeDriver();
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  WebElement key = driver.findElement(By.name("q"));
	  key.sendKeys("Apple");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  String t1 = driver.getTitle();
	  String id1 = driver.getWindowHandle();
	  System.out.println(t1);
	  System.out.println(id1);
	  
	  //to open new tab
	  driver.switchTo().newWindow(WindowType.TAB);
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  WebElement key1 = driver.findElement(By.name("q"));
	  key1.sendKeys("selenium");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  String t2 = driver.getTitle();
	  String id2 = driver.getWindowHandle();
	  System.out.println(t2);
	  System.out.println(id2);
	  
	  
	  driver.switchTo().newWindow(WindowType.TAB);
	  driver.get("https://www.google.com/");
	  driver.manage().window().maximize();
	  WebElement key3 = driver.findElement(By.name("q"));
	  key3.sendKeys("Cucumber");
	  driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
	  Thread.sleep(3000);
	  String t3 = driver.getTitle();
	  String id3 = driver.getWindowHandle();
	  System.out.println(t3);
	  System.out.println(id3);
	  
  }
}
