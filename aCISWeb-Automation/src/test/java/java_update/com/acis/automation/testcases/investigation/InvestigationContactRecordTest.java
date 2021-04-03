package com.acis.automation.testcases.investigation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class InvestigationContactRecordTest extends TestBase {
	public InvestigationContactRecordTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(InvestigationContactRecordTest.class);
	public static String allegationID;

	@Test(enabled=true,priority = 9, description = "S:0190 Investigation Contact Records using investigation User", groups = {
			"Simple", "ACIS_Regression", "Khushboo" })
	public void FindingsInvestigator() throws AcisException, InterruptedException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			String maltreator = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").concat(" ")
					.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"));
			String victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
					.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			personsInformationPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			investigationCasePage.clickInvestigationWorkflow();
			reviewAllegationReport_OmniScriptPage.clickNextButton();
			personsInvolved_SA_OmniscriptPage.clickNextButton();
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
			/*
			 * interview_OmniScriptPage.prvoideSubType("Foster Parent");
			 * 
			 * interview_OmniScriptPage.prvoideSubType("Biological Parent");
			 * interview_OmniScriptPage.prvoideSubType("Relative");
			 * interview_OmniScriptPage.prvoideMethod("Phone");
			 */
			 		
			interview_OmniScriptPage.enterTextFieldValueOnInterview("narrative", "Interviw narrative Demo");
			interview_OmniScriptPage.enterTextFieldValueOnInterview("profesionalopinion",
					"Interviw profesionalopinion Demo");
			interview_OmniScriptPage.clickParticipantCheckbox(maltreator);
			interview_OmniScriptPage.clickSavebutton();
			interview_OmniScriptPage.closeCaregiverTab();
			interview_OmniScriptPage.clickNextButton(); // Collateral
			collaterals_OmniScriptPage.clickCreateCollateral();
			collaterals_OmniScriptPage.iframeSwitch();
			collaterals_OmniScriptPage.setDate();
			collaterals_OmniScriptPage.setCheckbox("Scheduled");
			collaterals_OmniScriptPage.typePicklist("Collateral");
			collaterals_OmniScriptPage.subTypePicklist("Medical");
			/*
			 * collaterals_OmniScriptPage.subTypePicklist("MentalHealth");
			 * collaterals_OmniScriptPage.subTypePicklist("Education");
			 * collaterals_OmniScriptPage.subTypePicklist("Service Provider");
			 */
			collaterals_OmniScriptPage.verifyLocation("Foster Home");
			/*
			 * collaterals_OmniScriptPage.verifyLocation("Biological Home");
			 * collaterals_OmniScriptPage.verifyLocation("DCS Office");
			 * collaterals_OmniScriptPage.verifyLocation("Service Provider");
			 */
			collaterals_OmniScriptPage.prvoideMethod("FaceToFace");
			//collaterals_OmniScriptPage.prvoideMethod("FaceToFace");
			collaterals_OmniScriptPage.enterTextFieldValue("CollateralPerson", "Test");
			collaterals_OmniScriptPage.enterTextFieldValue("CollateralPhoneEmail", "+12345678");
			collaterals_OmniScriptPage.enterTextFieldValue("Narrative", "Test1 narrative");
			collaterals_OmniScriptPage.clickSaveButton();
			collaterals_OmniScriptPage.verifyError();
			collaterals_OmniScriptPage.enterTextFieldValue("ProffesionalOpinion", "Test2 Professional ");
			collaterals_OmniScriptPage.clickSaveButton();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed :S:0107 Investigation - Findings   using investigation User");
		}
	}

	@Test(enabled=true,priority = 1, description = "S:0111 Investigation Contact Records using Supervisor User", groups = { "High",
			"ACIS_Regression", "Khushboo" })
	public void InvestigationCaseRecordSupervisor() throws AcisException, InterruptedException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
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
					testData.get(Constants.REPORTDETAILSPAGE).get("phone"),
					testData.get(Constants.REPORTDETAILSPAGE).get("email"),
					testData.get(Constants.REPORTDETAILSPAGE).get("role"));
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
		//	createIntakePerson_OmniscriptPage.provideContactInformation(
			//		testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
			//		testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
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
		//	createIntakePerson_OmniscriptPage.provideContactInformation(
		//			testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
		//			testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
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
			// Options : screenOut||familyServices||investigation
			// screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
			allegationID = allegationReportPage.getAllegationID();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.logoutUser();
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
			allegationReportPage.cancelIntakeOmniscript();
			allegationReportPage.verifyingAllegationReportStatus();
			// Pre-requisite for investigation flow completed
			personsInformationPage.clickRelatedTab();
			 allegationReportPage.clickonAlligationRecord();
			investigationCasePage.clickRelatedTabOfInvestigation();
			 investigationCasePage.verifyAlligationReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "S:0111 Investigation Contact Records using Superviosr User");
		}
	}

	@Test(enabled=true,priority = 2, description = "S:0111 Investigation Contact Records using Supervisor User", groups = { "High",
			"ACIS_Regression", "Khushboo" })
	public void InvestigationCaseRecordIntake() throws AcisException, InterruptedException {

		try {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			 allegationReportPage.clickonAlligationRecord();
			caseHeadPage.clickRelatedTab("Second Related tab");
			investigationCasePage.verifyAlligationReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "S:0111 Investigation Contact Records using Intake User");
		}
	}
	@Test(enabled=true,priority = 3, description = "S:0111 Investigation Contact Records using Supervisor User", groups = { "High",
			"ACIS_Regression", "Khushboo" })
	public void InvestigationCaseRecordInvestigator() throws AcisException, InterruptedException {

		try {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			 allegationReportPage.clickonAlligationRecord();
			 caseHeadPage.clickRelatedTab("Second Related tab");
			investigationCasePage.verifyAlligationReport();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "S:0111 Investigation Contact Records using investigator User");
		}
	}
	@Test(enabled=true,priority = 4, description = "S:0111 Investigation Contact Records using Supervisor User", groups = { "High",
			"ACIS_Regression", "Khushboo" })
	public void InvestigationCaseRecordAdmin() throws AcisException, InterruptedException {

		try {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			 allegationReportPage.clickonAlligationRecord();
				caseHeadPage.clickRelatedTab("Second Related tab");
				investigationCasePage.verifyAlligationReport();
				} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "S:0111 Investigation Contact Records using investigator User");
		}
	}
	@Test(enabled=false,priority = 5, description = "S:0111 Assessments Contact Records using Intake User", groups = { "High",
			"ACIS_Regression", "Khushboo" })
	public void AssessmentsCaseRecordsIntake() throws AcisException, InterruptedException {
		try {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
		//	investigationCasePage.clickInsightTabOfInvestigation();
			investigationCasePage.verifyNewReferralAssignment();
			investigationCasePage.verifyHighlightPanel();
			investigationCasePage.clickRelatedTabOfInvestigation();
			investigationCasePage.clickAssessment();
			investigationCasePage.verifyAssessmentField();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S:0111 Assessments Contact Records using Intake User");
		}
	}

	@Test(enabled=true,priority = 6, description = "S:0111 Assessments Contact Records using Investigator User", groups = { "High",
			"ACIS_Regression", "Khushboo" })
	public void AssessmentsCaseRecordsInvestigator() throws AcisException, InterruptedException {
		try {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			investigationCasePage.verifyNewReferralAssignment();
			investigationCasePage.verifyHighlightPanel();
			investigationCasePage.clickRelatedTabOfInvestigation();
			investigationCasePage.clickAssessment();
			investigationCasePage.verifyAssessmentField();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S:0111 Assessments Contact Records using Investigator User");
		}
	}

	@Test(enabled=true,priority = 7, description = "S:0111 Assessments Contact Records using Supervisor User", groups = { "High",
			"ACIS_Regression", "Khushboo" })
	public void AssessmentsCaseRecordsSupervisor() throws AcisException, InterruptedException {
		try {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			investigationCasePage.verifyNewReferralAssignment();
			investigationCasePage.verifyHighlightPanel();
			investigationCasePage.clickRelatedTabOfInvestigation();
			investigationCasePage.clickAssessment();
			investigationCasePage.verifyAssessmentField();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "S:0111 Investigation Contact Records using Supervisor User");
		}
	}

	
	@Test(enabled=true,priority = 8, description = "S:0111 Assessments Contact Records using Admin User", groups = { "High",
			"ACIS_Regression", "Khushboo" })
	public void AssessmentsCaseRecordsAdmin() throws AcisException, InterruptedException {
		try {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			investigationCasePage.verifyNewReferralAssignment();
			investigationCasePage.verifyHighlightPanel();
			investigationCasePage.clickRelatedTabOfInvestigation();
			investigationCasePage.clickAssessment();
			investigationCasePage.verifyAssessmentField();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S:0111 Assessments Contact Records using Admin User");
		}
	}

}
