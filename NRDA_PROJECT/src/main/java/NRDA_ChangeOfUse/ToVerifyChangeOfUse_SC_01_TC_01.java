package NRDA_ChangeOfUse;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;
public class ToVerifyChangeOfUse_SC_01_TC_01 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "DASHBOARD".
	 * @author deepak.saini
	 * @since 2017-12-05
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a")
	private List<WebElement> dashboard1;
	
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='leftCol']/span/div/div/div/div/b")
	private List<WebElement> dashboard2;
	
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='leftCol']/span/div/div/div/div/b/../following-sibling::ul/li/a")
	private List<WebElement> dashboard3;
	
	public void verifyDashboard() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(dashboard1));
		Reporter.log("Application Dashboard should be opened with modules like :-",true);
		for(WebElement dash:dashboard1)
		{
			HighlightOnElement(dash);
			Assert.assertTrue(dash.isDisplayed());
			//waitForSomeTime();
			Reporter.log(dash.getText(),true);
		}
		for(WebElement dash2:dashboard2)
		{
			HighlightOnElement(dash2);
			Assert.assertTrue(dash2.isDisplayed());
			//waitForSomeTime();
			Reporter.log(dash2.getText(),true);
		}
		for(WebElement dash3:dashboard3)
		{
			HighlightOnElement(dash3);
			Assert.assertNotNull(dash3.isDisplayed());
			//waitForSomeTime();
			Reporter.log(dash3.getText(),true);
		}
	
	}
}