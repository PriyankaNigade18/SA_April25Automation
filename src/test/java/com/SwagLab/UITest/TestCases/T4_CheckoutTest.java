package com.SwagLab.UITest.TestCases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.SwagLab.UITest.Base.BaseClass;
import com.SwagLab.UITest.Utilities.ExcelUtil;

public class T4_CheckoutTest extends BaseClass
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
		
	}
	
	
  @Test
  public void validateCheckout()
  {
	  
	  ch.doContinueCheckout(ExcelUtil.getStringData("UserData",2,1),ExcelUtil.getStringData("UserData",3,1),ExcelUtil.getStringData("UserData",4,1));
	  addWait();
  }
}
