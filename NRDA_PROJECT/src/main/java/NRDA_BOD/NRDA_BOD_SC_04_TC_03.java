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

public class NRDA_BOD_SC_04_TC_03 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "E-Governance".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Administrative Section')]")
	private WebElement adminsection;
	
	public void clickOnAdminSectionLink() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(adminsection));
		wait.until(ExpectedConditions.elementToBeClickable(adminsection));
		Assert.assertTrue(adminsection.isDisplayed());
		HighlightOnElement(adminsection);
		Assert.assertTrue(adminsection.isEnabled());
		adminsection.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "New meeting request".
	 * @author deepak.saini
	 * @since 2018-04-04
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
	 * This is the xpath of the WebElement "display list".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@class='ui-datatable-tablewrapper']/table/thead/tr)[1]/th/following-sibling::th/span")
	private List<WebElement> display;

	public void verifyDisplayList() throws InterruptedException
	{
		((JavascriptExecutor)driver).executeScript("window.scrollBy(2000,0)");
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
	}

}
