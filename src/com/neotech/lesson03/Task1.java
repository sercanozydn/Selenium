package com.neotech.lesson03;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task1 {

	public final static String url = "http://www.facebook.com";
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sercanozydn@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("20142973nso");
		driver.findElement(By.name("login")).click();
		
		Thread.sleep(5000);
		driver.close();
		
		

	}

}
