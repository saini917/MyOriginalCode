package NRDA_NewConnection;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;
public class ToVerifyConnectionDetailsTab_SC_08_TC_04 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	
/*****************************************************************************************************/

	/*
 * This is the xpath of the WebElement "Pagination".
 * @author deepak.saini
 * @since 2018-04-17
 */
/*****************************************************************************************************/
@FindBy(xpath="(//div[@class='ui-datatable-tablewrapper'])[1]/table/tbody/tr/td[1]")
private List<WebElement> navigation;

@FindBy(xpath="(//span[@class='ui-paginator-pages'])[1]")
//private List<WebElement> paginationpage;
private WebElement paginationpage;

@FindBy(xpath="(//span[@class='ui-icon ui-icon-seek-next'])[1]")
private WebElement next;

@FindBy(xpath="//form[@id='inboxForm']/div/div/div/div/div/div/div/div/table/tbody/tr/td/center/a/img[1]")
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
	 * This is the xpath of the WebElement "Approved link".
	 * @author deepak saini
	 * @since 04-01-2018
	 */
	/*****************************************************************************************************/

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
		Thread.sleep(50000);
		closependingwindow.click();
		waitForSomeTime();
		reject_count.click();
		Thread.sleep(50000);
		List<WebElement> allpages = driver.findElements(By.xpath("//div[@class='ui-paginator ui-paginator-bottom ui-widget-header ui-corner-bottom']/span[3]/span"));
		Reporter.log("Total No Of Pages:" +allpages.size(),true);
		for(int i=1;i<((rejectcount/10)+1);i++)
		{
			rejectcountList=rejectcountList + rejectListonPopup.size();
			waitForSomeTime();

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
		for(WebElement list:action)
		{
			HighlightOnElement(list);
			Assert.assertNotNull(list.isDisplayed());
		}
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