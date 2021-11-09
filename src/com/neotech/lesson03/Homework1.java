package com.neotech.lesson03;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String url = "http://demo.guru99.com/test/newtours/";
		driver.get(url);
		
		Thread.sleep(2000);
		driver.close();

	}

}
