package com.acis.automation.pages.intake;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class AgencyHistory_OmniscriptPage extends PageBase {

	public AgencyHistory_OmniscriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(AgencyHistory_OmniscriptPage.class);

	@FindBy(xpath = "//h1[text()='Structured Decision Making']")
	WebElement structuredDecisionMakingTitle;

	@FindBy(xpath = "//span[text()='Next']")
	WebElement nextButton_AgencyHistory;

	@FindBy(xpath = "//*[text()=' Agency History for Persons identified on the previous step']")
	WebElement textAgencyHistory;

	@FindBy(xpath = "//slot//div//table//thead//tr//th//div[text()='Case Head']")
	WebElement labelCaseHead;

	@FindBy(xpath = "//slot//div//table//thead//tr//th//div[text()='Persons Involved']")
	WebElement labelPersonsInvolved;

	@FindBy(xpath = "//slot//div//table//thead//tr//th//div[text()='Date of 1st Contact']")
	WebElement labeldateOfFirstContact;

	@FindBy(xpath = "//slot//div//table//thead//tr//th//div[text()='Hotline Calls']")
	WebElement labelHotlineCalls;

	@FindBy(xpath = "(//div//table//tbody//tr//td)[1]//a")
	WebElement textCaseHead;

	@FindBy(xpath = "(//div//table//tbody//tr//td)[2]//div")
	WebElement textPersonInvolved;

	@FindBy(xpath = "(//div//table//tbody//tr//td)[3]//div")
	WebElement textDateOfFirstContacts;

	@FindBy(xpath = "(//div//table//tbody//tr//td)[4]//div")
	WebElement textHotLineCalls;

	
	@FindBy(xpath = "//button[text()='Create/Add']")
	WebElement createAddButton;

	@FindBy(xpath = "(//*[@data-omni-key='Person']//input)[last()]")
	WebElement casePerson;

	@FindBy(xpath = "(// label[text()='Relationship']/../../..//input[@required])[last()]")
	WebElement relationship;
	
	@FindBy(xpath = "(//*[@data-omni-key='RelatedTo']//input)[last()]")
	WebElement relatedTo;
	
	
	@FindBy(xpath = "(// label[text()='Start Date']/../../..//input)[last()]")
	WebElement startDatePicker;
	
	@FindBy(xpath = "(// label[text()='End Date']/../../..//input)[last()]")
	WebElement endDatePicker;

	@FindBy(xpath = "//span[text()='20']")
	WebElement startDate;

	@FindBy(xpath = "(//span[text()='25'])[last()]")
	WebElement endDate;

	@FindBy(xpath = "(//*[text()='Establish Relationships']/../..//button[text()='Save'])[last()]")
	WebElement save;

	@FindBy(xpath = "(// button[text()='Next'])[last()]")
	WebElement next;
	
	@FindBy(xpath = "//h1[text()='Interview(s)']")
	WebElement verifyInterviewLabel;
	
	/**
	 * click on Next button
	 * 
	 * @author mrunal.s.tilekar
	 */
	public void clickNextButton() throws AcisException, InterruptedException {
		logger.info("Clicking on Next button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForElementClickable(nextButton_AgencyHistory);
		scrollingToElementofAPage(nextButton_AgencyHistory);
		clickWebElement(nextButton_AgencyHistory);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Next button");
		waitForElement(structuredDecisionMakingTitle);
		logger.info("Structured Decision Making page loaded");

	}
	
	/**
	 * Verify Relationship on Person Management Insight
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 */
	public void verifyRelationship(String person,String relationship,String relatedTo) throws AcisException {
	
		logger.info("Verifying the Relationship on Person Account");
		waitForElement(driver.findElement(By.xpath("//*[text()='"+person+"']")));
		waitForElement(driver.findElement(By.xpath("//*[text()='"+relationship+"']")));
		waitForElement(driver.findElement(By.xpath("//*[text()='"+relatedTo+"']")));
		logger.info("Verifyied the Relationship on Person Account");
	}

	/**
	 * click on Next button
	 * 
	 * @author khushboo kumari
	 */
	public void verifyStatus() throws AcisException, InterruptedException {
		logger.info("verifying text on Agent History page");
		waitForElement(textAgencyHistory);
		logger.info("verified text on Agent History page");

	}

	/*
	 * check labels of tables
	 * 
	 * @khushboo
	 * 
	 */
	public void checkLabels() {
		logger.info("checking labels");
		waitForElement(labelCaseHead);
		waitForElement(labelPersonsInvolved);
		waitForElement(labeldateOfFirstContact);
		waitForElement(labelHotlineCalls);
		logger.info("checked labels");

	}

	public void getTableData() {
		logger.info("fetching  table data");
		String caseHead = textCaseHead.getText();
		logger.info("the caseHead value is " + caseHead);
		String personInvolved = textPersonInvolved.getText();
		logger.info("the person Involved is" + personInvolved);
		String dateofcontacts = textDateOfFirstContacts.getText();
		logger.info("date of contact is " + dateofcontacts);
		String hotlinecalls = textHotLineCalls.getText();
		logger.info("the hotline calls is " + hotlinecalls);
	}
	
	/**
	 * Click on Create/Add button
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickCreateAddButton() throws AcisException, InterruptedException {
		logger.info("Clicking on Create/Add button");
		waitForPageLoadTill(5);
		waitForElement(createAddButton);
		clickWebElement(createAddButton);
		logger.info("Clicked on Create/Add button");
		waitForPageLoadTill(5);
		waitForPageLoad();
	}
	
	/**
	 * Set Case Person and Related To TextBox on Establish Relationship Page
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void searchText(String str, String Option) throws AcisException {
		Actions action = new Actions(driver);
		switch (Option) {
		case "Person":
			logger.info(" Case Person Setting as: " + str);
			clickWebElement(casePerson);
			waitForPageLoadTill(5);
			waitForElement(driver.findElement(By.xpath("//*[@role='option']//span[contains(text(),'" + str + "')]")));
			action.moveToElement(driver.findElement(By.xpath("//*[@role='option']//span[contains(text(),'" + str + "')]"))).click().perform();
			logger.info(" Case Person Selected as: " + str);
			break;
		case "Related":
			logger.info(" Related to Setting as: " + str);
			clickWebElement(relatedTo);
			waitForPageLoadTill(5);
			waitForElement(driver.findElement(By.xpath("//*[@role='option']//span[contains(text(),'" + str + "')]")));
			action.moveToElement(driver.findElement(By.xpath("//*[@role='option']//span[contains(text(),'" + str + "')]"))).click().perform();
			logger.info(" Related to Selected as: " + str);
			break;

		}
		waitForPageLoadTill(5);
	}
	
	/**
	 * Set Start Date and End Date on Establish Relationships Page
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 */
	public void setDate(String option) throws AcisException
	{
		switch(option)
		{
		case "Start":
			logger.info("Setting Start Date");
			waitForElementClickable(startDatePicker);
			clickWebElement(startDatePicker);
			waitForElementClickable(startDate);
			clickWebElement(startDate);
			
			logger.info("Successfully set Start Date");
			break;
		case "End":
			logger.info("Setting End Date");
			waitForElementClickable(endDatePicker);
			clickWebElement(endDatePicker);
			waitForElementClickable(endDate);
			clickWebElement(endDate);
			logger.info("Successfully set End Date");
			break;
		default:
			logger.info(option + " Date not found");
			break;
		}
		
	}
	
	/**
	 * set Relationship on Establish RelationShips Page
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void setRelationShip(String option) throws AcisException, InterruptedException {
		logger.info(" Relationship Setting as: " + option);
		enterText(relationship, option);
		waitForPageLoadTill(5);
		waitForElement(driver.findElement(By.xpath("//span[text()='" + option + "']")));
		clickWebElement(driver.findElement(By.xpath("//span[text()='" + option + "']")));
		logger.info(" Relationship Selected as: " + option);
		
	}
	
	/**
	 * Click on save button
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickSaveButton() throws AcisException, InterruptedException {
		logger.info("Clicking on save button"); 
		clickWebElement(save);
		logger.info("Clicked on save button");
		waitForPageLoadTill(5);
		
	}

}