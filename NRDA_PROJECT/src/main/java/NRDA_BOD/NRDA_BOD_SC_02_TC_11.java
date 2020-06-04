package NRDA_BOD;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_02_TC_11 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Subject number".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//span[contains(text(),'Subject : ')]/following-sibling::label")
	private WebElement subjectno;
	
	public void verifySubjectNo()
	{
		Assert.assertTrue(subjectno.isDisplayed());
		HighlightOnElement(subjectno);
	}

}
