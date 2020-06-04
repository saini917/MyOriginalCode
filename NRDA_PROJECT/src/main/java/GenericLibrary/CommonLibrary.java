package GenericLibrary;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;
import com.google.common.base.Function;

/**
 * @author deepak.saini
 *
 */
public class CommonLibrary {
	public static WebDriver driver;

	/**************************************************************************************************************/
	/**
	 * waitForPageLoad() is used for wait till the page is loaded.
	 * 
	 * @param driver
	 * @author deepak.saini
	 * @since 2017-06-15
	 */
	/**************************************************************************************************************/
	public void waitForDomElement() {
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.MINUTES);
	}

	/********************************************************************************************************/
	/**
	 * waitForLinkNamePresent() is used for wait till webelement link is present
	 * or not.
	 * 
	 * @param linkName
	 * @param driver
	 * @author deepak.saini
	 * @since 2017-06-15
	 */
	/**********************************************************************************************************/
	public void waitForLinkNamePresent(String linkName) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.linkText(linkName)));
	}

	/************************************************************************************************************/
	/**
	 * waitForPartialLinkPresent() is used for wait till webelement partial link
	 * is present or not.
	 * 
	 * @param partialLinkName
	 * @param driver
	 * @author deepak.saini
	 * @since 2017-06-15
	 */
	/************************************************************************************************************/
	// public void waitForPartialLinkPresent(String partialLinkName)
	// {
	// WebDriverWait wait=new WebDriverWait(driver, 30); //Variable for future
	// use.
	// }

	/************************************************************************************************************/
	/**
	 * waitForXpathPresent() is used for wait till any webelement is present or
	 * not.
	 * 
	 * @param wbxpath
	 * @param driver
	 * @author deepak.saini
	 * @since 2017-06-15
	 */
	/*************************************************************************************************************/
	public void waitForXpathPresent(WebElement wbxpath, WebDriver driver) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.visibilityOf(wbxpath));
	}

	/************************************************************************************************/
	/**
	 * waitForIdPresent() is used for wait till ID of webelement is present or
	 * not
	 * 
	 * @param wbID
	 * @param driver
	 * @author deepak.saini
	 * @since 2017-06-15
	 */
	/****************************************************************************************************/
	public void waitForIdPresent(String wbID) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.id(wbID)));
	}

	/****************************************************************************************************/
	/**
	 * waitForNamePresent() is used for wait till Name of webelement is present
	 * or not
	 * 
	 * @param wbNAME
	 * @param driver
	 * @author deepak.saini
	 * @since 2017-06-15
	 */
	/****************************************************************************************************/
	public void waitForNamePresent(String wbNAME) {
		WebDriverWait wait = new WebDriverWait(driver, 30);
		wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.name(wbNAME)));
	}

	/**************************************************************************************************/
	/**
	 * waitForVisibleElement() is used for wait till element is visible or not
	 * 
	 * @param wbVisibleElement
	 * @param driver
	 * @author deepak.saini
	 * @since 2017-06-15
	 */
	/*******************************************************************************************************/
	public void waitForVisibleElement(String wbVisibleElement) {
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath(wbVisibleElement)));
	}

	/************************************************************************************************************/
	/**
	 * waitForInvisibleElement() is used for wait till element is
	 * invisible/hidden or not.
	 * 
	 * @param wbInvisibleElement
	 * @param driver
	 * @author deepak.saini
	 * @since 2017-06-15
	 */
	/**************************************************************************************************************/
	public void waitForInvisibleElement(String wbInvisibleElement) {
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(wbInvisibleElement)));
	}

	/*************************************************************************************************************/
	/**
	 * waitForIsElementClickable() is used for wait till element is clickable or
	 * not
	 * 
	 * @param wbIsClickable
	 * @param driver
	 * @author deepak.saini
	 * @since 2017-06-15
	 */
	/************************************************************************************************************/
	public void waitForIsElementClickable(WebElement wbIsClickable) {
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.elementToBeClickable(wbIsClickable));
	}

	/************************************************************************************************************/
	/**
	 * verifyText() is used to verify the expected value with the actual value.
	 * 
	 * @param wb
	 * @param expectedMsg
	 * @return
	 * @author deepak.saini
	 * @since 2017-06-15
	 */
	/**********************************************************************************************************/
	public boolean verifyText(WebElement wb, String expectedMsg) {
		boolean flag = false;
		String actMsg = wb.getText();
		if (expectedMsg.equals(actMsg)) {
			flag = true;
			System.out.println("msg is verified==pass");
		} else {
			System.out.println("msg is not verified==fail");
		}
		return flag;
	}

	/****************************************************************************************************/
	/**
	 * acceptAlert() is used to click on "OK" button of the alert pop up.
	 * 
	 * @param driver
	 * @author deepak.saini
	 * @since 2017-06-15
	 */
	/*******************************************************************************************************/
	public void acceptAlert() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.alertIsPresent());
		String alrt = driver.switchTo().alert().getText();
		Alert alert = driver.switchTo().alert();
		alert.accept();
		Reporter.log("Error Message:" + alrt, true);
	}

	/***************************************************************************************************/
	/**
	 * dismissAlert() is used to "CANCEL" button of the alert pop up.
	 * 
	 * @param driver
	 * @author deepak.saini
	 * @since 2017-06-15
	 */
	/******************************************************************************************************/
	public void dismissAlert() {
		WebDriverWait wait = new WebDriverWait(driver, 1000);
		wait.until(ExpectedConditions.alertIsPresent());
		String alrt = driver.switchTo().alert().getText();
		Alert alert = driver.switchTo().alert();
		alert.dismiss();
		Reporter.log("Expected result:" + alrt, true);
	}

	/*******************************************************************************************************/
	/**
	 * getTextAlert() is used to get the textname of the webelement.
	 * 
	 * @param xpath
	 * @param driver
	 * @author deepak.saini
	 * @since 2017-06-15
	 */
	/********************************************************************************************************/
	public void getTextAlert(String xpath) {
		Alert alert = driver.switchTo().alert();
		String alrt = alert.getText();
		System.out.println("WebElement Name:" + alrt);
	}

	/*******************************************************************************************************/
	/**
	 * pageForRefresh() is used to refresh the page
	 * 
	 * @param driver
	 * @author deepak.saini
	 * @since 2017-06-15
	 */
	/******************************************************************************************************/
	public void pageForRefresh(WebDriver driver) {
		driver.navigate().refresh();
	}

	/*******************************************************************************************************/
	/**
	 * deleteAllCookies() is used to delete all cookies.
	 * 
	 * @param driver
	 * @author deepak.saini
	 * @since 2017-06-15
	 */
	/*********************************************************************************************************/
	public static void deleteAllCookies() {
		driver.manage().deleteAllCookies();
	}

	/********************************************************************************************************/
	/**
	 * deleteCookiesName() is used to delete the specified name cookies.
	 * 
	 * @param driver
	 * @param name
	 * @author deepak.saini
	 * @since 2107-06-15
	 */
	/*******************************************************************************************************/
	public void deleteCookiesName(String name) {
		driver.manage().deleteCookieNamed(name);
	}

	/********************************************************************************************************/
	/**
	 * FluentWait class is used for waiting the Webelement in the application
	 * Waiting 50 seconds for an element to be present on the page, checking for
	 * its presence once every 2 seconds.
	 * 
	 * @param driver
	 * @author deepak.saini
	 * @since 2017-06-15
	 */
	/*********************************************************************************************************/
	public void fluentSleepingMode() {
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver);
		wait.withTimeout(50, TimeUnit.SECONDS);
		wait.pollingEvery(2, TimeUnit.SECONDS);
		wait.ignoring(NoSuchElementException.class);
	}

	/*************************************************************************************************/
	/**
	 * windowMaximize() is used to maximize the window of the browser
	 * 
	 * @param driver
	 * @author deepak.saini
	 * @since 2017-06-15
	 */
	/***************************************************************************************************/
	public static void windowMaximize() {
		driver.manage().window().maximize();
	}

	/*************************************************************************************************/
	/**
	 * pageLoadTimeOut() Sets the amount of time to wait for a page load to
	 * complete before throwing an error. If the timeout is negative, page loads
	 * can be indefinite.
	 * 
	 * @author deepak.saini
	 * @since 2017-06-20
	 */
	/*****************************************************************************************************/
	public void pageLoadTimeOut() {
		driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.MINUTES);
	}

	/*****************************************************************************************************/
	/**
	 * setScriptTimeOut() Sets the amount of time to wait for an asynchronous
	 * script to finish execution before throwing an error. If the timeout is
	 * negative, then the script will be allowed to run indefinitely.
	 * 
	 * @author deepak.saini
	 * @since 2017-06-20
	 */
	/****************************************************************************************************/
	public void setScriptTimeOut() {
		driver.manage().timeouts().setScriptTimeout(500, TimeUnit.SECONDS);
	}

	/**
	 * The purpose of this method to sleep for a particular time when the
	 * element is not visible
	 * 
	 * @throws InterruptedException
	 * @author deepak.saini
	 * @since 2017-07-04
	 */
	public static void waitForSomeTime() throws InterruptedException {
		Thread.sleep(3000);
	}

	/****************************************************************************
	 * Purpose:Highlight the element to visible at time of Execution
	 * 
	 * @Author:Sarvesh.Nellore
	 * @param:By element
	 ***************************************************************************/
	public static void HighlightOnElement(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
				"color: blue; border: 2px solid Magenta;");
	}

	/****************************************************************************
	 * Purpose:Highlight the element to visible at time of Execution
	 * 
	 * @Author:Sarvesh.Nellore
	 * @param:By element
	 ***************************************************************************/
	public void HighlightOnElement1(List<WebElement> element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].setAttribute('style', arguments[1]);", element,
				"color: blue; border: 2px solid Magenta;");
	}

	/****************************************************************************
	 * Switch to framr
	 * 
	 * @Author:deepak.saini
	 * @param:By element
	 * @throws InterruptedException
	 ***************************************************************************/
	public void switchToFrame(WebElement element) {
		driver.switchTo().frame(element);
	}

	/****************************************************************************
	 * Switch from frame to window
	 * 
	 * @Author:deepak.saini
	 * @param:By element
	 * @throws InterruptedException
	 ***************************************************************************/
	public void switchFrameToMainWindow() {
		driver.switchTo().defaultContent();
	}

	/****************************************************************************
	 * Purpose:Highlight the element to visible at time of Execution
	 * 
	 * @Author:Sarvesh.Nellore
	 * @param:By element
	 * @throws InterruptedException
	 ***************************************************************************/

	public void SelectVisibleText(WebElement element, String locatortext) throws InterruptedException {
		try {
			HighlightOnElement(element);
			Select se = new Select(element);
			List<WebElement> list = se.getOptions();
			Reporter.log("Values:", true);
			waitForSomeTime();
			for (int index = 1; index < list.size(); index++) {
				String s1 = list.get(index).getText();
				Reporter.log(s1, true);
				if (s1.trim().equalsIgnoreCase(locatortext)) {
					se.selectByVisibleText(locatortext);
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/****************************************************************************
	 * Purpose:Highlight the element to visible at time of Execution
	 * 
	 * @Author:Sarvesh.Nellore
	 * @param:By element
	 * @throws InterruptedException
	 ***************************************************************************/
	public void SelectByIndex(WebElement element, String locatorIndex) throws InterruptedException {
		try {
			HighlightOnElement(element);
			Select se = new Select(element);
			List<WebElement> list = se.getOptions();
			for (int index = 0; index < list.size(); index++) {
				String s1 = list.get(index).getText();
				if (s1.trim().equalsIgnoreCase(locatorIndex)) {
					se.selectByIndex(index);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	/****************************************************************************
	 * Purpose:Highlight the element to visible at time of Execution
	 * 
	 * @Author:Sarvesh.Nellore
	 * @param:By element
	 * @throws InterruptedException
	 ***************************************************************************/
	public void SelectByValue(WebElement element, String locatorValue) throws InterruptedException {
		try {
			HighlightOnElement(element);
			Select se = new Select(element);
			se.selectByValue(locatorValue);
			List<WebElement> list = se.getOptions();
			for (int index = 0; index < list.size(); index++) {
				String s1 = list.get(index).getText();
				if (s1.trim().equalsIgnoreCase(locatorValue)) {
					se.selectByValue(locatorValue);
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		Thread.sleep(10000);
	}

	/****************************************************************************
	 * Purpose:Boostrap Dropdown
	 * 
	 * @Author:Sarvesh.Nellore
	 * @param:By element
	 * @throws InterruptedException
	 ***************************************************************************/
	public void selectValueFromDropdown(String locateValue) throws InterruptedException {
		List<WebElement> selectallvalue = driver.findElements(By.xpath(
				"//ul[@class='ui-selectonemenu-items ui-selectonemenu-list ui-widget-content ui-widget ui-corner-all ui-helper-reset']/li"));
		try {
			for (int i = 1; i < selectallvalue.size(); i++) {
				WebElement Allelement = selectallvalue.get(i);
				String listofelement = Allelement.getText();
				/* Reporter.log(listofelement,true); */
				if (listofelement.trim().equalsIgnoreCase(locateValue)) {
					Allelement.click();
					break;
				}

			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * To upload file
	 * 
	 * @param filepath
	 * @throws AWTException
	 * @author suresh.nellore
	 */

	public void UpLoadFile(String filepath) throws AWTException {
		StringSelection stringselection = new StringSelection(filepath);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringselection, null);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	/****************************************************************************
	 * Purpose:Check Textbox Field Empty OR Not
	 * 
	 * @Author:Sarvesh.Nellore
	 * @param:By element
	 * @throws InterruptedException
	 ***************************************************************************/
	public void VerifyTextField(WebElement element) throws InterruptedException {
		waitForSomeTime();
		HighlightOnElement(element);
		if (element.getAttribute("value").isEmpty()) {
			Reporter.log("TexyBox Is Empty", true);

		} else {
			// Store the value
			HighlightOnElement(element);
			String TextBox = element.getAttribute("value");
			System.out.println("Textbox Value Is:=  " + TextBox);
			waitForSomeTime();
			waitForSomeTime();
		}

	}

	public String getValueFromDropDown(WebElement element) {
		List<WebElement> options = new Select(element).getOptions();
		for (WebElement option : options) {
			HighlightOnElement(option);
			String DropdownValues = option.getText();
			Reporter.log(DropdownValues, true);
		}

		return null;
	}

	public void ScroolDown() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,450)", "");
	}

	public void ScroolUp() {
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,-450)", "");
	}

	public void waitForelementPresent(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 50);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	// Generating Alert

	public void CaptchaAlertandAccept() throws InterruptedException {
		// Generating Alert Using Javascript Executor
		JavascriptExecutor javascript = (JavascriptExecutor) driver;
		javascript.executeScript("alert('Please Enter Captcha..');");
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
	}

	public void fluentWait(WebElement element) {
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver).withTimeout(240, TimeUnit.SECONDS)
				.pollingEvery(5, TimeUnit.SECONDS).ignoring(NoSuchElementException.class);

		wait.until(new Function<WebDriver, WebElement>() {
			public WebElement apply(WebDriver driver) {
				if (element.isDisplayed() == true) {
					return element;
				} else {
					Reporter.log("unable to find out elment", true);
				}
				return null;
			}
		});
	}

	// For Visibility of element

	@SuppressWarnings("unchecked")
	public void isElementNotDisplayed(final WebElement elementId, final int timeoutInSeconds) {
		try {
			@SuppressWarnings("rawtypes")
			ExpectedCondition condition = new ExpectedCondition<Boolean>() {
				@Override
				public Boolean apply(final WebDriver webDriver) {
					WebElement element = elementId;
					return !element.isDisplayed();
				}
			};
			Wait a = new WebDriverWait(driver, timeoutInSeconds);
			a.until(condition);
		} catch (Exception ex) {
			System.out.println("Exception Is:" + ex);
			// if it gets here it is because the element is still displayed
			// after timeoutInSeconds
			// insert code most suitable for you
		}
		return;
	}

	// fluemt Wait

	public WebElement fluientWaitforElement(WebElement element, int timoutSec, int pollingSec) {

		FluentWait<WebDriver> fWait = new FluentWait<WebDriver>(driver).withTimeout(timoutSec, TimeUnit.SECONDS)
				.pollingEvery(pollingSec, TimeUnit.SECONDS)
				.ignoring(NoSuchElementException.class, TimeoutException.class)
				.ignoring(StaleElementReferenceException.class);

		for (int i = 0; i < 2; i++) {
			try {
				// fWait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//*[@id='reportmanager-wrapper']/div[1]/div[2]/ul/li/span[3]/i[@data-original--title='We
				// are processing through trillions of data events, this insight
				// may take more than 15 minutes to complete.']")));
				fWait.until(ExpectedConditions.visibilityOf(element));
				fWait.until(ExpectedConditions.elementToBeClickable(element));
			} catch (Exception e) {

				System.out.println("Element Not found trying again - " + element.toString().substring(70));
				e.printStackTrace();

			}
		}

		return element;
	}

	// Get The Current Date from calender
	public String getCalenderCurrentDate() {
		// Create a Calendar Object
		Calendar calendar = Calendar.getInstance(TimeZone.getDefault());

		// Get Current Date as a number
		int todayIntdate = calendar.get(Calendar.DAY_OF_MONTH);
		String todaydate = Integer.toString(todayIntdate);
		return todaydate;
	}

	public Date yesterday() {
		final Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -1);
		return cal.getTime();
	}

	public String getYesterdayDateString() {
		DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
		return dateFormat.format(yesterday());
	}

	public void submit(WebElement element) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed());
		HighlightOnElement(element);
		Assert.assertTrue(element.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		waitForDomElement();
	}

	public void update(WebElement element) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed());
		HighlightOnElement(element);
		Assert.assertTrue(element.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		waitForPageLoad();
		waitForDomElement();
	}

	public void back(WebElement element) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		Assert.assertTrue(element.isDisplayed());
		HighlightOnElement(element);
		Assert.assertTrue(element.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		waitForPageLoad();
		waitForDomElement();
	}

	public void reset(WebElement element) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed());
		HighlightOnElement(element);
		Assert.assertTrue(element.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		waitForPageLoad();
		waitForDomElement();
	}

	public void close(WebElement element) throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, 100);
		wait.until(ExpectedConditions.visibilityOf(element));
		Assert.assertTrue(element.isDisplayed());
		HighlightOnElement(element);
		Assert.assertTrue(element.isEnabled());
		wait.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
		pageLoadTimeOut();
		pageLoadTimeOut();
		waitForDomElement();
		waitForDomElement();
		waitForDomElement();
		waitForDomElement();
	}

	public void waitForPageLoad() {
		ExpectedCondition<Boolean> expectation = new ExpectedCondition<Boolean>() {
			public Boolean apply(WebDriver driver) {
				return ((JavascriptExecutor) driver).executeScript("return document.readyState").toString()
						.equals("complete");
			}
		};
		try {
			waitForSomeTime();
			WebDriverWait wait = new WebDriverWait(driver, 30);
			wait.until(expectation);
		} catch (Throwable error) {
			Assert.fail("Timeout waiting for Page Load Request to complete.");
		}
	}

}
