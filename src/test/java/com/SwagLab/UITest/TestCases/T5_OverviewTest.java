package com.SwagLab.UITest.TestCases;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.SwagLab.UITest.Base.BaseClass;
import com.SwagLab.UITest.Utilities.ExcelUtil;

public class T5_OverviewTest extends BaseClass 
{
	
	@BeforeClass
	public void pageSetup()
	{
	ip=lp.doLogin(ExcelUtil.getStringData("UserData",0,1),ExcelUtil.getStringData("UserData",1,1));
	addWait();
	ip=ip.addProductToCart(prop.getData("pname2"));
	addWait();
	cp=ip.launchCartPage();
	addWait();
	ch=cp.doContinueCheckout();
	addWait();
	op=ch.doContinueCheckout(ExcelUtil.getStringData("UserData",2,1),ExcelUtil.getStringData("UserData",3,1),ExcelUtil.getStringData("UserData",4,1));
	}
	
  @Test(priority=1)
  public void verifyPayment()
  {
	  op.getPaymentDetails();
  }
  
  
  @Test(priority=2)
  public void validateChekout()
  {
	  String actMsg=op.doFinishCheckout();
	  String expMsg="Thank you for your order!";
	  Assert.assertEquals(actMsg,expMsg);
	  System.out.println("Process Completed!");
  }
}
