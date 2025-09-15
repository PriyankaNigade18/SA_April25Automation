package com.WebTesting.TestNG.TestListener;

import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;

public class TestExtentReportDemo1
{
  @Test
  public void testReport()
  {
	  //create instance of ExtentReports class
	  ExtentReports extent=new ExtentReports();
	  	  
	  //create instance of ExtentSparkReporter class to provide path of report
	  ExtentSparkReporter spark=new ExtentSparkReporter(System.getProperty("user.dir")+"//TestReport//AutomationReport.html");
	  
	  // add configuration 
	  spark.config().setDocumentTitle("ExtentReport");
	  spark.config().setReportName("CRM Project");
	  spark.config().setTheme(Theme.DARK);
	  
	  //attach the report
	  extent.attachReporter(spark);
	  
	  //create test
	  ExtentTest test=extent.createTest("CRM Test");
	  
	  //add log
	  test.log(Status.INFO,"This is for information...");
	  test.log(Status.PASS,"This is for Pass status...");
	  test.log(Status.FAIL,"This is for Fail status...");
	  test.log(Status.SKIP,"This is for Skip status...");
	  test.log(Status.WARNING,"This is warning status...");
	  
	  
	  //flush():close the report
	  extent.flush();
  }
}
