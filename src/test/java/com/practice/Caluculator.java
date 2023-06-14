package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

//day7TWO
public class Caluculator {
  
  int num1 = 20;
  int num2 = 10;
  
  @Test(priority = 2)
  public void add() 
  {
	  int  sum = num1+num2;
	  Assert.assertEquals(sum,30);
  }
  @Test(priority = 1)
  public void sub() 
  {
	  int  min = num1-num2;
	  Assert.assertEquals(min,10);
  }
  @Test(priority = 3)
  public void mul() 
  {
	  int  product = num1*num2;
	  Assert.assertEquals( product,200);
  }
  @Test(priority = 4)
  public void div() 
  {
	  int divide = num1/num2;
	  Assert.assertEquals(divide,2);
  }
}
