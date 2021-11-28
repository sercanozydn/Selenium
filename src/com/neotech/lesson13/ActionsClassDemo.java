package com.neotech.lesson13;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.neotech.utils.CommonMethods;

public class ActionsClassDemo extends CommonMethods {

	public static void main(String[] args) {

		setUp();

		WebElement account = driver.findElement(By.id("nav-link-accountList"));

		Actions action = new Actions(driver);

		action.moveToElement(account).perform();
		
		wait(3);

		tearDown();

	}

}
