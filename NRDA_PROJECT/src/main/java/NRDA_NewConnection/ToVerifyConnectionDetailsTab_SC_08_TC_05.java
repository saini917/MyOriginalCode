package NRDA_NewConnection;

import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_08_TC_05 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Approved link".
	 * @author deepak saini
	 * @since 04-01-2018
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//form[@id='inboxForm']/div/div/div/div/div/div/div/div/table/thead/tr/th/span/../following-sibling::th/span")
	private List<WebElement> displayy;
	
	public void verifyDisp() throws InterruptedException
	{
		for(WebElement list:displayy)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			Reporter.log("Expected result:"+list.getText(),true);
			waitForSomeTime();
		}
	}
}
