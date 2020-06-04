package com.sikuliconcept;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleTest {
	public static WebDriver driver;
	public static WebDriverManager manager;
	static WebDriverWait wait;

	@SuppressWarnings("static-access")
	@Test
	public void googleTest() throws FindFailed {
		manager.chromedriver().version("2.40").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.google.com/");

		// create the object of the screen class -- sikuli
		Screen screen = new Screen();

		// setting icon:
		Pattern googleSearchImg = new Pattern("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\CoachingNotes\\signin.PNG");
		screen.wait(googleSearchImg, 2000);
		screen.click();
	}

}
