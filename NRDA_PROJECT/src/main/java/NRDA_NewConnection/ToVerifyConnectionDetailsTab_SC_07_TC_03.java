package NRDA_NewConnection;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_07_TC_03  extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Payment gateway".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[@id='form0:dynaFormGroup']/div/div/table/tbody/tr/td[1]/label[contains(text(),'Select Payment Gateway')]/../following-sibling::td/span/table/tbody/tr[2]/td/img/../preceding-sibling::td/div")
	private WebElement gateway;
	
	public void selectPaymentGateway() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(gateway));
		Assert.assertTrue(gateway.isDisplayed());
		HighlightOnElement(gateway);
		Assert.assertTrue(gateway.isEnabled());
		gateway.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Online mode".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/

	@FindBy(xpath="//span[@id='form0:dynaFormGroup']/div/div/table/tbody/tr/td[1]/label[contains(text(),'Select Payment Mode')]/../following-sibling::td/table/tbody/tr/td[1]/div")
	private WebElement onlinemode;
	
	public void selectPaymentMode() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(onlinemode));
		Assert.assertTrue(onlinemode.isDisplayed());
		HighlightOnElement(onlinemode);
		Assert.assertTrue(onlinemode.isEnabled());
		onlinemode.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Make Payment"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Make Payment')]")
	private WebElement makepayment;

	public void verifyMakePayment() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(makepayment));
		wait.until(ExpectedConditions.elementToBeClickable(makepayment));
		Assert.assertTrue(makepayment.isDisplayed());
		HighlightOnElement(makepayment);
		Reporter.log("User should be able to view button named as 'Make Payment'",true);
		waitForSomeTime();
	}


}
