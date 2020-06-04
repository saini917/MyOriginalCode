package NRDA_ChangeOfUse;

import java.io.IOException;

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

public class ToVerifyChangeOfUse_SC_04_TC_04 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "pending days".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//span[contains(text(),'Pending Since(Days)')]/following-sibling::input")
	private WebElement pendingdays;
	
	public void enterPendingDays() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.elementToBeClickable(pendingdays));
		HighlightOnElement(pendingdays);
		Assert.assertTrue(pendingdays.isDisplayed());
		Assert.assertTrue(pendingdays.isEnabled());
		excel.getExcelData(pendingdays,"ChangeOfUseID",1,8);
	}
	
	@FindBy(xpath="(//td[contains(text(),'No application found')])[1]")
	private WebElement msg;
	
	public void verifyErrorMsg()
	{
		String actualmsg="No application found";
		wait.until(ExpectedConditions.elementToBeClickable(msg));
		HighlightOnElement(msg);
		Assert.assertTrue(msg.isDisplayed());
		Assert.assertTrue(msg.isEnabled());
		String expectedmsg=msg.getText();
		Reporter.log("Error Message: "+expectedmsg,true);
		Assert.assertEquals(expectedmsg,actualmsg,"Test case pass");
		HighlightOnElement(msg);
	}


}
