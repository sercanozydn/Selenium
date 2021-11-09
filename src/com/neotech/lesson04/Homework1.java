package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//HW1: Orange HRM Application Login:
//Open Chrome browser
//Go to https://opensource-demo.orangehrmlive.com/
//Enter valid username and password
//Click on login button
//Then verify that Welcome message is displayed.
//Quit the browser

public class Homework1 {

	public final static String url = "https://opensource-demo.orangehrmlive.com/";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
		WebElement login = driver.findElement(By.id("txtUsername"));
		login.sendKeys("Admin");
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.id("txtPassword"));
		password.sendKeys("admin123");
		Thread.sleep(1000);
		WebElement button = driver.findElement(By.id("btnLogin"));
		button.submit();
		
		
		
		Thread.sleep(10000);
		driver.quit();

	}

}
