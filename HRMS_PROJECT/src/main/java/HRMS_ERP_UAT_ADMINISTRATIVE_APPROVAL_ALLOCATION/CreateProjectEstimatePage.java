package HRMS_ERP_UAT_ADMINISTRATIVE_APPROVAL_ALLOCATION;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.ExcelDataDriver;
import GenericLibrary.WebdriverCommonDriverLibrary;

public class CreateProjectEstimatePage extends WebdriverCommonDriverLibrary
{
	ExcelDataDriver exceldata=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "create ".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button[contains(text(),'Create')]")
	private WebElement create;
	
	public void clickOnCreate() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(create));
		Assert.assertTrue(create.isDisplayed());
		HighlightOnElement(create);
		Assert.assertTrue(create.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(create));
		create.click();
		Thread.sleep(3000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "project name ".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Project')]/../following-sibling::td/input")
	private WebElement project;
	
	public void enterProjectName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(project));
		Assert.assertTrue(project.isDisplayed());
		HighlightOnElement(project);
		Assert.assertTrue(project.isEnabled());
		exceldata.getExcelData(project,"Finance Data",1,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "project category ".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Project')]/../following-sibling::td/div/div/input")
	private WebElement projectCategory;
	
	@FindBy(xpath="//li/a[contains(text(),'Land')]")
	private WebElement land;
	
	public void enterProjectCategory() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(projectCategory));
		Assert.assertTrue(projectCategory.isDisplayed());
		HighlightOnElement(projectCategory);
		Assert.assertTrue(projectCategory.isEnabled());
		projectCategory.click();
		Thread.sleep(2000);
		land.click();
		Thread.sleep(2000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Upload your file ".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button[contains(text(),'Upload your file')])[1]")
	private WebElement files;
	
	public void clickOnUploadFile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		wait.until(ExpectedConditions.visibilityOf(files));
		Assert.assertTrue(files.isDisplayed());
		HighlightOnElement(files);
		Assert.assertTrue(files.isEnabled());
		files.click();
		Thread.sleep(2000);
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\HRMS_PROJECT\\src\\test\\resources\\HRMS_IMAGE\\ExcelFormat.xlsx");
		Thread.sleep(3000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add an item ".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//a[contains(text(),'Add an item')])[1]")
	private WebElement additem;
	
	public void clickOnAddAnItem() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(additem));
		Assert.assertTrue(additem.isDisplayed());
		HighlightOnElement(additem);
		Assert.assertTrue(additem.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(additem));
		additem.click();
		Thread.sleep(2000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Analytic account".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Analytic Account')]/../following-sibling::td/input")
	private WebElement analyticAccount;
	
	public void enterAnalyticAccount() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(analyticAccount));
		Assert.assertTrue(analyticAccount.isDisplayed());
		HighlightOnElement(analyticAccount);
		Assert.assertTrue(analyticAccount.isEnabled());
		exceldata.getExcelData(analyticAccount,"Finance Data",3,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Quantity".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Quantity')]/../following-sibling::td/input")
	private WebElement quantity;
	
	public void enterQuantity() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(quantity));
		Assert.assertTrue(quantity.isDisplayed());
		HighlightOnElement(quantity);
		Assert.assertTrue(quantity.isEnabled());
		quantity.clear();
		exceldata.getExcelData(quantity,"Finance Data",4,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "UOM".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'UOM')]/../following-sibling::td/div/div/input")
	private WebElement uom;
	
	@FindBy(xpath="//li/a[contains(text(),'cm')]")
	private WebElement value;
	
	public void enterUOM() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(uom));
		Assert.assertTrue(uom.isDisplayed());
		HighlightOnElement(uom);
		Assert.assertTrue(uom.isEnabled());
		uom.click();
		Thread.sleep(2000);
		value.click();
		Thread.sleep(2000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "UOM".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Unit Price')]/../following-sibling::td/input")
	private WebElement unitPrice;
	
	public void enterUnitPrice() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(unitPrice));
		Assert.assertTrue(unitPrice.isDisplayed());
		HighlightOnElement(unitPrice);
		Assert.assertTrue(unitPrice.isEnabled());
		unitPrice.clear();
		exceldata.getExcelData(unitPrice,"Finance Data",6,1);
	}
	
	@FindBy(xpath="(//label[contains(text(),'Total Estimate Amount')])[2]")
	private WebElement clickonany;
	
	public void clickOnAny(){
		clickonany.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "save and close".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//span[contains(text(),'Save  & Close')]")
	private WebElement saveAndclose;
	
	public void clickSaveAndClose() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(saveAndclose));
		Assert.assertTrue(saveAndclose.isDisplayed());
		HighlightOnElement(saveAndclose);
		Assert.assertTrue(saveAndclose.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(saveAndclose));
		saveAndclose.click();
		Thread.sleep(5000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "FY Estimate".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'FY Estimate')]")
	private WebElement fyEstimate;
	
	public void clickOnFYEstimate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(fyEstimate));
		Assert.assertTrue(fyEstimate.isDisplayed());
		HighlightOnElement(fyEstimate);
		Assert.assertTrue(fyEstimate.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(fyEstimate));
		fyEstimate.click();
		Thread.sleep(2000);
	}
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add an item ".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//a[contains(text(),'Add an item')])[2]")
	private WebElement additems;
	
	public void clickOnAddAnItems() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(additems));
		Assert.assertTrue(additems.isDisplayed());
		HighlightOnElement(additems);
		Assert.assertTrue(additems.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(additems));
		additems.click();
		Thread.sleep(2000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "FY ".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='o_list_editable o-editing']/div/div/div/input")
	private WebElement fy;
	
	public void enterFY() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(fy));
		Assert.assertTrue(fy.isDisplayed());
		HighlightOnElement(fy);
		Assert.assertTrue(fy.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(fy));
		fy.click();
		Thread.sleep(2000);
		exceldata.getExcelData(fy,"Finance Data",7,1);
		fy.click();
		Thread.sleep(2000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Description".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@data-fieldname='name']")
	private WebElement desc;
	
	public void enterDescription() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(desc));
		Assert.assertTrue(desc.isDisplayed());
		HighlightOnElement(desc);
		Assert.assertTrue(desc.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(desc));
		desc.click();
		Thread.sleep(2000);
		exceldata.getExcelData(desc,"Finance Data",8,1);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Amount".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@data-fieldname='amount']")
	private WebElement amt;
	
	public void enterAmount() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(amt));
		Assert.assertTrue(amt.isDisplayed());
		HighlightOnElement(amt);
		Assert.assertTrue(amt.isEnabled());
		amt.clear();
		Thread.sleep(2000);
		exceldata.getExcelData(amt,"Finance Data",9,1);
		Thread.sleep(2000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Proposal Agency Details".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//a[contains(text(),'Proposal Agency Details')]")
	private WebElement agencyDetails;
	
	public void clickOnProposalAgency() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(agencyDetails));
		Assert.assertTrue(agencyDetails.isDisplayed());
		HighlightOnElement(agencyDetails);
		Assert.assertTrue(agencyDetails.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(agencyDetails));
		agencyDetails.click();
		Thread.sleep(2000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Add an item ".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//a[contains(text(),'Add an item')])[3]")
	private WebElement additemss;
	
	public void clickOnAddAnItemss() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(additemss));
		Assert.assertTrue(additemss.isDisplayed());
		HighlightOnElement(additemss);
		Assert.assertTrue(additemss.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(additemss));
		additemss.click();
		Thread.sleep(2000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "FY ".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='o_list_editable o-editing']/div/div/div/input")
	private WebElement agency;
	
	@FindBy(xpath="//li/a[contains(text(),'NRDA')]")
	private WebElement values;
	
	public void enterAgency() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(agency));
		Assert.assertTrue(agency.isDisplayed());
		HighlightOnElement(agency);
		Assert.assertTrue(agency.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(agency));
		agency.click();
		Thread.sleep(2000);
		values.click();
		Thread.sleep(2000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Upload your file ".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button[contains(text(),'Upload your file')])[2]")
	private WebElement file;
	
	public void uploadFile() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException{
		wait.until(ExpectedConditions.visibilityOf(file));
		Assert.assertTrue(file.isDisplayed());
		HighlightOnElement(file);
		Assert.assertTrue(file.isEnabled());
		file.click();
		Thread.sleep(2000);
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\HRMS_PROJECT\\src\\test\\resources\\HRMS_IMAGE\\ExcelFormat.xlsx");
		Thread.sleep(3000);
	}
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Contribution ".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//input[@data-fieldname='contribution_percentage']")
	private WebElement contribution;
	
	public void enterContribution() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(contribution));
		Assert.assertTrue(contribution.isDisplayed());
		HighlightOnElement(contribution);
		Assert.assertTrue(contribution.isEnabled());
		contribution.click();
		exceldata.getExcelData(contribution,"Finance Data",11,1);
		Thread.sleep(1000);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "History ".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//a[contains(text(),'History')])[1]")
	private WebElement history;
	
	public void clickOnHistory(){
		wait.until(ExpectedConditions.visibilityOf(history));
		Assert.assertTrue(history.isDisplayed());
		HighlightOnElement(history);
		Assert.assertTrue(history.isEnabled());
		history.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Document History ".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//a[contains(text(),'History')])[2]")
	private WebElement docsHistory;
	
	public void clickOnDocsHistory(){
		wait.until(ExpectedConditions.visibilityOf(docsHistory));
		Assert.assertTrue(docsHistory.isDisplayed());
		HighlightOnElement(docsHistory);
		Assert.assertTrue(docsHistory.isEnabled());
		docsHistory.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "save ".
	 * @author deepak.saini
	 * @since 2018-12-03
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button[contains(text(),'Save')])[1]")
	private WebElement save;
	
	public void clickOnSave() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(save));
		Assert.assertTrue(save.isDisplayed());
		HighlightOnElement(save);
		Assert.assertTrue(save.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(save));
		save.click();
		Thread.sleep(5000);
	}

}
