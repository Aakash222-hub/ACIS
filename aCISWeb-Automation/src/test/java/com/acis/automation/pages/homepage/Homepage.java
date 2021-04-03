package com.acis.automation.pages.homepage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class Homepage extends PageBase {
	
	final static Logger logger = LoggerFactory.getLogger(Homepage.class);
	
	public Homepage() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	@FindBy(xpath = "(//*[@data-key='chevrondown'])[1]")
	WebElement downArrow;
	
	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Allegation Reports']")
	WebElement downArrowAllegation;
	
	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Home']")
	WebElement downArrowHome;
	
	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Accounts']")
	WebElement downArrowAccount;
	
	@FindBy(xpath = "//span[@class='menuLabel slds-listbox__option-text slds-listbox__option-text_entity' and text()='Case Actions']")
	WebElement downArrowCaseAction;
	
	@FindBy(xpath = "//table/tbody/tr/th/span/a")
	WebElement firstRecord;
	
	@FindBy(xpath = "//input[@title='Search Allegation Reports and more']")
	WebElement globalSearchAllegation;

	@FindBy(xpath = "//mark[contains(text(),\"I-\")]")
	WebElement allegationRecord;
	
	public void clickDownArrowHome() throws AcisException {
		waitForElement(downArrow);
		clickWebElement(downArrow);
		clickWebElement(downArrowHome);
		logger.info("Clicked on Home from DownArrow");

	}
	
	public void clickDownArrowAccount() throws AcisException {
		waitForElement(downArrow);
		clickWebElement(downArrow);
		clickWebElement(downArrowAccount);
		logger.info("Clicked on Account from DownArrow");

	}
	
	public void clickDownArrowAllegation() throws AcisException {
		waitForElement(downArrow);
		clickWebElement(downArrow);
		clickWebElement(downArrowAllegation);
		logger.info("Clicked on Allegation from DownArrow");

	}
	
	public void clickFirstRecord() throws AcisException {
		clickWebElement(firstRecord);
		logger.info("Clicked on first Record from List View");

	}
	
	public void searchGlobal(String strText) throws AcisException {
		waitForElement(downArrow);
		clickWebElement(downArrow);
		clickWebElement(downArrowAllegation);
		enterText(globalSearchAllegation, strText);
		clickWebElement(allegationRecord);
		logger.info("Global Search for Allegation Record");

	}
}
