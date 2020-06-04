package NRDA_LAND_DIVERSION_SECTION;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC011 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "choose khasra num to mark".
	 * @author deepak.saini
	 * @since 2018-05-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='container wrap']/nav/div/div/ul/li/div/div/button/span[@class='glyphicon glyphicon-pushpin']")
	private WebElement khasranumtomark;
	
	public void clickOnKhasraNumToMark() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(khasranumtomark));
		Assert.assertTrue(khasranumtomark.isDisplayed());
		HighlightOnElement(khasranumtomark);
		Assert.assertTrue(khasranumtomark.isEnabled());
		khasranumtomark.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select village".
	 * @author deepak.saini
	 * @since 2018-05-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='modal-dialog']/div/div/div/div/div/select[@id='planned_khasraVillageList']")
	private WebElement village;
	
	public void selectVillage() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(village));
		Assert.assertTrue(village.isDisplayed());
		HighlightOnElement(village);
		Assert.assertTrue(village.isEnabled());
		SelectVisibleText(village,"रमचण्डी");
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select khasra number".
	 * @author deepak.saini
	 * @since 2018-05-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='modal-dialog']/div/div/div/div/div/select[@id='planned_khasraKhasraNo']")
	private WebElement khasranum;
	
	public void selectKhasraNum() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(khasranum));
		Assert.assertTrue(khasranum.isDisplayed());
		HighlightOnElement(khasranum);
		Assert.assertTrue(khasranum.isEnabled());
		SelectVisibleText(khasranum,"105");
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "add".
	 * @author deepak.saini
	 * @since 2018-05-25
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button[contains(text(),'Add')]")
	private WebElement add;
	
	public void clickOnAdd() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(add));
		Assert.assertTrue(add.isDisplayed());
		HighlightOnElement(add);
		Assert.assertTrue(add.isEnabled());
		add.click();
		waitForSomeTime();
	}
	
	public void comeBackMainWindow() throws InterruptedException
	{
		driver.switchTo().defaultContent();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close map".
	 * @author deepak.saini
	 * @since 2018-05-25
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="(//span[contains(text(),'PROPERTY MAP')])[2]/following-sibling::a/span")
	private WebElement closemap;
	
	public void closeMapPopUp() throws InterruptedException
	{
		switchFrameToMainWindow();
		wait.until(ExpectedConditions.visibilityOf(closemap));
		Assert.assertTrue(closemap.isDisplayed());
		HighlightOnElement(closemap);
		Assert.assertTrue(closemap.isEnabled());
		closemap.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}

}
