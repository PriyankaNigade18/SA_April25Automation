package com.WebTesting.TestNG.TestListener;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class MyListener implements ITestListener
{
	
	
	public void onTestStart(ITestResult res)
	{
		System.out.println("Test started..."+res.getName());
	}

	public void onTestSuccess(ITestResult res)
	{
		System.out.println("Test Pass status: "+res.getName());
	}
	
	public void onTestFailure(ITestResult res)
	{
		System.out.println("Test Fail status: "+res.getName());
	}
}
