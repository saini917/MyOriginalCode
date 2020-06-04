package NRDA_Registration;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyRegistrationPage_SC_01_TC_01 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	Logger log=Logger.getLogger("devpinoyLogger");
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on New Registration tab".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'New Registration')]")
	private WebElement new_registration;

	public void clickOnNewRegistrationField() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(new_registration));
		Assert.assertTrue(new_registration.isDisplayed());
		HighlightOnElement(new_registration);
		Assert.assertTrue(new_registration.isEnabled());
		new_registration.click();
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Register As".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/

	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/select")
	private WebElement register_as_citizen;

	public void selectRegisterAsComapany() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(register_as_citizen));
		Assert.assertTrue( register_as_citizen.isDisplayed());
		HighlightOnElement( register_as_citizen);
		Assert.assertTrue( register_as_citizen.isEnabled());
		SelectVisibleText(register_as_citizen,"Company");
		waitForSomeTime();
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Register As Architect".
	 * @author deepak.saini
	 * @since 2018-04-23
	 */
	/****************************************************************************************************/

	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/select")
	private WebElement register_as_architect;

	public void selectRegisterAsArchitect() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(register_as_architect));
		Assert.assertTrue(register_as_architect.isDisplayed());
		HighlightOnElement(register_as_architect);
		Assert.assertTrue(register_as_architect.isEnabled());
		SelectVisibleText(register_as_architect,"Architect");
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Applicant details".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/

	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span")
	private List<WebElement> registartion_details_label;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "button label".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div[1]/table[2]/tbody/tr/td/span/center/button/span")
	private List<WebElement> buttonlabel;
	public void verifDisplayList() throws InterruptedException
	{
		for(WebElement list:registartion_details_label)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
		for(WebElement list:buttonlabel)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Address details".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Address Detail')]")
	private WebElement addressdetails;
	public void clickOnAddressDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(addressdetails));
		Assert.assertTrue(addressdetails.isDisplayed());
		HighlightOnElement(addressdetails);
		Assert.assertTrue(addressdetails.isEnabled());
		addressdetails.click();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Address details".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='regForm:tabView:address']/span/table/tbody/tr/td/span")
	private List<WebElement> regis_details_label;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "button label".
	 * @author deepak.saini
	 * @since 2018-04-21
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div[2]/table[2]/tbody/tr/td/span/center/button/span")
	private List<WebElement> buttonlabel1;
	public void verifAddressDetailsList() throws InterruptedException
	{
		for(WebElement list:regis_details_label)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,400)", "");
		}
		for(WebElement list:buttonlabel1)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
	}


}
