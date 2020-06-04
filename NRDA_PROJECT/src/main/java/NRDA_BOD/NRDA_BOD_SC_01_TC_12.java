package NRDA_BOD;

import java.io.IOException;
import java.util.List;
import org.apache.log4j.Logger;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_BOD_SC_01_TC_12 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Save As Draft".
	 * @author deepak.saini
	 * @since 2018-03-27
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Save As Draft')])[1]")
	private WebElement saveasdraft;
	
	public void clickOnSaveAsDraft() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(saveasdraft));
		wait.until(ExpectedConditions.elementToBeClickable(saveasdraft));
		Assert.assertTrue(saveasdraft.isDisplayed());
		HighlightOnElement(saveasdraft);
		Assert.assertTrue(saveasdraft.isEnabled());
		saveasdraft.click();
		Reporter.log("Click on Save As Draft Button",true);
		waitForSomeTime();
	}

	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Temporary number".
	 * @author deepak.saini
	 * @since 2018-03-27
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@class='ui-growl-message']/span[contains(text(),'Your application has been saved successfully')]")
	private WebElement tempnum;

	public void getBODTempNumber() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(tempnum));
		waitForSomeTime();
		Assert.assertTrue(tempnum.isDisplayed());
		HighlightOnElement(tempnum);
		String tempno=tempnum.getText();
		String BODid=tempno.substring(51,79);
		Reporter.log("BOD ID:"+BODid,true);
		excel.updateBOD(BODid);//To Store BOD Temporary Number
		waitForSomeTime();
	}
	
	
	
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "chairperson details".
	 * @author deepak.saini
	 * @since 2018-02-14
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb_content']/div/ul/li/a[contains(text(),'Chairperson Details')]")
	private WebElement chairpersondetails;

	public void clickOnChairpersonDetails() throws InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(chairpersondetails));
		wait.until(ExpectedConditions.elementToBeClickable(chairpersondetails));
		Assert.assertTrue(chairpersondetails.isDisplayed());
		HighlightOnElement(chairpersondetails);
		Assert.assertTrue(chairpersondetails.isEnabled());
		chairpersondetails.click();
		Reporter.log("Click on Chairperson Detail Link",true);
		waitForSomeTime();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "display link".
	 * @author deepak.saini
	 * @since 2018-02-14
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//div[@id='form0:Nb']/div/div/div/div[2]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr/td/span/label")
	private List<WebElement> displaylink;
	
	public void verifyDisplayLink()
	{
		Reporter.log("System will display the Following:",true);
		for(WebElement link:displaylink)
		{
			HighlightOnElement(link);
			Assert.assertTrue(link.isDisplayed());
			String list=link.getText();
			Reporter.log(list,true);
		}
	}

}
