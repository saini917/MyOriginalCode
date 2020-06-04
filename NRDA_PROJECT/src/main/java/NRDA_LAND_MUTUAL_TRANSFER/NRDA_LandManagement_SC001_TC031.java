package NRDA_LAND_MUTUAL_TRANSFER;

import java.awt.AWTException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC031 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "upload letter".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Upload Letter')]/ancestor::td/following-sibling::td/descendant::table[1]/tbody/tr/td/span/div/div/label")
	private WebElement uploadletter;
	
	public void uploadLetter() throws InterruptedException, AWTException{
		wait.until(ExpectedConditions.visibilityOf(uploadletter));
		Assert.assertTrue(uploadletter.isDisplayed());
		HighlightOnElement(uploadletter);
		Assert.assertTrue(uploadletter.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(uploadletter));
		uploadletter.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		waitForPageLoad();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Khasra paanchsala".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Khasra Paanchsala')]/ancestor::td/following-sibling::td/descendant::table[1]/tbody/tr/td/span/div/div/label")
	private WebElement khasrapaanch;
	
	public void khasraPaanchsala() throws InterruptedException, AWTException{
		wait.until(ExpectedConditions.visibilityOf(khasrapaanch));
		Assert.assertTrue(khasrapaanch.isDisplayed());
		HighlightOnElement(khasrapaanch);
		Assert.assertTrue(khasrapaanch.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(khasrapaanch));
		khasrapaanch.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		waitForPageLoad();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "patwari report".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Patwari Report')]/ancestor::td/following-sibling::td/descendant::table[1]/tbody/tr/td/span/div/div/label")
	private WebElement patwarireport;
	
	public void patwariReport() throws InterruptedException, AWTException{
		wait.until(ExpectedConditions.visibilityOf(patwarireport));
		Assert.assertTrue(patwarireport.isDisplayed());
		HighlightOnElement(patwarireport);
		Assert.assertTrue(patwarireport.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(patwarireport));
		patwarireport.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		waitForPageLoad();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "upload message".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div/span[contains(text(),'File uploaded Successfully')]")
	private WebElement sucmsg;
	
	public void verifyUploadMsg() throws InterruptedException{
		String expected="File uploaded Successfully";
		wait.until(ExpectedConditions.visibilityOf(sucmsg));
		Assert.assertTrue(sucmsg.isDisplayed());
		HighlightOnElement(sucmsg);
		Assert.assertTrue(sucmsg.isEnabled());
		String actual=sucmsg.getText();
		Assert.assertEquals(actual,expected,"Test case not pass");
		Reporter.log("Uploaded Message :"+actual,true);

	}

}
