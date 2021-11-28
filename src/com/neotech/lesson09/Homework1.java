package com.neotech.lesson09;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

/*
 * Homework 1:
        Verify element is enabled
        Open chrome browser
        Go to “https://the-internet.herokuapp.com/”
        Click on “Click on the “Dynamic Controls” link
        Click on enable button
        Enter “Hello” and verify text is entered successfully
        Close the browser 
 */

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement dynamic = driver.findElement(By.linkText("Dynamic Controls"));
		dynamic.click();

		driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"message\"]")));

		WebElement textbox = driver.findElement(By.xpath("//*[@id='input-example']/input"));
		textbox.sendKeys("Hello");

		Thread.sleep(2000);

		tearDown();

	}

}
