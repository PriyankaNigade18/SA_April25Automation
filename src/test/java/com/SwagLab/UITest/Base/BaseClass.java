package com.SwagLab.UITest.Base;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;

import com.SwagLab.UITest.Pages.P1_LoginPage;
import com.SwagLab.UITest.Pages.P2_InventoryPage;
import com.SwagLab.UITest.Pages.P3_CartPage;
import com.SwagLab.UITest.Pages.P4_CheckoutPage;
import com.SwagLab.UITest.Pages.P5_OverviewPage;
import com.SwagLab.UITest.Utilities.BrowserProvider;
import com.SwagLab.UITest.Utilities.PropertiesUtil;
import com.aventstack.chaintest.plugins.ChainTestListener;

public class BaseClass 
{
	//public variables + Annotations +Page class object
	public WebDriver driver;
	public P1_LoginPage lp;
	public P2_InventoryPage ip;
	public P3_CartPage cp;
	public P4_CheckoutPage ch;
	public P5_OverviewPage op;
	public PropertiesUtil prop;
	
	@BeforeClass
	@Parameters({"bname"})
	public void setUp(String bname)
	{
		prop=new PropertiesUtil("Config");
		
		driver=BrowserProvider.setDriver(bname);
		//driver=new EdgeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getData("url"));
		lp=new P1_LoginPage(driver);
		ip=new P2_InventoryPage(driver);
		cp=new P3_CartPage(driver);
		ch=new P4_CheckoutPage(driver);
		op=new  P5_OverviewPage(driver);
	}
	
	@AfterMethod
	public void waitForTest()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	@AfterMethod
	public void getScreenshot(ITestResult result) 
	{
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		//in report
		byte arr[]=ts.getScreenshotAs(OutputType.BYTES);
		ChainTestListener.embed(arr,"image/png");
		
		//byte format screenshot in local
	File src=ts.getScreenshotAs(OutputType.FILE);
	File path=new File(System.getProperty("user.dir")+"//Screenshots//"+result.getName()+".png");
		
	try {
		FileHandler.copy(src,path);
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
	}
	
	public static void addWait()
	{
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	@AfterClass
	public void tearDown()
	{
		driver.quit();
	}
	

}
