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
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_01_TC_15 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "CHAIRMAN Detials".
	 * @author deepak.saini
	 * @since 2018-03-27
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//a[contains(text(),'Chairperson Details')]")
	private WebElement chairperson;
	
	public void clickOnChairpersonDetailsTab()
	{
		wait.until(ExpectedConditions.visibilityOf(chairperson));
		wait.until(ExpectedConditions.elementToBeClickable(chairperson));
		Assert.assertTrue(chairperson.isDisplayed());
		HighlightOnElement(chairperson);
		Assert.assertTrue(chairperson.isEnabled());
		chairperson.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Display list".
	 * @author deepak.saini
	 * @since 2018-03-27
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb']/div/div/div/div[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List<WebElement> details;
	
	public void verifyChairpersonDetails()
	{
		for(WebElement li:details)
		{
			Assert.assertTrue(li.isDisplayed());
			HighlightOnElement(li);
		}
	}

}
