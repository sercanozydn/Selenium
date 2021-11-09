package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

//HW2: Opening Page on Firefox Browser
//Open Firefox browser
//Navigate to “https://www.redfin.com/”
//Verify that you have navigated to (https://www.redfin.com/)
//End the Session (close the browser).

public class Homework2 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");

		WebDriver dr = new FirefoxDriver();

		String url = "https://www.redfin.com/";

		dr.get(url);

		String actualurl = dr.getCurrentUrl();

		if (actualurl.equalsIgnoreCase(url)) {
			System.out.println("Test is passed");
		} else {
			System.out.println("Test failed");
		} 

		Thread.sleep(2000);

		dr.close();

	}

}
