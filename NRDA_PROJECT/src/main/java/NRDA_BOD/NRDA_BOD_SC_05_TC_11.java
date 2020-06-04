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

public class NRDA_BOD_SC_05_TC_11 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select action".
	 * @author deepak.saini
	 * @since 2018-04-05
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
		SelectVisibleText(selectaction,"Forward");
		waitForSomeTime();
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select name".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Select Action')]/../../../following-sibling::td/span/table/tbody/tr/td/select")
	private WebElement selectname;
	
	public void nameSelect() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(selectname));
		wait.until(ExpectedConditions.elementToBeClickable(selectname));
		Assert.assertTrue(selectname.isDisplayed());
		HighlightOnElement(selectname);
		Assert.assertTrue(selectname.isEnabled());
		SelectVisibleText(selectname,"M.D Kawrey (GM)");
		waitForSomeTime();
	}

}
