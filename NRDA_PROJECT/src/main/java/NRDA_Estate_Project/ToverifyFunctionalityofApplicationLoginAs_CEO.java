package NRDA_Estate_Project;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

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

public class ToverifyFunctionalityofApplicationLoginAs_CEO extends CommonLibrary {
	
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
	
	@FindBy(xpath="//div[contains(.,' Estate & Project Section')]/../following-sibling::div/div[1]/div[2]/span")
	private WebElement MyInboxLink;
	
	
	@FindBy(xpath="//a[contains(.,'Estate & Project Section')]")
	private WebElement EstateAndProjectSectionLink;
	
	@FindBy(xpath="//a[contains(.,'Estate & Project Section')]/../following-sibling::div/ul/li/a/span[contains(.,'NEW PROJECT CREATION')]")
	private WebElement NewProjectCreationLink;
	
	@FindBy(xpath="//span[contains(.,'Applications List')]/../following-sibling::div[1]/div/h3/a[contains(.,'New Project Creation')]/../following-sibling::div/div/div/div/div[2]/table/thead/tr/th/span")
	private List <WebElement> PendingApplicationLabels1;
	
	@FindBy(xpath="//span[contains(.,'Applications List')]/../following-sibling::div[1]/div/h3/a[contains(.,'New Project Creation')]/../following-sibling::div/div/div/div/div[2]/table/thead/tr/th[2]/input")
	private WebElement ApplicationNo_Field;
	
	@FindBy(xpath="//img[@src='/NRDAuthorityPreUAT/resources/images/view-new.png']")
	private WebElement Action_Button;
	
	
	
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'NEW PROJECT CREATION')]/../following-sibling::div/div/div/div/div[1]/table/thead/tr/th/span")
	private List <WebElement> PendingApplicationLabels;
	
	
	
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'NEW PROJECT CREATION')]/../following-sibling::div/div/div/div/div[1]/table/thead/tr/th[2]/input")
	private WebElement ApplicationNo_Field1;
	
	
	
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'NEW PROJECT CREATION')]/../following-sibling::div/div/div/div/div[1]/table/tbody/tr/td[7]/center/a/img[@src='/NRDAuthorityPreUAT/resources/images/view-new.png']")
	private WebElement Action_Button1;
	
	@FindBy(xpath=".//*[@id='inboxForm:showStatusApplication']/div[1]/a/span")
	private WebElement ClosePopup;
	
	
	public void toverifyPendingApplication() throws InterruptedException
	{
		HighlightOnElement(EstateAndProjectSectionLink);
		Assert.assertNotNull(EstateAndProjectSectionLink.isDisplayed(),"Test case pass");
		EstateAndProjectSectionLink.click();
		Reporter.log("To Click on EstateAndProjectSectionLink is Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(NewProjectCreationLink);
		NewProjectCreationLink.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		for(WebElement menulist:PendingApplicationLabels1)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" PendingApplicationLabels are:"+Menu );
			}

		}
		
		waitForSomeTime();
	
	}
	
	public void toverifyActionButtonagainsttheApplication1() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(EstateAndProjectSectionLink);
		Assert.assertNotNull(EstateAndProjectSectionLink.isDisplayed(),"Test case pass");
		EstateAndProjectSectionLink.click();
		Reporter.log("To Click on EstateAndProjectSectionLink is Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(NewProjectCreationLink);
		NewProjectCreationLink.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(ApplicationNo_Field);
		excel.getExcelData(ApplicationNo_Field, "Estate_Application_Number", 0, 1);
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Action_Button);
		Assert.assertNotNull(Action_Button.isDisplayed(),"Test case pass");
		Action_Button.click();
		Reporter.log("To Click on Action_Button is Successfully",true);
		waitForSomeTime();
		Thread.sleep(10000);
		
		
		
	}
	
	public void toverifyMyInboxlink() throws InterruptedException
	{
		HighlightOnElement(MyInboxLink);
		Assert.assertNotNull(MyInboxLink.isDisplayed(),"Test case pass");
		MyInboxLink.click();
		Reporter.log("To Click on MyInboxLink is Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		ScroolDown();
		
		HighlightOnElement(NewProjectCreation_Link);
		NewProjectCreation_Link.click();
		waitForSomeTime();
		ScroolDown();
		ScroolDown();
		waitForSomeTime();
		for(WebElement menulist:PendingApplicationLabels)
		{
			HighlightOnElement(menulist);
			Assert.assertNotNull(menulist.isDisplayed(),"Test case pass");
			if(menulist.isDisplayed())
			{
				String Menu=menulist.getText();
				System.out.println(" PendingApplicationLabels are:"+Menu );
			}

		}
		
		ScroolUp();
		ScroolUp();
		HighlightOnElement(ClosePopup);
		ClosePopup.click();
		waitForSomeTime();
	
	}
	
	@FindBy(xpath="//span[contains(.,'Application')]/../following-sibling::div[1]/div/h3/a[contains(.,'NEW PROJECT CREATION')]")
	private WebElement NewProjectCreation_Link;
	
	
	
	
	
	
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
		waitForSomeTime();
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
	
	
	@FindBy(xpath="//button[contains(.,'Print')]")
	private WebElement PrintButton;
	

	public void toverifyPrintButtonFunctionality() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		Thread.sleep(5000);
		ScroolDown();
		ScroolDown();
		ScroolDown();
		ScroolDown();
		HighlightOnElement(PrintButton);
		Assert.assertNotNull(PrintButton.isDisplayed(),"Test case pass");
		PrintButton.click();
		Reporter.log("To Click on PrintButton is Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
	}
	

	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td/div/div[3]/span")
	private WebElement SelectActionDropdownLink;
	
	public void toverifyActionDropdownFunctionality() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(SelectActionDropdownLink);
		Assert.assertTrue(SelectActionDropdownLink.isEnabled(),"Test Case Pass: SelectActionDropdownLink");
		SelectActionDropdownLink.click();
		selectValueFromDropdown("Approved");
		Reporter.log("To select value in dropdown Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[3]/span/table/tbody/tr[2]/td/div/div[3]/span")
	private WebElement SelectUser_Dropdown;
	
	public void toverifySelectUserFunctionality() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(SelectUser_Dropdown);
		Assert.assertTrue(SelectUser_Dropdown.isEnabled(),"Test Case Pass: SelectUser_Dropdown");
		SelectUser_Dropdown.click();
		selectValueFromDropdown("Mukesh Bansal (CEO)");
		Reporter.log("To select value in dropdown Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[2]/tbody/tr[6]/td/textarea")
	private WebElement EnterCommentsField;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[2]/tbody/tr[8]/td/table/tbody/tr/td/div/div[1]/label")
	private WebElement UploadButton;
	
	@FindBy(xpath=".//*[@id='inboxForm:msg_container']/div/div/div[2]/span")
	private WebElement PopUpMsg;
	
	@FindBy(xpath="//span[@id='inboxForm:dynaFormGroup']/div/div/center/button[contains(.,'Submit')]")
	private WebElement SubmitButton;
	
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
		EnterCommentsField.sendKeys("Project Creation Request  Forward to CEO ");
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
		Thread.sleep(80000);
		//waitForelementPresent(EnterApplicationNumber_Field);
		
		
	}
	
	@FindBy(xpath="//span[contains(.,'Applications List')]/../following-sibling::div[1]/div/h3/a[contains(.,'New Project Creation')]/../following-sibling::div/div/div/div")
	private WebElement ApplicationGrid;
	
	public void toverifyApplicationGridintheApplication1() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(EstateAndProjectSectionLink);
		Assert.assertNotNull(EstateAndProjectSectionLink.isDisplayed(),"Test case pass");
		EstateAndProjectSectionLink.click();
		Reporter.log("To Click on EstateAndProjectSectionLink is Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(NewProjectCreationLink);
		NewProjectCreationLink.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(ApplicationNo_Field);
		excel.getExcelData(ApplicationNo_Field, "Estate_Application_Number", 0, 1);
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(ApplicationGrid);
		Assert.assertNotNull(ApplicationGrid.isDisplayed(),"Test case pass");
		waitForSomeTime();
		
	}
	
	
	@FindBy(xpath="//a[contains(.,'Publish')]")
	private WebElement PublishTab;
	
	@FindBy(xpath="//a[contains(.,'Publish')]/../../following-sibling::div/div[14]/table[1]/tbody/tr/td/textarea")
	private WebElement RemarksTextfiled;
	
	@FindBy(xpath="//a[contains(.,'Publish')]/../../following-sibling::div/div[14]/table[2]/tbody/tr[1]/td[2]/div/div[1]/label")
	private WebElement UploadBtn;
	
	@FindBy(xpath="//button[contains(.,'Publish')]")
	private WebElement PublishButton;
	
	
	public void toverifyPublishTabFunctionality() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		HighlightOnElement(PublishTab);
		Assert.assertNotNull(PublishTab.isDisplayed(),"Test case pass");
		PublishTab.click();
		Reporter.log("To Click on PublishTab is Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(RemarksTextfiled);
	}
	
	public void toverifyRemarksFieldFunctionality() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		HighlightOnElement(RemarksTextfiled);
		Assert.assertNotNull(RemarksTextfiled.isDisplayed(),"Test case pass");
		RemarksTextfiled.sendKeys("Project creation request publish after CEO approval");
		Reporter.log("To send data on RemarksTextfiled is Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	public void toverifyinvalidUploaddocumentfield1() throws AWTException, InterruptedException
	{
		
		HighlightOnElement(UploadBtn);
		UploadBtn.click();
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
	
	
	public void toverifyUploaddocumentfield1() throws AWTException, InterruptedException
	{
		
		HighlightOnElement(UploadBtn);
		UploadBtn.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		System.out.println("Upload Document Successfully" ); //print for eclipse console 
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	
	}
	
	
	public void toverifyPublishFunctionality() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		
		HighlightOnElement(PublishButton);
		Assert.assertNotNull(PublishButton.isDisplayed(),"Test case pass");
		PublishButton.click();
		Reporter.log("To Click on PublishButton is Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		Thread.sleep(60000);
	}
	
	
	
	
	
}
	
	
