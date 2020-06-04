package NRDA_ChangeOfUse;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyChangeOfUse_SC_04_TC_07 extends CommonLibrary
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
	
	public void verifySelectAction()
	{
		wait.until(ExpectedConditions.elementToBeClickable(selectaction));
		HighlightOnElement(selectaction);
		Assert.assertTrue(selectaction.isDisplayed());
		Assert.assertTrue(selectaction.isEnabled());
		selectaction.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "display list".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="(//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset'])[1]/li")
	private List<WebElement> display;
	
	@FindBy(xpath="(//button/span[contains(text(),'Search')])[1]")
	private WebElement display1;
	public void verifyDisplayList()
	{
		
		for(WebElement list:display)
		{
			String lists=list.getText();
			Reporter.log("Expected value: "+lists,true);
		}
		Assert.assertTrue(display1.isDisplayed());
		HighlightOnElement(display1);
	}

}
