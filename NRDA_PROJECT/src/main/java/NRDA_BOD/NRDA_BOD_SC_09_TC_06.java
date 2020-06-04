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

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_09_TC_06 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify application search".
	 * @author deepak.saini
	 * @since 2018-04-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//th/span[contains(text(),'Application No.')]/following-sibling::input")
	private WebElement appsearch;
	
	public void verifyAppSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(appsearch));
		wait.until(ExpectedConditions.elementToBeClickable(appsearch));
		Assert.assertTrue(appsearch.isDisplayed());
		HighlightOnElement(appsearch);
		Assert.assertTrue(appsearch.isEnabled());
		excel.getExcelData(appsearch,"BOD Temp Id",0,1);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify add invitee".
	 * @author deepak.saini
	 * @since 2018-04-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Add Invitee')]")
	private WebElement addinvitee;
	
	public void clickOnAddInvitee() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(addinvitee));
		wait.until(ExpectedConditions.elementToBeClickable(addinvitee));
		Assert.assertTrue(addinvitee.isDisplayed());
		HighlightOnElement(addinvitee);
		Assert.assertTrue(addinvitee.isEnabled());
		addinvitee.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify add invitee display list".
	 * @author deepak.saini
	 * @since 2018-04-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:parentRspDia']/div/div/div/table/tbody/tr/td/div/div/button/span")
	private List<WebElement> display;
	
	public void verifyDisplayLink()
	{
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
	}

}
