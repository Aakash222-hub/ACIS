package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class InvestigationSafetyAssessmentTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(InvestigationSafetyAssessmentTest.class);

	public InvestigationSafetyAssessmentTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	String firstName=excel.generateRandomTestData(excel.generateRandomTestData("FP", 4),4);
	String middleName=excel.generateRandomTestData(excel.generateRandomTestData("FP", 3),3);
	String lastName=excel.generateRandomTestData(excel.generateRandomTestData("FP", 3),3);
	
	String secondfirstName = excel.generateRandomTestData(excel.generateRandomTestData("SP", 4), 4);
	String secondmiddleName = excel.generateRandomTestData(excel.generateRandomTestData("SP", 3), 3);
	String secondlastName = excel.generateRandomTestData(excel.generateRandomTestData("SP", 3), 4);

	String thirdfirstName = excel.generateRandomTestData(excel.generateRandomTestData("TP", 4), 4);
	String thirdmiddleName = excel.generateRandomTestData(excel.generateRandomTestData("TP", 3), 3);
	String thirdlastName = excel.generateRandomTestData(excel.generateRandomTestData("TP", 3), 4);

	String fourthfirstName = excel.generateRandomTestData(excel.generateRandomTestData("P", 4), 4);
	String fourthmiddleName = excel.generateRandomTestData(excel.generateRandomTestData("P", 3), 3);
	String fourthlastName = excel.generateRandomTestData(excel.generateRandomTestData("P", 3), 4);

	String  victim = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
	String maltreator = secondfirstName.concat(" ").concat(secondmiddleName).concat(" ").concat(secondlastName);


	String allegationID,  victimSecond, riskAssessmentID, safetyAssessmentID, investigationCaseId;;
	int count1 = 0;
	
	String caseLinkAssesment;
	
	// Adding data
	int count = 0;
	@Test(enabled=true,description = "S-0160:Investigation Safety Assesment verifying safety assessment save for later,safe,unsafe,conditionalsafe", groups = { "High", "ACIS_Regression",
			"Akash" }, priority = 2)
	public void validatingInvestigationSafetyAssesment() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(caseLinkAssesment);
		//investigationSafetyAssessmentPage.searchGlobalCaseId("C-00001846");
		allegationReportPage.clickRelatedTab();
		

		mandatoryPersonSearchSafetyAssesmentPage.clickNewSafetyAssessment();
		
		
		
		reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
		
		personsInvolved_SA_OmniscriptPage.clickNextButton();
		
		establishRelations_SA_OmniScriptPage.clickNextButton();
		
		interviewChildren_SA_OmniScriptPage.clickCreateChildrenInterviewLink();
		interview_OmniScriptPage.iframeSwitch();
		interviewChildren_SA_OmniScriptPage.provideDifferentDate("Today");
		interviewChildren_SA_OmniScriptPage.prvoideType("Visit");
		interviewChildren_SA_OmniScriptPage.prvoideSubType("Child");
		interviewChildren_SA_OmniScriptPage.prvoideLocation("Biological Home");
		interviewChildren_SA_OmniScriptPage.prvoideMethod("FaceToFace");
		interviewChildren_SA_OmniScriptPage.enterTextUsingJavascriptFieldValueOnInterviewChildren("narrative", "Interviw narrative Demo");
		interviewChildren_SA_OmniScriptPage.enterTextUsingJavascriptFieldValueOnInterviewChildren("profesionalopinion","Interviw profesionalopinion Demo");
		interviewChildren_SA_OmniScriptPage.clickParticipantCheckbox(victim);
		interviewChildren_SA_OmniScriptPage.clickParticipantCheckbox(maltreator);
		interviewChildren_SA_OmniScriptPage.clickSavebutton();
		interviewChildren_SA_OmniScriptPage.switchToDefaultContent();
		interviewChildren_SA_OmniScriptPage.closeCaregiverTab();
		interviewChildren_SA_OmniScriptPage.clickNextButton();
		interviewCaregivers_SA_OmniScriptPage.clickNextButton();
		
		
		investigationSafetyAssessmentPage.verifyingErrorandSettingDates();
		safetyDecision_SA_OmniScriptPage.clickEditonPerticipant(victim);
		safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
		safetyDecision_SA_OmniScriptPage.clickEditonPerticipant(maltreator);
		safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
		
	}

	@Test(enabled=true,description = "S-0160:Investigation Safety Assesment  creating intake", groups = { "High", "ACIS_Regression",
			"Akash" }, priority = 0)
	public void validatingInProgressLabel() throws AcisException, InterruptedException, IOException {
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
		reportDetailsOmniscriptPage
				.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
		reportDetailsOmniscriptPage.setDate("Incident");
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
//		createIntakePerson_OmniscriptPage.provideContactInformation(
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
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

		createIntakePerson_OmniscriptPage.setAllNames(secondfirstName, secondmiddleName, secondlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
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
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		
//		screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
	    allegationID=allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		
		
		count++;
	}

		@Test(enabled=true,description = "S-0160:Investigation Safety Assesment submitting intake flow and taking investigation id", groups = { "High", "ACIS_Regression",
				"Akash" }, priority = 1)
		public void validatingInvestigationLabelSubmititngIntake() throws AcisException, Exception {

	
		if (count == 1) {
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
			screeningDecision_OmniscriptPage.cancelButton();
			allegationReportPage.verifyingAllegationReportStatus();
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			investigationSafetyAssessmentPage.clickDetailVerifyingStatusInProgress();
			caseLinkAssesment = investigationSafetyAssessmentPage.submitingNewAssessment();
			System.out.println(caseLinkAssesment);
			count++;
		
		} else {
			throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
		}
		
	}

	@Test(enabled=true	,description = "S-0160:Investigation Safety Assesment ", groups = { "High", "ACIS_Regression",
			"Akash" }, priority = 9)
	public void validatingInvestigationLabel() throws InterruptedException, AcisException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(caseLinkAssesment);
		investigationSafetyAssessmentPage.clickDetailVerifyingStatusInvestigation();

	}

}
