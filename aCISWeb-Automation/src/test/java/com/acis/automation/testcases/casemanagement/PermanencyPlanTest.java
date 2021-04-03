package com.acis.automation.testcases.casemanagement;

import java.io.IOException;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PermanencyPlanTest extends TestBase {

	public PermanencyPlanTest() throws AcisException {
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
	int count= 0;
	@Test(description = "US:0173 Case Management - New Placement Search Criteria Create Placement Resource Account", groups = {
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
			placementResourcePage.setTextOnSite("LocationName", testData.get(Constants.PlacementAccount_SHEET).get("locationName"));
			placementResourcePage.setTextOnSite("Street", testData.get(Constants.PlacementAccount_SHEET).get("street"));
			placementResourcePage.checkPrimaryCheckBox();
			placementResourcePage.setTextOnSite("City", testData.get(Constants.PlacementAccount_SHEET).get("city"));
			placementResourcePage.setState(testData.get(Constants.PlacementAccount_SHEET).get("state"));
			placementResourcePage.setTextOnSite("ZipCode", testData.get(Constants.PlacementAccount_SHEET).get("zipCode"));
			placementResourcePage.setTextOnSite("Latitude", testData.get(Constants.PlacementAccount_SHEET).get("latitude"));
			placementResourcePage.setTextOnSite("Longitude", testData.get(Constants.PlacementAccount_SHEET).get("longitude"));
			providerAgencyAccountPage.clickOnSaveSite();
			count++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0173 Case Management - New Placement Search Criteria Create Placement Resource Account");
		}

	}

	@Test(description = "US:0173 Case Management - New Placement Search Criteria Create Provider Agency Account", groups = {
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
					"Failed US:0173 Case Management - New Placement Search Criteria Create Provider Agency Account");
		}

	}

	@Test(description = "US:0173 Case Management - New Placement Search Criteria intake creation", groups = { "High",
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
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
				screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
				screeningDecision_OmniscriptPage.clickSubmitbtn();

				allegationID = allegationReportPage.getAllegationID();
				count++;
			}else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria intake creation");
		}

	}

	@Test(description = "US:0173 Case Management - New Placement Search Criteria intake approval", groups = { "High",
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
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria intake approval");
		}

	}

	@Test(description = "US:0173 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
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
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}

	@Test(description = "US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
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
				personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
				personsInvovled_CP_OmniscriptPage.searchNewPerson(childFirstName+" "+childMiddleName+" "+childLastName);
				personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
				personsInvovled_CP_OmniscriptPage.prvoideSuffix("first", "I");
				personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
				personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
				personsInvovled_CP_OmniscriptPage.clickNextButton();
				establishRelationships_CP_OmniScriptPage.clickSubmit();
				count++;
			}else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}

	@Test(description = "US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 6)
	public void FosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			if (count==6) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickPlacementTab();
				fosterCareCase_Page.clickNewPlacement();
				newPlacement_OmniScriptPage.enterTextChildTextbox(childFirstName + " " + childLastName);
				newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
				newPlacement_OmniScriptPage.selectICPCPlacement("No");
				newPlacement_OmniScriptPage.selectTypeOfPlacement("Relative Foster");
				newPlacement_OmniScriptPage.enterZipCode("90036");
				newPlacement_OmniScriptPage.selectStartDate();
				newPlacement_OmniScriptPage.clickSearchButton();
				placementSearchResults_OmniScriptPage.verifyLabels();
				placementSearchResults_OmniScriptPage.selectFirstRecord();
				placementSearchResults_OmniScriptPage.clickSubmitButton();
				count++;
			}else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}

	@Test(description = "US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
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
				permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
				newCollateralPage.selectDate();
				newCollateralPage.setText("CollateralName", "Demo");
				newCollateralPage.setSubtype("medical");
				newCollateralPage.setText("Narrative", "Demo");
				newCollateralPage.setText("ProfessionalOpinion", "Demo");
				newCollateralPage.clickSave();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowHome();
				fosterCareHomePage.checkPermanencyLabel();
				permanencyHomePage.verifyLabelsHome();
				permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Enroll in School");
				permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
				editPlacementPage.selectDate();
				editPlacementPage.setEnrolledSchool("Yes");
				editPlacementPage.clickSave();
				fosterCareHomePage.checkPermanencyLabel();
				count++;
			}else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}
	
	@Test(description = "US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
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
				permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Hold TDM");
				permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
				addMeetingAttendeesPage.switchToWindow();
				addMeetingAttendeesPage.setMeetingType("TDM");
				addMeetingAttendeesPage.clickNextButton();
				selectMeetingLocationDateAndTimePage.setText("location", "Demo");
				selectMeetingLocationDateAndTimePage.selectDateTime();
				selectMeetingLocationDateAndTimePage.clickNextButton();
				reviewEditSendPage.clickSubmitButton();
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
					"Failed US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}
		

	}
	
	@Test(description = "US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
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
				newLegalAction_OmniScriptPage.addCourtActionParticipant(childFirstName+" "+childMiddleName+" "+childLastName);
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
				serviceToProviderPage.clickSubmit();
				serviceToProviderPage.closeWindowsExceptParent();
				count++;
			}else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}
	
	@Test(description = "US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
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
				casePlanReviewPage.fillingFamilyAgencyform("PermanencyPlan");
				casePlanReviewPage.fillingFamilyAgencyform("PermanencyPlan1");
				casePlanReviewPage.fillingFamilyAgencyform("Placement");
				casePlanReviewPage.fillingFamilyAgencyform("Placement1");

				casePlanReviewPage.fillingFamilyAgencyform("Health");
				casePlanReviewPage.fillingFamilyAgencyform("Health1");
				casePlanReviewPage.fillingFamilyAgencyform("Education");
				casePlanReviewPage.fillingFamilyAgencyform("Education1");
				casePlanReviewPage.fillingFamilyAgencyform("MentalHealth");
				casePlanReviewPage.fillingFamilyAgencyform("MentalHealth1");
				casePlanReviewPage.fillingFamilyAgencyform("Other");
				casePlanReviewPage.fillingFamilyAgencyform("other1");
				casePlanReviewPage.fillingFamilyAgencyform("read");
				casePlanReviewPage.fillingFamilyAgencyform("read1");
				casePlanReviewPage.fillingFamilyAgencyform("serviceAgreement");
				casePlanReviewPage.fillingFamilyAgencyform("serviceAgreement1");
				casePlanReviewPage.fillingFamilyAgencyform("parentalVisitation");
				casePlanReviewPage.fillingFamilyAgencyform("parentalVisitation1");
				casePlanReviewPage.fillingFamilyAgencyform("sibling");
				casePlanReviewPage.fillingFamilyAgencyform("sibling1");
				casePlanReviewPage.fillingFamilyAgencyform("serviceProvider");
				casePlanReviewPage.fillingFamilyAgencyform("serviceProvider1");
				casePlanReviewPage.savingClickingNewCasePlan();
				casePlanReviewPage.closeWindowsExceptParent();
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
				newLegalAction_OmniScriptPage.addCourtActionParticipant(childFirstName+" "+childMiddleName+" "+childLastName);
				newLegalAction_OmniScriptPage.saveButton();
				newLegalAction_OmniScriptPage.closeWindowsExceptParent();
				count++;
			}else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}
	
	@Test(description = "US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 11)
	public void PermanencyCasePlanFinalPlan() throws AcisException, InterruptedException, IOException {
		try {
			if (count==11) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowHome();
				fosterCareHomePage.checkPermanencyLabel();
				permanencyHomePage.verifyLabelsHome();
				permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Create Case Plan");
				permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
				permanencyPlan_OmniScriptPage.switchToWindow();
				permanencyPlan_OmniScriptPage.setPermanencyGoalsFor(childFirstName+" "+childLastName);
				permanencyPlan_OmniScriptPage.primaryFirst("appla");
				permanencyPlan_OmniScriptPage.setPermanencyNarrative("demo");
				permanencyPlan_OmniScriptPage.clickNextButton();
				servicesToTheChildren_OmniScriptPage.clickNextButton();
				serviceAgreementWithParents_OmniScriptPage.clickNextButton();
				visitationPlan_OmniScriptPage.addParentalVisitationPlan("No");
				visitationPlan_OmniScriptPage.addSiblingVisitations("No");
				visitationPlan_OmniScriptPage.clickNext();
				serviceToProviderPage.clickSubmit();
				serviceToProviderPage.closeWindowsExceptParent();
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowHome();
				fosterCareHomePage.checkPermanencyLabel();
				permanencyHomePage.verifyLabelsHome();
				permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "APPLA");
				permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
				permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "APPLA");
			}else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}
}
