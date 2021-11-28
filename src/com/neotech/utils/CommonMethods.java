 package com.neotech.utils;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.NoSuchFrameException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.UnexpectedTagNameException;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CommonMethods extends BaseClass {

	public static void sendText(WebElement element, String text) {
		element.clear();
		element.sendKeys(text);
	}

	public static void clickRatioOrCheckbox(List<WebElement> listElement, String value) {

		String actualValue;

		for (WebElement el : listElement) {
			actualValue = el.getAttribute("value").trim();
			if (el.isEnabled() && actualValue.equals(value)) {
				el.click();
				break;
			}
		}
	}

	public static void wait(int seconds) {

		try {
			Thread.sleep(seconds * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public static void selectDropdown(WebElement element, String textToSelect) {

		try {

			Select select = new Select(element);

			List<WebElement> options = select.getOptions();

			for (WebElement el : options) {
				if (el.getText().equals(textToSelect)) {
					select.selectByVisibleText(textToSelect);
					break;
				}
			}
		}

		catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}

	}

	public static void selectDropdown(WebElement element, int index) {

		try {

			Select select = new Select(element);
			int size = select.getOptions().size();

			if (size > index) {
				select.selectByIndex(index);
			}

		} catch (UnexpectedTagNameException e) {
			e.printStackTrace();
		}
	}

	public static void acceptAlert() {
		
		try {
		Alert alert = driver.switchTo().alert();
		alert.accept();
		}
		catch(NoAlertPresentException e) {
			e.printStackTrace();
		}
	}
		
        public static void dismissAlert() {
		
		try {
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		}
		catch(NoAlertPresentException e) {
			e.printStackTrace();
		}
	}
        
        public static String getAlertText() {
    		
        	String text = null;
        	
    		try {
    		Alert alert = driver.switchTo().alert();
    		text = alert.getText();
    		}
    		catch(NoAlertPresentException e) {
    			e.printStackTrace();
    		}
    		return text;
    	}
        
        public static void sendAlertText(String text) {
    		
    		try {
    		Alert alert = driver.switchTo().alert();
    		alert.sendKeys(text);
    		}
    		catch(NoAlertPresentException e) {
    			e.printStackTrace();
    		}
    	}
        
        /**
    	 * This method will method will switch to a frame using name or id. It will also
    	 * handle the NoSuchFrameException.
    	 * 
    	 * @param nameOrId
    	 */
    	public static void switchToFrame(String nameOrId) {
    		try {
    			driver.switchTo().frame(nameOrId);
    		} catch (NoSuchFrameException e) {
    			e.printStackTrace();
    		}
    	}

    	/**
    	 * This method will switch to a frame using an index. It will also handle the
    	 * NoSuchFrameException.
    	 * 
    	 * 
    	 * @param index
    	 */
    	public static void switchToFrame(int index) {
    		try {
    			driver.switchTo().frame(index);
    		} catch (NoSuchFrameException e) {
    			e.printStackTrace();
    		}
    	}

    	/**
    	 * This method will switch to a frame using a web element. It will also handle
    	 * the NoSuchFrameException.
    	 * 
    	 * @param element
    	 */
    	public static void switchToFrame(WebElement element) {
    		try {

    			driver.switchTo().frame(element);
    		} catch (NoSuchFrameException e) {
    			e.printStackTrace();
    		}
    	}

    	/**
    	 * This method creates a WebDriverWait object and returns it.
    	 * 
    	 * @return
    	 */
    	public static WebDriverWait getWaitObject() {
    		WebDriverWait wait = new WebDriverWait(driver, Constants.EXPLICIT_WAIT_TIME);

    		return wait;
    	}

    	/**
    	 * This method will implement an explicit wait on an element.
    	 * 
    	 * @param element
    	 * @return
    	 */
    	public static WebElement waitForClickability(WebElement element) {
    		return getWaitObject().until(ExpectedConditions.elementToBeClickable(element));
    	}

    	/**
    	 * This method will wait for an element to be visible.
    	 * 
    	 * @param element
    	 * @return
    	 */
    	public static WebElement waitForVisibility(WebElement element) {
    		return getWaitObject().until(ExpectedConditions.visibilityOf(element));
    	}

	
}
