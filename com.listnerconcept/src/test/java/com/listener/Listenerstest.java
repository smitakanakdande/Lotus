package com.listener;

import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.allbase.BaseClass;
import com.listners.MyListener;

@Listeners(MyListener.class)               //listners applied on class/project not for perticular method
public class Listenerstest extends BaseClass {

	@Test
	public void m1() {

		throw new ArrayIndexOutOfBoundsException();

	}

}

//here we make TC fail, bcoz listener takes screen shot only when TC fails
/*Go through this way..............
 * 
 //src/main/java=>com.listners=> MyListner
//src/main/java => com.utility=>ScreenShot
//src/test/java=> com.listner=> Listnerstest
//src/test/resources=>failed Test Screen shot
 
 */
