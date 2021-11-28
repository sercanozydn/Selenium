package com.neotech.lesson09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class WebTableDemo extends BaseClass{

	public static void main(String[] args) {
		
		setUp();
		
		WebElement finc = driver.findElement(By.xpath("//table[@class='tsc_table_s13']/tbody")); 
		
		String text = finc.getText();
		System.out.print(text);
		
		tearDown();
		
		
	}

}
