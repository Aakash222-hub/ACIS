package com.acis.automation.pages.Placement;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class EditPlacementPage extends PageBase {

	public EditPlacementPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(EditPlacementPage.class);

	@FindBy(xpath = "//*[text()='Date']/../..//input")
	WebElement startDateTextBox;

	@FindBy(xpath = "//*[text()='Next Month']")
	WebElement nextMonth;

	@FindBy(xpath = "//*[text()='Previous Month']")
	WebElement previousMonth;

	@FindBy(xpath = "//span[text()='15']")
	WebElement dateStartDate;
	
	@FindBy(xpath = "//*[text()='Has child been enrolled in school?']/../..//input")
	WebElement enrolledSchool;
	
	@FindBy(xpath = "//*[text()='Has child been enrolled in school?']/../..//span[@title='Yes']")
	WebElement yes;
	
	@FindBy(xpath = "//button[@title='Save']")
	WebElement save;
	
	/**
	 * Select Date on Edit Placement
	 * 
	 * @author Dharmesh
	 * @throws AcisException
	 */
	public void selectDate() throws AcisException {
		logger.info(" Selecting start date");
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(startDateTextBox);
		waitForPageLoadTill(3);
		clickWebElement(startDateTextBox);
		waitForElement(dateStartDate);
		clickWebElement(dateStartDate);
		logger.info(" Selected start date");

	}
	
	/**
	 * Select Enrolled in School Picklist on Edit Placement
	 * 
	 * @author Dharmesh
	 * @throws AcisException
	 */
	public void setEnrolledSchool(String option) throws AcisException {
		logger.info("Selecting Text:"+option);
		switch (option) {
		case "Yes":
			waitForElement(enrolledSchool);
			scrollingToElementofAPage(enrolledSchool);
			clickWebElement(enrolledSchool);
			waitForElement(yes);
			clickWebElement(yes);
			logger.info("Selected Text:"+option);
			break;
		default:
			break;
		}

	}
	
	/**
	 * Click on Save
	 * 
	 * @author Dharmesh
	 * @throws AcisException
	 */
	public void clickSave() throws AcisException {
		logger.info("Clicking on Save");
		waitForElement(save);
		clickWebElement(save);
		logger.info("Clicked on Save");
		waitForPageLoadTill(5);
		waitForPageLoad();
	
	}
}
