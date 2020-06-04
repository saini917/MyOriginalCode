package NRDA_ChangeOfUse;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyChangeOfUse_SC_03_TC_01 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application Number".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[@id='form0:dynaFormGroup']/div/div/table/tbody/tr/td/label[contains(text(),'Application Number')]/../following-sibling::td/label")
	private WebElement appnum;
	
	public void getApplicationNum() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(appnum));
		Assert.assertTrue(appnum.isDisplayed());
		HighlightOnElement(appnum);
		Assert.assertTrue(appnum.isEnabled());
		String applicationno=appnum.getText();
		excel.updateChangeOfUseID(applicationno);
	}
	
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
	/*
	 * This is the xpath of the WebElement "Make payment".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Make Payment')]")
	private WebElement makepayment;
	
	public void verifyMakePayment() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(makepayment));
		Assert.assertTrue(makepayment.isDisplayed());
		HighlightOnElement(makepayment);
	}
}
