package com.WebTesting.TestNG.Basics;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TestDemo8_dependsOnMathod
{
  @Test(priority=1)
  public void registerTest() 
  {
	  System.out.println("This is register test");
  }
  
  
  @Test(priority=2,dependsOnMethods = "registerTest")
  public void loginTest() 
  {
	  System.out.println("This is login test");
	  Assert.assertEquals(false,true,"Fail as values not equal");
  }
  
  
  @Test(priority=3,dependsOnMethods = "loginTest")
  public void logoutTest() 
  {
	  System.out.println("This is logout test");
  }
}
