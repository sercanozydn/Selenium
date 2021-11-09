package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LogonCSSSelectorDemo {

	public final static String url = "http://signal-telecom.net";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
		driver.findElement(By.cssSelector("li.authorization-link")).click();
		driver.findElement(By.cssSelector("input#email")).sendKeys("roni_cost@example.com");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("roni_cost3@example.com");
		driver.findElement(By.cssSelector("button[id='send2']")).submit();
		
		Thread.sleep(3000);
		driver.close();
		
		

	}

}
