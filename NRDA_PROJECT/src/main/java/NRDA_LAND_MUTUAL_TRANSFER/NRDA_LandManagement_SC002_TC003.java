package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC002_TC003 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "land my inbox".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/****************************************************************************************************/
	
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/table/tbody/tr/td/form/div/div/div/div/div[3]/div/div/div/div[@class='right-part']/p[contains(text(),'My Inbox')]/following-sibling::span/a")
	private WebElement myinbox;
	
	public void clickOnMyInbox() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(myinbox));
		wait.until(ExpectedConditions.elementToBeClickable(myinbox));
		HighlightOnElement(myinbox);
		Assert.assertTrue(myinbox.isDisplayed());
		Assert.assertTrue(myinbox.isEnabled());
		myinbox.click();
		waitForSomeTime();
		waitForSomeTime();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "land section".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//form)[2]/div/div/h3/a[contains(text(),'Land Section')]/preceding-sibling::span")
	private WebElement landsection;
	
	public void clickOnLandSection() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(landsection));
		HighlightOnElement(landsection);
		Assert.assertTrue(landsection.isDisplayed());
		Assert.assertTrue(landsection.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(landsection));
		landsection.click();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "display".
	 * @author deepak.saini
	 * @since 2018-05-16
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//form)[2]/div/div/h3/a[contains(text(),'Land Section')]/preceding-sibling::span/../following-sibling::div/ul/li/a/span[contains(text(),'APPLICATION FOR LAND MUTUAL TRANSFER')]")
	private WebElement display;
	
	public void verifyDisplay(){
		wait.until(ExpectedConditions.visibilityOf(display));
		HighlightOnElement(display);
		Assert.assertTrue(display.isDisplayed());
	}
	

}
