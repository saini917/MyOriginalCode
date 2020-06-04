package NRDA_BOD;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_09_TC_09 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select user".
	 * @author deepak.saini
	 * @since 2018-04-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@id='inboxForm:childRspDia']/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td[2]/div)[2]/div/span")
	private WebElement user;
	
	public void selectUser() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(user));
		wait.until(ExpectedConditions.elementToBeClickable(user));
		Assert.assertTrue(user.isDisplayed());
		HighlightOnElement(user);
		Assert.assertTrue(user.isEnabled());
		user.click();
		selectValueFromDropdown("Anil yadav");
		waitForSomeTime();
	}


}
