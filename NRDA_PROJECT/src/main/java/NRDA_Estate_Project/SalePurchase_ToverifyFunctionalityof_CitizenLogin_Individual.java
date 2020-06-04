package NRDA_Estate_Project;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class SalePurchase_ToverifyFunctionalityof_CitizenLogin_Individual extends CommonLibrary {
	
	
	Logger log=Logger.getLogger("devpinoyLogger");
	ExcelDataDriver excel=new ExcelDataDriver();
	
	
	@FindBy(xpath="//div[@class='ui-accordion ui-widget ui-helper-reset ui-hidden-container Accordian-Header-Black']/h3/a")
	private List <WebElement> HeadingsInApplications;
	
	@FindBy(xpath="//a[contains(.,'Fresh Application/नया आवेदन')]")
	private WebElement FreshApplication;
	
	
	public void toverifythedashboardoftheApplication() throws InterruptedException
	{
		
		HighlightOnElement(FreshApplication);
		FreshApplication.click();
		waitForSomeTime();
		waitForSomeTime();
		for(WebElement menulist:HeadingsInApplications)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" Menu list in Dash Board are:"+Menu );
			}

		}
	
	}

	@FindBy(xpath="//a[contains(.,'Apply for New Land/Project Scheme')]")
	private WebElement ApplyforNewProject_LandSchemeLink;
	
	@FindBy(xpath="//a[contains(.,'Project List for Apply')]/../following-sibling::div/div/div[1]/table/thead/tr/th/span")
	private List <WebElement> ProjectList;
	
	public void toverifytheProjectListInApplication() throws InterruptedException
	{
		
		HighlightOnElement(FreshApplication);
		FreshApplication.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(ApplyforNewProject_LandSchemeLink);
		Assert.assertNotNull(ApplyforNewProject_LandSchemeLink.isDisplayed(),"Test case pass");
		ApplyforNewProject_LandSchemeLink.click();
		Reporter.log("To Click on ApplyforNewProject_LandSchemeLink is Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		for(WebElement menulist:HeadingsInApplications)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" Menu list in Dash Board are:"+Menu );
			}

		}
	
	}
	
	
	public void toverifyApplyLink() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		HighlightOnElement(ApplyforNewProject_LandSchemeLink);
		ApplyforNewProject_LandSchemeLink.click();
		waitForSomeTime();
		waitForSomeTime();
		String Application_Number=excel.getExcelData1("Estate_Application_Number", 0, 1);
		System.out.println("Application NumberIs:"+Application_Number);
		List<WebElement> allpages = driver.findElements(By.xpath("//a[contains(.,'Project List for Apply')]/../following-sibling::div/div/div[2]/span[4]/span"));
		System.out.println("Total pages :" +allpages.size());
		    
		    boolean check = true;
		    for(int i=1; i<=(allpages.size()); i++)
		        {
		    	List<WebElement> allrows = driver.findElements(By.xpath("//a[contains(.,'Project List for Apply')]/../following-sibling::div/div/div[1]/table/tbody/tr"));
		            for(int row=1; row<=allrows.size(); row++)
		                {
		                    System.out.println("Total rows :" +allrows.size()); 
		                    String name = driver.findElement(By.xpath("//a[contains(.,'Project List for Apply')]/../following-sibling::div/div/div[1]/table/tbody/tr["+row+"]/td[2]")).getText();
		                    //System.out.println(name);
		                    System.out.println("Row loop");
		                    if(name.equals(Application_Number))
		                        {
		                            WebElement ApplicationNumber = driver.findElement(By.xpath("//a[contains(.,'Project List for Apply')]/../following-sibling::div/div/div[1]/table/tbody/tr["+row+"]/td[9]/a[contains(.,'Apply')]"));
		                            ApplicationNumber.click();
		                            System.out.println("Element  exist");
		                            check = false;
		                            break;
		                        }
		                    else
		                    {
		                        System.out.println("Element doesn't exist");
		                    }
		               
		                }

		       
		            if(check)
		            {
		            allpages.get(i).click();
		            waitForSomeTime();
		            }
		      
		           
		        }
		    waitForSomeTime();
		    waitForSomeTime();
		    HighlightOnElement(ProjectName_Field);
		    Assert.assertNotNull(ProjectName_Field.isDisplayed(),"Test case pass");
		    Reporter.log("ProjectName_Field is present in Application",true);
	
	}	
	
	@FindBy(xpath="//input[@title='Project Name']")
	private WebElement ProjectName_Field;
	
	@FindBy(xpath="//a[contains(.,'Applicant Details')]/../../following-sibling::div/div[1]/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List <WebElement> ApplicantDetailsFormLabels;
	
	public void toverifytheApplicantDetailsForm() throws InterruptedException
	{
		
		waitForSomeTime();
		for(WebElement menulist:ApplicantDetailsFormLabels)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" MenuLabels in the ApplicantDetailsForm are:"+Menu );
			}

		}
	
	}
	
	@FindBy(xpath="//input[@title='Project Code']")
	private WebElement ProjectCode_Field;
	
	@FindBy(xpath="//textarea[@title='Project Address']")
	private WebElement ProjectAddress_Field;
	
	@FindBy(xpath="//select[@title='Land Use Zone']")
	private WebElement LandUseZone_Dropdown;
	
	@FindBy(xpath="//select[@title='Applicant Type']")
	private WebElement ApplicantType_Dropdown;
	
	@FindBy(xpath="//select[@title='Constitution of Applicant']")
	private WebElement ConstitutionofApplicant_Dropdown;
	
	@FindBy(xpath="//input[@title='Aadhaar Number']")
	private WebElement AadhaarNumberFiled;
	
	@FindBy(xpath="//select[@title='Applicant Title']")
	private WebElement ApplicantTitle_Dropdown;
	
	@FindBy(xpath="//input[@title='First Name']")
	private WebElement FirstName_Field;
	
	@FindBy(xpath="//input[@title='Middle Name']")
	private WebElement MiddleName_Field;
	
	@FindBy(xpath="//input[@title='Last Name']")
	private WebElement LastName_Field;
	
	@FindBy(xpath="//input[@title='Father Name']")
	private WebElement FatherName_Field;
	
	@FindBy(xpath="//input[@title='Mother Name']")
	private WebElement MotherName_Field;
	
	@FindBy(xpath="//input[@title='Spouse Name']")
	private WebElement SpouseName_Field;
	
	@FindBy(xpath="//input[@title='Date of Birth']")
	private WebElement DateofBirth_Field;
	
	@FindBy(xpath="//select[@class='ui-datepicker-month']")
	private WebElement MonthDropdown;
	
	@FindBy(xpath="//select[@class='ui-datepicker-year']")
	private WebElement YearDropdown;
	
	@FindBy(xpath="//a[contains(.,'15')]")
	private WebElement DateButton;
	
	@FindBy(xpath="(//select[@title='Gender'])[1]")
	private WebElement Gender_Dropdown;
	
	@FindBy(xpath="//input[@title='Entity/Company/Firm Name']")
	private WebElement EntityCompany_NameField;
	
	@FindBy(xpath="//input[@title='SPOC Person Name']")
	private WebElement SPOCPersonName_Field;
	
	@FindBy(xpath="//input[@title='Designation']")
	private WebElement Designation_Field;
	
	@FindBy(xpath="//input[@title='Mobile Number']")
	private WebElement MobileNumber_Field;
	
	@FindBy(xpath="//input[@title='E-Mail']")
	private WebElement Email_Field;
	
	@FindBy(xpath="//input[@title='Pan Number']")
	private WebElement PanNumber_Field;
	
	@FindBy(xpath="//select[@title='Reservation Category']")
	private WebElement ReservationCategory_Dropdown;
	
	@FindBy(xpath="//input[@title='TAN Number']")
	private WebElement TANNumberField;
	
	@FindBy(xpath="//input[@title='GSTIN']")
	private WebElement GSTIN_Field;
	
	@FindBy(xpath="(//input[@title='Net Worth (INR)'])[1]")
	private WebElement NetWorth_Field;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[4]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/span/div/div[1]/label")
	private WebElement ApplicantImage_Upload;
	
	@FindBy(xpath="(//table[@class='ui-panelgrid ui-widget']/tbody/tr[4]/td[1]/table/tbody/tr/td[2]/table/tbody/tr[1]/td/span/div/div[1]/label)[1]")
	private WebElement ApplicantImage_Upload1;
	
	public void toverifyApplicantDetailsFormFunctionality() throws InterruptedException, AWTException
	{
		HighlightOnElement(ProjectName_Field);
		Assert.assertNotNull(ProjectName_Field.isDisplayed(),"Test case pass");
		Reporter.log("ProjectName_Field is present in Application",true);
		VerifyTextField(ProjectName_Field);
	
		HighlightOnElement(ProjectCode_Field);
		Assert.assertNotNull(ProjectCode_Field.isDisplayed(),"Test case pass");
		Reporter.log("ProjectCode_Field is present in Application",true);
		VerifyTextField(ProjectCode_Field);
		
		HighlightOnElement(ProjectAddress_Field);
		Assert.assertNotNull(ProjectAddress_Field.isDisplayed(),"Test case pass");
		Reporter.log("ProjectAddress_Field is present in Application",true);
		VerifyTextField(ProjectAddress_Field);
	
		HighlightOnElement(LandUseZone_Dropdown);
		Assert.assertNotNull(LandUseZone_Dropdown.isDisplayed(),"Test case pass");
		Reporter.log("LandUseZone_Dropdown is present in Application",true);
		verifydropdownelement(LandUseZone_Dropdown);

		HighlightOnElement(ApplicantType_Dropdown);
		Assert.assertNotNull(ApplicantType_Dropdown.isDisplayed(),"Test case pass");
		SelectVisibleText(ApplicantType_Dropdown, "Individual");
		Reporter.log("Select Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(20000);
	
		HighlightOnElement(ConstitutionofApplicant_Dropdown);
		Assert.assertNotNull(ConstitutionofApplicant_Dropdown.isDisplayed(),"Test case pass");
		SelectVisibleText(ConstitutionofApplicant_Dropdown, "Individual");
		Reporter.log("Select Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(20000);
	
		HighlightOnElement(AadhaarNumberFiled);
		Assert.assertNotNull(AadhaarNumberFiled.isDisplayed(),"Test case pass");
		AadhaarNumberFiled.sendKeys("572241310456");
		Reporter.log("Select Dropdown value in application Successfully",true);
		waitForSomeTime();
	
		Assert.assertEquals(true,ApplicantImage_Upload.isEnabled());
		HighlightOnElement(ApplicantImage_Upload);
		ApplicantImage_Upload.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		Reporter.log(" Upload Document on ApplicantImage_Upload Successfully",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(10000);
	
		HighlightOnElement(ApplicantTitle_Dropdown);
		Assert.assertNotNull(ApplicantTitle_Dropdown.isDisplayed(),"Test case pass");
		SelectVisibleText(ApplicantTitle_Dropdown, "Mr / श्री");
		Reporter.log("Select Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(8000);
	
		HighlightOnElement(FirstName_Field);
		Assert.assertNotNull(FirstName_Field.isDisplayed(),"Test case pass");
		FirstName_Field.sendKeys("sarvesh");
		Reporter.log("To send data in FirstName_Field Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(MiddleName_Field);
		Assert.assertNotNull(MiddleName_Field.isDisplayed(),"Test case pass");
		MiddleName_Field.sendKeys("Venkata");
		Reporter.log("To send data in MiddleName_Field Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(LastName_Field);
		Assert.assertNotNull(LastName_Field.isDisplayed(),"Test case pass");
		LastName_Field.sendKeys("Nellore");
		Reporter.log("To send data in LastName_Field Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(FatherName_Field);
		Assert.assertNotNull(FatherName_Field.isDisplayed(),"Test case pass");
		FatherName_Field.sendKeys("Jayaramaiah");
		Reporter.log("To send data in FatherName_Field Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(MotherName_Field);
		Assert.assertNotNull(MotherName_Field.isDisplayed(),"Test case pass");
		MotherName_Field.sendKeys("Lakshmi");
		Reporter.log("To send data in MotherName_Field Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(SpouseName_Field);
		Assert.assertNotNull(SpouseName_Field.isDisplayed(),"Test case pass");
		SpouseName_Field.sendKeys("Ananya");
		Reporter.log("To send data in SpouseName_Field Successfully",true);
		waitForSomeTime();
		
		ScroolDown();
		HighlightOnElement(DateofBirth_Field);
		Assert.assertNotNull(DateofBirth_Field.isDisplayed(),"Test case pass");
		DateofBirth_Field.click();
		Reporter.log("To click on dateof birth Successfully",true);
		waitForSomeTime();
		HighlightOnElement(MonthDropdown);
		MonthDropdown.click();
		SelectVisibleText(MonthDropdown, "Mar");
		waitForSomeTime();
		HighlightOnElement(YearDropdown);
		YearDropdown.click();
		SelectVisibleText(YearDropdown, "2012");
		waitForSomeTime();
		YearDropdown.click();
		SelectVisibleText(YearDropdown, "2005");
		waitForSomeTime();
		SelectVisibleText(YearDropdown, "1996");
		HighlightOnElement(DateButton);
		DateButton.click();
		waitForSomeTime();
		Reporter.log("To select DateofBirth_Field Successfully",true);
	
		/*HighlightOnElement(EntityCompany_NameField);
		Assert.assertNotNull(EntityCompany_NameField.isDisplayed(),"Test case pass");
		EntityCompany_NameField.sendKeys("ILFS");
		Reporter.log("To send data in EntityCompany_NameField Successfully",true);
		waitForSomeTime();*/
	
		HighlightOnElement(SPOCPersonName_Field);
		Assert.assertNotNull(SPOCPersonName_Field.isDisplayed(),"Test case pass");
		SPOCPersonName_Field.sendKeys("Arun");
		Reporter.log("To send data in SPOCPersonName_Field Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(MobileNumber_Field);
		Assert.assertNotNull(MobileNumber_Field.isDisplayed(),"Test case pass");
		MobileNumber_Field.sendKeys("9703774101");
		Reporter.log("To send data in MobileNumber_Field Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(Email_Field);
		Assert.assertNotNull(Email_Field.isDisplayed(),"Test case pass");
		Email_Field.sendKeys("s@gmail.com");
		Reporter.log("To send data in Email_Field Successfully",true);
		waitForSomeTime();
		
		/*HighlightOnElement(Designation_Field);
		Assert.assertNotNull(Designation_Field.isDisplayed(),"Test case pass");
		Designation_Field.sendKeys("Officer");
		Reporter.log("To send data in Email_Field Successfully",true);
		waitForSomeTime();*/
	
		HighlightOnElement(PanNumber_Field);
		Assert.assertNotNull(PanNumber_Field.isDisplayed(),"Test case pass");
		PanNumber_Field.sendKeys("GLEPS8564Q");
		Reporter.log("To send data in PanNumber_Field Successfully",true);
		waitForSomeTime();
		
		/*HighlightOnElement(TANNumberField);
		Assert.assertNotNull(TANNumberField.isDisplayed(),"Test case pass");
		TANNumberField.sendKeys("GLEPS8564Q");
		Reporter.log("To send data in TANNumberField Successfully",true);
		waitForSomeTime();
		
		HighlightOnElement(GSTIN_Field);
		Assert.assertNotNull(GSTIN_Field.isDisplayed(),"Test case pass");
		GSTIN_Field.sendKeys("8564");
		Reporter.log("To send data in GSTIN_Field Successfully",true);
		waitForSomeTime();*/
	
		HighlightOnElement(ReservationCategory_Dropdown);
		Assert.assertNotNull(ReservationCategory_Dropdown.isDisplayed(),"Test case pass");
		SelectVisibleText(ReservationCategory_Dropdown, "NRDA Employee");
		Reporter.log("Select Dropdown value in ReservationCategory_Dropdown Successfully",true);
		waitForSomeTime();
		Thread.sleep(20000);
		HighlightOnElement(NetWorth_Field);
		NetWorth_Field.sendKeys("1500");
		waitForSomeTime();
		
	
	}
	
	
	@FindBy(xpath="//a[contains(.,'Permanent / Registered Address')]")
	private WebElement PermanentandRegisteredAddressTab;
	
	
	@FindBy(xpath="//a[contains(.,'Permanent / Registered Address')]/../../following-sibling::div/div[2]/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List <WebElement> PermanentandRegisteredAddressLabels;
	
	
	public void toverifythePermanentandRegisteredAddresTab() throws InterruptedException
	{
		HighlightOnElement(PermanentandRegisteredAddressTab);
		PermanentandRegisteredAddressTab.click();
		waitForSomeTime();
		Thread.sleep(10000);
		for(WebElement menulist:PermanentandRegisteredAddressLabels)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" MenuLabels in the PermanentandRegisteredAddressLabels are:"+Menu );
			}

		}
	
	}
	
	@FindBy(xpath="//select[@title='Country']")
	private WebElement Country_Dropdown;
	
	@FindBy(xpath="(//select[@title='State'])[1]")
	private WebElement State_Dropdown;
	
	@FindBy(xpath="(//select[@title='District'])[1]")
	private WebElement District_Dropdown;
	
	@FindBy(xpath="(//textarea[@title='Address'])[1]")
	private WebElement Address_Field;
	
	@FindBy(xpath="(//input[@title='Pin Code'])[1]")
	private WebElement Pincode_Field;
	
	
	public void tofillthePermanentandRegisteredAddresform() throws InterruptedException
	{
		HighlightOnElement(PermanentandRegisteredAddressTab);
		PermanentandRegisteredAddressTab.click();
		waitForSomeTime();
		Thread.sleep(15000);
		
		HighlightOnElement(Country_Dropdown);
		Assert.assertNotNull(Country_Dropdown.isDisplayed(),"Test case pass");
		SelectVisibleText(Country_Dropdown, "INDIA");
		Reporter.log("Select Country_Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(10000);
		
		HighlightOnElement(State_Dropdown);
		Assert.assertNotNull(State_Dropdown.isDisplayed(),"Test case pass");
		SelectVisibleText(State_Dropdown, "CHHATTISGARH/छत्तीसगढ़");
		Reporter.log("Select State_Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(10000);
		
		HighlightOnElement(District_Dropdown);
		Assert.assertNotNull(District_Dropdown.isDisplayed(),"Test case pass");
		SelectVisibleText(District_Dropdown, "RAIPUR/रायपुर");
		Reporter.log("Select District_Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(10000);
		
		HighlightOnElement(Address_Field);
		Assert.assertNotNull(Address_Field.isDisplayed(),"Test case pass");
		Address_Field.sendKeys("Raipur");
		Reporter.log("To send data in Address_Field Successfully",true);
		waitForSomeTime();
		
		HighlightOnElement(Pincode_Field);
		Assert.assertNotNull(Pincode_Field.isDisplayed(),"Test case pass");
		Pincode_Field.sendKeys("678789");
		Reporter.log("To send data in Pincode_Field Successfully",true);
		waitForSomeTime();
		
		
	}
	
	@FindBy(xpath="//a[contains(.,'Correspondence / Communication Address')]")
	private WebElement Correspondence_CommunicationAddressTab;
	
	
	@FindBy(xpath="//a[contains(.,'Correspondence / Communication Address')]/../../following-sibling::div/div[3]/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List <WebElement> Correspondence_CommunicationAddressLabels;
	
	public void toverifytheCorrespondence_CommunicationAddressTab() throws InterruptedException
	{
		HighlightOnElement(Correspondence_CommunicationAddressTab);
		Correspondence_CommunicationAddressTab.click();
		waitForSomeTime();
		Thread.sleep(10000);
		for(WebElement menulist:Correspondence_CommunicationAddressLabels)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" MenuLabels in the Correspondence_CommunicationAddressLabels are:"+Menu );
			}

		}
	
	}
	
	
	@FindBy(xpath="//select[@title='Is Correspondence Address Same as above Address?']")
	private WebElement ISCorrespondence_CommunicationAddresssameasAboveAddress_Dropdown;
	
	@FindBy(xpath="//select[@title='Country Name']")
	private WebElement Country_Dropdown1;
	
	@FindBy(xpath="(//select[@title='State'])[2]")
	private WebElement State_Dropdown1;
	
	@FindBy(xpath="(//select[@title='District'])[2]")
	private WebElement District_Dropdown1;
	
	@FindBy(xpath="(//textarea[@title='Address'])[2]")
	private WebElement Address_Field1;
	
	@FindBy(xpath="(//input[@title='Pin Code'])[2]")
	private WebElement Pincode_Field1;
	
	public void tofilltheCorrespondence_CommunicationAddressForm() throws InterruptedException
	{
		HighlightOnElement(Correspondence_CommunicationAddressTab);
		Correspondence_CommunicationAddressTab.click();
		waitForSomeTime();
		Thread.sleep(10000);
		
		HighlightOnElement(ISCorrespondence_CommunicationAddresssameasAboveAddress_Dropdown);
		Assert.assertNotNull(ISCorrespondence_CommunicationAddresssameasAboveAddress_Dropdown.isDisplayed(),"Test case pass");
		SelectVisibleText(ISCorrespondence_CommunicationAddresssameasAboveAddress_Dropdown, "No / नहीं");
		Reporter.log("Select ISCorrespondence_CommunicationAddresssameasAboveAddress_Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(10000);
		
		HighlightOnElement(Country_Dropdown1);
		Assert.assertNotNull(Country_Dropdown1.isDisplayed(),"Test case pass");
		SelectVisibleText(Country_Dropdown1, "INDIA");
		Reporter.log("Select Country_Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(10000);
		
		HighlightOnElement(State_Dropdown1);
		Assert.assertNotNull(State_Dropdown1.isDisplayed(),"Test case pass");
		SelectVisibleText(State_Dropdown1, "CHHATTISGARH/छत्तीसगढ़");
		Reporter.log("Select State_Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(10000);
	
		HighlightOnElement(District_Dropdown1);
		Assert.assertNotNull(District_Dropdown1.isDisplayed(),"Test case pass");
		SelectVisibleText(District_Dropdown1, "RAIPUR/रायपुर");
		Reporter.log("Select District_Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(10000);
		
		HighlightOnElement(Address_Field1);
		Assert.assertNotNull(Address_Field1.isDisplayed(),"Test case pass");
		Address_Field1.sendKeys("Raipur");
		Reporter.log("To send data in Address_Field Successfully",true);
		waitForSomeTime();
		
		HighlightOnElement(Pincode_Field1);
		Assert.assertNotNull(Pincode_Field1.isDisplayed(),"Test case pass");
		Pincode_Field1.sendKeys("678789");
		Reporter.log("To send data in Pincode_Field Successfully",true);
		waitForSomeTime();
		
		
	}
	
	@FindBy(xpath="//a[contains(.,'Supporting Document')]")
	private WebElement SupportingDocumentsTab;
	
	
	@FindBy(xpath="//a[contains(.,'Supporting Document')]/../../following-sibling::div/div[4]/table/tbody/tr[1]/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List <WebElement> SupportingDocumentsLabels;
	
	
	public void toverifytheSupportingDocumentsTab() throws InterruptedException
	{
		HighlightOnElement(SupportingDocumentsTab);
		SupportingDocumentsTab.click();
		waitForSomeTime();
		Thread.sleep(7000);
		for(WebElement menulist:SupportingDocumentsLabels)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" MenuLabels in the SupportingDocumentsLabels are:"+Menu );
			}

		}
	
	}
	
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[1]/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/span/div/div[1]/label")
	private WebElement CopyofDeed_UploadButton;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/span/div/div[1]/label")
	private WebElement CopyofMemorandum_UploadButton;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[2]/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/span/div/div[1]/label")
	private WebElement CertificateofIncorporation_UploadButton;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[2]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/span/div/div[1]/label")
	private WebElement CopyofSocietyRegistration_UploadButton;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[3]/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/span/div/div[1]/label")
	private WebElement CopyofJointAgreement_UploadButton;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[3]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/span/div/div[1]/label")
	private WebElement AddressIdProof_UploadButton;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[4]/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/span/div/div[1]/label")
	private WebElement CopyofPan_UploadButton;
	
	public void tovFilltheFunctionalityofSupportDocuments() throws AWTException, InterruptedException
	{
		
		HighlightOnElement(SupportingDocumentsTab);
		SupportingDocumentsTab.click();
		waitForSomeTime();
		Thread.sleep(7000);
		waitForSomeTime();
		Assert.assertEquals(true,CopyofDeed_UploadButton.isEnabled());
		HighlightOnElement(CopyofDeed_UploadButton);
		CopyofDeed_UploadButton.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		Reporter.log(" Upload Document on CopyofDeed_UploadButton Successfully",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(5000);
		
		waitForSomeTime();
		Assert.assertEquals(true,CopyofMemorandum_UploadButton.isEnabled());
		HighlightOnElement(CopyofMemorandum_UploadButton);
		CopyofMemorandum_UploadButton.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		Reporter.log(" Upload Document on CopyofMemorandum_UploadButton Successfully",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(5000);
		
		
		waitForSomeTime();
		Assert.assertEquals(true,CertificateofIncorporation_UploadButton.isEnabled());
		HighlightOnElement(CertificateofIncorporation_UploadButton);
		CertificateofIncorporation_UploadButton.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		Reporter.log(" Upload Document on CertificateofIncorporation_UploadButton Successfully",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(5000);
		
		waitForSomeTime();
		Assert.assertEquals(true,CopyofSocietyRegistration_UploadButton.isEnabled());
		HighlightOnElement(CopyofSocietyRegistration_UploadButton);
		CopyofSocietyRegistration_UploadButton.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		Reporter.log(" Upload Document on CopyofSocietyRegistration_UploadButton Successfully",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(5000);
		
		waitForSomeTime();
		Assert.assertEquals(true,CopyofJointAgreement_UploadButton.isEnabled());
		HighlightOnElement(CopyofJointAgreement_UploadButton);
		CopyofJointAgreement_UploadButton.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		Reporter.log(" Upload Document on CopyofJointAgreement_UploadButton Successfully",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(5000);
		
		waitForSomeTime();
		Assert.assertEquals(true,AddressIdProof_UploadButton.isEnabled());
		HighlightOnElement(AddressIdProof_UploadButton);
		AddressIdProof_UploadButton.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		Reporter.log(" Upload Document on AddressIdProof_UploadButton Successfully",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(5000);
		
		waitForSomeTime();
		Assert.assertEquals(true,CopyofPan_UploadButton.isEnabled());
		HighlightOnElement(CopyofPan_UploadButton);
		CopyofPan_UploadButton.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		Reporter.log(" Upload Document on CopyofPan_UploadButton Successfully",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(5000);
		
	}
	
	@FindBy(xpath="//a[contains(.,'Preference Details')]")
	private WebElement PreferenceDetailTab;
	
	
	@FindBy(xpath="//a[contains(.,'Preference Details')]/../../following-sibling::div/div[5]/span[1]/div/div/table/tbody/tr/td/label")
	private List <WebElement> PreferenceDetailLabels;
	
	public void toverifythePreferenceDetailTab() throws InterruptedException
	{
		HighlightOnElement(PreferenceDetailTab);
		PreferenceDetailTab.click();
		waitForSomeTime();
		Thread.sleep(7000);
		for(WebElement menulist:PreferenceDetailLabels)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" MenuLabels in the PreferenceDetailLabels are:"+Menu );
			}

		}
	
	}
	
	
	@FindBy(xpath="//a[contains(.,'Preference Details')]/../../following-sibling::div/div[5]/span[1]/div/div/table[1]/tbody/tr[1]/td[2]/div/div[3]/span")
	private WebElement UnitCategory_Dropdown;
	
	@FindBy(xpath="//a[contains(.,'Preference Details')]/../../following-sibling::div/div[5]/span[1]/div/div/table[1]/tbody/tr[1]/td[4]/div/div[3]/span")
	private WebElement SelectReservationCategory_Dropdown;
	
	@FindBy(xpath="//span[contains(.,'Property Detail')]/../following-sibling::div[1]/div/div[1]/table/tbody/tr/td[2]/div/div[3]/span")
	private WebElement ShopFlatNo_Dropdown;
	
	@FindBy(xpath="//a[contains(.,'Preference Details')]/../../following-sibling::div/div[5]/span[1]/div/div/table[2]/tbody/tr[1]/td[4]/div/div[3]/span")
	private WebElement PaymentPlan_Dropdown;
	
	@FindBy(xpath="//a[contains(.,'Preference Details')]/../../following-sibling::div/div[5]/span[1]/div/div/table[2]/tbody/tr[2]/td[2]/div/div[3]/span")
	private WebElement PaymentTenure_Dropdown;
	
	@FindBy(xpath="//a[contains(.,'Preference Details')]/../../following-sibling::div/div[5]/span[1]/div/div/table[2]/tbody/tr[2]/td[4]/div/div[3]/span")
	private WebElement EMDsecurityPaymentMode_Dropdown;
	
	public void tofillthePreferenceDetailForm() throws InterruptedException
	{
		HighlightOnElement(PreferenceDetailTab);
		PreferenceDetailTab.click();
		waitForSomeTime();
		Thread.sleep(10000);
		
		HighlightOnElement(UnitCategory_Dropdown);
		Assert.assertNotNull(UnitCategory_Dropdown.isDisplayed(),"Test case pass");
		UnitCategory_Dropdown.click();
		selectValueFromDropdown("RESIDENTIAL");
		Reporter.log("Select UnitCategory_Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(10000);
		
		HighlightOnElement(SelectReservationCategory_Dropdown);
		Assert.assertNotNull(SelectReservationCategory_Dropdown.isDisplayed(),"Test case pass");
		SelectReservationCategory_Dropdown.click();
		selectValueFromDropdown("Unreserved");
		Reporter.log("Select SelectReservationCategory_Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(10000);
	
		HighlightOnElement(ShopFlatNo_Dropdown);
		Assert.assertNotNull(ShopFlatNo_Dropdown.isDisplayed(),"Test case pass");
		ShopFlatNo_Dropdown.click();
		selectValueFromDropdown("456");
		Reporter.log("Select ShopFlatNo_Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(15000);
		
		HighlightOnElement(PaymentPlan_Dropdown);
		Assert.assertNotNull(PaymentPlan_Dropdown.isDisplayed(),"Test case pass");
		PaymentPlan_Dropdown.click();
		selectValueFromDropdown("Installment");
		Reporter.log("Select PaymentPlan_Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(10000);
		
		HighlightOnElement(PaymentTenure_Dropdown);
		Assert.assertNotNull(PaymentTenure_Dropdown.isDisplayed(),"Test case pass");
		PaymentTenure_Dropdown.click();
		selectValueFromDropdown("15");
		Reporter.log("Select PaymentTenure_Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(10000);
		
		HighlightOnElement(EMDsecurityPaymentMode_Dropdown);
		Assert.assertNotNull(EMDsecurityPaymentMode_Dropdown.isDisplayed(),"Test case pass");
		EMDsecurityPaymentMode_Dropdown.click();
		selectValueFromDropdown("Online");
		Reporter.log("Select EMDsecurityPaymentMode_Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(10000);
		
	}
	
	@FindBy(xpath="//a[contains(.,'Preference Details')]/../../following-sibling::div/div[5]/span[2]/center/table/tbody/tr/td/span/button[contains(.,'Submit')]")
	private WebElement Submit_Button;
	
	@FindBy(xpath="//a[contains(.,'Preference Details')]/../../following-sibling::div/div[5]/span[2]/center/table/tbody/tr/td/span/button[contains(.,'Reset')]")
	private WebElement Reset_Button;
	
	@FindBy(xpath="//a[contains(.,'Preference Details')]/../../following-sibling::div/div[5]/span[2]/center/table/tbody/tr/td/span/button[contains(.,'Close')]")
	private WebElement Close_Button;
	
	@FindBy(xpath="//a[contains(.,'Preference Details')]/../../following-sibling::div/div[5]/span[2]/center/table/tbody/tr/td/span/button[contains(.,'Save As Draft')]")
	private WebElement SaveAsDraft_Button;
	
	@FindBy(xpath="(//button[contains(.,'Reset')])[1]")
	private WebElement Reset_Button1;
	
	public void toverifyResetButtonFunctionality() throws InterruptedException
	{
		
		HighlightOnElement(Reset_Button1);
		Assert.assertNotNull(Reset_Button1.isDisplayed(),"Test case pass");
		Reset_Button1.click();
		Reporter.log("To click on Reset_Button Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		VerifyTextField(AadhaarNumberFiled);
		VerifyTextField(FirstName_Field);
		VerifyTextField(MiddleName_Field);
		VerifyTextField(LastName_Field);
		VerifyTextField(FatherName_Field);
		VerifyTextField(MotherName_Field);
		VerifyTextField(SpouseName_Field);
		VerifyTextField(SPOCPersonName_Field);
		VerifyTextField(MobileNumber_Field);
		VerifyTextField(Email_Field);
		VerifyTextField(PanNumber_Field);
		VerifyTextField(NetWorth_Field);
		waitForSomeTime();
		
	}
	
	
	public void toverifyResetButtonFunctionality1() throws InterruptedException
	{
		
		HighlightOnElement(Reset_Button1);
		Assert.assertNotNull(Reset_Button1.isDisplayed(),"Test case pass");
		Reset_Button1.click();
		Reporter.log("To click on Reset_Button Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		
		VerifyTextField(SPOCPersonName_Field);
		VerifyTextField(MobileNumber_Field);
		VerifyTextField(Email_Field);
		VerifyTextField(PanNumber_Field);
		VerifyTextField(NetWorth_Field);
		VerifyTextField(TANNumberField);
		VerifyTextField(GSTIN_Field);
		waitForSomeTime();
		
	}
	
	public void toverifyResetButtonFunctionality2() throws InterruptedException
	{
		
		HighlightOnElement(Reset_Button1);
		Assert.assertNotNull(Reset_Button1.isDisplayed(),"Test case pass");
		Reset_Button1.click();
		Reporter.log("To click on Reset_Button Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		
		VerifyTextField(SPOCPersonName_Field);
		VerifyTextField(MobileNumber_Field);
		VerifyTextField(Email_Field);
		VerifyTextField(PanNumber_Field);
		VerifyTextField(NetWorth_Field);
		VerifyTextField(FirstName_Field);
		VerifyTextField(LastName_Field);
		VerifyTextField(MiddleName_Field);
		VerifyTextField(FatherName_Field);
		VerifyTextField(MotherName_Field);
		VerifyTextField(SpouseName_Field);
		waitForSomeTime();
		
	}
	
	
	@FindBy(xpath="(//table/tbody/tr/td[2]/label)[1]")
	private WebElement Application_Number;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[6]/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/span/div/div[1]/label")
	private WebElement AddressIdProof_Upload;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[6]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/span/div/div[1]/label")
	private WebElement CopyofPAN_Upload;
	
	public void tofilluploaddocuments() throws AWTException, InterruptedException
	{
		
		HighlightOnElement(SupportingDocumentsTab);
		SupportingDocumentsTab.click();
		waitForSomeTime();
		Thread.sleep(7000);
		waitForSomeTime();
		
		waitForSomeTime();
		Assert.assertEquals(true,AddressIdProof_Upload.isEnabled());
		HighlightOnElement(AddressIdProof_Upload);
		AddressIdProof_Upload.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		Reporter.log(" Upload Document on AddressIdProof_Upload Successfully",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(5000);
		
		waitForSomeTime();
		Assert.assertEquals(true,CopyofPAN_Upload.isEnabled());
		HighlightOnElement(CopyofPAN_Upload);
		CopyofPAN_Upload.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		Reporter.log(" Upload Document on CopyofPAN_Upload Successfully",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(5000);
		
		
	}
	
	
	public void toverifySubmitButtonFunctionality() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		HighlightOnElement(Submit_Button);
		Assert.assertNotNull(Submit_Button.isDisplayed(),"Test case pass");
		Submit_Button.click();
		Reporter.log("To click on Submit_Button Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(5000);
		HighlightOnElement(Application_Number);
		String ApllicationNumber=Application_Number.getText().trim();
		excel.updateExcelDATA(ApllicationNumber);
		Reporter.log("Apploication Number is:  "+ ApllicationNumber,true);
	}
	
	public void toverifySubmitButtonFunctionality1() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		HighlightOnElement(Submit_Button);
		Assert.assertNotNull(Submit_Button.isDisplayed(),"Test case pass");
		Submit_Button.click();
		Reporter.log("To click on Submit_Button Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(5000);
		HighlightOnElement(Application_Number);
		String ApllicationNumber=Application_Number.getText().trim();
		excel.updateExcelDATA1(ApllicationNumber);
		Reporter.log("Apploication Number is:  "+ ApllicationNumber,true);
	}
	
	public void toverifySubmitButtonFunctionality2() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		HighlightOnElement(Submit_Button);
		Assert.assertNotNull(Submit_Button.isDisplayed(),"Test case pass");
		Submit_Button.click();
		Reporter.log("To click on Submit_Button Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(5000);
		HighlightOnElement(Application_Number);
		String ApllicationNumber=Application_Number.getText().trim();
		excel.updateExcelDATA2(ApllicationNumber);
		Reporter.log("Application Number is:  "+ ApllicationNumber,true);
	}
	
	public void toverifyApplicantDetailsFormFunctionality1() throws InterruptedException, AWTException
	{
		HighlightOnElement(ProjectName_Field);
		Assert.assertNotNull(ProjectName_Field.isDisplayed(),"Test case pass");
		Reporter.log("ProjectName_Field is present in Application",true);
		VerifyTextField(ProjectName_Field);
	
		HighlightOnElement(ProjectCode_Field);
		Assert.assertNotNull(ProjectCode_Field.isDisplayed(),"Test case pass");
		Reporter.log("ProjectCode_Field is present in Application",true);
		VerifyTextField(ProjectCode_Field);
		
		HighlightOnElement(ProjectAddress_Field);
		Assert.assertNotNull(ProjectAddress_Field.isDisplayed(),"Test case pass");
		Reporter.log("ProjectAddress_Field is present in Application",true);
		VerifyTextField(ProjectAddress_Field);
	
		HighlightOnElement(LandUseZone_Dropdown);
		Assert.assertNotNull(LandUseZone_Dropdown.isDisplayed(),"Test case pass");
		Reporter.log("LandUseZone_Dropdown is present in Application",true);
		verifydropdownelement(LandUseZone_Dropdown);

		HighlightOnElement(ApplicantType_Dropdown);
		Assert.assertNotNull(ApplicantType_Dropdown.isDisplayed(),"Test case pass");
		SelectVisibleText(ApplicantType_Dropdown, "Consortium");
		Reporter.log("Select Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(20000);	
	
		HighlightOnElement(EntityCompany_NameField);
		Assert.assertNotNull(EntityCompany_NameField.isDisplayed(),"Test case pass");
		EntityCompany_NameField.sendKeys("ILFS");
		Reporter.log("To send data in EntityCompany_NameField Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(SPOCPersonName_Field);
		Assert.assertNotNull(SPOCPersonName_Field.isDisplayed(),"Test case pass");
		SPOCPersonName_Field.sendKeys("Arun");
		Reporter.log("To send data in SPOCPersonName_Field Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(MobileNumber_Field);
		Assert.assertNotNull(MobileNumber_Field.isDisplayed(),"Test case pass");
		MobileNumber_Field.sendKeys("9703774101");
		Reporter.log("To send data in MobileNumber_Field Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(Email_Field);
		Assert.assertNotNull(Email_Field.isDisplayed(),"Test case pass");
		Email_Field.sendKeys("s@gmail.com");
		Reporter.log("To send data in Email_Field Successfully",true);
		waitForSomeTime();
		
		HighlightOnElement(Designation_Field);
		Assert.assertNotNull(Designation_Field.isDisplayed(),"Test case pass");
		Designation_Field.sendKeys("Officer");
		Reporter.log("To send data in Email_Field Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(PanNumber_Field);
		Assert.assertNotNull(PanNumber_Field.isDisplayed(),"Test case pass");
		PanNumber_Field.sendKeys("GLEPS8564Q");
		Reporter.log("To send data in PanNumber_Field Successfully",true);
		waitForSomeTime();
		
		HighlightOnElement(TANNumberField);
		Assert.assertNotNull(TANNumberField.isDisplayed(),"Test case pass");
		TANNumberField.sendKeys("GLEPS8564Q");
		Reporter.log("To send data in TANNumberField Successfully",true);
		waitForSomeTime();
		
		HighlightOnElement(GSTIN_Field);
		Assert.assertNotNull(GSTIN_Field.isDisplayed(),"Test case pass");
		GSTIN_Field.sendKeys("8564");
		Reporter.log("To send data in GSTIN_Field Successfully",true);
		waitForSomeTime();
	
		
		HighlightOnElement(NetWorth_Field);
		NetWorth_Field.sendKeys("1500");
		waitForSomeTime();
		
	
	}
	
	
	public void toverifyApplicantDetailsFormFunctionality2() throws InterruptedException, AWTException
	{
		HighlightOnElement(ProjectName_Field);
		Assert.assertNotNull(ProjectName_Field.isDisplayed(),"Test case pass");
		Reporter.log("ProjectName_Field is present in Application",true);
		VerifyTextField(ProjectName_Field);
	
		HighlightOnElement(ProjectCode_Field);
		Assert.assertNotNull(ProjectCode_Field.isDisplayed(),"Test case pass");
		Reporter.log("ProjectCode_Field is present in Application",true);
		VerifyTextField(ProjectCode_Field);
		
		HighlightOnElement(ProjectAddress_Field);
		Assert.assertNotNull(ProjectAddress_Field.isDisplayed(),"Test case pass");
		Reporter.log("ProjectAddress_Field is present in Application",true);
		VerifyTextField(ProjectAddress_Field);
	
		HighlightOnElement(LandUseZone_Dropdown);
		Assert.assertNotNull(LandUseZone_Dropdown.isDisplayed(),"Test case pass");
		Reporter.log("LandUseZone_Dropdown is present in Application",true);
		verifydropdownelement(LandUseZone_Dropdown);

		HighlightOnElement(ApplicantType_Dropdown);
		Assert.assertNotNull(ApplicantType_Dropdown.isDisplayed(),"Test case pass");
		SelectVisibleText(ApplicantType_Dropdown, "Co-Applicant");
		Reporter.log("Select Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(20000);
	
		
	
		HighlightOnElement(AadhaarNumberFiled);
		Assert.assertNotNull(AadhaarNumberFiled.isDisplayed(),"Test case pass");
		AadhaarNumberFiled.sendKeys("572241310456");
		Reporter.log("Select Dropdown value in application Successfully",true);
		waitForSomeTime();
	
		/*Assert.assertEquals(true,ApplicantImage_Upload.isEnabled());
		HighlightOnElement(ApplicantImage_Upload);
		ApplicantImage_Upload.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		Reporter.log(" Upload Document on ApplicantImage_Upload Successfully",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(10000);*/
	
		HighlightOnElement(ApplicantTitle_Dropdown);
		Assert.assertNotNull(ApplicantTitle_Dropdown.isDisplayed(),"Test case pass");
		SelectVisibleText(ApplicantTitle_Dropdown, "Mr / श्री");
		Reporter.log("Select Dropdown value in application Successfully",true);
		waitForSomeTime();
		Thread.sleep(12000);
	
		HighlightOnElement(FirstName_Field);
		Assert.assertNotNull(FirstName_Field.isDisplayed(),"Test case pass");
		FirstName_Field.sendKeys("sarvesh");
		Reporter.log("To send data in FirstName_Field Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(MiddleName_Field);
		Assert.assertNotNull(MiddleName_Field.isDisplayed(),"Test case pass");
		MiddleName_Field.sendKeys("Venkata");
		Reporter.log("To send data in MiddleName_Field Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(LastName_Field);
		Assert.assertNotNull(LastName_Field.isDisplayed(),"Test case pass");
		LastName_Field.sendKeys("Nellore");
		Reporter.log("To send data in LastName_Field Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(FatherName_Field);
		Assert.assertNotNull(FatherName_Field.isDisplayed(),"Test case pass");
		FatherName_Field.sendKeys("Jayaramaiah");
		Reporter.log("To send data in FatherName_Field Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(MotherName_Field);
		Assert.assertNotNull(MotherName_Field.isDisplayed(),"Test case pass");
		MotherName_Field.sendKeys("Lakshmi");
		Reporter.log("To send data in MotherName_Field Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(SpouseName_Field);
		Assert.assertNotNull(SpouseName_Field.isDisplayed(),"Test case pass");
		SpouseName_Field.sendKeys("Ananya");
		Reporter.log("To send data in SpouseName_Field Successfully",true);
		waitForSomeTime();
		
		ScroolDown();
		HighlightOnElement(DateofBirth_Field);
		Assert.assertNotNull(DateofBirth_Field.isDisplayed(),"Test case pass");
		DateofBirth_Field.click();
		Reporter.log("To click on dateof birth Successfully",true);
		waitForSomeTime();
		HighlightOnElement(MonthDropdown);
		MonthDropdown.click();
		SelectVisibleText(MonthDropdown, "Mar");
		waitForSomeTime();
		HighlightOnElement(YearDropdown);
		YearDropdown.click();
		SelectVisibleText(YearDropdown, "2012");
		waitForSomeTime();
		YearDropdown.click();
		SelectVisibleText(YearDropdown, "2005");
		waitForSomeTime();
		SelectVisibleText(YearDropdown, "1996");
		HighlightOnElement(DateButton);
		DateButton.click();
		waitForSomeTime();
		Reporter.log("To select DateofBirth_Field Successfully",true);
	
		HighlightOnElement(EntityCompany_NameField);
		Assert.assertNotNull(EntityCompany_NameField.isDisplayed(),"Test case pass");
		EntityCompany_NameField.sendKeys("ILFS");
		Reporter.log("To send data in EntityCompany_NameField Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(SPOCPersonName_Field);
		Assert.assertNotNull(SPOCPersonName_Field.isDisplayed(),"Test case pass");
		SPOCPersonName_Field.sendKeys("Arun");
		Reporter.log("To send data in SPOCPersonName_Field Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(MobileNumber_Field);
		Assert.assertNotNull(MobileNumber_Field.isDisplayed(),"Test case pass");
		MobileNumber_Field.sendKeys("9703774101");
		Reporter.log("To send data in MobileNumber_Field Successfully",true);
		waitForSomeTime();
	
		HighlightOnElement(Email_Field);
		Assert.assertNotNull(Email_Field.isDisplayed(),"Test case pass");
		Email_Field.sendKeys("s@gmail.com");
		Reporter.log("To send data in Email_Field Successfully",true);
		waitForSomeTime();
		
	
		HighlightOnElement(PanNumber_Field);
		Assert.assertNotNull(PanNumber_Field.isDisplayed(),"Test case pass");
		PanNumber_Field.sendKeys("GLEPS8564Q");
		Reporter.log("To send data in PanNumber_Field Successfully",true);
		waitForSomeTime();
		
		
	
		HighlightOnElement(ReservationCategory_Dropdown);
		Assert.assertNotNull(ReservationCategory_Dropdown.isDisplayed(),"Test case pass");
		SelectVisibleText(ReservationCategory_Dropdown, "NRDA Employee");
		Reporter.log("Select Dropdown value in ReservationCategory_Dropdown Successfully",true);
		waitForSomeTime();
		Thread.sleep(20000);
		HighlightOnElement(NetWorth_Field);
		NetWorth_Field.sendKeys("1500");
		waitForSomeTime();
		
	
	}
	
	
}


