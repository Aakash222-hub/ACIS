package com.acis.automation.pages.providermanagement;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class NewOrientationEventPage extends PageBase {

	public NewOrientationEventPage() throws AcisException {
		// TODO Auto-generated constructor stub

		super();
	}

	public static Logger logger = LoggerFactory.getLogger(NewOrientationEventPage.class);

	/* Varun.krish */

	@FindBy(xpath = "//*[@title='Show Navigation Menu']")
	WebElement showNavigationMenu;

	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Events']")
	WebElement events;

	@FindBy(xpath = "//DIV[@title='New'][text()='New']")
	WebElement newbtn;

	@FindBy(xpath = "//DIV[@title='New Orientation Event'][text()='New Orientation Event']")
	WebElement newOrientationEventbtn;

	@FindBy(xpath = "//*[text()='Orientation']")
	WebElement ortientationRadiobtn;

	@FindBy(xpath = "//SPAN[@class=' label bBody'][text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "//H2[@records-lwcdetailpanel_lwcdetailpanel=''][text()='New Event: Orientation']")
	WebElement newEventortientationTitle;

	@FindBy(xpath = "//BUTTON[text()='Save']")
	WebElement saveBtn;

	@FindBy(xpath = "//span[text()='Submit']")
	WebElement submitBtn;

	
	@FindBy(xpath = "//*[@class='fieldLevelErrors']")
	WebElement fieldErrorMessage;

	@FindBy(xpath = "(//*[text()='Date/Time']/../..//input[@type='text'])[1]")
	WebElement dateTime;

	@FindBy(xpath = "//*[text()=30]")
	WebElement day;

	@FindBy(xpath = "//span[@class='slds-checkbox_faux']")
	WebElement activeCheckbox;

	@FindBy(xpath = "//*[text()=1]")
	WebElement day1;

	@FindBy(xpath = "//*[text()='Street 1']/../../..//input")
	WebElement street1;

	@FindBy(xpath = "//*[text()='City']/../../..//input")
	WebElement city;

	@FindBy(xpath = "//*[text()='Zip/Postal Code']/../../..//input")
	WebElement zipcode;

	@FindBy(xpath = "//*[text()='State/Territory']/../../..//input")
	WebElement state;

	@FindBy(xpath = "//*[text()='State/Territory']/../../..//Span[text()='AR']")
	WebElement stateAr;

	@FindBy(xpath = "//*[text()='State/Territory']/.././/Span[text()='IN']")
	WebElement stateIN;

	@FindBy(xpath = "//*[text()='Previous Month']")
	WebElement previousMonth;

	@FindBy(xpath = "//*[text()='Phone']//../..//input")
	WebElement phone;

	@FindBy(xpath = "//*[text()='Email']//../..//input")
	WebElement email;

	@FindBy(xpath = "//LIGHTNING-FORMATTED-TEXT[text()='Orientation']")
	WebElement orientation;

	@FindBy(xpath = "(//a[@title='Select List View'])[1]")
	WebElement listView;

	@FindBy(xpath = "(//a[@title='Select List View'])[2]")
	WebElement listView1;

	@FindBy(xpath = "(//span[normalize-space()='All'] )[1]")
	WebElement selectAllEvents;

	@FindBy(xpath = "//button[@name='Edit']")
	WebElement edit;

	@FindBy(xpath = "(//span[normalize-space()='All'] )[2]")
	WebElement selectAllEvents1;
	Actions key = new Actions(driver);

	/*
	 * Verify Events from Dropdown
	 * 
	 * @author Varun.Krish
	 * 
	 * @throws AcisException
	 */

	public void selectEventsDropDown() throws AcisException {
		logger.info("Drown Arrow from Navigation Menu");
		waitForPageLoadTill(10);
		waitForElement(showNavigationMenu);
		clickWebElement(showNavigationMenu);
		waitForPageLoadTill(5);
		logger.info("Select the Events from Dropdown");
		waitForElement(events);
		clickWebElement(events);

	}

	/**
	 * Select : All Event
	 * 
	 * @author priyanka
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void selectAllEvent() throws AcisException {
		logger.info("Clicking on Select List View");
		waitForPageLoadTill(5);
		try {

			clickWebElement(listView);
		} catch (Exception e1) {
			clickWebElement(listView1);
		}
		logger.info("Clicked on Select List View");
		waitForPageLoadTill(5);
		logger.info("Selecting All from Select List View");
		try {

			clickWebElement(selectAllEvents);
		} catch (Exception e) {
			waitForElementClickable(selectAllEvents1);
			clickWebElement(selectAllEvents1);
		}
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Selected All from Select List View");
		waitForPageLoadTill(5);

	}

	/*
	 * Click on the New button
	 * 
	 * @author Varun.Krish
	 * 
	 * @throws AcisException
	 */

	public void clickonNewbtn() throws AcisException {
		logger.info("Clicking on New Button from Homepage");
		waitForPageLoadTill(10);
		waitForElement(newbtn);
		clickWebElement(newbtn);
		waitForPageLoadTill(10);
		logger.info("Clicked on New Button from Homepage");
	}

	/*
	 * Verify new button is displayed or not
	 * 
	 * @author priyanka
	 * 
	 * @throws AcisException
	 */
	public void verifyNewbtn() throws AcisException {
		logger.info("Verify New Button is displayed or not");
		waitForPageLoadTill(10);
		List<WebElement> elements = driver.findElements(By.xpath("//DIV[@title='New'][text()='New']"));
		// verifyElementNotPresent(newbtn);
		if (elements.size() > 0) {

			logger.info("Verified New Button is displayed");
		} else {
			logger.info("Verified New Button is not displayed");
		}
	}
	/*
	 * Click on the New Orientation button
	 * 
	 * @author priyanka
	 * 
	 * @throws AcisException
	 */

	public void clickonNewOrientationEventbtn() throws AcisException {
		logger.info("Clicking on New Orientation Event Button from Homepage");
		waitForPageLoadTill(10);
		waitForElement(newOrientationEventbtn);
		clickWebElement(newOrientationEventbtn);
		waitForPageLoadTill(10);
		logger.info("Clicked on New Orientation Event Button from Homepage");
	}

	/*
	 * Click on the select Orientation RadioButton
	 * 
	 * @author Varun.Krish
	 * 
	 * @throws AcisException
	 */

	public void selectOrientationRadioButton() throws AcisException {
		logger.info("Selecting Provider Agency Radio Button");
		waitForElement(ortientationRadiobtn);
		clickWebElement(ortientationRadiobtn);
		clickWebElement(nextButton);
		logger.info("Selected Provider Agency Radio Button");
	}

	/*
	 * Verify the Mandatory Fields
	 * 
	 * @author Varun.Krish
	 * 
	 * @throws AcisException
	 */

	public void verifyMandatoryFields() throws AcisException {
		logger.info("Verifying the Mandatory Field");
		waitForPageLoadTill(10);
		waitForElement(newEventortientationTitle);
		verifyElementNotPresent(newEventortientationTitle);
		waitForElement(saveBtn);
		clickWebElement(saveBtn);
		waitForElement(fieldErrorMessage);
		clickWebElement(fieldErrorMessage);
		verifyElementNotPresent(fieldErrorMessage);
		fieldErrorMessage.getText();
		verifyTextEquals(fieldErrorMessage,
				"Review the following fields Date/Time Street 1 City State/Territory Zip/Postal Code");
		waitForPageLoadTill(10);
		key.sendKeys(Keys.ESCAPE).build().perform();

	}

	/*
	 * Verify the Valid Zip code
	 * 
	 * @author Varun.Krish
	 * 
	 * @throws AcisException
	 */

	public void verifyValidZipcode(String street, String cityname, String code) throws AcisException {
		logger.info("Enter the Date");
		waitForPageLoadTill(10);
		waitForElement(dateTime);
		clickWebElement(dateTime);
		clickWebElement(day);
		logger.info("Enter the Street Name");
		scrollingToElementofAPage(street1);
		waitForElement(street1);
		clickWebElement(street1);
		enterText(street1, street);
		logger.info("Enter the City");
		waitForElement(city);
		clickWebElement(city);
		enterText(city, cityname);
		waitForElement(city);
		clickWebElement(city);
		logger.info("Enter the State");
		waitForElement(state);
		clickWebElement(state);
		waitForElement(stateAr);
		clickWebElement(stateAr);
		logger.info("Enter the Zipcode");
		waitForElement(zipcode);
		clickWebElement(zipcode);
		enterText(zipcode, code);
		waitForElement(saveBtn);
		clickWebElement(saveBtn);
		waitForPageLoadTill(10);
		waitForElement(fieldErrorMessage);
		clickWebElement(fieldErrorMessage);
		verifyElementNotPresent(fieldErrorMessage);
		fieldErrorMessage.getText();
		verifyTextEquals(fieldErrorMessage, "Review the following fields Zip/Postal Code");
		waitForPageLoadTill(10);
		key.sendKeys(Keys.ESCAPE).build().perform();
		refreshPage();
		driver.switchTo().alert().accept();

	}

	/*
	 * Verify the IN as Default State
	 * 
	 * @author Varun.Krish
	 * 
	 * @throws AcisException
	 */

	public void verifyDefaultsate(String Statename) throws AcisException {
		logger.info("Verifying Default state as IN");
		waitForElement(state);
		clickWebElement(state);
		waitForElement(stateIN);
		verifyElementNotPresent(stateIN);
		verifyTextEquals(stateIN, Statename);

	}

	/*
	 * Verify the Valid Phone Number
	 * 
	 * @author Varun.Krish
	 * 
	 * @throws AcisException
	 */

	public void verifyvalidphoneNumber(String street, String cityname, String code, String Phoneno)
			throws AcisException {
		logger.info("Enter the Date");
		waitForPageLoadTill(10);
		waitForElement(dateTime);
		clickWebElement(dateTime);
		clickWebElement(day);
		logger.info("Enter the Street Name");
		scrollingToElementofAPage(street1);
		waitForElement(street1);
		clickWebElement(street1);
		enterText(street1, street);
		logger.info("Enter the City");
		waitForElement(city);
		clickWebElement(city);
		enterText(city, cityname);
		logger.info("Enter the State");
		waitForElement(state);
		clickWebElement(state);
		waitForElement(stateAr);
		clickWebElement(stateAr);
		logger.info("Enter the Zipcode");
		waitForElement(zipcode);
		clickWebElement(zipcode);
		enterText(zipcode, code);
		logger.info("Enter the phone");
		scrollingToElementofAPage(phone);
		waitForElement(phone);
		clickWebElement(phone);
		enterText(phone, Phoneno);
		waitForElement(saveBtn);
		clickWebElement(saveBtn);
		waitForPageLoadTill(10);
		waitForElement(fieldErrorMessage);
		clickWebElement(fieldErrorMessage);
		verifyElementNotPresent(fieldErrorMessage);
		fieldErrorMessage.getText();
		verifyTextEquals(fieldErrorMessage, "Review the following fields Phone");
		waitForPageLoadTill(10);
		refreshPage();
		driver.switchTo().alert().accept();

	}

	/*
	 * Verify the Valid Email
	 * 
	 * @author Varun.Krish
	 * 
	 * @throws AcisException
	 */

	public void verifyValidEmail(String street, String cityname, String code, String Phoneno, String mail)
			throws AcisException {

		waitForPageLoadTill(10);
		waitForElement(dateTime);
		clickWebElement(dateTime);
		clickWebElement(day);
		scrollingToElementofAPage(street1);
		waitForElement(street1);
		clickWebElement(street1);
		enterText(street1, street);
		waitForElement(city);
		clickWebElement(city);
		enterText(city, cityname);
		waitForElement(city);
		clickWebElement(city);
		waitForElement(state);
		clickWebElement(state);
		waitForElement(stateAr);
		clickWebElement(stateAr);
		waitForElement(zipcode);
		clickWebElement(zipcode);
		enterText(zipcode, code);
		scrollingToElementofAPage(email);
		waitForElement(email);
		clickWebElement(email);
		enterText(email, mail);
		waitForElement(saveBtn);
		clickWebElement(saveBtn);
		waitForPageLoadTill(10);
		waitForElement(fieldErrorMessage);
		clickWebElement(fieldErrorMessage);
		verifyElementNotPresent(fieldErrorMessage);
		fieldErrorMessage.getText();
		waitForPageLoadTill(10);
		key.sendKeys(Keys.ESCAPE).build().perform();
		refreshPage();
		driver.switchTo().alert().accept();
	}

	public void titleVerification(String street, String cityname, String code) throws AcisException {
		logger.info("Enter the Date");
		waitForPageLoadTill(10);
		waitForElement(dateTime);
		clickWebElement(dateTime);
		clickWebElement(day);
		logger.info("Enter the Street Name");
		scrollingToElementofAPage(street1);
		waitForElement(street1);
		clickWebElement(street1);
		enterText(street1, street);
		logger.info("Enter the City");
		waitForElement(city);
		clickWebElement(city);
		enterText(city, cityname);
		waitForElement(city);
		clickWebElement(city);
		logger.info("Enter the State");
		waitForElement(state);
		clickWebElement(state);
		waitForElement(stateAr);
		clickWebElement(stateAr);
		logger.info("Enter the Zipcode");
		waitForElement(zipcode);
		clickWebElement(zipcode);
		enterText(zipcode, code);
		waitForElement(saveBtn);
		clickWebElement(saveBtn);
		waitForPageLoadTill(10);
		waitForElement(orientation);
		verifyElementNotPresent(orientation);

	}

	/*
	 * Enter Mandatory Field New Orientation Event
	 * 
	 * @author priyanka
	 * 
	 * @throws AcisException
	 */
	public void EnterMandatoryFieldNewOrientationEvent(String street, String cityname, String code)
			throws AcisException {
		logger.info("Enter the Date");
		waitForPageLoadTill(10);
		waitForElement(dateTime);
		clickWebElement(dateTime);
		clickWebElement(day);
		logger.info("Enter the Street Name");
		scrollingToElementofAPage(street1);
		waitForElement(street1);
		clickWebElemntUsingJavascriptExecutor(street1);
//		clickWebElement(street1);
		enterText(street1, street);
		logger.info("Enter the City");
		waitForElement(city);
		clickWebElemntUsingJavascriptExecutor(city);
		enterText(city, cityname);
		logger.info("Enter the State");
		waitForElement(state);
		clickWebElemntUsingJavascriptExecutor(state);
		waitForElement(stateAr);
		clickWebElement(stateAr);
		logger.info("Enter the Zipcode");
		waitForElement(zipcode);
		clickWebElemntUsingJavascriptExecutor(zipcode);
		enterText(zipcode, code);
		waitForElement(submitBtn);
		clickWebElemntUsingJavascriptExecutor(submitBtn);
		waitForPageLoadTill(10);

	}

	/*
	 * Edit Date As Past date and verify Active Checkbox field
	 * 
	 * @author priyanka
	 * 
	 * @throws AcisException
	 */
	public void EditDateAndVerityActiveCheckbox() throws AcisException {
		logger.info("Clicking on Edit button");
		waitForElement(edit);
		clickWebElement(edit);
		logger.info("Clicked on Edit button");
		waitForPageLoadTill(10);
		logger.info("Entering past date");
		scrollingToElementofAPage(dateTime);
		waitForElement(dateTime);
		clickWebElement(dateTime);
		clickWebElement(day1);
		logger.info("Entered past date");
		logger.info("Clicking on Save");
		waitForElement(saveBtn);
		clickWebElement(saveBtn);
		logger.info("Clicked on Save");
		waitForPageLoadTill(10);
		logger.info("Verifying Active checkbox is unchecked/checked for past date event");
		Boolean isCheckboxSelected = activeCheckbox.isSelected();
		Boolean Expected = false;
		int result = Boolean.compare(isCheckboxSelected, Expected);
		if (result == 0) {
			logger.info("Verified Active checkbox is unchecked for past date event");
		} else {
			logger.info("Verified Active checkbox is checked for past date event");
		}
	}
}