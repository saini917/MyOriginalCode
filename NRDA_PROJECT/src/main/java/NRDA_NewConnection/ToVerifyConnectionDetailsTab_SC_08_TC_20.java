package NRDA_NewConnection;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;


public class ToVerifyConnectionDetailsTab_SC_08_TC_20 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "MAP".
	 * @author deepak saini
	 * @since 06-01-2018
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div/div/center/table/tbody/tr/td/a/span[contains(text(),'View Property Map')]")
	private WebElement map;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close pop up".
	 * @author deepak saini
	 * @since 06-01-2018
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Dlg']/div/a/span")
	private WebElement closepopup;
	
	public void clickOnMap() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(map));
		wait.until(ExpectedConditions.elementToBeClickable(map));
		Assert.assertTrue(map.isDisplayed());
		HighlightOnElement(map);
		Assert.assertTrue(map.isEnabled());
		map.click();
		Reporter.log("Click on Property Map link",true);
		waitForSomeTime();
		Reporter.log("User should be able to view the Map",true);
		
		wait.until(ExpectedConditions.visibilityOf(closepopup));
		wait.until(ExpectedConditions.elementToBeClickable(closepopup));
		Assert.assertTrue(closepopup.isDisplayed());
		HighlightOnElement(closepopup);
		Assert.assertTrue(closepopup.isEnabled());
		closepopup.click();
		waitForSomeTime();
	}

}

