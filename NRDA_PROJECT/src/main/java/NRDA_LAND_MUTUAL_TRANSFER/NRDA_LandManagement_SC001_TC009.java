package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC009 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select khasra ".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Select khasra')]")
	private WebElement selectkhasra;
	
	public void clickOnKhasraNum() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(selectkhasra));
		Assert.assertTrue(selectkhasra.isDisplayed());
		HighlightOnElement(selectkhasra);
		Assert.assertTrue(selectkhasra.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(selectkhasra));
		selectkhasra.click();
		waitForPageLoad();
		waitForDomElement();
	}
	

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select tehsil name ".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Select Tehsil Name')]/following-sibling::div/div/span")
	private WebElement selecttehsilname;
	
	public void selectTehsilName() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(selecttehsilname));
		Assert.assertTrue(selecttehsilname.isDisplayed());
		HighlightOnElement(selecttehsilname);
		Assert.assertTrue(selecttehsilname.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(selecttehsilname));
		selecttehsilname.click();
		selectValueFromDropdown("आरंग");
		waitForPageLoad();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select village name ".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Select Village Name')]/following-sibling::div/div/span")
	private WebElement selectvillagename;
	
	public void selectVillageName() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(selectvillagename));
		Assert.assertTrue(selectvillagename.isDisplayed());
		HighlightOnElement(selectvillagename);
		Assert.assertTrue(selectvillagename.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(selectvillagename));
		selectvillagename.click();
		selectValueFromDropdown("कुहेरा");
		waitForPageLoad();
		waitForDomElement();
	}

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "select khasra number ".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Select Khasra No')]/following-sibling::div/div/span")
	private WebElement selectkhasrano;
	
	public void selectKhasraNo() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(selectkhasrano));
		Assert.assertTrue(selectkhasrano.isDisplayed());
		HighlightOnElement(selectkhasrano);
		Assert.assertTrue(selectkhasrano.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(selectkhasrano));
		selectkhasrano.click();
		selectValueFromDropdown("510");
		waitForPageLoad();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "fill in form".
	 * @author deepak.saini
	 * @since 2018-05-28
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/span[contains(text(),'Fill in Form')])[1]")
	private WebElement fillinform;
	
	public void clickOnFillInForm() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(fillinform));
		Assert.assertTrue(fillinform.isDisplayed());
		HighlightOnElement(fillinform);
		Assert.assertTrue(fillinform.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(fillinform));
		fillinform.click();
		waitForPageLoad();
		waitForDomElement();
	}

}
