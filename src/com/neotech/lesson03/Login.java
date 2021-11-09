package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login {
	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		String url = "http://signal-telecom.net";
		driver.get(url);
		
		
		driver.findElement(By.linkText("Sign In")).click();
		driver.findElement(By.id("email")).sendKeys("roni_cost@example.com");
		driver.findElement(By.id("pass")).sendKeys("roni_cost3@example.com");
		driver.findElement(By.id("send2")).click();
		
		Thread.sleep(3000);
		driver.close();

	}
}
