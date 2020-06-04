package NRDA_LAND_DIVERSION_SECTION;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC003_TC002 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "DASHBOARD".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//form)[2]/div/div/h3/a")
	private List<WebElement> dashboard;
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div/table/tbody/tr/td/div/div/div/div/div[@class='box-head']/div")
	private List<WebElement> label1;
	
	public void verifyDashboard() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOfAllElements(dashboard));
		for(WebElement dash:dashboard)
		{
			HighlightOnElement(dash);
			Assert.assertTrue(dash.isDisplayed());
			Reporter.log(dash.getText(),true);
		}
	}
	
	public void verifyStatisticsDisplayLink()
	{
		Reporter.log("Statistics count panel should be shown for -->",true);
		for(WebElement link:label1)
		{
			Assert.assertTrue(link.isDisplayed());
			HighlightOnElement(link);
			Reporter.log(link.getText(),true);
			
		}
	}

}
