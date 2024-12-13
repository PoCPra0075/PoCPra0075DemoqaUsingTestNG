package com.qapitol.util;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.qapitol.base.BaseTest;
import com.qapitol.testcases.ElementsTest;

public class Utility extends BaseTest{


	public static void takeScreenShot() {
		
		TakesScreenshot takeScreenShot = (TakesScreenshot) driver;
		
		File srcFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
		
		File destFile = new File("C:\\Users\\Qapitol QA\\eclipse-workspace\\demoqa\\Reposcreenshots\\abc.png");
		
		try {
			
			FileUtils.copyFile(srcFile, destFile);
			
		} catch (IOException e) {
			System.out.println("Failed");
			// TODO Auto-generated catch block
			//log.error("File Not found");
			e.printStackTrace();
		}
		
	}

}
