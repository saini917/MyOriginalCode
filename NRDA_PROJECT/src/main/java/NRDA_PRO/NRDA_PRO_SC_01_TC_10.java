package NRDA_PRO;

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

public class NRDA_PRO_SC_01_TC_10 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify Public start date".
	 * @author deepak.saini
	 * @since 2018-05-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/ul/li/a/../../following-sibling::div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Publication Start Date')]/../../../../../../following-sibling::td/table/tbody/tr/td/span/input")
	private WebElement pubstartdate;
	
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/ul/li/a/../../following-sibling::div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Publication Start Date')]")
	private WebElement clickonany;
	
	public void verifyPublicationStartDate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		wait.until(ExpectedConditions.visibilityOf(pubstartdate));
		wait.until(ExpectedConditions.elementToBeClickable(pubstartdate));
		Assert.assertTrue(pubstartdate.isDisplayed());
		HighlightOnElement(pubstartdate);
		Assert.assertTrue(pubstartdate.isEnabled());
		excel.getExcelData(pubstartdate,"PRO_Advertisement_Details_Data",1,28);
		waitForSomeTime();
		clickonany.click();
		acceptAlert();
	}

}
