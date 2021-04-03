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
import com.acis.automation.pages.providermanagement.FosterInquirySecondPage;
import com.acis.automation.utilities.AcisException;

public class FosterParentAccountPageTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(FosterParentAccountPageTest.class);

	public FosterParentAccountPageTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(enabled = true, description = "US-0296 Provider Management - Foster Parent Account Page", groups = { "High",
			"acisRegression", "Akash" }, priority = 0)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {

		String person = testData.get(Constants.AccountProviderManagemnt).get("Person");

		String namePerson = testData.get(Constants.AccountProviderManagemnt).get("namePerson");
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
		System.out.println(person);
		System.out.println(namePerson);
		home.verfiyHomePage();

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		accountPage.searchPersonAccount(namePerson, person);
		accountPage.verifyingFieldFosterParent();
	}

	@Test(enabled = true, description = "US-0296  Provider Management - Foster Parent Account Pageicensing worker- Portal Registration Page", groups = {
			"High", "acisRegression", "Akash" }, priority = 0)
	public void CreatePlacementAccountLicensing() throws AcisException, InterruptedException, IOException {

		String person = testData.get(Constants.AccountProviderManagemnt).get("Person");

		String namePerson = testData.get(Constants.AccountProviderManagemnt).get("namePerson");
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
		System.out.println(person);
		System.out.println(namePerson);
		home.verfiyHomePage();

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		accountPage.searchPersonAccount(namePerson, person);

		accountPage.verifyingFieldFosterParent();
	}
}
