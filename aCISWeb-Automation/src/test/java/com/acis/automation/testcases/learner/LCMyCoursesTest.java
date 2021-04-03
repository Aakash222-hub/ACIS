package com.acis.automation.testcases.learner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.constants.ILMSConstants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

/**
 * This class contains test scripts related to My Courses tab of Learner
 * 
 * @author shahenshaha.mulani
 *
 */

public class LCMyCoursesTest extends TestBase {

	public LCMyCoursesTest() throws AcisException {
		super();
	}

	/*final static Logger logger = LoggerFactory.getLogger(LCMyCoursesTest.class);

	public String strUserEmailID = null;
	public String strFirstName = null;
	public String strLastName = null;

	*//**
	 * This method will Verify Override admin default toggle setting - check box
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 13 August 2019
	 *//*

	@Test(description = "TC-1414:Verify Override admin default toggle setting", groups = { "Medium", "iLMS_Regression",
			"Shahenshaha" })

	public void verifyOverrideAdminDefaultToggleSetting() throws AcisException {
		try {

			strUserEmailID = excel.generateRandomTestData(Constants.USERS_SHEET, "UserEmailID")
					+ ILMSConstants.USER_EMAIL_DOMAIN;
			strFirstName = excel.generateRandomTestData(Constants.USERS_SHEET, "UserFirstName");
			strLastName = excel.generateRandomTestData(Constants.USERS_SHEET, "UserLastName");

			setting.hoverOnSettingsMenu();
			learnerCenter.clickOnLearnerCenterLink().clickOnBusinessRulesTab().turnOffOnToggleShowCompletedCourses(true)
					.checkUncheckAllItemsCheckboxOfCourseStatus(true).clickOnSaveButtonOnBusinessRulesTab()
					.verifySuccessMessage();
			users.hoverOnUsersMenu();
			users.clickOnUsersLinkFromUsers().searchUserByEmail(testData.get(Constants.USERS_SHEET).get("User1_Email"))
					.clickOnSearchedUserLink().clickOnLoginAsThisUserLink();
			lcMyCourses.clickOnMyCourses().verifyEnableDisableStatusOfToggleButtonOfShowCompletedCourses(true)
					.closeWindowsExceptParent();

			setting.hoverOnSettingsMenu();
			learnerCenter.clickOnLearnerCenterLink().clickOnBusinessRulesTab()
					.turnOffOnToggleShowCompletedCourses(false).checkUncheckAllItemsCheckboxOfCourseStatus(true)
					.clickOnSaveButtonOnBusinessRulesTab().verifySuccessMessage();
			users.hoverOnUsersMenu();
			users.clickOnUsersLinkFromUsers().searchUserByEmail(testData.get(Constants.USERS_SHEET).get("User1_Email"))
					.clickOnSearchedUserLink().clickOnLoginAsThisUserLink();
			lcMyCourses.clickOnMyCourses().verifyEnableDisableStatusOfToggleButtonOfShowCompletedCourses(false)
					.closeWindowsExceptParent();

			registerUser.hoverOnUsersMenu();
			registerUser.clickRegisterUserMenuLink().enterFirstName(strFirstName).enterLastName(strLastName)
					.enterEmailID(strUserEmailID)
					.enterEmployeeID(excel.generateRandomTestData(Constants.USERS_SHEET, "UserEmpID")).selectRegion()
					.selectDivision().selectDepartment().enterPassword().clickSave()
					.verifySuccessMsgAfterUserCreation();
			users.hoverOnUsersMenu();
			users.clickOnUsersLinkFromUsers().searchUserByEmail(strUserEmailID).clickOnSearchedUserLink()
					.clickOnLoginAsThisUserLink();
			lcMyCourses.clickOnMyCourses().verifyEnableDisableStatusOfToggleButtonOfShowCompletedCourses(false)
					.closeWindowsExceptParent();

			setting.hoverOnSettingsMenu();
			learnerCenter.clickOnLearnerCenterLink().clickOnBusinessRulesTab().turnOffOnToggleShowCompletedCourses(true)
					.checkUncheckAllItemsCheckboxOfCourseStatus(true).clickOnSaveButtonOnBusinessRulesTab()
					.verifySuccessMessage();
			users.hoverOnUsersMenu();
			users.clickOnUsersLinkFromUsers().searchUserByEmail(strUserEmailID).clickOnSearchedUserLink()
					.clickOnLoginAsThisUserLink();
			lcMyCourses.clickOnMyCourses().verifyEnableDisableStatusOfToggleButtonOfShowCompletedCourses(true)
					.closeWindowsExceptParent();
		} catch (Exception e) {
			getStackTrace(e, "Failed to verify Override admin default toggle setting ");
		}
	}

	*//**
	 * This method will Verify Course Search when Toggle Switch 'Show Completed
	 * Courses' is Turned ON
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 16 August 2019
	 *//*

	@Test(description = "TC-1391:Verify Course Search when Toggle Switch 'Show Completed Courses' is Turned ON", groups = {
			"Medium", "iLMS_Regression", "Shahenshaha" })

	public void verifyCourseSearchWhenToggleSwitchShowCompletedCoursesIsON() throws AcisException {
		try {
			users.hoverOnUsersMenu();
			users.clickOnUsersLinkFromUsers().searchUserByEmail(testData.get(Constants.USERS_SHEET).get("User1_Email"))
					.clickOnSearchedUserLink().clickOnLoginAsThisUserLink();
			lcMyCourses.clickOnMyCourses().turnOffOrOnToggleSwitchForShowCompletedCourses(true)
					.clickOnAdvancedSearchlink().clickOnCourseStatusDropdown()
					.verifyCourseStatusDropdownvalues(lcMyCourses.courseStatusForToggleSwitchON)
					.clickOnCourseStatusDropdown()
					.enterTextInSearchTextbox(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName6"))
					.clickOnSearchIcon()
					.verifyCourseNameOnMyCoursesTab(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName6"))
					.clickOnLaunchCourse().closeLearnerCenterWindow().clickOnHomeTab().clickOnMyCourses()
					.verifyCoursesOnMyCoursesTab(lcMyCourses.coursesForToggleSwitchON)
					.turnOffOrOnToggleSwitchForShowCompletedCourses(true).clickOnAdvancedSearchlink()
					.clickOnRequirementTypeDropdown()
					.checkUncheckAdvancedSearchOptionsCheckbox(ILMSConstants.REQUIREMENT_TYPE_MANDATORY, true)
					.clickOnRequirementTypeDropdown().clickOnAdvancedSearchbutton()
					.verifyRequirementTypesOnMyCoursesTab(ILMSConstants.REQUIREMENT_TYPE_MANDATORY).clickOnHomeTab()
					.clickOnMyCourses().turnOffOrOnToggleSwitchForShowCompletedCourses(true).clickOnAdvancedSearchlink()
					.clickOnCourseStatusDropdown()
					.checkUncheckAdvancedSearchOptionsCheckbox(ILMSConstants.COURSE_STATUS_PASS, true)
					.clickOnCourseStatusDropdown().clickOnAdvancedSearchbutton()
					.verifyCourseStatusOnMyCoursesTab(ILMSConstants.COURSE_STATUS_PASS).closeWindowsExceptParent();
		} catch (Exception e) {
			getStackTrace(e,
					"Failed to verify Course Search when Toggle Switch 'Show Completed Courses' is Turned ON ");
		}
	}

	*//**
	 * This method will Verify Course Search when Toggle Switch 'Show Completed
	 * Courses' is Turned OFF
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 20 August 2019
	 *//*

	@Test(description = "TC-1392:Verify Course Search when Toggle Switch 'Show Completed Courses' is Turned OFF", groups = {
			"Medium", "iLMS_Regression", "Shahenshaha" })

	public void verifyCourseSearchWhenToggleSwitchShowCompletedCoursesIsOFF() throws AcisException {
		try {

			users.hoverOnUsersMenu();
			users.clickOnUsersLinkFromUsers().searchUserByEmail(testData.get(Constants.USERS_SHEET).get("User1_Email"))
					.clickOnSearchedUserLink().clickOnLoginAsThisUserLink();
			lcMyCourses.clickOnMyCourses().turnOffOrOnToggleSwitchForShowCompletedCourses(false)
					.clickOnAdvancedSearchlink().clickOnCourseStatusDropdown()
					.verifyCourseStatusDropdownvalues(lcMyCourses.courseStatusForToggleSwitchOFF)
					.clickOnCourseStatusDropdown()
					.enterTextInSearchTextbox(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName6"))
					.clickOnSearchIcon()
					.verifyCourseNameOnMyCoursesTab(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName6"))
					.clickOnLaunchCourse().closeLearnerCenterWindow().clickOnHomeTab().clickOnMyCourses()
					.turnOffOrOnToggleSwitchForShowCompletedCourses(false)
					.verifyCoursesOnMyCoursesTab(lcMyCourses.coursesForToggleSwitchOFF).clickOnAdvancedSearchlink()
					.clickOnRequirementTypeDropdown()
					.checkUncheckAdvancedSearchOptionsCheckbox(ILMSConstants.REQUIREMENT_TYPE_MANDATORY, true)
					.clickOnRequirementTypeDropdown().clickOnAdvancedSearchbutton()
					.verifyRequirementTypesOnMyCoursesTab(ILMSConstants.REQUIREMENT_TYPE_MANDATORY).clickOnHomeTab()
					.clickOnMyCourses().turnOffOrOnToggleSwitchForShowCompletedCourses(false)
					.clickOnAdvancedSearchlink().clickOnCourseStatusDropdown()
					.checkUncheckAdvancedSearchOptionsCheckbox(ILMSConstants.COURSE_STATUS_INPROGRESS, true)
					.clickOnAdvancedSearchbutton()
					.verifyCourseStatusOnMyCoursesTab(ILMSConstants.COURSE_STATUS_INPROGRESS)
					.closeWindowsExceptParent();
		} catch (Exception e) {
			getStackTrace(e,
					"Failed to verify Course Search when Toggle Switch 'Show Completed Courses' is Turned OFF ");
		}
	}

	*//**
	 * This method will Verify the last saved setting of toggle switch 'Show
	 * Completed Courses'
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 20 August 2019
	 *//*

	@Test(description = "TC-1386:Verify last saved setting of toggle switch 'Show Completed Courses'", groups = {
			"Medium", "iLMS_Regression", "Shahenshaha" })

	public void verifyLastSavedSettingOfToggleSwitchShowCompletedCourses() throws AcisException {
		try {
			home.clickLogout();
			userLogin.loginUserToApplication(testData.get(Constants.USERS_SHEET).get("User1_Email"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();
			lcMyCourses.clickOnMyCourses().verifyEnableDisableStatusOfToggleButtonOfShowCompletedCourses(true)
					.turnOffOrOnToggleSwitchForShowCompletedCourses(false);
			lcHome.clickOnLogoutFromLC();
			userLogin.loginUserToApplication(testData.get(Constants.USERS_SHEET).get("User1_Email"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();
			lcMyCourses.clickOnMyCourses().verifyEnableDisableStatusOfToggleButtonOfShowCompletedCourses(false)
					.turnOffOrOnToggleSwitchForShowCompletedCourses(true);
			lcHome.clickOnLogoutFromLC();
			userLogin.loginUserToApplication(testData.get(Constants.USERS_SHEET).get("User1_Email"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();
			lcMyCourses.clickOnMyCourses().verifyEnableDisableStatusOfToggleButtonOfShowCompletedCourses(true)
					.turnOffOrOnToggleSwitchForShowCompletedCourses(false).clickOnHomeTab().clickOnMyCourses()
					.verifyEnableDisableStatusOfToggleButtonOfShowCompletedCourses(false)
					.turnOffOrOnToggleSwitchForShowCompletedCourses(true).clickOnHomeTab().clickOnMyCourses()
					.verifyEnableDisableStatusOfToggleButtonOfShowCompletedCourses(true);
			lcHome.clickOnLogoutFromLC();
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();
		} catch (Exception e) {
			userLogin.navigateToApp(configProperties.adminDefaulturl());
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();
			getStackTrace(e, "Failed to verify last saved setting of toggle switch 'Show Completed Courses' ");
		}
	}

	*//**
	 * This method will Verify Search for Courses using Search box
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 27 August 2019
	 *//*

	@Test(description = "TC-411:Verify Search for Courses using Search box", groups = { "Medium", "iLMS_Regression",
			"Shahenshaha" })

	public void verifySearchForCoursesUsingSearchBox() throws AcisException {
		try {

			String strCurriName = "Curriculum_" + iltEvent.generateRandomString();
			curriculum.createCurriculum(strCurriName);
			scormCmi5.clickSaveButtonOnCourseOrCurriculum();
			curriculum.verifyCurriculumCreationAndCurriNameOnPopupWindow(strCurriName).hoverOnCoursesMenu();
			curriculum.clickOnCurriculumMenuLink().clickCurriculumn(strCurriName)
					.addCourseInCurri(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName7"))
					.enrollUserIntoCoursesFromEnrollInCourseCurriculum(
							testData.get(Constants.USERS_SHEET).get("User2_Email"), strCurriName)
					.closeWindowsExceptParent();
			users.hoverOnCoursesMenu();
			scormCmi5.clickOnSCORMCMI5MenuLink()
					.clickOnCourseName(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName7"))
					.enterCourseDescription(ILMSConstants.STRING_WITH_SPECIAL_CHAR)
					.clickSaveButtonOnCourseOrCurriculumEditPage().closeWindowsExceptParent();
			users.hoverOnUsersMenu();
			users.clickOnUsersLinkFromUsers().searchUserByEmail(testData.get(Constants.USERS_SHEET).get("User2_Email"))
					.clickOnSearchedUserLink().clickOnLoginAsThisUserLink();
			lcMyCourses.clickOnMyCourses().enterTextInSearchTextbox(ILMSConstants.STRING_WITH_SPECIAL_CHAR)
					.clickOnSearchIcon()
					.verifyCourseNameOnMyCoursesTab(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName7"))
					.closeWindowsExceptParent();
		} catch (Exception e) {
			getStackTrace(e, "Failed to verify Search for Courses using Search box ");
		}
	}

	*//**
	 * This method will Verify Search Course with Combination of Search box and
	 * Filters
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 27 August 2019
	 *//*

	@Test(description = "TC-413:Verify Search Course with Combination of Search box and Filters", groups = { "Medium",
			"iLMS_Regression", "Shahenshaha" })

	public void verifySearchCourseWithCombinationOfSearchBoxAndFilters() throws AcisException {
		try {
			users.hoverOnUsersMenu();
			users.clickOnUsersLinkFromUsers().searchUserByEmail(testData.get(Constants.USERS_SHEET).get("User1_Email"))
					.clickOnSearchedUserLink().clickOnLoginAsThisUserLink();
			lcMyCourses.clickOnMyCourses().clickOnAdvancedSearchlink().clickOnCourseStatusDropdown()
					.checkUncheckAdvancedSearchOptionsCheckbox(ILMSConstants.COURSE_STATUS_PASS, true)
					.clickOnCourseStatusDropdown()
					.enterTextInSearchTextbox(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName1"))
					.clickOnSearchIcon().verifyInitialCourseIsNotAssignedToLearner().clickOnHomeTab().clickOnMyCourses()
					.clickOnAdvancedSearchlink().clickOnCourseStatusDropdown()
					.checkUncheckAdvancedSearchOptionsCheckbox(ILMSConstants.COURSE_STATUS_PASS, true)
					.clickOnCourseStatusDropdown()
					.enterTextInSearchTextbox(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName2"))
					.clickOnSearchIcon()
					.verifyCourseNameOnMyCoursesTab(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName2"))
					.clickOnHomeTab().clickOnMyCourses().clickOnAdvancedSearchlink().clickOnRequirementTypeDropdown()
					.checkUncheckAdvancedSearchOptionsCheckbox(ILMSConstants.REQUIREMENT_TYPE_MANDATORY, true)
					.clickOnRequirementTypeDropdown()
					.enterTextInSearchTextbox(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName2"))
					.clickOnSearchIcon().verifyInitialCourseIsNotAssignedToLearner().clickOnHomeTab().clickOnMyCourses()
					.clickOnAdvancedSearchlink().clickOnRequirementTypeDropdown()
					.checkUncheckAdvancedSearchOptionsCheckbox(ILMSConstants.REQUIREMENT_TYPE_MANDATORY, true)
					.clickOnRequirementTypeDropdown()
					.enterTextInSearchTextbox(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName1"))
					.clickOnSearchIcon()
					.verifyCourseNameOnMyCoursesTab(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName1"))
					.clickOnHomeTab().clickOnMyCourses().clickOnAdvancedSearchlink().clickOnRequirementTypeDropdown()
					.checkUncheckAdvancedSearchOptionsCheckbox(ILMSConstants.REQUIREMENT_TYPE_OPTIONAL, true)
					.clickOnRequirementTypeDropdown()
					.enterTextInSearchTextbox(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName1"))
					.clickOnSearchIcon().verifyInitialCourseIsNotAssignedToLearner().clickOnHomeTab().clickOnMyCourses()
					.clickOnAdvancedSearchlink().clickOnRequirementTypeDropdown()
					.checkUncheckAdvancedSearchOptionsCheckbox(ILMSConstants.REQUIREMENT_TYPE_OPTIONAL, true)
					.clickOnRequirementTypeDropdown()
					.enterTextInSearchTextbox(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName2"))
					.clickOnSearchIcon()
					.verifyCourseNameOnMyCoursesTab(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName2"))
					.closeWindowsExceptParent();
		} catch (Exception e) {
			getStackTrace(e, "Failed to verify Search Course with Combination of Search box and Filters ");
		}
	}

	*//**
	 * <<<<<<< HEAD This method will Verify Sorting on My Courses
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 17 October 2019
	 *//*

	@Test(description = "TC-415:Verify Sorting on My Courses", groups = { "Medium", "iLMS_Regression", "Shahenshaha" })

	public void verifySortingOnMyCourses() throws AcisException {
		try {
			users.hoverOnUsersMenu();
			users.clickOnUsersLinkFromUsers().searchUserByEmail(testData.get(Constants.USERS_SHEET).get("User1_Email"))
					.clickOnSearchedUserLink().clickOnLoginAsThisUserLink();
			lcMyCourses.clickOnMyCourses()
					.enterTextInSearchTextbox(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName6"))
					.clickOnSearchIcon().clickOnLaunchCourse().closeLearnerCenterWindow().clickOnHomeTab()
					.clickOnMyCourses().verifySortingIcon("Status", "Ascending")
					.verifySortingOrderOfStatuses(lcMyCourses.getCourseStatusFromMyCourses(),
							lcMyCourses.defaultCourseStatusOrder)
					.clickOnColumnName("Name").verifySortingIcon("Name", "Ascending")
					.verifySortingOrderForGivenList(lcMyCourses.getSCORMCoursesFromLC(), "Ascending")
					.clickOnSortingIcon("Name")
					.verifySortingOrderForGivenList(lcMyCourses.getSCORMCoursesFromLC(), "Descending")
					.verifySortingIcon("Name", "Descending").clickOnColumnName("Enroll Date")
					.verifySortingIcon("Enroll Date", "Ascending")
					.verifySortingOrderForDatesForGivenList(lcMyCourses.getEnrollDatesFromLC(), "Ascending")
					.clickOnColumnName("Enroll Date")
					.verifySortingOrderForDatesForGivenList(lcMyCourses.getEnrollDatesFromLC(), "Descending")
					.verifySortingIcon("Enroll Date", "Descending").clickOnColumnName("Start Date")
					.verifySortingIcon("Start Date", "Ascending")
					.verifySortingOrderForDatesForGivenList(lcMyCourses.getStartDatesFromLC(), "Ascending")
					.clickOnColumnName("Start Date")
					.verifySortingOrderForDatesForGivenList(lcMyCourses.getStartDatesFromLC(), "Descending")
					.verifySortingIcon("Start Date", "Descending").clickOnColumnName("Due Date")
					.verifySortingIcon("Due Date", "Ascending")
					.verifySortingOrderForDatesForGivenList(lcMyCourses.getDueDatesFromLC(), "Ascending")
					.clickOnColumnName("Due Date")
					.verifySortingOrderForDatesForGivenList(lcMyCourses.getDueDatesFromLC(), "Descending")
					.verifySortingIcon("Due Date", "Descending").clickOnColumnName("Completion Date")
					.verifySortingIcon("Completion Date", "Ascending")
					.verifySortingOrderForDatesForGivenList(lcMyCourses.getCompletionDatesFromLC(), "Ascending")
					.clickOnColumnName("Completion Date")
					.verifySortingOrderForDatesForGivenList(lcMyCourses.getCompletionDatesFromLC(), "Descending")
					.verifySortingIcon("Completion Date", "Descending").clickOnColumnName("Status")
					.verifySortingIcon("Status", "Ascending")
					.verifySortingOrderOfStatuses(lcMyCourses.getCourseStatusFromMyCourses(),
							lcMyCourses.defaultCourseStatusOrder)
					.clickOnColumnName("Status")
					.verifySortingOrderOfStatuses(lcMyCourses.getCourseStatusFromMyCourses(),
							lcMyCourses.reverseCourseStatusOrder)
					.verifySortingIcon("Status", "Descending");
		} catch (Exception e) {
			getStackTrace(e, "Failed to verify Sorting on My Courses ");
		}
	}

	*//**
	 * This method will Verify Bookmarking for Scorm Course
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 11 October 2019
	 *//*

	@Test(description = "TC-470:Verify Bookmarking for Scorm Course", groups = { "High", "iLMS_Regression", "Suraiya" })

	public void verifyBookmarkingOfEnrolledCourses() throws AcisException {
		try {

			// enroll in SCORM 2
			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course1_ID"));

			home.clickLogout();
			userLogin.loginUserToApplication(testData.get(Constants.USERS_SHEET).get("User3_Email"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();

			lcMyCourses.clickOnMyCourses()
					.enterTextInSearchTextbox(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName1"))
					.clickOnSearchIcon()
					.verifyCourseNameOnMyCoursesTab(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName1"))
					.clickOnLaunchCourse().selectModeOFCourse().clickContinue().clickNext().closeLearnerCenterWindow()
					.clickOnHomeTab().clickOnMyCourses();

			lcMyCourses.enterTextInSearchTextbox(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName1"))
					.clickOnSearchIcon()
					.verifyCourseNameOnMyCoursesTab(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName1"))
					.clickOnLaunchCourse().selectModeOFCourse().verifyResumeRestartButtonDisplayed().clickRestart()
					.verifyRestartButtonBehaviour().clickNext().closeLearnerCenterWindow().clickOnHomeTab()
					.clickOnMyCourses();

			lcMyCourses.enterTextInSearchTextbox(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName1"))
					.clickOnSearchIcon()
					.verifyCourseNameOnMyCoursesTab(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName1"))
					.clickOnLaunchCourse().selectModeOFCourse().verifyResumeRestartButtonDisplayed().clickResume()
					.verifyResumeButtonBehaviour().closeWindowsExceptParent();

		} catch (Exception e) {
			getStackTrace(e, "Failed to verify Bookmarking for Scorm Course ");
		}

		finally {

			// Unenroll in SCORM 2
			ilmsAPI.unEnrollUserFromCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course1_ID"));

			userLogin.navigateToApp(configProperties.adminDefaulturl());
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();

		}
	}

	*//**
	 * This method will Verify SCORM Course Description page opened from LC My
	 * Courses
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 11 October 2019
	 *//*

	@Test(description = "TC-333:Verify SCORM Course Description page opened from LC My Courses", groups = { "High",
			"iLMS_Regression", "Chandrashekhar" })

	public void verifySCORMCourseDescriptionOnLCMyCourses() throws AcisException {
		try {

			scormCmi5.SetCoursePropertiesAndSetCertificationForCopiedCourse("SCORM", "Test SCORM Course3", 3);

			ilmsAPI.unEnrollUserFromCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_ID"));

			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_ID"));

			home.clickLogout();
			userLogin.loginUserToApplication(testData.get(Constants.USERS_SHEET).get("User3_Email"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();

			lcMyCourses.clickOnMyCourses()
					.enterTextInSearchTextbox(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName3"))
					.clickOnSearchIcon()
					.verifyCourseNameOnMyCoursesTab(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName3"))
					.clickOnCourseName(testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName3"))
					.verifyTitleOnCourseDescriptionPage("Course Description");

			// verify labels and values for Not started course
			lcMyCourses.verifyRequirementType("Mandatory")
					.verifyEnrollDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(0))).verifyStartDate("-")
					.verifyDueDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(-20)))
					.verifyStatus("Not Started")
					.verifyHours(testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_Hours"))
					.verifyCredits(testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_Credits"))
					.verifyLicenseExpirationDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(-30)))
					.verifyCertificationStatus("Never Certified").verifyCertificationExpirationDate("-");

			// verify labels and values for In-Progress course
			lcMyCourses.clickOnLaunchCourse().closeLearnerCenterWindow();

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					"RequirementType", "Optional", testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_ID"));
			lcMyCourses.refreshPage();
			lcMyCourses.verifyRequirementType("Optional")
					.verifyEnrollDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(0)))
					.verifyStartDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(0)))
					.verifyDueDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(-20)))
					.verifyStatus("In Progress")
					.verifyHours(testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_Hours"))
					.verifyCredits(testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_Credits"))
					.verifyLicenseExpirationDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(-30)))
					.verifyCertificationStatus("Never Certified").verifyCertificationExpirationDate("-");

			// verify labels and values for Completed(PASS) course
			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User3_ID"), "Status",
					"Pass", testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_ID"));
			lcMyCourses.refreshPage();
			lcMyCourses.verifyDueDateIsNotVisisble()
					.verifyCompletionDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(0)))
					.verifyStatus("Pass").verifyCertificationStatus("Certified")
					.verifyCertificationExpirationDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(-366)));

			// verify labels and values for Completed(FAIL) course
			lcMyCourses.refreshPage();

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User3_ID"), "Status",
					"Not Started", testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_ID"));
			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User3_ID"), "Status",
					"Fail", testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_ID"));
			lcMyCourses.refreshPage();
			lcMyCourses.verifyDueDateIsNotVisisble()
					.verifyCompletionDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(0)))
					.verifyStatus("Fail");
		} catch (Exception e) {
			getStackTrace(e, "Failed to verify SCORM Course Description on LC ");
		}

		finally {

			ilmsAPI.unEnrollUserFromCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_ID"));

			userLogin.navigateToApp(configProperties.adminDefaulturl());
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();

		}
	}

	*//**
	 * This method will Verify SCORM Course Description page opened from LC My
	 * Courses
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 11 October 2019
	 *//*

	@Test(description = "TC-332:Verify iComposer Course Description page opened from LC My Courses", groups = {
			"Medium", "iLMS_Regression", "Chandrashekhar" })

	public void verifyiComposerCourseDescriptionOnLCMyCourses() throws AcisException {
		try {

			ilmsAPI.unEnrollUserFromCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("iComposer_Course1_ID"));

			response = ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("iComposer_Course1_ID"));

			home.clickLogout();
			userLogin.loginUserToApplication(testData.get(Constants.USERS_SHEET).get("User3_Email"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();

			lcMyCourses.clickOnMyCourses()
					.enterTextInSearchTextbox(testData.get(Constants.COURSES_SHEET).get("iComposer_CourseName1"))
					.clickOnSearchIcon()
					.verifyCourseNameOnMyCoursesTab(testData.get(Constants.COURSES_SHEET).get("iComposer_CourseName1"))
					.clickOnCourseName(testData.get(Constants.COURSES_SHEET).get("iComposer_CourseName1"))
					.verifyTitleOnCourseDescriptionPage("Course Description");

			// verify labels and values for Not started course
			lcMyCourses.verifyRequirementType("Mandatory")
					.verifyEnrollDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(0))).verifyStartDate("-")
					.verifyDueDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(-11)))
					.verifyStatus("Not Started")
					.verifyHours(testData.get(Constants.COURSES_SHEET).get("iComposer_Course1_Hours"))
					.verifyCredits(testData.get(Constants.COURSES_SHEET).get("iComposer_Course1_Credits"))
					.verifyLicenseExpirationDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(-30)));

			// verify labels and values for In-Progress course
			lcMyCourses.clickOnLaunchCourseForiComposer().closeLearnerCenterWindow();

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					"RequirementType", "Optional", testData.get(Constants.COURSES_SHEET).get("iComposer_Course1_ID"));
			lcMyCourses.refreshPage();
			lcMyCourses.verifyRequirementType("Optional")
					.verifyEnrollDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(0)))
					.verifyStartDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(0)))
					.verifyDueDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(-11)))
					.verifyStatus("In Progress")
					.verifyHours(testData.get(Constants.COURSES_SHEET).get("iComposer_Course1_Hours"))
					.verifyCredits(testData.get(Constants.COURSES_SHEET).get("iComposer_Course1_Credits"))
					.verifyLicenseExpirationDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(-30)));

			// verify labels and values for Completed(PASS) course
			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User3_ID"), "Status",
					"Pass", testData.get(Constants.COURSES_SHEET).get("iComposer_Course1_ID"));
			lcMyCourses.refreshPage();
			lcMyCourses.verifyDueDateIsNotVisisble()
					.verifyCompletionDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(0)))
					.verifyStatus("Pass");

			// verify labels and values for Completed(FAIL) course

			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User3_ID"), "Status",
					"Not Started", testData.get(Constants.COURSES_SHEET).get("iComposer_Course1_ID"));
			ilmsAPI.putChangeTranscriptAPIForCourseResult(testData.get(Constants.USERS_SHEET).get("User3_ID"), "Status",
					"Fail", testData.get(Constants.COURSES_SHEET).get("iComposer_Course1_ID"));
			lcMyCourses.refreshPage();
			lcMyCourses.verifyDueDateIsNotVisisble()
					.verifyCompletionDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(0)))
					.verifyStatus("Fail");
		} catch (Exception e) {
			getStackTrace(e, "Failed to verify iComposer course description page ");
		}

		finally {

			ilmsAPI.unEnrollUserFromCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("iComposer_Course1_ID"));

			userLogin.navigateToApp(configProperties.adminDefaulturl());
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();

		}
	}

	*//**
	 * This method will Verify SCORM Course Description page opened from LC My
	 * Courses
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 11 October 2019
	 *//*

	@Test(description = "TC-334:Verify Curriculum Description page opened from LC My Courses", groups = { "High",
			"iLMS_Regression", "Chandrashekhar" })

	public void verifyiComposerCurriculumDescriptionOnLCMyCourses() throws AcisException {
		try {

			// curriculum.createCurriculum(Integer.parseInt(appConfig.getProperty("CurriCount")));

			curriculum.addCourseToCurriculum(testData.get(Constants.COURSES_SHEET).get("Curriculum_Name1"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName1"));

			ilmsAPI.unEnrollUserFromCurriculum(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("Curriculum1_ID"));

			response = ilmsAPI.enrollUserInCurriculum(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("Curriculum1_ID"));

			home.clickLogout();
			userLogin.loginUserToApplication(testData.get(Constants.USERS_SHEET).get("User3_Email"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();

			lcMyCourses.clickOnMyCourses()
					.enterTextInSearchTextbox(testData.get(Constants.COURSES_SHEET).get("Curriculum_Name1"))
					.clickOnSearchIcon()
					.verifyCourseNameOnMyCoursesTab(testData.get(Constants.COURSES_SHEET).get("Curriculum_Name1"))
					.clickOnCourseName(testData.get(Constants.COURSES_SHEET).get("Curriculum_Name1"))
					.verifyTitleOnCourseDescriptionPage("Course Description");

			// verify labels and values for Not started course
			lcMyCourses.verifyRequirementType("Mandatory")
					.verifyEnrollDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(0))).verifyStartDate("-")
					.verifyDueDate("-").verifyStatus("Not Started").verifyHours("0").verifyCredits("0")
					.verifyCertificateExpirationIsNotVisisble();

			// verify labels and values for In-Progress course
			lcMyCourses.clickOnLaunchCourse().closeLearnerCenterWindow();

			ilmsAPI.putChangeTranscriptAPIForCurriculum(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					"RequirementType", "Optional", testData.get(Constants.COURSES_SHEET).get("Curriculum1_ID"));
			lcMyCourses.refreshPage();
			lcMyCourses.verifyRequirementType("Optional")
					.verifyEnrollDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(0)))
					.verifyStartDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(0))).verifyDueDate("-")
					.verifyStatus("In Progress").verifyHours("0").verifyCredits("0")
					.verifyCertificateExpirationIsNotVisisble();
			// verify labels and values for Completed(PASS) course
			ilmsAPI.putChangeTranscriptAPIForCurriculum(testData.get(Constants.USERS_SHEET).get("User3_ID"), "Status",
					"Pass", testData.get(Constants.COURSES_SHEET).get("Curriculum1_ID"));
			lcMyCourses.refreshPage();
			lcMyCourses.verifyDueDateIsNotVisisble()
					.verifyCompletionDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(0)))
					.verifyStatus("Pass");

			// verify labels and values for Completed(FAIL) course

			ilmsAPI.putChangeTranscriptAPIForCurriculum(testData.get(Constants.USERS_SHEET).get("User3_ID"), "Status",
					"Not Started", testData.get(Constants.COURSES_SHEET).get("Curriculum1_ID"));
			ilmsAPI.putChangeTranscriptAPIForCurriculum(testData.get(Constants.USERS_SHEET).get("User3_ID"), "Status",
					"Fail", testData.get(Constants.COURSES_SHEET).get("Curriculum1_ID"));
			lcMyCourses.refreshPage();
			lcMyCourses.verifyDueDateIsNotVisisble()
					.verifyCompletionDate(convertDateFormat("MM/d/yyyy", LCTranscript.getPastDate(0)))
					.verifyStatus("Fail");
		} catch (Exception e) {
			getStackTrace(e, "Failed to verify Curriculum description page");
		}

		finally {

			ilmsAPI.unEnrollUserFromCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("Curriculum1_ID"));

			userLogin.navigateToApp(configProperties.adminDefaulturl());
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();

		}
	}

	*//**
	 * This method will Verify SCORM Course Description page opened from LC My
	 * Courses
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 11 October 2019
	 *//*

	@Test(enabled=false,description = "TC-333:Verify ADT SCORM Course launch from LC My Courses", groups = { "High",
			"iLMS_Regression", "Chandrashekhar" })

	public void verifyADTSCORMCourseLaunchFromLC() throws AcisException {
		try {

			
			 * scormCmi5.CreateDifferentTypesOfSCORMCMI5Courses("SCORM",
			 * "Security Awareness ADT.zip");
			 * 
			 * // scormCmi5.SetCoursePropertiesAndSetCertificationForCopiedCourse("SCORM",
			 * // "Test SCORM Course3", 3);
			 * 
			 * ilmsAPI.unEnrollUserFromCourse(testData.get(Constants.USERS_SHEET).get(
			 * "User3_ID"), testData.get(Constants.COURSES_SHEET).get("SCORM_Course1_ID"));
			 * 
			 * response =
			 * ilmsAPI.enrollUserInCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"
			 * ), testData.get(Constants.COURSES_SHEET).get("SCORM_Course1_ID"));
			 * 
			 * //home.clickLogout();
			  userLogin.navigateToApp(configProperties.adminDefaulturl());
			userLogin.loginUserToApplication(testData.get(Constants.USERS_SHEET).get("User3_Email"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();

			// scormCmi5.getCreatedCourseName()

			lcMyCourses.clickOnMyCourses().enterTextInSearchTextbox("Security Awareness ADT").clickOnSearchIcon()
					.verifyCourseNameOnMyCoursesTab("Security Awareness ADT")

					.clickOnLaunchCourse().clickOnTextModeLowBandwidthButton().clickOnPreTestButton().takePreTest()
					.closeLearnerCenterWindow();

		} catch (Exception e) {
			getStackTrace(e, "Failed to verify ADT SCORM Course launch from LC My Courses");
		}

		finally {

			ilmsAPI.unEnrollUserFromCourse(testData.get(Constants.USERS_SHEET).get("User3_ID"),
					testData.get(Constants.COURSES_SHEET).get("SCORM_Course3_ID"));

			userLogin.navigateToApp(configProperties.adminDefaulturl());
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();

		}
	}*/

}
