package NRDA_LAND_MUTUAL_TRANSFER;

import java.io.IOException;
import java.util.List;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC011 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "relationship with owner ".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//label[contains(text(),'Relationship with Owner')])[1]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/select")
	private WebElement relationshipowner;

	public void verifyRelationshipWithOwner() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf( relationshipowner));
		Assert.assertTrue(relationshipowner.isDisplayed());
		HighlightOnElement(relationshipowner);
		Assert.assertTrue(relationshipowner.isEnabled());
		SelectVisibleText(relationshipowner,"Self");
		waitForPageLoad();
		waitForDomElement();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "applicant name ".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//label[contains(text(),'Applicant Name')])[1]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/input[@title='Applicant Name']")
	private WebElement applicantname;

	public void verifyApplicantName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(applicantname));
		Assert.assertTrue(applicantname.isDisplayed());
		HighlightOnElement(applicantname);
		Assert.assertTrue(applicantname.isEnabled());
		excel.getExcelData(applicantname,"Land Data",1,32);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "father name ".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//label[contains(text(),'Father Name')])[1]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/input")
	private WebElement fathername;

	public void verifyFatherName() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(fathername));
		Assert.assertTrue(fathername.isDisplayed());
		HighlightOnElement(fathername);
		Assert.assertTrue(fathername.isEnabled());
		excel.getExcelData(fathername,"Land Data",1,34);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "gender ".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//label[contains(text(),'Gender')])[1]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/select")
	private WebElement gender;

	public void verifyGender() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(gender));
		Assert.assertTrue(gender.isDisplayed());
		HighlightOnElement(gender);
		Assert.assertTrue(gender.isEnabled());
		SelectVisibleText(gender,"Male/पुरुष");
		waitForDomElement();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "date of birth".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Date of Birth')]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/span/input")
	private WebElement dateofbirthbox;

	@FindBy(xpath="//select[@data-handler='selectYear']")
	private WebElement year;

	@FindBy(xpath="//select[@data-handler='selectMonth']")
	private WebElement month;

	@FindBy(xpath="//div[@id='ui-datepicker-div']/table/tbody/tr/td/a")
	private List<WebElement> day;

	public void selectDateOfBirth() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(dateofbirthbox));
		Assert.assertTrue(dateofbirthbox.isDisplayed());
		HighlightOnElement(dateofbirthbox);
		Assert.assertTrue(dateofbirthbox.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(dateofbirthbox));
		dateofbirthbox.click();

			SelectVisibleText(year,"2000");
			SelectVisibleText(month,"May");
			
			for(WebElement list:day)
			{
				String days=list.getText();
				if(days.equalsIgnoreCase("9"))
				{
					list.click();
				}
			}
	}


	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "mobile number ".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//label[contains(text(),'Mobile Number')])[1]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/input")
	private WebElement mobilenum;

	public void verifyMobileNumber() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(mobilenum));
		Assert.assertTrue(mobilenum.isDisplayed());
		HighlightOnElement(mobilenum);
		Assert.assertTrue(mobilenum.isEnabled());
		excel.getExcelData(mobilenum,"Land Data",1,35);
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "email id ".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//label[contains(text(),'Email Id')])[1]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/input")
	private WebElement emailid;

	public void verifyEmailId() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(emailid));
		Assert.assertTrue(emailid.isDisplayed());
		HighlightOnElement(emailid);
		Assert.assertTrue(emailid.isEnabled());
		excel.getExcelData(emailid,"Land Data",1,36);
	}
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "caste ".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//label[contains(text(),'Caste')])[1]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/select")
	private WebElement caste;

	public void verifyCaste() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(caste));
		Assert.assertTrue(caste.isDisplayed());
		HighlightOnElement(caste);
		Assert.assertTrue(caste.isEnabled());
		SelectVisibleText(caste,"General");
		waitForDomElement();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "rehabilitation type ".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//label[contains(text(),'Rehabilitation type')])[1]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/select")
	private WebElement rehabtype;

	public void verifyRehabilitationType() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(rehabtype));
		Assert.assertTrue(rehabtype.isDisplayed());
		HighlightOnElement(rehabtype);
		Assert.assertTrue(rehabtype.isEnabled());
		SelectVisibleText(rehabtype,"CASH/नकद");
		waitForPageLoad();
		waitForDomElement();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "ehabilitation type ".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//label[contains(text(),'Purpose')])[1]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/textarea")
	private WebElement purpose;

	public void verifyPurpose() throws InterruptedException, EncryptedDocumentException, InvalidFormatException, IOException{
		wait.until(ExpectedConditions.visibilityOf(purpose));
		Assert.assertTrue(purpose.isDisplayed());
		HighlightOnElement(purpose);
		Assert.assertTrue(purpose.isEnabled());
		excel.getExcelData(purpose,"Land Data",2,2);
	}

}
