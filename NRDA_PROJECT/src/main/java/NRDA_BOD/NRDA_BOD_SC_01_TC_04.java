package NRDA_BOD;

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

public class NRDA_BOD_SC_01_TC_04 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify Application link".
	 * @author deepak.saini
	 * @since 2018-02-13
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'eGovernance')]/../following-sibling::div/ul/li/a/span[contains(text(),'Application Form')]")
	private WebElement applicationlink;
	
	public void clickOnApplicationFormLink() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(applicationlink));
		wait.until(ExpectedConditions.elementToBeClickable(applicationlink));
		Assert.assertTrue(applicationlink.isDisplayed());
		HighlightOnElement(applicationlink);
		Assert.assertTrue(applicationlink.isEnabled());
		applicationlink.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify Meeting Management".
	 * @author deepak.saini
	 * @since 2017-02-13
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/table/tbody/tr/td/div/h3/a[contains(text(),'MEETING MANAGEMENT')]/preceding-sibling::span")
	private WebElement meetingmangement;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify Display Link".
	 * @author deepak.saini
	 * @since 2018-02-13
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/table/tbody/tr/td/div/h3/a[contains(text(),'MEETING MANAGEMENT')]/preceding-sibling::span/../following-sibling::div[1]/table/tbody/tr/td[@class='c1']/span")
	private List<WebElement> verifylink;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify Display Link".
	 * @author deepak.saini
	 * @since 2018-03-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/table/tbody/tr/td/div/h3/a")
	private List<WebElement> verifylinks;
	
	public void verifyApplicationFormlink()
	{
		Reporter.log("System will display the Following Link :",true);
		for(WebElement link:verifylinks)
		{
			Assert.assertTrue(link.isDisplayed());
			HighlightOnElement(link);
			String display=link.getText();
			Reporter.log(display,true);
		}
	}
}
