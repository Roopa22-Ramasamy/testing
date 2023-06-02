package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class day7_5 {
	WebDriver driver;
  @Test
  public void validation() 
  {
	  WebDriverManager.edgedriver().setup();
	  driver=  new EdgeDriver();
	  driver.get("https://www.godaddy.com/en-in");
	  driver.manage().window().maximize();
	  String title=driver.getTitle();
	  System.out.println(title);
}}