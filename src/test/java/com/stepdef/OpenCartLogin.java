package com.stepdef;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OpenCartLogin {

	public WebDriver driver;
@Given("Open Opencart login page")
public void open_opencart_login_page() 
{
    driver=new EdgeDriver();
    driver.get("https://tutorialsninja.com/demo/index.php?route=account/login");
}

@When("user send all valid credentials")
public void user_send_all_valid_credentials(DataTable table) {
    // Write code here that turns the phrase above into concrete actions
    // For automatic transformation, change DataTable to one of
    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
    // Double, Byte, Short, Long, BigInteger or BigDecimal.
    //
    // For other transformations you can register a DataTableType.
	List<List<String>> datatable=table.cells();
	driver.findElement(By.id("input-email")).sendKeys(datatable.get(0).get(0));
	driver.findElement(By.id("input-password")).sendKeys(datatable.get(0).get(1));
	
	
	
}

@When("User click on Login button of cart page")
public void user_click_on_login_button_of_cart_page() {

	driver.findElement(By.xpath("//input[@value='Login']")).click();
}

@Then("User should be able to login and navigate to account page")
public void user_should_be_able_to_login_and_navigate_to_account_page() {

String actUrl=driver.getCurrentUrl();
Assert.assertTrue(actUrl.contains("account"));
System.out.println("Login completed!");
}

}
