package NRDA_RECONNECTION;

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

public class NRDA_Reconnection_SC_02_TC_08 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "subject".
	 * @author deepak saini
	 * @since 06-01-2018
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//label[contains(text(),'Subject')])[2]/../following-sibling::td[2]/input")
	private WebElement subject;
	
	public void enterSubject() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(subject));
		Assert.assertTrue(subject.isDisplayed());
		excel.getExcelData(subject, "File Data",4,1);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "search".
	 * @author deepak saini
	 * @since 06-01-2018
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Search')])[2]")
	private WebElement search;
	
	public void clickOnSearch() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(search));
		wait.until(ExpectedConditions.elementToBeClickable(search));
		Assert.assertTrue(search.isDisplayed());
		HighlightOnElement(search);
		Assert.assertTrue(search.isEnabled());
		search.click();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Fill In Form Button".
	 * @author deepak saini
	 * @since 06-01-2018
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//form[@id='inboxForm']/span/div/div/div/div/center/table/tbody/tr/td/button/span[contains(text(),'Fill In Form')]")
	private WebElement fillinformbtn;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select record".
	 * @author deepak saini
	 * @since 06-01-2018
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:searchdata']/div/table/tbody/tr/td/div")
	private WebElement selectrecord;

	public void selectRecord() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(selectrecord));
		wait.until(ExpectedConditions.elementToBeClickable(selectrecord));
		Assert.assertTrue(selectrecord.isDisplayed());
		HighlightOnElement(selectrecord);
		Assert.assertTrue(selectrecord.isEnabled());
		Actions act=new Actions(driver);
		act.click(selectrecord).build().perform();
		waitForSomeTime();
	}

	public void clickOnFillInFormBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(fillinformbtn));
		wait.until(ExpectedConditions.elementToBeClickable(fillinformbtn));
		Assert.assertTrue(fillinformbtn.isDisplayed());
		HighlightOnElement(fillinformbtn);
		Assert.assertTrue(fillinformbtn.isEnabled());
		fillinformbtn.click();
		Reporter.log("Select a record & click on 'Fill in Form' button",true);
		waitForSomeTime();
		elementExist();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify search button".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Search')])[1]")
	private WebElement searchbtn;

	//exist Element
	public void elementExist()
	{
		Boolean searchpresent=searchbtn.isDisplayed();
		if(searchpresent==true)
		{
			Reporter.log("Search button is appearing",true);
		}
		else
		{
			Reporter.log("Search button is not appearing",true);
		}
	}

}
