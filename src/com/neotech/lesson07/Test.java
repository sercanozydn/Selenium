package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class Test extends BaseClass {

	public static void main(String[] args) {

		setUp();

		WebElement bigFrame = driver.findElement(By.xpath("//iframe[@id='frame1']"));
		driver.switchTo().frame(bigFrame);
		
		WebElement bigletext = driver.findElement(By.xpath("//*[@id=\"sampleHeading\"]"));
	    System.out.println("First frame text is --> "+bigletext.getText());
	    
	    driver.switchTo().defaultContent();
	    
	    WebElement littleframe = driver.findElement(By.xpath("//iframe[@id='frame2']"));
	    driver.switchTo().frame(littleframe);
	    
	    WebElement littleText = driver.findElement(By.id("sampleHeading"));
	    String Lt = littleText.getText();
	    
	    System.out.println("Little text is --> "+Lt);
	    

		tearDown();

	}

}
