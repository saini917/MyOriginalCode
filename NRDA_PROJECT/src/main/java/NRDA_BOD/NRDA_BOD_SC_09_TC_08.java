package NRDA_BOD;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_09_TC_08 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select dept.".
	 * @author deepak.saini
	 * @since 2018-04-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@id='inboxForm:childRspDia']/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td[2]/div)[1]/div/span")
	private WebElement dept;
	
	public void selectDept() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(dept));
		wait.until(ExpectedConditions.elementToBeClickable(dept));
		Assert.assertTrue(dept.isDisplayed());
		HighlightOnElement(dept);
		Assert.assertTrue(dept.isEnabled());
		dept.click();
		selectValueFromDropdown("Public Health and Engineering");
		waitForSomeTime();
	}

}
