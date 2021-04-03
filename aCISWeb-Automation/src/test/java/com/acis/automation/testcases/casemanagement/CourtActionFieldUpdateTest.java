package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class CourtActionFieldUpdateTest extends TestBase {

	public CourtActionFieldUpdateTest() throws AcisException {
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
//			placementResourcePage.setTextOnPlacement("AccountName", "Demo");
//			placementResourcePage.setPlacementType("RelativeFoster");
//			placementResourcePage.setTextOnPlacement("Capacity", "100");
//			placementResourcePage.setTextOnPlacement("Occupancy", "45");
////			placementResourcePage.setTextOnPlacement("MaleAgeMinimum", "3");
////			placementResourcePage.setTextOnPlacement("FemaleAgeMinimum", "2");
////			placementResourcePage.setTextOnPlacement("MaleAgeMaximum", "70");
////			placementResourcePage.setTextOnPlacement("FemaleAgeMaximum", "60");
//			placementResourcePage.setStatus("Applicant");
//			placementResourcePage.selectSpecialNeeds("Medically Complex");
//			placementResourcePage.clickOnSave();
//			placementResourcePage.clickRelatedTab();
//			placementResourcePage.clickSiteLocationsTab();
//			placementResourcePage.clickNewSiteLocations();
//			placementResourcePage.setTextOnSite("LocationName", "Demo Location");
//			placementResourcePage.setTextOnSite("Street", "510 S Burnside Ave");
//			placementResourcePage.checkPrimaryCheckBox();
//			placementResourcePage.setTextOnSite("City", "Los Angeles");
//			placementResourcePage.setState("California");
//			placementResourcePage.setTextOnSite("ZipCode", "90036");
//			placementResourcePage.setTextOnSite("Latitude", "34.0662764");
//			placementResourcePage.setTextOnSite("Longitude", "-118.3501339");
//			providerAgencyAccountPage.clickOnSaveSite();
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			getStackTrace(e,
//					"Failed US:0173 Case Management - New Placement Search Criteria Create Placement Resource Account");
//		}
//
//	}
//
//	@Test(description = "US:0173 Case Management - New Placement Search Criteria Create Provider Agency Account", groups = {
//			"High", "acisRegression", "Dharmesh" }, priority = 1)
//	public void CreateProviderAccount() throws AcisException, InterruptedException, IOException {
//		try {
//			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
//					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
//			home.verfiyHomePage();
//
//			homePage_SFDCPage.closeTabs();
//			homePage_SFDCPage.clickDownArrowAccount();
//			homePage_SFDCPage.selectAllAccount();
//			homePage_SFDCPage.clickNewButton();
//			providerAgencyAccountPage.selectRadioButton();
//			providerAgencyAccountPage.setTextOnProvider("AccountName", "Demo");
//			providerAgencyAccountPage.setProviderAgencyType("LicensedChildPlacementAgency");
//			providerAgencyAccountPage.clickOnSave();
//			
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
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
//			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
//					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
//			home.verfiyHomePage();
//
//			homePage_SFDCPage.closeTabs();
//			homePage_SFDCPage.clickDownArrowAllegation();
//			homePage_SFDCPage.selectAllAllegation();
//			homePage_SFDCPage.clickNewButton();
//			reportDetailsOmniscriptPage.setDate("Intake");
//			reportDetailsOmniscriptPage.selectIntakeMethod();
//			reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
//					testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
//					testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
//					testData.get(Constants.REPORTDETAILSPAGE).get("phone"),
//					testData.get(Constants.REPORTDETAILSPAGE).get("email"),
//					testData.get(Constants.REPORTDETAILSPAGE).get("role"));
//			reportDetailsOmniscriptPage
//					.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
//			reportDetailsOmniscriptPage.setDate("Incident");
//			reportDetailsOmniscriptPage.clickNextBtn();
//			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
//			searchPerson_OmniscriptPage.linkToCreateNewPerson();
//
//			createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
//			createIntakePerson_OmniscriptPage
//					.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
//			createIntakePerson_OmniscriptPage
//					.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
//			createIntakePerson_OmniscriptPage.clickSaveButton();
//			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
//			searchPerson_OmniscriptPage.clickNextBtn();
////			personsInvovled_OmniscriptPage.clickEditRecordButton(firstName);
//			// personsInvovled_OmniscriptPage.clickEditButton("first");
////			personsInvovled_OmniscriptPage.clickPrimaryCaregiver();
////			personsInvovled_OmniscriptPage.clickSaveButton("first");
//			personsInvovled_OmniscriptPage.clickNextButton();
//			structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
//			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
//			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
//			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
//			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
//			structuredDecisionMakingOmniscriptPage.clickNextButton();
//			screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
//			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
//			screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
//			screeningDecision_OmniscriptPage.clickSubmitbtn();
//
//			allegationID = allegationReportPage.getAllegationID();
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria intake creation");
//		}
//
//	}

//	@Test(description = "US:0173 Case Management - New Placement Search Criteria intake approval", groups = { "High",
//			"acisRegression", "Dharmesh" }, priority = 3)
//	public void OverrideSupervisor() throws AcisException, InterruptedException, IOException {
//		try {
//			String allegationReportIdNoAfterIsApprove = "";
//
//			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
//					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
//			home.verfiyHomePage();
//
//			homePage_SFDCPage.closeTabs();
//			homePage_SFDCPage.clickDownArrowAllegation();
//			homePage_SFDCPage.selectAllAllegation();
//
//			homePage_SFDCPage.searchGlobal(allegationID);
//			allegationReportPage.clickIntakeBtn();
//			reportDetailsOmniscriptPage.clickNextBtn();
//			searchPerson_OmniscriptPage.clickNextBtn();
//			personsInvovled_OmniscriptPage.clickNextButton();
//			structuredDecisionMakingOmniscriptPage.clickNextButton();
//			screeningDecision_OmniscriptPage.selectAcceptAssign();
//			screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
//			screeningDecision_OmniscriptPage.clickSubmitbtn();
//
//			allegationReportIdNoAfterIsApprove = allegationReportPage.verifyingAllegationReportStatus();
//			allegationReportPage.verifyingAllegationStatusAfterOveride(allegationReportIdNoAfterIsApprove);
//
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria intake approval");
//		}

//	}

	@Test(description = "US:0173 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 4)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.clickFirstRecord();
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
			"High", "acisRegression", "Dharmesh" }, priority = 5)
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
			personsInvovled_CP_OmniscriptPage.searchNewPerson(childFirstName);
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

	
	@Test(description = "US:0614 Case Management - Adding New Court Action & Verify Court Action Type list box ", groups = {
			"High", "acisRegression", "Varun" }, priority = 6)
	public void CourtActionField() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));			
			System.out.println("Username :"+testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"));		
			System.out.println("Password :"+testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			caseActionPage.clickInsightsTab();
	        fosterCareCase_Page.clickCourtAction();
	        courtActionOutcomesPage.newlegalAction("12345");
	        courtActionOutcomesPage.verifyCourtActionTypelistbox();
	        courtActionOutcomesPage.verifyNextCourtActionTypelistbox();
	        courtActionOutcomesPage.CourtActionSelectType("CourtOrder");
	        courtActionOutcomesPage.addCourtActionParticipant(childFirstName+" "+childMiddleName+" "+childLastName);
//	        courtActionOutcomesPage.addCourtActionParticipant("first middle last");
	        courtActionOutcomesPage.Savebutton();
	              
		}
			
		catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0614 Case Management - Adding New Court Action & Verify Court Action Type list box");
		}
	}
	
	@Test(description = "US:0614 Case Management -Creating New Court Action Outcome", groups = {
			"High", "acisRegression", "Varun" }, priority = 7)
	public void Addparticipant() throws AcisException, InterruptedException, IOException {
		
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			caseActionPage.clickInsightsTab();
			fosterCareCase_Page.clickCourtAction();
	        courtActionOutcomesPage.clickCourtActionId("12345"); 
	        courtActionOutcomesPage.verifyCourtActionlistbox();
	        courtActionOutcomesPage.setlectType("Custody Granted");    
	        courtActionOutcomesPage.setDateandTime();
	        courtActionOutcomesPage.courtActionOutcomeSavebtn();	        	       
		}
		
		catch(Exception e) {
			
			getStackTrace(e,
					"Failed US:0614 Case Management - Creating New Court Action Outcome");
			
		}
	}
	
	@Test(description = "US:0614 Case Management -Verify Error message: Only one Court Action Outcome can be created per Court Action record", groups = {
			"High", "acisRegression", "Varun" }, priority = 8)
	public void verifyErrormessage() throws AcisException, InterruptedException, IOException {
		
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			caseActionPage.clickInsightsTab();
			fosterCareCase_Page.clickCourtAction();
	        courtActionOutcomesPage.clickCourtActionId("12345"); 
	        courtActionOutcomesPage.setlectType("Custody Granted");    
	        courtActionOutcomesPage.setDateandTime();
	        courtActionOutcomesPage.courtActionOutcomeSavebtn();
	        courtActionOutcomesPage.verifyErrormessage();
	        courtActionOutcomesPage.clickonCancel();
	        	       
		}
		
		catch(Exception e) {
			
			getStackTrace(e,
					"Failed US:0614 Case Management - Verify Error message: Only one Court Action Outcome can be created per Court Action record");
			
		}
	}
	
	@Test(description = "US:0614 Case Management -Verify Error message: Only one Court Action Outcome can be created per Court Action record", groups = {
			"High", "acisRegression", "Varun" }, priority = 9)
	public void verifyActiveRemovalEpisodeErrormessage() throws AcisException, InterruptedException, IOException {
		
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));			
			homePage_SFDCPage.closeTabs();
	        homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
	        caseActionPage.clickInsightsTab();
	        fosterCareCase_Page.clickCourtAction();
	        courtActionOutcomesPage.courtActionoutcomespage("12345");
	        courtActionOutcomesPage.setlectType("Custody Granted");    
	        courtActionOutcomesPage.setDateandTime();
	        courtActionOutcomesPage.courtActionOutcomeSavebtn();
	        courtActionOutcomesPage.verifyCourtactionTypemessage();
	        courtActionOutcomesPage.clickonCancel();
	        
	        
	        	       
		}
		
		catch(Exception e) {
			
			getStackTrace(e,
					"Failed US:0614 Case Management - Verify Error message: Only one Court Action Outcome can be created per Court Action record");
			
		}
	}
	
	@Test(description = "US:614 Case Management - Verify the date of Entry", groups = {
			"High", "acisRegression", "Varun" }, priority = 10)
	public void verifyDateofEntry() throws AcisException, InterruptedException, IOException {
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
			courtActionOutcomesPage.verifythedateofEntry();
			
		}
	
	catch(Exception e) {
			
			getStackTrace(e,
					"Failed US:0614 Case Management - Verify the date of Entry");
			
		}
	
}
}
