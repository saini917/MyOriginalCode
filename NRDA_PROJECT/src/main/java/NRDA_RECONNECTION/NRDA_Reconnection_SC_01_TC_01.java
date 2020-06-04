package NRDA_RECONNECTION;

import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_Reconnection_SC_01_TC_01 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Fresh Application".
	 * @author deepak.saini
	 * @since 2018-05-07
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Fresh Application/नया आवेदन')]")
	private WebElement freshapp;
	
	public void clickOnFreshApp() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(freshapp));
		Assert.assertTrue(freshapp.isDisplayed());
		Assert.assertTrue(freshapp.isEnabled());
		HighlightOnElement(freshapp);
		freshapp.click();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Public health and engineering".
	 * @author deepak.saini
	 * @since 2018-05-07
	 */
	/*****************************************************************************************************/

	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span")
	private WebElement publichealth;
	
	public void clickOnPublicHealth() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(publichealth));
		Assert.assertTrue(publichealth.isDisplayed());
		Assert.assertTrue(publichealth.isEnabled());
		HighlightOnElement(publichealth);
		Actions clickonWatersewerage=new Actions(driver);
		clickonWatersewerage.click(publichealth).build().perform();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "RECONNECTION OF WATER SUPPLY".
	 * @author deepak.saini
	 * @since 2018-05-07
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'Public Health and Engineering')]/preceding-sibling::span/../following-sibling::div/table/tbody/tr/td/span[contains(text(),'RECONNECTION OF WATER SUPPLY')]/../following-sibling::td/span/a[1]/img")
	private WebElement toverifyNewconnection;

	public void clickOnReconnection() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(toverifyNewconnection));
		HighlightOnElement(toverifyNewconnection);
		Assert.assertEquals(true,toverifyNewconnection.isEnabled());
		wait.until(ExpectedConditions.visibilityOf(toverifyNewconnection));
		toverifyNewconnection.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "RECONNECTION OF WATER SUPPLY DETAILS DSAHBOARD".
	 * @author deepak.saini
	 * @since 2018-05-07
	 */
	/****************************************************************************************************/

	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td/span/div/div/div/div/div/div/span[@class='ui-paginator-pages']/span")
	private List<WebElement> allpages;

	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td/span/div/div/div/div/div/div/table/tbody/tr")
	private List<WebElement> allrows;

	public void verifyExistDisconnection() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		String applicationNum="WASCC2004180336";
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
				//String applicationNum=excel.getExcelData1("Customer ID",0,1);
				if(name.equals(applicationNum))
				{
					//System.out.println(applicationNum);
					WebElement ApplicationNumber = driver.findElement(By.xpath("//table[@class='ui-panelgrid ui-widget']/tbody/tr/td/span/div/div/div/div/div/div/table/tbody/tr["+row+"]/td[2]/following-sibling::td[4]/a[1]/img"));
					ApplicationNumber.click();
					Reporter.log("click on Reconnection of water supply",true);
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
	 * This is the xpath of the WebElement "display list".
	 * @author deepak.saini
	 * @since 2018-05-07
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/ul/li/a")
	private List<WebElement> display;
	
	public void verifyDisplay() throws InterruptedException
	{
		waitForSomeTime();
		for(WebElement list:display)
		{
			Assert.assertTrue(list.isDisplayed());
			HighlightOnElement(list);
		}
	}
}
