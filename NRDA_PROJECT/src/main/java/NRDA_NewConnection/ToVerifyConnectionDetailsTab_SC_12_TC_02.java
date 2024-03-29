package NRDA_NewConnection;

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

public class ToVerifyConnectionDetailsTab_SC_12_TC_02 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Approved/Rejected".
	 * @author deepak saini
	 * @since 2018-05-04
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//a[contains(text(),'Approved/Rejected Application/स्वीकृत/अस्वीकृत आवेदन')]")
	private WebElement approvedrejectedstatus;
	
	public void verifyApprovedRejectedStatus() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(approvedrejectedstatus));
		wait.until(ExpectedConditions.elementToBeClickable(approvedrejectedstatus));
		Assert.assertTrue(approvedrejectedstatus.isDisplayed());
		HighlightOnElement(approvedrejectedstatus);
		Assert.assertTrue(approvedrejectedstatus.isEnabled());
		approvedrejectedstatus.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter customer id".
	 * @author deepak saini
	 * @since 2018-01-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/div/div/div/div/table/tbody/tr/td/span[contains(text(),'Enter Application Number :')]/../following-sibling::td/input")
	private WebElement searchbox;

	public void enterCustomerID() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(searchbox));
		Assert.assertTrue(searchbox.isDisplayed());
		HighlightOnElement(searchbox);
		Assert.assertTrue(searchbox.isEnabled());
		excel.getExcelData(searchbox,"Customer ID",0,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Search button".
	 * @author deepak saini
	 * @since 2018-01-09
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/div/div/div/div/table/tbody/tr/td/span[contains(text(),'Enter Application Number :')]/../following-sibling::td/button/span[contains(text(),'Search')]")
	private WebElement searchbtn;

	public void clickOnSearchBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(searchbtn));
		wait.until(ExpectedConditions.elementToBeClickable(searchbtn));
		Assert.assertTrue(searchbtn.isDisplayed());
		HighlightOnElement(searchbtn);
		Assert.assertTrue(searchbtn.isEnabled());
		searchbtn.click();
		waitForSomeTime();
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "display list".
	 * @author deepak saini
	 * @since 2018-01-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/div/div/table/tbody/tr/td/following-sibling::td/span")
	private List<WebElement> displaylist;
	
	public void verifyDisplayList() throws InterruptedException
	{
		for(WebElement list:displaylist)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			Reporter.log(list.getText(),true);
		}
	}
}
