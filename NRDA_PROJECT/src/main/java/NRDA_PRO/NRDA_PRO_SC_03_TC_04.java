package NRDA_PRO;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_PRO_SC_03_TC_04 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "My inbox".
	 * @author deepak.saini
	 * @since 2018-05-10
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div/div[@id='inboxForm:dashBoard']/div/div[3]/div/div/div[1]/div/span/a")
	private WebElement myinbox;

	public void clickOnMyInbox()
	{
		wait.until(ExpectedConditions.visibilityOf(myinbox));
		Assert.assertTrue(myinbox.isDisplayed());
		HighlightOnElement(myinbox);
		Assert.assertTrue(myinbox.isEnabled());
		myinbox.click();
		Reporter.log(myinbox.getText(),true);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "public relation office".
	 * @author deepak.saini
	 * @since 2018-05-10
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Public Relation Office')]/preceding-sibling::span")
	private WebElement publicreloffice;
	
	public void clickOnPublicRelOffice() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(publicreloffice));
		Assert.assertTrue(publicreloffice.isDisplayed());
		HighlightOnElement(publicreloffice);
		Assert.assertTrue(publicreloffice.isEnabled());
		publicreloffice.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Advertisement and publication".
	 * @author deepak.saini
	 * @since 2018-05-10
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Public Relation Office')]/preceding-sibling::span/../following-sibling::div/ul/li/a/span")
	private WebElement advAndPub;
	
	public void clickOnAdvertisementAndPub() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(advAndPub));
		Assert.assertTrue(advAndPub.isDisplayed());
		HighlightOnElement(advAndPub);
		Assert.assertTrue(advAndPub.isEnabled());
		advAndPub.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application search box".
	 * @author deepak.saini
	 * @since 2018-05-10
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//span[contains(text(),'Application No.')]/following-sibling::input")
	private WebElement searchbox;
	
	public void enterApplicationNum() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(searchbox));
		Assert.assertTrue(searchbox.isDisplayed());
		HighlightOnElement(searchbox);
		Assert.assertTrue(searchbox.isEnabled());
		excel.getExcelData(searchbox,"PRO_Application_Number",0,1);
		waitForSomeTime();
	}
	

}
