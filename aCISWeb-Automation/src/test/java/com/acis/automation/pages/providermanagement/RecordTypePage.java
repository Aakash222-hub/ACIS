package com.acis.automation.pages.providermanagement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.library.TestBase;

import com.acis.automation.utilities.AcisException;

public class RecordTypePage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(RecordTypePage.class);

	public RecordTypePage() throws AcisException {
	}

	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Case Actions']")
	WebElement caseAction;

	@FindBy(xpath = "//a[@title='Select List View']")
	WebElement selectListView;

	@FindBy(xpath = "//span[normalize-space(.)='My Investigations'] ")
	WebElement myInvestigationList;

	@FindBy(xpath = "(//table/tbody/tr/td/span/a)[1] ")
	WebElement selectFirstRecord;

	@FindBy(xpath = "//a[contains(text(),'Related')]")
	WebElement relatedTab;

	@FindBy(xpath = "//div[contains(text(),'New Safety Assessment')]")
	WebElement newSafetyAssesmentLink;

	@FindBy(xpath = "(//*[@data-key='chevrondown'])[1]")
	WebElement downArrow;

	@FindBy(xpath = "//a[@title='New']")
	WebElement newButton;

	@FindBy(xpath = "//span[@class='slds-form-element__label topdown-radio--label'][contains(normalize-space(),'Person')]")
	WebElement personLabel;

	@FindBy(xpath = "//span[@class='slds-form-element__label topdown-radio--label'][contains(normalize-space(),'Placement Resource')]")
	WebElement placementLabel;

	@FindBy(xpath = "//span[@class='slds-form-element__label topdown-radio--label'][contains(normalize-space(),'Provider Agency')]")
	WebElement providerEnquiryLabel;
	
	@FindBy(xpath="//span[text()='New Account']//..//..//button")
	WebElement newAccountClose;
	
	@FindBy(xpath="//span[text()='New Case Action']//..//..//button")
	WebElement newCaseAction;
	
	@FindBy(xpath="//span[@class='slds-form-element__label topdown-radio--label'][contains(normalize-space(),'Intake')]")
	WebElement intakeLabel;
	
	@FindBy(xpath="//span[@class='slds-form-element__label topdown-radio--label'][contains(normalize-space(),'Family Preservation')]")
	WebElement familyPreservationLabel;
	
	@FindBy(xpath="//span[@class='slds-form-element__label topdown-radio--label'][contains(normalize-space(),'Foster Care')]")
	WebElement fosterlabel;
	
	
	@FindBy(xpath="//span[@class='slds-form-element__label topdown-radio--label'][contains(normalize-space(),'Investigation')]")
	WebElement investigationLabel;
	
	
	@FindBy(xpath="//span[@title='Interactions']")
	WebElement interactionsLink;
	
	@FindBy(xpath="(//div[text()='New'])[2]")
	WebElement newButtonInteractions1;
	
	@FindBy(xpath="(//div[text()='New'])[3]")
	WebElement newButtonInteractions;
	
	
	@FindBy(xpath="//span[@class='slds-form-element__label topdown-radio--label'][contains(normalize-space(),'Visit')]")
	WebElement visitLabel;
	
	@FindBy(xpath="//span[@class='slds-form-element__label topdown-radio--label'][contains(normalize-space(),'Collateral')]")
	WebElement collateralLabel;
	
	@FindBy(xpath="//span[@class='slds-form-element__label topdown-radio--label'][contains(normalize-space(),'Meeting')]")
	WebElement meetingLabel;
	
	@FindBy(xpath="//span[@class='slds-form-element__label topdown-radio--label'][contains(normalize-space(),'TDM')]")
	WebElement tdmLabel;
	

	/**
	 * Navigating to Person, Placement Resource, Provider Agency
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * @throws InterruptedException
	 */

	public void navigatingPersonPlacement() throws AcisException, InterruptedException {
		try {
			logger.info("Clicking Down arrow account");
			homePage_SFDCPage.clickDownArrowAccount();
			logger.info("Clicked  Down arrow account");
			logger.info("Selecting all account");
			homePage_SFDCPage.selectAllAccount();
			logger.info("Selected all account");
			logger.info("Clicking new button");
			clickWebElemntUsingJavascriptExecutor(newButton);
			logger.info("Clicked on new button");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	/***
	 * Verifying Person, Placement Resource, Provider label
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 */

	public void verifyingPersonPlacement() throws AcisException {
		waitForPageLoad();
		waitForPageLoadTill(9);
		logger.info("Verifying label of person");
		verifyElementNotPresent(personLabel);

		logger.info("Verified person label");
		verifyElementNotPresent(placementLabel);
		logger.info("Verified placment resource label");
		verifyElementNotPresent(providerEnquiryLabel);
		logger.info("verified provider enquiry label");
		logger.info("Cloising the current tab");
		clickWebElement(newAccountClose);
		logger.info("closed the new account tab");

	}
	/***
	 * @author akash.a.gaurav
	 * navigating to new case action
	 * @throws AcisException 
	 */
	
	public void newCaseAction() throws AcisException {
		waitForPageLoadTill(19);
		waitForElement(downArrow);
		try {
			clickWebElement(downArrow);
		} catch (Exception e1) {
			clickWebElemntUsingJavascriptExecutor(downArrow);
		}
		logger.info("Clicked in down arrow");
		waitForPageLoad();
		waitForPageLoadTill(9);
		waitForElementNew(caseAction, 10);
		clickWebElement(caseAction);
		logger.info("clicked on Case Action link");
		driver.navigate().refresh();
		logger.info("Page getting refresh");
		waitForPageLoad();
		waitForElementClickable(selectListView);
		try {
			waitForElementClickable(selectListView);
			clickWebElement(selectListView);
		} catch (AcisException e) {
			clickWebElement(selectListView);
		}
		logger.info("Clicked on select list view drop  menu");
		waitForElementNew(myInvestigationList, 7);
		clickWebElement(myInvestigationList);
		logger.info("clicked on My investigation ");
		waitForPageLoadTill(9);
		logger.info("Clicking on new Button");
		clickWebElemntUsingJavascriptExecutor(newButton);
		logger.info("Clicked on new button");

	}
	
	/***
	 * Verifying record types for selection: Intake, Investigation, Family Preservation (for future development), Foster Care
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 * 
	 * 
	 */
	
	public void verifyIntakePreservation() throws AcisException {
		logger.info("Verifying labels intake");
		verifyElementNotPresent(intakeLabel);
		waitForPageLoadTill(9);
		logger.info("Verified intake label");
	verifyElementNotPresent(familyPreservationLabel);
	waitForPageLoadTill(9);
	logger.info("verified family preservation label");
	waitForPageLoadTill(9);
	verifyElementNotPresent(fosterlabel);
	waitForPageLoadTill(9);
	logger.info("Verfied foster label ");
	verifyElementNotPresent(investigationLabel);
	logger.info("verified investigation label");
	waitForPageLoadTill(9);
	clickWebElement(newCaseAction);
	logger.info("Close new action label");
	}
	
	/***
	 * Navigating  to the selection new contact
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 */
	
	public void navigatingNewContact() throws AcisException {
		
		waitForPageLoad();
		waitForPageLoadTill(9);

		logger.info("This method will click on the down arrow and navigate it to Safety Assesment Page");
		waitForPageLoadTill(19);
		waitForElement(downArrow);
		try {
			clickWebElement(downArrow);
		} catch (Exception e1) {
			clickWebElemntUsingJavascriptExecutor(downArrow);
		}
		logger.info("Clicked in down arrow");
		waitForPageLoad();
		waitForPageLoadTill(9);
		waitForElementNew(caseAction, 10);
		clickWebElement(caseAction);
		logger.info("clicked on Case Action link");
		driver.navigate().refresh();
		logger.info("Page getting refresh");
		waitForPageLoad();
		waitForElementClickable(selectListView);
		try {
			waitForElementClickable(selectListView);
			clickWebElement(selectListView);
		} catch (Exception e) {
			clickWebElement(selectListView);
		}
		logger.info("Clicked on select list view drop  menu");
		waitForElementNew(myInvestigationList, 7);
		clickWebElement(myInvestigationList);
		logger.info("clicked on My investigation ");
		waitForPageLoadTill(9);
		waitForElement(selectFirstRecord);
		try {
			clickWebElement(selectFirstRecord);
		} catch (Exception e) {
			clickWebElement(selectFirstRecord);
		}
		logger.info("Clicked on first record");
		waitForPageLoadTill(9);
		waitForElementClickable(relatedTab);
		clickWebElement(relatedTab);
		logger.info("Clicked on related tab");
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	    waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,510)");
		 waitForPageLoadTill(10);
		clickWebElemntUsingJavascriptExecutor(interactionsLink);
		logger.info("Clikced on interaction link");
		try {
			clickWebElemntUsingJavascriptExecutor(newButtonInteractions);
		} catch (Exception e) {
			clickWebElemntUsingJavascriptExecutor(newButtonInteractions1);
		}
		logger.info("Clicked on new button interactions");
	}
	
	
	/***
	 * Verifying  new interactions label Intake, Investigation, Family Preservation (for future development), Foster Care
	 */
	
	
	public void verficationInteractions() {
		waitForPageLoadTill(9);
		logger.info("Verifying labels ");
		verifyElementNotPresent(visitLabel);
		logger.info("Verified visit label");
		verifyElementNotPresent(collateralLabel);
		logger.info("Verified collateral labels");
		verifyElementNotPresent(meetingLabel);
		logger.info("Verifed meeting label");
		verifyElementNotPresent(tdmLabel);
		logger.info("Verfied tdm labels");

}}
