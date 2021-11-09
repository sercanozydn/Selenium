package com.neotech.lesson06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class MultipleSelectDropdown extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		WebElement multiSelectDD = driver.findElement(By.xpath("//select[@id=\"countriesMultiple\"]"));
		
		Select selectDD = new Select(multiSelectDD);
		boolean isMulti = selectDD.isMultiple();
		System.out.println("Is it multi select? "+ isMulti);
		
	
		
		tearDown();
	

	}

}
