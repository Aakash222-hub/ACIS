package com.acis.automation.pages.casemanagement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class DetailsCaseActionTabPage  extends PageBase{

	public DetailsCaseActionTabPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(CaseActionPage.class);

	@FindBy(xpath = "(//*[text()='Case Action ID']/../..//lightning-formatted-text)[2]")
	WebElement caseActionIdValue;

	@FindBy(xpath = "(//*[text()='Case Action ID'])[2]")
	WebElement caseActionIDLabel;

	@FindBy(xpath = "(//*[text()='Status'])[2]")
	WebElement statusLabel;
	
	@FindBy(xpath = "(//*[text()='Date Opened'])[2]")
	WebElement dateOpenedLabel;
	
	@FindBy(xpath = "(//*[text()='Date Opened']/../..//lightning-formatted-text)[2]")
	WebElement dateOpenedValue;

	@FindBy(xpath = "(//*[text()='Date Closed']/../..//lightning-formatted-text)[2]")
	WebElement dateClosedValue;
	
	@FindBy(xpath = "(//*[text()='Date Closed'])[2]")
	WebElement dateClosedLabel;
	
	@FindBy(xpath = "//*[text()='Case Supervisor']")
	WebElement caseSupervisorLabel;

	@FindBy(xpath = "//*[text()='Case Supervisor']/../..//a//span")
	WebElement caseSupervisorValue;

	@FindBy(xpath = "//*[text()='Case Type']")
	WebElement caseTypeLabel;

	@FindBy(xpath = "//*[text()='Case Type']/../..//lightning-formatted-text")
	WebElement caseTypeValue;

	@FindBy(xpath = "//*[text()='Owner']")
	WebElement ownerLabel;

	@FindBy(xpath = "//*[text()='Owner']/../..//a//span")
	WebElement ownerValue;
	
	@FindBy(xpath = "//button[@title='Edit Case Supervisor']")
	WebElement editCaseSupervisorButton;
	
	@FindBy(xpath = "//*[text()='Case Supervisor']/../..//input")
	WebElement caseSupervisorTextBox;

	@FindBy(xpath = "//button[@title='Edit Status']")
	WebElement editStatusButton;
	
	@FindBy(xpath = "//label[text()='Status']/../..//input")
	WebElement statusTextBox;
	
	@FindBy(xpath = "//span[@title='Closed']")
	WebElement statusValue_Closed;
	
	@FindBy(xpath = "//span[@title='In Progress']")
	WebElement statusValue_Inprogress;
	
	@FindBy(xpath = "//*[text()='Status']/../..//span[text()='New']")
	WebElement statusValue_New;
	
	@FindBy(xpath = "//span[@title='Submitted']")
	WebElement statusValue_Submitted;
	
	@FindBy(xpath = "//span[@title='Approved']")
	WebElement statusValue_Approved;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement saveButton;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement cancelButton;
	
	@FindBy(xpath = "//button[@title='Change Owner']")
	WebElement editOwnerButton;
	
	@FindBy(xpath = "//input[@title='Search People']")
	WebElement searchPeopleTextbox;
	
	@FindBy(xpath = "//h2[text()='Change Owner']")
	WebElement changeOwnerTitle;
	
	@FindBy(xpath = "//h2[text()='Change Owner']/../..//button[text()='Change Owner']")
	WebElement changeOwnerButton;
	
	@FindBy(xpath = "//*[text()='Response Time Met']")
	WebElement responseTimeMetLabel;
	
	@FindBy(xpath = "//*[text()='Response Time Met']/../..//lightning-formatted-text")
	WebElement responseTimeMetValue;
	
	@FindBy(xpath = "//button[@title='Edit Response Time Met']")
	WebElement editResponseTimeMet;
	
	@FindBy(xpath = "//*[text()='Response Time Met']/..//input")
	WebElement responseTimeMetDropDown;
	
	@FindBy(xpath = "//span[contains(text(),'N/A')]")
	WebElement responseTimeMetValue_NA;
	
	
	/**
	 * Check labels on Case Action - Details page
	 * @author mrunal.s.tilekar
	 */
	public void checkLabelsOnCaseActionDetailsPage(String labelOption) {
		
		switch (labelOption) {
		case "Case Action ID":
			logger.info("Checking CaseActionID label");
			Assert.assertTrue(caseActionIDLabel.isDisplayed(), "Error: No Case Action ID Label present");
			logger.info("Checked CaseActionID label");
			break;

		case "Status":
			logger.info("Checking Status label");
			Assert.assertTrue(statusLabel.isDisplayed(), "Error: No Status Label present");
			logger.info("Checked Status label");
			break;
			
		case "Case Supervisor":
			logger.info("Checking Case Supervisor label");
			Assert.assertTrue(caseSupervisorLabel.isDisplayed(), "Error: No Case Supervisor Label present");
			logger.info("Checked Case Supervisor label");
			break;
			
		case "Date Opened":
			logger.info("Checking Date Opened label");
			Assert.assertTrue(dateOpenedLabel.isDisplayed(), "Error: No Date Opened Label present");
			logger.info("Checked Date Opened label");
			break;
			
		case "Date Closed":
			logger.info("Checking Date Closed label");
			Assert.assertTrue(dateClosedLabel.isDisplayed(), "Error: No Date Closed Label present");
			logger.info("Checked Date Closed label");
			break;
			
		case "Response Time Met":
			logger.info("Checking Response Time Met label");
			Assert.assertTrue(responseTimeMetLabel.isDisplayed(), "Error: No Response Time Met Label present");
			logger.info("Checked Response Time Met label");
			break;
			
		
		default:
			logger.info("No matching Label Value");
			break;
		}
		
	}
	
	/**
	 * Get Case Action Id  - Details page
	 * @author mrunal.s.tilekar
	 */
	public String getCaseActionID() {
		logger.info("Getting Case Action ID");
		waitForPageLoad();
		waitForElement(caseActionIdValue);
		System.out.println("Case ID Is : " + caseActionIdValue.getText().trim());
		logger.info("Case ID Is : " + caseActionIdValue.getText().trim());
		testLoggerInfo("Case ID Is : " + caseActionIdValue.getText().trim());
		logger.info("Returning Case Action Id from Case Action Page");
		return(caseActionIdValue.getText().trim());
	}
	

	
	/**
	 * Check status Value  on Details page
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void checkStatusValue(String value) throws AcisException {
		
		//scrollingToElementofAPage(statusTextBox);
		
		switch (value) {
		case "New":
			logger.info("Checking status Value : " + value);
			Assert.assertTrue((driver.findElement(By.xpath("//span[@title='New']"))).isDisplayed(), "Error : Status Value mismatch");
			logger.info("Checked status Value : " + value);
			break;

		case "In Progress":
			logger.info("Checking status Value : " + value);
			Assert.assertTrue(statusValue_Inprogress.isDisplayed(), "Error : Status Value mismatch");
			logger.info("Checked status Value : " + value);
			break;
			
		case "Submitted":
			logger.info("Checking status Value : " + value);
			Assert.assertTrue(statusValue_Submitted.isDisplayed(), "Error : Status Value mismatch");
			logger.info("Checked status Value : " + value);
			break;
			
		case "Approved":
			logger.info("Checking status Value : " + value);
			Assert.assertTrue(statusValue_Approved.isDisplayed(), "Error : Status Value mismatch");
			logger.info("Checked status Value : " + value);
			break;
			
		case "Closed":
			logger.info("Checking status Value : " + value);
			Assert.assertTrue(statusValue_Closed.isDisplayed(), "Error : Status Value mismatch");
			logger.info("Checked status Value : " + value);
			break;
			
		
		default:
			logger.info("No macting status value option");
			break;
		}
		
		
	}
	
	
	/**
	 * Check Date Opened is today's date
	 * @author mrunal.s.tilekar
	 */
	public void checkDateOpnedValue() {
		logger.info("Checking Date Opened is today's date");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/dd/yyyy");  
		LocalDateTime now = LocalDateTime.now();  
		System.out.println("Today's Date : "+dtf.format(now));
		String expectedDate=dtf.format(now);
		Assert.assertTrue((dateOpenedValue.getText().trim()).equals(expectedDate), "Error: Date Opned is not today's Date");
		logger.info("Checked Date Opened is today's date");
	}
	
	/**
	 * Check Date closed is blank
	 * @author mrunal.s.tilekar
	 */
	public void checkDateClosedValue() {
		logger.info("Checking Date closed is blank");
		Assert.assertTrue((dateClosedValue.getText().trim()).equals(null), "Error: Date closed is  NOT blank");
		logger.info("Checked Date closed is blank");
	}
	
	
	/**
	 * Verify Case Supervisor Value
	 * @author mrunal.s.tilekar
	 */
	public void checkCaseSupervisorValue(String supervisorValue) {
		logger.info("Verifying Case Supervisor Value : "+ supervisorValue);
		scrollingToElementofAPage(caseSupervisorLabel);
		Assert.assertTrue((caseSupervisorValue.getText().trim()).equals(supervisorValue), "Error: Case Supervisor Value does Not match ");
		logger.info("Verified Case Supervisor Value : "+ supervisorValue);
	}
	
	/**
	 * Verify Case Owner Value
	 * @author mrunal.s.tilekar
	 */
	public void checkCaseOwnerValue(String value) {
		logger.info("Verifying Case Owner Value : "+ value);
		scrollingToElementofAPage(ownerLabel);
		Assert.assertTrue((ownerValue.getText().trim()).equals(value), "Error: Case Owner Value does Not match ");
		logger.info("Verified Case Owner Value : "+ value);
	}
	
	/**
	 * Give Case supervisor Value
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void provideCaseSupervisorValue(String supervisorName) throws AcisException {
		logger.info("Giving Case supervisor Value : " + supervisorName);
		scrollingToElementofAPage(caseSupervisorLabel);
		clickWebElemntUsingJavascriptExecutor(editCaseSupervisorButton);
		waitForPageLoadTill(5);
		enterText(caseSupervisorTextBox, supervisorName);
		waitForPageLoadTill(5);
		//waitForElementClickable(driver.findElement(By.xpath("//*[text()='Case Supervisor']/..//*[@title='"+supervisorName+"']")));
		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("//*[text()='Case Supervisor']/..//*[@title='"+supervisorName+"']")));
		logger.info("Case supervisor Value : " + supervisorName);
		
	}
	
	/**
	 * Click Save button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickSaveButton() throws AcisException {
		logger.info("Clicking Save button");
		scrollingToElementofAPage(saveButton);
		clickWebElemntUsingJavascriptExecutor(saveButton);
		logger.info("Clicked Save button");
		waitForPageLoad();
		waitForPageLoadTill(10);
		logger.info("successfully Saved changes");
	}
	
	/**
	 * Click Cancel button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickCancelButton() throws AcisException {
		logger.info("Clicking Cancel button");
		scrollingToElementofAPage(cancelButton);
		clickWebElement(cancelButton);
		logger.info("Clicked Cancel button");
		waitForElement(caseSupervisorLabel);
	}
	
	/**
	 * Click edit status
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickEditStatus() throws AcisException {
		logger.info("Clicking Edit status");
		scrollingToElementofAPage(statusLabel);
		clickWebElemntUsingJavascriptExecutor(editStatusButton);
		waitForPageLoadTill(5);
		scrollingToElementofAPage(statusTextBox);
		clickWebElemntUsingJavascriptExecutor(statusTextBox);
		logger.info("Clicked Edit status");
		
		
	}
	
	
	/**
	 * Give Case Owner Value
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void provideCaseOwnerValue(String ownerName) throws AcisException {
		logger.info("Giving Case Owner Value : " + ownerName);
		scrollingToElementofAPage(ownerLabel);
		clickWebElemntUsingJavascriptExecutor(editOwnerButton);
		waitForPageLoadTill(5);
		waitForElement(changeOwnerTitle);
		enterText(searchPeopleTextbox, ownerName);
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("//*[@title='"+ownerName+"']")));
		waitForPageLoadTill(5);
		logger.info("Case supervisor Value : " + ownerName);
		logger.info("clicking change owner button");
		clickWebElement(changeOwnerButton);
		waitForPageLoadTill(5);
		waitForElement(caseActionIDLabel);
		logger.info("clicked change owner button");
		
		
	}
	
	/**
	 * Check  Response Time Met Value
	 * @author mrunal.s.tilekar
	 */
	public void checkResponseTimeMetValue(String value) {
		logger.info("Verifying Response Time Met Value : "+ value);
		scrollingToElementofAPage(responseTimeMetLabel);
		Assert.assertTrue((responseTimeMetValue.getText().trim()).equals(value), "Error: Response Time Met Value does Not match ");
		logger.info("Verified Response Time Met Value : "+ value);
	}
	
	
	/**
	 * Provide  Response Time Met Value
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void provideResponseTimeMetValue(String value) throws AcisException {
		logger.info("Selecting Response Time Met Value : "+ value);
		
		switch (value) {
		case "NA":
			scrollingToElementofAPage(responseTimeMetLabel);
			clickWebElemntUsingJavascriptExecutor(editResponseTimeMet);
			waitForPageLoadTill(5);
			scrollingToElementofAPage(responseTimeMetLabel);
			waitForPageLoadTill(5);
			clickWebElemntUsingJavascriptExecutor(responseTimeMetDropDown);
			waitForElement(responseTimeMetValue_NA);
			clickWebElement(responseTimeMetValue_NA);
			logger.info("Selected Response Time Met Value : "+ value);
			
			break;

		default:
			break;
		}
		
	}
	
	
}
