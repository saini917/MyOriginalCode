package NRDA_Plumber;

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

public class ToVerifyPlumberRegistration_SC_02_TC_23 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Reset".
	 * @author deepak.saini
	 * @since 2018-01-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/span)[3]/center/table/tbody/tr/td/span/button/span[contains(text(),'Reset')]")
	private WebElement reset;
	
	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/table/tbody/tr/td)[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private List<WebElement> resetinput;
	
	@FindBy(xpath="(//div[@id='form0:Nb']/div/div/div/div/table/tbody/tr/td)[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label/../../../../../../following-sibling::td/table/tbody/tr/td/textarea")
	private WebElement resettextarea;
	
	public void clickOnReset() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(reset));
		wait.until(ExpectedConditions.elementToBeClickable(reset));
		Assert.assertTrue(reset.isDisplayed());
		HighlightOnElement(reset);
		Assert.assertTrue(reset.isEnabled());
		reset.click();
		Reporter.log("Entered details should get reset",true);
		waitForSomeTime();
		
		for(WebElement list:resetinput)
		{
			HighlightOnElement(list);
			String resetfield=list.getAttribute("value");
			Assert.assertTrue(resetfield.isEmpty(),"test case pass");
			waitForSomeTime();
		}
		HighlightOnElement(resettextarea);
		String resettext=resettextarea.getAttribute("value");
		Assert.assertTrue(resettext.isEmpty(),"test case pass");
	}


}
