package HRMS_ERP_UAT_BUDGET_REVISION;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class CreatePage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "create".
	 * @author deepak.saini
	 * @since 2018-12-05
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button[contains(text(),'Create')]")
	private WebElement create;
	
	public void clickOnCreate() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(create));
		Assert.assertTrue(create.isDisplayed());
		HighlightOnElement(create);
		Assert.assertTrue(create.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(create));
		create.click();
		Thread.sleep(5000);
	}
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "section".
	 * @author deepak.saini
	 * @since 2018-12-05
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Section')]/../following-sibling::td/div/div/input")
	private WebElement section;
	
	@FindBy(xpath="//ul/li/a[contains(text(),'Administration')]")
	private WebElement admin;
	
	public void selectSection() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(section));
		Assert.assertTrue(section.isDisplayed());
		HighlightOnElement(section);
		Assert.assertTrue(section.isEnabled());
		section.click();
		Thread.sleep(2000);
		//selectValueFromDropdown("Administration");
		admin.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "assigned to".
	 * @author deepak.saini
	 * @since 2018-12-05
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Assigned To')]/../following-sibling::td/div/div/input")
	private WebElement assigned;
	
	public void assignedTo() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(assigned));
		Assert.assertTrue(assigned.isDisplayed());
		HighlightOnElement(assigned);
		Assert.assertTrue(assigned.isEnabled());
		//exceldata.getExcelData(assigned,"Finance Data",14,3);
		assigned.sendKeys("Ashok Kumar Jha");
	}

}
