package com.neotech.lesson02;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys("sercanozydn@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("20142973nso");
		
		driver.findElement(By.name("login")).click();
		
		Thread.sleep (7000);
		
		driver.close();

	}

}
