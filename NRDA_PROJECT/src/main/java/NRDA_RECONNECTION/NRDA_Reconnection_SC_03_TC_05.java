package NRDA_RECONNECTION;

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

public class NRDA_Reconnection_SC_03_TC_05 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();

	
	@FindBy(xpath="(//center)[2]/table/tbody/tr/td/label[contains(text(),'Select Action')]/../following-sibling::td/div/div/span")
	private WebElement actionclick;
	
	public void clickOnSelectAction() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(actionclick));
		HighlightOnElement(actionclick);
		Assert.assertTrue(actionclick.isDisplayed());
		Assert.assertTrue(actionclick.isEnabled());
		actionclick.click();
		waitForSomeTime();
	}
	
	@FindBy(xpath="(//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset'])[1]/li")
	private List<WebElement> value;
	
	public void verifySectionActionValue()
	{
		for(WebElement list: value)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
			Reporter.log("Action value:"+list.getText(),true);
		}
	}


}
