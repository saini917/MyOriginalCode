package NRDA_ChangeOfUse;

import java.io.IOException;

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

public class ToVerifyChangeOfUse_SC_02_TC_13 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "save as draft".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Save As Draft')])[4]")
	private WebElement saveasdraft;

	public void clickOnSaveAsDraft() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(saveasdraft));
		Assert.assertTrue(saveasdraft.isDisplayed());
		HighlightOnElement(saveasdraft);
		Assert.assertTrue(saveasdraft.isEnabled());
		saveasdraft.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "change of use temporary number".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Your application has been saved successfully')]")
	private WebElement changeofusetempno;
	
	public void getTempNum() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(changeofusetempno));
		Assert.assertTrue(changeofusetempno.isDisplayed());
		HighlightOnElement(changeofusetempno);
		String tempno=changeofusetempno.getText();
		String changeofuseID=tempno.substring(51,69);
		Reporter.log("Change Of Use ID:"+changeofuseID,true);
		excel.updateChangeOfUseID(changeofuseID);//To Store change of use Temporary Number
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application Status".
	 * @author deepak.saini
	 * @since 2018-04-12
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
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Serach input box".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/span[contains(text(),'Enter Application Number :')]/../following-sibling::td/input")
	private WebElement searchinputbox;

	public void enterChangeOfUseID() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(searchinputbox));
		Assert.assertTrue(searchinputbox.isDisplayed());
		HighlightOnElement(searchinputbox);
		Assert.assertTrue(searchinputbox.isEnabled());
		excel.getExcelData(searchinputbox,"ChangeOfUseID",0,1);
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Serach button".
	 * @author deepak.saini
	 * @since 2018-04-12
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
	 * @since 2018-04-12
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
	 * This is the xpath of the WebElement "change of use draft".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/div/h3/a[contains(text(),'Drafted Applications')]/preceding-sibling::span/../following-sibling::div/div/h3/a[contains(text(),'CHANGE OF USE')]/preceding-sibling::span")
	private WebElement changeofusedraft;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "change of use Temp no".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/div/h3/a[contains(text(),'Drafted Applications')]/preceding-sibling::span/../following-sibling::div/div/h3/a[contains(text(),'CHANGE OF USE')]/preceding-sibling::span/../following-sibling::div/div/div/div/table/tbody/tr/td[4]/span")
	private WebElement gettempno;
	
	public void clickOnDraftChangeOfUse() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(changeofusedraft));
		wait.until(ExpectedConditions.elementToBeClickable(changeofusedraft));
		Assert.assertTrue(changeofusedraft.isDisplayed());
		HighlightOnElement(changeofusedraft);
		Assert.assertTrue(changeofusedraft.isEnabled());
		Actions act=new Actions(driver);
		act.click(changeofusedraft).build().perform();
		waitForSomeTime();
		HighlightOnElement(gettempno);
		Reporter.log("Temp No:"+gettempno.getText(),true);
	}

}
