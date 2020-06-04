package NRDA_ChangeOfUse;


import java.util.List;
import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyChangeOfUse_SC_08_TC_05 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select action".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="(//center)[3]/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/div/div/span")
	private WebElement selectaction;
	
	public void clickOnSelectAction()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)", "");
		
		wait.until(ExpectedConditions.elementToBeClickable(selectaction));
		HighlightOnElement(selectaction);
		Assert.assertTrue(selectaction.isDisplayed());
		Assert.assertTrue(selectaction.isEnabled());
		selectaction.click();
	}

	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select action forward".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset'])[1]/li")
	private List<WebElement> action;
	
	public void selectActionFinalApproved() throws InterruptedException
	{
		selectValueFromDropdown("Forward for Final approval");
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select name".
	 * @author deepak.saini
	 * @since 2018-04-19
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//center)[3]/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/div/div/span/../../../following-sibling::td/span/table/tbody/tr/td/div/div/span")
	private WebElement actionname;
	
	public void selectName() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(actionname));
		HighlightOnElement(actionname);
		Assert.assertTrue(actionname.isDisplayed());
		Assert.assertTrue(actionname.isEnabled());
		actionname.click();
		selectValueFromDropdown("priyanshu kodape (SUE)");
		waitForSomeTime();
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Submit')])[1]")
	private WebElement submit;
	
	public void clickOnSubmit() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(submit));
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isDisplayed());
		Assert.assertTrue(submit.isEnabled());
		submit.click();
		waitForSomeTime();
	}
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "comment error message".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div/span[contains(text(),'Comments is required !')]")
	private WebElement msg;
	
	public void verifyErrorMsg() throws InterruptedException
	{
		String actual="Comments is required !";
		Assert.assertTrue(msg.isDisplayed());
		Assert.assertTrue(msg.isEnabled());
		String expected=msg.getText();
		Reporter.log("Error Message :"+expected,true);
		Assert.assertEquals(actual,expected,"Test case pass");
		HighlightOnElement(msg);
	}

}
