package com.neotech.lesson08;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class ImplicitWaitDemo extends BaseClass {

	public static void main(String[] args) {

		setUp();

		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);

		driver.findElement(By.linkText("This is a Ajax link")).click();

		String text = driver.findElement(By.xpath("//*[@id=\"Result\"]/div/p")).getText();
		System.out.println(text);

		tearDown();

	}

}
