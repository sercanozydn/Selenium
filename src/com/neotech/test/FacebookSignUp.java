package com.neotech.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class FacebookSignUp extends CommonMethods {

	public static void main(String[] args) {
		
		setUp();
		
		WebElement month = driver.findElement(By.id("month"));
		selectDropdown(month, 5);
		 wait(2);
		 
		WebElement day = driver.findElement(By.id("day"));
		selectDropdown(day,"10");
		wait(2);
		
		WebElement year = driver.findElement(By.id("year"));
		selectDropdown(year,"1992");
		wait(2);
		
		
		
		
		
		tearDown();
	
	}

}
