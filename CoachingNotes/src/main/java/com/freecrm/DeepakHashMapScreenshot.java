package com.freecrm;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class DeepakHashMapScreenshot extends DeepakHashMapTest{
	//static WebDriver driver;

	public static void getScreenshot(String testMethodName){

		File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		try {
			FileUtils.copyFile(src,new File("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\CoachingNotes\\src\\main\\java\\com\\freecrm\\screenshot\\"
					                        +testMethodName+ "_" +".jpg"));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
