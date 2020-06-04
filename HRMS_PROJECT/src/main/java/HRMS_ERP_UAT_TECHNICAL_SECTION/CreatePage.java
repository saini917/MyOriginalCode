package HRMS_ERP_UAT_TECHNICAL_SECTION;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
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
	 * This is the xpath of the WebElement "Create".
	 * @author deepak.saini
	 * @since 2018-12-07
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
		Thread.sleep(3000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Section".
	 * @author deepak.saini
	 * @since 2018-12-07
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Section')]/../following-sibling::td/div/div/input")
	private WebElement section;
	
	@FindBy(xpath="//li/a[contains(text(),'Administration')]")
	private WebElement value;
	
	public void selectSection() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(section));
		Assert.assertTrue(section.isDisplayed());
		HighlightOnElement(section);
		Assert.assertTrue(section.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(section));
		section.click();
		Thread.sleep(1000);
		value.click();
		Thread.sleep(1000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Project".
	 * @author deepak.saini
	 * @since 2018-12-07
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Project')]/../following-sibling::td/div/div/input")
	private WebElement project;
	
	@FindBy(xpath="//li/a[contains(text(),'Road Repair')]")
	private WebElement values;
	
	public void selectProject() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(project));
		Assert.assertTrue(project.isDisplayed());
		HighlightOnElement(project);
		Assert.assertTrue(project.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(project));
		project.click();
		Thread.sleep(1000);
		values.click();
		Thread.sleep(1000);
	}

}
