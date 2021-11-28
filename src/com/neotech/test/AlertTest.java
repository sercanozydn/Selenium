package com.neotech.test;

import org.openqa.selenium.By;

import com.neotech.utils.CommonMethods;

public class AlertTest extends CommonMethods {

	public static void main(String[] args) {
		
		
		setUp();
		
		driver.findElement(By.id("alert")).click();
		System.out.println(getAlertText());
		wait(2);
		acceptAlert();
		
		driver.findElement(By.id("confirm")).click();
		wait(2);
		dismissAlert();
		
		driver.findElement(By.id("prompt")).click();
		sendAlertText("Sercan");
		wait(2);
		acceptAlert();
		wait(2);
		
		
		tearDown();

	}

}
