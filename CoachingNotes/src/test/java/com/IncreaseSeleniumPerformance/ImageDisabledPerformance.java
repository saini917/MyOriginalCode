package com.IncreaseSeleniumPerformance;

import java.util.HashMap;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImageDisabledPerformance {
	public static WebDriver driver;
	public static WebDriverManager manager;

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		/*
		 * manager.chromedriver().version("2.40").setup(); ChromeOptions options
		 * = new ChromeOptions(); disableImageChrome(options);
		 * 
		 * driver = new ChromeDriver(options);
		 */

		manager.firefoxdriver().arch64().version("0.23.0").setup();
		FirefoxOptions options = new FirefoxOptions();
		disableImageFirefox(options);
		driver = new FirefoxDriver();
		driver.get("http://www.amazon.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());

	}

	public static void disableImageChrome(ChromeOptions options) {
		HashMap<String, Object> images = new HashMap<String, Object>();
		images.put("images", 2);

		HashMap<String, Object> prefs = new HashMap<String, Object>();
		prefs.put("profile.default_content_setting_values", images);
		options.setExperimentalOption("prefs", prefs);

	}

	public static void disableImageFirefox(FirefoxOptions options) {
		FirefoxProfile profile = new FirefoxProfile();
		profile.setPreference("permissions.defalut.image", 2);
		options.setProfile(profile);
		options.setCapability(FirefoxDriver.PROFILE, profile);

	}

}
