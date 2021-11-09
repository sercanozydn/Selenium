package com.neotech.lesson06;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class AlertDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement alertButton = driver.findElement(By.id("alert"));
		alertButton.click();
		Thread.sleep(2000);
		
		Alert alertToSwitch = driver.switchTo().alert();
		String text = alertToSwitch.getText();
		System.out.println(text);
		
		alertToSwitch.accept();
		Thread.sleep(2000);
		
		WebElement confirmAlertButton = driver.findElement(By.id("confirm"));
		confirmAlertButton.click();
		Thread.sleep(2000);
		
		Alert switchToConfirmAlert = driver.switchTo().alert();
		
		switchToConfirmAlert.dismiss();
		Thread.sleep(2000);
		
		WebElement promptAlertButton = driver.findElement(By.id("prompt"));
		promptAlertButton.click();
		Thread.sleep(2000);
		
		Alert switchToPromptAlert = driver.switchTo().alert();
		
		switchToPromptAlert.getText();
		Thread.sleep(2000);
		switchToPromptAlert.sendKeys("Hi there");
		Thread.sleep(2000);
		switchToPromptAlert.accept();
		Thread.sleep(2000);
		
		

		tearDown();

	}

}
