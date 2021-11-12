package com.neotech.lesson08;

import java.util.concurrent.TimeUnit;

import com.neotech.utils.BaseClass;

public class Task1 extends BaseClass {

	public static void main(String[] args) {
		
		setUp();
		
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		
		
		tearDown();

	}

}
