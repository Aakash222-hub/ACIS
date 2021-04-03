package com.acis.automation.pages.safetyassessment;

import java.util.List;

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

public class InvestigationSafetyAssessmentPage extends PageBase {

	public InvestigationSafetyAssessmentPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PersonsInvovled_OmniscriptPage.class);
	@FindBy(xpath = "//a[@title='Select List View']")
	WebElement listView;

	@FindBy(xpath = "//textarea[@id='Narrative']")
	WebElement narrative;

	@FindBy(xpath = "//span[normalize-space(.)='All Allegations']")
	WebElement allAllegation;

	@FindBy(xpath = "//*[@id='Interview']/div/label/div[2]/span")
	WebElement addButton;

	@FindBy(xpath = "//*[@id='Interview2']/div/label/div[2]/span")
	WebElement addButtonCaregiver;

	@FindBy(xpath = "(//span[normalize-space(.)='All Accounts'])[1]")
	WebElement allAccounts;

	@FindBy(xpath = "//span[normalize-space(.)='My Investigations'] ")
	WebElement myInvestigation;

	@FindBy(xpath = "(//*[@data-key='chevrondown'])[1]")
	WebElement downArrow;

	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Allegation Reports']")
	WebElement downArrowAllegation;

	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Home']")
	WebElement downArrowHome;

	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Accounts']")
	WebElement downArrowAccount;

	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Case Actions']")
	WebElement downArrowCaseAction;

	@FindBy(xpath = "//table/tbody/tr/th/span/a")
	WebElement firstRecord;

	@FindBy(xpath = "//input[@title='Search Allegation Reports and more']")
	WebElement globalSearchAllegation;

	@FindBy(xpath = "//mark[contains(text(),'I-')]")
	WebElement allegationRecord;

	@FindBy(xpath = "//mark[contains(text(),'C-')]")
	WebElement CaseRecord;

	@FindBy(xpath = "//div[@aria-label='Workspace tabs for ACIS']//*[contains(text(),'Close')]")
	WebElement closeButton;

	@FindBy(xpath = "//a[@title='New']")
	WebElement newButton;

	// Mrunal
	@FindBy(xpath = "//input[@role='textbox']")
	WebElement globalSearchDropdown;
	// Mrunal
	@FindBy(xpath = "//span[text()='All']")
	WebElement globalSearchDropdownAll;

	@FindBy(xpath = "(//a[@data-aura-class='forceOutputLookup'])[2]")
	WebElement caseIdLink;

	@FindBy(xpath = "//span[text()='Investigation - Allegation Reports']")
	WebElement investigationLink;

	@FindBy(xpath = "//a[@data-label='Related']")
	WebElement relatedTab;

	@FindBy(xpath = "(//a[@data-label='Details'])[2]")
	WebElement detailTab;

	@FindBy(xpath = "//a[@data-label='Details']")
	WebElement detailTabCaseId;

	@FindBy(xpath = "//div[text()='New Safety Assessment']")
	WebElement safetyAssementLink;

	@FindBy(xpath = "//button[text()='Next' and @type='button']")
	WebElement nextButtonSafetyAssementPage;

	@FindBy(xpath = "(//a[@data-label='Related'])[2]")
	WebElement relatedTab2;

	@FindBy(xpath = "//span[text()='Interactions']")
	WebElement intertactionLink;

	@FindBy(xpath = "//div[@class='slds-media__body']//..//p") // Please ensure you have completed the Decision Making
																// Tool.
	WebElement safetyRiskScaleError;

	@FindBy(xpath = "(// button[text()='Submit'])[last()]")
	WebElement submitButton;

	@FindBy(xpath = "//div[text()='required']")
	WebElement safetyDecissionPageError;

	@FindBy(xpath = "//button[@name='change owner']")
	WebElement changeOwnerButton;

	@FindBy(xpath = "//span[text()='Owner']//..//..//a")
	WebElement ownerLabel;

	@FindBy(xpath = "//button[contains(text(),'Previous')]")
	WebElement previousButton;

	@FindBy(xpath = "(// button[text()='Next'])[last()]")
	WebElement nextButton;

	@FindBy(xpath = "//span[text()='Safety Recommendation']//..//..//lightning-formatted-text")
	WebElement workerRecommendationLabel;

	@FindBy(xpath = "(//button[text()='Edit'])[2]")
	WebElement editAssesmentPage;

	@FindBy(xpath = "//label[text()='Safety Plan']/../../..//textarea")
	WebElement safetyPlanComments;

	@FindBy(xpath = "//button[text()='Save for later']")
	WebElement saveforLaterLink;

	@FindBy(xpath = "//button[text()='OK']")
	WebElement OkButton;

	@FindBy(xpath = "//span[text()='Your OmniScript is saved for later']")
	WebElement saveforLaterLabel;

	@FindBy(xpath = "//a[text()='link']")
	WebElement linkLink;

	@FindBy(xpath = "//a[text()='Email me the link']")
	WebElement emailLink;

	@FindBy(xpath = "//a[text()='Copy the link']")
	WebElement copylink;

	@FindBy(xpath = "//h1[text()='Review Allegation Report']")
	WebElement reviewAllegationReportLabel;

	@FindBy(xpath = "//span[text()='Status']//..//..//lightning-formatted-text[text()='In Progress']")
	WebElement inProgressLabel;

	@FindBy(xpath = "//span[text()='Status']//..//..//lightning-formatted-text[text()='New']")
	WebElement inNewLabel;

	@FindBy(xpath = "//div[contains(text(),'New Safety Assessment')]")
	WebElement newSafetyAssesmentLink;

	@FindBy(xpath = "//a[text()='Create Child(ren) Interview']")
	WebElement createChildLink;

	@FindBy(xpath = "//span[text()='Close Child Interview']//..//lightning-primitive-icon")
	WebElement closeChildInterviewButton;

	@FindBy(xpath = "//span[text()='Previous Month']//..//..//button")
	WebElement previousDateInterviewButton;

	@FindBy(xpath = "//*[@id='DateTime3']")
	WebElement interviewChildrenDateTime;

	@FindBy(xpath = "//span[text()='15']")
	WebElement interviewdate;

	@FindBy(xpath = "//p[text()='Please ensure child interviews have been captured prior to submitting Safety Assessment.']")
	WebElement interviewChildrenError;

	@FindBy(xpath = "//p[text()='Please ensure caregiver interviews have been captured prior to submitting Safety Assessment.']")
	WebElement interviewCaregiverError;

	@FindBy(xpath = "//span[text()='Investigation']//..//..//a")
	WebElement caseLinkAssesment;

	@FindBy(xpath = "//iframe[@title='accessibility title']")
	WebElement iframe;

	@FindBy(xpath = "(//textarea[@id='ProfessionalOpinion'])[2]")
	WebElement professionalOpinionInterview2;

	@FindBy(xpath = "(//textarea[@id='ProfessionalOpinion2'])[2]")
	WebElement professionalOpinionCaregiver2;

	@FindBy(xpath = "//input[@id='Scheduled']/following-sibling::span")
	WebElement scheduleCheckBox;

	@FindBy(xpath = "//*[@id='ChildInterviews_nextBtn']//p[text()='Save']")
	WebElement saveButtonInterview;

	@FindBy(xpath = "//*[@id='CaregiverInterview_nextBtn']//p[text()='Save']")
	WebElement savebuttonCaregiver;

	@FindBy(xpath = "//button[@title='Close Child Interview']")
	WebElement closeInterviewTab;

	@FindBy(xpath = "//button[@title='Close Caregiver Interview']")
	WebElement closeCaregiver;

	@FindBy(xpath = "//input[@id='DateTime4']")
	WebElement interviewCaregiverDateTime;

	@FindBy(xpath = "//iframe[@title='dashboard']")
	WebElement iframedashboard;

	@FindBy(xpath = "//tbody//tr//td")
	WebElement listInteractions;
	
	
	@FindBy(xpath="//button[@title='Close Interactions']")
	WebElement closeInteractionButton;
	
	@FindBy(xpath="//button[@title='Close Safety Assessment']")
	WebElement closeSafetyAssementButton;
	
	@FindBy(xpath="//button[text()='Workflow']")
	WebElement workflowLink;
	
	@FindBy(xpath="(//span[text()='Show actions']//..//..//button[@type='button'])[2]")
	WebElement downArrowButtton;
	
	@FindBy(xpath="//span[text()='Show Details']//..//..//a")
	WebElement showDetailButton;

	
	@FindBy(xpath="//span[text()='Allegation Report ID']//..//..//lightning-formatted-text")
	WebElement intakeAllegationLabel;
	
	//Mrunal
	@FindBy(xpath="//*[text()='Risk Assessment']/../../..//a[contains(@title,'A-')]")
	WebElement riskAssessmentID;
	//Mrunal
	@FindBy(xpath="//*[text()='Safety Assessment']/../../..//a[contains(@title,'A-')]")
	WebElement safetyAssessmentID;
	
	
	@FindBy(xpath="(//button[text()='Save'])[3]")
	WebElement saveButtonReporter;
	

	@FindBy(xpath="(//*[text()='Individuals Involved']/../..//button[text()='Save'])[last()]")
	WebElement saveButtonReporter1;
	/***
	 * @author akash.a.gaurav Clicking on Related tab
	 * @throws AcisException
	 * 
	 *                              Verifying warning message am missing a risk
	 *                              assessment and can choose to add an assessment
	 *                              or proceed to next step
	 * @throws InterruptedException
	 */
	public void verifyingErrorandSettingDates() throws AcisException, InterruptedException {

		String warningError = testData.get(Constants.InvestigationSafetyAssessment).get("warningMessage");
		String workerRecommendationError = testData.get(Constants.InvestigationSafetyAssessment)
				.get("workerReccomendationError");
		String narrativeInput = testData.get(Constants.InvestigationSafetyAssessment).get("narrativeText");
		String professionalInput = testData.get(Constants.InvestigationSafetyAssessment).get("professionalText");

		logger.info("Verifying risk assessment ");

		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);
		assessTheHome_SA_OmniScriptPage.setDate();

		logger.info("Setting the date prior to intake date");

		assessTheHome_SA_OmniScriptPage.narrativeProfessionalTextBox(narrativeInput, professionalInput);

		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);
		waitForPageLoadTill(9);

		verifyTextEquals(safetyRiskScaleError, warningError);

		logger.info("Verified warning message Error");

		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		clickWebElement(submitButton);

		verifyTextEquals(safetyDecissionPageError, workerRecommendationError);

		logger.info("Verified worker recommendation error");

	}

	/***
	 * Selecting worker Recoomendation as Safe and then verifying its status in
	 * Assesment Record page
	 * 
	 * @throws AcisException
	 */

	public void safeAndVerifyingStatus() throws AcisException {

		String workerSafe = testData.get(Constants.InvestigationSafetyAssessment).get("workerSafe");
		logger.info("Selecting and verifying worker recommendation as Safe");
		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		waitForPageLoadTill(9);
		safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
		logger.info("Selected worker recommendation as Safe");
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(19);
		clickWebElement(submitButton);
		logger.info("Clicked on Submit button");
		waitForPageLoadTill(9);
		verifyTextEquals(workerRecommendationLabel, workerSafe);
		logger.info("Verified worker recommendation selected as " + workerSafe);
		clickWebElement(editAssesmentPage);
		logger.info("Clicked on edit buttoon");
		waitForPageLoadTill(19);

	}

	/***
	 * Selecting worker Recommendation as Conditionally-Safe and then verifying its
	 * status in Assesment Record page
	 * 
	 * @throws AcisException
	 */

	public void ConditionallysafeAndVerifyingStatus() throws AcisException {
		String workerConditionally = testData.get(Constants.InvestigationSafetyAssessment)
				.get("workerSafeConditionally");
		String safetytext = testData.get(Constants.InvestigationSafetyAssessment).get("safetyPlan");
		logger.info("Selecting and verifying worker recommendation as Unconditionally safe");

		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);

		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);

		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);

		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(15);

		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);

		safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("ConditionallySafe");
		enterTextUsingJavascript(safetyPlanComments, safetytext);
		logger.info("Selected worker recommendation as UnconditionallySafe");
		waitForPageLoadTill(19);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,900)");
		actions.moveToElement(submitButton).doubleClick().build().perform();
		logger.info("Clicked on Submit button");
		waitForPageLoadTill(9);

		actions.sendKeys(Keys.ENTER).build().perform();
		waitForPageLoadTill(9);
		verifyTextEquals(workerRecommendationLabel, workerConditionally);
		logger.info("Verified worker recommendation selected as " + workerConditionally);

	}

	/***
	 * Selecting worker Recommendation as UnSafe and then verifying its status in
	 * Assesment Record page
	 * 
	 * @throws AcisException
	 */

	public void UnsafeAndVerifyingStatus() throws AcisException {

		String workerUnSafe = testData.get(Constants.InvestigationSafetyAssessment).get("workerUnsafe");
		logger.info("Selecting and verifying worker recommendation as UnSafe");

		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);

		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);

		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);

		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);

		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(15);

		safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("Unsafe");
		logger.info("Selected worker recommendation as UnSafe");
		waitForPageLoadTill(19);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,900)");
		waitForPageLoadTill(9);
		actions.moveToElement(submitButton).build().perform();
		waitForPageLoadTill(9);
		clickWebElement(submitButton);
		logger.info("Clicked on Submit button");
		waitForPageLoadTill(9);
		verifyTextEquals(workerRecommendationLabel, workerUnSafe);
		logger.info("Verified worker recommendation selected as " + workerUnSafe);
		clickWebElemntUsingJavascriptExecutor(editAssesmentPage);
		logger.info("Clicked on edit buttoon");
		waitForPageLoadTill(19);

	}

	/***
	 * Clicking on Save for later andm verifying the landing of it
	 * 
	 * @throws AcisException
	 * 
	 */

	public void saveforLater() throws AcisException {
		String reviewPage = testData.get(Constants.InvestigationSafetyAssessment).get("reviewLabel");
		String safe = testData.get(Constants.InvestigationSafetyAssessment).get("saveforLater");
		clickWebElemntUsingJavascriptExecutor(editAssesmentPage);
		logger.info("Clicked on edit buttoon");
		waitForPageLoadTill(19);
		logger.info("Verifying saveforlater and verifying it landinf page");
		verifyTextEquals(reviewAllegationReportLabel, reviewPage);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		clickWebElemntUsingJavascriptExecutor(saveforLaterLink);
		logger.info("Clicked on Save for later button");
		logger.info("Clicked on ok button");
		clickWebElement(OkButton);
		waitForPageLoadTill(17);
		verifyTextEquals(saveforLaterLabel, safe);
		waitForPageLoadTill(7);
		verifyElementNotPresent(linkLink);
		logger.info("Verified link link present");
		verifyElementNotPresent(emailLink);
		logger.info("Verified emailLink is present");
		verifyElementNotPresent(linkLink);
		logger.info("Verified copyLink Present");
		clickWebElemntUsingJavascriptExecutor(linkLink);
		waitForPageLoadTill(19);
		switchToWindowBytitle("c:investigationSafetyAssessmentEnglish | Salesforce");
		verifyTextEquals(reviewAllegationReportLabel, reviewPage);
		logger.info("Verified saved for later");

	}

	/***
	 * Clicking on detail tab
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * 
	 */

	public void clickDetailVerifyingStatusInProgress() throws AcisException {

		String status = testData.get(Constants.InvestigationSafetyAssessment).get("statusWhenNew");
		logger.info("Clicking on detail checking status");
		clickWebElement(detailTab);
		logger.info("Clicked on detail Tab");
		waitForPageLoadTill(9);

		verifyTextEquals(inNewLabel, status);
		logger.info("Verified Status is in New");

		waitForPageLoadTill(9);
		waitForElementClickable(relatedTab2);
		waitForPageLoadTill(9);
		clickWebElement(relatedTab2);
		logger.info("Clicked on related tab");
		waitForPageLoadTill(9);
		waitForElement(newSafetyAssesmentLink);
		waitForPageLoadTill(9);
		clickWebElemntUsingJavascriptExecutor(newSafetyAssesmentLink);
		logger.info("Clicked on New Safety Assesment Link");
		waitForPageLoadTill(19);

	}

	/***
	 * @author akash.a.gaurav Submitting new assessment
	 * @return
	 * @throws AcisException
	 */

	public String submitingNewAssessment() throws AcisException {

		String caseId = "";

		String status = testData.get(Constants.InvestigationSafetyAssessment).get("statusFirst");

		logger.info("Submitting   New Assesment safe");

		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);

		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);

		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);

		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(15);

		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		waitForPageLoadTill(9);
		safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
		logger.info("Selected worker recommendation as Safe");
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		actions.moveToElement(submitButton).doubleClick().build().perform();
		logger.info("Clicked on Submit button");
		waitForPageLoadTill(9);

		logger.info("Getting CaseID from Allegation Record Page");
		waitForPageLoad();
		waitForElement(caseLinkAssesment);
		logger.info("Getting Case ID");
		caseId = caseLinkAssesment.getText().trim();
		System.out.println("Case ID : " + caseId);
		logger.info("Returning Case ID from Case Record Page");
		clickWebElemntUsingJavascriptExecutor(caseLinkAssesment);
		logger.info("Clicked on case assesment  link");
		waitForPageLoadTill(9);
		clickWebElement(detailTab);
		logger.info("Clicked on Detail tab");
		waitForPageLoadTill(9);
		verifyTextEquals(inProgressLabel, status);
		logger.info("Verified status changed to new");
		return (caseId);

	}

	/***
	 * Verified Status logging investigation
	 * 
	 * @throws AcisException
	 */

	public void statusCheckInvestigation() throws AcisException {

		String status = testData.get(Constants.InvestigationSafetyAssessment).get("statusFirst");

		logger.info("Clicking on detail checking status");
		clickWebElement(detailTab);
		logger.info("Clicked on detail Tab");
		waitForPageLoadTill(9);

		verifyTextEquals(inProgressLabel, status);
		logger.info("Verified status changed to new");
	}

	/***
	 * Clicking on detail tab
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * 
	 */

	public void clickDetailVerifyingStatusInvestigation() throws AcisException {

		String status = testData.get(Constants.InvestigationSafetyAssessment).get("statusFirst");
		logger.info("Clicking on detail checking status");
		waitForPageLoadTill(9);
		clickWebElement(detailTabCaseId);
		logger.info("Clicked on detail Tab");
		waitForPageLoadTill(9);

		verifyTextEquals(inProgressLabel, status);
		waitForPageLoadTill(9);
		logger.info("Verified Status is in progress");

	}

	/**
	 * Global Search Enter for case action and click on the record Created By
	 * Dharmesh
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void searchGlobalCaseId(String strText) throws AcisException, InterruptedException {
		logger.info("Clicking on Global Search");
		waitForElement(downArrow);
		waitForElementClickable(globalSearchDropdown);
		clickWebElement(globalSearchDropdown);
		logger.info("Clicked on Global Search");
		logger.info("selecting All on Global Search Dropdown");
		clickWebElement(globalSearchDropdownAll);
		logger.info("selected All on Global Search Dropdown");
		waitForPageLoadTill(10);
		logger.info("Entering Text on Global Search");
		globalSearchAllegation.sendKeys(strText);
		waitForPageLoadTill(5);
		clickWebElement(CaseRecord);
		logger.info("Clicked on Case Record on Global Search");
		waitForPageLoadTill(10);
		logger.info("Global Search for Case Record");

	}

	/***
	 * Verifying Interview Page Erro
	 * 
	 * @author akash.a.gaurav
	 */

	public void verifyErrorInterviewChildrenCaregiver(String interviewError) {
		String childrenErro = testData.get(Constants.InvestigationSafetyAssessment).get("interviewChild");
		String caregiverErro = testData.get(Constants.InvestigationSafetyAssessment).get("interviewCaregiver");
		waitForPageLoad();

		switch (interviewError) {
		case "Children":
			verifyTextEquals(interviewChildrenError, childrenErro);
			logger.info("Verified Interview Child Page Error");
			break;

		case "Caregiver":
			verifyTextEquals(interviewCaregiverError, caregiverErro);
			logger.info("Verified Interview Child Page Error");
			break;

		default:
			logger.info("No matching method option");
			break;
		}
	}

	/***
	 * Clicking on adding child link and setting date Interview page
	 * 
	 * @author akash.a.gaurav
	 * 
	 */

	public void provideDateInterview() throws AcisException {
		String press = Keys.chord(Keys.SHIFT, Keys.TAB);
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);

		waitForPageLoadTill(9);

		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();

		clickWebElemntUsingJavascriptExecutor(nextButtonSafetyAssementPage);
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		waitForPageLoadTill(9);
		logger.info("Setting Date Prior to the date of record in Interview");
		clickWebElemntUsingJavascriptExecutor(createChildLink);
		logger.info("Clicking on add child link");

		driver.navigate().refresh();

		waitForPageLoadTill(30);
		switchToFrameByWebElement(iframe);
		waitForPageLoadTill(9);
		clickWebElement(interviewChildrenDateTime);
		waitForPageLoadTill(6);
		clickWebElement(previousDateInterviewButton);
		waitForPageLoadTill(4);
		clickWebElement(interviewdate);
		logger.info("Date Set Prior to the date of record in Interview");

	}

	/***
	 * Adding second interview data
	 * 
	 * @throws AcisException
	 * @author akash.a.gaurav
	 */

	public void addSecondInterview() throws AcisException {
		String professionalData1 = testData.get(Constants.InvestigationSafetyFeature)
				.get("professionalTextDataInterview2");
		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		waitForPageLoadTill(9);
		scrollingToElementofAPage(addButton);
		clickWebElement(addButton);
		waitForPageLoadTill(9);
		scrollingToElementofAPage(professionalOpinionInterview2);

		waitForElement(professionalOpinionInterview2);

		enterText(professionalOpinionInterview2, professionalData1);
		logger.info("profesionalopinion  for interview entered");
		waitForPageLoadTill(9);
		clickWebElement(saveButtonInterview);
		logger.info("Clicked on Save Button Interview Page");
		waitForPageLoadTill(17);
		logger.info("Closing interview");
		switchToDefaultContent();
		waitForPageLoadTill(9);
		clickWebElemntUsingJavascriptExecutor(closeInterviewTab);
		logger.info("Closed interview tab");
		waitForPageLoadTill(19);
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,500)");
		waitForPageLoadTill(19);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		clickWebElement(nextButtonSafetyAssementPage);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		clickWebElement(nextButtonSafetyAssementPage);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		clickWebElement(nextButtonSafetyAssementPage);
		waitForPageLoadTill(9);

	}

	/**
	 * O@author akash.a.gaurav Description: Enter Date for caregiver
	 * 
	 * @throws AcisException
	 */
	public void provideDate() throws AcisException {

		waitForPageLoadTill(30);
		switchToFrameByWebElement(iframe);
		waitForPageLoadTill(9);
		logger.info("Entering Date");
		clickWebElement(interviewCaregiverDateTime);
		waitForPageLoadTill(6);
		clickWebElement(previousDateInterviewButton);
		clickWebElement(interviewdate);
		logger.info("Entered Date");
	}

	/***
	 * Adding second interview data
	 * 
	 * @throws AcisException
	 * @author akash.a.gaurav
	 */

	public void addSecondInterviewCaregiver() throws AcisException {
		String professionalData1 = testData.get(Constants.InvestigationSafetyFeature)
				.get("professionalTextDataInterview2");
		waitForPageLoadTill(9);
		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		waitForPageLoadTill(9);
		scrollingToElementofAPage(addButtonCaregiver);
		clickWebElement(addButtonCaregiver);
		waitForPageLoadTill(9);
		scrollingToElementofAPage(professionalOpinionCaregiver2);

		waitForElement(professionalOpinionCaregiver2);

		enterText(professionalOpinionCaregiver2, professionalData1);
		logger.info("profesionalopinion  for interview entered");
		waitForPageLoadTill(9);
		clickWebElement(savebuttonCaregiver);
		logger.info("Clicked on Save Button Interview Page");
		waitForPageLoadTill(17);
		logger.info("Closing interview");
		switchToDefaultContent();
		waitForPageLoadTill(9);
		clickWebElemntUsingJavascriptExecutor(closeCaregiver);
		logger.info("Closed interview tab");
		waitForPageLoadTill(11);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		clickWebElement(nextButtonSafetyAssementPage);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		clickWebElement(nextButtonSafetyAssementPage);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		clickWebElement(nextButtonSafetyAssementPage);
		waitForPageLoadTill(9);

		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		waitForPageLoadTill(11);
		safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
		logger.info("Selected safe as recommendation");
		waitForPageLoadTill(11);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(11);
		clickWebElemntUsingJavascriptExecutor(submitButton);
		logger.info("Clicked on Submit");

	}

	/***
	 * Revieiwing the interview caregiver and children
	 * 
	 * @throws AcisException
	 * @author akash.a.gaurav
	 */

	public void reviewingInformation() throws AcisException {
		logger.info("Reviewing interview caregiver and children");
		waitForPageLoadTill(17);
		logger.info("Clicking on Link Assement");
		clickWebElemntUsingJavascriptExecutor(caseLinkAssesment);
		logger.info("Clicked on link assement");

		allegationReportPage.clickRelatedTab();
		logger.info("Clicked on Related");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		logger.info("Clicking on interaction");
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scrollBy(0,250)");
		waitForPageLoadTill(10);
		clickWebElemntUsingJavascriptExecutor(intertactionLink);
		logger.info("Clicked on Interaction Link");
	}

	/***
	 * Verifying Interview Children Type and Caregiver
	 * 
	 * @author akash.a.gaurav
	 */

	public void verifyInterview(String str1, String str2) {
		waitForPageLoadTill(9);

		List<WebElement> interactions = driver.findElements(By.xpath("//tbody//tr//td"));
		int interactionCount = interactions.size();

		for (int i = 0; i < interactionCount; i++) {
			System.out.println(interactions.get(i).getText());
			if (str1.equalsIgnoreCase(interactions.get(i).getText())
					&& str2.equalsIgnoreCase(interactions.get(i).getText())) {
				logger.info("Reviewd Interview of Caregiver and Children");
				break;
			}

		}

	}

	/***
	 * Verifying and click and workflow and view full intake record
	 * @throws AcisException 
	 */

	public void clickWorkFlowViewFullIntakeRecord() throws AcisException {
		
		waitForPageLoadTill(9);
		logger.info("Clicking on workflow");
		clickWebElemntUsingJavascriptExecutor(workflowLink);
		logger.info("Clicked on Workflow link");
        waitForPageLoadTill(29);
        logger.info("Clickingon down arrow");
        clickWebElemntUsingJavascriptExecutor(downArrowButtton);
    	
		waitForPageLoadTill(9);
        clickWebElemntUsingJavascriptExecutor(showDetailButton);
        switchToWindowIndex(1);
        
        //switchToWindowBytitle("I-00002067 | Salesforce");
       // switchToWindow();
        logger.info("Reviewed Workflow");
    	waitForPageLoadTill(9);
        verifyElementNotPresent(intakeAllegationLabel);
        logger.info("Intake allegation report id matched");
	}

	
	/**
	 * Get the assessment ID
	 * @author mrunal.s.tilekar
	 * @return 
	 */
	public String getAssessmentID(String assessmentType) {
		logger.info("Getting assessment Id  ");
		
		switch (assessmentType) {
		case "RiskAssessment":
			logger.info("Getting risk assessment Id ");
			logger.info("Risk Assessment ID is :" + riskAssessmentID.getText().trim());
			return riskAssessmentID.getText().trim();
			
		case "SafteyAssessment":
			logger.info("Getting risk assessment Id ");
			logger.info("Safety Assessment ID is :" + safetyAssessmentID.getText().trim());
			return safetyAssessmentID.getText().trim();
			
		default:
			break;
		}
		return null;
	}
	
	/**
	 * Close New Safety Assessments Tab
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void closeSafetyAssessmentsTab() throws AcisException {
		logger.info("Closing New Safety Assessment Tab");
		if(closeSafetyAssementButton.isDisplayed()) {

			clickWebElement(closeSafetyAssementButton);
			waitForPageLoadTill(2);
		}
		logger.info("Closed New Safety Assessments Tab");
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(10);
		logger.info("successfully Closed New Safety Assessments Tab");
	}
	/***
	 * Clicking on new safety assesment link
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 */
	
	public void newSafetyAssesment() throws AcisException {
		waitForPageLoadTill(9);
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(newSafetyAssesmentLink);
		waitForPageLoadTill(29);
		logger.info("Clicked on new safety assesment link");
		
		
	}
	/***
	 * Save Button reporter page
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 */
	
	public void saveReporterPage() throws AcisException {
		
		waitForPageLoad();
		try {
			clickWebElement(saveButtonReporter);
			waitForPageLoadTill(11);
		} catch (Exception e) {
		clickWebElement(saveButtonReporter1);
		waitForPageLoadTill(11);
		}
		logger.info("Clicked on save button");
	}
}
