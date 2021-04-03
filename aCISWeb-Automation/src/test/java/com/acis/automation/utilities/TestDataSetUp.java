package com.acis.automation.utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.PageBase;
import com.acis.automation.library.TestBase;

/**
 * This class contains all methods related to Set up
 * 
 * @author Shahenshaha.Mulani
 *
 */
public class TestDataSetUp extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(TestDataSetUp.class);
	public static String EXCEPTION_MESSAGE = "Exception occured in executing test case : ";

	public TestDataSetUp() throws AcisException {

	}

	/**
	 * This method will create new Organization and other test data setup for LP
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 24 APR 2018
	 */

	/*public void createTestDataSetUpForLP() throws AcisException {
		try {

			navigateToApp(configProperties.msaUrl());
			waitForPageLoad();
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("userName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("password"));
			home.verifyLogin();
			organizations.setUpNewOrganization();
			fields.addRequiredFieldsFromSettings();
			registerUser.createUsers();
			users.inactivateTheUser();
			scormCmi5.uploadSCORMCourse();
			copyContent.copyCoursesUsingCopyContent("Test SCORM Course1",
					Integer.parseInt(TestBase.appConfig.getProperty(Constants.TESTDATA_COURSES_COUNT)));

			// copyContent.copyCourses();
			phishProof.clickOnApplicationMenu();
			phishProof.clickOnPhishProofLink().clickOnAgreeButton().closeWindowsExceptParent();
			home.clickLogout();
			waitForPageLoad();

			navigateToApp(configProperties.adminDefaulturl());

			strAppBuildVersion = getApplicationBuildVersion();

			waitForPageLoad();

			testData.get(Constants.LOGINPAGE_SHEET).put("orgusername", organizations.getOrgAdminEmailID());

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			logger.info("Test Data Set up is done successfully");
		} catch (Exception e) {

			getStackTrace(e, "Exception in createTestDataSetUpForLP");

		}
	}

	*//**
	 * This method is used to delete organization
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 23 July 2019
	 *//*
	public void cleanUpTestData() throws AcisException {
		try {
			home.clickLogout();
			waitForPageLoad();

			navigateToApp(configProperties.msaUrl());

			logger.info("Navigated to MSA url");
			if (testLogger() != null) {
				testLoggerInfo("Navigated to MSA url");
			}
			waitForPageLoad();

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("userName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("password"));
			home.verifyLogin();
			organizations.deleteTheOrgAfterTestExecution();
			logger.info("LP Test Data clean up is done successfully");
		} catch (Exception e) {

			getStackTrace(e, "Exception in cleanUpTestData");

		}
	}

	public void createTestDataSetUpForLearner() throws AcisException {
		try {
			navigateToApp(configProperties.msaUrl());
			logger.info("Navigated to MSA url" + configProperties.msaUrl());

			waitForPageLoad();
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("userName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("password"));
			home.verifyLogin();
			organizations.setUpNewOrganization();
			fields.addRequiredFieldsFromSettings();
			icomposer.createiComposerCourse(Integer.parseInt(appConfig.getProperty("iCompCoursesCount")));

			scormCmi5.CreateDifferentTypesOfSCORMCMI5Courses(1, "SCORM", "TestSCORMCourse1.zip", "Test SCORM Course1");

	//		scormCmi5.CreateDifferentTypesOfSCORMCMI5Courses(2, "SCORM", "SCORM_Bookmark.zip", "SCORM_Bookmark");

			scormCmi5.CreateDifferentTypesOfSCORMCMI5Courses(1, "CMI", "GolfExample_TCAPI.zip", "Tin Can Golf Example");

			copyContent.copyCoursesUsingCopyContent("Test SCORM Course1",
					Integer.parseInt(appConfig.getProperty(Constants.LEARNER_TESTDATA_COURSES_COUNT)));

			home.clickLogout();
			waitForPageLoad();

			ilmsAPI.createUserFieldsForSetUP(
					Integer.parseInt(appConfig.getProperty(Constants.LEARNER_TESTDATA_USERS_COUNT)),
					organizations.getStrOrgID());
			ilmsAPI.createUserForSetUP(
					Integer.parseInt(appConfig.getProperty(Constants.LEARNER_TESTDATA_USERS_COUNT)),
					organizations.getStrOrgID());

			// enroll in SCORM 1
			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course1_ID"));

			// enroll in SCORM 2
			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course2_ID"));

			// enroll in SCORM 3
			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_ID"));

			// enroll in SCORM 4
			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));

			// enroll in SCORM 5
			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course5_ID"));

			// enroll in SCORM 6
			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course6_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					"Status", "Pass", testData.get(Constants.COURSES_SHEET).get("SCORM_Course2_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					"Status", "Fail", testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					"Status", "Waived", testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					"DueDate", convertDateFormat("yyyy-MM-dd HH:mm:ss", getPastDateWithTime(5)).replace(" ", "T"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course5_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					"RequirementType", "Optional", testData.get(Constants.COURSES_SHEET).get("SCORM_Course2_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					"RequirementType", "Optional", testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					"DueDate", convertDateFormat("yyyy-MM-dd HH:mm:ss", getPastDateWithTime(7)).replace(" ", "T"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course6_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					"CompletionDate",
					convertDateFormat("yyyy-MM-dd HH:mm:ss", getPastDateWithTime(3)).replace(" ", "T"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course2_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					"CompletionDate",
					convertDateFormat("yyyy-MM-dd HH:mm:ss", getPastDateWithTime(8)).replace(" ", "T"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					"EnrollmentDate",
					convertDateFormat("yyyy-MM-dd HH:mm:ss", getPastDateWithTime(6)).replace(" ", "T"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course1_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					"EnrollmentDate",
					convertDateFormat("yyyy-MM-dd HH:mm:ss", getPastDateWithTime(2)).replace(" ", "T"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					"StartDate", convertDateFormat("yyyy-MM-dd HH:mm:ss", getPastDateWithTime(13)).replace(" ", "T"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course2_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User1_ID"),
					"StartDate", convertDateFormat("yyyy-MM-dd HH:mm:ss", getPastDateWithTime(9)).replace(" ", "T"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_ID"));

			navigateToApp(configProperties.adminDefaulturl());

			strAppBuildVersion = getApplicationBuildVersion();

			waitForPageLoad();

			testData.get(Constants.LOGINPAGE_SHEET).put("orgusername", organizations.getOrgAdminEmailID());

			logger.info("Test Data Set up For Learner is done successfully");

		} catch (Exception e) {

			getStackTrace(e, "Execption in creating Test Data Set Up For Learner ");

		}

	}

	*//**
	 * This method is used to create new Organization and other test data setup for
	 * Org Admin TCs
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 23 July 2019
	 *//*

	public void createTestDataSetUpForOrgAdmin() throws AcisException {

		try {
			navigateToApp(configProperties.msaUrl());

			logger.info("Navigated to MSA url");

			waitForPageLoad();
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("userName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("password"));
			home.verifyLogin();
			organizations.setUpNewOrganization();
			fields.addRequiredFieldsFromSettings();

			scormCmi5.CreateDifferentTypesOfSCORMCMI5Courses(1, "SCORM", "TestSCORMCourse1.zip", "Test SCORM Course1");

			copyContent.copyCoursesUsingCopyContent("Test SCORM Course1",
					Integer.parseInt(appConfig.getProperty("orgadmintestdatacoursescount")));
			
			scormCmi5.SetCoursePropertiesAndSetCertificationForCopiedCourse("SCORM", "Test SCORM Course2", 2);

			phishProof.clickOnApplicationMenu().clickOnPhishProofLink().clickOnAgreeButton().closeWindowsExceptParent();
			home.clickLogout();
			waitForPageLoad();

			ilmsAPI.createUserFieldsForSetUP(
					Integer.parseInt(appConfig.getProperty("orgadmintestdatauserscount")), organizations.getStrOrgID());
			ilmsAPI.createUserForSetUP(Integer.parseInt(appConfig.getProperty("orgadmintestdatauserscount")),
					organizations.getStrOrgID());
			ilmsAPI.inActivateUser();
			ilmsAPI.deleteUser(testData.get(Constants.USERS_SHEET).get("User6_ID"));

			// enroll in SCORM 2
			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course2_ID"));

			// enroll in SCORM 3
			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					"Status", "Pass", testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_ID"));

			// enroll user 8 in in SCORM 4 and pass the course
			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User8_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User8_ID"),
					"Status", "Pass", testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));

			// enroll user 9 in in SCORM 4 and Fail the course
			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User9_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User9_ID"),
					"Status", "Fail", testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));

			// enroll user 10 in in SCORM 4 and Waive the course
			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User10_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(
					testData.get(Constants.USERS_SHEET).get("User10_ID"), "Status", "Waived",
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));

			// enroll user 11 in in SCORM 4 course
			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User11_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));

			// enroll user 4 in in SCORM 4 course
			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User5_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course4_ID"));

			navigateToApp(configProperties.adminDefaulturl());

			strAppBuildVersion = getApplicationBuildVersion();

			waitForPageLoad();

			testData.get(Constants.LOGINPAGE_SHEET).put("orgusername", organizations.getOrgAdminEmailID());

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));

			roles.assignInstructorRoleToUsers();

			logger.info("Test Data Set up is done successfully");
		} catch (Exception e) {

			getStackTrace(e, "Execption in createTestDataSetUpForOrgAdmin");

		}

	}

	*//**
	 * This method is used to create new Organization and other test data setup for
	 * MSA TCs
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 30 July 2019
	 *//*

	public void createTestDataSetUpForMSA() throws AcisException {

		try {
			navigateToApp(configProperties.msaUrl());
			logger.info("Navigated to MSA url" + configProperties.msaUrl());

			waitForPageLoad();
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("userName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("password"));
			home.verifyLogin();
			organizations.setUpNewOrganization();
			fields.addRequiredFieldsFromSettings();

			scormCmi5.CreateDifferentTypesOfSCORMCMI5Courses(1, "SCORM", "TestSCORMCourse1.zip", "Test SCORM Course1");

			copyContent.copyCoursesUsingCopyContent("Test SCORM Course1",
					Integer.parseInt(appConfig.getProperty(Constants.MSA_TESTDATA_COURSES_COUNT)));

			phishProof.clickOnApplicationMenu().clickOnPhishProofLink().clickOnAgreeButton().closeWindowsExceptParent();
			home.clickLogout();
			waitForPageLoad();

			ilmsAPI.createUserFieldsForSetUP(
					Integer.parseInt(appConfig.getProperty(Constants.MSA_TESTDATA_USERS_COUNT)),
					organizations.getStrOrgID());
			ilmsAPI.createUserForSetUP(
					Integer.parseInt(appConfig.getProperty(Constants.MSA_TESTDATA_USERS_COUNT)),
					organizations.getStrOrgID());
			ilmsAPI.inActivateUser();
			ilmsAPI.deleteUser(testData.get(Constants.USERS_SHEET).get("User6_ID"));

			// enroll in SCORM 3
			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_ID"));

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					"Status", "Pass", testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_ID"));

			navigateToApp(configProperties.msaUrl());
			logger.info("Navigated to MSA url" + configProperties.msaUrl());
			strAppBuildVersion = getApplicationBuildVersion();

			logger.info("Test Data Set up For MSA is done successfully");
		} catch (Exception e) {

			getStackTrace(e, "Execption in creating Test Data Set Up For MSA ");

		}

	}
*/
}
