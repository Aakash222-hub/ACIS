package com.acis.automation.pages.personaccount;

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

public class DetailsPersonTabPage extends PageBase {

	public DetailsPersonTabPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(DetailsPersonTabPage.class);

	@FindBy(xpath = "//*[text()='Gender']/../..//lightning-formatted-text")
	WebElement genderValue;

	@FindBy(xpath = "//*[text()='Account Name']/../..//lightning-formatted-name")
	WebElement accountNameValue;

	@FindBy(xpath = "//span[text()='Date of Birth']/../..//lightning-formatted-text")
	WebElement dateOfBirthValue;

	@FindBy(xpath = "(//a[text()='Details'])[2]")
	WebElement tabDetails;

	@FindBy(xpath = "//button[text()='Edit']")
	WebElement buttonEdit;

	@FindBy(xpath = "(//*[contains(text(),'Date of Death')]/../..//input)")
	WebElement dateOfDeath;

	@FindBy(xpath = "//*[text()='Pick a year']/../..//select")
	WebElement birthdateYearlist;

	@FindBy(xpath = "//*[text()='20']")
	WebElement dateBirthdate;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement buttonSave;

	/**
	 * Check Phone number Value
	 * 
	 * @author mrunal.s.tilekar
	 */
	public void checkPhoneValue(String phoneValue) {
		logger.info("Checking Phone number Value");
		Assert.assertTrue((driver.findElement(By.xpath("//*[text()='" + phoneValue + "']"))).isDisplayed(),
				"ERROR : No Matching Phone Value displayed");
		logger.info("Checked Phone number Value");
	}

	/**
	 * Check Email Value
	 * 
	 * @author mrunal.s.tilekar
	 */
	public void checkEmailValue(String emailValue) {
		logger.info("Checking Email Value");
		Assert.assertTrue((driver.findElement(By.xpath("//*[text()='" + emailValue + "']"))).isDisplayed(),
				"ERROR : No Matching Email Value displayed");
		logger.info("Checked Email Value");
	}

	/**
	 * check full name and suffix value
	 * 
	 * @author mrunal.s.tilekar
	 */
	public void checkFullNameSuffix(String fullName) {
		waitForPageLoadTill(5);
		logger.info("Checking full name and suffix value");
		Assert.assertTrue((accountNameValue.getText()).contains(fullName),
				"ERROR : No Matching full name and suffix Value displayed");
		logger.info("Checked full name and suffix value");

	}

	/**
	 * Check gender Value
	 * 
	 * @author mrunal.s.tilekar
	 */
	public void checkGenderValue(String gendervalue) {
		logger.info("Checking gender value");
		Assert.assertTrue((genderValue.getText()).contains(gendervalue), "ERROR : No Matching gender Value displayed");
		logger.info("Checked gender value");
	}

	/**
	 * Verify DOB from intake OS
	 * 
	 * @author mrunal.s.tilekar
	 */
	public void checkDOBValue(String dobValue) {
		logger.info("Verifying DOB Value");
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		String actualDobValue = dateOfBirthValue.getText();
		String expectedDobValue;
		if (dobValue.contains("-")) {
			expectedDobValue = dobValue.replace("-", "/");
		} else {
			expectedDobValue = dobValue;
		}
		testLoggerInfo("Actual value :" + actualDobValue);
		testLoggerInfo("Expected value :" + expectedDobValue);
		Assert.assertTrue(actualDobValue.equals(expectedDobValue), "Error: DOB value different from intake OS");
		logger.info("Verified DOB Value");

	}

	/*
	 * click on details tab
	 * 
	 * @khushboo
	 * 
	 * 
	 */
	public void clickDetailsTab() throws AcisException {
		logger.info("click on details tab");
		clickWebElement(tabDetails);
		logger.info("Clicked on details tab");

	}

	/*
	 * Edit date of death
	 * 
	 * @khushboo
	 */
	public void editDateOfDeath(String year) throws AcisException {
		logger.info("Editing Date of death on details tab");
		clickWebElement(buttonEdit);
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		scrollingToElementofAPage(dateOfDeath);
		clickWebElemntUsingJavascriptExecutor(dateOfDeath);
		clickWebElement(dateBirthdate);
		logger.info("DeathDate entered");

	}

	/*
	 * save button
	 * 
	 * 
	 */
	public void clickOnSaveButton() throws AcisException {
		logger.info("clicking on Save button");
		clickWebElement(buttonSave);
		logger.info("clicked on Save button");

	}

}
