package com.SwagLab.UITest.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class P1_LoginPage 
{
	//Encapsulation=Private data + public method
	
	private WebDriver driver;
	
	//constructor
	public P1_LoginPage(WebDriver driver)//driver from base class
	{
		this.driver=driver;
		//to initialize elements identified by @FindBy
		PageFactory.initElements(driver,this);
	}
	
	//locator
	@FindBy(id="user-name")
	private WebElement usernameEle;
	
	@FindBy(id="password")
	private WebElement passwordEle;
	
	@FindBy(id="login-button")
	private WebElement loginBtn;
	
	//actions/method
	
	public String getAppUrl()
	{
		return driver.getCurrentUrl();
	}
	
	public String getAppTitle()
	{
		return driver.getTitle();
	}
	
	public P1_LoginPage  setUserName(String un)
	{
		
		usernameEle.sendKeys(un);
		return this;
	}
	
	
	public P1_LoginPage setPassword(String psw)
	{
		passwordEle.sendKeys(psw);
		return this;
	}
	
	public P2_InventoryPage ClickOnLoginButton()
	{
		loginBtn.click();
		//page navigates to next page then return next page object
		return new P2_InventoryPage(driver);
	}
	
	public P2_InventoryPage doLogin(String un,String psw)
	{
		
		usernameEle.sendKeys(un);
		passwordEle.sendKeys(psw);
		loginBtn.click();
		return new P2_InventoryPage(driver);
	}
	
	
	

}
