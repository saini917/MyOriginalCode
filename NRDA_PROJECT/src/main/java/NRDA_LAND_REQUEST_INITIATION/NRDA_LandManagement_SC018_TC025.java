package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC018_TC025 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close map".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='inboxForm:Dlg']/div/a/span")
	private WebElement close;
	
	public void closePopUp() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(close));
		Assert.assertTrue(close.isDisplayed());
		HighlightOnElement(close);
		Assert.assertTrue(close.isEnabled());
		close.click();
		waitForSomeTime();
		waitForSomeTime();	
	}

}
