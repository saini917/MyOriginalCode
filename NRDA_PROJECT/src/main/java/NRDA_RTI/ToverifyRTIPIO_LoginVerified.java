/**
 * 
 */
package NRDA_RTI;

import java.awt.AWTException;
import java.io.IOException;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import org.testng.Reporter;
import GenericLibrary.ExcelDataDriver;
import GenericLibrary.CommonLibrary;

/**
 * @author Sarvesh.Nellore
 * @Date: 02-11-2017
 * @Purpose: RTI Verify Login As  Verified
 */
public class ToverifyRTIPIO_LoginVerified extends CommonLibrary
{
	
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[2]")
	private WebElement PendingApplication_Icon;
	
	@FindBy(xpath="//span[contains(.,'Applications List')]/../following-sibling::div/div[1]/div/table/tbody/tr/td/input")
	private WebElement entervalueinsearchbox;
	
	@FindBy(xpath="//button/span[contains(text(),'Search')]")
	private WebElement searchbtn;
	
	@FindBy(xpath="//img[@src='/NRDAuthority1/resources/images/view-new.png']")
	private  WebElement actionbtn1;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div/div[2]/ul/li[4]/a")
	private WebElement rti_information;
	
	@FindBy(xpath="//button[contains(.,'Citizen Answer')]")
	private WebElement Citizen_Answer;
	
	@FindBy(xpath="//button[contains(.,'Send to Applicant')]")
	private WebElement Sendto_Applicant;
	
	
	public void toverifyByClickingCitizenAnswerButtonFunctionality_SC_15_TC_03() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	
	HighlightOnElement(PendingApplication_Icon);
	Assert.assertTrue(PendingApplication_Icon.isEnabled(),"Test Case PAss");
	PendingApplication_Icon.click();
	waitForSomeTime();
	waitForSomeTime();
	Reporter.log("Expected result:click on PendingApplication Link",true);
	HighlightOnElement(entervalueinsearchbox);
	waitForelementPresent(entervalueinsearchbox);
	//String Validnumber=ApplicationNumber.getText();
	String validnumber=excel.getExcelData(entervalueinsearchbox, "RTIApplication Number",0, 1);
	Reporter.log("Valid Application Number:"+validnumber,true);
	//	entervalueinsearchbox.sendKeys(Validnumber);
	waitForSomeTime();
	HighlightOnElement(searchbtn);
	searchbtn.click();
	waitForSomeTime();
	HighlightOnElement(actionbtn1);
	actionbtn1.click();
	waitForSomeTime();
	
	HighlightOnElement(rti_information);
	waitForSomeTime();
	Assert.assertTrue(rti_information.isEnabled(),"Test Case PAss");
	rti_information.click();
	waitForSomeTime();
	waitForSomeTime();
	Reporter.log("Expected result:click on rti_information Link",true);
	
	
	
	}
	
	
	public void toverifyByClickingCitizenAnswerButtonFunctionality() throws InterruptedException
	{
		
		HighlightOnElement(Citizen_Answer);
		waitForSomeTime();
		Assert.assertTrue(Citizen_Answer.isEnabled(),"Test Case PAss");
		Citizen_Answer.click();
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("Expected result:click on Citizen_Answer Link",true);
		waitForSomeTime();
		waitForSomeTime();
		
		
	}
	
	public void toverifyByClickingSendtoApplicantButtonFunctionality_SC_15_TC_02() throws InterruptedException
	{
		
		HighlightOnElement(Sendto_Applicant);
		waitForSomeTime();
		Assert.assertTrue(Sendto_Applicant.isEnabled(),"Test Case PAss");
		Sendto_Applicant.click();
		Reporter.log("Expected result:click on Sendto_Applicant Link",true);
		
	}
	
	public void toverifyByClickingDemandNoteButtonFunctionality_SC_15_TC_05() throws InterruptedException
	{
		
		HighlightOnElement(DemandNoteButton);
		waitForSomeTime();
		Assert.assertTrue(DemandNoteButton.isEnabled(),"Test Case PAss");
		DemandNoteButton.click();
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("Expected result:click on Sendto_Applicant Link",true);
		
	}
	
	
	@FindBy(xpath=".//*[@id='inboxForm:msg_container']/div/div/div[2]/span")
	private WebElement ErrorMessag_Popup;
	
	@FindBy(xpath="(//button[contains(.,'Submit')])[2]")
	private WebElement SubmitButton;
	
	
	@FindBy(xpath="//button[contains(.,'Demand Note')]")
	private WebElement DemandNoteButton;
	
	
	
	
	public void toVerifyErrorMessage() throws InterruptedException
	{
		waitForSomeTime();
		HighlightOnElement(ErrorMessag_Popup);
		String Expected_Message="Department answer verified !";
		String Actual_Message=ErrorMessag_Popup.getText();
		Assert.assertEquals(Expected_Message, Actual_Message);
		waitForSomeTime();
		waitForSomeTime();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,450)", "");
		waitForSomeTime();
		HighlightOnElement(SubmitButton);
		SubmitButton.click();
	
	}
	
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[2]/select")
	private WebElement clickonselectactiondrop;
	
	
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[4]/div[2]/center/table/tbody/tr/td[2]/textarea")
	private WebElement entercommentbox;
	
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[4]/div[2]/center/table[2]/tbody/tr[2]/td[1]/span")
	private WebElement uploaddocumentlabel;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[4]/td[2]/table/tbody/tr/td/div/div[1]/label")
	private WebElement uploaddocument;
	
	public void toverifySubmitFunctionalitywithActionAsApprove_SC_09_TC_15() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		waitForSomeTime();
		

		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"Test Case PAss");
		PendingApplication_Icon.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForelementPresent(entervalueinsearchbox);
		Reporter.log("Expected result:click on PendingApplication Link",true);



		HighlightOnElement(entervalueinsearchbox);

		//String Validnumber=ApplicationNumber.getText();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "RTIApplication Number",0, 1);
		Reporter.log("Valid Application Number:"+validnumber,true);
	//	entervalueinsearchbox.sendKeys(Validnumber);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		HighlightOnElement(actionbtn1);
		actionbtn1.click();
		waitForSomeTime();

		HighlightOnElement(clickonselectactiondrop);
		SelectVisibleText(clickonselectactiondrop, "Approve");
	
		waitForSomeTime();
		waitForSomeTime();
		//ToverifySubjectandFileNoFields();
		waitForSomeTime();
		HighlightOnElement(entercommentbox);
		//excel.getExcelData(entercommentbox, "RTIApplication Number",0, 7);
		entercommentbox.sendKeys("Approved");
		waitForSomeTime();
		HighlightOnElement(uploaddocument);
		uploaddocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		waitForSomeTime();

		waitForSomeTime();
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,250)", "");
		HighlightOnElement(Submit_Button);
		waitForSomeTime();
		Submit_Button.click();
		Reporter.log("click on Submit button succesfully",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
	
	
}
	
	@FindBy(xpath="(//button[contains(.,'Submit') and@role='button'])[1]")
	private WebElement Submit_Button;
}
