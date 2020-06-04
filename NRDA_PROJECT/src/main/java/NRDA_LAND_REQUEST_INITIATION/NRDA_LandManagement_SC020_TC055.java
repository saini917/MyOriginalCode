package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC020_TC055 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "govt transfer letter".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//button/span[contains(text(),'GovtTransfer Letter')]")
	private WebElement govttransferletter;
	
	public void clickOnGovtTransferLetter() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(govttransferletter));
		Assert.assertTrue(govttransferletter.isDisplayed());
		HighlightOnElement(govttransferletter);
		Assert.assertTrue(govttransferletter.isEnabled());
		govttransferletter.click();
		waitForSomeTime();
		waitForSomeTime();
	}

}
