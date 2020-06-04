package NRDA_RECONNECTION;

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

public class NRDA_Reconnection_SC_01_TC_03 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit Application".
	 * @author deepak.saini
	 * @since 2018-05-07
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Submit')])[1]")
	private WebElement submit;
	
	public void clickOnSubmit() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(submit));
		Assert.assertTrue(submit.isDisplayed());
		Assert.assertTrue(submit.isEnabled());
		HighlightOnElement(submit);
		submit.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div/table/tbody/tr/td/label[contains(text(),'Application Number')]/../following-sibling::td/label")
	private WebElement status;
	
	public void getReconnectionAppNum() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		Assert.assertTrue(status.isDisplayed());
		Assert.assertTrue(status.isEnabled());
		HighlightOnElement(status);
		String appnum=status.getText();
		excel.updateReconnectionAppNum(appnum);
		waitForSomeTime();
	}
	
}
