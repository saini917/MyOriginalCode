package NRDA_ENVIRONMENT;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;


/**
 * @author Sarvesh.Nellore
 * @Date: 29-11-2017
 * @purpose: ToverifyFunctionalityof_Environment_Loginas_Citizen 
 */
public class ToverifyFunctionalityof_Environment_Loginas_Citizen extends CommonLibrary 
{
	Logger log=Logger.getLogger("devpinoyLogger");
	ExcelDataDriver excel=new ExcelDataDriver();
	
	
	@FindBy(xpath="//table[@style='width:100%;']/tbody/tr/td/div/h3/a")
	private List <WebElement> Menu_DashBoard;
	
	public void toverifyDashBoardMenu_SC_03_TC_01() throws InterruptedException
	{
		waitForSomeTime();
		for(WebElement MenuInDashBoard:Menu_DashBoard)
		{
			HighlightOnElement(MenuInDashBoard);
			if(MenuInDashBoard.isDisplayed())
			{
				String DashBoardMenu=MenuInDashBoard.getText();
			Reporter.log("MenuInDasHboard Are:"+DashBoardMenu,true);
			}
		}
	
	}
	
	@FindBy(xpath="//table[@style='width:100%;']/tbody/tr/td/div/h3/a[contains(.,'Environment Section')]")
	private WebElement Environment_Section;
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/following-sibling::div/table/tbody/tr/td/span[contains(text(),'ENVIRONMENT NOC')]/../following-sibling::td/span/a/img[@src='/NRDAuthorityPreUAT/javax.faces.resource/applyNow.png.xhtml?ln=img']")
	private WebElement Environment_NOC;
	
	@FindBy(xpath="//button[contains(.,'Proceed')]")
	private WebElement Proceed_Button;
	
	@FindBy(xpath="//button[contains(.,'New Application')]")
	private WebElement NewApplication_Button;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/ul/li/a")
	private List <WebElement> EnvironmentNOC_MenuTabs;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[1]/span/center/table/tbody/tr[2]/td/span/button")
	private List <WebElement> EnvironmentNOC_ButtonsList;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div//div[5]/span/center/table/tbody/tr[2]/td/span/button[contains(.,'Save As Draft')]")
	private WebElement SaveAsDraft_Button;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div//div[4]/span/center/table/tbody/tr[2]/td/span/button[contains(.,'Reset')]")
	private WebElement Reset_Button;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div//div[5]/span/center/table/tbody/tr[2]/td/span/button[contains(.,'Close')]")
	private WebElement Close_Button;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div//div[5]/span/center/table/tbody/tr[2]/td/span/button[contains(.,'Back')]")
	private WebElement Back_Button;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div//div[5]/span/center/table/tbody/tr[2]/td/span/button[contains(.,'Download Project form')]")
	private WebElement DownloadProjectform_Button;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div[1]/div[5]/span[2]/center/table/tbody/tr[2]/td/span/button[contains(.,'Submit')]")
	private WebElement Submit_Button;
	
	@FindBy(xpath="(//span[contains(.,'Confirm Action')]/../following-sibling::div/div/div/div/div[1]/table/tbody/tr/td/button[contains(.,'Proceed')])[1]")
	private WebElement Proceed1_Button;
	
	public void verifytheDashBoardofEnvironmentNOC_SC_03_TC_02() throws InterruptedException
	{
		HighlightOnElement(Environment_Section);
		Assert.assertTrue(Environment_Section.isEnabled());
		Environment_Section.click();
		Reporter.log("Verify Application of Water and Sewerage  Environment_Section link is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Environment_NOC);
		Assert.assertEquals(true,Environment_NOC.isEnabled());
		Environment_NOC.click();
		Reporter.log("Verify Application of Water and Sewerage Environment_NOC link is Present",true); //print for eclipse console 
		waitForSomeTime();
		
		HighlightOnElement(Proceed_Button);
		Assert.assertEquals(true,Proceed_Button.isEnabled());
		Proceed_Button.click();
		Reporter.log("Verify Application of Water and Sewerage Proceed_Button is Present",true); //print for eclipse console 
		waitForSomeTime();
		
		
	}
	
	
	public void toclickomproceedbutton() throws InterruptedException
	{
		waitForSomeTime();
		if(Proceed1_Button.isDisplayed())
		{
			Proceed1_Button.click();	
		}
		else
		{
		 System.out.println(" Proceed Button Not showing ");	
		}
		
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(BasicDetails_TAB);
		HighlightOnElement(BasicDetails_TAB);
		
		
		
	}
	
			
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div//div[1]/span/center/table/tbody/tr[2]/td/span/button[contains(.,'Reset')]")
	private WebElement Reset1_Button;
	
	
	public void resettheApplication() throws InterruptedException
	{
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Reset1_Button);
		Reset1_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
		
	}
	
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[1]/table/tbody/tr/td/span/label")
	private List <WebElement> BasicDetail_Labels;
	
	public void  verifytheDashBoardofEnvironmentNOC() throws InterruptedException
	{
		waitForSomeTime();
		for(WebElement ENvironmentNOCDashBoard:EnvironmentNOC_MenuTabs)
		{
			HighlightOnElement(ENvironmentNOCDashBoard);
			if(ENvironmentNOCDashBoard.isDisplayed())
			{
				String DashBoardMenu=ENvironmentNOCDashBoard.getText();
			System.out.println("ENvironmentNOCDashBoard Are:"+DashBoardMenu);
			}
		}
		
		waitForSomeTime();
		for(WebElement ButtonsinDashBoard:EnvironmentNOC_ButtonsList)
		{
			HighlightOnElement(ButtonsinDashBoard);
			if(ButtonsinDashBoard.isDisplayed())
			{
				String DashBoardMenu=ButtonsinDashBoard.getText();
			System.out.println("ButtonsinDashBoard Are:"+DashBoardMenu);
			}
		}
		
		waitForSomeTime();
		for(WebElement LabelsinDashBoard:BasicDetail_Labels)
		{
			HighlightOnElement(LabelsinDashBoard);
			if(LabelsinDashBoard.isDisplayed())
			{
				String DashBoardMenu1=LabelsinDashBoard.getText();
				//System.out.println("BasicDetail_Labels Are:"+DashBoardMenu1);
			}
		}
	}
	
	@FindBy(xpath=".//div[@id='form0:growl_container']/div/div/div/span")
	private List <WebElement> ErrorMsgs;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/ul/li/a[contains(.,'Basic Details')]")
	private WebElement BasicDetails_TAB;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/ul/li/a[contains(.,'Correspondence Address')]")
	private WebElement CorrespondenceAddres_TAB;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/ul/li/a[contains(.,'Property Details')]")
	private WebElement PropertyDetails_TAB;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/ul/li/a[contains(.,'Type of NOC')]")
	private WebElement TypeofNOC_TAB;
	
	
	public void VerifyFunctionalityofBasicDetailForm() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		
		HighlightOnElement(Title_Dropdown);
		Assert.assertEquals(true,Title_Dropdown.isEnabled());
		SelectVisibleText(Title_Dropdown, "Mr / श्री");
		Reporter.log("Verify Application of Water and Sewerage Title_Dropdown is Present",true); //print for eclipse console 
		waitForSomeTime();
		
		
		HighlightOnElement(FirstName_Field);
		Assert.assertEquals(true,FirstName_Field.isEnabled());
		excel.getExcelData(FirstName_Field, "Environmental_Application_Form", 1, 1);
		Reporter.log("Verify Application of Water and Sewerage FirstName_Field is Present",true); //print for eclipse console 

		HighlightOnElement(MiddleName_Field);
		Assert.assertEquals(true,MiddleName_Field.isEnabled());
		excel.getExcelData(MiddleName_Field, "Environmental_Application_Form", 1, 2);
		Reporter.log("Verify Application of Water and Sewerage MiddleName_Field is Present",true); //print for eclipse console 

		HighlightOnElement(LastName_Field);
		Assert.assertEquals(true,LastName_Field.isEnabled());
		excel.getExcelData(LastName_Field, "Environmental_Application_Form", 1, 3);
		Reporter.log("Verify Application of Water and Sewerage LastName_Field is Present",true); //print for eclipse console 

		HighlightOnElement(Father_HusbandName_Field);
		Assert.assertEquals(true,Father_HusbandName_Field.isEnabled());
		excel.getExcelData(Father_HusbandName_Field, "Environmental_Application_Form", 1, 4);
		Reporter.log("Verify Application of Water and Sewerage Father_HusbandName_Field is Present",true); //print for eclipse console 

		HighlightOnElement(Relationship_Dropdown);
		Assert.assertEquals(true,Relationship_Dropdown.isEnabled());
		SelectVisibleText(Relationship_Dropdown, "Father / पिता");
		Reporter.log("Verify Application of Water and Sewerage Relationship_Dropdown is Present",true); //print for eclipse console 
		
		HighlightOnElement(MotherName_Field);
		Assert.assertEquals(true,MotherName_Field.isEnabled());
		excel.getExcelData(MotherName_Field, "Environmental_Application_Form", 1, 5);
		Reporter.log("Verify Application of Water and Sewerage MotherName_Field is Present",true); //print for eclipse console 

		HighlightOnElement(DateofBirth_Field);
		Assert.assertEquals(true,DateofBirth_Field.isEnabled());
		DateofBirth_Field.click();
		waitForSomeTime();
		HighlightOnElement(DateSelect);
		DateSelect.click();
		waitForSomeTime();
		Reporter.log("Verify Application of Water and Sewerage DateofBirth_Field is Present",true); //print for eclipse console 
		waitForSomeTime();
		
		//HighlightOnElement(Gender_Dropdown);
		//Assert.assertEquals(true,Gender_Dropdown.isEnabled());
		SelectVisibleText(Gender_Dropdown, "Male/पुरुष");
		Reporter.log("Verify Application of Water and Sewerage Gender_Dropdown is Present",true); //print for eclipse console 
	
		
	}
		
		
	public void VerifyFunctionalityofCorrespondenceAddress() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		HighlightOnElement(CorrespondenceAddres_TAB);
		Assert.assertEquals(true,CorrespondenceAddres_TAB.isEnabled());
		CorrespondenceAddres_TAB.click();
		waitForSomeTime();
		Reporter.log("Verify Application of Water and Sewerage CorrespondenceAddres_TAB is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		WebDriverWait wait = new WebDriverWait(driver, 30); 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[2]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/select")));
		element.click();
		
		HighlightOnElement(State_Dropdown);
		Assert.assertEquals(true,State_Dropdown.isEnabled());
		SelectVisibleText(State_Dropdown, "CHHATTISGARH");
		Reporter.log("Verify Application of Water and Sewerage State_Dropdown is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(District_Dropdown);
		Assert.assertEquals(true,District_Dropdown.isEnabled());
		SelectVisibleText(District_Dropdown, "RAIPUR");
		Reporter.log("Verify Application of Water and Sewerage District_Dropdown is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
		
		HighlightOnElement(AddressField);
		Assert.assertEquals(true,AddressField.isEnabled());
		AddressField.sendKeys("Nellore");
		//excel.getExcelData(AddressField, "Environmental_Application_Form", 1, 8);
		Reporter.log("Verify Application ofEnvironment AddressField is Present",true); //print for eclipse console 

		
		HighlightOnElement(EmailField);
		Assert.assertEquals(true,EmailField.isEnabled());
		EmailField.sendKeys("a@gmail.com");
		//excel.getExcelData(AddressField, "Environmental_Application_Form", 1, 8);
		Reporter.log("Verify Application of Environment EmailField is Present",true); //print for eclipse console 

		
		
	/*	HighlightOnElement(Tehsil_Village_Field);
		Assert.assertEquals(true,Tehsil_Village_Field.isEnabled());
		excel.getExcelData(Tehsil_Village_Field, "Environmental_Application_Form", 1, 8);
		Reporter.log("Verify Application of Water and Sewerage Tehsil_Village_Field is Present",true); //print for eclipse console 
*/
		HighlightOnElement(Pincode_Field);
		Assert.assertEquals(true,Pincode_Field.isEnabled());
		excel.getExcelData(Pincode_Field, "Environmental_Application_Form", 1, 9);
		Reporter.log("Verify Application of Water and Sewerage Pincode_Field is Present",true); //print for eclipse console 

		HighlightOnElement(MobileNo_Filed);
		Assert.assertEquals(true,MobileNo_Filed.isEnabled());
		excel.getExcelData(MobileNo_Filed, "Environmental_Application_Form", 1, 10);
		Reporter.log("Verify Application of Water and Sewerage MobileNo_Filed is Present",true); //print for eclipse console 

		
		
		
	}
		
	
	public void VerifyFunctionalityofPropertyDetails() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(PropertyDetails_TAB);
		Assert.assertEquals(true,PropertyDetails_TAB.isEnabled());
		PropertyDetails_TAB.click();
		waitForSomeTime();
		Reporter.log("Verify Application of Water and Sewerage PropertyDetails_TAB is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(PropertyId_Field);
		Assert.assertEquals(true,PropertyId_Field.isEnabled());
		excel.getExcelData(PropertyId_Field, "Environmental_Application_Form", 1, 14);
		Reporter.log("Verify Application of Water and Sewerage PropertyId_Field is Present",true); //print for eclipse console 
		
		HighlightOnElement(Plot_Field);
		Assert.assertEquals(true,Plot_Field.isEnabled());
		excel.getExcelData(Plot_Field, "Environmental_Application_Form", 1, 15);
		Reporter.log("Verify Application of Water and Sewerage Plot_Field is Present",true); //print for eclipse console 
		
		
		HighlightOnElement(State_DropdowninPropertyDetails);
		Assert.assertEquals(true,State_DropdowninPropertyDetails.isEnabled());
		SelectVisibleText(State_DropdowninPropertyDetails, "CHHATTISGARH");
		Reporter.log("Verify Application of Water and Sewerage State_DropdowninPropertyDetails is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(District_DropdowninPropertyDetails);
		Assert.assertEquals(true,District_DropdowninPropertyDetails.isEnabled());
		SelectVisibleText(District_DropdowninPropertyDetails, "RAIPUR");
		Reporter.log("Verify Application of Water and Sewerage District_DropdowninPropertyDetails is Present",true); //print for eclipse console 
		waitForSomeTime();
		
		HighlightOnElement(Tehsil_Village_FieldinPropertyDetails);
		Assert.assertEquals(true,Tehsil_Village_FieldinPropertyDetails.isEnabled());
		excel.getExcelData(Tehsil_Village_FieldinPropertyDetails, "Environmental_Application_Form", 1, 16);
		Reporter.log("Verify Application of Water and Sewerage Tehsil_Village_FieldinPropertyDetails is Present",true); //print for eclipse console 
		
		HighlightOnElement(MobileNumber_FieldinPropertyDetails);
		Assert.assertEquals(true,MobileNumber_FieldinPropertyDetails.isEnabled());
		excel.getExcelData(MobileNumber_FieldinPropertyDetails, "Environmental_Application_Form", 1, 17);
		Reporter.log("Verify Application of Water and Sewerage MobileNumber_FieldinPropertyDetails is Present",true); //print for eclipse console 
		
		waitForSomeTime();
		
		HighlightOnElement(Sector_DropdowninPropertyDetails);
		Assert.assertEquals(true,Sector_DropdowninPropertyDetails.isEnabled());
		SelectVisibleText(Sector_DropdowninPropertyDetails, "1");
		Reporter.log("Verify Application of Environment Sector_DropdowninPropertyDetails is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(AnyotherInformation_FieldinPropertyDetails);
		Assert.assertEquals(true,AnyotherInformation_FieldinPropertyDetails.isEnabled());
		//excel.getExcelData(MobileNumber_FieldinPropertyDetails, "Environmental_Application_Form", 1, 17);
		AnyotherInformation_FieldinPropertyDetails.sendKeys("Environment");
		Reporter.log("Verify Application of Environment AnyotherInformation_FieldinPropertyDetails is Present",true); //print for eclipse console 
		
		waitForSomeTime();
		
		
	}

	
	@FindBy(xpath="//input[@title='Unit Of Girth Size']")
	private WebElement UnitofGirthSize_Field;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[4]/table/tbody/tr/td/table/tbody/tr[29]/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/span/div/div[1]/label")
	private WebElement UploadDocument2;
	
	
	public void toverifyFunctionalityofTypeofNOC() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		
		waitForSomeTime();
		HighlightOnElement(TypeofNOC_TAB);
		Assert.assertEquals(true,TypeofNOC_TAB.isEnabled());
		TypeofNOC_TAB.click();
		waitForSomeTime();
		Reporter.log("Verify Application of Water and Sewerage TypeofNOC_TAB is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		
		HighlightOnElement(TypeofNOC_Dropdown);
		Assert.assertEquals(true,TypeofNOC_Dropdown.isEnabled());
		SelectVisibleText(TypeofNOC_Dropdown, "Individual NOC");
		Reporter.log("Verify Application of Water and Sewerage State_Dropdown is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
		Assert.assertEquals(true,UploadDocumentButton1.isEnabled());
		HighlightOnElement(UploadDocumentButton1);
		UploadDocumentButton1.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		Reporter.log(" Upload Document Link Application of Environment link is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
		
		HighlightOnElement(PurposeofNOC_Dropdown);
		Assert.assertEquals(true,PurposeofNOC_Dropdown.isEnabled());
		//excel.getExcelData(PurposeofNOC_Field, "Environmental_Application_Form", 1, 48);
		SelectVisibleText(PurposeofNOC_Dropdown, "Tree Plantation");
		Reporter.log("Verify Application of Water and Sewerage PurposeofNOC_Field is Present",true); //print for eclipse console

		HighlightOnElement(TypeofTree_Dropdown);
		Assert.assertEquals(true,TypeofTree_Dropdown.isEnabled());
		//excel.getExcelData(TypeofTree_Field, "Environmental_Application_Form", 1, 49);
		SelectVisibleText(TypeofTree_Dropdown, "Mango");
		Reporter.log("Verify Application of Water and Sewerage TypeofTree_Field is Present",true); //print for eclipse console
		
		//HighlightOnElement(TreeName_Field);
		//Assert.assertEquals(true,TreeName_Field.isEnabled());
		//excel.getExcelData(TreeName_Field, "Environmental_Application_Form", 1, 50);
		//Reporter.log("Verify Application of Water and Sewerage TreeName_Field is Present",true); //print for eclipse console
		
		HighlightOnElement(GirthSize_Field);
		Assert.assertEquals(true,GirthSize_Field.isEnabled());
		excel.getExcelData(GirthSize_Field, "Environmental_Application_Form", 1, 51);
		Reporter.log("Verify Application of Water and Sewerage GirthSize_Field is Present",true); //print for eclipse console
				
		HighlightOnElement(TotalTreeCount_Field);
		Assert.assertEquals(true,TotalTreeCount_Field.isEnabled());
		excel.getExcelData(TotalTreeCount_Field, "Environmental_Application_Form", 1, 52);
		Reporter.log("Verify Application of Water and Sewerage TotalTreeCount_Field is Present",true); //print for eclipse console
		Thread.sleep(10000);
		waitForSomeTime();
		HighlightOnElement(UnitofGirthSize_Field);
		Assert.assertEquals(true,UnitofGirthSize_Field.isEnabled());
		//excel.getExcelData(UnitofGirthSize_Field, "Environmental_Application_Form", 1, 51);
		UnitofGirthSize_Field.sendKeys("34");
		Reporter.log("Verify Application of Environment GirthSize_Field is Present",true); //print for eclipse console
		waitForSomeTime();
		waitForSomeTime();
		Assert.assertEquals(true,UploadDocument2.isEnabled());
		HighlightOnElement(UploadDocument2);
		UploadDocument2.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Test.xls");
		Reporter.log(" Upload Document Link Application of Environment link is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	
	}
	
	@FindBy(xpath="//div[@id='form0:tabView']/div/div/span/table/tbody/tr/td/div/div/table/tbody/tr/td/div/following-sibling::a/img/../preceding-sibling::div/div/label")
	private WebElement Upload_Button1;
	
	@FindBy(xpath="//a[contains(.,'Upload Document')]")
	private WebElement Upload_DocumentTab;
	
	@FindBy(xpath="//select[@title='Document Name']")
	private WebElement ServicerelatedDocument_Dropdown;
	
	
	public void toverifythefunctionalityof_UploadingDocument() throws InterruptedException, AWTException
	  {
		
		waitForSomeTime();
		HighlightOnElement(Upload_DocumentTab);
		Assert.assertTrue(Upload_DocumentTab.isEnabled(),"TestCase Pass:  Upload_DocumentTab");
		Upload_DocumentTab.click();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA RTI Upload_DocumentTab  is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(ServicerelatedDocument_Dropdown);
		SelectVisibleText(ServicerelatedDocument_Dropdown, "Other Document");
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Upload_Button1);
		//Assert.assertTrue(RTI_InformationTAB.isEnabled(),"TestCase Pass:  Upload_Button");
		Upload_Button1.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Company_Id.pdf");
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA RTI Upload_Button  is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
		}
			
	
	
	public void VerifythefunctionalityoftheEnvironmentPagewithoutenteranydetails_SC_03_TC_03() throws InterruptedException
	{
		HighlightOnElement(Upload_DocumentTab);
		Assert.assertTrue(Upload_DocumentTab.isEnabled());
		Upload_DocumentTab.click();
		Reporter.log("Verify Application of Water and Sewerage  TypeofNOC_TAB link is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		ScroolDown();
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("alert('Please Enter Captcha..');");
		waitForSomeTime();
		acceptAlert();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Submit_Button);
		//Assert.assertEquals(true,Submit_Button.isEnabled());
		Submit_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		//Reporter.log("Verify Application of Water and Sewerage Submit_Button is Present",true); //print for eclipse console 
		//waitForSomeTime();
		for(WebElement ERRORMSGS:ErrorMsgs)
		{
			HighlightOnElement(ERRORMSGS);
			if(ERRORMSGS.isDisplayed())
			{
				String DashBoardMenu=ERRORMSGS.getText();
			System.out.println("ERRORMSGS Are:"+DashBoardMenu);
			}
		}
		
		ScroolUp();
		Thread.sleep(18000);
	}
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div//div[4]/div/div[2]/div/button[contains(.,'Add More')]")
	private WebElement AddMore_Button;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div//div[4]/div/div[2]/div/button[contains(.,'Delete row')]")
	private WebElement DeleteRow_Button;
	
	@FindBy(xpath="//select[@title='Title']")
	private WebElement Title_Dropdown;
	
	@FindBy(xpath="//input[@title='First Name']")
	private WebElement FirstName_Field;
	
	@FindBy(xpath="//input[@title='Middle Name']")
	private WebElement MiddleName_Field;
	
	@FindBy(xpath="//input[@title='Last Name']")
	private WebElement LastName_Field;
	
	@FindBy(xpath="//input[@title='Father / Husband Name']")
	private WebElement Father_HusbandName_Field;
	
	@FindBy(xpath="//select[@title='Relationship Type']	")
	private WebElement Relationship_Dropdown;
	
	@FindBy(xpath="//input[@title='Mother Name']")
	private WebElement MotherName_Field;
	
	@FindBy(xpath="//input[@title='Date of Birth']")
	private WebElement DateofBirth_Field;
	
	@FindBy(xpath="//a[contains(.,'4')]")
	private WebElement DateSelect;
	
	@FindBy(xpath="//select[@title='Gender']")
	private WebElement Gender_Dropdown;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[2]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/select")
	private WebElement State_Dropdown;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[2]/table/tbody/tr/td/table/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/select")
	private WebElement District_Dropdown;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[@title='Address']")
	private WebElement AddressField;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[2]/table/tbody/tr/td/input[@title='Email Id']")
	private WebElement EmailField;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[2]/table/tbody/tr/td/table/tbody/tr[2]/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/input")
	private WebElement Tehsil_Village_Field;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[2]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/input")
	private WebElement Pincode_Field;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[2]/table/tbody/tr/td/table/tbody/tr[3]/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/input")
	private WebElement MobileNo_Filed;
	
	@FindBy(xpath="//input[@title='Property ID']")
	private WebElement PropertyId_Field;
	
	@FindBy(xpath="//img[@alt='Click to Search Property Id']")
	private WebElement PropertyId_IMG;
	
	@FindBy(xpath="//div[@role='dialog']/div[2]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[1]/div/div[2]")
	private WebElement PropertyId_RadioButton;
	
	@FindBy(xpath="//div[@role='dialog']/div[2]/div/div/table/tbody/tr/td[2]/table/tbody/tr/td[3]/div/div[2]")
	private WebElement OtherDetails_RadioButton;
	
	@FindBy(xpath="//input[@title='Enter Property ID']")
	private WebElement EnterPropertyId_Field;
	
	@FindBy(xpath="//div[@role='dialog']/div[2]/div/div/span[3]/center/button[contains(.,'Search')]")
	private WebElement SearchButton_PropertyId;
	
	@FindBy(xpath=".//*[@id='form0:propertyList']/div/table")
	private WebElement ResultGrid;
	
	@FindBy(xpath="//div[@role='dialog']/div[2]/div/div/span[4]/center/button[contains(.,'Fill in Form')]")
	private WebElement FillinFormButton_PropertyId;
	
	@FindBy(xpath="//input[@title='Owner Name']")
	private WebElement OwnerName_Field;
	
	@FindBy(xpath="//input[@title='Property building Name']")
	private WebElement PropertyBuildingName_Field;
	
	@FindBy(xpath="//div[@role='dialog']/div[2]/div/div/span/table/tbody/tr[3]/td[2]/div/div[3]/span")
	private WebElement Sector_Dropdownlink;
	
	@FindBy(xpath="//div[@role='dialog']/div[2]/div/div/span[3]/center/button[contains(.,'Search')]")
	private WebElement SearchButton_OtherDetails;
	
	@FindBy(xpath="//input[@title='Plot/Survey/Khasra No.']")
	private WebElement Plot_Field;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/select")
	private WebElement State_DropdowninPropertyDetails;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/select")
	private WebElement District_DropdowninPropertyDetails;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[4]/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/select")
	private WebElement Sector_DropdowninPropertyDetails;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[3]/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/input")
	private WebElement Tehsil_Village_FieldinPropertyDetails;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/input")
	private WebElement MobileNumber_FieldinPropertyDetails;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[4]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/textarea")
	private WebElement AnyotherInformation_FieldinPropertyDetails;
	
	@FindBy(xpath="//select[@title='Type of NOC']")
	private WebElement TypeofNOC_Dropdown;
	
	@FindBy(xpath="//select[@title='Purpose of NOC']")
	private WebElement PurposeofNOC_Dropdown;
	
	@FindBy(xpath="//select[@title='Type of Tree']")
	private WebElement TypeofTree_Dropdown;
	
	@FindBy(xpath="//input[@title='Tree Name']")
	private WebElement TreeName_Field;
	
	@FindBy(xpath="//input[@title='Girth Size']")
	private WebElement GirthSize_Field;
	
	@FindBy(xpath="//input[@title='Total Tree Count']")
	private WebElement TotalTreeCount_Field;
	
	@FindBy(xpath="(//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[4]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[1]/span/div/div[1]/label)[1]")
	private WebElement UploadDocumentButton;
	
	@FindBy(xpath="(//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[4]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td[1]/span/div/div[1]/label)[1]")
	private WebElement UploadDocumentButton2;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[4]/table/tbody/tr/td/table/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/span/div/div[1]/label")
	private WebElement UploadDocumentButton1;
	
	@FindBy(xpath="//input[@title='Name of the project']")
	private WebElement NameoftheProject_Field;
	
	@FindBy(xpath="//input[@title='Sr. No. in the schedule']")
	private WebElement SrNointheSchedule_Field;
	
	@FindBy(xpath="//input[@title='New/Expansion/Modernization']")
	private WebElement New_Expansion_Modernization_Field;
	
	@FindBy(xpath="//input[@title='Nearest Railway Station']")
	private WebElement NearestRailwayStation_Field;
	
	@FindBy(xpath="(//input[@title='Distance (Kms)'])[1]")
	private WebElement DistanceinKms_Field;
	
	@FindBy(xpath="(//input[@title='Distance (Kms)'])[2]")
	private WebElement DistanceinKms_Field1;
	
	@FindBy(xpath="(//input[@title='Distance (Kms)'])[3]")
	private WebElement DistanceinKms_Field2;
	
	@FindBy(xpath="(//input[@title='Distance (Kms)'])[4]")
	private WebElement DistanceinKms_Field3;
	
	@FindBy(xpath="(//input[@title='Distance (Kms)'])[5]")
	private WebElement DistanceinKms_Field4;
	
	@FindBy(xpath="//input[@title='Nearest Airport']")
	private WebElement NearestAirport_Field;
	
	@FindBy(xpath="//input[@title='Nearest Town']")
	private WebElement NearestTown_Field;
	
	@FindBy(xpath="//input[@title='Nearest City']")
	private WebElement NearestCity_Field;
	
	@FindBy(xpath="//input[@title='Nearest District']")
	private WebElement NearestDistrict_Field;
	
	@FindBy(xpath="//input[@title[contains(.,'Category of Project')]]")
	private WebElement CategoryofProject_Field;
	
	@FindBy(xpath="//input[@title='Local body address']")
	private WebElement LocalBodyAddressField_Field;
	
	@FindBy(xpath="//input[@title='Local body name']")
	private WebElement LocalBodyname_Field;
	
	@FindBy(xpath="//input[@title='Name of the firm']")
	private WebElement NameOfthefirm_Field;
	
	@FindBy(xpath="//input[@title='Registered Address']")
	private WebElement RegisteredAddress_Field;
	
	@FindBy(xpath="//input[@title='Name']")
	private WebElement Name_Field;
	
	@FindBy(xpath="//input[@title='Designation (Owner/Partner/CEO)']")
	private WebElement Designation_Field;
	
	@FindBy(xpath="(//input[@title='Address'])[2]")
	private WebElement Address_Field;
	
	@FindBy(xpath="(//input[@title='Pin Code'])[2]")
	private WebElement Pincode_Field1;
	
	@FindBy(xpath="//input[@title='E-mail']")
	private WebElement Email_Field;
	
	@FindBy(xpath="//input[@title='Telephone Number']")
	private WebElement TelephoneNumber;
	
	@FindBy(xpath="//input[@title='Fax No.']")
	private WebElement FaxNo_Field;
	
	public void VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizen_SC_03_TC_04() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(Title_Dropdown);
		Assert.assertEquals(true,Title_Dropdown.isEnabled());
		SelectVisibleText(Title_Dropdown, "Mr / श्री");
		Reporter.log("Verify Application of Water and Sewerage Title_Dropdown is Present",true); //print for eclipse console 
		waitForSomeTime();
		
		
		HighlightOnElement(FirstName_Field);
		Assert.assertEquals(true,FirstName_Field.isEnabled());
		excel.getExcelData(FirstName_Field, "Environmental_Application_Form", 1, 1);
		Reporter.log("Verify Application of Water and Sewerage FirstName_Field is Present",true); //print for eclipse console 

		HighlightOnElement(MiddleName_Field);
		Assert.assertEquals(true,MiddleName_Field.isEnabled());
		excel.getExcelData(MiddleName_Field, "Environmental_Application_Form", 1, 2);
		Reporter.log("Verify Application of Water and Sewerage MiddleName_Field is Present",true); //print for eclipse console 

		HighlightOnElement(LastName_Field);
		Assert.assertEquals(true,LastName_Field.isEnabled());
		excel.getExcelData(LastName_Field, "Environmental_Application_Form", 1, 3);
		Reporter.log("Verify Application of Water and Sewerage LastName_Field is Present",true); //print for eclipse console 

		HighlightOnElement(Father_HusbandName_Field);
		Assert.assertEquals(true,Father_HusbandName_Field.isEnabled());
		excel.getExcelData(Father_HusbandName_Field, "Environmental_Application_Form", 1, 4);
		Reporter.log("Verify Application of Water and Sewerage Father_HusbandName_Field is Present",true); //print for eclipse console 

		HighlightOnElement(Relationship_Dropdown);
		Assert.assertEquals(true,Relationship_Dropdown.isEnabled());
		SelectVisibleText(Relationship_Dropdown, "Father / पिता");
		Reporter.log("Verify Application of Water and Sewerage Relationship_Dropdown is Present",true); //print for eclipse console 
		
		HighlightOnElement(MotherName_Field);
		Assert.assertEquals(true,MotherName_Field.isEnabled());
		excel.getExcelData(MotherName_Field, "Environmental_Application_Form", 1, 5);
		Reporter.log("Verify Application of Water and Sewerage MotherName_Field is Present",true); //print for eclipse console 

		HighlightOnElement(DateofBirth_Field);
		Assert.assertEquals(true,DateofBirth_Field.isEnabled());
		DateofBirth_Field.click();
		waitForSomeTime();
		HighlightOnElement(DateSelect);
		DateSelect.click();
		waitForSomeTime();
		Reporter.log("Verify Application of Water and Sewerage DateofBirth_Field is Present",true); //print for eclipse console 
		waitForSomeTime();
		
		//HighlightOnElement(Gender_Dropdown);
		//Assert.assertEquals(true,Gender_Dropdown.isEnabled());
		SelectVisibleText(Gender_Dropdown, "Male/पुरुष");
		Reporter.log("Verify Application of Water and Sewerage Gender_Dropdown is Present",true); //print for eclipse console 
	
		HighlightOnElement(CorrespondenceAddres_TAB);
		Assert.assertEquals(true,CorrespondenceAddres_TAB.isEnabled());
		CorrespondenceAddres_TAB.click();
		waitForSomeTime();
		Reporter.log("Verify Application of Water and Sewerage CorrespondenceAddres_TAB is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		WebDriverWait wait = new WebDriverWait(driver, 30); 
		WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div/div/div[2]/table/tbody/tr/td/table/tbody/tr[1]/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/select")));
		element.click();
		
		HighlightOnElement(State_Dropdown);
		Assert.assertEquals(true,State_Dropdown.isEnabled());
		SelectVisibleText(State_Dropdown, "CHHATTISGARH");
		Reporter.log("Verify Application of Water and Sewerage State_Dropdown is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(District_Dropdown);
		Assert.assertEquals(true,District_Dropdown.isEnabled());
		SelectVisibleText(District_Dropdown, "RAIPUR");
		Reporter.log("Verify Application of Water and Sewerage District_Dropdown is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
		
		HighlightOnElement(AddressField);
		Assert.assertEquals(true,AddressField.isEnabled());
		AddressField.sendKeys("Nellore");
		//excel.getExcelData(AddressField, "Environmental_Application_Form", 1, 8);
		Reporter.log("Verify Application ofEnvironment AddressField is Present",true); //print for eclipse console 

		
		HighlightOnElement(EmailField);
		Assert.assertEquals(true,EmailField.isEnabled());
		EmailField.sendKeys("a@gmail.com");
		//excel.getExcelData(AddressField, "Environmental_Application_Form", 1, 8);
		Reporter.log("Verify Application of Environment EmailField is Present",true); //print for eclipse console 

		
		
	/*	HighlightOnElement(Tehsil_Village_Field);
		Assert.assertEquals(true,Tehsil_Village_Field.isEnabled());
		excel.getExcelData(Tehsil_Village_Field, "Environmental_Application_Form", 1, 8);
		Reporter.log("Verify Application of Water and Sewerage Tehsil_Village_Field is Present",true); //print for eclipse console 
*/
		HighlightOnElement(Pincode_Field);
		Assert.assertEquals(true,Pincode_Field.isEnabled());
		excel.getExcelData(Pincode_Field, "Environmental_Application_Form", 1, 9);
		Reporter.log("Verify Application of Water and Sewerage Pincode_Field is Present",true); //print for eclipse console 

		HighlightOnElement(MobileNo_Filed);
		Assert.assertEquals(true,MobileNo_Filed.isEnabled());
		excel.getExcelData(MobileNo_Filed, "Environmental_Application_Form", 1, 10);
		Reporter.log("Verify Application of Water and Sewerage MobileNo_Filed is Present",true); //print for eclipse console 

		
		HighlightOnElement(PropertyDetails_TAB);
		Assert.assertEquals(true,PropertyDetails_TAB.isEnabled());
		PropertyDetails_TAB.click();
		waitForSomeTime();
		Reporter.log("Verify Application of Water and Sewerage PropertyDetails_TAB is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(PropertyId_Field);
		Assert.assertEquals(true,PropertyId_Field.isEnabled());
		excel.getExcelData(PropertyId_Field, "Environmental_Application_Form", 1, 14);
		Reporter.log("Verify Application of Water and Sewerage PropertyId_Field is Present",true); //print for eclipse console 
		
		HighlightOnElement(Plot_Field);
		Assert.assertEquals(true,Plot_Field.isEnabled());
		excel.getExcelData(Plot_Field, "Environmental_Application_Form", 1, 15);
		Reporter.log("Verify Application of Water and Sewerage Plot_Field is Present",true); //print for eclipse console 
		
		
		HighlightOnElement(State_DropdowninPropertyDetails);
		Assert.assertEquals(true,State_DropdowninPropertyDetails.isEnabled());
		SelectVisibleText(State_DropdowninPropertyDetails, "CHHATTISGARH");
		Reporter.log("Verify Application of Water and Sewerage State_DropdowninPropertyDetails is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(District_DropdowninPropertyDetails);
		Assert.assertEquals(true,District_DropdowninPropertyDetails.isEnabled());
		SelectVisibleText(District_DropdowninPropertyDetails, "RAIPUR");
		Reporter.log("Verify Application of Water and Sewerage District_DropdowninPropertyDetails is Present",true); //print for eclipse console 
		waitForSomeTime();
		
		HighlightOnElement(Tehsil_Village_FieldinPropertyDetails);
		Assert.assertEquals(true,Tehsil_Village_FieldinPropertyDetails.isEnabled());
		excel.getExcelData(Tehsil_Village_FieldinPropertyDetails, "Environmental_Application_Form", 1, 16);
		Reporter.log("Verify Application of Water and Sewerage Tehsil_Village_FieldinPropertyDetails is Present",true); //print for eclipse console 
		
		HighlightOnElement(MobileNumber_FieldinPropertyDetails);
		Assert.assertEquals(true,MobileNumber_FieldinPropertyDetails.isEnabled());
		excel.getExcelData(MobileNumber_FieldinPropertyDetails, "Environmental_Application_Form", 1, 17);
		Reporter.log("Verify Application of Water and Sewerage MobileNumber_FieldinPropertyDetails is Present",true); //print for eclipse console 
		
		waitForSomeTime();
		
		HighlightOnElement(Sector_DropdowninPropertyDetails);
		Assert.assertEquals(true,Sector_DropdowninPropertyDetails.isEnabled());
		SelectVisibleText(Sector_DropdowninPropertyDetails, "1");
		Reporter.log("Verify Application of Environment Sector_DropdowninPropertyDetails is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(AnyotherInformation_FieldinPropertyDetails);
		Assert.assertEquals(true,AnyotherInformation_FieldinPropertyDetails.isEnabled());
		//excel.getExcelData(MobileNumber_FieldinPropertyDetails, "Environmental_Application_Form", 1, 17);
		AnyotherInformation_FieldinPropertyDetails.sendKeys("Environment");
		Reporter.log("Verify Application of Environment AnyotherInformation_FieldinPropertyDetails is Present",true); //print for eclipse console 
		
		waitForSomeTime();
		
		
	}
	
	public  void VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizens_NOC_IsProject_SC_03_TC_04() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		waitForSomeTime();
		HighlightOnElement(TypeofNOC_TAB);
		Assert.assertEquals(true,TypeofNOC_TAB.isEnabled());
		TypeofNOC_TAB.click();
		waitForSomeTime();
		Reporter.log("Verify Application of Water and Sewerage TypeofNOC_TAB is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		
		HighlightOnElement(TypeofNOC_Dropdown);
		Assert.assertEquals(true,TypeofNOC_Dropdown.isEnabled());
		SelectVisibleText(TypeofNOC_Dropdown, "Project");
		Reporter.log("Verify Application of Water and Sewerage State_Dropdown is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		/*HighlightOnElement(TreeName_Field);
		Assert.assertEquals(true,TreeName_Field.isEnabled());
		excel.getExcelData(TreeName_Field, "Environmental_Application_Form", 1, 20);
		Reporter.log("Verify Application of Environment TreeName_Field is Present",true); //print for eclipse console */
		
		HighlightOnElement(PurposeofNOC_Dropdown);
		Assert.assertEquals(true,PurposeofNOC_Dropdown.isEnabled());
		//excel.getExcelData(PurposeofNOC_Field, "Environmental_Application_Form", 1, 48);
		SelectVisibleText(PurposeofNOC_Dropdown, "Tree Plantation");
		Reporter.log("Verify Application of Water and Sewerage PurposeofNOC_Field is Present",true); //print for eclipse console

		
		Assert.assertEquals(true,UploadDocumentButton.isEnabled());
		HighlightOnElement(UploadDocumentButton);
		UploadDocumentButton.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		Reporter.log("Applicant AddressProof Document Link Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
				
		HighlightOnElement(NameoftheProject_Field);
		Assert.assertEquals(true,NameoftheProject_Field.isEnabled());
		excel.getExcelData(NameoftheProject_Field, "Environmental_Application_Form", 1, 21);
		Reporter.log("Verify Application of Water and Sewerage NameoftheProject_Field is Present",true); //print for eclipse console 
		
		HighlightOnElement(SrNointheSchedule_Field);
		Assert.assertEquals(true,SrNointheSchedule_Field.isEnabled());
		excel.getExcelData(SrNointheSchedule_Field, "Environmental_Application_Form", 1, 22);
		Reporter.log("Verify Application of Water and Sewerage SrNointheSchedule_Field is Present",true); //print for eclipse console 
		
		HighlightOnElement(New_Expansion_Modernization_Field);
		Assert.assertEquals(true,New_Expansion_Modernization_Field.isEnabled());
		excel.getExcelData(New_Expansion_Modernization_Field, "Environmental_Application_Form", 1, 23);
		Reporter.log("Verify Application of Water and Sewerage New_Expansion_Modernization_Field is Present",true); //print for eclipse console 
		
		HighlightOnElement(NearestRailwayStation_Field);
		Assert.assertEquals(true,NearestRailwayStation_Field.isEnabled());
		excel.getExcelData(NearestRailwayStation_Field, "Environmental_Application_Form", 1, 24);
		Reporter.log("Verify Application of Water and Sewerage NearestRailwayStation_Field is Present",true); //print for eclipse console 
				
		HighlightOnElement(DistanceinKms_Field);
		Assert.assertEquals(true,DistanceinKms_Field.isEnabled());
		excel.getExcelData(DistanceinKms_Field, "Environmental_Application_Form", 1, 25);
		Reporter.log("Verify Application of Water and Sewerage DistanceinKms_Field is Present",true); //print for eclipse console 
		
		HighlightOnElement(NearestAirport_Field);
		Assert.assertEquals(true,NearestAirport_Field.isEnabled());
		excel.getExcelData(NearestAirport_Field, "Environmental_Application_Form", 1, 26);
		Reporter.log("Verify Application of Water and Sewerage NearestAirport_Field is Present",true); //print for eclipse console 
		
		HighlightOnElement(DistanceinKms_Field1);
		Assert.assertEquals(true,DistanceinKms_Field1.isEnabled());
		excel.getExcelData(DistanceinKms_Field1, "Environmental_Application_Form", 1, 27);
		Reporter.log("Verify Application of Water and Sewerage DistanceinKms_Field1 is Present",true); //print for eclipse console 
		
		HighlightOnElement(NearestTown_Field);
		Assert.assertEquals(true,NearestTown_Field.isEnabled());
		excel.getExcelData(NearestTown_Field, "Environmental_Application_Form", 1, 28);
		Reporter.log("Verify Application of Water and Sewerage NearestTown_Field is Present",true); //print for eclipse console 
		
		HighlightOnElement(DistanceinKms_Field2);
		Assert.assertEquals(true,DistanceinKms_Field2.isEnabled());
		excel.getExcelData(DistanceinKms_Field2, "Environmental_Application_Form", 1, 29);
		Reporter.log("Verify Application of Water and Sewerage DistanceinKms_Field2 is Present",true); //print for eclipse console
		
		HighlightOnElement(NearestCity_Field);
		Assert.assertEquals(true,NearestCity_Field.isEnabled());
		excel.getExcelData(NearestCity_Field, "Environmental_Application_Form", 1, 30);
		Reporter.log("Verify Application of Water and Sewerage NearestCity_Field is Present",true); //print for eclipse console
		
		HighlightOnElement(DistanceinKms_Field3);
		Assert.assertEquals(true,DistanceinKms_Field3.isEnabled());
		excel.getExcelData(DistanceinKms_Field3, "Environmental_Application_Form", 1, 31);
		Reporter.log("Verify Application of Water and Sewerage DistanceinKms_Field3 is Present",true); //print for eclipse console
		
		HighlightOnElement(NearestDistrict_Field);
		Assert.assertEquals(true,NearestDistrict_Field.isEnabled());
		excel.getExcelData(NearestDistrict_Field, "Environmental_Application_Form", 1, 32);
		Reporter.log("Verify Application of Water and Sewerage NearestDistrict_Field is Present",true); //print for eclipse console

		HighlightOnElement(DistanceinKms_Field4);
		Assert.assertEquals(true,DistanceinKms_Field4.isEnabled());
		excel.getExcelData(DistanceinKms_Field4, "Environmental_Application_Form", 1, 33);
		Reporter.log("Verify Application of Water and Sewerage DistanceinKms_Field4 is Present",true); //print for eclipse console
		
		HighlightOnElement(CategoryofProject_Field);
		Assert.assertEquals(true,CategoryofProject_Field.isEnabled());
		excel.getExcelData(CategoryofProject_Field, "Environmental_Application_Form", 1, 34);
		Reporter.log("Verify Application of Water and Sewerage CategoryofProject_Field is Present",true); //print for eclipse console
		
		HighlightOnElement(LocalBodyAddressField_Field);
		Assert.assertEquals(true,LocalBodyAddressField_Field.isEnabled());
		excel.getExcelData(LocalBodyAddressField_Field, "Environmental_Application_Form", 1, 35);
		Reporter.log("Verify Application of Water and Sewerage LocalBodyAddressField_Field is Present",true); //print for eclipse console
		ScroolDown();
		HighlightOnElement(LocalBodyname_Field);
		Assert.assertEquals(true,LocalBodyname_Field.isEnabled());
		excel.getExcelData(LocalBodyname_Field, "Environmental_Application_Form", 1, 36);
		Reporter.log("Verify Application of Water and Sewerage LocalBodyname_Field is Present",true); //print for eclipse console
		
		HighlightOnElement(NameOfthefirm_Field);
		Assert.assertEquals(true,NameOfthefirm_Field.isEnabled());
		excel.getExcelData(NameOfthefirm_Field, "Environmental_Application_Form", 1, 37);
		Reporter.log("Verify Application of Water and Sewerage NameOfthefirm_Field is Present",true); //print for eclipse console
				
		HighlightOnElement(RegisteredAddress_Field);
		Assert.assertEquals(true,RegisteredAddress_Field.isEnabled());
		excel.getExcelData(RegisteredAddress_Field, "Environmental_Application_Form", 1, 38);
		Reporter.log("Verify Application of Water and Sewerage RegisteredAddress_Field is Present",true); //print for eclipse console
		waitForSomeTime();
		ScroolDown();
		ScroolDown();
		waitForSomeTime();
		HighlightOnElement(Name_Field);
		Assert.assertEquals(true,Name_Field.isEnabled());
		excel.getExcelData(Name_Field, "Environmental_Application_Form", 1, 39);
		Reporter.log("Verify Application of Water and Sewerage Name_Field is Present",true); //print for eclipse console
		
		HighlightOnElement(Designation_Field);
		Assert.assertEquals(true,Designation_Field.isEnabled());
		excel.getExcelData(Designation_Field, "Environmental_Application_Form", 1, 40);
		Reporter.log("Verify Application of Water and Sewerage Designation_Field is Present",true); //print for eclipse console
				
		HighlightOnElement(Address_Field);
		Assert.assertEquals(true,Address_Field.isEnabled());
		excel.getExcelData(Address_Field, "Environmental_Application_Form", 1, 41);
		Reporter.log("Verify Application of Water and Sewerage Address_Field is Present",true); //print for eclipse console
		
		HighlightOnElement(Pincode_Field1);
		Assert.assertEquals(true,Pincode_Field1.isEnabled());
		excel.getExcelData(Pincode_Field1, "Environmental_Application_Form", 1, 42);
		Reporter.log("Verify Application of Water and Sewerage Pincode_Field1 is Present",true); //print for eclipse console
		
		HighlightOnElement(Email_Field);
		Assert.assertEquals(true,Email_Field.isEnabled());
		excel.getExcelData(Email_Field, "Environmental_Application_Form", 1, 43);
		Reporter.log("Verify Application of Water and Sewerage Email_Field is Present",true); //print for eclipse console
	
		HighlightOnElement(TelephoneNumber);
		Assert.assertEquals(true,TelephoneNumber.isEnabled());
		excel.getExcelData(TelephoneNumber, "Environmental_Application_Form", 1, 44);
		Reporter.log("Verify Application of Water and Sewerage TelephoneNumber is Present",true); //print for eclipse console
		
		HighlightOnElement(FaxNo_Field);
		Assert.assertEquals(true,FaxNo_Field.isEnabled());
		excel.getExcelData(FaxNo_Field, "Environmental_Application_Form", 1, 45);
		Reporter.log("Verify Application of Water and Sewerage FaxNo_Field is Present",true); //print for eclipse console
		Thread.sleep(10000);
		
		waitForSomeTime();
		HighlightOnElement(UnitofGirthSize_Field);
		Assert.assertEquals(true,UnitofGirthSize_Field.isEnabled());
		//excel.getExcelData(UnitofGirthSize_Field, "Environmental_Application_Form", 1, 51);
		UnitofGirthSize_Field.sendKeys("34");
		Reporter.log("Verify Application of Environment GirthSize_Field is Present",true); //print for eclipse console
		waitForSomeTime();
		waitForSomeTime();
		Assert.assertEquals(true,UploadDocumentButton2.isEnabled());
		HighlightOnElement(UploadDocumentButton2);
		UploadDocumentButton2.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Test.xls");
		Reporter.log(" Upload Document Link Application of Environment link is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		ScroolUp();
		
	}
	
	
	
	
	
	
	
	public  void VerifytheEnvironmentalApplicationfunctionalityfillbytheCitizens_NOC_IsINDIVIDUAL_SC_03_TC_05() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		waitForSomeTime();
		HighlightOnElement(TypeofNOC_TAB);
		Assert.assertEquals(true,TypeofNOC_TAB.isEnabled());
		TypeofNOC_TAB.click();
		waitForSomeTime();
		Reporter.log("Verify Application of Water and Sewerage TypeofNOC_TAB is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		
		HighlightOnElement(TypeofNOC_Dropdown);
		Assert.assertEquals(true,TypeofNOC_Dropdown.isEnabled());
		SelectVisibleText(TypeofNOC_Dropdown, "Individual NOC");
		Reporter.log("Verify Application of Water and Sewerage State_Dropdown is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
		Assert.assertEquals(true,UploadDocumentButton1.isEnabled());
		HighlightOnElement(UploadDocumentButton1);
		UploadDocumentButton1.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		Reporter.log(" Upload Document Link Application of Environment link is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
		
		HighlightOnElement(PurposeofNOC_Dropdown);
		Assert.assertEquals(true,PurposeofNOC_Dropdown.isEnabled());
		//excel.getExcelData(PurposeofNOC_Field, "Environmental_Application_Form", 1, 48);
		SelectVisibleText(PurposeofNOC_Dropdown, "Tree Plantation");
		Reporter.log("Verify Application of Water and Sewerage PurposeofNOC_Field is Present",true); //print for eclipse console

		HighlightOnElement(TypeofTree_Dropdown);
		Assert.assertEquals(true,TypeofTree_Dropdown.isEnabled());
		//excel.getExcelData(TypeofTree_Field, "Environmental_Application_Form", 1, 49);
		SelectVisibleText(TypeofTree_Dropdown, "Mango");
		Reporter.log("Verify Application of Water and Sewerage TypeofTree_Field is Present",true); //print for eclipse console
		
		//HighlightOnElement(TreeName_Field);
		//Assert.assertEquals(true,TreeName_Field.isEnabled());
		//excel.getExcelData(TreeName_Field, "Environmental_Application_Form", 1, 50);
		//Reporter.log("Verify Application of Water and Sewerage TreeName_Field is Present",true); //print for eclipse console
		
		HighlightOnElement(GirthSize_Field);
		Assert.assertEquals(true,GirthSize_Field.isEnabled());
		excel.getExcelData(GirthSize_Field, "Environmental_Application_Form", 1, 51);
		Reporter.log("Verify Application of Water and Sewerage GirthSize_Field is Present",true); //print for eclipse console
				
		HighlightOnElement(TotalTreeCount_Field);
		Assert.assertEquals(true,TotalTreeCount_Field.isEnabled());
		excel.getExcelData(TotalTreeCount_Field, "Environmental_Application_Form", 1, 52);
		Reporter.log("Verify Application of Water and Sewerage TotalTreeCount_Field is Present",true); //print for eclipse console
		Thread.sleep(10000);
		waitForSomeTime();
		HighlightOnElement(UnitofGirthSize_Field);
		Assert.assertEquals(true,UnitofGirthSize_Field.isEnabled());
		//excel.getExcelData(UnitofGirthSize_Field, "Environmental_Application_Form", 1, 51);
		UnitofGirthSize_Field.sendKeys("34");
		Reporter.log("Verify Application of Environment GirthSize_Field is Present",true); //print for eclipse console
		waitForSomeTime();
		waitForSomeTime();
		//Assert.assertEquals(true,UploadDocument2.isEnabled());
		HighlightOnElement(UploadDocument2);
		UploadDocument2.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Test.xls");
		Reporter.log(" Upload Document Link Application of Environment link is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(10000);		
	}
	
	public  void VerifyAddMoreButtonFunctionality_SC_03_TC_06() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(AddMore_Button);
		Assert.assertEquals(true,AddMore_Button.isEnabled());
		AddMore_Button.click();
		waitForSomeTime();
		Reporter.log("Verify Application of Water and Sewerage AddMore_Button is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		
		HighlightOnElement(Name_Field);
		Assert.assertEquals(true,Name_Field.isEnabled());
		//excel.getExcelData(Name_Field, "Environmental_Application_Form", 1, 39);
		Reporter.log("Verify Application of Water and Sewerage Name_Field is Present",true); //print for eclipse console
		
		HighlightOnElement(Designation_Field);
		Assert.assertEquals(true,Designation_Field.isEnabled());
		//excel.getExcelData(Designation_Field, "Environmental_Application_Form", 1, 40);
		Reporter.log("Verify Application of Water and Sewerage Designation_Field is Present",true); //print for eclipse console
				
		HighlightOnElement(Address_Field);
		Assert.assertEquals(true,Address_Field.isEnabled());
		//excel.getExcelData(Address_Field, "Environmental_Application_Form", 1, 41);
		Reporter.log("Verify Application of Water and Sewerage Address_Field is Present",true); //print for eclipse console
		
		HighlightOnElement(Pincode_Field1);
		Assert.assertEquals(true,Pincode_Field1.isEnabled());
		//excel.getExcelData(Pincode_Field1, "Environmental_Application_Form", 1, 42);
		Reporter.log("Verify Application of Water and Sewerage Pincode_Field1 is Present",true); //print for eclipse console
		
		HighlightOnElement(Email_Field);
		Assert.assertEquals(true,Email_Field.isEnabled());
		//excel.getExcelData(Email_Field, "Environmental_Application_Form", 1, 43);
		Reporter.log("Verify Application of Water and Sewerage Email_Field is Present",true); //print for eclipse console
	
		HighlightOnElement(TelephoneNumber);
		Assert.assertEquals(true,TelephoneNumber.isEnabled());
		//excel.getExcelData(TelephoneNumber, "Environmental_Application_Form", 1, 44);
		Reporter.log("Verify Application of Water and Sewerage TelephoneNumber is Present",true); //print for eclipse console
		
		HighlightOnElement(FaxNo_Field);
		Assert.assertEquals(true,FaxNo_Field.isEnabled());
		//excel.getExcelData(FaxNo_Field, "Environmental_Application_Form", 1, 45);
		Reporter.log("Verify Application of Water and Sewerage FaxNo_Field is Present",true); //print for eclipse console
	
	}

	public  void VerifyDeleteRowButtonFunctionality_SC_03_TC_07() throws InterruptedException
	{
		HighlightOnElement(DeleteRow_Button);
		Assert.assertEquals(true,DeleteRow_Button.isEnabled());
		DeleteRow_Button.click();
		waitForSomeTime();
		Reporter.log("Verify Application of Water and Sewerage DeleteRow_Button is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	
	@FindBy(xpath=".//*[@id='form0:growl_container']/div/div/div[2]/span")
	private WebElement SaveAsDraft_PopupMessage;
	
	public  void VerifySaveAsDraftButtonFunctionality_SC_03_TC_08() throws InterruptedException
	{
		
		HighlightOnElement(SaveAsDraft_Button);
		Assert.assertEquals(true,SaveAsDraft_Button.isEnabled());
		SaveAsDraft_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("Verify Application of Water and Sewerage SaveAsDraft_Button is Present",true); //print for eclipse console 
		
		HighlightOnElement(SaveAsDraft_PopupMessage);
		String ApplicationNumber=SaveAsDraft_PopupMessage.getText();
		String TempApplicationNumber=ApplicationNumber.substring(51,69);
		Reporter.log("Temporary Application Number Is:"+TempApplicationNumber);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	public  void VerifyBackButtonFunctionality_SC_03_TC_09() throws InterruptedException
	{
		
		HighlightOnElement(Back_Button);
		Assert.assertEquals(true,Back_Button.isEnabled());
		Back_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("Verify Application of Water and Sewerage SaveAsDraft_Button is Present",true); //print for eclipse console 
		
		HighlightOnElement(PropertyDetails_TAB);
		Assert.assertEquals(true,PropertyDetails_TAB.isEnabled());
		Reporter.log("Verify Application of Water and Sewerage PropertyDetails_TAB is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
	}
	
	public  void VerifyDownloadFromProjectButtonFunctionality_SC_03_TC_10() throws InterruptedException
	{
		
		HighlightOnElement(DownloadProjectform_Button);
		Assert.assertEquals(true,DownloadProjectform_Button.isEnabled());
		DownloadProjectform_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("Verify Application of Water and Sewerage DownloadProjectform_Button is Present",true); //print for eclipse console 
		waitForSomeTime();
	
	}
	
	
	public  void VerifyCloseButtonFunctionality_SC_03_TC_11() throws InterruptedException
	{
		HighlightOnElement(Close_Button);
		Assert.assertEquals(true,Close_Button.isEnabled());
		Close_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("Verify Application of Water and Sewerage DownloadProjectform_Button is Present",true); //print for eclipse console 
		waitForSomeTime();
	
	}
	@FindBy(xpath="//div[@id='form0:confirmDlg']/div[2]/div/div/center/table/tbody/tr/td/button")
	private List<WebElement> button;
	
	public void clickonPopup_YESButton() throws InterruptedException
	
	   {
		 waitForSomeTime();
		for(int index=0;index<button.size();index++)
		   {
			waitForSomeTime();
			String buttone=button.get(index).getText();
			System.out.println(buttone);
			
			if( buttone.trim().equalsIgnoreCase("Yes"))
			   {
				button.get(index).click();
				Reporter.log("Verify Yes Button In POP-UP Of Application In Water&Sewerage New Connection  is Present",true);
			   }
		   }
		  waitForSomeTime();
		  waitForSomeTime();
	   }
	
	public  void VerifyResetButtonFunctionality_SC_03_TC_12() throws InterruptedException
	{
		HighlightOnElement(Reset_Button);
		Assert.assertEquals(true,Reset_Button.isEnabled());
		Reset_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("Verify Application of Water and Sewerage Reset_Button is Present",true); //print for eclipse console 
		waitForSomeTime();
	
	}
	
	public  void VerifytextFieldsResetornot() throws InterruptedException
	{
		VerifyTextField(FirstName_Field);
		VerifyTextField(MiddleName_Field);
		VerifyTextField(LastName_Field);
		VerifyTextField(Father_HusbandName_Field);
		VerifyTextField(MotherName_Field);
		VerifyTextField(DateofBirth_Field);
	}
	
	@FindBy(xpath=".//*[@id='form0:growl_container']/div/div/div[2]/span")
	private WebElement UploadErrorMsg;
	
	public  void VerifytheuploadfunctionalitywithInValidFile_SC_03_TC_16() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		waitForSomeTime();
		HighlightOnElement(Upload_DocumentTab);
		Assert.assertTrue(Upload_DocumentTab.isEnabled(),"TestCase Pass:  Upload_DocumentTab");
		Upload_DocumentTab.click();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA RTI Upload_DocumentTab  is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(ServicerelatedDocument_Dropdown);
		SelectVisibleText(ServicerelatedDocument_Dropdown, "Other Document");
		waitForSomeTime();
		waitForSomeTime();
		
		HighlightOnElement(Upload_Button1);
		//Assert.assertTrue(RTI_InformationTAB.isEnabled(),"TestCase Pass:  Upload_Button");
		Upload_Button1.click();
		waitForSomeTime();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\TestData.txt");
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA RTI Upload_Button  is Present",true); //print for eclipse console 
		waitForSomeTime();
		HighlightOnElement(UploadErrorMsg);
		String ActualMsg=UploadErrorMsg.getText();
		String ExpectedMsg="Upload File with extension jpeg , jpg , png and pdf file;";
		Assert.assertEquals(ActualMsg, ExpectedMsg);
		waitForSomeTime();
		waitForSomeTime();
	}
	
	public  void VerifytheuploadfunctionalitywithValidFile_SC_03_TC_17() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		waitForSomeTime();
		HighlightOnElement(Upload_DocumentTab);
		Assert.assertTrue(Upload_DocumentTab.isEnabled(),"TestCase Pass:  Upload_DocumentTab");
		Upload_DocumentTab.click();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA RTI Upload_DocumentTab  is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(ServicerelatedDocument_Dropdown);
		SelectVisibleText(ServicerelatedDocument_Dropdown, "Other Document");
		waitForSomeTime();
		waitForSomeTime();
		
		HighlightOnElement(Upload_Button1);
		//Assert.assertTrue(RTI_InformationTAB.isEnabled(),"TestCase Pass:  Upload_Button");
		Upload_Button1.click();
		waitForSomeTime();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		waitForSomeTime();
		waitForSomeTime();
		
		
	}
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/table/tbody/tr[1]/td[2]/label")
	private WebElement EnvironmentApplicationNumber;
	
	
	@FindBy(xpath="//button[contains(.,'Download Receipt')]")
	private WebElement DownloadReceipt;
	
	public  void VerifytheSubmitButtonfunctionality_SC_03_TC_18() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		//Reporter.log("Applicant AddressProof Document Link Application of Water and Sewerage New connection link is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("alert('Please Enter Captcha..');");
		waitForSomeTime();
		acceptAlert();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Submit_Button);
		Assert.assertEquals(true,Submit_Button.isEnabled());
		Submit_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
		HighlightOnElement(EnvironmentApplicationNumber);
		String ApllicationNumber=EnvironmentApplicationNumber.getText().trim();
		excel.updateExcelDataEnvironment(ApllicationNumber);
		waitForSomeTime();
		HighlightOnElement(DownloadReceipt);
		Assert.assertEquals(true,DownloadReceipt.isEnabled());
		DownloadReceipt.click();
		waitForSomeTime();
		waitForSomeTime();
	
	}
	
	
	@FindBy(xpath="//a[contains(.,'Submitted Applications')]")
	private WebElement SubmittedApplication_Link;
	
	@FindBy(xpath="//a[contains(.,'Application Status/आवेदन की स्थिति')]")
	private WebElement ApplicationStatus;
	
	
	@FindBy(xpath="//a[contains(.,'ENVIRONMENT NOC')]/../following-sibling::div/div/div[1]/table/tbody/tr/td[5]/span")
	private WebElement Applicationsatus;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/input")
	private WebElement entervalueinsearchbox;
	
	@FindBy(xpath="//button/span[contains(text(),'Search')]")
	private WebElement searchbtn;
	
	@FindBy(xpath="(//table[@role='grid']/thead/tr)")
	private WebElement Application_Grid;
	
	@FindBy(xpath="//table[@role='grid']/tbody/tr/td[5]/span[contains(.,'PENDING')]")
	private WebElement Application_Status;
	
	@FindBy(xpath="//a[contains(.,'ENVIRONMENT NOC')]/../following-sibling::div/div/div[1]/table/thead/tr/th/span")
	private List<WebElement> Application_Menu;
	
	
	@FindBy(xpath="//a[contains(.,'ENVIRONMENT NOC')]")
	private WebElement Environment_Link;
	
	
	public void toverifythesubmittedApplicationStatus_SC_05_TC_01() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(ApplicationStatus);
		Assert.assertTrue(ApplicationStatus.isEnabled(),"TestCase Pass:  ApplicationStatus");
		ApplicationStatus.click();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA ApplicationStatus  is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
	
		HighlightOnElement(entervalueinsearchbox);
		//String Validnumber=ApplicationNumber.getText();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "Environment_Application_Number",0, 1);
		Reporter.log("Valid Application Number:"+validnumber,true);
		
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		HighlightOnElement(SubmittedApplication_Link);
		SubmittedApplication_Link.click();
		waitForSomeTime();
		HighlightOnElement(Environment_Link);
		Assert.assertTrue(Environment_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
		Environment_Link.click();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
		waitForSomeTime();
		
		waitForSomeTime();
		for(WebElement MenuInDashBoard:Application_Menu)
		{
			HighlightOnElement(MenuInDashBoard);
			if(MenuInDashBoard.isDisplayed())
			{
				String DashBoardMenu=MenuInDashBoard.getText();
			Reporter.log("Menu In Application  Are:"+DashBoardMenu,true);
			}
		}
		
		
		//HighlightOnElement(Application_Status);
	}
	
	
	@FindBy(xpath="//img[@src='/NRDAuthorityPreUAT/resources/images/view-icon.png']")
	private WebElement Action_Button;
	@FindBy(xpath="//button[contains(.,'Close') and@role='button']")
	private WebElement Close_button;
	
	public void toverifytheActionButtonEnvironmentAppplication_SC_05_TC02() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		HighlightOnElement(ApplicationStatus);
		ApplicationStatus.click();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
	
		HighlightOnElement(entervalueinsearchbox);
		//String Validnumber=ApplicationNumber.getText();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "Environment_Application_Number",0, 1);
		Reporter.log("Valid Application Number:"+validnumber,true);
		
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		
		HighlightOnElement(SubmittedApplication_Link);
		Assert.assertTrue(SubmittedApplication_Link.isEnabled(),"TestCase Pass:  SubmittedApplication_Link");
		SubmittedApplication_Link.click();
		waitForSomeTime();
		
		HighlightOnElement(Environment_Link);
		Assert.assertTrue(Environment_Link.isEnabled(),"TestCase Pass:  Environment_Link");
		Environment_Link.click();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA Environment_Link  is Present",true); //print for eclipse console 
		waitForSomeTime();
		
		HighlightOnElement(Action_Button);
		Assert.assertTrue(Action_Button.isEnabled(),"TestCase Pass:  Action_Button");
		Action_Button.click();
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA Action_Button  is Present",true); //print for eclipse console 
		waitForSomeTime();
		
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		HighlightOnElement(Close_button);
		Assert.assertTrue(Close_button.isEnabled(),"TestCase Pass:  Close_button");
		Close_button.click();
		Thread.sleep(10000);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA Close_button  is Present",true); //print for eclipse console 
	
	}
	
	
	public void toverifytheApplicationStatus_SC_05_TC_03() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(ApplicationStatus);
		Assert.assertTrue(ApplicationStatus.isEnabled(),"TestCase Pass:  ApplicationStatus");
		ApplicationStatus.click();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA ApplicationStatus  is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
	
		HighlightOnElement(entervalueinsearchbox);
		//String Validnumber=ApplicationNumber.getText();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "Environment_Application_Number",0, 1);
		Reporter.log("Valid Application Number:"+validnumber,true);
		
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		HighlightOnElement(SubmittedApplication_Link);
		SubmittedApplication_Link.click();
		waitForSomeTime();
		HighlightOnElement(Environment_Link);
		Assert.assertTrue(Environment_Link.isEnabled(),"TestCase Pass:  Environment_Link");
		Environment_Link.click();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
		waitForSomeTime();
		
		HighlightOnElement(Applicationsatus);
		
	}
	
	
	@FindBy(xpath="//button[contains(.,'Delete') and@role='button']")
	private WebElement Delete;
	
	@FindBy(xpath="//button[contains(.,'Proceed') and@role='button']")
	private WebElement Proceed;
	
	
	@FindBy(xpath="//a[contains(.,'Drafted Applications')]")
	private WebElement DraftedApplication;
	
	@FindBy(xpath="//a[contains(.,'Drafted Applications')]/../following-sibling::div/div/h3/a[contains(.,'ENVIRONMENT NOC')]/../following-sibling::div/div/div/div[1]/table/tbody/tr[1]/td[6]/button/span")
	private List <WebElement> PROCEED_DELETE_BUTTONS;
	
	@FindBy(xpath="//a[contains(.,'Drafted Applications')]/../following-sibling::div/div/h3/a[contains(.,'ENVIRONMENT NOC')]/../following-sibling::div/div/div/div[1]/table/tbody/tr[1]/td[6]/button[contains(.,'Proceed')]")
	private WebElement ProceedButton;
	
	@FindBy(xpath="//a[contains(.,'Drafted Applications')]/../following-sibling::div/div/h3/a[contains(.,'ENVIRONMENT NOC')]/../following-sibling::div/div/div/div[1]/table/tbody/tr[1]/td[6]/button[contains(.,'Delete')]")
	private WebElement DeleteButton;
	
	@FindBy(xpath="//a[contains(.,'Drafted Applications')]/../following-sibling::div/div/h3/a[contains(.,'ENVIRONMENT NOC')]")
	private WebElement DraftedEnvironment_Link;
	
	
	
	
	
	public void toverifytheDraftedApplicationinInEnvironment_SC_06_TC_01() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		waitForSomeTime();
		HighlightOnElement(ApplicationStatus);
		Assert.assertTrue(ApplicationStatus.isEnabled(),"TestCase Pass:  ApplicationStatus");
		ApplicationStatus.click();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA ApplicationStatus  is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
	
		HighlightOnElement(DraftedApplication);
		DraftedApplication.click();
		Reporter.log("Verify Application of NRDA ONLINERTI  DraftedApplication  is Present",true);
		waitForSomeTime();
		HighlightOnElement(DraftedEnvironment_Link);
		Assert.assertTrue(DraftedEnvironment_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
		DraftedEnvironment_Link.click();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		for(WebElement MenuInDashBoard:PROCEED_DELETE_BUTTONS)
		{
			
			if(MenuInDashBoard.isDisplayed())
			{
				HighlightOnElement(MenuInDashBoard);
				String DashBoardMenu=MenuInDashBoard.getText();
				Reporter.log("Button in Drafted Application Are:"+DashBoardMenu,true);
			}
		}
	}
	
	
	
	
	public void toverifyProceedButtoninDraftedApplication_SC_06_TC_02() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(ApplicationStatus);
		Assert.assertTrue(ApplicationStatus.isEnabled(),"TestCase Pass:  ApplicationStatus");
		ApplicationStatus.click();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA ApplicationStatus  is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
	
		HighlightOnElement(DraftedApplication);
		DraftedApplication.click();
		Reporter.log("Verify Application of NRDA ONLINERTI  DraftedApplication  is Present",true);
		waitForSomeTime();
		HighlightOnElement(DraftedEnvironment_Link);
		Assert.assertTrue(DraftedEnvironment_Link.isEnabled(),"TestCase Pass:  ONLINERTI_Link");
		DraftedEnvironment_Link.click();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA DraftedEnvironment_Link  is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(ProceedButton);
		ProceedButton.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	
		waitForSomeTime();
	}
	
	
	public void toverifyDeleteButtoninDraftedApplication_SC_06_TC_03() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(ApplicationStatus);
		Assert.assertTrue(ApplicationStatus.isEnabled(),"TestCase Pass:  ApplicationStatus");
		ApplicationStatus.click();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA ApplicationStatus  is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
	
		HighlightOnElement(DraftedApplication);
		DraftedApplication.click();
		Reporter.log("Verify Application of NRDA Environment  DraftedApplication  is Present",true);
		waitForSomeTime();
		HighlightOnElement(DraftedEnvironment_Link);
		Assert.assertTrue(DraftedEnvironment_Link.isEnabled(),"TestCase Pass:  DraftedEnvironment_Link");
		DraftedEnvironment_Link.click();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA ONLINERTI_Link  is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(DeleteButton);
		DeleteButton.click();
		waitForSomeTime();
		waitForSomeTime();
	
	}
	
	
	@FindBy(xpath="//a[contains(.,'Approved/Rejected Application/स्वीकृत/अस्वीकृत आवेदन')]")
	private WebElement Approved_Reject_Applications;
	
	@FindBy(xpath="//span[contains(.,'Approved / Rejected Applications')]/../following-sibling::div/table/tbody/tr[2]/td/div/div[1]/table/thead/tr/th")
	private List<WebElement> Application1_Menu;
	
	public void toverifytheApproved_RejectedApplicationinInEnvironment_SC_07_TC_01() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		waitForSomeTime();
		HighlightOnElement(Approved_Reject_Applications);
		Assert.assertTrue(Approved_Reject_Applications.isEnabled(),"TestCase Pass:  Approved_Reject_Applications");
		Approved_Reject_Applications.click();
		waitForSomeTime();
		Reporter.log("Verify Application of NRDA Approved_Reject_Applications  is Present",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
	
		HighlightOnElement(searchbtn);
		
		Reporter.log("Verify Application of Environment Search Button  is Present",true);
		waitForSomeTime();
		
		for(WebElement MenuInDashBoard:Application1_Menu)
		{
			
			if(MenuInDashBoard.isDisplayed())
			{
				HighlightOnElement(MenuInDashBoard);
				String DashBoardMenu=MenuInDashBoard.getText();
				Reporter.log("Application Labels are:"+DashBoardMenu,true);
			}
		}
	}
	
	
	
	
	
	
	
}
