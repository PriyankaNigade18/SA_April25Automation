package com.WebAppTesting;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S01_FirstTest
{

	public static void main(String[] args)
	{
		// Create driver session
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		

	}

}
