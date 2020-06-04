package NRDA_PRO;


import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_PRO_SC_07_TC_05 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "action ".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//form[@id='inboxForm']/div/div/div/div/div/div/div/div/table/tbody/tr/td/center/a/img[1]")
	private WebElement actionimg;

	public void clickOnAction() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(actionimg));
		Assert.assertTrue(actionimg.isDisplayed());
		HighlightOnElement(actionimg);
		Assert.assertTrue(actionimg.isEnabled());
		actionimg.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "PRO Bill Information".
	 * @author deepak.saini
	 * @since 2018-05-11
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'PRO Bill Information')]")
	private WebElement probill;

	public void clickOnPROBillInformation() throws InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		wait.until(ExpectedConditions.elementToBeClickable(probill));
		Assert.assertTrue(probill.isDisplayed());
		HighlightOnElement(probill);
		Assert.assertTrue(probill.isEnabled());
		probill.click();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "NEW BILL".
	 * @author deepak.saini
	 * @since 2018-05-11
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'New Bill')]")
	private WebElement newbill;

	public void clickOnNewBill() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(newbill));
		Assert.assertTrue(newbill.isDisplayed());
		HighlightOnElement(newbill);
		Assert.assertTrue(newbill.isEnabled());
		newbill.click();
		waitForSomeTime();
	}
	
}
