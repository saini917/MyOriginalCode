package com.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.utility.CommonLib;

public class LoginPage extends CommonLib {

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "Textbox of String".
	 * @author deepak.saini 
	 * @since 2020-02-26
	 */
	/****************************************************************************************************/
	@FindBy(id = "txtUserName")
	private WebElement userString;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "submit button". 
	 * @author deepak.saini 
	 * @since 2020-02-26
	 */
	/****************************************************************************************************/
	@FindBy(id = "Submit")
	private WebElement submit;

	/****************************************************************************************************/
	/*
	 * This is the xpath of the WebElement "output capture".
	 * @author deepak.saini
	 * @since 2020-02-26
	 */
	/****************************************************************************************************/
	//@FindBy(xpath = "//input[contains(text(),'abc')]")
	@FindBy(xpath = "//div[contains(text(),'Output is:')]/following-sibling::label)")
	private WebElement output;
	
	
	/****************************************************************************************************/
	/*
	 * This method enter the value in the textbox ".
	 * @author deepak.saini
	 * @since 2020-02-26
	 */

	public void enterString() {

		// This is for longest substring without repeating characters
		String str = "abcabcbb";
		String characters = "";
		String duplicates = "";
		for (int i = 0; i < str.length(); i++) {
			String current = Character.toString(str.charAt(i));
			if (characters.contains(current)) {
				if (!duplicates.contains(current)) {
					duplicates += current;
				}
			}
			characters += current;
		}
		System.out.println(duplicates);
		System.out.println(duplicates.length());
		String text = duplicates;

		userString.sendKeys(text);
		submit.click();
	}
	/*
	 * This method capture the value from the textbox and verify the output".
	 * @author deepak.saini
	 * @since 2020-02-26
	 */

	public void captureOutput() {
		String expected = output.getText();
		String actual = "abc";
		Assert.assertEquals(actual, expected);
	}

}
