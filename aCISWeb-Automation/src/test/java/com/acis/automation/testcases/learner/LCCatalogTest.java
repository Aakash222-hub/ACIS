package com.acis.automation.testcases.learner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

/**
 * This class contains test scripts related to Catalog tab of Learner
 * 
 * @author shahenshaha.mulani
 *
 */

public class LCCatalogTest extends TestBase {

	public LCCatalogTest() throws AcisException {
		super();
	}

	final static Logger logger = LoggerFactory.getLogger(LCCatalogTest.class);

	/**
	 * This method will Verify Catalog - Course with Closed Enrollment
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 30 October 2019
	 */

	@Test(description = "TC-496:Verify Catalog - Course with Closed Enrollment", groups = { "Medium", "iLMS_Regression",
			"Shahenshaha" })

	public void verifyCatalogCourseWithClosedEnrollment() throws AcisException {
		/*try {
			catalog.hoverOnCoursesMenu();
			catalog.clickOnCatalogMenuLink().clickOnSettingsTab().clickOnDisplayCatalogCheckbox().clickOnSaveButton();
			scormCmi5.hoverOnCoursesMenu();
			scormCmi5.clickOnSCORMCMI5MenuLink()
					.clickOnCourseName(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName8"))
					.clickOnExpandIconOnCatalogSettingsLeftPane().clickOnDisplayCatalogCheckbox()
					.clickSaveButtonOnCatalog().closeWindowsExceptParent();
			users.hoverOnUsersMenu();
			users.clickOnUsersLinkFromUsers().searchUserByEmail(testData.get(Constants.USERS_SHEET).get("User1_Email"))
					.clickOnSearchedUserLink().clickOnLoginAsThisUserLink();
			lcCatalog.clickOnCatalogLinkFromLC();
			lcMyCourses.enterTextInSearchTextbox(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName8"))
					.clickOnSearchIcon();
			lcCatalog.verifyClosedEnrollmentLink().verifyViewDetailsLink().closeWindowsExceptParent();
		} catch (Exception e) {
			getStackTrace(e, "Failed to verify Catalog - Course with Closed Enrollment ");
		}*/
	}
}
