package com.acis.automation.testcases.learner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

/**
 * This class contains test scripts related to My Courses tab of Learner
 * 
 * @author shahenshaha.mulani
 *
 */

public class LCTranscriptTest extends TestBase {

	public LCTranscriptTest() throws AcisException {
		super();
	}

	/*final static Logger logger = LoggerFactory.getLogger(LCTranscriptTest.class);

	*//**
	 * This method will verify Certificate on User Transcript as per customize
	 * Certificate setting at Org level
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 23 October 2019
	 *//*

	@Test(description = "TC-572:Verify Certificate on User Transcript as per customize Certificate setting at org level", groups = {
			"High", "iLMS_Regression", "Chandrashekhar" })

	public void verifyUserCertificateAsPerCustomCerificateSettingsAtOrgLevel() throws AcisException {
		try {

			// enroll in SCORM 2
			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					"Status", "Pass", testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));

			userLogin.navigateToApp(configProperties.adminDefaulturl());
			userLogin.loginUserToApplication(testData.get(Constants.USERS_SHEET).get("User3_Email"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();
			LCTranscript.clickOnTranscriptFromLC().clickOnDetailView().clickOnViewCertificateLink()
					.clickCertificateIsOpenedInModelDialogPopup()
					.verifyCourseNameOnCertificate(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName4"))
					.verifyCompletedDateOnCertificate(convertDateFormat("MMM dd, yyyy", LCTranscript.getPastDate(0)))
					.verifyFirstNameLastNameOnCertificate(testData.get(Constants.USERS_SHEET).get("User3_FirstName"),
							testData.get(Constants.USERS_SHEET).get("User3_LastName"))
					.verifyCertificateNumberOnCertificate().verifyEmailCertificateLinkOnCertificate()
					.verifyPrintCertificateLinkOnCertificate().verifyDownloadCertificateLinkOnCertificate()
					.verifyHeaderFooterDoesNotDisplayedOnCustomizedCertificate().closeWindowsExceptParent();

			userLogin.navigateToApp(configProperties.adminDefaulturl());
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();
			emailNotifications.hoverOnSettingsMenu();
			emailNotifications.clickOnEmailNotificationslink().switchToEmailNotificationFrame()
					.clickOnGeneralExpandIcon().clickOnCourseCompletionCertificateLink()
					.selectCourseFromDropDownOnCustomCertificatePage(
							testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName4"))
					.enterHeaderFooterForCustomCertificate().clickOnSaveButtonOnCustomCertificate();
			home.clickLogout();

			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User2_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User2_ID"),
					"Status", "Pass", testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));

			userLogin.loginUserToApplication(testData.get(Constants.USERS_SHEET).get("User2_Email"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();

			LCTranscript.clickOnTranscriptFromLC().clickOnDetailView().clickOnViewCertificateLink()
					.clickCertificateIsOpenedInModelDialogPopup()
					.verifyCourseNameOnCertificate(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName4"))
					.verifyCompletedDateOnCertificate(convertDateFormat("MMM dd, yyyy", LCTranscript.getPastDate(0)))
					.verifyCertificateNumberOnCertificate().verifyEmailCertificateLinkOnCertificate()
					.verifyPrintCertificateLinkOnCertificate().verifyDownloadCertificateLinkOnCertificate()
					.verifyHeaderFooterDisplayedOnCustomizedCertificate().closeWindowsExceptParent();

		} catch (Exception e) {
			getStackTrace(e,
					"Failed to verify Certificate on User Transcript at Learner Center as per customize Certificate setting at org level");
		}

		finally {

			// Unenroll in SCORM 2
			ilmsAPI.unEnrollUserFromCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));
		
			userLogin.navigateToApp(configProperties.adminDefaulturl());
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();

		}
	}

	*//**
	 * This method will verify Certificate on User Transcript for non certification
	 * courses
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 23 October 2019
	 *//*

	@Test(description = "TC-581:Verify Certificate on User Transcript for non certification courses", groups = { "High",
			"iLMS_Regression", "Chandrashekhar" })

	public void verifyCertificateForNonCertificationCoursesOnUserTranscript() throws AcisException {
		try {

			// enroll in SCORM 2
			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					"Status", "Pass", testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));
			userLogin.navigateToApp(configProperties.adminDefaulturl());
			userLogin.loginUserToApplication(testData.get(Constants.USERS_SHEET).get("User3_Email"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();
			LCTranscript.clickOnTranscriptFromLC().clickOnDetailView().clickOnViewCertificateLink()
					.clickCertificateIsOpenedInModelDialogPopup()
					.verifyCourseNameOnCertificate(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName4"))
					.verifyCompletedDateOnCertificate(convertDateFormat("MMM dd, yyyy", LCTranscript.getPastDate(0)))
					.verifyFirstNameLastNameOnCertificate(testData.get(Constants.USERS_SHEET).get("User3_FirstName"),
							testData.get(Constants.USERS_SHEET).get("User3_LastName"))
					.verifyCertificateNumberOnCertificate().verifyEmailCertificateLinkOnCertificate()
					.verifyPrintCertificateLinkOnCertificate().verifyDownloadCertificateLinkOnCertificate()
					.clickDownloadCertificatetLink().getFileNameToVerifyContent("Certificate", ".pdf");
			LCTranscript.verifyCertificateIsDownloaded(LCTranscript.getFileToBeRead());

		} catch (Exception e) {
			getStackTrace(e, "Failed to verify Certificate on User Transcript for non certification courses");
		}

		finally {

			// Unenroll in SCORM 2
			ilmsAPI.unEnrollUserFromCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));

			userLogin.navigateToApp(configProperties.adminDefaulturl());
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();

		}
	}

	*//**
	 * This method will verify Certificate on User Transcript for certification
	 * courses
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 23 October 2019
	 *//*

	@Test(description = "TC-573:Verify Certificate on User Transcript for certification courses", groups = { "High",
			"iLMS_Regression", "Chandrashekhar" })

	public void verifyCertificateForCertificationEnabledCoursesOnUserTranscript() throws AcisException {
		try {

			// enroll in SCORM 2
			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course2_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					"Status", "Pass", testData.get(Constants.COURSES_SHEET).get("SCORM_Course2_ID"));

			users.hoverOnUsersMenu();
			users.clickOnUsersLinkFromUsers().searchUserByEmail(testData.get(Constants.USERS_SHEET).get("User3_Email"))
					.clickOnSearchedUserLink().clickOnTrascriptTab()
					.clickOnRecertifyIconForGivenCourse(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName2"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					"Status", "Pass", testData.get(Constants.COURSES_SHEET).get("SCORM_Course2_ID"));

			users.clickOnRecertifyIconForGivenCourse(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName2"));
			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					"Status", "Pass", testData.get(Constants.COURSES_SHEET).get("SCORM_Course2_ID"));
			users.clickOnLoginAsThisUserLink().clickOnTrascriptTab();
			LCTranscript.clickOnDetailView().clickOnViewCertificateLink().clickCertificateIsOpenedInModelDialogPopup()
					.verifyCourseNameOnCertificate(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName2"))
					.verifyCompletedDateOnCertificate(convertDateFormat("MMM dd, yyyy", LCTranscript.getPastDate(0)))
					.verifyFirstNameLastNameOnCertificate(testData.get(Constants.USERS_SHEET).get("User3_FirstName"),
							testData.get(Constants.USERS_SHEET).get("User3_LastName"))
					.verifyCertificateNumberOnCertificate().verifyEmailCertificateLinkOnCertificate()
					.verifyPrintCertificateLinkOnCertificate().verifyDownloadCertificateLinkOnCertificate()
					.clickDownloadCertificatetLink().getFileNameToVerifyContent("Certificate", ".pdf");
			LCTranscript.verifyCertificateIsDownloaded(LCTranscript.getFileToBeRead());

		} catch (Exception e) {
			getStackTrace(e,
					"Failed to verify Certificate on User Transcript at Learner Center for certification courses");
		}

		finally {

			// Unenroll in SCORM 2
			ilmsAPI.unEnrollUserFromCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course2_ID"));

			userLogin.navigateToApp(configProperties.adminDefaulturl());
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();

		}
	}*/

}
