package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC005 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,10);



	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application form link".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//form)[2]/div/div[1]/div/ul/li/a/span[contains(text(),'Application Form')]")
	private WebElement appformlink;

	public void verifyApplicationFormLink(){
		Assert.assertTrue(appformlink.isDisplayed());
		HighlightOnElement(appformlink);
	}


}
