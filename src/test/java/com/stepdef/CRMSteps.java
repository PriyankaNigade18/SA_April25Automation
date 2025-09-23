package com.stepdef;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import com.AppHooks.CRMHooks;
import com.Utility.BrowserProvider;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class CRMSteps// extends CRMHooks not allowed to extend class any stepdef or hook
{
	//WebDriver driver;//driver is null
	
	WebDriver driver=BrowserProvider.getDriver();
//	@Before
//	public void setUp()
//	{
//		System.out.println("Before will run before every scenario");
//		 driver=new EdgeDriver();
//	}
//	
//	
//	@After
//	public void tearDown()
//	{
//		System.out.println("After will run after every scenario");
//		driver.quit();
//	}
	
	@Given("Open CRM application")
	public void open_crm_application() {
	   
	    driver.get("https://automationplayground.com/crm/");
	}

	@When("User click on SignIn link")
	public void user_click_on_sign_in_link() {
	    WebElement link=driver.findElement(By.linkText("Sign In"));
	    if(link.isDisplayed() && link.isEnabled())
	    {
	    	link.click();
	    }
	}

	@Then("User should navigate to Login page")
	public void user_should_navigate_to_login_page() {

		String actUrl=driver.getCurrentUrl();
		Assert.assertTrue(actUrl.contains("login"));
		System.out.println("User navigated to login page...");
	}

	@When("User enter emailid {string} and password {string}")
	public void user_enter_emailid_and_password(String email, String psw) {

		driver.findElement(By.id("email-id")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(psw);
	}
	@When("User click on Submit button")
	public void user_click_on_submit_button() {

		driver.findElement(By.id("submit-id")).click();
	}

	@Then("User should be navigate to Customers page")
	public void user_should_be_navigate_to_customers_page() {

		String actUrl=driver.getCurrentUrl();
		Assert.assertTrue(actUrl.contains("customers"),"Login Fail");
		System.out.println("Login Completed!");
	}




}
