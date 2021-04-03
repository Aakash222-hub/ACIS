package com.acis.automation.testcases.casemanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class SprintFeedbackOnUserStoryTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(SprintFeedbackOnUserStoryTest.class);

	public SprintFeedbackOnUserStoryTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	String investigationID;
	// Adding data
	@Test(priority=0,description = "S-695 Case Management - Sprint 12 Feedback User Story", groups = { "Medium",
			"ACIS_Regression", "Priyanka" })
	public void getInvestigationID() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseActions();
			homePage_SFDCPage.selectMyInvestigation();
			investigationCasePage.clickFirstRecord();
			investigationID=investigationCasePage.getInvestigationID();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed :S-695 Case Management - Sprint 12 Feedback User Story");

		}
	}

	// A-001649
	@Test(enabled = true, description = "S-695 Case Management - Sprint 12 Feedback User Story-Verify Response Time Met value", groups = {
			"Medium", "acisRegression", "Priyanka" }, priority = 1)
	public void FeedbackUserStory() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(investigationID);

			interactionDetailPage.clickRelatedTab();
			fosterCareCase_Page.clickInteractionsTab();
			fosterCareCase_Page.clickNewInteraction();
			newCollateralPage.selectRadioButton();
			newCollateralPage.selectDate();
			newCollateralPage.setText("CollateralName", "name");
			newCollateralPage.setSubtype("medical");
			newCollateralPage.setText("Narrative", "name");
			newCollateralPage.setText("ProfessionalOpinion", "name");
			newCollateralPage.clickSave();
			// interactionDetailPage.clickInteractionId();
			interactionDetailPage.clickEditDateTimeButton();
			interactionDetailPage.selectDateTime();
			interactionDetailPage.clickSavebutton();
			interactionDetailPage.clickcaseIdOnInteractionPage();
			caseActionPage.clickOnDetailsTab();
			detailsCaseActionPage.checkResponseTimeMetValue("No");

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:695 Case Management - Sprint 12 Feedback User Story");
		}
	}

}
