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

public class NRDA_BOD_SC_01_TC_16 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "CHAIRMAN from dropdown".
	 * @author deepak.saini
	 * @since 2018-02-14
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='form0:Nb']/div/div/div/div[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Chairperson Designation')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement chairman;
	
	public void selectCHAIRMANValue() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(chairman));
		HighlightOnElement(chairman);
		Assert.assertTrue(chairman.isDisplayed());
		SelectVisibleText(chairman,"Chairman");
		Reporter.log("Value CHAIRMAN from dropdown value is get selected",true);
		waitForSomeTime();
		waitForSomeTime();
	}

}
