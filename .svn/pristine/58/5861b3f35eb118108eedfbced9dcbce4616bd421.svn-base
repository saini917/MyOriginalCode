package NRDA_Plumber;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;

public class ToVerifyPlumberRegistration_SC_02_TC_14 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on Education details tab".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb']/div/div/ul/li/a[contains(text(),'Education Details/Experience/शिक्षा का विवरण / अनुभव')]")
	private WebElement clickoneducationdetails;

	public void clickOnEducationDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(clickoneducationdetails));
		wait.until(ExpectedConditions.elementToBeClickable(clickoneducationdetails));
		Assert.assertTrue(clickoneducationdetails.isDisplayed());
		HighlightOnElement(clickoneducationdetails);
		Assert.assertTrue(clickoneducationdetails.isEnabled());
		clickoneducationdetails.click();
		waitForSomeTime();
		Reporter.log("Click on Education Details form",true);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify Applicant details".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/table/tbody/tr/td)[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List<WebElement> educationdetails;

	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/table/tbody/tr/td)[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Name of Course')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement nameofcourselist;

	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/span)[2]/center/table/tbody/tr/td/span/button/span")
	private List<WebElement> educationdetails1;


	public void verifyEducationDetails()
	{
		Reporter.log("1. User should be able to view following fields i.e",true);
		for(WebElement list:educationdetails)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			Reporter.log(list.getText(),true);
		}
		getValueFromDropDown(nameofcourselist);
		
		for(WebElement list1:educationdetails1)
		{
			HighlightOnElement(list1);
			Assert.assertTrue(list1.isDisplayed());
		}
		Reporter.log("Along with 'Save as Draft' , 'Reset', 'Close' , 'Next' , 'Back' button",true);
	}
}
