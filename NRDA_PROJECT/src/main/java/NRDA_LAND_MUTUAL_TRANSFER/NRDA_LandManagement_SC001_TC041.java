package NRDA_LAND_MUTUAL_TRANSFER;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC041 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "open map".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="(//span[contains(text(),'Open Map')])[5]")
	private WebElement openmap;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify map".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div/iframe[@id='gisFrameTarget']")
	private WebElement frame;
	
	public void verifyOpenMap() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(openmap));
		Assert.assertTrue(openmap.isDisplayed());
		HighlightOnElement(openmap);
		Assert.assertTrue(openmap.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(openmap));
		openmap.click();
		waitForPageLoad();
		waitForDomElement();
		waitForDomElement();
		waitForDomElement();
		switchToFrame(frame);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "update".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="(//button/descendant::span[contains(text(),'Update')])[1]")
	private WebElement update;
	
	public void clickOnUpdate() throws InterruptedException{
		switchFrameToMainWindow();
		wait.until(ExpectedConditions.visibilityOf(update));
		Assert.assertTrue(update.isDisplayed());
		HighlightOnElement(update);
		Assert.assertTrue(update.isEnabled());
		update.click();
		pageLoadTimeOut();
		waitForDomElement();
		waitForDomElement();
		waitForDomElement();
		waitForDomElement();
		waitForDomElement();
		waitForDomElement();
		waitForDomElement();
		waitForSomeTime();
		waitForSomeTime();
	}

}
