package com.acis.automation.pages.investigation;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.PageBase;
import com.acis.automation.pages.intake.PersonsInvovled_OmniscriptPage;
import com.acis.automation.utilities.AcisException;

public class AssignInvestigationPage extends PageBase {

	public AssignInvestigationPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PersonsInvovled_OmniscriptPage.class);

	@FindBy(xpath = "//a[contains(text(),'C-0000')]//..//..//span")
	WebElement caseIdLink;

	@FindBy(xpath = "(//span[text()='Investigation - Allegation Reports']//..//..//a)[2]")
	WebElement investigationLink;

	@FindBy(xpath = "//span[text()='Investigation - Allegation Reports']//..//..//a")
	WebElement investigationLink1;

	@FindBy(xpath = "//a[@data-label='Related']")
	WebElement relatedTab;

	@FindBy(xpath = "(//a[@data-label='Details'])[last()]")
	WebElement detailTab;

	@FindBy(xpath = "(//span[text()='Change Owner']/../..//lightning-primitive-icon)[2]")
	WebElement changeOwnerLink;

	@FindBy(xpath = "//input[@title='Search Users']")
	WebElement titleTextBox;

	@FindBy(xpath = "//div[@title='ACIS Investigator']")
	WebElement investigationOwner;

	@FindBy(xpath = "//div[@title='ACIS Intake']")
	WebElement intakeOwner;

	@FindBy(xpath = "//button[@name='change owner']")
	WebElement changeOwnerButton;

	@FindBy(xpath = "//span[text()='Owner']//..//..//a")
	WebElement ownerLabel;

	@FindBy(xpath = "//div[contains(text(),'Save for later')]")
	WebElement saveForLaterButton;

	@FindBy(xpath = "//button[contains(text(),'Previous')]")
	WebElement previousButton;

	@FindBy(xpath = "//button[contains(text(),'Next')]")
	WebElement nextButton;

	@FindBy(xpath = "//div[@title='ACIS Investigator'][last()]")
	WebElement acisInvestigationOption;

	@FindBy(xpath = "(//a[text()='ACIS Intake'])[2]")
	WebElement acisIntakeOption;

	@FindBy(xpath = "//*[contains(text(),'You don’t have permission ')]")
	WebElement ownerNotChangeError;

	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Assessments']")
	WebElement safetyAssementMenu;

	@FindBy(xpath = "//a[@title='Select List View']")
	WebElement selectListView;

	@FindBy(xpath = "//span[normalize-space(.)='Safety Assessments for Approval']")
	WebElement safetyAssemntforApproval;

	@FindBy(xpath = "(//table/tbody/tr/th/span/a)[1]")
	WebElement selectFirstRecord;

	@FindBy(xpath = "//div[contains(text(),'New Safety Assessment')]")
	WebElement newSafetyAssesmentLink;

	@FindBy(xpath = "(//*[@data-key='chevrondown'])[1]")
	WebElement downArrow;

	@FindBy(xpath = "//button[@title='Edit Status']")
	WebElement editbutton;

	@FindBy(xpath = "//span[text()='Assessment ID']")
	WebElement assementID;

	@FindBy(xpath = "//span[text()='Created By']")
	WebElement createdID;

	@FindBy(xpath = "//span[text()='Last Modified Date']")
	WebElement dateId;

	@FindBy(xpath = "//span[text()='Investigation Due Date']")
	WebElement investigationDueDate;

	@FindBy(xpath = "//label[text()='Status']/../../..//input")
	WebElement statusMenu;

	@FindBy(xpath = "//label[text()='Status']/../../../..//span[@title='Approved']")
	WebElement approvedStatus;

	@FindBy(xpath = "//label[text()='Status']/../../../..//span[@title='Override']")
	WebElement overideStatus;

	@FindBy(xpath = "//label[text()='Safety Decision']/../../..//input")
	WebElement safetyDecission;

	@FindBy(xpath = "(//span[text()='Safe'])")
	WebElement safe;

	@FindBy(xpath = "(//span[text()='Unsafe'])")
	WebElement unSafe;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveButton;

	@FindBy(xpath = "(//span[text()='Conditionally Safe'])")
	WebElement unConditionalySafe;

	@FindBy(xpath = "//span[text()='Intake Case']/../..//a")
	WebElement caseId;

	@FindBy(xpath = "//a[text()='ACIS Intake'][last()]/../..//div")
	WebElement acisIntakeafterEnter;

	@FindBy(xpath = "//a[text()='ACIS Investigator'][last()]/../..//div")
	WebElement acisInvestigationafterEnter;

	/***
	 * @author akash.a.gaurav Clicking on Related tab
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickingRelatedAndInvestigationLink() throws AcisException, InterruptedException {

		try {
			waitForPageLoad();
			clickWebElement(relatedTab);
			logger.info("Clicking on investiagtion tab");
			Actions actions = new Actions(driver);
			waitForPageLoadTill(9);
			actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
			waitForPageLoadTill(9);
			try {
				clickWebElemntUsingJavascriptExecutor(investigationLink1);
			} catch (AcisException e) {
				clickWebElement(investigationLink);
			}
			waitForPageLoadTill(8);
		} catch (AcisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/***
	 * Click on CaseId
	 * 
	 * @throws AcisException
	 * @author akash.a.gaurav
	 */
	public void clickingOnCaseID() throws AcisException {
		waitForPageLoad();
		clickWebElement(caseIdLink);
		waitForPageLoad();
		clickWebElement(detailTab);
		waitForPageLoadTill(9);

	}

	/***
	 * Changing owner
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * @throws InterruptedException
	 */

	public void changeOwnerIntake() throws AcisException, InterruptedException {
		Thread.sleep(1000);
		logger.info("Selecting owner");

		String intake = testData.get(Constants.AssignInvestigation).get("ownerIntake");
		waitForElement(detailTab);
		clickWebElement(detailTab);
		logger.info("Clicked on detail Tab");
		waitForPageLoad();
		Actions actions = new Actions(driver);

		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,940)");
		clickWebElement(changeOwnerLink);
		waitForElement(titleTextBox);
		waitForPageLoadTill(3);
		clickWebElement(titleTextBox);

		// enterTextUsingJavascript(titleTextBox, intake);
		actions.sendKeys(Keys.CONTROL).sendKeys("Acis Intak").keyUp(Keys.CONTROL).perform();
		logger.info("Clicking on enter");

		waitForPageLoadTill(5);
		jse.executeScript("window.scrollBy(0,140)");
		clickWebElement(intakeOwner);
		clickWebElement(changeOwnerButton);
		waitForPageLoadTill(9);
		logger.info("Selected Owner as intake");

	}

	/***
	 * Selecting ownwner as investigation
	 * 
	 * @throws AcisException
	 */

	public void ownerInvestigation() throws AcisException {

		logger.info("Selecting owner");

		String investigation = testData.get(Constants.AssignInvestigation).get("ownerInvestigation");

		waitForPageLoadTill(7);
		waitForElement(detailTab);
		clickWebElement(detailTab);
		logger.info("Clicked on detail Tab");
		waitForPageLoad();
		Actions actions = new Actions(driver);
		waitForPageLoadTill(3);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		clickWebElement(changeOwnerLink);
		waitForElement(titleTextBox);
		clickWebElement(titleTextBox);

		enterTextUsingJavascript(titleTextBox, investigation);
		waitForPageLoadTill(5);
		actions.sendKeys(Keys.ENTER).build().perform();

		clickWebElement(acisInvestigationOption);
		waitForPageLoadTill(9);
		clickWebElement(changeOwnerButton);
		waitForPageLoadTill(9);
		logger.info("Selected Owner as Investigator");

	}

	/****
	 * Verifying Owner Change as intake
	 */

	public void verifyingIntakeOwnerChanged() {

		String ownerSelectedIntake = testData.get(Constants.AssignInvestigation).get("ownerLabelIntake");

		waitForPageLoad();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,900)");
		verifyTextEquals(ownerLabel, ownerSelectedIntake);
		logger.info("Selected Owner as intake verified");

	}

	/***
	 * VErifying change owner as investigation
	 */
	public void verifyingInvestigationOwnerChanged() {

		String ownerSelectedInvestigation = testData.get(Constants.AssignInvestigation).get("ownerLabelInvest");
		waitForPageLoadTill(4);
		verifyTextEquals(ownerLabel, ownerSelectedInvestigation);
		logger.info("Selected Owner as investigation verified");

	}

	/***
	 * Changing and verifying owner with investigation
	 * 
	 * @author akash.a.gaurav
	 * @throws InterruptedException
	 */

	public void ownerChangeInvestigationVerifyError() throws AcisException, InterruptedException {
		Thread.sleep(2000);
		logger.info("Selecting owner and verifying status");

		String investigation = testData.get(Constants.AssignInvestigation).get("ownerInvestigation");
		String ownerErro = testData.get(Constants.AssignInvestigation).get("OwnerError");

		waitForElement(detailTab);
		clickWebElement(detailTab);
		Thread.sleep(1000);
		logger.info("Clicked on detail Tab");
		waitForPageLoad();
		Actions actions = new Actions(driver);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(5);
		jse.executeScript("window.scrollBy(0,940)");
		waitForPageLoadTill(9);
		clickWebElement(changeOwnerLink);
		waitForElement(titleTextBox);
		clickWebElement(titleTextBox);
		actions.sendKeys(Keys.CONTROL).sendKeys("ACIS Investigator").keyUp(Keys.CONTROL).perform();
		waitForPageLoadTill(5);
		clickWebElement(acisInvestigationOption);
		waitForPageLoadTill(9);
		clickWebElemntUsingJavascriptExecutor(changeOwnerButton);
		waitForPageLoadTill(9);
		verifyTextEquals(ownerNotChangeError, ownerErro);
		logger.info("Owner not changed by investigation");

	}

	/***
	 * Search Assessment
	 */

	/***
	 * This methods lands on the new safety Assement Page
	 * 
	 * @throws AcisException
	 */

	public void navigatingToNewSafetyAssessmentPage(String str1, String str2, String str3, String str4)
			throws AcisException {

		logger.info("This method will click on the down arrow and navigate it to Safety Assesment Page");
		waitForPageLoadTill(19);
		waitForElement(downArrow);
		try {
			clickWebElement(downArrow);
		} catch (AcisException e1) {
			clickWebElemntUsingJavascriptExecutor(downArrow);
		}
		logger.info("Clicked in down arrow");
		waitForPageLoad();
		waitForPageLoadTill(9);
		waitForElementNew(safetyAssementMenu, 10);
		clickWebElement(safetyAssementMenu);
		logger.info("clicked on safetyAssementMenulink");
		driver.navigate().refresh();
		logger.info("Page getting refresh");
		waitForPageLoad();
		waitForElementClickable(selectListView);
		/*
		 * try { waitForElementClickable(selectListView);
		 * clickWebElement(selectListView); } catch (AcisException e) {
		 * clickWebElement(selectListView); }
		 */
		/*
		 * logger.info("Clicked on select list view drop  menu");
		 * waitForElementNew(safetyAssemntforApproval, 7);
		 * clickWebElement(safetyAssemntforApproval);
		 * logger.info("clicked on safety assement for approval ");
		 */

		verifyTextEquals(assementID, str1);
		logger.info("Verified assement label");
		verifyTextEquals(createdID, str2);
		logger.info("Verified create label");
		verifyTextEquals(dateId, str3);
		logger.info("Verified date label ");
		verifyTextEquals(investigationDueDate, str4);
		logger.info("Verfied investigation label");
		waitForPageLoadTill(9);
		waitForElement(selectFirstRecord);
		clickWebElement(selectFirstRecord);

		logger.info("Clicked on first record");

		waitForPageLoadTill(17);

	}

	/***
	 * Approving asseement
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void statuApproveOverride(String status) throws AcisException {

		logger.info("Selecting status Approve/Override ");
		waitForElement(statusMenu);
		clickWebElement(statusMenu);
		waitForPageLoadTill(13);
		switch (status) {
		case "approve":

			try {
				waitForElement(approvedStatus);

				clickWebElement(approvedStatus);
			} catch (AcisException e) {
				clickWebElement(approvedStatus);
			}
			logger.info("Status is: " + status);
			break;
		case "override":
			waitForElement(overideStatus);
			clickWebElement(overideStatus);
			logger.info("Status is: " + status);
			break;
		default:
			logger.info("Status found: " + status);

		}
	}

	/***
	 * Selecting Safety decission
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void safetyDecission(String safety) throws AcisException {

		clickWebElement(safetyDecission);
		waitForPageLoadTill(13);
		switch (safety) {
		case "safe":

			try {
				waitForElement(safe);

				clickWebElement(safe);
				clickWebElement(saveButton);
				logger.info("Saving the data");
			} catch (AcisException e) {
				clickWebElement(safe);
			}
			logger.info("Safety Recommendation is: " + safety);
			break;
		case "unsafe":
			waitForElement(unSafe);
			clickWebElement(unSafe);
			clickWebElement(saveButton);
			logger.info("Saving the data");
			logger.info("Safety Recommendation is: " + safety);
			break;

		case "conditionaly":
			waitForElement(unConditionalySafe);
			clickWebElement(unConditionalySafe);
			logger.info("Safety Recommendation is: " + safety);
			break;
		default:
			logger.info("Safety Recommendation not found: " + safety);

		}
	}

	/***
	 * Edit button
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */

	public void EditButton() throws AcisException {

		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,1100)");
		logger.info("Clicking on edit button");
		waitForPageLoadTill(9);
		clickWebElemntUsingJavascriptExecutor(editbutton);
		logger.info("Clicked on edit button");
		waitForPageLoadTill(19);
	}

	/**
	 * Get AllegationID from an Allegation Record Created By Akash
	 * 
	 * @throws AcisException
	 */
	public String getAllegationID() throws AcisException {
		logger.info("Getting Allegation ID from Allegation Record Page");
		waitForPageLoad();
		waitForPageLoadTill(5);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		waitForPageLoadTill(5);
		jse.executeScript("window.scrollBy(0,150)");
		waitForPageLoadTill(5);
		waitForElement(caseId);
		logger.info("Getting Allegation ID");
		System.out.println("Allegation ID : " + caseId.getText().trim());
		testLoggerInfo("Created Allegation ID " + caseId.getText().trim());
		logger.info("Returning Allegation ID from Allegation Record Page");

		return (caseId.getText().trim());

	}
}
