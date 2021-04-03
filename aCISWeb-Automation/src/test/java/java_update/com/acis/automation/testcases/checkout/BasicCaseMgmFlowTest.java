package com.acis.automation.testcases.checkout;

import java.io.IOException;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class BasicCaseMgmFlowTest extends TestBase {

	public BasicCaseMgmFlowTest() throws AcisException {
		super();
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
	
	int count= 2;
	@Test(enabled=false,description = "S-0164 Case Management - New Placement Search Criteria Create Placement Resource Account", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 0)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();


			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickNewButton();
			placementResourcePage.selectRadioButton();
			placementResourcePage.setTextOnPlacement("AccountName", excel.generateRandomTestData("Demo", 3));
			placementResourcePage.setPlacementType("RelativeFoster");
			placementResourcePage.setStatus("OnHold");
			placementResourcePage.selectSpecialNeeds("Medically Complex");
			placementResourcePage.setTextOnPlacement("Capacity", testData.get(Constants.PlacementAccount_SHEET).get("capacity"));
			placementResourcePage.setTextOnPlacement("Occupancy", testData.get(Constants.PlacementAccount_SHEET).get("occupancy"));
			placementResourcePage.clickOnSave();
			placementResourcePage.clickRelatedTab();
			placementResourcePage.clickSiteLocationsTab();
			placementResourcePage.clickNewSiteLocations();
			placementResourcePage.setTextOnSite("Street", testData.get(Constants.PlacementAccount_SHEET).get("street"));
			placementResourcePage.checkPrimaryCheckBox();
			placementResourcePage.setTextOnSite("City", testData.get(Constants.PlacementAccount_SHEET).get("city"));
			placementResourcePage.setState(testData.get(Constants.PlacementAccount_SHEET).get("state"));
			placementResourcePage.setTextOnSite("ZipCode", testData.get(Constants.PlacementAccount_SHEET).get("zipCode"));
			placementResourcePage.setTextOnSite("Latitude", testData.get(Constants.PlacementAccount_SHEET).get("latitude"));
			placementResourcePage.setTextOnSite("Longitude", testData.get(Constants.PlacementAccount_SHEET).get("longitude"));
			placementResourcePage.setTextOnSite("LocationName", testData.get(Constants.PlacementAccount_SHEET).get("locationName"));
			providerAgencyAccountPage.clickOnSaveSite();
			count++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0164 Case Management - New Placement Search Criteria Create Placement Resource Account");
		}

	}

	@Test(enabled=false,description = "S-0164 Case Management - New Placement Search Criteria Create Provider Agency Account", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 1)
	public void CreateProviderAccount() throws AcisException, InterruptedException, IOException {
		try {
			if (count==1) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
				homePage_SFDCPage.selectAllAccount();
				homePage_SFDCPage.clickNewButton();
				providerAgencyAccountPage.selectRadioButton();
				providerAgencyAccountPage.setTextOnProvider("AccountName", excel.generateRandomTestData("Demo", 2));
				providerAgencyAccountPage.setProviderAgencyType("LicensedChildPlacementAgency");
				providerAgencyAccountPage.clickOnSave();
				count++;
			}else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0164 Case Management - New Placement Search Criteria Create Provider Agency Account");
		}

	}

	@Test(description = "S-0164 Case Management - New Placement Search Criteria intake creation", groups = { "High",
			"acisRegression", "Dharmesh" }, priority = 2)

	public void OverrideScreeningDecission() throws AcisException, InterruptedException, IOException {
		try {
			if (count==2) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				home.verfiyHomePage();

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.clickNewButton();
				reportDetailsOmniscriptPage.setDate("Intake");
				reportDetailsOmniscriptPage.selectIntakeMethod();
				reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
						"",
						"",
						testData.get(Constants.REPORTDETAILSPAGE).get("role"));
//				testData.get(Constants.REPORTDETAILSPAGE).get("phone")
//				testData.get(Constants.REPORTDETAILSPAGE).get("email")
				reportDetailsOmniscriptPage
						.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
				reportDetailsOmniscriptPage.setDate("Incident");
				reportDetailsOmniscriptPage.clickNextBtn();
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
				searchPerson_OmniscriptPage.linkToCreateNewPerson();

				createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
				createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
				createIntakePerson_OmniscriptPage
						.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
				createIntakePerson_OmniscriptPage
						.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
				createIntakePerson_OmniscriptPage.clickSaveButton();
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
				screeningDecision_OmniscriptPage.selectCaseHead(firstName+" "+middleName);
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
				screeningDecision_OmniscriptPage.clickSubmitbtn();

				allegationID = allegationReportPage.getAllegationID();
				count++;
			}else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0164 Case Management - New Placement Search Criteria intake creation");
		}

	}

	@Test(description = "S-0164 Case Management - New Placement Search Criteria intake approval", groups = { "High",
			"acisRegression", "Dharmesh" }, priority = 3)
	public void OverrideSupervisor() throws AcisException, InterruptedException, IOException {
		try {
			if (count==3) {
				String allegationReportIdNoAfterIsApprove = "";

				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();

				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.clickIntakeBtn();
				reportDetailsOmniscriptPage.clickNextBtn();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.selectAcceptAssign();
				screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
				screeningDecision_OmniscriptPage.clickSubmitbtn();

				allegationReportIdNoAfterIsApprove = allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.verifyingAllegationStatusAfterOveride(allegationReportIdNoAfterIsApprove);
				count++;
			}else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0164 Case Management - New Placement Search Criteria intake approval");
		}

	}

	@Test(description = "S-0164 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 4)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			if (count==4) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
				homePage_SFDCPage.searchRecordAndClick(firstName + " " + middleName + " " + lastName);
				fosterCaseID = caseHeadPage.newFosterCase();
				count++;
			}else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0164 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}


	
	@Test(description = "S-0164 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 5)
	public void FosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
		try {
			if (count==5) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickRelatedTab();
				fosterCareCase_Page.clickPersonTab();
				fosterCareCase_Page.clickNewPerson();
				System.out.println(childFirstName+" "+childMiddleName+" "+childLastName);
				personsInvovled_CP_OmniscriptPage.searchNewPerson(childFirstName);
				personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
				personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
				personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
				personsInvovled_CP_OmniscriptPage.clickSaveButton("next");
				personsInvovled_CP_OmniscriptPage.clickNextButton();
				establishRelationships_CP_OmniScriptPage.clickSubmit();
				count++;
			}else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0164 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}

	@Test(description = "S-0164 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 6)
	public void FosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			if (count==6) {
//				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
//						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
//				home.verfiyHomePage();
//				homePage_SFDCPage.closeTabs();
//				homePage_SFDCPage.clickDownArrowAllegation();
//				homePage_SFDCPage.selectAllAllegation();
//				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
//				fosterCareCase_Page.clickPlacementTab();
//				fosterCareCase_Page.clickNewPlacement();
//				newPlacement_OmniScriptPage.clickDownIconEdit();
//				newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
//				newPlacement_OmniScriptPage.saveButton();
//				newPlacement_OmniScriptPage.selectICPCPlacement("No");
//				newPlacement_OmniScriptPage.selectTypeOfPlacement("Regular Foster");
//				newPlacement_OmniScriptPage.enterZipCode("55555");
//				newPlacement_OmniScriptPage.selectStartDate();
//				newPlacement_OmniScriptPage.clickSearchButton();
//				placementSearchResults_OmniScriptPage.verifyLabels();
//				placementSearchResults_OmniScriptPage.selectFirstRecord();
//				placementSearchResults_OmniScriptPage.clickSubmitButton();
				count++;
			}else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0164 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}
	}

	@Test(description = "S-0164 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 7)
	public void PermanencyEnrollSchoolPlan() throws AcisException, InterruptedException, IOException {
		try {
			if (count==7) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowHome();
				fosterCareHomePage.checkPermanencyLabel();
				permanencyHomePage.verifyLabelsHome();
				permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Obtain Court Order- Court Action Outcome");
				permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
				permanencyHomePage.verifyLabelsHome();
				permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Locate Relatives/Kin");
				permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
				locateRelativesPage.switchToWindow();
				locateRelativesPage.enterInitials("abc");
				locateRelativesPage.clickNextButton();
				personsInvovledPage.clickNextButton();
				establishRelationshipsPage.clickNext();
				createPlacementResourcePage.selectPlacementCreate("Yes");
				createPlacementResourcePage.selectParent(firstName+" "+lastName , "Parent 1");
				createPlacementResourcePage.selectAddressSame();
				createPlacementResourcePage.clickSubmitButton();
				count++;
			}else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0164 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}
	
	@Test(description = "S-0164 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 8)
	public void PermanencyTDMAssessmentPlan() throws AcisException, InterruptedException, IOException {
		try {
			if (count==8) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowHome();
				fosterCareHomePage.checkPermanencyLabel();
				permanencyHomePage.verifyLabelsHome();
				permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Place Child");
				permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
				addMeetingAttendeesPage.switchToWindow();
				newPlacement_OmniScriptPage.selectSpecialNeedsPlan("Medically Complex");
				newPlacement_OmniScriptPage.selectICPCPlacement("No");
				newPlacement_OmniScriptPage.selectTypeOfPlacement("Regular Foster");
				newPlacement_OmniScriptPage.enterZipCode("55555");
				newPlacement_OmniScriptPage.selectStartDate();
				newPlacement_OmniScriptPage.clickSearchButton();
				placementSearchResults_OmniScriptPage.verifyLabels();
				placementSearchResults_OmniScriptPage.selectFirstRecord();
				placementSearchResults_OmniScriptPage.clickSubmitButton();
				reviewEditSendPage.closeWindow();
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowHome();
				fosterCareHomePage.checkPermanencyLabel();
				permanencyHomePage.verifyLabelsHome();
				permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Complete Comprehensive Assessment");
				permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
				newComprehensiveAssessmentpage.switchToWindow();
				newComprehensiveAssessmentpage.enterTextNameTextbox(childFirstName+" "+childLastName);
				newComprehensiveAssessmentpage.clickNextButton();
				newComprehensiveAssessmentpage.clickSubmitButton();
				count++;
			}else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0164 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}
		

	}
	
	@Test(description = "S-0164 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 9)
	public void PermanencyCourtPlan() throws AcisException, InterruptedException, IOException {
		try {
			if (count==9) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowHome();
				fosterCareHomePage.checkPermanencyLabel();
				permanencyHomePage.verifyLabelsHome();
				permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Prepare for Court");
				permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
				newLegalAction_OmniScriptPage.switchToWindow();
				newLegalAction_OmniScriptPage.courtCaseNumber("123245");
				newLegalAction_OmniScriptPage.dateTime("courtCaseActionDateTime");
				newLegalAction_OmniScriptPage.courtActionType("PermanencyGoal");
				newLegalAction_OmniScriptPage.addCourtActionParticipant(childFirstName+" "+childLastName);
				newLegalAction_OmniScriptPage.saveButton();
				newLegalAction_OmniScriptPage.closeWindowsExceptParent();
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowHome();
				fosterCareHomePage.checkPermanencyLabel();
				permanencyHomePage.verifyLabelsHome();
				permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Create Case Plan");
				permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
				permanencyPlan_OmniScriptPage.switchToWindow();
				permanencyPlan_OmniScriptPage.setPermanencyGoalsFor(childFirstName+" "+childLastName);
				permanencyPlan_OmniScriptPage.primaryFirst("reunification");
				permanencyPlan_OmniScriptPage.setPermanencyNarrative("demo");
				permanencyPlan_OmniScriptPage.clickNextButton();
				servicesToTheChildren_OmniScriptPage.clickNextButton();
				serviceAgreementWithParents_OmniScriptPage.clickNextButton();
				visitationPlan_OmniScriptPage.addParentalVisitationPlan("No");
				visitationPlan_OmniScriptPage.addSiblingVisitations("No");
				visitationPlan_OmniScriptPage.clickNext();
				serviceToProviderPage.clickNext();
				serviceToProviderPage.clickSubmit();
				serviceToProviderPage.closeWindowsExceptParent();
				count++;
			}else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0164 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}
	
	@Test(description = "S-0164 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 10)
	public void PermanencyCaseReviewCourtPlan() throws AcisException, InterruptedException, IOException {
		try {
			if (count==10) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowHome();
				fosterCareHomePage.checkPermanencyLabel();
				permanencyHomePage.verifyLabelsHome();
				permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Conduct Case Plan Review");
				permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
				newLegalAction_OmniScriptPage.switchToWindow();

				casePlanReviewPage.clickOnCasePlanReview();
				
				casePlanReviewPage.editingAgenyPlan();
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("PermanencyPlan");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("PermanencyPlan1");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("Placement");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("Placement1");

				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("Health");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("Health1");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("Education");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("Education1");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("MentalHealth");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("MentalHealth1");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("Other");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("other1");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("read");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("read1");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("serviceAgreement");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("serviceAgreement1");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("parentalVisitation");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("parentalVisitation1");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("sibling");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("sibling1");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("serviceProvider");
				casePlanReviewPage.doesNotMeetFllingFamilyAgencyform("serviceProvider1");
				casePlanReviewPage.savingClickingNewCasePlan();
				casePlanReviewPage.closeWindowsExceptParent();
			}else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0164 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}
	

}
