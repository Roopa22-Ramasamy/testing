package com.practice;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentReporter;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class Day11 
{
	ExtentSparkReporter spark;
    static ExtentReporter  extent;
    static ExtentTest test;
	
	@BeforeMethod
	public void before()
	{
//		spark = new ExtentSparkReporter("report.html");
//		extent = new ExtentReporter();
//		extent.attachReporter(spark);
	}
	
	
  @Test
  public void f() 
  {
	  
  }
}
