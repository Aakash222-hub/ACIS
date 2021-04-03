package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.caseplan.PermanencyPlan_OmniScriptPage;
import com.acis.automation.pages.caseplan.ServiceToProviderPage;
import com.acis.automation.pages.caseplan.VisitationPlan_OmniScriptPage;
import com.acis.automation.utilities.AcisException;

public class FamilyPlacebookTestCase extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(FamilyPlacebookTestCase.class);

	public FamilyPlacebookTestCase() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	
	

	String allegationID, fosterCaseID;

	String firstName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
	String middleName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
	String lastName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);
	
	int count = 0;

	@Test(enabled=true,description = "US:0183 Intake Creation for case management pre requisite 1", groups = { "High",
			"acisRegression", "Dharmesh" }, priority = 0)

	public void FamilyPlacebookTestIntakeCreation() throws AcisException, InterruptedException, IOException {
		try {
			 
			String caseId = testData.get(Constants.InvestigationSafetyFeature).get("caseID");
			String maltreator = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").concat(" ")
					.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"));
			String victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
					.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"));
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
					testData.get(Constants.REPORTDETAILSPAGE).get("middleName"), "", "",
					testData.get(Constants.REPORTDETAILSPAGE).get("role"));
			// testData.get(Constants.REPORTDETAILSPAGE).get("phone")
			// testData.get(Constants.REPORTDETAILSPAGE).get("email")
			reportDetailsOmniscriptPage
					.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
			reportDetailsOmniscriptPage.setDate("Incident");
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			createIntakePerson_OmniscriptPage.setAllNames(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),
					testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),
					testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"));
			createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
			//		createIntakePerson_OmniscriptPage.provideContactInformation(
			//				testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
			//				testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
			//		createIntakePerson_OmniscriptPage
			//				.provideState(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstState"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
			createIntakePerson_OmniscriptPage.clickPrimaryAddress();
			createIntakePerson_OmniscriptPage
					.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage
					.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
				createIntakePerson_OmniscriptPage.clickSaveButton();
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
				personsInvovled_OmniscriptPage.clickRefresPersonButton();
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

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:083 Case Management - New Placement Search Criteria intake creation");
		}

	}

	@Test(enabled=true,description = "US:0183 Intake submission for pre-requisite 2", groups = { "High",
			"acisRegression", "Dharmesh" }, priority = 1)
	public void OverrideSupervisor() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 1) {
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
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria intake approval");
		}

	}

	@Test(enabled=true,description = "US:0183  Foster Id creation for case management pre requisite 3", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 2)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 2) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
//				homePage_SFDCPage.clickFirstRecord();
				homePage_SFDCPage.selectAllCaseHeads();
				homePage_SFDCPage.searchRecordAndClick(firstName+" "+middleName+" "+lastName);
				fosterCaseID = caseHeadPage.newFosterCase();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}
	

	@Test(enabled = true,description = "US-0183 Family Playbook - Create New Case Plan", groups = { "High",
			"acisRegression", "Akash" }, priority = 3)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {
		String narrativeData = testData.get(Constants.OOhservicesCasePage).get("narrative");

		String caseId = testData.get(Constants.FamilyPlaceBook).get("CaseNo");

		String permanency = testData.get(Constants.OOhservicesCasePage).get("permanencyStatus");

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));

		 
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
		familyPlacebookPage.editingAgenyPlan();
		familyPlacebookPage.clickcasePlanReview();
		familyPlacebookPage.fillingFamilyAgencyform("blank");
		familyPlacebookPage.savingClickingNewCasePlan();
		familyPlacebookPage.verifycasePlanIncompetent();
	

		// personIncomePage.deleteAllData();

	}

	@Test(enabled = true, description = "US-0183 Family Playbook - Create New Case Plan selcting nO", groups = { "High",
			"acisRegression", "Akash" }, priority = 4)
	public void CreatePlacementAccountSelctingNo() throws AcisException, InterruptedException, IOException {


		String caseId = testData.get(Constants.FamilyPlaceBook).get("CaseId");

		String parental = testData.get(Constants.OOhservicesCasePage).get("parentalStatus");
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));


		familyPlacebookPage.clickcasePlanReview();
		familyPlacebookPage.editingAgenyPlan();
		familyPlacebookPage.fillingFamilyAgencyform("PermanencyPlan");
		familyPlacebookPage.fillingFamilyAgencyform("PermanencyPlan1");
		familyPlacebookPage.fillingFamilyAgencyform("Placement");
		familyPlacebookPage.fillingFamilyAgencyform("Placement1");

		familyPlacebookPage.fillingFamilyAgencyform("Health");
		familyPlacebookPage.fillingFamilyAgencyform("Health1");
		familyPlacebookPage.fillingFamilyAgencyform("Education");
		familyPlacebookPage.fillingFamilyAgencyform("Education1");
		familyPlacebookPage.fillingFamilyAgencyform("MentalHealth");
		familyPlacebookPage.fillingFamilyAgencyform("MentalHealth1");
		familyPlacebookPage.fillingFamilyAgencyform("Other");
		familyPlacebookPage.fillingFamilyAgencyform("other1");
		familyPlacebookPage.fillingFamilyAgencyform("read");
		familyPlacebookPage.fillingFamilyAgencyform("read1");
		familyPlacebookPage.fillingFamilyAgencyform("serviceAgreement");
		familyPlacebookPage.fillingFamilyAgencyform("serviceAgreement1");
		familyPlacebookPage.fillingFamilyAgencyform("parentalVisitation");
		familyPlacebookPage.fillingFamilyAgencyform("parentalVisitation1");
		familyPlacebookPage.fillingFamilyAgencyform("sibling");
		familyPlacebookPage.fillingFamilyAgencyform("sibling1");
		familyPlacebookPage.fillingFamilyAgencyform("serviceProvider");
		familyPlacebookPage.fillingFamilyAgencyform("serviceProvider1");
		familyPlacebookPage.savingClickingNewCasePlan();
		familyPlacebookPage.clickNext();
	   serviceToProviderPage.clickSubmit();
	   
	   serviceToProviderPage.closeButton();
	    visitationPlan_OmniScriptPage.verifyInterview(parental);
	
	

		// personIncomePage.deleteAllData();

	}
}
