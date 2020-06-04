package NRDA_RECONNECTION;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_Reconnection_SC_01_TC_02 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "applicant details".
	 * @author deepak.saini
	 * @since 2018-05-07
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='form0:tabView']/ul/li/a[contains(text(),'Applicant Details/आवेदक का विवरण')]")
	private WebElement applicantdetails;
	
	public void clickOnApplicantDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(applicantdetails));
		Assert.assertTrue(applicantdetails.isDisplayed());
		Assert.assertTrue(applicantdetails.isEnabled());
		HighlightOnElement(applicantdetails);
		applicantdetails.click();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "connection details".
	 * @author deepak.saini
	 * @since 2018-05-07
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='form0:tabView']/ul/li/a[contains(text(),'Connection Details/कनेक्शन विवरण')]")
	private WebElement connectiondetails;
	
	public void clickOnConnectionDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(connectiondetails));
		Assert.assertTrue(connectiondetails.isDisplayed());
		Assert.assertTrue(connectiondetails.isEnabled());
		HighlightOnElement(connectiondetails);
		connectiondetails.click();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "building details".
	 * @author deepak.saini
	 * @since 2018-05-07
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='form0:tabView']/ul/li/a[contains(text(),'Building Details/बिल्डिंग विवरण')]")
	private WebElement buildingdetails;
	
	public void clickOnBuildingDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(buildingdetails));
		Assert.assertTrue(buildingdetails.isDisplayed());
		Assert.assertTrue(buildingdetails.isEnabled());
		HighlightOnElement(buildingdetails);
		buildingdetails.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

}
