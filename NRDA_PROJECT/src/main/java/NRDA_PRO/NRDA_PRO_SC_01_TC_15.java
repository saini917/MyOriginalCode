package NRDA_PRO;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;

public class NRDA_PRO_SC_01_TC_15  extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Note Sheet".
	 * @author deepak.saini
	 * @since 2018-05-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Note Sheet / नोट शीट')]")
	private WebElement notesheet;
	
	public void clickOnNoteSheet()
	{
		wait.until(ExpectedConditions.visibilityOf(notesheet));
		wait.until(ExpectedConditions.elementToBeClickable(notesheet));
		Assert.assertTrue(notesheet.isDisplayed());
		HighlightOnElement(notesheet);
		Assert.assertTrue(notesheet.isEnabled());
		notesheet.click();
	}
	
	@FindBy(xpath="//center/table/tbody/tr/td/label")
	private List<WebElement> display;
	
	@FindBy(xpath="//center/table/tbody/tr/td/span[contains(text(),'Upload Document')]")
	private WebElement display1;
	
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/center/button/span")
	private List<WebElement> display2;
	
	public void verifyDisplay()
	{
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
		
		Assert.assertTrue(display1.isDisplayed());
		HighlightOnElement(display1);
		
		for(WebElement list:display2)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
	}

}
