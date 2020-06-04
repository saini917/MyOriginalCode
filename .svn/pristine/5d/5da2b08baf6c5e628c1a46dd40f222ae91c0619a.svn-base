package NRDA_Plumber;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;

public class ToVerifyPlumberRegistration_SC_02_TC_19 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "current date".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb']/div/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Date')]/../../../../../../following-sibling::td/table/tbody/tr/td/span/input")
	private WebElement date;

	public void getCurrentDate()
	{
		wait.until(ExpectedConditions.visibilityOf(date));
		Assert.assertTrue(date.isDisplayed());
		HighlightOnElement(date);
		Assert.assertTrue(date.isEnabled());
		String currentdate=date.getAttribute("value");
		Reporter.log(currentdate,true);

		DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();
		String systemdate= dateFormat.format(date);
		Reporter.log(systemdate,true);
		Assert.assertEquals(currentdate,systemdate,"Matched");
		
		
	}

}



