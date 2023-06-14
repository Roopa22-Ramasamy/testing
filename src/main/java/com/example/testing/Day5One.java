package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Day5One 
{
	public static void main(String[] args) throws InterruptedException 
    {
   	    WebDriverManager.edgedriver().setup();
	  	WebDriver driver=new EdgeDriver();
	    driver.manage().window().maximize();
	    driver.navigate().to("https://j2store.net/free/");
	    String title = "Home";
	    String t = driver.getTitle();
	    if(t.equals(title))
	    {
	    	System.out.println("valid");
	    }
	    else
	    {
	    	System.out.println("Invalid");
	    }
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,1500)", "");
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@id=\"Mod112\"]/div/div/ul/li[1]/h4/a")).click();
	    Thread.sleep(3000);
	    
	    String title2 = driver.getTitle();
	    String currentTitle = "Shop";
	     if(currentTitle.equals(title2))
	     {
	    	 System.out.print("valid");
	     }
	     else
	     {
	    	 System.out.println("Invalid");
	     }
	    
	    
}
}
