package com.acis.automation.pages.investigation;

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

public class InvestigationCasePage extends PageBase {

	public InvestigationCasePage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(InvestigationCasePage.class);

	// Mrunal
	@FindBy(xpath = "(//a[text()='Related'])[last()]")
	WebElement relatedTab;

	@FindBy(xpath = "//button[contains(text(),'Workflow')]")
	WebElement investigationWorkflow;
	
	@FindBy(xpath = "//span[contains(text(),'Workflow')]")
	WebElement investigationWorkflowSupervisor;
	
	@FindBy(xpath = "//*[text()='Show more actions']/../../button")
	WebElement showMoreActionsButton;

	@FindBy(xpath = "(//table/tbody/tr/td/span/a)[1]")
	WebElement firstRecord;

	@FindBy(xpath = "//th/span/a[contains(text(),'CDA')]/../../../td[2]/span/span")
	WebElement firstRecordType;

	@FindBy(xpath = "//th/span/a[contains(text(),'CDA')]/../../../td[2]/span/span")
	WebElement firstRecordAllegedMaltreator;

	@FindBy(xpath = "//span[text()='Investigation Allegations']")
	WebElement allegationsTab;

	@FindBy(xpath = "//span[text()='Interactions']")
	WebElement interactionsTab;

	@FindBy(xpath = "//span[text()='Participants']")
	WebElement participantsTab;

	@FindBy(xpath = "//h1[text()='Investigation Allegations']")
	WebElement allegationsTitle;

	@FindBy(xpath = "//h1[text()='Interactions']")
	WebElement interactionsTitle;

	@FindBy(xpath = "//*[text()='Interactions ID']")
	WebElement interactionsID;

	@FindBy(xpath = "//slot/lightning-formatted-text[contains(text(),'C-')]")
	WebElement caseActionID;

	@FindBy(xpath = "//a[text()='Related']")
	WebElement allegationRelatedTab;

	@FindBy(xpath = "//span[text()='Investigation - Allegation Reports']/../../a")
	WebElement ivestiagtionAlleagationReportsTab;

	@FindBy(xpath = "//td//a[contains(text(),'C-')]")
	WebElement firstRowCaseID;

	@FindBy(xpath = "(//a[text()='Details'])[2]")
	WebElement caseDetailsTab;

	@FindBy(xpath = "(//a[text()='Details'])[1]")
	WebElement caseDetailsTab1;
	
	@FindBy(xpath = "(//a[text()='Details'])[2]")
	WebElement interviewTitle;

	@FindBy(xpath = "//span[text()='Case Type']")
	WebElement caseTypeTitle;

	@FindBy(xpath = "//span[text()='Case Type']/../..//*[text()='Investigation']")
	WebElement caseTypeInvestigationValue;

	@FindBy(xpath = "//*[text()='Status']")
	WebElement statusTitle;

	@FindBy(xpath = "//*[text()='Status']/../..//*[text()='New']")
	WebElement statusValueNew;

	@FindBy(xpath = "//span[text()='Date Opened']")
	WebElement dateOpenedTitle;

	@FindBy(xpath = "//span[text()='Due Date']")
	WebElement dueDateTitle;

	@FindBy(xpath = "//span[text()='Due Date']/../..//lightning-formatted-text")
	WebElement dueDateValue;

	@FindBy(xpath = "//span[text()='Date Opened']/../..//lightning-formatted-text")
	WebElement dateOpenedValue;

	@FindBy(xpath = "//span[text()='Special Handling']")
	WebElement specialHandlingTitle;

	@FindBy(xpath = "//button[@title='Edit Special Handling']")
	WebElement editSpecialHandling;

	@FindBy(xpath = "//button[@title='Move selection to Available']")
	WebElement moveSelectionToAvailable;

	@FindBy(xpath = "//button[@title='Move selection to Chosen']")
	WebElement moveToSelectionToChosen;

	@FindBy(xpath = "//span[contains(text(),'Large sibling groups of 4')]")
	WebElement sh_largeSiblingOption;

	@FindBy(xpath = "//span[text()='Parenting teen']")
	WebElement sh_parentingTeenOption;

	@FindBy(xpath = "//span[text()='Dual Diagnosis']")
	WebElement sh_dualDiagnosisOption;

	@FindBy(xpath = "//span[text()='Substance Exposed Newborn (SEN)']")
	WebElement sh_substanceExpostedNewbornOption;

	@FindBy(xpath = "//span[text()='Allegations of Severe Abuse / Neglect']")
	WebElement sh_allegationSevereAbuseOption;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveCaseButton;

	@FindBy(xpath = "//span[text()='Case Complexity']")
	WebElement caseComplexityTitle;

	@FindBy(xpath = "//span[text()='Case Complexity']/../..//*[text()='0']")
	WebElement caseComplexity_0;

	@FindBy(xpath = "//span[text()='Case Complexity']/../..//*[text()='2']")
	WebElement caseComplexity_2;

	@FindBy(xpath = "//span[text()='Case Complexity']/../..//*[text()='4']")
	WebElement caseComplexity_4;

	@FindBy(xpath = "//span[text()='Case Complexity']/../..//*[text()='6']")
	WebElement caseComplexity_6;

	@FindBy(xpath = "//span[text()='Case Complexity']/../..//*[text()='8']")
	WebElement caseComplexity_8;

	@FindBy(xpath = "//span[text()='Case Complexity']/../..//*[text()='10']")
	WebElement caseComplexity_10;

	@FindBy(xpath = "(//span[contains(text(),'Disposition')]/../..//*[text()='Screen In for Investigation'])")
	WebElement screenInForInvestiagtion;

	@FindBy(xpath = "(//span[contains(text(),'Decision')]/../..//*[text()='Accept & Assign'])")
	WebElement acceptAndAssign;

	@FindBy(xpath = "//span[contains(text(),'Assessment')]/../..//a")
	WebElement assessmentsTab;

	@FindBy(xpath = "//div[contains(text(),'New Safety Assessment')]")
	WebElement newSafetyAssessmentButton;
	
	@FindBy(xpath = "//*[contains(text(),'New Family Needs Assessment')]")
WebElement newFamilyNeedsAssessment;
	
	@FindBy(xpath = "//h1[contains(text(),'Review Allegation Report')]")
	WebElement reviewAllegationReportTitle;

	@FindBy(xpath = "(//*[contains(text(),'Case Persons')]/../..//a)[last()]")
	WebElement casePersonsTab;

	@FindBy(xpath = "(//a[contains(@title,'CP-')])[1]")
	WebElement firstCasePersonId;

	@FindBy(xpath = "(//*[text()='Edit'])[2]")
	WebElement editCasePersonButton;

	@FindBy(xpath = "//*[contains(text(),'Edit CP')]")
	WebElement editCasePersonTitle;

	@FindBy(xpath = "//*[text()='End Date']/../..//input[@type='text']")
	WebElement endDateTextBox;

	@FindBy(xpath = "//*[text()='15']")
	WebElement dateEndDate;

	@FindBy(xpath = "//*[@title='Previous Month']")
	WebElement previousMonth;

	@FindBy(xpath = "//*[@title='Next Month']")
	WebElement nextMonth;

	@FindBy(xpath = "//button[@title='Save']")
	WebElement editCaseSaveButton;

	@FindBy(xpath = "//*[contains(text(),'All allegations attached to this person must be disposed as \"ruled out\" to add an end date')]")
	WebElement ruleoutErrorMessgae;

	@FindBy(xpath = "//button[@title='Cancel']")
	WebElement editCaseCancelButton;

	@FindBy(xpath = "//button[contains(@title,'Close CP-')]")
	WebElement closeCasePersonIdTab;

	@FindBy(xpath = "//button[@title='Close Case Persons']")
	WebElement closeCasePersonsTab;

	@FindBy(xpath = "(//a[contains(text(),'CDA-')])[1]")
	WebElement firstCaseAllegationID;

	@FindBy(xpath = "//label[text()='Disposition']/../..//input")
	WebElement dispositionDropdown;

	@FindBy(xpath = "//span[text()='Substantiated']")
	WebElement substantiated;

	@FindBy(xpath = "//span[text()='Unsubstantiated']")
	WebElement unsubstantiated;

	@FindBy(xpath = "//span[text()='Ruled Out']")
	WebElement ruledOut;

	@FindBy(xpath = "//button[contains(@title,'Close CDA-')]")
	WebElement closeCaseAllegationButton;

	@FindBy(xpath = "//button[@title='Close Investigation Allegations']")
	WebElement closeAllegationsButton;

	@FindBy(xpath = "//a[@title='New Person']")
	WebElement addInvestigationPersonButton;

	@FindBy(xpath = "(//a[@title='New Person'])[last()]")
	WebElement addInvestigationPersonButton_Second;

	@FindBy(xpath = "//a[text()='ZZA aa']/../../..//a[contains(text(),'CP-')]")
	WebElement newlyAddedPersonCasePersonID;

	@FindBy(xpath = "//*[contains(text(),'The end date cannot be prior to the case start date or created date')]")
	WebElement endDateError;

	@FindBy(xpath = "//button[@title='Cancel']")
	WebElement cancelButton;

	@FindBy(xpath = "//button[text()='Create/Add']")
	WebElement createAddButton;

	@FindBy(xpath = "//h1[text()='Review Allegation Report']")
	WebElement verifyReviewAllegationLabel;

	@FindBy(xpath = "//button[@title='Close error dialog']")
	WebElement closeErrorDialogButton;

	@FindBy(xpath = "//button[@title='Close Assessments']")
	WebElement closeAssessmentsTabButton;

	// Khushboo
	@FindBy(xpath = "//span[text()='Investigation - Allegation Reports']")
	WebElement investigationAlligationReport;

	@FindBy(xpath = "//span[@title='Investigation Allegations']")
	WebElement investigationAlligationText;

	@FindBy(xpath = "//a[text()='Insights']")
	WebElement caseInsightTab;

	@FindBy(xpath = "(//a[text()='Related'])[last()]")
	WebElement caseRelatedTab;

	@FindBy(xpath = "//span[text()='Assessments']")
	WebElement assessmentsLink;

	@FindBy(xpath = "//span[@title='Assessment ID']")
	WebElement assessmentID;

	@FindBy(xpath = "(//span[@title='Type'])")
	WebElement assessmentType;

	@FindBy(xpath = "(//span[@title='Created Date'])")
	WebElement assessmentCreatedDate;

	@FindBy(xpath = "//span[@title='Status']")
	WebElement assessmentStatus;

	@FindBy(xpath = "//span[@data-proxy-id=\'aura-pos-lib-13\']")
	WebElement insightaccountname;

	@FindBy(xpath = "//span[text()='Closed']")
	WebElement statusClosed;
	
	@FindBy(xpath = "//b[text()='New Assignment']")
	WebElement labelNewReferralAssignment;

	@FindBy(xpath = "//*[@data-component-id='acisInsightsTabForInvestigationCase']/slot//div/h1")
	WebElement contentofAlligationStatus;

	@FindBy(xpath = "//p[text()='Date Opened']/..//lightning-formatted-text")
	WebElement textDateOpenedInvestigation;

	@FindBy(xpath = "//p[text()='Due Date']/..//lightning-formatted-text")
	WebElement textDueDateInvestigation;

	@FindBy(xpath = "//b[text()='    CREATED BY  ']/..//..//a")
	WebElement textCreatedBy;

	@FindBy(xpath = "(//a[contains(text(),'A-')])[1]")
	WebElement firstAssessmentRecord;

	@FindBy(xpath = "//p[text()='Child Welfare Case ID']/..//lightning-formatted-text")
	WebElement caseActionIDinvestigation;

	@FindBy(xpath = "//p[text()='Case Head']/..//span")
	WebElement caseHeadInvestigation;

	@FindBy(xpath = "//h1//*[text()='Interactions']")
	WebElement waitInteractions;

	@FindBy(xpath = "//span[text()='Case Head']/../..//a")
	WebElement caseHeadDetails;

	@FindBy(xpath = "//h1/*[text()='Case Head']")
	WebElement caseHeadVerify;

	@FindBy(xpath = "//span[text()='INTAKE SUMMARY']")
	WebElement intakeSummary;

	@FindBy(xpath = "//a[@data-label='Insights']")
	WebElement insightTab;

	@FindBy(xpath = "//*[text()='Save for later']")
	WebElement saveForlater;
	@FindBy(xpath = "//button[text()='OK']")
	WebElement ok;

	@FindBy(xpath = "//span[text()='Your OmniScript is saved for later']")
	WebElement omniscriptsaveForLater;

	@FindBy(xpath = "//h1[text()='New Decison Making Tool']")
	WebElement decisionMakingToolTitle;

	@FindBy(xpath = "//div[text()='Decision Making Tool']")
	WebElement decisionMakingTool;

	@FindBy(xpath = "(//table/tbody/tr/td[3]/span/a)[1]")
	WebElement myInvestigationFirstRecord;

	@FindBy(xpath = "//lightning-formatted-text[contains(text(),'C-')]")
	WebElement investigationID;
	
	@FindBy(xpath = "(//div[text()='New Person'])[2]")
	WebElement caseNewPerson;

	@FindBy(xpath = "//*[contains(text(),'Locate Relative')]")
	WebElement locateRelativeKinButton;

	@FindBy(xpath = "//h1[contains(text(),'Locate Relative')]")
	WebElement locateRelativeKinTitle;
	
	@FindBy(xpath = "//button[@title='Close Locate Relatives/Kin']")
	WebElement closeLocateRelativeKinButton;
	
	@FindBy(xpath ="//span[contains(@title,'Case Person I')]")
	WebElement casePersonIDTitle;
	
	@FindBy(xpath ="//span[contains(text(),'Sorted by Case Person I')]")
	WebElement sortedByCasePersonID;
	
	@FindBy(xpath = "//h1[contains(text(),'Involved')]")
	WebElement personsInvolvedTitle;
	
	public By locateRelativeKinButtonBy = By.xpath("//*[contains(text(),'Locate Relative')]");

	public By investigationWorkflowBy = By.xpath("//button[contains(text(),'Workflow')]");
	
	public By casePersonIdDescendingOrderBy = By.xpath("//span[contains(@title,'Case Person I')]/../..//span[contains(text(),'Descending')]");
	
	public By casePersonIdAscendingOrderBy = By.xpath("//span[contains(@title,'Case Person I')]/../..//span[contains(text(),'Ascending')]");



	/**
	 * Click on First Record Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickFirstRecord() throws AcisException {
		logger.info("Clicking on first Record from List View");
		waitForElementClickable(firstRecord);
		clickWebElement(firstRecord);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on first Record from List View");

	}
	/**
	 * Click on First Edit Investigation case status Created By Priyanka
	 * 
	 * @throws AcisException
	 */
	
		public void editInvestigationStatus() throws AcisException {
			logger.info("clicking on edit button on case Person");
			clickWebElement(driver.findElement(By.xpath("(//*[text()='Edit'])[1]")));
			waitForPageLoadTill(5);
			// waitForElement(editCasePersonTitle);
			logger.info("clicking on edit button on case Person");
			logger.info("Selecting status As Closed");
			waitForElement(statusValueNew);
			clickWebElemntUsingJavascriptExecutor(statusValueNew);
			waitForPageLoadTill(5);
			waitForElement(statusClosed);
			clickWebElemntUsingJavascriptExecutor(statusClosed);
			logger.info("Selected status As Closed");
		}
	/**
	 * Verifying Intake Summary on Invesitgation Case Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void verifyIntakeSummary(String strText) throws AcisException {
		logger.info("Verifying Intake Summary on Investigation Case");
		Actions act = new Actions(driver);
		act.moveToElement(insightTab).click().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.ARROW_DOWN).build().perform();
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.ARROW_DOWN).build().perform();
		clickWebElemntUsingJavascriptExecutor(intakeSummary);
		waitForPageLoadTill(5);
		clickWebElement(driver.findElement(
				By.xpath("//*[contains(text(),'INTAKE SUMMARY')]/../../../..//*[text()='" + strText + "']")));
		logger.info("Verified Intake Summary on Investigation Case");
	}

	/**
	 * Clicked on Related Tab on a Investigation Record Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickRelatedTab() throws AcisException {
		logger.info("Clicking on Related Tab");
		waitForPageLoadTill(5);
		// waitForElement(editCasePersonButton);
		clickWebElemntUsingJavascriptExecutor(relatedTab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Related Tab");
	}

	/**
	 * Clicked on Related Tab on a Interactions Record Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void verifyInteractionsParticipants() throws AcisException {
		logger.info("Clicking on Related Tab");
		waitForElement(waitInteractions);
		clickWebElemntUsingJavascriptExecutor(relatedTab);
		waitForPageLoadTill(5);
		waitForPageLoad();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		waitForElement(participantsTab);

	}

	/**
	 * Clicked on Investigation Workflow on a Investigation Record Created By
	 * Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickInvestigationWorkflow() throws AcisException {
		logger.info("Clicking on Investigation Workflow");
		waitForElement(caseActionID);
		if(isElementPresent(investigationWorkflowBy))
		{
			clickWebElement(investigationWorkflow);
		}
		else
		{
			clickWebElement(showMoreActionsButton);
			waitForPageLoadTill(5);
			clickWebElement(investigationWorkflowSupervisor);
			
		}
		
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElement(verifyReviewAllegationLabel);
		logger.info("Clicked on Investigation Workflow");
	}
	
	/**
	 * Clicked on Locate Relative/Kin on a Investigation Record Created By
	 * Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickLocateRelativeKin() throws AcisException {
		logger.info("Clicking on Locate Relative/Kin");
		waitForPageLoadTill(10);
		waitForElement(caseActionID);
		if(isElementPresent(locateRelativeKinButtonBy))
		{
			clickWebElement(locateRelativeKinButton);
		}
		else
		{
			clickWebElement(showMoreActionsButton);
			waitForPageLoadTill(5);
			clickWebElement(locateRelativeKinButton);
		}
			
		
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElement(locateRelativeKinTitle);
		logger.info("Clicked on Locate Relative/Kin");
	}

	/**
	 * Owner : Dharmesh Description : Click on Allegation Related Tab
	 * 
	 * @throws AcisException
	 */
	public void clickAllegationTab() throws AcisException {
		logger.info("Clicking on Allegation Tab");
		waitForPageLoadTill(5);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		waitForPageLoadTill(5);
		scrollingToElementofAPage(allegationsTab);
		clickWebElemntUsingJavascriptExecutor(allegationsTab);
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(allegationsTitle);
		logger.info("Clicked on Allegation Tab");
	}

	/**
	 * Owner : Dharmesh Description : Click on Interactions Related Tab
	 * 
	 * @throws AcisException
	 */
	public void clickInteractionsTab() throws AcisException {
		logger.info("Clicking on Interactions Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(interactionsTab);
		clickWebElemntUsingJavascriptExecutor(interactionsTab);
		waitForPageLoadTill(2);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(interactionsTitle);
		logger.info("Clicked on Interactions Tab");
	}

	/**
	 * Verify Access To New Safety Assessment button
	 * 
	 * @author priyanka wani
	 * @throws AcisException
	 */
	public void verifyAccessToNewSafetyAssessmentButton() throws AcisException {
		logger.info("Clicking  on New Safety Assessment button");
		waitForPageLoadTill(5);
		waitForPageLoad();
		clickWebElement(newSafetyAssessmentButton);
		waitForPageLoadTill(2);
		logger.info("Clicked  on New Safety Assessment button");
		waitForElement(driver.findElement(By.xpath("//span[text()='You are not allowed to perform this operation.']")));
		// waitForPageLoadTill(3);
		List<WebElement> msgCount = driver
				.findElements(By.xpath("//span[text()='You are not allowed to perform this operation.']"));
		if (msgCount.size() == 1) {
			logger.info("Error:You are not allowed to perform this operation.");
		}

	}
	/**
	 * Verify Access To workflow
	 * 
	 * @author priyanka wani
	 * @throws AcisException
	 */
	public void verifyAccessToInvestigationWorkflow() throws AcisException {
		logger.info("Clicking on Investigation Workflow");
		waitForElement(caseActionID);
		clickWebElement(investigationWorkflow);
		logger.info("Clicked on Investigation Workflow");
		waitForPageLoadTill(5);
		waitForElement(driver.findElement(By.xpath("//span[text()='You are not allowed to perform this operation.']")));
		// waitForPageLoadTill(3);
		List<WebElement> msgCount = driver
				.findElements(By.xpath("//span[text()='You are not allowed to perform this operation.']"));
		if (msgCount.size() == 1) {
			logger.info("Error:You are not allowed to perform this operation.");
		}
	}
	/**
	 * Verify Access To Decision Making Tool button
	 * 
	 * @author priyanka wani
	 * @throws AcisException
	 */
	public void verifyAccessTodecisionMakingTool() throws AcisException {
		logger.info("Clicking  on decision Making Tool");
		waitForPageLoadTill(5);
		waitForPageLoad();
		clickWebElement(decisionMakingTool);
		waitForPageLoadTill(3);
		logger.info("Clicked on decision Making Tool");
		waitForElement(driver.findElement(By.xpath("//span[text()='You are not allowed to perform this operation.']")));
		// waitForPageLoadTill(3);
		List<WebElement> msgCount = driver
				.findElements(By.xpath("//span[text()='You are not allowed to perform this operation.']"));
		if (msgCount.size() == 1) {
			logger.info("Error:You are not allowed to perform this operation.");
		}
	}

	/**
	 * Click on First Assessment Record Created By Priyanka
	 * 
	 * @throws AcisException
	 */
	public void clickAssessmentFirstRecord() throws AcisException {
		logger.info("Clicking on first Assessment Record from List View");
		waitForElementClickable(firstAssessmentRecord);
		clickWebElement(firstAssessmentRecord);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on first Assessment Record from List View");

	}

	// priyanka
	public void verifyAccessToEditSafetyAssessmentButton() throws AcisException {
		logger.info("Clicking  on Edit Safety Assessment button");
		waitForPageLoadTill(5);
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(editCasePersonButton);
		waitForPageLoadTill(3);
		logger.info("Clicked  on Edit Safety Assessment button");
		waitForElement(driver.findElement(By.xpath("//span[text()='You are not allowed to perform this operation.']")));
		// waitForPageLoadTill(3);
		List<WebElement> msgCount = driver
				.findElements(By.xpath("//span[text()='You are not allowed to perform this operation.']"));
		if (msgCount.size() == 1) {
			logger.info("Error:You are not allowed to perform this operation.");
		}

	}

	/**
	 * Owner : Dharmesh Description : Verify Interactions Label
	 * 
	 * @throws AcisException
	 */
	public void verifyInteraction() throws AcisException {
		logger.info("Verifying on Interactions Label and Interactions ID");
		waitForElement(interactionsTitle);

		logger.info("Verified on Interactions Label and Interactions ID");
	}

	/**
	 * Click on Details Tab of Investigation case
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickDetailsTabOfInvestigation() throws AcisException {
		logger.info("Clicking Investigation Case Details Tab");
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(10);
		clickWebElemntUsingJavascriptExecutor(caseDetailsTab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked Investigation Case Details Tab");
	}
	public void clickDetailsTab() throws AcisException {
		logger.info("Clicking Investigation Case Details Tab");
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(caseDetailsTab1);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked Investigation Case Details Tab");
	}
	/**
	 * Verify case type Investigation, new status of Investigation case
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifyInformationOnInvestigationCase() throws AcisException {

		logger.info("Verifying case type Investigation,  new status of Investigation  case");
		
		Assert.assertTrue(caseTypeTitle.isDisplayed(), "Error : Case Title not displayed");
		Assert.assertTrue(caseTypeInvestigationValue.isDisplayed(), "Error : Case value Investigation not displayed");
		Assert.assertTrue(statusTitle.isDisplayed(), "Error : Status Title not displayed");
		Assert.assertTrue(statusValueNew.isDisplayed(), "Error : Status New Value not displayed");
		Assert.assertTrue(dateOpenedTitle.isDisplayed(), "Error : Date Open title not displayed");
		Assert.assertTrue(dueDateTitle.isDisplayed(), "Error : Due Date title not displayed");
		Assert.assertTrue(screenInForInvestiagtion.isDisplayed(),
				"Error : Screen In For Investiagtion value not displayed");
		Assert.assertTrue(acceptAndAssign.isDisplayed(), "Error : Accept and Assign value not displayed");
		
		logger.info("Verified case type Investigation,  new status of Investigation  case");
	}

	/**
	 * Verify Special Handling Values and its associated complexity
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void verifySpecialHandlingAndComplexity() throws AcisException {

		scrollingToElementofAPage(specialHandlingTitle);
		Assert.assertTrue(specialHandlingTitle.isDisplayed(), "Error : Special Handling  Title not displayed");
		Assert.assertTrue(caseComplexity_0.isDisplayed(), "Error: Case Complexity 0 Not Displayed");
		logger.info("Case Complexity 0 Displayed");

		logger.info("Verifying Case Complexity 2 Displayed");
		clickWebElemntUsingJavascriptExecutor(editSpecialHandling);
		waitForPageLoadTill(6);
		// scrollingToElementofAPage(specialHandlingTitle);
		scrollingToElementofAPage(sh_allegationSevereAbuseOption);
		clickWebElemntUsingJavascriptExecutor(sh_largeSiblingOption);
		clickWebElemntUsingJavascriptExecutor(moveToSelectionToChosen);
		clickWebElement(saveCaseButton);
		waitForPageLoadTill(5);
		Assert.assertTrue(caseComplexity_2.isDisplayed(), "Error: Case Complexity 2 Not Displayed");
		logger.info("Case Complexity 2 Displayed");

		logger.info("Verifying Case Complexity 4 Displayed");
		clickWebElemntUsingJavascriptExecutor(editSpecialHandling);
		waitForPageLoadTill(6);
		scrollingToElementofAPage(sh_allegationSevereAbuseOption);
		clickWebElemntUsingJavascriptExecutor(sh_parentingTeenOption);
		clickWebElemntUsingJavascriptExecutor(moveToSelectionToChosen);
		clickWebElement(saveCaseButton);
		waitForPageLoadTill(5);
		Assert.assertTrue(caseComplexity_4.isDisplayed(), "Error: Case Complexity 4 Not Displayed");
		logger.info("Case Complexity 4 Displayed");

		logger.info("Verifying Case Complexity 6 Displayed");
		clickWebElemntUsingJavascriptExecutor(editSpecialHandling);
		waitForPageLoadTill(6);
		scrollingToElementofAPage(sh_allegationSevereAbuseOption);
		clickWebElemntUsingJavascriptExecutor(sh_dualDiagnosisOption);
		clickWebElemntUsingJavascriptExecutor(moveToSelectionToChosen);
		clickWebElement(saveCaseButton);
		waitForPageLoadTill(5);
		Assert.assertTrue(caseComplexity_6.isDisplayed(), "Error: Case Complexity 6 Not Displayed");
		logger.info("Case Complexity 6 Displayed");

		logger.info("Verifying Case Complexity 8 Displayed");
		clickWebElemntUsingJavascriptExecutor(editSpecialHandling);
		waitForPageLoadTill(6);
		scrollingToElementofAPage(sh_allegationSevereAbuseOption);
		clickWebElemntUsingJavascriptExecutor(sh_substanceExpostedNewbornOption);
		clickWebElemntUsingJavascriptExecutor(moveToSelectionToChosen);
		clickWebElement(saveCaseButton);
		waitForPageLoadTill(5);
		Assert.assertTrue(caseComplexity_8.isDisplayed(), "Error: Case Complexity 8 Not Displayed");
		logger.info("Case Complexity 8 Displayed");

		logger.info("Verifying Case Complexity 10 Displayed");
		clickWebElemntUsingJavascriptExecutor(editSpecialHandling);
		waitForPageLoadTill(6);
		scrollingToElementofAPage(sh_allegationSevereAbuseOption);
		clickWebElemntUsingJavascriptExecutor(sh_allegationSevereAbuseOption);
		clickWebElemntUsingJavascriptExecutor(moveToSelectionToChosen);
		clickWebElement(saveCaseButton);
		waitForPageLoadTill(5);
		Assert.assertTrue(caseComplexity_10.isDisplayed(), "Error: Case Complexity 10 Not Displayed");
		logger.info("Case Complexity 10 Displayed");

		testLoggerInfo("Complexity Value Checked");

	}

	/**
	 * click on Assessments Tab
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickAssessmentsTab() throws AcisException {
		logger.info("Clicking on Assessments Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		waitForElementClickable(assessmentsTab);
		scrollingToElementofAPage(assessmentsTab);
		clickWebElemntUsingJavascriptExecutor(assessmentsTab);
		waitForPageLoadTill(2);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(newSafetyAssessmentButton);
		logger.info("Clicked on Assessments Tab");

	}

	/**
	 * Click on New Safety Assessment button
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickNewSafetyAssessmentButton() throws AcisException {
		logger.info("Clicking  on New Safety Assessment button");
		waitForPageLoadTill(5);
		waitForPageLoad();
		clickWebElemntUsingJavascriptExecutor(newSafetyAssessmentButton);
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicked  on New Safety Assessment button");
		waitForPageLoadTill(5);
		waitForElement(reviewAllegationReportTitle);
		logger.info(" New Safety Assessment flow page loaded successfully");

	}

	/**
	 * Owner : Mrunal Description : Click on Case Persons Tab
	 * 
	 * @throws AcisException
	 */
	public void clickCasePersonTab() throws AcisException {
		logger.info("Clicking on Case Persons Tab");
		waitForPageLoadTill(5);
		  Actions act = new Actions(driver);
		  act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		  waitForPageLoadTill(5);
		  act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		  waitForPageLoadTill(5);
		  scrollingToElementofAPage(casePersonsTab);
		  waitForPageLoadTill(5);
		 
		clickWebElemntUsingJavascriptExecutor(casePersonsTab);
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(addInvestigationPersonButton);
		logger.info("Clicked on Case Persons Tab");
	}
	//priyanka
	public void verifyCasePersondetails(String name) throws AcisException {
		logger.info("Verifying on Case Persons details added");
		waitForPageLoadTill(5);
		Assert.assertTrue(driver.findElement(By.xpath("(//a[contains(text(),'"+ name+"')])[last()]")).isDisplayed());
		logger.info("Verified  on Case Persons details added ");
		logger.info("Any new persons or new allegations (which were not on the investigation) are added to the investigation and existing persons or allegations are not duplicated");
	}
	/**
	 * Owner : priyanka Description : Fetch case id on Investigation page
	 * 
	 * @throws AcisException
	 */
	public String getCaseId() throws AcisException {
		logger.info("Fetching Case Id: ");
		waitForPageLoadTill(5);
		String caseActionIdtext = caseActionIDinvestigation.getText();
		logger.info("Case Id is" + caseActionIdtext);
		return caseActionIdtext;
	}
	/**
	 * Owner : priyanka Description : Click on case Id -Case Persons Tab
	 * 
	 * @throws AcisException
	 */
	public void ClickOnCaseIdOnCasePersonTab(String caseId) throws AcisException {
		logger.info("Clicking on Case Id");
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("(//span[text()='"+ caseId+"'])[last()]")));
		
		logger.info("Clicked on Case Id ");
	}
	/**
	 * Owner : Dharmesh Description : Verify Allegations Record
	 * 
	 * @throws AcisException
	 */
	public void verifyAllegationRecord(String Type1, String Type2, String Maltreator, String Victim1, String Victim2)
			throws AcisException {
		logger.info("Verifying Allegation Record");
		waitForElement(driver
				.findElement(By.xpath("//*[contains(text(),'"+Type1 +"')]/../../following-sibling::*//a[contains(text(),'"+ 
						Maltreator +"')]/../../following-sibling::*//a[contains(text(),'"+ Victim1+"')]")));
		logger.info("Verified "+ Type1+" Allegation Record");
		waitForElement(driver
				.findElement(By.xpath("//*[contains(text(),'"+ Type2 +"')]/../../following-sibling::*//a[contains(text(),'"+ 
						Maltreator +"')]/../../following-sibling::*//a[contains(text(),'"+ Victim2 +"')]")));
		logger.info("Verified "+Type2+" Allegation Record");
	}

	/**
	 * Verify Error:The end date cannot be prior to the case start date or created
	 * date
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void verifyEndDateError() throws AcisException {
		logger.info("Verifying Error:The end date cannot be prior to the case start date or created date");
		scrollingToElementofAPage(endDateTextBox);
		clickWebElemntUsingJavascriptExecutor(endDateTextBox);
		clickWebElement(previousMonth);
		waitForPageLoadTill(3);
		clickWebElement(dateEndDate);
		clickWebElement(saveCaseButton);
		waitForPageLoadTill(5);
		Assert.assertTrue(endDateError.isDisplayed(),
				"Error : The end date cannot be prior to the case start date or created date Not dislayed");
		logger.info("Verified Error:The end date cannot be prior to the case start date or created date");

		logger.info("Closing error dialog box");
		if (closeErrorDialogButton.isDisplayed()) {
			clickWebElemntUsingJavascriptExecutor(closeErrorDialogButton);
			waitForPageLoadTill(3);
		}
		logger.info("Closed error dialog box");
		endDateTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));
	}

	/**
	 * Click on case person Id
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 * 
	 */
	public void clickCasePersonID(String personName) throws AcisException {

		logger.info("clicking on case person ID");
		clickWebElement(
				driver.findElement(By.xpath("//a[text()='" + personName + "']/../../..//a[contains(text(),'CP-')]")));
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(editCasePersonButton);
		logger.info("clicked on case person ID");

	}

	/**
	 * click on edit button on case Person
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickEditButton() throws AcisException {

		logger.info("clicking on edit button on case Person");
		clickWebElement(editCasePersonButton);
		waitForPageLoadTill(5);
		// waitForElement(editCasePersonTitle);
		logger.info("clicking on edit button on case Person");
	}

	/**
	 * click on case head button on case Person
	 * 
	 * @author dharmesh krishna
	 * @throws AcisException
	 */
	public void clickCaseHead() throws AcisException {

		logger.info("Clicking on Case Head on Details Page");
		waitForElement(caseHeadDetails);
		clickWebElement(caseHeadDetails);
		waitForElement(caseHeadVerify);
		refreshPage();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicking on Case Head on Details Page");
	}

	/**
	 * Select end date and verify error: All allegations attached to this person
	 * must be disposed as "ruled out" to add an end date
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void verifyRuledOutError() throws AcisException {
		logger.info("Verifying ruleout error");
		waitForPageLoadTill(5);
		waitForElement(endDateTextBox);
		scrollingToElementofAPage(endDateTextBox);
		clickWebElemntUsingJavascriptExecutor(endDateTextBox);
		clickWebElement(dateEndDate);
		clickWebElement(saveCaseButton);
		waitForPageLoadTill(5);
		Assert.assertTrue(ruleoutErrorMessgae.isDisplayed(), "Error:Ruled out error is not present");
		logger.info("Closing error dialog box");
		if (closeErrorDialogButton.isDisplayed()) {
			clickWebElemntUsingJavascriptExecutor(closeErrorDialogButton);
			waitForPageLoadTill(3);
		}
		logger.info("Closed error dialog box");
		// clickWebElement(cancelButton);
		logger.info("Verified ruleout error");
		endDateTextBox.sendKeys(Keys.chord(Keys.CONTROL, "a", Keys.DELETE));

	}

	/**
	 * Close Case Person Id Tab
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void closeCasePersonIdTab() throws AcisException {
		logger.info("Closing Case Person c Tab");
		if (closeCasePersonIdTab.isDisplayed()) {

			clickWebElement(closeCasePersonIdTab);
			waitForPageLoadTill(2);
		}
		logger.info("Closed Case Person Id Tab");
		driver.navigate().refresh();
		waitForPageLoad();
		waitForElement(addInvestigationPersonButton);
		logger.info("successfully closed case person id window");
	}

	/**
	 * Close Case Person Tab
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void closeCasePersonTab() throws AcisException {
		logger.info("Closing Case Persons Tab");
		if (closeCasePersonsTab.isDisplayed()) {

			clickWebElement(closeCasePersonsTab);
			waitForPageLoadTill(5);

		}
		logger.info("Closed Case Persons Tab");
	}

	/**
	 * Close Allegations ID Tab
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void closeAllegationIdTab() throws AcisException {
		logger.info("Closing Allegations ID Tab");
		if (closeCaseAllegationButton.isDisplayed()) {

			clickWebElement(closeCaseAllegationButton);
			waitForPageLoadTill(2);

		}
		logger.info("Closing Allegations ID Tab");
		driver.navigate().refresh();
		waitForPageLoad();
		waitForElement(firstCaseAllegationID);
		logger.info("successfully closed Allegations ID  window");

	}

	/**
	 * Close Allegations Tab
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void closeAllegationTab() throws AcisException {
		logger.info("Closing Allegations Tab");
		if (closeAllegationsButton.isDisplayed()) {

			clickWebElement(closeAllegationsButton);
			waitForPageLoadTill(2);

		}
		logger.info("Closing Allegations Tab");
	}

	/**
	 * Click on case allegation Id
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 * 
	 */
	public void clickCaseAllegationID(String personName) throws AcisException {

		logger.info("clicking on case Allegation ID");
		waitForPageLoadTill(5);
		clickWebElement(
				driver.findElement(By.xpath("//*[text()='" + personName + "']/../../..//*[contains(text(),'CDA-')]")));
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("clicked on case Allegation ID");
		waitForElement(editCasePersonButton);

	}

	/**
	 * Select Disposition Value
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void selectDispositionValue(String dispositionOption) throws AcisException {

		scrollingToElementofAPage(dispositionDropdown);
		clickWebElemntUsingJavascriptExecutor(dispositionDropdown);
		waitForPageLoadTill(5);
		switch (dispositionOption) {
		case "Substantiated":
			waitForElement(substantiated);
			clickWebElement(substantiated);
			logger.info("Disposition Value selected : " + dispositionOption);
			break;
		case "Unsubstantiated":
			waitForElement(unsubstantiated);
			clickWebElement(unsubstantiated);
			logger.info("Disposition Value selected : " + dispositionOption);
			break;
		case "Ruled Out":
			waitForElement(ruledOut);
			clickWebElement(ruledOut);
			logger.info("Disposition Value selected : " + dispositionOption);
			break;
		default:
			logger.info("Disposition Value Not found : " + dispositionOption);
		}

	}

	/**
	 * click on Save button
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */

	public void clickSaveButton() throws AcisException {
		logger.info("clicking on Save button");
		clickWebElement(saveCaseButton);
		waitForPageLoadTill(10);
		logger.info("clicked on Save button");
	}

	/**
	 * click on Cancel button
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */

	public void clickCancelButton() throws AcisException {
		logger.info("clicking on Cancel button");
		clickWebElement(cancelButton);
		waitForPageLoadTill(5);
		logger.info("clicked on Cancel button");
	}

	/**
	 * Click Add Investigation Person Button
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickAddInvestigationPersonButton() throws AcisException {
		logger.info("Clicking Add Investigation Person Button");
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(addInvestigationPersonButton);
		waitForPageLoadTill(7);
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked Add Investigation Person Button");
		waitForElement(personsInvolvedTitle);
		waitForPageLoadTill(10);

	}

	/**
	 * Click Add Investigation Person Button
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickAddInvestigationPersonButtonVerfiying() throws AcisException {
		logger.info("Clicking Add Investigation Person Button");
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(addInvestigationPersonButton_Second);
		waitForPageLoadTill(17);
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked Add Investigation Person Button");
		waitForPageLoadTill(5);

	}

	/**
	 * Select next month End Date
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void selectNextMonthEndDate() throws AcisException {
		logger.info("Selecting next month End Date");
		scrollingToElementofAPage(endDateTextBox);
		clickWebElemntUsingJavascriptExecutor(endDateTextBox);
		clickWebElement(nextMonth);
		waitForPageLoadTill(3);
		clickWebElement(dateEndDate);
		clickWebElement(saveCaseButton);
		waitForPageLoadTill(10);
		logger.info("Selected next month End Date");

	}

	/**
	 * Close Assessments Tab
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void closeAssessmentsTab() throws AcisException {
		logger.info("Closing Case Safety Assessment Tab");
		waitForPageLoad();
		waitForPageLoadTill(10);
		if (closeAssessmentsTabButton.isDisplayed()) {

			clickWebElement(closeAssessmentsTabButton);
			waitForPageLoadTill(2);
		}
		logger.info("Closed Assessments Tab");
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(10);
		logger.info("successfully Closed Assessments Tab");
	}

	/**
	 * Click on case person
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 * 
	 */
	public void clickCasePerson(String personName) throws AcisException {
		logger.info("clicking on case person :" + personName);
		waitForPageLoadTill(5);
		try {
			Actions act = new Actions(driver);
			act.moveToElement(driver.findElement(By.xpath("(//a[text()='" + personName + "'])[1]"))).click().perform();
		} catch (Exception e) {
			clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("(//a[text()='" + personName + "'])[1]")));
		}
		waitForPageLoadTill(10);
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(editCasePersonButton);
		logger.info("clicked on case person ID");

	}

	/**
	 * Open Allegation report
	 * 
	 * @throws AcisException
	 * @throws InterruptedException khushboo
	 */

	public void openAlligationRecord() throws AcisException, InterruptedException {
		logger.info("Clicking on Investigation Allegation report ");
		testLoggerInfo("Clicking on Investigation Allegation report ");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		clickWebElemntUsingJavascriptExecutor(investigationAlligationReport);
		waitForPageLoadTill(5);
		logger.info("Clicked on Investigation Allegation report ");
		testLoggerInfo("Clicked on Investigation Allegation report ");

		logger.info(" Clicking on Case Action ID Link");
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();

	}

	/**
	 * Validate Allegation report fiels
	 * 
	 * @throws AcisException
	 * @throws InterruptedException khushboo
	 */

	public void verifyAlligationReport() throws AcisException, InterruptedException {
		logger.info("Open Investigation Allegation report ");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(investigationAlligationText);
		waitForElement(investigationAlligationText);
		logger.info("Verified Investigation Allegation report ");
	}

	/**
	 * Click on Related Tab of Investigation case
	 * 
	 * @author khushboo
	 * @throws AcisException
	 */
	public void clickInsightTabOfInvestigation() throws AcisException {
		logger.info("Clicking Investigation Case Insight Tab");
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(caseInsightTab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked Investigation Case Insight Tab");
	}

	/**
	 * Click on Related Tab of Investigation case
	 * 
	 * @author khushboo
	 * @throws AcisException
	 */
	public void clickRelatedTabOfInvestigation() throws AcisException {
		logger.info("Clicking Investigation Case Related Tab");
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(caseRelatedTab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked Investigation Case Related Tab");
	}

	/**
	 * Click on Assessment of Investigation case
	 * 
	 * @author khushboo
	 * @throws AcisException
	 */
	public void clickAssessment() throws AcisException {
		logger.info("Clicking Investigation Case assessment");
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(assessmentsLink);
		waitForPageLoad();
		waitForPageLoadTill(5);
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		logger.info("Clicked Investigation Case assessment");
	}

	/**
	 * verify Assessment field of Investigation case
	 * 
	 * @author khushboo
	 * @throws AcisException
	 */
	public void verifyAssessmentField() throws AcisException {
		logger.info("Verifying Investigation Case assessment Field");
		waitForElement(assessmentID);
		verifyElementNotPresent(assessmentID);
		waitForElement(assessmentType);
		verifyElementNotPresent(assessmentType);
		waitForElement(assessmentCreatedDate);
		verifyElementNotPresent(assessmentCreatedDate);
		waitForElement(assessmentStatus);
		verifyElementNotPresent(assessmentStatus);
		logger.info("Verified Investigation Case assessment Field");
	}

	/**
	 * verify Assessment field of Investigation case
	 * 
	 * @author khushboo
	 * @throws AcisException
	 */
	public void verifyLookupFields() throws AcisException {
		logger.info("Verifying lookup Fields assessment Field");
		String accountName = insightaccountname.getText();
		logger.info("The account name is :" + accountName);
		logger.info("Verified lookup Fields assessment Field");
	}

	/**
	 * verify New referral assignment of Investigation case
	 * 
	 * @author khushboo
	 * @throws AcisException
	 */
	public void verifyNewReferralAssignment() throws AcisException {
		waitForElement(labelNewReferralAssignment);
		String status = contentofAlligationStatus.getText();
		logger.info("alligation status is" + status);
		String dateopened = textDateOpenedInvestigation.getText();
		logger.info("date opened on" + dateopened);
		String createdBy = textCreatedBy.getText();
		logger.info("created by" + createdBy);
	}

	/**
	 * verify New referral assignment of Investigation case
	 * 
	 * @author khushboo
	 * @throws AcisException
	 */
	public void verifyHighlightPanel() throws AcisException {
		String caseActionIdtext = caseActionIDinvestigation.getText();
		logger.info("alligation status is" + caseActionIdtext);

		String dateopened = textDateOpenedInvestigation.getText();
		logger.info("date opened on" + dateopened);

		String textDueDate = textDueDateInvestigation.getText();
		logger.info("due opened on" + textDueDate);

		String caseHeadtext = caseHeadInvestigation.getText();
		logger.info("intake summary" + caseHeadtext);

		String createdBy = textCreatedBy.getText();
		logger.info("created by" + createdBy);
	}

	/***
	 * Click On Decision Making Tool
	 * 
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException
	 */
	public void decisionMakingTool() throws AcisException {
		logger.info("Clicking  on decision Making Tool");
		waitForPageLoadTill(5);
		waitForPageLoad();
		clickWebElement(decisionMakingTool);
		waitForPageLoadTill(10);
		waitForPageLoad();
		logger.info("Clicked on decision Making Tool");
		waitForElement(decisionMakingToolTitle);
		waitForPageLoadTill(5);
		logger.info(" New Decision Making flow page loaded successfully");
	}

	/***
	 * Click on Save For Later
	 * 
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException
	 */
	public void clickSaveForLater() throws AcisException {
		logger.info("Clicking on Save for later");
		waitForElement(saveForlater);
		clickWebElemntUsingJavascriptExecutor(saveForlater);
		waitForPageLoadTill(3);
		logger.info("Clicked on Save for later");
	}

	/***
	 * Click on Ok
	 * 
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException
	 */
	public void clickOk() throws AcisException {
		logger.info("Clicking on Ok");
		clickWebElement(ok);
		waitForPageLoadTill(5);
		logger.info("Clicked on Ok");
	}

	/***
	 * Verify Individuals Involved save for Later
	 * 
	 * @author pallavi.sanjay.yemle
	 */
	public void verifySaveForLater() {
		logger.info("Verifying Omniscript save For later");
		waitForPageLoadTill(5);
		waitForElement(omniscriptsaveForLater);
		waitForPageLoadTill(3);
		logger.info("Verified Omniscript save for later");
	}

	/**
	 * Click on First Record Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickOnFirstRecord() throws AcisException {
		logger.info("Clicking on first Record from List View");
		waitForElementClickable(myInvestigationFirstRecord);
		clickWebElement(myInvestigationFirstRecord);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on first Record from List View");

	}

	/**
	 * Get InvestigationID from an Investigation Record Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public String getInvestigationID() throws AcisException {
		logger.info("Getting Investigation ID from Allegation Record Page");
		waitForPageLoad();
		waitForPageLoadTill(15);
		waitForElement(investigationID);
		logger.info("Getting Investigation ID");
		System.out.println("Investigation ID : " + investigationID.getText().trim());
		testLoggerInfo("Created Investigation ID " + investigationID.getText().trim());
		logger.info("Returning Investigation ID from Investigation Record Page");
		return (investigationID.getText().trim());

	}

	
	/**
	 * Verify Case Persons
	 * @author mrunal.s.tilekar
	 */
	public void verifyCasePerson(String casePersonName) {
		logger.info("Verifying Case Person :" + casePersonName);
		waitForPageLoad();
		waitForPageLoadTill(10);
		Assert.assertTrue(driver.findElement(By.xpath("//a[text()='"+ casePersonName+"']")).isDisplayed(), 
				"Case Person :" + casePersonName + "is not displayed");
		logger.info("Verifyied Case Person :" + casePersonName);
	}
	
	/***Click on case New Person 
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void ClickCaseNewPerson() throws AcisException {
		logger.info("Clicking on Case New Person");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(caseNewPerson);
		clickWebElemntUsingJavascriptExecutor(caseNewPerson);
		waitForPageLoadTill(5);
		logger.info("Clicked on Case New Person");
	}
	
	/***verify Assessments page 
	 * @author varun.krish
	 * @throws AcisException 
	 */
	public void VerifyAssesmentspagendoption() throws AcisException{
		
		logger.info("Verify New Safety Assessment button");
		waitForPageLoadTill(5);
		waitForPageLoad();
	    verifyElementNotPresent(newSafetyAssessmentButton);
	    logger.info("New Decision Making Tool");
	    waitForPageLoadTill(5);
	    verifyElementNotPresent(decisionMakingTool);
	    logger.info("New Decision Making Tool");
	    waitForPageLoadTill(5);
	    verifyElementNotPresent(newFamilyNeedsAssessment);
	    
	}
	
	
	/**
	 * Sort records by Case Person ID
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void sortAddressIDColumn( String order) throws AcisException {
		logger.info("Sorting records by Case Person ID");
		switch (order) {
		case "Ascending":
			while (isElementPresent(casePersonIdAscendingOrderBy)==false) {
				clickWebElemntUsingJavascriptExecutor(casePersonIDTitle);
				waitForPageLoadTill(3);	
			}
			Assert.assertTrue(sortedByCasePersonID.isDisplayed(), "Error: Not able to sort by Address ID");
			logger.info("Address ID column sorted by Ascending order");
			
			break;
			
		case "Descedning":
			
			while (isElementPresent(casePersonIdDescendingOrderBy)==false) {
				clickWebElemntUsingJavascriptExecutor(casePersonIDTitle);
				waitForPageLoadTill(3);
			}
			Assert.assertTrue(sortedByCasePersonID.isDisplayed(), "Error: Not able to sort by Address ID");
			logger.info("Address ID column sorted by Descedning order");
			break;

		default:
			logger.info("No matching order text");
			break;
		}	
	}
	

	/**
	 * Close Locate Relative/Kin Tab
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void closeLocateRelativeKinTab() throws AcisException {
		logger.info("Closing Locate Relative/Kin Tab");
		if (closeLocateRelativeKinButton.isDisplayed()) {

			clickWebElement(closeLocateRelativeKinButton);
			waitForPageLoadTill(5);

		}
		logger.info("Closing Locate Relative/Kin Tab");
	}
}
