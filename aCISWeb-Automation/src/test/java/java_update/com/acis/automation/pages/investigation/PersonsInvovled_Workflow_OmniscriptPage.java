package com.acis.automation.pages.investigation;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;
import java.io.IOException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;




public class PersonsInvovled_Workflow_OmniscriptPage extends PageBase{

	public PersonsInvovled_Workflow_OmniscriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
		final static Logger logger = LoggerFactory.getLogger(PersonsInvovled_Workflow_OmniscriptPage.class);

		
		@FindBy(xpath = "(//*[text()='First Name']//..//..//..//input)[1]")
		WebElement firstNames;
		
		@FindBy(xpath = "//span[text()='Search']")
		WebElement searchButton;
		
		@FindBy(xpath = "//table//thead//tr//th[text()='FIRST NAME']")
		WebElement firstNameVerify;
		
		public By closeVerify = By.xpath("//button[text()='Close']");
		
		@FindBy(xpath = "//button[text()='Close']")
		WebElement close;
		
		@FindBy(xpath = "(//*[text()='Last Name']//..//..//..//input)[1]")
		WebElement lastNames;
		
		@FindBy(xpath = "(//*[text()='Date of Birth']//..//..//..//input)[1]")
		WebElement dateofBirth;

		
		@FindBy(xpath = "//span[contains(text(),'here')]/../..//button")
		WebElement linkCreateNewPerson;
		
		@FindBy(xpath = "//*[contains(text(),'Case Person')]/../../..//*[text()='First Name']/../../..//input")
		public static WebElement firstNameTextBox;

		@FindBy(xpath = "//*[contains(text(),'Case Person')]/../../..//*[text()='Last Name']/../../..//input")
		public static WebElement lastNameTextBox;

		@FindBy(xpath = "//*[contains(text(),'Case Person')]/../../..//*[text()='Middle Name']/../../..//input")
		public static WebElement middleNameTextBox;
		
		@FindBy(xpath = "(//*[contains(text(),'Case Person')]/../..//*[text()='Save'])[1]")
		WebElement saveButtonFirst;
		
		@FindBy(xpath = "(//*[contains(text(),'Case Person')]/../..//*[text()='Save'])[last()]")
		WebElement saveButton;
		
		@FindBy(xpath = "//span[contains(text(),'Refresh Person')]")
		WebElement refreshPersonsButton;
		
		@FindBy(xpath = "//*[contains(text(),'details are saved. Close this')]")
		WebElement saveVerify;
		
		@FindBy(xpath = "//*[text()='Close']")
		WebElement closeButton;
		
		@FindBy(xpath = "//*[text()='Next']")
		WebElement nextButton;
		
		 @FindBy(xpath="//h1[text()='Establish Relationships']")
		 WebElement verifyEstablishLabel;
		
		
		/**
		 * Click on close button
		 * 
		 * @author Dharmesh Krishna
		 * @throws AcisException
		 * @throws InterruptedException
		 */
		public void closeCreateIntakePerson() throws AcisException {
			logger.info("Closing CreateIntakePerson");
			waitForElement(saveVerify);
			clickWebElemntUsingJavascriptExecutor(closeButton);
			waitForPageLoadTill(5);
			waitForElement(refreshPersonsButton);
			logger.info("Added Person");
		}
		
		/**
		 * Click on refresh person button
		 * 
		 * @author mrunal.s.tilekar
		 */
		public void clickRefresPersonButton() throws AcisException {
			logger.info("Clicking refresh person button");
			waitForPageLoadTill(5);
			clickWebElemntUsingJavascriptExecutor(refreshPersonsButton);
			waitForPageLoadTill(5);
			logger.info("Clicked refresh person button");
			waitForPageLoadTill(5);
			logger.info("Successfully clicked refresh person button");

		}
		
		/**
		 * Set First name, middle name, last name
		 * @author mrunal.s.tilekar
		 * @throws AcisException 
		 */
		public void setAllNames(String firstName, String middleName, String lastName) throws AcisException {
			waitForElement(firstNameTextBox);
			enterText(firstNameTextBox, firstName);
			enterText(middleNameTextBox, middleName);
			enterText(lastNameTextBox, lastName);
			logger.info("Set First name, middle name, last name");
			waitForPageLoadTill(5);
		}

		/**
		 * Click on save button
		 * @author mrunal.s.tilekar
		 * @throws AcisException 
		 * @throws InterruptedException 
		 */
		public void clickSaveButton(String option) throws AcisException, InterruptedException {
			switch(option)
			{
				case "first":
					logger.info("Clicking on save button");
					clickWebElemntUsingJavascriptExecutor(saveButtonFirst);
					waitForPageLoadTill(5);
					logger.info("Clicked on save button");
					break;
			
				case "next":
					logger.info("Clicking on save button");
					clickWebElement(saveButton);
					waitForPageLoadTill(5);
					logger.info("Clicked on save button");
					break;
			}
			waitForPageLoadTill(5);
			
		}
		
		/**
		 * Search a person with valid input
		 * 
		 * @author akash.a.gaurav
		 * @throws AcisException
		 * @throws InterruptedException
		 */
		public void searchPersonUsingvalidData(String name, String str1) throws AcisException, InterruptedException {

			switch (name) {
			case "firstName":
				logger.info("Selecting first Name  and searching ");
				waitForElement(firstNames);
				enterText(firstNames, str1);
				waitForPageLoadTill(5);
				clickWebElement(searchButton);
				waitForElement(firstNameVerify);
				waitForPageLoadTill(5);
				if (isElementPresent(closeVerify)) {
					logger.info("Clicking on Close Button");
					waitForElementClickable(close);
					clickWebElement(close);
					logger.info("Clicked on Close Button");
				}
				logger.info("Searching using first person");
				break;

			case "lastName":
				logger.info("Seleting last name and searching ");
				waitForElement(lastNames);
				enterText(lastNames, str1);
				waitForPageLoadTill(5);
				clickWebElement(searchButton);
				waitForElement(firstNameVerify);
				waitForPageLoadTill(5);
				if (isElementPresent(closeVerify)) {
					logger.info("Clicking on Close Button");
					waitForElementClickable(close);
					clickWebElement(close);
					logger.info("Clicked on Close Button");
				}
				logger.info("Searching using lastname person");
				break;

			case "dob":
				logger.info("Selecting dob name and searching ");
				waitForElement(dateofBirth);
				enterText(dateofBirth, str1);
				waitForPageLoadTill(5);
				clickWebElement(searchButton);
				waitForElement(firstNameVerify);
				waitForPageLoadTill(5);
				if (isElementPresent(closeVerify)) {
					logger.info("Clicking on Close Button");
					waitForElementClickable(close);
					clickWebElement(close);
					logger.info("Clicked on Close Button");
				}
				logger.info("Searching using dob person");
				break;
			default:
				logger.info("Date: " + name + " not found");
				break;

			}

		}
		
		/***
		 * Link to create new person
		 * 
		 * @throws AcisException
		 */
		public void linkToCreateNewPerson() throws AcisException {
			waitForPageLoadTill(9);
			logger.info("Clikcing on link to create new person");
			Actions act = new Actions(driver);
			waitForPageLoadTill(9);
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy(0,650)");
			clickWebElemntUsingJavascriptExecutor(linkCreateNewPerson);
			logger.info("Clicked on link to create new person");
			waitForPageLoadTill(10);
		}
		
		/**
		 * click on Next button
		 * @author mrunal.s.tilekar
		 */
		public void clickNextButton() throws AcisException, InterruptedException {
			Actions act = new Actions(driver);
			act.sendKeys(Keys.END).build().perform();
			waitForPageLoadTill(5);
			clickWebElement(nextButton);
			waitForPageLoad();
			waitForPageLoadTill(5);
			waitForElement(verifyEstablishLabel);
			logger.info("Clicked on Next button");

		}
}

