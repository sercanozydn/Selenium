package com.neotech.lesson07;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

/*
 * Homework 1:
        Amazon Department List Verification
        Open chrome browser
        Go to “http://www.amazon.com/
        Verify how many department options available.
        Print each department 
        Select Computers
        Quit browser
 */

public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		WebElement button = driver.findElement(By.id("searchDropdownBox"));
		button.click();
		Thread.sleep(2000);

		Select dropboxElements = new Select(button);

		List<WebElement> allbox = dropboxElements.getOptions();

		for (WebElement options : allbox) {
			String text = options.getText();
			System.out.println(text);
		}
		
		System.out.println("Size of the all box is : "+allbox.size());
	

		tearDown();

	}

}
