package com.neotech.lesson06;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class DropdownDemo extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		String user = ConfigsReader.getPropertyFromProp("AdminForOrange");
		String pass = ConfigsReader.getPropertyFromProp("PasswordForOrange");

		WebElement userbox = driver.findElement(By.id("txtUsername"));
		userbox.sendKeys(user);
		Thread.sleep(1000);

		WebElement passbox = driver.findElement(By.xpath("//input[@id='txtPassword']"));
		passbox.sendKeys(pass);
		Thread.sleep(1000);

		driver.findElement(By.id("btnLogin")).submit();
		Thread.sleep(1000);

		driver.findElement(By.xpath("//a[@id='menu_directory_viewDirectory']")).click();
		
		Thread.sleep(1000);
		WebElement ddDDTitle = driver.findElement(By.id("searchDirectory_job_title"));	
		Select selddTitle = new Select(ddDDTitle);
		
		selddTitle.selectByIndex(2);
		Thread.sleep(1000);
		
		selddTitle.selectByValue("8");
		Thread.sleep(1000);
		
		selddTitle.selectByVisibleText("Database Administrator");
		Thread.sleep(1000);
		
		List <WebElement> options = selddTitle.getOptions();
		System.out.println("the size of the list: "+options.size());
		for(int i = 0; i < options.size(); i++) {
			selddTitle.selectByIndex(i);
			Thread.sleep(1000);
		}
		
		
		tearDown();

	}

}
