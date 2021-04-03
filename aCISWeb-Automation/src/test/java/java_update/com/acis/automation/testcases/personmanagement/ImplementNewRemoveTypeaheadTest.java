package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.apache.commons.exec.ExecuteException;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ImplementNewRemoveTypeaheadTest extends TestBase {

	public ImplementNewRemoveTypeaheadTest()throws AcisException {
		// TODO Auto-generated constructor stub
	}

	@Test(priority=0,description = "US-0870 - searched for a person and the person I need to add is not a result in the table ", groups = {
			"Medium", "ACIS_Regression", "Varun" })
	public void SaveForLaterInvestigation() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
    		createIntakePerson_OmniscriptPage.setAllNames("AAA","BBB","CCC");
    		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
    				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
    		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
    				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
    		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
    				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
    		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
    				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
    		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
    		createIntakePerson_OmniscriptPage.clickSaveButton();
//    		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		}
		catch(Exception e) {
			getStackTrace(e, "Failed US-0870:searched for a person and the person I need to add is not a result in the table");	
		}
	}
		@Test(priority=1,description = "US-0870 : Verify the Search Result", groups = { "High",
				"aCIS_Regression", "Varun" })
		public void ReviewAllegationReportSearch() throws AcisException, InterruptedException, IOException{
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseActions();
			homePage_SFDCPage.selectMyInvestigation();
			investigationCasePage.clickFirstRecord();
			investigationCasePage.clickRelatedTab();
            investigationCasePage.clickAssessmentsTab();
            investigationCasePage.clickNewSafetyAssessmentButton();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName","AAA");
			searchPerson_OmniscriptPage.SearchResult("AAA");
			searchPerson_OmniscriptPage.SearchPersonAndAdd();
			}
			
							 catch (Exception e) {
							// TODO Auto-generated catch block
							getStackTrace(e, "Failed US-0870:Verify the Search Result");
						}
		}
}
