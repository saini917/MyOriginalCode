package HRMS_ERP_UAT_BUDGET_REVISION;

import java.awt.AWTException;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class AgendaReportPage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "edit".
	 * @author deepak.saini
	 * @since 2018-12-06
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button[contains(text(),'Edit')]")
	private WebElement edit;
	
	public void clickOnEdit() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(edit));
		Assert.assertTrue(edit.isDisplayed());
		HighlightOnElement(edit);
		Assert.assertTrue(edit.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(edit));
		edit.click();
		Thread.sleep(5000);
	}
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Agenda".
	 * @author deepak.saini
	 * @since 2018-12-06
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button[contains(text(),'Upload your file')]")
	private WebElement agenda;
	
	public void uploadAgenda() throws InterruptedException, AWTException{
		wait.until(ExpectedConditions.visibilityOf(agenda));
		Assert.assertTrue(agenda.isDisplayed());
		HighlightOnElement(agenda);
		Assert.assertTrue(agenda.isEnabled());
		agenda.click();
		Thread.sleep(5000);
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\HRMS_PROJECT\\src\\test\\resources\\HRMS_IMAGE\\ExcelFormat.xlsx");
		Thread.sleep(2000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "save".
	 * @author deepak.saini
	 * @since 2018-12-06
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button[contains(text(),'Save')])[1]")
	private WebElement save;
	
	public void clickOnSave() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(save));
		Assert.assertTrue(save.isDisplayed());
		HighlightOnElement(save);
		Assert.assertTrue(save.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(save));
		save.click();
		Thread.sleep(5000);
	}

}
