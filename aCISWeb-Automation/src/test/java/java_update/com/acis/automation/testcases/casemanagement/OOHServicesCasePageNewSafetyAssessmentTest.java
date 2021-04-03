package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.investigation.InvestigationCaseTest;
import com.acis.automation.utilities.AcisException;


public class OOHServicesCasePageNewSafetyAssessmentTest extends TestBase {

	public OOHServicesCasePageNewSafetyAssessmentTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	final static Logger logger = LoggerFactory.getLogger(OOHServicesCasePageNewSafetyAssessmentTest.class);
	
	String allegationID,fosterCaseID , fullName;
	int count;
	
	@Test(description = " US:0324 : OOH Services Case Page - New Safety Assessments : Intake creation", groups = { "High",
		"acisRegression", "Mrunal" }, priority = 0)

	public void oohServicesCasePageNewSafetyAssessmentIntake() throws AcisException, InterruptedException, IOException {
		try {

		String firstName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),4);
		String middleName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),3);
		String lastName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"),5);
		fullName = firstName+" "+middleName+" "+lastName;
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();

		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		
		createIntakePerson_OmniscriptPage.setAllNames(firstName,middleName,lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
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
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.selectCaseHead(fullName);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
//		screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.clickSubmitbtn();

		allegationID = allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		count++;

	} catch (Exception e) {
		// TODO Auto-generated catch block
		getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria intake creation");
	}

}

	@Test(description = " US:0324 : OOH Services Case Page - New Safety Assessments: Approval", groups = { "High",
		"acisRegression", "Mrunal" }, priority = 1)
	public void oohServicesCasePageNewSafetyAssessmentSupervisor() throws AcisException, Exception {
	if(count==1)
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
		
		count++;
	}
		else {
			throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
		}

	
}

	/*############# Child welfare User = Intake + Investigation + OOH case worker #######################*/
	
	/*#####################  Intake User dnt have permission to edit SA so not including ###########################*/

	@Test(description = " US:0324 : OOH Services Case Page - New Safety Assessments: Intake USer", groups = { "High",
			"aCIS_Regression", "Mrunal" },priority = 2)
	public void oohServicesCasePageNewSafetyAssessmentIntakeUser() throws AcisException, Exception {
	
	if(count==2)	
	{
		System.out.println("in test case 60");

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobal(allegationID);
		
		allegationReportPage.clickRelatedTab();
		allegationReportPage.clickonAlligationRecord();
		
		investigationCasePage.clickRelatedTab();
		investigationCasePage.clickAssessmentsTab();
		investigationCasePage.clickNewSafetyAssessmentButton();
		homePage_SFDCPage.closeTabs();
		
		
	}
	else {
		throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
	}
	
	}

	@Test(description = " US:0324 : OOH Services Case Page - New Safety Assessments: Investigation USer", groups = { "High",
			"aCIS_Regression", "Mrunal" },priority = 3)
	public void oohServicesCasePageNewSafetyAssessmentInvestigation() throws AcisException, Exception {
	
	if(count==2)	
	{
		System.out.println("in test case 60");

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobal(allegationID);
		
		allegationReportPage.clickRelatedTab();
		allegationReportPage.clickonAlligationRecord();
		
		investigationCasePage.clickRelatedTab();
		investigationCasePage.clickAssessmentsTab();
		investigationCasePage.clickNewSafetyAssessmentButton();
		homePage_SFDCPage.closeTabs();
		
	}
	else {
		throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
	}
	
	}

}
