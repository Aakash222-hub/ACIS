package com.acis.automation.pages.learner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.constants.Constants;
import com.acis.automation.constants.ILMSConstants;
import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

/**
 * /** This class is for defining objects of Leaner Center page and defining
 * methods on those objects.
 * 
 * @author Chandrashekhar.Reddy
 * @since 15 Feb 2018
 *
 */

public class LCHomePage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(LCHomePage.class);

	public LCHomePage() throws AcisException {
	}

	@FindBy(xpath = "//*[text()='Roles']")
	private WebElement linkLCSwitchRoles;

	@FindBy(id = "historyEnabledLinks_Main_Calendar")
	private WebElement linkCalendar;

	public String strRoleName = "//*[text()='ABC']";

	@FindBy(xpath = "//*[@id='liLogout']/a")
	private WebElement linkLCLogout;

	@FindBy(xpath = "//*[text()='Profile']")
	private WebElement linkProfileLC;

	@FindBy(xpath = "//*[@class='dropdown-toggle toggle-profile']/i")
	private WebElement iconSettingsLC;

	@FindBy(xpath = "//*[contains(text(),'Logout')]")
	private WebElement linkLogout;

	@FindBy(xpath = "//*[@id='txtF015']")
	private WebElement textUserEmailIDFieldValue;

	@FindBy(id = "lblCourseTitle")
	private WebElement textCourseNameiLMSConnect;

	@FindBy(id = "lblStatus")
	private WebElement textCourseStatusiLMSConnect;

	@FindBy(xpath = "//div[@class='col-sm-12 text-right lc-banner-main img-rounded']")
	WebElement imgBackgroundLogo;

	public By imgBackgroundLogoLocator = By.xpath("//div[@class='col-sm-12 text-right lc-banner-main img-rounded']");

	@FindBy(xpath = "//img[@class='img-responsive']")
	WebElement imgLogo;

	public By imgLogoLocator = By.xpath("//img[@class='img-responsive']");

	@FindBy(xpath = "//div[@class='logoImg']/a")
	WebElement imgLogoUrl;

	@FindBy(xpath = "//*[@id='ui_notifIt']/span[2]")
	WebElement textPasswordChangeToastMsg;

	@FindBy(xpath = "//*[text()='Change Password']")
	WebElement linkChangePassword;

	public By textProfilePageHeaderLocator = By.xpath("//h2[text()='Profile']");

	public By linkLCLogoutLocator = By.xpath("//*[@id='liLogout']/a");

	String strUserEmialIDFromProfileLC = null;
	String strCourseNameiLMSConnect = null;
	String strCourseStatusiLMSConnect = null;

	@FindBy(xpath = "//li[@class='li-role open']//ul[@class='dropdown-menu dropdown-menu-right']//li[@role='menuitem']")
	List<WebElement> listRolesDropDown;

	@FindBy(xpath = "//li[@class='li-role open']//ul[@class='dropdown-menu dropdown-menu-right']//li[2]/a")
	WebElement textRolesDropDown;

	List<String> listRoleNames = new ArrayList<String>();

	@FindBy(xpath = "//a[contains(text(),'Training Manager')]")
	WebElement linkTrainingManager;

	@FindBy(xpath = "//*[@id='language']/a")
	WebElement linkLanguage;

	@FindBy(id = "ddlRequirementTypeSelectedText")
	WebElement dropdownButtonChangeLanguage;

	@FindBy(id = "btnSave")
	WebElement buttonOk;

	@FindBy(xpath = "//*[@id='ui_notifIt']/span[2]")
	WebElement successMessage;

	/**
	 * This method is used to verify click on Roles menu from Learner Center
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 11 July 2019
	 */

	public LCHomePage clickOnRolesMenuFromLC() throws AcisException {
		waitForElement(linkLCSwitchRoles);
		clickWebElement(linkLCSwitchRoles);

		testLoggerInfo("Clicked on Roles link from Learner Center");

		logger.info("Clicked on Roles link from Learner Center");
		return this;

	}

	/**
	 * This method is used to click on Calendar link from Learner Center
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 11 July 2019
	 */

	public LCHomePage clickOnCalendarLinkFromLC() throws AcisException {
		waitForElement(linkCalendar);
		clickWebElement(linkCalendar);

		testLoggerInfo("Clicked on Calendar link from Learner Center");

		logger.info("Clicked on Calendar link from Learner Center");
		return this;

	}

	/**
	 * This method is used to click on expected Role name from Roles menu at Learner
	 * Center
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 11 July 2019
	 */
	public LCHomePage clickOnRoleNameFromRolesMenuAtLC(String rolenameLC) {
		waitForElement(linkLCSwitchRoles);
		getDynamicWebElement(strRoleName, rolenameLC).click();

		waitForElement(linkLogout);

		testLoggerInfo("Clicked on '" + rolenameLC + " Role");

		logger.info("Clicked on '" + rolenameLC + " Role");
		return this;
	}

	/**
	 * This method is used to click on Logout at Learner Center
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since 11 (Modified) July 2019
	 */

	public LCHomePage clickOnLogoutFromLC() throws AcisException {
		waitForPageLoad();
		clickWebElement(iconSettingsLC);
		waitForElement(linkLCLogout);
		clickWebElement(linkLCLogout);
		waitForPageLoad();

		testLoggerInfo("Clicked on 'Logout' link from Learner Center");

		logger.info("Clicked on 'Logout' link from Learner Center");
		return this;
	}

	/**
	 * This method is used to click on Roles Settings menu icon from Learner Center
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 11 July 2019
	 */

	public LCHomePage clickOnSettingsIconOnLearnerCenter() throws AcisException {
		waitForPageLoad();
		waitForElement(iconSettingsLC);
		clickWebElemntUsingJavascriptExecutor(iconSettingsLC);
		testLoggerInfo("Clicked on Settings icon from Learner Center");
		logger.info("Clicked on Settings icon from Learner Center");
		return this;
	}

	/**
	 * This method is used to click on Profile link from Learner Center Settings
	 * menu
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 11 July 2019
	 */

	public LCHomePage clickOnProfileLinkFromLearnerCenter() throws AcisException {
		waitForPageLoad();
		clickOnSettingsIconOnLearnerCenter();
		waitForElement(linkProfileLC);
		clickWebElement(linkProfileLC);
		waitForPageLoad();

		testLoggerInfo("Clicked on 'Profile' link from Learner Center");

		logger.info("Clicked on 'Profile' link from Learner Center");
		return this;
	}

	/**
	 * This method is to get Email ID from User Profile page from Learner Center
	 * 
	 * @return
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 10 June 2019
	 */

	public String getUserEmailIDFromUserProfileOnLC() throws AcisException {
		clickOnProfileLinkFromLearnerCenter();
		waitForElement(textUserEmailIDFieldValue);
		strUserEmialIDFromProfileLC = textUserEmailIDFieldValue.getAttribute("value").trim();

		testLoggerInfo("Captured the User Email ID :" + strUserEmialIDFromProfileLC
				+ "  from LC User Profile page for user created by iLMS Connect/Self Registration");

		logger.info("Captured the User Email ID :" + strUserEmialIDFromProfileLC
				+ "  from LC User Profile page for user created by iLMS Connect/Self Registration");
		return strUserEmialIDFromProfileLC;
	}

	/**
	 * This method is to get Course name From Course Description Page For
	 * iLMSConnect
	 * 
	 * @return
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 10 June 2019
	 */

	public String getCourseNameFromCourseDesPageForiLMSConnect() throws AcisException {
		waitForPageLoad();
		waitForElement(textCourseNameiLMSConnect);
		strCourseNameiLMSConnect = textCourseNameiLMSConnect.getText().trim();

		testLoggerInfo("Captured the Course Name :" + strCourseNameiLMSConnect
				+ " from Course Description page for user created by iLMS Connect");

		logger.info("Captured the Course Name :" + strCourseNameiLMSConnect
				+ " from Course Description page for user created by iLMS Connect");
		return strCourseNameiLMSConnect;
	}

	/**
	 * This method is to get Course Status From Course Description Page For
	 * iLMSConnect
	 * 
	 * @return
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 10 June 2019
	 */

	public String getCourseStatusFromCourseDesPageForiLMSConnect() throws AcisException {
		waitForPageLoad();
		strCourseStatusiLMSConnect = textCourseStatusiLMSConnect.getText().trim();

		testLoggerInfo("Captured the Course Status :" + strCourseStatusiLMSConnect
				+ " from Course Descroption page for user created by iLMS Connect");

		logger.info("Captured the Course Status :" + strCourseStatusiLMSConnect
				+ " from Course Descroption page for user created by iLMS Connect");
		return strCourseStatusiLMSConnect;
	}

	/**
	 * This method is used to verify logo
	 * 
	 * @author Nivedita.Yeolekar
	 * @throws AcisException
	 * @Since 21 June 2019
	 */

	public LCHomePage verifyLogoLCPage() throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(imgLogoLocator);
		Assert.assertEquals(imgLogo.getAttribute("title"), "Test Logo Title", "Incorrect title for logo");
		testLoggerPass("Verified Logo title on learner center page ");
		logger.info("Verified Logo title on learner center page");
		Assert.assertTrue(imgLogoUrl.getAttribute("href").contains("google.com"),
				"Incorrect logo url shown on mouse hover");
		testLoggerPass("Verified Logo URL on Learner Center page");
		logger.info("Verified Logo URL on Learner Center page");
		clickWebElement(imgLogoUrl);
		testLoggerInfo("Successfully clicked on logo on Learner Center page");
		logger.info("Successfully clicked on logo on Learner Center page");
		switchToWindow();

		String url = getCurrentURL();
		Assert.assertTrue(url.contains("google.com"), "Navigated to incorrect URL on clicking Logo");
		testLoggerPass("Successfully navigated to expected URL on clicking Logo");
		logger.info("Successfully navigated to expected URL on clicking Logo");
		waitForPageLoad();
		closeWindowsExceptParent();
		return this;
	}

	/**
	 * This method is used to verify Banner logo
	 * 
	 * @author Nivedita.Yeolekar
	 * @throws AcisException
	 * @Since 21 June 2019
	 */
	public LCHomePage verifyBannerLogoLCPage() throws AcisException {
		waitForPageLoad();
		// switchToWindow();
		waitAndVerifyElement(imgBackgroundLogoLocator);
		testLoggerInfo("Successfully navigated to learner center Home page");
		logger.info("Successfully navigated to learner center Home page");
		String bgImage = imgBackgroundLogo.getCssValue("background-image");
		Assert.assertTrue(bgImage.contains(Constants.VALID_BANNER_JPG), "Expected banner is not added to learner page");
		testLoggerPass("Expected banner is displayed on Learner Center");
		logger.info("Expected banner is displayed on Learner Center");
		waitForPageLoad();
		closeWindowsExceptParent();
		return this;
	}

	/**
	 * This method is used to click on Change Password button on 'Change Password'
	 * pop up at My Account page
	 * 
	 * @author Chandrashekhar.Reddy
	 * @throws AcisException
	 * @since 5 July 2019
	 */

	public LCHomePage verifyToastMessageAfterChangingPassword() throws AcisException {
		waitForElement(textPasswordChangeToastMsg);
		Assert.assertEquals(textPasswordChangeToastMsg.getText().trim(), Constants.PASSWORD_CHANGE_SUCESS_MESSAGE,
				"Failed to display toast message as :" + Constants.PASSWORD_CHANGE_SUCESS_MESSAGE
						+ " after changing password");
		logger.info("After changing the Pasword sucessfully toast message is displayed as : "
				+ Constants.PASSWORD_CHANGE_SUCESS_MESSAGE);
		testLoggerPass("After changing the Pasword sucessfully toast message is displayed as: "
				+ Constants.PASSWORD_CHANGE_SUCESS_MESSAGE);
		closeWindowsExceptParent();
		return this;

	}

	/**
	 * This method is used to verify Change Password functionality on 'Change
	 * Password' pop up
	 * 
	 * @author Chandrashekhar.Reddy
	 * @throws AcisException
	 * @since 8 July 2019
	 */

	/*public LCHomePage verifyChangePasswordFunctionality() throws AcisException {
		myAccount.enterOldPassword(testData.get(Constants.ORGNIZATION_SHEET).get("Password"));
		myAccount.enterNewPassword(appConfig.getProperty("newPasswordConfirmPassword"));
		myAccount.enterConfirmNewPassword(appConfig.getProperty("newPasswordConfirmPassword"));
		myAccount.clickOnChangePasswordButton();
		verifyToastMessageAfterChangingPassword();

		return this;
	}*/// sk changes

	/**
	 * This method is used to click on Change Password link on user Profile window
	 * from LC
	 * 
	 * @author Chandrashekhar.Reddy
	 * @throws AcisException
	 * @since 8 July 2019
	 */

	public LCHomePage clickOnChangePasswordlink() throws AcisException {

		waitForPageLoad();
		waitForElementClickable(linkChangePassword);
		clickWebElement(linkChangePassword);
		waitForPageLoad();
		logger.info("Clicked on ChangePassword link on 'User Profile' window");

		testLoggerInfo("Clicked on ChangePassword link on 'User Profile' window");
		waitForWindowsToBeOpened(3);
		switchToWindow();
		return this;
	}

	/**
	 * This method is used to verify User is on Profile page.
	 * 
	 * @author Shahenshaha.Mulani
	 * @throws AcisException
	 * @since 18 July 2019
	 */

	public LCHomePage verifyUserIsOnProfilePage() throws AcisException {
		waitAndVerifyElement(textProfilePageHeaderLocator);
		logger.info("Verified that User is on Profile page");

		testLoggerPass("Verified that User is on Profile page");
		return this;
	}

	/**
	 * This method is used to verify Logout link is not present under User's setting
	 * 
	 * @author Shahenshaha.Mulani
	 * @throws AcisException
	 * @since 18 July 2019
	 */

	public LCHomePage verifyLogoutLinkIsNotPresent() throws AcisException {

		Assert.assertFalse(isElementPresent(linkLCLogoutLocator), "Logout link is present under User's setting");
		logger.info("Verified that Logout link is not present under User's setting");
		testLoggerPass("Verified that Logout link is not present under User's setting");
		return this;
	}

	/**
	 * This method is to verify user is on Dashboard page
	 * 
	 * @author Nivedita.Yeolekar
	 * @since 5th August
	 */

	public LCHomePage verifyUserIsOnDashboardPage() throws AcisException {
		waitAndVerifyElement(imgBackgroundLogoLocator);
		logger.info("Verified that User is on LC Dashboard page");
		testLoggerPass("Verified that User is on LC Dashboard page");
		return this;
	}

	/**
	 * This method is to get role names
	 * 
	 * @author Nivedita.Yeolekar
	 * @since 5th August
	 */

	public List<String> getRoleNames() {
		waitForPageLoad();
		for (int i = 0; i < listRolesDropDown.size(); i++) {
			String roleName = listRolesDropDown.get(i).getText().trim();
			listRoleNames.add(roleName);

		}
		testLoggerInfo("Captured all role names: " + listRoleNames);
		logger.info("Captured all role names: " + listRoleNames);
		return listRoleNames;

	}

	/**
	 * This method is verify roles name in drop down
	 * 
	 * @author Nivedita.Yeolekar
	 * @since 5th August
	 */
	/*public LCHomePage verifyRoleNamesInDropDown() {
		List<String> roleNames = getRoleNames();
		String[] arrRoleNames = { "Author", "Instructor", "Realm Administrator", "System Admin", roles.getRoleName() };
		List<String> expectedRoleNames = Arrays.asList(arrRoleNames);
		for (String roles : roleNames) {
			Assert.assertTrue(expectedRoleNames.contains(roles));
			testLoggerPass("Verified role: " + roles + " is added to drop down");
			logger.info("Verified role: " + roles + " is added to drop down");
		}

		return this;
	}*///sk changes

	/**
	 * This method is to Verify Training Manger Role Present On Learner Center Page
	 * 
	 * @author Shahenshaha.Mulani
	 * @throws AcisException
	 * @since 07 August 2019
	 */

	public LCHomePage verifyTraningMangerRolePresentOnLearnerCenterPage() throws AcisException {
		waitForPageLoad();
		waitForElement(linkTrainingManager);
		Assert.assertEquals(linkTrainingManager.getText().trim(), ILMSConstants.TRAINING_MANAGER,
				"Failed to verify Training Manger role  is on Learner center page");
		logger.info("Verified Traning Manger Role Present On Learner Center Page");
		testLoggerPass("Verified Traning Manger Role Present On Learner Center Page");
		return this;
	}

	/**
	 * This method is to click on training manager link
	 * 
	 * @author Nivedita.Yeolekar
	 * @since 5th August
	 */
	public LCHomePage clickOnTrainingManagerLink() throws AcisException {
		waitForElementClickable(linkTrainingManager);
		clickWebElement(linkTrainingManager);
		logger.info("Clicked on Training Manager link");
		testLoggerInfo("Clicked on Training Manager link");
		waitForPageLoad();
		return this;
	}

	/**
	 * This method is used to click on Language link
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 31 October 2019
	 */
	public LCHomePage clickOnLanguageLink() throws AcisException {
		waitForPageLoad();
		waitForElementClickable(linkLanguage);
		clickWebElement(linkLanguage);
		testLoggerInfo("Clicked on Language link");
		logger.info("Clicked on Language link");
		return this;
	}

	/**
	 * This method is used to click on drop down Button of Change Language
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 31 October 2019
	 */
	public LCHomePage clickOnChangeLanguageDropdownButton() throws AcisException {
		waitForPageLoad();
		waitForElementClickable(dropdownButtonChangeLanguage);
		clickWebElement(dropdownButtonChangeLanguage);
		testLoggerInfo("Clicked on drop down Button of Change Language");
		logger.info("Clicked on drop down Button of Change Language");
		return this;
	}

	/**
	 * This method is used to select Language for Change Language
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 31 October 2019
	 */
	public LCHomePage selectLanguageForChangeLanguage(String strLanguage) throws AcisException {
		waitForPageLoad();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		WebElement element = getDynamicWebElement(strRoleName, strLanguage);
		clickWebElement(element);
		testLoggerInfo("Selected language as " + strLanguage + " for Change Language");
		logger.info("Selected language as " + strLanguage + " for Change Language");
		return this;
	}

	/**
	 * This method is used to click on OK button
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 31 October 2019
	 */
	public LCHomePage clickOnOkButton() throws AcisException {
		waitForPageLoad();
		waitForElementClickable(buttonOk);
		clickWebElement(buttonOk);
		testLoggerInfo("Clicked on Ok button");
		logger.info("Clicked on Ok button");
		return this;
	}

	/**
	 * This method is used to verify Change Language Success Message
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 31 October 2019
	 */
	public LCHomePage verifyChangeLanguageSuccessMessage() throws AcisException {
		waitForPageLoad();
		waitForElement(successMessage);
		Assert.assertEquals(successMessage.getText().trim(), ILMSConstants.SUCCESS_MESSAGE_CHANGE_LANGUAGE,
				"Success message with expected message is not displayed");
		testLoggerPass("Verified that Success message with expected message is displayed");
		logger.info("Verified that Success message with expected message is displayed");
		return this;
	}

}