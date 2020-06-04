package HRMS_ERP_UAT_TECHNICAL_SECTION;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class TechnicalSectionPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Technical Section".
	 * @author deepak.saini
	 * @since 2018-12-07
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Technical Sanction')]")
	private WebElement technicalSection;
	
	public void clickOnTechnicalSection() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(technicalSection));
		Assert.assertTrue(technicalSection.isDisplayed());
		HighlightOnElement(technicalSection);
		Assert.assertTrue(technicalSection.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(technicalSection));
		technicalSection.click();
		Thread.sleep(3000);
	}

}
