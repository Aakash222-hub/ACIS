package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class SearchPlacementResourceTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(SearchPlacementResourceTest.class);

	public SearchPlacementResourceTest() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	String allegationID, fosterCaseID;

	String firstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
	String middleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
	String lastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);

	String childFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 3);
	String childMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
	String childLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 3);
	int count = 0;

//	@Test(description = "US:0173 Case Management - New Placement Search Criteria Create Placement Resource Account", groups = {
//			"High", "acisRegression", "Dharmesh" }, priority = 0)
//	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {
//		try {
//			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
//					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
//			home.verfiyHomePage();
//
//			homePage_SFDCPage.closeTabs();
//			homePage_SFDCPage.clickDownArrowAccount();
//			homePage_SFDCPage.selectAllAccount();
//			homePage_SFDCPage.clickNewButton();
//			placementResourcePage.selectRadioButton();
//			placementResourcePage.setTextOnPlacement("AccountName", excel.generateRandomTestData("Demo", 3));
//			placementResourcePage.setPlacementType("RelativeFoster");
//			placementResourcePage.setStatus("Licensed");
//			placementResourcePage.selectSpecialNeeds("Medically Complex");
//			placementResourcePage.setTextOnPlacement("Capacity",
//					testData.get(Constants.PlacementAccount_SHEET).get("capacity"));
//			placementResourcePage.setTextOnPlacement("Occupancy",
//					testData.get(Constants.PlacementAccount_SHEET).get("occupancy"));
//			placementResourcePage.clickOnSave();
//			placementResourcePage.clickRelatedTab();
//			placementResourcePage.clickSiteLocationsTab();
//			placementResourcePage.clickNewSiteLocations();
//			placementResourcePage.setTextOnSite("LocationName",
//					testData.get(Constants.PlacementAccount_SHEET).get("locationName"));
//			placementResourcePage.setTextOnSite("Street", testData.get(Constants.PlacementAccount_SHEET).get("street"));
//			placementResourcePage.checkPrimaryCheckBox();
//			placementResourcePage.setTextOnSite("City", testData.get(Constants.PlacementAccount_SHEET).get("city"));
//			placementResourcePage.setState(testData.get(Constants.PlacementAccount_SHEET).get("state"));
//			placementResourcePage.setTextOnSite("ZipCode",
//					testData.get(Constants.PlacementAccount_SHEET).get("zipCode"));
//			placementResourcePage.setTextOnSite("Latitude",
//					testData.get(Constants.PlacementAccount_SHEET).get("latitude"));
//			placementResourcePage.setTextOnSite("Longitude",
//					testData.get(Constants.PlacementAccount_SHEET).get("longitude"));
//			providerAgencyAccountPage.clickOnSaveSite();
//			count++;
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			getStackTrace(e,
//					"Failed US:0173 Case Management - New Placement Search Criteria Create Placement Resource Account");
//
//		}
//
//	}
//
//	@Test(description = "US:0173 Case Management - New Placement Search Criteria Create Provider Agency Account", groups = {
//			"High", "acisRegression", "Dharmesh" }, priority = 1)
//	public void CreateProviderAccount() throws AcisException, InterruptedException, IOException {
//		try {
//			if (count == 1) {
//				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
//						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
//				home.verfiyHomePage();
//
//				homePage_SFDCPage.closeTabs();
//				homePage_SFDCPage.clickDownArrowAccount();
//				homePage_SFDCPage.selectAllAccount();
//				homePage_SFDCPage.clickNewButton();
//				providerAgencyAccountPage.selectRadioButton();
//				providerAgencyAccountPage.setTextOnProvider("AccountName", excel.generateRandomTestData("Demo", 2));
//				providerAgencyAccountPage.setProviderAgencyType("LicensedChildPlacementAgency");
//				providerAgencyAccountPage.clickOnSave();
//				count++;
//			} else {
//				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
//			}
//
//		} catch (Exception e) { // TODO Auto-generated catch block
//			getStackTrace(e,
//					"Failed US:0173 Case Management - New Placement Search Criteria Create Provider Agency Account");
//		}
//
//	}
//
//	@Test(description = "US:0173 Case Management - New Placement Search Criteria intake creation", groups = { "High",
//			"acisRegression", "Dharmesh" }, priority = 2)
//
//	public void OverrideScreeningDecission() throws AcisException, InterruptedException, IOException {
//		try {
//			if (count == 2) {
//				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
//						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
//				home.verfiyHomePage();
//
//				homePage_SFDCPage.closeTabs();
//				homePage_SFDCPage.clickDownArrowAllegation();
//				homePage_SFDCPage.selectAllAllegation();
//				homePage_SFDCPage.clickNewButton();
//				reportDetailsOmniscriptPage.setDate("Intake");
//				reportDetailsOmniscriptPage.selectIntakeMethod();
//				reportDetailsOmniscriptPage.reporterAnonymousNo(
//						testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
//						testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
//						testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
//						testData.get(Constants.REPORTDETAILSPAGE).get("phone"),
//						testData.get(Constants.REPORTDETAILSPAGE).get("email"),
//						testData.get(Constants.REPORTDETAILSPAGE).get("role"));
//				reportDetailsOmniscriptPage
//						.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
//				reportDetailsOmniscriptPage.setDate("Incident");
//				reportDetailsOmniscriptPage.clickNextBtn();
//				searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
//				searchPerson_OmniscriptPage.linkToCreateNewPerson();
//				createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
//				createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
//				createIntakePerson_OmniscriptPage.provideBirthdate(
//						testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
//				createIntakePerson_OmniscriptPage
//						.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
//				createIntakePerson_OmniscriptPage.clickSaveButton();
//				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
//				personsInvovled_OmniscriptPage.clickRefresPersonButton();
//				personsInvovled_OmniscriptPage.clickNextButton();
//				agencyHistory_OmniscriptPage.clickNextButton();
//				structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
//				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
//				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
//				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
//				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
//				structuredDecisionMakingOmniscriptPage.clickNextButton();
//				screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
//				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
//				screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
//				screeningDecision_OmniscriptPage.clickSubmitbtn();
//				allegationID = allegationReportPage.getAllegationID();
//				count++;
//			} else {
//				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
//			}
//
//		} catch (Exception e) { // TODO Auto-generated catch block
//			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria intake creation");
//		}
//
//	}
//
//	@Test(description = "US:0173 Case Management - New Placement Search Criteria intake approval", groups = { "High",
//			"acisRegression", "Dharmesh" }, priority = 3)
//	public void OverrideSupervisor() throws AcisException, InterruptedException, IOException {
//		try {
//			if (count == 3) {
//				String allegationReportIdNoAfterIsApprove = "";
//
//				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
//						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
//				home.verfiyHomePage();
//
//				homePage_SFDCPage.closeTabs();
//				homePage_SFDCPage.clickDownArrowAllegation();
//				homePage_SFDCPage.selectAllAllegation();
//
//				homePage_SFDCPage.searchGlobal(allegationID);
//				allegationReportPage.clickIntakeBtn();
//				reportDetailsOmniscriptPage.clickNextBtn();
//				personsInvovled_OmniscriptPage.clickNextButton();
//				agencyHistory_OmniscriptPage.clickNextButton();
//				structuredDecisionMakingOmniscriptPage.clickNextButton();
//				screeningDecision_OmniscriptPage.selectAcceptAssign();
//				screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
//				screeningDecision_OmniscriptPage.clickSubmitbtn();
//
//				allegationReportIdNoAfterIsApprove = allegationReportPage.verifyingAllegationReportStatus();
//				allegationReportPage.verifyingAllegationStatusAfterOveride(allegationReportIdNoAfterIsApprove);
//				count++;
//			} else {
//				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
//			}
//
//		} catch (Exception e) { // TODO Auto-generated catch block
//			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria intake approval");
//		}
//
//	}

	@Test(description = "US:0173 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Varun" }, priority = 1)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
			homePage_SFDCPage.clickFirstRecord();
//			homePage_SFDCPage.searchRecordAndClick(firstName+" "+middleName+" "+lastName);
			fosterCaseID = caseHeadPage.newFosterCase();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}

	@Test(description = "US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Varun" }, priority = 2)
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
			System.out.println("childFirstName" + childFirstName);
			personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
			personsInvovled_CP_OmniscriptPage.prvoideSuffix("first", "I");
			personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
			personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
			personsInvovled_CP_OmniscriptPage.clickNextButton();
			establishRelationships_CP_OmniScriptPage.clickSubmit();
		

		} catch (Exception e) { // TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person");

		}

	}

	@Test(description = "(US:0559 Case Management - Search should search for Placement Resources (not Person Accounts)", groups = {
			"High", "acisRegression", "Varun" }, priority = 3)
	public void fosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			System.out.println("Username :" + testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"));
			System.out.println("Password :" + testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickPlacementTab();
			fosterCareCase_Page.clickNewPlacement();
			newPlacement_OmniScriptPage.enterTextChildTextbox(childFirstName + " " + childLastName);
			newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
			newPlacement_Pm_OmniScriptPage.selectICPCPlacement("No");
			newPlacement_OmniScriptPage.selectTypeOfPlacement("Relative Foster");
			newPlacement_OmniScriptPage.enterZipCode("90036");
			newPlacement_OmniScriptPage.selectStartDate();
			newPlacement_OmniScriptPage.clickSearchButton();
			newPlacement_Pm_OmniScriptPage.verifyPlacementResoucre();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0559 Case Management - Search should search for Placement Resources (not Person Accounts) ");
		}

	}
	
	@Test(description = "US:0559 Case Management - Search should search for Placement Resources (not Person Accounts)", groups = {
			"High", "acisRegression", "Varun" }, priority = 4)
	
	public void fosterPlacementSearch() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			System.out.println("Username :" + testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"));
			System.out.println("Password :" + testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickRelatedTab();
			fosterCareCase_Page.clickPersonTab();
			newPlacement_Pm_OmniScriptPage.verifyPlacementResoucrefrompersoncontact(childFirstName + " " + childMiddleName + " " + childLastName);
			fosterCareCase_Page.clickNewPlacement();
			newPlacement_Pm_OmniScriptPage.enterCaseActionId();
			newPlacement_Pm_OmniScriptPage.selectSpecialNeeds("Medically Complex");
			newPlacement_Pm_OmniScriptPage.selectICPCPlacement("No");
			newPlacement_Pm_OmniScriptPage.selectTypeOfPlacement("Relative Foster");
			newPlacement_Pm_OmniScriptPage.enterZipCode("90036");
			newPlacement_Pm_OmniScriptPage.selectStartDate();
			newPlacement_Pm_OmniScriptPage.clickSearchButton();
			newPlacement_Pm_OmniScriptPage.verifyPlacementResoucre();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0559 Case Management - Search should search for Placement Resources (not Person Accounts) ");
		}

	}


}
