package NRDA_BOD;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_04_TC_08 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Submit Agenda".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Submit Agenda')]")
	private WebElement submitagenda;

	public void clickOnSubmitAgenda() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(submitagenda));
		wait.until(ExpectedConditions.elementToBeClickable(submitagenda));
		Assert.assertTrue(submitagenda.isDisplayed());
		HighlightOnElement(submitagenda);
		Assert.assertTrue(submitagenda.isEnabled());
		submitagenda.click();
		waitForSomeTime();
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Enter comment".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:fwdAgendaDia']/div/div/div/center/table/tbody/tr/td/label")
	private WebElement comment;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Upload document".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:fwdAgendaDia']/div/div/div/table/tbody/tr/td/span")
	private WebElement upload;
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Forward agenda".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Forward Agenda')]")
	private WebElement forwradagenda;
	
	public void verifyDisplayLink()
	{
		Assert.assertTrue(comment.isDisplayed());
		HighlightOnElement(comment);
		
		Assert.assertTrue(upload.isDisplayed());
		HighlightOnElement(upload);
		
		Assert.assertTrue(forwradagenda.isDisplayed());
		HighlightOnElement(forwradagenda);
	}
	
}
