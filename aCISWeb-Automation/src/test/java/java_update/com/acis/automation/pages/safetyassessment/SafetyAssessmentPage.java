package com.acis.automation.pages.safetyassessment;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.pages.intake.PersonsInvovled_OmniscriptPage;
import com.acis.automation.utilities.AcisException;

public class SafetyAssessmentPage extends PageBase {

	public SafetyAssessmentPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PersonsInvovled_OmniscriptPage.class);

	@FindBy(xpath = "//button[text()='Safety Assessment Record']")
	WebElement safetyAssessmentRecordEdit;


	@FindBy(xpath = "//h1[text()='Review Allegation Report']")
	WebElement verifySafetyAssessmentRecord;
	
		
	/***
	 * @author dharmesh
	 * Cick on SafetyAssessmentRecord Edit Button after submitting safety assesment
	 * @throws AcisException 
	 * 
	 */
	public void editButton() throws AcisException {
		
		logger.info("Click on edit Button");
		waitForPageLoadTill(9);
		waitForElement(safetyAssessmentRecordEdit);
		clickWebElemntUsingJavascriptExecutor(safetyAssessmentRecordEdit);
		logger.info("Clicked on edited button");
		waitForPageLoadTill(19);
	}
	
	
	/***
	 * @author dharmesh
	 * Verify SafetyAssessmentRecord Edit Button after submitting safety assesment
	 * @throws AcisException 
	 * 
	 */
	public void verifySafetyAssessmentEdit() throws AcisException {
		
		logger.info("Verified Safety Assessment");
		waitForElement(verifySafetyAssessmentRecord);
		logger.info("Clicked on edited button");
	}
	
	
}
