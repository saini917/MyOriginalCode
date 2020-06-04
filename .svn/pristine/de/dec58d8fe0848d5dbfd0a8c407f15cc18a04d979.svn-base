package NRDA_Plumber;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;


public class ToVerifyPlumberRegistration_SC_02_TC_22 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Save As Draft".
	 * @author deepak.saini
	 * @since 2018-01-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/span)[3]/center/table/tbody/tr/td/span/button/span[contains(text(),'Save As Draft')]")
	private WebElement saveasdraft;

	public void clickOnSaveAsDraft() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(saveasdraft));
		wait.until(ExpectedConditions.elementToBeClickable(saveasdraft));
		Assert.assertTrue(saveasdraft.isDisplayed());
		HighlightOnElement(saveasdraft);
		Assert.assertTrue(saveasdraft.isEnabled());
		saveasdraft.click();
		Reporter.log("1. User should be able to save the application as draft successfully. \n 2. The draft application can be seen in Application Status > Drafted Application > under 'Plumber Registeration'",true);
		waitForSomeTime();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Temporary number".
	 * @author deepak.saini
	 * @since 2018-01-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Your application has been saved successfully')]")
	private WebElement plumbertempno;

	public void getPlumberTempNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(plumbertempno));
		waitForSomeTime();
		Assert.assertTrue(plumbertempno.isDisplayed());
		HighlightOnElement(plumbertempno);
		String tempno=plumbertempno.getText();
		String plumberID=tempno.substring(51,69);
		Reporter.log("Plumber ID:"+plumberID,true);
		excel.updatePlumberID(plumberID);//To Store Plumber Temporary Number
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application Status".
	 * @author deepak.saini
	 * @since 2018-01-17
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//div[@class='left-nav']/ul/li/a[contains(text(),'Application Status/आवेदन की स्थिति')]")
	private WebElement applicationstatus;

	public void clickOnApplicationStatus() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(applicationstatus));
		wait.until(ExpectedConditions.elementToBeClickable(applicationstatus));
		Assert.assertTrue(applicationstatus.isDisplayed());
		HighlightOnElement(applicationstatus);
		Assert.assertTrue(applicationstatus.isEnabled());
		applicationstatus.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Serach input box".
	 * @author deepak.saini
	 * @since 2018-01-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/span[contains(text(),'Enter Application Number :')]/../following-sibling::td/input")
	private WebElement searchinputbox;

	public void enterPlumberID() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(searchinputbox));
		Assert.assertTrue(searchinputbox.isDisplayed());
		HighlightOnElement(searchinputbox);
		Assert.assertTrue(searchinputbox.isEnabled());
		excel.getExcelData(searchinputbox,"Plumber ID",0,1);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Serach button".
	 * @author deepak.saini
	 * @since 2018-01-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/span[contains(text(),'Enter Application Number :')]/../following-sibling::td/button/span[contains(text(),'Search')]")
	private WebElement clickonsearchbtn;

	public void clickOnSearchBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(clickonsearchbtn));
		wait.until(ExpectedConditions.elementToBeClickable(clickonsearchbtn));
		Assert.assertTrue(clickonsearchbtn.isDisplayed());
		HighlightOnElement(clickonsearchbtn);
		Assert.assertTrue(clickonsearchbtn.isEnabled());
		clickonsearchbtn.click();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Drafted application".
	 * @author deepak.saini
	 * @since 2018-01-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/div/h3/a[contains(text(),'Drafted Applications')]/preceding-sibling::span")
	private WebElement draftapplication;

	public void clickOnDraftedApplication()
	{
		wait.until(ExpectedConditions.visibilityOf(draftapplication));
		wait.until(ExpectedConditions.elementToBeClickable(draftapplication));
		Assert.assertTrue(draftapplication.isDisplayed());
		HighlightOnElement(draftapplication);
		Assert.assertTrue(draftapplication.isEnabled());
		Actions act=new Actions(driver);
		act.click(draftapplication).build().perform();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Plumber registration".
	 * @author deepak.saini
	 * @since 2018-01-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/div/h3/a[contains(text(),'Drafted Applications')]/preceding-sibling::span/../following-sibling::div/div/h3/a[contains(text(),'PLUMBER REGISTRATION')]/preceding-sibling::span")
	private WebElement plumberreg;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Plumber Temp no".
	 * @author deepak.saini
	 * @since 2018-01-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/div/h3/a[contains(text(),'Drafted Applications')]/preceding-sibling::span/../following-sibling::div/div/h3/a[contains(text(),'PLUMBER REGISTRATION')]/preceding-sibling::span/../following-sibling::div/div/div/div/table/tbody/tr/td[4]/span")
	private WebElement gettempno;
	
	public void clickOnPlumberReg() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(plumberreg));
		wait.until(ExpectedConditions.elementToBeClickable(plumberreg));
		Assert.assertTrue(plumberreg.isDisplayed());
		HighlightOnElement(plumberreg);
		Assert.assertTrue(plumberreg.isEnabled());
		Actions act=new Actions(driver);
		act.click(plumberreg).build().perform();
		waitForSomeTime();
		HighlightOnElement(gettempno);
		Reporter.log("Temp No:"+gettempno.getText(),true);
	}
}
