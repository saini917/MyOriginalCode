package NRDA_BOD;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;

public class NRDA_BOD_SC_02_TC_04 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "New meeting request".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Administrative Section')]/../following-sibling::div/ul/li/a/span[contains(text(),'NEW MEETING REQUEST')]")
	private WebElement request;

	public void clickOnNewMeetingReq() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(request));
		wait.until(ExpectedConditions.elementToBeClickable(request));
		Assert.assertTrue(request.isDisplayed());
		HighlightOnElement(request);
		Assert.assertTrue(request.isEnabled());
		request.click();
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Navigation".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="(//div[@class='ui-datatable-tablewrapper'])[1]/table/tbody/tr/td[1]")
	private List<WebElement> navigation;


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Pagination".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//span[@class='ui-paginator-pages'])[1]")
	//private List<WebElement> paginationpage;
	private WebElement paginationpage;

	@FindBy(xpath="(//span[@class='ui-icon ui-icon-seek-next'])[1]")
	private WebElement next;


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
		HighlightOnElement(paginationpage);
		String allpagescount=paginationpage.getText();
		int page = Integer.parseInt(allpagescount);			
		System.out.println(page);
	}

}


