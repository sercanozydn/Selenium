package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class FrameDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		// First Way with index
		driver.switchTo().frame(0);
		WebElement nameText = driver.findElement(By.id("name"));
		nameText.sendKeys("Ali Baba");
		Thread.sleep(2000);

		driver.switchTo().defaultContent();

		// second way with name or id
		driver.switchTo().frame("iframe_a");
		nameText.clear();
		nameText.sendKeys("Mustafa Kemal");
		Thread.sleep(2000);

		driver.switchTo().defaultContent();

		// third way by webelement
		WebElement frameElement = driver.findElement(By.xpath("//iframe[@name='iframe_a']"));
		driver.switchTo().frame(frameElement);
		nameText.clear();
		nameText.sendKeys("ATATUR");
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();

		tearDown();

	}

}
