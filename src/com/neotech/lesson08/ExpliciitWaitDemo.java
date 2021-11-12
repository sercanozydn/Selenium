package com.neotech.lesson08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.neotech.utils.BaseClass;

public class ExpliciitWaitDemo extends BaseClass {

	public static void main(String[] args) {

		setUp();

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

		driver.findElement(By.linkText("This is a Ajax link")).click();

		WebDriverWait wait = new WebDriverWait(driver, 10);

		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("ContactUs")));

		tearDown();

	}

}
