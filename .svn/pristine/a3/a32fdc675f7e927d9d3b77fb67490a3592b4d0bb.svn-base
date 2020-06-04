package LoginLogoutWSNRDAScript;

import org.apache.log4j.Logger;
import org.testng.annotations.BeforeMethod;
import GenericLibrary.BrowserDriver;
import GenericLibrary.ConstantI;


public class URLPageWSNRDAScript extends BrowserDriver
{

	Logger log=Logger.getLogger("devpinoyLogger");
	
	/*****************************************************************************************************************/
	/**
	 *  BeforeMethod annotation is used to open Url of application 
	 * 	@author deepak.saini
	 * @throws InterruptedException 
	 *  @since 2017-08-03 
	 */
	/****************************************************************************************************************/
	@BeforeMethod
	public void openBrowser()
	{
		BrowserDriver.getBrowser(ConstantI.browser).navigate().to(ConstantI.url);
		log.info("Step1: opening Application Website");
		log.info(" Step2: Deleting Browser Cookies");
		windowMaximize();
		log.info(" Step3: Maximize the Window");
	}

}
