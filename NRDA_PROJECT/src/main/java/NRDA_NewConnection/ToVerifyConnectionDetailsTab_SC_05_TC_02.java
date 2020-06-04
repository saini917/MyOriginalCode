package NRDA_NewConnection;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
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

public class ToVerifyConnectionDetailsTab_SC_05_TC_02 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "search input box"
	 * @author deepak saini
	 * @Date: 02-01-2018
	 */
	/****************************************************************************************************/	

	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/span[contains(text(),'Enter Application Number :')]/../following-sibling::td/input")
	private WebElement searchinputbox;
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "search button"
	 * @author deepak saini
	 * @Date: 02-01-2018
	 */
	/****************************************************************************************************/	

	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/div/table/tbody/tr/td/span[contains(text(),'Enter Application Number :')]/../following-sibling::td/button/span[contains(text(),'Search')]")
	private WebElement searchbtn;
	
	
	public void enterCustomerId() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(searchinputbox));
		Assert.assertTrue(searchinputbox.isDisplayed());
		HighlightOnElement(searchinputbox);
		Assert.assertTrue(searchinputbox.isEnabled());
		excel.getExcelData(searchinputbox,"Customer ID",0,1);
	}
	
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
	 * This is the xpath of the WebElement "click on submitted application drop"
	 * @author deepak saini
	 * @Date: 02-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/h3/a[contains(text(),'Submitted Applications')]/preceding-sibling::span")
	private WebElement submittedApplicationdrop;
	
	public void clickOnSubmittedApplication()
	{
		wait.until(ExpectedConditions.visibilityOf(submittedApplicationdrop));
		wait.until(ExpectedConditions.elementToBeClickable(submittedApplicationdrop));
		HighlightOnElement(submittedApplicationdrop);
		Actions act=new Actions(driver);
		act.click(submittedApplicationdrop).build().perform();
		Reporter.log("Click on submitted Applications",true);
	}
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "water and sewrage connection"
	 * @author deepak saini
	 * @Date: 02-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/h3/a[contains(text(),'Submitted Applications')]/preceding-sibling::span/../following-sibling::div/div/h3/a[contains(text(),'WATER AND SEWERAGE CONNECTION')]")
	private WebElement waterandsewerge;
	
	public void verifyWaterAndSewerageConnectionExit() throws InterruptedException
	{	
		wait.until(ExpectedConditions.visibilityOf(waterandsewerge));
		wait.until(ExpectedConditions.elementToBeClickable(waterandsewerge));
		HighlightOnElement(waterandsewerge);
		Actions act=new Actions(driver);
		act.click(waterandsewerge).build().perform();
		Reporter.log("Click on Water & Sewerage connection",true);
	}
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Action image"
	 * @author deepak saini
	 * @Date: 02-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/h3/a[contains(text(),'Submitted Applications')]/preceding-sibling::span/../following-sibling::div/div/h3/a[contains(text(),'WATER AND SEWERAGE CONNECTION')]/../following-sibling::div/div/div/table/tbody/tr/td/a/img")
	private WebElement actionimg;
	
	public void clickOnActionImg() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(actionimg));
		wait.until(ExpectedConditions.elementToBeClickable(actionimg));
		HighlightOnElement(actionimg);
		actionimg.click();
		Reporter.log("Click on Action link",true);
		waitForSomeTime();
	}
	
	@FindBy(xpath="//div[@id='form0:docAccordionPanel']/div/div/div/span")
	private List<WebElement> displaylist;
	
	public void verifyDisplayList()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,700)", "");
		for(WebElement list:displaylist)
		{
			HighlightOnElement(list);
			Assert.assertNotNull(list.isDisplayed(),"Matched");
		}
	}
}
