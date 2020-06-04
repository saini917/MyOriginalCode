package NRDA_LAND_DIVERSION_SECTION;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC036 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on radio button".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:srchDlg']/div/div/div/div/div/table/tbody/tr/td/div")
	private WebElement selectrecord;
	
	public void selectRecord() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(selectrecord));
		Assert.assertTrue(selectrecord.isDisplayed());
		HighlightOnElement(selectrecord);
		Assert.assertTrue(selectrecord.isEnabled());
		Actions act=new Actions(driver);
		act.click(selectrecord).build().perform();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "fill in form".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Fill In Form')]")
	private WebElement fillinform;
	
	public void clickOnFillInForm() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(fillinform));
		Assert.assertTrue(fillinform.isDisplayed());
		HighlightOnElement(fillinform);
		Assert.assertTrue(fillinform.isEnabled());
		fillinform.click();
		waitForSomeTime();
	}

}
