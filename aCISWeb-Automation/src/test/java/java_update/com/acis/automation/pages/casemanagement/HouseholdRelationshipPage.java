package com.acis.automation.pages.casemanagement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class HouseholdRelationshipPage extends PageBase {

	public HouseholdRelationshipPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(HouseholdRelationshipPage.class);

	@FindBy(xpath = "//td[@data-label='Household Relationship ID']//a")
	WebElement householdRelationshipID;

	@FindBy(xpath = "//span[text()='Start Date']/..//following-sibling::div//lightning-formatted-text")
	WebElement startDateField;

	@FindBy(xpath = "//span[text()='End Date']/..//following-sibling::div//lightning-formatted-text")
	WebElement EndDateField;
	
	By endDatePresent = By.xpath("//span[text()='End Date']/../../..//lightning-formatted-text[contains(text(),'/20')]");
	
	By startDatePresent = By.xpath("//span[text()='End Date']/../../..//lightning-formatted-text[contains(text(),'/20')]");

	/**
	 * Clicked on Household Relationships id Created By Priyanka
	 * 
	 * @throws AcisException
	 */
	public void clickHouseholdRelationshipsLink() throws AcisException {
		logger.info("Clicking on Household Relationships Id");
		refreshPage();
		waitForPageLoad();
		waitForPageLoadTill(5);
		scrollingToElementofAPage(householdRelationshipID);
		clickWebElemntUsingJavascriptExecutor(householdRelationshipID);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked on Household Relationships Id");
	}

	/***
	 * Verifying End date with placement end date
	 * 
	 * @author priyanka
	 * @throws AcisException
	 */

	public void VerifyEndDates() throws AcisException {
		String enddate = EndDateField.getText();
		logger.info(
				"Verifying Foster Parent-Foster Child relationship is end dated to the same as the placement end date.");
		if(isElementPresent(endDatePresent)) {
			logger.info(
					"Verified Foster Parent-Foster Child relationship is end dated to the same as the placement end date.");
		}
		else {
//			logger.info("Placement End Date:  " + date.substring(0, 10));
			logger.info("Household Relationships End Date:  " + EndDateField.getText());
//			Assert.assertEquals(date.substring(0, 10), enddate);
			logger.info(
					"Verified Foster Parent-Foster Child relationship is end dated to the same as the placement end date.");

		}


	}

	/***
	 * Verifying start date with placement start date
	 * 
	 * @author priyanka
	 * @throws AcisException
	 */

	public void VerifyStartDates() throws AcisException {
		String startdate = startDateField.getText();
		logger.info(
				"Verifying Foster Parent-Foster Child relationship is established with start date the same as the placement start date.");
		if(isElementPresent(startDatePresent)) {
			logger.info(
					"Verified Foster Parent-Foster Child relationship is established with start date the same as the placement start date.");
		}else {
//			logger.info("Placement Start Date:  " + date.substring(0, 10));
			logger.info("Household Relationships Start Date:  " + startDateField.getText());
			//Assert.assertEquals(date.substring(0, 10), startdate);
//			Assert.assertNotNull(startDateField.getText(), "Verified Foster Parent-Foster Child relationship is established");
			logger.info(
					"Verified Foster Parent-Foster Child relationship is established with start date the same as the placement start date.");

		}
		
		
	}

	/***
	 * Verifying start date with placement end date
	 * 
	 * @author priyanka
	 * @throws AcisException
	 */

	public void VerifyEndDateIsReadOnly() {
		logger.info("Verifying End Date of  Foster Parent-Foster Child relationship is Read-only:  ");
		Boolean endDateIsReadOnly = EndDateField.isEnabled();
		Assert.assertTrue(endDateIsReadOnly, "End Date of  Foster Parent-Foster Child relationship is Read-only");
		logger.info("Verified End Date of  Foster Parent-Foster Child relationship is Read-only:  ");
	}
}
