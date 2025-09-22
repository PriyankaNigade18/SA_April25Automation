package com.stepdef;

import java.time.Duration;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenCartRegister 
{
	public WebDriver driver;
	@Given("Open Register page of application")
	public void open_register_page_of_application()
	{
		driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://tutorialsninja.com/demo/index.php?route=account/register");
		
	}

	@When("user enter all required valid fields")
	public void user_enter_all_required_valid_fields(DataTable table) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    
		List<Map<String,String>> datatable=table.asMaps();
		
		driver.findElement(By.id("input-firstname")).sendKeys(datatable.get(0).get("fname"));
		driver.findElement(By.name("lastname")).sendKeys(datatable.get(0).get("lname"));
		driver.findElement(By.id("input-email")).sendKeys(datatable.get(0).get("email"));
		driver.findElement(By.id("input-telephone")).sendKeys(datatable.get(0).get("telephone"));
		driver.findElement(By.id("input-password")).sendKeys(datatable.get(0).get("password"));
		driver.findElement(By.id("input-confirm")).sendKeys(datatable.get(0).get("cpassword"));
		
		
	}

	@When("User click on yes radio button")
	public void user_click_on_yes_radio_button() {
	    driver.findElement(By.xpath("(//input[@type='radio'])[2]")).click();
	}

	@When("User click on Privacy policy checkbox")
	public void user_click_on_privacy_policy_checkbox() {

		driver.findElement(By.name("agree")).click();
	}

	@When("User click on Continue button")
	public void user_click_on_continue_button() {

		driver.findElement(By.xpath("//input[@value='Continue']")).click();
	}

	@Then("User should be register and get valid message")
	public void user_should_be_register_and_get_valid_message() {
		
		String actUrl=driver.getCurrentUrl();
		Assert.assertTrue(actUrl.contains("success"));
		System.out.println("User registration completed...");
		System.out.println(driver.findElement(By.xpath("(//h1)[2]")).getText());

	}

}
