package NRDA_ChangeOfUse;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyChangeOfUse_SC_02_TC_08 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Completion Certificate Document".
	 * @author deepak.saini
	 * @since 2018-04-11
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div[4]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Completion Certificate Document')]/../../../../../../following-sibling::td/table/tbody/tr/td/span/div/div/label")
	private WebElement certificate;
	
	public void verifyInvalidUploadCertificate() throws InterruptedException, AWTException
	{
		wait.until(ExpectedConditions.elementToBeClickable(certificate));
		HighlightOnElement(certificate);
		Assert.assertTrue(certificate.isDisplayed());
		Assert.assertTrue(certificate.isEnabled());
		certificate.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\JPG AND PNG\\SampleJPGImage_2mbmb.jpg");
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "error message".
	 * @author deepak.saini
	 * @since 2018-03-26
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Please enter valid file size and file size between ( 1KB to 1024KB )')]")
	private WebElement errmessage;
	
	public void verifyErrorMessage() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(errmessage));
		Assert.assertTrue(errmessage.isDisplayed());
		HighlightOnElement(errmessage);

		String actualMessage="Please enter valid file size and file size between ( 1KB to 1024KB )";
		String expectedMesage=errmessage.getText();
		Assert.assertEquals(actualMessage,expectedMesage);
		Reporter.log("Error Message:"+expectedMesage,true);
		waitForSomeTime();
	}
	
	public void verifyAgainInvalidCertificate() throws InterruptedException, AWTException
	{
		wait.until(ExpectedConditions.elementToBeClickable(certificate));
		HighlightOnElement(certificate);
		Assert.assertTrue(certificate.isDisplayed());
		Assert.assertTrue(certificate.isEnabled());
		certificate.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\JPG AND PNG\\SampleDOCFile_100kb.doc");
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "error message".
	 * @author deepak.saini
	 * @since 2018-03-26
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Please select following types of file ( jpeg,jpg,png,pdf )')]")
	private WebElement message;
	
	public void verifyErrMessage() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(message));
		Assert.assertTrue(message.isDisplayed());
		HighlightOnElement(message);

		String actualMessage="Please select following types of file ( jpeg,jpg,png,pdf )";
		String expectedMesage=message.getText();
		Assert.assertEquals(actualMessage,expectedMesage);
		Reporter.log("Error Message:"+expectedMesage,true);
		waitForSomeTime();
	}

	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "remove".
	 * @author deepak.saini
	 * @since 2018-04-11
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Remove')]")
	private WebElement remove;
	
	public void clickOnRemove() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(remove));
		HighlightOnElement(remove);
		Assert.assertTrue(remove.isDisplayed());
		Assert.assertTrue(remove.isEnabled());
		remove.click();
		waitForSomeTime();
	}
	
	public void verifyValidCertificate() throws InterruptedException, AWTException
	{
		wait.until(ExpectedConditions.elementToBeClickable(certificate));
		HighlightOnElement(certificate);
		Assert.assertTrue(certificate.isDisplayed());
		Assert.assertTrue(certificate.isEnabled());
		certificate.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\JPG AND PNG\\SampleJPGImage_500kbmb.jpg");
		waitForSomeTime();
		waitForSomeTime();
	}

}
