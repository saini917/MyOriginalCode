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

public class ToVerifyPlumberRegistration_SC_02_TC_18 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on Registration date tab".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb']/div/div/ul/li/a[contains(text(),'Registration Date/पंजीकरण तिथि')]")
	private WebElement clickonregistrationtab;

	public void clickOnRegistrationDate() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(clickonregistrationtab));
		wait.until(ExpectedConditions.elementToBeClickable(clickonregistrationtab));
		Assert.assertTrue(clickonregistrationtab.isDisplayed());
		HighlightOnElement(clickonregistrationtab);
		Assert.assertTrue(clickonregistrationtab.isEnabled());
		clickonregistrationtab.click();
		waitForSomeTime();
		Reporter.log("Click on Registeration Date tab",true);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "date".
	 * @author deepak.saini
	 * @since 2018-01-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb']/div/div/div/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private WebElement date;
	
	@FindBy(xpath="//div[@id='form0:Nb']/div/div/div/div/div/div/div/button/span")
	private WebElement addmore;
	
	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/span)[3]/center/table/tbody/tr/td/span/button/span")
	private List<WebElement> displaylist;
	
	public void verifyDisplayLink()
	{
		wait.until(ExpectedConditions.visibilityOf(date));
		Assert.assertTrue(clickonregistrationtab.isDisplayed());
		HighlightOnElement(clickonregistrationtab);
		Assert.assertTrue(clickonregistrationtab.isEnabled());
		Reporter.log(clickonregistrationtab.getText(),true);
		
		wait.until(ExpectedConditions.visibilityOf(addmore));
		Assert.assertTrue(addmore.isDisplayed());
		HighlightOnElement(addmore);
		Assert.assertTrue(addmore.isEnabled());
		Reporter.log(addmore.getText(),true);
		
		for(WebElement list:displaylist)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
		}
		Reporter.log("User will view a field named as 'Date', back , submit , Save as draft , Reset & Close button",true);
	}
}
