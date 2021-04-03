package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PlacementSearchUpdates extends TestBase{

	public PlacementSearchUpdates() throws AcisException {
		// TODO Auto-generated constructor stub
	}
	
	String allegationID, fosterCaseID;

	String firstName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
	String middleName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
	String lastName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);
	
	String childFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 3);
	String childMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
	String childLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 3);




	@Test(description = "US:0173 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 0)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
			homePage_SFDCPage.clickFirstRecord();
			fosterCaseID = caseHeadPage.newFosterCase();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}
		@Test(description = "US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
				"High", "acisRegression", "Dharmesh" }, priority = 1)
		public void fosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
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
				personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
				personsInvovled_CP_OmniscriptPage.clickEditButton("first");
				System.out.println("childFirstName"+childFirstName);
				personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
				personsInvovled_CP_OmniscriptPage.prvoideSuffix("first", "I");
				personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
				personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
				personsInvovled_CP_OmniscriptPage.clickNextButton();
				establishRelationships_CP_OmniScriptPage.clickSubmit();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				getStackTrace(e,
						"Failed US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person");
			}
		}

		@Test(description = "US-0732 Case Management -Placement search Update", groups = {
				"High", "acisRegression", "Varun" }, priority = 2)
		public void placementSearchUpdate() throws AcisException, InterruptedException, IOException {
			
			try {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));	
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				caseActionPage.clickInsightsTab();
				fosterCareCase_Page.clickPlacementTab();
				fosterCareCase_Page.clickNewPlacement();
				newPlacement_OmniScriptPage.verifyNewPlacement();
		        newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
		        newPlacement_OmniScriptPage.selectICPCPlacement("No");
		        newPlacement_OmniScriptPage.selectTypeOfPlacement("Relative Foster");
		        newPlacement_OmniScriptPage.enterZipCode("12345");
		        newPlacement_OmniScriptPage.selectStartDate();
		        newPlacement_OmniScriptPage.clickSearchButton();
		        newPlacement_OmniScriptPage.verifyPlacementLink();
			}
			
			catch(Exception e) {
				
				getStackTrace(e,
						"Failed US-0732 Case Management -Placement search Update");
				
			}
		}


		
}
