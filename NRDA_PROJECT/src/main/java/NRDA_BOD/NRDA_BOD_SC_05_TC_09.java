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
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_05_TC_09 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add Agenda".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/ul/li/a[contains(text(),'Add/Update Agenda')]/../../following-sibling::div/div/div/div/center)[1]/button/span")
	private WebElement addagenda;
	
	public void clickOnAddAgenda() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(addagenda));
		wait.until(ExpectedConditions.elementToBeClickable(addagenda));
		Assert.assertTrue(addagenda.isDisplayed());
		HighlightOnElement(addagenda);
		Assert.assertTrue(addagenda.isEnabled());
		addagenda.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Agenda name".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:aplRspDia']/div/div/div/div/div/table/tbody/tr/td/span/label[contains(text(),'Agenda Name')]/../../following-sibling::td/input")
	private WebElement agendaname;
	
	public void enterAgendaName() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(agendaname));
		wait.until(ExpectedConditions.elementToBeClickable(agendaname));
		Assert.assertTrue(agendaname.isDisplayed());
		HighlightOnElement(agendaname);
		Assert.assertTrue(agendaname.isEnabled());
		excel.getExcelData(agendaname,"BOD DATA",1,3);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Agenda note".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='inboxForm:aplRspDia']/div/div/div/div/div/table/tbody/tr/td/span/label[contains(text(),'Agenda Note')]/../../following-sibling::td/textarea")
	private WebElement agendanote;
	
	
	public void enterAgendaNote() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(agendanote));
		wait.until(ExpectedConditions.elementToBeClickable(agendanote));
		Assert.assertTrue(agendanote.isDisplayed());
		HighlightOnElement(agendanote);
		Assert.assertTrue(agendanote.isEnabled());
		excel.getExcelData(agendanote,"BOD DATA",1,4);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select Agenda".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:aplRspDia']/div/div/div/div/div/table/tbody/tr/td/label[contains(text(),'Select Agenda Confidentiality')]/../following-sibling::td/div/div/span")
	private WebElement selectagenda;
	
	public void selectAgenda() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(selectagenda));
		wait.until(ExpectedConditions.elementToBeClickable(selectagenda));
		Assert.assertTrue(selectagenda.isDisplayed());
		HighlightOnElement(selectagenda);
		Assert.assertTrue(selectagenda.isEnabled());
		selectagenda.click();
		selectValueFromDropdown("Public");
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Previous meeting compliances".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='inboxForm:aplRspDia']/div/div/div/div/div/table/tbody/tr/td/span/label[contains(text(),'Previous Meeting Compliances')]/../../following-sibling::td/textarea")
	private WebElement previouscompliances;
	
	public void enterPreviousCompliances() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(previouscompliances));
		wait.until(ExpectedConditions.elementToBeClickable(previouscompliances));
		Assert.assertTrue(previouscompliances.isDisplayed());
		HighlightOnElement(previouscompliances);
		Assert.assertTrue(previouscompliances.isEnabled());
		excel.getExcelData(previouscompliances,"BOD DATA",1,5);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add Agenda".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Add Agenda')])[2]")
	private WebElement addagenda1;
	
	public void clickOnAddAgenda1()
	{
		wait.until(ExpectedConditions.visibilityOf(addagenda1));
		wait.until(ExpectedConditions.elementToBeClickable(addagenda1));
		Assert.assertTrue(addagenda1.isDisplayed());
		HighlightOnElement(addagenda1);
		Assert.assertTrue(addagenda1.isEnabled());
		addagenda1.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "successful message".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Data saved successfully!')]")
	private WebElement message;
	public void verifyMessage() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(message));
		Assert.assertTrue(message.isDisplayed());
		HighlightOnElement(message);

		String actualMessage="Data saved successfully!";
		String expectedMesage=message.getText();
		Assert.assertEquals(actualMessage,expectedMesage);
		Reporter.log("Successful Message:"+expectedMesage,true);
		waitForSomeTime();
	}

}
