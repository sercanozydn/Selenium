package com.neotech.lesson04;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestBoxes {

	public final static String url = "http://demoqa.com/automation-practice-form";

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get(url);

		WebElement firstName = driver.findElement(By.xpath("//*[@id=\"firstName\"]"));
		firstName.sendKeys("Serjohn");
		Thread.sleep(2000);
		firstName.clear();
		Thread.sleep(2000);
		firstName.sendKeys("Sercan");
		Thread.sleep(2000);

		WebElement lastName = driver.findElement(By.cssSelector("input#lastName"));
		lastName.sendKeys("Ozay");
		Thread.sleep(2000);
		lastName.sendKeys("din");
		Thread.sleep(2000);

		String idAttributeValue = firstName.getAttribute("id");
		System.out.println("First Name id attirbute value is --> " + idAttributeValue);

		String classAttbt = lastName.getAttribute("class");
		System.out.println("Last name class attibute value is --> " + classAttbt);

		String browserTitle = driver.getTitle();
		System.out.println(browserTitle);

		Thread.sleep(2000);
		driver.quit();

	}

}
