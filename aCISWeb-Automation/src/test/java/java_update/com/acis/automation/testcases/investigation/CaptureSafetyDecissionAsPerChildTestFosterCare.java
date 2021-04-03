package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class CaptureSafetyDecissionAsPerChildTestFosterCare extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(CaptureSafetyDecissionAsPerChildTestFosterCare.class);

	public CaptureSafetyDecissionAsPerChildTestFosterCare() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	String allegationID, fosterCaseID;
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


	String   victimSecond, riskAssessmentID, safetyAssessmentID, investigationCaseId;;
	int count1 = 0;

//safety assessmnet
		
	@Test(enabled = false, description = "S-1080:Capture Safety Decision per Child (Foster Care Case)", groups = {
			"High", "ACIS_Regressions", "Akash" }, priority = 1)
	public void validatingInvestigationSafetyAssesment() throws AcisException, InterruptedException, IOException {
		try {
			
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));

			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			investigationCasePage.clickRelatedTab();

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
		//	interviewChildren_SA_OmniScriptPage.clickParticipantCheckbox(maltreator);
			interviewChildren_SA_OmniScriptPage.clickSavebutton();
			interviewChildren_SA_OmniScriptPage.switchToDefaultContent();
			interviewChildren_SA_OmniScriptPage.closeCaregiverTab();
			interviewChildren_SA_OmniScriptPage.clickNextButton();
			interviewCaregivers_SA_OmniScriptPage.clickNextButton();
			assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
			safetyScale_SA_OmniScriptPage.clickNextButton();
			safetyDecision_SA_OmniScriptPage.clickEditonPerticipant(victim);
			safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
			//safetyDecision_SA_OmniScriptPage.clickEditonPerticipant(maltreator);
		//	safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
			
		} catch (AcisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	
	
	
	@Test(enabled = true, description = "S-1080:Capture Safety Decision per Child (Foster Care Case)", groups = {
			"High", "ACIS_Regressions", "Akash" }, priority = 2)
	public void validatingInvestigationSafetyAssesmentOOhcaseworker() throws AcisException, InterruptedException, IOException {
		try {
			String narrativeData1 = testData.get(Constants.InvestigationSafetyFeature).get("narrativeTextInterview1");

			String professionalData1 = testData.get(Constants.InvestigationSafetyFeature).get("professionalText1");

			String typeField = testData.get(Constants.InvestigationSafetyFeature).get("type");

			String subType = testData.get(Constants.InvestigationSafetyFeature).get("subType");

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));

			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			investigationCasePage.clickRelatedTab();

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
			//interviewChildren_SA_OmniScriptPage.clickParticipantCheckbox(maltreator);
			interviewChildren_SA_OmniScriptPage.clickSavebutton();
			interviewChildren_SA_OmniScriptPage.switchToDefaultContent();
			interviewChildren_SA_OmniScriptPage.closeCaregiverTab();
			interviewChildren_SA_OmniScriptPage.clickNextButton();
			interviewCaregivers_SA_OmniScriptPage.clickNextButton();
			assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
			safetyScale_SA_OmniScriptPage.clickNextButton();
			safetyDecision_SA_OmniScriptPage.clickEditonPerticipant(victim);
			safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
		//	safetyDecision_SA_OmniScriptPage.clickEditonPerticipant(maltreator);
			//safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
			safetyDecision_SA_OmniScriptPage.verifyCheckBox();
			
		} catch (AcisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(enabled = true, description = "US:0183  Foster Id creation for case management pre requisite 1", groups = {
			"High", "acisRegression", "Akash" }, priority = 2)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
		//	homePage_SFDCPage.clickFirstRecord();
			homePage_SFDCPage.searchRecordAndClick(firstName+" "+middleName+" "+lastName);
			fosterCaseID = caseHeadPage.newFosterCase();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}
	
	

	@Test(description = "S-0164 Case Management - New Placement Search Criteria intake creation", groups = { "High",
			"acisRegression", "Dharmesh" }, priority = 0)

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
			getStackTrace(e, "Failed S-0164 Case Management - New Placement Search Criteria intake creation");
		}

	}
	
	
	@Test(description = "S-0164 Case Management - New Placement Search Criteria intake approval", groups = { "High",
			"acisRegression", "Dharmesh" }, priority = 1)
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
			getStackTrace(e, "Failed S-0164 Case Management - New Placement Search Criteria intake approval");
		}

	}
}



