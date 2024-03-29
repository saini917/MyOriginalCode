package NRDA_BOD;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_08_TC_07 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select action".
	 * @author deepak.saini
	 * @since 2018-04-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Select Action')]/../../../following-sibling::td/select")
	private WebElement selectaction;

	public void clickOnSelectAction() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)", "");
		
		wait.until(ExpectedConditions.visibilityOf(selectaction));
		wait.until(ExpectedConditions.elementToBeClickable(selectaction));
		Assert.assertTrue(selectaction.isDisplayed());
		HighlightOnElement(selectaction);
		Assert.assertTrue(selectaction.isEnabled());
		SelectVisibleText(selectaction,"Approved");
		waitForSomeTime();
	}

}
