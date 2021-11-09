package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Task {
	public final static String url = "http://www.facebook.com";
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get(url);
		
		//driver.findElement(By.xpath("//*[@id=\"email\"]")).sendKeys("sercanozydn@gmail.com");
		driver.findElement(By.cssSelector("input #email")).sendKeys("sercanozydn@gmail.com");
		//driver.findElement(By.xpath("//*[@id=\"pass\"]")).sendKeys("20142973nso");
		driver.findElement(By.cssSelector("input[id='pass']")).sendKeys("20142973nso");
		//driver.findElement(By.name("login")).click();
		driver.findElement(By.cssSelector("button[name='login']")).click();
		
		Thread.sleep(5000);
		driver.close();

	}

}
