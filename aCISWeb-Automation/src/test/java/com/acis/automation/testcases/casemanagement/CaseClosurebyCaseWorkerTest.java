package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class CaseClosurebyCaseWorkerTest extends TestBase {

	public CaseClosurebyCaseWorkerTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(description = "S-0725: Out-of-Home Services Case Closure by Case Worker", groups = { "High",
			"ACIS_Regression", "Khushboo" })

	public void caseclosure() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowCaseHead();
		caseHeadPage.createNewCaseHead("Case");
		caseHeadPage.newFosterCase();
		caseHeadPage.clickRelatedTab("First Related tab");
		caseHeadPage.openCaseHead();
		caseHeadPage.clickRelatedTab("Second Related tab");
		caseHeadPage.clickOnNewPerson();
		establishRelationships_CP_OmniScriptPage.clickCreateAddButton();
		personsInvovled_CP_OmniscriptPage.searchNewPerson("moter");
		personsInvovled_CP_OmniscriptPage.setAllNames("first", "chgnhy", "abc", "child");
		personsInvovled_CP_OmniscriptPage.prvoideSuffix("first", "I");
		personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2005");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
		personsInvovled_CP_OmniscriptPage.clickNextButton();
		establishRelationships_CP_OmniScriptPage.clickSubmit();
		caseHeadPage.clickRelatedTab("Second Related tab");
		caseActionPage.openCasePerson();
		detailsPersonTabPage.clickDetailsTab();
		detailsPersonTabPage.editDateOfDeath("2020");
		detailsPersonTabPage.clickOnSaveButton();
		caseActionPage.refreshPage();
		caseActionPage.openCaseActionTab();
		caseActionPage.openCaseclosure();
		caseActionPage.refreshPage();
		caseActionPage.fetchComments();

	}
}