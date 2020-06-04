package NRDA_Plumber;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyPlumberRegistration_SC_02_TC_25 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Submit".
	 * @author deepak.saini
	 * @since 2018-01-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/span)[3]/center/table/tbody/tr/td/span/button/span[contains(text(),'Submit')]")
	private WebElement submit;

	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div/table/tbody/tr/td[1]/label")
	private List<WebElement> plumberdetails;

	public void clickOnSubmit() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(submit));
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		Assert.assertTrue(submit.isDisplayed());
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isEnabled());
		submit.click();
		Reporter.log(" click on submit button ",true);
		waitForSomeTime();
		Reporter.log("User should be able to submit the application successfully.",true);
		Reporter.log("Application will show  details of submitted application i.e",true);
		for(WebElement list:plumberdetails)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			Reporter.log(list.getText(),true);
			waitForSomeTime();
		}
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Download receipt".
	 * @author deepak.saini
	 * @since 2018-01-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div/table/tbody/tr/td/button/span[contains(text(),'Download Receipt')]")
	private WebElement download;

	public void clickOnDownloadReceipt() throws InterruptedException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(download));
		wait.until(ExpectedConditions.elementToBeClickable(download));
		Assert.assertTrue(download.isDisplayed());
		HighlightOnElement(download);
		Assert.assertTrue(download.isEnabled());
		Reporter.log("A 'Download  Receipt' button will be shown on the app:"+download.getText(),true);
		download.click();
		Reporter.log("Download receipt button should successfully download the receipt",true);
		waitForSomeTime();
	}
}
