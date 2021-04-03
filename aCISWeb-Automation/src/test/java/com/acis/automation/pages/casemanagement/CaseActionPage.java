package com.acis.automation.pages.casemanagement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class CaseActionPage extends PageBase {

	public CaseActionPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Log logger = LogFactory.getLog(CaseActionPage.class);

	@FindBy(xpath = "(//*[text()='Case Action ID']/../..//lightning-formatted-text)[1]")
	WebElement caseActionIdValue;

	@FindBy(xpath = "(//*[text()='Case Action ID'])[1]")
	WebElement caseActionIDLabel;

	@FindBy(xpath = "//*[text()='Status']")
	WebElement statusLabel;

	@FindBy(xpath = "//*[text()='Status']/../..//lightning-formatted-text")
	WebElement statusValue;

	@FindBy(xpath = "//*[text()='Date Opened']")
	WebElement dateOpenedLabel;

	@FindBy(xpath = "//*[text()='Date Opened']/../..//lightning-formatted-text")
	WebElement dateOpenedValue;

	@FindBy(xpath = "//*[text()='Date Closed']/../..//lightning-formatted-text")
	WebElement dateClosedValue;

	@FindBy(xpath = "//*[text()='Date Closed']")
	WebElement dateClosedLabel;

	@FindBy(xpath = "(//*[text()='Case Head'])[1]")
	WebElement caseHeadLabel;

	@FindBy(xpath = "(//*[text()='Case Head']/../..//span)[1]")
	WebElement caseHeadValue;

	@FindBy(xpath = "(//*[text()='Details'])[1]")
	WebElement detailsTab;

	@FindBy(xpath = "//*[text()='Insights']")
	WebElement insightsTab;

	@FindBy(xpath = "//*[text()='Related']")
	WebElement relatedTab;
	@FindBy(xpath = "//span[text()='Case Action History']")
	WebElement labelCaseActionHistory;

	@FindBy(xpath = "(//span[text()='Date'])[3]")
	WebElement labelDate;

	@FindBy(xpath = "(//span[text()='Field'])[3]")
	WebElement labelField;

	@FindBy(xpath = "(//span[text()='User'])[3]")
	WebElement labelUser;

	@FindBy(xpath = "(//span[text()='Original Value'])[3]")
	WebElement labelOriginalValue;

	@FindBy(xpath = "(//span[text()='New Value'])[3]")
	WebElement labelNewValue;

	@FindBy(xpath = "(//span[text()='Close Case Action History'])")
	WebElement closeCaseActionHistory;

	@FindBy(xpath = "//span[text()='Court Actions']")
	WebElement labelCourtActions;

	@FindBy(xpath = "(//table//tbody/tr/th//a)[1]")
	WebElement firstcourtAction;

	@FindBy(xpath = "(//table//tbody/tr/th//a)[2]")
	WebElement secondCourtAction;

	@FindBy(xpath = "(//span[contains(text(),'CA-')])[1]")
	WebElement tabCourtOrder;

	@FindBy(xpath = "(//span[@title='Case Action ID']//..//lightning-formatted-url//a)[1]")
	WebElement caseActionID;

	@FindBy(xpath = "(//span[text()='Insights']//..//span)[2]")
	WebElement numberOfInsights;
	
	@FindBy(xpath="//a[text()='Prepare for Case Closure']")
	WebElement caseClosue;
	
	@FindBy(xpath="//span[@title='Case Persons']")
	WebElement casePersons;
	
	@FindBy(xpath="(//table//tbody//th)/span/a")
	WebElement firstCasePerson;
	
	@FindBy(xpath="(//span[contains(text(),'C-00')])/../..//a")
	WebElement caseActionPage;
	
	@FindBy(xpath="(//*[text()='Comments']//../../div)[2]/span")
	WebElement closerComments;
	/**
	 * Refresh page
	 * 
	 * @author mrunal.s.tilekar
	 */
	public void refreshPage() {
		logger.info("refreshing page");
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(10);
		logger.info("refreshed page");
	}

	/**
	 * Check labels on Case Action page
	 * 
	 * @author mrunal.s.tilekar
	 */
	public void checkLabelsOnCaseActionPage(String labelOption) {
		waitForPageLoad();
		waitForPageLoadTill(5);
		switch (labelOption) {
		case "Case Action ID":
			logger.info("Checking CaseActionID label");
			Assert.assertTrue(caseActionIDLabel.isDisplayed(), "Error: No Case Action ID Label present");
			logger.info("Checked CaseActionID label");
			break;

		case "Case Head":
			logger.info("Checking Case Head label");
			Assert.assertTrue(caseHeadLabel.isDisplayed(), "Error: No Case Head Label present");
			logger.info("Checked Case Head label");
			break;

		case "Status":
			logger.info("Checking Status label");
			Assert.assertTrue(statusLabel.isDisplayed(), "Error: No Status Label present");
			logger.info("Checked Status label");
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

		default:
			logger.info("No matching Label Value");
			break;
		}

	}

	/**
	 * Get Case Action Id
	 * 
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
		return (caseActionIdValue.getText().trim());
	}

	/**
	 * Get Case Head value
	 * 
	 * @author mrunal.s.tilekar
	 */
	public String getCaseHeadValue() {
		logger.info("Getting Case Head Value");
		waitForPageLoad();
		waitForElement(caseHeadValue);
		System.out.println("Case Head Value Is : " + caseHeadValue.getText().trim());
		logger.info("Case Head Value Is : " + caseHeadValue.getText().trim());
		testLoggerInfo("Case Head Value Is : " + caseHeadValue.getText().trim());
		logger.info("Returning Case Head Value from Case Action Page");
		return (caseHeadValue.getText().trim());
	}

	/**
	 * Check status Value
	 * 
	 * @author mrunal.s.tilekar
	 */
	public void checkStatusValue(String value) {

		switch (value) {
		case "New":
			logger.info("Checking status Value : " + value);
			Assert.assertTrue((statusValue.getText()).equals(value), "Error : Status Value mismatch");
			logger.info("Checked status Value : " + value);
			break;

		case "In Progress":
			logger.info("Checking status Value : " + value);
			Assert.assertTrue((statusValue.getText()).equals(value), "Error : Status Value mismatch");
			logger.info("Checked status Value : " + value);
			break;

		case "Submitted":
			logger.info("Checking status Value : " + value);
			Assert.assertTrue((statusValue.getText()).equals(value), "Error : Status Value mismatch");
			logger.info("Checked status Value : " + value);
			break;

		case "Approved":
			logger.info("Checking status Value : " + value);
			Assert.assertTrue((statusValue.getText()).equals(value), "Error : Status Value mismatch");
			logger.info("Checked status Value : " + value);
			break;

		case "Closed":
			logger.info("Checking status Value : " + value);
			Assert.assertTrue((statusValue.getText()).equals(value), "Error : Status Value mismatch");
			logger.info("Checked status Value : " + value);
			break;

		default:
			logger.info("No macting status value option");
			break;
		}

	}

	/**
	 * Check Date Opened is today's date
	 * 
	 * @author mrunal.s.tilekar
	 */
	public void checkDateOpnedValue() {
		logger.info("Checking Date Opened is today's date");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("MM/d/yyyy");
		LocalDateTime now = LocalDateTime.now();
		System.out.println("Today's Date : " + dtf.format(now));
		String expectedDate = dtf.format(now);
		testLoggerInfo("Date Opened :" +dateOpenedValue.getText().trim());
		testLoggerInfo("Todays date :" +expectedDate);
		Assert.assertTrue((dateOpenedValue.getText().trim()).equals(expectedDate),
				"Error: Date Opned is not today's Date");
		logger.info("Checked Date Opened is today's date");
	}

	/**
	 * Check Date closed is blank
	 * 
	 * @author mrunal.s.tilekar
	 */
	public void checkDateClosedValue() {
		logger.info("Checking Date closed is blank");
		Assert.assertTrue((dateClosedValue.getText().trim()).equals(""), "Error: Date closed is  NOT blank");
		logger.info("Checked Date closed is blank");
	}

	/**
	 * Click Case Head Value Provide FirstName
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickCaseHeadValue(String firstName) throws AcisException {
		logger.info("clicking Case Head Value : " + firstName);
		waitForPageLoad();
		waitForElement(caseHeadLabel);
		clickWebElemntUsingJavascriptExecutor(driver.findElement(
				By.xpath("//*[text()='Case Head']/../..//span[contains(text(),'" + firstName + " ')][1]")));
		logger.info("clicked Case Head Value : " + firstName);
		driver.navigate().refresh();
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(driver.findElement(By.xpath(
				"//*[text()='Case Head']/../..//lightning-formatted-text[contains(text(),'" + firstName + " ')]")));
	}

	/**
	 * Click Details Tab of Case Action page
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickDetailsTab() throws AcisException {
		logger.info("Clicking Details Tab of Case Action page");
		waitForPageLoad();
		waitForElement(detailsTab);
		clickWebElement(detailsTab);
		waitForPageLoadTill(5);
		logger.info("Clicked Details Tab of Case Action page");

	}

	/**
	 * Check child name and its associated Reunification text
	 * 
	 * @author mrunal.s.tilekar
	 */
	public void checkReunicationTextOnChild(String childName) {
		logger.info("Checking child name and its associated Reunification text");
		Assert.assertTrue(
				(driver.findElement(By.xpath("//*[text()='" + childName + "']/..//*[text()='Reunification']")))
						.isDisplayed(),
				"Error: No Reunification text on child name : " + childName);
		logger.info("Checked child name and its associated Reunification text");
	}
	public void clickOnDetailsTab() throws AcisException {
		logger.info("Clicking Details Tab of Case Action page");
		waitForPageLoad();
		waitForElement(detailsTab);
		clickWebElemntUsingJavascriptExecutor(detailsTab);
		waitForPageLoad();
		waitForPageLoadTill(8);
		logger.info("Clicked Details Tab of Case Action page");

	}
	public void checkLabelsOnCaseActionHistory(String labelOption) throws AcisException {
		switch (labelOption) {
		case "Date":
			logger.info("Checking Date label");
			Assert.assertTrue(labelDate.isDisplayed(), "Error: No Date Label present");
			logger.info("Checked Date label");
			break;

		case "Field":
			logger.info("Checking Field  label");
			Assert.assertTrue(labelField.isDisplayed(), "Error: No Field Label present");
			logger.info("Checked Field  label");
			break;

		case "User":
			logger.info("Checking User label");
			Assert.assertTrue(labelUser.isDisplayed(), "Error: No User Label present");
			logger.info("Checked User label");
			break;

		case "Original Value":
			logger.info("Checking Original Value label");
			Assert.assertTrue(labelOriginalValue.isDisplayed(), "Error: No Original Value Label present");
			logger.info("Checked Original Value label");
			break;

		case "New value":
			logger.info("Checking New value  label");
			Assert.assertTrue(labelNewValue.isDisplayed(), "Error: No New value Label present");
			logger.info("Checked New value label");
			break;

		default:
			logger.info("No matching Label Value");
			break;
		}

	}

	/**
	 * Close case Action case Action History of Case Action page
	 * 
	 * @author Khushboo
	 * @throws AcisException
	 */
	public void closeActionHistory() throws AcisException {
		clickWebElement(closeCaseActionHistory);
	}

	public void clickonCaseActionHistory() throws AcisException {
		logger.info("Clicking on case action history of Case Action page");
		waitForPageLoad();
		waitForElement(labelCaseActionHistory);
		clickWebElement(labelCaseActionHistory);
		waitForPageLoadTill(5);
		logger.info("Clicking on case action history of Case Action page");

	}

	/**
	 * Click Related Tab of Case Action page
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickRelatedTab() throws AcisException {
		logger.info("Clicking Related Tab of Case Action page");
		waitForPageLoad();
		Actions act = new Actions(driver);
		waitForElement(caseActionIDLabel);
		//clickWebElement(relatedTab);
		act.moveToElement(relatedTab).click().perform();
		waitForPageLoadTill(5);
		logger.info("Clicked Related Tab of Case Action page");

	}

	/**
	 * Click Insights Tab of Case Action page
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickInsightsTab() throws AcisException {
		logger.info("Clicking Insights Tab of Case Action page");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(caseActionIDLabel);
		Actions act = new Actions(driver);
		waitForElement(insightsTab);
		act.moveToElement(insightsTab).click().perform();
		testLoggerInfo("Clicked down arrow for Insights tab");
		
		waitForPageLoadTill(5);
		logger.info("Clicked Insights Tab of Case Action page");
	}

	/**
	 * Click on court actions of Case Action page
	 * 
	 * @author
	 * @throws AcisException
	 */
	public void openCourtActions(String value) throws AcisException {
		logger.info("open court action of Case Action page");
		waitForPageLoad();
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		waitForElementClickable(labelCourtActions);
		scrollingToElementofAPage(labelCourtActions);
		clickWebElemntUsingJavascriptExecutor(labelCourtActions);
		driver.navigate().refresh();
		waitForPageLoadTill(9);
		switch (value) {
		case "First":
			clickWebElement(firstcourtAction);
			break;
		case "Second":
			clickWebElement(secondCourtAction);
			break;
		default:
			logger.info("No matching Label Value");
			break;

		}

		clickWebElemntUsingJavascriptExecutor(tabCourtOrder);
	}
	/*open case action id after approval
	 * 
	 * by khushboo
	 * 
	 */
	public void openCaseActionID() throws AcisException{
		  logger.info("open case Action iD");
	        Actions act=new Actions(driver);
	        act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	        scrollingToElementofAPage(caseActionID);
	        clickWebElemntUsingJavascriptExecutor(caseActionID);
	}
	/*
	 * Number  case Action id  against investigation
	 * @khushboo
	 */
	public void verifycaseActionInsights() throws AcisException{
		  String  noofinsights=numberOfInsights.getText();
	      logger.info("the number case action against "+noofinsights);
	}
	/*
	 * open prepare for case closure
	 * @khushboo
	 * 
	 */
	public void openCaseclosure() throws AcisException{
		logger.info("open prepare case closure");
		waitForPageLoad();
		Actions actions = new Actions(driver);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		actions.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		scrollingToElementofAPage(caseClosue);
		clickWebElemntUsingJavascriptExecutor(caseClosue);
	
	}
	/*open case person
	 * @khushboo
	 * 
	 * 
	 */
	public void openCasePerson() throws AcisException{
		 logger.info("open case person");
	        Actions act=new Actions(driver);
	        act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
	        scrollingToElementofAPage(casePersons);
	        clickWebElemntUsingJavascriptExecutor(casePersons);
			 driver.navigate().refresh();
			 waitForElement(firstCasePerson);
	        clickWebElement(firstCasePerson);
}
	/*open Case Action Page
	 * @khushboo
	 * 
	 * 
	 */
	public void  openCaseActionTab() throws AcisException {
		logger.info("open case Action tab");
		clickWebElement(caseActionPage);
		
	}
	/*fetch comments of child
	 * @khushboo
	 * 
	 */
	public void fetchComments() throws AcisException {
		logger.info("fetching commnts");
		String comments= closerComments.getText();
		logger.info("the child comments is"+comments);
	}
}
