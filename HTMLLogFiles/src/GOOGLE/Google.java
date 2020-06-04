package GOOGLE;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;

public class Google {
	static String chromeDriverKey ="webdriver.chrome.driver";
	static String chromeDriverPath = "C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\HTMLLogFiles\\Driver\\chromedriver_win32\\chromedriver.exe";
	static WebDriver driver;
	public static void main(String[] args) {
		
	    // Here we need to create logger instance so we need to pass Class name for 
	     //which  we want to create log file in my case Google is classname
	         Logger logger=Logger.getLogger("Google");
	        
	 
	       // configure log4j properties file
	       PropertyConfigurator.configure("Log4j.properties");
	 
	        // Open browser
	       System.setProperty(chromeDriverKey, chromeDriverPath);
	       driver = new ChromeDriver();
	        logger.info("Browser Opened");
	        
	        EventFiringWebDriver event1=new EventFiringWebDriver(driver);
		    ActivityCapture handle=new ActivityCapture();
		    event1.register(handle);
	      
	        // Set implicit wait
	        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	        logger.info("Implicit wait given");
	      
	 
	        // Load application
	        event1.navigate().to("https://www.google.co.in/");
	        logger.info("Url opened");
	        
	        event1.manage().window().maximize();
	        logger.info("Maximize the window");
	      
	 
	        // type Selenium
	        event1.findElement(By.name("q")).sendKeys("Selenium");
	        logger.info("keyword type");  
	        
	        event1.quit();
	        logger.info("window closed");
	        
	        event1.unregister(handle);
	        logger.info("End");
	    }

}
