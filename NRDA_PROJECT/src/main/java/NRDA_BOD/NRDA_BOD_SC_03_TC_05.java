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

public class NRDA_BOD_SC_03_TC_05 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify add/update agenda".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/span/span/div/div/div/ul/li/a[contains(text(),'Add/Update Agenda')]")
	private WebElement addupdateagenda;
	
	public void clickOnAddUpdateAgenda() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(addupdateagenda));
		wait.until(ExpectedConditions.elementToBeClickable(addupdateagenda));
		Assert.assertTrue(addupdateagenda.isDisplayed());
		HighlightOnElement(addupdateagenda);
		Assert.assertTrue(addupdateagenda.isEnabled());
		addupdateagenda.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify display link".
	 * @author deepak.saini
	 * @since 2018-04-04
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:docAccordionPanel']/div/div/div/div/div/div/table/thead/tr/th/span")
	private List<WebElement> display;
	
	@FindBy(xpath="(//button/span[contains(text(),'Add Agenda')])[1]")
	private WebElement button;
	
	public void verifyDisplayLink()
	{
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
		Assert.assertTrue(button.isDisplayed());
		HighlightOnElement(button);
	}

}
