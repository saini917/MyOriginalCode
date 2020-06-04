package NRDA_LAND_REQUEST_INITIATION;

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

public class NRDA_LandManagement_SC009_TC006 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "create new file".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/div/div/center/table/tbody/tr/td/button/span[contains(text(),'Create New File')]")
	private WebElement createnewfile;
	
	public void clickOnCreateNewFile() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(createnewfile));
		wait.until(ExpectedConditions.elementToBeClickable(createnewfile));
		Assert.assertTrue(createnewfile.isDisplayed());
		HighlightOnElement(createnewfile);
		Assert.assertTrue(createnewfile.isEnabled());
		createnewfile.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "dsiplay list".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/table/tbody/tr/td/label")
	private List<WebElement> display;
	
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/div/div/center/table/tbody/tr/td/button/span")
	private List<WebElement> display1;
	
	public void verifyDisplayList()
	{
		Reporter.log("System will show the following:",true);	
		for(WebElement list:display)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			String link=list.getText();
			Reporter.log(link,true);
		}
		
		for(WebElement list:display1)
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
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:createFileDlg']/div/a/span")
	//@FindBy(xpath="(//button/span[contains(text(),'Close')])[2]")
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

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close window".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/a/span")
	//@FindBy(xpath="(//button/span[contains(text(),'Close')])[1]")
	private WebElement closewindow1;
	
	public void verifyClosePopUpWindow1() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(closewindow1));
		wait.until(ExpectedConditions.elementToBeClickable(closewindow1));
		Assert.assertTrue(closewindow1.isDisplayed());
		HighlightOnElement(closewindow1);
		Assert.assertTrue(closewindow1.isEnabled());
		closewindow1.click();
		waitForSomeTime();
	}


}
