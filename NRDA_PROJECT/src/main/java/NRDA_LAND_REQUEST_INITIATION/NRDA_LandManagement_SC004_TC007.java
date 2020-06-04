package NRDA_LAND_REQUEST_INITIATION;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC004_TC007 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Dept Name".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Department Name')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement deptname;
	
	public void enterDeptName() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(deptname));
		Assert.assertTrue(deptname.isDisplayed());
		HighlightOnElement(deptname);
		Assert.assertTrue(deptname.isEnabled());
		excel.getExcelData(deptname,"Land Data",1,9);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "map".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'View Map')]")
	private WebElement map;
	
	public void clickOnViewMap() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(map));
		Assert.assertTrue(map.isDisplayed());
		HighlightOnElement(map);
		Assert.assertTrue(map.isEnabled());
		map.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "khasra number icon".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//div/iframe[@id='gisFrameTarget'])[2]")
	private WebElement frame;
	
	@FindBy(xpath="//div[@class='container wrap']/nav/div/div/ul/li/div/div[@class='btn-group pull-right']/button[@id='chooseKhasraNo']/span")
	private WebElement khasrano;

	public void clickOnKhasraNumIcon() throws InterruptedException
	{
		driver.switchTo().frame(frame);
		waitForSomeTime();
		wait.until(ExpectedConditions.visibilityOf(khasrano));
		Assert.assertTrue(khasrano.isDisplayed());
		HighlightOnElement(khasrano);
		Assert.assertTrue(khasrano.isEnabled());
		khasrano.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select village".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//select[@id='planned_khasraVillageList']")
	private WebElement selectvillage;

	public void selectVillage() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(selectvillage));
		Assert.assertTrue(selectvillage.isDisplayed());
		HighlightOnElement(selectvillage);
		Assert.assertTrue(selectvillage.isEnabled());
		SelectVisibleText(selectvillage,"कुहेरा");
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select khasra number".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//select[@id='planned_khasraKhasraNo']")
	private WebElement selectkhasrano;

	public void selectKhasraNum() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(selectkhasrano));
		Assert.assertTrue(selectkhasrano.isDisplayed());
		HighlightOnElement(selectkhasrano);
		Assert.assertTrue(selectkhasrano.isEnabled());
		SelectVisibleText(selectkhasrano,"74");
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add".
	 * @author deepak.saini
	 * @since 2018-05-14
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
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "save khasra geometery".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='container wrap']/nav/div/div/ul/li/div/div[@class='btn-group pull-right']/button[@id='saveKhasraGeometry']/span")
	private WebElement khasrageometery;

	public void clickOnSaveKhasraGeometry() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(khasrageometery));
		Assert.assertTrue(khasrageometery.isDisplayed());
		HighlightOnElement(khasrageometery);
		Assert.assertTrue(khasrageometery.isEnabled());
		khasrageometery.click();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "save".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button[contains(text(),'Save')])[2]")
	private WebElement save;
	
	public void clickOnSave() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(save));
		Assert.assertTrue(save.isDisplayed());
		HighlightOnElement(save);
		Assert.assertTrue(save.isEnabled());
		save.click();
		waitForSomeTime();
		driver.switchTo().defaultContent();
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "close map".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//div[@id='form0:propertyMapLand']/div/a/span")
	private WebElement closemap;
	
	public void closeMapPopUp() throws InterruptedException
	{
		driver.switchTo().defaultContent();
		wait.until(ExpectedConditions.visibilityOf(closemap));
		Assert.assertTrue(closemap.isDisplayed());
		HighlightOnElement(closemap);
		Assert.assertTrue(closemap.isEnabled());
		closemap.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Dept Address".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Department Address')]/../../../../../../following-sibling::td/table/tbody/tr/td/textarea")
	private WebElement deptadd;
	
	public void enterDeptAddress() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(deptadd));
		Assert.assertTrue(deptadd.isDisplayed());
		HighlightOnElement(deptadd);
		Assert.assertTrue(deptadd.isEnabled());
		excel.getExcelData(deptadd,"Land Data",1,10);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "contact person name".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Person Name')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement personname;
	
	public void enterContactPersonName() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(personname));
		Assert.assertTrue(personname.isDisplayed());
		HighlightOnElement(personname);
		Assert.assertTrue(personname.isEnabled());
		excel.getExcelData(personname,"Land Data",1,11);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "contact person Designation".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Person Designation')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement persondesignation;
	
	public void enterContactPersonDesignation() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(persondesignation));
		Assert.assertTrue(persondesignation.isDisplayed());
		HighlightOnElement(persondesignation);
		Assert.assertTrue(persondesignation.isEnabled());
		excel.getExcelData(persondesignation,"Land Data",1,12);
	}
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "contact person mobile".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Person Mobile')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement personmobile;
	
	public void enterContactPersonMobile() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(personmobile));
		Assert.assertTrue(personmobile.isDisplayed());
		HighlightOnElement(personmobile);
		Assert.assertTrue(personmobile.isEnabled());
		excel.getExcelData(personmobile,"Land Data",1,13);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "contact person email".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Person Email')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement personemial;
	
	public void enterContactPersonEmail() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(personemial));
		Assert.assertTrue(personemial.isDisplayed());
		HighlightOnElement(personemial);
		Assert.assertTrue(personemial.isEnabled());
		excel.getExcelData(personemial,"Land Data",1,14);
	}


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "purpose".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Purpose')]/../../../../../../following-sibling::td/table/tbody/tr/td/textarea")
	private WebElement purpose;
	
	public void enterPurpose() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(purpose));
		Assert.assertTrue(purpose.isDisplayed());
		HighlightOnElement(purpose);
		Assert.assertTrue(purpose.isEnabled());
		excel.getExcelData(purpose,"Land Data",2,2);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Submit')])[1]")
	private WebElement submit;
	
	public void clickOnSubmit() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(submit));
		Assert.assertTrue(submit.isDisplayed());
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isEnabled());
		submit.click();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application number".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Application Number')]/../following-sibling::td[1]/span")
	private WebElement appnum;
	
	public void getApplicationNum() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(appnum));
		Assert.assertTrue(appnum.isDisplayed());
		HighlightOnElement(appnum);
		Assert.assertTrue(appnum.isEnabled());
		String appnumber=appnum.getText();
		Reporter.log("Application Number:"+appnumber,true);
		excel.updateLandRequestInitiationAppNum(appnumber);
	}

}
