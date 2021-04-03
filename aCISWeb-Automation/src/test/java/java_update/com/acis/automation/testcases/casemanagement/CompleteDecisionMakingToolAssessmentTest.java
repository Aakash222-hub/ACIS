package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class CompleteDecisionMakingToolAssessmentTest extends TestBase{

	public CompleteDecisionMakingToolAssessmentTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String fosterCaseID, assessmentID;
	

	@Test(description = "S-325 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 0)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
			    homePage_SFDCPage.clickFirstRecord();
				fosterCaseID = caseHeadPage.newFosterCase();
				
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-325 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}
	
	
	@Test(description = "S-325 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 1)
	public void ApproveDecisionMakingTool() throws AcisException, InterruptedException, IOException {
		try {
			
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickRelatedTab();
				fosterCareCase_Page.relatedAssessment();
				fosterCareCase_Page.clickDecisionMakingTool();
				
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-325 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}
	
	@Test(description = "S-325 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 2)
	public void CreateDecisionMakingTool() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickRelatedTab();
				fosterCareCase_Page.relatedAssessment();
				fosterCareCase_Page.clickDecisionMakingTool();
				safetyScale_SA_OmniScriptPage.selectUnableDefend("Yes");
				safetyScale_SA_OmniScriptPage.selectDrugAlcohol("Yes");
				safetyScale_SA_OmniScriptPage.selectDeniedMedical("No");
				safetyScale_SA_OmniScriptPage.selectHazardousUnsanitary("No");
				safetyScale_SA_OmniScriptPage.selectSpousalAbuse("Yes");
				safetyScale_SA_OmniScriptPage.selectPromoteViolence("No");
				safetyScale_SA_OmniScriptPage.submitBtn();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-325 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}
		
	@Test(description = "S-325 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 3)
	public void fetchAssessmentId() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickRelatedTab();
				fosterCareCase_Page.relatedAssessment();
				assessmentID=safetyScale_SA_OmniScriptPage.fetchAssessmentId();
				
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-325 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}
	
	
	@Test(description = "S-325 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 4)
	public void supervisorDashboard() throws AcisException, InterruptedException, IOException {
		try {
			
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowHome();
				homePage_SFDCPage.clickOnMyAssessmentReview();
				homePage_SFDCPage.searchDecisionMakingTool(assessmentID);
				safetyScale_SA_OmniScriptPage.statusApprove();
				safetyScale_SA_OmniScriptPage.submitBtn();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-325 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}
}
