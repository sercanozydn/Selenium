package com.neotech.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;
import com.neotech.utils.ConfigsReader;

public class LoginTest extends CommonMethods{

	public static void main(String[] args) {
		
		setUp();
		
		WebElement user = driver.findElement(By.id("txtUsername"));
		sendText(user, ConfigsReader.getPropertyFromProp("AdminForOrange"));
		
		WebElement pass = driver.findElement(By.id("txtPassword"));
		sendText(pass, ConfigsReader.getPropertyFromProp("PasswordForOrange"));
		
		WebElement loginBtn = driver.findElement(By.id("btnLogin"));
		loginBtn.click();
		
		wait(2);
		
		WebElement WelcomeText = driver.findElement(By.id("welcome"));
		
		if(WelcomeText.isDisplayed()) {
			System.out.println("Test is Passed");
		}else {
			System.out.println("Test is Failed");
		}
		
		tearDown();

	}

}
