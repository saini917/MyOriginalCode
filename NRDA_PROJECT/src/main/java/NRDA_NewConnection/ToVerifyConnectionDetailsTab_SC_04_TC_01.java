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


public class ToVerifyConnectionDetailsTab_SC_04_TC_01 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);


	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "click on submit"
	 * @author deepak saini
	 * @Date: 02-01-2018
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="(//button/span[contains(text(),'Submit')])[1]")
	private WebElement submit;

	public void clickOnSubmitBtn() throws InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		wait.until(ExpectedConditions.visibilityOf(submit));
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		HighlightOnElement(submit);
		submit.click();
		Reporter.log("Click on 'Submit' button",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Application Label"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/span/span/div/div/table/tbody/tr/td[1]/label")
	private List<WebElement> applicationlabel;
	
	@FindBy(xpath="//button/span[contains(text(),'Make Payment')]")
	private WebElement makepayment;
	
	public void verifyApplicationLabel() throws InterruptedException
	{
		for(WebElement list:applicationlabel)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
		}
		HighlightOnElement(makepayment);
		Assert.assertTrue(makepayment.isDisplayed());
	}

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Application Number"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="(//table/tbody/tr/td[2]/label)[1]")
	private WebElement Application_Number;

	public void verifyApplicationStatus() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(Application_Number));
		waitForSomeTime();
		HighlightOnElement(Application_Number);
		try
		{
			String  ApplicationNumber=Application_Number.getText();
			Reporter.log(" Application Number Is:"+ApplicationNumber ,true);
			excel.updateExcelData(ApplicationNumber);//To Store Application Number
		}
		catch(Exception NoSuchElementException)
		{
			NoSuchElementException.printStackTrace();
		}
	}
}

