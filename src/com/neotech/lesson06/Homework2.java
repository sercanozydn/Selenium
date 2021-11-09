package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

/*
 * TC 2: Orange HRM Application Negative Login: 
   Open Chrome browser
   Go to https://opensource-demo.orangehrmlive.com/
   Enter valid username
   Leave password field empty
   Verify error message with text "Password cannot be empty" is displayed.
 */

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		WebElement usernameBox = driver.findElement(By.xpath("//input[@id='txtUsername']"));
		Thread.sleep(1000);
		usernameBox.sendKeys(ConfigsReader.getPropertyFromProp("AdminForOrange"));
		WebElement passwordBox = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		Thread.sleep(1000);
		WebElement loginBotton = driver.findElement(By.xpath("//input[@id='btnLogin']"));
		loginBotton.submit();
		Thread.sleep(1000);
		
		WebElement msg = driver.findElement(By.xpath("//span[@id=\"spanMessage\"]"));
		
		if(msg.isDisplayed()) {
			System.out.println("Test Passed");
		}else {
			System.out.println("Test Failed");
		}
		
		
		tearDown();
		

	}

}
