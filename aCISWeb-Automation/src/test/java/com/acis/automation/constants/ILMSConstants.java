package com.acis.automation.constants;

/**
 * This class is used for declaring Global variables as public static constants.
 * 
 * @author Chandrashekhar.Reddy
 * @since 16 Feb 2018
 * 
 */
public class ILMSConstants {

	public final static String MENU_USERS = "Users";
	public final static String MENU_COURSES = "Courses";

	public final static String ROLES_AUTHOR = "Author";
	public final static String ROLES_INSTRUCTOR = "Instructor";
	public final static String ROLES_RELAMADMIN = "Realm Administrator";
	public final static String ROLES_SYSTEMADMIN = "System Admin";
	public final static String ROLES_LEARNER = "Learner";
	public final static String ROLES_TRAINING_MANAGER = "Training Manager";
	public final static String ROLES_CUSTOM = "Custom";

	public final static String USER_EMAIL_DOMAIN = "@iel.com";

	public final static String PUBLISH_POPUPMESSAGE = "Clicking on Publish kicks off your Learning Path so that your set enrollment rules will begin enrolling users into courses tonight."
			+ "\n\n"
			+ "Going forward, the enrollment rules will run and based on any updated information, users will automatically be enrolled in the courses assigned to this learning path."
			+ "\n\n" + "Are you ready to publish this Learning Path?";

	public final static String UNPUBLISH_POPUPMESSAGE = "This learning path will be unpublished and will no longer be available for group assignment. Do you want to continue?";
	public final static String DELETE_POPUPMESSAGE = "This action will permanently delete \"%s\" Learning Path. Do you want to continue?";

	public final static String LP_ADDCOURSES_SUCCESS_MESSAGE = "The courses for this Learning Path were saved successfully. Please apply Enrollment Rules before publishing this Learning Path.";
	public final static String LP_NOTE_For_PUBLISHING_LEARNING_PATH = "This Learning Path is unpublished. Complete all three steps before publishing.";
	public final static String LP_NOTE_ON_COURSESTAB = "Note: You can add any number of courses to this Learning Path. To edit or delete a course, please hover over the course and select an action.";
	public final static String LP_NOTE_ON_SELECT_COURSES_POPUP = "Tip: Type in at least three characters, e.g. \"S-1\".";
	public final static String LP_NOTE_ON_SELECT_COURSES_SEARCH_CONTROL = "Auto Search Course Name...";
	public final static String LP_TITLE_OF_SELECT_COURSES_POPUP = "Select Courses";
	public final static String LP_TEXT_ON_ALERT_WHEN_NO_COURSE_SELECTED = "Using the dropdown list, please select a course.";

	public final static String GROUP_ADD_SUCCESS_POPMESSAGE = "The assigned groups were added successfully. You are now ready to publish this Learning Path if no other changes are required.";
	public final static String GROUP_REMOVE_SUCCESS_POPMESSAGE = "The assigned groups were removed successfully. You are now ready to publish this Learning Path if no other changes are required.";
	public final static String GROUP_DELETE_SUCCESS_POPMESSAGE = "The selected group(s) deleted successfully.";
	public final static String COURSE_ADD_SUCCESS_POPMESSAGE = "The courses for this Learning Path were saved successfully. Please apply Enrollment Rules before publishing this Learning Path.";
	public final static String COPYCONTENT_SUCESS_MASSAGE = "The content was copied successfully.";

	public final static String REGISTER_USER_SUCESS_MASSAGE = "added successfully.";

	public final static String DUPLICATE_COURSE_ALERT_MASSAGE = "Course: \"%s\" already exists in this Learning Path. Please select another.";
	public static String XPATHEXPRESSION_NODE = "/suite/suite-files/suite-file";
	public static String SUITEATTRIBUTE_PATH = "path";

	public final static String ENTER_START_TIME_FOR_COPY_SESSION = "9:00 AM";
	public final static String ALERT_TEXT_CANCEL_SESSION = "Canceling a session will un-enroll all users from the session and change the status to \"canceled,\" which prevents any further enrollments by users or administrators. Canceled sessions can be re-activated later. Are you sure you want to cancel the session?";
	public final static String ALERT_TEXT_CANCEL_SESSION_CONFIRMATION = "The session was canceled successfully.";
	public final static String SESSION_STATUS_CANCELED = "Session Canceled";
	public final static String ALERT_TEXT_REACTIVATE_SESSION = "Re-activating a session will make it available for enrollment by users and administrators. Are you sure you want to re-activate the session?";
	public final static String ALERT_TEXT_REACTIVATE_SESSION_CONFIRMATION = "The session was re-activated successfully.";
	public final static String SESSION_STATUS_OPEN = "Open";
	public final static String TEXT_MESSAGE_DELETE_SESSION_CONFIRMATION = "The following session(s) will be deleted. All enrolled users will be un-enrolled and their transcript data will be deleted. There is no undo of this action.";
	public final static String TEXT_MESSAGE_SESSION_DELETION = "Selected session(s) were deleted successfully.";

	public final static String FTPSettingSuccessMessage = "Settings saved successfully.";
	public final static String ExportSettingSuccessMessage = "Settings saved successfully. (Note: The export is off. Turn it on to begin exporting.)";
	public final static String ALERT_TEXT_LOGIN_TO_APPLICATION = "You are attempting to login as the Organization Admin for \'%s\'. To ensure the integrity of your session and to avoid issues, please make sure all iLMS pop up windows are closed before proceeding. If all iLMS pop ups are closed click OK. Otherwise click Cancel.";
	public final static String PRIMARY_ORG_ADMIN = "Primary Org Admin";
	public final static String MASTER_SUPER_ADMIN = "Master Super Admin";
	public final static String TRAINING_MANAGER = "Training Manager";
	public final static String TOGGLE_BUTTON_GREEN_COLOR_CODE = "rgba(89, 180, 1, 1)";
	public final static String REQUIREMENT_TYPE_MANDATORY = "Mandatory";
	public final static String COURSE_STATUS_PASS = "Pass";
	public final static String COURSE_STATUS_INPROGRESS = "In Progress";
	public final static String STRING_WITH_SPECIAL_CHAR = "Special@Char";
	public final static String REQUIREMENT_TYPE_OPTIONAL = "Optional";
	public final static String SUCCESS_MESSAGE_CHANGE_LANGUAGE = "Learner language updated successfully.";
	public final static String TEXT_LANGUAGE_ENGLISH = "English";
	public final static String TEXT_LANGUAGE_ENGLISH_UK = "English (UK)";
	public static final String ALREADY_ENROLLED_MESSAGE = "[{\"ErrorCode\":\"ERENR001\",\"ErrorMessage\":\"User already enrolled\"}]";
	public static final String ECOM_ORG_CREATED_MESSAGE = "RequestID";
	public static final String CHANGE_STATUS_MESSAGE = "Test";


}
