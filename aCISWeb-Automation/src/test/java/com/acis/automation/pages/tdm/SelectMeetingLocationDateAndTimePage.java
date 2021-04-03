package com.acis.automation.pages.tdm;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class SelectMeetingLocationDateAndTimePage extends PageBase {

	public SelectMeetingLocationDateAndTimePage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(SelectMeetingLocationDateAndTimePage.class);
	
	@FindBy(xpath = "//*[text()='Facilitator']/../../..//input")
	WebElement facilitator;
	
	@FindBy(xpath = "//*[text()='Location']/../../..//input")
	WebElement location;
	
	@FindBy(xpath = "//*[text()='Method']/../../..//input")
	WebElement methodDropdown;
	
	@FindBy(xpath = "(//*[contains(text(),'Teleconference')])")
	WebElement method_Teleconference;
	
	@FindBy(xpath = "(//*[contains(text(),'Video Conference')])")
	WebElement method_VideoConference;
	
	@FindBy(xpath = "(//*[contains(text(),'Face-to-Face')])")
	WebElement method_FaceToFace;
	
	@FindBy(xpath = "//button[@title='Next Month']")
	WebElement nextMonth;
	
	@FindBy(xpath = "//*[text()='17']")
	WebElement date;
	
	@FindBy(xpath = "(//*[contains(text(),'Date/Time')]/../../..//input)[1]")
	WebElement dateTime;
	
	@FindBy(xpath = "//button[text()='Next']")
	WebElement nextButton;
	
	@FindBy(xpath = "//h1[contains(text(),'Review')]")
	WebElement reviewEditSendTitle;
	
	
	
	
	
	
	/**
	 * Owner : Dharmesh Krishna
	 * Description: Set Text on  Select Meeting Location Date And Time Page
	 * @throws AcisException 
	 */
	public void setText(String option,String strText ) throws AcisException {
		logger.info("Set Text on Select Meeting Location Date and Time Page :"+option);
		switch (option) {
		case "location":
			waitForElement(location);
			enterText(location, strText);
			break;
		case "facilitator":
			waitForElement(facilitator);
			enterText(facilitator, strText);
			break;
		default:
			logger.info(option+" TextBox not found");
			break;
		}
		
		logger.info("Set Text on Select Meeting Location Date and Time Page :"+option);	
	}
	
	
	/**
	 * Select  next month date time
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectDateTime() throws AcisException {
		logger.info("Selecting Date Time");
		waitForElement(dateTime);
		clickWebElement(dateTime);
		waitForElement(nextMonth);
		clickWebElement(nextMonth);
		clickWebElement(date);
		waitForPageLoadTill(5);
		logger.info("Date succesfully selected");
	}

	
	/**
	 * Select Method
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectMethod(String methodOption) throws AcisException {
		logger.info("Selecting method");
		waitForElement(methodDropdown);
		
		switch (methodOption) {
		case "Teleconference":
			logger.info("Selecting method : " + methodOption);
			clickWebElement(methodDropdown);
			waitForPageLoadTill(2);
			clickWebElement(method_Teleconference);
			waitForPageLoadTill(5);
			logger.info("Selected method : " + methodOption);
			
			break;
			
		case "VideoConference":
			logger.info("Selecting method : " + methodOption);
			clickWebElement(methodDropdown);
			waitForPageLoadTill(2);
			clickWebElement(method_VideoConference);
			waitForPageLoadTill(5);
			logger.info("Selected method : " + methodOption);
			
			break;
			
		case "FaceToFace":
			logger.info("Selecting method : " + methodOption);
			clickWebElement(methodDropdown);
			waitForPageLoadTill(2);
			clickWebElement(method_FaceToFace);
			waitForPageLoadTill(5);
			logger.info("Selected method : " + methodOption);
			
			break;

		default:
			break;
		}
	}
	
	/**
	 * click next button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickNextButton() throws AcisException {
		logger.info("Clicking on Next button");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.CONTROL).sendKeys(Keys.END).build().perform();
		waitForElementClickable(nextButton);
		scrollingToElementofAPage(nextButton);
		clickWebElement(nextButton);
		waitForPageLoad();
		waitForPageLoadTill(8);
		logger.info("Clicked on Next button");
		waitForElement(reviewEditSendTitle);
		logger.info("Review Edit Send  Page loaded");
	}
}
