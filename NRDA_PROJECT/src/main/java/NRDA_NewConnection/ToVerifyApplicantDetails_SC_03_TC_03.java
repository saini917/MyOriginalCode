package NRDA_NewConnection;
import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;
/**
 * @author deepak.saini
 * @since 2017-08-16
 */
public class ToVerifyApplicantDetails_SC_03_TC_03 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "APPLICANT TYPE".
	 * @author deepak.saini
	 * @since 2017-12-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Applicant Type')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement applicant_type;


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "DISPLAY LIST".
	 * @author deepak.saini
	 * @since 2017-12-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb']/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List<WebElement> displaylist;


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "DISPLAY BUTTON LIST".
	 * @author deepak.saini
	 * @since 2017-12-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/span/center/table/tbody/tr/td/span/button")
	private List<WebElement> displaybuttonlist;
	/****************************************************************************************************/

	/*
	 * This is the xpath of the WebElement "Reset".
	 * @author deepak.saini
	 * @since 2017-08-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Reset')])[1]")
	private WebElement reset;

	/***********Fetch the data from the excel sheet to enter the Applicant details
	 * @author deepak.saini
	 * @throws AWTException 
	 * @since 2017-08-16***************************/
	
	public void selectApplicantType() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		wait.until(ExpectedConditions.visibilityOf(applicant_type));
		Assert.assertTrue(applicant_type.isEnabled());
		Assert.assertTrue(applicant_type.isDisplayed());
		SelectVisibleText(applicant_type,"Individual");
		waitForSomeTime();
	}

	public void verifyDisplayList()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)", "");
		try
		{
			for(WebElement list:displaylist)
			{
				Assert.assertNotNull(list.isDisplayed());
				HighlightOnElement(list);
			}

			for(WebElement buttonlist:displaybuttonlist)
			{
				Assert.assertNotNull(buttonlist.isDisplayed());
				HighlightOnElement(buttonlist);
			}
		}
		catch(Exception ex)
		{

		}
	}

	public void clickOnResetButton() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(reset));
		wait.until(ExpectedConditions.elementToBeClickable(reset));
		HighlightOnElement(reset);
		Assert.assertTrue(reset.isEnabled());
		reset.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on Proceed button".
	 * @author deepak.saini
	 * @since 2017-12-26
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:confirmDlg']/div/div/div/div/div/table/tbody/tr/td /button/span[contains(text(),'Proceed')]")
	private WebElement proceed;

	public void clickOnProceedPopupButton() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(proceed));
		wait.until(ExpectedConditions.elementToBeClickable(proceed));
		HighlightOnElement(proceed);//click on proceed button
		proceed.click();
		waitForSomeTime();
	}
}










