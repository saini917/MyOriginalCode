package NRDA_NewConnection;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_03_TC_27 extends CommonLibrary
{
	ExcelDataDriver excel=new ExcelDataDriver();
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait = new WebDriverWait(driver,50);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select Applicant type".
	 * @author deepak.saini
	 * @since 2017-08-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Application Type')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement applicant_type;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select Connection type".
	 * @author deepak.saini
	 * @since 2017-08-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Connection Type')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement connection_type;
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select Details of usage".
	 * @author deepak.saini
	 * @since 2017-08-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:tabView']/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Details of Usage')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement details_of_usage;
	
	public void verifyDetailsOfUsage() throws InterruptedException //to verify all field name
	{
		wait.until(ExpectedConditions.visibilityOf(applicant_type));
		HighlightOnElement(applicant_type);
		Select a_type=new Select(applicant_type);
		List<WebElement> all_applicant_type=a_type.getOptions();
		for(int index=1;index<all_applicant_type.size();index++)
		{
			try
			{
				String app_type=all_applicant_type.get(index).getText();
				{
					if(app_type.trim().equalsIgnoreCase("Water and Sewerage Connection/जल और सीवेज कनेक्शन"))
					{
						waitForSomeTime();
						a_type.selectByIndex(index);
						waitForSomeTime();

						wait.until(ExpectedConditions.visibilityOf(connection_type));
						HighlightOnElement(connection_type);
						Select con_type=new Select(connection_type);
						List<WebElement> all_connection_type=con_type.getOptions();
						for(int index1=1;index1<all_connection_type.size();index1++)
						{
							String conn_type=all_connection_type.get(index1).getText();
							if(conn_type.trim().equalsIgnoreCase("Residential Cum Commercial/आवासीय सह वाणिज्यिक"))
							{
								waitForSomeTime();
								con_type.selectByIndex(index1);
								waitForSomeTime();
								waitForSomeTime();

								wait.until(ExpectedConditions.visibilityOf(details_of_usage));
								HighlightOnElement(details_of_usage);
								waitForSomeTime();
								Select details=new Select(details_of_usage);
								List<WebElement> all_details_of_usage=details.getOptions();
								for(WebElement all_details_usage:all_details_of_usage)
								{
									Assert.assertTrue(all_details_usage.isDisplayed());
									String details_usage=all_details_usage.getText();
									Reporter.log(details_usage,true);
									log.info("To Verify field shown al the value in the Details of usage dropdown");

								}
							}
						}
					}
				}
			}
			catch(Exception ex)
			{}
		}
	}
}
