package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PopupforAddingPersononPersonSearchStepNewPersonTest extends TestBase{

	public PopupforAddingPersononPersonSearchStepNewPersonTest() throws AcisException {
		// TODO Auto-generated constructor stub
	}
	String allegationID, fosterCaseID;
	
	@Test(priority=0,description = "US-0945 : Verify the add a new person in the investigation", groups = { "High",
			"aCIS_Regression", "Varun" })
	public void VerifyInvestigationPageaddNewPerson() throws AcisException, InterruptedException, IOException{
	try {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowCaseActions();
		homePage_SFDCPage.selectMyInvestigation();
		investigationCasePage.clickFirstRecord();
		investigationCasePage.clickCasePersonTab();
		investigationCasePage.clickAddInvestigationPersonButton();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		
		
	}
		catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "US-0945 : Verify the add a new person in the investigation");
		}

}
	
	@Test(priority=1,description = "US-0945 : Verify the add a new person in the investigation", groups = { "High",
			"aCIS_Regression", "Varun" })

	public void UpdatePlacementTypeCreateFosterCreate() throws AcisException, InterruptedException, IOException {

		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
			homePage_SFDCPage.clickFirstRecord();
//		homePage_SFDCPage.searchRecordAndClick(firstName+" "+middleName+" "+lastName);
			fosterCaseID = caseHeadPage.newFosterCase();
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}
	}

	@Test(enabled = true, description = "US-0945 : Verify the add a new person in the Forestcare", groups = { "High",
			"acisRegression", "Akash" }, priority = 2)

	public void UpdatePlacementTypeCreateFosterCreateChild() throws AcisException, InterruptedException, IOException {

		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickRelatedTab();
			fosterCareCase_Page.clickPersonTab();
			fosterCareCase_Page.clickNewPerson();
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			}
		catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "US-0945 :Verify the add a new person in the Forestcare");
		}

}

}
