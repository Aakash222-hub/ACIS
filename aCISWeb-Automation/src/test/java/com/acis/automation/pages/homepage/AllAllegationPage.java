package com.acis.automation.pages.homepage;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class AllAllegationPage extends PageBase {
	public AllAllegationPage() throws AcisException {
		// TODO Auto-generated constructor stub
	}


	final static Logger logger = LoggerFactory.getLogger(AllAllegationPage.class);

	
	public By abuse = By.xpath("//span[text()='Abuse']");
	
	public By allegationReportID = By.xpath("//span[text()='Allegation Report ID']");
	
	public By dateDue = By.xpath("//span[text()='Date Due']");
	
	public By neglect = By.xpath("//span[text()='Neglect']");
	
	public By intakeDateTime = By.xpath("//span[text()='Intake Date/Time']");
	
	public By sexAbuse = By.xpath("//span[text()='Sex Abuse']");
	
	
	
	/**
	 * Verify : Allegation Report ID exist
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void verifyAllegationReportID() throws AcisException {
		waitForPageLoadTill(7);
		isElementPresent(allegationReportID);
		logger.info("Verifying if Allegation Report ID is Present");
	}
	
	/**
	 * Verify : Intake Date/Time exist
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void verifyIntakeDateTime() throws AcisException {
		isElementPresent(intakeDateTime);
		logger.info("Verifying if Intake Date/Time is Present");
	}
	
	/**
	 * Verify : DateDue exist
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void verifyDateDue() throws AcisException {
		isElementPresent(dateDue);
		logger.info("Verifying if Date Due is Present");
	}
	
	/**
	 * Verify : Abuse exist
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void verifyAbuse() throws AcisException {
		isElementPresent(abuse);
		logger.info("Verifying if Abuse is Present");
	}
	
	/**
	 * Verify : Neglect exist
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void verifyNeglect() throws AcisException {
		isElementPresent(neglect);
		logger.info("Verifying if Neglect is Present");
	}
	
	/**
	 * Verify : Sex Abuse exist
	 * Created By Dharmesh
	 * @throws AcisException 
	 */
	public void verifySexAbuse() throws AcisException {
		isElementPresent(sexAbuse);
		logger.info("Verifying if Sex Abuse is Present");
	}
}
