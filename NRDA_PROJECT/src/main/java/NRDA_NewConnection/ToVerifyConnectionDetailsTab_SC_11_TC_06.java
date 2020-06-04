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

public class ToVerifyConnectionDetailsTab_SC_11_TC_06 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Display list".
	 * @author deepak saini
	 * @since 2017-01-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div/div/center/table/tbody/tr/td/label")
	private List<WebElement> display;

	@FindBy(xpath="(//div[@id='inboxForm:Nb']/div/div/div/center/table/tbody/tr/td/span)[4]")
	private WebElement upload;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on dropdown".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div/div/center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/div/div/span")
	private WebElement clickonselectactiondrop1;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select value".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset'])[1]/li")
	private List<WebElement> selectdropdownvalue1;

	public void displayList() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,330)", "");
		
		for(WebElement list:display)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			waitForSomeTime();
		}

		wait.until(ExpectedConditions.visibilityOf(upload));
		HighlightOnElement(upload);
		Assert.assertTrue(upload.isDisplayed());
	}	

	public void selectUserMeterInstallation() throws InterruptedException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");

		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop1));
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop1));
		Assert.assertTrue(clickonselectactiondrop1.isDisplayed());
		HighlightOnElement(clickonselectactiondrop1);
		Assert.assertTrue(clickonselectactiondrop1.isEnabled());
		clickonselectactiondrop1.click();
		waitForSomeTime();
		for(int i=0;i<selectdropdownvalue1.size();i++)
		{
			String value=selectdropdownvalue1.get(i).getText();
			Reporter.log(value,true);
		}
	}

}
