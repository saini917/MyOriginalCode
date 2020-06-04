package NRDA_PRO;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_PRO_SC_04_TC_06 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
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
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "add".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'ADD')]")
	private WebElement add;
	
	public void clickOnAdd() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(add));
		Assert.assertTrue(add.isDisplayed());
		HighlightOnElement(add);
		Assert.assertTrue(add.isEnabled());
		add.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "display".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:panel_add_content']/table/tbody/tr/td/label")
	private List<WebElement> display;
	
	public void verifyDisplay() throws InterruptedException
	{
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
	}

}

