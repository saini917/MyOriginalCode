package NRDA_Estate_Project;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToverifyFunctionalityof_ProjectCreation extends CommonLibrary
	{

	Logger log=Logger.getLogger("devpinoyLogger");
	ExcelDataDriver excel=new ExcelDataDriver();
	
	
	@FindBy(xpath="//div[@class='col-md-9']/div/div/div/div/div[1]/div")
	private List <WebElement> HeadingsInApplications;
	
	
	public void toverifythedashboardoftheApplication() throws InterruptedException
	{
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
	
	@FindBy(xpath="//a[contains(.,'eGovernance')]")
	private WebElement eGovernanceLink;
	
	@FindBy(xpath="//span[contains(.,'Application Form')]")
	private WebElement ApplicationForm_Link;
	
	
	@FindBy(xpath="//div[@class='ui-accordion ui-widget ui-helper-reset ui-hidden-container Accordian-Header-Black']/h3/a")
	private List <WebElement> MenuLists;
	
	public void toverifyApplicationFormLink() throws InterruptedException
	{
		HighlightOnElement(eGovernanceLink);
		Assert.assertNotNull(eGovernanceLink.isDisplayed(),"Test case pass");
		eGovernanceLink.click();
		Reporter.log("To Click on eGovernanceLink is Successfully",true);
		waitForSomeTime();
		
		HighlightOnElement(ApplicationForm_Link);
		Assert.assertNotNull(ApplicationForm_Link.isDisplayed(),"Test case pass");
		ApplicationForm_Link.click();
		Reporter.log("To Click on ApplicationForm_Link is Successfully",true);
		waitForSomeTime();
				
		waitForSomeTime();
		for(WebElement menulist:MenuLists)
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
		
		@FindBy(xpath="//div[@class='ui-accordion ui-widget ui-helper-reset ui-hidden-container Accordian-Header-Black']/h3/a[contains(.,'Estate & Project Section')]")
		private WebElement EstateAndProjectSectionLink;
		
		@FindBy(xpath="//a[contains(.,'Estate & Project Section')]/../following-sibling::div[1]/table/tbody/tr/td[1]/span")
		private List<WebElement> SubMenuLists;
		
	
		public void toverifyEstate_Project_SectionLink() throws InterruptedException
		{
			HighlightOnElement(EstateAndProjectSectionLink);
			Assert.assertNotNull(EstateAndProjectSectionLink.isDisplayed(),"Test case pass");
			EstateAndProjectSectionLink.click();
			Reporter.log("To Click on EstateAndProjectSectionLink is Successfully",true);
			waitForSomeTime();
					
			waitForSomeTime();
			for(WebElement menulist:SubMenuLists)
			{
				HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					System.out.println(" SubMenu list in EstateAndProjectSectionLink are:"+Menu );
				}
			}
			
			
		}
		
		@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/table/tbody/tr/td/div/div[3]/table/tbody/tr/td/span[contains(text(),'NEW PROJECT CREATION')]/../following-sibling::td/span/a/img[@src='/NRDAuthorityPreUAT/javax.faces.resource/applyNow.png.xhtml?ln=img']")
		private WebElement NewProjectCreationLink;
		
		@FindBy(xpath="//button[contains(.,'Proceed')]")
		private WebElement ProceedButton;
		
		
		@FindBy(xpath=".//*[@id='form0']/div[1]/div[2]")
		private WebElement NewProjectCreationHeading;
		
		
		
	
		public void toverifyNewProjectCreationLink() throws InterruptedException
		{
			
			HighlightOnElement(EstateAndProjectSectionLink);
			Assert.assertNotNull(EstateAndProjectSectionLink.isDisplayed(),"Test case pass");
			EstateAndProjectSectionLink.click();
			Reporter.log("To Click on EstateAndProjectSectionLink is Successfully",true);
			waitForSomeTime();
			HighlightOnElement(NewProjectCreationLink);
			Assert.assertNotNull(NewProjectCreationLink.isDisplayed(),"Test case pass");
			NewProjectCreationLink.click();
			Reporter.log("To Click on NewProjectCreationLink is Successfully",true);
			waitForSomeTime();
			HighlightOnElement(NewProjectCreationHeading);
			Assert.assertNotNull(NewProjectCreationHeading.isDisplayed(),"Test case pass");
			Reporter.log("NewProjectCreationHeading is Present in Application",true);
			waitForSomeTime();
			HighlightOnElement(ProceedButton);
			Assert.assertNotNull(ProceedButton.isDisplayed(),"Test case pass");
			//ProceedButton.click();
			Reporter.log("ProceedButton is Present in Application",true);
			waitForSomeTime();
		
		}
	
		@FindBy(xpath="//div[@class='ui-panel-content ui-widget-content']/div/ul/li/a")
		private List<WebElement> MenuLabels;
		
		public void toverifyProceedButtonFunctionality() throws InterruptedException
		{
	
			HighlightOnElement(ProceedButton);
			Assert.assertNotNull(ProceedButton.isDisplayed(),"Test case pass");
			ProceedButton.click();
			Reporter.log(" To Click onProceedButton is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(20000);
			for(WebElement menulist:MenuLabels)
			{
				HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					System.out.println(" MenuLabels list in Application Form are:"+Menu );
				}
			}
			
		}
		
		@FindBy(xpath="//a[contains(.,'Project Creation')]/../../following-sibling::div/div[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
		private List<WebElement> ApplicationLabels;
		
		public void toverifyProjectCreationForm() throws InterruptedException
		{
	
			HighlightOnElement(ProceedButton);
			Assert.assertNotNull(ProceedButton.isDisplayed(),"Test case pass");
			ProceedButton.click();
			Reporter.log(" To Click onProceedButton is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(20000);
			for(WebElement menulist:ApplicationLabels)
			{
				HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					System.out.println(" Labels list in Application Form are:"+Menu );
				}
			}
			
		}
				
		@FindBy(xpath="//select[@title='Budget Inclusion Year']")
		private WebElement BudjetInclusionYear_Dropdown;
		
		@FindBy(xpath="//input[@title='Project Code']")
		private WebElement ProjectCodeFiled;
		
		@FindBy(xpath="//input[@title='Project Name']")
		private WebElement ProjectNameFiled;
		
		@FindBy(xpath="//select[@title='Land Use Zone']")
		private WebElement LandUseZone_Dropdown;
		
		@FindBy(xpath="//select[@title='Sector']")
		private WebElement Sector_Dropdown;
		
		@FindBy(xpath="//textarea[@title='Project Location']")
		private WebElement ProjectLocation_Filed;
		
		
		public void toverifyBudjetInclusionYear() throws InterruptedException
		{
			HighlightOnElement(ProceedButton);
			Assert.assertNotNull(ProceedButton.isDisplayed(),"Test case pass");
			ProceedButton.click();
			Reporter.log(" To Click onProceedButton is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(20000);
			HighlightOnElement(BudjetInclusionYear_Dropdown);
			Assert.assertNotNull(BudjetInclusionYear_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(BudjetInclusionYear_Dropdown, "2017");
			waitForSomeTime();
			Thread.sleep(10000);
			Reporter.log(" Value Selected in Budget Inclusion Year dropdown successfully",true);
		}
		
		public void toverifyProjectCodeFiled() throws InterruptedException
		{
			HighlightOnElement(ProjectCodeFiled);
			Assert.assertNotNull(ProjectCodeFiled.isDisplayed(),"Test case pass");
			ProjectCodeFiled.sendKeys("NP/01/02");
			Reporter.log(" To Send Data ProjectCodeField is successfully",true);
			waitForSomeTime();
		}
		
		public void toverifyProjectNameFiled() throws InterruptedException
		{
			HighlightOnElement(ProjectNameFiled);
			Assert.assertNotNull(ProjectNameFiled.isDisplayed(),"Test case pass");
			ProjectNameFiled.sendKeys("Residential Project");
			Reporter.log(" To Send Data ProjectNameField is successfully",true);
			waitForSomeTime();
		}
		
		public void toverifyLandUseZone() throws InterruptedException
		{
			HighlightOnElement(LandUseZone_Dropdown);
			Assert.assertNotNull(LandUseZone_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(LandUseZone_Dropdown, "RESIDENTIAL");
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(10000);
			Reporter.log(" Value Selected in LandUseZone_Dropdown dropdown successfully",true);
			
			
		}
		
		public void toverifySectorFunctionality() throws InterruptedException
		{
			HighlightOnElement(Sector_Dropdown);
			Assert.assertNotNull(Sector_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(Sector_Dropdown, "27");
			Thread.sleep(5000);
			Reporter.log(" Value Selected in LandUseZone_Dropdown dropdown successfully",true);
	
		}
		
		public void toverifyProjectLocationFiled() throws InterruptedException
		{
			HighlightOnElement(ProjectLocation_Filed);
			Assert.assertNotNull(ProjectLocation_Filed.isDisplayed(),"Test case pass");
			ProjectLocation_Filed.sendKeys("Raipur");
			Reporter.log(" To Send Data ProjectLocation_Filed is successfully",true);
			
		}
		
		@FindBy(xpath="//a[contains(.,'Project Creation')]/../../following-sibling::div/div[1]/span/center/table/tbody/tr/td/span/button[contains(.,'Save As Draft')]")
		private WebElement SaveAsDraft_Button;
		
		@FindBy(xpath="//a[contains(.,'Project Creation')]/../../following-sibling::div/div[1]/span/center/table/tbody/tr/td/span/button[contains(.,'Reset')]")
		private WebElement Reset_Button;
		
		@FindBy(xpath="//a[contains(.,'Project Creation')]/../../following-sibling::div/div[1]/span/center/table/tbody/tr/td/span/button[contains(.,'Close')]")
		private WebElement Close_Button;
		
		@FindBy(xpath="//a[contains(.,'Project Creation')]/../../following-sibling::div/div[1]/span/center/table/tbody/tr/td/span/button[contains(.,'Next')]")
		private WebElement Next_Button;
		
		
		
		public void toverifyResetButtonFunctionality() throws InterruptedException
		{
			HighlightOnElement(Reset_Button);
			Assert.assertNotNull(Reset_Button.isDisplayed(),"Test case pass");
			Reset_Button.click();
			Reporter.log(" To Click on Reset Button successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			VerifyTextField(ProjectCodeFiled);
			VerifyTextField(ProjectNameFiled);
			VerifyTextField(ProjectLocation_Filed);
		}
	
		
		@FindBy(xpath="//div[@id='form0:confirmDlg']/div[2]/div/div/center/table/tbody/tr/td/button")
		private List<WebElement> button;
		
		
		public void toverifyCloseButtonFunctionality() throws InterruptedException
		{
			HighlightOnElement(Close_Button);
			Assert.assertNotNull(Close_Button.isDisplayed(),"Test case pass");
			Close_Button.click();
			Reporter.log(" To Click on Close Button successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			for(int index=0;index<button.size();index++)
			   {
				String buttone=button.get(index).getText();
				System.out.println(buttone);
				
				if( buttone.trim().equalsIgnoreCase("yes"))
				   {
					button.get(index).click();
					Reporter.log("Verify Yes Button In POP-UP Of Application   is Present",true);
				   }
			   }
			  waitForSomeTime();
		      waitForSomeTime();
			  waitForSomeTime();
			  
			  waitForSomeTime();
				for(WebElement menulist:MenuLists)
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
			
		
	public void toverifyNextButtonFunctionality() throws InterruptedException
		{
			HighlightOnElement(Next_Button);
			Assert.assertNotNull(Next_Button.isDisplayed(),"Test case pass");
			Next_Button.click();
			Reporter.log(" To Click on Next_Button Button successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(ApllicationTenderFree_Dropdown);
			
			
		}
	
	
	public void tofilltheProjectCreationForm() throws InterruptedException
	{
		
		HighlightOnElement(BudjetInclusionYear_Dropdown);
		Assert.assertNotNull(BudjetInclusionYear_Dropdown.isDisplayed(),"Test case pass");
		SelectVisibleText(BudjetInclusionYear_Dropdown, "2017");
		waitForSomeTime();
		Reporter.log(" Value Selected in Budget Inclusion Year dropdown successfully",true);
		
		HighlightOnElement(ProjectCodeFiled);
		Assert.assertNotNull(ProjectCodeFiled.isDisplayed(),"Test case pass");
		ProjectCodeFiled.sendKeys("NP/01/02");
		Reporter.log(" To Send Data ProjectCodeField is successfully",true);
		
		HighlightOnElement(ProjectNameFiled);
		Assert.assertNotNull(ProjectNameFiled.isDisplayed(),"Test case pass");
		ProjectNameFiled.sendKeys("Residential Project");
		Reporter.log(" To Send Data ProjectNameField is successfully",true);
		
		HighlightOnElement(Sector_Dropdown);
		Assert.assertNotNull(Sector_Dropdown.isDisplayed(),"Test case pass");
		SelectVisibleText(Sector_Dropdown, "27");
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log(" Value Selected in LandUseZone_Dropdown dropdown successfully",true);
		
		HighlightOnElement(LandUseZone_Dropdown);
		Assert.assertNotNull(LandUseZone_Dropdown.isDisplayed(),"Test case pass");
		SelectVisibleText(LandUseZone_Dropdown, "RESIDENTIAL");
		waitForSomeTime();
		waitForSomeTime();
	Thread.sleep(8000);
		Reporter.log(" Value Selected in LandUseZone_Dropdown dropdown successfully",true);
		
		HighlightOnElement(ProjectLocation_Filed);
		Assert.assertNotNull(ProjectLocation_Filed.isDisplayed(),"Test case pass");
		ProjectLocation_Filed.sendKeys("Raipur");
		Reporter.log(" To Send Data ProjectLocation_Filed is successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Next_Button);
		Assert.assertNotNull(Next_Button.isDisplayed(),"Test case pass");
		Next_Button.click();
		Reporter.log(" To Click on Next_Button Button successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(ApllicationTenderFree_Dropdown);

		
		
	}
		
		
		@FindBy(xpath="//a[contains(.,'Project General Details')]")
		private WebElement ProjectGeneralDetailsLink;
		
		@FindBy(xpath="//a[contains(.,'Project General Details')]/../../following-sibling::div/div[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
		private List<WebElement> ProjectGeneralDetailsLabels;
		
		public void toclickonProceedButton() throws InterruptedException
		{
			HighlightOnElement(ProceedButton);
			Assert.assertNotNull(ProceedButton.isDisplayed(),"Test case pass");
			ProceedButton.click();
			Reporter.log(" To Click onProceedButton is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(25000);
			
		}
		
		
		public void toverifyProjectDetailsGeneralForm() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(ProjectGeneralDetailsLink);
			Assert.assertNotNull(ProjectGeneralDetailsLink.isDisplayed(),"Test case pass");
			ProjectGeneralDetailsLink.click();
			Reporter.log(" To Click ProjectGeneralDetailsLink is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(ApllicationTenderFree_Dropdown);
			for(WebElement menulist:ProjectGeneralDetailsLabels)
			{
				HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					System.out.println(" Labels list in ProjectDetailsGeneral Form are:"+Menu );
				}
			}
			
		}
		
		@FindBy(xpath="//select[@title='Is Application/Tender Fee Applicable?']")
		private WebElement ApllicationTenderFree_Dropdown;
		
		@FindBy(xpath="//input[@title='Application/Tender Fee Payable (in Rs)']")
		private WebElement ApllicationTenderFee_Field;
		
		@FindBy(xpath="//select[@title='Mode of Payment']")
		private WebElement ModeOfPayment_Dropdown;
		
		@FindBy(xpath="//select[@title='Mode of Application']")
		private WebElement ModeOfApplication_Dropdown;
		
		@FindBy(xpath="//input[@title='Application / Tender Opening Date']")
		private WebElement Application_Tender_OpeningDate;
		
		@FindBy(xpath="//input[@title='Last Date for Clarification/Objection Submission']")
		private WebElement LastDateforClarifficationObjectionSubmissionDate;
		
		@FindBy(xpath="//input[@title='Last Date for Application / Tender Submission']")
		private WebElement LastDateforApplication_TenderSubmission;
		
		@FindBy(xpath="//input[@title='Lottery / Financial Bid Opening Date']")
		private WebElement Lottary_FinancialBidOpeningDate;
		
		@FindBy(xpath="//select[@title='Allotment Method']")
		private WebElement AllotmentMethod_Dropdown;
		
		@FindBy(xpath="//a[contains(.,'Project General Details')]/../../following-sibling::div/div[2]/table/tbody/tr/td/table/tbody/tr[5]/td[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td/select")
		private WebElement IsReservationApplicable_Dropdown;
		
		@FindBy(xpath="//a[contains(.,'Project General Details')]/../../following-sibling::div/div[2]/table/tbody/tr/td/table/tbody/tr[6]/td[1]/table/tbody/tr[1]/td[2]/table/tbody/tr/td/select")
		private WebElement IsAdditionalPremiumApplicable_Dropdown;
		
		@FindBy(xpath="//a[contains(.,'Project General Details')]/../../following-sibling::div/div[2]/table/tbody/tr/td/table/tbody/tr[6]/td[2]/table/tbody/tr[1]/td[2]/table/tbody/tr/td/select")
		private WebElement IsSurrenderApplicable_Dropdown;
		
		@FindBy(xpath="//input[@title='A REARA NO.']")
		private WebElement AREARANO_field;
		
		
		
		public void tofillProjectGeneralDetailForm() throws InterruptedException
		
		{
			HighlightOnElement(ApllicationTenderFree_Dropdown);
			Assert.assertNotNull(ApllicationTenderFree_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(ApllicationTenderFree_Dropdown, "Yes / हाँ");
			Reporter.log(" To select value in ApllicationTenderFree_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(10000);
			HighlightOnElement(ApllicationTenderFee_Field);
			Assert.assertNotNull(ApllicationTenderFee_Field.isDisplayed(),"Test case pass");
			ApllicationTenderFee_Field.sendKeys("500");
			Reporter.log(" To send data in ApllicationTenderFees fieldis successfully",true);
			waitForSomeTime();
			HighlightOnElement(ModeOfPayment_Dropdown);
			Assert.assertNotNull(ModeOfPayment_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(ModeOfPayment_Dropdown, "Both");
			Reporter.log("To select value in ModeOfPayment_Dropdown is successfully",true);
			waitForSomeTime();
			HighlightOnElement(ModeOfApplication_Dropdown);
			Assert.assertNotNull(ModeOfApplication_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(ModeOfApplication_Dropdown, "Online / ऑनलाइन");
			Reporter.log("To select value in ModeOfApplication_Dropdown is successfully",true);
			waitForSomeTime();
			Thread.sleep(10000);
			HighlightOnElement(Application_Tender_OpeningDate);
			Assert.assertNotNull(Application_Tender_OpeningDate.isDisplayed(),"Test case pass");
			Application_Tender_OpeningDate.click();
			HighlightOnElement(Today_Button);
			Today_Button.click();
			Reporter.log("To click value in Application_Tender_OpeningDate is successfully",true);
			waitForSomeTime();
			HighlightOnElement(LastDateforClarifficationObjectionSubmissionDate);
			Assert.assertNotNull(LastDateforClarifficationObjectionSubmissionDate.isDisplayed(),"Test case pass");
			LastDateforClarifficationObjectionSubmissionDate.click();
			HighlightOnElement(Date30);
			Date30.click();
			Reporter.log("To click value in LastDateforClarifficationObjectionSubmissionDate is successfully",true);
			waitForSomeTime();
			HighlightOnElement(LastDateforApplication_TenderSubmission);
			Assert.assertNotNull(LastDateforApplication_TenderSubmission.isDisplayed(),"Test case pass");
			LastDateforApplication_TenderSubmission.click();
			HighlightOnElement(Date30);
			Date30.click();
			Reporter.log("To click value in LastDateforApplication_TenderSubmission is successfully",true);
			waitForSomeTime();
			HighlightOnElement(Lottary_FinancialBidOpeningDate);
			Assert.assertNotNull(Lottary_FinancialBidOpeningDate.isDisplayed(),"Test case pass");
			Lottary_FinancialBidOpeningDate.click();
			HighlightOnElement(Date30);
			Date30.click();
			Reporter.log("To click value in Lottary_FinancialBidOpeningDate is successfully",true);
			waitForSomeTime();
			HighlightOnElement(AllotmentMethod_Dropdown);
			Assert.assertNotNull(AllotmentMethod_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(AllotmentMethod_Dropdown, "Lottery / लॉटरी");
			Reporter.log("To select value in AllotmentMethod_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(IsReservationApplicable_Dropdown);
			Assert.assertNotNull(IsReservationApplicable_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(IsReservationApplicable_Dropdown, "Yes / हाँ");
			Reporter.log("To select value in IsReservationApplicable_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(8000);
			HighlightOnElement(IsAdditionalPremiumApplicable_Dropdown);
			Assert.assertNotNull(IsAdditionalPremiumApplicable_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(IsAdditionalPremiumApplicable_Dropdown, "Yes / हाँ");
			Reporter.log("To select value in IsAdditionalPremiumApplicable_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(8000);
			HighlightOnElement(IsSurrenderApplicable_Dropdown);
			Assert.assertNotNull(IsSurrenderApplicable_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(IsSurrenderApplicable_Dropdown, "Yes / हाँ");
			Reporter.log("To select value in IsSurrenderApplicable_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(8000);
			HighlightOnElement(AREARANO_field);
			Assert.assertNotNull(AREARANO_field.isDisplayed(),"Test case pass");
			AREARANO_field.sendKeys("678");
			Reporter.log(" To send data in AREARANO_field is successfully",true);
			waitForSomeTime();
			HighlightOnElement(Next_Button1);
			Assert.assertNotNull(Next_Button1.isDisplayed(),"Test case pass");
			Next_Button1.click();
			Reporter.log(" To Click on Next_Button Button successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(LandUseActivity_Dropdown);
			
		}
		
		
		public void toclickonProjectGeneralDetailsTab() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(ProjectGeneralDetailsLink);
			Assert.assertNotNull(ProjectGeneralDetailsLink.isDisplayed(),"Test case pass");
			ProjectGeneralDetailsLink.click();
			Reporter.log(" To Click ProjectGeneralDetailsLink is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(ApllicationTenderFree_Dropdown);
			
			
			
			
		}
		
		public void toverifyIsApplication_TenderFeesApplicable() throws InterruptedException
		{
			HighlightOnElement(ApllicationTenderFree_Dropdown);
			Assert.assertNotNull(ApllicationTenderFree_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(ApllicationTenderFree_Dropdown, "Yes / हाँ");
			Reporter.log(" To select value in ApllicationTenderFree_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(10000);
		}
		
		
		public void toverifyApplication_TenderFeesField() throws InterruptedException
		{
			HighlightOnElement(ApllicationTenderFee_Field);
			Assert.assertNotNull(ApllicationTenderFee_Field.isDisplayed(),"Test case pass");
			ApllicationTenderFee_Field.sendKeys("500");
			Reporter.log(" To send data in ApllicationTenderFees fieldis successfully",true);
			waitForSomeTime();
		}
		
		public void toverifyApplicationModeofPayment() throws InterruptedException
		{
			HighlightOnElement(ModeOfPayment_Dropdown);
			Assert.assertNotNull(ModeOfPayment_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(ModeOfPayment_Dropdown, "Both");
			Reporter.log("To select value in ModeOfPayment_Dropdown is successfully",true);
			waitForSomeTime();
		}
		
		public void toverifyApplicationModeofApplication() throws InterruptedException
		{
			HighlightOnElement(ModeOfApplication_Dropdown);
			Assert.assertNotNull(ModeOfApplication_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(ModeOfApplication_Dropdown, "Online / ऑनलाइन");
			Reporter.log("To select value in ModeOfApplication_Dropdown is successfully",true);
			waitForSomeTime();
			Thread.sleep(10000);
		}
		
		
		@FindBy(xpath=".//*[@id='ui-datepicker-div']/div[2]/button[1]")
		private WebElement Today_Button;
		
		@FindBy(xpath=".//*[@id='ui-datepicker-div']/table/tbody/tr/td/a[contains(.,'30')]")
		private WebElement Date30;
		
		
		public void toverifyApplicationTenderOpenDate() throws InterruptedException
		{
			HighlightOnElement(Application_Tender_OpeningDate);
			Assert.assertNotNull(Application_Tender_OpeningDate.isDisplayed(),"Test case pass");
			Application_Tender_OpeningDate.click();
			HighlightOnElement(Today_Button);
			Today_Button.click();
			Reporter.log("To click value in Application_Tender_OpeningDate is successfully",true);
			waitForSomeTime();
			
		}
		
		public void toverifyLastdateClarifficationObjectionSubmission() throws InterruptedException
		{
			HighlightOnElement(LastDateforClarifficationObjectionSubmissionDate);
			Assert.assertNotNull(LastDateforClarifficationObjectionSubmissionDate.isDisplayed(),"Test case pass");
			LastDateforClarifficationObjectionSubmissionDate.click();
			HighlightOnElement(Date30);
			Date30.click();
			Reporter.log("To click value in LastDateforClarifficationObjectionSubmissionDate is successfully",true);
			waitForSomeTime();
			
		}
		
		public void toverifyLastdateApplicationTenderSubmission() throws InterruptedException
		{
			HighlightOnElement(LastDateforApplication_TenderSubmission);
			Assert.assertNotNull(LastDateforApplication_TenderSubmission.isDisplayed(),"Test case pass");
			LastDateforApplication_TenderSubmission.click();
			HighlightOnElement(Date30);
			Date30.click();
			Reporter.log("To click value in LastDateforApplication_TenderSubmission is successfully",true);
			waitForSomeTime();
			
		}
		
		public void toverifyLottaryBidOpeningDate() throws InterruptedException
		{
			HighlightOnElement(Lottary_FinancialBidOpeningDate);
			Assert.assertNotNull(Lottary_FinancialBidOpeningDate.isDisplayed(),"Test case pass");
			Lottary_FinancialBidOpeningDate.click();
			HighlightOnElement(Date30);
			Date30.click();
			Reporter.log("To click value in Lottary_FinancialBidOpeningDate is successfully",true);
			waitForSomeTime();
			
		}
		
		
		public void toverifyAllotmentMethod() throws InterruptedException
		{
			HighlightOnElement(AllotmentMethod_Dropdown);
			Assert.assertNotNull(AllotmentMethod_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(AllotmentMethod_Dropdown, "Lottery / लॉटरी");
			Reporter.log("To select value in AllotmentMethod_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			
		}
		
		public void toverifyIsReservationApplicable() throws InterruptedException
		{
			HighlightOnElement(IsReservationApplicable_Dropdown);
			Assert.assertNotNull(IsReservationApplicable_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(IsReservationApplicable_Dropdown, "Yes / हाँ");
			Reporter.log("To select value in IsReservationApplicable_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(8000);
			
		}
		
		public void toverifyIsAdditionalPremiunApplicable() throws InterruptedException
		{
			HighlightOnElement(IsAdditionalPremiumApplicable_Dropdown);
			Assert.assertNotNull(IsAdditionalPremiumApplicable_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(IsAdditionalPremiumApplicable_Dropdown, "Yes / हाँ");
			Reporter.log("To select value in IsAdditionalPremiumApplicable_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(8000);
			
		}
		
		public void toverifyIsSurrenderApplicable() throws InterruptedException
		{
			HighlightOnElement(IsSurrenderApplicable_Dropdown);
			Assert.assertNotNull(IsSurrenderApplicable_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(IsSurrenderApplicable_Dropdown, "Yes / हाँ");
			Reporter.log("To select value in IsSurrenderApplicable_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(8000);
			
		}
		
		public void toverifyAREARNo_Field() throws InterruptedException
		{
			HighlightOnElement(AREARANO_field);
			Assert.assertNotNull(AREARANO_field.isDisplayed(),"Test case pass");
			AREARANO_field.sendKeys("678");
			Reporter.log(" To send data in AREARANO_field is successfully",true);
			waitForSomeTime();
		}
		
		
		@FindBy(xpath="//a[contains(.,'Project General Details')]/../../following-sibling::div/div[2]/span/center/table/tbody/tr/td/span/button[contains(.,'Back')]")
		private WebElement Back_Button1;
		
		@FindBy(xpath="//a[contains(.,'Project General Details')]/../../following-sibling::div/div[2]/span/center/table/tbody/tr/td/span/button[contains(.,'Reset')]")
		private WebElement Reset_Button1;
		
		@FindBy(xpath="//a[contains(.,'Project General Details')]/../../following-sibling::div/div[2]/span/center/table/tbody/tr/td/span/button[contains(.,'Close')]")
		private WebElement Close_Button1;
		
		@FindBy(xpath="//a[contains(.,'Project General Details')]/../../following-sibling::div/div[2]/span/center/table/tbody/tr/td/span/button[contains(.,'Next')]")
		private WebElement Next_Button1;
		
		
		public void toverifyResetButtonFunctionality1() throws InterruptedException
		{
			HighlightOnElement(Reset_Button1);
			Assert.assertNotNull(Reset_Button1.isDisplayed(),"Test case pass");
			Reset_Button1.click();
			Reporter.log(" To Click on Reset Button successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			VerifyTextField(AREARANO_field);
			VerifyTextField(ApllicationTenderFee_Field);
		}
		
		public void toverifyCloseButtonFunctionality1() throws InterruptedException
		{
			HighlightOnElement(Close_Button1);
			Assert.assertNotNull(Close_Button1.isDisplayed(),"Test case pass");
			Close_Button1.click();
			Reporter.log(" To Click on Close Button successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			for(int index=0;index<button.size();index++)
			   {
				String buttone=button.get(index).getText();
				System.out.println(buttone);
				
				if( buttone.trim().equalsIgnoreCase("yes"))
				   {
					button.get(index).click();
					Reporter.log("Verify Yes Button In POP-UP Of Application   is Present",true);
				   }
			   }
			  waitForSomeTime();
		      waitForSomeTime();
			  waitForSomeTime();
			  
			  waitForSomeTime();
				for(WebElement menulist:MenuLists)
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
		
		
		public void toverifyNextButtonFunctionality1() throws InterruptedException
		{
			HighlightOnElement(Next_Button1);
			Assert.assertNotNull(Next_Button1.isDisplayed(),"Test case pass");
			Next_Button1.click();
			Reporter.log(" To Click on Next_Button Button successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(LandUseActivity_Dropdown);
			
		}
		
		public void toverifyBackButtonFunctionality1() throws InterruptedException
		{
			HighlightOnElement(Back_Button1);
			Assert.assertNotNull(Back_Button1.isDisplayed(),"Test case pass");
			Back_Button1.click();
			Reporter.log(" To Click on Back_Button1 Button successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(BudjetInclusionYear_Dropdown);
			
		}
		
		@FindBy(xpath="//select[@title='Land Use Activity']")
		private WebElement LandUseActivity_Dropdown;
		
		
		@FindBy(xpath="//a[contains(.,'Unit / Property Detail')]")
		private WebElement Unit_PropertyDetailTab;
		
		
		@FindBy(xpath="//span[contains(.,'Detail of Unit / Property Detail')]/../following-sibling::div[1]/div/table/thead/tr/td/div/div/label")
		private List<WebElement> UnitPropertyDetailsLabels;
		
		
		public void toverifyUnit_PropertyDetailTab() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(Unit_PropertyDetailTab);
			Assert.assertNotNull(Unit_PropertyDetailTab.isDisplayed(),"Test case pass");
			Unit_PropertyDetailTab.click();
			Reporter.log(" To Click Unit_PropertyDetailTab is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(LandUseActivity_Dropdown);
			for(WebElement menulist:UnitPropertyDetailsLabels)
			{
				HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					System.out.println(" Labels list in UnitPropertyDetails are:"+Menu );
				}
			}
			
		}
		
		
		public void toclickUnit_PropertyDetailTab() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(Unit_PropertyDetailTab);
			Assert.assertNotNull(Unit_PropertyDetailTab.isDisplayed(),"Test case pass");
			Unit_PropertyDetailTab.click();
			Reporter.log(" To Click Unit_PropertyDetailTab is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(LandUseActivity_Dropdown);
		}
		
		
		@FindBy(xpath="//select[@title='Property Type']")
		private WebElement PropertyType_Dropdown;
		
		@FindBy(xpath="//input[@title[contains(.,'Built Up Area')]]")
		private WebElement BuiltUpAreaField;
		
		@FindBy(xpath="//input[@title[contains(.,'Plot Area')]]")
		private WebElement PlotAreaField;
		
		@FindBy(xpath="//select[@title='Floor']")
		private WebElement Floor_Dropdown;
		
		@FindBy(xpath="//input[@title='Tentative Units']")
		private WebElement TentativeUnits_Field;
		
		@FindBy(xpath="//a[@title='Property Map']")
		private WebElement PropertyMap_Image;
		
		
		@FindBy(xpath="//input[@title='Rate Per Sq Meter']")
		private WebElement RatePerSqMeterFiled;
		
		@FindBy(xpath="//input[@title[contains(.,'EMD/Bid Security')]]")
		private WebElement EMDBisSecurity_Field;
		
		@FindBy(xpath="//input[@title[contains(.,'Performance Bank')]]")
		private WebElement PerformanceBank_Field;
		
		@FindBy(xpath="//select[@title='Mode of Security Deposite']")
		private WebElement ModeofSecurityDeposite_Dropdown;
		
		@FindBy(xpath="//input[@title='Remark']")
		private WebElement Remark_Field;
		
		@FindBy(xpath="//button[contains(.,'Open Map')]")
		private WebElement OpenMap_Button;
		
		@FindBy(xpath="//button[contains(.,'Open Plot Master')]")
		private WebElement OpenPlotMaster_Button;
		
		@FindBy(xpath="//button[contains(.,'ok')]")
		private WebElement OK_Button;
		
		@FindBy(xpath=".//*[@id='form0:simpleMapDlg']/div[1]/a/span")
		private WebElement CloseMap;
		
		@FindBy(xpath=".//*[@id='form0:btnsPlotApiDlg']/div[1]/a/span")
		private WebElement Close_Map;
		
		@FindBy(xpath=".//*[@id='form0:simpleMasterPlotApiDlg']/div[1]/a/span")
		private WebElement CloseMap1;
		
		@FindBy(xpath=".//*[@id='form0:simpleMapApiDlg']/div[1]/a/span")
		private WebElement CloseMap2;
		
		@FindBy(xpath="//button[contains(.,'Confirm')]")
		private WebElement Confirm_Button;
		
		@FindBy(xpath="//*[@id='form0:simpleMapApiDlg_title']/../following-sibling::div[2]/span/center/button[contains(.,'Confirm')]")
		private WebElement CONFIRM_BUTTON;
		
		public void tofillUnitPropertyDetailForm() throws InterruptedException
		
		{
			
			HighlightOnElement(LandUseActivity_Dropdown);
			Assert.assertNotNull(LandUseActivity_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(LandUseActivity_Dropdown, "RESIDENTIAL");
			Reporter.log("To select value in LandUseActivity_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(8000);
			HighlightOnElement(PropertyType_Dropdown);
			Assert.assertNotNull(PropertyType_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(PropertyType_Dropdown, "Plotted");
			Reporter.log("To select value in PropertyType_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(10000);
			HighlightOnElement(PlotAreaField);
			Assert.assertNotNull(PlotAreaField.isDisplayed(),"Test case pass");
			PlotAreaField.sendKeys("190");
			Reporter.log("To send Data in PlotAreaField is successfully",true);
			waitForSomeTime();
			HighlightOnElement(TentativeUnits_Field);
			Assert.assertNotNull(TentativeUnits_Field.isDisplayed(),"Test case pass");
			TentativeUnits_Field.sendKeys("2");
			Reporter.log("To send Data in TentativeUnits_Field is successfully",true);
			waitForSomeTime();
			HighlightOnElement(PropertyMap_Image);
			Assert.assertNotNull(PropertyMap_Image.isDisplayed(),"Test case pass");
			PropertyMap_Image.click();
			Reporter.log("To click in PropertyMap_Image is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(OpenMap_Button);
			HighlightOnElement(OpenMap_Button);
			Assert.assertNotNull(OpenMap_Button.isDisplayed(),"Test case pass");
			OpenMap_Button.click();
			Reporter.log("To click in OpenMap_Button is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			driver.switchTo().frame(frames);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			//acceptAlert();
			waitForelementPresent(OK_Button);
			OK_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(PlotMakerIcon);
			Assert.assertNotNull(PlotMakerIcon.isDisplayed(),"Test case pass");
			PlotMakerIcon.click();
			Reporter.log("To click in PlotMakerIcon is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			driver.switchTo().defaultContent();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("alert('Select The Plot Manually')");
			waitForSomeTime();
			acceptAlert();
			Thread.sleep(15000);
			driver.switchTo().frame(frames);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(Save_Button);
			Assert.assertNotNull(Save_Button.isDisplayed(),"Test case pass");
			Save_Button.click();
			Reporter.log("To click in Save_Button is successfully",true);
			waitForSomeTime();
			HighlightOnElement(Yes_Button);
			Yes_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(OK_Button);
			OK_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			OK_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			driver.switchTo().defaultContent();
			HighlightOnElement(OK_BUTTON);
			Assert.assertNotNull(OK_BUTTON.isDisplayed(),"Test case pass");
			OK_BUTTON.click();
			Reporter.log("To click in OK_BUTTON is successfully",true);
			waitForSomeTime();
			Thread.sleep(10000);
			HighlightOnElement(CONFIRM_BUTTON);
			Assert.assertNotNull(CONFIRM_BUTTON.isDisplayed(),"Test case pass");
			CONFIRM_BUTTON.click();
			Reporter.log("To click in CONFIRM_BUTTON is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(8000);
			HighlightOnElement(RatePerSqMeterFiled);
			Assert.assertNotNull(RatePerSqMeterFiled.isDisplayed(),"Test case pass");
			RatePerSqMeterFiled.sendKeys("1399");
			Reporter.log("To send data in RatePerSqMeterFiled is successfully",true);
			waitForSomeTime();
			HighlightOnElement(EMDBisSecurity_Field);
			Assert.assertNotNull(EMDBisSecurity_Field.isDisplayed(),"Test case pass");
			EMDBisSecurity_Field.sendKeys("5");
			Reporter.log("To send data in EMDBisSecurity_Field is successfully",true);
			waitForSomeTime();
			HighlightOnElement(PerformanceBank_Field);
			Assert.assertNotNull(PerformanceBank_Field.isDisplayed(),"Test case pass");
			PerformanceBank_Field.sendKeys("8");
			Reporter.log("To send data in PerformanceBank_Field is successfully",true);
			waitForSomeTime();
			HighlightOnElement(ModeofSecurityDeposite_Dropdown);
			Assert.assertNotNull(ModeofSecurityDeposite_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(ModeofSecurityDeposite_Dropdown, "Online / ऑनलाइन");
			Reporter.log("To select value in ModeofSecurityDeposite_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(Remark_Field);
			Assert.assertNotNull(Remark_Field.isDisplayed(),"Test case pass");
			Remark_Field.sendKeys("Plot Selected");
			Reporter.log("To send data in PerformanceBank_Field is successfully",true);
			waitForSomeTime();
			HighlightOnElement(Next_Button2);
			Assert.assertNotNull(Next_Button2.isDisplayed(),"Test case pass");
			Next_Button2.click();
			Reporter.log(" To Click on Next_Button2  successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(Class_Dropdown);

		}
		
		
		public void toverifyLandUseActivity_Dropdown() throws InterruptedException
		{
			HighlightOnElement(LandUseActivity_Dropdown);
			Assert.assertNotNull(LandUseActivity_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(LandUseActivity_Dropdown, "RESIDENTIAL");
			Reporter.log("To select value in LandUseActivity_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(10000);
			
		}
		

		public void toverifyPropertyType_Dropdown() throws InterruptedException
		{
			HighlightOnElement(PropertyType_Dropdown);
			Assert.assertNotNull(PropertyType_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(PropertyType_Dropdown, "Plotted");
			Reporter.log("To select value in PropertyType_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(15000);
			
			
		}
		
		public void toverifyBuiltUpAreaField() throws InterruptedException
		{
			HighlightOnElement(BuiltUpAreaField);
			Assert.assertNotNull(BuiltUpAreaField.isDisplayed(),"Test case pass");
			BuiltUpAreaField.sendKeys("185");
			Reporter.log("To send Data in BuiltUpAreaField is successfully",true);
			waitForSomeTime();
		}
		
		public void toverifyPlotAreaField() throws InterruptedException
		{
			HighlightOnElement(PlotAreaField);
			Assert.assertNotNull(PlotAreaField.isDisplayed(),"Test case pass");
			PlotAreaField.sendKeys("190");
			Reporter.log("To send Data in PlotAreaField is successfully",true);
			waitForSomeTime();
		}
		
		
		public void toverifyFloor_Dropdown() throws InterruptedException
		{
			HighlightOnElement(Floor_Dropdown);
			Assert.assertNotNull(Floor_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(Floor_Dropdown, "Second Floor");
			Reporter.log("To select value in Floor_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
		
		}
		
		public void toverifyTentativeUnitsField() throws InterruptedException
		{
			HighlightOnElement(TentativeUnits_Field);
			Assert.assertNotNull(TentativeUnits_Field.isDisplayed(),"Test case pass");
			TentativeUnits_Field.sendKeys("2");
			Reporter.log("To send Data in TentativeUnits_Field is successfully",true);
			waitForSomeTime();
		}
		
		@FindBy(xpath="//span[contains(.,'Select Option to Get Data')]/../following-sibling::div/span/center/button/span")
		private List<WebElement> Buttons_Map;
		
		public void toverifyMapIcon() throws InterruptedException
		{
			HighlightOnElement(PropertyMap_Image);
			Assert.assertNotNull(PropertyMap_Image.isDisplayed(),"Test case pass");
			PropertyMap_Image.click();
			Reporter.log("To click in PropertyMap_Image is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			for(WebElement menulist:Buttons_Map)
			{
				HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					System.out.println(" Buttons  in PropertyMap are:"+Menu );
				}
			}
			
			waitForSomeTime();
			HighlightOnElement(Close_Map);
			Close_Map.click();
			waitForSomeTime();
			
		}
		
		@FindBy(xpath="//div/iframe[@id='simpleGisFrameTarget']")
		private WebElement frames;
		public void toverifyOpenMapButton() throws InterruptedException
		{
			HighlightOnElement(PropertyMap_Image);
			Assert.assertNotNull(PropertyMap_Image.isDisplayed(),"Test case pass");
			PropertyMap_Image.click();
			Reporter.log("To click in PropertyMap_Image is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(OpenMap_Button);
			HighlightOnElement(OpenMap_Button);
			Assert.assertNotNull(OpenMap_Button.isDisplayed(),"Test case pass");
			OpenMap_Button.click();
			Reporter.log("To click in OpenMap_Button is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			driver.switchTo().frame(frames);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			//acceptAlert();
			//waitForelementPresent(OK_Button);
			OK_Button.click();
			driver.switchTo().defaultContent();
			HighlightOnElement(CloseMap);
			CloseMap.click();
			waitForSomeTime();
			waitForSomeTime();
			
		
		}
		@FindBy(xpath="//button[@title='Select Plots']")
		private WebElement PlotMakerIcon;
		
		public void toverifyAddMarkButton() throws InterruptedException
		{
			HighlightOnElement(PropertyMap_Image);
			Assert.assertNotNull(PropertyMap_Image.isDisplayed(),"Test case pass");
			PropertyMap_Image.click();
			Reporter.log("To click in PropertyMap_Image is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(OpenMap_Button);
			HighlightOnElement(OpenMap_Button);
			Assert.assertNotNull(OpenMap_Button.isDisplayed(),"Test case pass");
			OpenMap_Button.click();
			Reporter.log("To click in OpenMap_Button is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			driver.switchTo().frame(frames);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			//acceptAlert();
			//waitForelementPresent(OK_Button);
			OK_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(PlotMakerIcon);
			Assert.assertNotNull(PlotMakerIcon.isDisplayed(),"Test case pass");
			PlotMakerIcon.click();
			Reporter.log("To click in PlotMakerIcon is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			driver.switchTo().defaultContent();
			HighlightOnElement(CloseMap);
			CloseMap.click();
			waitForSomeTime();
			waitForSomeTime();
			
		
		}
		
		@FindBy(xpath=".//*[@id='savePlotMarker']")
		private WebElement Save_Button;
		
		@FindBy(xpath="//button[contains(.,'yes')]")
		private WebElement Yes_Button;
		
		@FindBy(xpath="//*[@id='form0:simpleMapDlg_title']/../following-sibling::div/center/button[contains(.,'Ok')]")
		private WebElement OK_BUTTON;
		
		
		public void toverifySaveButton() throws InterruptedException
		{
			HighlightOnElement(PropertyMap_Image);
			Assert.assertNotNull(PropertyMap_Image.isDisplayed(),"Test case pass");
			PropertyMap_Image.click();
			Reporter.log("To click in PropertyMap_Image is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(OpenMap_Button);
			HighlightOnElement(OpenMap_Button);
			Assert.assertNotNull(OpenMap_Button.isDisplayed(),"Test case pass");
			OpenMap_Button.click();
			Reporter.log("To click in OpenMap_Button is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			driver.switchTo().frame(frames);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			//acceptAlert();
			//waitForelementPresent(OK_Button);
			OK_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(PlotMakerIcon);
			Assert.assertNotNull(PlotMakerIcon.isDisplayed(),"Test case pass");
			PlotMakerIcon.click();
			Reporter.log("To click in PlotMakerIcon is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			driver.switchTo().defaultContent();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("alert('Select The Plot')");
			waitForSomeTime();
			acceptAlert();
			Thread.sleep(10000);
			driver.switchTo().frame(frames);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(Save_Button);
			Assert.assertNotNull(Save_Button.isDisplayed(),"Test case pass");
			Save_Button.click();
			Reporter.log("To click in Save_Button is successfully",true);
			waitForSomeTime();
			HighlightOnElement(Yes_Button);
			Yes_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(OK_Button);
			OK_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			OK_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			driver.switchTo().defaultContent();
			HighlightOnElement(CloseMap);
			CloseMap.click();
			waitForSomeTime();
			waitForSomeTime();
			
		
		}
		
		public void toverifyOKButton() throws InterruptedException
		{
			HighlightOnElement(PropertyMap_Image);
			Assert.assertNotNull(PropertyMap_Image.isDisplayed(),"Test case pass");
			PropertyMap_Image.click();
			Reporter.log("To click in PropertyMap_Image is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(OpenMap_Button);
			HighlightOnElement(OpenMap_Button);
			Assert.assertNotNull(OpenMap_Button.isDisplayed(),"Test case pass");
			OpenMap_Button.click();
			Reporter.log("To click in OpenMap_Button is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			driver.switchTo().frame(frames);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			//acceptAlert();
			//waitForelementPresent(OK_Button);
			OK_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(PlotMakerIcon);
			Assert.assertNotNull(PlotMakerIcon.isDisplayed(),"Test case pass");
			PlotMakerIcon.click();
			Reporter.log("To click in PlotMakerIcon is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			driver.switchTo().defaultContent();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("alert('Select The Plot')");
			waitForSomeTime();
			acceptAlert();
			Thread.sleep(10000);
			driver.switchTo().frame(frames);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(Save_Button);
			Assert.assertNotNull(Save_Button.isDisplayed(),"Test case pass");
			Save_Button.click();
			Reporter.log("To click in Save_Button is successfully",true);
			waitForSomeTime();
			HighlightOnElement(Yes_Button);
			Yes_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(OK_Button);
			OK_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			OK_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			driver.switchTo().defaultContent();
			HighlightOnElement(OK_BUTTON);
			Assert.assertNotNull(OK_BUTTON.isDisplayed(),"Test case pass");
			OK_BUTTON.click();
			Reporter.log("To click in OK_BUTTON is successfully",true);
			waitForSomeTime();
			Thread.sleep(10000);
			HighlightOnElement(CloseMap2);
			CloseMap2.click();
			waitForSomeTime();
			HighlightOnElement(CloseMap);
			CloseMap.click();
			waitForSomeTime();
			waitForSomeTime();
			
		
		}
		
		public void toverifyConfirmButton() throws InterruptedException
		{
			HighlightOnElement(PropertyMap_Image);
			Assert.assertNotNull(PropertyMap_Image.isDisplayed(),"Test case pass");
			PropertyMap_Image.click();
			Reporter.log("To click in PropertyMap_Image is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(OpenMap_Button);
			HighlightOnElement(OpenMap_Button);
			Assert.assertNotNull(OpenMap_Button.isDisplayed(),"Test case pass");
			OpenMap_Button.click();
			Reporter.log("To click in OpenMap_Button is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			driver.switchTo().frame(frames);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			//acceptAlert();
			//waitForelementPresent(OK_Button);
			OK_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(PlotMakerIcon);
			Assert.assertNotNull(PlotMakerIcon.isDisplayed(),"Test case pass");
			PlotMakerIcon.click();
			Reporter.log("To click in PlotMakerIcon is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			driver.switchTo().defaultContent();
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("alert('Select The Plot Manually')");
			waitForSomeTime();
			acceptAlert();
			Thread.sleep(10000);
			driver.switchTo().frame(frames);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(Save_Button);
			Assert.assertNotNull(Save_Button.isDisplayed(),"Test case pass");
			Save_Button.click();
			Reporter.log("To click in Save_Button is successfully",true);
			waitForSomeTime();
			HighlightOnElement(Yes_Button);
			Yes_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(OK_Button);
			OK_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			OK_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			driver.switchTo().defaultContent();
			HighlightOnElement(OK_BUTTON);
			Assert.assertNotNull(OK_BUTTON.isDisplayed(),"Test case pass");
			OK_BUTTON.click();
			Reporter.log("To click in OK_BUTTON is successfully",true);
			waitForSomeTime();
			Thread.sleep(10000);
			HighlightOnElement(CONFIRM_BUTTON);
			Assert.assertNotNull(CONFIRM_BUTTON.isDisplayed(),"Test case pass");
			CONFIRM_BUTTON.click();
			Reporter.log("To click in CONFIRM_BUTTON is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(8000);
		}
		
		
		public void toverifyRateperSQMeter() throws InterruptedException
		{
			HighlightOnElement(RatePerSqMeterFiled);
			Assert.assertNotNull(RatePerSqMeterFiled.isDisplayed(),"Test case pass");
			RatePerSqMeterFiled.sendKeys("1399");
			Reporter.log("To send data in RatePerSqMeterFiled is successfully",true);
			waitForSomeTime();
			
		}
		
		public void toverifyEMD_BidSecurity() throws InterruptedException
		{
			HighlightOnElement(EMDBisSecurity_Field);
			Assert.assertNotNull(EMDBisSecurity_Field.isDisplayed(),"Test case pass");
			EMDBisSecurity_Field.sendKeys("5");
			Reporter.log("To send data in EMDBisSecurity_Field is successfully",true);
			waitForSomeTime();
			
		}
		
		public void toverifyPerformanceBankGuarantee() throws InterruptedException
		{
			HighlightOnElement(PerformanceBank_Field);
			Assert.assertNotNull(PerformanceBank_Field.isDisplayed(),"Test case pass");
			PerformanceBank_Field.sendKeys("8");
			Reporter.log("To send data in PerformanceBank_Field is successfully",true);
			waitForSomeTime();
			
		}
		
		public void toverifyModeofSecurityDeposite_Dropdown() throws InterruptedException
		{
			HighlightOnElement(ModeofSecurityDeposite_Dropdown);
			Assert.assertNotNull(ModeofSecurityDeposite_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(ModeofSecurityDeposite_Dropdown, "Online / ऑनलाइन");
			Reporter.log("To select value in ModeofSecurityDeposite_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
		
		}
		
		public void toverifyRemarksField() throws InterruptedException
		{
			HighlightOnElement(Remark_Field);
			Assert.assertNotNull(Remark_Field.isDisplayed(),"Test case pass");
			Remark_Field.sendKeys("Plot Selected");
			Reporter.log("To send data in PerformanceBank_Field is successfully",true);
			waitForSomeTime();
			
		}
		
		@FindBy(xpath="//a[contains(.,'Unit / Property Detail')]/../../following-sibling::div/div[3]/table/tbody/tr/td/div/div[3]/center/button[contains(.,'Add More')]")
		private WebElement AddMore_Button;
		
		@FindBy(xpath="//a[contains(.,'Unit / Property Detail')]/../../following-sibling::div/div[3]/table/tbody/tr/td/div/div[2]/div/table/tbody/tr[2]/td/button[contains(.,'Remove')]")
		private WebElement Remove_Button;
		
		@FindBy(xpath="(//select[@title='Property Type'])[2]")
		private WebElement PropertyType_Dropdown1;
		
		@FindBy(xpath="(//input[@title[contains(.,'Built Up Area')]])[2]")
		private WebElement BuiltUpAreaField1;
		
		@FindBy(xpath="(//input[@title[contains(.,'Plot Area')]])[2]")
		private WebElement PlotAreaField1;
		
		@FindBy(xpath="(//select[@title='Floor'])[2]")
		private WebElement Floor_Dropdown1;
		
		@FindBy(xpath="(//input[@title='Tentative Units'])[2]")
		private WebElement TentativeUnits_Field1;
		
		@FindBy(xpath="(//a[@title='Property Map'])[2]")
		private WebElement PropertyMap_Image1;
		
		
		@FindBy(xpath="(//input[@title='Rate Per Sq Meter'])[2]")
		private WebElement RatePerSqMeterFiled1;
		
		@FindBy(xpath="(//input[@title[contains(.,'EMD/Bid Security')]])[2]")
		private WebElement EMDBisSecurity_Field1;
		
		@FindBy(xpath="(//input[@title[contains(.,'Performance Bank')]])[2]")
		private WebElement PerformanceBank_Field1;
		
		@FindBy(xpath="(//select[@title='Mode of Security Deposite'])[2]")
		private WebElement ModeofSecurityDeposite_Dropdown1;
		
		@FindBy(xpath="(//input[@title='Remark'])[2]")
		private WebElement Remark_Field1;
		
		@FindBy(xpath="(//select[@title='Land Use Activity'])[2]")
		private WebElement LandUseActivity_Dropdown1;
		
		public void toverifyAddMoreButtonFunctionality() throws InterruptedException
		{
			HighlightOnElement(AddMore_Button);
			Assert.assertNotNull(AddMore_Button.isDisplayed(),"Test case pass");
			AddMore_Button.click();
			Reporter.log(" To Click on AddMore_Button  successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(LandUseActivity_Dropdown1);
			Assert.assertNotNull(LandUseActivity_Dropdown1.isDisplayed(),"Test case pass");
			Reporter.log("LandUseActivity_Dropdown1 is Present",true);
			HighlightOnElement(PropertyType_Dropdown1);
			Assert.assertNotNull(PropertyType_Dropdown1.isDisplayed(),"Test case pass");
			Reporter.log("PropertyType_Dropdown1 is Present",true);
			HighlightOnElement(BuiltUpAreaField1);
			Assert.assertNotNull(BuiltUpAreaField1.isDisplayed(),"Test case pass");
			Reporter.log("BuiltUpAreaField1 is Present",true);
			HighlightOnElement(PlotAreaField1);
			Assert.assertNotNull(PlotAreaField1.isDisplayed(),"Test case pass");
			Reporter.log("PlotAreaField1 is Present",true);
			HighlightOnElement(Floor_Dropdown1);
			Assert.assertNotNull(Floor_Dropdown1.isDisplayed(),"Test case pass");
			Reporter.log("Floor_Dropdown1 is Present",true);
			HighlightOnElement(TentativeUnits_Field1);
			Assert.assertNotNull(TentativeUnits_Field1.isDisplayed(),"Test case pass");
			Reporter.log("TentativeUnits_Field1 is Present",true);
			HighlightOnElement(PropertyMap_Image1);
			Assert.assertNotNull(PropertyMap_Image1.isDisplayed(),"Test case pass");
			Reporter.log("PropertyMap_Image1 is Present",true);
			HighlightOnElement(RatePerSqMeterFiled1);
			Assert.assertNotNull(RatePerSqMeterFiled1.isDisplayed(),"Test case pass");
			Reporter.log("RatePerSqMeterFiled1 is Present",true);
			HighlightOnElement(EMDBisSecurity_Field1);
			Assert.assertNotNull(EMDBisSecurity_Field1.isDisplayed(),"Test case pass");
			Reporter.log("EMDBisSecurity_Field1 is Present",true);
			HighlightOnElement(PerformanceBank_Field1);
			Assert.assertNotNull(PerformanceBank_Field1.isDisplayed(),"Test case pass");
			Reporter.log("PerformanceBank_Field1 is Present",true);
			HighlightOnElement(ModeofSecurityDeposite_Dropdown1);
			Assert.assertNotNull(ModeofSecurityDeposite_Dropdown1.isDisplayed(),"Test case pass");
			Reporter.log("ModeofSecurityDeposite_Dropdown1 is Present",true);
			HighlightOnElement(Remark_Field1);
			Assert.assertNotNull(Remark_Field1.isDisplayed(),"Test case pass");
			Reporter.log("Remark_Field1 is Present",true);
			
		}
		
		
		
		public void toverifyRemoveButtonFunctionality() throws InterruptedException
		{
			HighlightOnElement(AddMore_Button);
			Assert.assertNotNull(AddMore_Button.isDisplayed(),"Test case pass");
			AddMore_Button.click();
			Reporter.log(" To Click on AddMore_Button  successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(Remove_Button);
			Assert.assertNotNull(Remove_Button.isDisplayed(),"Test case pass");
			Remove_Button.click();
			Reporter.log(" To Click on Remove_Button  successfully",true);
			waitForSomeTime();
			waitForSomeTime();
		}
		
		@FindBy(xpath="//a[contains(.,'Unit / Property Detail')]/../../following-sibling::div/div[3]/span/center/table/tbody/tr/td/span/button[contains(.,'Next')]")
		private WebElement Next_Button2;
		
		@FindBy(xpath="//select[@title='Class']")
		private WebElement Class_Dropdown;
		
		public void toverifyNextButtonFunctionality2() throws InterruptedException
		{
			HighlightOnElement(Next_Button2);
			Assert.assertNotNull(Next_Button2.isDisplayed(),"Test case pass");
			Next_Button2.click();
			Reporter.log(" To Click on Next_Button2  successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(Class_Dropdown);
			
		}
		
		@FindBy(xpath="//a[contains(.,'Applicant Reservation Category')]")
		private WebElement ApplicantReservationCategoryTab;
		
		@FindBy(xpath="//span[contains(.,'Detail of Reservation Category')]/../following-sibling::div[1]/div/table/thead/tr/td/div/div/label")
		private List<WebElement> ApplicantReservationCategoryLabels;
		
		public void toverifyApplicantReservationCategory() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(ApplicantReservationCategoryTab);
			Assert.assertNotNull(ApplicantReservationCategoryTab.isDisplayed(),"Test case pass");
			ApplicantReservationCategoryTab.click();
			Reporter.log(" To Click ApplicantReservationCategoryTab is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(Class_Dropdown);
			for(WebElement menulist:ApplicantReservationCategoryLabels)
			{
																																																																													HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					System.out.println(" Labels list in ApplicantReservationCategoryLabels Form are:"+Menu );
				}
			}
			
		}
		
		@FindBy(xpath="//select[@title='Category']")
		private WebElement Category_Dropdown;
		
		@FindBy(xpath="//select[@title='Reservation Rule']")
		private WebElement ReservationRule_Dropdown;
		
		@FindBy(xpath="//input[@title='Percentage/Lumpsump']")
		private WebElement Percentage_Lumpsump_Filed;
		
		
		public void toclickonApplicantReservationCategory() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(ApplicantReservationCategoryTab);
			Assert.assertNotNull(ApplicantReservationCategoryTab.isDisplayed(),"Test case pass");
			ApplicantReservationCategoryTab.click();
			Reporter.log(" To Click ApplicantReservationCategoryTab is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(Class_Dropdown);
		}
		
		public void tofillformasApplicantReservationCategory() throws InterruptedException
		
		{
			HighlightOnElement(Class_Dropdown);
			Assert.assertNotNull(Class_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(Class_Dropdown, "RESIDENTIAL");
			Reporter.log("To select value in Class_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(Category_Dropdown);
			Assert.assertNotNull(Category_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(Category_Dropdown, "NRDA Employee");
			Reporter.log("To select value in Category_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(ReservationRule_Dropdown);
			Assert.assertNotNull(ReservationRule_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(ReservationRule_Dropdown, "Lumpsum");
			Reporter.log("To select value in ReservationRule_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(Percentage_Lumpsump_Filed);
			Assert.assertNotNull(Percentage_Lumpsump_Filed.isDisplayed(),"Test case pass");
			Percentage_Lumpsump_Filed.sendKeys("5000000");
			Reporter.log("To send data in Percentage_Lumpsump_Filed is successfully",true);
			waitForSomeTime();
			HighlightOnElement(Next_Button3);
			Assert.assertNotNull(Next_Button3.isDisplayed(),"Test case pass");
			Next_Button3.click();
			Reporter.log(" To Click on Next_Button3 Button successfully",true);
			waitForSomeTime();
			waitForelementPresent(PropertyPlotPreferencetype_Dropdown);
		
		}
		
		
		
		public void toverifyClassDropdownFunctionality() throws InterruptedException
		{
			HighlightOnElement(Class_Dropdown);
			Assert.assertNotNull(Class_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(Class_Dropdown, "RESIDENTIAL");
			Reporter.log("To select value in Class_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			
			
		}
		
		public void toverifyCategoryDropdownFunctionality() throws InterruptedException
		{
			HighlightOnElement(Category_Dropdown);
			Assert.assertNotNull(Category_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(Category_Dropdown, "NRDA Employee");
			Reporter.log("To select value in Category_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			
			
		}
		
		public void toverifyReservationRuleDropdownFunctionality() throws InterruptedException
		{
			HighlightOnElement(ReservationRule_Dropdown);
			Assert.assertNotNull(ReservationRule_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(ReservationRule_Dropdown, "Lumpsum");
			Reporter.log("To select value in ReservationRule_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			
		}
		
		
		public void toverifyPercentage_LumpsumpField() throws InterruptedException
		{
			HighlightOnElement(Percentage_Lumpsump_Filed);
			Assert.assertNotNull(Percentage_Lumpsump_Filed.isDisplayed(),"Test case pass");
			Percentage_Lumpsump_Filed.sendKeys("5000000");
			Reporter.log("To send data in Percentage_Lumpsump_Filed is successfully",true);
			waitForSomeTime();
			
		}
		
		@FindBy(xpath="//a[contains(.,'Applicant Reservation Category')]/../../following-sibling::div/div[4]/table/tbody/tr/td/div/div[3]/center/button[contains(.,'Add More')]")
		private WebElement AddMore_Button1;
		
		@FindBy(xpath="(//select[@title='Category'])[2]")
		private WebElement Category_Dropdown1;
		
		@FindBy(xpath="(//select[@title='Reservation Rule'])[2]")
		private WebElement ReservationRule_Dropdown1;
		
		@FindBy(xpath="(//input[@title='Percentage/Lumpsump'])[2]")
		private WebElement Percentage_Lumpsump_Filed1;
		
		@FindBy(xpath="(//select[@title='Class'])[2]")
		private WebElement Class_Dropdown1;
		
		
		public void toverifyAddMoreButtonFunctionality1() throws InterruptedException
		{
			HighlightOnElement(AddMore_Button1);
			Assert.assertNotNull(AddMore_Button1.isDisplayed(),"Test case pass");
			AddMore_Button1.click();
			Reporter.log(" To Click on AddMore_Button1  successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(Class_Dropdown1);
			Assert.assertNotNull(Class_Dropdown1.isDisplayed(),"Test case pass");
			Reporter.log("Class_Dropdown1 is Present",true);
			HighlightOnElement(Category_Dropdown1);
			Assert.assertNotNull(Category_Dropdown1.isDisplayed(),"Test case pass");
			Reporter.log("Category_Dropdown1 is Present",true);
			HighlightOnElement(ReservationRule_Dropdown1);
			Assert.assertNotNull(ReservationRule_Dropdown1.isDisplayed(),"Test case pass");
			Reporter.log("ReservationRule_Dropdown1 is Present",true);
			HighlightOnElement(Percentage_Lumpsump_Filed1);
			Assert.assertNotNull(Percentage_Lumpsump_Filed1.isDisplayed(),"Test case pass");
			Reporter.log("Percentage_Lumpsump_Filed1 is Present",true);
		}
		
		@FindBy(xpath="//a[contains(.,'Applicant Reservation Category')]/../../following-sibling::div/div[4]/span/center/table/tbody/tr/td/span/button[contains(.,'Next')]")
		private WebElement Next_Button3;
		
		
		
		public void toverifyNextButtonFunctionality3() throws InterruptedException
		{
			HighlightOnElement(Next_Button3);
			Assert.assertNotNull(Next_Button3.isDisplayed(),"Test case pass");
			Next_Button3.click();
			Reporter.log(" To Click on Next_Button3 Button successfully",true);
			waitForSomeTime();
			waitForelementPresent(PropertyPlotPreferencetype_Dropdown);
			
		}
		
		
		@FindBy(xpath="//a[contains(.,'Additional Fee Applicable')]")
		private WebElement AdditionalFeesApplicableTab;
		
		@FindBy(xpath="//span[contains(.,'Detail of Additional Fee Applicable')]/../following-sibling::div[1]/div/table/thead/tr/td/div/div/label")
		private List<WebElement> AdditionalFeesApplicableLabels;
		
		
		public void toverifyAdditionalFeesApplicable() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(AdditionalFeesApplicableTab);
			Assert.assertNotNull(AdditionalFeesApplicableTab.isDisplayed(),"Test case pass");
			AdditionalFeesApplicableTab.click();
			Reporter.log(" To Click AdditionalFeesApplicableTab is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(PropertyPlotPreferencetype_Dropdown);
			for(WebElement menulist:AdditionalFeesApplicableLabels)
			{
																																																																													HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					System.out.println(" Labels list in AdditionalFeesApplicableLabels  are:"+Menu );
				}
			}
			
		}
		
		public void toclickonAdditionalFeeApplicable() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(AdditionalFeesApplicableTab);
			Assert.assertNotNull(AdditionalFeesApplicableTab.isDisplayed(),"Test case pass");
			AdditionalFeesApplicableTab.click();
			Reporter.log(" To Click AdditionalFeesApplicableTab is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(PropertyPlotPreferencetype_Dropdown);
		}
		
		@FindBy(xpath="//select[@title='Property/Plot Preference Type']")
		private WebElement PropertyPlotPreferencetype_Dropdown;
		
		@FindBy(xpath="//select[@title='Payment Type']")
		private WebElement PaymentType_Dropdown;
		
		@FindBy(xpath="//input[@title='Additional Premium (Rate per Sq Meter)']")
		private WebElement AdditionalPremiumField;
		
		
		
		public void tofillformasAdditionalFeesApplicable() throws InterruptedException
		{
			
			HighlightOnElement(PropertyPlotPreferencetype_Dropdown);
			Assert.assertNotNull(PropertyPlotPreferencetype_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(PropertyPlotPreferencetype_Dropdown, "Corner + Garden Facing");
			Reporter.log("To select value in PropertyPlotPreferencetype_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(PaymentType_Dropdown);
			Assert.assertNotNull(PaymentType_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(PaymentType_Dropdown, "Percentage");
			Reporter.log("To select value in PaymentType_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(AdditionalPremiumField);
			Assert.assertNotNull(AdditionalPremiumField.isDisplayed(),"Test case pass");
			AdditionalPremiumField.sendKeys("300");
			Reporter.log("To send data in AdditionalPremiumField is successfully",true);
			waitForSomeTime();
			HighlightOnElement(Next_Button4);
			Assert.assertNotNull(Next_Button4.isDisplayed(),"Test case pass");
			Next_Button4.click();
			Reporter.log(" To Click on Next_Button3 Button successfully",true);
			waitForSomeTime();
			waitForelementPresent(PaymentPlan_Dropdown);			
			
		}
		
		
		public void toverifyProperty_plotPreferenceTypeDropdownFunctionality() throws InterruptedException
		{
			HighlightOnElement(PropertyPlotPreferencetype_Dropdown);
			Assert.assertNotNull(PropertyPlotPreferencetype_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(PropertyPlotPreferencetype_Dropdown, "Corner + Garden Facing");
			Reporter.log("To select value in PropertyPlotPreferencetype_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
		
		}
		
		public void toverifyPaymentTypeDropdownFunctionality() throws InterruptedException
		{
			HighlightOnElement(PaymentType_Dropdown);
			Assert.assertNotNull(PaymentType_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(PaymentType_Dropdown, "Percentage");
			Reporter.log("To select value in PaymentType_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
		
		}
		
		public void toverifyAdditionalPremiumField() throws InterruptedException
		{
			HighlightOnElement(AdditionalPremiumField);
			Assert.assertNotNull(AdditionalPremiumField.isDisplayed(),"Test case pass");
			AdditionalPremiumField.sendKeys("300");
			Reporter.log("To send data in AdditionalPremiumField is successfully",true);
			waitForSomeTime();
			
		}
		
		@FindBy(xpath="//a[contains(.,'Additional Fee Applicable')]/../../following-sibling::div/div[5]/table/tbody/tr/td/div/div[3]/center/button[contains(.,'Add More')]")
		private WebElement AddMore_Button2;
		
		@FindBy(xpath="(//select[@title='Property/Plot Preference Type'])[2]")
		private WebElement PropertyPlotPreferencetype_Dropdown1;
		
		@FindBy(xpath="(//select[@title='Payment Type'])[2]")
		private WebElement PaymentType_Dropdown1;
		
		@FindBy(xpath="(//input[@title='Additional Premium (Rate per Sq Meter)'])[2]")
		private WebElement AdditionalPremiumField1;
		
		public void toverifyAddMoreButtonFunctionality2() throws InterruptedException
		{
			HighlightOnElement(AddMore_Button2);
			Assert.assertNotNull(AddMore_Button2.isDisplayed(),"Test case pass");
			AddMore_Button2.click();
			Reporter.log(" To Click on AddMore_Button  successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(PropertyPlotPreferencetype_Dropdown1);
			Assert.assertNotNull(PropertyPlotPreferencetype_Dropdown1.isDisplayed(),"Test case pass");
			Reporter.log("PropertyPlotPreferencetype_Dropdown1 is Present",true);
			HighlightOnElement(PaymentType_Dropdown1);
			Assert.assertNotNull(PaymentType_Dropdown1.isDisplayed(),"Test case pass");
			Reporter.log("PaymentType_Dropdown1 is Present",true);
			HighlightOnElement(AdditionalPremiumField1);
			Assert.assertNotNull(AdditionalPremiumField1.isDisplayed(),"Test case pass");
			Reporter.log("AdditionalPremiumField1 is Present",true);
		}
		
		@FindBy(xpath="//a[contains(.,'Additional Fee Applicable')]/../../following-sibling::div/div[5]/span/center/table/tbody/tr/td/span/button[contains(.,'Next')]")
		private WebElement Next_Button4;
		
		
		
		public void toverifyNextButtonFunctionality4() throws InterruptedException
		{
			HighlightOnElement(Next_Button4);
			Assert.assertNotNull(Next_Button4.isDisplayed(),"Test case pass");
			Next_Button4.click();
			Reporter.log(" To Click on Next_Button3 Button successfully",true);
			waitForSomeTime();
			waitForelementPresent(PaymentPlan_Dropdown);
			
		}
		
		@FindBy(xpath="//a[contains(.,'Premium Payment Plan')]")
		private WebElement PremiumPaymentPlanTab;
		
		@FindBy(xpath="//span[contains(.,'Premium Payment Plan')]/../following-sibling::div[1]/div/table/thead/tr/td/div/div/label")
		private List<WebElement> PremiumPaymentPlanLabels;
		
		
		public void toverifyPremiumPaymentPlan() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(PremiumPaymentPlanTab);
			Assert.assertNotNull(PremiumPaymentPlanTab.isDisplayed(),"Test case pass");
			PremiumPaymentPlanTab.click();
			Reporter.log(" To Click PremiumPaymentPlanTab is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(PaymentPlan_Dropdown);
			for(WebElement menulist:PremiumPaymentPlanLabels)
			{
																																																																													HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					System.out.println(" Labels list in PremiumPaymentPlanLabels  are:"+Menu );
				}
			}
			
		}
		
		@FindBy(xpath="//select[@title='Payment Plan']")
		private WebElement PaymentPlan_Dropdown;
		
		@FindBy(xpath="//input[@title='Payment Tenure (in Years)']")
		private WebElement PaymentTenure_Field;
		
		@FindBy(xpath="//input[@title='Down Payment (in %)']")
		private WebElement Downpayment_Field;
		
		@FindBy(xpath="//input[@title='ROI on Installment (in %)']")
		private WebElement RateofInterest_Field;
		
		@FindBy(xpath="//input[@title='Down Payment (From LoI in Days)']")
		private WebElement DownPaymentDaysField;
		
		@FindBy(xpath="//select[@title='Payment Cycle (From LoI)']")
		private WebElement PaymentCycle_Dropdown;
		
		@FindBy(xpath="//input[@title='Delay Penalty (in %)']")
		private WebElement DelayPaymentField;
		
		
		public void toclickonPremiumPaymentPlan() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(PremiumPaymentPlanTab);
			Assert.assertNotNull(PremiumPaymentPlanTab.isDisplayed(),"Test case pass");
			PremiumPaymentPlanTab.click();
			Reporter.log(" To Click PremiumPaymentPlanTab is successfully",true);
			waitForSomeTime();
			waitForelementPresent(PaymentPlan_Dropdown);
		}
		
		public void tofillFormasPremiumPaymentPlan() throws InterruptedException
		
		{
			
			HighlightOnElement(PaymentPlan_Dropdown);
			Assert.assertNotNull(PaymentPlan_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(PaymentPlan_Dropdown, "Installment");
			Reporter.log("To select value in PaymentPlan_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(8000);
			HighlightOnElement(PaymentTenure_Field);
			Assert.assertNotNull(PaymentTenure_Field.isDisplayed(),"Test case pass");
			PaymentTenure_Field.sendKeys("15");
			Reporter.log("To send data in PaymentTenure_Field is successfully",true);
			waitForSomeTime();
			HighlightOnElement(Downpayment_Field);
			Assert.assertNotNull(Downpayment_Field.isDisplayed(),"Test case pass");
			Downpayment_Field.sendKeys("7");
			Reporter.log("To send data in Downpayment_Field is successfully",true);
			waitForSomeTime();
			HighlightOnElement(RateofInterest_Field);
			Assert.assertNotNull(RateofInterest_Field.isDisplayed(),"Test case pass");
			RateofInterest_Field.sendKeys("8");
			Reporter.log("To send data in RateofInterest_Field is successfully",true);
			waitForSomeTime();
			HighlightOnElement(DownPaymentDaysField);
			Assert.assertNotNull(DownPaymentDaysField.isDisplayed(),"Test case pass");
			DownPaymentDaysField.sendKeys("15");
			Reporter.log("To send data in RateofInterest_Field is successfully",true);
			waitForSomeTime();
			HighlightOnElement(PaymentCycle_Dropdown);
			Assert.assertNotNull(PaymentCycle_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(PaymentCycle_Dropdown, "Monthly");
			Reporter.log("To select value in PaymentCycle_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(8000);
			HighlightOnElement(DelayPaymentField);
			Assert.assertNotNull(DelayPaymentField.isDisplayed(),"Test case pass");
			DelayPaymentField.sendKeys("7");
			Reporter.log("To send data in DelayPaymentField is successfully",true);
			waitForSomeTime();
			HighlightOnElement(Next_Button5);
			Assert.assertNotNull(Next_Button5.isDisplayed(),"Test case pass");
			Next_Button5.click();
			Reporter.log(" To Click on Next_Button Button successfully",true);
			waitForSomeTime();
			waitForelementPresent(LandDisposalMethod_Dropdown);
			
			
			
			
			
		}
		
		
		public void toverifyPaymentPlan_DropdownFunctionality() throws InterruptedException
		{
			HighlightOnElement(PaymentPlan_Dropdown);
			Assert.assertNotNull(PaymentPlan_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(PaymentPlan_Dropdown, "Installment");
			Reporter.log("To select value in PaymentPlan_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(8000);
		
		}
		
		
		public void toverifyPaymentTenureField() throws InterruptedException
		{
			HighlightOnElement(PaymentTenure_Field);
			Assert.assertNotNull(PaymentTenure_Field.isDisplayed(),"Test case pass");
			PaymentTenure_Field.sendKeys("15");
			Reporter.log("To send data in PaymentTenure_Field is successfully",true);
			waitForSomeTime();
			
		}
		
		public void toverifyDownPaymentField() throws InterruptedException
		{
			HighlightOnElement(Downpayment_Field);
			Assert.assertNotNull(Downpayment_Field.isDisplayed(),"Test case pass");
			Downpayment_Field.sendKeys("7");
			Reporter.log("To send data in Downpayment_Field is successfully",true);
			waitForSomeTime();
			
		}
		
		public void toverifyRoIinstallmentField() throws InterruptedException
		{
			HighlightOnElement(RateofInterest_Field);
			Assert.assertNotNull(RateofInterest_Field.isDisplayed(),"Test case pass");
			RateofInterest_Field.sendKeys("8");
			Reporter.log("To send data in RateofInterest_Field is successfully",true);
			waitForSomeTime();
			
		}
		
		public void toverifyDownpaymentdaysField() throws InterruptedException
		{
			HighlightOnElement(DownPaymentDaysField);
			Assert.assertNotNull(DownPaymentDaysField.isDisplayed(),"Test case pass");
			DownPaymentDaysField.sendKeys("15");
			Reporter.log("To send data in RateofInterest_Field is successfully",true);
			waitForSomeTime();
			
		}
		
		public void toverifyPaymentCycle_DropdownFunctionality() throws InterruptedException
		{
			HighlightOnElement(PaymentCycle_Dropdown);
			Assert.assertNotNull(PaymentCycle_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(PaymentCycle_Dropdown, "Monthly");
			Reporter.log("To select value in PaymentCycle_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(8000);
		
		}
		
		public void toverifyDelayPenaltyField() throws InterruptedException
		{
			HighlightOnElement(DelayPaymentField);
			Assert.assertNotNull(DelayPaymentField.isDisplayed(),"Test case pass");
			DelayPaymentField.sendKeys("7");
			Reporter.log("To send data in DelayPaymentField is successfully",true);
			waitForSomeTime();
			
		}
		
		@FindBy(xpath="//a[contains(.,'Premium Payment Plan')]/../../following-sibling::div/div[6]/table/tbody/tr/td/div/div[3]/center/button[contains(.,'Add More')]")
		private WebElement AddMore_Button3;
		
		@FindBy(xpath="(//select[@title='Payment Plan'])[2]")
		private WebElement PaymentPlan_Dropdown1;
		
		@FindBy(xpath="(//input[@title='Payment Tenure (in Years)'])[2]")
		private WebElement PaymentTenure_Field1;
		
		@FindBy(xpath="(//input[@title='Down Payment (in %)'])[2]")
		private WebElement Downpayment_Field1;
		
		@FindBy(xpath="(//input[@title='ROI on Installment (in %)'])[2]")
		private WebElement RateofInterest_Field1;
		
		@FindBy(xpath="(//input[@title='Down Payment (From LoI in Days)'])[2]")
		private WebElement DownPaymentDaysField1;
		
		@FindBy(xpath="(//select[@title='Payment Cycle (From LoI)'])[2]")
		private WebElement PaymentCycle_Dropdown1;
		
		@FindBy(xpath="(//input[@title='Delay Penalty (in %)'])[2]")
		private WebElement DelayPaymentField1;
		
		@FindBy(xpath="//a[contains(.,'Premium Payment Plan')]/../../following-sibling::div/div[6]/span/center/table/tbody/tr/td/span/button[contains(.,'Next')]")
		private WebElement Next_Button5;
		
		
		public void toverifyAddMoreButtonFunctionality3() throws InterruptedException
		{
			HighlightOnElement(AddMore_Button3);
			Assert.assertNotNull(AddMore_Button3.isDisplayed(),"Test case pass");
			AddMore_Button3.click();
			Reporter.log(" To Click on AddMore_Button3  successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(PaymentPlan_Dropdown1);
			Assert.assertNotNull(PaymentPlan_Dropdown1.isDisplayed(),"Test case pass");
			Reporter.log("PaymentPlan_Dropdown1 is Present",true);
			HighlightOnElement(PaymentTenure_Field1);
			Assert.assertNotNull(PaymentTenure_Field1.isDisplayed(),"Test case pass");
			Reporter.log("PaymentTenure_Field1 is Present",true);
			HighlightOnElement(Downpayment_Field1);
			Assert.assertNotNull(Downpayment_Field1.isDisplayed(),"Test case pass");
			Reporter.log("Downpayment_Field1 is Present",true);
			HighlightOnElement(RateofInterest_Field1);
			Assert.assertNotNull(RateofInterest_Field1.isDisplayed(),"Test case pass");
			Reporter.log("RateofInterest_Field1 is Present",true);
			HighlightOnElement(DownPaymentDaysField1);
			Assert.assertNotNull(DownPaymentDaysField1.isDisplayed(),"Test case pass");
			Reporter.log("DownPaymentDaysField1 is Present",true);
			HighlightOnElement(PaymentCycle_Dropdown1);
			Assert.assertNotNull(PaymentCycle_Dropdown1.isDisplayed(),"Test case pass");
			Reporter.log("PaymentCycle_Dropdown1 is Present",true);
			HighlightOnElement(DelayPaymentField1);
			Assert.assertNotNull(DelayPaymentField1.isDisplayed(),"Test case pass");
			Reporter.log("DelayPaymentField1 is Present",true);
		
		}
		
		public void toverifyNextButtonFunctionality5() throws InterruptedException
		{
			HighlightOnElement(Next_Button5);
			Assert.assertNotNull(Next_Button5.isDisplayed(),"Test case pass");
			Next_Button5.click();
			Reporter.log(" To Click on Next_Button Button successfully",true);
			waitForSomeTime();
			waitForelementPresent(LandDisposalMethod_Dropdown);
			
		}
		
		
		@FindBy(xpath="//a[contains(.,'Other Lease/License Terms & Condition')]")
		private WebElement OtherLeaseLicenseTermConditionTab;
		
		@FindBy(xpath="//a[contains(.,'Other Lease/License Terms & Condition')]/../../following-sibling::div/div[7]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
		private List<WebElement> OtherLeaseLicenseTermConditionTabLabels;
		
		
		public void toverifyOtherLease_LicenseTermsCondition() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(OtherLeaseLicenseTermConditionTab);
			Assert.assertNotNull(OtherLeaseLicenseTermConditionTab.isDisplayed(),"Test case pass");
			OtherLeaseLicenseTermConditionTab.click();
			Reporter.log(" To Click OtherLeaseLicenseTermConditionTab is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(LandDisposalMethod_Dropdown);
			for(WebElement menulist:OtherLeaseLicenseTermConditionTabLabels)
			{
																																																																													HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					System.out.println(" Labels list in OtherLeaseLicenseTermConditionTabLabels  are:"+Menu );
				}
			}
			
		}
		
		public void toclickOtherLease_LicenseTermsCondition() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(OtherLeaseLicenseTermConditionTab);
			Assert.assertNotNull(OtherLeaseLicenseTermConditionTab.isDisplayed(),"Test case pass");
			OtherLeaseLicenseTermConditionTab.click();
			Reporter.log(" To Click OtherLeaseLicenseTermConditionTab is successfully",true);
			waitForSomeTime();
			waitForelementPresent(LandDisposalMethod_Dropdown);
		}
		
		
		
		@FindBy(xpath="//select[@title='Land Disposal Method']")
		private WebElement LandDisposalMethod_Dropdown;
		
		@FindBy(xpath="//input[@title='Minimum Lease / License Period (in Years)']")
		private WebElement MinimumLeaseLicensePeriod_Field;
		
		@FindBy(xpath="//select[@title='Is Lease/License Extendible?']")
		private WebElement LeaseLicenseExtendable_Dropdown;
		
		@FindBy(xpath="//input[@title='Extendible Term']")
		private WebElement ExtendibleTerm_Filed;
		
		@FindBy(xpath="//select[@title='Lease / License Payment Method']")
		private WebElement License_LeasePaymentMethod_dropdown;
		
		@FindBy(xpath="//input[@title='Lease Rent / License Fee (in % or Lumpsump)']")
		private WebElement Leaserent_LicenseFees_Field;
		
		@FindBy(xpath="//select[@title='Lease Rent / License Fee Payable']")
		private WebElement Leaserent_LicenseFeesPayable_dropdown;
		
		@FindBy(xpath="//input[@title='% of Penalty on Lease Rent Delay']")
		private WebElement PenaltyofLeaaserentDelay_Field;
		
		@FindBy(xpath="//select[@title='Penalty Payable']")
		private WebElement PenaltyPayable_dropdown;
		
		@FindBy(xpath="//select[@title='Select Rule']")
		private WebElement SelectRule_Dropdown;
		
		@FindBy(xpath="//select[@title='Penalty Computation']")
		private WebElement PenaltyComputation_Dropdown;
		
		@FindBy(xpath="//textarea[@title='Remarks']")
		private WebElement REMARKS_Field;
		
		
		public void tofillformasOtherlicenseLease() throws InterruptedException
		{
			
			
			HighlightOnElement(LandDisposalMethod_Dropdown);
			Assert.assertNotNull(LandDisposalMethod_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(LandDisposalMethod_Dropdown, "Lease");
			Reporter.log("To select value in LandDisposalMethod_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(MinimumLeaseLicensePeriod_Field);
			Assert.assertNotNull(MinimumLeaseLicensePeriod_Field.isDisplayed(),"Test case pass");
			MinimumLeaseLicensePeriod_Field.sendKeys("20");
			Reporter.log("To send data in MinimumLeaseLicensePeriod_Field is successfully",true);
			waitForSomeTime();
			HighlightOnElement(LeaseLicenseExtendable_Dropdown);
			Assert.assertNotNull(LeaseLicenseExtendable_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(LeaseLicenseExtendable_Dropdown, "Yes / हाँ");
			Reporter.log("To select value in LeaseLicenseExtendable_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(ExtendibleTerm_Filed);
			Assert.assertNotNull(ExtendibleTerm_Filed.isDisplayed(),"Test case pass");
			ExtendibleTerm_Filed.sendKeys("5");
			Reporter.log("To send data in ExtendibleTerm_Filed is successfully",true);
			waitForSomeTime();
			HighlightOnElement(License_LeasePaymentMethod_dropdown);
			Assert.assertNotNull(License_LeasePaymentMethod_dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(License_LeasePaymentMethod_dropdown, "Percentage");
			Reporter.log("To select value in License_LeasePaymentMethod_dropdown is successfully",true);
			waitForSomeTime();
			HighlightOnElement(Leaserent_LicenseFees_Field);
			Assert.assertNotNull(Leaserent_LicenseFees_Field.isDisplayed(),"Test case pass");
			Leaserent_LicenseFees_Field.sendKeys("5");
			Reporter.log("To send data in Leaserent_LicenseFees_Field is successfully",true);
			waitForSomeTime();
			HighlightOnElement(Leaserent_LicenseFeesPayable_dropdown);
			Assert.assertNotNull(Leaserent_LicenseFeesPayable_dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(Leaserent_LicenseFeesPayable_dropdown, "Monthly");
			Reporter.log("To select value in Leaserent_LicenseFeesPayable_dropdown is successfully",true);
			waitForSomeTime();
			HighlightOnElement(PenaltyofLeaaserentDelay_Field);
			Assert.assertNotNull(PenaltyofLeaaserentDelay_Field.isDisplayed(),"Test case pass");
			PenaltyofLeaaserentDelay_Field.sendKeys("5");
			Reporter.log("To send data in PenaltyofLeaaserentDelay_Field is successfully",true);
			waitForSomeTime();
			HighlightOnElement(PenaltyPayable_dropdown);
			Assert.assertNotNull(PenaltyPayable_dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(PenaltyPayable_dropdown, "Monthly");
			Reporter.log("To select value in PenaltyPayable_dropdown is successfully",true);
			waitForSomeTime();
			HighlightOnElement(SelectRule_Dropdown);
			Assert.assertNotNull(SelectRule_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(SelectRule_Dropdown, "Rule 17");
			Reporter.log("To select value in SelectRule_Dropdown is successfully",true);
			waitForSomeTime();
			Thread.sleep(10000);
			HighlightOnElement(PenaltyComputation_Dropdown);
			Assert.assertNotNull(PenaltyComputation_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(PenaltyComputation_Dropdown, "Simple Interest");
			Reporter.log("To select value in PenaltyComputation_Dropdown is successfully",true);
			waitForSomeTime();
			HighlightOnElement(REMARKS_Field);
			Assert.assertNotNull(REMARKS_Field.isDisplayed(),"Test case pass");
			REMARKS_Field.sendKeys("Terms And Condition Accepted");
			Reporter.log("To send data in REMARKS_Field is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(Next_Button6);
			Assert.assertNotNull(Next_Button6.isDisplayed(),"Test case pass");
			Next_Button6.click();
			Reporter.log(" To Click on Next_Button6 Button successfully",true);
			waitForSomeTime();
			waitForelementPresent(TimeLineApplicationForm_Dropdown);

		}
		
		
		
		public void toverifyLandDisposalMethodFunctionality() throws InterruptedException
		{
			HighlightOnElement(LandDisposalMethod_Dropdown);
			Assert.assertNotNull(LandDisposalMethod_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(LandDisposalMethod_Dropdown, "Lease");
			Reporter.log("To select value in LandDisposalMethod_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
		
		}
		
		public void toverifyMinimumLeaseLicensePeriod_Field() throws InterruptedException
		{
			HighlightOnElement(MinimumLeaseLicensePeriod_Field);
			Assert.assertNotNull(MinimumLeaseLicensePeriod_Field.isDisplayed(),"Test case pass");
			MinimumLeaseLicensePeriod_Field.sendKeys("20");
			Reporter.log("To send data in MinimumLeaseLicensePeriod_Field is successfully",true);
			waitForSomeTime();
			
		}
		
		public void toverifyLeaseLicenseExtendable_DropdownFunctionality() throws InterruptedException
		{
			HighlightOnElement(LeaseLicenseExtendable_Dropdown);
			Assert.assertNotNull(LeaseLicenseExtendable_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(LeaseLicenseExtendable_Dropdown, "Yes / हाँ");
			Reporter.log("To select value in LeaseLicenseExtendable_Dropdown is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
		
		}
		
		public void toverifyExtendibleTerm_Filed() throws InterruptedException
		{
			HighlightOnElement(ExtendibleTerm_Filed);
			Assert.assertNotNull(ExtendibleTerm_Filed.isDisplayed(),"Test case pass");
			ExtendibleTerm_Filed.sendKeys("5");
			Reporter.log("To send data in ExtendibleTerm_Filed is successfully",true);
			waitForSomeTime();
			
		}
		
		public void toverifyLicense_LeasePaymentMethod_dropdownFunctionality() throws InterruptedException
		{
			HighlightOnElement(License_LeasePaymentMethod_dropdown);
			Assert.assertNotNull(License_LeasePaymentMethod_dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(License_LeasePaymentMethod_dropdown, "Percentage");
			Reporter.log("To select value in License_LeasePaymentMethod_dropdown is successfully",true);
			waitForSomeTime();
			
		
		}
		
		public void toverifyLeaserent_LicenseFees_Field() throws InterruptedException
		{
			HighlightOnElement(Leaserent_LicenseFees_Field);
			Assert.assertNotNull(Leaserent_LicenseFees_Field.isDisplayed(),"Test case pass");
			Leaserent_LicenseFees_Field.sendKeys("5");
			Reporter.log("To send data in Leaserent_LicenseFees_Field is successfully",true);
			waitForSomeTime();
			
		}
		
		public void toverifyLeaserent_LicenseFeesPayable_dropdown() throws InterruptedException
		{
			HighlightOnElement(Leaserent_LicenseFeesPayable_dropdown);
			Assert.assertNotNull(Leaserent_LicenseFeesPayable_dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(Leaserent_LicenseFeesPayable_dropdown, "Monthly");
			Reporter.log("To select value in Leaserent_LicenseFeesPayable_dropdown is successfully",true);
			waitForSomeTime();
		}
		
		public void toverifyPenaltyofLeaaserentDelay_Field() throws InterruptedException
		{
			HighlightOnElement(PenaltyofLeaaserentDelay_Field);
			Assert.assertNotNull(PenaltyofLeaaserentDelay_Field.isDisplayed(),"Test case pass");
			PenaltyofLeaaserentDelay_Field.sendKeys("5");
			Reporter.log("To send data in PenaltyofLeaaserentDelay_Field is successfully",true);
			waitForSomeTime();
			
		}
		
		public void toverifyPenaltyPayable_dropdown() throws InterruptedException
		{
			HighlightOnElement(PenaltyPayable_dropdown);
			Assert.assertNotNull(PenaltyPayable_dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(PenaltyPayable_dropdown, "Monthly");
			Reporter.log("To select value in PenaltyPayable_dropdown is successfully",true);
			waitForSomeTime();
		}
		
		public void toverifySelectRule_dropdown() throws InterruptedException
		{
			HighlightOnElement(SelectRule_Dropdown);
			Assert.assertNotNull(SelectRule_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(SelectRule_Dropdown, "Rule 17");
			Reporter.log("To select value in SelectRule_Dropdown is successfully",true);
			waitForSomeTime();
			Thread.sleep(10000);
		}
		
		public void toverifyPenaltyComputation_dropdown() throws InterruptedException
		{
			HighlightOnElement(PenaltyComputation_Dropdown);
			Assert.assertNotNull(PenaltyComputation_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(PenaltyComputation_Dropdown, "Simple Interest");
			Reporter.log("To select value in PenaltyComputation_Dropdown is successfully",true);
			waitForSomeTime();
		}
		
		public void toverifyRemarks_Field() throws InterruptedException
		{
			HighlightOnElement(REMARKS_Field);
			Assert.assertNotNull(REMARKS_Field.isDisplayed(),"Test case pass");
			REMARKS_Field.sendKeys("Terms And Condition Accepted");
			Reporter.log("To send data in REMARKS_Field is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			
		}
		
		@FindBy(xpath="//a[contains(.,'Other Lease/License Terms & Condition')]/../../following-sibling::div/div[7]/span/center/table/tbody/tr/td/span/button[contains(.,'Next')]")
		private WebElement Next_Button6;
		
		public void toverifyNextButtonFunctionality6() throws InterruptedException
		{
			HighlightOnElement(Next_Button6);
			Assert.assertNotNull(Next_Button6.isDisplayed(),"Test case pass");
			Next_Button6.click();
			Reporter.log(" To Click on Next_Button6 Button successfully",true);
			waitForSomeTime();
			waitForelementPresent(TimeLineApplicationForm_Dropdown);
			
		}
		
		
		@FindBy(xpath="//a[contains(.,'Development Plan')]")
		private WebElement DevelopmentPlanTab;
		
		@FindBy(xpath="//span[contains(.,'Development Plan')]/../following-sibling::div[1]/div/table/thead/tr/td/div/div/label")
		private List<WebElement> DevelopmentPlanLabels;
		
		public void toverifyDevelopmentPlanTab() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(DevelopmentPlanTab);
			Assert.assertNotNull(DevelopmentPlanTab.isDisplayed(),"Test case pass");
			DevelopmentPlanTab.click();
			Reporter.log(" To Click DevelopmentPlanTab is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(MileStoneName_Field);
			for(WebElement menulist:DevelopmentPlanLabels)
			{
																																																																													HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					System.out.println(" Labels list in DevelopmentPlanLabels  are:"+Menu );
				}
			}
			
		}
		
		
		public void toclickDevelopmentPlanTab() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(DevelopmentPlanTab);
			Assert.assertNotNull(DevelopmentPlanTab.isDisplayed(),"Test case pass");
			DevelopmentPlanTab.click();
			Reporter.log(" To Click DevelopmentPlanTab is successfully",true);
			waitForSomeTime();
			waitForelementPresent(MileStoneName_Field);
		}
		
		@FindBy(xpath="//select[@title='Timeline Applicable From (T)']")
		private WebElement TimeLineApplicationForm_Dropdown;
		
		@FindBy(xpath="//input[@title='Milestone Name']")
		private WebElement MileStoneName_Field;
		
		@FindBy(xpath="//input[@title='Milestone Effective From']")
		private WebElement MileStoneEffctiveFrom_Field;
		
		@FindBy(xpath="//input[@title='Timelines (in Months)']")
		private WebElement Timelines_Field;
		
		@FindBy(xpath="//input[@title='No Of Extensions']")
		private WebElement NoOfExtensions_Field;
		
		@FindBy(xpath="//input[@title='Milestone Code(i.e. M1, M2)']")
		private WebElement MilestoneCode_Field;
		
		@FindBy(xpath="//select[@title='Extn. Block']")
		private WebElement ExtnBlock_Dropdown;
		
		@FindBy(xpath="//input[@title='Max Completion']")
		private WebElement MaxCompletion_Field;
		
		@FindBy(xpath="//button[contains(.,'Add / Update Penality Schedule')]")
		private WebElement Add_UpdatePenaltySchedule_Button;
		
		@FindBy(xpath="//button[contains(.,'Save Penality Schedule')]")
		private WebElement SavePenalityScheduleButton;
		
		
		public void tofillformasDevelopmentPlan() throws InterruptedException
		{
			
			
			HighlightOnElement(TimeLineApplicationForm_Dropdown);
			Assert.assertNotNull(TimeLineApplicationForm_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(TimeLineApplicationForm_Dropdown, "Date of Lease Agreement");
			Reporter.log("To select value in TimeLineApplicationForm_Dropdown is successfully",true);
			waitForSomeTime();
			Thread.sleep(10000);
			HighlightOnElement(MileStoneName_Field);
			Assert.assertNotNull(MileStoneName_Field.isDisplayed(),"Test case pass");
			MileStoneName_Field.sendKeys("NRDA Building");
			Reporter.log("To send data in MileStoneName_Field is successfully",true);
			waitForSomeTime();
			HighlightOnElement(Timelines_Field);
			Assert.assertNotNull(Timelines_Field.isDisplayed(),"Test case pass");
			Timelines_Field.sendKeys("50");
			Reporter.log("To send data in Timelines_Field is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(NoOfExtensions_Field);
			Assert.assertNotNull(NoOfExtensions_Field.isDisplayed(),"Test case pass");
			NoOfExtensions_Field.sendKeys("1");
			Reporter.log("To send data in NoOfExtensions_Field is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(MilestoneCode_Field);
			Assert.assertNotNull(MilestoneCode_Field.isDisplayed(),"Test case pass");
			MilestoneCode_Field.sendKeys("M1");
			Reporter.log("To send data in MilestoneCode_Field is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(ExtnBlock_Dropdown);
			Assert.assertNotNull(ExtnBlock_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(ExtnBlock_Dropdown, "Quarterly");
			Reporter.log("To select value in ExtnBlock_Dropdown is successfully",true);
			waitForSomeTime();
			Thread.sleep(10000);
			HighlightOnElement(Add_UpdatePenaltySchedule_Button);
			Assert.assertNotNull(Add_UpdatePenaltySchedule_Button.isDisplayed(),"Test case pass");
			Add_UpdatePenaltySchedule_Button.click();
			Reporter.log("To click in Add_UpdatePenaltySchedule_Button is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(SavePenalityScheduleButton);
			SavePenalityScheduleButton.click();
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(7000);
			HighlightOnElement(Next_Button7);
			Assert.assertNotNull(Next_Button7.isDisplayed(),"Test case pass");
			Next_Button7.click();
			Reporter.log(" To Click on Next_Button6 Button successfully",true);
			waitForSomeTime();
			waitForelementPresent(Applicableon_Dropdown);

			
			
			
		}
		
		
		public void toverifyTimeLineApplicationForm_Dropdown() throws InterruptedException
		{
			HighlightOnElement(TimeLineApplicationForm_Dropdown);
			Assert.assertNotNull(TimeLineApplicationForm_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(TimeLineApplicationForm_Dropdown, "Date of Lease Agreement");
			Reporter.log("To select value in TimeLineApplicationForm_Dropdown is successfully",true);
			waitForSomeTime();
			Thread.sleep(10000);
		}
		
		public void toverifyMileStoneName_Field() throws InterruptedException
		{
			HighlightOnElement(MileStoneName_Field);
			Assert.assertNotNull(MileStoneName_Field.isDisplayed(),"Test case pass");
			MileStoneName_Field.sendKeys("NRDA Building");
			Reporter.log("To send data in MileStoneName_Field is successfully",true);
			waitForSomeTime();
			
		}
		
		public void toverifyTimelines_Field() throws InterruptedException
		{
			HighlightOnElement(Timelines_Field);
			Assert.assertNotNull(Timelines_Field.isDisplayed(),"Test case pass");
			Timelines_Field.sendKeys("50");
			Reporter.log("To send data in Timelines_Field is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			
		}
		
		public void toverifyNoOfExtensions_Field() throws InterruptedException
		{
			HighlightOnElement(NoOfExtensions_Field);
			Assert.assertNotNull(NoOfExtensions_Field.isDisplayed(),"Test case pass");
			NoOfExtensions_Field.sendKeys("1");
			Reporter.log("To send data in NoOfExtensions_Field is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			
		}
		
		public void toverifyMilestoneCode_Field() throws InterruptedException
		{
			HighlightOnElement(MilestoneCode_Field);
			Assert.assertNotNull(MilestoneCode_Field.isDisplayed(),"Test case pass");
			MilestoneCode_Field.sendKeys("M1");
			Reporter.log("To send data in MilestoneCode_Field is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			
		}
		
		public void toverifyExtnBlock_Dropdown() throws InterruptedException
		{
			HighlightOnElement(ExtnBlock_Dropdown);
			Assert.assertNotNull(ExtnBlock_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(ExtnBlock_Dropdown, "Quarterly");
			Reporter.log("To select value in ExtnBlock_Dropdown is successfully",true);
			waitForSomeTime();
			Thread.sleep(10000);
		}
		
		
		/*public void toverifyMaxCompletion_Field() throws InterruptedException
		{
			HighlightOnElement(MaxCompletion_Field);
			Assert.assertNotNull(MaxCompletion_Field.isDisplayed(),"Test case pass");
			MaxCompletion_Field.sendKeys("1");
			Reporter.log("To send data in MaxCompletion_Field is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			
		}*/
		
		

		public void toverifyAdd_UpdatePenaltySchedule_Button() throws InterruptedException
		{
			HighlightOnElement(Add_UpdatePenaltySchedule_Button);
			Assert.assertNotNull(Add_UpdatePenaltySchedule_Button.isDisplayed(),"Test case pass");
			Add_UpdatePenaltySchedule_Button.click();
			Reporter.log("To click in Add_UpdatePenaltySchedule_Button is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(SavePenalityScheduleButton);
			SavePenalityScheduleButton.click();
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(7000);
			
			
		}
		
		@FindBy(xpath="//a[contains(.,'Development Plan')]/../../following-sibling::div/div[8]/span/center/table/tbody/tr/td/span/button[contains(.,'Next')]")
		private WebElement Next_Button7;
		
		@FindBy(xpath="//a[contains(.,'Development Plan')]/../../following-sibling::div/div[8]/table/tbody/tr/td/div/div[3]/center/button[contains(.,'Add More')]")
		private WebElement AddMore_Button4;
		
		@FindBy(xpath="(//input[@title='Milestone Name'])[2]")
		private WebElement MileStoneName_Field1;
		
		@FindBy(xpath="(//input[@title='Milestone Effective From'])[2]")
		private WebElement MileStoneEffctiveFrom_Field1;
		
		@FindBy(xpath="(//input[@title='Timelines (in Months)'])[2]")
		private WebElement Timelines_Field1;
		
		@FindBy(xpath="(//input[@title='No Of Extensions'])[2]")
		private WebElement NoOfExtensions_Field1;
		
		@FindBy(xpath="(//input[@title='Milestone Code(i.e. M1, M2)'])[2]")
		private WebElement MilestoneCode_Field1;
		
		@FindBy(xpath="(//select[@title='Extn. Block'])[2]")
		private WebElement ExtnBlock_Dropdown1;
		
		@FindBy(xpath="(//input[@title='Max Completion'])[2]")
		private WebElement MaxCompletion_Field1;
		
		@FindBy(xpath="(//button[contains(.,'Add / Update Penality Schedule')])[2]")
		private WebElement Add_UpdatePenaltySchedule_Button1;
		
		
		public void toverifyAddMoreButtonFunctionality4() throws InterruptedException
		{
			HighlightOnElement(AddMore_Button4);
			Assert.assertNotNull(AddMore_Button4.isDisplayed(),"Test case pass");
			AddMore_Button4.click();
			Reporter.log(" To Click on AddMore_Button  successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(MileStoneName_Field1);
			Assert.assertNotNull(MileStoneName_Field1.isDisplayed(),"Test case pass");
			Reporter.log("MileStoneName_Field1 is Present",true);
			HighlightOnElement(MileStoneEffctiveFrom_Field1);
			Assert.assertNotNull(MileStoneEffctiveFrom_Field1.isDisplayed(),"Test case pass");
			Reporter.log("MileStoneEffctiveFrom_Field1 is Present",true);
			HighlightOnElement(Timelines_Field1);
			Assert.assertNotNull(Timelines_Field1.isDisplayed(),"Test case pass");
			Reporter.log("Timelines_Field1 is Present",true);
			HighlightOnElement(NoOfExtensions_Field1);
			Assert.assertNotNull(NoOfExtensions_Field1.isDisplayed(),"Test case pass");
			Reporter.log("NoOfExtensions_Field1 is Present",true);
			HighlightOnElement(MilestoneCode_Field1);
			Assert.assertNotNull(MilestoneCode_Field1.isDisplayed(),"Test case pass");
			Reporter.log("MilestoneCode_Field1 is Present",true);
			HighlightOnElement(ExtnBlock_Dropdown1);
			Assert.assertNotNull(ExtnBlock_Dropdown1.isDisplayed(),"Test case pass");
			Reporter.log("ExtnBlock_Dropdown1 is Present",true);
			HighlightOnElement(MaxCompletion_Field1);
			Assert.assertNotNull(MaxCompletion_Field1.isDisplayed(),"Test case pass");
			Reporter.log("MaxCompletion_Field1 is Present",true);
			HighlightOnElement(Add_UpdatePenaltySchedule_Button1);
			Assert.assertNotNull(Add_UpdatePenaltySchedule_Button1.isDisplayed(),"Test case pass");
			Reporter.log("Add_UpdatePenaltySchedule_Button1 is Present",true);
		
		}
		
		
		public void toverifyNextButtonFunctionality7() throws InterruptedException
		{
			HighlightOnElement(Next_Button7);
			Assert.assertNotNull(Next_Button7.isDisplayed(),"Test case pass");
			Next_Button7.click();
			Reporter.log(" To Click on Next_Button6 Button successfully",true);
			waitForSomeTime();
			waitForelementPresent(Applicableon_Dropdown);
			
		}
		
		
		@FindBy(xpath="//a[contains(.,'Surrender/Withdrawal Condition')]")
		private WebElement SurrenderWithdrawalCondition;
		
		@FindBy(xpath="//span[contains(.,'Surrender / Withdraw Details')]/../following-sibling::div[1]/div/table/thead/tr/td/div/div/label")
		private List<WebElement> SurrenderWithdrawalConditionLAbels;
		
		
		public void toverifySurrenderWithdrawalConditionTab() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(SurrenderWithdrawalCondition);
			Assert.assertNotNull(SurrenderWithdrawalCondition.isDisplayed(),"Test case pass");
			SurrenderWithdrawalCondition.click();
			Reporter.log(" To Click SurrenderWithdrawalCondition is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(Applicableon_Dropdown);
			for(WebElement menulist:SurrenderWithdrawalConditionLAbels)
			{
																																																																													HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					System.out.println(" Labels list in SurrenderWithdrawalConditionLAbels  are:"+Menu );
				}
			}
			
		}
		
		@FindBy(xpath="(//select[@title='Applicable On'])[1]")
		private WebElement Applicableon_Dropdown;
		
		@FindBy(xpath="(//select[@title='Applicable On'])[2]")
		private WebElement Applicableon_Dropdown1;
		
		@FindBy(xpath="(//select[@title='Applicable On'])[3]")
		private WebElement Applicableon_Dropdown2;
		
		@FindBy(xpath="(//input[@title='Deduction (in %)'])[1]")
		private WebElement Deduction_Field;
		
		@FindBy(xpath="(//input[@title='Deduction (in %)'])[2]")
		private WebElement Deduction_Field1;
		
		@FindBy(xpath="(//input[@title='Deduction (in %)'])[3]")
		private WebElement Deduction_Field2;
		
		
		public void tpFilltheSurrenderForm() throws InterruptedException
		{
			
			HighlightOnElement(Applicableon_Dropdown);
			Assert.assertNotNull(Applicableon_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(Applicableon_Dropdown, "Security Deposit");
			Reporter.log("To select value in Applicableon_Dropdown is successfully",true);
			waitForSomeTime();
			
			HighlightOnElement(Deduction_Field);
			Assert.assertNotNull(Deduction_Field.isDisplayed(),"Test case pass");
			Deduction_Field.sendKeys("10");
			Reporter.log("To send data in Deduction_Field is successfully",true);
			waitForSomeTime();
			
			HighlightOnElement(Applicableon_Dropdown1);
			Assert.assertNotNull(Applicableon_Dropdown1.isDisplayed(),"Test case pass");
			SelectVisibleText(Applicableon_Dropdown1, "Security Deposit");
			Reporter.log("To select value in Applicableon_Dropdown1 is successfully",true);
			waitForSomeTime();
			
			HighlightOnElement(Deduction_Field1);
			Assert.assertNotNull(Deduction_Field1.isDisplayed(),"Test case pass");
			Deduction_Field1.sendKeys("10");
			Reporter.log("To send data in Deduction_Field is successfully",true);
			waitForSomeTime();
			
			HighlightOnElement(Applicableon_Dropdown2);
			Assert.assertNotNull(Applicableon_Dropdown2.isDisplayed(),"Test case pass");
			SelectVisibleText(Applicableon_Dropdown2, "Security Deposit");
			Reporter.log("To select value in Applicableon_Dropdown2 is successfully",true);
			waitForSomeTime();
			
			HighlightOnElement(Deduction_Field2);
			Assert.assertNotNull(Deduction_Field2.isDisplayed(),"Test case pass");
			Deduction_Field2.sendKeys("10");
			Reporter.log("To send data in Deduction_Field is successfully",true);
			waitForSomeTime();
		
		}
		
		
		@FindBy(xpath="//a[contains(.,'Surrender/Withdrawal Condition')]/../../following-sibling::div/div[9]/span/center/table/tbody/tr/td/span/button[contains(.,'Next')]")
		private WebElement Next_Button8;
		
		
		
		public void toverifyNextButtonFunctionality8() throws InterruptedException
		{
			HighlightOnElement(Next_Button8);
			Assert.assertNotNull(Next_Button8.isDisplayed(),"Test case pass");
			Next_Button8.click();
			Reporter.log(" To Click on Next_Button8 Button successfully",true);
			waitForSomeTime();
			waitForelementPresent(Draftbooklet_Upload);
			
		}
		
		
		@FindBy(xpath="//a[contains(.,'Supporting Documents')]")
		private WebElement SupportingDocuments;
		
		@FindBy(xpath="//a[contains(.,'Supporting Documents')]/../../following-sibling::div/div[10]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
		private List<WebElement> SupportingDocumentsLabels;
		
		
		public void toverifySupportingDocumentsTab() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(SupportingDocuments);
			Assert.assertNotNull(SupportingDocuments.isDisplayed(),"Test case pass");
			SupportingDocuments.click();
			Reporter.log(" To Click SupportingDocuments is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(Draftbooklet_Upload);
			for(WebElement menulist:SupportingDocumentsLabels)
			{
																																																																													HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					System.out.println(" Labels list in SupportingDocumentsLabels  are:"+Menu );
				}
			}
			
		}
		
		
		public void toclickSupportingDocumentsTab() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(SupportingDocuments);
			Assert.assertNotNull(SupportingDocuments.isDisplayed(),"Test case pass");
			SupportingDocuments.click();
			Reporter.log(" To Click SupportingDocuments is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(Draftbooklet_Upload);
			
		}
		
		@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[1]/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/span/div/div[1]/label")
		private WebElement Draftbooklet_Upload;
		
		@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[1]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/span/div/div[1]/label")
		private WebElement Layout_Upload;
		
		@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[2]/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/span/div/div[1]/label")
		private WebElement TenderDocument_Upload;
		
		
		public void touploadAllSupportingDocuments() throws AWTException, InterruptedException
		{
			
			Assert.assertEquals(true,Draftbooklet_Upload.isEnabled());
			HighlightOnElement(Draftbooklet_Upload);
			Draftbooklet_Upload.click();
			waitForSomeTime();
			UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
			Reporter.log(" Upload Document on DraftBooklet Successfully",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(10000);
			
			Assert.assertEquals(true,Layout_Upload.isEnabled());
			HighlightOnElement(Layout_Upload);
			Layout_Upload.click();
			waitForSomeTime();
			UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
			Reporter.log(" Upload Document on Layout Successfully",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(10000);
			
			Assert.assertEquals(true,TenderDocument_Upload.isEnabled());
			HighlightOnElement(TenderDocument_Upload);
			TenderDocument_Upload.click();
			waitForSomeTime();
			UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
			Reporter.log(" Upload Document on TenderDocument_Upload Successfully",true); //print for eclipse console 
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(10000);
			
			HighlightOnElement(Next_Button9);
			Assert.assertNotNull(Next_Button9.isDisplayed(),"Test case pass");
			Next_Button9.click();
			Reporter.log(" To Click on Next_Button Button successfully",true);
			waitForSomeTime();
			waitForelementPresent(RequiredDocument_Dropdown);
			
			
		}
		
		public void toverifyuploadDocumentDraftBooklet() throws InterruptedException, AWTException
		{
		
		Assert.assertEquals(true,Draftbooklet_Upload.isEnabled());
		HighlightOnElement(Draftbooklet_Upload);
		Draftbooklet_Upload.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		Reporter.log(" Upload Document on DraftBooklet Successfully",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(10000);
		}
		
		public void toverifyuploadDocumentLayout() throws InterruptedException, AWTException
		{
		
		Assert.assertEquals(true,Layout_Upload.isEnabled());
		HighlightOnElement(Layout_Upload);
		Layout_Upload.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		Reporter.log(" Upload Document on Layout Successfully",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(10000);
		}
		
		public void toverifyuploadDocumentTenderDocument() throws InterruptedException, AWTException
		{
		
		Assert.assertEquals(true,TenderDocument_Upload.isEnabled());
		HighlightOnElement(TenderDocument_Upload);
		TenderDocument_Upload.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur1.jpg");
		Reporter.log(" Upload Document on TenderDocument_Upload Successfully",true); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(10000);
		}
	
		
		@FindBy(xpath="//a[contains(.,'Supporting Documents')]/../../following-sibling::div/div[10]/span/center/table/tbody/tr/td/span/button[contains(.,'Next')]")
		private WebElement Next_Button9;
		
		public void toverifyNextButtonFunctionality9() throws InterruptedException
		{
			HighlightOnElement(Next_Button9);
			Assert.assertNotNull(Next_Button9.isDisplayed(),"Test case pass");
			Next_Button9.click();
			Reporter.log(" To Click on Next_Button Button successfully",true);
			waitForSomeTime();
			waitForelementPresent(RequiredDocument_Dropdown);
			
		}
		
		
		@FindBy(xpath="//a[contains(.,'Eligibility Check List')]")
		private WebElement EligibilityCheckListTab;
		
		@FindBy(xpath="//span[contains(.,'Eligibility Criteria')]/../following-sibling::div[1]/div/table/thead/tr/td/div/div/label")
		private List<WebElement> EligibilityCheckListLabels;
		
		public void toverifyEligibilityCheckListTab() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(EligibilityCheckListTab);
			Assert.assertNotNull(EligibilityCheckListTab.isDisplayed(),"Test case pass");
			EligibilityCheckListTab.click();
			Reporter.log(" To Click EligibilityCheckListTab is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(RequiredDocument_Dropdown);
			for(WebElement menulist:EligibilityCheckListLabels)
			{
																																																																													HighlightOnElement(menulist);
				Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
				if(menulist.isDisplayed())
				{
					String Menu=menulist.getText();
					System.out.println(" Labels list in EligibilityCheckListLabels  are:"+Menu );
				}
			}
			
		}
		
		
		public void toclickEligibilityCheckListTab() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(EligibilityCheckListTab);
			Assert.assertNotNull(EligibilityCheckListTab.isDisplayed(),"Test case pass");
			EligibilityCheckListTab.click();
			Reporter.log(" To Click EligibilityCheckListTab is successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForelementPresent(RequiredDocument_Dropdown);
		}
		
		@FindBy(xpath="//select[@title='Required Document']")
		private WebElement RequiredDocument_Dropdown;
		
		@FindBy(xpath="//select[@title='Required Document']")
		private WebElement Mandatory_Dropdown;
		
		@FindBy(xpath="//a[contains(.,'Eligibility Check List')]/../../following-sibling::div/div[11]/table/tbody/tr/td/div/div[3]/center/button[contains(.,'Add More')]")
		private WebElement AddMore_Button5;
		
		
		@FindBy(xpath="(//select[@title='Required Document'])[2]")
		private WebElement RequiredDocument_Dropdown1;
		
		@FindBy(xpath="(//select[@title='Required Document'])[2]")
		private WebElement Mandatory_Dropdown1;
		
		
		public void tofillformasElegibilitychecklist() throws InterruptedException
		{

			HighlightOnElement(RequiredDocument_Dropdown);
			Assert.assertNotNull(RequiredDocument_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(RequiredDocument_Dropdown, "ADDRESS ID PROOF");
			Reporter.log("To select value in RequiredDocument_Dropdown is successfully",true);
			waitForSomeTime();
			Thread.sleep(10000);
			HighlightOnElement(Mandatory_Dropdown);
			//Assert.assertNotNull(Mandatory_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(Mandatory_Dropdown, "Yes / हाँ");
			Reporter.log("To select value in Mandatory_Dropdown is successfully",true);
			waitForSomeTime();
			Thread.sleep(20000);
			
			
			
			
		}
		
		
		public void toverifyRequireddocument_Dropdown() throws InterruptedException
		{
			HighlightOnElement(RequiredDocument_Dropdown);
			Assert.assertNotNull(RequiredDocument_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(RequiredDocument_Dropdown, "ADDRESS ID PROOF");
			Reporter.log("To select value in RequiredDocument_Dropdown is successfully",true);
			waitForSomeTime();
			
		}
		
		public void toverifyMandatory_Field() throws InterruptedException
		{
			HighlightOnElement(Mandatory_Dropdown);
			Assert.assertNotNull(Mandatory_Dropdown.isDisplayed(),"Test case pass");
			SelectVisibleText(Mandatory_Dropdown, "Yes / हाँ");
			Reporter.log("To select value in Mandatory_Dropdown is successfully",true);
			waitForSomeTime();
			Thread.sleep(20000);
			
		}
		
		
		public void toverifyAddMoreButtonFunctionality5() throws InterruptedException
		{
			HighlightOnElement(AddMore_Button5);
			Assert.assertNotNull(AddMore_Button5.isDisplayed(),"Test case pass");
			AddMore_Button5.click();
			Reporter.log(" To Click on AddMore_Button  successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(RequiredDocument_Dropdown1);
			Assert.assertNotNull(RequiredDocument_Dropdown1.isDisplayed(),"Test case pass");
			Reporter.log("RequiredDocument_Dropdown1 is Present",true);
			
			HighlightOnElement(Mandatory_Dropdown);
			Assert.assertNotNull(Mandatory_Dropdown.isDisplayed(),"Test case pass");
			Reporter.log("Mandatory_Dropdown is Present",true);
		
		}
	
		@FindBy(xpath="//a[contains(.,'Eligibility Check List')]/../../following-sibling::div/div[11]/span/center/table/tbody/tr/td/span/button[contains(.,'Submit')]")
		private WebElement Submit_Button;
		
		@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td/div/div[3]/span")
		private WebElement SelectActionDropdownLink;
		
		
		@FindBy(xpath="//span[contains(.,'Basic Details')]/../following-sibling::div/table/tbody/tr[1]/td[2]/a")
		private WebElement ProjectNumber;
		
		public void toverifySubmitButtonFunctionality1() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
		{
			HighlightOnElement(Submit_Button);
			Assert.assertNotNull(Submit_Button.isDisplayed(),"Test case pass");
			Submit_Button.click();
			Reporter.log(" To Click on Submit_Button  successfully",true);
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			Thread.sleep(100000);
		    waitForelementPresent(ProjectNumber);
		    HighlightOnElement(ProjectNumber);
		    String ApllicationNumber=ProjectNumber.getText().trim();
			excel.updateExcelDataEstateProject(ApllicationNumber);
			waitForSomeTime();
		
		}
		
		@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[3]/span/table/tbody/tr/td/div/div[3]/span")
		private WebElement SelectUserDropdown;
		
		public void toverifyActionDropdownFunctionality() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(SelectActionDropdownLink);
			Assert.assertTrue(SelectActionDropdownLink.isEnabled(),"Test Case Pass: SelectActionDropdownLink");
			SelectActionDropdownLink.click();
			selectValueFromDropdown("Forward");
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			
		}
		
		public void toverifySelectuserDropdownFunctionality() throws InterruptedException
		{
			waitForSomeTime();
			HighlightOnElement(SelectUserDropdown);
			Assert.assertTrue(SelectUserDropdown.isEnabled(),"Test Case Pass: SelectActionDropdownLink");
			SelectUserDropdown.click();
			selectValueFromDropdown("Manish Mishra (MGR)");
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
		
		}
		
		
		@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[2]/tbody/tr/td[2]/input")
		private WebElement Subject_Field;
		
		@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[2]/tbody/tr[2]/td[2]/table/tbody/tr/td[1]/input")
		private WebElement FileNo_Field;
		
		@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr/td[2]/table/tbody/tr/td[2]/button[contains(.,'Search')]")
		private WebElement SearchButton_Fileno;
		
		@FindBy(xpath="//span[contains(.,'Search Action')]/../following-sibling::div/div/div/center/table/tbody/tr/td/button[contains(.,'Search')]")
		private WebElement SearchButton;
		
		@FindBy(xpath=".//*[@id='inboxForm:srchDlg']/div[1]/a/span")
		private WebElement ClosePopUpwindow1;
		
		@FindBy(xpath="//span[contains(.,'Search Action')]/../following-sibling::div/div/div/table/tbody/tr/td[3]/input")
		private WebElement Subject_FieldInpopup;
		
		@FindBy(xpath="//span[contains(.,'Search Action')]/../following-sibling::div/div/div/table/tbody/tr/td[6]/input")
		private WebElement File_FieldInpopup;
		
		@FindBy(xpath="(.//*[@id='inboxForm:searchdata_data']/tr/td[1]/div/div[2])[1]")
		private WebElement Checkbox1;
		
		@FindBy(xpath="//button[contains(.,'Fill In Form')]")
		private WebElement FillInForm_Button;
		
		
		
		
		
		
		public void toVerifyfunctionalitySubjectField() throws InterruptedException
		{
			
			HighlightOnElement(Subject_Field);
			Assert.assertTrue(Subject_Field.isEnabled(),"Test Case Pass: Subject_Field");
			VerifyTextFieldisEditable(Subject_Field);
		
		}
		
		public void toVerifyfunctionalityFileField() throws InterruptedException
		{
			
			HighlightOnElement(FileNo_Field);
			Assert.assertTrue(FileNo_Field.isEnabled(),"Test Case Pass: FileNo_Field");
			VerifyTextFieldisEditable(FileNo_Field);
		
		}
		
		
		public void toVerifySearchButtonfunctionality() throws InterruptedException
		{
			
			HighlightOnElement(SearchButton_Fileno);
			Assert.assertTrue(SearchButton_Fileno.isEnabled(),"Test Case Pass: FileNo_Field");
			SearchButton_Fileno.click();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			ClosePopUpwindow1.click();
			waitForSomeTime();
			waitForSomeTime();
		
		}
		
		public void toVerifysubjectfieldFunctionality() throws InterruptedException
		{
		
			HighlightOnElement(SearchButton_Fileno);
			Assert.assertTrue(SearchButton_Fileno.isEnabled(),"Test Case Pass: FileNo_Field");
			SearchButton_Fileno.click();
			waitForSomeTime();
			waitForelementPresent(Subject_FieldInpopup);
			HighlightOnElement(Subject_FieldInpopup);
			Assert.assertTrue(Subject_FieldInpopup.isEnabled(),"Test Case Pass: FileNo_Field");
			Subject_FieldInpopup.sendKeys("Project Creation");
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			ClosePopUpwindow1.click();
			waitForSomeTime();
			waitForSomeTime();
		}
		
		public void toVerifySerachButtonFunctionalityinPopup() throws InterruptedException
		{
		
			HighlightOnElement(SearchButton_Fileno);
			Assert.assertTrue(SearchButton_Fileno.isEnabled(),"Test Case Pass: FileNo_Field");
			SearchButton_Fileno.click();
			waitForSomeTime();
			waitForelementPresent(Subject_FieldInpopup);
			HighlightOnElement(Subject_FieldInpopup);
			Assert.assertTrue(Subject_FieldInpopup.isEnabled(),"Test Case Pass: FileNo_Field");
			Subject_FieldInpopup.sendKeys("Project Creation");
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(SearchButton);
			Assert.assertTrue(SearchButton.isEnabled(),"Test Case Pass: FileNo_Field");
			SearchButton.click();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			ClosePopUpwindow1.click();
			waitForSomeTime();
			waitForSomeTime();
			
			
		}
		
		public void toVerifyFileSelectableinPopup() throws InterruptedException
		{
		
			HighlightOnElement(SearchButton_Fileno);
			Assert.assertTrue(SearchButton_Fileno.isEnabled(),"Test Case Pass: FileNo_Field");
			SearchButton_Fileno.click();
			waitForSomeTime();
			waitForelementPresent(Subject_FieldInpopup);
			HighlightOnElement(Subject_FieldInpopup);
			Assert.assertTrue(Subject_FieldInpopup.isEnabled(),"Test Case Pass: FileNo_Field");
			Subject_FieldInpopup.sendKeys("Project Creation");
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(SearchButton);
			Assert.assertTrue(SearchButton.isEnabled(),"Test Case Pass: FileNo_Field");
			SearchButton.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(Checkbox1);
			Checkbox1.click();
			waitForSomeTime();
			waitForSomeTime();
			ClosePopUpwindow1.click();
			waitForSomeTime();
			waitForSomeTime();
			
			
		}
		
		
		public void toVerifyFillinformButtonFunctionalityinPopup() throws InterruptedException
		{
		
			HighlightOnElement(SearchButton_Fileno);
			Assert.assertTrue(SearchButton_Fileno.isEnabled(),"Test Case Pass: FileNo_Field");
			SearchButton_Fileno.click();
			waitForSomeTime();
			waitForelementPresent(Subject_FieldInpopup);
			HighlightOnElement(Subject_FieldInpopup);
			Assert.assertTrue(Subject_FieldInpopup.isEnabled(),"Test Case Pass: FileNo_Field");
			Subject_FieldInpopup.sendKeys("Project Creation");
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(SearchButton);
			Assert.assertTrue(SearchButton.isEnabled(),"Test Case Pass: FileNo_Field");
			SearchButton.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(Checkbox1);
			Checkbox1.click();
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(FillInForm_Button);
			FillInForm_Button.click();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			waitForSomeTime();
			
			
		}
		
		@FindBy(xpath="//span[@id='inboxForm:dynaFormGroup']/div/div/center/button[contains(.,'Submit')]")
		private WebElement SubmitButton;
		
		@FindBy(xpath="//span[@id='inboxForm:dynaFormGroup']/div/div/center/button[contains(.,'Close')]")
		private WebElement CloseButton;
		
		@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[2]/tbody/tr[3]/td[2]/textarea")
		private WebElement EnterCommentsField;
		
		@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[2]/tbody/tr[4]/td[2]/table/tbody/tr/td/div/div[1]/label")
		private WebElement UploadButton;
		
		@FindBy(xpath=".//*[@id='inboxForm:msg_container']/div/div/div[2]/span")
		private WebElement PopUpMsg;
		
		
		public void toverifyEnterCommentsFieldisBlank() throws InterruptedException
		{
			HighlightOnElement(EnterCommentsField);
			Assert.assertTrue(EnterCommentsField.isEnabled(),"Test Case Pass: EnterCommentsField");
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(SubmitButton);
			SubmitButton.click();
			waitForSomeTime();
			waitForSomeTime();
			String ActualMessage=PopUpMsg.getText();
			String ExpectedMessage="Comments is required !";
			Assert.assertEquals(ActualMessage, ExpectedMessage);
			waitForSomeTime();
			waitForSomeTime();
	
		}
		
		public void toverifyEnterCommentsField() throws InterruptedException
		{
			HighlightOnElement(EnterCommentsField);
			Assert.assertTrue(EnterCommentsField.isEnabled(),"Test Case Pass: EnterCommentsField");
			waitForSomeTime();
			waitForSomeTime();
			EnterCommentsField.sendKeys("Project Creation Request Forwarded to ");
			waitForSomeTime();
			waitForSomeTime();
	
		}
		
		public void toverifyinvalidUploaddocumentfield() throws AWTException, InterruptedException
		{
			
			HighlightOnElement(UploadButton);
			UploadButton.click();
			waitForSomeTime();
			UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\TestData.txt"); 
			waitForSomeTime();
			waitForSomeTime();
			HighlightOnElement(PopUpMsg);
			String ActualMessage=PopUpMsg.getText();
			String ExpectedMessage="Upload only jpg, png or pdf file";
			Assert.assertEquals(ActualMessage, ExpectedMessage);
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
			waitForelementPresent(EnterApplicationNumber_Field);
			
			
		}
		
		
		
	
	}
		
