package com.acis.automation.pages.personaccount;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.pages.intake.PersonsInvovled_OmniscriptPage;
import com.acis.automation.utilities.AcisException;

public class PersonsInformationPage extends PageBase {

	public PersonsInformationPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PersonsInformationPage.class);

	@FindBy(xpath = "//a[text()='Insights']")
	WebElement insights;

	@FindBy(xpath = "//a[text()='Details']")
	WebElement details;
	
	@FindBy(xpath = "(//a[text()='Details'])[2]")
	WebElement detailsTabAfterIntakeOS;

	@FindBy(xpath = "//a[text()='Related']")
	WebElement realted;
	
	@FindBy(xpath = "(//a[text()='Related'])[2]")
	WebElement realtedTabAfterIntakeOs;

	@FindBy(xpath = "//a[text()='Health']")
	WebElement health;

	@FindBy(xpath = "//a[text()='Education']")
	WebElement education;

	@FindBy(xpath = "Placement")
	WebElement placement;

	@FindBy(xpath = "//span[text()='New Task']")
	WebElement newTask;

	@FindBy(xpath = "//span[text()='New Event']")
	WebElement newEvent;

	@FindBy(xpath = "//span[text()='Log a Call']")
	WebElement logACall;

	@FindBy(xpath = "//button[@title='Upcoming & Overdue']")
	WebElement upcomingAndOverdue;

	@FindBy(xpath = "//p[text()='Birthdate']/parent::div/parent::div/following-sibling::div//lightning-formatted-date-time")
	WebElement birthdateValue;

	@FindBy(xpath = "(//p[text()='Street']/parent::div/parent::div/following-sibling::div//lightning-formatted-text)[1]")
	WebElement streetValue;

	@FindBy(xpath = "(//p[text()='City']/parent::div/parent::div/following-sibling::div//lightning-formatted-text)[2]")
	WebElement cityValue;

	@FindBy(xpath = "(//div[text()='State']/parent::div/following-sibling::div//lightning-formatted-text)[3]")
	WebElement stateValue;

	@FindBy(xpath = "//lightning-formatted-text[contains(@class,'static')]")
	WebElement biographayValue;

	@FindBy(xpath = "//span[text()='Person Biography']/../../textarea")
	WebElement personBiographyTextbox;

	@FindBy(xpath = "//button[@title='Save']")
	WebElement saveButton;

	@FindBy(xpath = "//div[text()='Edit']")
	WebElement editButton;

	@FindBy(xpath = "//a[text()='Activity']")
	WebElement activityTab;

	@FindBy(xpath = "//span[text()='Personal Identifiers']")
	WebElement personalIdentifiers;

	@FindBy(xpath = "//p[text()='Birthdate']")
	WebElement primaryBirthdate;

	@FindBy(xpath = "//p[text()='Street']")
	WebElement primarystreetAddress;

	@FindBy(xpath = "//p[text()='City']")
	WebElement primaryCityname;

	@FindBy(xpath = "//p[text()='State']")
	WebElement primarystate;

	@FindBy(xpath = "//span[text()='We found 2 potential duplicates of this Account.']")
	WebElement duplicatetext;

	@FindBy(xpath = "//button[@title ='Create a task...']")
	WebElement tabcreatenewtask;

	@FindBy(xpath = "//label[text()='Subject']/..//input")
	WebElement subjecttextbox;

	@FindBy(xpath = "(//span[text()='Save'])[1]")
	WebElement newcreatesavebutton;

	/**
	 * Owner : Mrunal Description : Click Insights Tab
	 * 
	 * @throws AcisException
	 */
	public void clickInsightsTab() throws AcisException {
		logger.info("Clicking on Insights Tab");
		clickWebElement(insights);
		waitForPageLoadTill(5);
		logger.info("Opened Insights Tab");
	}

	/**
	 * Owner : Mrunal Description : Click Details Tab
	 * 
	 * @throws AcisException
	 */
	public void clickDetailsTab() throws AcisException {
		logger.info(" Clicking on Details Tab");
		waitForElement(details);
		clickWebElement(details);
		logger.info(" Opened Details Tab");
	}

	/**
	 * Owner : Mrunal Description : Click Related Tab
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickRelatedTab() throws AcisException, InterruptedException {
		logger.info("Clicking on Related Tab");
		clickWebElement(realted);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Opened Related Tab");
	}

	/**
	 * Owner : Mrunal Description : Click Health Tab
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickHealthTab() throws AcisException, InterruptedException {
		logger.info("Clicking on Health Tab");
		clickWebElement(health);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Opened Health Tab");
	}

	/**
	 * Owner : Mrunal Description : Click Education Tab
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickEducationTab() throws AcisException {
		logger.info("Clicking on Education Tab");
		clickWebElement(education);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Opened Education Tab");
	}

	/**
	 * Owner : Mrunal Description : Click Placement Tab
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickPlacementTab() throws AcisException, InterruptedException {
		logger.info("Clicking on Placement Tab");
		waitForPageLoadTill(5);
		clickWebElement(placement);
		waitForPageLoad();
		logger.info("Opened Placement Tab");
	}

	/**
	 * Owner : Mrunal Description : Click edit button
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickEditButton() throws AcisException, InterruptedException {
		logger.info("Clicking on edit button");
		clickWebElement(editButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked edit button");
	}

	/**
	 * Owner : Mrunal Description : Click Save button
	 * 
	 * @throws AcisException
	 */
	public void clickSaveButton() throws AcisException {
		logger.info("Clicking on save button");
		clickWebElement(saveButton);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked save button");
	}

	/**
	 * Owner : Mrunal Description : Enter person biography
	 * 
	 * @throws AcisException
	 */
	public void enterPersonBiography(String biography) throws AcisException {
		logger.info("Entering person biography");
		enterText(personBiographyTextbox, biography);
		logger.info("Entered person biography");
	}

	/**
	 * Owner : Mrunal Description : Verify new task present
	 */
	public void verifyNewTask() {
		logger.info("Verifying new task present");
		waitForElement(newTask);
		logger.info("Verified new task present");
	}

	/**
	 * Owner : Mrunal Description : Verify new event present
	 */
	public void verifyNewEvent() {
		logger.info("Verifying new event present");
		waitForElement(newEvent);
		logger.info("Verified new event present");
	}

	/**
	 * Owner : Mrunal Description :Verify log a call present
	 */
	public void verifyLogACall() {
		logger.info("Verifying log a call present");
		waitForElement(logACall);
		logger.info("Verified log a call present");
	}

	/**
	 * Owner : Mrunal Description : Verify upcoming&overdue present
	 */
	public void verifyUpcomingAndOverdue() {
		logger.info("Verifying upcoming&overdue present");
		waitForElement(upcomingAndOverdue);
		logger.info("Verified upcoming&overdue present");
	}

	/**
	 * Owner: Mrunal Description : Verify Primary Address details on person page
	 */
	public void verifyPrimaryAddressDetails(String street1, String street2, String city) {

		String streetExpected = street1 + " " + street2;
		String cityExpected = city;

		String streetActual = streetValue.getText();
		String cityActual = cityValue.getText();

		System.out.println("Expected street Value : " + streetExpected + "Actual : " + streetActual);
		System.out.println("Expected city Value : " + cityExpected + "Actual : " + cityActual);

		Assert.assertTrue((streetActual.equalsIgnoreCase(streetExpected) && cityActual.equalsIgnoreCase(cityExpected)),
				"Error : Primary Address is NOT expected");
		logger.info("Primary Address is as expected");

		/*
		 * if(streetActual.equalsIgnoreCase(streetExpected) &&
		 * cityActual.equalsIgnoreCase(cityExpected)) {
		 * System.out.println("Primary Address is as expected");
		 * logger.info("Primary Address is as expected");
		 *
		 * } else { System.out.println("Primary Address is NOT expected");
		 * logger.info("Primary Address is  NOT as expected");
		 *
		 * }
		 */
	}
	/**
	 * Owner: Khushboo Description : Verify Primary  details on right side of person page
	 */

	public void verifyPrimaryDetails() throws AcisException {

		logger.info("Verifying Birthdate ");
		waitForElement(primaryBirthdate);
		logger.info("Verified Birthdate");

		logger.info("Verifying Street label ");
		waitForElement(primarystreetAddress);
		logger.info("Verified Street label");

		logger.info("Verifying city name ");
		waitForElement(primaryCityname);
		logger.info("Verified city name");
	}
	/**
	 * Owner: Khushboo Description : Verify Duplicates persons available  right side of person page
	 */

	public void verifyDuplicatesperson() throws AcisException {
		scrollingToElementofAPage(primaryBirthdate);
		logger.info("Verifying Duplicates Person");
		waitForElement(duplicatetext);
		logger.info("Verified Duplicates Person");

	}
	/**
	 * Owner: Khushboo Description : Create new  task  persons available  right side of person page
	 */

	public void createNewTask() throws AcisException {
		scrollingToElementofAPage(primaryCityname);
		clickWebElemntUsingJavascriptExecutor(tabcreatenewtask);
		waitForElement(subjecttextbox);
		clickWebElemntUsingJavascriptExecutor(subjecttextbox);
		enterText(subjecttextbox, "Call");
		scrollingToElementofAPage(subjecttextbox);
		clickWebElemntUsingJavascriptExecutor(newcreatesavebutton);

	}

	
	/**
	 * Close Person Tab
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void closePersonTab(String personName) throws AcisException {
		logger.info("Closing Person "+personName+" Tab");
		waitForPageLoadTill(5);
		if((driver.findElement(By.xpath("//button[@title='Close "+personName+"']"))).isDisplayed()) {

			clickWebElement(driver.findElement(By.xpath("//button[@title='Close "+personName+"']")));
			waitForPageLoadTill(2);
		}
		logger.info("Closed Person "+personName+" Tab");
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(10);
		logger.info("successfully Closed Person "+personName+"  Tab");
	}
	
	/**
	 * Owner : Mrunal 
	 * Description : Click Details Tab - after opening intake OS
	 * 
	 * @throws AcisException
	 */
	public void clickDetailsTabAfterIntakeOS() throws AcisException {
		logger.info(" Clicking on Details Tab");
		waitForElement(detailsTabAfterIntakeOS);
		clickWebElement(detailsTabAfterIntakeOS);
		waitForPageLoadTill(5);
		logger.info(" Opened Details Tab");
	}
	
	/**
	 * Owner : Mrunal Description : Click Related Tab
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickRelatedTabAfterInatakeOS() throws AcisException, InterruptedException {
		logger.info("Clicking on Related Tab");
		waitForElement(realtedTabAfterIntakeOs);
		clickWebElement(realtedTabAfterIntakeOs);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Opened Related Tab");
	}
}
