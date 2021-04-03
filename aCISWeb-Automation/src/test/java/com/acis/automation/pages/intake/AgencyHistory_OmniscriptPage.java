package com.acis.automation.pages.intake;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class AgencyHistory_OmniscriptPage extends PageBase {

	public AgencyHistory_OmniscriptPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(AgencyHistory_OmniscriptPage.class);
	
	@FindBy(xpath = "//h1[text()='Structured Decision Making']")
	WebElement structuredDecisionMakingTitle;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton_AgencyHistory;
	
	@FindBy(xpath="//*[text()=' Agency History for Persons identified on the previous step']")
	WebElement textAgencyHostory;
	
	/**
	 * click on Next button
	 * @author mrunal.s.tilekar
	 */
	public void clickNextButton() throws AcisException, InterruptedException {
		logger.info("Clicking on Next button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForElementClickable(nextButton_AgencyHistory);
		scrollingToElementofAPage(nextButton_AgencyHistory);
		clickWebElement(nextButton_AgencyHistory);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Next button");
		waitForElement(structuredDecisionMakingTitle);
		logger.info("Structured Decision Making page loaded");

	}
	
	/**
	 * click on Next button
	 * @author khushboo kumari
	 */
	public void verifyStatus() throws AcisException, InterruptedException {
		logger.info("verifying text on Agent History page");
		waitForElement(textAgencyHostory);
		logger.info("verified text on Agent History page");

	}

}
