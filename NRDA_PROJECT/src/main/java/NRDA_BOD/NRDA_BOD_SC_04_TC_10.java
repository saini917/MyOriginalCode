package NRDA_BOD;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_04_TC_10 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select action".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//label[contains(text(),'Select Action')])[1]/../following-sibling::td/div/div/span")
	private WebElement selectaction;

	public void clickOnSelectAction() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(selectaction));
		wait.until(ExpectedConditions.elementToBeClickable(selectaction));
		Assert.assertTrue(selectaction.isDisplayed());
		HighlightOnElement(selectaction);
		Assert.assertTrue(selectaction.isEnabled());
		selectaction.click();
		selectValueFromDropdown("Forward");
		waitForSomeTime();
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select name".
	 * @author deepak.saini
	 * @since 2018-04-05
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//label[contains(text(),'Select Action')])[1]/../following-sibling::td/span/table/tbody/tr/td/div/div/span")
	private WebElement name;
	
	@FindBy(xpath="(//label[contains(text(),'V.R. Meshram (MGR)')])[2]")
	private WebElement selectname;
	
	public void nameSelect() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(name));
		wait.until(ExpectedConditions.elementToBeClickable(name));
		Assert.assertTrue(name.isDisplayed());
		HighlightOnElement(name);
		Assert.assertTrue(name.isEnabled());
		name.click();
		selectname.click();
		waitForSomeTime();
	}
	

}
