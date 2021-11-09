package com.neotech.lesson04;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

//Radio Button Practice  
//Open chrome browser
//Go to “https://demoqa.com/radio-button” 
//Verify if all radio buttons are displayed and clickable
//Click on all radio buttons 
//Verify radio buttons has been clicked successfully
//Quit the browser

public class Homework2 {

	public final static String url = "https://demoqa.com/radio-button";

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);
		
		List<WebElement> rb = driver.findElements(By.xpath("//input[@type='radio']"));
		for(WebElement element : rb) {
			if (element.isEnabled()) {
				System.out.println("It is enable");
			}else {
				System.out.println("It is not enable");
			}
		}
		
		
		driver.quit();

	}
}
