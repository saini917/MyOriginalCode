package NRDA_Plumber;

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

public class ToVerifyPlumberRegistration_SC_02_TC_02 extends CommonLibrary
{
	Logger log=Logger.getLogger("devpinoyLogger");
	WebDriverWait wait=new WebDriverWait(driver,10);
	
	String readPDF="C:\\ILFS\\NRDA\\workspace\\NRDA_FRAMEWORK\\NRDA_PROJECT\\DownloadFile\\PLUMBER_REGISTRATION.pdf";
	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "click on PDF file".
	 * @author deepak.saini
	 * @since 2018-01-11
	 */
	/*****************************************************************************************************/
	@FindBy(xpath="//td[@class='rightColWithLeftPad']/span/table/tbody/tr/td/div/h3/a[contains(text(),'WATER AND SEWERAGE SECTION')]/preceding-sibling::span/../following-sibling::div/table/tbody/tr/td[1]/span[contains(text(),'PLUMBER REGISTRATION')]/../following-sibling::td[@class='c2']/span/a/img[@src='/NRDAuthority/javax.faces.resource/pdf.png.xhtml?ln=img']")
	private WebElement pdffile;
	
	public void readPDFfile() throws IOException, InterruptedException
	{
		wait.until(ExpectedConditions.visibilityOf(pdffile));
		wait.until(ExpectedConditions.elementToBeClickable(pdffile));
		Assert.assertTrue(pdffile.isDisplayed());
		HighlightOnElement(pdffile);
		Assert.assertTrue(pdffile.isEnabled());
		pdffile.click();
		waitForSomeTime();
		
		
		File file=new File(readPDF);
		FileInputStream fis=new FileInputStream(file);
		PDFParser parser=new PDFParser(fis);
		parser.parse();
		COSDocument cosdoc=parser.getDocument();
		PDDocument pdDoc=new PDDocument(cosdoc);
		PDFTextStripper strip=new PDFTextStripper();
		String data=strip.getText(pdDoc);
		Reporter.log("User should be able to view various fields in offline / PDF File download form for Registeration i.e \n" +data,true);
	}

}
