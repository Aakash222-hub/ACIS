package com.acis.automation.testcases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;
//import com.iel.automation.pages.msa.organizations.OrganizationsPage;

/**
 * This class contains verify Admin Login Page functionality
 * 
 * @author Suraiya.Mulani
 * 
 */
public class OrgAdminLoginPageTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(OrgAdminLoginPageTest.class);
	public static String EXCEPTION_MESSAGE = "Exception occured in executing test case : ";

	public OrgAdminLoginPageTest() throws AcisException {

	}

	Markup m;

	/**
	 * This method will verify register a new user menu
	 * 
	 * @throws AcisException
	 * 
	 * @author Suraiya.Mulani
	 * @since 11 June 2019
	 */

	// This test will verify Admin Login PAge UI

	@Test(description = "TC-2909, 2910 :Verify Admin login page", groups = { "Suraiya", "Low", "iLMS_Regression" })

	public void verifyAdminLoginPage() throws AcisException {
		/*try {

			m = MarkupHelper.createLabel("Admin login page verification for TC- 2909 ", ExtentColor.CYAN);
			testCaseLogger.get().log(Status.INFO, m);

			// 2909
			adminlogin.navigateToApp(configProperties.adminDefaulturl());

			adminlogin.testLoggerInfo("Navigated to Admin URL : " + configProperties.adminDefaulturl());
			logger.info("Navigated to Admin URL : " + configProperties.adminDefaulturl());
			adminlogin.verifyAdminLoginPageLoaded();

			m = MarkupHelper.createLabel("Admin login page verification for TC- 2910 ", ExtentColor.CYAN);
			testCaseLogger.get().log(Status.INFO, m);

			// 2910
			adminlogin.navigateToApp(configProperties.adminCustomturl() + OrganizationsPage.strcustomURL);
			adminlogin.testLoggerInfo("Navigated to Admin Portal URL : " + configProperties.adminCustomturl()
					+ OrganizationsPage.strcustomURL);
			logger.info("Navigated to Admin Portal URL : " + configProperties.adminCustomturl()
					+ OrganizationsPage.strcustomURL);

			adminlogin.verifyAdminPortalLoginPageLoaded();

		} catch (Exception e) {
			getStackTrace(e, "Failed to verify UI of Login Page for Admin");
		}*/// sk changes
	}

	/**
	 * This test case is to verify Admin login functionality for invalid/ Valid
	 * credentials
	 * 
	 * @throws Exception
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @throws InterruptedException
	 * 
	 * @since 11 June 2019
	 * 
	 */
	@Test(description = "TC-2912, 2913, 2914, 2915,2916 :Verify Admin login page for invalid/ valid data ", groups = {
			"Suraiya", "Low", "iLMS_Regression" })
	public void verifyInvalidLogin() throws AcisException, InterruptedException {
		try {

			adminlogin.navigateToApp(configProperties.adminDefaulturl());
			adminlogin.testLoggerInfo("Navigated to Admin URL : " + configProperties.adminDefaulturl());
			logger.info("Navigated to Admin URL : " + configProperties.adminDefaulturl());

			m = MarkupHelper.createLabel("Admin login page verification for TC- 2912 ", ExtentColor.CYAN);
			testCaseLogger.get().log(Status.INFO, m);

			// 2912

			adminlogin.loginToApplicationForTestCase("invalidUsername",
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));

			adminlogin.verifyInvalidLogin();

			m = MarkupHelper.createLabel("Admin login page verification for TC- 2913 ", ExtentColor.CYAN);
			testCaseLogger.get().log(Status.INFO, m);

			// 2913
			adminlogin.loginToApplicationForTestCase(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("invalidPassword"));

			adminlogin.verifyInvalidLogin();

			m = MarkupHelper.createLabel("Admin login page verification for TC- 2914 ", ExtentColor.CYAN);
			testCaseLogger.get().log(Status.INFO, m);

			// 2914

			adminlogin.loginToApplicationForTestCase("invalidUsername",
					testData.get(Constants.LOGINPAGE_SHEET).get("invalidPassword"));

			adminlogin.verifyInvalidLogin();

			m = MarkupHelper.createLabel("Admin login page verification for TC- 2915 ", ExtentColor.CYAN);
			testCaseLogger.get().log(Status.INFO, m);

			// 2915
			adminlogin.loginToApplicationWithBlankValues();

			adminlogin.verifyInvalidLogin();

			m = MarkupHelper.createLabel("Admin login page verification for TC- 2916 ", ExtentColor.CYAN);
			testCaseLogger.get().log(Status.INFO, m);

			// 2916
			adminlogin.loginToApplicationForTestCase(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));

			adminlogin.verifyLogin();

		} catch (Exception e) {
			getStackTrace(e, "Failed to verify Admin login page for invalid/ valid data");

		}

	}
}
