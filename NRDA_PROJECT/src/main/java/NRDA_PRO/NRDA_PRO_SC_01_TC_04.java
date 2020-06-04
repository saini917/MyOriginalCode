package NRDA_PRO;

import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;

public class NRDA_PRO_SC_01_TC_04 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application form".
	 * @author deepak.saini
	 * @since 2018-05-07
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'eGovernance')]/preceding-sibling::span/../following-sibling::div/ul/li/a/span[contains(text(),'Application Form')]")
	private WebElement applicationform;
	
	public void clickOnApplicationForm() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(applicationform));
		wait.until(ExpectedConditions.elementToBeClickable(applicationform));
		Assert.assertTrue(applicationform.isDisplayed());
		HighlightOnElement(applicationform);
		Assert.assertTrue(applicationform.isEnabled());
		applicationform.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "public relation office".
	 * @author deepak.saini
	 * @since 2018-05-07
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/table/tbody/tr/td/div/h3/a[contains(text(),'Public Relation Office')]/preceding-sibling::span")
	private WebElement publicrelationoffice;
	
	public void clickOnPubRelationOffice()
	{
		wait.until(ExpectedConditions.visibilityOf(publicrelationoffice));
		wait.until(ExpectedConditions.elementToBeClickable(publicrelationoffice));
		Assert.assertTrue(publicrelationoffice.isDisplayed());
		HighlightOnElement(publicrelationoffice);
		Assert.assertTrue(publicrelationoffice.isEnabled());
		Actions act=new Actions(driver);
		act.click(publicrelationoffice).build().perform();
	}
	
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "advertisement and publication".
	 * @author deepak.saini
	 * @since 2018-05-07
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/table/tbody/tr/td/div/h3/a[contains(text(),'Public Relation Office')]/preceding-sibling::span/../following-sibling::div/table/tbody/tr/td/span[contains(text(),'ADVERTISEMENT AND PUBLICATION')]/../following-sibling::td/span/a/img")
	private WebElement advandpublication;
	
	public void clickOnAdvAndPublication() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(advandpublication));
		wait.until(ExpectedConditions.elementToBeClickable(advandpublication));
		Assert.assertTrue(advandpublication.isDisplayed());
		HighlightOnElement(advandpublication);
		Assert.assertTrue(advandpublication.isEnabled());
		advandpublication.click();
		waitForSomeTime();
	}
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/table/tbody/tr/td/span")
	private List<WebElement> display;
	
	public void verifyDisplay()
	{
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
	}
}
