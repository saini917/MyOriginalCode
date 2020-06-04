package NRDA_PRO;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_PRO_SC_07_TC_12 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "action".
	 * @author deepak.saini
	 * @since 2018-02-16
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb_content']/div/div/center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/div/div/span")
	private WebElement action;
	
	public void selectActionForward() throws InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		wait.until(ExpectedConditions.visibilityOf(action));
		Assert.assertTrue(action.isDisplayed());
		HighlightOnElement(action);
		Assert.assertTrue(action.isEnabled());
		action.click();
		selectValueFromDropdown("Forward");
		Reporter.log("select FORWARD from the Action",true);
		waitForSomeTime();
		
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select manager admin".
	 * @author deepak.saini
	 * @since 2018-02-15
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='inboxForm:Nb_content']/div/div/center/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/span/table/tbody/tr/td/span/div/div/span")
	private WebElement m_admin;
	
	public void selectm_Admin() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(m_admin));
		Assert.assertTrue(m_admin.isDisplayed());
		HighlightOnElement(m_admin);
		Assert.assertTrue(m_admin.isEnabled());
		m_admin.click();
		selectValueFromDropdown("V.R. Meshram (MGR)");
		waitForSomeTime();
	}

}
