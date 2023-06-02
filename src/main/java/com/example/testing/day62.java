package com.example.testing;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;


import io.github.bonigarcia.wdm.WebDriverManager;

public class day62
{
	public static void main( String[] args ) throws InterruptedException
	{
		WebDriverManager.chromedriver().setup();
	    ChromeOptions co=new ChromeOptions(); 
	    co.addArguments("--remote-allow-origins=*");
	    WebDriver driver = new ChromeDriver(co);
	    driver.manage().window().maximize();
	    driver.get("https://demo.wpeverest.com/user-registration/guest-registration-form/");
	   
	    driver.findElement(By.xpath("//*[@id=\"first_name\"]")).sendKeys("Roopa Thangam");
	    
	    driver.findElement(By.xpath("//*[@id=\"user_email\"]")).sendKeys("sample11@gmail.com");
	    
	    driver.findElement(By.xpath("//*[@id=\"user_pass\"]")).sendKeys("Keerthana@Malathi24221");
	    
	    driver.findElement(By.xpath("//*[@id=\"last_name\"]")).sendKeys("R");
	    
	    WebElement datePicker = driver.findElement(By.xpath("//*[@id=\"date_box_1665628538_field\"]/span/input[1]"));
	    
	    datePicker.click(); 
	    
        WebElement month = driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/select/option[12]"));
	    
	    month.click();
	    
WebElement year= driver.findElement(By.xpath("/html/body/div[5]/div[1]/div/div/div/input"));
	    
	    year.click();
	    year.clear();
	    year.sendKeys("2022");
	    
WebElement date = driver.findElement(By.xpath("/html/body/div[5]/div[2]/div/div[2]/div/span[25]"));
	    
	    date.click();
	    Thread.sleep(3000);
	    //driver.quit();
	    JavascriptExecutor js = (JavascriptExecutor)driver;
	    js.executeScript("window.scrollBy(0,5000)", "");
	    
	    driver.findElement(By.xpath("//*[@id=\"input_box_1665629217\"]")).sendKeys("Indian");
	   
	   driver.findElement(By.xpath("//*[@id=\"phone_1665627880\"]"));
	    
	   js.executeScript("window.scrollBy(0,5000)", "");
	   
	   driver.findElement(By.xpath("//*[@id=\"privacy_policy_1665633140\"]")).click();
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//*[@id=\"user-registration-form-771\"]/form/div[4]/button")).click();
	   Thread.sleep(3000);
	   
	   driver.findElement(By.xpath("//*[@id=\"ur-submit-message-node\"]"));
	    
	    
	    
	    
	    
	    
	    
	
	    
}
	
}
