package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

public class FacebookTask extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();
		
		WebElement month = driver.findElement(By.id("month"));
		WebElement day = driver.findElement(By.id("day"));
		WebElement year = driver.findElement(By.id("year"));
		
		Select selectMonth = new Select(month);
		Select selectDay = new Select(day);
		Select selectYear = new Select(year);
		
		List <WebElement> listOfMonth = selectMonth.getOptions();
		List <WebElement> listOfDay = selectDay.getOptions();
		List <WebElement> listOfYear = selectYear.getOptions();

		selectMonth.selectByValue("10");
		Thread.sleep(2000);
		selectDay.selectByIndex(13);
		Thread.sleep(2000);
		selectYear.selectByVisibleText("1992");
		Thread.sleep(2000);
		
		tearDown();

	}
}
