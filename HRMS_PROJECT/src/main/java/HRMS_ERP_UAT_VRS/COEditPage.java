package HRMS_ERP_UAT_VRS;

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

public class COEditPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Edit".
	 * @author deepak.saini
	 * @since 2018-11-13
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	private WebElement edit;
	
	public void clickOnEdit() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(edit));
		Assert.assertTrue(edit.isDisplayed());
		HighlightOnElement(edit);
		Assert.assertTrue(edit.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(edit));
		edit.click();
		waitForPageLoad();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter HR Name".
	 * @author deepak.saini
	 * @since 2018-11-13
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='o_form_input_dropdown']/input")
	private WebElement hrManager;
	
	public void enterHRManager() throws EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(hrManager));
		Assert.assertTrue(hrManager.isDisplayed());
		HighlightOnElement(hrManager);
		Assert.assertTrue(hrManager.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(hrManager));
		
		hrManager.click();
		hrManager.clear();
		
		exceldata.getExcelData(hrManager,"VRS DATA",2,1);
		waitForDomElement();
		hrManager.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Save".
	 * @author deepak.saini
	 * @since 2018-11-13
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button[contains(text(),'Save')])[1]")
	private WebElement save;
	
	public void clickOnSave() throws EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(save));
		Assert.assertTrue(save.isDisplayed());
		HighlightOnElement(save);
		Assert.assertTrue(save.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(save));
		save.click();
		waitForPageLoad();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "cancel".
	 * @author deepak.saini
	 * @since 2018-11-13
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Cancel')]")
	private WebElement cancel;
	
	public void clickOnCancel() throws EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(cancel));
		Assert.assertTrue(cancel.isDisplayed());
		HighlightOnElement(cancel);
		Assert.assertTrue(cancel.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(cancel));
		cancel.click();
		waitForPageLoad();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "approve".
	 * @author deepak.saini
	 * @since 2018-11-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'Approve')])[5]")
	private WebElement approve;
	
	public void clickOnApprove() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(approve));
		Assert.assertTrue(approve.isDisplayed());
		HighlightOnElement(approve);
		Assert.assertTrue(approve.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(approve));
		approve.click();
		Thread.sleep(5000);
	}

}
