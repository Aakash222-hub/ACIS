package com.acis.automation.testcases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.HomePage;
import com.acis.automation.pages.UserLoginPage;
import com.acis.automation.utilities.AcisException;

/**
 * This class is for creating test cases for Login page

 *
 */
public class LoginTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(LoginTest.class);
	//AdminLoginPage login;
	HomePage home;

	/**
	 * Default constructor to invoke Base class constructor
	 * 
	 * @throws AcisException
	 */
	public LoginTest() throws AcisException {
	}

	/**
	 * This test case is to verify valid login functionality
	 * 
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * 
	 */
	@Test(description = "Verify Login for Valid Credentials", priority = 1)
	public void verifyLogin() throws AcisException {
		try {
			userLogin = new UserLoginPage();
			home = new HomePage();

			logger.info("Test execution started");
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();
			

		} catch (Exception e) {
			getStackTrace(e, "Failed to verify valid login functionality");
		}
	}

	/**
	 * This test case is to verify login functionality for invalid credentials
	 * 
	 * @throws Exception
	 * 
	 * @throws AcisException
	 * 
	 */
	@Test(description = "Verify Login for InValid Credentials")
	public void verifyInvalidLogin() throws Exception, AcisException {
		try {
			userLogin = new UserLoginPage();
			home = new HomePage();
			logger.info("Test execution started");
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("invalidPassword"));
			home.verifyLogin();
		} catch (Exception e) {
			getStackTrace(e, "Failed to verify valid login functionality for invalid credentials");

		}

	}

}
