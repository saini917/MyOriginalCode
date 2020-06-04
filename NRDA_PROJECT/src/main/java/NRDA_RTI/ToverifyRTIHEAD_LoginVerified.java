package NRDA_RTI;

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
import org.testng.Assert;
import org.testng.Reporter;


import GenericLibrary.ExcelDataDriver;
import GenericLibrary.CommonLibrary;


/**
 * @author Sarvesh.Nellore
 * @Date: 02-11-2017
 * @Purpose: ONLINE RTI HEAD Login Verified
 */ 
public class ToverifyRTIHEAD_LoginVerified  extends CommonLibrary
{
	
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[1]")
	private WebElement Home_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[2]")
	private WebElement PendingApplication_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[3]")
	private WebElement ApproveorRejectApplication_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[11]")
	private WebElement PaymentCollection_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[14]")
	private WebElement ApplicationForm_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[15]")
	private WebElement MisReport_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[19]")
	private WebElement MeetingManagement_Icon;
	
	
	@FindBy(xpath=".//*[@id='inboxForm:growl_container']/div/div/div[2]/span")
	private WebElement getmessage;
	
	@FindBy(xpath=".//*[@id='inboxForm:growl_container']/div/div/div[2]/span")
	private WebElement getmessage1;
	
	@FindBy(xpath="//span[contains(.,'Applications List')]/../following-sibling::div/div[1]/div/table/tbody/tr/td/input")
	private WebElement entervalueinsearchbox;

	@FindBy(xpath="//button/span[contains(text(),'Search')]")
	private WebElement searchbtn;
	
	public void toVerifyActionFunctionWithValidData_SC_11_TC_11() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
	HighlightOnElement(PendingApplication_Icon);
	PendingApplication_Icon.click();
	waitForSomeTime();
	waitForelementPresent(entervalueinsearchbox);
	waitForSomeTime();
	waitForelementPresent(entervalueinsearchbox);
	HighlightOnElement(entervalueinsearchbox);
	//String Validnumber=ApplicationNumber.getText();
	String validnumber=excel.getExcelData(entervalueinsearchbox, "RTIApplication Number",0, 1);
	Reporter.log("Valid Application Number:"+validnumber,true);
	waitForSomeTime();
	HighlightOnElement(searchbtn);
	searchbtn.click();
	waitForSomeTime();
	
	}
	
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[4]/div[2]/center/table/tbody/tr/td/div/div/label")
	private List<WebElement> commentlabel;
	
	@FindBy(xpath="//img[@src='/NRDAuthority/resources/images/view-new.png']")
	private  WebElement actionbtn1;
	
	@FindBy(xpath="//div[@role='tabpanel']/div/div[1]/table")
	private WebElement PendingApplication_Grid;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[2]/select")
	private WebElement clickonselectactiondrop;
	
	public void toVerifySubmitbuttonFunctionalityWithActionFieldISBlank_SC_09_TC_12() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{

		waitForSomeTime();
		HighlightOnElement(actionbtn1);
		actionbtn1.click();
		waitForSomeTime();
		HighlightOnElement(clickonselectactiondrop);
		
	}
	
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[4]/div[2]/center/table/tbody/tr/td[2]/textarea")
	private WebElement entercommentbox;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[4]/td[2]/table/tbody/tr/td/div/div[1]/label")
	private WebElement uploaddocument;
	
	
	public void toverifythefunctionalityofForward_SC_11_TC_14() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		waitForSomeTime();
		HighlightOnElement(clickonselectactiondrop);
		/*clickonselectactiondrop.click();

		for(int i=0;i<selectdropdownvalue.size();i++)
		{
			String value=selectdropdownvalue.get(i).getText();
			if(value.equalsIgnoreCase("Forward"))
			{
				selectdropdownvalue.get(i).click();
				waitForSomeTime();
			}
		}*/
		
		SelectVisibleText(clickonselectactiondrop, "Verified");
		waitForSomeTime();
		
		HighlightOnElement(entercommentbox);
		//excel.getExcelData(entercommentbox, "RTIApplication Number", 0, 11);
		entercommentbox.sendKeys("Verified");
		waitForSomeTime();
		HighlightOnElement(uploaddocument);
		uploaddocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		waitForSomeTime();
		
	}
	
	
	@FindBy(xpath="(//button[contains(.,'Submit') and@role='button'])[1]")
	private WebElement Submit_Button;
	
	
	public void toVerifySubmitbuttonFunctionalityWithActionFieldISBlank() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Submit_Button);
		Assert.assertEquals(Submit_Button.isEnabled(),true);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		waitForSomeTime();
		Submit_Button.click();
		Reporter.log("Click on Submit button Successfully",true);
		waitForSomeTime();
		Thread.sleep(150000);
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[2]")
	private WebElement PendingApplication_Icon;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div[3]/div/div/div[1]/table/tbody/tr")
	private List<WebElement> rowtable;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/table/tbody/tr/td/span")
	private List<WebElement> dashboardelement;

	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div/div[2]/ul/li/a")
	private List<WebElement> dashboardelement1;
	
	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div/div[2]/ul/li[4]/a")
	private WebElement rti_information;

	@FindBy(xpath="//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div/div[2]/div[1]/div[4]/span/div/div/table/tbody/tr/td/table/tbody/tr/td[1]/span")
	private List<WebElement> rti_information_details;
	
	@FindBy(xpath="//html/body/div[1]/table[2]/tbody/tr/td[2]/table/tbody/tr/td/form/span[2]/span/div/div/div[4]/div[2]/center/table/tbody/tr/td[1]/div/div/label")
	private List<WebElement> ActionComment_details;
	
	@FindBy(xpath="//div[@class='ui-panel-titlebar ui-widget-header ui-helper-clearfix ui-corner-all']/span[contains(.,'Action and Comment')]")
	private WebElement ActionCommentMenu;
	
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[4]/div[2]/center/table[2]/tbody/tr[2]/td[2]/table/tbody/tr/td/div/div/label")
	private WebElement uploaddocument;

	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[4]/div[2]/center/table[2]/tbody/tr[2]/td[1]/span")
	private WebElement uploaddocumentlabel;
	
	
	public void toverifytheuploadButtonFunctionality_SC_13_TC_02() throws InterruptedException, AWTException
		{
		HighlightOnElement(PendingApplication_Icon);
		PendingApplication_Icon.click();
		waitForSomeTime();
	
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,400)", "");
		waitForSomeTime();
		try
		{
		int rows_count = rowtable.size(); 
		for(int row=0; row<rows_count; row++) 
		{
		List <WebElement> Columns_row = rowtable.get(row).findElements(By.tagName("td"));
		int columns_count = Columns_row.size();
		for (int column = 0; column <columns_count; column++)
		{
		String celltext = Columns_row.get(column).getText();
		if(celltext.equalsIgnoreCase("ORTIC0211170280"))
		{
		List<WebElement> actionbtn =driver.findElements(By.xpath("//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div[3]/div/div/div[1]/table/tbody/tr/td[3]/following-sibling::td[1]/span/../following-sibling::td/a/img"));
		actionbtn.get(row).click();
		Reporter.log("click on action buton successfully",true);
		waitForSomeTime();
		}
		}
	
		}
		}
		catch (Exception StaleElementReferenceException) 
		{
		StaleElementReferenceException.printStackTrace();
		}
	
		for(WebElement dashboard:dashboardelement)
		{
		HighlightOnElement(dashboard);
		String element=dashboard.getText();
		Reporter.log("Expected result:"+element,true);
		}
	
		for(WebElement dashboard:dashboardelement1)
		{
		HighlightOnElement(dashboard);
		String element=dashboard.getText();
		Reporter.log("Expected result:"+element,true);
		}
		HighlightOnElement(rti_information);
		rti_information.click();
	
		for(WebElement information:rti_information_details)
		{
		HighlightOnElement(information);
		String element=information.getText();
		Reporter.log("RTI QUESTION INFORMATION:"+element,true);
		
		}
		HighlightOnElement(ActionCommentMenu);
		waitForSomeTime();
		for(WebElement information1:ActionComment_details)
		{
		HighlightOnElement(information1);
		String element1=information1.getText();
		Reporter.log("Action Comment INFORMATION:"+element1,true);
		
		}
		HighlightOnElement(uploaddocumentlabel);
		String uploadlabel=uploaddocumentlabel.getText();
		Reporter.log("Expected result:"+uploadlabel,true);
		waitForSomeTime();
		JavascriptExecutor jse1 = (JavascriptExecutor)driver;
		jse1.executeScript("window.scrollBy(0,250)", "");
		uploaddocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		waitForSomeTime();
		jse1.executeScript("window.scrollBy(0,-250)", "");
		
		}
	
	@FindBy(xpath="//div[@class='ui-selectonemenu ui-widget ui-state-default ui-corner-all ui-helper-clearfix']/div[3]/span")
	private WebElement clickonselectactiondrop;
	
	@FindBy(xpath="//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li")
	private List<WebElement> selectdropdownvalue;
	
	
	public void toVerifySubmitbuttonFunctionalityWithCommentFieldISBlank_SC_11_TC_13() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{

		waitForSomeTime();
		HighlightOnElement(clickonselectactiondrop);
		clickonselectactiondrop.click();

		for(int i=0;i<selectdropdownvalue.size();i++)
		{
			String value=selectdropdownvalue.get(i).getText();
			if(value.equalsIgnoreCase("Verified"))
			{
				selectdropdownvalue.get(i).click();
				waitForSomeTime();
			}
		}
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		
		
		HighlightOnElement(entercommentbox);
		excel.getExcelData(entercommentbox, "RTIApplication Number", 0, 12);

	}
	
	@FindBy(xpath="(//button[contains(.,'Submit') and@role='button'])[1]")
	private WebElement Submit_Button;
	
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[4]/div[2]/center/table/tbody/tr/td[2]/textarea")
	private WebElement entercommentbox;

	public void toVerifySubmitbuttonFunctionality() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(Submit_Button);
		Assert.assertEquals(Submit_Button.isEnabled(),true);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		waitForSomeTime();
		Submit_Button.click();
		Reporter.log("Click on Submit button Successfully",true);
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	@FindBy(xpath="//button[contains(.,'Send Back')]")
	private WebElement SendBack_Button;
	
	public void toverifySendBackFunctionalityofApplication_SC_13_TC_04() throws InterruptedException, AWTException
	{
	HighlightOnElement(PendingApplication_Icon);
	PendingApplication_Icon.click();
	waitForSomeTime();

	JavascriptExecutor jse = (JavascriptExecutor)driver;
	jse.executeScript("window.scrollBy(0,400)", "");
	waitForSomeTime();
	try
	{
	int rows_count = rowtable.size(); 
	for(int row=0; row<rows_count; row++) 
	{
	List <WebElement> Columns_row = rowtable.get(row).findElements(By.tagName("td"));
	int columns_count = Columns_row.size();
	for (int column = 0; column <columns_count; column++)
	{
	String celltext = Columns_row.get(column).getText();
	if(celltext.equalsIgnoreCase("ORTIC2109170233"))
	{
	List<WebElement> actionbtn =driver.findElements(By.xpath("//div[@class='ui-panel ui-widget ui-widget-content ui-corner-all']/div[2]/div[3]/div/div/div[1]/table/tbody/tr/td[3]/following-sibling::td[1]/span/../following-sibling::td/a/img"));
	actionbtn.get(row).click();
	Reporter.log("click on action buton successfully",true);
	waitForSomeTime();
	}
	}

	}
	}
	catch (Exception StaleElementReferenceException) 
	{
	StaleElementReferenceException.printStackTrace();
	}
   
	
	HighlightOnElement(rti_information);
	rti_information.click();
	
	waitForSomeTime();
	HighlightOnElement(SendBack_Button);
	Assert.assertTrue(SendBack_Button.isDisplayed(),"Test Case Pass: SendBack_Button");
	SendBack_Button.click();
	Reporter.log("Click on SendBack Button Successfully",true);
	waitForSomeTime();
	waitForSomeTime();
	
	
	}*/
	
	
	
}
