package NRDA_PRO;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.log4j.Logger;
import org.apache.pdfbox.cos.COSDocument;
import org.apache.pdfbox.pdfparser.PDFParser;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.util.PDFTextStripper;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import GenericLibrary.CommonLibrary;
import GenericLibrary.ExcelDataDriver;

public class NRDA_PRO_SC_09_TC_07 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	ExcelDataDriver excel=new ExcelDataDriver();
	String readPDF="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\DownloadFile";
	
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "invoice bill download ".
	 * @author deepak.saini
	 * @since 2018-04-18
	 */
	/*****************************************************************************************************/
	
	@FindBy(xpath="//label[contains(text(),'Download Invoice')]/../following-sibling::td/a/img")
	private WebElement invoicebill;
	
	public void clickOnDownloadInvoice() throws InterruptedException, IOException
	{
		wait.until(ExpectedConditions.elementToBeClickable(invoicebill));
		Assert.assertTrue(invoicebill.isDisplayed());
		HighlightOnElement(invoicebill);
		Assert.assertTrue(invoicebill.isEnabled());
		invoicebill.click();
		waitForSomeTime();
		
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
