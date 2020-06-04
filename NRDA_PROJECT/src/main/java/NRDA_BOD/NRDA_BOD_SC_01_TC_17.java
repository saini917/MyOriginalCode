package NRDA_BOD;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_01_TC_17  extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "chairperson name value from dropdown".
	 * @author deepak.saini
	 * @since 2018-03-27
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='form0:Nb']/div/div/div/div[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Chairperson Name')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement selectvalue;
	
	public void selectChairpersonName() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(selectvalue));
		HighlightOnElement(selectvalue);
		Assert.assertTrue(selectvalue.isDisplayed());
		SelectVisibleText(selectvalue,"Chairman Sir");
		waitForSomeTime();
		waitForSomeTime();
	}

}
