package NRDA_NewConnection;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_09_TC_03 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "public health and engineering"
	 * @author deepak saini
	 * @Date:2018-05-04
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span")
	private WebElement publichealth;

	public void clickOnPublicHealthAndEng() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(publichealth));
		wait.until(ExpectedConditions.elementToBeClickable(publichealth));
		Assert.assertTrue(publichealth.isDisplayed());
		HighlightOnElement(publichealth);
		Assert.assertTrue(publichealth.isEnabled());
		publichealth.click();
		Reporter.log("Click on Public health and Engineering link",true);
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "display link"
	 * @author deepak saini
	 * @Date:2018-05-04
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span/../following-sibling::div/ul/li/a/span")
	private List<WebElement> displaylink;
	
	public void verifyDisplayLink() throws InterruptedException
	{
		for(WebElement list:displaylink)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			Reporter.log(list.getText(),true);
		}
		waitForSomeTime();
	}

}
