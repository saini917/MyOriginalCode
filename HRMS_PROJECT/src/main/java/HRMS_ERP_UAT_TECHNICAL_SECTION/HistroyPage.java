package HRMS_ERP_UAT_TECHNICAL_SECTION;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class HistroyPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Histroy".
	 * @author deepak.saini
	 * @since 2018-12-07
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'History')]")
	private WebElement history;
	
	public void clickOnHistory() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(history));
		Assert.assertTrue(history.isDisplayed());
		HighlightOnElement(history);
		Assert.assertTrue(history.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(history));
		history.click();
	}

}
