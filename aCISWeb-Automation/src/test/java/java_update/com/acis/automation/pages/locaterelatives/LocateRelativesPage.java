package com.acis.automation.pages.locaterelatives;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class LocateRelativesPage extends PageBase {

	public LocateRelativesPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(LocateRelativesPage.class);

	@FindBy(xpath = "//span[text()='Ask family members']")
	WebElement askFamilyMembersBox;

	@FindBy(xpath = "//span[text()='Check public records']")
	WebElement checkPublicRecordsBox;

	@FindBy(xpath = "//span[text()='Check eligibility cases']")
	WebElement checkEligibilityCasesBox;

	@FindBy(xpath = "//span[text()='Check social media']")
	WebElement checkSocialMediaBox;

	@FindBy(xpath = "//input[@placeholder='Initials']")
	WebElement initialsText;

	@FindBy(xpath = "//h1[text()='Locate Relatives/Kin']")
	WebElement verifyLocateRelatives;

	@FindBy(xpath = "//button/*[text()='Next']")
	WebElement nextButton;

	@FindBy(xpath = "//h1[text()='Persons Involved']")
	WebElement personsInvolvedVerify;
	
	@FindBy(xpath = "//*[contains(text(),'I confirm that I have adequately searched for existing relative')]")
	WebElement signatureMessage;
	
	@FindBy(xpath = "//*[contains(text(),'Enter initials to confirm that the checklist items above have been completed to the best of your ability')]")
	WebElement initialsMessage;
	
	@FindBy(xpath = "//*[contains(text(),'Check the boxes for each of the following items as you complete them')]")
	WebElement checkboxMessage;
	
	
	
	/**
	 * Select CheckBox
	 * 
	 * @throws AcisException
	 */
	public void selectCheckBox(String strText) throws AcisException {
		waitForElement(verifyLocateRelatives);
		switch (strText) {
		case "Ask family members":
			clickWebElement(askFamilyMembersBox);
			logger.info("Selected CheckBox: " + strText);
			break;
		case "Check public records":
			clickWebElement(checkPublicRecordsBox);
			logger.info("Selected CheckBox: " + strText);
			break;
		case "Check eligibility cases":
			clickWebElement(checkEligibilityCasesBox);
			logger.info("Selected CheckBox: " + strText);
			break;
		case "Check social media":
			clickWebElement(checkSocialMediaBox);
			logger.info("Selected CheckBox: " + strText);
			break;
		default:
			logger.info(strText + " CheckBox not found");
			break;
		}

	}

	/***
	 * @author Dharmesh Krishna Enter Intitals on locate Relatives
	 * @throws AcisException
	 */
	public void enterInitials(String str) throws AcisException {
		waitForPageLoadTill(4);
		waitForPageLoad();
		waitForElement(verifyLocateRelatives);
		logger.info("entering input text area");

		Actions act = new Actions(driver);
		enterText(initialsText, str);
		act.sendKeys(Keys.ENTER).perform();
		logger.info("entered input area");

		waitForPageLoadTill(9);
		waitForPageLoad();
	}

	/**
	 * click next button
	 * 
	 * @author Dharmesh Krishna
	 * @throws AcisException
	 */
	public void clickNextButton() throws AcisException {
		logger.info("Clicking on Next button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForElementClickable(nextButton);
		scrollingToElementofAPage(nextButton);
		clickWebElement(nextButton);
		waitForPageLoad();
		waitForPageLoadTill(8);
		logger.info("Clicked on Next button");
		waitForElement(personsInvolvedVerify);
		logger.info("Select Meeting Location  Page loaded");
	}
	
	/**
	 * Check messages on this page
	 * @author mrunal.s.tilekar
	 */
	public void verifyMessages() {
		logger.info("Checking messages");
		waitForElement(checkboxMessage);
		waitForElement(askFamilyMembersBox);
		waitForElement(checkEligibilityCasesBox);
		waitForElement(checkPublicRecordsBox);
		waitForElement(checkSocialMediaBox);
		waitForElement(initialsMessage);
		waitForElement(signatureMessage);
		logger.info("Checked messages");
	}
}
