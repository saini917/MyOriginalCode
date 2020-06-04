package GenericLibrary;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.Reporter;

/**
 * @author deepak.saini
 *
 */
public class BrowserDriver extends WebdriverCommonDriverLibrary implements ConstantInstanceDriver
{
	//-------------------------browser driver Keys and browser driver paths declaration----------------
	static String chromeDriverKey ="webdriver.chrome.driver";
	static String chromeDriverPath = "C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\main\\resources\\chromedriver2.exe";

	static String IE_DriverKey ="webdriver.ie.driver";
	static String IE_DriverPath = "C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\main\\resources\\IEDriverServer.exe";

	static String firefoxDriverKey ="webdriver.gecko.driver";
	static String firefoxDriverPath = "C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\main\\resources\\geckodriver.exe";
	//-------------------------------------------------------------------------------------------------

/***********************************************************************************************************************************/
	/*
	 * getbrowser() is used to get the browser instance form the constant interface
	 * and launch according to the defined variable name in the Constant interface
	 * @param browser
	 * @return
	 * @author deepak.saini
	 * @since 2017-06-14
	 */
/************************************************************************************************************************************/
	public static WebDriver getBrowser(String browsertype)
	{	
		switch (browsertype)
		{
		case "firefox":
		System.setProperty(firefoxDriverKey, firefoxDriverPath);
		driver=new FirefoxDriver();
		deleteAllCookies();
		windowMaximize();
		break;
		
		case "chrome":
		System.setProperty(chromeDriverKey,chromeDriverPath);
		driver=new ChromeDriver();
		deleteAllCookies();
		windowMaximize();
		break;
		
		case "IE":
		System.setProperty(IE_DriverKey, IE_DriverPath);
		driver=new InternetExplorerDriver();
		deleteAllCookies();
		windowMaximize();
		break;
		
		default:
		Reporter.log("browser : " + browsertype + " is invalid, Launching Firefox as browser of choice..");
		driver = new ChromeDriver();
		}
		return driver;
		}

}

