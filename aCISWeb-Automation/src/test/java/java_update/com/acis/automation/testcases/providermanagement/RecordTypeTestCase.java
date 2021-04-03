package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.caseplan.PermanencyPlan_OmniScriptPage;
import com.acis.automation.pages.caseplan.ServiceToProviderPage;
import com.acis.automation.pages.caseplan.VisitationPlan_OmniScriptPage;
import com.acis.automation.utilities.AcisException;

public class RecordTypeTestCase extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(RecordTypeTestCase.class);

	public RecordTypeTestCase() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(enabled = true, description = "US-0306 Record Type Labels and Descriptions", groups = { "High",
			"acisRegression", "Akash" },priority=0)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		recordTypePage.navigatingPersonPlacement();
		recordTypePage.verifyingPersonPlacement();
		recordTypePage.newCaseAction();
		recordTypePage.verifyIntakePreservation();
		recordTypePage.navigatingNewContact();
		recordTypePage.verficationInteractions();

	

	}
	@Test(enabled = true, description = "US-0306 Record Type Labels and Descriptions in Intake", groups = { "High",
			"acisRegression", "Akash" })
	public void CreatePlacementAccountIntake() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		recordTypePage.navigatingPersonPlacement();
		recordTypePage.verifyingPersonPlacement();
		recordTypePage.newCaseAction();
		recordTypePage.verifyIntakePreservation();
		recordTypePage.navigatingNewContact();
		recordTypePage.verficationInteractions();

		

	}
	
	@Test(enabled = true, description = "US-0306 Record Type Labels and Descriptions in Investigation", groups = { "High",
			"acisRegression", "Akash" })
	public void CreatePlacementAccountInvestigation() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		recordTypePage.navigatingPersonPlacement();
		recordTypePage.verifyingPersonPlacement();
		recordTypePage.newCaseAction();
		recordTypePage.verifyIntakePreservation();
		recordTypePage.navigatingNewContact();
		recordTypePage.verficationInteractions();

	

	}
	@Test(enabled = true, description = "US-0306 Record Type Labels and Descriptions in Investigation", groups = { "High",
			"acisRegression", "Akash" })
	public void CreatePlacementAccountAdmin() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		recordTypePage.navigatingPersonPlacement();
		recordTypePage.verifyingPersonPlacement();
		recordTypePage.newCaseAction();
		recordTypePage.verifyIntakePreservation();
		recordTypePage.navigatingNewContact();
		recordTypePage.verficationInteractions();



	}
}
