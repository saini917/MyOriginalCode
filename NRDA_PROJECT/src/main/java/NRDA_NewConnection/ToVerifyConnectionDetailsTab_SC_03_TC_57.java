package NRDA_NewConnection;

import java.awt.AWTException;
import java.io.IOException;
import java.util.List;

import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class ToVerifyConnectionDetailsTab_SC_03_TC_57 extends CommonLibrary
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
	private WebElement trust_organisation_school16;


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Number of bed/employee/student".
	 * @author deepak.saini
	 * @since 2017-08-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div[2]/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[2]/following-sibling::tr[1]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/input")
	private WebElement numberof_Students_Rooms_Flats16;


	@FindBy(xpath="//div[@class='ui-tabs-panels']/div/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label[contains(text(),'Plumber Name')]")
	private WebElement clickonanywhere;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Sewerage Connection Diameter".
	 * @author deepak.saini
	 * @since 2017-08-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div[2]/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[2]/following-sibling::tr[3]/td[1]//table/tbody/tr/td[2]/table/tbody/tr/td/input")
	private WebElement sewerage_connection_diameter16;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "site plan showing proposed sewerage connection".
	 * @author deepak.saini
	 * @since 2017-08-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/span/span/div/div[2]/div/div/div[3]/table/tbody/tr/td/table/tbody/tr[2]/following-sibling::tr[3]/td[2]//table/tbody/tr/td[2]/table/tbody/tr/td/span/div/div[1]/label/input")
	private WebElement site_plan16;


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "remarks".
	 * @author deepak.saini
	 * @since 2017-08-23
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//table[@style='width: 100%;border-collapse: collapse;border: 0;']/tbody/tr/td/table/tbody/tr[7]/td[2]/table/tbody/tr/td[2]/table/tbody/tr/td/textarea")
	private WebElement remarks16;

	public void verifyValidDataFunctionality() throws InterruptedException
	{
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
					if(app_type.trim().equalsIgnoreCase("Sewerage Connection / सीवरेज कनेक्शन"))
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
	}


			/****************************************************************************************************/
			/*
			 * This is the xpath of the WebElement "Name of trust/orgaization/school".
			 * @author deepak.saini
			 * @since 2018-04-25
			 */
			/****************************************************************************************************/
			@FindBy(xpath="//label[contains(text(),'Name of Trust/Organisation/School')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
			private WebElement trust;
			
			public void enterTrust() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				wait.until(ExpectedConditions.visibilityOf(trust));
				Assert.assertTrue(trust.isDisplayed());
				HighlightOnElement(trust);
				Assert.assertTrue(trust.isEnabled());
				excel.getExcelData(trust,"Connection Details",1,4);
				waitForSomeTime();
			}
			
			/*
			 * This is the xpath of the WebElement "Name of Students/Room/Flats".
			 * @author deepak.saini
			 * @since 2018-04-25
			 */
			/****************************************************************************************************/
			@FindBy(xpath="//label[contains(text(),'Number of Students/Room/Flats')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
			private WebElement room;
			
			@FindBy(xpath="//label[contains(text(),'Number of Students/Room/Flats')]")
			private WebElement clickany;


			public void enterNumberOfRoom() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				wait.until(ExpectedConditions.visibilityOf(room));
				Assert.assertTrue(room.isDisplayed());
				HighlightOnElement(room);
				Assert.assertTrue(room.isEnabled());
				excel.getExcelData(room,"Connection Details",1,8);
				waitForSomeTime();
				clickany.click();
				waitForSomeTime();
				waitForSomeTime();
			}
			
			/****************************************************************************************************/
			/*
			 * This is the xpath of the WebElement "Sewerage connetion diameter".
			 * @author deepak.saini
			 * @since 2018-04-25
			 */
			/****************************************************************************************************/
			@FindBy(xpath="//label[contains(text(),'Sewerage Connection Diameter')]/../../../../../../following-sibling::td/table/tbody/tr/td/input")
			private WebElement connectiondiameter;

			public void enterConnectionDiameter() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
			{
				wait.until(ExpectedConditions.visibilityOf(connectiondiameter));
				Assert.assertTrue(connectiondiameter.isDisplayed());
				HighlightOnElement(connectiondiameter);
				Assert.assertTrue(connectiondiameter.isEnabled());
				excel.getExcelData(connectiondiameter,"Connection Details",2,10);
				waitForSomeTime();
			}
			
			/****************************************************************************************************/
			/*
			 * This is the xpath of the WebElement "Site Plan Showing Proposed Sewerage Connection".
			 * @author deepak.saini
			 * @since 2018-04-25
			 */
			/****************************************************************************************************/
			@FindBy(xpath="//label[contains(text(),'Site Plan Showing Proposed Sewerage Connection')]/../../../../../../following-sibling::td/table/tbody/tr/td/span/div/div/label")
			private WebElement siteplan;

			public void uploadSitePlan() throws InterruptedException, AWTException
			{
				wait.until(ExpectedConditions.visibilityOf(siteplan));
				Assert.assertTrue(siteplan.isDisplayed());
				HighlightOnElement(siteplan);
				waitForSomeTime();
				siteplan.click();
				waitForSomeTime();
				UpLoadFile("C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\src\\test\\resources\\IMAGE_NRDA_WATER&SEWERAGE\\Raipur.jpg");
				waitForSomeTime();
				waitForSomeTime();
			}

	}

