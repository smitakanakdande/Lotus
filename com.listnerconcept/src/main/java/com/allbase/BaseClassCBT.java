package com.allbase;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
//import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class BaseClassCBT {

	protected RemoteWebDriver driver;
	
    @Parameters("browser-name")
	@BeforeMethod
	public RemoteWebDriver setUp(String browserName) {
		if(browserName.equalsIgnoreCase("Chrome"))
		driver = new ChromeDriver();
		else if (browserName.equalsIgnoreCase("InternetExplorer"))
			driver = new InternetExplorerDriver();
		
		/*else if (browserName.equalsIgnoreCase("firefox"))
			driver= new FirefoxDriver();
		else if (browserName.equalsIgnoreCase("Safari"))
			driver= new SafariDriver()*/
		
		driver.get("https://www.myntra.com/");
		return driver;

	}

	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}