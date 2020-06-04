package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC006 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Application form link".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//form)[2]/div/div[1]/div/ul/li/a/span[contains(text(),'Application Form')]")
	private WebElement appformlink;

	public void clickOnApplicationFormLink() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(appformlink));
		Assert.assertTrue(appformlink.isDisplayed());
		HighlightOnElement(appformlink);
		Assert.assertTrue(appformlink.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(appformlink));
		appformlink.click();
		waitForDomElement();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "land section".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//a[contains(text(),'Land Section')])[2]")
	private WebElement landsection;

	public void verifyLandSection(){
		Assert.assertTrue(landsection.isDisplayed());
		HighlightOnElement(landsection);
	}


}
