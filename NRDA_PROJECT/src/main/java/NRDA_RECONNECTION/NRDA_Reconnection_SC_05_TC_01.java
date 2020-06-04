package NRDA_RECONNECTION;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;

public class NRDA_Reconnection_SC_05_TC_01 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify dashboard".
	 * @author deepak.saini
	 * @since 2018-05-03
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a")
	private List<WebElement> label;
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div/div/div/div/div/div[@class='box-head']/div")
	private List<WebElement> label1;
	
	public void verifyDisplayLink()
	{
		Reporter.log("System will display the Following Links -->",true);
		for(WebElement link:label)
		{
			Assert.assertTrue(link.isDisplayed());
			HighlightOnElement(link);
			Reporter.log(link.getText(),true);
			
		}
	}
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
