package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class EstablishRelationshipAddingPersonInvestigationTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(EstablishRelationshipAddingPersonInvestigationTest.class);

	public EstablishRelationshipAddingPersonInvestigationTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID, maltreator, victim, victimSecond, riskAssessmentID, safetyAssessmentID;
	String investigationCaseId;
	int count1 = 0;

	@Test(enabled = true, priority = 0, description = "S-0202 Establish Relationship When Adding Person to Investigation Case Action", groups = {
			"High", "ACIS_Regression", "Akash" })
	public void intakeCreationAccept() throws AcisException, InterruptedException, IOException {

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
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"),
				testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"),
				testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"));
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
//		createIntakePerson_OmniscriptPage.provideContactInformation(
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
//		createIntakePerson_OmniscriptPage
//				.provideState(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstState"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstBirthYear"));
		createIntakePerson_OmniscriptPage
				.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstGender"));

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
		// Options : screenOut||familyServices||investigation
		// screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
		// Options : workerComments||supervisoryComments||narrative
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "");
		// Options : newCase||existingCase
		screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		screeningDecision_OmniscriptPage.verifyRequiredFields();
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationID = allegationReportPage.getAllegationID();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
		count1++;

	}

	@Test(enabled = true, priority = 1, description = "S-0202 Establish Relationship When Adding Person to Investigation Case Action", groups = {
			"Medium", "ACIS_Regression", "Akash" })
	public void safetyAssessmentAccept() throws AcisException, Exception {
		if (count1 == 1) {
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
			screeningDecision_OmniscriptPage.clickSubmitbtn();

			allegationReportPage.verifyingAllegationReportStatus();
			investigationCaseId = allegationReportPage.getInvestigationCaseID();

			count1++;

		}

		else {
			throw new Exception(
					"Pre-requisite for Intake ID Validation  Does Not completed Successfully, so can not run this test");
		}
	}

	@Test(enabled = true, priority = 2, description = "S-0202 Establish Relationship When Adding Person to Investigation Case Action and submitting safety assesment work flow", groups = {
			"Medium", "ACIS_Regression", "Akash" })
	public void safetyAssesmsentflow() throws AcisException, Exception {
		if (count1 == 2) {
			String firstNameReporter = testData.get(Constants.EstablishRelationshipPage).get("firstNameReporter");

			String middleNameReporter = testData.get(Constants.EstablishRelationshipPage).get("middleNameReporter");

			String lastnameReporter = testData.get(Constants.EstablishRelationshipPage).get("lastName");

			String secondFirstNameReporter = testData.get(Constants.EstablishRelationshipPage).get("secondFirstName");

			String secondmiddleFirstNameReporter = testData.get(Constants.EstablishRelationshipPage)
					.get("secondMiddleName");

			String secondlastnameReporter = testData.get(Constants.EstablishRelationshipPage).get("secondLastName");

			maltreator = firstNameReporter.concat(" ").concat(middleNameReporter);

			victim = secondFirstNameReporter.concat(" ").concat(secondmiddleFirstNameReporter);
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			investigationSafetyAssessmentPage.searchGlobalCaseId(investigationCaseId);
			allegationReportPage.clickRelatedTab();
			investigationSafetyAssessmentPage.newSafetyAssesment();
			reviewAllegationReport_OmniScriptPage.clickCreateAddButton();
			personInvovled_IP_OmniScriptPage.clickEditButton("next");
			reviewAllegationReport_OmniScriptPage.setAllNames(firstNameReporter, middleNameReporter, lastnameReporter);
			investigationSafetyAssessmentPage.saveReporterPage();
			reviewAllegationReport_OmniScriptPage.clickCreateAddButton();
			personInvovled_IP_OmniScriptPage.clickEditButton("next");
			reviewAllegationReport_OmniScriptPage.setAllNames(secondFirstNameReporter, secondmiddleFirstNameReporter,
					secondlastnameReporter);
			investigationSafetyAssessmentPage.saveReporterPage();
			reviewAllegationReport_OmniScriptPage.clickNextButton();
			establishRelationships__OmniScriptPage.clickCreateAddButton();
			establishRelationships__OmniScriptPage.searchText(maltreator, "Person");
			establishRelationships__OmniScriptPage.setRelationShip("Child-Father");
			establishRelationships__OmniScriptPage.searchText(victim, "Related");
			establishRelationships__OmniScriptPage.clickSaveButton("Save");
			establishRelationships__OmniScriptPage.clickNextButton();

			interviewChildren_SA_OmniScriptPage.clickNextButton();
			interviewCaregivers_SA_OmniScriptPage.clickNextButton();
			assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
			safetyScale_SA_OmniScriptPage.clickCreateAddButton();
			safetyScale_SA_OmniScriptPage.selectDeniedMedical("Yes");
			safetyScale_SA_OmniScriptPage.selectDrugAlcohol("No");
			safetyScale_SA_OmniScriptPage.selectHazardousUnsanitary("No");
			safetyScale_SA_OmniScriptPage.selectPromoteViolence("No");
			safetyScale_SA_OmniScriptPage.selectUnableDefend("Yes");
			safetyScale_SA_OmniScriptPage.selectSpousalAbuse("Yes");
			safetyScale_SA_OmniScriptPage.clickSave();
			safetyScale_SA_OmniScriptPage.clickNextButton();
			safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
			safetyDecision_SA_OmniScriptPage.submitSafetyAssesment();
			investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAssessmentsTab();
			riskAssessmentID = investigationSafetyAssessmentPage.getAssessmentID("RiskAssessment");
			safetyAssessmentID = investigationSafetyAssessmentPage.getAssessmentID("SafteyAssessment");

		}

		else {
			throw new Exception(
					"Pre-requisite for Intake ID Validation  Does Not completed Successfully, so can not run this test");
		}
	}

	@Test(priority = 3, description = "S-0202 Establish Relationship When Adding Person and submitting investigation workflow Investigation Case Action submitting ", groups = {
			"Medium", "ACIS_Regression", "Akash" })
	public void investigationFlowAcceptRelationship() throws AcisException, InterruptedException {

		String firstNameReporter = testData.get(Constants.EstablishRelationshipPage).get("firstNameReporter");

		String middleNameReporter = testData.get(Constants.EstablishRelationshipPage).get("middleNameReporter");

		String lastnameReporter = testData.get(Constants.EstablishRelationshipPage).get("lastName");

		String secondFirstNameReporter = testData.get(Constants.EstablishRelationshipPage).get("secondFirstName");

		String secondmiddleFirstNameReporter = testData.get(Constants.EstablishRelationshipPage)
				.get("secondMiddleName");

		String secondlastnameReporter = testData.get(Constants.EstablishRelationshipPage).get("secondLastName");

		maltreator = firstNameReporter.concat(" ").concat(middleNameReporter);

		victim = secondFirstNameReporter.concat(" ").concat(secondmiddleFirstNameReporter);
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
		home.verfiyHomePage();
		maltreator = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").concat(" ")
				.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"));
		victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
				.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"));
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		investigationSafetyAssessmentPage.searchGlobalCaseId(investigationCaseId);
		allegationReportPage.clickRelatedTab();
		investigationCasePage.clickInvestigationWorkflow();
		reviewAllegationReport_OmniScriptPage.clickNextButton();
		establishRelationships__OmniScriptPage.clickCreateAddButton();
		establishRelationships__OmniScriptPage.searchText(maltreator, "Person");
		establishRelationships__OmniScriptPage.setRelationShip("Child-Father");
		establishRelationships__OmniScriptPage.searchText(victim, "Related");
		establishRelationships__OmniScriptPage.clickSaveButton("Save");
		establishRelationships__OmniScriptPage.clickNextButton();
		interview_OmniScriptPage.clickCreateInterviewLink();
		interview_OmniScriptPage.iframeSwitch();
		interview_OmniScriptPage.provideDate();
		interview_OmniScriptPage.prvoideType("Visit");
		interview_OmniScriptPage.prvoideLocation("Biological Home");
		interview_OmniScriptPage.prvoideSubType("Child");
		interview_OmniScriptPage.prvoideMethod("Phone");
		interview_OmniScriptPage.enterTextFieldValueOnInterview("narrative", "Interviw narrative Demo");
		interview_OmniScriptPage.enterTextFieldValueOnInterview("profesionalopinion",
				"Interviw profesionalopinion Demo");
		interview_OmniScriptPage.clickParticipantCheckbox(maltreator);
		interview_OmniScriptPage.clickSavebutton();
		interview_OmniScriptPage.closeCaregiverTab();
		interview_OmniScriptPage.clickNextButton();
		// Collateral
		collaterals_OmniScriptPage.clickCreateCollateral();
		collaterals_OmniScriptPage.iframeSwitch();
		collaterals_OmniScriptPage.setDate();
		collaterals_OmniScriptPage.setCheckbox("Scheduled");
		collaterals_OmniScriptPage.typePicklist("Collateral");
		collaterals_OmniScriptPage.subTypePicklist("MentalHealth");
		collaterals_OmniScriptPage.enterTextFieldValue("CollateralPerson", "Test");
		collaterals_OmniScriptPage.enterTextFieldValue("CollateralPhoneEmail", "+12345678");
		collaterals_OmniScriptPage.enterTextFieldValue("Narrative", "Test1 narrative");
		collaterals_OmniScriptPage.enterTextFieldValue("ProffesionalOpinion", "Test2 Professional ");
		collaterals_OmniScriptPage.clickSaveButton();
		collaterals_OmniScriptPage.closeCollateraltab();
		collaterals_OmniScriptPage.clickNextButton();
		// Record
		recordReview_OmniScriptPage.enterTextRecordReview("abc");
		recordReview_OmniScriptPage.nextPage();
		findings_OmniScriptPage.addAllegation("Substantiated", maltreator);
		findings_OmniScriptPage.clickonSubmitButton();

	}

}
