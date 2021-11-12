package com.neotech.lesson08;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.neotech.utils.BaseClass;

/*
 * ==================  HW_1_Handling Multiple Windows =======================

1) Launch the browser and open the site " http://demo.guru99.com/popup.php "
2) Click on link "Click Here ".When the user clicks on the " Click Here " link, new child window opens.
3)On the Child Window, Enter your email ID and submit.
4) Then Access Credentials will be Displayed on submitted page. You will see the child window is open in new tab.
5) Close the Child window on which credentials are displayed.Switch to the parent window.
6) Quit all browsers
 */
public class Homework1 extends BaseClass {

	public static void main(String[] args) throws InterruptedException {

		setUp();

		WebElement clicktext = driver.findElement(By.linkText("Click Here"));
		clicktext.click();

		Set<String> winHandles = driver.getWindowHandles();

		Iterator<String> it = winHandles.iterator();

		String pWin = it.next();
		String cWin = it.next();
		
		driver.switchTo().window(cWin); 
		
		WebElement emailBox = driver.findElement(By.name("emailid"));
		emailBox.sendKeys("necipsercan@hotmail.com");
		Thread.sleep(2000);
		WebElement submitButton = driver.findElement(By.name("btnLogin"));
		submitButton.submit();
		Thread.sleep(2000);
		
		String user = driver.findElement(By.xpath("/html/body/table/tbody/tr[4]/td[2]")).getText();
		String pass = driver.findElement(By.xpath("/html/body/table/tbody/tr[5]/td[2]")).getText();
		
		System.out.println("the user name is "+user+" password is "+pass);
		
		driver.switchTo().window(pWin);
		Thread.sleep(3000);

		tearDown();

	}

}
