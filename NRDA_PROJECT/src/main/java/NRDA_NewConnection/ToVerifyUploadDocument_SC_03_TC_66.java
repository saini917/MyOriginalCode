package NRDA_NewConnection;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyUploadDocument_SC_03_TC_66 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Save As Draft".
	 * @author deepak.saini
	 * @since 2018-04-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Save As Draft')])[4")
	private WebElement draft;
	
	public void clickSaveAsDraft() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(draft));
		Assert.assertTrue(draft.isDisplayed());
		HighlightOnElement(draft);
		Assert.assertTrue(draft.isEnabled());
		draft.click();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application status".
	 * @author deepak.saini
	 * @since 2018-04-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Application Status/आवेदन की स्थिति')]")
	private WebElement appstatus;
	
	public void clickOnApplicationStatus() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(appstatus));
		Assert.assertTrue(appstatus.isDisplayed());
		HighlightOnElement(appstatus);
		Assert.assertTrue(appstatus.isEnabled());
		appstatus.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Drafted application".
	 * @author deepak.saini
	 * @since 2018-04-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Drafted Applications')]/preceding-sibling::span")
	private WebElement draftapp;
	
	public void clickOnDraftedAplication() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(draftapp));
		Assert.assertTrue(draftapp.isDisplayed());
		HighlightOnElement(draftapp);
		Assert.assertTrue(draftapp.isEnabled());
		draftapp.click();
	}

}
