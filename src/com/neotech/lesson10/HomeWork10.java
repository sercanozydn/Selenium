package com.neotech.lesson10;
/*
 * Homework 1: Leave List Search Validation

1. Open chrome browser
2. Go to https://opensource-demo.orangehrmlive.com/
3. Login into the application
4. Select Leave List
5. Select from July 1, 2021 until August 31, 2020
6. Check only "Scheduled"
7. Click on Search
8. Validate "No Records Found" is displayed
9. Quit the browser
 *
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class HomeWork10 extends CommonMethods {

	public static void main(String[] args) {
		
		
		setUp();
		WebElement user = driver.findElement(By.id("txtUsername"));
		sendText(user, ConfigsReader.getPropertyFromProp("AdminForOrange"));
		wait(1);
		
		WebElement pass = driver.findElement(By.id("txtPassword"));
		sendText(pass, ConfigsReader.getPropertyFromProp("PasswordForOrange"));
		wait(1);
		
		driver.findElement(By.id("btnLogin")).click();

		wait(2);
		tearDown();
	}

}
