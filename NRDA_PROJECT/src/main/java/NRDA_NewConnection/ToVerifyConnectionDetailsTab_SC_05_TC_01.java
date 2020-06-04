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

public class ToVerifyConnectionDetailsTab_SC_05_TC_01 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	

	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Application Status"
	 * @author deepak saini
	 * @Date: 02-01-2018
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='leftCol']/span/div/div/div/ul/li/a[contains(text(),'Application Status/आवेदन की स्थिति')]")
	private WebElement applicationstatus;
	
	public void clickOnApplicationStatus() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(applicationstatus));
		wait.until(ExpectedConditions.elementToBeClickable(applicationstatus));
		HighlightOnElement(applicationstatus);
		applicationstatus.click();
		waitForSomeTime();
		Reporter.log("Click on Application Status menu",true);
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
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "display element"
	 * @author deepak saini
	 * @Date: 02-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/h3/a[contains(text(),'Submitted Applications')]/preceding-sibling::span/../following-sibling::div/div/h3/a[contains(text(),'WATER AND SEWERAGE CONNECTION')]/../following-sibling::div/div/div/table/thead/tr/th/span")
	private List<WebElement> displaylist;
	
	public void verifyDisplayList()
	{
		for(WebElement list:displaylist)
		{
			HighlightOnElement(list);
			Assert.assertNotNull(list.isDisplayed());
		}
		Reporter.log("User should be able to view the  Applicant Details :- \n Serial Number \n Application Date \n Applicant Name \n Application Number \n Application Status\n Action",true);
	}
}
