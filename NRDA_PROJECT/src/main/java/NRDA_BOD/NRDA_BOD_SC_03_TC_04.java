package NRDA_BOD;

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

public class NRDA_BOD_SC_03_TC_04 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify application search".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//th/span[contains(text(),'Application No.')]/following-sibling::input")
	private WebElement appsearch;
	
	public void verifyAppSearch() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(appsearch));
		wait.until(ExpectedConditions.elementToBeClickable(appsearch));
		Assert.assertTrue(appsearch.isDisplayed());
		HighlightOnElement(appsearch);
		Assert.assertTrue(appsearch.isEnabled());
		excel.getExcelData(appsearch,"BOD Temp Id",0,1);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify action".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	//@FindBy(xpath="//img[@src='/NRDAuthorityPreUAT/resources/images/view-new.png']")
	@FindBy(xpath="//img[@src='/NRDAuthority_TEST/resources/images/view-new.png']")
	private WebElement action;
	
	public void clickOnAction() throws InterruptedException
	{
		((JavascriptExecutor)driver).executeScript("window.scrollBy(2000,0)");
		wait.until(ExpectedConditions.visibilityOf(action));
		wait.until(ExpectedConditions.elementToBeClickable(action));
		Assert.assertTrue(action.isDisplayed());
		HighlightOnElement(action);
		Assert.assertTrue(action.isEnabled());
		action.click();
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
	
	@FindBy(xpath="//div[@id='inboxForm:Nb_content']/div/div/center/table/tbody/tr/td/label")
	private List<WebElement> display1;
	
	@FindBy(xpath="(//label[contains(text(),'Enter Comments')])[1]")
	private WebElement display2;
	
	@FindBy(xpath="//div[@id='inboxForm:Nb_content']/button/span")
	private WebElement display3;
	
	public void verifyDisplayLink() throws InterruptedException
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
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,100)", "");
		
		Assert.assertTrue(display2.isDisplayed());
		HighlightOnElement(display2);
		
		Assert.assertTrue(display3.isDisplayed());
		HighlightOnElement(display3);
	}

}
