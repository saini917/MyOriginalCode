package com.utility;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.userTest.LoginUserInformationTest;

public class ScreenShotClass extends LoginUserInformationTest{

	public static void getScreenshot(String testMethodName) {
		File srcFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(srcFile,
					new File(System.getProperty("user.dir") + "\\ScreenShot\\" 
			                                    + testMethodName + ".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
