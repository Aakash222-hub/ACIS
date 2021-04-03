package com.acis.automation.testcases.investigation;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class AddPersonsTest extends TestBase{
	
	final static Logger logger = LoggerFactory.getLogger(AddPersonsTest.class);

	public AddPersonsTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String investigationID;
	// Adding data
	@Test(priority=1,description = "US-0103:Investigation - Add Person(s) for Exisiting Person", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void getInvestigationID() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseActions();
			homePage_SFDCPage.selectMyInvestigation();
			investigationCasePage.clickFirstRecord();
			investigationID=investigationCasePage.getInvestigationID();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0103:Investigation - Add Person(s) for Exisiting Person");

		}
	}

	@Test(priority=2,description = "US-0103:Investigation - Add Person(s) for Exisiting Person", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void AddPersonInvestigationExisting() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
//			homePage_SFDCPage.clickDownArrowCaseActions();
//			homePage_SFDCPage.selectMyInvestigation();
//			investigationCasePage.clickFirstRecord();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(investigationID);
			investigationCasePage.clickInvestigationWorkflow();
			reviewAllegationReport_OmniScriptPage.clickCreateAddButton();
			reviewAllegationReport_OmniScriptPage.verifyExisitingPerson("first");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0103:Investigation - Add Person(s) for Exisiting Person");

		}
	}
	
	@Test(priority=3,description = "US-0103:Investigation - Add Person(s) to Add New Person", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void AddPersonInvestigationAddNew() throws AcisException {

		try {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
//			homePage_SFDCPage.clickDownArrowCaseActions();
//			homePage_SFDCPage.selectMyInvestigation();
//			investigationCasePage.clickFirstRecord();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(investigationID);
			investigationCasePage.clickInvestigationWorkflow();
			reviewAllegationReport_OmniScriptPage.clickCreateAddButton();
			reviewAllegationReport_OmniScriptPage.searchNewPerson("sadsafwqwqqw2");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0103:Investigation - Add Person(s) to Add New Person");

		}

	}
	
	@Test(priority=4,description = "US-0103:Investigation - Add Person(s) without Role", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void AddPersonInvestigationWithoutRole() throws AcisException {

		try {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
//			homePage_SFDCPage.clickDownArrowCaseActions();
//			homePage_SFDCPage.selectMyInvestigation();
//			investigationCasePage.clickFirstRecord();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(investigationID);
			investigationCasePage.clickInvestigationWorkflow();
			reviewAllegationReport_OmniScriptPage.clickCreateAddButton();
			reviewAllegationReport_OmniScriptPage.clickEditButton("next");
			reviewAllegationReport_OmniScriptPage.setAllNames(testData.get(Constants.PersonInvovledAllData).get("thirdPersonFirstName"),
					testData.get(Constants.PersonInvovledAllData).get("thirdPersonMiddleName"),
					testData.get(Constants.PersonInvovledAllData).get("thirdPersonLastName"));
			reviewAllegationReport_OmniScriptPage.clickSaveButton("next");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0103:Investigation - Add Person(s) without Role");

		}

	}

}
