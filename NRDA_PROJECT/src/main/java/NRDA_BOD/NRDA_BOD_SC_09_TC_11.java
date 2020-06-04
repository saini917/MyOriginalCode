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

public class NRDA_BOD_SC_09_TC_11 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add Other Meeting Participant".
	 * @author deepak.saini
	 * @since 2018-04-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:parentRspDia']/div/div/div/table/tbody/tr/td/div/div/button/span[contains(text(),'Add Other Meeting Participant')]")
	private WebElement meetingparticipant;
	
	public void clickOnAddMeetingParticipant() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(meetingparticipant));
		wait.until(ExpectedConditions.elementToBeClickable(meetingparticipant));
		Assert.assertTrue(meetingparticipant.isDisplayed());
		HighlightOnElement(meetingparticipant);
		Assert.assertTrue(meetingparticipant.isEnabled());
		meetingparticipant.click();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter dept".
	 * @author deepak.saini
	 * @since 2018-04-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:otherinvitees']/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/span[contains(text(),'Enter Department')]/../following-sibling::td/input")
	private WebElement enterdept;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter name".
	 * @author deepak.saini
	 * @since 2018-04-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:otherinvitees']/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/span[contains(text(),'Enter Name')]/../following-sibling::td/input")
	private WebElement entername;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter mobile".
	 * @author deepak.saini
	 * @since 2018-04-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:otherinvitees']/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/span[contains(text(),'Enter Mobile Number')]/../following-sibling::td/input")
	private WebElement entermobile;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter address".
	 * @author deepak.saini
	 * @since 2018-04-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:otherinvitees']/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/span[contains(text(),'Enter Address')]/../following-sibling::td/input")
	private WebElement enteraddress;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter email".
	 * @author deepak.saini
	 * @since 2018-04-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:otherinvitees']/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/span[contains(text(),'Enter Email')]/../following-sibling::td/input")
	private WebElement enteremail;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter designation".
	 * @author deepak.saini
	 * @since 2018-04-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:otherinvitees']/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/span[contains(text(),'Enter Designation')]/../following-sibling::td/input")
	private WebElement enterdesignation;
	
	public void enterDetails() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(enterdept));
		wait.until(ExpectedConditions.elementToBeClickable(enterdept));
		Assert.assertTrue(enterdept.isDisplayed());
		HighlightOnElement(enterdept);
		Assert.assertTrue(enterdept.isEnabled());
		excel.getExcelData(enterdept,"BOD DATA",1,7);
		
		wait.until(ExpectedConditions.visibilityOf(entername));
		wait.until(ExpectedConditions.elementToBeClickable(entername));
		Assert.assertTrue(entername.isDisplayed());
		HighlightOnElement(entername);
		Assert.assertTrue(entername.isEnabled());
		excel.getExcelData(entername,"BOD DATA",1,8);
		
		wait.until(ExpectedConditions.visibilityOf(entermobile));
		wait.until(ExpectedConditions.elementToBeClickable(entermobile));
		Assert.assertTrue(entermobile.isDisplayed());
		HighlightOnElement(entermobile);
		Assert.assertTrue(entermobile.isEnabled());
		excel.getExcelData(entermobile,"BOD DATA",1,9);
		

		wait.until(ExpectedConditions.visibilityOf(enteraddress));
		wait.until(ExpectedConditions.elementToBeClickable(enteraddress));
		Assert.assertTrue(enteraddress.isDisplayed());
		HighlightOnElement(enteraddress);
		Assert.assertTrue(enteraddress.isEnabled());
		excel.getExcelData(enteraddress,"BOD DATA",1,10);
		
		wait.until(ExpectedConditions.visibilityOf(enteremail));
		wait.until(ExpectedConditions.elementToBeClickable(enteremail));
		Assert.assertTrue(enteremail.isDisplayed());
		HighlightOnElement(enteremail);
		Assert.assertTrue(enteremail.isEnabled());
		excel.getExcelData(enteremail,"BOD DATA",1,11);
		
		wait.until(ExpectedConditions.visibilityOf(enterdesignation));
		wait.until(ExpectedConditions.elementToBeClickable(enterdesignation));
		Assert.assertTrue(enterdesignation.isDisplayed());
		HighlightOnElement(enterdesignation);
		Assert.assertTrue(enterdesignation.isEnabled());
		excel.getExcelData(enterdesignation,"BOD DATA",1,12);
	}
	
	
}
