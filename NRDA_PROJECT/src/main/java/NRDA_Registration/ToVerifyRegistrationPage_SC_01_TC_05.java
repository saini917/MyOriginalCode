package NRDA_Registration;

import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyRegistrationPage_SC_01_TC_05 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);
	Logger log=Logger.getLogger("devpinoyLogger");


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Applicant First Name".
	 * @author deepak.saini
	 * @since 2018-04-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span/span[contains(text(),'Applicant First Name')]/../../following-sibling::td/input")
	private WebElement applicantfirstname;
	
	public void enterApplicantFirstName() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(applicantfirstname);
		String firstname=excel.getExcelData(applicantfirstname,"Registration Details",1,15);
		Reporter.log("Enter Applicant First name: "+firstname,true);
		log.info("To verify Applicant First name entered successfully");
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Applicant Last Name".
	 * @author deepak.saini
	 * @since 2018-04-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span/span[contains(text(),'Applicant Last Name')]/../../following-sibling::td/input")
	private WebElement applicantlastname;
	
	public void enterApplicantLastName() throws EncryptedDocumentException, InvalidFormatException, IOException
	{
		HighlightOnElement(applicantlastname);
		String lastname=excel.getExcelData(applicantlastname,"Registration Details",1,18);
		Reporter.log("Enter Applicant Last name: "+lastname,true);
		log.info("To verify Applicant Last name entered successfully");
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "date of birth".
	 * @author deepak.saini
	 * @since 2018-04-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table[1]/tbody/tr/td/span/span[contains(text(),'Registration Date')]/../../following-sibling::td/span/input")
	private WebElement registrationdate_textbox;

	@FindBy(xpath=".//*[@id='ui-datepicker-div']/div[1]/div/select[2]")
	private WebElement select_year;

	public void selectRegistrationDate()
	{
		try
		{
			HighlightOnElement(registrationdate_textbox);
			registrationdate_textbox.click();
			select_year.click();
			Select year=new Select(select_year);
			List<WebElement> list_year=year.getOptions();

			for(int index=0;index<list_year.size();index++)
			{
				String allyear=list_year.get(index).getText();
				Reporter.log("Year:"+allyear,true);
				log.info("To verify year selected successfully");
				if(allyear.trim().equalsIgnoreCase("2016"))
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
						if(allmonth.trim().equalsIgnoreCase("Dec"))
						{
							month.selectByIndex(index1);
							List<WebElement> selectdate=driver.findElements(By.xpath("//div[@id='ui-datepicker-div']/table/tbody/tr/td/a"));
							for(int index2=0;index2<selectdate.size();index2++)
							{
								String alldate=selectdate.get(index2).getText();
								Reporter.log("Date:"+alldate,true);
								log.info("To verify date selected successfully");
								if(alldate.trim().equalsIgnoreCase("7"))
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

}
