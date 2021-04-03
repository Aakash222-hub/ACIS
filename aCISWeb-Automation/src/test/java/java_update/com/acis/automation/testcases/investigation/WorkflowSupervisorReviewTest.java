package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class WorkflowSupervisorReviewTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(WorkflowSupervisorReviewTest.class);

	public WorkflowSupervisorReviewTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	/* Note:
	 * This Test Class contains scripts for S-0115,S-0123,S-0108 */
	String allegationID,maltreator,victim,victimSecond;
	int count = 0,count1=0;
	@Test(priority=0,description = "Investigation - Save for later verify investigation User", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void SaveForLaterInvestigation() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseActions();
			homePage_SFDCPage.selectMyInvestigation();
			investigationCasePage.clickFirstRecord();
			investigationCasePage.clickInvestigationWorkflow();
			reviewAllegationReport_OmniScriptPage.clickNextButton();
			establishRelationships__OmniScriptPage.clickNextButton();
			interview_OmniScriptPage.clickNextButton();
			collaterals_OmniScriptPage.clickNextButton();
			recordReview_OmniScriptPage.nextPage();
			findings_OmniScriptPage.clickOnSaveForLater();
			findings_OmniScriptPage.verifySaveForLater();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed Investigation - Save for later verify investigation User");

		}
	}

	@Test(priority=1,description = "Investigation - Save for later verify Supervisor User", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void SaveForLaterSupervisor() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseActions();
			homePage_SFDCPage.selectMyInvestigation();
			investigationCasePage.clickFirstRecord();
			investigationCasePage.clickInvestigationWorkflow();
			reviewAllegationReport_OmniScriptPage.clickNextButton();
			establishRelationships__OmniScriptPage.clickNextButton();
			interview_OmniScriptPage.clickNextButton();
			collaterals_OmniScriptPage.clickNextButton();
			recordReview_OmniScriptPage.nextPage();
			findings_OmniScriptPage.clickOnSaveForLater();
			findings_OmniScriptPage.verifySaveForLater();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed Investigation - Save for later verify Supervisor User");

		}
	}


	@Test(priority=2,description = "S-0160:Investigation Safety Assesment ", groups = { "High", "ACIS_Regression", "Akash" })
	public void intakeCreationAccept() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			maltreator = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").concat(" ")
					.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"));
			victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
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

			createIntakePerson_OmniscriptPage.setAllNames(
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"),
					testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"),
					testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"));
			createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
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
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
			allegationID = allegationReportPage.getAllegationID();
			count++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0103:Investigation - Add Person(s) for Exisiting Person");

		}

	}
	
	@Test(priority=3,description = "US-0103:Investigation - Add Person(s) for Exisiting Persons", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void safetyAssessmentAccept() throws AcisException {
		try {
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
				allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationSafetyAssessmentPage.clickDetailVerifyingStatusInProgress();
				investigationSafetyAssessmentPage.newSafetyAssesment();
				reviewAllegationReport_OmniScriptPage.clickNextButton();
				establishRelations_SA_OmniScriptPage.clickNextButton();
				interviewChildren_SA_OmniScriptPage.clickNextButton();
				interviewCaregivers_SA_OmniScriptPage.clickNextButton();
				assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
				safetyScale_SA_OmniScriptPage.clickNextButton();
				safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
				safetyDecision_SA_OmniScriptPage.submitSafetyAssesment();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0103:Investigation - Add Person(s) for Exisiting Person");

		}
	}
	
	@Test(priority=4,description = "US-0103:Investigation - Add Person(s) for Exisiting Person", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void investigationFlowAccept() throws AcisException {
		try {
			if (count == 2) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
				home.verfiyHomePage();
				maltreator = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").concat(" ")
						.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"));
				victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
						.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"));
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickInvestigationWorkflow();
				reviewAllegationReport_OmniScriptPage.clickNextButton();
				establishRelationships__OmniScriptPage.clickCreateAddButton();
				establishRelationships__OmniScriptPage.searchText(maltreator, "Person");
				establishRelationships__OmniScriptPage.setRelationShip("Child-Mother");
				establishRelationships__OmniScriptPage.searchText( victim, "Related");
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
				interview_OmniScriptPage.enterTextFieldValueOnInterview("profesionalopinion","Interviw profesionalopinion Demo");
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
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0103:Investigation - Add Person(s) for Exisiting Person");

		}
	}
	
	@Test(priority=5,description = "US-0103:Investigation - Add Person(s) for Exisiting Person", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void supervisorApprovalAccept() throws AcisException {
		try {
			if (count == 3) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickInvestigationWorkflow();
				reviewAllegationReport_OmniScriptPage.clickNextButton();
				establishRelationships__OmniScriptPage.clickNextButton();
				interview_OmniScriptPage.clickNextButton();
				// Collateral
				collaterals_OmniScriptPage.clickNextButton();
				// Record
				recordReview_OmniScriptPage.nextPage();
				findings_OmniScriptPage.clickonDepositionsradiobutton("Accept &Assign");
				findings_OmniScriptPage.clickonSubmitButton();
				
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0103:Investigation - Add Person(s) for Exisiting Person");

		}
	}
	
	@Test(priority=6,description = "S-0160:Investigation Safety Assesment ", groups = { "High", "ACIS_Regression", "Akash" })
	public void intakeCreationOverride() throws AcisException, InterruptedException, IOException {
		try {
			
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			maltreator = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").concat(" ")
					.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"));
			victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
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
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
			createIntakePerson_OmniscriptPage
					.provideState(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstState"));
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
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
			createIntakePerson_OmniscriptPage
					.provideState(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstState"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"));
			createIntakePerson_OmniscriptPage.clickPrimaryAddress();
			createIntakePerson_OmniscriptPage
					.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage
					.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstGender"));

			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			searchPerson_OmniscriptPage.clickNextBtn();
			personsInvovled_OmniscriptPage.clickEditRecordButton(maltreator);
			personsInvovled_OmniscriptPage.provideRole("first", "Alleged Maltreator");
			personsInvovled_OmniscriptPage.clickSaveButton("first");
			personsInvovled_OmniscriptPage.clickEditRecordButton(victim);
			personsInvovled_OmniscriptPage.provideRole("second", "Alleged Victim");
			personsInvovled_OmniscriptPage.clickPrimaryCaregiver();
			personsInvovled_OmniscriptPage.clickSaveButton("second");
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
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
			allegationID = allegationReportPage.getAllegationID();
			count1++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0103:Investigation - Add Person(s) for Exisiting Person");

		}

	}
	
	@Test(priority=7,description = "US-0103:Investigation - Add Person(s) for Exisiting Persons", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void safetyAssessmentOverride() throws AcisException {
		try {
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
				searchPerson_OmniscriptPage.clickNextBtn();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.selectAcceptAssign();
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationSafetyAssessmentPage.clickDetailVerifyingStatusInProgress();
				investigationSafetyAssessmentPage.submitingNewAssessment();
				count1++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0103:Investigation - Add Person(s) for Exisiting Person");

		}
	}
	
	@Test(priority=8,description = "US-0103:Investigation - Add Person(s) for Exisiting Person", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void investigationFlowOverride() throws AcisException {
		try {
			if (count1 == 2) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
				home.verfiyHomePage();
				maltreator = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").concat(" ")
						.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"));
				victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
						.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"));
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickInvestigationWorkflow();
				reviewAllegationReport_OmniScriptPage.clickNextButton();
				establishRelationships__OmniScriptPage.clickCreateAddButton();
				establishRelationships__OmniScriptPage.searchText(maltreator, "Person");
				establishRelationships__OmniScriptPage.setRelationShip("Child-Mother");
				establishRelationships__OmniScriptPage.searchText( victim, "Related");
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
				interview_OmniScriptPage.enterTextFieldValueOnInterview("profesionalopinion","Interviw profesionalopinion Demo");
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
				count1++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0103:Investigation - Add Person(s) for Exisiting Person");

		}
	}
	
	@Test(priority=9,description = "US-0103:Investigation - Add Person(s) for Exisiting Person", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void supervisorApprovalOveride() throws AcisException {
		try {
			if (count1 == 3) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickInvestigationWorkflow();
				reviewAllegationReport_OmniScriptPage.clickNextButton();
				establishRelationships__OmniScriptPage.clickNextButton();
				interview_OmniScriptPage.clickNextButton();
				// Collateral
				collaterals_OmniScriptPage.clickNextButton();
				// Record
				recordReview_OmniScriptPage.nextPage();
				findings_OmniScriptPage.clickonDepositionsradiobutton("Override");
				findings_OmniScriptPage.clickonSubmitButton();
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0103:Investigation - Add Person(s) for Exisiting Person");

		}
	}
}
