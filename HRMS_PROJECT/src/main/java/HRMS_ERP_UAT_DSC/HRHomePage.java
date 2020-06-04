package HRMS_ERP_UAT_DSC;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class HRHomePage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Discuss".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='navbar-header-custom']/a/i")
	private WebElement discussImage;
	
	public void clickOnDiscussImage() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(discussImage));
		Assert.assertTrue(discussImage.isDisplayed());
		HighlightOnElement(discussImage);
		Assert.assertTrue(discussImage.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(discussImage));
		discussImage.click();
		Thread.sleep(15000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Disciplinary Action".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'Disciplinary Action')])[2]")
	private WebElement disAction;
	
	public void clickOnDisciplinaryAction() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(disAction));
		Assert.assertTrue(disAction.isDisplayed());
		HighlightOnElement(disAction);
		Assert.assertTrue(disAction.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(disAction));
		disAction.click();
		Thread.sleep(10000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "show cause notice".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Show Cause Notice')]")
	private WebElement notice;
	
	public void clickOnShowCauseNotice() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(notice));
		Assert.assertTrue(notice.isDisplayed());
		HighlightOnElement(notice);
		Assert.assertTrue(notice.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(notice));
		notice.click();
		Thread.sleep(10000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "raise notice".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Raise Notice')]")
	private WebElement raiseNotice;
	
	public void clickOnRaiseNotice() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(raiseNotice));
		Assert.assertTrue(raiseNotice.isDisplayed());
		HighlightOnElement(raiseNotice);
		Assert.assertTrue(raiseNotice.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(raiseNotice));
		raiseNotice.click();
		Thread.sleep(10000);
	}
}
