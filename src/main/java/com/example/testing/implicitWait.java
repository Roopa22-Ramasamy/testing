package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class implicitWait 
{
	public static void main( String[] args ) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	    ChromeOptions co=new ChromeOptions(); 
	    co.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(co);
	    driver.manage().window().maximize();
	    driver.get("https://demo.opencart.com/index.php?route=account/register&language=en-gb");
	    driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("Roopa Thangam");
	    driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("R");
	    driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("727821tuec201@skct.edu.in");
	    driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Roopa1234");
	    JavascriptExecutor js = (JavascriptExecutor)driver;	
	    js.executeScript("window.scrollBy(0,1500)", "");
	    Thread.sleep(5000);
	    js.executeScript("window.scrollBy(0,1500)", "");
	    driver.findElement(By.xpath("//*[@id=\"form-register\"]/div/div")).click();
	    
}
}
