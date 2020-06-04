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

public class ToVerifyConnectionDetailsTab_SC_06_TC_01 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "click on save as draft"
	 * @author deepak saini
	 * @Date: 03-01-2018
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="(//button/span[contains(text(),'Save As Draft')])[4]")
	private WebElement saveasdraft;

	public void clickOnSaveAsDraftBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(saveasdraft));
		wait.until(ExpectedConditions.elementToBeClickable(saveasdraft));
		HighlightOnElement(saveasdraft);
		saveasdraft.click();
		Reporter.log("Click on 'Save as draft'",true);
		waitForSomeTime();
	}
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
	/**
	 * This is the xpath of the WebElement "click on submitted application drop"
	 * @author deepak saini
	 * @Date: 02-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/h3/a[contains(text(),'Drafted Applications')]/preceding-sibling::span")
	private WebElement draftApplicationdrop;

	public void clickOnDraftedApplication()
	{
		wait.until(ExpectedConditions.visibilityOf(draftApplicationdrop));
		wait.until(ExpectedConditions.elementToBeClickable(draftApplicationdrop));
		HighlightOnElement(draftApplicationdrop);
		Actions act=new Actions(driver);
		act.click(draftApplicationdrop).build().perform();
		Reporter.log("Click on Drafted Applications",true);
	}
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "water and sewrage connection"
	 * @author deepak saini
	 * @Date: 02-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/h3/a[contains(text(),'Drafted Applications')]/preceding-sibling::span/../following-sibling::div/div/h3/a[contains(text(),'WATER AND SEWERAGE CONNECTION')]")
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
	 * This is the xpath of the WebElement "button"
	 * @author deepak saini
	 * @Date: 02-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/h3/a[contains(text(),'Drafted Applications')]/preceding-sibling::span/../following-sibling::div/div/h3/a[contains(text(),'WATER AND SEWERAGE CONNECTION')]/../following-sibling::div/div/div/div/table/tbody/tr/td/button/span")
	private List<WebElement> verifyfield;
	
	public void verifyDisplayField()
	{
		for(WebElement list:verifyfield)
		{
			HighlightOnElement(list);
			Assert.assertNotNull(list.isDisplayed());
		}
		Reporter.log("Check that citizen is able to view it's drafted application under 'Draft Applications' menu. \n Check that two buttons are shown i.e Proceed & 'Delete'",true);
	}
}

