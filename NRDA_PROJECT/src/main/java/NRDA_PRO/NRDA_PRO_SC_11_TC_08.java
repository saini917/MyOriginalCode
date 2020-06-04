package NRDA_PRO;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_PRO_SC_11_TC_08 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "action".
	 * @author deepak.saini
	 * @since 2018-02-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb_content']/div/div/center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/div/div/span")
	private WebElement action;
	
	public void selectActionApproved() throws InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		wait.until(ExpectedConditions.visibilityOf(action));
		Assert.assertTrue(action.isDisplayed());
		HighlightOnElement(action);
		Assert.assertTrue(action.isEnabled());
		action.click();
		selectValueFromDropdown("Approved");
		Reporter.log("select Approved from the Action",true);
		waitForSomeTime();
		
	}

}
