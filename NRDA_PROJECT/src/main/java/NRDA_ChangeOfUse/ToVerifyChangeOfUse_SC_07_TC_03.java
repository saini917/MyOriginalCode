package NRDA_ChangeOfUse;

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

public class ToVerifyChangeOfUse_SC_07_TC_03 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "My Inbox public health and engineering".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="(//p[contains(text(),'My Inbox')])[2]/following-sibling::span/a")
	private WebElement inbox;
	
	public void clickOnMyInbox() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(inbox));
		Assert.assertTrue(inbox.isDisplayed());
		HighlightOnElement(inbox);
		Assert.assertTrue(inbox.isEnabled());
		inbox.click();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/*****************************************************************************************************/

	/*
 * This is the xpath of the WebElement "Pagination".
 * @author deepak.saini
 * @since 2018-04-17
 */
/*****************************************************************************************************/
@FindBy(xpath="//div[@id='inboxForm:applicationStatus']/div/div/div/div/div/table/tbody/tr/td[1]")
private List<WebElement> navigation;

@FindBy(xpath="(//span[@class='ui-paginator-pages'])[1]")
//private List<WebElement> paginationpage;
private WebElement paginationpage;

@FindBy(xpath="(//span[@class='ui-icon ui-icon-seek-next'])[1]")
private WebElement next;

@FindBy(xpath="//div[@id='inboxForm:applicationStatus']/div/div/div/div/div/table/tbody/tr/td/center/a/img")
private List<WebElement> actionimg;

public void verifyNavigation()
{
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,430)", "");

	for(WebElement list:navigation)
	{
		HighlightOnElement(list);
		String li=list.getText();
		int result = Integer.parseInt(li);			
		System.out.println(result);
	}
	for(WebElement act:actionimg)
	{
		Assert.assertTrue(act.isDisplayed());
		HighlightOnElement(act);
	}
	HighlightOnElement(paginationpage);
	String allpagescount=paginationpage.getText();
	int page = Integer.parseInt(allpagescount);			
	System.out.println(page);
}

/****************************************************************************************************/
/*
 * This is the xpath of the WebElement "pagination forward page 1".
 * @author deepak.saini
 * @since 2018-04-17
 */
/*****************************************************************************************************/

@FindBy(xpath="//span[@class='ui-paginator-pages']/span[contains(text(),'1')]")
private WebElement page1;

public void clickOnPage1() throws InterruptedException
{
	wait.until(ExpectedConditions.visibilityOf(page1));
	Assert.assertTrue(page1.isDisplayed());
	HighlightOnElement(page1);
	Assert.assertTrue(page1.isEnabled());
	if(!page1.isEnabled())
	{
		Reporter.log("Test case fail",true);
	}
	else
	{
		page1.click();
		waitForSomeTime();
		Reporter.log("Test case pass",true);
	}
}

/****************************************************************************************************/
/*
 * This is the xpath of the WebElement "pagination forward page 2".
 * @author deepak.saini
 * @since 2018-04-17
 */
/*****************************************************************************************************/

@FindBy(xpath="//span[@class='ui-paginator-pages']/span[contains(text(),'2')]")
private WebElement page2;

public void clickOnPage2() throws InterruptedException
{
	wait.until(ExpectedConditions.visibilityOf(page2));
	Assert.assertTrue(page2.isDisplayed());
	HighlightOnElement(page2);
	Assert.assertTrue(page2.isEnabled());
	
	if(!page2.isEnabled())
	{
		Reporter.log("Test case fail",true);
	}
	else
	{
		page2.click();
		waitForSomeTime();
	}
}

/****************************************************************************************************/
/*
 * This is the xpath of the WebElement "close window".
 * @author deepak.saini
 * @since 2018-04-18
 */
/*****************************************************************************************************/
@FindBy(xpath="(//span[@class='ui-icon ui-icon-closethick'])[2]")
private WebElement windowclose;

public void clickOnClose() throws InterruptedException
{
	wait.until(ExpectedConditions.visibilityOf(windowclose));
	Assert.assertTrue(windowclose.isDisplayed());
	HighlightOnElement(windowclose);
	Assert.assertTrue(windowclose.isEnabled());
	windowclose.click();
	waitForSomeTime();
}

}
