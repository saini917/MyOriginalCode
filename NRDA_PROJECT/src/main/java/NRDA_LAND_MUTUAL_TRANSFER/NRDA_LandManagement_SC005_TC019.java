package NRDA_LAND_MUTUAL_TRANSFER;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC005_TC019 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "case number".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'CaseNo')]/../following-sibling::td/input")
	private WebElement caseno;
	
	public void enterCaseNo() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{	
		wait.until(ExpectedConditions.visibilityOf(caseno));
		Assert.assertTrue(caseno.isDisplayed());
		HighlightOnElement(caseno);
		Assert.assertTrue(caseno.isEnabled());
		excel.getExcelData(caseno,"Land Data",1,19);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "case date".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Case Date')]/../following-sibling::td/span/input")
	private WebElement casedate;
	
	public void enterCaseDate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{	
		wait.until(ExpectedConditions.visibilityOf(casedate));
		Assert.assertTrue(casedate.isDisplayed());
		HighlightOnElement(casedate);
		Assert.assertTrue(casedate.isEnabled());
		String  today = getCalenderCurrentDate();
        //System.out.println("Today's number: " + today + "\n");
		wait.until(ExpectedConditions.elementToBeClickable(casedate));
		casedate.click();
		
		//find the calendar
		WebElement dateWidget = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));  
		List<WebElement> columns=dateWidget.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));  

		//comparing the text of cell with today's date and clicking it.
		for (WebElement cell : columns)
		{
			if (cell.getText().equals(today))
			{
				cell.click();
				break;
			}
		}
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select High Court".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/

	
	@FindBy(xpath="//label[contains(text(),'Court Name')]/../following-sibling::td/div/div/span")
	private WebElement selectcourtname;
	
	public void selectCourtName() throws InterruptedException{	
		wait.until(ExpectedConditions.visibilityOf(selectcourtname));
		Assert.assertTrue(selectcourtname.isDisplayed());
		HighlightOnElement(selectcourtname);
		Assert.assertTrue(selectcourtname.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(selectcourtname));
		selectcourtname.click();
		selectValueFromDropdown("High Court");
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "respondent".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Respondent')]/../following-sibling::td/input")
	private WebElement respondent;
	
	public void enterRespondent() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{	
		wait.until(ExpectedConditions.visibilityOf(respondent));
		Assert.assertTrue(respondent.isDisplayed());
		HighlightOnElement(respondent);
		Assert.assertTrue(respondent.isEnabled());
		excel.getExcelData(respondent,"Land Data",1,20);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "NEXT HEARING DATE".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'NextHearingDate')]/../following-sibling::td/span/input")
	private WebElement hearingdate;
	
	public void enterNextHearingDate() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{	
		wait.until(ExpectedConditions.visibilityOf(hearingdate));
		Assert.assertTrue(hearingdate.isDisplayed());
		HighlightOnElement(hearingdate);
		Assert.assertTrue(hearingdate.isEnabled());
		String  today = getCalenderCurrentDate();
        //System.out.println("Today's number: " + today + "\n");
		wait.until(ExpectedConditions.elementToBeClickable(hearingdate));
		hearingdate.click();
		
		//find the calendar
		WebElement dateWidget = driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr"));  
		List<WebElement> columns=dateWidget.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td"));  

		//comparing the text of cell with today's date and clicking it.
		for (WebElement cell : columns)
		{
			if (cell.getText().equals(today))
			{
				cell.click();
				break;
			}
		}
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Appilant name".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Appilant Name')]/../following-sibling::td/input")
	private WebElement appilant;
	
	public void enterAppilantName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{	
		wait.until(ExpectedConditions.visibilityOf(appilant));
		Assert.assertTrue(appilant.isDisplayed());
		HighlightOnElement(appilant);
		Assert.assertTrue(appilant.isEnabled());
		excel.getExcelData(appilant,"Land Data",1,21);
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Legal remarks".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Legal Remarks')]/../following-sibling::td/textarea")
	private WebElement legalremarks;
	
	public void enterLegalRemarks() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{	
		wait.until(ExpectedConditions.visibilityOf(legalremarks));
		Assert.assertTrue(legalremarks.isDisplayed());
		HighlightOnElement(legalremarks);
		Assert.assertTrue(legalremarks.isEnabled());
		excel.getExcelData(legalremarks,"Land Data",1,22);
	}
	
	@FindBy(xpath="//span[contains(text(),'Upload Document')]/../../following-sibling::tr/td/div/div/label")
	private WebElement upload;
	
	public void uploadValidDocument() throws InterruptedException, AWTException{
		wait.until(ExpectedConditions.visibilityOf(upload));
		Assert.assertTrue(upload.isDisplayed());
		HighlightOnElement(upload);
		Assert.assertTrue(upload.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(upload));
		upload.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\download.jpg");
		waitForPageLoad();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "upload message".
	 * @author deepak.saini
	 * @since 2018-04-17
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div/span[contains(text(),'File uploaded Successfully')]")
	private WebElement sucmsg;
	
	public void verifyUploadMsg() throws InterruptedException{
		String expected="File uploaded Successfully";
		wait.until(ExpectedConditions.visibilityOf(sucmsg));
		Assert.assertTrue(sucmsg.isDisplayed());
		HighlightOnElement(sucmsg);
		Assert.assertTrue(sucmsg.isEnabled());
		String actual=sucmsg.getText();
		Reporter.log("Uploaded Message :"+actual,true);
		Assert.assertEquals(actual,expected,"Test case not pass");
	}
}
