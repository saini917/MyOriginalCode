/**
 * 
 */
package NRDA_RTI;

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


import GenericLibrary.ExcelDataDriver;
import GenericLibrary.CommonLibrary;


/**
 * @author Sarvesh.Nellore
 * @Date: 02-11-2017
 * @Purpose: to verify login As RTI-APIo
 */
public class ToverifyRTIAPIO_LoginVerified extends CommonLibrary
{
	
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[2]")
	private WebElement PendingApplication_Icon;
	
	@FindBy(xpath="//img[@src='/NRDAuthority/resources/images/view-new.png']")
	private  WebElement actionbtn1;
	
	@FindBy(xpath="//div[@role='tabpanel']/div/div[1]/table")
	private WebElement PendingApplication_Grid;
	
	@FindBy(xpath="//span[contains(.,'Applications List')]/../following-sibling::div/div[1]/div/table/tbody/tr/td/input")
	private WebElement entervalueinsearchbox;
	
	@FindBy(xpath="//button/span[contains(text(),'Search')]")
	private WebElement searchbtn;
	
	@FindBy(xpath="//span[contains(.,'Action and Comment')]/../following-sibling::div/center/table[1]/tbody/tr/td[2]/select")
	private WebElement clickonselectactiondrop;
	
	
	@FindBy(xpath="//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li")
	private List<WebElement> selectdropdownvalue;
	
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[4]/div[2]/center/table/tbody/tr/td[2]/textarea")
	private WebElement entercommentbox;
	
	@FindBy(xpath="//div[@id='inboxForm:Nb']/div/div[4]/div[2]/center/table[2]/tbody/tr[2]/td[1]/span")
	private WebElement uploaddocumentlabel;
	
	@FindBy(xpath="//table[@class='ui-panelgrid ui-widget']/tbody/tr[4]/td[2]/table/tbody/tr/td/div/div[1]/label")
	private WebElement uploaddocument;
	
	
	public void toverifytheuploaddocumentFunctionality_SC_14_TC_02() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException, AWTException
	{
		
		
		HighlightOnElement(PendingApplication_Icon);
		Assert.assertTrue(PendingApplication_Icon.isEnabled(),"Test Case PAss");
		PendingApplication_Icon.click();
		waitForSomeTime();
		waitForSomeTime();
		Reporter.log("Expected result:click on PendingApplication Link",true);

		waitForelementPresent(entervalueinsearchbox);

		HighlightOnElement(entervalueinsearchbox);

		//String Validnumber=ApplicationNumber.getText();
		String validnumber=excel.getExcelData(entervalueinsearchbox, "RTIApplication Number",0, 1);
		Reporter.log("Valid Application Number:"+validnumber,true);
	//	entervalueinsearchbox.sendKeys(Validnumber);
		waitForSomeTime();
		HighlightOnElement(searchbtn);
		searchbtn.click();
		waitForSomeTime();
		waitForSomeTime();
		HighlightOnElement(actionbtn1);
		actionbtn1.click();
		waitForSomeTime();
		waitForSomeTime();
		waitForSomeTime();
		
		HighlightOnElement(clickonselectactiondrop);
		
		SelectVisibleText(clickonselectactiondrop, "Verified");
		/*clickonselectactiondrop.click();

		for(int i=0;i<selectdropdownvalue.size();i++)
		{
			String value=selectdropdownvalue.get(i).getText();
			if(value.equalsIgnoreCase("Verified"))
			{
				selectdropdownvalue.get(i).click();
				waitForSomeTime();
			}
		}*/
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		waitForSomeTime();
		HighlightOnElement(entercommentbox);
		entercommentbox.sendKeys("Verified");
		//excel.getExcelData(entercommentbox, "RTIApplication Number",0, 15);
		waitForSomeTime();
		HighlightOnElement(uploaddocument);
		uploaddocument.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
		waitForSomeTime();
		waitForSomeTime();
		jse.executeScript("window.scrollBy(0,-250)", "");
		waitForSomeTime();
		waitForSomeTime();
		
	}
	
	
	@FindBy(xpath="//button[contains(.,'Submit') and@role='button']")
	private WebElement Submit_Button;
	
	
	public void toverifySubmitFunctionalitywithActionIsVerified_SC_14_TC_03() throws InterruptedException
	{
		
		
		waitForSomeTime();
		HighlightOnElement(Submit_Button);
		Assert.assertEquals(Submit_Button.isEnabled(),true);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,250)", "");
		waitForSomeTime();
		Submit_Button.click();
		Reporter.log("Click on Submit button Successfully",true);
		waitForSomeTime();
		Thread.sleep(15000);
	}
	
	
	
	
	
}
