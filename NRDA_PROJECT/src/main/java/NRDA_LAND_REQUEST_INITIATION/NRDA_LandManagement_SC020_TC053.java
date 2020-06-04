package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC020_TC053 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "download letter".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//a[contains(text(),'Download Letters')]")
	private WebElement downloadletter;
	
	public void clickOnDownloadLetter() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(downloadletter));
		Assert.assertTrue(downloadletter.isDisplayed());
		HighlightOnElement(downloadletter);
		Assert.assertTrue(downloadletter.isEnabled());
		downloadletter.click();
		waitForSomeTime();
	}

}
