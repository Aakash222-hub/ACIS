package com.acis.automation.testcases.investigation;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class CustomButtonVisibilityforIntakeUsersTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(CustomButtonVisibilityforIntakeUsersTest.class);

	public CustomButtonVisibilityforIntakeUsersTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String investigationID;
	String professionalData1 = testData.get(Constants.InvestigationSafetyFeature).get("professionalText1");

	// Adding data
	@Test(priority = 0, description = "S-0802 Investigation:Custom Button Visibility for Intake Users (Investigations)", groups = {
			"Medium", "ACIS_Regression", "Priyanka" })
	public void getInvestigationID() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseActions();
			homePage_SFDCPage.selectMyInvestigation();
			investigationCasePage.clickFirstRecord();
			investigationID = investigationCasePage.getInvestigationID();

			investigationCasePage.clickRelatedTab();

			mandatoryPersonSearchSafetyAssesmentPage.clickNewSafetyAssessment();
			reviewAllegationReport_OmniScriptPage.clickNextButton();
			investigationSafetyAssessmentPage.provideDateInterview();
			interviewChildren_SA_OmniScriptPage.prvoideType("Visit");
			interviewChildren_SA_OmniScriptPage.prvoideSubType("Child");
			interviewChildren_SA_OmniScriptPage.enterTextUsingJavascriptFieldValueOnInterviewChildren("narrative",
					"narrativeText");
			interviewChildren_SA_OmniScriptPage
					.enterTextUsingJavascriptFieldValueOnInterviewChildren("profesionalopinion", professionalData1);
			interviewChildren_SA_OmniScriptPage.clickSavebutton();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					" Failed :S-802 Investigation :Custom Button Visibility for Intake Users (Investigations)");

		}
	}

	// A-001649
	@Test(enabled = true, description = "S-0802 Investigation:Custom Button Visibility for Intake Users (Investigations)", groups = {
			"Medium", "acisRegression", "Priyanka" }, priority = 2)
	public void VerifyAccessToIntakeUser() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(investigationID);
			investigationCasePage.verifyAccessToInvestigationWorkflow();
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAssessment();
			investigationCasePage.verifyAccessToNewSafetyAssessmentButton();
			investigationCasePage.verifyAccessTodecisionMakingTool();
			investigationCasePage.clickAssessmentFirstRecord();
			investigationCasePage.verifyAccessToEditSafetyAssessmentButton();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed :S-802 Investigation :Custom Button Visibility for Intake Users (Investigations)");
		}
	}

	@Test(enabled = true, description = "S-0802 Investigation:Custom Button Visibility for Intake Users (Investigations)", groups = {
			"Medium", "acisRegression", "Priyanka" }, priority = 3)
	public void VerifyAccessToContractManagerUser() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("contractManagerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("contractManagerPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseActions();
			homePage_SFDCPage.selectAllCaseHeads();
			homePage_SFDCPage.searchGlobalAccountRecord(investigationID);
			investigationCasePage.verifyAccessToInvestigationWorkflow();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed :S-802 Investigation :Custom Button Visibility for Intake Users (Investigations)");
		}
	}

	@Test(enabled = true, description = "S-0802 Investigation:Custom Button Visibility for Intake Users (Investigations)", groups = {
			"Medium", "acisRegression", "Priyanka" }, priority = 1)
	public void VerifyAccessToLicensingUser() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(investigationID);
			investigationCasePage.verifyAccessToInvestigationWorkflow();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed :S-802 Investigation :Custom Button Visibility for Intake Users (Investigations)");
		}
	}
}
