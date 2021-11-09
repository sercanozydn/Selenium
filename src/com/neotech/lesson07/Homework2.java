package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

/*
 * Homework 2:
        Open chrome browser
        Go to “https://semantic-ui.com/modules/dropdown.html”
        Scroll down to “Multiple Selection”
        Click on drop down and select “CSS” and “HTML”
        Verify value has been selected
        Deselect 1 of the option from the dropdown
        Quit browser
 */

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement Multselec = driver
				.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div"));
		Multselec.click();

		driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]/div[2]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/div[2]/div[5]"))
				.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"example\"]/div[4]/div/div[2]/div[4]/div[1]/div[8]/div/a/i")).click();
		Thread.sleep(2000);

		tearDown();

	}

}
