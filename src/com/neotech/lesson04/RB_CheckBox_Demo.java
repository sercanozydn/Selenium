package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RB_CheckBox_Demo {
	public final static String url = "http://demoqa.com/automation-practice-form";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		List<WebElement> ratiobottons = driver.findElements(By.cssSelector("label[for^='gender-radio']"));

		for (WebElement element : ratiobottons) {
			element.click();
			Thread.sleep(1000);
		}

		List<WebElement> checkBox = driver.findElements(By.xpath("//label[contains(@for,'hobbies-checkbox')]"));
		for (WebElement element : checkBox) {
			element.click();
			Thread.sleep(1000);
		}

		Thread.sleep(2000);
		driver.quit();

	}

}
