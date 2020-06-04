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

public class YouTubeVideoTest {
	public static WebDriver driver;
	public static WebDriverManager manager;
	static WebDriverWait wait;

	@SuppressWarnings("static-access")
	@Test
	public void youtubeTest() throws FindFailed {
		manager.chromedriver().version("2.40").setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		driver.get("https://www.youtube.com/watch?v=OtQAMoXYqes&list=PLFGoYjJG_fqo4oVsa6l_V-_7-tzBnlulT&index=22");

		// create the object of the screen class -- sikuli
		Screen screen = new Screen();

		// setting icon:
		Pattern settingImg = new Pattern("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\CoachingNotes\\setting.PNG");
		screen.wait(settingImg, 2000);
		screen.click();
		screen.click();
		screen.click();

		// Auto icon:
		Pattern autoImg = new Pattern("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\CoachingNotes\\Auto.PNG");
		screen.wait(autoImg, 2000);
		screen.click();
		screen.click();
		screen.click();

		// 144p icon:
		Pattern pImg = new Pattern("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\CoachingNotes\\144p.PNG");
		screen.wait(pImg, 2000);
		screen.click();
		screen.click();
		screen.click();

		// pause icon:
		/*Pattern pauseImg = new Pattern("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\CoachingNotes\\pause.PNG");
		screen.wait(pauseImg, 2000);
		screen.click();
		screen.click();*/

		// play icon:
		/*Pattern playImg = new Pattern("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\CoachingNotes\\play.PNG");
		screen.wait(playImg, 2000);
		screen.click();
		screen.click();*/
	}

}
