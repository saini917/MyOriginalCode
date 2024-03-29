package NRDA_NewConnection;

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


public class ToVerifyBuildingDetailsTab_SC_03_TC_16 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select Applicant type".
	 * @author deepak.saini
	 * @since 2017-08-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Is Applicant Owner or Tenant?')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement selecttenant;
	
	public void selectTenant() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(selecttenant));
		Assert.assertTrue(selecttenant.isDisplayed());
		Assert.assertTrue(selecttenant.isEnabled());
		SelectVisibleText(selecttenant,"Tenant / किराएदार");
		Reporter.log("Select 'Tenant' as Applicant",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Dsipaly all element".
	 * @author deepak.saini
	 * @since 2017-08-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List<WebElement> displaylist;
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Display all button".
	 * @author deepak.saini
	 * @since 2017-08-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb']/div/div/div/div[2]/span/center/table/tbody/tr/td/span/button/span")
	private List<WebElement> displaybtn;
	
	public void verifyDisplayList()
	{
		Reporter.log("Verify that following fields are shown in Building details page of OWNER:",true);
		for(WebElement list:displaylist)
		{
			HighlightOnElement(list);
			Assert.assertTrue(list.isDisplayed());
			Reporter.log(list.getText(),true);
		}
		
		for(WebElement list1:displaybtn)
		{
			HighlightOnElement(list1);
			Assert.assertTrue(list1.isDisplayed());
			Reporter.log(list1.getText(),true);
		}
	}
	
}
