package NRDA_BOD;

import java.awt.AWTException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_05_TC_14 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Remove upload document".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Remove')]")
	private WebElement remove;
	
	public void removeUploadDocument() throws InterruptedException, AWTException
	{
		wait.until(ExpectedConditions.visibilityOf(remove));
		Assert.assertTrue(remove.isDisplayed());
		HighlightOnElement(remove);
		Assert.assertTrue(remove.isEnabled());
		remove.click();
		waitForSomeTime();
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "successful message".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'File removed Successfully')]")
	private WebElement message;
	public void verifyMessage() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(message));
		Assert.assertTrue(message.isDisplayed());
		HighlightOnElement(message);

		String actualMessage="File removed Successfully";
		String expectedMesage=message.getText();
		Assert.assertEquals(actualMessage,expectedMesage);
		Reporter.log("Successful Message:"+expectedMesage,true);
		waitForSomeTime();
	}

}
