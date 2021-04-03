package com.acis.automation.pages.investigation;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class EstablishRelationships__OmniScriptPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(EstablishRelationships__OmniScriptPage.class);

	public EstablishRelationships__OmniScriptPage() throws AcisException {
		// TODO Auto-generated constructor stub
	}
	
	//Dharmesh

	@FindBy(xpath = "//button[text()='Create/Add']")
	WebElement createAddButton;

	@FindBy(xpath = "(// *[text()='Case Person']/../../..//input)[last()]")
	WebElement casePerson;

	@FindBy(xpath = "(// label[text()='Relationship']/../../..//input[@required])[last()]")
	WebElement relationship;
	
	@FindBy(xpath = "(// span[text()='Related To']/../../..//input)[last()]")
	WebElement relatedTo;
	
	
	@FindBy(xpath = "(// label[text()='Start Date']/../../..//input)[last()]")
	WebElement startDatePicker;
	
	@FindBy(xpath = "(// label[text()='End Date']/../../..//input)[last()]")
	WebElement endDatePicker;

	@FindBy(xpath = "//span[text()='20']")
	WebElement startDate;

	@FindBy(xpath = "(//span[text()='25'])[last()]")
	WebElement endDate;

	@FindBy(xpath = "(// button[text()='Save'])[last()-1]")
	WebElement save;

	@FindBy(xpath = "(// button[text()='Next'])[last()]")
	WebElement next;
	
	@FindBy(xpath = "//h1[text()='Interview(s)']")
	WebElement verifyInterviewLabel;
	
	
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
		switch (Option) {
		case "Person":
			logger.info(" Case Person Setting as: " + str);
			clickWebElemntUsingJavascriptExecutor(casePerson);
			waitForPageLoadTill(5);
			waitForElement(driver.findElement(By.xpath("(//span[text()='Case Person']/../../..//span[contains(text(),'" + str + "')])[last()]")));
			clickWebElement(driver.findElement(By.xpath("(//span[text()='Case Person']/../../..//span[contains(text(),'" + str + "')])[last()]")));
			logger.info(" Case Person Selected as: " + str);
			break;
		case "Related":
			logger.info(" Related to Setting as: " + str);
			clickWebElemntUsingJavascriptExecutor(relatedTo);
			waitForPageLoadTill(5);
			waitForElement(driver.findElement(By.xpath("(//span[text()='Related To']/../../..//span[contains(text(),'" + str + "')])[last()]")));
			clickWebElement(driver.findElement(By.xpath("(//span[text()='Related To']/../../..//span[contains(text(),'" + str + "')])[last()]")));
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
	public void clickSaveButton(String option) throws AcisException, InterruptedException {
		logger.info("Clicking on save button"); 
		clickWebElement(save);
		logger.info("Clicked on save button");
		waitForPageLoadTill(5);
		
	}
	
	/**
	 * click on Next button
	 * @author Dharmesh Krishna
	 */
	public void clickNextButton() throws AcisException {
		logger.info("Clicking on Next button");
		scrollingToElementofAPage(next);
		clickWebElement(next);
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(verifyInterviewLabel);
		logger.info("Clicked on Next button");

	}

}
