package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;
import com.neotech.utils.Constants;

public class Homework1 extends BaseClass{
	
	/*
	 * HW1: Orange HRM Application Login:
     Open Chrome browser
     Go to https://opensource-demo.orangehrmlive.com/
     Enter valid username and password
     Click on login button
     Then verify that Welcome message is displayed.
     Quit the browser
	 */

	public static void main(String[] args) throws InterruptedException {
		 
		setUp();
		
		Thread.sleep(3000);
		String user = ConfigsReader.getPropertyFromProp("AdminForOrange");
		String pass = ConfigsReader.getPropertyFromProp("PasswordForOrange");
		
		WebElement userbox = driver.findElement(By.id("txtUsername"));
		userbox.clear();
		userbox.sendKeys(user);
		Thread.sleep(1000);
		WebElement passbox = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		passbox.clear();
		passbox.sendKeys(pass);
		Thread.sleep(1000);
		driver.findElement(By.id("btnLogin")).submit();
		Thread.sleep(1000);
		WebElement msg = driver.findElement(By.id("welcome"));
		if(msg.isDisplayed()) {
			System.out.println("Test is passed");
		}else {
			System.out.println("Test failed");
		}
		
		tearDown();
		

	}

}
