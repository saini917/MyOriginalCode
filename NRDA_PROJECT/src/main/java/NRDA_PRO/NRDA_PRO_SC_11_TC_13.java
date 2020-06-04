package NRDA_PRO;

import java.awt.AWTException;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_PRO_SC_11_TC_13 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	
	String readPDF="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\DownloadFile\\";
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "print".
	 * @author deepak.saini
	 * @since 2018-05-10
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//button/span[contains(text(),'Print')]")
	private WebElement print;

	public void clickOnPrint() throws EncryptedDocumentException, InvalidFormatException, IOException, InterruptedException, AWTException
	{
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,1200)", "");
		
		wait.until(ExpectedConditions.visibilityOf(print));
		Assert.assertTrue(print.isDisplayed());
		HighlightOnElement(print);
		Assert.assertTrue(print.isEnabled());
		print.click();
		waitForSomeTime();
		Reporter.log("click on print button",true);
		
		File file=new File(readPDF);
		FileInputStream fis=new FileInputStream(file);
		PDFParser parser=new PDFParser(fis);
		parser.parse();
		COSDocument cosdoc=parser.getDocument();
		PDDocument pdDoc=new PDDocument(cosdoc);
		PDFTextStripper strip=new PDFTextStripper();
		String data=strip.getText(pdDoc);
		Reporter.log(data,true);
	}

}
