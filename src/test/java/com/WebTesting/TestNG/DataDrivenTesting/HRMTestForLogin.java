package com.WebTesting.TestNG.DataDrivenTesting;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.Generic.Utility;

public class HRMTestForLogin 
{
  //@Test(dataProvider = "mydata",dataProviderClass = CustomData.class) using array
  @Test(dataProvider = "exceldata",dataProviderClass = CustomData.class)
  public void testLogin(String un,String psw) throws InterruptedException 
  {
	  WebDriver driver=new ChromeDriver();
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	  driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	  	  
	  driver.findElement(By.name("username")).sendKeys(un);
	  driver.findElement(By.name("password")).sendKeys(psw);
	 Utility.getScreenshot(driver,"DDTForHRM");
	  driver.findElement(By.tagName("button")).click();
	  
	  Thread.sleep(2000);
	  //dashboard page
	  //assertion
	  Assert.assertTrue(driver.getCurrentUrl().contains("dashboard"),"Login Fail...");
	  System.out.println("User Login is completed!");
	  
	  
	  
	  
	  
	  
	  
	  
	  
	  
  }
}
