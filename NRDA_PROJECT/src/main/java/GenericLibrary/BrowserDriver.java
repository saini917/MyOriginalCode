package GenericLibrary;

import java.util.Hashtable;
import java.util.Map;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Reporter;

/**
 * @author deepak.saini
 *
 */
public class BrowserDriver extends CommonLibrary implements ConstantI {
	// -------------------------browser driver Keys and browser driver paths
	// declaration----------------
	static String chromeDriverKey = "webdriver.chrome.driver";
	static String chromeDriverPath = "C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\main\\resources\\chromedriver2.exe";

	static String IE_DriverKey = "webdriver.ie.driver";
	static String IE_DriverPath = "C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\main\\resources\\IEDriverServer.exe";

	static String firefoxDriverKey = "webdriver.gecko.driver";
	static String firefoxDriverPath = "C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\main\\resources\\geckodriver.exe";

	static String DownloadPDF = "C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\DownloadFile";

	// -------------------------------------------------------------------------------------------------

	/***********************************************************************************************************************************/
	/*
	 * getbrowser() is used to get the browser instance form the constant
	 * interface and launch according to the defined variable name in the
	 * Constant interface
	 * 
	 * @param browser
	 * 
	 * @return
	 * 
	 * @author deepak.saini
	 * 
	 * @since 2017-06-14
	 */
	/************************************************************************************************************************************/
	public static WebDriver getBrowser(String browsertype) {
		switch (browsertype) {
		case "firefox":
			System.setProperty(firefoxDriverKey, firefoxDriverPath);
			driver = new FirefoxDriver();
			deleteAllCookies();
			windowMaximize();
			break;

		case "chrome":

			Map<String, Object> chromepref = new Hashtable<String, Object>();
			chromepref.put("profile.default_content_settings.popups", 0);
			chromepref.put("download.prompt_for_download", "false");
			chromepref.put("download.default_directory", DownloadPDF);

			ChromeOptions options = new ChromeOptions();
			options.setExperimentalOption("prefs", chromepref);

			DesiredCapabilities capability = DesiredCapabilities.chrome();
			capability.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			capability.setCapability(ChromeOptions.CAPABILITY, options);
			System.setProperty(chromeDriverKey, chromeDriverPath);
			driver = new ChromeDriver(capability);

			/*
			 * System.setProperty(chromeDriverKey, chromeDriverPath); driver =
			 * new ChromeDriver(); deleteAllCookies();
			 */
			windowMaximize();
			break;

		case "IE":
			System.setProperty(IE_DriverKey, IE_DriverPath);
			driver = new InternetExplorerDriver();
			deleteAllCookies();
			windowMaximize();
			break;

		default:
			Reporter.log("browser : " + browsertype + " is invalid, Launching Chrome as browser of choice..");
			driver = new ChromeDriver();
		}
		return driver;
	}

}
