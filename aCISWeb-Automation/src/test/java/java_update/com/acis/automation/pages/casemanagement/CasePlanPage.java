package com.acis.automation.pages.casemanagement;

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

public class CasePlanPage extends PageBase {

	public CasePlanPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	final static Logger logger = LoggerFactory.getLogger(CasePlanPage.class);

	@FindBy(xpath = "//*[text()='New Case Plan']")
	WebElement newCasePlanButton;
	
	@FindBy(xpath = "//*[text()='Active Case Plan']")
	WebElement activeCasePlan;
	
	@FindBy(xpath = "//*[contains(text(),'Services To the Child(ren)')]")
	WebElement serviceToChildren;
	
	@FindBy(xpath = "//*[text()='Child Name']")
	WebElement childNameLabel;
	
	@FindBy(xpath = "//*[text()='Placement']")
	WebElement placement;
	
	@FindBy(xpath = "//*[contains(text(),'Planning to move child in next 6 months')]")
	WebElement planningToMovechildInNext6Months;
	
	@FindBy(xpath = "//*[text()='Transition Plan']")
	WebElement transitionPlan;
	
	@FindBy(xpath = "//*[text()='Health']")
	WebElement health;
	
	@FindBy(xpath = "//*[text()='Education']")
	WebElement education;
	
	@FindBy(xpath = "//*[text()='Mental Health']")
	WebElement mentalHealth;
	
	@FindBy(xpath = "//*[text()='Other']")
	WebElement other;
	
	@FindBy(xpath = "//*[text()='Ready By 21']")
	WebElement readyBy21;
	
	@FindBy(xpath = "//button[@title='Close Case Plans']")
	WebElement closeCasePlansTab;
	
	@FindBy(xpath = "//h1[contains(.,'Permanency Plan')]")
	WebElement permanencyPlanTitle;
	
	@FindBy(xpath = "//button[@title='Close Case Plan']")
	WebElement closeCasePlanTab;
	
	@FindBy(xpath = "(//button[text()='Edit'])[2]")
	WebElement editCasePlan;
	
	@FindBy(xpath = "(//button[text()='Edit'])")
	WebElement editCP;
	
	@FindBy(xpath = "//label[text()='Status']")
	WebElement casePlanStatus;
	
	@FindBy(xpath = "//*[text()='Status']/..//*[contains(text(),'Sub')]")
	WebElement statusSubmitted;
	
	@FindBy(xpath = "//label[text()='Status']/../..//input")
	WebElement verifyStatus;
	
	@FindBy(xpath = "//button[text()='Cancel']")
	WebElement casePlanCancel;
	
	@FindBy(xpath = "//*[text()='Insights']")
	WebElement insightsTab;

	@FindBy(xpath = "//span[text()='IsActive']/../..//input[@type='checkbox']")
	WebElement isActive;
	
	@FindBy(xpath = "//label[text()='Status']/..//input")
	WebElement statusTextBox;
	
	@FindBy(xpath = "//label[text()='Status']/..//input[@type='text']/../..//*[text()='Approved']")
	WebElement statusApproved;
	
	@FindBy(xpath = "//label[text()='Status']/..//input[@type='text']/../..//*[text()='In Progress']")
	WebElement statusInProgress;
	
	@FindBy(xpath = "//button[text()='Save']")
	WebElement SaveBtn;
	
	/**
	 * Click New Case Plan button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickNewCasePlan() throws AcisException {
		logger.info("Clicking New Case Plan button");
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(newCasePlanButton);
		waitForElement(permanencyPlanTitle);
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(permanencyPlanTitle);
		logger.info("Clicked on New Person Button");
		
	}
	
	/**
	 * Click on Active Case Plan
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickActiveCasePlan() throws AcisException {
		logger.info("Clicking on Active Case Plan");
		waitForPageLoadTill(5);
		clickWebElement(activeCasePlan);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Active Case Plan");
	}
	
	/**
	 * Check fields under Service To Children
	 * @author mrunal.s.tilekar
	 */
	public void checkFieldsServiceToChildren(String childFullName , String childName) {
		logger.info("Checking fields under Service To Children");
		waitForPageLoadTill(5);
		waitForPageLoad();
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.HOME).build().perform();
		scrollingToElementofAPage(serviceToChildren);
		Assert.assertTrue(serviceToChildren.isDisplayed(), "Error : Service To Children Label Not present");
		Assert.assertTrue(childNameLabel.isDisplayed(), "Error : Child Name Label Not present");
		try {
			Assert.assertTrue((driver.findElement(By.xpath("//span[text()='"+ childName +"']"))).isDisplayed(), "Error : Child Name Value Not present");
			
		}
		catch(Exception e)
		{
			Assert.assertTrue((driver.findElement(By.xpath("//span[text()='"+ childFullName +"']"))).isDisplayed(), "Error : Child Name Value Not present");
			
		}
		Assert.assertTrue(placement.isDisplayed(), "Error : Placement Label Not present");
		Assert.assertTrue(planningToMovechildInNext6Months.isDisplayed(), "Error : Planning to move child in next 6 months Label Not present");
		Assert.assertTrue(transitionPlan.isDisplayed(), "Error : Transition Plan Label Not present");
		Assert.assertTrue(health.isDisplayed(), "Error : Health Not present");
		Assert.assertTrue(education.isDisplayed(), "Error : Education Label Not present");
		Assert.assertTrue(mentalHealth.isDisplayed(), "Error : Mental Health Label Not present");
		Assert.assertTrue(other.isDisplayed(), "Error : Other Label Not present");
		Assert.assertTrue(readyBy21.isDisplayed(), "Error : Ready By 21 Label Not present");
		logger.info("Checked fields under Service To Children");
	}
	
	
	/**
	 * Close New Case plan after submitting case plan
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void closeNewCasePlanWindow() throws AcisException {
		logger.info("Closing New Case plan after submitting case plan");
		waitForPageLoad();
		waitForPageLoadTill(5);
		if (closeCasePlanTab.isDisplayed()) {
			clickWebElement(closeCasePlanTab);
			waitForPageLoadTill(5);
		}
		logger.info("Closed New Case plan after submitting case plan");
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(newCasePlanButton);
		logger.info("succesfully Closed New Case plan after submitting case plan");
		
	}
	
	/**
	 * Close Case plan Tab
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void closeCasePlanTab() throws AcisException {
		logger.info("Closing Case plan Tab");
		waitForPageLoad();
		waitForPageLoadTill(5);
		if (closeCasePlansTab.isDisplayed()) {
			clickWebElement(closeCasePlansTab);
			waitForPageLoadTill(5);
		}
		logger.info("Closed Case plan Tab");
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("succesfully Closed Case plan Tab");
		
	}
	
	/**
	 * Click on Edit Case Plan
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickEditCasePlan() throws AcisException {
		logger.info("Clicking on Edit Case Plan");
		waitForPageLoadTill(5);
		waitForElement(editCasePlan);
		clickWebElemntUsingJavascriptExecutor(editCasePlan);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Edit Case Plan");
	}
	
//	/*** Verify Case plan status Active
//	 * @author pallavi.sanjay.yemle
//	 * @return 
//	 */
//	public String verifyCasePlanStatus() {
//		logger.info("Verify Case plan status is Active");
//		waitForPageLoad();
//		waitForPageLoadTill(5);
//		waitForElement(casePlanStatus);
//		waitForElement(verifyStatus);
//		String fetchID=(verifyStatus).getText();//verifyStatus
//		System.out.println("Created Foster Care Case ID " + fetchID);
//		testLoggerInfo("Created Foster Care Case ID " + fetchID);
//		logger.info("Fetch ID is"+fetchID);
//		logger.info("Verified case plan status is Active");
//		return fetchID;
//	}
	
	/*** Verify Case plan status 
	 * @author pallavi.sanjay.yemle
	 * @return 
	 * @throws AcisException 
	 */
	public String verifyCasePlanStatus() throws AcisException {
		logger.info("Verify Case plan status is Active");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(casePlanStatus);
		Assert.assertTrue(verifyStatus.isDisplayed(), "Error : Status Not present");
		String status=(verifyStatus).getText();//verifyStatus
		System.out.println("Case plan status is" + status);
		testLoggerInfo("Case plan status is" + status);
		logger.info("Verified case plan status is Active");
		return status;
	}
	
	/**
	 * Click on Cancel Case Plan
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void clickCancelCasePlan() throws AcisException {
		logger.info("Clicking on cancel Case Plan");
		waitForPageLoadTill(5);
		waitForElement(casePlanCancel);
		clickWebElement(casePlanCancel);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Cancel Case Plan");
	}

	/**
	 * Click Insights Tab of Case Action page
	 * 
	 * @author khushboo
	 * @throws AcisException
	 */
	public void clickInsightsTab() throws AcisException {
		logger.info("Clicking Insights Tab of Case Action page");
		waitForPageLoad();
		waitForPageLoadTill(5);
		Actions act = new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).perform();
		waitForPageLoadTill(9);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).perform();
		waitForElementClickable(insightsTab);
		scrollingToElementofAPage(insightsTab);
		logger.info("Clicked Insights Tab of Case Action page");
	}

	/***Verify IsActive element on Case PLan review
	 * @author pallavi.sanjay.yemle
	 */
	public void verifyIsActive() {
		logger.info("Verifying  IsActive element is Inactive");
		waitForPageLoad();
		waitForPageLoadTill(5);
//		waitForElement(isActive);
		Boolean isActivefield = isActive.isEnabled();
		Assert.assertTrue(isActivefield, "End Date of  Foster Parent-Foster Child relationship is Read-only");
		logger.info("Verified IsActive element is Inactive");
	}
	
	/*** Clicking On Approved Status
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void ClickOnApprovedStatus() throws AcisException {
		logger.info("Clicking On Approved Status");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(statusTextBox);
		clickWebElement(statusTextBox);
		clickWebElement(statusApproved);
		logger.info("Clicked On Approved Status");
	}
	
	/*** Clicking On In Progress Status
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void ClickOnInProgressStatus() throws AcisException {
		logger.info("Clicking On Approved Status");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(statusTextBox);
		clickWebElement(statusTextBox);
		clickWebElement(statusInProgress);
		logger.info("Clicked On Approved Status");
	}
	
	/*** Clicking On Save Button
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void ClickOnsaveButton() throws AcisException {
		logger.info("Clicking On Save Button ");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(SaveBtn);
		clickWebElement(SaveBtn);
		logger.info("Clicked On Save Button ");
	}
	/* Click Case Plan Edit
	 * Created By Pallavi
	 */
	public void casePlanEdit() throws AcisException {
		logger.info("Clicking on Edit Case Plan");
		waitForPageLoadTill(5);
		waitForElement(editCP);
		clickWebElemntUsingJavascriptExecutor(editCP);
		waitForPageLoadTill(5);
		waitForPageLoad();
		logger.info("Clicked on Edit Case Plan");
	}
	
}

