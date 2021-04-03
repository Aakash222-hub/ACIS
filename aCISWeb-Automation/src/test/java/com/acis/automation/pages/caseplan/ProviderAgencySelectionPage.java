package com.acis.automation.pages.caseplan;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class ProviderAgencySelectionPage extends PageBase {

	public ProviderAgencySelectionPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(ProviderAgencySelectionPage.class);

	
	@FindBy(xpath = "//*[text()='No results found in this zip code']")
	WebElement noZipCodeVerify;

	@FindBy(xpath = "//*[text()='No results can be found']")
	WebElement noStateVerify;
	
	@FindBy(xpath = "//button[text()='Submit']")
	WebElement submitButton;
	
	@FindBy(xpath = "//button[text()='Previous']")
	WebElement previousButton;
	
	@FindBy(xpath = "//h1[text()='Service Referral']")
	WebElement serviceReferralVerify;
	
	@FindBy(xpath = "//div[text()='Service Referral']")
	WebElement serviceReferral;
	
	@FindBy(xpath = "(//span[text()='Select']/preceding-sibling::span)[1]")
	WebElement firstRecordRadioButton;
	
	@FindBy(xpath = "//*[text()='Status']/../..//*[text()='Submitted']")
	WebElement verifySubmitStatus;
	
	
	/***
	 * Verify Error on Provider Agency Selection
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void verifyError(String strText) throws AcisException, InterruptedException {
		switch (strText) {
		case "CityState":
			logger.info("Verfying Error Message : ");
			waitForElement(noStateVerify);
			logger.info("Verfied Error Message : ");
			break;
		case "ZipCode":
			logger.info("Verfying Error Message : No results found in this zip code'");
			waitForElement(noZipCodeVerify);
			logger.info("Verfied Error Message : No results found in this zip code'");
			break;
		default:
			break;
		}

	}
	
	/**
	 * Click Submit button
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickSubmitButton() throws AcisException {
		logger.info("Clicking Submit button");
		Actions action = new Actions(driver);
		action.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		clickWebElement(submitButton);
		logger.info("Clicked Submit button");
		waitForPageLoad();
		waitForPageLoadTill(5);
		waitForElement(serviceReferral);
		logger.info("Successfully Clicked Submit button");
	}
	
	/**
	 * Verify Submitted
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifySubmitted() throws AcisException {
		logger.info("Verify Submitted");
		waitForElement(verifySubmitStatus);
		logger.info("Verified Submitted");
	}
	
	/**
	 * Click Previous button
	 * @author dharmesh.d.krishna
	 * @throws AcisException 
	 */
	public void clickPreviousButton() throws AcisException {
		logger.info("Clicking Previous button");
		clickWebElement(previousButton);
		logger.info("Clicked Previous button");
		waitForElement(serviceReferralVerify);
		
	}

	/**
	 * Select first radio  button of search records
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void selectFirstRecord() throws AcisException {
		logger.info("Selecting first record");
		Actions act = new Actions(driver);
		act.sendKeys(Keys.END).build().perform();
		waitForPageLoadTill(5);
		act.sendKeys(Keys.HOME).build().perform();
		waitForPageLoadTill(5);
		waitForPageLoad();
		act.sendKeys(Keys.PAGE_DOWN).build().perform();
		waitForElement(firstRecordRadioButton);
		clickWebElement(firstRecordRadioButton);
		logger.info("Selected first record");
	}
	
}
