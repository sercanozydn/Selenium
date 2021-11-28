package com.neotech.lesson13;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class FileUploadDemo extends CommonMethods {
	
	public static void main(String[] args) {
		
		setUp();
		
		driver.findElement(By.linkText("File Upload")).click();
		
		String filePath = System.getProperty("user.dir") + "/ScreenShot/screenshot_1.png"; 
		System.out.println(filePath);
		wait(2);
		
		driver.findElement(By.id("file-upload")).sendKeys(filePath);
		driver.findElement(By.id("file-submit")).click();
		wait(2);
		
		tearDown();
			
	}

}
