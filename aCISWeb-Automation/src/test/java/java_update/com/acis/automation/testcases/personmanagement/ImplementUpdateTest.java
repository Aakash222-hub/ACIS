package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.safetyassessment.SafetyDecision_SA_OmniScriptPage;
import com.acis.automation.utilities.AcisException;

public class ImplementUpdateTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(ImplementUpdateTest.class);

	public ImplementUpdateTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID, maltreator, victim, victimSecond, riskAssessmentID, safetyAssessmentID, investigationCaseId;;
	int count1 = 0;

//safety assessmnet
	
	@Test(enabled = true, description = "S-0906:Implement Updates - Implement New/Remove Typeahead- Edit SA", groups = {
			"High", "ACIS_Regression", "Akash" }, priority = 3)
	public void validatingInvestigationSafetyAssesment() throws AcisException, InterruptedException, IOException {
		try {
			
			String firstName_Sa = excel
					.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			String middleName_Sa = excel
					.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
			String lastName_Sa = excel
					.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);

			
			String firstName_SaReview = excel
					.generateRandomTestData(testData.get(Constants.InvestigationSafetyAssessment).get("firstPersonFirstName"), 6);
			
			
			
			
			String str1 ="first";
			
			String str2 ="No existing person records match the search criteria entered";

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));

			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalforInvestigation(investigationCaseId);
			investigationCasePage.clickRelatedTab();

			mandatoryPersonSearchSafetyAssesmentPage.clickNewSafetyAssessment();

			reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
			establishRelations_SA_OmniScriptPage.clickNextButton();
			interviewChildren_SA_OmniScriptPage.clickNextButton();
			interviewCaregivers_SA_OmniScriptPage.clickNextButton();
			assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
			safetyScale_SA_OmniScriptPage.verifyRiskAssessment();
			safetyScale_SA_OmniScriptPage.clickCreateAddButton();
			safetyScale_SA_OmniScriptPage.selectUnableDefend("Yes");
			safetyScale_SA_OmniScriptPage.selectDrugAlcohol("No");
			safetyScale_SA_OmniScriptPage.selectDeniedMedical("Unknown");
			safetyScale_SA_OmniScriptPage.selectHazardousUnsanitary("Yes");
			safetyScale_SA_OmniScriptPage.selectSpousalAbuse("No");
			safetyScale_SA_OmniScriptPage.selectPromoteViolence("No");
			safetyScale_SA_OmniScriptPage.clickSave();
			safetyScale_SA_OmniScriptPage.verifyRiskRecordCreated();
			safetyScale_SA_OmniScriptPage.clickNextButton();
			safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
			safetyDecision_SA_OmniScriptPage.submitSafetyAssesment();
			assessTheHome_SA_OmniScriptPage.editButton();
			searchPerson_OmniscriptPage.searchPersonUsingvalidDataforReviewAllegation(firstName_SaReview);
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			createIntakePerson_OmniscriptPage.setAllNamesReview(firstName_Sa, middleName_Sa, lastName_Sa);
			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.clickCloseButton();
		} catch (AcisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(enabled = true, description = "S-0906:Implement Updates - Implement New/Remove Typeahead- Edit SA Intake Creation", groups = {
			"High", "ACIS_Regression", "Akash" }, priority = 0)
	public void ImplementationUpdateCreatingIntake() throws AcisException, Exception {

		if (count1 == 0) {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			String maltreator = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").concat(" ")
					.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"));
			String victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
					.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"));
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
			//testData.get(Constants.REPORTDETAILSPAGE).get("phone")
			//testData.get(Constants.REPORTDETAILSPAGE).get("email")
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
//			createIntakePerson_OmniscriptPage.provideContactInformation(
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
//			createIntakePerson_OmniscriptPage
//					.provideState(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstState"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
			createIntakePerson_OmniscriptPage.clickPrimaryAddress();
			createIntakePerson_OmniscriptPage.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
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
//			createIntakePerson_OmniscriptPage.provideContactInformation(
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
//			createIntakePerson_OmniscriptPage
//					.provideState(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstState"));
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
			
			// Options : workerComments||supervisoryComments||narrative
			
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
			//screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
            screeningDecision_OmniscriptPage.selectAssociateExistingInvestigation("No");
            screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
            // Options : workerComments||supervisoryComments||narrative
            // Options : newCase||existingCase
            screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
            screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationID = allegationReportPage.getAllegationID();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
			

			count1++;
		} else {
			throw new Exception(
					"Pre-requisite for Intake ID Validation  Does Not completed Successfully, so can not run this test");
		}

	}

	@Test(enabled = true, description = "S-0906:Implement Updates - Implement New/Remove Typeahead- Edit SA Intake Submitt", groups = {
			"High", "ACIS_Regression", "Akash" }, priority = 1)
	public void validatingImplementationflowSubmititngIntake() throws AcisException, Exception {

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
		} else {
			throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
		}

	}

	

}
