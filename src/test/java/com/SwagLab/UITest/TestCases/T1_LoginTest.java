package com.SwagLab.UITest.TestCases;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.SwagLab.UITest.Base.BaseClass;
import com.SwagLab.UITest.Utilities.ExcelUtil;


public class T1_LoginTest extends BaseClass
{
  @Test(priority=1)
  public void varifyUrl() 
  {
	  String actUrl=lp.getAppUrl();
	  String expUrl=prop.getData("homepageUrl");
	  Assert.assertTrue(actUrl.contains(expUrl),"Url not matched!");
	  System.out.println("Url Matched!");
  }
  
  @Test(priority=2)
  public void varifyTitle() 
  {
	  String actTitle=lp.getAppTitle();
	  String expTitle=prop.getData("homepageTitle");
	  Assert.assertEquals(actTitle,expTitle,"Title not mathced!");
	  System.out.println("Title matched!");
	  
  }
  
  @Test(priority=3)
  public void validateLoginFunctionality() 
  {
	  lp.setUserName(ExcelUtil.getStringData("UserData",0,1));//index
	  lp.setPassword(ExcelUtil.getStringData("UserData",1,1));
	  lp.ClickOnLoginButton();
	  
	  //assertion
	  Assert.assertTrue(lp.getAppUrl().contains("inventory.html"),"Login Fail!");
	  System.out.println("Login Completed!");
	  
  }
}
