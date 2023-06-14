package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Day9TwoThree {
	
	WebDriver driver;
  @Test(priority=1)
  public void testcase1() 
  {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-options*=");
	  driver = new ChromeDriver();
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  String title = driver.getTitle();
	  Assert.assertEquals(title,"Domain Names, Websites, Hosting & Online Marketing Tools - GoDaddy IN");
	  String url = driver.getCurrentUrl();
	  Assert.assertEquals(url, "https://www.godaddy.com/en-in");
	  driver.close();
  }
  
  @Test(priority=2)
  public void testcase2()
  {
	  WebDriverManager.chromedriver().setup();
	  ChromeOptions co = new ChromeOptions();
	  co.addArguments("--remote-allow-options*=");
	  driver = new ChromeDriver();
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"id-631b049a-e9c0-4d24-8710-c504745206dd\"]/div[2]/div[1]/ul/li[1]/div/div[2]/div[1]/ul[1]/li[2]/div/span/div/span/a")).click();
	  String title1 = driver.getTitle();
	  System.out.println(title1);
	  driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).isDisplayed();
	  driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).isEnabled();
	  driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/button")).isDisplayed();
	  driver.findElement(By.xpath("//*[@id=\"8469f0c3-e08f-4343-9756-ce0390b0d581\"]")).sendKeys("mydomain");
	  driver.findElement(By.xpath("//*[@id=\"id-1467954b-c5e3-4b0c-9046-9fc94d8ca892\"]/section/div/div/section/div/div[1]/div/div/form/div/button")).click();
	  driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[3]/div[1]/div[2]/div[1]/div[2]/div[5]/div/div/div[2]/button")).click();	
	  driver.findElement(By.xpath("//*[@id=\"search-app\"]/div/div/div/div[3]/div[1]/div[2]/div[1]/div[2]/div[4]/div[2]/div[2]/span")).isDisplayed();
  }
}
