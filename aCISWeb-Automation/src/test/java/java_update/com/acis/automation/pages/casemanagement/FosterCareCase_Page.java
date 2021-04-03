package com.acis.automation.pages.casemanagement;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class FosterCareCase_Page extends PageBase {

	public FosterCareCase_Page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(FosterCareCase_Page.class);

	@FindBy(xpath = "//*[text()='Placements']")
	WebElement placementTab;

	@FindBy(xpath = "//*[text()='Interactions']")
	WebElement interactionsTab;

	@FindBy(xpath = "(//*[text()='Schedule Meeting'])[2]")
	WebElement scheduleMeetingButton;

	@FindBy(xpath = "//*[text()='Assessments']")
	WebElement assessmentsTab;

	@FindBy(xpath = "//*[text()='Case Persons']")
	WebElement casePersonTab;

	@FindBy(xpath = "//*[text()='New Family Needs Assessment']")
	WebElement newAssessment;

	@FindBy(xpath = "//*[text()='New Placement']")
	WebElement newPlacement;

	@FindBy(xpath = "//*[text()='New Person']")
	WebElement newPerson;

	@FindBy(xpath = "//h1[text()='New Placement']")
	WebElement placementVerify;

	@FindBy(xpath = "//h1[text()='Persons Involved']")
	WebElement personInvolvedVerify;

	@FindBy(xpath = "//h1[text()='Family Needs Assessment']")
	WebElement assessmentVerify;

	@FindBy(xpath = "//*[text()='Related']")
	WebElement relatedTab;

	@FindBy(xpath = "//*[text()='Child Removal Episodes']")
	WebElement childRemovalEpisodes;

	@FindBy(xpath = "//h1[@title='Child Removal Episodes']")
	WebElement childRemovalEpisodesTitle;

	@FindBy(xpath = "//*[text()='Case Plans']")
	WebElement casePlansTab;

	@FindBy(xpath = "//*[text()='New Case Plan']")
	WebElement newCasePlanButton;

	@FindBy(xpath = "//*[text()='Court Actions']")
	WebElement courtActions;

	@FindBy(xpath = "//div[text()='New Court Action']")
	WebElement btnCourtAction;

	@FindBy(xpath = "//*[text()='Service Referrals']")
	WebElement serviceReferrals;

	@FindBy(xpath = "//div[text()='New Service Referral']")
	WebElement newServiceReferral;

	@FindBy(xpath = "//h1[text()='Service Referral']")
	WebElement serviceReferralVerify;

	@FindBy(xpath = "//button[text()='Close Case']")
	WebElement closeCaseButton;

	@FindBy(xpath = "//h1[contains(text(),'Upload Supporting Documentation')]")
	WebElement uploadSupportingDocumentationTitle;
	
	@FindBy(xpath = "//p[text()='Case Head']/..//a/span")
	WebElement caseHeadValue;
	
	public By personInvolvedVerifyBy= By.xpath("//h1[text()='Person(s) Involved']");


	@FindBy(xpath = "//span[contains(text(),'Upload Files')]")
	WebElement uploadFilesButton;
	
	@FindBy(xpath = "(//*[text()='Interactions'])[last()]/../../../following-sibling::div//div")
	WebElement newInteraction;

	@FindBy(xpath = "//h1[text()='Interactions']")
	WebElement interactionsTitle;
	
	@FindBy(xpath = "//table/tbody/tr/th/span/a")
	WebElement casePersonName;
	
	@FindBy(xpath = "//span[text()='Public Safety']")
	WebElement publicSafety;
	
	@FindBy(xpath = "//*[text()='Comprehensive Assessment']")
	WebElement comprehensiveAssessment;
	
	@FindBy(xpath = "//*[text()='Health Appointment']")
	WebElement health;
	
	@FindBy(xpath = "//*[text()='Medication']")
	WebElement medication;
	
	@FindBy(xpath = "//*[text()='Education']")
	WebElement education;
	
	@FindBy(xpath = "//table/tbody/tr[1]/th/span/a")
	WebElement assessmentId;
	
	@FindBy(xpath = "//*[text()='Services Provided']")
	WebElement servicesProvided;
	
	@FindBy(xpath = "//span[text()='Family Needs Assessment Graph']")
	WebElement familyNeedAssessmentGraph;
	
	@FindBy(xpath = "(//span[text()='Status'])[1]")
	WebElement fosterCareCaseStatus;
	
	@FindBy(xpath = "//span[contains(text(),'Household Members ')]")
	WebElement HouseholdMember;
	
	@FindBy(xpath = "//div[text()='Name']")
	WebElement HouseholdMemberName;
	
	@FindBy(xpath = "//div[text()='Age']")
	WebElement HouseholdMemberAge;
	
	@FindBy(xpath = "//div[text()='Date of Birth']")
	WebElement HouseholdMemberDOB;
	
	@FindBy(xpath = "//lightning-input/div/span/label/span[1]")
	WebElement HouseholdMemberCheckbox;
	
	@FindBy(xpath = "//*[contains(text(),'Date Closed')]/../..//input[@data-id='date-picker-slds-input']")
	public static WebElement DateClosedTextBox;
	
	@FindBy(xpath = "(//label[text()='Pick a year']/../..//select)[last()]")
	WebElement closeDateYearlist;
	
	@FindBy(xpath = "//*[text()='20']")
	WebElement dateClose;
	
	@FindBy(xpath = "//span[text()='Next']")
	WebElement FosterCareCaseNext;
	
	@FindBy(xpath = "//h1[contains(text(),'House')]")
	WebElement nohouseholdSelected;
	
	@FindBy(xpath = "//span[contains(text(),'Date closed')]")
	WebElement DateclosedError;
	
	@FindBy(xpath = "//div[text()='New Decison Making Tool']")
	WebElement decisionMakingTool;
	
	@FindBy(xpath = "//span[text()='Assessments']")
	WebElement relatedAssessment;
	
	public By houseHoldCasePerson= By.xpath("//table/tbody/tr/th/span/a");
	
	/**
	 * Clicked on Related Tab on a Foster Care Case Record Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickRelatedTab() throws AcisException {
		logger.info("Clicking on Related Tab");
		waitForElement(relatedTab);
		clickWebElemntUsingJavascriptExecutor(relatedTab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Related Tab");

	}
	/**
	 * Click on Case Head value on Case Page
	 * @author priyanka
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickOnCaseHeadValue() throws AcisException, InterruptedException {
		logger.info("Clicking on Case Head");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(caseHeadValue);
		clickWebElement(caseHeadValue);
		logger.info("Clicked on Case Head");
		waitForPageLoadTill(5);
	}


	/**
	 * Clicked on New Placement Tab on Froster Care Case Record Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickPlacementTab() throws AcisException {
		logger.info("Clicking on New Placement Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(placementTab);
		clickWebElemntUsingJavascriptExecutor(placementTab);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on New Placement Tab");

	}

	/**
	 * Clicked on New Assessments Tab on Froster Care Case Record Created By
	 * Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickAssessmentsTab() throws AcisException {
		logger.info("Clicking on New Assessments Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(assessmentsTab);
		clickWebElemntUsingJavascriptExecutor(assessmentsTab);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on New Assessments Tab");

	}

	/**
	 * Clicked on New Person Tab on Froster Care Case Record Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickPersonTab() throws AcisException {
		logger.info("Clicking on New Person Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(casePersonTab);
		clickWebElemntUsingJavascriptExecutor(casePersonTab);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on New Person Tab");

	}

	/**
	 * Clicked on New Placement on Placement Tab Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickNewPlacement() throws AcisException {
		logger.info("Clicking on New Placement Button");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(newPlacement);
		clickWebElement(newPlacement);
		waitForElement(placementVerify);
		refreshPage();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(placementVerify);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on New Placement Button");
	}

	/**
	 * Clicked on New Family Needs Assessment on Placement Tab Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickNewAssessment() throws AcisException {
		logger.info("Clicking on New Assessment Button");
		waitForPageLoadTill(5);
		clickWebElement(newAssessment);
		waitForElement(assessmentVerify);
		logger.info("Clicked on New Assessment Button");
	}

	/**
	 * Clicked on New Person on Case Person Tab Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickNewPerson() throws AcisException {
		logger.info("Clicking on New Person Button");
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(newPerson);
		waitForPageLoadTill(10);
		if(isElementPresent(personInvolvedVerifyBy)==false)
		{
			waitForPageLoadTill(10);
		}
		waitForElement(personInvolvedVerify);
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(personInvolvedVerify);
		logger.info("Clicked on New Person Button");
	}

	/**
	 * Clicking child Removal Episodes
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickChildRemovalEpisodes() throws AcisException {
		logger.info("Clicking on child Removal Episodes Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(childRemovalEpisodes);
		clickWebElemntUsingJavascriptExecutor(childRemovalEpisodes);
		logger.info("Clicked on child Removal Episodes Tab");
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(childRemovalEpisodesTitle);
		logger.info("Successfully Clicked on child Removal Episodes Tab");

	}

	/**
	 * Clicking Case Plan Tab
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickCasePlanTab() throws AcisException {
		logger.info("Clicking on Case Plan Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(casePlansTab);
		clickWebElemntUsingJavascriptExecutor(casePlansTab);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Case Plan Tab");
		waitForElement(newCasePlanButton);
		logger.info("Successfully Clicked on Case Plan Tab");
	}
	public void clickOnNewCasePlanTab() throws AcisException {
		logger.info("Clicking on Case Plan Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(casePlansTab);
		clickWebElemntUsingJavascriptExecutor(casePlansTab);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Case Plan Tab");
		waitForElement(newCasePlanButton);
		clickWebElemntUsingJavascriptExecutor(newCasePlanButton);
		logger.info("Successfully Clicked on New Case Plan Tab");
	}
	/**
	 * Clicking court Actions
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickCourtAction() throws AcisException {
		logger.info("Clicking on court Actions  Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(courtActions);
		clickWebElemntUsingJavascriptExecutor(courtActions);
		logger.info("Clicked on court Actions  Tab");
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(btnCourtAction);
		logger.info("Successfully Clicked on court Actions Tab");

	}

	/**
	 * Clicked on New Service Referral Tab on Froster Care Case Record Created By
	 * Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickServiceReferralTab() throws AcisException {
		logger.info("Clicking on New Service Referral Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(serviceReferrals);
		clickWebElemntUsingJavascriptExecutor(serviceReferrals);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on New Service Referral Tab");

	}

	/**
	 * Clicked on New ServiceReferral on Placement Tab Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickNewServiceReferral() throws AcisException {
		logger.info("Clicking on New Service Referral Button");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(newServiceReferral);
		clickWebElement(newServiceReferral);
		waitForElement(serviceReferralVerify);
		refreshPage();
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(serviceReferralVerify);
		logger.info("Clicked on New Service Referral Button");
	}

	/**
	 * Click Close Case Button
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickCloseCaseButton() throws AcisException {
		logger.info("Clicking Close Case Button");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(closeCaseButton);
		clickWebElement(closeCaseButton);
		logger.info("Clicked Close Case Button");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(uploadSupportingDocumentationTitle);
		logger.info("Successfully Clicked Close Case Button");
	}
	/*
	 * Clicked on New Interaction on Interaction Tab Created By Priyanka
	 * 
	 * @throws AcisException
	 */
	public void clickNewInteraction() throws AcisException {
		logger.info("Clicking on New Interaction Button");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(newInteraction);
		clickWebElement(newInteraction);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on New Placement Button");
	}

	/**
	 * Clicked on Interactions Tab on Froster Care Case Record Created By Priyanka
	 * 
	 * @throws AcisException
	 */
	public void clickInteractionsTab() throws AcisException {
		logger.info("Clicking on Interactions Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(interactionsTab);
		clickWebElemntUsingJavascriptExecutor(interactionsTab);
		//driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Interactions Tab");

	}
	public void clickOnInteractionsTab() throws AcisException {
		logger.info("Clicking on Interactions Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
		waitForPageLoadTill(5);
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
	 * Clicked on Interactions Tab on Froster Care Case Record Created By Priyanka
	 * 
	 * @throws AcisException
	 */
	public void clickscheduleMeetingButton() throws AcisException {
		logger.info("Clicking on schedule Meeting Button");
		waitForPageLoadTill(8);
		clickWebElemntUsingJavascriptExecutor(scheduleMeetingButton);
		waitForPageLoad();
		waitForPageLoadTill(8);
		logger.info("Clicked on Schedule Meeting Button");

	}
	
	/*** Click new Court Action 
	 * @author pallavi.sanjay.yemle
	 */
	public void clickNewCourtAction() throws AcisException {
		logger.info("Clicking on new Court Action ");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		clickWebElemntUsingJavascriptExecutor(btnCourtAction);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked new Court Action ");

	}
	
	/*** Click Case Person Name
	 * @author pallavi.sanjay.yemle
	 */
	public void ClickCasePersonName() throws AcisException {
		logger.info("Clicking on Case Person Name ");
		waitForElement(casePersonName);
		clickWebElemntUsingJavascriptExecutor(casePersonName);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Case Person Name ");

	}
	
	/*** Clicking on Public Safety
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 * 
	 */
	public void ClickPublicSafety() throws AcisException {
		logger.info("Clicking on Public Safety");
		waitForPageLoadTill(5);
	//	scrollingToElementofAPage(publicSafety);
		clickWebElemntUsingJavascriptExecutor(publicSafety);
		waitForPageLoadTill(6);
		logger.info("Clicked on Public Safety");
	}
	
	/**
	 * Clicked on New Family Needs Assessment  Tab on Froster Care Case Record Created By
	 * Pallavi
	 * 
	 * @throws AcisException
	 */
	public void clickNFAssessmentsTab() throws AcisException {
		logger.info("Clicking on New Assessments Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
//		scrollingToElementofAPage(newAssessment);
		clickWebElemntUsingJavascriptExecutor(newAssessment);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on New Assessments Tab");

	}
	
	/***viewing the Insights Placement tab on a Foster Care Case
	 * @author pallavi.sanjay.yemle 
	 */
	
	public void viewingInsightPlacementTab() {
		logger.info("Verifying  Placement Tab on Foster care case");
		waitForPageLoadTill(3);
		scrollingToElementofAPage(placementTab);
		waitForElement(placementTab);
		logger.info("Verified  Placement Tab on Foster care case");
		
	}
	
	/***viewing the Insights Case Plan tab on a Foster Care Case
	 * @author pallavi.sanjay.yemle 
	 */
	
	public void viewingInsightCasePlanTab() {
		logger.info("Verifying  Case Plan Tab on Foster care case");
		waitForPageLoadTill(3);
		scrollingToElementofAPage(casePlansTab);
		waitForElement(casePlansTab);
		logger.info("Verified  Case Plan Tab on Foster care case");
		
	}
	
	/***viewing the Insights  Court Actions tab on a Foster Care Case
	 * @author pallavi.sanjay.yemle 
	 */
	
	public void viewingInsightCourtActionsTab() {
		logger.info("Verifying  Court Actions Tab on Foster care case");
		waitForPageLoadTill(3);
		scrollingToElementofAPage(casePlansTab);
		waitForElement(casePlansTab);
		logger.info("Verified  Court Actions Tab on Foster care case");
		
	}
	
	/***viewing the Insights Interactions tab on a Foster Care Case
	 * @author pallavi.sanjay.yemle 
	 */
	
	public void viewingInsightInteractionsTab() {
		logger.info("Verifying  Interactions Tab on Foster care case");
		waitForPageLoadTill(3);
		scrollingToElementofAPage(interactionsTab);
		waitForElement(interactionsTab);
		logger.info("Verified  Interactions Tab on Foster care case");
		
	}
	
	/***viewing the Insights comprehensive Assessment tab on a Foster Care Case
	 * @author pallavi.sanjay.yemle 
	 */
	
	public void viewingInsightcomprehensiveAssessment() {
		logger.info("Verifying  comprehensive Assessment Tab on Foster care case");
		waitForPageLoadTill(3);
		scrollingToElementofAPage(comprehensiveAssessment);
		waitForElement(comprehensiveAssessment);
		logger.info("Verified  comprehensive Assessment Tab on Foster care case");
		
	}
	
	/***viewing the Insights Health,Medication and Education tab on a Foster Care Case
	 * @author pallavi.sanjay.yemle 
	 */
	
	public void viewingInsightHME() {
		logger.info("Verifying Health Tab on Foster care case");
		waitForPageLoadTill(3);
		scrollingToElementofAPage(health);
		waitForElement(health);
		logger.info("Verified Health Tab on Foster care case");
		logger.info("Verifying medication Tab on Foster care case");
		waitForPageLoadTill(3);
		scrollingToElementofAPage(medication);
		waitForElement(medication);
		logger.info("Verified medication Tab on Foster care case");
		logger.info("Verifying education Tab on Foster care case");
		waitForPageLoadTill(3);
		scrollingToElementofAPage(education);
		waitForElement(education);
		logger.info("Verified education Tab on Foster care case");

		
	}
	/***viewing the Insights Service Referral tab on a Foster Care Case
	 * @author pallavi.sanjay.yemle 
	 */
	
	public void viewingInsightServiceReferralTab() {
		logger.info("Verifying  Service Referral  Tab on Foster care case");
		waitForPageLoadTill(3);
		scrollingToElementofAPage(serviceReferrals);
		waitForElement(serviceReferrals);
		logger.info("Verified  Service Referral  Tab on Foster care case");
		
	}
	
	/***viewing the Insights Services Provided tab on a Foster Care Case
	 * @author pallavi.sanjay.yemle 
	 */
	
	public void viewingInsightServicesProviedTab() {
		logger.info("Verifying  Services Provided  Tab on Foster care case");
		waitForPageLoadTill(3);
		scrollingToElementofAPage(servicesProvided);
		waitForElement(servicesProvided);
		logger.info("Verified Services Provided  Tab on Foster care case");
		
	}
	
	/***viewing the Insights Assessment tab on a Foster Care Case
	 * @author pallavi.sanjay.yemle 
	 */
	
	public void viewingInsightAssessmentTab() {
		logger.info("Verifying  Assessment Tab on Foster care case");
		waitForPageLoadTill(3);
		scrollingToElementofAPage(assessmentsTab);
		waitForElement(assessmentsTab);
		logger.info("Verified  Assessment Tab on Foster care case");
		
	}
	
	/*** Clicking on new Family Assessment Id
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void ClickAssessmentId() throws AcisException {
		logger.info("Clicking on  Assessment ID");
		waitForPageLoad();
		waitForPageLoadTill(8);
		waitForElement(assessmentId);
		clickWebElement(assessmentId);
		waitForPageLoadTill(8);
		logger.info("Clicked on  Assessment ID");
	}
	
	/***viewing the Insights Family Needs Assessment Graph  on a Foster Care Case
	 * @author pallavi.sanjay.yemle 
	 */
	
	public void viewingInsightFNAAssessmentGraph() {
		logger.info("Verifying Family Needs Assessment Graph on Foster care case");
		waitForPageLoadTill(3);
		scrollingToElementofAPage(familyNeedAssessmentGraph);
		waitForElement(familyNeedAssessmentGraph);
		logger.info("Verified Family Needs Assessment Graph on Foster care case");
		
	}
	
	/*Verify Household person fields: Name, DOB and Age
	 * Created By Pallavi
	 * 
	 */
	public void HouseholdPersonField() {
		logger.info("Verifying Household person fields on Foster care case  NAme ");
		waitForPageLoadTill(3);
//		waitForElement(fosterCareCaseStatus);
		scrollingToElementofAPage(HouseholdMember);
		waitForElement(HouseholdMemberName);
		Assert.assertTrue(HouseholdMemberName.isDisplayed(), "Error : Household person fields on Foster care case  NAme Not present");
		logger.info("Verified Household person fields on Foster care case  NAme");
		logger.info("Verifying Household person fields on Foster care case  Age ");
		waitForPageLoadTill(3);
		waitForElement(HouseholdMemberAge);
		Assert.assertTrue(HouseholdMemberAge.isDisplayed(), "Error : Household person fields on Foster care case  Age Not present");
		logger.info("Verified Household person fields on Foster care case  Age");
		logger.info("Verifying Household person fields on Foster care case  DOB ");
		waitForPageLoadTill(3);
		waitForElement(HouseholdMemberDOB);
		Assert.assertTrue(HouseholdMemberDOB.isDisplayed(), "Error : Household person fields on Foster care case  DOB Not present");
		logger.info("Verified Household person fields on Foster care case  DOB");
	}
	
	/*Select One HouseHold Person record
	 * Created By Pallavi
	 */
	public void SelectOneHouseholdPerson() throws AcisException {
		logger.info("Selecting One Household Person Record");
		waitForPageLoad();
		waitForElement(HouseholdMember);
		waitForElement(HouseholdMemberCheckbox);
		clickWebElemntUsingJavascriptExecutor(HouseholdMemberCheckbox);
		waitForPageLoadTill(5);
		logger.info("Selected One Household Person Record");
	}
	
	/***Enter Closed Date
	 * Created By Pallavi
	 */
	public void provideClosedDate(String year) throws AcisException {
		logger.info("Entering Closed Date");
//		scrollingToElementofAPage(DateClosedTextBox);
		waitForPageLoadTill(5);
		clickWebElement(DateClosedTextBox);
		clickWebElement(closeDateYearlist);
		
		Select closedyearList = new Select(closeDateYearlist);
		List<WebElement> elementCount = closedyearList.getOptions();
		int iSize = elementCount.size();

		for (int i = 0; i < iSize; i++) {
			String birthyearValue = elementCount.get(i).getText().trim();
			// System.out.println(birthyearValue);
			if (birthyearValue.equalsIgnoreCase(year)) {
				closedyearList.selectByVisibleText(year);
				logger.info(" matching birthyear Value");
				break;
			} else {
				System.out.println("No matching Closed date year Value");
				logger.info("No matching Closed date year Value");
			}

		}

		clickWebElement(dateClose);
		logger.info("Closed Date entered");
		
	}
	
	/*** Click Next Button
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void nextButton() throws AcisException {
		logger.info("Clicking on Next Button");
		scrollingToElementofAPage(FosterCareCaseNext);
		waitForElement(FosterCareCaseNext);
		clickWebElemntUsingJavascriptExecutor(FosterCareCaseNext);
		waitForPageLoadTill(5);
		logger.info("Clicked on Next Button");
	}
	
	/*** Validate Date closed can't be earlier than Date opened Error
	 * @author pallavi.sanjay.yemle
	 */
	public void DateClosedError() {
		logger.info("Validating Date closed can't be earlier than Date opened Error");
		waitForElement(nohouseholdSelected);
		waitForElement(DateclosedError);
	}
	
	/*** Verify selected  household persons should be on the foster care case
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void houseHoldPersonOnFosterCare() throws AcisException {
		logger.info("Verify selected  household persons should be on the foster care case");
		waitForPageLoad();
		waitForPageLoadTill(5);
		if(isElementPresent(houseHoldCasePerson)==true) {
			waitForPageLoadTill(2);
		}
		logger.info("Verified Successfully selected  household persons should be on the foster care case");
		
	}
	
	/**
	 * Clicked on Decision Making Tool on Placement Tab Created By Pallavi
	 * 
	 * @throws AcisException
	 */
	public void clickDecisionMakingTool() throws AcisException {
		logger.info("Clicking on Decision Making Tool Assessment Button");
		waitForPageLoadTill(5);
		waitForElement(decisionMakingTool);
		clickWebElement(decisionMakingTool);
		waitForPageLoadTill(5);
		logger.info("Clicked on Decision Making Tool Assessment Button");
	}
	
	/*** Click On Related Assessment
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void relatedAssessment() throws AcisException {
		logger.info("Clicking on New Assessments Tab");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		//scrollingToElementofAPage(relatedAssessment);
		clickWebElemntUsingJavascriptExecutor(relatedAssessment);
		driver.navigate().refresh();
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on New Assessments Tab");
	}
}
