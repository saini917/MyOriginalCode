package NRDA_BOD;

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

public class NRDA_BOD_SC_05_TC_10 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Agenda Details".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//a[contains(text(),'Agenda Details')])[1]")
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

	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/div/div/center/div/div/table/tbody/tr/td")
	private List<WebElement> display;

	public void verifyDisplayList()
	{
		for(WebElement list:display)
		{
			if(!list.isDisplayed())
			{
				Reporter.log("Test case fail",true);
			}
			else
			{
				Assert.assertTrue(list.isDisplayed());
				HighlightOnElement(list);
			}
		}
	}

}
