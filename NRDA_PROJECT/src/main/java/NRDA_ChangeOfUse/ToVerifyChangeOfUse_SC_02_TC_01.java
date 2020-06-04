package NRDA_ChangeOfUse;

import java.io.IOException;
import java.util.List;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;
public class ToVerifyChangeOfUse_SC_02_TC_01 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "fresh Application".
	 * @author deepak.saini
	 * @since 2018-04-11
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='leftCol']/span/div/div/div/div/b/../following-sibling::ul/li/a[contains(text(),'Fresh Application/नया आवेदन')]")
	private WebElement fresh;

	public void clickOnFreshApplication() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(fresh));
		HighlightOnElement(fresh);
		Assert.assertTrue(fresh.isDisplayed());
		Assert.assertTrue(fresh.isEnabled());
		fresh.click();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Public Health And Engineering".
	 * @author deepak.saini
	 * @since 2018-04-11
	 */
	/****************************************************************************************************/

	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span")
	private WebElement publichealth;

	public void clickOnPublicHealthEngineering()
	{
		wait.until(ExpectedConditions.elementToBeClickable( publichealth));
		HighlightOnElement( publichealth);
		Assert.assertTrue( publichealth.isDisplayed());
		Assert.assertTrue( publichealth.isEnabled());
		Actions clickOnWSsection=new Actions(driver);
		clickOnWSsection.click( publichealth).build().perform();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "WATER AND SEWERAGE CONNECTION IMAGE".
	 * @author deepak.saini
	 * @since 2018-04-11
	 */
	/****************************************************************************************************/
	//@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span/../following-sibling::div[1]/table/tbody/tr/td/span[contains(text(),'WATER AND SEWERAGE CONNECTION')]/../following-sibling::td/span/a/img[@src='/NRDAuthorityPreUAT/javax.faces.resource/applyNow.png.xhtml?ln=img']")
	//@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span/../following-sibling::div[1]/table/tbody/tr/td/span[contains(text(),'WATER AND SEWERAGE CONNECTION')]/../following-sibling::td/span/a/img[@src='/NRDAuthority_TEST/javax.faces.resource/applyNow.png.xhtml?ln=img']")
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span/../following-sibling::div[1]/table/tbody/tr/td/span[contains(text(),'WATER AND SEWERAGE CONNECTION')]/../following-sibling::td/span/a[1]/img")
	private WebElement waterandsewerageconnection;

	public void clickOnWaterAndSewerageConnectionImage() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(waterandsewerageconnection));
		HighlightOnElement(waterandsewerageconnection);
		Assert.assertTrue(waterandsewerageconnection.isDisplayed());
		Assert.assertTrue(waterandsewerageconnection.isEnabled());
		waterandsewerageconnection.click();
		waitForSomeTime();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "CHANGE CONNECTION DETAILS DSAHBOARD".
	 * @author deepak.saini
	 * @since 2018-04-11
	 */
	/****************************************************************************************************/

	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td/span/div/div/div/div/div/div/span[@class='ui-paginator-pages']/span")
	private List<WebElement> allpages;

	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td/span/div/div/div/div/div/div/table/tbody/tr")
	private List<WebElement> allrows;

	public void verifyExitConnection() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		List<WebElement> allpages = driver.findElements(By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow ui-overlay-visible']/div[2]/div/div/div/div[2]/span[4]/span"));
		System.out.println("Total pages :" +allpages.size());

		boolean check = true;
		for(int i=1; i<=(allpages.size()); i++)
		{
			List<WebElement> allrows = driver.findElements(By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow ui-overlay-visible']/div[2]/div/div/div/div[1]/table/tbody/tr"));
			for(int row=1; row<=allrows.size(); row++)
			{
				//System.out.println("Total rows :" +allrows.size()); 
				String name = driver.findElement(By.xpath("//div[@class='ui-dialog ui-widget ui-widget-content ui-corner-all ui-shadow ui-overlay-visible']/div[2]/div/div/div/div[1]/table/tbody/tr["+row+"]/td[2]")).getText();
				String applicationNum=excel.getExcelData1("Customer ID",0,1);
				if(name.equals(applicationNum))
				{
					//System.out.println(applicationNum);
					WebElement ApplicationNumber = driver.findElement(By.xpath("//table[@class='ui-panelgrid ui-widget']/tbody/tr/td/span/div/div/div/div/div/div/table/tbody/tr["+row+"]/td[2]/following-sibling::td[4]/a[3]/img"));
					ApplicationNumber.click();
					Reporter.log("click on Change of use",true);
					//System.out.println("Element  exist");
					check = false;
					break;
				}
				/*else
				{
					System.out.println("Element doesn't exist");
				}*/
			}
			if(check)
			{
				allpages.get(i).click();
				waitForSomeTime();
			}
		}
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "CHANGE CONNECTION DETAILS".
	 * @author deepak.saini
	 * @since 2018-04-11
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/span/span/div/div/div/ul/li/a[contains(text(),'Change Connection Details/कनेक्शन विवरण बदलें')]")
	private WebElement changeconnectiondetails;


	public void clickOnChangeConnectionDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(changeconnectiondetails));
		waitForSomeTime();
		wait.until(ExpectedConditions.elementToBeClickable(changeconnectiondetails));
		HighlightOnElement(changeconnectiondetails);
		Assert.assertTrue(changeconnectiondetails.isDisplayed());
		Assert.assertTrue(changeconnectiondetails.isEnabled());
		changeconnectiondetails.click();
		Reporter.log("Click on Change Connection Details Tab",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify display link".
	 * @author deepak.saini
	 * @since 2018-04-11
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/span/span/div/div/div/ul/li/a")
	private List<WebElement> dashboard;

	@FindBy(xpath="//form[@id='form0']/div/table/tbody/tr/td[@class='rightColWithLeftPad']/span/span/span/div/div/div/div/div[4]/span/center//table/tbody/tr/td/span/button/span")
	private List<WebElement> dashboard1;

	@FindBy(xpath="//div[@id='form0:tabView']/div/div[4]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List<WebElement> dashboard2;

	public void verifyChangeConnectionDashboard() throws InterruptedException
	{
		for(WebElement dash1:dashboard)
		{
			HighlightOnElement(dash1);
			Assert.assertTrue(dash1.isDisplayed());
			Reporter.log(dash1.getText(),true);
			waitForSomeTime();
		}

		for(WebElement label:dashboard2)
		{
			HighlightOnElement(label);
			Assert.assertTrue(label.isDisplayed());
			Reporter.log(label.getText(),true);
		}

		for(WebElement buton:dashboard1)
		{
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			jse.executeScript("window.scrollBy(0,400)", "");
			HighlightOnElement(buton);
			Assert.assertNotNull(buton.isDisplayed());
			Reporter.log(buton.getText(),true);
		}
	}
}
