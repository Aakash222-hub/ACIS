package com.acis.automation.pages.casemanagement;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

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

public class CustomButtonVisibilityPage extends PageBase {

	public CustomButtonVisibilityPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(CustomButtonVisibilityPage.class);

	@FindBy(xpath = "//div[text()='New Placement']")
	WebElement newPlacementLink;

	@FindBy(xpath = "(//span[text()='You are not allowed to perform this operation.'])[1]")
	WebElement verifyError;

	@FindBy(xpath = "//div[text()='New Court Action']")
	WebElement newCourtActionLink;

	@FindBy(xpath = "//div[text()='New Case Plan']")
	WebElement newCasePlanLink;

	@FindBy(xpath = "//div[text()='New Service Referral']")
	WebElement newServiceReferralLink;

	@FindBy(xpath = "//div[text()='New Family Needs Assessment']")
	WebElement newFamilyNeedAssessment;
	

	/**
	 * Verify Error for new placement
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void newPlacementError() throws AcisException {
		logger.info("Verifying new placement Error");
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,300)");
		waitForElementClickable(newPlacementLink);
		clickWebElemntUsingJavascriptExecutor(newPlacementLink);
		waitForPageLoadTill(5);
		//verifyElementNotPresent(verifyError);
		verifyTextEquals(verifyError, "You are not allowed to perform this operation.");
		logger.info("Verified new placement erro");
	

	}
	
	/**
	 * Verify Error for new court Action
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void newCourtActionError() throws AcisException {
		logger.info("Verifying new placement Error");
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,100)");
		waitForPageLoadTill(9);
		waitForElementClickable(newCourtActionLink);
		logger.info("Clicked on new court action link");
		clickWebElemntUsingJavascriptExecutor(newCourtActionLink);
		waitForPageLoadTill(5);
		verifyTextEquals(verifyError, "You are not allowed to perform this operation.");
		logger.info("Verified new court erro");
	

	}
	/**
	 * Verify Error for new case plan error
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void newCasePlanError() throws AcisException {
		logger.info("Verifying new placement Error");
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,100)");
		waitForPageLoadTill(9);
		waitForElementClickable(newCasePlanLink);
		clickWebElemntUsingJavascriptExecutor(newCasePlanLink);
		logger.info("Clicked on new case plan link");
		waitForPageLoadTill(5);
		verifyTextEquals(verifyError, "You are not allowed to perform this operation.");
		logger.info("Verified new court erro");
	

	}
	
	/**
	 * Verify Error for new service referral plan error
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void newServiceReferral() throws AcisException {
		logger.info("Verifying new placement Error");
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,100)");
		waitForPageLoadTill(9);
		waitForElementClickable(newServiceReferralLink);
		logger.info("Clicking on new case service link");
		clickWebElemntUsingJavascriptExecutor(newServiceReferralLink);
		waitForPageLoadTill(5);
		verifyTextEquals(verifyError, "You are not allowed to perform this operation.");
		logger.info("Verified new court erro");
	

	}
	
	
	
	
	/**
	 * Verify Error for new service referral plan error
	 * 
	 * @author akash.a.gaurav
	 * @throws AcisException
	 */
	public void newSafetyAssessment() throws AcisException {
		logger.info("Verifying new placement Error");
		waitForPageLoadTill(9);
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		waitForPageLoadTill(9);
		jse.executeScript("window.scrollBy(0,100)");
		waitForPageLoadTill(9);
		waitForElementClickable(newServiceReferralLink);
		logger.info("Clicking on new case service link");
		clickWebElemntUsingJavascriptExecutor(newServiceReferralLink);
		waitForPageLoadTill(5);
		verifyTextEquals(verifyError, "You are not allowed to perform this operation.");
		logger.info("Verified new court erro");
	

	}
}
