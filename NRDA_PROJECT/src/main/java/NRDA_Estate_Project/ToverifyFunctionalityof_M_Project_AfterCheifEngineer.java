package NRDA_Estate_Project;

import java.awt.AWTException;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToverifyFunctionalityof_M_Project_AfterCheifEngineer extends CommonLibrary {
	
	
	Logger log=Logger.getLogger("devpinoyLogger");
	ExcelDataDriver excel=new ExcelDataDriver();
	
	
	@FindBy(xpath="//div[contains(.,' Estate & Project Section')]/../following-sibling::div/div[1]/div[2]/span")
	private WebElement MyInboxLink;
	
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'NEW PROJECT CREATION')]/../following-sibling::div/div/div/div/div[1]/table/thead/tr/th[2]/input")
	private WebElement ApplicationNo_Field1;
	
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'NEW PROJECT CREATION')]")
	private WebElement NewProjectCreation_Link;
	
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'NEW PROJECT CREATION')]/../following-sibling::div/div/div/div/div[1]/table/tbody/tr/td[7]/center/a/img[@src='/NRDAuthorityPreUAT/resources/images/view-new.png']")
	private WebElement Action_Button1;
	
	
	public void toverifyActionButtonagainsttheApplication() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		HighlightOnElement(MyInboxLink);
		Assert.assertNotNull(MyInboxLink.isDisplayed(),"Test case pass");
		MyInboxLink.click();
		Reporter.log("To Click on MyInboxLink is Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		ScroolDown();
		
		HighlightOnElement(NewProjectCreation_Link);
		NewProjectCreation_Link.click();
		waitForSomeTime();
		ScroolDown();
		
		
		HighlightOnElement(ApplicationNo_Field1);
		excel.getExcelData(ApplicationNo_Field1, "Estate_Application_Number", 0, 1);
		waitForSomeTime();
		waitForSomeTime();
		
		Actions actions = new Actions(driver);
		actions.moveToElement(Action_Button1);
		HighlightOnElement(Action_Button1);
		actions.click().build().perform();
		/*HighlightOnElement(Action_Button1);
		Assert.assertNotNull(Action_Button1.isDisplayed(),"Test case pass");
		Action_Button1.click();
		Reporter.log("To Click on Action_Button is Successfully",true);
		waitForSomeTime();*/
		waitForSomeTime();
		Thread.sleep(12000);
		
		
	}
	
	
	
	
	
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td/div/div[3]/span")
	private WebElement SelectActionDropdownLink;
	
	public void toverifyActionDropdownFunctionality() throws InterruptedException
	{
		ScroolDown();
		ScroolDown();
		ScroolDown();
		waitForSomeTime();
		HighlightOnElement(SelectActionDropdownLink);
		Assert.assertTrue(SelectActionDropdownLink.isEnabled(),"Test Case Pass: SelectActionDropdownLink");
		SelectActionDropdownLink.click();
		selectValueFromDropdown("Forward");
		Reporter.log("To select value in dropdown Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[3]/span/table/tbody/tr/td[1]/div/div[3]/span")
	private WebElement Depart_Dropdown;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[3]/span/table/tbody/tr/td[2]/div/div[3]/span")
	private WebElement SelectUser_Dropdown;
	
	public void toverifyDepartmentDropdownFunctionality() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(Depart_Dropdown);
		Assert.assertTrue(Depart_Dropdown.isEnabled(),"Test Case Pass: Depart_Dropdown");
		Depart_Dropdown.click();
		selectValueFromDropdown("Estate & Project Section");
		Reporter.log("To select value in dropdown Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	public void toverifySelectUserFunctionality() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(SelectUser_Dropdown);
		Assert.assertTrue(SelectUser_Dropdown.isEnabled(),"Test Case Pass: SelectUser_Dropdown");
		SelectUser_Dropdown.click();
		selectValueFromDropdown("L. K. Panigrahi (CPM)");
		Reporter.log("To select value in dropdown Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[2]/tbody/tr[6]/td/textarea")
	private WebElement EnterCommentsField;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[2]/tbody/tr[8]/td/table/tbody/tr/td/div/div[1]/label")
	private WebElement UploadButton;
	
	
	public void toverifyEnterCommentsField() throws InterruptedException
	{
		HighlightOnElement(EnterCommentsField);
		Assert.assertTrue(EnterCommentsField.isEnabled(),"Test Case Pass: EnterCommentsField");
		waitForSomeTime();
		waitForSomeTime();
		EnterCommentsField.sendKeys("Project Creation Request Forwarded to CPM ");
		waitForSomeTime();
		waitForSomeTime();

	}
	
	public void toverifyUploaddocumentfield() throws AWTException, InterruptedException
	{
		
		HighlightOnElement(UploadButton);
		UploadButton.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		System.out.println("Upload Document Successfully" ); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	
	}
	
	@FindBy(xpath="//span[contains(.,'Applications List')]/../following-sibling::div/div[1]/div/table/tbody/tr/td[2]/input")
	private WebElement EnterApplicationNumber_Field;
	
	@FindBy(xpath="//span[@id='inboxForm:dynaFormGroup']/div/div/center/button[contains(.,'Submit')]")
	private WebElement SubmitButton;
	
	public void toverifysubmitbuttonFunctionality() throws InterruptedException
	{
		
		HighlightOnElement(SubmitButton);
		Assert.assertNotNull(SubmitButton.isDisplayed(),"Test case pass");
		SubmitButton.click();
		Reporter.log(" To click SubmitButton Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(120000);
		//waitForelementPresent(EnterApplicationNumber_Field);
		
		
	}
	
	
	
}
