package com.neotech.lesson02;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

//HW1: Amazon Page Title Verification: 
//Open chrome browser
//Go to “https://www.amazon.com/”
//Verify Title “Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more” is displayed
//End the Session (close the browser).

public class Homework1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.amazon.com/");
		
		String actualTitle = driver.getTitle();
		String expectedTitle = "Amazon.com: Online Shopping for Electronics, Apparel, Computers, Books, DVDs & more";
		
		System.out.println("Actual title : "+actualTitle);
		System.out.println("Expected title : "+expectedTitle);
		
		if (actualTitle == expectedTitle) {
			System.out.println("Test passed");
		}else {
			System.out.println("Test failed");
		}
				
	    Thread.sleep(3000);
		
		driver.close();
		
		 

	}

}
