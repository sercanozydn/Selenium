package com.neotech.lesson09;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

/*
 * Homework 2: (try to use FluentWait)
        Add Employee
        Open chrome browser
        Go to “https://opensource-demo.orangehrmlive.com/”
        Login into the application
        Click on PIM>Add Employee
        Add Employee
        Log out 
        Quit the browser
 */

public class Homework2 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getPropertyFromProp("AdminForOrange"));
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getPropertyFromProp("PasswordForOrange"));
		driver.findElement(By.id("btnLogin")).submit();
		Thread.sleep(2000);

		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("btnAdd")).click();

		driver.findElement(By.id("firstName")).sendKeys("Sercan");
		driver.findElement(By.id("middleName")).sendKeys("neco");
		driver.findElement(By.id("lastName")).sendKeys("oz");
		Thread.sleep(1000);

		WebElement eid = driver.findElement(By.id("employeeId"));
		eid.clear();
		Thread.sleep(1000);
		eid.sendKeys("1903");
		Thread.sleep(1000);

		driver.findElement(By.id("btnSave")).submit();
		Thread.sleep(1000);

		WebElement selBox = driver.findElement(By.id("welcome"));
		selBox.click();
		Thread.sleep(1000);

		driver.findElement(By.linkText("Logout")).click();
		Thread.sleep(1000);

		tearDown();

	}

}
