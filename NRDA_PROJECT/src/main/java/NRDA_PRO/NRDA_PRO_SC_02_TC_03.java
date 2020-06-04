package NRDA_PRO;

import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;

public class NRDA_PRO_SC_02_TC_03 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify public office relation".
	 * @author deepak.saini
	 * @since 2018-05-10
	 */
	/*****************************************************************************************************/


	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div/div[@id='inboxForm:dashBoard']/div/div[3]/div/div/div")
	private List<WebElement> label1;
	
	public void verifyStatisticsDisplayLink()
	{
		Reporter.log("Statistics count panel should be shown for -->",true);
		for(WebElement link:label1)
		{
			Assert.assertTrue(link.isDisplayed());
			HighlightOnElement(link);
			Reporter.log(link.getText(),true);
			
		}
	}
}
