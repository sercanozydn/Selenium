package com.neotech.lesson10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;
import com.neotech.utils.ConfigsReader;

public class DynamicTable extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		driver.findElement(By.id("txtUsername")).sendKeys(ConfigsReader.getPropertyFromProp("AdminForOrange"));
		Thread.sleep(1000);
		driver.findElement(By.id("txtPassword")).sendKeys(ConfigsReader.getPropertyFromProp("PasswordForOrange"));
		Thread.sleep(1000);
		driver.findElement(By.id("btnLogin")).click();
		Thread.sleep(1000);

		driver.findElement(By.id("menu_pim_viewPimModule")).click();

		String expecName = "Charlie";

		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr"));
		for (int i = 0; i < rows.size(); i++) {
			String rowText = rows.get(i).getText();

			if (rowText.contains(expecName)) {

				List<WebElement> firstColum = driver
						.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td[1]"));
				firstColum.get(i).click();
				break;

			}
		}

		Thread.sleep(5000);

		tearDown();

	}

}
