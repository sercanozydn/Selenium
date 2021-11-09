package com.neotech.lesson07;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

/*
 * Homework 3:
        Alert text verification
        Open chrome browser
        Go to https://demoqa.com/
        Click on “Alerts, Frame & Windows” link
        Click on “Alerts” links on the left side
        Click on button to see Alert
        Verify alert box with text “You clicked a button” is present
        Click on 3 rd button in the page
        Verify alert box with text “Do you confirm action?” is present and click ”confirm”
        Click on button in “Java Script Alert Box” section
        Click on 4 th button in the page and enter your name and click ok.
         Quit browser
 */

public class Homework3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div/div[3]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='Alerts']")).click();
		Thread.sleep(1000);

		WebElement alertbutton = driver.findElement(By.id("alertButton"));
		Thread.sleep(1000);
		alertbutton.click();
		Thread.sleep(1000);

		Alert switchAlert = driver.switchTo().alert();

		switchAlert.accept();

		driver.findElement(By.id("confirmButton")).click();
		Thread.sleep(1000);
		
		Alert thirdAlert = driver.switchTo().alert();
		System.out.println("Alert text is : " + thirdAlert.getText());
		thirdAlert.accept();

		String testResult = driver.findElement(By.id("confirmResult")).getText();
		System.out.println("Result text is : " + testResult);
		
		WebElement lastButton = driver.findElement(By.id("promtButton"));
		lastButton.click();
		Thread.sleep(1000);
		Alert lastAlert = driver.switchTo().alert();
		lastAlert.sendKeys("Sercan");
		Thread.sleep(2000);
		lastAlert.accept();
		Thread.sleep(1000);
		
		tearDown();

	}

}
