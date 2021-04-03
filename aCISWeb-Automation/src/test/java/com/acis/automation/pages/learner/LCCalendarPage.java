package com.acis.automation.pages.learner;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.constants.Constants;
import com.acis.automation.constants.ILMSConstants;
import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;
import com.google.common.collect.Ordering;

/**
 * /** This class is for defining objects of Leaner Center My Courses page and
 * defining methods on those objects.
 * 
 * @author Shahenshaha.Mulani
 * @since 09 APR 2018
 *
 */

public class LCCalendarPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(LCCalendarPage.class);

	public LCCalendarPage() throws AcisException {
	}

	private String description_Error_message = "Description: The field cannot be blank.";
	private String fromDate_Error_message = "End date and time cannot be in the future than start date and time.";

	private String addedEventLocator = "//div[@id='dvEvent']/label[text()='ABC']";
	private String deleteEventButton = "//div[@id='dvEvent']/label[text()='ABC']/../following-sibling::span/a[@title='Delete']";

	@FindBy(xpath = "//a[text()='Calendar']")
	private WebElement tabCalendar;

	@FindBy(id = "AddLink")
	private WebElement btnAddEvent;

	@FindBy(id = "txtDescription")
	private WebElement textDescription;

	private By textDescriptionLocator = By.id("txtDescription");

	@FindBy(xpath = "//input[@id='txtStartDate' and @name='start']")
	private WebElement dateFrom;

	private By dateFromLocator = By.xpath("//input[@id='txtStartDate' and @name='start']");

	@FindBy(xpath = "//input[@id='txtEndDate' and @name='end']")
	private WebElement dateTo;

	private By dateToLocator = By.xpath("//input[@id='txtEndDate' and @name='end']");

	@FindBy(xpath = "//a[text()='Save']")
	private WebElement btnSaveEvent;

	private By btnSaveEventLocator = By.xpath("//a[text()='Save']");

	@FindBy(xpath = "//a[text()='Cancel']")
	private WebElement btnCancelEvent;

	private By btnCancelEventLocator = By.xpath("//a[text()='Cancel']");

	By btnAddEventLocator = By.id("AddLink");

	@FindBy(id = "a_txtDescription_RequiredError")
	private WebElement iconDescriptionError;

	@FindBy(id = "lbl_txtDescription_RequiredError")
	private WebElement errorMessageDecription;

	@FindBy(id = "lbl_txtEndDate_CompareDateValidation")
	private WebElement errorMessageFromDate;

	private By labelPersonalEventGrid = By.xpath("(//span[text()='Personal Event'])[2]");

	private By iconDescriptionErrorLocator = By.id("a_txtDescription_RequiredError");

	private By iconDateErrorLocator = By.id("a_txtEndDate_CompareDateValidation");

	@FindBy(id = "a_txtEndDate_CompareDateValidation")
	private WebElement iconDateError;

	private By editEventButtonLocator = By.xpath("//a[text()='Edit']");

	@FindBy(xpath = "//a[text()='Edit']")
	private WebElement editEventButton;

	/**
	 * This method is to click Calendar tab
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 30 October 2019
	 */

	public LCCalendarPage clickOnCalenderTab() throws AcisException {
		waitForPageLoad();
		waitForElement(tabCalendar);
		clickWebElement(tabCalendar);

		testLoggerInfo("Clicked on Calendar tab");
		logger.info("Clicked on Calendar tab");
		return this;

	}

	/**
	 * This method is verify If ADD Personal Event button is displayed
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 31 October 2019
	 */

	public LCCalendarPage verifyAddPersonalEventButton() throws AcisException {

		waitAndVerifyElement(btnAddEventLocator);
		testLoggerPass("verified 'ADD Personal Event' button is displayed on calendar tab of LC");
		logger.info("verified 'ADD Personal Event' button is displayed on calendar tab of LC");

		return this;

	}

	/**
	 * This method is to click Add personal Event button
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 31 October 2019
	 */

	public LCCalendarPage clickOnAddPersonalEventButton() throws AcisException {
		waitForPageLoad();
		waitForElementClickable(btnAddEvent);
		clickWebElement(btnAddEvent);
		testLoggerInfo("Clicked on Add personal Event button");
		logger.info("Clicked on Add personal Event button");
		waitForPageLoad();
		return this;

	}

	/**
	 * This method is verify ADD Personal Event grid UI
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 31 October 2019
	 */

	public LCCalendarPage verifyAddEventDialogUI() throws AcisException {

		waitAndVerifyElement(labelPersonalEventGrid);
		testLoggerPass("verified 'ADD Personal Event' grid is displayed after clicking on Add Personal Event button");
		logger.info("verified 'ADD Personal Event' grid is displayed after clicking on Add Personal Event button");

		waitAndVerifyElement(textDescriptionLocator);
		testLoggerPass("verified 'Description' text box is displayed on 'ADD Personal Event' grid");
		logger.info("verified 'Description' text box is displayed on 'ADD Personal Event' grid");

		waitAndVerifyElement(dateFromLocator);
		testLoggerPass("verified 'From Date' datepicker is displayed on 'ADD Personal Event' grid");
		logger.info("verified 'From Date' datepicker is displayed on 'ADD Personal Event' grid");

		waitAndVerifyElement(dateToLocator);
		testLoggerPass("verified 'To Date' datepicker is displayed on 'ADD Personal Event' grid");
		logger.info("verified 'To Date' datepicker is displayed on 'ADD Personal Event' grid");

		waitAndVerifyElement(btnSaveEventLocator);
		testLoggerPass("verified 'Save' button is displayed on 'ADD Personal Event' grid");
		logger.info("verified 'Save' button is displayed on 'ADD Personal Event' grid");

		waitAndVerifyElement(btnCancelEventLocator);
		testLoggerPass("verified 'Cancel' button is displayed on 'ADD Personal Event' grid");
		logger.info("verified 'Cancel' button is displayed on 'ADD Personal Event' grid");

		return this;

	}

	/**
	 * This method is to click Save button on Add personal Event grid
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 31 October 2019
	 */

	public LCCalendarPage clickSaveEvent() throws AcisException {
		waitForElement(btnSaveEvent);
		clickWebElement(btnSaveEvent);
		testLoggerInfo("Clicked on Save button on Add personal Event grid");
		logger.info("Clicked on Save button on Add personal Event grid");
		waitForPageLoad();
		return this;

	}

	/**
	 * This method is verify If 'Save' button is clicked without entering mandatory
	 * Description for personal event error message is displayed
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 31 October 2019
	 */

	public LCCalendarPage verifyMandatoryDescription() throws AcisException {

		waitAndVerifyElement(iconDescriptionErrorLocator);
		testLoggerPass(
				"Verified if 'Save' button is clicked without entering mandatory 'Description' for personal event error message is displayed");
		logger.info(
				"Verified if 'Save' button is clicked without entering mandatory 'Description' for personal event error message is displayed");

		clickWebElement(iconDescriptionError);
		testLoggerInfo("Clicked on 'Error icon' for description on Add personal Event grid");
		logger.info("Clicked on 'Error icon' for description on Add personal Event grid");

		waitForElement(errorMessageDecription);

		Assert.assertEquals(errorMessageDecription.getText().trim(), description_Error_message,
				"Error message for description is not as expected");

		testLoggerPass("Verified error message for description is  as expected");
		logger.info("Verified error message for description is  as expected");

		return this;

	}

	/**
	 * This method is to enter description on Add personal Event grid
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 31 October 2019
	 */

	public LCCalendarPage enterDescriptionForEvent(String description) throws AcisException {
		waitForElement(textDescription);
		textDescription.clear();
		enterText(textDescription, description);
		testLoggerInfo("Entered description on Add personal Event grid as :" + description);
		logger.info("Entered description on Add personal Event grid as :" + description);
		waitForPageLoad();
		return this;

	}

	/**
	 * This method is to enter Todate on Add personal Event grid
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @throws ParseException
	 * @since 31 October 2019
	 */

	public LCCalendarPage enterToDateForEvent(int days) throws AcisException, ParseException {
		waitForElement(dateTo);
		enterText(dateTo, convertDateFormatWithTimeInAMPM("MM/dd/yyyy hh:mm aa", getPastDateWithAMPMTime(days)));
		testLoggerInfo("Selected To date for event");
		logger.info("Selected To date for event");
		waitForPageLoad();
		return this;

	}

	/**
	 * This method is to enter FromDate on Add personal Event grid
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @throws ParseException
	 * @since 31 October 2019
	 */

	public LCCalendarPage enterFromDateForEvent(int days) throws AcisException, ParseException {
		waitForElement(dateFrom);
		enterText(dateFrom, convertDateFormatWithTimeInAMPM("MM/dd/yyy hh:mm aa", getPastDateWithAMPMTime(days)));
		testLoggerInfo("Selected 'From'  date for event");
		logger.info("Selected 'From' date for event");
		waitForPageLoad();
		return this;

	}

	/**
	 * This method is verify If 'From date is less than To date then validation
	 * error should be displayed
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 31 October 2019
	 */

	public LCCalendarPage verifyDateValidation() throws AcisException {

		waitForPageLoad();
		waitAndVerifyElement(iconDateErrorLocator);
		testLoggerPass("verified  if 'From date is less than To date then validation error should be displayed");
		logger.info("verified  if 'From date is less than To date then validation error should be displayed");

		clickWebElement(iconDateError);
		testLoggerInfo("Clicked on 'Error icon' for From date on Add personal Event grid");
		logger.info("Clicked on 'Error icon' for From date on Add personal Event grid");

		waitForElement(errorMessageFromDate);

		Assert.assertEquals(errorMessageFromDate.getText().trim(), fromDate_Error_message,
				"Error message for From Date is not as expected");

		testLoggerPass("Verified error message for From Date is  as expected");
		logger.info("Verified error message for From Date is  as expected");

		return this;

	}

	/**
	 * This method is verify Event is added on calendar
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 31 October 2019
	 */

	public LCCalendarPage verifyEventAddedOnCalendar(String eventDescription) throws AcisException {

		waitForPageLoad();
		waitAndVerifyElement(By.xpath(addedEventLocator.replace("ABC", eventDescription)));
		testLoggerPass("verified Edited  event is displayed on calendar tab of LC");
		logger.info("verified Edited event is displayed on calendar tab of LC");

		/*
		 * WebElement element = getDynamicWebElement(addedEventLocator,
		 * eventDescription);
		 * 
		 * Assert.assertEquals(convertColorToHexadeimal(element.getCssValue("color")),
		 * "#3174ad", "Personal event is not displayed in blue color");
		 * testLoggerPass("Verified Personal event is  displayed in blue color");
		 * logger.info("Verified Personal event is  displayed in blue color");
		 */
		return this;

	}

	/**
	 * This method is verify Edit icon on Event which is added on calendar
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 31 October 2019
	 */

	public LCCalendarPage verifyEditIcon(String eventDescription) throws AcisException {

		waitForPageLoad();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		WebElement element = getDynamicWebElement(addedEventLocator, eventDescription);

		scrollingToElementofAPage(element);
		hoverOverElement(element);

		clickWebElement(element);
		testLoggerInfo("Clicked on Created personal Event on calendar");
		logger.info("Clicked on Created personal Event on calendar");

		waitAndVerifyElement(editEventButtonLocator);
		testLoggerPass("verified  Edit icon on event is displayed");
		logger.info("verified  Edit icon on event is displayed");

		return this;
	}

	/**
	 * This method is verify click on Edit icon on Event which is added on calendar
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 31 October 2019
	 */

	public LCCalendarPage ClickEditPersonalEvent() throws AcisException {
		waitForElement(editEventButton);
		clickWebElement(editEventButton);
		testLoggerInfo("Clicked on Edit button on Created personal Event on calendar");
		logger.info("Clicked on Edit button on Created personal Event on calendar");
		return this;
	}

	public LCCalendarPage deleteCreatedEvent(String eventDescription) throws AcisException {
		WebElement element = getDynamicWebElement(addedEventLocator, eventDescription);
		waitForElement(element);
		hoverOverElement(element);

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		WebElement deleteEvent = getDynamicWebElement(deleteEventButton, eventDescription);

		clickWebElemntUsingJavascriptExecutor(deleteEvent);
		testLoggerInfo("Clicked on Delete button on Created personal Event on calendar");
		logger.info("Clicked on Delete button on Created personal Event on calendar");

		if (isAlertPresent()) {
			acceptTheAlert();
		}

		return this;

	}
}
