package NRDA_NewConnection;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_06_TC_03 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "delete"
	 * @author deepak saini
	 * @Date: 03-01-2018
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="(//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/div/h3/a[contains(text(),'Drafted Applications')]/preceding-sibling::span/../following-sibling::div/div/h3/a[contains(text(),'WATER AND SEWERAGE CONNECTION')]/../following-sibling::div/div/div/div/table/tbody/tr/td/button/span[contains(text(),'Delete')])[1]")
	private WebElement delete;
	

	/****************************************************************************************************/
	/**
	 * This is the xpath of the WebElement "Error Message"
	 * @author deepak saini
	 * @Date: 02-01-2018
	 */
	/****************************************************************************************************/	
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Record has been deleted')]")
	private WebElement errormsg;
	
	public void clickOnDeleteBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(delete));
		wait.until(ExpectedConditions.elementToBeClickable(delete));
		Assert.assertTrue(delete.isEnabled());
		delete.click();
		Reporter.log(" Click on Delete button",true);
		Reporter.log("The drafted application should get deleted successfully.",true);
		waitForSomeTime();
		
		HighlightOnElement(errormsg);
		String Actual="Record has been deleted";
		String Expected=errormsg.getText();
		Assert.assertEquals(Expected,Actual,"Matched");
		Reporter.log(Expected,true);
		waitForSomeTime();
	}

}
