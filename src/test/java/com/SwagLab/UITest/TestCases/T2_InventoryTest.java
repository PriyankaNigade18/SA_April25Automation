package com.SwagLab.UITest.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.AssertJUnit;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.SwagLab.UITest.Base.BaseClass;
import com.SwagLab.UITest.Utilities.ExcelUtil;

public class T2_InventoryTest extends BaseClass
{
	//prerequisite:User must be login
	@BeforeClass
	public void pageSetup()
	{
		ip=lp.doLogin(ExcelUtil.getStringData("UserData",0,1),ExcelUtil.getStringData("UserData",1,1));
		addWait();
		
	}
	
  @Test(priority=1)
  public void verifyProductCount()
  {
	  int actCount=ip.getProductCount();
	  AssertJUnit.assertEquals(actCount,6);
	  System.out.println("Total Product count is matched: "+actCount);
  }
  
  @Test(priority=2)
  public void verifyProductDetails()
  {
	  ip.getProductDetails();
  }
  
  
  @Test(priority=3)
  public void validateAddToCart()
  {
	  ip.addProductToCart(prop.getData("pname1"));
  }
  
  
  @Test(priority=4)
  public void verifyCartPageLaunch() 
  {
	  ip.launchCartPage();
  }
}
