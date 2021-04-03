package com.acis.automation.testcases.learner;

import java.io.IOException;
import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.constants.ILMSConstants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

import io.restassured.response.Response;

public class LearnerCenterHomeTest extends TestBase {

	public LearnerCenterHomeTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	/*final static Logger logger = LoggerFactory.getLogger(LearnerCenterHomeTest.class);

	public static String strEmail = "";
	public static String strGroupName = "";

	*//**
	 * This method is to switch back behavior when Training Manager have other roles
	 * 
	 * @return
	 * @throws AcisException
	 * @author Nivedita Yeolekar
	 * @throws IOException
	 * @since 19th August
	 *//*

	@Test(description = "TC-863:Verify the switch back behavior when Training Manager have other roles", groups = {
			"Medium", "iLMS_Regression", "Nivedita" })

	public void verifySwitchBehaviorForAllRoles()
			throws AcisException, InterruptedException, ParseException, IOException {
		try {
			password.navigateToApp(configProperties.msaUrl());
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("userName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("password"));
			home.verifyLogin();
			// Creating Training Manager Role
			msaScormCmi5.createDifferentTypesOfSCORMCMI5CoursesFromMSA("Articulate",
					testData.get(Constants.COURSES_SHEET).get("articulate_CourseName_zip"));
			String strCourseId = scormCmi5
					.getCourseIDOfUploadedCourse(testData.get(Constants.COURSES_SHEET).get("articulate_CourseName"));
				String orgname = "TMOrganization" + home.generateRandomString();
			String emailID = "TMOrg" + home.generateRandomString() + ILMSConstants.USER_EMAIL_DOMAIN;
			Response response = ilmsAPI.createTrainingManagerOrgFromAPI(orgname, emailID, strCourseId);
			ilmsAPI.verifyResponseStatusCode(response, 201);
			organizations.hoverOnOrganizationsMenu();
			organizations.clickOnOrganizationsLink().switchToBaseFrame();
			organizations.searchAndWaitTillOrgGetCreated(13, orgname).clickOnOrganizationNameLink()
					.verifyLoginToApplicationAlert(orgname);
			// Creating Groups
			strGroupName = "SysAdmin" + registerUser.generateRandomString();
			roles.hoverOnUsersMenu();
			groups.clickOnGroupsLink().clickOnAddGroupLink().enterGroupName(strGroupName).clickOnSaveBtnToAddGroup()
					.verifyNewlyCreatedGroupNameOnPopupWindow(strGroupName, groups.getGroupNameOnPopup())
					.clickOnExplicitInclusionList().searchUserByEmailID(emailID).selectUserFromFUResult()
					.selectExplicitInclusionActionFromFU().clickOnGoButton().closeWindowsExceptParent();
			// Adding group into System Admin Role
			roles.hoverOnUsersMenu();
			roles.clickOnRolesLinkFromUsers();
			roles.clickOnRoleName(ILMSConstants.ROLES_SYSTEMADMIN).switchToWindow();
			roles.clickOnAssignmentTab().clickOnAddRemovegroupLink().selectGroupFromShuffleBucket(strGroupName)
					.clickOnAddItemOnShuffleBucket().clickOnOKBtn().closeWindowsExceptParent();
			roles.hoverOnUsersMenu();
			roles.clickOnRolesLinkFromUsers().clickOnRoleName(ILMSConstants.ROLES_AUTHOR).switchToWindow();
			roles.clickOnAssignmentTab().clickOnAddRemovegroupLink().selectGroupFromShuffleBucket(strGroupName)
					.clickOnAddItemOnShuffleBucket().clickOnOKBtn().closeWindowsExceptParent();
			// Adding group into Instructor role
			roles.hoverOnUsersMenu();
			roles.clickOnRolesLinkFromUsers().clickOnRoleName(ILMSConstants.ROLES_INSTRUCTOR).switchToWindow();
			roles.clickOnAssignmentTab().clickOnAddRemovegroupLink().selectGroupFromShuffleBucket(strGroupName)
					.clickOnAddItemOnShuffleBucket().clickOnOKBtn().closeWindowsExceptParent();
			// Adding group into RealAdmin role
			roles.hoverOnUsersMenu();
			roles.clickOnRolesLinkFromUsers().clickOnRoleName(ILMSConstants.ROLES_RELAMADMIN).switchToWindow();
			roles.clickOnAssignmentTab().clickOnAddRemovegroupLink().selectGroupFromShuffleBucket(strGroupName)
					.clickOnAddItemOnShuffleBucket().clickOnOKBtn().closeWindowsExceptParent();
			// Adding group into Custom role
			roles.hoverOnUsersMenu();
			roles.clickOnRolesLinkFromUsers().clickOnAddNewRoleLink()
					.enterRoleName(excel.generateRandomTestData(Constants.GROUPS_ROLES_SHEET, "RoleName"))
					.setRoleName(roles.getEnteredRoleName()).clickOnSaveBtnToAddRole()
					.verifyRoleNameOnPopupWindow(roles.getRoleNameOnPopup(), roles.getRoleName()).clickOnAssignmentTab()
					.clickOnAddRemovegroupLink().selectGroupFromShuffleBucket(strGroupName)
					.clickOnAddItemOnShuffleBucket().clickOnOKBtn().closeWindowsExceptParent();
			users.hoverOnUsersMenu();
			users.clickOnUsersLinkFromUsers().searchUserByEmail(emailID).verifySearchedEmailID(emailID)
					.clickOnSearchedUserName().clickOnChangePasswordlink().verifyChangePasswordFunctionality();
			// organizations.setCustomURLNameForTestCaseSetup(orgname);
			userLogin.navigateToApp(configProperties.adminCustomturl());
			userLogin.loginUserToApplication(emailID, appConfig.getProperty("newPasswordConfirmPassword"));
			home.verifyUserIsOnGivenConsole(ILMSConstants.TRAINING_MANAGER).hoverOnSwitchUserIcon()
					.clickOnRoleNameFromRolesDropDownMenu(ILMSConstants.ROLES_LEARNER);
			lcHome.verifyTraningMangerRolePresentOnLearnerCenterPage().clickOnRolesMenuFromLC()
					.verifyRoleNamesInDropDown().clickOnRoleNameFromRolesMenuAtLC(ILMSConstants.ROLES_AUTHOR);
			home.verifyUserIsOnGivenConsole(ILMSConstants.ROLES_AUTHOR).hoverOnSwitchUserIcon()
					.verifyTrainingManagerLinkInDropDown().clickOnTrainingManagerLink()
					.verifyUserIsOnGivenConsole(ILMSConstants.TRAINING_MANAGER).hoverOnSwitchUserIcon()
					.clickOnRoleNameFromRolesDropDownMenu(roles.getRoleName())
					.verifyUserIsOnGivenConsole(roles.getRoleName()).hoverOnSwitchUserIcon()
					.verifyTrainingManagerLinkInDropDown().clickOnTrainingManagerLink()
					.verifyUserIsOnGivenConsole(ILMSConstants.TRAINING_MANAGER).hoverOnSwitchUserIcon()
					.clickOnRoleNameFromRolesDropDownMenu(ILMSConstants.ROLES_SYSTEMADMIN)
					.verifyUserIsOnGivenConsole(ILMSConstants.ROLES_SYSTEMADMIN).hoverOnSwitchUserIcon()
					.clickOnRoleNameFromRolesDropDownMenu(ILMSConstants.ROLES_LEARNER);
			lcHome.verifyTraningMangerRolePresentOnLearnerCenterPage().clickOnRolesMenuFromLC()
					.clickOnRoleNameFromRolesMenuAtLC(ILMSConstants.ROLES_SYSTEMADMIN);
			home.verifyUserIsOnGivenConsole(ILMSConstants.ROLES_SYSTEMADMIN).hoverOnSwitchUserIcon()
					.clickOnRoleNameFromRolesDropDownMenu(roles.getRoleName())
					.verifyUserIsOnGivenConsole(roles.getRoleName()).hoverOnSwitchUserIcon()
					.clickOnRoleNameFromRolesDropDownMenu(ILMSConstants.ROLES_LEARNER);
			lcHome.verifyTraningMangerRolePresentOnLearnerCenterPage().clickOnRolesMenuFromLC()
					.clickOnRoleNameFromRolesMenuAtLC(roles.getRoleName());
			home.verifyUserIsOnGivenConsole(roles.getRoleName()).hoverOnSwitchUserIcon()
					.clickOnRoleNameFromRolesDropDownMenu(ILMSConstants.ROLES_SYSTEMADMIN)
					.verifyUserIsOnGivenConsole(ILMSConstants.ROLES_SYSTEMADMIN).hoverOnSwitchUserIcon()
					.clickOnRoleNameFromRolesDropDownMenu(roles.getRoleName())
					.verifyUserIsOnGivenConsole(roles.getRoleName()).hoverOnSwitchUserIcon()
					.clickOnRoleNameFromRolesDropDownMenu(ILMSConstants.ROLES_SYSTEMADMIN)
					.verifyUserIsOnGivenConsole(ILMSConstants.ROLES_SYSTEMADMIN).hoverOnSwitchUserIcon()
					.clickOnRoleNameFromRolesDropDownMenu(ILMSConstants.ROLES_LEARNER);
			lcHome.verifyTraningMangerRolePresentOnLearnerCenterPage().clickOnTrainingManagerLink();
			home.verifyUserIsOnGivenConsole(ILMSConstants.TRAINING_MANAGER).hoverOnSwitchUserIcon()
					.clickOnRoleNameFromRolesDropDownMenu(ILMSConstants.ROLES_SYSTEMADMIN)
					.verifyUserIsOnGivenConsole(ILMSConstants.ROLES_SYSTEMADMIN).hoverOnSwitchUserIcon()
					.clickOnRoleNameFromRolesDropDownMenu(ILMSConstants.ROLES_LEARNER);
			lcHome.verifyTraningMangerRolePresentOnLearnerCenterPage().clickOnTrainingManagerLink();
			home.hoverOnSwitchUserIcon().clickOnRoleNameFromRolesDropDownMenu(ILMSConstants.ROLES_LEARNER);
			lcHome.verifyTraningMangerRolePresentOnLearnerCenterPage().clickOnTrainingManagerLink();
			home.verifyUserIsOnGivenConsole(ILMSConstants.TRAINING_MANAGER).hoverOnSwitchUserIcon()
					.clickOnRoleNameFromRolesDropDownMenu(roles.getRoleName())
					.verifyUserIsOnGivenConsole(roles.getRoleName()).hoverOnSwitchUserIcon()
					.clickOnRoleNameFromRolesDropDownMenu(ILMSConstants.ROLES_LEARNER);
			lcHome.verifyTraningMangerRolePresentOnLearnerCenterPage().clickOnTrainingManagerLink();
			adminlogin.navigateToApp(configProperties.adminDefaulturl());
			adminlogin.loginToApplicationForTestCase(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			adminlogin.verifyLogin();

		} catch (Exception e) {

			getStackTrace(e, " Failed to Verify the switch back behavior when Training Manager have other roles");

		}
	}

	*//**
	 * This method is to verify User Login with Email ID / Employee ID
	 * 
	 * @return
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @throws IOException
	 * @since 29 Aug 2019
	 *//*

	@Test(description = "TC-351:Login with Email ID / Employee ID", groups = { "Medium", "iLMS_Regression",
			"Chandrashekhar" })

	public void verifyUserLoginWithEmailIDAndEmployeeID()
			throws AcisException, InterruptedException, ParseException, IOException {
		try {

			lcHome.hoverOnSettingsMenu();
			fields.clickOnFieldslink().clickOnGeneralTab().selectEmployeeIDSettings();

			adminlogin.navigateToApp(
					userLogin.createCustomURL(testData.get(Constants.ORGNIZATION_SHEET).get("CustomUrl")));
			userLogin.loginUserToApplication(testData.get(Constants.USERS_SHEET).get("User1_Email"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			adminlogin.verifyLogin();

			adminlogin.navigateToApp(
					userLogin.createCustomURL(testData.get(Constants.ORGNIZATION_SHEET).get("CustomUrl")));
			userLogin.loginUserToApplication(testData.get(Constants.USERS_SHEET).get("User1_EmployeeID"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			adminlogin.verifyLogin();

			adminlogin.navigateToApp(configProperties.adminDefaulturl());
			adminlogin.loginToApplicationForTestCase(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			adminlogin.verifyLogin();

		} catch (Exception e) {
			adminlogin.navigateToApp(configProperties.adminDefaulturl());
			adminlogin.loginToApplicationForTestCase(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			adminlogin.verifyLogin();

			getStackTrace(e, "Failed to Verify User Login with Email ID / Employee ID");

		}

		finally {
			adminlogin.navigateToApp(configProperties.adminDefaulturl());
			adminlogin.loginToApplicationForTestCase(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			adminlogin.verifyLogin();

		}
	}

	*//**
	 * This method will verify Login to Learner Center console via ilms connect
	 * 
	 * @throws AcisException
	 * 
	 * @author Chandrashekhar.Reddy
	 * @since 30 Aug 2019
	 *//*

	
	 * generateiLMSConnectSSOURL: If required pass the actual Course ID as parameter
	 * else pass the blank value as " "
	 

	@Test(description = "TC-265:Verify Login to Learner Center console via ilms connect", groups = { "Medium",
			"Chandrashekhar", "iLMS_Regression" })

	public void verifyCreateUserUsingiLMSConnectWihoutCourseIDDefaultRegDivDept() throws AcisException {
		try {
			setting.enableiLMSConnectFeature().generateiLMSConnectSSOURL("").navigateToiLMSConnectSSOURL()
					.verifyUserCreatedAndLoggedOnLearnerCenterDirectly().refreshPage();

			userLogin.navigateToApp(configProperties.adminDefaulturl());
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();
		} catch (Exception e) {

			getStackTrace(e, "Failed to verify Login to Learner Center console via ilms connect");

		} finally {
			userLogin.navigateToApp(configProperties.adminDefaulturl());
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
			home.verifyLogin();

		}

	}

	*//**
	 * This method will Verify that after change language system should display
	 * successful message
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 31 October 2019
	 *//*

	@Test(description = "TC-1605:Verify after change language system should display successful message", groups = {
			"Medium", "iLMS_Regression", "Shahenshaha" })

	public void verifyChangeLanguageOnLC() throws AcisException {
		try {
			users.hoverOnUsersMenu();
			users.clickOnUsersLinkFromUsers().searchUserByEmail(testData.get(Constants.USERS_SHEET).get("User1_Email"))
					.clickOnSearchedUserLink().clickOnLoginAsThisUserLink();
			lcHome.clickOnLanguageLink().clickOnChangeLanguageDropdownButton()
					.selectLanguageForChangeLanguage(ILMSConstants.TEXT_LANGUAGE_ENGLISH_UK).clickOnOkButton()
					.verifyChangeLanguageSuccessMessage().clickOnLanguageLink().clickOnChangeLanguageDropdownButton()
					.selectLanguageForChangeLanguage(ILMSConstants.TEXT_LANGUAGE_ENGLISH).clickOnOkButton()
					.closeWindowsExceptParent();
		} catch (Exception e) {
			getStackTrace(e, "Failed to verify after change language system should display successful message ");
		}
	}*/

}