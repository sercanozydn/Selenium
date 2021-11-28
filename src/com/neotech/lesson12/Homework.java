package com.neotech.lesson12;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Homework extends CommonMethods {

	public static void main(String[] args) {
		/*
		 * Homework 1:
		 * 
		 * FrameDemo.java using the CommonMethods.java
		 */

		setUp();

		switchToFrame(0);
		WebElement nameText = driver.findElement(By.id("name"));
		sendText(nameText, "Sercan");
		wait(2);

		driver.switchTo().defaultContent();

		switchToFrame("iframe_a");
		sendText(nameText, "Mustafa Kemal");
		
		driver.switchTo().defaultContent(); 

		wait(2);
		tearDown();

	}

}
