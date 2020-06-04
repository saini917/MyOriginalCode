package NRDA_BOD;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_01_TC_36 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Agenda Details".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/ul/li/a[contains(text(),'Agenda Details')]")
	private WebElement agendadetails;
	
	public void clickOnAgendaDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(agendadetails));
		wait.until(ExpectedConditions.elementToBeClickable(agendadetails));
		Assert.assertTrue(agendadetails.isDisplayed());
		HighlightOnElement(agendadetails);
		Assert.assertTrue(agendadetails.isEnabled());
		agendadetails.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Agenda Details display list".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/ul/li/a[contains(text(),'Agenda Details')]/../../following-sibling::div/div/div/div/center/div/div/table/thead/tr/th/span")
	private List<WebElement> display;
	
	public void verifyDisplayList() throws InterruptedException
	{
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
			waitForSomeTime();
		}
	}

}
