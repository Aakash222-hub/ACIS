package com.acis.automation.pages.homepage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class AllAllegation extends PageBase {
	public AllAllegation() throws AcisException {
		// TODO Auto-generated constructor stub
	}


	final static Logger logger = LoggerFactory.getLogger(AllAllegation.class);

	@FindBy(xpath = "//a[@title='Select List View']")
	WebElement listView;
	
	@FindBy(xpath = "//span[normalize-space(.)='All Allegations']")
	WebElement allAllegation;
	
	public By abuse = By.xpath("//span[text()='Abuse']");
	
	public By allegationReportID = By.xpath("//span[text()='Allegation Report ID']");
	
	public By dateDue = By.xpath("//span[text()='Date Due']");
	
	public By neglect = By.xpath("//span[text()='Neglect']");
	
	public By intakeDateTime = By.xpath("//span[text()='Intake Date/Time']");
	
	public By sexAbuse = By.xpath("//span[text()='Sex Abuse']");
	
	
	
	public void selectAllAllegation() throws AcisException {
		clickWebElement(listView);
		waitForElement(allAllegation);
		clickWebElement(allAllegation);
		logger.info("Selected All Allegation from Select List View");
	}
	
	public void verifyAllegationReportID() throws AcisException {
		isElementPresent(allegationReportID);
		logger.info("Verifying if Allegation Report ID is Present");
	}
	
	public void verifyIntakeDateTime() throws AcisException {
		isElementPresent(intakeDateTime);
		logger.info("Verifying if Intake Date/Time is Present");
	}
	
	public void verifyDateDue() throws AcisException {
		isElementPresent(dateDue);
		logger.info("Verifying if Date Due is Present");
	}
	
	public void verifyAbuse() throws AcisException {
		isElementPresent(abuse);
		logger.info("Verifying if Abuse is Present");
	}
	
	public void verifyNeglect() throws AcisException {
		isElementPresent(neglect);
		logger.info("Verifying if Neglect is Present");
	}
	
	public void verifySexAbuse() throws AcisException {
		isElementPresent(sexAbuse);
		logger.info("Verifying if Sex Abuse is Present");
	}
}
