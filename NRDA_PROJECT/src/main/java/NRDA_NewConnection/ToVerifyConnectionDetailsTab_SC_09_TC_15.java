package NRDA_NewConnection;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_09_TC_15 extends CommonLibrary 
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "water connection accessories".
	 * @author deepak saini
	 * @since 2018-05-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Water Connection Accessories / जल कनेक्शन उपकरण')]")
	private WebElement accessories;
	
	public void clickOnWaterConnAccessories() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(accessories));
		wait.until(ExpectedConditions.elementToBeClickable(accessories));
		Assert.assertTrue(accessories.isDisplayed());
		HighlightOnElement(accessories);
		Assert.assertTrue(accessories.isEnabled());
		accessories.click();
		waitForSomeTime();
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Total Amount without accessories".
	 * @author deepak saini
	 * @since 2018-05-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//table[@id='inboxForm:docAccordionPanel:amout']/tbody/tr")
	private WebElement withoutaddaccessorytotalamt;
	
	public void getTotalAmountWithoutAddAccessoryAmt()
	{
		wait.until(ExpectedConditions.visibilityOf(withoutaddaccessorytotalamt));
		Assert.assertTrue(withoutaddaccessorytotalamt.isDisplayed());
		HighlightOnElement(withoutaddaccessorytotalamt);
		Assert.assertTrue(withoutaddaccessorytotalamt.isEnabled());
		Reporter.log("Total Amt without Accessories amount:"+withoutaddaccessorytotalamt.getText(),true);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "enter description".
	 * @author deepak saini
	 * @since 2018-05-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td/label[contains(text(),'Description')]/../following-sibling::td/input[@id='inboxForm:docAccordionPanel:j_id1375448001_3e5e585f']")
	private WebElement description;
	
	public void enterDescription() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(description));
		Assert.assertTrue(description.isDisplayed());
		HighlightOnElement(description);
		Assert.assertTrue(description.isEnabled());
		description.clear();
		waitForSomeTime();
		excel.getExcelData(description,"Customer ID",1,14);
		waitForSomeTime();
		

		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Amount".
	 * @author deepak saini
	 * @since 2018-05-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td/label[contains(text(),'Amount')]/../following-sibling::td/input")
	private WebElement amount;
	
	@FindBy(xpath="//td/label[contains(text(),'Amount')]")
	private WebElement clickonany;
	
	public void enterAmount() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(amount));
		Assert.assertTrue(amount.isDisplayed());
		HighlightOnElement(amount);
		Assert.assertTrue(amount.isEnabled());
		amount.clear();
		waitForSomeTime();
		clickonany.click();
		waitForSomeTime();
		excel.getExcelData(amount,"Customer ID",1,15);
		clickonany.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Total Amount with accessories".
	 * @author deepak saini
	 * @since 2018-05-04
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//table[@id='inboxForm:docAccordionPanel:amout']/tbody/tr")
	private WebElement addaccessorytotalamt;
	
	public void getTotalAmountWithAddAccessoryAmt()
	{
		wait.until(ExpectedConditions.visibilityOf(addaccessorytotalamt));
		Assert.assertTrue(addaccessorytotalamt.isDisplayed());
		HighlightOnElement(addaccessorytotalamt);
		Assert.assertTrue(addaccessorytotalamt.isEnabled());
		Reporter.log("Total Amt with Accessories amount:"+addaccessorytotalamt.getText(),true);
	}

}
