package com.neotech.lesson07;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

public class NestedFrames extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.switchTo().frame("frame1");
		WebElement childframe = driver.findElement(By.xpath("//iframe[@srcdoc='<p>Child Iframe</p>']"));
		driver.switchTo().frame(childframe);
		WebElement p = driver.findElement(By.xpath("/html/body/p"));
		System.out.println("This is the chil frame texts : " + p.getText());

		Thread.sleep(2000);

		tearDown();

	}

}
