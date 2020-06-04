package NRDA_NewConnection;

import java.awt.AWTException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyUploadDocument_SC_03_TC_60 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Upload document Details".
	 * @author deepak.saini
	 * @since 2017-08-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Service Related Document')]/../following-sibling::td/select")
	private WebElement value;
	
	public void selectServiceRelatedDoc() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(value));
		Assert.assertTrue(value.isDisplayed());
		HighlightOnElement(value);
		SelectVisibleText(value,"Other Document");
		waitForSomeTime();
		waitForSomeTime();
	}
	
	@FindBy(xpath="//label[contains(text(),'Service Related Document')]/../following-sibling::td/select/../following-sibling::td/div/div/label")
	private WebElement uploaddocs;
	
	public void uploadDoc() throws InterruptedException, AWTException
	{
		HighlightOnElement(uploaddocs);
		uploaddocs.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Identification document"
	 * @author deepak.saini
	 * @since 2018-04-25
	 */
	/****************************************************************************************************/	
	
	@FindBy(xpath="//label[contains(text(),'Identification Document')]/../following-sibling::td/select")
	private WebElement idvalue;
	
	public void selectIdentificationDoc() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(idvalue));
		Assert.assertTrue(idvalue.isDisplayed());
		HighlightOnElement(idvalue);
		SelectVisibleText(idvalue,"Passport");
		waitForSomeTime();
		waitForSomeTime();
	}
	
	@FindBy(xpath="//label[contains(text(),'Identification Document')]/../following-sibling::td/select/../following-sibling::td/div/div/label")
	private WebElement uploaddocss;
	
	public void uploadDocs() throws InterruptedException, AWTException
	{
		HighlightOnElement(uploaddocss);
		uploaddocss.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Proof Of Residence Document"
	 * @author deepak.saini
	 * @since 2018-04-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Proof Of Residence Document')]/../following-sibling::td/select")
	private WebElement residencevalue;
	
	public void selectResidenceDoc() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(residencevalue));
		Assert.assertTrue(residencevalue.isDisplayed());
		HighlightOnElement(residencevalue);
		SelectVisibleText(residencevalue,"Aadhar Card");
		waitForSomeTime();
		waitForSomeTime();
	}
	
	@FindBy(xpath="//label[contains(text(),'Proof Of Residence Document')]/../following-sibling::td/div/div/label")
	private WebElement uploaddocument;
	
	public void uploadDocument() throws InterruptedException, AWTException
	{
		HighlightOnElement(uploaddocument);
		uploaddocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

}
