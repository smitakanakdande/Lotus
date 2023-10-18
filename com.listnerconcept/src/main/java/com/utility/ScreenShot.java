package com.utility;

import java.awt.image.BufferedImage;


import java.io.File;
import java.io.IOException;

import java.util.Date;
import javax.imageio.ImageIO;

import com.allbase.BaseClass;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import java.time.LocalDateTime;


public class ScreenShot extends BaseClass {

	public void captureFullPageScreenshot(String fileName) throws IOException {
		
	   // String  SimpleDateFormat;  
		// Date currentTime = new Date();
	      //  System.out.println(currentTime);
	        

	      
	                LocalDateTime currentTime = LocalDateTime.now();
	                System.out.println(currentTime);
	            
	        
		


			AShot ashot = new AShot();
			BufferedImage img = ashot.shootingStrategy(ShootingStrategies.viewportPasting(2000)).takeScreenshot(driver)
					.getImage();

			String baseDir = System.getProperty("user.dir");
			ImageIO.write(img, "png",
					new File(baseDir + "/src/test/resources/FailedTestScreenShot/" + fileName+ "failed.png" ));

			// we save screen shot in src/test/resources=> create Folder by
			// FailedTestScreenShot
		}

	//private void captureElementFullPageScreenShot(WebElement ele) {

	}


	






       





		