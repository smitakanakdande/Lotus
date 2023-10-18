package com.allbase;

import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


public class BaseClass {
	public static RemoteWebDriver driver;

	@BeforeMethod
	public RemoteWebDriver setUp() {
		driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		return driver;

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}