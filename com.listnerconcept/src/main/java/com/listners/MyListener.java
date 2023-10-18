package com.listners;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import com.utility.ScreenShot;

/**
 * ITestListener(I) ,you have to implement all methods here but in latest
 * version no need to implement here we want Screen shot on test failure,so we
 * use onTestFailure()
 * 
 */
public class MyListener implements ITestListener {

	public void onTestFailure(ITestResult result) {
		ScreenShot s = new ScreenShot();
		try {
			s.captureFullPageScreenshot(result.getMethod().getMethodName());
		} catch (IOException e) {

			e.printStackTrace();
		}

		// result.getMethod().getMethodName(); //gives Test case name

	}
}

//src/main/java=>com.listners=> MyListner
//src/main/java => com.utility=>ScreenShot
//src/test/java=> com.listner=> Listnerstest
//src/test/resources=>failed Test Screen shot