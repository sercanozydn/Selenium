package com.neotech.lesson10;
/*
 * =================   Lesson 09 HW 2 =================================
(Includes Dynamic Table therefore optional)
TC: Delete Employee

1)Open chrome browser
2)Go to "https://opensource-demo.orangehrmlive.com/"
3)Login into the application
4)Click On PIM>Add Employee
5)Add Employee
6)Go to Employee List
7)Verify Employee has been added
8)Delete added Employee
9)Quit the browser
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class Homework2 extends BaseClass{

	public static void main(String[] args) throws InterruptedException {
		
		setUp();
		
		String user = ConfigsReader.getPropertyFromProp("AdminForOrange");
		String pass = ConfigsReader.getPropertyFromProp("PasswordForOrange");
		
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("menu_pim_addEmployee")).click();
		Thread.sleep(2000);

		WebElement firstName = driver.findElement(By.id("firstName"));
		firstName.sendKeys("Sercan");
		Thread.sleep(1000);
		
		WebElement lastName = driver.findElement(By.id("lastName"));
		lastName.sendKeys("Oz");
		Thread.sleep(1000);
		
		WebElement id = driver.findElement(By.id("employeeId"));
		id.sendKeys("1222");
		
		driver.findElement(By.id("btnSave")).click();
		
		
		tearDown();

	}

}
