package NRDA_BOD;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;

public class NRDA_BOD_SC_01_TC_03 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "E-Governance".
	 * @author deepak.saini
	 * @since 2018-03-21
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'eGovernance')]")
	private WebElement egovernance;
	
	public void clickOneGovernanceLink() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(egovernance));
		wait.until(ExpectedConditions.elementToBeClickable(egovernance));
		Assert.assertTrue(egovernance.isDisplayed());
		HighlightOnElement(egovernance);
		Assert.assertTrue(egovernance.isEnabled());
		egovernance.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify Display Link".
	 * @author deepak.saini
	 * @since 2018-02-13
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'eGovernance')]/../following-sibling::div/ul/li/a/span")
	private List<WebElement> verifylink;
	public void verifyDisplaylink()
	{
		Reporter.log("System will display the Following Link :",true);
		for(WebElement link:verifylink)
		{
			Assert.assertTrue(link.isDisplayed());
			HighlightOnElement(link);
			String display=link.getText();
			Reporter.log(display,true);
		}
	}
}
