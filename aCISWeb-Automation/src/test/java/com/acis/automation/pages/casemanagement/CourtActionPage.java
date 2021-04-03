package com.acis.automation.pages.casemanagement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class CourtActionPage extends PageBase {

	public CourtActionPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(CourtActionPage.class);

	@FindBy(xpath = "(//*[text()='Court Order']/../../..//*[contains(text(),'CA-')])[1]")
	WebElement firstCourtOrderRecord;
	
	@FindBy(xpath = "//button[@title='Close Court Actions']")
	WebElement closeCourtActionButton;
	
	@FindBy(xpath = "//a[text()='Prepare for Case Closure']")
	WebElement prepareForCaseClosureLink;
	
	@FindBy(xpath = "//span[text()='Assigned To']/..//following-sibling::div//a")
	WebElement assignedTo;
	
	@FindBy(xpath = "(//span[text()='Related To']/..//following-sibling::div//a)[2]")
	WebElement relatedTo;
	
	@FindBy(xpath = "(//*[text()='Related'])[2]")
	WebElement related;
	
	
	@FindBy(xpath = "//span[text()='Subject']/..//following-sibling::div/span/span")
	WebElement subject;
	
	@FindBy(xpath = "//span[text()='Priority']/..//following-sibling::div/span/span")
	WebElement priority;
	
	@FindBy(xpath = "//span[text()='Status']/..//following-sibling::div/span/span")
	WebElement status;
	
	@FindBy(xpath = "//span[text()='Comments']/..//following-sibling::div/span/span")
	WebElement comments;
	
	@FindBy(xpath = "(//span[text()='Name']/..//following-sibling::div//a)[2]")
	WebElement name;
	/**
	 * Click first record of type court order
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickFirstRecordCourtOrder() throws AcisException {
		logger.info("Clicking first record of type court order");
		waitForPageLoadTill(5);
		
		clickWebElemntUsingJavascriptExecutor(firstCourtOrderRecord);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked first record of type court order");
		
	}
	/**
	 * Click first record of type court order and get court action id
	 * @author priyanka
	 * @return 
	 * @throws AcisException 
	 */
	public String clickFirstRecordCourtOrderAndGetCourtActionId() throws AcisException {
		logger.info("Clicking first record of type court order");
		waitForPageLoadTill(5);
		String id=firstCourtOrderRecord.getText();
		logger.info("Court Action Id :"+id);
		clickWebElemntUsingJavascriptExecutor(firstCourtOrderRecord);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked first record of type court order");
		return id;
	}
	/**
	 * Click Prepare for Case Closure link
	 * @author priyanka
	 * @throws AcisException 
	 */
	public void clickPrepareforCaseClosure() throws AcisException {
		logger.info("Clicking on Prepare for Case Closure");
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(prepareForCaseClosureLink);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Prepare for Case Closure");
		
	}
	
	/**
	 * Close Court Action Tab
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void closeCourtActionTab() throws AcisException {
		logger.info("Closing Court Action Tab");
		waitForPageLoad();
		waitForPageLoadTill(5);
		if (closeCourtActionButton.isDisplayed()) {
			clickWebElement(closeCourtActionButton);
			waitForPageLoadTill(5);
		}
		logger.info("Closed Court Action Tab");
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(10);
		logger.info("succesfully Closed Court Action Tab");
		
	}
	public void clickRelatedLink() throws AcisException {
		logger.info("Clicking Related Link");
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(related);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked Related Link");
		
	}
	
	public void VerifyPrepopulatedFields(String courtActionId) throws AcisException {
		logger.info("Verifying Assigned To Field");
		verifyTextEquals(assignedTo, "ACIS Investigator");
		logger.info("Verified Assigned To Field");
		logger.info("Verifying Related To Field");
		verifyTextEquals(relatedTo,courtActionId );
		logger.info("Verified Related To Field");
		logger.info("Verifying Status Field");
		verifyTextEquals(status, "Not Started");
		logger.info("Verified Status Field");
		logger.info("Verifying Subject Field");
		verifyTextEquals(subject, "Prepare for Case Closure");
		logger.info("Verified Subject Field");
		logger.info("Verifying Priority Field");
		verifyTextEquals(priority, "Normal");
		logger.info("Verified Priority Field");
		logger.info("Verifying Comments Field");
		verifyTextEquals(comments, "Legal change in custody.");
		logger.info("Verified Comments Field");
		
}
}