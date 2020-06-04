package NRDA_NewConnection;

import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_09_TC_07 extends CommonLibrary 
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
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
			Actions act=new Actions(driver);
			act.click(page1).build().perform();
			waitForSomeTime();
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
			Actions act=new Actions(driver);
			act.click(page2).build().perform();
			waitForSomeTime();
			Reporter.log("Test case pass",true);
		}
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
	 * This is the xpath of the WebElement "Pending Application".
	 * @author deepak saini
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[2]/a/span/img")
	private WebElement pendingapplication;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "New Application Label" .
	 * @author deepak saini
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div[2]/div[2]/h3/a")
	private WebElement newapplication;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "New Application menu".
	 * @author deepak saini
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div[2]/div[2]/h3/span")
	private WebElement clickonNewapplication;


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Under New Application menu".
	 * @author deepak saini
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div[2]/div[2]/div/div/h3/a")
	private List<WebElement> underNewApplicationpending;

	public void clickOnPendingApplication() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(pendingapplication));
		wait.until(ExpectedConditions.elementToBeClickable(pendingapplication));
		Assert.assertTrue(pendingapplication.isDisplayed());
		HighlightOnElement(pendingapplication);
		Assert.assertTrue(pendingapplication.isEnabled());
		pendingapplication.click();
		Reporter.log("Click on 'Pending Applications' icon",true);
		waitForSomeTime();
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "menu".
	 * @author deepak saini
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div[2]/div/h3/a")
	private List<WebElement> menu;

	public void verifyApplicationMenu() throws InterruptedException
	{
		/*clickonrtiquestion.click();*/
		for(WebElement list:menu)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			waitForSomeTime();
			Reporter.log("Expected result:"+list.getText(),true);
		}
	}

	public void verifyNewApplication()
	{

		/*clickonNewapplication.click();
		Reporter.log("New Application seen successfully",true);
		waitForSomeTime();*/

		for(WebElement menulistnewapplication:underNewApplicationpending)
		{
			if(menulistnewapplication.isDisplayed())
			{
				HighlightOnElement(menulistnewapplication);
				String pendingapplication=menulistnewapplication.getText();
				Reporter.log("Menu list under New Application:"+pendingapplication,true);
			}
		}
	}


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on RTI Question".
	 * @author deepak saini
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div[2]/div[3]/h3/span")
	private WebElement clickonrtiquestion;


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Menu under RTI Question".
	 * @author deepak saini
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div[2]/div[3]/h3/a/../following-sibling::div/div/div/table/tbody/tr/td/span")
	private List<WebElement> underrtiquestion;

	public void verifyRTIQuestion() throws InterruptedException
	{
		/*clickonpendinginstallation.click();
		waitForSomeTime();*/

		for(WebElement menulistrtiquestion:underrtiquestion)
		{
			if(menulistrtiquestion.isDisplayed())
			{
				HighlightOnElement(menulistrtiquestion);
				String rti=menulistrtiquestion.getText();
				Reporter.log("Menu list under RTI question:"+rti,true);
			}
		}
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify action".
	 * @author deepak saini
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//a/img")
	private List<WebElement> action;
	
	public void verifyAction()
	{
		for(WebElement list:action)
		{
			HighlightOnElement(list);
			Assert.assertNotNull(list.isDisplayed());
		}
		Reporter.log("Expected: Action",true);
	}
}
