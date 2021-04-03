package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ChildWelfareSupervisorHomeDashboardTest extends TestBase {

	public ChildWelfareSupervisorHomeDashboardTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(ChildWelfareSupervisorHomeDashboardTest.class);

	String allegationID_1, allegationID_2 ,riskAssessmentID ,safetyAssessmentID ,caseID1 ;
	int previousIntakeCount ,previousInvestigatorCount , newIntakeCount, newInvestigatorCount ;
	int count1,count2,count3;
	String firstName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 4);
	 String middleName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
	 String lastName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 4);

	 String secondfirstName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"), 4);
	 String secondmiddleName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"), 3);
	 String secondlastName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"), 4);

	 String  maltreator = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
	 String victim = secondfirstName.concat(" ").concat(secondmiddleName).concat(" ").concat(secondlastName);
	
	
	
	@Test(description = " US:0097 Child Welfare Supervisor Home Page Dashboard - Intake ID Creation", groups = { "High",
			"acisRegression", "Mrunal" } , priority = 0)

	public void childWelfareSupervisorHomeDashboardIntakeCreation() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
		
 		String firstName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 4);
		 String middleName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
		 String lastName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 4);

		 String secondfirstName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"), 4);
		 String secondmiddleName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"), 3);
		 String secondlastName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"), 4);

		 String  victim1 = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
		 String maltreator1 = secondfirstName.concat(" ").concat(secondmiddleName).concat(" ").concat(secondlastName);
			
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
		// Options : newCase||existingCase
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator1,victim1);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
	    allegationID_1=allegationReportPage.getAllegationID();
	    
	    count1++;
		
	}
	
	@Test(description = " US:0097 Child Welfare Supervisor Home Page Dashboard - Intake ID Validation", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 1)

	public void childWelfareSupervisorHomeDashboardIntake() throws AcisException, Exception {
	
		if(count1==1) 
		{
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowHome();
			supervisorHomePage.clickViewAllIntakeID();
			supervisorHomePage.sortIntakeIDColumn("Descedning");
			supervisorHomePage.checkIDPresent(allegationID_1);
			supervisorHomePage.switchToDefaultContent();
			homePage_SFDCPage.closeTabs();
		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Intake ID Validation  Does Not completed Successfully, so can not run this test");
	 	}
	  
		
	}
	
	@Test(description = " US:0097 Child Welfare Supervisor Home Page Dashboard - Assessments ID Validation : IntakeCreation", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 2)

	public void childWelfareSupervisorHomeDashboardAssessmentsIntakeCreation() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
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

		createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
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
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
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
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
	    allegationID_2=allegationReportPage.getAllegationID();
	    count2++;
	   	}
	
	@Test(description = " US:0097 Child Welfare Supervisor Home Page Dashboard - Assessments ID Validation : Supervirsor", groups = { "High",
			"acisRegression", "Mrunal" } , priority = 3)

	public void childWelfareSupervisorHomeDashboardAssessmentsSupervisor() throws AcisException, Exception {
	    
		if(count2==1)
		{
			/*login to supervisor to check*/
		    userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowHome();
			supervisorHomePage.clickViewAllCaseload();
			previousIntakeCount=supervisorHomePage.getCount("Intake");
			homePage_SFDCPage.switchToDefaultContent();
			homePage_SFDCPage.refreshPage();
			homePage_SFDCPage.closeTabs();
			
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID_2);
			allegationReportPage.clickIntakeBtn();
			reportDetailsOmniscriptPage.clickNextBtn();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectAcceptAssign();
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatus();
			homePage_SFDCPage.closeTabs();
			
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID_2);
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			caseID1= caseActionPage.getCaseActionID();
			count2++;
		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Assessments ID Validation  Does Not completed Successfully, so can not run this test");
	 	}
	  
		
		
	}

	
	@Test(description = " US:0097 Child Welfare Supervisor Home Page Dashboard - Assessments ID Validation", groups = { "High",
			"acisRegression", "Mrunal" } , priority = 4)

	public void childWelfareSupervisorHomeDashboardAssessments() throws AcisException, Exception {
		
		if(count2==2) {
			/*login to supervisor to check*/
		    userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(caseID1);
			
			/*Create Risk & Safety Assessments*/
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAssessmentsTab();
			investigationCasePage.clickNewSafetyAssessmentButton();
			
			reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
			establishRelations_SA_OmniScriptPage.clickNextButton();
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
			safetyDecision_SA_OmniScriptPage.safetyDecissions("safe");
			safetyDecision_SA_OmniScriptPage.submitSafetyAssesment();
			investigationSafetyAssessmentPage.closeSafetyAssessmentsTab();
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAssessmentsTab();
			riskAssessmentID = investigationSafetyAssessmentPage.getAssessmentID("RiskAssessment");
			safetyAssessmentID =investigationSafetyAssessmentPage.getAssessmentID("SafteyAssessment");
			
			/*Create Workflow*/
			investigationCasePage.clickInvestigationWorkflow();
			reviewAllegationReport_OmniScriptPage.clickNextButton();
			establishRelationships__OmniScriptPage.clickCreateAddButton();
			establishRelationships__OmniScriptPage.searchText(maltreator, "Person");
			establishRelationships__OmniScriptPage.setRelationShip("Father-Child");
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
			recordReview_OmniScriptPage.showViewRecord();
			investigationReviesPage.checkReviewedCheckBox();
			recordReview_OmniScriptPage.clickRefresh();
			recordReview_OmniScriptPage.nextPage();
			findings_OmniScriptPage.addAllegation("Substantiated", maltreator);
			findings_OmniScriptPage.clickonSubmitButton();
			
			/*Change Invg Case Owner to ACIS Intake*/
			caseActionPage.clickDetailsTab();
			detailsCaseActionPage.provideCaseOwnerValue("ACIS Intake");
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowHome();
			supervisorHomePage.clickViewAllCaseload();
			newIntakeCount=supervisorHomePage.getCount("Intake");
			supervisorHomePage.compareCount(previousIntakeCount, newIntakeCount);
			supervisorHomePage.switchToDefaultContent();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowHome();
			
			/*check Risk & Safety Assessment Id*/
			supervisorHomePage.clickViewAllAssessments();
			supervisorHomePage.sortAssessmentsColumn("Descedning");
			supervisorHomePage.checkIDPresent(riskAssessmentID);
			supervisorHomePage.checkIDPresent(safetyAssessmentID);
			supervisorHomePage.switchToDefaultContent();
			homePage_SFDCPage.closeTabs();
			
			/*check Case ID*/
			homePage_SFDCPage.clickDownArrowHome();
			supervisorHomePage.clickViewAllCaseActions();
			supervisorHomePage.sortCaseActionsIDColumn("Descedning");
			supervisorHomePage.checkIDPresent(caseID1);
			supervisorHomePage.switchToDefaultContent();
			homePage_SFDCPage.closeTabs();

		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Assessments ID Validation  Does Not completed Successfully, so can not run this test");
	 	}
	  
		
	}

	
	@Test(description = " US:0097 Child Welfare Supervisor Home Page Dashboard - Investiagtion Count Validation", groups = { "High",
			"acisRegression", "Mrunal" } , priority = 5)

	public void childWelfareSupervisorHomeDashboardInvestigationCount() throws AcisException, Exception {
	 
		 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowHome();
			supervisorHomePage.clickViewAllCaseload();
			previousInvestigatorCount =supervisorHomePage.getCount("Investigator");
			supervisorHomePage.switchToDefaultContent();
			homePage_SFDCPage.closeTabs();
			count3++;
			
			
	}
	
	@Test(description = " US:0097 Child Welfare Supervisor Home Page Dashboard - Investiagtion Count Validation", groups = { "High",
			"acisRegression", "Mrunal" } , priority = 6)

	public void childWelfareSupervisorHomeDashboardInvestigationCountSupervisor() throws AcisException, Exception {
		 
		if(count3==1 && count2==2) 
		{
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();	
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(caseID1);
			caseID1= caseActionPage.getCaseActionID();
			caseActionPage.clickDetailsTab();
			detailsCaseActionPage.provideCaseOwnerValue("ACIS Investigator");
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowHome();
			supervisorHomePage.clickViewAllCaseload();
			newInvestigatorCount =supervisorHomePage.getCount("Investigator");
			supervisorHomePage.compareCount(previousInvestigatorCount, newInvestigatorCount);
			supervisorHomePage.switchToDefaultContent();
			homePage_SFDCPage.closeTabs();
		
		}
		else
		{
			throw new Exception("Pre-requisite for nvestiagtion Count Validation Does Not completed Successfully, so can not run this test");
		}
		
	}
}
