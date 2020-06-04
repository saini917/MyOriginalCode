package NRDA_BOD;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_04_TC_07 extends CommonLibrary
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

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "checkbox".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//input[@type='checkbox']")
	private List<WebElement> checkbox;

	public void clickOnCheckbox()
	{
		for(WebElement check:checkbox)
		{
			if(!check.isSelected())
			{
				Actions act=new Actions(driver);
				act.click(check).build().perform();
			}
		}
	}
}
