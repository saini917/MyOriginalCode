package HRMS_ERP_UAT_BUDGET_ALLOCATION;

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
	 * This is the xpath of the WebElement "Administrative Approval ".
	 * @author deepak.saini
	 * @since 2018-12-03
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
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//a[contains(text(),'Project Estimate')])[1]")
	private WebElement est;
	
	public void clickOnEstimateProject() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(est));
		Assert.assertTrue(est.isDisplayed());
		HighlightOnElement(est);
		Assert.assertTrue(est.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(est));
		est.click();
		Thread.sleep(3000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Project Estimate tab".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Project Estimate')]")
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

}
