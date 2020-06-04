package NRDA_NewConnection;

import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_11_TC_01 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "display"
	 * @author deepak saini
	 * @Date: 04-01-2018
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div/div/div/div/div/span/div[1]/div/label")
	private WebElement disp;
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/div/center/table/tbody/tr/td/label")
	private List<WebElement> display;
	
	@FindBy(xpath="(//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/div/center/table/tbody/tr/td/span)[4]")
	private WebElement display1;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on dropdown".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div/div/center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/div/div/span")
	private WebElement clickonselectactiondrop;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select value".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset'])[1]/li")
	private List<WebElement> selectdropdownvalue;
	
	
	public void displayList() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,500)", "");
		
		HighlightOnElement(disp);
		Assert.assertTrue(disp.isDisplayed());
		
		for(WebElement list:display)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			waitForSomeTime();
		}
		
		wait.until(ExpectedConditions.visibilityOf(display1));
		HighlightOnElement(display1);
		Assert.assertTrue(display1.isDisplayed());
		
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		clickonselectactiondrop.click();
		waitForSomeTime();
		
		for(int i=1;i<selectdropdownvalue.size();i++)
		{
			String value=selectdropdownvalue.get(i).getText();
			Reporter.log("Expected result:"+value,true);
			waitForSomeTime();
		}
	}
	
}
