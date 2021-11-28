package com.neotech.lesson08;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.BaseClass;

/*
 * ================== HW_3 Overall Practice of WebElements and handling Windows,Alerts ======

1) Launch the browser and open the site "https://www.tutorialspoint.com/selenium/selenium_automation_practice"
2) Fill in the all text boxes, Choose your preferred radio button, check box and drop down option 
   EXCEPT Profile Picture(Dissmiss this Section)
3) Click on the Button and you will see an Alert pops up then click Ok
4) When user clicks on Ok new Window will open then get All window handles and get the size and Quit all of them
 */

public class Homework3 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement firstName = driver
				.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/form/table/tbody/tr[1]/td[2]/input"));
		firstName.sendKeys("Sercan");

		WebElement lastName = driver.findElement(By.name("lastname"));
		lastName.sendKeys("oz");

		WebElement genderRatioBotton = driver
				.findElement(By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/form/table/tbody/tr[3]/td[2]/input[1]"));
		genderRatioBotton.click();

		WebElement exRatioBotton = driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/form/table/tbody/tr[4]/td[2]/span[2]/input"));
		exRatioBotton.click();

		WebElement date = driver
				.findElement(By.xpath("//html/body/div[1]/div/div[2]/div[4]/div/form/table/tbody/tr[5]/td[2]/input"));
		date.sendKeys("Monday");

		WebElement prof = driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/form/table/tbody/tr[6]/td[2]/span[2]/input"));
		prof.click();

		WebElement selenium = driver.findElement(
				By.xpath("/html/body/div[1]/div/div[2]/div[4]/div/form/table/tbody/tr[8]/td[2]/span[3]/input"));
		selenium.click();

		WebElement continents = driver.findElement(By.xpath("//select[@name='continents']"));
		Select selCon = new Select(continents);

		selCon.selectByIndex(5);

		WebElement command = driver.findElement(By.xpath("//select[@name='selenium_commands']"));
		Select comSel = new Select(command);

		comSel.selectByVisibleText("WebElement Commands");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@name='submit']")).click();
		Thread.sleep(2000);
		Alert alertBox = driver.switchTo().alert();
		alertBox.accept();

		Thread.sleep(3000);

		tearDown();

	}

}
