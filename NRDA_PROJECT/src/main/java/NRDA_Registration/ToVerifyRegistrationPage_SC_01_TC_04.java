package NRDA_Registration;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyRegistrationPage_SC_01_TC_04 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	Logger log=Logger.getLogger("devpinoyLogger");


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "title".
	 * @author deepak.saini
	 * @since 2018-04-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span/span[contains(text(),'Title')]/../../following-sibling::td/select")
	private WebElement title;

	public void selectTitle() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(title));
		Assert.assertTrue(title.isDisplayed());
		HighlightOnElement(title);
		Assert.assertTrue(title.isEnabled());
		SelectVisibleText(title,"Mr.");
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Applicant middle name".
	 * @author deepak.saini
	 * @since 2018-04-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span[contains(text(),'Applicant Middle Name')]/../following-sibling::td/input[@id='regForm:tabView:middleName']")
	private WebElement app_middle_name;

	public void enterAppMiddleName() throws AWTException, InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(app_middle_name);
		String middlename=excel.getExcelData(app_middle_name,"Registration Details",1,17);
		Reporter.log("Enter Applicant middle name: "+middlename,true);
		log.info("To verify Applicant middle name entered successfully");
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Relationship type".
	 * @author deepak.saini
	 * @since 2018-04-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span/span[contains(text(),'Relationship Type')]/../../following-sibling::td/select")
	private WebElement relationship_type;

	public void selectRelationshipType() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(relationship_type));
		Assert.assertTrue(relationship_type.isDisplayed());
		HighlightOnElement(relationship_type);
		Assert.assertTrue(relationship_type.isEnabled());
		SelectVisibleText(relationship_type,"Father");
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Applicant middle name".
	 * @author deepak.saini
	 * @since 2018-04-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span/span[contains(text(),'Father')]/../../following-sibling::td/input")
	private WebElement father_name;

	public void enterFatherName() throws AWTException, InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(father_name);
		String middlename=excel.getExcelData(father_name,"Registration Details",1,14);
		Reporter.log("Enter Father name: "+middlename,true);
		log.info("To verify Father name entered successfully");
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "date of birth".
	 * @author deepak.saini
	 * @since 2018-04-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span/span[contains(text(),'Date of Birth of Applicant')]/../../following-sibling::td/span/input")
	private WebElement clickdate_of_birth_textbox;

	@FindBy(xpath=".//*[@id='ui-datepicker-div']/div[1]/div/select[2]")
	private WebElement select_year;

	public void selectDateOfBirth()
	{
		try
		{
			HighlightOnElement(clickdate_of_birth_textbox);
			clickdate_of_birth_textbox.click();
			select_year.click();
			Select year=new Select(select_year);
			List<WebElement> list_year=year.getOptions();

			for(int index=0;index<list_year.size();index++)
			{
				String allyear=list_year.get(index).getText();
				Reporter.log("Year:"+allyear,true);
				log.info("To verify year selected successfully");
				if(allyear.trim().equalsIgnoreCase("1987"))
				{
					year.selectByIndex(index);
					WebElement selectMonth=driver.findElement(By.xpath(".//*[@id='ui-datepicker-div']/div[1]/div/select[1]"));
					selectMonth.click();
					Select month=new Select(selectMonth);
					List<WebElement> list_month=month.getOptions();
					for(int index1=0;index1<list_month.size();index1++)
					{
						String allmonth=list_month.get(index1).getText();
						Reporter.log("Month:"+allmonth,true);
						log.info("To verify month selected successfully");
						if(allmonth.trim().equalsIgnoreCase("jul"))
						{
							month.selectByIndex(index1);
							List<WebElement> selectdate=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
							for(int index2=0;index2<selectdate.size();index2++)
							{
								String alldate=selectdate.get(index2).getText();
								Reporter.log("Date:"+alldate,true);
								log.info("To verify date selected successfully");
								if(alldate.trim().equalsIgnoreCase("19"))
								{
									selectdate.get(index2).click();
									break;
								}
							}
						}
					}
				}
			}
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Gender".
	 * @author deepak.saini
	 * @since 2018-04-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span/span[contains(text(),'Gender')]/../../following-sibling::td/select")
	private WebElement gender;

	public void selectGender() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(gender));
		Assert.assertTrue(gender.isDisplayed());
		HighlightOnElement(gender);
		Assert.assertTrue(gender.isEnabled());
		SelectVisibleText(gender,"Male");
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Architect Type".
	 * @author deepak.saini
	 * @since 2018-04-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span/span[contains(text(),'Architect Type')]/../../following-sibling::td/select")
	private WebElement architecttype;

	public void selectArchitectType() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(architecttype));
		Assert.assertTrue(architecttype.isDisplayed());
		HighlightOnElement(architecttype);
		Assert.assertTrue(architecttype.isEnabled());
		SelectVisibleText(architecttype,"Architect");
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Registration Place".
	 * @author deepak.saini
	 * @since 2018-04-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span/span[contains(text(),'Registration Place')]/../../following-sibling::td/input[@id='regForm:tabView:regterPlace']")
	private WebElement registration_place;

	public void enterRegistrationPlace() throws AWTException, InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(registration_place);
		String middlename=excel.getExcelData(registration_place,"Registration Details",1,21);
		Reporter.log("Enter Registration place: "+middlename,true);
		log.info("To verify Registration place entered successfully");
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Registered with".
	 * @author deepak.saini
	 * @since 2018-04-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span/span[contains(text(),'Registered With')]/../../following-sibling::td/input[@id='regForm:tabView:regsterby']")
	private WebElement registeredwith;

	public void enterRegisteredWith() throws AWTException, InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(registeredwith);
		String middlename=excel.getExcelData(registeredwith,"Registration Details",1,22);
		Reporter.log("Enter Registered with: "+middlename,true);
		log.info("To verify Registered with entered successfully");
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Registration number".
	 * @author deepak.saini
	 * @since 2018-04-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span/span[contains(text(),'Registration Number')]/../../following-sibling::td/input")
	private WebElement registerednum;

	public void enterRegistrationNumber() throws AWTException, InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(registerednum);
		String middlename=excel.getExcelData(registerednum,"Registration Details",1,23);
		Reporter.log("Enter Registration number: "+middlename,true);
		log.info("To verify Registration number entered successfully");
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "upload scanned certificate".
	 * @author deepak.saini
	 * @since 2018-04-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span[contains(text(),'Registration Certificate Scanned Copy')]/../following-sibling::td/table/tbody/tr/td/div/div/label")
	private WebElement uploadscannedcertificate;

	public void uploadScannedCertificate() throws AWTException, InterruptedException
	{
		HighlightOnElement(uploadscannedcertificate);
		uploadscannedcertificate.click();
		waitForSomeTime();
		UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\JPG AND PNG\\SampleJPGImage_500kbmb.jpg");
		Reporter.log("To verify Image upload successfully",true);
		log.info("To verify Image upload successfully");
		waitForSomeTime();
		waitForSomeTime();
	}
}
