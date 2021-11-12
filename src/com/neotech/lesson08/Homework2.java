package com.neotech.lesson08;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

/*
 * =================   HW_2_Handling Frames =================================

1) Launch the browser and open the site "https://chercher.tech/practice/frames-example-selenium-webdriver"
2) Verify on the page header "Not a Friendly Topic" displayed
3)Click on the Inner Frame Check box
4)Choose baby Cat from Animals dropdown
5)Quit the browser
 */

import com.neotech.utils.BaseClass;

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement topic = driver.findElement(By.xpath("//*[@id=\"page-top\"]/div[1]/div/div/div/div/label/span"));
		String text = topic.getText();
		System.out.println(text);

		if (text.equals("Not a Friendly Topic")) {
			System.out.println("The test is passed");
		} else {
			System.out.println("test is failed");
		}

		WebElement firtFrame = driver.findElement(By.xpath("//*[@id=\"frame1\"]"));
		driver.switchTo().frame(firtFrame);
		Thread.sleep(2000);

		WebElement secondFrame = driver.findElement(By.xpath("//*[@id=\"frame3\"]"));
		driver.switchTo().frame(secondFrame);

		WebElement checkBox = driver.findElement(By.xpath("//input[@id='a']"));
		checkBox.click();
		Thread.sleep(2000);
		
		driver.switchTo().defaultContent();
		
		WebElement thirBox = driver.findElement(By.xpath("//*[@id=\"frame2\"]"));
		driver.switchTo().frame(thirBox);
		
		Select sl = new Select(driver.findElement(By.id("animals")));
		sl.selectByIndex(1);
		Thread.sleep(2000);
		

		tearDown();

	}

}
