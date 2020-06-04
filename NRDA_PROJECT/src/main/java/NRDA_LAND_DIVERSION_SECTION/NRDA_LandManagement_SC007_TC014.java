package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC007_TC014 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "open map".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//span[contains(text(),'Open Map')]")
	private WebElement openmap;
	
	public void clickOnOpenMap() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(openmap));
		Assert.assertTrue(openmap.isDisplayed());
		HighlightOnElement(openmap);
		Assert.assertTrue(openmap.isEnabled());
		openmap.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	
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
		waitForSomeTime();
	}


}
