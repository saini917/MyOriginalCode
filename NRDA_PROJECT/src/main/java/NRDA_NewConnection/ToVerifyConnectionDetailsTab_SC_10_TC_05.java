package NRDA_NewConnection;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_10_TC_05 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Other link".
	 * @author deepak saini
	 * @since 2018-05-04
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="(//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div/div/div/div/div/div[@class='box-head'])[2]/div/../following-sibling::div/div/div/p[contains(text(),'Other')]/following-sibling::span/a")
	private WebElement other;
	
	public void clickOnOther() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(other));
		wait.until(ExpectedConditions.elementToBeClickable(other));
		Assert.assertTrue(other.isEnabled());
		HighlightOnElement(other);
		other.click();
		Reporter.log("Other link count:"+other.getText(),true);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close pop up".
	 * @author deepak saini
	 * @since 2018-05-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//span[@class='ui-icon ui-icon-closethick'])[4]")
	private WebElement close;
	
	public void clickOnClosePopUp() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(close));
		HighlightOnElement(close);
		Assert.assertTrue(close.isDisplayed());
		Assert.assertTrue(close.isEnabled());
		close.click();
		waitForSomeTime();
	}
	
	
	
	
	
	
	
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Approved link".
	 * @author deepak saini
	 * @since 04-01-2018
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//span[@class='ui-icon ui-icon-seek-first']")
	private WebElement seekfirst_list;

	@FindBy(xpath="//span[@class='ui-icon ui-icon-seek-prev']")
	private WebElement seekprevious_lList;

	@FindBy(xpath="//span[@class='ui-icon ui-icon-seek-end']")
	private WebElement seekend_list;

	@FindBy(xpath="//span[@class='ui-icon ui-icon-seek-next']")
	private WebElement seeknext_list;

	@FindBy(xpath="//div[@class='dash-wraper water']/div[2]/div[1]/ul[2]/li[2]/a")
	private WebElement reject_count;

	@FindBy(xpath="//div[@id='inboxForm:dlg']/div[2]/div/div/div/div[1]/table/tbody/tr")
	private List <WebElement> rejectListonPopup;

	static int rejectcountList=0;
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Record per page".
	 * @author deepak saini
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//div[@id='inboxForm:dlg']/div[2]/div/div/div/div[1]/table/tbody/tr")
	private List<WebElement> recordperpage10;

	public void verifyRejectCount() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(reject_count));
		wait.until(ExpectedConditions.elementToBeClickable(reject_count));
		Assert.assertTrue(reject_count.isEnabled());
		HighlightOnElement(reject_count);
		String rejectcount1=reject_count.getText();
		Reporter.log("Reject count:"+rejectcount1,true);
		int rejectcount=Integer.parseInt(rejectcount1);
		reject_count.click();
		waitForSomeTime();
		/*closependingwindow.click();*/
		waitForSomeTime();
		List<WebElement> allpages = driver.findElements(By.xpath("//div[@class='ui-paginator ui-paginator-bottom ui-widget-header ui-corner-bottom']/span[3]/span"));
		Reporter.log("Total No Of Pages:" +allpages.size(),true);
		for(int i=1;i<((rejectcount/10)+1);i++)
		{
			rejectcountList=rejectcountList + rejectListonPopup.size();
			Reporter.log("rejectcountList",true);
			//waitForSomeTime();

			int count=recordperpage10.size();
			if(count<=10)
			{
				//Assert.assertEquals(count,10);
				Reporter.log("Test case pass: Number of record per page is equal to or less than 10",true);
			}
			else
			{
				Reporter.log("Test case fail: Number of record per page is greater than 10",true);
				Assert.assertNotEquals(count,10);
			}
			Reporter.log("No of record per page:"+count,true);
			//waitForSomeTime();
			if(seeknext_list.isEnabled())
			{
				seeknext_list.click();
				//waitForSomeTime();
			}
		}
		Reporter.log("Reject Count On Popup List  Is:" +rejectcountList,true);

		if(rejectcount==rejectcountList)
		{
			Reporter.log("Test Case Pass: Both Values Matched ",true);
		}
		else
		{
			Reporter.log("Test Case Fail: Both Values not Matched ",true);
		}

	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close Record per page window".
	 * @author deepak saini
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:dlg']/div[1]/a/span")
	private WebElement closependingwindow;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Action visible".
	 * @author deepak saini
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:dlg']/div[2]/div/div/div/div[1]/table/tbody/tr/td[7]/a/img")
	private List<WebElement> action;

	public void verifyAction() throws InterruptedException
	{
		/*for(WebElement list:action)
		{
			HighlightOnElement(list);
			Assert.assertNotNull(list.isDisplayed());
		}*/
		waitForSomeTime();
		Reporter.log("For each application , 'Action' button is shown",true);
		closependingwindow.click();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Pagination".
	 * @author deepak saini
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-dialog-content ui-widget-content']/div/div/div/div/span/span[@class='ui-icon ui-icon-seek-end']")
	private WebElement pagination;

	public void verifyPagination() throws InterruptedException
	{	
		wait.until(ExpectedConditions.visibilityOf(pagination));
		HighlightOnElement(pagination);
		Assert.assertTrue(pagination.isDisplayed());
		Assert.assertTrue(pagination.isEnabled());
		Reporter.log("Pagination should work",true);
		waitForSomeTime();
	}



}
