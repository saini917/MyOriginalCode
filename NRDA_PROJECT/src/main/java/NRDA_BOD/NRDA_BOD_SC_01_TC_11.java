package NRDA_BOD;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_01_TC_11 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "reset".
	 * @author deepak.saini
	 * @since 2017-02-14
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="(//button/span[contains(text(),'Reset')])[1]")
	private WebElement reset;
	
	public void clickOnResetBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(reset));
		wait.until(ExpectedConditions.elementToBeClickable(reset));
		Assert.assertTrue(reset.isDisplayed());
		HighlightOnElement(reset);
		Assert.assertTrue(reset.isEnabled());
		reset.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Meeting title".
	 * @author deepak.saini
	 * @since 2017-02-14
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Meeting Title')]/../../../../../../following-sibling::td/table/tbody/tr/td/textarea")
	private WebElement meetingtitle;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Meeting description".
	 * @author deepak.saini
	 * @since 2017-02-14
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Meeting Description')]/../../../../../../following-sibling::td/table/tbody/tr/td/textarea")
	private WebElement meetingdesc;
	
	public void verifyFieldReset()
	{
		String fieldempty=meetingtitle.getAttribute("value");
		HighlightOnElement(meetingtitle);
		Assert.assertTrue(fieldempty.isEmpty(),"Field is reset");
		/*if(fieldempty.isEmpty())
		{
			HighlightOnElement(meetingtitle);
			Assert.assertTrue(true);
		}*/
		
		String fieldempty1=meetingdesc.getAttribute("value");
		HighlightOnElement(meetingdesc);
		Assert.assertTrue(fieldempty1.isEmpty(),"Field is reset");
		/*if(fieldempty1.isEmpty())
		{
			HighlightOnElement(meetingdesc);
			Assert.assertTrue(true);
		}*/
		Reporter.log("All field are reset",true);
	}
	
	
	
	
	
	
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "next".
	 * @author deepak.saini
	 * @since 2017-02-14
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="(//button/span[contains(text(),'Next')])[1]")
	private WebElement next;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "chairperson details".
	 * @author deepak.saini
	 * @since 2017-02-14
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/ul/li/a[contains(text(),'Chairperson Details')]")
	private WebElement chairpersondetails;
	
	public void clickOnNextBtn() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(next));
		wait.until(ExpectedConditions.elementToBeClickable(next));
		Assert.assertTrue(next.isDisplayed());
		HighlightOnElement(next);
		Assert.assertTrue(next.isEnabled());
		next.click();
		Reporter.log("Click on next button System will show 'Chairperson Detail' Tab",true);
		waitForSomeTime();
	}
	
	public void verifyChairpersonDetailsTab()
	{
		wait.until(ExpectedConditions.visibilityOf(chairpersondetails));
		Assert.assertTrue(chairpersondetails.isDisplayed());
		HighlightOnElement(chairpersondetails);
	}

}
