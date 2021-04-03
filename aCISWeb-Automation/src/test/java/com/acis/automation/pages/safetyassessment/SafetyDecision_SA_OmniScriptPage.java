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
import com.acis.automation.utilities.AcisException;

public class SafetyDecision_SA_OmniScriptPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(SafetyScale_SA_OmniScriptPage.class);

	public SafetyDecision_SA_OmniScriptPage() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "//span[text()='Safety Recommendation']/../../..//input")
	WebElement safetyRecommendations;

	@FindBy(xpath = "//span[text()='Safety Assessment Status']/../../..//input")
	WebElement safetyAssessmentStatus;

	@FindBy(xpath = "//span[text()='Safety Decision']/../../..//input")
	WebElement safetyDecisions;

	@FindBy(xpath = "(//span[text()='Safe'])[2]")
	WebElement safe;
	
	@FindBy(xpath="(//span[text()='Safe'])[1]")
	WebElement safe1;

	@FindBy(xpath = "//input[@data-value='Approved']")
	WebElement approve;

	@FindBy(xpath = "//input[@data-value='Override']")
	WebElement overrideSelection;

	@FindBy(xpath = "//span[text()='Screening Recommendation']/../../..//div[text()='required']")
	WebElement screeningRecommendationRequired;

	public By screeningRecommendationRequiredBy = By
			.xpath("//span[text()='Screening Recommendation']/../../..//div[text()='required']");

	public By workerCommentsRequiredBy = By.xpath("//*[text()='Worker Comments']/../..//div[text()='required']");

	@FindBy(xpath = "//label[text()='Worker Comments']/../../..//textarea")
	WebElement workerComments;

	@FindBy(xpath = "//label[text()='Safety Plan']/../../..//textarea")
	WebElement safetyPlanComments;

	@FindBy(xpath = "//*[text()='Worker Comments']/../..//div[text()='required']")
	WebElement workerCommentsRequired;

	@FindBy(xpath = "//span[text()='Recommend to Associate Allegation Report to Case']/../../..//input")
	WebElement workerCaseCreation;

	@FindBy(xpath = "//button[text()='Save']")
	WebElement save;

	@FindBy(xpath = "//span[text()='Screen Out']")
	WebElement screenOut;

	@FindBy(xpath = "(//span[text()='Unsafe'])[1]")
	WebElement Unsafe;

	@FindBy(xpath = "(//span[text()='Conditionally Safe'])[1]") // Conditionally
																													// Safe
	WebElement ConditionallySafe;

	@FindBy(xpath = "//label[text()='Supervisory Comments']/../../..//textarea")
	WebElement supervisoryComment;

	// Mrunal
	@FindBy(xpath = "//*[contains(text(),'Safety Insights')]")
	WebElement safetyInsightsTitle;

	@FindBy(xpath = "//*[contains(text(),'Safety Insights')]/..//*[contains(text(),'Insights')]")
	WebElement InsightsTitle;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitButton;


	/**
	 * @author akash.a.gaurav
	 * @param safety
	 * @throws AcisException
	 * 
	 *                       This method selects diff options in safety
	 *                       recommendation
	 */
	public void selectSafetyRecommendation(String safety) throws AcisException {
		waitForPageLoad();
		waitForPageLoadTill(5);
		clickWebElement(safetyRecommendations);
		waitForPageLoadTill(13);
		switch (safety) {
		case "safe":
			
			try {
				waitForElement(safe1);
		
				clickWebElement(safe1);
			} catch (AcisException e) {
				clickWebElement(safe);
			}
			logger.info("Safety Recommendation is: " + safety);
			break;
		case "Unsafe":
			waitForElement(Unsafe);
			clickWebElement(Unsafe);
			logger.info("Safety Recommendation is: " + safety);
			break;
		case "ConditionallySafe":
			waitForElement(ConditionallySafe);
			clickWebElement(ConditionallySafe);
			logger.info("Safety Recommendation is: " + safety);
			break;
		default:
			logger.info("Safety Recommendation not found: " + safety);

		}
	}

	/***
	 * Entering text in the worker comment and safety plan comment
	 * 
	 * @param textFieldName
	 * @param strValue
	 * @throws AcisException
	 * @author akash.a.gaurav
	 */
	public void enterTextFieldValue(String textFieldName, String strValue) throws AcisException {
		switch (textFieldName) {
		case "workerComments":
			enterText(workerComments, strValue);
			waitForPageLoadTill(5);
			logger.info("Worker Comment entered as: " + strValue);
			break;

		case "safetyPlanComments":
			enterText(safetyPlanComments, strValue);
			waitForPageLoadTill(5);
			logger.info("Safety Plan Comment entered as: " + strValue);
			break;
		case "supervisory comments":
			enterText(supervisoryComment, strValue);
			waitForPageLoadTill(5);
			logger.info("Supervisory Comment entered as: " + strValue);
			break;
		}
		waitForPageLoadTill(5);
	}

	/**
	 * @author akash.a.gaurav
	 * @param safetyStatus
	 * @throws AcisException
	 * 
	 *                       This method selects diff options in safety assessment
	 *                       status
	 */
	public void selectSafetyAssessmentStatus(String safetyStatus) throws AcisException {
		clickWebElement(safetyAssessmentStatus);
		waitForPageLoadTill(5);
		switch (safetyStatus) {
		case "approve":
			waitForElement(approve);
			clickWebElement(approve);
			logger.info("Safety  Assessment status is: " + safetyStatus);
			break;
		case "override":
			waitForElement(overrideSelection);
			clickWebElement(overrideSelection);
			logger.info("Safety Assessment status is: " + safetyStatus);
			break;

		}
	}

	/**
	 * @author akash.a.gaurav
	 * @param safety
	 * @throws AcisException
	 * 
	 *                       This method selects different options in safety
	 *                       decissions
	 */
	public void safetyDecissions(String safetydecission) throws AcisException {
		clickWebElement(safetyDecisions);
		waitForPageLoadTill(5);
		switch (safetydecission) {
		case "safe":
			waitForElement(safe);
			clickWebElement(safe);
			logger.info("Safety Decission  is: " + safetydecission);
			break;
		case "Unsafe":
			waitForElement(Unsafe);
			clickWebElement(Unsafe);
			logger.info("Safety Decission   is: " + safetydecission);
			break;

		}
	}

	/**
	 * Verify Insights Section
	 * 
	 * @author mrunal.s.tilekar
	 */
	public void verifyInsightsSection() {
		logger.info("Verifying  Insights Section");
		waitForPageLoad();
		waitForPageLoadTill(5);
		Assert.assertTrue(safetyInsightsTitle.isDisplayed(), "Error: Insights section is not displayed");
		logger.info("Verified Insights Section");

	}
/***
 * submitting safety assessment
 * @author akash.a.gaurav
 * @throws AcisException 
 */
	
	public void submitSafetyAssesment() throws AcisException {

		Actions actions = new Actions(driver);
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,940)");
		waitForPageLoadTill(9);
		clickWebElement(submitButton);
		waitForPageLoadTill(9);
	}
}
