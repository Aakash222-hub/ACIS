package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class GuardianshipPermanencyToolTest extends TestBase{

	public GuardianshipPermanencyToolTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	String  fosterCaseID, allegationID;
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
	
	@Test(description = "S-0617 Case Management - New Placement Search Criteria intake creation", groups = { "High",
			"acisRegression", "Pallavi" }, priority = 0)

	public void OverrideScreeningDecission() throws AcisException, InterruptedException, IOException {
		try {
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
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0617 Case Management - New Placement Search Criteria intake creation");
		}

	}
	@Test(description = "S-0617 Case Management - New Placement Search Criteria intake approval", groups = { "High",
			"acisRegression", "Pallavi" }, priority = 1)
	public void OverrideSupervisor() throws AcisException, InterruptedException, IOException {
		try {
			
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
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0617 Case Management - New Placement Search Criteria intake approval");
		}

	}

	@Test(description = "S-0617 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 2)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
				homePage_SFDCPage.searchRecordAndClick(firstName + " " + middleName + " " + lastName);
				fosterCaseID = caseHeadPage.newFosterCase();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0617 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}
	

	@Test(description = "S-0617 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 3)
	public void FosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
		try {
			
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
				
				personsInvovled_CP_OmniscriptPage.searchNewPerson(childFirstName);
				personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
				personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
				personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
				personsInvovled_CP_OmniscriptPage.clickSaveButton("next");
				personsInvovled_CP_OmniscriptPage.clickNextButton();
				establishRelationships_CP_OmniScriptPage.clickSubmit();
							
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0617 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}

	@Test(description = "S-0617 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 4)
	public void FosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickCasePlanTab();
				casePlanPage.clickNewCasePlan();
				permanencyPlan_OmniScriptPage.setPermanencyGoalsFor(childFirstName+" "+childLastName);
				permanencyPlan_OmniScriptPage.primaryFirst("guardianship");
				permanencyPlan_OmniScriptPage.setPermanencyNarrative("demo");
				permanencyPlan_OmniScriptPage.nextBtn();
				servicesToTheChildren_OmniScriptPage.clickNextButton();
				serviceAgreementWithParents_OmniScriptPage.clickNextButton();
				visitationPlan_OmniScriptPage.addParentalVisitationPlan("No");
				visitationPlan_OmniScriptPage.addSiblingVisitations("No");
				visitationPlan_OmniScriptPage.clickNext();
				serviceToProviderPage.clickNext();
				decisionPage.clickSubmit();
				newLegalAction_OmniScriptPage.closeWindowsExceptParent();
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowHome();
				fosterCareHomePage.checkPermanencyLabel();
				permanencyHomePage.verifyLabelsHome();
//				permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Create Case Plan");
				permanencyHomePage.checkTransaction(childFirstName+" "+childMiddleName+" "+childLastName, "Prepare for Court");
				permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
				permanencyHomePage.checkTransaction(childFirstName+" "+childMiddleName+" "+childLastName, "Locate Relatives/Kin");
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
				reviewEditSendPage.closeWindow();
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowHome();
				fosterCareHomePage.checkPermanencyLabel();
				permanencyHomePage.checkTransaction(childFirstName+" "+childMiddleName+" "+childLastName, "Transfer All Services to Relative Caregiver");
				permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
				permanencyHomePage.checkTransaction(childFirstName+" "+childMiddleName+" "+childLastName, "Place Child");
				permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
				locateRelativesPage.switchToWindow();
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
				permanencyHomePage.checkTransaction(childFirstName+" "+childMiddleName+" "+childLastName, "Negotiate Subsidy");
				permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
				permanencyHomePage.checkTransaction(childFirstName+" "+childMiddleName+" "+childLastName, "Prepare for Court");
				permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
				permanencyHomePage.checkTransaction(childFirstName+" "+childMiddleName+" "+childLastName, "Close Case");
				permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
				

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0617 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}

	
}
