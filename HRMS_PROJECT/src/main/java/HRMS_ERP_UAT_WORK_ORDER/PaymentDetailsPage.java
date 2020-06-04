package HRMS_ERP_UAT_WORK_ORDER;

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

public class PaymentDetailsPage extends WebdriverCommonDriverLibrary{
	
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Payment Details'.
	 * @author deepak.saini
	 * @since 2018-12-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Payment Details')]")
	private WebElement paymentDetails;
	
	public void clickOnPaymentDetails() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(paymentDetails));
		Assert.assertTrue(paymentDetails.isDisplayed());
		HighlightOnElement(paymentDetails);
		Assert.assertTrue(paymentDetails.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(paymentDetails));
		paymentDetails.click();
		Thread.sleep(1000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add an item'.
	 * @author deepak.saini
	 * @since 2018-12-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Add an item')]")
	private WebElement item;
	
	public void clickOnAddItem() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(item));
		Assert.assertTrue(item.isDisplayed());
		HighlightOnElement(item);
		Assert.assertTrue(item.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(item));
		item.click();
		Thread.sleep(1000);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Milestone'.
	 * @author deepak.saini
	 * @since 2018-12-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@data-fieldname='name']")
	private WebElement mileStone;
	
	public void enterMilestone() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(mileStone));
		Assert.assertTrue(mileStone.isDisplayed());
		HighlightOnElement(mileStone);
		Assert.assertTrue(mileStone.isEnabled());
		exceldata.getExcelData(mileStone,"Finance Data",21,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Release Amount'.
	 * @author deepak.saini
	 * @since 2018-12-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@data-fieldname='release_amount']")
	private WebElement amt;
	
	public void enterReleaseAmt() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(amt));
		Assert.assertTrue(amt.isDisplayed());
		HighlightOnElement(amt);
		Assert.assertTrue(amt.isEnabled());
		amt.clear();
		exceldata.getExcelData(amt,"Finance Data",22,1);
	}

}
