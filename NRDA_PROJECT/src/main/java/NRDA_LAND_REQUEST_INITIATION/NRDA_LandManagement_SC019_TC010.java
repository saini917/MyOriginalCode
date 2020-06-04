package NRDA_LAND_REQUEST_INITIATION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC019_TC010 extends CommonLibrary
{

	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement " Marked To".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//span[contains(text(),'Marked To')]")
	private WebElement markedto;

	public void verifyMarkedTo() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(markedto));
		Assert.assertTrue(markedto.isDisplayed());
		HighlightOnElement(markedto);
	}


}
