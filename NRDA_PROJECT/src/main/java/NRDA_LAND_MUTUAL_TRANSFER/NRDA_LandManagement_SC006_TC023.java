package NRDA_LAND_MUTUAL_TRANSFER;

import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_LandManagement_SC006_TC023 extends CommonLibrary{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,100);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	@FindBy(xpath="(//button/span[contains(text(),'Close')])[1]")
	private WebElement close;
	
	public void clickOnClose() throws InterruptedException{	
		wait.until(ExpectedConditions.visibilityOf(close));
		Assert.assertTrue(close.isDisplayed());
		HighlightOnElement(close);
		Assert.assertTrue(close.isEnabled());
		String currenturl=driver.getCurrentUrl();
		Reporter.log("Current Url: "+currenturl,true);
		wait.until(ExpectedConditions.elementToBeClickable(close));
		close.click();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		waitForPageLoad();
		
		String previousurl=driver.getCurrentUrl();
		Reporter.log("Previous Url: "+previousurl,true);
		
		Assert.assertNotEquals(currenturl,previousurl,"Test case not pass");
		
	}

}
