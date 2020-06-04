package NRDA_NewConnection;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_07_TC_01 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Pending for Payment"
	 * @author deepak saini
	 * @Date: 03-01-2018
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='leftCol']/span/div/div/div/ul/li/a[contains(text(),'Pending For Payment/भुगतान हेतु अपूर्ण')]")
	private WebElement pendingforpayment;

	public void clickOnPendingPayment() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(pendingforpayment));
		wait.until(ExpectedConditions.elementToBeClickable(pendingforpayment));
		HighlightOnElement(pendingforpayment);
		pendingforpayment.click();
		Reporter.log("Click on 'Pending for payment' menu shown in application menu 'Payment",true);
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "water and sewrage connection"
	 * @author deepak saini
	 * @Date: 03-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/div/div/h3/a[contains(text(),'WATER AND SEWERAGE CONNECTION')]/preceding-sibling::span")
	private WebElement waterandsewerge;

	public void verifyWaterAndSewerageConnectionExit() throws InterruptedException
	{	
		wait.until(ExpectedConditions.visibilityOf(waterandsewerge));
		wait.until(ExpectedConditions.elementToBeClickable(waterandsewerge));
		HighlightOnElement(waterandsewerge);
		Actions act=new Actions(driver);
		act.click(waterandsewerge).build().perform();
		Reporter.log("Click on Water & Sewerage connection",true);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		waitForSomeTime();
	}

	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/div/div/h3/a[contains(text(),'WATER AND SEWERAGE CONNECTION')]/preceding-sibling::span/../following-sibling::div/div/div/table/thead/tr/th/span")
	private List<WebElement> field;

	public void verifyDisplayList() throws InterruptedException
	{
		for(WebElement list:field)	
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			waitForSomeTime();
		}
	}

	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/div/div/h3/a[contains(text(),'WATER AND SEWERAGE CONNECTION')]/preceding-sibling::span/../following-sibling::div/div/div/table/thead/tr/th/span/../../../following-sibling::tbody/tr/td/button/span")
	private List<WebElement> button;

	public void verifyDisplayButton() throws InterruptedException
	{
		for(WebElement list:button)	
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			waitForSomeTime();
		}
		Reporter.log("1. User should be able to view various records in proper format i.e  \n Serial Number \n Application Date \n Applicant Name \n Application Number \n Application Status \n Action \n 2. Action should contain two buttons i.e Proceed to payment & View",true);
	}
}
