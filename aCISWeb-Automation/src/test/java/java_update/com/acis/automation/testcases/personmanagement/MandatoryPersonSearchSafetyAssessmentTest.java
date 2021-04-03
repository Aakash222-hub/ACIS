package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class MandatoryPersonSearchSafetyAssessmentTest extends TestBase{
	
	final static Logger logger = LoggerFactory.getLogger(MandatoryPersonSearchSafetyAssessmentTest.class);
	public MandatoryPersonSearchSafetyAssessmentTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/*Invalid Test script due to changes*/
	
	
	//Adding data
	@Test(enabled = false,description = "US-316:Part 1 Mandatory Person Search before creating a new Person Record-Safety Assessment", groups = { "Medium", "ACIS_Regression", "Akash" })
	  public void mandatorySearchforexistingPersons() throws AcisException, InterruptedException, IOException {
	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
			testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
	home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		
		mandatoryPersonSearchSafetyAssesmentPage.navigatingToNewSafetyAssessmentPage();
		
		
		reviewAllegationReport_OmniScriptPage.clickCreateAddButton();
		reviewAllegationReport_OmniScriptPage.verifyPersonData("first");
	    logger.info("Searched performed Successfully");

	}
	
	@Test(enabled = false,description = "US-316:Part 1 Mandatory Person Search before creating a new Person Record-Safety Assessment", groups = { "Medium", "ACIS_Regression", "Akash" })
	  public void mandatorySearchNonExixtingPerson() throws AcisException, InterruptedException, IOException {
	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
			testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
	home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		
		mandatoryPersonSearchSafetyAssesmentPage.navigatingToNewSafetyAssessmentPage();
		
		
		reviewAllegationReport_OmniScriptPage.clickCreateAddButton();
		reviewAllegationReport_OmniScriptPage.searchNewPerson(testData.get(Constants.PersonInvolvedIntake_SHEET).get("newPerson"));
	    logger.info("Searched person not present , Therefore we can add person by  using New Button");

	}
	
	}
