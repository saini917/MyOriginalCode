package NRDA_LAND_DIVERSION_SECTION;

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

public class NRDA_LandManagement_SC001_TC025 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "open map".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//span[contains(text(),'Open Map')]")
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
	
	public void verifyOpenMap() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(openmap));
		Assert.assertTrue(openmap.isDisplayed());
		HighlightOnElement(openmap);
		Assert.assertTrue(openmap.isEnabled());
		openmap.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		switchToFrame(frame);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close map".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='inboxForm:Dlg']/descendant::div/descendant::a/descendant::span")
	private WebElement closemap;
	
	public void closeMapPopUp() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(closemap));
		Assert.assertTrue(closemap.isDisplayed());
		HighlightOnElement(closemap);
		Assert.assertTrue(closemap.isEnabled());
		closemap.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		switchFrameToMainWindow();
	}
}
