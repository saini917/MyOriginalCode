package NRDA_NewConnection;

import java.io.IOException;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_07_TC_05 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "enter credit card".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='navbar1']/ul/li/a[@href='#creditcard']/../../../../following-sibling::div/div/div[2]/div/div/input[@id='ccCardNo']")
	private WebElement creditcardnum;
	
	public void enterCreditCardNumber() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(creditcardnum));
		Assert.assertTrue(creditcardnum.isDisplayed());
		HighlightOnElement(creditcardnum);
		Assert.assertTrue(creditcardnum.isEnabled());
		excel.getExcelData(creditcardnum,"CRAD DETAILS", 1,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select month".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='navbar1']/ul/li/a[@href='#creditcard']/../../../../following-sibling::div/div/div[2]/div/div/input[@id='ccCardNo']/following-sibling::select[@id='ccMonth']")
	private WebElement selectmonth;
	
	public void selectValidMonth() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(selectmonth));
		Assert.assertTrue(selectmonth.isDisplayed());
		HighlightOnElement(selectmonth);
		Assert.assertTrue(selectmonth.isEnabled());
		SelectVisibleText(selectmonth,"12");
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select year".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='navbar1']/ul/li/a[@href='#creditcard']/../../../../following-sibling::div/div/div[2]/div/div/input[@id='ccCardNo']/following-sibling::select[@id='ccYear']")
	private WebElement selectyear;
	
	public void selectValidYear() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(selectyear));
		Assert.assertTrue(selectyear.isDisplayed());
		HighlightOnElement(selectyear);
		Assert.assertTrue(selectyear.isEnabled());
		SelectVisibleText(selectyear,"2025");
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "cvv number".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='navbar1']/ul/li/a[@href='#creditcard']/../../../../following-sibling::div/div/div[2]/div/div/input[@id='ccCardNo']/following-sibling::select[@id='ccYear']/following-sibling::input[@id='ccCcv']")
	private WebElement cvv;
	
	public void enterCVVNumber() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(cvv));
		Assert.assertTrue(cvv.isDisplayed());
		HighlightOnElement(cvv);
		Assert.assertTrue(cvv.isEnabled());
		excel.getExcelData(cvv,"CRAD DETAILS",1,2);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Name of card holder".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='navbar1']/ul/li/a[@href='#creditcard']/../../../../following-sibling::div/div/div[2]/div/div/input[@id='ccCardNo']/following-sibling::select[@id='ccYear']/following-sibling::input[@id='ccCcv']/following-sibling::input[@id='ccCardName']")
	private WebElement nameofcardholder;
	
	public void enterCardNameHolder() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(nameofcardholder));
		Assert.assertTrue(nameofcardholder.isDisplayed());
		HighlightOnElement(nameofcardholder);
		Assert.assertTrue(nameofcardholder.isEnabled());
		excel.getExcelData(nameofcardholder,"CRAD DETAILS", 1,3);
		
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Pay now".
	 * @author deepak.saini
	 * @since 2018-04-12
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div/input[@id='paymentProcess']")
	private WebElement paynow;
	
	public void clickOnPayNow() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(paynow));
		Assert.assertTrue(paynow.isDisplayed());
		HighlightOnElement(paynow);
		Assert.assertTrue(paynow.isEnabled());
		paynow.click();
		waitForSomeTime();
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Simulate transaction".
	 * @author deepak.saini
	 * @since 2018-04-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@value='Simulate Transaction']")
	private WebElement simulate;
	
	public void clickOnSimulate()
	{
		wait.until(ExpectedConditions.visibilityOf(simulate));
		Assert.assertTrue(simulate.isDisplayed());
		HighlightOnElement(simulate);
		Assert.assertTrue(simulate.isEnabled());
		simulate.click();
		acceptAlert();
		acceptAlert();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "display list".
	 * @author deepak.saini
	 * @since 2018-04-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div/table/tbody/tr")
	private List<WebElement> display;
	
	public void verifyDisplayWindow()
	{
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "get application number".
	 * @author deepak.saini
	 * @since 2018-04-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div/table/tbody/tr/td/label[contains(text(),'Application Number')]/../following-sibling::td/label")
	private WebElement appnum;
	
	public void getApplicationNum() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(appnum));
		Assert.assertTrue(appnum.isDisplayed());
		HighlightOnElement(appnum);
		Assert.assertTrue(appnum.isEnabled());
		String appno=appnum.getText();
		excel.updateChangeOfUseID(appno);
	}
}
