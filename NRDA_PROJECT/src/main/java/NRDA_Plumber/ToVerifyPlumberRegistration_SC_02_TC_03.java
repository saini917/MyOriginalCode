package NRDA_Plumber;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;

public class ToVerifyPlumberRegistration_SC_02_TC_03 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on PDF online form file".
	 * @author deepak.saini
	 * @since 2018-01-11
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'WATER AND SEWERAGE SECTION')]/preceding-sibling::span/../following-sibling::div/table/tbody/tr/td[1]/span[contains(text(),'PLUMBER REGISTRATION')]/../following-sibling::td[@class='c2']/span/a/img[@src='/NRDAuthority/javax.faces.resource/applyNow.png.xhtml?ln=img']")
	private WebElement pdffile;
	
	public void clickOnOnlineForm() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(pdffile));
		wait.until(ExpectedConditions.elementToBeClickable(pdffile));
		Assert.assertTrue(pdffile.isDisplayed());
		HighlightOnElement(pdffile);
		Assert.assertTrue(pdffile.isEnabled());
		pdffile.click();
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on plumber type drop".
	 * @author deepak.saini
	 * @since 2018-01-11
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/center/table/tbody/tr/td/span/div/div/span")
	private WebElement plumbertype;
	
	public void verifyPlumberType()
	{
		wait.until(ExpectedConditions.visibilityOf(plumbertype));
		wait.until(ExpectedConditions.elementToBeClickable(plumbertype));
		Assert.assertTrue(plumbertype.isDisplayed());
		HighlightOnElement(plumbertype);
		Actions act=new Actions(driver);
		act.click(plumbertype).build().perform();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "element".
	 * @author deepak.saini
	 * @since 2018-01-11
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li")
	private List<WebElement> element;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "button.
	 * @author deepak.saini
	 * @since 2018-01-11
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/center/table/tbody/tr/td/span/center/button/span")
	private WebElement btton;
	
	public void verifyElement() throws InterruptedException
	{
		Reporter.log("1. User will be able to view 2 options in a drop down field i.e",true);
		for(int i=1;i<element.size();i++)
		{
			String value=element.get(i).getText();
			Reporter.log(value,true);
			waitForSomeTime();
		}
		Reporter.log("along with",true);
		wait.until(ExpectedConditions.visibilityOf(btton));
		Assert.assertTrue(btton.isDisplayed());
		HighlightOnElement(btton);
		Reporter.log(btton.getText(),true);
	}
	
}
