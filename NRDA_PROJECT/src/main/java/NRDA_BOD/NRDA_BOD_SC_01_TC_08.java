package NRDA_BOD;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_01_TC_08 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Committee  Name')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement committeename;
	
	public void verifyCommitteeName() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(committeename));
		Assert.assertTrue(committeename.isDisplayed());
		HighlightOnElement(committeename);
		Assert.assertTrue(committeename.isEnabled());
		getValueFromDropDown(committeename);
		SelectVisibleText(committeename,"BOD-COMMITTEE");
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Meeting description".
	 * @author deepak.saini
	 * @since 2017-02-14
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Meeting Description')]/../../../../../../following-sibling::td/table/tbody/tr/td/textarea")
	private WebElement meetingdesc;
	
	public void verifyMeetingDesc() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(meetingdesc));
		Assert.assertTrue(meetingdesc.isDisplayed());
		HighlightOnElement(meetingdesc);
		Assert.assertTrue(meetingdesc.isEnabled());
		excel.getExcelData(meetingdesc,"BOD DATA",1,1);
		Reporter.log("Committee Description textbox accept the Aplha-Numeric Value",true);
	}

}
