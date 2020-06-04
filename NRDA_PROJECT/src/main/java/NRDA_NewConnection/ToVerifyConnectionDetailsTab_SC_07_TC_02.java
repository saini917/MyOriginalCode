package NRDA_NewConnection;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_07_TC_02 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Search Input box"
	 * @author deepak saini
	 * @Date: 04-01-2018
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/div/div/div/table/tbody/tr/td/span[contains(text(),'Enter Application Number :')]/../following-sibling::td/input")
	private WebElement searchinputbox;
	
	public void enterCustomerID() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(searchinputbox));
		Assert.assertTrue(searchinputbox.isDisplayed());
		HighlightOnElement(searchinputbox);
		Assert.assertTrue(searchinputbox.isEnabled());
		excel.getExcelData(searchinputbox,"Customer ID",0,1);
	}
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Search button"
	 * @author deepak saini
	 * @Date: 04-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/div/div/div/table/tbody/tr/td/span[contains(text(),'Enter Application Number :')]/../following-sibling::td/input/../following-sibling::td/button/span[contains(text(),'Search')]")
	private WebElement searchbtn;
	
	public void clickOnSearchBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(searchbtn));
		wait.until(ExpectedConditions.elementToBeClickable(searchbtn));
		Assert.assertTrue(searchbtn.isDisplayed());
		HighlightOnElement(searchbtn);
		Assert.assertTrue(searchbtn.isEnabled());
		searchbtn.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "click on Water And Sewerage connection"
	 * @author deepak saini
	 * @Date: 04-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/div/div/h3/a[contains(text(),'WATER AND SEWERAGE CONNECTION')]/preceding-sibling::span")
	private WebElement waterandsewerage;
	
	public void verifyWaterAndSewerageConnExist()
	{
		wait.until(ExpectedConditions.visibilityOf(waterandsewerage));
		wait.until(ExpectedConditions.elementToBeClickable(waterandsewerage));
		Assert.assertTrue(waterandsewerage.isDisplayed());
		HighlightOnElement(waterandsewerage);
		Assert.assertTrue(waterandsewerage.isEnabled());
		Actions act=new Actions(driver);
		act.click(waterandsewerage).build().perform();
	}
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Proceed to payment"
	 * @author deepak saini
	 * @Date: 04-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/div/div/h3/a[contains(text(),'WATER AND SEWERAGE CONNECTION')]/preceding-sibling::span/../following-sibling::div/div/div/table/thead/tr/th/span/../../../following-sibling::tbody/tr/td/button/span[contains(text(),'Proceed to Payment')]")
	private WebElement proceedtopay;
	
	public void clickOnProceedToPayment() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(proceedtopay));
		wait.until(ExpectedConditions.elementToBeClickable(proceedtopay));
		Assert.assertTrue(proceedtopay.isDisplayed());
		HighlightOnElement(proceedtopay);
		Assert.assertTrue(proceedtopay.isEnabled());
		proceedtopay.click();
		Reporter.log("Click on 'Proceed to Payment'",true);
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Application Label"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/span/span/div/div/table/tbody/tr/td[1]/label")
	private List<WebElement> applicationlabel;
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "make payment"
	 * @author sarvesh.nellore
	 * @Date: 12-09-2017
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Make Payment')]")
	private WebElement makepayment;
	
	public void verifyPaymentApplicationLabel() throws InterruptedException
	{
		for(WebElement list:applicationlabel)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
		}
		HighlightOnElement(makepayment);
		Assert.assertTrue(makepayment.isDisplayed());
	}


}
