package com.ExceptionHandling;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class CompileTimeException {

	public static void main(String[] args) throws Exception //InterruptedException, IOException
	{
		System.out.println("Program started.......");
		Thread.sleep(4000);
		System.out.println("Program stopped......");
		
		//to read data from file
		
		//step 1: get the address of file use File class
		
		//File f1=new File("C://Trainings//SA_Automation_2025_2//JavaTraining//config.properties");
		//to reach working directory 1. System.getProperty("user.dir) 2."./"
		//File f1=new File(System.getProperty("user.dir")+"//config.properties");
		File f1=new File("./"+"//config.properties");
		//step2: read as stream
		FileInputStream fs=new FileInputStream(f1);
		
		//step3: for properties file in java we have a class Properties, create object
		Properties p1=new Properties();
		
		
		//step 4: load the file using object
		p1.load(fs);
		
		//step5: use method getProperty(Key)--->value
		
		System.out.println("Browser name is:"+p1.getProperty("browserName"));
		System.out.println("Browser version is: "+p1.getProperty("browserVersion"));
		
		
		
		
		
		
		
		
		
		
	}

}
