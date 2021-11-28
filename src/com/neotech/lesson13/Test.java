package com.neotech.lesson13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Test extends CommonMethods{

	public static void main(String[] args) {
		
		
		setUp();
		 
		
		String filePath = System.getProperty("user.dir") + "/ScreenShot/screenshot_1.png";
		
		driver.findElement(By.id("gwt-debug-cwFileUpload")).sendKeys(filePath);
		
		wait(2);
		driver.findElement(By.xpath("//button[@class='gwt-Button']")).click();
		wait(2);
		
		Alert alert = driver.switchTo().alert();
		
		TakesScreenshot ss = (TakesScreenshot)driver;
		File source = ss.getScreenshotAs(OutputType.FILE);
		
		try {
			FileUtils.copyFile(source, new File("/ScreenShot/uploadTest1.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		alert.accept();
		wait(1);
		
		
		
		
		
		
		tearDown();

	}

}
