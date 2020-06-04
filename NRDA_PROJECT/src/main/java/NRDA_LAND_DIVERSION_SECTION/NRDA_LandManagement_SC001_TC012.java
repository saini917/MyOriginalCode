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

public class NRDA_LandManagement_SC001_TC012 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "save khasra geometry icon".
	 * @author deepak.saini
	 * @since 2018-05-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='container wrap']/nav/div/div/ul/li/div/div/button/span[@class='fa fa-floppy-o']")
	private WebElement savekhasrageometry;
	
	public void clickOnSaveKhasraGeometry() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(savekhasrageometry));
		Assert.assertTrue(savekhasrageometry.isDisplayed());
		HighlightOnElement(savekhasrageometry);
		Assert.assertTrue(savekhasrageometry.isEnabled());
		savekhasrageometry.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "remarks".
	 * @author deepak.saini
	 * @since 2018-05-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//label[contains(text(),'Remarks')])[2]/following-sibling::input")
	private WebElement remarks;
	
	public void enterRemarks() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(remarks));
		Assert.assertTrue(remarks.isDisplayed());
		HighlightOnElement(remarks);
		Assert.assertTrue(remarks.isEnabled());
		excel.getExcelData(remarks,"Land Data",1,30);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "cancel".
	 * @author deepak.saini
	 * @since 2018-05-25
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//button[contains(text(),'cancel')]")
	private WebElement cancel;
	
	public void clickOnCancel()
	{
		wait.until(ExpectedConditions.visibilityOf(cancel));
		Assert.assertTrue(cancel.isDisplayed());
		HighlightOnElement(cancel);
		Assert.assertTrue(cancel.isEnabled());
		cancel.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close map".
	 * @author deepak.saini
	 * @since 2018-05-25
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='form0:propertyMapLand']/div/a/span")
	private WebElement closemap;
	
	public void closeMapPopUp() throws InterruptedException
	{
		switchFrameToMainWindow();
		wait.until(ExpectedConditions.visibilityOf(closemap));
		Assert.assertTrue(closemap.isDisplayed());
		HighlightOnElement(closemap);
		Assert.assertTrue(closemap.isEnabled());
		closemap.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

}