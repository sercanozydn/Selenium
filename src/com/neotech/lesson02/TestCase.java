package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/newtours/");

		driver.findElement(By.linkText("REGISTER")).click();

		driver.findElement(By.name("firstName")).sendKeys("Sercan");
		driver.findElement(By.name("lastName")).sendKeys("Ozaydin");
		driver.findElement(By.name("phone")).sendKeys("123456");
		driver.findElement(By.id("userName")).sendKeys("sercanozydn@gmail.com");
		driver.findElement(By.name("submit")).click();

		Thread.sleep(5000);

		driver.close();

	}

}
