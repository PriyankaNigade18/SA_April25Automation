package com.stepdef;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Hrmsteps {
	public WebDriver driver;
	@Given("Open hrm application")
	public void open_hrm_application() {
	    driver=new EdgeDriver();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}

	@When("User enter {string} and {string}")
	public void user_enter_and(String un, String psw) {
	    // Write code here that turns the phrase above into concrete actions

		driver.findElement(By.name("username")).sendKeys(un);
		driver.findElement(By.name("password")).sendKeys(psw);
	}

	@When("User click on login button of hrm page")
	public void user_click_on_login_button_of_hrm_page() throws InterruptedException {

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(1500);
	}

	@Then("for valid data user should be able to login and navigated to dashboard page")
	public void for_valid_data_user_should_be_able_to_login_and_navigated_to_dashboard_page() {

		String actUrl=driver.getCurrentUrl();
		Assert.assertTrue(actUrl.contains("dashboard"),"Login Fail");
		System.out.println("Login pass!");
	}

}
