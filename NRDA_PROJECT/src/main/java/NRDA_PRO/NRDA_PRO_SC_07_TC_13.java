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
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_PRO_SC_07_TC_13 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter Comments".
	 * @author deepak.saini
	 * @since 2018-05-10
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb_content']/div/div/center/table/tbody/tr/td/label[contains(text(),'Enter Comments')]/../../following-sibling::tr/td/textarea")
	private WebElement comments;

	public void enterComment() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		wait.until(ExpectedConditions.visibilityOf(comments));
		Assert.assertTrue(comments.isDisplayed());
		HighlightOnElement(comments);
		Assert.assertTrue(comments.isEnabled());
		String comment=excel.getExcelData(comments,"PRO DATA",2,4);
		Reporter.log("Enter Comment:"+comment,true);
		
	}


}