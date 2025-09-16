package com.WebTesting.TestNG.TestListener;

import org.openqa.selenium.By;
import com.aventstack.chaintest.plugins.ChainTestListener;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

//@Listeners(MyListener.class)
@Listeners(ChainTestListener.class)
public class TestCRMApp extends BaseClass  
{
  @Test(priority=1)
  public void testSignInLink() 
  {
	  WebElement link=driver.findElement(By.linkText("Sign In"));
	  if(link.isDisplayed() && link.isEnabled())
	  {
		  link.click();
		  ChainTestListener.log("SignIn Link is working.... ");
	  }
	  
  }
  
  @Test(priority=2)
  public void testLogin() 
  {
	  ChainTestListener.log("Login Test is executing..... ");
	  driver.findElement(By.id("email-id")).sendKeys("test@gmail.com");
	  driver.findElement(By.id("password")).sendKeys("test123");
	  driver.findElement(By.id("submit-Button")).click();
	  Assert.assertTrue(driver.getCurrentUrl().contains("customers"));
	  ChainTestListener.log("Login completed!...... ");
	  
  
  }
  
  @Test(priority=3)
  public void testLogout() 
  { 	ChainTestListener.log("Logout Test is executing..... ");
	  driver.findElement(By.linkText("Sign Out")).click();
  }
}
