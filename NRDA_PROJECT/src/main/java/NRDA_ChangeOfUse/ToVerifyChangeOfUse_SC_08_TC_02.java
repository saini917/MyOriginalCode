package NRDA_ChangeOfUse;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyChangeOfUse_SC_08_TC_02 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "file number".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="(//div[@class='note-sheet-wrapper-left'])[1]/div/label[1]")
	private WebElement displayfile;
	
	public void verifyDisplayFile()
	{
		wait.until(ExpectedConditions.elementToBeClickable(displayfile));
		Assert.assertTrue(displayfile.isDisplayed());
		HighlightOnElement(displayfile);
	}
	

}
