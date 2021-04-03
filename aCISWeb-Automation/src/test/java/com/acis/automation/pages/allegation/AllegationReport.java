package com.acis.automation.pages.allegation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.pages.personaccount.Addresses;
import com.acis.automation.utilities.AcisException;

public class AllegationReport extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(AllegationReport.class);
	
	public AllegationReport() throws AcisException {
		// TODO Auto-generated constructor stub
	}

			
	@FindBy(xpath = "(//slot/lightning-formatted-text)[1]")
	WebElement allegationID;
	
	
	@FindBy(xpath = "//button[text()='Intake Record']")
	WebElement guidedIntake;
	
	
	@FindBy(xpath = "//button[@title='Edit Freeze Intake']")
	WebElement editFreezeIntake;
	
	
	@FindBy(name = "ACIS_Freeze_Intake__c")
	WebElement freezeIntakeCheck;
	
	@FindBy(xpath = "//button[@title='Save']")
	WebElement save;
	
	
	@FindBy(xpath = "//a[text()='Related']")
	WebElement relatedTab;
	
	@FindBy(xpath = "//a[text()='Details']")
	WebElement detailsTab;
			
	@FindBy(xpath = "(//span[@title='Intake Persons'])[1]")
	WebElement intakePersonsTab;
	
	@FindBy(xpath = "//span[@title='Investigation - Allegation Reports']")
	WebElement investigationTab;
	
	By cannotModify = By.name("//li[contains(text(),'cannot be modified.')]");
	
	//Clicked on Details tab on a Allegation Record
	public void clickDetailsTab() throws AcisException {
		clickWebElement(detailsTab);
		logger.info("Clicked on Details Tab");

	}
	
	//Clicked on Related Tab on a Allegaiton Record
	public void clickRelatedTab() throws AcisException {
		clickWebElement(relatedTab);
		logger.info("Clicked on Related Tab");

	}
	
	//Clicked on Intake Persons Related Tab on Allegation Record
	public void clickIntakePersonsTab() throws AcisException {
		clickWebElement(relatedTab);
		waitForPageLoad();
		clickWebElement(intakePersonsTab);
		logger.info("Clicked on Related Tab");

	}

	//Clicked on Investigation Related Tab on Allegation Record
	public void clickInvestigationTab() throws AcisException {
		clickWebElement(relatedTab);
		waitForPageLoad();
		clickWebElement(investigationTab);
		logger.info("Clicked on Related Tab");

	}
	
	//get AllegationID from an Allegation Record 
	public void getAllegationID() throws AcisException {
		
		logger.info("Getting Allegation ID");
	}
	
	//clicking on Guided Intake Button on an Allegation Record
	public void clickIntakeBtn() throws AcisException {
		clickWebElement(guidedIntake);
		logger.info("Clicked on Guided Intake button");

	}
	
	//Freezing an Intake record on an Allegation Record
	public void freezeIntake() throws AcisException {
		clickWebElement(editFreezeIntake);
		clickWebElement(freezeIntakeCheck);
		clickWebElement(save);
		logger.info("Checked freezeIntake");

	}
	
	//Verifying if an freezed Intake Record gives an error of cannot be modified
	public void verifyCannotModify() throws AcisException {
		isElementPresent(cannotModify);
		logger.info("Verified if cannot modify");
	}
	
}
