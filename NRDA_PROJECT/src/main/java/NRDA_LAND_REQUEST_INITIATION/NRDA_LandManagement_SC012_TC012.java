package NRDA_LAND_REQUEST_INITIATION;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC012_TC012 extends CommonLibrary
{

	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement " Action link".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//form[@id='inboxForm']/div/div/div/div/div/div/div/div/table/tbody/tr/td/center/a/img")
	private WebElement action;

	public void clickOnAction() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(action));
		Assert.assertTrue(action.isDisplayed());
		HighlightOnElement(action);
		Assert.assertTrue(action.isEnabled());
		action.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

}
