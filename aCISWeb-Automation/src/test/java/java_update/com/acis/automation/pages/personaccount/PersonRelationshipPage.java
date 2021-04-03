package com.acis.automation.pages.personaccount;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class PersonRelationshipPage extends PageBase{

	public PersonRelationshipPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	final static Logger logger = LoggerFactory.getLogger(InsightsPage.class);
	
	
	@FindBy(xpath = "(//h1[text()='Person Relationship']/..//button[text()='Create/Add'])[1]")
	WebElement createAddButton;

	@FindBy(xpath = "(//h1[text()='Person Relations']/../..//*[text()='Person']/../../..//input[@required])[last()]")
	WebElement casePerson;

	@FindBy(xpath = "(//h1[text()='Person Relations']/../..//*[text()='Relationship']/../../..//input[@required])[last()]")
	WebElement relationship;
	
	@FindBy(xpath = "(//h1[text()='Person Relations']/../..//*[text()='Related To']/../../..//input[@required])[last()]")
	WebElement relatedTo;
	
	
	@FindBy(xpath = "(//h1[text()='Person Relations']/../..//*[text()='Start Date']/../../..//input)[last()]")
	WebElement startDatePicker;
	
	@FindBy(xpath = "(//h1[text()='Person Relations']/../..//*[text()='End Date']/../../..//input)[last()]")
	WebElement endDatePicker;

	@FindBy(xpath = "(//*[text()='20'])[last()]")
	WebElement startDate;

	@FindBy(xpath = "(//*[text()='25'])[last()]")
	WebElement endDate;

	@FindBy(xpath = "(//h1[text()='Person Relations']/../..//*[text()='Save'])[last()]")
	WebElement save;

	
	
	@FindBy(xpath="//*[text()='Use the fields below to capture relationship details between people on this case. If capturing a relationship with a child, add the child first to the \"Person\" field. If both or neither persons in the relationship are children, then add the people to either field. Please note that when a relationship is added the reciprocal is automatically accounted for and does not need to be added separately.']")
	WebElement message;
	
	/**
	 * Click on Create/Add button
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void clickCreateAddButton() throws AcisException, InterruptedException {
		logger.info("Clicking on Create/Add button");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(createAddButton);
		clickWebElement(createAddButton);
		logger.info("Clicked on Create/Add button");
		waitForPageLoadTill(5);
	}
	
	/**
	 * Set Case Person and Related To TextBox on Establish Relationship Page
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void searchTexT(String Option,String personName) throws AcisException {
		switch (Option) {
		case "Person":
			logger.info(" Case Person Setting as: " + personName);
			clickWebElement(casePerson);
			waitForPageLoadTill(5);
			enterText(casePerson, personName);
			waitForPageLoadTill(10);
			waitForElement(driver.findElement(By.xpath("(//*[text()='Person']/../../..//span[contains(text(),'"+ personName +"')])[last()]")));
			clickWebElement(driver.findElement(By.xpath("(//*[text()='Person']/../../..//span[contains(text(),'"+ personName +"')])[last()]")));
			logger.info(" Case Person Selected as: " + personName);
			break;
		case "Related":
			logger.info(" Related to Setting as: " + personName);
			clickWebElement(relatedTo);
			waitForPageLoadTill(5);
			enterText(relatedTo, personName);
			waitForPageLoadTill(10);
			waitForElement(driver.findElement(By.xpath("(//*[text()='Related To']/../../..//span[contains(text(),'" + personName + "')])[last()]")));
			clickWebElement(driver.findElement(By.xpath("(//*[text()='Related To']/../../..//span[contains(text(),'" + personName + "')])[last()]")));
			logger.info(" Related to Selected as: " + personName);
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
		waitForPageLoadTill(5);
		clickWebElement(save);
		logger.info("Clicked on save button");
		waitForPageLoadTill(5);
		
	}
	
	
	/*check message
	 * @author khushboo
	 */
	public void checkMessage() {
		logger.info("checking message");
		waitForElement(message);
		logger.info("checked message");
	}
	
	
	/**
	 * Verify error message with person name
	 * @author mrunal.s.tilekar
	 */
	public void verifyErrorMessage(String personFullName) {
		logger.info("Verifying error message");
		waitForElement(driver.findElement(By.xpath("//*[text()='Please choose "+ personFullName +" either in Person or Related To']")));
		logger.info("Verifyed error message");
		
	}
}
