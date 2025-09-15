package com.WebTesting.TestNG.TestListener;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;




@Listeners(com.WebTesting.TestNG.TestListener.MyListener.class)

public class TestListener 
{
  @Test
  public void testCase1()
  {
	  Assert.assertEquals(true,true);
	  System.out.println("Test case 1 pass......");
  }
  
  
  @Test
  public void testCase2()
  {
	  Assert.assertEquals(true,true);
	  System.out.println("Test Case 2 pass......");
  }
}


