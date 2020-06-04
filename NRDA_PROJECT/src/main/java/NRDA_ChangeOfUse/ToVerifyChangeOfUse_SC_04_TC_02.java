package NRDA_ChangeOfUse;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyChangeOfUse_SC_04_TC_02 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "public health and engineering".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span")
	private WebElement publichealth;
	
	public void clickOnPublicHealthAndEngg() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(publichealth));
		Assert.assertTrue(publichealth.isDisplayed());
		HighlightOnElement(publichealth);
		Assert.assertTrue(publichealth.isEnabled());
		publichealth.click();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "change of use".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//td[@class='leftCol']/table/tbody/tr/td/form/div/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span/../following-sibling::div/ul/li/a/span[contains(text(),'CHANGE OF USE')]")
	private WebElement changeofuse;
	
	public void clickOnChangeOfUse() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(changeofuse));
		Assert.assertTrue(changeofuse.isDisplayed());
		HighlightOnElement(changeofuse);
		Assert.assertTrue(changeofuse.isEnabled());
		changeofuse.click();
		waitForSomeTime();
	}
	
	/*****************************************************************************************************/

		/*
	 * This is the xpath of the WebElement "Pagination".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//div[@class='ui-datatable-tablewrapper'])[1]/table/tbody/tr/td[1]")
	private List<WebElement> navigation;

	@FindBy(xpath="(//span[@class='ui-paginator-pages'])[1]")
	//private List<WebElement> paginationpage;
	private WebElement paginationpage;

	@FindBy(xpath="(//span[@class='ui-icon ui-icon-seek-next'])[1]")
	private WebElement next;

	@FindBy(xpath="//form[@id='inboxForm']/div/div/div/div/div/div/div/div/table/tbody/tr/td/center/a/img[1]")
	private List<WebElement> actionimg;
	
	public void verifyNavigation()
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,430)", "");

		for(WebElement list:navigation)
		{
			HighlightOnElement(list);
			String li=list.getText();
			int result = Integer.parseInt(li);			
			System.out.println(result);
		}
		for(WebElement act:actionimg)
		{
			Assert.assertTrue(act.isDisplayed());
			HighlightOnElement(act);
		}
		HighlightOnElement(paginationpage);
		String allpagescount=paginationpage.getText();
		int page = Integer.parseInt(allpagescount);			
		System.out.println(page);
	}
}
