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

public class ToVerifyPlumberRegistration_SC_02_TC_05 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on Applicant details tab".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb']/div/div/ul/li/a[contains(text(),'Applicant Details/आवेदक का विवरण')]")
	private WebElement clickonapplicantdetails;
	
	public void clickOnApplicantDetails()
	{
		wait.until(ExpectedConditions.visibilityOf(clickonapplicantdetails));
		wait.until(ExpectedConditions.elementToBeClickable(clickonapplicantdetails));
		Assert.assertTrue(clickonapplicantdetails.isDisplayed());
		HighlightOnElement(clickonapplicantdetails);
		Assert.assertTrue(clickonapplicantdetails.isEnabled());
		clickonapplicantdetails.click();
		Reporter.log("Click on Applicant Details form",true);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify Applicant details".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/table/tbody/tr/td)[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List<WebElement> applicantdetails;
	
	public void verifyApplicantDetails()
	{
		Reporter.log("1. User should be able to view following fields i.e",true);
		for(WebElement list:applicantdetails)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			Reporter.log(list.getText(),true);
		}
	}
	

}
