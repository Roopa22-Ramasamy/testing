package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class task4 
{
	public static void main( String[] args ) throws InterruptedException
{
	WebDriverManager.edgedriver().setup();
   WebDriver driver = new EdgeDriver();
   String url = "https://demo.opencart.com/";
   driver.navigate().to(url);
   driver.manage().window().maximize();
    driver.findElement(By.xpath("//*[@id=\"search\"]/input")).sendKeys("Mobile world");
}
}
