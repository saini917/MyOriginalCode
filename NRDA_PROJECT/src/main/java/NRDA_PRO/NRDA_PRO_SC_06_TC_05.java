package NRDA_PRO;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_PRO_SC_06_TC_05 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "action ".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//form[@id='inboxForm']/div/div/div/div/div/div/div/div/table/tbody/tr/td/center/a/img[1]")
	private WebElement actionimg;
	
	public void clickOnAction() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(actionimg));
		Assert.assertTrue(actionimg.isDisplayed());
		HighlightOnElement(actionimg);
		Assert.assertTrue(actionimg.isEnabled());
		actionimg.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "template ".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Template')]")
	private WebElement template;
	
	public void clickOnTemplate() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(template));
		Assert.assertTrue(template.isDisplayed());
		HighlightOnElement(template);
		Assert.assertTrue(template.isEnabled());
		template.click();
		waitForSomeTime();
	}

}
