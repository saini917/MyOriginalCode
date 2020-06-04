package HRMS_ERP_UAT_GRANT_MANAGEMENT;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class AdministrativeApprovalPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Discuss".
	 * @author deepak.saini
	 * @since 2018-12-19
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='navbar-header-custom']/a/i")
	private WebElement discussImage;
	
	public void clickOnDiscussImage() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(discussImage));
		Assert.assertTrue(discussImage.isDisplayed());
		HighlightOnElement(discussImage);
		Assert.assertTrue(discussImage.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(discussImage));
		discussImage.click();
		Thread.sleep(15000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Administrative Approval ".
	 * @author deepak.saini
	 * @since 2018-12-19
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//span[contains(text(),'Administrative Approval')])[2]")
	private WebElement administrativeApproval;
	
	public void clickOnAdministrativeApproval() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(administrativeApproval));
		Assert.assertTrue(administrativeApproval.isDisplayed());
		HighlightOnElement(administrativeApproval);
		Assert.assertTrue(administrativeApproval.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(administrativeApproval));
		administrativeApproval.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Project Estimate tab".
	 * @author deepak.saini
	 * @since 2018-12-19
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Project Estimate')]")
	private WebElement estimate;
	
	public void clickOnEstimateProjectMenu() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(estimate));
		Assert.assertTrue(estimate.isDisplayed());
		HighlightOnElement(estimate);
		Assert.assertTrue(estimate.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(estimate));
		estimate.click();
		Thread.sleep(3000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Grant Installation".
	 * @author deepak.saini
	 * @since 2018-12-19
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Grant Installment')]")
	private WebElement granrinst;
	
	public void clickOnGrantInstallation() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(granrinst));
		Assert.assertTrue(granrinst.isDisplayed());
		HighlightOnElement(granrinst);
		Assert.assertTrue(granrinst.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(granrinst));
		granrinst.click();
		Thread.sleep(3000);
	}

}
