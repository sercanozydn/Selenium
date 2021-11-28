package com.neotech.lesson13;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

import com.neotech.utils.CommonMethods;

public class Homework1 extends CommonMethods {

	/*
	 * Homework 1: Go to url: https://opensource-demo.orangehrmlive.com Log in using
	 * our custom methods Go to PIM menu Add an employee Go to Employee List Get the
	 * list of the employees (Using tables - tr and td) Loop to search for the
	 * employee you added When you find the employee - click on it. Take a
	 * screenshot
	 */
	public static void main(String[] args) {

		setUp();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		wait(1);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		wait(1);
		driver.findElement(By.id("btnLogin")).click();
		wait(1);

		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		wait(1);

		driver.findElement(By.id("menu_pim_addEmployee")).click();
		wait(1);

		WebElement firstName = driver.findElement(By.id("firstName"));
		sendText(firstName, "Sercan");
		wait(1);
		WebElement lastName = driver.findElement(By.id("lastName"));
		sendText(lastName, "oz");
		wait(1);
		WebElement employeeId = driver.findElement(By.id("employeeId"));
		sendText(employeeId, "0005");
		wait(1);
		WebElement btnSave = driver.findElement(By.id("btnSave"));
		btnSave.click();
		wait(1);
		WebElement empList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
		empList.click();
		wait(1);
		String actualName = "Sercan";

		int rowSize = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr")).size();

		for (int i = 1; i <= rowSize; i++) {
			WebElement list = driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr[" + i + "]/td[3]/a"));
			String expectedName = list.getText();
			if (actualName.equals(expectedName)) {
				list.click();
				break;
			}
		}
		wait(2);
		TakesScreenshot ss = (TakesScreenshot) driver;
		File source = ss.getScreenshotAs(OutputType.FILE);

		try {
			FileUtils.copyFile(source, new File("ScreenShot/screenshot_3.png"));
		} catch (IOException e) {

			e.printStackTrace();
		}

		wait(2);
		tearDown();

	}

}
