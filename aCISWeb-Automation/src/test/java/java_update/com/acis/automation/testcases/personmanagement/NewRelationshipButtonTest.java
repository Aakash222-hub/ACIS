package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.casemanagement.ComprehensiveAssessmentCompletionDateTest;
import com.acis.automation.utilities.AcisException;

public class NewRelationshipButtonTest extends TestBase {

	public NewRelationshipButtonTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(NewRelationshipButtonTest.class);

	@Test(description = "S-0771: Too validate New ReleationShip  Button  by OOH Case Worker", groups = { "Large",
			"ACIS_Regression", "Khushboo" })

	public void NewRelationship() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowCaseHead();
		caseHeadPage.createNewCaseHead(excel.generateRandomTestData("Demo", 4));
		caseHeadPage.newFosterCase();
		caseHeadPage.clickRelatedTab("First Related tab");
		caseHeadPage.openCaseHead();
		caseHeadPage.clickRelatedTab("Second Related tab");
		caseActionPage.checkButtons("New Relationship");
		caseActionPage.checkButtons("New Person");
		caseActionPage.clickonNewRelationshipButton();

}
}