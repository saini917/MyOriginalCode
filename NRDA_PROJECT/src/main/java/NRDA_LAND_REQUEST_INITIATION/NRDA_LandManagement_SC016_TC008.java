package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC016_TC008 extends CommonLibrary
{

	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement " Action date".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//span[contains(text(),'Action Date')]")
	private WebElement actiondate;

	public void verifyActionDate() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(actiondate));
		Assert.assertTrue(actiondate.isDisplayed());
		HighlightOnElement(actiondate);
	}


}
