package NRDA_NewConnection;

import java.util.List;

import org.apache.log4j.Logger;
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

public class ToVerifyConnectionDetailsTab_SC_03_TC_52 extends CommonLibrary
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
	 * This is the xpath of the WebElement "select Plumber name".
	 * @author deepak.saini
	 * @since 2017-08-22
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Plumber Name')]/../../../../../../following-sibling::td/table/tbody/tr/td/select")
	private WebElement plumber_name;


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "trust/organisation/school".
	 * @author deepak.saini
	 * @since 2017-08-18
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div[2]/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[2]/following-sibling::tr[1]/td[1]/table/tbody/tr/td[2]/table/tbody/tr/td/input")
	private WebElement trust_organisation_school9;


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Number of bed/employee/student".
	 * @author deepak.saini
	 * @since 2017-08-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div[2]/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[2]/following-sibling::tr[1]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/input")
	private WebElement numberof_Students_Rooms_Flats9;

	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Plumber Name')]")
	private WebElement clickanyw;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Sewerage Connection Number".
	 * @author deepak.saini
	 * @since 2017-08-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div[2]/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[2]/following-sibling::tr[2]/td[1]//table/tbody/tr/td[2]//table/tbody/tr/td/input")
	private WebElement sewerage_connection_number9;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "remarks".
	 * @author deepak.saini
	 * @since 2017-08-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//table[@style='width: 100%;border-collapse: collapse;border: 0;']/tbody/tr/td/table/tbody/tr[7]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/textarea")
	private WebElement remarks9;

	public void verifyFilledFunctionality() throws InterruptedException
	{
		wait.until(ExpectedConditions.elementToBeClickable(applicant_type));
		Assert.assertTrue(applicant_type.isEnabled());
		HighlightOnElement(applicant_type);
		Select a_type=new Select(applicant_type);
		List<WebElement> all_applicant_type=a_type.getOptions();
		for(int index=1;index<all_applicant_type.size();index++)
		{
			try
			{
				String app_type=all_applicant_type.get(index).getText();
				//Reporter.log(app_type,true); //print for eclipse console 
				log.info("To Verify Applicant Type dropdwon is Present");
				{
					if(app_type.trim().equalsIgnoreCase("Water Connection / जल कनेक्शन"))
					{
						waitForSomeTime();
						a_type.selectByIndex(index);
						waitForSomeTime();

						HighlightOnElement(connection_type);
						waitForSomeTime();
						Select con_type=new Select(connection_type);
						List<WebElement> all_connection_type=con_type.getOptions();
						for(int index1=0;index1<all_connection_type.size();index1++)
						{
							String conn_type=all_connection_type.get(index1).getText();
							//Reporter.log(conn_type,true); //print for eclipse console 
							log.info("To Verify Connection Type dropdwon is Present");
							if(conn_type.trim().equalsIgnoreCase("Residential Cum Commercial/आवासीय सह वाणिज्यिक"))
							{
								waitForSomeTime();
								con_type.selectByIndex(index1);
								waitForSomeTime();

								HighlightOnElement(details_of_usage);
								waitForSomeTime();
								Select details=new Select(details_of_usage);
								List<WebElement> all_details_of_usage=details.getOptions();
								for(int index2=0;index2<all_details_of_usage.size();index2++)
								{
									String details_usage=all_details_of_usage.get(index2).getText();
									//Reporter.log(details_usage,true);
									log.info("To Verify Details of Usage dropdwon is Present");
									if(details_usage.trim().equalsIgnoreCase("Hostels/हॉस्टल"))
									{
										waitForSomeTime();
										details.selectByIndex(index2);
										waitForSomeTime();

										HighlightOnElement(plumber_name);
										Select plumber=new Select(plumber_name);
										List<WebElement> all_plumber=plumber.getOptions();
										for(int index3=0;index3<all_plumber.size();index3++)
										{
											String all_plumber_name=all_plumber.get(index3).getText();
											//Reporter.log(all_plumber_name,true);
											if(all_plumber_name.trim().equalsIgnoreCase("Raju"))
											{
												plumber.selectByIndex(index3);
												break;
											}
										}
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

		try
		{
			HighlightOnElement(trust_organisation_school9);
			excel.getExcelData(trust_organisation_school9, "Connection Details",6,4);
			//Reporter.log("Trust/Organisation/School:"+organisation,true);
			log.info("To Verify enter the value in Trust/Organisation/School textbox sucessfully");

			HighlightOnElement(numberof_Students_Rooms_Flats9);
			excel.getExcelData(numberof_Students_Rooms_Flats9, "Connection Details",2,8);
			//Reporter.log("Number of Students/Rooms/Flats:"+numberofStudentsRoomsFlats,true);
			log.info("To Verify enter the value in Number of Students/Rooms/Flats textbox sucessfully");

			waitForSomeTime();
			clickanyw.click();
			waitForSomeTime();

			HighlightOnElement(sewerage_connection_number9);
			waitForSomeTime();
			String sewerageConnectionNumber9=excel.getExcelData(sewerage_connection_number9, "Connection Details",4,9);
			Reporter.log("Sewerage Coonection Number:"+sewerageConnectionNumber9,true);
			log.info("To Verify enter the value in Sewerage Connection Number textbox sucessfully");
			waitForSomeTime();

			HighlightOnElement(remarks9);
			excel.getExcelData(remarks9, "Connection Details",2,12);
			//Reporter.log("Remarks(if Any):"+remarksIfAny9,true);
			log.info("To Verify enter the value in Remarks textbox sucessfully");
		}
		catch(Exception StaleElementException)
		{}
	}

}
