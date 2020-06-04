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

public class NRDA_BOD_SC_02_TC_03 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "E-Governance".
	 * @author deepak.saini
	 * @since 2018-03-29
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Administrative Section')]")
	private WebElement adminsection;
	
	public void clickOnAdminSectionLink() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(adminsection));
		wait.until(ExpectedConditions.elementToBeClickable(adminsection));
		Assert.assertTrue(adminsection.isDisplayed());
		HighlightOnElement(adminsection);
		Assert.assertTrue(adminsection.isEnabled());
		adminsection.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify Display Link".
	 * @author deepak.saini
	 * @since 2018-02-29
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Administrative Section')]/../following-sibling::div/ul/li/a/span")
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
