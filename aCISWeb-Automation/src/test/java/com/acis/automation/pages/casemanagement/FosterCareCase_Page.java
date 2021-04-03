package com.acis.automation.pages.casemanagement;

import java.awt.AWTException;

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

	@FindBy(xpath = "//h1[text()='Person(s) Involved']")
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

	@FindBy(xpath = "//*[text()='New Service Referral']")
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

	/**
	 * Clicked on Interactions Tab on Froster Care Case Record Created By Priyanka
	 * 
	 * @throws AcisException
	 */
	public void clickscheduleMeetingButton() throws AcisException {
		logger.info("Clicking on schedule Meeting Button");
		clickWebElement(scheduleMeetingButton);
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
}
