package com.acis.automation.pages.casemanagement;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class CaseClosureDecisionPage  extends PageBase{

	public CaseClosureDecisionPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	final static Logger logger = LoggerFactory.getLogger(CaseClosureDecisionPage.class);

	
	@FindBy(xpath = "//h1[text()='Case Closure Decision']")
	WebElement caseClosureDecisionTitle;
	

	@FindBy(xpath = "//*[text()='Worker Comments']/../../..//textarea")
	WebElement workerCommentsTextbox;

	@FindBy(xpath = "//*[text()='Submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//button[text()='Close Case']")
	WebElement closeCaseBtn;
	
	@FindBy(xpath = "//h1[contains(text(),'Case Closure criteria not met')]")
	WebElement criteriaNotMet;

	@FindBy(xpath = "//p[contains(text(),'closure criteria:')]")
	WebElement closureCriteria;
	
	@FindBy(xpath = "//div[text()='Complete']")
	WebElement completePrepareForCaseClosure;
	
	@FindBy(xpath = "//div[text()='Submit']")
	WebElement submitPrepareForCaseClosure;
	
	@FindBy(xpath = "//span[contains(text(),'do not have permission')]")
	WebElement completeDoNotHavePermission;
	
	@FindBy(xpath = "//button[text()='Finish']")
	WebElement finish;
	
	@FindBy(xpath = "//b[text()='Case submitted to supervisor']")
	WebElement caseSubmittedToSupervisor;
	
	@FindBy(xpath = "//span[contains(text(),'Case has already been submitted to supervisor and cannot be resubmitted')]")
	WebElement caseResubmitted;
	
	@FindBy(xpath = "//b[text()='Case marked complete']")
	WebElement caseMarkComplete;
	
	@FindBy(xpath = "//span[text()='Case has already been marked complete']")
	WebElement caseMarkAlreadyCompleted;
	
	@FindBy(xpath = "(//span[text()='Disposition']/../..//span[@class='slds-radio_faux'])[1]")
	WebElement accept;
	
	@FindBy(xpath = "(//span[text()='Disposition']/../..//span[@class='slds-radio_faux'])[2]")
	WebElement override;
	
	@FindBy(xpath = "//label[text()='Supervisory Comments']/../..//textarea")
	WebElement supervisoryComments;
	
	/**
	 * Click on Submit Button
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void clickSubmitbtn() throws AcisException {
		logger.info("Clicking on Submit button");
		scrollingToElementofAPage(submitButton);
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		try {
			clickWebElement(submitButton);
		} catch (Exception e) {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			waitForPageLoadTill(9);
			jse.executeScript("window.scrollBy(0,940)");
		clickWebElemntUsingJavascriptExecutor(submitButton);
		}
		waitForPageLoadTill(5);
		logger.info("Case close Flow has been submitted");
	}
	
	/**
	 * Enter Text Box : WorkerComments
	 * @author mrunal.s.tilekar
	 * 
	 * @throws AcisException
	 */
	public void enterTextFieldValue( String strValue) throws AcisException {
		logger.info("Entering Worker Comment as: " + strValue);
		waitForPageLoad();
		enterText(workerCommentsTextbox, strValue);
		waitForPageLoadTill(5);
		logger.info("Worker Comment entered as: " + strValue);
		waitForPageLoadTill(5);
	}
	
	/*** Open Close Case
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void openCloseCase() throws AcisException {
		logger.info("Clicking on Close case");
		waitForPageLoad();
		waitForElement(closeCaseBtn);
		clickWebElement(closeCaseBtn);
		logger.info("Clicked on Close case");
	}
	
	/*** Verify Case Closure Criteria
	 * @author pallavi.sanjay.yemle
	 */
	public void verifyCaseClosureCriteria() {
		logger.info("Verifing Case Closure Criteria");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(criteriaNotMet);
		Assert.assertTrue(criteriaNotMet.isDisplayed(), "Error : Case Closure Criteria is Not present");
		waitForElement(closureCriteria);
		Assert.assertTrue(closureCriteria.isDisplayed(), "Error : Case Closure Criteria is Not present");
		waitForPageLoadTill(5);
		logger.info("Verified Case Closure Criteria");
	}
	
	/*** Clicking on Complete Prepare Case closure
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void ClickOnComplete() throws AcisException {
		logger.info("Clicking On Complete Prepare Case closure");
		waitForPageLoad();
		waitForElement(completePrepareForCaseClosure);
		clickWebElement(completePrepareForCaseClosure);
		logger.info("Clicked On Complete Prepare Case closure");
	}
	
	/*** Clicking on Submit Prepare Case closure
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void ClickOnSubmit() throws AcisException {
		logger.info("Clicking On Submit Prepare Case closure");
		waitForPageLoad();
		waitForElement(submitPrepareForCaseClosure);
		clickWebElement(submitPrepareForCaseClosure);
		logger.info("Clicked On Submit Prepare Case closure");
	}
	
	/*** Verify You do not have permission to mark this case as complete
	 * @author pallavi.sanjay.yemle
	 */
	public void verifyingCompletePermission() {
		logger.info("Verifing Case Closure Criteria");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(completeDoNotHavePermission);
		Assert.assertTrue(completeDoNotHavePermission.isDisplayed(), "Error : Do not Have Permission is Not present");
		waitForPageLoadTill(5);
		logger.info("Verified Case Closure Criteria");
	}
	
	/***Clicking On Finish
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void ClickingOnFinish() throws AcisException {
		logger.info("Clicking On Finish");
		waitForPageLoad();
		waitForElement(finish);
		clickWebElement(finish);
		logger.info("Clicked On Finish");
	}
	
	/*** Verify Message worker submits to their supervisor: "Case submitted to supervisor"
	 * @author pallavi.sanjay.yemle
	 */
	public void verifyCaseSubmitted() {
		logger.info("Verifing Message worker submits to their supervisor: Case submitted to supervisor");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(caseSubmittedToSupervisor);
		Assert.assertTrue(caseSubmittedToSupervisor.isDisplayed(), "Error : Worker Submit To Supervisor not Present");
		waitForPageLoadTill(5);
		logger.info("Verified Message worker submits to their supervisor: Case submitted to supervisor");
	}
	
	/*** Verify Message worker submits to their supervisor: "Case has already been submitted to supervisor and cannot be resubmitted"
	 * @author pallavi.sanjay.yemle
	 */
	public void verifyCaseResubmitted() {
		logger.info("Verifing Message worker submits to their supervisor: Case resubmitted to supervisor");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(caseResubmitted);
		Assert.assertTrue(caseResubmitted.isDisplayed(), "Error : Case has already been submitted to supervisor and cannot be resubmitted not Present");
		waitForPageLoadTill(5);
		logger.info("Verified Message worker submits to their supervisor: Case resubmitted to supervisor");
	}
	
	/*** Verify Case Mark Complete On Supervisor Task
	 * @author pallavi.sanjay.yemle
	 */
	public void verifyingCaseMarkComplete() {
		logger.info("Verifing  Case Mark Complete On Supervisor Task");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(caseMarkComplete);//b[text()='Case marked complete']
		Assert.assertTrue(caseMarkComplete.isDisplayed(), "Error :  Case Mark Complete On Supervisor Task is Not present");
		waitForPageLoadTill(5);
		logger.info("Verified  Case Mark Complete On Supervisor Task");
	}
	
	/*** Verify Case has already been marked complete On Supervisor Task
	 * @author pallavi.sanjay.yemle
	 */
	public void verifyingCaseMarkAlreadyCompleted() {
		logger.info("Verifing  Case has already been marked complete On Supervisor Task");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(caseMarkAlreadyCompleted);
		Assert.assertTrue(caseMarkAlreadyCompleted.isDisplayed(), "Error :  Case has already been marked complete On Supervisor Task is Not present");
		waitForPageLoadTill(5);
		logger.info("Verified  Case has already been marked complete On Supervisor Task");
	}
	
	/*** Clicking On Supervisory Approval: Accept and Override
	 * @author pallavi.sanjay.yemle
	 * @throws AcisException 
	 */
	public void ClickOnSupervisoryApproval(String option) throws AcisException {
		logger.info("Clicking On Supervisory Approval: Accept");
		switch (option) {
		 case "Accept":
			logger.info("Clicking On Supervisory Approval: Accept");
			waitForPageLoad();
			waitForPageLoadTill(4);
			waitForElement(accept);
			clickWebElement(accept);
			logger.info("Clicked On Supervisory Approval: Accept");
			break;
			
		 case "Override":
			logger.info("Clicking On Supervisory Approval: Accept");
			waitForPageLoad();
			waitForPageLoadTill(4);
			waitForElement(override);
			clickWebElement(override);
			logger.info("Clicked On Supervisory Approval: Accept");
			break;
		}
		
	}
	
	/**
	 * Enter Text Box : Supervisory Comments
	 * @author Pallavi
	 * 
	 * @throws AcisException
	 */
	public void enterTextFieldSupervisoryComment( String strValue) throws AcisException {
		logger.info("Entering Worker Comment as: " + strValue);
		waitForPageLoad();
		enterText(supervisoryComments, strValue);
		waitForPageLoadTill(5);
		logger.info("Worker Comment entered as: " + strValue);
		waitForPageLoadTill(5);
	}
}
