package NRDA_BOD;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_05_TC_08 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify add/update agenda".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/ul/li/a[contains(text(),'Add/Update Agenda')]")
	private WebElement addupdateagenda;
	
	public void clickOnAddUpdateAgenda() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(addupdateagenda));
		wait.until(ExpectedConditions.elementToBeClickable(addupdateagenda));
		Assert.assertTrue(addupdateagenda.isDisplayed());
		HighlightOnElement(addupdateagenda);
		Assert.assertTrue(addupdateagenda.isEnabled());
		addupdateagenda.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify update agenda".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Update Agenda')])[1]")
	private WebElement updateagenda;
	
	public void clickOnUpdateAgenda() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(updateagenda));
		wait.until(ExpectedConditions.elementToBeClickable(updateagenda));
		Assert.assertTrue(updateagenda.isDisplayed());
		HighlightOnElement(updateagenda);
		Assert.assertTrue(updateagenda.isEnabled());
		updateagenda.click();
		waitForSomeTime();
	}
	
	@FindBy(xpath="(//label[contains(text(),'Select Agenda Confidentiality')]/../following-sibling::td/div/div/span)[2]")
	private WebElement confidentally;
	
	public void selectConfidentally() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(confidentally));
		wait.until(ExpectedConditions.elementToBeClickable(confidentally));
		Assert.assertTrue(confidentally.isDisplayed());
		HighlightOnElement(confidentally);
		Assert.assertTrue(confidentally.isEnabled());
		confidentally.click();
		selectValueFromDropdown("Public");
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Agenda note".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="(//label[contains(text(),'Agenda Note')])[2]/../../following-sibling::td/textarea")
	private WebElement agendanote;
	
	
	public void enterUpdateAgendaNote() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(agendanote));
		wait.until(ExpectedConditions.elementToBeClickable(agendanote));
		Assert.assertTrue(agendanote.isDisplayed());
		HighlightOnElement(agendanote);
		Assert.assertTrue(agendanote.isEnabled());
		excel.getExcelData(agendanote,"BOD DATA",2,4);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "update agenda".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Update Agenda')])[2]")
	private WebElement updateagenda1;
	
	public void clickOnUpdateAgenda1() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(updateagenda1));
		wait.until(ExpectedConditions.elementToBeClickable(updateagenda1));
		Assert.assertTrue(updateagenda1.isDisplayed());
		HighlightOnElement(updateagenda1);
		Assert.assertTrue(updateagenda1.isEnabled());
		updateagenda1.click();
		waitForSomeTime();
	}
	

}
