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

public class NRDA_BOD_SC_04_TC_09 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "other section Agenda details".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Other Section Agenda Details')]")
	private WebElement sectionagenda;

	public void clickOnSectionAgendaDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(sectionagenda));
		wait.until(ExpectedConditions.elementToBeClickable(sectionagenda));
		Assert.assertTrue(sectionagenda.isDisplayed());
		HighlightOnElement(sectionagenda);
		Assert.assertTrue(sectionagenda.isEnabled());
		sectionagenda.click();
		waitForSomeTime();
	}

	@FindBy(xpath="(//a[contains(text(),'Other Section Agenda Details')]/../../following-sibling::div/div/div)[8]/div/center/div/div/table/thead/tr/th")
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
