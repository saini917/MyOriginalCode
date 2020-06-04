package NRDA_BOD;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_01_TC_23 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "financial year".
	 * @author deepak.saini
	 * @since 2017-02-14
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/div/div[3]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Select financial year')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement finyear;
	
	public void selectFinYear() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(finyear));
		Assert.assertTrue(finyear.isDisplayed());
		HighlightOnElement(finyear);
		Assert.assertTrue(finyear.isEnabled());
		SelectVisibleText(finyear,"2017-18");
		Reporter.log("Select the Finicial Year",true);
	}

}
