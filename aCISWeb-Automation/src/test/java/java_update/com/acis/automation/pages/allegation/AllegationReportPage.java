package com.acis.automation.pages.allegation;

import java.util.Date;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class AllegationReportPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(AllegationReportPage.class);
	
	public AllegationReportPage() throws AcisException {
		// TODO Auto-generated constructor stub
	}

			
	@FindBy(xpath = "(//slot/lightning-formatted-text)[1]")
	WebElement allegationID;
	
	@FindBy(xpath = "//button[text()='Intake Record']")
	WebElement guidedIntake;
	
	@FindBy(xpath = "//button[@title='Edit Freeze Intake']")
	WebElement editFreezeIntake;
	
	
	@FindBy(xpath = "(//span[text()='Freeze Intake']/../..//input[@type='checkbox'])[2]")
	WebElement freezeIntakeChecked;
	
	@FindBy(xpath = "//button[@name='Edit']")
	WebElement edit;
	
	@FindBy(xpath = "//button[@name='CancelEdit']")
	WebElement cancel;
	
	@FindBy(xpath = "//button[@name='SaveEdit']")
	WebElement save;
	
	
	@FindBy(xpath = "//a[text()='Related']")
	WebElement relatedTab;
	
	@FindBy(xpath = "//a[text()='Details']")
	WebElement detailsTab;
			
	@FindBy(xpath = "//h2/span[contains(text(),'Persons Involved')]")
	WebElement intakePersonsTab;
	
	@FindBy(xpath = "//span[@title='Investigation - Allegation Reports']")
	WebElement investigationTab;
	
	@FindBy(xpath = "//span[text()='Recommend to Associate Allegation Report to Case']")
	WebElement recommendAllegationLabel;

	@FindBy(xpath = "//*[text()='Allegation Report ID']/../..//lightning-formatted-text")
	WebElement allegationReportIDAfterApprove;

	@FindBy(xpath = "//span[text()='Status']/../..//lightning-formatted-text")
	WebElement statusAllegationreport;

	@FindBy(xpath = "//button[text()='Edit']")
	WebElement editAllegationReportsButton;

	@FindBy(xpath = "(//a[contains(text(),'Screen Out')]//..//..//div//a)[2]")
	WebElement screeOutOptionEditBoxlist;

	@FindBy(xpath = "//span[contains(text(),'Disposition')]//..//..//div//a")
	WebElement dispositionEditBoxlist;
	
	
	@FindBy(xpath="(//a[contains(text(),'Screen Out')]//..//..//div//a)[1]")
	WebElement dispositionScreenOutList;
	
	@FindBy(xpath="//a[@title='Screen Out']")
	WebElement dispositionScreenOutList2;
	
	@FindBy(xpath="//*[text()='Intake Case']/../..//a/*[contains(text(),'C-0')]")
	WebElement intakeCase;
	
		@FindBy(xpath="(//input[@name='ACIS_ChangeInvestigation__c'])")
	WebElement changeinvestigation;


	@FindBy(xpath = "//span[contains(text(),'Worker Screening Recommendation')]//..//..//div//a")
	WebElement screenInForFamilyOptionEditBoxList;
	
	@FindBy(xpath="//a[contains(text(),'Screen In for Family Services')]//..//..//div//a")
	WebElement workScreeningRecommendationScreeinInForFamily;
	
	@FindBy(xpath="//button[text()='Save']")
	WebElement editBoxSaveButton;

	@FindBy(xpath = "//span[text()='Status']/../..//lightning-formatted-text")
	WebElement statusAllegationreportAfterOverride;
	
	@FindBy(xpath = "//span[text()='Supervisor Screening Decision']/../..//lightning-formatted-text")
	WebElement supervisorScreenDecisionStatus;
	
	@FindBy(xpath = "//lightning-formatted-text[contains(text(),'I-00')]")
	WebElement allegatinID;
	
	@FindBy(xpath = "(//a[contains(text(),'IP')]/../../../..//a[@role='button'])[1]")
	WebElement intakePersonsFirstShowActions;
	
	@FindBy(xpath = "(//a[@title='Edit'])[1]")
	WebElement intakePersonsFirstEdit;
	
	@FindBy(xpath = "//label[text()='Intake Person ID']/../..//input[@type='text']")
	WebElement intakePersonID;
	
	
	@FindBy(xpath = "//label[text()='First Name']/../..//input")
	WebElement editFirstName;
	
	@FindBy(xpath = "//label[text()='Location of Incident']/../..//textarea")
	WebElement locationOfIncident;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath = "//span[contains(text(),'Persons Involved')]/../../..//button[contains(text(),'New')]")
	WebElement newIntakePerson;
	
	@FindBy(xpath = "//button[text()='Go Back']")
	WebElement goBack;
	
	
	//Khushboo
	@FindBy(xpath = "//span[text()='Due Date']/../..//lightning-formatted-text")
	WebElement editDueDate;

	@FindBy(xpath = "//span[text()='Investigation - Allegation Reports']")
	WebElement investigationAlligationReport;

	@FindBy(xpath = "//td//span//a[contains(text(),'C-')]")
	WebElement caseID;

	@FindBy(xpath = "//span[text()='Date Opened']/../..//lightning-formatted-text")
	WebElement dateOpened;

	@FindBy(xpath = "//span [text()='Case Action History']")
	WebElement caseActionHistory;

	@FindBy(xpath = "//tbody/tr[last()]/th/span/span")
	WebElement caseActionHistoryDate;

	@FindBy(xpath = "//tbody//tr[6]//td[3]//a[text()='ACIS Supervisor']")
	WebElement caseActionHistoryUser;

	@FindBy(xpath = "(//tbody/tr/td//span//lightning-formatted-text[text()='Due Date'])[1]")
	WebElement caseActionHistoryDueDate;
	
	@FindBy(xpath = "//button[text()='Workflow']")
	WebElement investigationWorkflow;
	
	@FindBy(xpath = "//h1[contains(text(),'Report Details')]")
	WebElement reportDetailsTitle;
	
	@FindBy(xpath="(//a[text()='Related'])[2]")
	WebElement relatedtabinvestigation;
	
	
	@FindBy(xpath="//a[contains(text(),'C-')]")
	WebElement investigationId;

	@FindBy(xpath="//*[text()='Intake Case']/../..//a//*[contains(text(),'C-')]")
	WebElement intakeCaseID;

	@FindBy(xpath="(//input[@class='vlocity-input slds-input'])[last()]")
	WebElement selectActivationCase;

	@FindBy(xpath="(//*[contains(text(),'Submit')])[last()]")
	WebElement submit;

	
	By intakePersonCreated = By.xpath("//div[@title='Demo']");
	
	By cannotModify = By.xpath("//*[contains(text(),'cannot be modified.')]");
	
	@FindBy(xpath = "//a[contains(text(),'here')]")
	WebElement changeLink;
	//Mrunal
			@FindBy(xpath = "//span[text()='Priority']")
			WebElement priorityLabel;
			
			@FindBy(xpath = "//span[text()='Response Time']")
			WebElement resposneTimeLabel;
			
			@FindBy(xpath = "(//span[text()='Status'])[2]")
			WebElement statusLabel;
			
			@FindBy(xpath = "//span[text()='Status']/../..//lightning-formatted-text")
			WebElement statusValue;
			
			@FindBy(xpath = "//button[text()='Intake Record']")
			WebElement intakeRecordButton;
			
			@FindBy(xpath = "//span[text()='Priority']/../..//lightning-formatted-text")
			WebElement priorityValue;
			
			@FindBy(xpath = "//span[text()='Response Time']/../..//lightning-formatted-text")
			WebElement responseTimeValue;
			
			@FindBy(xpath = "//button[@title='Close Intake']")
			WebElement closeIntakeButton;
			
			@FindBy(xpath = "//*[contains(text(),'Edit I')]/../..//*[text()='Abuse']/../..//input")
			WebElement abuseCheckBox;
			
			@FindBy(xpath = "//*[contains(text(),'Edit I')]/../..//*[text()='Neglect']/../..//input")
			WebElement neglectCheckBox;
			
			@FindBy(xpath = "//a[text()='Health']")
			WebElement health;
			
			@FindBy(xpath="//a[contains(text(),'C-000')]")
			WebElement caseActionId;
			
			@FindBy(xpath = "(//td//span//a[contains(text(),'C-')])[2]")
			WebElement caseID2;
			
			public By closeIntakeButtonBy= By.xpath("//button[@title='Close Intake']");
			
	//Pallavi
			@FindBy(xpath="//span[text()='Case Head']/../..//span[text()='Help']")
			WebElement caseHeadInfo;
	//Khushboo
			@FindBy(xpath="//*[text()='Cancel']")
			WebElement btncancel;
	/**
	 * Clicked on Details tab on a Allegation Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickDetailsTab() throws AcisException {
		logger.info("Clicking on Details Tab");
		waitForElement(allegatinID);
		clickWebElement(detailsTab);
		logger.info("Clicked on Details Tab");

	}
	
	
	/**
	 * Clicked on Related Tab on a Allegaiton Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 * @throws IOException 
	 */
	public void clickRelatedTab() throws AcisException, IOException {
		logger.info("Clicking on Related Tab");
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(relatedTab);
		doubleClickOnWebElement(relatedTab);
		clickWebElement(relatedTab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Related Tab");
	}
	
	
	/**
	 * Clicked on Intake Persons Related Tab on Allegation Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickIntakePersonsTab() throws AcisException {
		logger.info("Clicking on Intake Persons Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(intakePersonsTab);
		clickWebElemntUsingJavascriptExecutor(intakePersonsTab);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Intake Persons Tab");

	}
	
	/**
	 * Cannot modify Intake Guided Flow in Freeze Intake
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void intakeGuidedCannotModify() throws AcisException {
		logger.info("Clicking on Guided Intake Flow");
		waitForElementClickable(guidedIntake);
		clickWebElement(guidedIntake);
		logger.info("Clicked on Guided Intake Flow");
		isElementPresent(cannotModify);
		refreshPage();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Guided Flow Cannot be modified");

	}
	
	/**
	 * Cannot modify Intake Details in Freeze Intake
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void intakeDetailsCannotModify() throws AcisException {
		logger.info("Clicking on Edit Button");
		waitForElementClickable(edit);
		clickWebElement(edit);
		logger.info("Clicked on Edit Button");
		logger.info("Entering on First Name");
		waitForElementClickable(editFirstName);
		scrollingToElementofAPage(editFirstName);
		enterText(editFirstName, "Demo");
		logger.info("Entered on First Name");
		logger.info("Clicking on Save Button");
		clickWebElement(save);
		logger.info("Clicked on Save Button");
		waitForPageLoadTill(5);
		isElementPresent(cannotModify);
		clickWebElement(cancel);
		logger.info("Details Tab Cannot be Modified");

	}
	
	
	/**
	 * Cannot Modify Related Tab in Freeze intake
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void intakeRelatedCannotModify() throws AcisException {
		logger.info("Clicking on New Intake Person Button");
		waitForElementClickable(newIntakePerson);
		Actions action = new Actions(driver);
		action.moveToElement(newIntakePerson).click().perform();
		logger.info("Clicked on New Intake Person Button");
		waitForPageLoadTill(4);
		logger.info("Entering Intake Person ID on Intake Person Record");
		waitForElementClickable(intakePersonID);
		enterText(intakePersonID, "Demo");
		logger.info("Entered Intake Person ID on Intake Person Record");
		logger.info("Clicking on Save Button");
		clickWebElement(save);
		logger.info("Clicked on Save Button");
		isElementPresent(cannotModify);
		clickWebElement(cancel);
		logger.info("Related tab cannot modify");

	}

	/**
	 * Can Modify Related Tab in Freeze intake Unchecked
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void intakeRelatedCanModify() throws AcisException {
		logger.info("Clicking on New Intake Person Button");
		waitForElementClickable(newIntakePerson);
		Actions action = new Actions(driver);
		action.moveToElement(newIntakePerson).click().perform();
		logger.info("Clicked on New Intake Person Button");
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Entering Intake Person ID on Intake Person Record");
		waitForElementClickable(intakePersonID);
		enterText(intakePersonID, "Demo");
		logger.info("Entered Intake Person ID on Intake Person Record");
		logger.info("Clicking on Save Button");
		clickWebElement(save);
		logger.info("Clicked on Save Button");
		isElementPresent(intakePersonCreated);
		logger.info("Related tab modified");

	}
	
	/**
	 * Clicked on Investigation Related Tab on Allegation Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickInvestigationTab() throws AcisException {
		logger.info("Clicking on Related Tab");
		waitForElementClickable(relatedTab);
		clickWebElement(relatedTab);
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElementClickable(relatedTab);
		clickWebElement(investigationTab);
		logger.info("Clicked on Related Tab");

	}
	
	/**
	 * Get AllegationID from an Allegation Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public String getAllegationID() throws AcisException {
		logger.info("Getting Allegation ID from Allegation Record Page");
		waitForPageLoad();
		waitForPageLoadTill(15);
		waitForElement(detailsTab);
		clickWebElement(detailsTab);
		waitForElement(allegatinID);
		logger.info("Getting Allegation ID");
		System.out.println("Allegation ID : " +allegatinID.getText().trim());
		testLoggerInfo("Created Allegation ID " + allegatinID.getText().trim());
		logger.info("Returning Allegation ID from Allegation Record Page");
		return(allegatinID.getText().trim());
		
	}
	
	
	/**
	 * Clicking on Guided Intake Button on an Allegation Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickIntakeBtn() throws AcisException {
		logger.info("Clicking on Guided Intake button");
		waitForElementClickable(guidedIntake);
		clickWebElement(guidedIntake);
		logger.info("Clicked on Guided Intake button");
		waitForPageLoadTill(5);
		waitForElement(reportDetailsTitle);
		logger.info("Successfully Navigated on report Details Page");

	}
	
	/**
	 * Freezing an Intake record on an Allegation Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void freezeIntake(String option) throws AcisException {
		
		waitForPageLoadTill(5);
		switch(option)
		{
		case "Check":
			logger.info("Clicking on Edit button");
			waitForElementClickable(edit);
			clickWebElement(edit);
			logger.info("Clicked on Edit button");
			waitForElementClickable(cancel);
			logger.info("Checking FreezeIntake Checkbox from Allegation Report");
			scrollingToElementofAPage(freezeIntakeChecked);
			clickWebElement(freezeIntakeChecked);
			clickWebElement(save);
			waitForPageLoadTill(5);
			waitForPageLoad();
			logger.info("Checked FreezeIntake Checkbox from Allegation Report");
			break;
			
		case "Uncheck":
			logger.info("Clicking on Edit button");
			waitForElementClickable(edit);
			clickWebElement(edit);
			logger.info("Clicked on Edit button");
			waitForElementClickable(cancel);
			logger.info("Unchecking FreezeIntake Checkbox from Allegation Report");
			scrollingToElementofAPage(freezeIntakeChecked);
			clickWebElement(freezeIntakeChecked);
			clickWebElement(save);
			waitForPageLoadTill(5);
			waitForPageLoad();
			
			logger.info("Unchecked FreezeIntake Checkbox from Allegation Report");
			break;
		}

	}
	
	
	
	/**
	 * Verifying if an freezed Intake Record gives an error of cannot be modified
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void verifyCannotModify() throws AcisException {
		logger.info("Verifying if cannot modify");
		isElementPresent(cannotModify);
		logger.info("Verified if cannot modify");
	}
	
	/***
	 * This method used for verifying the status of the Submit of Allegation Report
	 */

	public String verifyingAllegationReportStatusSubmitted() {

		String status = "";
	    String allegationReportIdNoAfterIsApprove = "";

		try {

			waitForPageLoad();
			waitForPageLoadTill(10);
			status = statusAllegationreport.getText().trim();
			allegationReportIdNoAfterIsApprove = allegationReportIDAfterApprove.getText().trim();
			System.out.println(allegationReportIdNoAfterIsApprove);
			if (status.equalsIgnoreCase("Submitted")) {

				logger.info("Allegation Report Status is Submitted");

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allegationReportIdNoAfterIsApprove;
	}

	/***
	 * This method used for verifying the status of the supervisor Approval
	 * @author akash.a.gaurav
	 * 
	 */

	public String verifyingAllegationReportStatus() {

		String status = "";
	    String allegationReportIdNoAfterIsApprove = "";

		try {
			logger.info(" verifying allegation report status");
			waitForPageLoad();
			waitForPageLoadTill(10);
			status = statusAllegationreport.getText().trim();
			allegationReportIdNoAfterIsApprove = allegationReportIDAfterApprove.getText().trim();
			System.out.println(allegationReportIdNoAfterIsApprove);
			if (status.equalsIgnoreCase("Approved")) {

				logger.info("Allegation Report Status is Approved");

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return allegationReportIdNoAfterIsApprove;
	}

	/***
	 * This method is used to edit the status and verify the status
	 * @author akash.a.gaurav
	 * @throws AcisException
	 * @throws InterruptedException
	 */

	public void editAllegationReportAndVerifyStatus() throws AcisException, InterruptedException {

		try {
			logger.info("Editing alegation report and verifying status");
			clickWebElement(editAllegationReportsButton);

			waitForPageLoad();
			waitForPageLoadTill(5);
			try {
				scrollingToElementofAPage(dispositionEditBoxlist);
				waitForPageLoadTill(7);
				clickWebElement(dispositionEditBoxlist);
				waitForPageLoadTill(8);
				waitForElement(dispositionScreenOutList2);
				clickWebElement(dispositionScreenOutList2);
			} catch (AcisException e) {
				scrollingToElementofAPage(dispositionEditBoxlist);
				clickWebElemntUsingJavascriptExecutor(dispositionEditBoxlist);
				clickWebElemntUsingJavascriptExecutor(dispositionScreenOutList);
			}
			scrollingToElementofAPage(screenInForFamilyOptionEditBoxList);
			clickWebElement(screenInForFamilyOptionEditBoxList);
			waitForPageLoadTill(5);
			 Actions act = new Actions(driver);
             
             act.sendKeys(Keys.ARROW_DOWN).build().perform();
             act.sendKeys(Keys.ARROW_DOWN).build().perform();
             act.sendKeys(Keys.ARROW_DOWN).build().perform();
             act.sendKeys(Keys.ENTER).build().perform(); 
			logger.info("Allegation Edit Box changed ");
			clickWebElement(editBoxSaveButton);
			waitForPageLoadTill(5);
			waitForPageLoad();

			logger.info("Allegation Edit Box changed ");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		
	}

}
	/***
	 * Verifying Status After Allegation overided
	 * @throws InterruptedException 
	 * @author akash.a.gaurav
	 */
	public String verifyingAllegationStatusAfterOveride(String allegationReportIdNoAfterIsApprove ) throws InterruptedException{
		String statusAllegationreportAfterOverrided="";
		String statusScreeningDecission="";
		Thread.sleep(2000);
		
		try {
			logger.info("Verifyin allegation status after overriding");
			waitForPageLoad();
			waitForPageLoadTill(8);
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			waitForPageLoadTill(8);
			jse.executeScript("window.scrollBy(0,1250)");
			statusAllegationreportAfterOverrided=statusAllegationreportAfterOverride.getText().trim();
		 statusScreeningDecission=	supervisorScreenDecisionStatus.getText().trim();
		 System.out.println(statusAllegationreportAfterOverrided);
		 System.out.println(statusScreeningDecission);
			if (statusAllegationreportAfterOverrided.equalsIgnoreCase("Approved") && statusScreeningDecission.equalsIgnoreCase("Override")){// && AllegationReportIdafterOverride.equalsIgnoreCase(allegationReportIdNoAfterStatusIsApprove)) {
				
				logger.info("Verified status is Approved and Incident Id matched and hence overided");
				
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return statusScreeningDecission;
	}
	
	public void getAllegatinID(String Str) throws AcisException {
		waitForPageLoad();
		waitForElement(allegatinID);
		Str=allegatinID.getText();
		System.out.println(Str);
		logger.info("Allegation ID is" + Str);
		refreshPage();
	}
	
	
	/**
	 * Check Status on Intake record 
	 * @author mrunal.s.tilekar
	 * @throws InterruptedException 
	 */
	
	public void checkStatusIntakeRecord(String statusOption) throws InterruptedException {
		waitForPageLoad();
		waitForPageLoadTill(10);
		switch (statusOption) {
		case "Submitted":
			waitForElement(statusLabel);
			Assert.assertTrue(statusLabel.isDisplayed(), "Status Label NOT present");
			Assert.assertTrue((statusValue.getText().trim()).equalsIgnoreCase("Submitted"), "Status Value Submitted NOT present");
			logger.info("Submitted status present");
			
			break;

		case "Approved":
			waitForElement(statusLabel);
			Assert.assertTrue(statusLabel.isDisplayed(), "Status Label NOT present");
			Assert.assertTrue((statusValue.getText().trim()).equalsIgnoreCase("Approved"), "Status Value Approved NOT present");
			logger.info("Approved status present");
			break;
			
		default:
			logger.info("Status field not present");
			break;
		}
		waitForPageLoadTill(5);
	}
	
	/**
	 * Check Priority Label
	 * @author mrunal.s.tilekar
	 */
	public void checkPriorityLabel() {
		 waitForElement(priorityLabel);
		 Assert.assertTrue(priorityLabel.isDisplayed(), "Priority Label Not Displayed");
		 logger.info("Priority Label Displayed");
		
	}
	//priyanka
	public void clickonSecondCaseAlligationRecord() throws AcisException, InterruptedException {
		logger.info("Clicking on Investigation Allegation report ");
		testLoggerInfo("Clicking on Investigation Allegation report ");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		//clickWebElemntUsingJavascriptExecutor(investigationAlligationReport);
		waitForPageLoadTill(5);
		logger.info("Clicked on Investigation Allegation report ");
		testLoggerInfo("Clicked on Investigation Allegation report ");
		
		logger.info(" Clicking on Case Action ID Link");
		//driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElement(caseID2);
		clickWebElemntUsingJavascriptExecutor(caseID2);
		logger.info(" Clicked on Case Action ID Link");
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElement(investigationWorkflow);
	}
	
	/**
	 * Check Response Time Label
	 * @author mrunal.s.tilekar
	 * @throws InterruptedException 
	 */
	public void checkResponseTimeLabel() throws InterruptedException {
		 waitForElement(resposneTimeLabel);
		 Assert.assertTrue(resposneTimeLabel.isDisplayed(), "Response Time Label Not Displayed");
		 logger.info("Response Time Label Displayed");
		 waitForPageLoadTill(10);
	}
	
	/**
	 * Close Intake omniscript
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void closeIntakeOmniscript() throws AcisException, InterruptedException {
		waitForPageLoadTill(10);
		waitForPageLoad();
		
		if(isElementPresent(closeIntakeButtonBy)) {
			clickWebElement(closeIntakeButton);
			logger.info("Closing Intake Omniscript Tab");	
		}
		waitForPageLoadTill(5);
	}
	
	/**
	 * Check Priority Value
	 * @author mrunal.s.tilekar
	 * @throws InterruptedException 
	 */
	public void checkPriorityValue(String priorityOption) throws InterruptedException {
		waitForPageLoad();
		waitForPageLoadTill(2);
		switch (priorityOption) {
		case "High":
			waitForElement(priorityLabel);
			Assert.assertTrue((priorityValue.getText().trim()).equalsIgnoreCase("High"), "Priority High Value Not Present");
			logger.info("Priority High Value Present");
			break;
			
		case "Medium":
			waitForElement(priorityLabel);
			Assert.assertTrue((priorityValue.getText().trim()).equalsIgnoreCase("Medium"), "Priority Medium Value Not Present");
			logger.info("Priority Medium Value Present");
			break;
			
        case "Low":
        	waitForElement(priorityLabel);
			Assert.assertTrue((priorityValue.getText().trim()).equalsIgnoreCase("Low"), "Priority Low Value Not Present");
			logger.info("Priority Low Value Present");
			break;
		default:
			break;
		}
		waitForPageLoadTill(5);
	}
	
	/**
	 * Check Response Time Value
	 * @author mrunal.s.tilekar
	 */
	public void checkResponseTimeValue(String responseTimeOption) {
		waitForPageLoad();
		switch (responseTimeOption) {
		case "Immediate":
			waitForElement(resposneTimeLabel);
			Assert.assertTrue((responseTimeValue.getText().trim()).equalsIgnoreCase("Immediate"), "Response Time Immediate Value Not Present");
			logger.info("Response Time Immediate Value Present");
			break;
			
		case "24 hours":
			waitForElement(resposneTimeLabel);
			Assert.assertTrue(((responseTimeValue.getText().trim()).equalsIgnoreCase("24 hours")) || ((responseTimeValue.getText().trim()).equalsIgnoreCase("24 hour")),
					"Response Time 24 hour Value Not Present");
			logger.info("Response Time 24 hour Value Present");
			break;
			
        case "5 days":
        	waitForElement(resposneTimeLabel);
			Assert.assertTrue((responseTimeValue.getText().trim()).equalsIgnoreCase("5 days"), "Response Time 5 days Value Not Present");
			logger.info("Response Time 5 days Value Present");
			break;
		default:
			break;
		}
		waitForPageLoadTill(5);
	}
	
	/**
	 * Click on edit button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickEditButton() throws AcisException, InterruptedException {
		logger.info("Clicking on Edit button on Allegation report");
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(editAllegationReportsButton);
		waitForPageLoad();
		waitForPageLoadTill(2);
		logger.info("Clicked on Edit button on Allegation report");
	}
	
	/**
	 * Verify Case head
	 * @author dharmesh krishna
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void verifyCaseHead(String caseHeader) throws AcisException, InterruptedException {
		logger.info("Clicking on Intake Case");
		waitForElement(intakeCase);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		clickWebElement(intakeCase);
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElement(driver.findElement(By.xpath("//*[text()='Case Head']/..//*[contains(text(),'"+caseHeader+"')]")));
		logger.info("Clicked on Edit button on Allegation report");
	}
	
	/**
	 * Clicked on Change Investigation checkbox
	 * Created By priyanka
	 * @throws AcisException 
	 */
	public void checkChangeInvestigation(String caseId) throws AcisException {
		logger.info("Clicking on Change Investigation checkbox ");
		//waitForElement(changeinvestigation);
		clickWebElemntUsingJavascriptExecutor(changeinvestigation);
		logger.info("Clicked on Change Investigation checkbox");
		waitForPageLoadTill(5);
		logger.info("Clicking on Save Button");
		clickWebElemntUsingJavascriptExecutor(save);
		logger.info("Clicked on Save Button");
		waitForPageLoadTill(5);
		logger.info("Clicking on here link");
		waitForElement(changeLink);
		clickWebElemntUsingJavascriptExecutor(changeLink);
		logger.info("Clicked on here link");
		waitForPageLoadTill(5);
		logger.info("Clicking on Select Activation Case");
        waitForElement(selectActivationCase);
        clickWebElemntUsingJavascriptExecutor(selectActivationCase);
        logger.info("Clicked on Select Activation Case");
        waitForPageLoadTill(5);
        logger.info("Selecting Activation Case");
        waitForElement(driver.findElement(By.xpath("(//*[contains(text(),'" + caseId + "')])[last()]")));
        clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("(//*[contains(text(),'" + caseId + "')])[last()]")));
        logger.info("Selected Activation Case");
		waitForPageLoadTill(5);
		logger.info("Clicking on Submit Button");
		waitForElement(submit);
		clickWebElemntUsingJavascriptExecutor(submit);
		logger.info("Clicking on Submit Button");
        waitForPageLoadTill(7);
      //  driver.navigate().refresh();
	}
	
	/**
	 * Verify Change Investigation and here link Created By priyanka
	 * 
	 * @throws AcisException
	 */
	public void verifyChangeInvestigationAndHereLink(String caseId) throws AcisException {

		logger.info("Verifying Change Investigation Label ");
		Assert.assertEquals(driver
				.findElement(By.xpath("(//*[contains(text(),'Change the associated investigation?')])[1]")).getText(),
				"Change the associated investigation?");
		logger.info("Verified Change Investigation Label ");
		waitForPageLoadTill(10);

		logger.info("Clicking on Change Investigation checkbox ");
		Actions act = new Actions(driver);
		//act.moveToElement(changeinvestigation).click().build().perform();

		// waitForElement(changeinvestigation);
		Boolean b=changeinvestigation.isDisplayed();
		logger.info("b "+b);
		clickWebElemntUsingJavascriptExecutor(changeinvestigation);
		logger.info("Clicked on Change Investigation checkbox");
		waitForPageLoadTill(5);
		logger.info("Clicking on Save Button");
		clickWebElemntUsingJavascriptExecutor(save);
		logger.info("Clicked on Save Button");
		waitForPageLoadTill(5);
		waitForElement(changeLink);
		logger.info("Verifying here link");
		Assert.assertEquals(changeLink.getText(), "here");
		logger.info("Verified here link");
		logger.info("Clicking on here link");
		waitForElement(changeLink);
		clickWebElemntUsingJavascriptExecutor(changeLink);
		logger.info("Clicked on here link");
		waitForPageLoadTill(5);
		logger.info("Clicking on Select Activation Case");
		waitForElement(selectActivationCase);
		clickWebElemntUsingJavascriptExecutor(selectActivationCase);
		logger.info("Clicked on Select Activation Case");
		waitForPageLoadTill(5);
		logger.info("Verifying Activation Case details");
		String details = driver.findElement(By.xpath("(//*[contains(text(),'" + caseId + "')])[last()]")).getText();
		// clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("(//*[contains(text(),'"
		// + caseId + "')])[last()]")));
		Assert.assertTrue(details.contains("Case ID"));
		logger.info("Verified Case Id");
		Assert.assertTrue(details.contains("Case Head"));
		logger.info("Verified Case Head");
		Assert.assertTrue(details.contains("Date Opened"));
		logger.info("Verified Date Opened");
		Assert.assertTrue(details.contains("Due Date"));
		logger.info("Verified Due Date");
		Assert.assertTrue(details.contains("Allegation"));
		logger.info("Verified Allegation");
		logger.info("Verified Activation Case details- " + details);
		waitForPageLoadTill(5);

	}

	
	/**
	 * Uncheck Abuse checkbox and Check Neglect checkbox
	 * @throws InterruptedException 
	 * @throws AcisException 
	 */
	public void checkNeglectCheckBox() throws InterruptedException, AcisException {
		waitForPageLoad();
		waitForPageLoadTill(5);
	//	scrollingToElementofAPage(abuseCheckBox);
		clickWebElemntUsingJavascriptExecutor(abuseCheckBox);
		clickWebElemntUsingJavascriptExecutor(neglectCheckBox);
		logger.info("Uncheck Abuse checkbox and Check Neglect checkbox");
		
	}
	
	/**
	 * Click on Edit box Save button
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickEditBoxSaveButton() throws AcisException {
		logger.info(" Clicking on Save button");
		clickWebElement(editBoxSaveButton);
		waitForPageLoadTill(5);
		logger.info(" Clicked on Save button");
	}
	/**
	 * Click on Investigation Allegation report 
	 * @throws AcisException 
	 * @throws InterruptedException 
	 * khushboo
	 */

	public void clickonAlligationRecord() throws AcisException, InterruptedException {
		logger.info("Clicking on Investigation Allegation report ");
		testLoggerInfo("Clicking on Investigation Allegation report ");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		//clickWebElemntUsingJavascriptExecutor(investigationAlligationReport);
		waitForPageLoadTill(5);
		logger.info("Clicked on Investigation Allegation report ");
		testLoggerInfo("Clicked on Investigation Allegation report ");
		
		logger.info(" Clicking on Case Action ID Link");
		//driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElement(caseID);
		clickWebElemntUsingJavascriptExecutor(caseID);
		logger.info(" Clicked on Case Action ID Link");
		waitForPageLoadTill(10);
		waitForPageLoad();
		act.sendKeys(Keys.PAGE_UP).build().perform();
		act.sendKeys(Keys.PAGE_UP).build().perform();
	}
	
	public void clickonDuedate() throws AcisException, InterruptedException {
		clickWebElemntUsingJavascriptExecutor(editDueDate);

	}	
	/**
	 * verify due date between  opened date  
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 * khushboo
	 * @throws ParseException 
	 */


	public void verifyDuedate() throws AcisException, InterruptedException, ParseException {
		// Custom date format
	    SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy", Locale.ENGLISH);


		String duedate = editDueDate.getText();
		String opened = dateOpened.getText();
		 Date d1 = null;
		 Date d2 = null;
		
			d1 = sdf.parse(duedate);
			d2= sdf.parse(opened);

		
	    long diffInMillies = Math.abs(d1.getTime() - d2.getTime());
	    long diff = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
	 
	    assertEquals(45, diff);

	}
	/**
	 * verify case action history 
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 * khushboo
	 */

	public void verifyOwnerofDuedate() throws AcisException, InterruptedException {
		Actions act = new Actions(driver);
	     act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	     scrollingToElementofAPage(caseActionHistory);
		clickWebElemntUsingJavascriptExecutor(caseActionHistory);
		waitForPageLoad();
		String user = caseActionHistoryUser.getText();
		logger.info("user is" + user);
		if (caseActionHistoryDueDate.getText() == "Due date") {
			logger.info(" Verified  Data");

		}
	}

	
	/**
	 * click Intake Person on Allegation Record
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickIntakePerson(String personName) throws AcisException {
		logger.info("clicking Intake Person on Allegation Record");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("//*[text()='Person']/../../..//a[text()='"+personName+"']")));
		logger.info("clicked Intake Person on Allegation Record");
		waitForPageLoadTill(5);
		waitForElement(health);
		logger.info("Successfully opened Intake Person on Allegation Record");
		
	}
	
	/**
	 * Clicked on Related Tab on a Allegaiton Record
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void clickRelatedTabInvestigation() throws AcisException {
		logger.info("Clicking on Related Tab");
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(relatedtabinvestigation);
		clickWebElement(relatedtabinvestigation);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Related Tab");
	}
	
	/***
	 * This method used for verifying the status of the supervisor Approval
	 * @author akash.a.gaurav
	 * @throws AcisException 
	 * 
	 */

	public String getInvestigationCaseID() throws AcisException {

		String investigationCaseId = "";

		try {
			logger.info(" verifying allegation report status");
			waitForPageLoad();
			waitForPageLoadTill(10);
			clickWebElement(relatedTab);
			waitForPageLoadTill(10);
			logger.info("Clicked on related tab");
			JavascriptExecutor jse = (JavascriptExecutor)driver;
			waitForPageLoadTill(10);
			jse.executeScript("window.scrollBy(0,500)");
			waitForPageLoadTill(10);
			investigationCaseId = investigationId.getText().trim();
			waitForPageLoadTill(10);
			System.out.println(investigationCaseId);
			testLoggerInfo("Created Investigation Case ID " + investigationCaseId);
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return investigationCaseId;
		
	}
/*open case Action id
 * 
 * @khushboo
 * 
 */
public void openCaseActionID() throws AcisException {
	logger.info("Open case action d from Allifgation report page");
	 Actions act=new Actions(driver);
     act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
     scrollingToElementofAPage(caseActionId);
     clickWebElemntUsingJavascriptExecutor(caseActionId);
}

/**
 * Click on Investigation Allegation report 
 * @throws AcisException 
 * @throws InterruptedException 
 * @author akash.a.gaurav
 */

public void clickonAlligationRecordAssignInvestigation() throws AcisException, InterruptedException {
	logger.info("Clicking on Investigation Allegation report ");
	testLoggerInfo("Clicking on Investigation Allegation report ");
	Actions act = new Actions(driver);
	act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	JavascriptExecutor jse = (JavascriptExecutor)driver;
	waitForPageLoadTill(5);
	jse.executeScript("window.scrollBy(0,940)");
	//clickWebElemntUsingJavascriptExecutor(investigationAlligationReport);
	waitForPageLoadTill(5);
	logger.info("Clicked on Investigation Allegation report ");
	testLoggerInfo("Clicked on Investigation Allegation report ");
	
	logger.info(" Clicking on Case Action ID Link");
	//driver.navigate().refresh();
	waitForPageLoadTill(10);
	waitForPageLoad();
	waitForElement(caseID);
	clickWebElemntUsingJavascriptExecutor(caseID);
	logger.info(" Clicked on Case Action ID Link");
	waitForPageLoadTill(10);
	jse.executeScript("window.scrollBy(0,-940)");
	waitForPageLoad();
	waitForPageLoadTill(10);
	waitForElement(investigationWorkflow);
}


	/**
	 * Get Intake Case ID
	 * @author mrunal.s.tilekar
	 * @return 
	 * @throws AcisException 
	 */
	public String getIntakeCaseID() throws AcisException
	{
		logger.info("Getting Intake Case ID from Allegation Record Page");
		waitForPageLoad();
		waitForPageLoadTill(15);
		waitForElement(detailsTab);
		clickWebElement(detailsTab);
		waitForElement(intakeCaseID);
		logger.info("Getting Intake Case ID");
		System.out.println("Intake Case ID : " +intakeCaseID.getText().trim());
		testLoggerInfo("Created Intake Case ID " + intakeCaseID.getText().trim());
		logger.info("Returning Intake Case ID from Allegation Record Page");
		return(intakeCaseID.getText().trim());
		
	}
		
	
	
	/**
	 * Verify Intake Case ID
	 * @author mrunal.s.tilekar
	 * @return 
	 * @throws AcisException 
	 */
	public void VerifyIntakeCaseID(String caseID) throws AcisException
	{
		logger.info("Verifying Intake Case ID : " + caseID);
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(detailsTab);
		clickWebElement(detailsTab);
		waitForElement(intakeCaseID);
		logger.info("Getting Intake Case ID");
		System.out.println("Intake Case ID : " +intakeCaseID.getText().trim());
		Assert.assertTrue(intakeCaseID.getText().trim().equalsIgnoreCase(caseID),
				"Intake Case Id does not Match"+ "\nActual Case Id :" +intakeCaseID.getText().trim() +"Expected Id : " + caseID);
		logger.info("Verifyied Intake Case ID : " + caseID);
		
	}
	
	/***
	 * Verify Investiagtion Case ID
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * 
	 */

	public void verifyInvestigationCaseID(String caseID) throws AcisException {
		logger.info("Verifying Investiagtion Case ID : " + caseID);
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(relatedTab);
		waitForPageLoadTill(10);
		logger.info("Clicked on related tab");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(10);
		jse.executeScript("window.scrollBy(0,500)");
		System.out.println(investigationId.getText().trim());
		Assert.assertTrue(investigationId.getText().trim().equalsIgnoreCase(caseID),
				"Inevestigation Case Id does not Match"+ "\nActual Case Id :" +investigationId.getText().trim() +"Expected Id : " + caseID);
		logger.info("Verifyed Investiagtion Case ID : " + caseID);
		
			
	}
	
	/**
	 * Verify Persons Involved names
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * 
	 */
	public void verifyPersonsInvolvedName(String personName) throws AcisException {
		logger.info("Verifying Persons Involved names");
		waitForPageLoadTill(5);
		clickWebElement(relatedTab);
		waitForPageLoadTill(10);
		logger.info("Clicked on related tab");
		Assert.assertTrue(driver.findElement(By.xpath("//*[contains(text(),'Person')]/../../../../..//*[text()='"+ personName+"']")).isDisplayed(),
				"Person Name :" + personName+ "not present under Persons Involved.");
		logger.info("Verifyied Persons Involved names");
		
	}
	
	/**
	 * Verify Alleagtion type
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * 
	 */
	public void verifyAllegationType(String type) throws AcisException {
		logger.info("Verifying Alleagtion type");
		waitForPageLoadTill(5);
		clickWebElement(relatedTab);
		waitForPageLoadTill(10);
		logger.info("Clicked on related tab");
		Assert.assertTrue(driver.findElement(By.xpath("//*[text()='Allegations']/../../../../..//*[text()='"+ type+"']")).isDisplayed(),
				"Allegation type:" + type+ "not present under Allegation type:");
		logger.info("Verifyied Alleagtion type");
		
	}
	
	/***Click Case Head Info
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void caseHeadInfo() throws AcisException {
		logger.info("Verify case head Information");
		waitForPageLoadTill(10);
		clickWebElemntUsingJavascriptExecutor(caseHeadInfo);
		Actions actions = new Actions(driver);
		actions.moveToElement(caseHeadInfo).perform();
		logger.info("Verified case head Information");
	}
	/**
	 * Close Intake omniscript
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void cancelIntakeOmniscript() throws AcisException, InterruptedException {
		waitForPageLoadTill(10);
		waitForPageLoad();
		
		if(isElementPresent(closeIntakeButtonBy)) {
			clickWebElement(btncancel);
			logger.info("Closing Intake Omniscript Tab");	
		}
		waitForPageLoadTill(5);
	}

}
