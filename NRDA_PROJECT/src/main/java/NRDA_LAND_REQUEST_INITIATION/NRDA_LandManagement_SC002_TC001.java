package NRDA_LAND_REQUEST_INITIATION;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC002_TC001 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "EGovernanace".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//form)[2]/div/div/h3/a[contains(text(),'eGovernance')]/preceding-sibling::span")
	private WebElement egovernance;
	
	public void clickOnEGovernance() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(egovernance));
		Assert.assertTrue(egovernance.isDisplayed());
		HighlightOnElement(egovernance);
		Assert.assertTrue(egovernance.isEnabled());
		Actions egov=new Actions(driver);
		egov.click(egovernance).build().perform();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "display".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//form)[2]/div/div[1]/div/ul/li/a/span")
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
