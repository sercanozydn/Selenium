package com.neotech.lesson12;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.neotech.utils.CommonMethods;

public class Homework2 extends CommonMethods {

	/*
	 * Homework 1: Leave List Search Validation
	 * 
	 * 1. Open chrome browser 2. Go to https://opensource-demo.orangehrmlive.com/ 3.
	 * Login into the application 4. Select Leave List 5. Select from July 1, 2021
	 * until August 31, 2020 6. Check only "Scheduled" 7. Click on Search 8.
	 * Validate "No Records Found" is displayed 9. Quit the browser
	 */

	public static void main(String[] args) {

		setUp();

		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		wait(1);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		wait(1);
		driver.findElement(By.id("btnLogin")).click();
		wait(1);

		WebElement leaveList = driver.findElement(By.xpath("//table[@class='quickLaungeContainer']/tbody/tr/td[2]"));
		leaveList.click();
		wait(1);

		WebElement from = driver.findElement(By.id("calFromDate"));
		from.click();
		wait(1);

		WebElement fromYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		String expectedYear = "2020";

		Select selectYear = new Select(fromYear);
		List<WebElement> YearOption = selectYear.getOptions();

		for (WebElement yearEl : YearOption) {
			String actualYear = yearEl.getText();
			if (expectedYear.equals(actualYear)) {
				yearEl.click();
				break;
			}
		}

		WebElement months = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		String expectedMonth = "Aug";

		Select select = new Select(months);
		List<WebElement> MonOption = select.getOptions();

		for (WebElement monthEl : MonOption) {

			String actualMonth = monthEl.getText();
			if (expectedMonth.equals(actualMonth)) {
				monthEl.click();
				break;
			}
		}

		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr[6]/td[1]")).click();
		wait(2);

		driver.findElement(By.id("calToDate")).click();
		String toExpectedYear = "2021";
		WebElement toYear = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select selectToYear = new Select(toYear);

		List<WebElement> toYearOptions = selectToYear.getOptions();

		for (WebElement toYearEl : toYearOptions) {
			String toYearActual = toYearEl.getText();
			if (toExpectedYear.equals(toYearActual)) {
				toYearEl.click();
				break;
			}
		}

		WebElement tomonth = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		selectDropdown(tomonth, "Jul");

		driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td[4]")).click();
		wait(2);

		driver.findElement(By.id("leaveList_chkSearchFilter_1")).click();
		wait(1);
		driver.findElement(By.id("leaveList_chkSearchFilter_2")).click();
		wait(1);
		driver.findElement(By.id("btnSearch")).click();
		wait(1);

		WebElement lastText = driver.findElement(By.xpath("//table[@id=\"resultTable\"]/tbody/tr/td"));
		System.out.println(lastText.getText());

		wait(3);

		tearDown();

	}

}
