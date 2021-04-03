package com.acis.automation.testcases.personmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PopUpForAddingPersonOnPersonSearchTest extends TestBase{

	public PopUpForAddingPersonOnPersonSearchTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	final static Logger logger = LoggerFactory.getLogger(PopUpForAddingPersonOnPersonSearchTest.class);
	String AllegationID,maltreator,victim;
	
	String firstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
	String middleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
	String lastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);
	
	@Test(enabled = true, description = "S-944 Pop-up for Adding Person on Person Search Step (Investigation)", groups = { "High",
			"acisRegression", "Pallavi" },priority=0)
	public void IntakeAllegationIDflow() throws AcisException {
		try {
			
				
					userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
							testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
					home.verfiyHomePage();
					
					homePage_SFDCPage.closeTabs();
					homePage_SFDCPage.clickDownArrowCaseActions();
					homePage_SFDCPage.searchInvestigationAndClick("Investigation");
					investigationCasePage.clickInvestigationWorkflow();
					//workflow
					reviewAllegationReport_OmniScriptPage.clickNextButton();
					searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
					searchPerson_OmniscriptPage.linkToCreateNewPerson();

					reviewAllegationReport_OmniScriptPage.setPersonsNames(firstName, middleName, lastName);
					createIntakePerson_OmniscriptPage.clickSaveButton();
					reviewAllegationReport_OmniScriptPage.closeCreateCasePerson();
			
					
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:944 Pop-up for Adding Person on Person Search Step (Investigation)");
		}
	}
	
	
}
