package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.casemanagement.NewComprehensiveAssessmentpage;
import com.acis.automation.utilities.AcisException;

public class ComprehensiveAssessmentCompletionDateTest extends TestBase {

	public ComprehensiveAssessmentCompletionDateTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(ComprehensiveAssessmentCompletionDateTest.class);

	@Test(description = "S-0597: Comprehensive Assessment Completion Date  by OOH Case Worker", groups = { "Medium",
			"ACIS_Regression", "Khushboo" })

	public void completionDate() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowCaseHead();
		homePage_SFDCPage.clickFirstRecord();
		caseHeadPage.clickRelatedTab("First Related tab");
		caseHeadPage.openCaseHead();
		newComprehensiveAssessmentpage.clickOnNewComprehenssieAssessment();
		newComprehensiveAssessmentpage.enterchild("Name:");
		newComprehensiveAssessmentpage.clickNextButton();
		newComprehensiveAssessmentpage.clickAddAssessment();
		newComprehensiveAssessmentpage.addAssessmentCategoryType("SocialHistory");
		newComprehensiveAssessmentpage.selectStartDate("2019");
	//	newComprehensiveAssessmentpage.enterComprehensiveAssessmentDetails("Demo");
		newComprehensiveAssessmentpage.clickonsave();
		newComprehensiveAssessmentpage.btnsubmit();
		newComprehensiveAssessmentpage.checkStatus();
	
}
}
