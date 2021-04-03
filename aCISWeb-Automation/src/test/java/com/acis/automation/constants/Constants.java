package com.acis.automation.constants;

import com.acis.automation.utilities.OSInfo;

/**
 * This class is used for declaring Global variables as public static constants.
 * 
 */
public class Constants {

	public static final String SUITE_VALUE_FROM_JENKINS = "jenkin_Suite";
	public static String XPATHEXPRESSION_NODE = "suite/suite-files/suite-file";

	public static String SUITEATTRIBUTE_PATH = "path";

	public static String SUITE_NODE = "suite-file";

	public static String SUITEFILE_NODE = "/suite/suite-files";

	public static final String IT_SUPPORT_EMAIL = "hello@gmail.com";

	public static final String IT_SUPPORT_PHONE_NO = "9876543210";

	public static final String IT_SUPPORT_PHONE_NO_INVALID = "123456789012345678901";

	public static final String COURSES_SHEET = "Courses";

	public final static String BROWSER_NAME = "browser";
	public final static String IMPLICIT_WAIT = "implicit.wait";
	public final static String EXPLICIT_WAIT = "explicit.wait";

	public final static String FF_BROWSER = "firefox";
	public final static String IE_BROWSER = "IE";
	public final static String CHROME_BROWSER = "chrome";
	public static final String SAFARI_BROWSER = "safari";
	public static final String EDGE_BROWSER = "edge";
	public final static String CHROME_BROWSER_ON_MAC = "chromeOnMAC";
	public static final String BROWSER_VALUE_FROM_JENKINS = "jenkin_browser";
	public static final String APPLICATION_VALUE_FROM_JENKINS = "jenkin_Application";
	public static final String Suite_VALUE_FROM_JENKINS = "jenkin_Suite";

	public static final String IMPLICITWAIT_VALUE_FROM_JENKINS = "jenkin_implicitWait";
	public static final String EXPLICITWAIT_VALUE_FROM_JENKINS = "jenkin_explicitWait";
	public static final String PAGELOADWAIT_VALUE_FROM_JENKINS = "jenkin_pageLoadWait";
	public static final String HIGHLIGHTERFLAG_VALUE_FROM_JENKINS = "jenkin_HighlightFlag";

	public final static String DIRECTORY = "user.dir";

	// File paths

	public static final String APPCONFIG_FILE_PATH = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "src"
			+ OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator()
			+ "Properties" + OSInfo.getFileSeparator() + "appConfig.properties";

	public static final String BUGCONFIG_FILE_PATH = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "src"
			+ OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator()
			+ "Properties" + OSInfo.getFileSeparator() + "application_Bug.properties";

	public static final String REPORTCONFIG_FILE_PATH = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator()
			+ "src" + OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources"
			+ OSInfo.getFileSeparator() + "Properties" + OSInfo.getFileSeparator() + "extent-config.xml";

	public static final String TESTDATA_FILE_PATH = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "src"
			+ OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator()
			+ "TestData" + OSInfo.getFileSeparator() + "testdata.xlsx";

	public static final String EXTENT_OUTPUT_REPORT_PATH = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator()
			+ "Output" + OSInfo.getFileSeparator() + "HtmlReports" + OSInfo.getFileSeparator() + "%s.html";

	public static final String AUTOIT_FILE = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "src"
			+ OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator()
			+ "AutoITScripts" + OSInfo.getFileSeparator() + "autoIT.exe";

	public static final String COURCEFILE_PATH = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "src"
			+ OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator()
			+ "TestData" + OSInfo.getFileSeparator() + "TestResources" + OSInfo.getFileSeparator() + "Courses"
			+ OSInfo.getFileSeparator();

	public static final String OUTPUT_FOLDER = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "Output"
			+ OSInfo.getFileSeparator();
	public static final String SCREENSHOT_FOLDER_PATH = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator()
			+ "Output" + OSInfo.getFileSeparator() + "HtmlReports" + OSInfo.getFileSeparator() + "Screenshots"
			+ OSInfo.getFileSeparator();
	public static final String SOURCENODE_IE = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "src"
			+ OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator()
			+ "TestData" + OSInfo.getFileSeparator() + "SikuliTestData" + OSInfo.getFileSeparator() + "sourceNode.png";
	public static final String DEFAULTNODE_IE = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "src"
			+ OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator()
			+ "TestData" + OSInfo.getFileSeparator() + "SikuliTestData" + OSInfo.getFileSeparator() + "defaultNode.png";
	public static final String DESTINATIONNODE_IE = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "src"
			+ OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator()
			+ "TestData" + OSInfo.getFileSeparator() + "SikuliTestData" + OSInfo.getFileSeparator()
			+ "destinationNode.png";

	public static final String HTMLFOLDER = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "Output"
			+ OSInfo.getFileSeparator() + "HtmlReports" + OSInfo.getFileSeparator();

	public static final String TESTNGFILE_PATH = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "src"
			+ OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator()
			+ "TestRunners" + OSInfo.getFileSeparator() + "testng.xml";

	//Mrunal
	public static final String TESTDATA_CREATEDDATAFILE_PATH = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "src"
			+ OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator()
			+ "TestData" + OSInfo.getFileSeparator() + "createdData.xlsx";

	public static final String OUTPUT_FOLDER_ZIP = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "Output"
			+ OSInfo.getFileSeparator() + "HtmlReports.zip";

	public static final String UPLOAD_PATH_USING_SENDKEYS = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator()
			+ "src" + OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources"
			+ OSInfo.getFileSeparator() + "TestData" + OSInfo.getFileSeparator() + "TestResources"
			+ OSInfo.getFileSeparator() + "Courses" + OSInfo.getFileSeparator();

	public static final String UPLOAD_PATH_USING_SENDKEYS_FORCSV = System.getProperty(DIRECTORY)
			+ OSInfo.getFileSeparator() + "src" + OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator()
			+ "resources" + OSInfo.getFileSeparator() + "TestData" + OSInfo.getFileSeparator() + "TestResources"
			+ OSInfo.getFileSeparator() + "CSVFiles" + OSInfo.getFileSeparator();

	public static final String UPLOAD_PATH_USING_SENDKEYS_FOR_IMAGES = System.getProperty(DIRECTORY)
			+ OSInfo.getFileSeparator() + "src" + OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator()
			+ "resources" + OSInfo.getFileSeparator() + "TestData" + OSInfo.getFileSeparator() + "TestResources"
			+ OSInfo.getFileSeparator() + "ImageFiles" + OSInfo.getFileSeparator();

	public static final String AUTOIT_FILE_CHROME = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "src"
			+ OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator()
			+ "AutoITScripts" + OSInfo.getFileSeparator() + "autoIT_Chrome.exe";

	public static final String AUTOIT_FILE_FF = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "src"
			+ OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator()
			+ "AutoITScripts" + OSInfo.getFileSeparator() + "autoIT_FF.exe";

	public static final String AUTOIT_FILE_IE = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "src"
			+ OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator()
			+ "AutoITScripts" + OSInfo.getFileSeparator() + "autoIT_IE.exe";

	public static final String UPLOAD_PATH = OSInfo.getFileSeparator() + "src" + OSInfo.getFileSeparator() + "test"
			+ OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator() + "TestData"
			+ OSInfo.getFileSeparator() + "TestResources" + OSInfo.getFileSeparator() + "Courses"
			+ OSInfo.getFileSeparator();

	public static final String UPLOAD_PATH_CSV = OSInfo.getFileSeparator() + "src" + OSInfo.getFileSeparator() + "test"
			+ OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator() + "TestData"
			+ OSInfo.getFileSeparator() + "TestResources" + OSInfo.getFileSeparator() + "CSVFiles"
			+ OSInfo.getFileSeparator();

	public static final String UPLOAD_PATH_IMAGE = OSInfo.getFileSeparator() + "src" + OSInfo.getFileSeparator()
			+ "test" + OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator() + "TestData"
			+ OSInfo.getFileSeparator() + "TestResources" + OSInfo.getFileSeparator() + "ImageFiles"
			+ OSInfo.getFileSeparator();

	public static final String DOWNLOAD_PATH = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "src"
			+ OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator()
			+ "Downloads" + OSInfo.getFileSeparator();

	public static final String FILE_PATH = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "src"
			+ OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator()
			+ "TestData" + OSInfo.getFileSeparator() + "TestResources" + OSInfo.getFileSeparator() + "CSVFiles"
			+ OSInfo.getFileSeparator();;

	public static final String DEFAULT_SUBJECT_LINE_CONTENT_ENROLLMENT_EMAIL = "[ORGANIZATION NAME] Enrollment: You are now enrolled in [COURSE NAME].";
	public static final String APPLICATION_URL = "testsiteurl";
	public static final String LOGINPAGE_SHEET = "Login";
	public static final String ORGNIZATION_SHEET = "Organization";
	public static final String LEARNINGPATH_SHEET = "LearningPath";

	public static final String GROUPS_ROLES_SHEET = "Groups_Roles";
	public static final String USERS_SHEET = "Users";
	public static final String SCORMPAGE_SHEET = "Courses";

	public final static String APPLICATION_NAME = "application";

	public final static String ENVIRONMENT_DEVQA = "DevQA";
	public final static String ENVIRONMENT_STAGING = "Staging";

	public static final String ENVIRONMENT_VALUE_FROM_JENKINS = "jenkins_Environment";
	public final static String ENVIRONMENT_NAME = "environment";

	public final static String ENVIRONMENT_STRING = "env";
	public final static String CONFIG_FILE_PREFIX = "aCISConfig_";

	public final static String ILMSDEVQAMSA = "ilmsdevqamsa";
	public final static String ILMSDEVQADEFAULT = "iLMS_devqa";
	public final static String ILMSDEVQACUSTOM = "ilmsdevqacustom";
	public final static String STAGINGMSA = "stagingmsa";
	public final static String STAGINGDEFAULT = "iLMS_staging";
	public final static String STAGINGCUSTOM = "stagingcustom";

	public static final String ILMSDEVQAMSA_URL = "ilmsdevqamsaurl";
	public static final String ILMSDEVQADEFAULT_URL = "ilmsdevqadefaulturl";
	public static final String ILMSDEVQACUSTOM_URL = "ilmsdevqacustomturl";

	public static final String STAGINGMSA_URL = "stagingmsaurl";
	public static final String STAGINGDEFAULT_URL = "stagingdefaulturl";
	public static final String STAGINGCUSTOM_URL = "stagingcustomurl";
	public final static String MAXRETRY_COUNT = "maxretyrcount";

	public static final String PAGE_LOAD_WAIT_TIME = "PageLoadWait";
	public static final String RANDOM_STRING_COUNT = "randomStringCount";

	public static String EXCEPTION_MESSAGE = "Exception occured in executing test case : ";
	public static String INVALID_LOGIN_ERROR_MESSAGE = "Incorrect Username/Password. Please try again.";

	public static final String HIGHLIGHT_FLAG = "flagHighlight";
	public static final String UTILITY_TO_UPDATE_LPs_ON_DEVQA = "utilityToupdateLPondevqa";
	public static final String UTILITY_TO_UPDATE_LPs_ON_STG = "utilityToupdateLPonstg";

	public static final String LP_TESTDATASETUP_FLAG = "lptestdatasetup";
	public static final String TESTDATA_USERS_COUNT = "lptestdatauserscount";
	public static final String TESTDATA_COURSES_COUNT = "lptestdatacoursescount";

	public static final String REGISTER_USERS_COUNT = "registeruserscount";

	public static final String ORGADMIN_TESTDATASETUP_FLAG = "orgadmintestdatasetup";
	public static final String ORGADMIN_TESTDATA_USERS_COUNT = "orgadmintestdatauserscount";
	public static final String ORGADMIN_TESTDATA_COURSES_COUNT = "orgadmintestdatacoursescount";

	public static final String MSA_TESTDATASETUP_FLAG = "msatestdatasetup";
	public static final String MSA_TESTDATA_USERS_COUNT = "msatestdatauserscount";
	public static final String MSA_TESTDATA_COURSES_COUNT = "msatestdatacoursescount";

	public static final String LEARNER_TESTDATASETUP_FLAG = "learnertestdatasetup";
	public static final String LEARNER_TESTDATA_USERS_COUNT = "learnertestdatauserscount";
	public static final String LEARNER_TESTDATA_COURSES_COUNT = "learnertestdatacoursescount";

	/*
	 * public static final String LOGOIMAGE_PATH = System.getProperty(DIRECTORY) +
	 * OSInfo.getFileSeparator() + "src" + OSInfo.getFileSeparator() + "test" +
	 * OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator() +
	 * "TestData" + OSInfo.getFileSeparator() + "iel_logo.jpg";
	 */ public static final String DEVQA_HOMEURL = "https://ilmsdevqa.inspiredlms.com/user/master.aspx";
	public static final String STAGING_HOMEURL = "https://staging.inspiredlms.com/user/master.aspx";

	// [LP Constant]
	public static final String DELETE_SIMULATION_ALERT_MESSAGE = "This action will remove the simulation from the Learning Path. Do you want to continue?";
	public static final String DELETE_COURSE_ALERT_MESSAGE = "This action will remove the course from the Learning Path. Do you want to continue?";
	public static final String WARNING_SAVE_MESSAGE = "Do you want to save changes to the Educational Milestones tab before moving on?";
	/**
	 * These constants are for Bulk Update TCs
	 * 
	 * 
	 * R,U,I,D,P represents different actions which are used in Bulk Update:
	 * Register-R, Update-U,Inactive-I,Delete-D,Purge-P
	 */

	public static final String CREATE_USERS_BU_CSV = "CreateUsers_BulkUpdate.csv";
	public static final String UPDATE_USERS_BU_CSV = "UpdateUsers_BulkUpdate.csv";
	public static final String UPDATE_USERS_BU_CSV_UPDATE_PROFILE_CSV = "UpdateUsers_BulkUpdate_For_Update.csv";

	public static final String INACTIVE_USERS_BU = "InactiveUsers_BulkUpdate.csv";
	public static final String ACTION_R_BU_CSV = "R";
	public static final String ACTION_U_BU_CSV = "U";
	public static final String ACTION_I_BU_CSV = "I";
	public static final String ACTION_D_BU_CSV = "D";
	public static final String ACTION_P_BU_CSV = "P";
	public static final String ACTION_COLUMN_NUM_BU_CSV = "31";
	public static final String EMAIL_ID_COLUMN_NUM_BU_CSV = "13";
	public static final String FIRSTNAME_COLUMN_NO_BU_CSV = "0";
	public static final String LASTNAME_COLUMN_NO_BU_CSV = "1";

	public static final String SELF_REG_WITHOUT_EMAIL_VERIFCATION_RD_BTN = "Allow immediate login after self-registration without email verification";

	public static final String SELF_REG_WITH_EMAIL_VERIFCATION_RD_BTN = "Require email addresses be verified before activating an account";

	public static final String SOURCEREGION = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "src"
			+ OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator()
			+ "TestData" + OSInfo.getFileSeparator() + "SikuliTestData" + OSInfo.getFileSeparator()
			+ "AddRegionBlank.png";
	public static final String INACTIVATE_USERS_BU = "InactiveUsers_BulkUpdate.csv";
	public static final String DELETE_USERS_BU_CSV = "DeleteUsers_BulkUpdate.csv";
	public static final String PURGE_USERS_BU_CSV = "PurgeUsers_BulkUpdate.csv";

	public static final String INVALID_BU_CSV_FILE_1 = "Invalid_Users_BulkUpdate1.csv";

	public static final String BULK_UPDATE_COMPLETION_SUCESS_MESSAGE = "The bulk update was completed successfully";

	public static final String CRETEUSER_URL = "/organizations/%s/users";
	public final static String INACTIVATE_USER_URL = "/organizations/%s/users/%s/Activate";
	public final static String DELETE_USER_URL = "/organizations/%s/users/%s";

	// [Import Course]
	public static final String TEXT_NEWLY_IMPORT_COURSE_INFO = "Click here to open the newly imported course.";
	// [Roles]
	public final static String ROLES_ADD_SUCCESS_POP_MESSAGE = "Role saved successfully.";
	public final static String GROUPS_ADD_SUCCESS_POP_MESSAGE = "The settings were saved successfully.";

	// [Branding]
	public static final String INVALID_LOGO_MESSAGE = "Image width and height have been identified greater than recommended size";
	public static final String BANNER_UPLOAD_SUCESS_MESSAGE = "Settings saved successfully.";
	public static final String DIM_260X260_GIF = "260x260.gif";
	public static final String VALID_BANNER_JPG = "validbanner.jpg";
	public static final String LOGO_UPLOAD_SUCESS_MESSAGE = "The logo settings were saved successfully.";
	public static final String INVALID_LOGO_FORMAT_300X250_JPG = "invalidLogoFormat_300X250.jpg";
	public static final String VALID_LOGO_260X88_JPG = "validLogo_260X88_jpg.jpg";
	public static final String VALID_LOGO_260X88_GIF = "validLogo_260X88_gif.gif";
	public static final String VALID_LOGO_260X88_JPEG = "validLogo_260X88_jpeg.jpeg";
	public static final String VALID_LOGO_260X88_PNG = "validLogo_260X88_png.png";

	public static final String CRETEREGION_URL = "/organizations/%s/regions";
	public static final String CRETEDIVISION_URL = "/organizations/%s/regions/%s/divisions";
	public static final String CRETEDEPARTMENT_URL = "/organizations/%s/regions/%s/divisions/%s/departments";
	public final static String ENROLL_UNENROLL_UESR_INTO_FROM_COURSE = "/organizations/%s/Courses/%s/enrollments";
	public final static String CHANGE_TRANSCRIPT_URL_COURSES = "/organizations/%s/users/%s/Courses/%s/transcripts";
	
	public final static String CHANGE_TRANSCRIPT_URL_CURRICULUM = "/organizations/%s/users/%s/curricula/%s/transcripts";

	public static final String BULKUPDATE_5K_USERS_EMAIL_STARTWITH = "BU_5K_Reg";

	public static final String CREATE_5K_USERS_BU_CSV = "Create_5K_Users_BulkUpdate.csv";

	public static final String PASSWORD_UNTIQUENESS_BU_CSV = "Password_Uniqueness_BulkUpdate.csv";

	public static final String PASSWORD_COMPLEXITY_BU_CSV = "Password_Complexity_BulkUpdate.csv";

	public static final String PASSWORD_UNTIQUENESS_VALIDATION = "New Password cannot be the same as the current Password.";

	public static final String PASSWORD_COMPLEXITY_UPPERCASE_VALIDATION = "The Password must have at least 1 uppercase letter.";

	public static final String PASSWORD_COMPLEXITY_NUMERIC_VALIDATION = "The Password must have at least 1 number.";

	public static final String PASSWORD_COMPLEXITY_SPECIAL_CHARACTER_VALIDATION = "The Password must have at least 1 special character.";

	public static final String PASSWORD_COMPLEXITY_LENGTH_VALIDATION = "The Password must be at least %s characters long.";

	public static final String PASSWORD_DEFAULT_LENGTH = "11";

	public static final String PASSWORD_LENGTH = "12";
	public static final String PASSWORD_MAX_LENGTH = "100";

	public static final String PASSWORD_LENGTH_LESSER_THAN_MIN = "10";
	public static final String PASSWORD_LENGTH_HIGHER_THAN_MAX = "101";

	public static final String PASSWORD_LENGTH_VALIDATION = "Minimum Password Length: Invalid value provided. Valid values are 11 to 100.";

	public static final String PASSWORD_COMPLEXITY_RULES_TEXT = "Please create a new password below. The new password must contain a minimum of";

	public static final String PASSWORD_COMPLEXITY_UPPER_CASE = "1 uppercase letter,";

	public static final String PASSWORD_COMPLEXITY_NUMERIC = "1 number,";
	public static final String PASSWORD_COMPLEXITY_SPECIAL_CHRS = "1 special character";

	public static final String PASSWORD_CHANGE_SUCESS_MESSAGE = "Password Changed Successfully.";

	public static final String FORGOT_PASSWORD_REQUEST_MESSAGE = "We have received your request. If you do not receive an email within 2 hours to reset your password, please contact your admin.";

	// [ Course Windows Constant]

	// [ Course Windows Constant]

	public final static String CREATE_NEW_VERSION_SUCCESS_MESSAGE = "This will create a new version of the course. Current users retain the same version. Users who have not started the course will receive the latest version when they open the course for the first time. If you do not wish to create another version of the course you can edit the published versions in the iComposer window by selecting the published version from the left bar. To continue creating a new version of this course click OK. Otherwise click Cancel.";
	public final static String NEW_VERSION_SUCCESSFULLLY_PUBLISHED_SUCCESS_MESSAGE = "Course successfully published";
	public final static String COURSE_CONTENT_SUCCESSFULLLY_MODIFIED_SUCCESS_MESSAGE = "Course contents successfully modified.";

	public static final String PASSWORD_SETTINGS_SAVED_SUCESS_MESSAGE = "Passwords settings were saved successfully.";

	// [Enroll by Group]
	public static final String CREATE_5K_USERS_ENROLLBYGROUP_CSV = "Create_5K_Users_EnrollByGroup.csv";
	public static final String ENROLLBYGROUP_5K_USERS_EMAIL_STARTWITH = "EnrollByGroup";
	public static final String TRANSCRIPT_NO_RECORD_FOUND = "No record found.";
	public static final String DUE_DATE_SAVE_SETTINGS_SUCCESS_MESSAGE = "The settings were saved successfully.";
	public static final String COURSE_ADDED_IN_GROUP_SUCCESS_MESSAGE = "The settings were saved successfully.";
	public static final String USERS_ADDED_GROUP_SUCCESS_MESSAGE = "The settings were saved successfully.";
	public static final String USERS_ADDED_BULK_ENROLL_CSV = " The following user(s) will be ENROLLED";
	public static final String CREATE_5K_USERS_ENROLLBYCSV = "Create_5k_EnrollByCSV.csv";
	public static final String ENROLLBYCSV_5K_USERS_EMAIL_STARTWITH = "EnrollByCSV";
	public static final String CREATE_USERS_BY_CSV = "CreateUsersByCSV.csv";

	// zoltar
	public static final String CREATEORGDATA_SHEET = "POTTER_API";
	public static final String AFTERRESETPASSWORD_URLDEVQA = "LoginAfterResetURL_devqa";
	public static final String AFTERRESETPASSWORD_URLSTAGING = "LoginAfterResetURL_staging";
	public final static String EXPLICIT_WAIT_REQUEST_SUBMISSION = "requestsubmissionwait";
	public final static String BULK_UPDATE_TEMPLATE = "BulkUpdateTemplate_MSA.csv";
	public final static String POTTER_ORG_API = "/api/organizations";
	public final static String POTTER_ORG_USER_COUNT = "1";

	public final static String POTTER_RANDOM_ORG_EMAIL_ALPHABET = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

	// [MSA Login Page]
	public static final String MSA_USER_NAME_PASSWORD_BLANK_ERROR_MESSAGE = "Username: The field cannot be blank.\nPassword: The field cannot be blank.";

	public static final String MSA_COPY_COURSE_REQUEST_SUCCESS_MESSAGE = "A request has been added to copy courses. It is being processed.";

	public static final String FTP_PORT = "21";
	public static final String FTP_HOSTNAME = "184.73.162.190";
	public static final String FTP_REMOTE_DIRECTORY = "/FTPDevQA";
	public static final String FTP_USERNAME = "ftp_UserName";
	public static final String FTP_PASSWORD = "ftp_Password";

	public final static String TM_ORG_API = "/administration/accountrequests";
	public final static String KEY_GENERATION_URL = "https://ilmsdevqa.inspiredlms.com/utilities/DESEnc.aspx";

	public static final String TEXT_ON_DOWNLOAD_REPORT_POPUP = "Report Generation Complete.";

/*	// [Advance Search]
	public static final String ICOMPOSER_AVAILABLE_FEATURES = "iComposer";
	public static final String ILT_AVAILABLE_FEATURES = "ILT / Events";
	public static final String MY_REPORTS_AVAILABLE_FEATURES = "My Reports";
	public static final String ECOMMERCE_LICENSE_METHODS = "eCommerce";
	public static final String ENTERPRISE_LICENSE_METHODS = "Enterprise via a Sales Rep";
	public static final String PAY_ECOMMERCE_LICENSE_METHODS = "Pay As You Go via eCommerce";
	public static final String AVIAILABLE_FEATURES = "Available Features";
	public static final String LICENSE_METHODS = "License Methods";
	public static final String ACCOUNT_TYPE_PRODUCTION = "Production";
	public static final String ACCOUNT_TYPE_TRIAL = "Test/Trial";
	public static final String ACCOUNT_TYPE = "Account Type";
	public static final String NO_RECORD_FOUND = "No record found.";
	public static final String SEARCH_EMAIL_ALIAS = "Searchiel@automation.com";
	public static final String ADVANCE_SERACH_INVALID_ENTER_SERACH = "InvalidEmail";
	public static final String ADVANCE_SEARCH_EMAILID_TEXTBOX = "Email ID (Admins/Users)";
	public static final String ADVANCE_SEARCH_ACCOUNT_TYPE_CHECK = "checked";
	public static final String ADVANCE_SEARCH_ACCOUNT_TYPE_UNCHECK = "unchecked";
	public static final String ENTER_VALID_EMAIL_ALERT_MESSAGE = "Please enter a valid email address to search.";
	public static final String ADVANCE_SEARCH_ENTER_ORG_SEARCH = "AutoOrg";
	public static final String ADVANCE_SEARCH_INPUT1 = "mh@magarpatta.com";
	public static final String ADVANCE_SEARCH_INPUT2 = "mh@pune.com";
	public static final String ROLE_NAME_LEARNER = "Learner";

	public final static String GET_ALL_GROUPS = "/organizations/%s/groups";

	public final static String ADD_USER_IN_GROUPS_EXPLICIT_INCLUSION_LIST = "/organizations/%s/groups/%s/explicitinclusionlistusers";
*/
	public static final String ICOMPOSER_LAUNCH_NEXT_ARROW = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator()
			+ "src" + OSInfo.getFileSeparator() + "test" + OSInfo.getFileSeparator() + "resources"
			+ OSInfo.getFileSeparator() + "TestData" + OSInfo.getFileSeparator() + "SikuliTestData"
			+ OSInfo.getFileSeparator() + "iComposer Arrow Next.png";

	public final static String ENROLL_UNENROLL_UESR_INTO_FROM_CURRICULUM = "/organizations/%s/curricula/%s/enrollments";

		public static final String ICOMPOSER_AVAILABLE_FEATURES = "iComposer";
		public static final String ILT_AVAILABLE_FEATURES = "ILT / Events";
		public static final String MY_REPORTS_AVAILABLE_FEATURES = "My Reports";
		public static final String ECOMMERCE_LICENSE_METHODS = "eCommerce";
		public static final String ENTERPRISE_LICENSE_METHODS = "Enterprise via a Sales Rep";
		public static final String PAY_ECOMMERCE_LICENSE_METHODS = "Pay As You Go via eCommerce";
		public static final String AVIAILABLE_FEATURES = "Available Features";
		public static final String LICENSE_METHODS = "License Methods";
		public static final String ACCOUNT_TYPE_PRODUCTION = "Production";
		public static final String ACCOUNT_TYPE_TRIAL = "Test/Trial";
		public static final String ACCOUNT_TYPE = "Account Type";
		public static final String NO_RECORD_FOUND = "No record found.";
		public static final String SEARCH_EMAIL_ALIAS = "Searchiel@automation.com";
		public static final String ADVANCE_SERACH_INVALID_ENTER_SERACH = "InvalidEmail";
		public static final String ADVANCE_SEARCH_EMAILID_TEXTBOX = "Email ID (Admins/Users)";
		public static final String ADVANCE_SEARCH_ACCOUNT_TYPE_CHECK = "checked";
		public static final String ADVANCE_SEARCH_ACCOUNT_TYPE_UNCHECK = "unchecked";
		public static final String ENTER_VALID_EMAIL_ALERT_MESSAGE = "Please enter a valid email address to search.";
		public static final String ADVANCE_SEARCH_ENTER_ORG_SEARCH = "AutoOrg";
		public static final String ADVANCE_SEARCH_INPUT1 = "mh@magarpatta.com";
		public static final String ADVANCE_SEARCH_INPUT2 = "mh@pune.com";
		public static final String ROLE_NAME_LEARNER = "Learner";
		
		public final static String GET_ALL_GROUPS = "/organizations/%s/groups";
		
		public final static String ADD_USER_IN_GROUPS_EXPLICIT_INCLUSION_LIST = "/organizations/%s/groups/%s/explicitinclusionlistusers";
		
		public final static String CYQAPI_ORGLEVEL_CURRENT = "/organizations/%s/reports/cyq/orglevel/current";
		public final static String CYQAPI_ORGLEVEL_HISTORY = "/organizations/%s/reports/cyq/orglevel/history";
		public final static String ISVAPI_ORGLEVEL_CURRENT = "/organizations/%s/reports/isv/orglevel/current";
		public final static String ISVAPI_ORGLEVEL_HISTORY = "/organizations/%s/reports/isv/orglevel/history";

		
		
		//Mrunal
		public static final String NewAddresses_SHEET = "NewAddressess";
		public static final String PersonInvolvedIntake_SHEET = "PersonInvolvedIntake";
		
		//dharmesh
		   /*Constant for Report Details Page on Intake Omniscript
        */

       public static final String REPORTDETAILSPAGE = "ReportDetails";


       /*Constant for Personal Identifier Page from Person Accounts
        */
       public static final String PERSONALIDENTIFIERPAGE = "PersonalIdentifier";
       
       /*Constant for Education Page from Person Accounts
        */
       public static final String EDUCATIONPAGE = "Education";
     //Mrunal
       public static final String SearchAllegationInfo_SHEET= "SearchAllegationInfo";
       
     //Mrunal
       public static final String PersonInvovledAllData= "PersonInvovledAllData";
     //Mrunal
       public static final String PriorityResponseTime_SHEET= "PriorityResponseTime";
		//Akash
       
       public static final String SupervisorDecisionDepositionUpdatePage="SupervisorDecisionDeposition";
       
       //Akash
       
       public static final String AddressCreationIntakeOmniScriptPage="AddressUpdate";
       //Mrunal
       public static final String UPLOAD_FILE_PATH = System.getProperty(DIRECTORY) + OSInfo.getFileSeparator() + "src"
   			+ OSInfo.getFileSeparator() + "test" +  OSInfo.getFileSeparator() + "resources" + OSInfo.getFileSeparator()
   			+ "TestData" + OSInfo.getFileSeparator()  + "TestResources" + OSInfo.getFileSeparator() + "FilesUpload"
   			+ OSInfo.getFileSeparator() ;
       //Akash
       public static final String VerificationIntakeLabelPage="VerificationIntakeLabel";
       
       //Akash
       
       public static final String PersonIncomePage="PersonIncomePage";
       
       //Akasg
       public static final String PhoneEmailPage="PhoneEmail";
       
       //Akash
       public static final String AssignInvestigation="AssignInvestigation";
       
       public static final String InvestigationSafetyAssessment="InvestigationSafetyAssessment";
     //Mrunal
       public static final String EndDateInvestigation_SHEET= "EndDateInvestigation";
       //Mrunal
       public static final String WorkflowInterview_SHEET= "WorkflowInterview";
       //Akash
       public static final String InvestigationSafetyFeature="InvestigationSafetyFeature";

       //Akash 
       public static final String Narrative="Narrative";

     //Mrunal
       public static final String PhoneEmailSA_SHEET= "PhoneEmailSA";

       //Dharmesh
       public static final String SearchPerson_SHEET= "SearchPerson";
       
       //Akash
       public static final String OOhservicesCasePage= "OOhservicesCasePage";
       
       //Akash
       public static final String ValidationCasePlanPage ="ValidationCasePlanPage";
       
       //Akash
       
       public static final String FamilyPlaceBook="FamilyPlaceBook";
       
     //Mrunal
       public static final String PersonAccountCreation_SHEET ="PersonAccountCreationAllData";
       
       //Akash
       public static final String AccountProviderManagemnt ="AccountProviderManagemnt";
       
     //Mrunal
       public static final String PersonAccountDataToUse_SHEET = "PersonAccountDataToUse";

       //Dharmesh
       public static final String PersonInvolvedInvestigation_SHEET = "PersonInvolvedInvestigation";
       public static final String ProviderAgencyAccount_SHEET = "ProviderAgencyAccount";
       public static final String PlacementAccount_SHEET = "PlacementAccount";
       
       //Akash
       public static final String EstablishRelationshipPage="EstablishRelationshipPage";
       
       
}
