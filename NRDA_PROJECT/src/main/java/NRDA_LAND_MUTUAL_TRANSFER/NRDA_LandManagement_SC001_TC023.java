package NRDA_LAND_MUTUAL_TRANSFER;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC001_TC023 extends CommonLibrary{
	ExcelDataDriver excel=new ExcelDataDriver();
	WebDriverWait wait=new WebDriverWait(driver,100);
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "search by".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Search By')]/ancestor::td/following-sibling::td/descendant::table/tbody/tr/td/a/img")
	private WebElement searchby;
	
	public void clickOnSearchBy() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(searchby));
		Assert.assertTrue(searchby.isDisplayed());
		HighlightOnElement(searchby);
		Assert.assertTrue(searchby.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(searchby));
		searchby.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "state".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Select State')]/following-sibling::div/div/span")
	private WebElement state;
	
	public void selectState() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(state));
		Assert.assertTrue(state.isDisplayed());
		HighlightOnElement(state);
		Assert.assertTrue(state.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(state));
		state.click();
		selectValueFromDropdown("Chattisgarh");
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "district".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Select District')]/following-sibling::div/div/span")
	private WebElement district;
	
	public void selectDistrict() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(district));
		Assert.assertTrue(district.isDisplayed());
		HighlightOnElement(district);
		Assert.assertTrue(district.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(district));
		district.click();
		selectValueFromDropdown("RAIPUR");
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "city".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Select City')]/following-sibling::div/div/span")
	private WebElement city;
	
	public void selectCity() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(city));
		Assert.assertTrue(city.isDisplayed());
		HighlightOnElement(city);
		Assert.assertTrue(city.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(city));
		city.click();
		selectValueFromDropdown("ARANG");
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "search by bank name".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Search By')]/following-sibling::div/div/span")
	private WebElement searchbankname;
	
	public void serachByBankName() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(searchbankname));
		Assert.assertTrue(searchbankname.isDisplayed());
		HighlightOnElement(searchbankname);
		Assert.assertTrue(searchbankname.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(searchbankname));
		searchbankname.click();
		selectValueFromDropdown("Bank Name");
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "bank name".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Select Bank Name')]/following-sibling::div/div/span")
	private WebElement bankname;
	
	public void selectBankName() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(bankname));
		Assert.assertTrue(bankname.isDisplayed());
		HighlightOnElement(bankname);
		Assert.assertTrue(bankname.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(bankname));
		bankname.click();
		selectValueFromDropdown("BANK OF BARODA");
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "bank branch".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="//label[contains(text(),'Select Bank Branch')]/following-sibling::div/div/span")
	private WebElement bankbranch;
	
	public void selectBankBranch() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(bankbranch));
		Assert.assertTrue(bankbranch.isDisplayed());
		HighlightOnElement(bankbranch);
		Assert.assertTrue(bankbranch.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(bankbranch));
		bankbranch.click();
		selectValueFromDropdown("ARANG, CHHATTISGARH");
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "fill in form".
	 * @author deepak.saini
	 * @since 2018-05-30
	 */
	/****************************************************************************************************/
	@FindBy(xpath="(//button/descendant::span[contains(text(),'Fill in Form')])[2]")
	private WebElement fillinform;
	
	public void clickOnFillInForm() throws InterruptedException{
		wait.until(ExpectedConditions.visibilityOf(fillinform));
		Assert.assertTrue(fillinform.isDisplayed());
		HighlightOnElement(fillinform);
		Assert.assertTrue(fillinform.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(fillinform));
		fillinform.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForDomElement();
	}


}
