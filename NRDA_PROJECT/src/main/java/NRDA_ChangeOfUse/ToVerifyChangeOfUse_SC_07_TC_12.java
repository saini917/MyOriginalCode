package NRDA_ChangeOfUse;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyChangeOfUse_SC_07_TC_12 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "subject".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="(//div[@class='note-sheet-wrapper-left'])[1]/div/label[2]")
	private WebElement displaysubject;
	
	public void verifyDisplaySubject()
	{
		wait.until(ExpectedConditions.elementToBeClickable(displaysubject));
		Assert.assertTrue(displaysubject.isDisplayed());
		HighlightOnElement(displaysubject);
	}

}
