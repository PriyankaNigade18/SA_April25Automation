package com.SwagLab.UITest.TestCases;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

import com.SwagLab.UITest.Base.BaseClass;

public class T3_CartTest extends BaseClass
{
	//prerequisite
	//user should be login and product should be available in cart and cart page should open
	@BeforeClass
	public void pageSet()
	{
		ip=lp.doLogin("standard_user","secret_sauce");
		addWait();
		ip=ip.addProductToCart(prop.getData("pname1"));
		addWait();
		cp=ip.launchCartPage();
		addWait();
		
	}
	
  @Test(priority=1)
  public void varifyTotalProductsInCart() 
  {
	  cp.getProductDetailsAddedToCart();
  }
  
  @Test(priority=2)
  public void validateRemoveProduct()
  {
	  cp.removeProduct(prop.getData("pname1"));
  }
  
  @Test(priority=3)
  public void validateContinueShopping()
  {
	  ip=cp.doContinueShopping();
	  ip.addProductToCart(prop.getData("pname2"));
	  cp=ip.launchCartPage();
  }
  
  @Test(priority=4)
  public void validateContinueCheckOut()
  {
	  cp.doContinueCheckout();
  }
}
