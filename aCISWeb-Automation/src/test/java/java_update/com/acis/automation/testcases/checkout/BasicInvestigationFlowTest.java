package com.acis.automation.testcases.checkout;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class BasicInvestigationFlowTest extends TestBase{

	public BasicInvestigationFlowTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(BasicInvestigationFlowTest.class);

	int count1;
	String allegationID,caseID;
	
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


	
	@Test(description = "Intake creation", groups = { "High",
			"acisRegression", "Mrunal" } , priority = 0)

	public void basicInvestigationFlowIntakeLogin() throws AcisException, InterruptedException, IOException {
	
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
			
			count1++;
	}
	
	@Test(description = " Intake Approval", groups = { "High",
			"acisRegression", "Mrunal" },priority = 1)

	public void basicInvestigationFlowApproval() throws AcisException, Exception {
	
		if(count1 ==1)
		{
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
			allegationReportPage.closeIntakeOmniscript();
			
			allegationReportPage.verifyingAllegationReportStatus();
			homePage_SFDCPage.closeTabs();
			
			count1++;
		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
	 	}
	  	
		
		
	}
	
	@Test(description = " Investigation Safety Assessment and Workflow - Investigation USer", groups = { "High",
			"acisRegression", "Mrunal" },priority = 2)

	public void basicInvestigationFlow() throws AcisException, Exception {
		
		if(count1==2)
		{
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			
			/*Safety Assessment flow*/
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAssessmentsTab();
			investigationCasePage.clickNewSafetyAssessmentButton();
			//Review Allegation page
			reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
			// Add new person
			personsInvolved_SA_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
			personsInvolved_SA_OmniscriptPage.linkToCreateNewPerson();
			personsInvolved_SA_OmniscriptPage.setAllNames(fourthfirstName, fourthmiddleName, fourthlastName);
			personsInvolved_SA_OmniscriptPage.clickSaveButton("next");
			personsInvolved_SA_OmniscriptPage.closeCreateIntakePerson();
			personsInvolved_SA_OmniscriptPage.clickRefresPersonButton();
			personsInvolved_SA_OmniscriptPage.clickNextButton();
			
			// Add relationship 
			establishRelations_SA_OmniScriptPage.clickCreateAddButton();
			establishRelations_SA_OmniScriptPage.searchTexT("Person", victim);
			establishRelations_SA_OmniScriptPage.setRelationShip("Child-Mother");
			establishRelations_SA_OmniScriptPage.searchTexT("Related", maltreator);
			establishRelations_SA_OmniScriptPage.clickSaveButton();
			establishRelations_SA_OmniScriptPage.clickNextButton();
			// Interview children
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
			interviewChildren_SA_OmniScriptPage.clickSavebutton();
			interviewChildren_SA_OmniScriptPage.switchToDefaultContent();
			interviewChildren_SA_OmniScriptPage.closeCaregiverTab();
			interviewChildren_SA_OmniScriptPage.clickNextButton();
			// Interview Care giver 
			interviewCaregivers_SA_OmniScriptPage.clickCreateChildrenInterviewLink();
			interview_OmniScriptPage.iframeSwitch();
			interviewCaregivers_SA_OmniScriptPage.provideDate();
			interviewCaregivers_SA_OmniScriptPage.prvoideType("Visit");
			interviewCaregivers_SA_OmniScriptPage.prvoideSubType("Child");
			interviewCaregivers_SA_OmniScriptPage.prvoideLocation("Biological Home");
			interviewCaregivers_SA_OmniScriptPage.prvoideMethod("FaceToFace");
			interviewCaregivers_SA_OmniScriptPage.enterTextFieldValueOnInterviewChildren("narrative", "Interviw narrative Demo");
			interviewCaregivers_SA_OmniScriptPage.enterTextFieldValueOnInterviewChildren("profesionalopinion","Interviw profesionalopinion Demo");
			interviewCaregivers_SA_OmniScriptPage.clickParticipantCheckbox(maltreator);
			interviewCaregivers_SA_OmniScriptPage.clickSavebutton();
			interviewCaregivers_SA_OmniScriptPage.switchToDefaultContent();
			interviewCaregivers_SA_OmniScriptPage.closeCaregiverTab();
			interviewCaregivers_SA_OmniScriptPage.clickNextButton();
			//Assess the home
			assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
			//Decision Making Tool page
			safetyScale_SA_OmniScriptPage.clickCreateAddButton();
			safetyScale_SA_OmniScriptPage.selectDeniedMedical("Yes");
			safetyScale_SA_OmniScriptPage.selectDrugAlcohol("No");
			safetyScale_SA_OmniScriptPage.selectHazardousUnsanitary("No");
			safetyScale_SA_OmniScriptPage.selectPromoteViolence("No");
			safetyScale_SA_OmniScriptPage.selectUnableDefend("Yes");
			safetyScale_SA_OmniScriptPage.selectSpousalAbuse("Yes");
			safetyScale_SA_OmniScriptPage.clickSave();
			safetyScale_SA_OmniScriptPage.clickNextButton();
			//Safety Decision
			safetyDecision_SA_OmniScriptPage.clickEditonPerticipant(victim);
			safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
			safetyDecision_SA_OmniScriptPage.clickEditonPerticipant(maltreator);
			safetyDecision_SA_OmniScriptPage.selectSafetyRecommendation("safe");
			safetyDecision_SA_OmniScriptPage.submitSafetyAssesment();
			investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
			investigationCasePage.closeAssessmentsTab();
		
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickInvestigationWorkflow();
			
			/* Workflow */
			
			reviewAllegationReport_OmniScriptPage.clickNextButton();
			// Add New Person
			personsInvovled_Workflow_OmniscriptPage.searchPersonUsingvalidData("firstName", "m");
			personsInvovled_Workflow_OmniscriptPage.linkToCreateNewPerson();
			personsInvovled_Workflow_OmniscriptPage.setAllNames(thirdfirstName, thirdmiddleName, thirdlastName);
			personsInvovled_Workflow_OmniscriptPage.clickSaveButton("next");
			personsInvovled_Workflow_OmniscriptPage.closeCreateIntakePerson();
			personsInvovled_Workflow_OmniscriptPage.clickRefresPersonButton();
			personsInvovled_Workflow_OmniscriptPage.clickNextButton();
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
			interview_OmniScriptPage.prvoideMethod("FaceToFace");
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
//			collaterals_OmniScriptPage.enterTextFieldValue("CollateralPhoneEmail", "+12345678");
			collaterals_OmniScriptPage.enterTextFieldValue("Narrative", "Test1 narrative");
			collaterals_OmniScriptPage.enterTextFieldValue("ProffesionalOpinion", "Test2 Professional ");
			collaterals_OmniScriptPage.clickSaveButton();
			collaterals_OmniScriptPage.closeCollateraltab();
			collaterals_OmniScriptPage.clickNextButton();
			// Record
			recordReview_OmniScriptPage.enterTextRecordReview("abc");
			recordReview_OmniScriptPage.clickNextButton();
			//Findings
			findings_OmniScriptPage.addAllegation("Substantiated", maltreator);
			findings_OmniScriptPage.clickonSubmitButton();
			
			count1++;		
			homePage_SFDCPage.closeTabs();
			
		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Intake Approval Does Not completed Successfully, so can not run this test");
	 	}
		
		
	}
	
	@Test(priority=3,description = "Investigation workflow Aprroval- Supervisor User", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void supervisorApprovalAccept() throws AcisException {
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
				caseID= caseActionPage.getCaseActionID();
				investigationCasePage.clickInvestigationWorkflow();
				reviewAllegationReport_OmniScriptPage.clickNextButton();
				personsInvovled_Workflow_OmniscriptPage.clickNextButton();
				establishRelationships__OmniScriptPage.clickNextButton();
				interview_OmniScriptPage.clickNextButton();
				// Collateral
				collaterals_OmniScriptPage.clickNextButton();
				// Record
				recordReview_OmniScriptPage.clickNextButton();
				findings_OmniScriptPage.clickonDepositionsradiobutton("Accept &Assign");
				findings_OmniScriptPage.clickonSubmitButton();
				
				
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(caseID);
				investigationCasePage.clickDetailsTab();
				detailsCaseActionPage.checkStatusValue("Approved");
				homePage_SFDCPage.closeTabs();
				
				count1++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed US-0103:Investigation - Add Person(s) for Exisiting Person");

		}
	}
}
