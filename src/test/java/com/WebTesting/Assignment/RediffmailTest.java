package com.WebTesting.Assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class RediffmailTest {
  @Test
  public void testRegister() throws InterruptedException
  {
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	  
	  driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	  
	  Thread.sleep(2000);
	  WebElement ele=driver.findElement(By.xpath("(//div[@id='div_hintQS']//div)[1]//select"));
	  Select sc=new Select(ele);
	  sc.selectByVisibleText("What is the name of your first school?");
	  
	  
	  
	  
	  
  }
}
