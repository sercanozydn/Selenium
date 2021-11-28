package com.neotech.lesson12;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import com.neotech.utils.CommonMethods;

public class ScreenShotDemo extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		wait(1);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		wait(1);
		
		
		TakesScreenshot ts = (TakesScreenshot) driver;
		
		File source = ts.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(source, new File("ScreenShot/screenshot_1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		driver.findElement(By.id("btnLogin")).click();
		
        TakesScreenshot ts2 = (TakesScreenshot) driver;
		
		File sourc = ts2.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(sourc, new File("ScreenShot/screenshot_2.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		wait(1);
		
		
		
		tearDown();

	}

}
