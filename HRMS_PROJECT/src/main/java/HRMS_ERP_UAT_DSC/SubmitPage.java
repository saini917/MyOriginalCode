package HRMS_ERP_UAT_DSC;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class SubmitPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit feedback".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Submit Feedback')]")
	private WebElement submit;
	
	public void clickOnSubmitFeedback() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(submit));
		Assert.assertTrue(submit.isDisplayed());
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		submit.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Request DE".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Request DE')]")
	private WebElement requestde;
	
	public void clickOnRequestDE() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(requestde));
		Assert.assertTrue(requestde.isDisplayed());
		HighlightOnElement(requestde);
		Assert.assertTrue(requestde.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(requestde));
		requestde.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "done enquiry".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Done Enquiry')]")
	private WebElement doneEnquiry;
	
	public void clickOnDoneEnquiry() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(doneEnquiry));
		Assert.assertTrue(doneEnquiry.isDisplayed());
		HighlightOnElement(doneEnquiry);
		Assert.assertTrue(doneEnquiry.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(doneEnquiry));
		doneEnquiry.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "approve".
	 * @author deepak.saini
	 * @since 2018-11-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'Approve')])[5]")
	private WebElement approve;
	
	public void clickOnApprove() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(approve));
		Assert.assertTrue(approve.isDisplayed());
		HighlightOnElement(approve);
		Assert.assertTrue(approve.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(approve));
		approve.click();
		Thread.sleep(5000);
	}

}
