package NRDA_BOD;

import java.awt.AWTException;
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

public class NRDA_BOD_SC_02_TC_09  extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Submit Agenda".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//button/span[contains(text(),'Submit Agenda')]")
	private WebElement submitagenda;
	
	public void clickOnSubmitAgenda()
	{
		wait.until(ExpectedConditions.visibilityOf(submitagenda));
		wait.until(ExpectedConditions.elementToBeClickable(submitagenda));
		Assert.assertTrue(submitagenda.isDisplayed());
		HighlightOnElement(submitagenda);
		Assert.assertTrue(submitagenda.isEnabled());
		submitagenda.click();
}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter Comments".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:fwdAgendaDia']/div/div/div/center/table/tbody/tr/td/label[contains(text(),'Enter Comments')]/../following-sibling::td/textarea")
	private WebElement comments;
	
	public void enterComment() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(comments));
		wait.until(ExpectedConditions.elementToBeClickable(comments));
		Assert.assertTrue(comments.isDisplayed());
		HighlightOnElement(comments);
		Assert.assertTrue(comments.isEnabled());
		excel.getExcelData(comments,"BOD DATA",3,6);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Upload".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:fwdAgendaDia']/div/div/div/table/tbody/tr/td/span[contains(text(),'Upload Document')]/../following-sibling::td/table/tbody/tr/td/div/div/label")
	private WebElement upload;

	public void uploadDocument() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		wait.until(ExpectedConditions.visibilityOf(upload));
		Assert.assertTrue(upload.isDisplayed());
		HighlightOnElement(upload);
		Assert.assertTrue(upload.isEnabled());
		upload.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\download.jpg");
		waitForSomeTime();
	}
	
	@FindBy(xpath="//button/span[contains(text(),'Forward Agenda')]")
	private WebElement forwardagenda;
	
	public void clickOnForwardAgenda() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(forwardagenda));
		wait.until(ExpectedConditions.elementToBeClickable(forwardagenda));
		Assert.assertTrue(forwardagenda.isDisplayed());
		HighlightOnElement(forwardagenda);
		Assert.assertTrue(forwardagenda.isEnabled());
		forwardagenda.click();
		waitForSomeTime();
	}
	
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div/div/center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/div/div/span")
	private WebElement action;
	
	public void selectAction() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(action));
		Assert.assertTrue(action.isDisplayed());
		HighlightOnElement(action);
		Assert.assertTrue(action.isEnabled());
		action.click();
		selectValueFromDropdown("Forward");
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select section user".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div/div/center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/span/table/tbody/tr/td/div/div/span")
	private WebElement sectionuser;
	
	@FindBy(xpath="//div[@id='inboxForm:userListId3_panel']/div/ul/li/label[contains(text(),'Anil yadav (SUE)')]")
	private WebElement user;
	
	public void selectSectionUser() throws InterruptedException
	{	
		wait.until(ExpectedConditions.visibilityOf(sectionuser));
		Assert.assertTrue(sectionuser.isDisplayed());
		HighlightOnElement(sectionuser);
		Assert.assertTrue(sectionuser.isEnabled());
		sectionuser.click();
		waitForSomeTime();
		
		wait.until(ExpectedConditions.visibilityOf(user));
		Assert.assertTrue(user.isDisplayed());
		HighlightOnElement(user);
		Assert.assertTrue(user.isEnabled());
		HighlightOnElement(user);
		user.click();
		waitForSomeTime();
		waitForSomeTime();
	}
}
