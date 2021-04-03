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

/**
 * This class contains verify MSA Login Page functionality
 * 
 * @author Nivedita.Yeolekar
 * @since 31 July 2019
 * 
 */
public class MSALoginPageTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(MSALoginPageTest.class);
	public static String EXCEPTION_MESSAGE = "Exception occured in executing test case : ";

	public MSALoginPageTest() throws AcisException {

	}

	/*Markup m;

	*//**
	 * This test case will verify UI for MSA Login page
	 * 
	 * @author Nivedita.Yeolekar
	 * @since 31 July 2019
	 *//*

	@Test(description = "TC-2891:Loading MSA login page", groups = { "Nivedita", "Low", "iLMS_Regression" })
	public void verifyMSALoginPage() throws AcisException {
		try {

			msaLogin.verifyMSALoginPageLoaded().verifyHomeLinkOnMSALogin().verifylinkForgotPasswordMSALogin();

		} catch (Exception e) {
			getStackTrace(e, "Failed to verify UI of MSA Login Page");
		}
	}

	*//**
	 * This test case is to verify MSA login page functionality for invalid/ Valid
	 * credentials
	 * 
	 * @author Nivedita.Yeolekar
	 * @since 31 July 2019
	 * 
	 *//*
	@Test(description = "TC-2892, TC-2894,TC-2895,TC-2896,TC-2893:Verify MSA login page for invalid & valid input data", groups = {
			"Nivedita", "Low", "iLMS_Regression" })
	public void verifyMSALoginWithValidInvalidUserNameAndPassword() throws AcisException, InterruptedException {
		try {

			
			// TC-2892:Login with Invalid Username and Valid Password
			m = MarkupHelper.createLabel("TC-2892:Login with Invalid username and Valid Password ", ExtentColor.CYAN);
			testCaseLogger.get().log(Status.INFO, m);
			userLogin.loginUserToApplication("invalidUsername",
					testData.get(Constants.LOGINPAGE_SHEET).get("password"));

			msaLogin.verifyInvalidMSALogin();

			// TC-2894:Login with Valid Username and Invalid password
			m = MarkupHelper.createLabel("TC-2894:Login with Valid Username and Invalid password ", ExtentColor.CYAN);
			testCaseLogger.get().log(Status.INFO, m);
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("userName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("invalidPassword"));
			msaLogin.verifyInvalidMSALogin();

			// TC-2895:Login with Invalid Username and Invalid password
			m = MarkupHelper.createLabel("TC-2895:Login with Invalid Username and Invalid Password ", ExtentColor.CYAN);
			testCaseLogger.get().log(Status.INFO, m);
			userLogin.loginUserToApplication("invalidUsername",
					testData.get(Constants.LOGINPAGE_SHEET).get("invalidPassword"));
			msaLogin.verifyInvalidMSALogin();

			// TC-2896:Login with blank Username and Password
			m = MarkupHelper.createLabel("TC-2896:Login with Blank Username and Password ", ExtentColor.CYAN);
			testCaseLogger.get().log(Status.INFO, m);
			userLogin.loginUserToApplication("", "");

			msaLogin.verifyEnterBlankUserNameAndPasswordErrorMessageMSALogin().verifyInvalidMSALogin();

			// TC-2893:Login to MSA with valid login credentials
			m = MarkupHelper.createLabel("TC-2893:Login with valid login credentials ", ExtentColor.CYAN);
			testCaseLogger.get().log(Status.INFO, m);
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("userName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("password"));
			msaLogin.verifyLoggedInAsSuperAdmin();
			home.clickLogout();
		} catch (Exception e) {
			getStackTrace(e, "Failed to verify MSA login page for for invalid & valid input data");

		}

	}*/
}
