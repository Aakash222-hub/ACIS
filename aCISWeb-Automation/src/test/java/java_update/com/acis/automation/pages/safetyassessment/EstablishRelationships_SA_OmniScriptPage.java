package com.acis.automation.pages.safetyassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class EstablishRelationships_SA_OmniScriptPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(EstablishRelationships_SA_OmniScriptPage.class);

	public EstablishRelationships_SA_OmniScriptPage() throws AcisException {
		// TODO Auto-generated constructor stub
	}
	
	//Dharmesh Changes

	@FindBy(xpath = "(//button[text()='Create/Add'])[1]")
	WebElement createAddButton;

	@FindBy(xpath = "(//button[text()='Create/Add'])[2]")
	WebElement createAddButtonPlacement;
	
	@FindBy(xpath = "(// *[text()='Case Person']/../../..//input)[last()]")
	WebElement casePerson;

	@FindBy(xpath = "(// label[text()='Relationship']/../../..//input[@required])[last()]")
	WebElement relationship;
	
	@FindBy(xpath = "(//*[text()='Related To']/../../..//input)[last()]")
	WebElement relatedTo;
	
	
	@FindBy(xpath = "(//label[text()='Start Date']/../../..//input)[last()]")
	WebElement startDatePicker;
	
	@FindBy(xpath = "(//label[text()='End Date']/../../..//input)[last()]")
	WebElement endDatePicker;

	@FindBy(xpath = "(//*[text()='20'])[last()]")
	WebElement startDate;

	@FindBy(xpath = "(//*[text()='25'])[last()]")
	WebElement endDate;

	@FindBy(xpath = "(//*[text()='Case Person']/../../../../../..//button[text()='Save'])[last()]")
	WebElement save;
	
	@FindBy(xpath = "(//*[text()='Case Person']/../../../../../..//button[text()='Cancel'])[last()]")
	WebElement cancel;

	@FindBy(xpath = "(//*[text()='Placement Resource Relationships']/../../../../../..//button[text()='Cancel'])[last()]")
	WebElement cancelPlacment;
	
	@FindBy(xpath = "(//*[text()='Next'])[last()]")
	WebElement next;
	
	
	@FindBy(xpath="//h1[text()='Interview Children']")
	WebElement interviewChildrenLabel;
	

	@FindBy(xpath="(//p[text()='Use the fields below to capture relationship details between people on this case. Please note that when a relationship is added the reciprocal is automatically accounted for and does not need to be added separately.'])[last()]")
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
	 * VerifyPerson in Safety Assessment Page
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void verifyPerson() throws AcisException, InterruptedException {
		logger.info(" Case Person Setting as: " );
		clickWebElement(casePerson);
		waitForPageLoadTill(5);
		waitForElement(driver.findElement(By.xpath("(//span[contains(text(),'Name:') and contains(text(),'DOB:') and contains(text(),'Age:') and contains(text(),'Gender:')])[last()]")));
		clickWebElement(relatedTo);
		waitForPageLoadTill(5);
		waitForElement(driver.findElement(By.xpath("(//span[contains(text(),'Name:') and contains(text(),'DOB:') and contains(text(),'Age:') and contains(text(),'Gender:')])[last()]")));
		clickWebElement(cancel);
		logger.info("Clicked on Create/Add button");
		waitForPageLoadTill(5);
	}
	
	/**
	 * VerifyPerson in Safety Assessment Page
	 * @author Dharmesh Krishna
	 * @throws AcisException 
	 * @throws InterruptedException 
	 */
	public void verifyPlacementMessage() throws AcisException, InterruptedException {
		logger.info(" Case Person Setting as: " );
		clickWebElement(createAddButtonPlacement);
		waitForElement(message);
		clickWebElement(cancelPlacment);
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
			clickWebElemntUsingJavascriptExecutor(casePerson);
			waitForPageLoadTill(5);
			waitForElement(driver.findElement(By.xpath("(//span[text()='Case Person']/../../..//span[text()='" + personName + "'])[last()]")));
			clickWebElement(driver.findElement(By.xpath("(//span[text()='Case Person']/../../..//span[text()='" + personName + "'])[last()]")));
			logger.info(" Case Person Selected as: " + personName);
			break;
		case "Related":
			logger.info(" Related to Setting as: " + personName);
			clickWebElemntUsingJavascriptExecutor(relatedTo);
			waitForPageLoadTill(5);
			waitForElement(driver.findElement(By.xpath("(//span[text()='Related To']/../../..//span[text()='" + personName + "'])[last()]")));
			clickWebElement(driver.findElement(By.xpath("(//span[text()='Related To']/../../..//span[text()='" + personName + "'])[last()]")));
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
		clickWebElemntUsingJavascriptExecutor(save);
		logger.info("Clicked on save button");
		waitForPageLoadTill(5);
		
	}
	
	/**
	 * click on Next button
	 * @author Dharmesh Krishna
	 */
	public void clickNextButton() throws AcisException {
		logger.info("Clicking on Next button");
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(5);
		jse.executeScript("window.scrollBy(0,940)");
		waitForElementClickable(next);
		clickWebElement(next);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Next button");
		waitForElement(interviewChildrenLabel);
		logger.info("User is in interview children label");

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
	 * check Case Person and Related To TextBox on Establish Relationship Page
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void checkTexT(String Option,String personName) throws AcisException {
		switch (Option) {
		case "Person":
			logger.info(" Case Person Setting as: " + personName);
			clickWebElemntUsingJavascriptExecutor(casePerson);
			waitForPageLoadTill(5);
			waitForElement(driver.findElement(By.xpath("(//span[text()='Case Person']/../../..//span[text()='" + personName + "'])[last()]")));
		//	clickWebElement(driver.findElement(By.xpath("(//span[text()='Case Person']/../../..//span[text()='" + personName + "'])[last()]")));
			logger.info(" Case Person available as: " + personName);
			break;
		case "Related":
			logger.info(" Related to Setting as: " + personName);
			clickWebElemntUsingJavascriptExecutor(relatedTo);
			waitForPageLoadTill(5);
			waitForElement(driver.findElement(By.xpath("(//span[text()='Related To']/../../..//span[text()='" + personName + "'])[last()]")));
			//clickWebElement(driver.findElement(By.xpath("(//span[text()='Related To']/../../..//span[text()='" + personName + "'])[last()]")));
			logger.info(" Related to Selected as: " + personName);
			break;
		default:
			logger.info("No person is not available"+personName);
		}
		waitForPageLoadTill(5);
	}

}
