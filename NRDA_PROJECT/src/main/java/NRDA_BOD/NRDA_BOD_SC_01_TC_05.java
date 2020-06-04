package NRDA_BOD;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;

public class NRDA_BOD_SC_01_TC_05 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Administrative section".
	 * @author deepak.saini
	 * @since 2017-03-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/table/tbody/tr/td/div/h3/a[contains(text(),'Administrative Section')]/preceding-sibling::span")
	private WebElement admin;
	
	public void clickOnAdministrativeSection() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(admin));
		wait.until(ExpectedConditions.elementToBeClickable(admin));
		Assert.assertTrue(admin.isDisplayed());
		HighlightOnElement(admin);
		Assert.assertTrue(admin.isEnabled());
		admin.click();
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify dispaly link".
	 * @author deepak.saini
	 * @since 2017-02-14
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/table/tbody/tr/td/div/h3/a[contains(text(),'Administrative Section')]/preceding-sibling::span/../following-sibling::div[1]/table/tbody/tr/td[@class='c1']/span")
	private List<WebElement> verifylink;
	
	public void verifyMeetingRequestlink() throws InterruptedException
	{
		Reporter.log("System will display the Following Link :",true);
		for(WebElement link:verifylink)
		{
			Assert.assertTrue(link.isDisplayed());
			HighlightOnElement(link);
			String display=link.getText();
			Reporter.log(display,true);
			waitForSomeTime();
		}
	}

}
