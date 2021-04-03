package com.acis.automation.testcases;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.AdminLoginPage;
import com.acis.automation.pages.UserLoginPage;
//import com.iel.automation.pages.msa.organizations.OrganizationsPage;
import com.acis.automation.utilities.AcisException;

/**
 * This class is for creating test cases for Add Organization page
 * 
 * @author Suraiya.Mulani
 *
 */
public class AddOrganizationTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(AddOrganizationTest.class);

	AdminLoginPage login;
	//OrganizationsPage org;

	/**
	 * Default constructor to invoke Base class constructor
	 * 
	 * @throws AcisException
	 */

	public AddOrganizationTest() throws AcisException {

	}

	/**
	 * This test case is to verify Add organization functionality end to end
	 * 
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 23 July 2019
	 * 
	 */
	@Test(description = "verifyAddOrganization")
	public void verifyAddOrganization() throws AcisException {
		/*try {
			userLogin = new UserLoginPage();
			login = new AdminLoginPage();
			org = new OrganizationsPage();

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("userName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("password"));

			org.hoverOnOrganizationsMenu();
			org.clickOnOrganizationsLink().clickOnAddOrgLink().enterOrgName().enterCustomURL().enterFirstName()
					.enterLastName().enterEmailID().enterPassword().selectiComposer().selectInstructor()
					.clickSavebutton().verifyOrgCreation();
			logger.info("Test executed successfully");
		} catch (Exception e) {

			getStackTrace(e, "Failed to verify Add organization functionality end to end");

		}*///sk changes
	}

}
