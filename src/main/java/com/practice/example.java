package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class example {
  @Test
  public void Login() {
	  System.out.println("Login method");
	  Assert.assertEquals(2, 2);
  }
  @Test(dependsOnMethods = {"Login"})
  public void Logout() {
	  System.out.println("Logoout");

  }
}
