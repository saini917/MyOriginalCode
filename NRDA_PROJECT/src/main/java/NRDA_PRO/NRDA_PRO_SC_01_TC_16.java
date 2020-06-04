package NRDA_PRO;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_PRO_SC_01_TC_16 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select action".
	 * @author deepak.saini
	 * @since 2018-05-09
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/div/div/span")
	private WebElement action;

	public void clickOnSelectAction() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(action));
		wait.until(ExpectedConditions.elementToBeClickable(action));
		Assert.assertTrue(action.isDisplayed());
		HighlightOnElement(action);
		Assert.assertTrue(action.isEnabled());
		action.click();
		waitForSomeTime();
	}
	
	public void selectForward() throws InterruptedException
	{
		selectValueFromDropdown("Forward");
		waitForSomeTime();
	}
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select user".
	 * @author deepak.saini
	 * @since 2018-05-09
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/span/table/tbody/tr/td/span/div/div/span")
	private WebElement clickonuser;
	
	public void clickOnSelectUser() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(clickonuser));
		wait.until(ExpectedConditions.elementToBeClickable(clickonuser));
		Assert.assertTrue(clickonuser.isDisplayed());
		HighlightOnElement(clickonuser);
		Assert.assertTrue(clickonuser.isEnabled());
		clickonuser.click();
		waitForSomeTime();
	}
	
	public void selectUser() throws InterruptedException
	{
		selectValueFromDropdown("Manish Mishra (MGR)");
		waitForSomeTime();
	}
}
