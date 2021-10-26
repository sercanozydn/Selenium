package com.neotech.lesson01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeBrowser {

	public static void main(String[] args) throws InterruptedException {

		// type of driver where the driver located
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		WebDriver driver2 = new ChromeDriver();

		driver.get("https://www.google.com/");
		driver2.get("https://www.amazon.com/");

		String url = driver.getCurrentUrl();
		String title = driver.getTitle();
		
		String url2 = driver2.getCurrentUrl();
		String title2 = driver2.getTitle();

		System.out.println("Url is: "+url);
		System.out.println("Title is: "+title);
		
		System.out.println("");
		
		System.out.println("Url is: "+url2);
		System.out.println("Title is: "+title2);


		Thread.sleep(4000);

		driver.close();
		driver2.close();

	}

}
