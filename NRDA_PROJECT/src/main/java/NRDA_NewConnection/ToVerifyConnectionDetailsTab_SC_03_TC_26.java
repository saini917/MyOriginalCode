package NRDA_NewConnection;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_03_TC_26 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Connection for construction".
	 * @author deepak.saini
	 * @since 2018-04-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div[3]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Is Connection for Construction?')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement construction;
	
	public void selectConnectionConstructionNo() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(construction));
		wait.until(ExpectedConditions.elementToBeClickable(construction));
		Assert.assertTrue(construction.isDisplayed());
		HighlightOnElement(construction);
		Assert.assertTrue(construction.isEnabled());
		SelectVisibleText(construction,"No / नहीं");
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement " to get All field label name under connection details tab".
	 * @author deepak.saini
	 * @since 2018-04-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div[3]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List<WebElement> field_label_name;
	
	public void verifyDisplayList()
	{
		for(WebElement list:field_label_name)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
		}
	}


}
