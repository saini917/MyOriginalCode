package NRDA_NewConnection;

import java.util.List;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_03_TC_39 extends CommonLibrary
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

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "verify all field label".
	 * @author deepak.saini
	 * @since 2017-08-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/div/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List<WebElement> all_field;

	public void verifyWaterAndSewerage() // to verify all field
	{
		Assert.assertEquals(true,applicant_type.isEnabled());
		Assert.assertNotNull(applicant_type,"Select Applicant type sucessfully");
		HighlightOnElement(applicant_type);
		Select a_type=new Select(applicant_type);
		List<WebElement> all_applicant_type=a_type.getOptions();
		for(int index=1;index<all_applicant_type.size();index++)
		{
			try
			{
				String app_type=all_applicant_type.get(index).getText();
				Reporter.log(app_type,true); //print for eclipse console 
				log.info("To Verify Applicant Type dropdwon is Present");
				{
					if(app_type.trim().equalsIgnoreCase("Sewerage Connection / सीवरेज कनेक्शन"))
					{
						waitForSomeTime();
						a_type.selectByIndex(index);
						waitForSomeTime();
						HighlightOnElement(connection_type);
						Select con_type=new Select(connection_type);
						List<WebElement> all_connection_type=con_type.getOptions();
						for(int index1=1;index1<all_connection_type.size();index1++)
						{
							String conn_type=all_connection_type.get(index1).getText();
							Reporter.log(conn_type,true); //print for eclipse console 
							log.info("To Verify Connection Type dropdwon is Present");
							if(conn_type.trim().equalsIgnoreCase("Domestic/घरेलू"))
							{
								waitForSomeTime();
								con_type.selectByIndex(index1);
								waitForSomeTime();
								waitForSomeTime();
								HighlightOnElement(details_of_usage);
								Select details=new Select(details_of_usage);
								List<WebElement> all_details_of_usage=details.getOptions();
								for(int index2=1;index2<all_details_of_usage.size();index2++)
								{
									waitForSomeTime();
									String details_usage=all_details_of_usage.get(index2).getText();
									Reporter.log(details_usage,true);
									log.info("To Verify Details of Usage dropdwon is Present");
									if(details_usage.trim().equalsIgnoreCase("Individual/व्यक्तिगत"))
									{
										details.selectByIndex(index2);
										waitForSomeTime();
									}
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

	public void verifyField()
	{
		for(WebElement allfield:all_field)
		{
			HighlightOnElement(allfield);
			Assert.assertNotNull(allfield.isDisplayed());
			log.info("To Verify all field shown when selected the applicant type:Water and Sewerage Connection/जल और सीवेज कनेक्शन,connection type:Commercial/Industrial/वाणिज्यिक / औद्योगिक   and Details of usage:Factories/फ़ैक्टरी");
		}
	}
}
