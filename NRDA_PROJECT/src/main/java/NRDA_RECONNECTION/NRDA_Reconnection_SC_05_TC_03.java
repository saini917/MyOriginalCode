package NRDA_RECONNECTION;

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

public class NRDA_Reconnection_SC_05_TC_03 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Reconnection of water supply".
	 * @author deepak saini
	 * @since 2018-05-08
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span/../following-sibling::div/ul/li/a/span[contains(text(),'RECONNECTION OF WATER SUPPLY')]")
	private WebElement reconnection;
	
	public void clickOnReconnection() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(reconnection));
		wait.until(ExpectedConditions.elementToBeClickable(reconnection));
		Assert.assertTrue(reconnection.isDisplayed());
		HighlightOnElement(reconnection);
		Assert.assertTrue(reconnection.isEnabled());
		reconnection.click();
		Reporter.log("Click on Reconnection of water supply link",true);
		waitForSomeTime();
	}
	
	@FindBy(xpath="//form[@id='inboxForm']/div/div/div/div/div/div/div/div/table/thead/tr/th/span/../following-sibling::th/span")
	private List<WebElement> displayy;
	
	public void verifyDisp() throws InterruptedException
	{
		for(WebElement list:displayy)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			Reporter.log("Expected result:"+list.getText(),true);
			waitForSomeTime();
		}
	}


}
