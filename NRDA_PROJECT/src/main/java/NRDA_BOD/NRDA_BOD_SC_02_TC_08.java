package NRDA_BOD;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_02_TC_08 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Agenda Details".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//li/a[contains(text(),'Agenda Details')])[1]")
	private WebElement agendadetails;
	
	public void clickOnAgendaDetails()
	{
		wait.until(ExpectedConditions.visibilityOf(agendadetails));
		wait.until(ExpectedConditions.elementToBeClickable(agendadetails));
		Assert.assertTrue(agendadetails.isDisplayed());
		HighlightOnElement(agendadetails);
		Assert.assertTrue(agendadetails.isEnabled());
		agendadetails.click();
	}
	
	@FindBy(xpath="//button/span[contains(text(),'Submit Agenda')]")
	private WebElement submitagenda;
	
	public void verifySubmitAgenda()
	{
		Assert.assertTrue(submitagenda.isDisplayed());
		HighlightOnElement(submitagenda);
	}
}
