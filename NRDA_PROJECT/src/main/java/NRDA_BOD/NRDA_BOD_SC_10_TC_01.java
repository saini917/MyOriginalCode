package NRDA_BOD;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;

public class NRDA_BOD_SC_10_TC_01 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify dashboard".
	 * @author deepak.saini
	 * @since 2018-04-10
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a")
	private List<WebElement> dashbaord;
	
	public void toVerifyDashboard() throws InterruptedException
	{
		Reporter.log("System will display the Following Link :",true);
		for(WebElement options:dashbaord)
		{
			HighlightOnElement(options);
			Assert.assertTrue(options.isDisplayed());
			String display=options.getText();
			Reporter.log(display,true);
		}
	}

}
