package com.acis.automation.pages.casemanagement;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class CaseHead_page extends PageBase {

	public CaseHead_page() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(CaseHead_page.class);

	@FindBy(xpath = "//a[text()='Related']")
	WebElement tabRelated;
	@FindBy(xpath = "(//*[text()='Related'])[2]")
	WebElement secondcaseheadRelatedtab;

	@FindBy(xpath = "(//*[text()='Related'])[3]")
	WebElement thirdcaseheadRelatedtab;

	@FindBy(xpath = "//span[text()='Case Action ID']")
	WebElement labelCaseActionID;

	@FindBy(xpath = "//span[text()='Case Type']")
	WebElement labelCaseType;

	@FindBy(xpath = "//span[text()='Date Opened']")
	WebElement labelDateOpened;

	@FindBy(xpath = "//span[text()='Date Closed']")
	WebElement labelDateClosed;

	@FindBy(xpath = "//span[text()='Cases']")
	WebElement labelCases;

	@FindBy(xpath = "//tr//th//span//a[contains(@title,'C-')]")
	WebElement caseID;

	@FindBy(xpath = "//button[text()='Workflow']")
	WebElement investigationWorkflow;

	@FindBy(xpath = "(//p[text()='Case Head']/..//span)[2]")
	WebElement caseHeadInvestigation;

	@FindBy(xpath = "//button[text()='Create New Foster Care Case']")
	WebElement newFosterCareCase;

	@FindBy(xpath = "(//h2[text()='Create New Foster Care Case']/../..//span[text()='Save'])[last()]")
	WebElement fosterSave;

	@FindBy(xpath = "//*[contains(@title,'C-')]")
	WebElement fosterCase;

	@FindBy(xpath = "//*[text()='Foster Care']")
	WebElement fosterCareVerify;

	@FindBy(xpath = "(//span[text()='Save'])[3]")
	WebElement btnsave;

	@FindBy(xpath = "//div[@title='New Person']")
	WebElement btnNewPerson;

	@FindBy(xpath = "//div[text()='New']")
	WebElement btnNew;

	@FindBy(xpath = "(//*[text()='Primary Caregiver'])[2]/..//input")
	WebElement textPrimarycaregiver;

	@FindBy(xpath = "(//button[text()='Save'])")
	WebElement btnSaveNewCaseHead;
	
	@FindBy(xpath = "//span[text()='Household Relationships']")
	WebElement householdRelationshipsLink;
	
	@FindBy(xpath = "//td[@data-label='Household Relationship ID']//a")
	WebElement householdRelationshipID;
	
	/**
	 * Clicked on Household Relationships id  Created By Priyanka
	 * 
	 * @throws AcisException
	 */
	public void clickHouseholdRelationshipsId(String placementName) throws AcisException {
		logger.info("Clicking on Household Relationships Id");
		waitForPageLoad();
		waitForPageLoadTill(5);
		String memberRecord = "//a[@title='@value']/../..//following-sibling::td[3]//a".replace("@value",
				placementName);
		//scrollingToElementofAPage(driver.findElement(By.xpath(memberRecord)));
		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath(memberRecord)));
		waitForPageLoad();
		waitForPageLoadTill(10);
		logger.info("Clicked on Household Relationships Id");
	}

	/**
	 * Creating New Foster Care Case Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void verifyHouseHoldRelation(String Person, String Related, String Relationship) throws AcisException {
	logger.info("Verify Person , Related To and Relationship on Case Head");
	Actions act = new Actions(driver);
	waitForPageLoadTill(5);
	waitForPageLoad();
	act.sendKeys(Keys.PAGE_DOWN).build().perform();
	waitForPageLoadTill(5);
	waitForElement(driver.findElement(By.xpath("//*[@data-label='Person']//a//span[contains(text(),'"+Person+"')]")));
	waitForElement(driver.findElement(By.xpath("//*[@data-label='Related To']//a[contains(text(),'"+Related+"')]")));
	waitForElement(driver.findElement(By.xpath("//*[@data-label='Relationship']//*[text()='"+Relationship+"']")));
	logger.info("Verified Person , Related To and Relationship on Case Head");
	}

	/**
	 * Creating New Foster Care Case Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public String newFosterCase() throws AcisException {
		String fosterCaseID;
		logger.info("Clicking on New Foster CareCase Tab");
		waitForElement(newFosterCareCase);
		clickWebElement(newFosterCareCase);
		waitForPageLoadTill(5);
		waitForElement(fosterSave);
		clickWebElement(fosterSave);
		waitForElement(fosterCase);
		fosterCaseID = fosterCase.getText();
		System.out.println("Created Foster Care Case ID " + fosterCaseID);
		testLoggerInfo("Created Foster Care Case ID " + fosterCaseID);
		logger.info("Clicked on Related Tab");
		return fosterCaseID;
	}

	/**
	 * Clicked on Related Tab on a case head Record Created By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void clickRelatedTab(String option) throws AcisException {
		switch (option) {
		case "First Related tab":
			logger.info("Clicking on Related Tab");
			waitForElement(tabRelated);
			clickWebElemntUsingJavascriptExecutor(tabRelated);
			waitForPageLoad();
			waitForPageLoadTill(5);
			logger.info("Clicked on Related Tab");
			break;
		case "Second Related tab":
			logger.info("Clicking on Related Tab");
			Actions actions = new Actions(driver);
			actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
			waitForPageLoadTill(9);
			actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
			waitForElementClickable(secondcaseheadRelatedtab);
			scrollingToElementofAPage(secondcaseheadRelatedtab);
			clickWebElemntUsingJavascriptExecutor(secondcaseheadRelatedtab);
			waitForPageLoad();
			waitForPageLoadTill(5);
			logger.info("Clicked on Related Tab");
			break;
		case "third Related tab":
			logger.info("Clicking on Related Tab");
			waitForElement(thirdcaseheadRelatedtab);
			clickWebElemntUsingJavascriptExecutor(thirdcaseheadRelatedtab);
			waitForPageLoad();
			waitForPageLoadTill(5);
			logger.info("Clicked on Related Tab");
			break;
		default:
			logger.info("No releated tab ");

		}
	}

	/**
	 * Clicked on Related Tab on a case head Record Created By Dharmesh
	 * 
	 * @throws AcisException
	 */
	public void clickRelatedTabCase() throws AcisException {
		logger.info("Clicking on Related Tab");
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(secondcaseheadRelatedtab);
		clickWebElemntUsingJavascriptExecutor(secondcaseheadRelatedtab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Related Tab");
	}

	/**
	 * Clicked on Household Relationships on a case head Page Created By Priyanka
	 * 
	 * @throws AcisException
	 */
	public void clickHouseholdRelationshipsLink() throws AcisException {
		logger.info("Clicking on Household Relationships Link");
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		//refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(5);
		scrollingToElementofAPage(householdRelationshipsLink);
		clickWebElemntUsingJavascriptExecutor(householdRelationshipsLink);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Household Relationships Link");
	}

	/**
	 * verify labels on Related Tab on a case head Record Created By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void verifyCaseHead() throws AcisException {
		logger.info("Verifying on Related Tab");
		waitForElement(labelCaseActionID);
		waitForElement(labelCaseType);
		waitForElement(labelDateOpened);
		waitForElement(labelDateClosed);
		logger.info("verified on Related Tab");
	}

	/**
	 * click on cases on case headCreated By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void openCaseHead() throws AcisException {
		clickWebElement(labelCases);
		driver.navigate().refresh();
		waitForPageLoadTill(10);
		waitForPageLoad();
		waitForElement(caseID);
		clickWebElemntUsingJavascriptExecutor(caseID);
		logger.info(" Clicked on Case Action ID Link");
		waitForPageLoadTill(10);
		waitForPageLoad();
		// waitForElement(investigationWorkflow);
	}

	/**
	 * Verify case head on cases on Investigation workflow Created By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void verifyCaseHeadonInvestigation() throws AcisException {
		String textCaseHead = caseHeadInvestigation.getText();
		logger.info("The case Head " + textCaseHead);
	}

	/**
	 * click on Save button on create new foster case Created By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void clickOnSaveButton() throws AcisException {
		clickWebElement(btnsave);
	}

	/**
	 * click on New Person button on create new foster case Created By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void clickOnNewPerson() throws AcisException {
		scrollingToElementofAPage(secondcaseheadRelatedtab);
		clickWebElement(btnNewPerson);
	}

	/**
	 * create new Case head Created By Khushboo
	 * 
	 * @throws AcisException
	 */
	public void createNewCaseHead(String text) throws AcisException {
		waitForPageLoad();
		waitForElement(btnNew);
		clickWebElement(btnNew);
		waitForElement(textPrimarycaregiver);
		enterText(textPrimarycaregiver, text);
		clickWebElement(btnSaveNewCaseHead);
	}
}
