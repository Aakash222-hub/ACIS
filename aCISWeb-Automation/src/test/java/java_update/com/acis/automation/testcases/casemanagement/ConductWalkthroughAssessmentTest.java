package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ConductWalkthroughAssessmentTest extends TestBase{
	
	
	public ConductWalkthroughAssessmentTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(description = "US:0934 : Conduct Walkthrough Assessment : Placement Creation", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 0)

		public void conductWalkthroughAssessmentPlacementCreation() throws AcisException, InterruptedException, IOException {
		
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		home.verfiyHomePage();

		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount();
		homePage_SFDCPage.clickNewButton();
		placementResourcePage.selectRadioButton();
		placementResourcePage.setTextOnPlacement("AccountName", excel.generateRandomTestData(excel.generateRandomTestData("", 4), 3));
		placementResourcePage.clickOnSave();
		placementResourcePage.clickRelatedTab();
		placementResourcePage.clickAssessmentsTab();
		placementResourcePage.clickNewWalkthroughAssessments();
		placementResourcePage.provideAnswers("The pet", "Yes");
		placementResourcePage.provideAnswers("Medication", "Yes");
		placementResourcePage.provideAnswers("The home", "No");
		placementResourcePage.provideAnswers("Adequate Sleeping", "No");
		placementResourcePage.provideAnswers("Refrigeator", "No");
		placementResourcePage.clickSubmitButton();
		placementResourcePage.closeNewWalkthroughAssessmentsTab();
		placementResourcePage.closeAssessmentsTab();
		placementResourcePage.clickRelatedTab();
		placementResourcePage.clickAssessmentsTab();
		placementResourcePage.clickFirstAssessmentButton();
		placementResourcePage.verifyCreatedByValue("Supervisor");
		placementResourcePage.verifyLastModified();
		homePage_SFDCPage.closeTabs();
	}
}
