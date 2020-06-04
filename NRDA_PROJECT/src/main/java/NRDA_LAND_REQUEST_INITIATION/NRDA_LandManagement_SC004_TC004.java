package NRDA_LAND_REQUEST_INITIATION;

import java.io.IOException;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC004_TC004 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	
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
	 * This is the xpath of the WebElement "first name".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'First Name')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement firstname;
	
	public void enterFirstName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(firstname));
		Assert.assertTrue(firstname.isDisplayed());
		HighlightOnElement(firstname);
		Assert.assertTrue(firstname.isEnabled());
		excel.getExcelData(firstname,"Land Data",1,3);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "last name".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Last Name')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement lastname;
	
	public void enterLastName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(lastname));
		Assert.assertTrue(lastname.isDisplayed());
		HighlightOnElement(lastname);
		Assert.assertTrue(lastname.isEnabled());
		excel.getExcelData(lastname,"Land Data",1,4);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "relationship type".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Relationship')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement relationshiptype;
	
	public void selectRelationshipType() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(relationshiptype));
		Assert.assertTrue(relationshiptype.isDisplayed());
		HighlightOnElement(relationshiptype);
		Assert.assertTrue(relationshiptype.isEnabled());
		SelectVisibleText(relationshiptype,"Father / पिता");
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "father name".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Father')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement fathername;
	
	public void enterFatherName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(fathername));
		Assert.assertTrue(fathername.isDisplayed());
		HighlightOnElement(fathername);
		Assert.assertTrue(fathername.isEnabled());
		excel.getExcelData(fathername,"Land Data",1,5);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "mother name".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Mother')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement mothername;
	
	public void enterMotherName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(mothername));
		Assert.assertTrue(mothername.isDisplayed());
		HighlightOnElement(mothername);
		Assert.assertTrue(mothername.isEnabled());
		excel.getExcelData(mothername,"Land Data",1,6);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "gender".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Relationship')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement gender;
	
	public void selectGender() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(gender));
		Assert.assertTrue(gender.isDisplayed());
		HighlightOnElement(gender);
		Assert.assertTrue(gender.isEnabled());
		SelectVisibleText(gender,"Male/पुरुष");
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "date of birth".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Date Of Birth')]/../../../../../../following-sibling::td/table/tbody/tr/td/span/input")
	private WebElement dateofbirth;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement selectyear;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement selectmonth;
	
	@FindBy(xpath="//table[@class='ui-datepicker-calendar']/tbody/tr/td/a[contains(text(),'15')]")
	private WebElement selectdate;
	
	public void selectDateOfBirth() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(dateofbirth));
		Assert.assertTrue(dateofbirth.isDisplayed());
		HighlightOnElement(dateofbirth);
		Assert.assertTrue(dateofbirth.isEnabled());
		dateofbirth.click();
		SelectVisibleText(selectyear,"1991");
		SelectVisibleText(selectmonth,"Feb");
		selectdate.click();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Email".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Email')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement email;
	
	public void enterEmailID() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(email));
		Assert.assertTrue(email.isDisplayed());
		HighlightOnElement(email);
		Assert.assertTrue(email.isEnabled());
		excel.getExcelData(email,"Land Data",1,7);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "mobile".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Mobile')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
	private WebElement mobile;
	
	public void enterMobile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(mobile));
		Assert.assertTrue(mobile.isDisplayed());
		HighlightOnElement(mobile);
		Assert.assertTrue(mobile.isEnabled());
		excel.getExcelData(mobile,"Land Data",1,8);
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
	
	public void clickOnSubmit() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		wait.until(ExpectedConditions.visibilityOf(submit));
		Assert.assertTrue(submit.isDisplayed());
		HighlightOnElement(submit);
		Assert.assertTrue(submit.isEnabled());
		submit.click();
		waitForSomeTime();
		waitForSomeTime();
	}
	
}
