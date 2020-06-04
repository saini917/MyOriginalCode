package NRDA_NewConnection;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_09_TC_12 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "MAP".
	 * @author deepak saini
	 * @since 06-01-2018
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div/div/center/table/tbody/tr/td/a/span[contains(text(),'View Property Map')]")
	private WebElement map;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close pop up".
	 * @author deepak saini
	 * @since 06-01-2018
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Dlg']/div/a/span")
	private WebElement closepopup;
	
	public void clickOnMap() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(map));
		wait.until(ExpectedConditions.elementToBeClickable(map));
		Assert.assertTrue(map.isDisplayed());
		HighlightOnElement(map);
		Assert.assertTrue(map.isEnabled());
		map.click();
		Reporter.log("Click on Property Map link",true);
		waitForSomeTime();
		Reporter.log("User should be able to view the Map",true);
		
		wait.until(ExpectedConditions.visibilityOf(closepopup));
		wait.until(ExpectedConditions.elementToBeClickable(closepopup));
		Assert.assertTrue(closepopup.isDisplayed());
		HighlightOnElement(closepopup);
		Assert.assertTrue(closepopup.isEnabled());
		closepopup.click();
		waitForSomeTime();
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Action image".
	 * @author deepak saini
	 * @since 2017-09-21
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//form[@id='inboxForm']/div/div/div/div/div/div/div/div/table/tbody/tr/td/center/a/img")
	private WebElement actionimg;

	public void clickOnActionImg() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(actionimg));
		wait.until(ExpectedConditions.elementToBeClickable(actionimg));
		Assert.assertTrue(actionimg.isDisplayed());
		HighlightOnElement(actionimg);
		Assert.assertTrue(actionimg.isEnabled());
		actionimg.click();
		Reporter.log("Click on 'Action' icon link shown in Pending Application Record",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div/div/center/table/tbody/tr/td/label")
	private List<WebElement> actioncommentlabel;

	@FindBy(xpath="(//div[@id='inboxForm:Nb']/div/div/div/center/table/tbody/tr/td/span)[3]")
	private WebElement uploaddocumentlabel;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on dropdown".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div/div/center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/div/div/span")
	private WebElement clickonselectactiondrop;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select value".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset'])[4]/li")
	private List<WebElement> selectdropdownvalue;


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "button".
	 * @author deepak saini
	 * @since 2017-09-22
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/center/button/span")
	private List<WebElement> button;

	public void verifyDisplayList() throws InterruptedException
	{
		for(WebElement list:actioncommentlabel)	
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			waitForSomeTime();
			Reporter.log("Expected result:"+list.getText(),true);
		}
		
		wait.until(ExpectedConditions.visibilityOf(uploaddocumentlabel));
		Assert.assertTrue(uploaddocumentlabel.isDisplayed());
		HighlightOnElement(uploaddocumentlabel);
		Reporter.log("Expected result:"+uploaddocumentlabel.getText(),true);
		
		wait.until(ExpectedConditions.visibilityOf(clickonselectactiondrop));
		wait.until(ExpectedConditions.elementToBeClickable(clickonselectactiondrop));
		Assert.assertTrue(clickonselectactiondrop.isDisplayed());
		HighlightOnElement(clickonselectactiondrop);
		Assert.assertTrue(clickonselectactiondrop.isEnabled());
		clickonselectactiondrop.click();
		waitForSomeTime();
		
		for(int i=1;i<selectdropdownvalue.size();i++)
		{
			String value=selectdropdownvalue.get(i).getText();
			Reporter.log("Expected result:"+value,true);
			waitForSomeTime();
		}
		
		for(int i=0;i<button.size();i++)
		{
			String value=button.get(i).getText();
			Reporter.log("Expected result:"+value,true);
			waitForSomeTime();
		}
	}


}