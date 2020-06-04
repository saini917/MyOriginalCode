package NRDA_MeterTesting;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyMeterTesting_SC_02_TC_08 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "search".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Search')])[1]")
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
	 * This is the xpath of the WebElement "dsiplay list".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'Subject')]")
	private WebElement subject;
	
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/div/div/table/tbody/tr/td/label[contains(text(),'File No.')]")
	private WebElement fileno;
	
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/div/div/center/table/tbody/tr/td/button/span")
	private List<WebElement> display;
	
	public void verifyDisplayList()
	{
		Reporter.log("System will show the following:",true);
		wait.until(ExpectedConditions.visibilityOf(subject));
		Assert.assertTrue(subject.isDisplayed());
		HighlightOnElement(subject);
		String sub=subject.getText();
		Reporter.log(sub,true);
		
		wait.until(ExpectedConditions.visibilityOf(fileno));
		Assert.assertTrue(fileno.isDisplayed());
		HighlightOnElement(fileno);
		String file=fileno.getText();
		Reporter.log(file,true);
		
		
		for(WebElement list:display)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			String link=list.getText();
			Reporter.log(link,true);
		}
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close window".
	 * @author deepak.saini
	 * @since 2018-03-23
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/a/span")
	private WebElement closewindow;
	
	public void verifyClosePopUpWindow() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(closewindow));
		wait.until(ExpectedConditions.elementToBeClickable(closewindow));
		Assert.assertTrue(closewindow.isDisplayed());
		HighlightOnElement(closewindow);
		Assert.assertTrue(closewindow.isEnabled());
		closewindow.click();
		waitForSomeTime();
	}


}
