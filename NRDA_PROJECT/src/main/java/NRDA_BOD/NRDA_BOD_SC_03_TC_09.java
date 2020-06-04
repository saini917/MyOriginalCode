package NRDA_BOD;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_03_TC_09 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Previous meeting compliances".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='inboxForm:aplRspDia']/div/div/div/div/div/table/tbody/tr/td/span/label[contains(text(),'Previous Meeting Compliances')]/../../following-sibling::td/textarea")
	private WebElement previouscompliances;
	
	public void enterPreviousCompliances() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(previouscompliances));
		wait.until(ExpectedConditions.elementToBeClickable(previouscompliances));
		Assert.assertTrue(previouscompliances.isDisplayed());
		HighlightOnElement(previouscompliances);
		Assert.assertTrue(previouscompliances.isEnabled());
		excel.getExcelData(previouscompliances,"BOD DATA",1,5);
	}

}
