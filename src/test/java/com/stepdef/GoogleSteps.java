package com.stepdef;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class GoogleSteps 
{
	WebDriver driver;
	String actTitle;
	
	@Given("Open Google application")
	public void open_google_application() 
	{
	   driver=new EdgeDriver();
	   driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   driver.get("https://www.google.com");
	}

	@When("user get the current title of application")
	public void user_get_the_current_title_of_application()
	{

		actTitle=driver.getTitle();
		System.out.println("Current title is: "+actTitle);
	}

	@Then("title should be Google")
	public void title_should_be_google()
	{
		String expTitle="Google";
		Assert.assertEquals(actTitle,expTitle,"Title not matched!...Test Fail");
		System.out.println("Title matched!...Test Pass");

	}
	
	@When("user search for {string}")
	public void user_search_for(String keyword)
	{
		driver.findElement(By.id("APjFqb")).sendKeys(keyword);

	}

	@Then("User should get valid result for search")
	public void user_should_get_valid_result_for_search() {

		List<WebElement> allOptions=driver.findElements(By.xpath("(//ul[@class='G43f7e'])[1]//li"));
		System.out.println("Total matched: "+allOptions.size());
		
		for(WebElement i:allOptions)
		{
			System.out.println(i.getText());
		}
	}



}
