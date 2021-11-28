package com.neotech.lesson10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

/*
 * ==================  Lesson 09 HW 1 =======================

1)Open chrome browser
2)Go to "http://secure.smartbearsoftware.com/samples/testcomplete11/WebOrders/login.aspx"
3)Login to the application
4)Verify customer "Susan McLaren" is present in the table
5)Click on customer details
6)Update customers last name and credit card info
7)Verify updated customers name and credit card number is displayed in table
8Close browser
 */
public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		String user = ConfigsReader.getPropertyFromProp("username");
		String pass = ConfigsReader.getPropertyFromProp("password");

		WebElement username = driver.findElement(By.id("ctl00_MainContent_username"));
		username.sendKeys(user);
		Thread.sleep(1000);
		WebElement password = driver.findElement(By.id("ctl00_MainContent_password"));
		password.sendKeys(pass);
		Thread.sleep(1000);
		driver.findElement(By.id("ctl00_MainContent_login_button")).click();

		driver.findElement(By.xpath("//*[@id=\"ctl00_MainContent_orderGrid\"]/tbody/tr[6]/td[13]/input")).click();
		Thread.sleep(2000);

		WebElement name = driver.findElement(By.id("ctl00_MainContent_fmwOrder_txtName"));
		name.clear();
		name.sendKeys("Susan Yellow");
		Thread.sleep(1000);

		WebElement credit = driver.findElement(By.id("ctl00_MainContent_fmwOrder_TextBox6"));
		credit.clear();
		credit.sendKeys("111111111111111111111111");
		Thread.sleep(1000);

		driver.findElement(By.id("ctl00_MainContent_fmwOrder_UpdateButton")).click();
		Thread.sleep(3000);

		tearDown();

	}

}
