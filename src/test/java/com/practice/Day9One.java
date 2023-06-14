package com.practice;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Day9One 
{
	App ab = new App();
  
	@Test(dataProvider="expectedDataAddition")
  public void Addition(int a ,int b,int expected)
  {
	  int result = ab.CalculateAddition(a,b);
	  Assert.assertEquals(result,expected);
  }
	@DataProvider
	public Object[][] expectedDataAddition()
	{
		return new Object[][]{
				{1,2,3}
		};
	}
	
	@Test(dataProvider="expectedDataMultiplication")
	public void Multiplication(int a,int b, int expected)
	{
		int result = ab.CalculateMultiplication(a, b);
		Assert.assertEquals(result,expected);
	}
	@DataProvider
	public Object[][] expectedDataMultiplication()
	{
		return new Object[][] {
			{5,2,10}
		};
	}
	
	 @Test(dataProvider="expectedDataDivision")
	  public void Division(int a,int b,int expected) {
		  int result = ab.CalculateDivision(a, b);
		  Assert.assertEquals(result, expected);
	  }
	  @DataProvider
	  public Object[][] expectedDataDivision()
	  {
		  return new Object[][]{
			  {4,2,2}
		  };
	  }
	
}
