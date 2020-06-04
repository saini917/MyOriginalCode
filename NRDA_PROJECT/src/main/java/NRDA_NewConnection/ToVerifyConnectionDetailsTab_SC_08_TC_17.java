package NRDA_NewConnection;

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

public class ToVerifyConnectionDetailsTab_SC_08_TC_17 extends CommonLibrary 
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on create New file".
	 * @author deepak saini
	 * @since 06-01-2018
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Subject')]/../following-sibling::td/input")
	private WebElement subject;
	
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'File Number')]")
	private WebElement clickonany;

	public void verifySubject() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(subject));
		Assert.assertTrue(subject.isDisplayed());
		excel.getExcelData(subject, "File Data",3,1);
		clickonany.click();
		waitForSomeTime();
	}
	@FindBy(xpath="(//form[@id='inboxForm']/span/div/div/a/span)[5]")
	private WebElement closepopup;

	@FindBy(xpath="(//form[@id='inboxForm']/span/div/div/a/span)[4]")
	private WebElement closepopup1;

	public void closePopup() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(closepopup));
		wait.until(ExpectedConditions.elementToBeClickable(closepopup));
		Assert.assertTrue(closepopup.isDisplayed());
		HighlightOnElement(closepopup);
		Assert.assertTrue(closepopup.isEnabled());
		closepopup.click();
		waitForSomeTime();

		wait.until(ExpectedConditions.visibilityOf(closepopup1));
		wait.until(ExpectedConditions.elementToBeClickable(closepopup1));
		Assert.assertTrue(closepopup1.isDisplayed());
		HighlightOnElement(closepopup1);
		Assert.assertTrue(closepopup1.isEnabled());
		closepopup1.click();
		waitForSomeTime();
	}

}
