package NRDA_BOD;

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

public class NRDA_BOD_SC_01_TC_31 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit button".
	 * @author deepak.saini
	 * @since 2018-03-28
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//button/span[contains(text(),'Submit')]")
	private WebElement submit;
	
	public void clickOnSubmitBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(submit));
		Assert.assertTrue(submit.isDisplayed());
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isEnabled());	
		submit.click();
		Reporter.log("Click on Submitt button",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "display list".
	 * @author deepak.saini
	 * @since 2018-03-28
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/ul/li/a")
	private List<WebElement> display;
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/div/table/tbody/tr/td/div/div/label")
	private List<WebElement> display1;
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/div/table/tbody/tr/td/label")
	private List<WebElement> display2;
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/div/table/tbody/tr/td/span[contains(text(),'Upload Document')]")
	private WebElement upload;
	
	public void verifyDisplayLink()
	{
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
		
		for(WebElement list:display1)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
		
		for(WebElement list:display2)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
		
		HighlightOnElement(upload);
	}
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/div/table/tbody/tr/td/span[contains(text(),'Meeting Reference Number')]/../following-sibling::td[1]/span")
	private WebElement applicationnum;
	
	public void getApplicationNum() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(applicationnum));
		Assert.assertTrue(applicationnum.isDisplayed());
		HighlightOnElement(applicationnum);
		Assert.assertTrue(applicationnum.isEnabled());
		String app=applicationnum.getText();
		Reporter.log("Meeting Reference Number -->"+app,true);
		excel.updateBOD(app);
	}

}
