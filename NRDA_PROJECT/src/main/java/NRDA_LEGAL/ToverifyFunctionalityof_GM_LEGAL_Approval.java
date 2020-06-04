package NRDA_LEGAL;

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
import GenericLibrary.WebdriverCommonDriverLibrary;

/**
 * @author Sarvesh.Nellore
 *
 */
public class ToverifyFunctionalityof_GM_LEGAL_Approval extends CommonLibrary 
{
	Logger log=Logger.getLogger("devpinoyLogger");
	ExcelDataDriver excel=new ExcelDataDriver();
	
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Home')]")
	private WebElement Home_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Pending Application')]")
	private WebElement PendingApplication_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Approve/Reject Application')]")
	private WebElement ApproveorRejectApplication_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Payment Collection')]")
	private WebElement PaymentCollection_Icon;
		
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Invoice Collection')]")
	private WebElement InvoiceCollection_Icon;
		
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Application Form')]")
	private WebElement ApplicationForm_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'MIS Reports')]")
	private WebElement MisReport_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Case List')]")
	private WebElement CaseList_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Process Legal Invoice')]")
	private WebElement ProcessLegalInvoice_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Manage Advocate')]")
	private WebElement ManageAdvocate_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'Meeting Management')]")
	private WebElement MeetingManagement_Icon;
	
	@FindBy(xpath="//div[@class='col-lg-12 col-md-12 padmar0']/ul/li/../li[contains(.,'File Management')]")
	private WebElement FileManagement_Icon;
	
	
	@FindBy(xpath="//a[contains(.,'Cases for Invoicing')]")
	private WebElement CasesForInvoicing_Link;
	
	@FindBy(xpath="//div/span[contains(.,'Invoice Details')]")
	private WebElement InvoiceDetails;
	
	
	@FindBy(xpath="//div/span[contains(.,'Processed Invoice')]")
	private WebElement ProcessedInvoice;
	
	@FindBy(xpath="(//div/span[contains(.,'Add Invoice')])[1]")
	private WebElement AddInvoice;
	
	
	
	public void toverifyProceslegainvoicelinkfunctionality() throws InterruptedException
	{
		ScroolDown();
		waitForSomeTime();
		HighlightOnElement(ProcessLegalInvoice_Icon);
		ProcessLegalInvoice_Icon.click();
		waitForelementPresent(CasesForInvoicing_Link);
		Assert.assertTrue(ProcessLegalInvoice_Icon.isDisplayed());
		Reporter.log(" To click ProcessLegalInvoice_Icon Link in Application Successfully",true); //print for eclipse console
		HighlightOnElement(CasesForInvoicing_Link);
		Reporter.log("Cases forInvoicing Link in Application is Present",true);
	
	}
	
	public void toVerifyCaseNumberreceivedbyCEO() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		waitForSomeTime();
		String Application_Number=excel.getExcelData1("AM_CaseNumber", 0, 1);
		Reporter.log("Application NumberIs:"+Application_Number,true);
			
		List<WebElement> allpages = driver.findElements(By.xpath("html/body/div[1]/table[2]/tbody/tr/td[2]/table/tbody/tr/td/form/div/div[2]/div[7]/div/div/div[4]/span[4]/span"));
		    Reporter.log("Total pages :" +allpages.size(),true);
		    
		    boolean check = true;
		    for(int i=1; i<=(allpages.size()); i++)
		        {
		    	List<WebElement> allrows = driver.findElements(By.xpath("//div[@class='ui-accordion-content ui-helper-reset ui-widget-content']/div/div[2]/table/tbody/tr"));
		            for(int row=1; row<=allrows.size(); row++)
		                {
		                    Reporter.log("Total rows :" +allrows.size(),true); 
		                    String name = driver.findElement(By.xpath("//div[@class='ui-accordion-content ui-helper-reset ui-widget-content']/div/div[2]/table/tbody/tr["+row+"]/td[2]")).getText();
		                    //Reporter.log(name);
		                    Reporter.log("Row loop",true);
		                    if(name.equals(Application_Number))
		                        {
		                            WebElement ApplicationNumber = driver.findElement(By.xpath("//div[@class='ui-accordion-content ui-helper-reset ui-widget-content']/div/div[2]/table/tbody/tr["+row+"]/td[2]/a"));
		                            ApplicationNumber.click();
		                            waitForSomeTime();
		                            Reporter.log("Element  exist",true);
		                            check = false;
		                            break;
		                        }
		                    else
		                    {
		                        Reporter.log("Element doesn't exist",true);
		                    }
		               
		                }

		       
		            if(check)
		            {
		            allpages.get(i).click();
		            waitForSomeTime();
		            }
		        }
		    waitForSomeTime();
	
	}	
	
	public void toverifymenulabels()
	{
		HighlightOnElement(InvoiceDetails);
		Assert.assertTrue(InvoiceDetails.isDisplayed());
		Reporter.log(" InvoiceDetails Label in Application is Present",true);
		
		HighlightOnElement(ProcessedInvoice);
		Assert.assertTrue(ProcessedInvoice.isDisplayed());
		Reporter.log("ProcessedInvoice in Application is Present",true);
		
		HighlightOnElement(AddInvoice);
		Assert.assertTrue(AddInvoice.isDisplayed());
		Reporter.log("AddInvoice in Application is Present",true);
		
	}
	
	
}
