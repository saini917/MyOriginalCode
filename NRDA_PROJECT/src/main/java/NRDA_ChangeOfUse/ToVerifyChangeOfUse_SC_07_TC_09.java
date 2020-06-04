package NRDA_ChangeOfUse;

import java.io.IOException;
import java.util.List;

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

public class ToVerifyChangeOfUse_SC_07_TC_09 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select action".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="(//center)[3]/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/div/div/span")
	private WebElement selectaction;
	
	public void clickOnSelectAction()
	{
		wait.until(ExpectedConditions.elementToBeClickable(selectaction));
		HighlightOnElement(selectaction);
		Assert.assertTrue(selectaction.isDisplayed());
		Assert.assertTrue(selectaction.isEnabled());
		selectaction.click();
	}

	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select action forward".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset'])[1]/li")
	private List<WebElement> action;
	
	public void selectActionApproved() throws InterruptedException
	{
		selectValueFromDropdown("Approved");
		waitForSomeTime();
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "comment".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//label[contains(text(),'Enter Comments')]/../../following-sibling::tr/td/textarea")
	private WebElement comment;

	public void enterComment() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.elementToBeClickable(comment));
		HighlightOnElement(comment);
		Assert.assertTrue(comment.isDisplayed());
		Assert.assertTrue(comment.isEnabled());
		excel.getExcelData(comment,"ChangeOfUseID",1,9);
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Submit')])[1]")
	private WebElement submit;
	
	public void clickOnSubmit() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isDisplayed());
		Assert.assertTrue(submit.isEnabled());
		submit.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "comment error message".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div/span[contains(text(),'Comments is required !')]")
	private WebElement msg;
	
	public void verifyErrorMsg() throws InterruptedException
	{
		String actual="Comments is required !";
		HighlightOnElement(msg);
		Assert.assertTrue(msg.isDisplayed());
		Assert.assertTrue(msg.isEnabled());
		String expected=msg.getText();
		Reporter.log("Error Message :"+expected,true);
		Assert.assertEquals(actual,expected,"Test case pass");
		HighlightOnElement(msg);
	}

}
