package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class SupervisorApproveOverrideSafetyssessmentTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(SupervisorApproveOverrideSafetyssessmentTest.class);

	public SupervisorApproveOverrideSafetyssessmentTest() throws AcisException {
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

	
	
	String firstPersonFirstName = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName");
	String firstPersonMiddleName = testData.get(Constants.PersonInvovledAllData)
			.get("firstPersonMiddleName");
	String firstPersonLastName = testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName");
	String newPersonFirstName = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName");
	String newPersonMiddleName = testData.get(Constants.PersonInvovledAllData)
			.get("secondPersonMiddleName");
	String newPersonLastName = testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName");
	String firstPerson = firstPersonFirstName.concat(" ").concat(firstPersonMiddleName);
	String secondPerson = newPersonFirstName.concat(" ").concat(newPersonMiddleName);

	int count = 0;

	// Adding data investigation
	@Test(enabled=true,priority = -4, description = "US-0099:Supervisor - Approve / Override Safety Assessment", groups = { "High",
			"ACIS_Regression", "Akash" })
	public void mandatorySearchforexistingPersons() throws AcisException, InterruptedException, IOException {

		String assesment = testData.get(Constants.AssignInvestigation).get("assementLabel");
		String createdBy = testData.get(Constants.AssignInvestigation).get("createdIdLabel");

		String date = testData.get(Constants.AssignInvestigation).get("daetIdLabel");
		String investigation = testData.get(Constants.AssignInvestigation).get("investigationLabel");
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
          
		assignInvestigationPage.navigatingToNewSafetyAssessmentPage(assesment, createdBy, date, investigation);
		assignInvestigationPage.EditButton();
		assignInvestigationPage.statuApproveOverride("approve");
		assignInvestigationPage.safetyDecission("safe");
		assignInvestigationPage.EditButton();
		assignInvestigationPage.statuApproveOverride("override");
		assignInvestigationPage.safetyDecission("unsafe");

	}

	@Test(enabled = true,priority = 0, description = "US-0099:Supervisor - Approve / Override Safety Assessment selecting safe/unsaf/conditionallly intake creation", groups = {
			"Medium", "ACIS_Regression", "Akash" })
	public void intakeCreation() throws AcisException, Exception {

		if (count == 0) {
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
//			createIntakePerson_OmniscriptPage.provideContactInformation(
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
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
//			createIntakePerson_OmniscriptPage.provideContactInformation(
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
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
			
//			screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
			screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
		    allegationID=allegationReportPage.getAllegationID();
			homePage_SFDCPage.closeTabs();
			
			
			
			count ++;
		} else {
			throw new Exception(
					"Pre-requisite for Intake ID Validation  Does Not completed Successfully, so can not run this test");
		}

	}


	@Test(enabled = true, priority = 1, description = "US-0099:Supervisor - Approve / Override Safety Assessment selecting safe/unsaf/conditionallly submitting Intake and taking case Id", groups = {
			"Medium", "ACIS_Regression", "Akash" })
	public void submitIntake() throws AcisException, InterruptedException, IOException {

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
				screeningDecision_OmniscriptPage.cancelButton();
				allegationReportPage.verifyingAllegationReportStatus();
				investigationCaseId = allegationReportPage.getInvestigationCaseID();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-0320 Investigation - Add Person(s) Omniscript Allegation Approval");

		}
	}

	@Test(enabled = false, priority = 2, description = "US-0099:Supervisor - Approve / Override Safety Assessment selecting safe/unsaf/conditionallly adding person", groups = {
			"Medium", "ACIS_Regression", "Akash" })
	public void riskAssessment() throws AcisException, InterruptedException, IOException {
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
		try {
			if (count == 2) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(investigationCaseId);
				investigationCasePage.clickRelatedTab();
				investigationCasePage.clickCasePersonTab();
				investigationCasePage.clickAddInvestigationPersonButtonVerfiying();
				
				personInvovled_IP_OmniScriptPage.clickNextButton();
				establishRelations_IP_OmniScriptPage.clickCreateAddButton();
				establishRelations_IP_OmniScriptPage.searchText(firstPerson, "Person");
				establishRelations_IP_OmniScriptPage.searchText(secondPerson, "Related");
				establishRelations_IP_OmniScriptPage.clickSaveButton();
				establishRelations_IP_OmniScriptPage.verifyRequired();
				establishRelations_IP_OmniScriptPage.setRelationShip("Child-Mother");
				establishRelations_IP_OmniScriptPage.clickSaveButton();
				establishRelations_IP_OmniScriptPage.submitSafetyAssesment();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-0320 Investigation - Add Person(s) Omniscript Investigator");

		}
	}

	@Test(enabled = false,priority = 3,  description = "US-0099:Supervisor - Approve / Override Safety Assessment selecting safe/unsaf/conditionallly", groups = {
			"Medium", "ACIS_Regression", "Akash" })
	public void mandatorySearchNonExixtingPerson() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(investigationCaseId);
		investigationCasePage.clickRelatedTabOfInvestigation();
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
		assessTheHome_SA_OmniScriptPage.setDate();
		assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
		safetyScale_SA_OmniScriptPage.clickNextButton();
		safetyDecision_SA_OmniScriptPage.clickEditonPerticipant(victim);
		safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
		safetyDecision_SA_OmniScriptPage.clickEditonPerticipant(maltreator);
		safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("Unsafe");
	}

}
