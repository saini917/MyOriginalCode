package NRDA_LAND_MUTUAL_TRANSFER;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC007 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Land Section".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//a[contains(text(),'Land Section')])[2]/preceding-sibling::span")
	private WebElement landsection;
	
	public void clickOnLandSection() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(landsection));
		Assert.assertTrue(landsection.isDisplayed());
		HighlightOnElement(landsection);
		Assert.assertTrue(landsection.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(landsection));
		Actions lsection=new Actions(driver);
		lsection.click(landsection).build().perform();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "land mutual transfer".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//a[contains(text(),'Land Section')])[2]/preceding-sibling::span/../following-sibling::div/table/tbody/tr/td[@class='c1']/span[contains(text(),'APPLICATION FOR LAND MUTUAL TRANSFER')]/../following-sibling::td/span/a/img")
	private WebElement landmutualtransfer;
	
	public void clickOnLandMutualTransfer() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(landmutualtransfer));
		Assert.assertTrue(landmutualtransfer.isDisplayed());
		HighlightOnElement(landmutualtransfer);
		Assert.assertTrue(landmutualtransfer.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(landmutualtransfer));
		landmutualtransfer.click();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "proceed button".
	 * @author deepak.saini
	 * @since 2018-05-14
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Proceed')]")
	private WebElement proceed;
	
	public void verifyProceedBtn() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(proceed));
		Assert.assertTrue(proceed.isDisplayed());
		HighlightOnElement(proceed);
	}

}
