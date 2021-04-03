package com.acis.automation.pages.learner;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.constants.Constants;
import com.acis.automation.constants.ILMSConstants;
import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;
import com.google.common.collect.Ordering;

/**
 * /** This class is for defining objects of Leaner Center My Courses page and
 * defining methods on those objects.
 * 
 * @author Shahenshaha.Mulani
 * @since 09 APR 2018
 *
 */

public class LCMyCoursesPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(LCMyCoursesPage.class);

	public LCMyCoursesPage() throws AcisException {
	}

	List<String> listOfCoursesNamesFromLC = new ArrayList<String>();
	List<String> listOfCourseStatusFromDropdown = new ArrayList<String>();
	List<String> listOfRequirementTypes = new ArrayList<String>();
	List<String> listOfCourseStatus = new ArrayList<String>();
	List<String> listOfEnrollDatesFromLC = new ArrayList<String>();
	List<String> listOfDatesTemp = new ArrayList<String>();
	List<String> listOfStartDatesFromLC = new ArrayList<String>();
	List<String> listOfDueDatesFromLC = new ArrayList<String>();
	List<String> listOfCompletionDatesFromLC = new ArrayList<String>();

	public List<String> courseStatusForToggleSwitchON = Arrays.asList("Not Started", "In Progress", "Pass", "Fail",
			"Waived", "Past Due");
	public List<String> courseStatusForToggleSwitchOFF = Arrays.asList("Not Started", "In Progress", "Past Due");

	public List<String> coursesForToggleSwitchON = Arrays.asList(
			testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName1"),
			testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName2"),
			testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName3"),
			testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName4"),
			testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName5"),
			testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName6"));

	public List<String> coursesForToggleSwitchOFF = Arrays.asList(
			testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName1"),
			testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName5"),
			testData.get(Constants.COURSES_SHEET).get("SCORM_CourseName6"));

	public List<String> defaultCourseStatusOrder = Arrays.asList("In Progress", "Not Started", "Pass", "Fail",
			"Waived");
	public List<String> reverseCourseStatusOrder = Arrays.asList("Waived", "Fail", "Pass", "Not Started",
			"In Progress");

	@FindBy(xpath = "//a[text()='My Courses']")
	WebElement linkMyCourses;

	@FindBy(xpath = "//table[@role='treegrid']/tbody/tr/td[2]/div/div[2]/div[1]/a")
	List<WebElement> listMyCourses;

	public String CourseStatusOnLC = "//*[text()='ABC']/following::td[5]/span";

	public By txtNoRecordLocator = By.xpath("//*[@id='divNoRecord']/div/div");

	@FindBy(xpath = "//*[@id='divNoRecord']/div/div")
	WebElement txtNoRecord;

	@FindBy(xpath = "//*[@id='toggle-event']/following::span[1]")
	WebElement iconToggleShowCompletedCourses;

	@FindBy(xpath = "//*[text()='Advanced Search']")
	WebElement linkAdvancedSearch;

	@FindBy(xpath = "//*[@id='ddlCourseStatus']/ul/li[not(@style)]")
	List<WebElement> listCourseStatusFromDropdown;

	@FindBy(id = "ddlCourseStatus")
	WebElement dropDownCourseStatus;

	@FindBy(xpath = "//span[contains(text(),'Launch Course')]")
	WebElement btnLaunchCourse;

	@FindBy(id = "idPrefix_txtSearchString")
	WebElement textboxSearch;

	@FindBy(id = "idPrefix_srch_submit2")
	WebElement iconSearch;

	@FindBy(id = "historyEnabledLinks_Main_Home")
	WebElement linkHome;

	@FindBy(id = "ddlRequirementTypeSelectedText")
	WebElement dropDownRequirementType;

	@FindBy(xpath = "//*[@title='Search']")
	WebElement buttonAdvancedSearch;

	@FindBy(xpath = "//table[@role='treegrid']/tbody/tr/td[2]/div/div[2]/div[1]/p")
	List<WebElement> listRequirementType;

	@FindBy(id = "chk_Passed")
	WebElement checkboxPass;

	String checkboxAdvancedSearchOptions = "//lable[contains(text(),'ABC')]/preceding::input[1]";

	@FindBy(xpath = "//table[@role='treegrid']/tbody/tr/td[7]/span")
	List<WebElement> listCourseStatus;
	private By modeSelectionTextLocator = By.xpath("//p[text()='PLEASE SELECT A PRESENTATION MODE:']");

	@FindBy(xpath = "//a[@id='videoMode2']")
	private WebElement textModeLink;

	@FindBy(xpath = "//a[@id='videoMode1']")
	private WebElement audioModeLink;

	@FindBy(xpath = "//a/p[text()='Resume']")
	private WebElement resumeButton;

	@FindBy(xpath = "//a/p[text()='Restart']")
	private WebElement restartButton;

	@FindBy(xpath = "//a[@alt='Next']")
	private WebElement nextPageButton;

	@FindBy(id = "FreeFormDialogCloseButton")
	WebElement buttonContinue;

	private By buttonContinueLocator = By.xpath("FreeFormDialogCloseButton");

	private By firstPageLocator = By.xpath("//a[@id='backward-button' and @onclick='return false']");

	private By randomPageLocator = By.xpath("//a[@id='page-combo' and text()='Summary']");

	private By restartButtonLocator = By.xpath("//a/p[text()='Restart']");

	private By resumeButtonLocator = By.xpath("//a/p[text()='Resume']");

	public String iconSorting = "//*[text()='ABC']/span";
	public String linkColumnName = "//a[text()='ABC']";

	@FindBy(xpath = "//table[@role='treegrid']/tbody/tr/td[3]")
	List<WebElement> listEnrollDate;

	@FindBy(xpath = "//table[@role='treegrid']/tbody/tr/td[4]")
	List<WebElement> listStartDate;

	@FindBy(xpath = "//table[@role='treegrid']/tbody/tr/td[5]")
	List<WebElement> listDueDate;

	@FindBy(xpath = "//table[@role='treegrid']/tbody/tr/td[6]")
	List<WebElement> listCompletionDate;

	/**
	 * This method is used to click on My Courses link
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 17 July 2019
	 */

	public LCMyCoursesPage clickOnMyCourses() throws AcisException {
		waitForPageLoad();
		waitForElementClickable(linkMyCourses);
		clickWebElement(linkMyCourses);

		testLoggerInfo("Clicked on My Courses link from Learner Center");
		logger.info("Clicked on My Courses link from Learner Center");
		waitForPageLoad();
		return this;
	}

	/**
	 * This method is used to verify Learner gets initial Course through LP
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 17 July 2019
	 */
	/*public LCMyCoursesPage verifyInitialCourseGettingToLearner() throws AcisException {
		waitForPageLoad();
		Assert.assertEquals(getSCORMCoursesFromLC().get(0), enhancedLearningPath.listSCORMCourseNamesAddedToLP.get(0),
				"Verified that Learner is not getting the Initial course");

		testLoggerPass("Verified that Learner is getting the Initial course");
		logger.info("Verified that Learner is getting the Initial course");
		return this;
	}*/ //sk changes

	/**
	 * This method is used to get course status of expected course name
	 * 
	 * @param strCourseName
	 * @return
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 19 July 2019
	 */

	public String getCourseStatusOnLC(String strCourseName) throws AcisException {
		waitForPageLoad();

		WebElement textCourseStatus = getDynamicWebElement(CourseStatusOnLC, strCourseName);
		String courseStatus = textCourseStatus.getAttribute("title").trim();

		testLoggerInfo("Captured the course " + strCourseName + " status is: " + courseStatus);
		logger.info("Captured the course " + strCourseName + " status is: " + courseStatus);
		return courseStatus;

	}

	/**
	 * This method is used to get course status on Learner Center
	 * 
	 * @param strCourseName
	 * @param Status
	 * @return
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 19 July 2019
	 */
	public LCMyCoursesPage verifyCourseStatusOnLC(String strCourseName, String strStatus) throws AcisException {
		waitForPageLoad();
		String strCourseStatusOnLC = getCourseStatusOnLC(strCourseName);
		Assert.assertEquals(strCourseStatusOnLC, strStatus.trim(), "Verified that Learner is not re-enrolled into '"
				+ strCourseName + "' course and Status is: " + strCourseStatusOnLC);
		testLoggerPass("Verified that Learner is re-enrolled into '" + strCourseName + "' course and Status is: "
				+ strCourseStatusOnLC);
		logger.info("Verified that Learner is re-enrolled into '" + strCourseName + "' course and Status is: "
				+ strCourseStatusOnLC);
		return this;
	}

	/**
	 * This method is used to verify Learner gets Subsequent Course through LP
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 19 July 2019
	 */
	/*public LCMyCoursesPage verifySubsequentCourseGettingToLearner() throws AcisException {
		waitForPageLoad();
		Assert.assertEquals(getSCORMCoursesFromLC().get(0), enhancedLearningPath.listSCORMCourseNamesAddedToLP.get(1),
				"Verified that Learner is not getting the Subsequent course ");
		testLoggerPass("Verified that Learner is getting the Subsequent course");
		logger.info("Verified that Learner is getting the Subsequent course");
		return this;
	}*/// sk changes

	/**
	 * This method is used to get course names list from Learner Center
	 * 
	 * @return
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 19 July 2019
	 */

	public List<String> getSCORMCoursesFromLC() {
		waitForPageLoad();
		waitForAllElements(listMyCourses);
		listOfCoursesNamesFromLC.clear();
		for (int i = 0; i < listMyCourses.size(); i++) {
			listOfCoursesNamesFromLC.add(listMyCourses.get(i).getText().trim());
		}

		testLoggerInfo("Captured all course names: " + listOfCoursesNamesFromLC);
		logger.info("Captured all course names: " + listOfCoursesNamesFromLC);
		return listOfCoursesNamesFromLC;

	}

	/**
	 * This method is used to close LC window
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 19 July 2019
	 */
	public LCMyCoursesPage closeLearnerCenterWindow() throws AcisException {
		try {
			switchToWindow();
			closeDriver();

			testLoggerInfo("Closed Learner Center window");
			logger.info("Closed Learner Center window");

			switchToWindow();
		} catch (Exception e) {
			getStackTrace(e, "Execption in closeLearnerCenterWindow");
		}
		logger.info("Switched to User Profile Window");

		testLoggerInfo("Switched to User profile Window");
		return this;
	}

	/**
	 * This method is used to verify user get courses as per Learning path setting
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 19 July 2019
	 */

	/*public LCMyCoursesPage verifyUserGetsInitialAndSubsequentCoursesImmediatelyIfSubsequentCourseOfOneLPIsInitialCourseOfAnotherLP()
			throws AcisException {
		waitForPageLoad();
		Assert.assertTrue(getSCORMCoursesFromLC().contains(enhancedLearningPath.listSCORMCourseNamesAddedToLP.get(0)),
				"Verified that Learner is not getting the Initial Course: '"
						+ testData.get(Constants.LEARNINGPATH_SHEET).get("InitialcourseforLP1") + "' from LP1");
		Assert.assertTrue(getSCORMCoursesFromLC().contains(enhancedLearningPath.listSCORMCourseNamesAddedToLP.get(1)),
				"Verified that Learner is not getting the Subsequent Course: '"
						+ testData.get(Constants.LEARNINGPATH_SHEET).get("subsequentcourseOneforLP1") + "' from LP1");
		testLoggerPass("Verified that Learner is getting the Initial Course: '"
				+ enhancedLearningPath.listSCORMCourseNamesAddedToLP.get(0)
				+ "' from LP1 and getting the Subsequent Course: '"
				+ enhancedLearningPath.listSCORMCourseNamesAddedToLP.get(1) + "' from LP1");
		logger.info("Verified that Learner is getting the Initial Course: '"
				+ enhancedLearningPath.listSCORMCourseNamesAddedToLP.get(0)
				+ "' from LP1 and getting the Subsequent Course: '"
				+ enhancedLearningPath.listSCORMCourseNamesAddedToLP.get(1) + "' from LP1");
		return this;
	}*///sk changes
	// cs end

	/**
	 * This method is used to verify user get courses as per Learning Path setting
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 19 July 2019
	 */
	// cs start
	/*public LCMyCoursesPage verifyUserGetsChildSubsequentCourseIfSubsequentCourseOfOneLPIsInitialCourseOfAnotherLPAndBothAreCompleted()
			throws AcisException {
		waitForPageLoad();

		Assert.assertTrue(getSCORMCoursesFromLC().contains(enhancedLearningPath.listSCORMCourseNamesAddedToLP.get(2)),
				"Verified that Learner is not getting Initial and Subsequent course immediately when Subsequent course from one LP is initial course from other LP and not getting child subsequent course as soon as user completes both Initial & Subsequent courses");
		testLoggerPass(
				"Verified that Learner is getting Initial and Subsequent course immediately when Subsequent course from one LP is initial course from other LP and getting child subsequent course: '"
						+ enhancedLearningPath.listSCORMCourseNamesAddedToLP.get(2)
						+ "' as soon as user completes both Initial & Subsequent courses");
		logger.info(
				"Verified that Learner is getting Initial and Subsequent course immediately when Subsequent course from one LP is initial course from other LP and getting child subsequent course: '"
						+ enhancedLearningPath.listSCORMCourseNamesAddedToLP.get(2)
						+ "' as soon as user completes both Initial & Subsequent courses");
		return this;
	}*/ //sk changes
	// cs end

	/**
	 * This method is used to verify user get courses as per Learning Path setting
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 19 July 2019
	 */
	/*public LCMyCoursesPage verifySubsequentCourseAfterRegularInterval() throws AcisException {
		waitForPageLoad();
		Assert.assertTrue(
				getSCORMCoursesFromLC().contains(learningPath.listSCORMCourseNamesFromLPCourseSearchControl.get(1)),
				"Verified that Learner is not getting the Subsequent course after Regular Interval");
		testLoggerPass("Verified that Learner is getting the Subsequent course after Regular Interval");
		logger.info("Verified that Learner is getting the Subsequent course after Regular Interval");
		return this;
	}*/ //sk change

	/*public LCMyCoursesPage verifyUserGetsSecondSubsequentCourseAfterCompletionOfInitialCourseBySkippingDirectlyEnrolledCompletedFirstSubsequentCourse()
			throws AcisException {
		waitForPageLoad();
		Assert.assertTrue(getSCORMCoursesFromLC().contains(enhancedLearningPath.listSCORMCourseNamesAddedToLP.get(1)),
				"Verified that Learner is not getting second Subsequent course immediately after completing the Initial course and by skipping the first Subsequent course which is already completed directly");
		testLoggerPass("Verified that Learner is getting second Subsequent course '"
				+ enhancedLearningPath.listSCORMCourseNamesAddedToLP.get(1)
				+ "' immediately after completing the Initial course and by skipping the first Subsequent course '"
				+ enhancedLearningPath.listSCORMCourseNamesAddedToLP.get(0) + "' which is already completed directly");
		logger.info("Verified that Learner is getting second Subsequent course '"
				+ enhancedLearningPath.listSCORMCourseNamesAddedToLP.get(1)
				+ "' immediately after completing the Initial course and by skipping the first Subsequent course '"
				+ enhancedLearningPath.listSCORMCourseNamesAddedToLP.get(0) + "' which is already completed directly");
		return this;
	}*/

	/**
	 * This method is used to verify user get courses as per Learning Path setting
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 19 July 2019
	 */
	public LCMyCoursesPage verifyUserGetThirdCourseDirectlyIfSecondCourseDeletedFromCoursePage() {
		waitForPageLoad();
		Assert.assertFalse(getSCORMCoursesFromLC().contains("Delete SCORM Course LP"),
				"Failed to Verify that Learner is not getting Deleted Subsequent course immediately after completing the Initial course ");
		testLoggerPass(
				"Verify that Learner is not getting Deleted Subsequent course immediately after completing the Initial course ");
		logger.info(
				"Verify that Learner is not getting Deleted Subsequent course immediately after completing the Initial course ");
		return this;
	}

	/**
	 * This method is used to verify user get courses as per Learning Path setting
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 19 July 2019
	 */
/*	public LCMyCoursesPage verifySubsequentCourseGettingToLearnerFromThirdNode() throws AcisException {
		waitForPageLoad();
		Assert.assertEquals(getSCORMCoursesFromLC().get(0), enhancedLearningPath.listSCORMCourseNamesAddedToLP.get(2),
				"Verified that Learner is not getting the Subsequent course ");
		testLoggerPass("Verified that Learner is getting the Subsequent course as per Enrollment rule");
		logger.info("Verified that Learner is getting the Subsequent course as per Enrollment rule");
		return this;
	}*/ //sk change

	/**
	 * This method is used to verify user get courses as per Learning Path setting
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 19 July 2019
	 */
	public LCMyCoursesPage verifyInitialCourseIsNotAssignedToLearner() throws AcisException {
		waitForPageLoad();
		waitForElement(txtNoRecord);
		Assert.assertEquals(txtNoRecord.getText().trim(), Constants.NO_RECORD_FOUND,
				"Learner did not get the any course");

		testLoggerPass("Verified that Learner did not get the any course");
		logger.info("Verified that Learner did not get the any course");
		return this;
	}

	/**
	 * This method is used to verify user get courses as per Learning Path setting
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 19 July 2019
	 */
	/*public LCMyCoursesPage verifyNewlyAddedCoursGettingToLearner() throws AcisException {
		waitForPageLoad();
		Assert.assertEquals(getSCORMCoursesFromLC().get(0), enhancedLearningPath.strNewCouse,
				" Verify Newly Added Course not getting ");
		testLoggerPass("Verify Newly Added Course is getting to Learner");
		logger.info("Verify Newly Added Course is  getting to Learner");
		return this;

	}*/// sk change

	/**
	 * This method is used to verify user get courses as per Learning Path setting
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 19 July 2019
	 */
	/*public LCMyCoursesPage verifyNewlyAddedCourseNotGettingToLearner() throws AcisException {
		waitForPageLoad();
		Assert.assertNotEquals(getSCORMCoursesFromLC().get(0), enhancedLearningPath.strNewCouse,
				"Learner is getting the Newly added course even after completing all course/ simulation in the lp ");
		testLoggerPass(
				" Verified that Learner is not  getting the Newly added course  after completing all course/ simulation in the lp");
		logger.info(
				" Verified that Learner is not  getting the Newly added course  after completing all course/ simulation in the lp");
		return this;
	}*/// sk change

	/**
	 * This method is used to verify user get courses as per Learning Path setting
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 19 July 2019
	 */
	/*public LCMyCoursesPage verifySubsequentCourseNotGettingToLearner() throws AcisException {
		waitForPageLoad();
		Assert.assertFalse(getSCORMCoursesFromLC().contains(enhancedLearningPath.listSCORMCourseNamesAddedToLP.get(1)),
				"Verified that Learner is  getting the Subsequent course ");
		testLoggerPass("Verified that Learner is  not getting the Subsequent course");
		logger.info("Verified that Learner is not  getting the Subsequent course");
		return this;
	}*/// sk change

	/**
	 * This method is used to verify enable/disable status of Toggle button of Show
	 * Completed Courses
	 * 
	 * @author Shahenshaha.Mulani
	 * @throws AcisException
	 * @since 14 August 2019
	 */

	public LCMyCoursesPage verifyEnableDisableStatusOfToggleButtonOfShowCompletedCourses(boolean onOffFlag)
			throws AcisException {
		waitForPageLoad();
		waitForElement(iconToggleShowCompletedCourses);
		if (onOffFlag) {
			Assert.assertEquals(iconToggleShowCompletedCourses.getCssValue("background-color").trim(),
					ILMSConstants.TOGGLE_BUTTON_GREEN_COLOR_CODE,
					"Status of Toggle button of Show Completed Courses is Disabled");
			logger.info("Verified that status of Toggle button of Show Completed Courses is Enabled");
			testLoggerPass("Verified that status of Toggle button of Show Completed Courses is Enabled");
		} else {
			Assert.assertNotEquals(iconToggleShowCompletedCourses.getCssValue("background-color").trim(),
					ILMSConstants.TOGGLE_BUTTON_GREEN_COLOR_CODE,
					"Status of Toggle button of Show Completed Courses is Enabled");
			logger.info("Verified that status of Toggle button of Show Completed Courses is Disabled");
			testLoggerPass("Verified that status of Toggle button of Show Completed Courses is Disabled");
		}
		return this;
	}

	/**
	 * This method is used to turn Off/On Toggle Show Completed Courses
	 * 
	 * @author Shahenshaha.Mulani
	 * @throws AcisException
	 * @since 16 August 2019
	 */

	public LCMyCoursesPage turnOffOrOnToggleSwitchForShowCompletedCourses(boolean onOffFlag) throws AcisException {

		waitForPageLoad();
		waitForElement(iconToggleShowCompletedCourses);
		if (onOffFlag) {
			if (iconToggleShowCompletedCourses.getCssValue("background-color").trim()
					.equals(ILMSConstants.TOGGLE_BUTTON_GREEN_COLOR_CODE)) {
				logger.info("Toggle icon of Show Completed Courses is aleardy ON");
				testLoggerInfo("Toggle icon of Show Completed Courses is aleardy ON");
			} else {
				clickWebElement(iconToggleShowCompletedCourses);
				waitForPageLoad();
				logger.info("Toggle icon of Show Completed Courses is turned ON");
				testLoggerInfo("Toggle icon of Show Completed Courses is turned ON");
			}
		} else {
			if (!(iconToggleShowCompletedCourses.getCssValue("background-color").trim()
					.equals(ILMSConstants.TOGGLE_BUTTON_GREEN_COLOR_CODE))) {
				logger.info("Toggle icon of Show Completed Courses is aleardy OFF");
				testLoggerInfo("Toggle icon of Show Completed Courses is aleardy OFF");
			} else {
				clickWebElement(iconToggleShowCompletedCourses);
				waitForPageLoad();
				logger.info("Toggle icon of Show Completed Courses is turned OFF");
				testLoggerInfo("Toggle icon of Show Completed Courses is turned OFF");
			}
		}

		return this;
	}

	/**
	 * This method is used to click on Advanced Search link
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 16 August 2019
	 */

	public LCMyCoursesPage clickOnAdvancedSearchlink() throws AcisException {
		waitForPageLoad();
		waitForElementClickable(linkAdvancedSearch);
		clickWebElement(linkAdvancedSearch);
		testLoggerInfo("Clicked on Advanced Search link");
		logger.info("Clicked on Advanced Search link");
		waitForPageLoad();
		return this;
	}

	/**
	 * This method is used to click on Course Status drop down
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 16 August 2019
	 */

	public LCMyCoursesPage clickOnCourseStatusDropdown() throws AcisException {
		waitForPageLoad();
		waitForElementClickable(dropDownCourseStatus);
		clickWebElement(dropDownCourseStatus);
		testLoggerInfo("Clicked on Course Status drop down");
		logger.info("Clicked on Course Status drop down");
		waitForPageLoad();
		return this;
	}

	/**
	 * This method is used to click on Course Status drop down
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 16 August 2019
	 */

	public List<String> getStatusValuesFromCourseStatusDropdown() throws AcisException {
		waitForPageLoad();
		waitForAllElements(listCourseStatusFromDropdown);
		listOfCourseStatusFromDropdown.clear();
		for (int i = 0; i < listCourseStatusFromDropdown.size(); i++) {
			listOfCourseStatusFromDropdown.add(listCourseStatusFromDropdown.get(i).getText().trim());
		}
		testLoggerInfo("Captured all Course Status values : " + listOfCourseStatusFromDropdown);
		logger.info("Captured all Course Status values : " + listOfCourseStatusFromDropdown);
		return listOfCourseStatusFromDropdown;
	}

	/**
	 * This method is used to verify Course Status drop down values
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 16 August 2019
	 */
	public LCMyCoursesPage verifyCourseStatusDropdownvalues(List<String> lsCourseStatus) throws AcisException {
		waitForPageLoad();
		Assert.assertTrue(getStatusValuesFromCourseStatusDropdown().equals(lsCourseStatus),
				"Course Status drop down values are not as expected");
		testLoggerPass("Verified that Course Status drop down values are as expected");
		logger.info("Verified that Course Status drop down values are as expected");
		return this;
	}

	/**
	 * This method is used to verify given Courses on My Courses tab
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 16 August 2019
	 */
	public LCMyCoursesPage verifyCoursesOnMyCoursesTab(List<String> lsCourseNames) throws AcisException {
		waitForPageLoad();
		Assert.assertTrue(getSCORMCoursesFromLC().containsAll(lsCourseNames),
				"Given Courses are not displayed on My Courses");
		testLoggerPass("Verified that given Courses are displayed on My Courses tab");
		logger.info("Verified that given Courses are displayed on My Courses tab");
		return this;
	}

	/**
	 * This method is used to enter Text in Search Text box
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 19 August 2019
	 */

	public LCMyCoursesPage enterTextInSearchTextbox(String strSearchText) throws AcisException {
		waitForPageLoad();
		waitForElement(textboxSearch);
		enterText(textboxSearch, strSearchText);
		logger.info("Entered text as " + strSearchText + " in search text box");
		testLoggerInfo("Entered text as " + strSearchText + " in search textbox");
		return this;
	}

	/**
	 * This method is used to click on Search Icon
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 19 August 2019
	 */

	public LCMyCoursesPage clickOnSearchIcon() throws AcisException, InterruptedException {
		waitForPageLoad();
		waitForElement(iconSearch);
		clickWebElement(iconSearch);
		logger.info("Clicked on search icon");
		testLoggerInfo("Clicked on search icon");
		Thread.sleep(4000);
		return this;
	}

	public LCMyCoursesPage clickOnLaunchCourse() throws AcisException, InterruptedException {
		waitForPageLoad();
		waitForElement(btnLaunchCourse);
		clickWebElement(btnLaunchCourse);
		logger.info("Clicked on Launch course button from Learner Center");
		testLoggerInfo("Clicked on Launch course button from Learner Center");
		return this;
	}

	public LCMyCoursesPage clickOnLaunchCourseForiComposer() throws AcisException, InterruptedException, FindFailed {
		waitForPageLoad();
		waitForElement(btnLaunchCourse);
		clickWebElement(btnLaunchCourse);
		logger.info("Clicked on Launch course button from Learner Center");
		testLoggerInfo("Clicked on Launch course button from Learner Center");
		switchToWindow();
		Screen sc = new Screen();
		Pattern pt = new Pattern(Constants.ICOMPOSER_LAUNCH_NEXT_ARROW);
		sc.click(pt);
		Thread.sleep(3000);

		return this;
	}

	/**
	 * This method is used to click on Home tab
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 19 August 2019
	 */

	public LCMyCoursesPage clickOnHomeTab() throws AcisException {
		waitForPageLoad();
		waitForElementClickable(linkHome);
		clickWebElement(linkHome);
		testLoggerInfo("Clicked on Home tab from Learner Center");
		logger.info("Clicked on Home tab from Learner Center");
		waitForPageLoad();
		return this;
	}

	/**
	 * This method is used to click on Requirement Type drop down
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 19 August 2019
	 */

	public LCMyCoursesPage clickOnRequirementTypeDropdown() throws AcisException {
		waitForPageLoad();
		waitForElementClickable(dropDownRequirementType);
		clickWebElement(dropDownRequirementType);
		testLoggerInfo("Clicked on Requirement Type drop down");
		logger.info("Clicked on Requirement Type drop down");
		waitForPageLoad();
		return this;
	}

	/**
	 * This method is used to click on Advanced Search Options check box
	 * 
	 * @author Shahenshaha.Mulani
	 * @throws AcisException
	 * @since 19 August 2019
	 */

	public LCMyCoursesPage checkUncheckAdvancedSearchOptionsCheckbox(String strType, boolean checkUncheckFlag)
			throws AcisException {

		waitForPageLoad();
		WebElement element = getDynamicWebElement(checkboxAdvancedSearchOptions, strType);
		waitForElement(element);
		if (checkUncheckFlag) {
			if (element.isSelected()) {
				logger.info("Already checked " + strType + " check box");
				testLoggerInfo("Already checked " + strType + " check box");
			} else {
				clickWebElement(element);
				waitForPageLoad();
				logger.info("Checked " + strType + " check box");
				testLoggerInfo("Checked " + strType + " check box");
			}
		} else {
			if (!(element.isSelected())) {
				logger.info("Already unchecked " + strType + " check box");
				testLoggerInfo("Already unchecked " + strType + " check box");
			} else {
				clickWebElement(element);
				waitForPageLoad();
				logger.info("Unchecked " + strType + " check box");
				testLoggerInfo("Unchecked " + strType + " check box");
			}
		}

		return this;
	}

	/**
	 * This method is used to click on Advanced Search button
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 19 August 2019
	 */

	public LCMyCoursesPage clickOnAdvancedSearchbutton() throws AcisException {
		waitForPageLoad();
		waitForElementClickable(buttonAdvancedSearch);
		clickWebElement(buttonAdvancedSearch);
		testLoggerInfo("Clicked on Advanced Search button");
		logger.info("Clicked on Advanced Search button");
		waitForPageLoad();
		return this;
	}

	/**
	 * This method is used to get Requirement Types from My Courses
	 * 
	 * @return
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 19 August 2019
	 */

	public List<String> getRequirementTypesFromMyCourses() {
		waitForPageLoad();
		waitForAllElements(listRequirementType);
		listOfRequirementTypes.clear();
		for (int i = 0; i < listRequirementType.size(); i++) {
			listOfRequirementTypes.add(listRequirementType.get(i).getText().split(":")[1].trim());
		}
		testLoggerInfo("Captured all Requirement Types from My Courses : " + listOfRequirementTypes);
		logger.info("Captured all Requirement Types from My Courses : " + listOfRequirementTypes);
		return listOfRequirementTypes;
	}

	/**
	 * This method is used to verify Requirement Types on My Courses tab
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 19 August 2019
	 */
	public LCMyCoursesPage verifyRequirementTypesOnMyCoursesTab(String strRequirementTypes) throws AcisException {
		waitForPageLoad();
		List<String> lsRequirementTypes = getRequirementTypesFromMyCourses();
		Assert.assertTrue(
				(lsRequirementTypes.contains(strRequirementTypes))
						&& (lsRequirementTypes.stream().distinct().count() <= 1),
				"Requirement Type of Courses is not as expected");
		testLoggerPass(
				"Verified that Requirement Type of Courses is '" + strRequirementTypes + "' which is as expected");
		logger.info("Verified that Requirement Type of Courses is '" + strRequirementTypes + "' which is as expected");
		return this;
	}

	/**
	 * This method is used to get Course Status from My Courses
	 * 
	 * @return
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 19 August 2019
	 */

	public List<String> getCourseStatusFromMyCourses() {
		waitForPageLoad();
		waitForAllElements(listCourseStatus);
		listOfCourseStatus.clear();
		for (int i = 0; i < listCourseStatus.size(); i++) {
			listOfCourseStatus.add(listCourseStatus.get(i).getAttribute("title").trim());
		}
		testLoggerInfo("Captured all Course Statuses from My Courses : " + listOfCourseStatus);
		logger.info("Captured all Course Statuses from My Courses : " + listOfCourseStatus);
		return listOfCourseStatus;
	}

	/**
	 * This method is used to verify Course Status on My Courses tab
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 19 August 2019
	 */
	public LCMyCoursesPage verifyCourseStatusOnMyCoursesTab(String strCourseStatus) throws AcisException {
		waitForPageLoad();
		List<String> lsCourseStatus = getCourseStatusFromMyCourses();
		Assert.assertTrue(
				(lsCourseStatus.contains(strCourseStatus)) && (lsCourseStatus.stream().distinct().count() <= 1),
				"Course Status of Courses is not as expected");
		testLoggerPass("Verified that Course Status of Courses is '" + strCourseStatus + "' which is as expected");
		logger.info("Verified that Course Status of Courses is '" + strCourseStatus + "' which is as expected");
		return this;
	}

	/**
	 * This method is used to verify Course Name on My Courses tab
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 19 August 2019
	 */
	public LCMyCoursesPage verifyCourseNameOnMyCoursesTab(String strCourseName) throws AcisException {
		waitForPageLoad();

		Assert.assertTrue((getSCORMCoursesFromLC().contains(strCourseName)),
				"Searched Course is not present in search result");
		testLoggerPass("Verified that Searched Course '" + strCourseName
				+ "' is present in search result which is as expected");
		logger.info("Verified that Searched Course '" + strCourseName
				+ "' is present in search result which is as expected");
		return this;
	}

	/**
	 * 
	 * This method is used to verify Sorting icon for given column
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 14 October 2019
	 */
	public LCMyCoursesPage verifySortingIcon(String strColumnName, String strSortType) throws AcisException {
		waitForPageLoad();

		WebElement iconSortingElement = getDynamicWebElement(iconSorting, strColumnName);
		waitForElement(iconSortingElement);
		String iconSortingClassName = iconSortingElement.getAttribute("class").trim();

		if (strSortType.equalsIgnoreCase("ascending")) {
			Assert.assertTrue((iconSortingClassName.contains("asc")),
					strColumnName + " column sorting icon is not showing as Ascending");
			testLoggerPass("Verified that " + strColumnName + " column sorting icon is showing as Ascending");
			logger.info("Verified that " + strColumnName + " column sorting icon is showing as Ascending");
		} else if (strSortType.equalsIgnoreCase("descending")) {
			Assert.assertTrue((iconSortingClassName.contains("desc")),
					strColumnName + " column sorting icon is not showing as Descending");
			testLoggerPass("Verified that " + strColumnName + " column sorting icon is showing as Descending");
			logger.info("Verified that " + strColumnName + " column sorting icon is showing as Descending");
		}
		return this;
	}

	/**
	 * This method is select mode of launched course
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 14 October 2019
	 */

	public LCMyCoursesPage selectModeOFCourse() throws AcisException {

		waitForWindowsToBeOpened(2);
		switchToWindow();
		waitForPageLoad();
		waitAndVerifyElement(modeSelectionTextLocator);
		waitForElement(textModeLink);
		clickWebElement(textModeLink);
		testLoggerInfo("Clicked on Text mode link for launching course");
		logger.info("Clicked on Text mode link for launching course");

		return this;
	}

	/**
	 * This method is used to click on column name
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 14 October 2019
	 */
	public LCMyCoursesPage clickOnColumnName(String strColumnName) throws AcisException {
		waitForPageLoad();

		WebElement linkColumnNameElement = getDynamicWebElement(linkColumnName, strColumnName);
		waitForElement(linkColumnNameElement);
		clickWebElement(linkColumnNameElement);

		testLoggerInfo("Clicked on '" + strColumnName + "' column name link");
		logger.info("Clicked on '" + strColumnName + "' column name link");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this;
	}

	public String linkCourseName = "//*[text()='ABC']";

	/**
	 * This method is used to click on Course name
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 05 Nov 2019
	 */
	public LCMyCoursesPage clickOnCourseName(String strCourseName) throws AcisException {
		waitForPageLoad();
		WebElement linkCourseNameElement = getDynamicWebElement(linkCourseName, strCourseName);
		waitForElement(linkCourseNameElement);
		clickWebElement(linkCourseNameElement);
		testLoggerInfo("Clicked on '" + strCourseName + "' name");
		logger.info("Clicked on '" + strCourseName + "' name");
		waitForElement(textRequirementTypeMandatoryOptional);
		switchToWindow();
		return this;
	}

	/**
	 * This method is used to verify Sorting for Course Status
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 16 October 2019
	 */
	public LCMyCoursesPage verifySortingOrderOfStatuses(List<String> actualList, List<String> expectedList)
			throws AcisException {
		List<String> list2Copy = new ArrayList<>(actualList);

		LinkedHashSet<String> hashSet = new LinkedHashSet<>(list2Copy);

		List<String> listWithoutDuplicates = new ArrayList<>(hashSet);

		for (int i = 0; i < listWithoutDuplicates.size(); i++) {
			logger.info(listWithoutDuplicates.get(i));
		}

		boolean status = isHasSameOrder.test(listWithoutDuplicates, expectedList);
		Assert.assertTrue(status, "Couse statuses on My course page are not displayed in default expected order");
		testLogger().pass("Verified that Couse statuses on My course page are displayed in expected order");
		logger.info("Verified that Couse statuses on My course page are displayed in expected order");

		return this;
	}

	/**
	 * This method is used to verify Sorting for Course Status
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 16 October 2019
	 */
	public LCMyCoursesPage verifySortingOrderForGivenList(List<String> actualList, String strSortingType)
			throws AcisException {

		if (strSortingType.equalsIgnoreCase("ascending")) {
			boolean sorted = Ordering.natural().isOrdered(actualList);
			Assert.assertTrue(sorted, "Items from the given list are not in ascending sorted order");
			testLogger().pass("Verified that items from the given list are in ascending sorted order");
			logger.info("Verified that items from the given list are in ascending sorted order");
		}

		else if (strSortingType.equalsIgnoreCase("descending")) {
			boolean sorted = Ordering.natural().reverse().isOrdered(actualList);
			Assert.assertTrue(sorted, "Items from the given list are not in descending sorted order");
			testLogger().pass("Verified that items from the given list are in descending sorted order");
			logger.info("Verified that items from the given list are in descending sorted order");
		}
		return this;
	}

	/**
	 * This method is used to click on Sorting Icon
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 16 October 2019
	 */
	public LCMyCoursesPage clickOnSortingIcon(String strColumnName) throws AcisException {

		waitForPageLoad();
		WebElement iconSortingElement = getDynamicWebElement(iconSorting, strColumnName);
		waitForElement(iconSortingElement);
		clickWebElement(iconSortingElement);
		testLoggerInfo("Clicked on sorting icon");
		logger.info("Clicked on sorting icon");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return this;
	}

	/**
	 * This method is used to get Enroll Date list from Learner Center
	 * 
	 * @return
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 16 October 2019
	 */

	public List<String> getEnrollDatesFromLC() {
		waitForPageLoad();
		waitForAllElements(listEnrollDate);
		listOfEnrollDatesFromLC.clear();
		for (int i = 0; i < listEnrollDate.size(); i++) {
			listOfEnrollDatesFromLC.add(listEnrollDate.get(i).getText().trim());
		}
		testLoggerInfo("Captured all Enroll Dates: " + listOfEnrollDatesFromLC);
		logger.info("Captured all Enroll Dates: " + listOfEnrollDatesFromLC);
		return listOfEnrollDatesFromLC;
	}

	/**
	 * This method is used to verify Sorting for Dates
	 * 
	 * @throws AcisException
	 * @author shahenshaha.mulani
	 * @since 17 October 2019
	 */
	public LCMyCoursesPage verifySortingOrderForDatesForGivenList(List<String> actualList, String strSortingType)
			throws AcisException {
		listOfDatesTemp.clear();
		if (strSortingType.equalsIgnoreCase("ascending")) {

			listOfDatesTemp.addAll(actualList);
			logger.info("Actual Ascending Ordered List of Elements from App:" + actualList);

			sortDatesInAscendingOrder(listOfDatesTemp);
			logger.info("Expected Ascending ordered List of Elements" + listOfDatesTemp);

			Assert.assertTrue(actualList.equals(listOfDatesTemp),
					"Dates from the given list are not in ascending sorted order");
			testLogger().pass("Verified that Dates from the given list are in Ascending sorted order");
			logger.info("Verified that Dates from the given list are in Ascending sorted order");
		}

		else if (strSortingType.equalsIgnoreCase("descending")) {
			listOfDatesTemp.addAll(actualList);
			logger.info("Actual Descending Ordered List of Elements from App:" + actualList);

			sortDatesInAscendingOrder(listOfDatesTemp);
			Collections.reverse(listOfDatesTemp);
			logger.info("Expected Descending ordered List of Elements" + listOfDatesTemp);

			Assert.assertTrue(actualList.equals(listOfDatesTemp),
					"Dates from the given list are not in Descending sorted order");
			testLogger().pass("Verified that Dates from the given list are in Descending sorted order");
			logger.info("Verified that Dates from the given list are in Descending sorted order");
		}
		return this;
	}

	/**
	 * This method is used to get Start Date list from Learner Center
	 * 
	 * @return
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 17 October 2019
	 */

	public List<String> getStartDatesFromLC() {
		waitForPageLoad();
		waitForAllElements(listStartDate);
		listOfStartDatesFromLC.clear();
		for (int i = 0; i < listStartDate.size(); i++) {
			if (!listStartDate.get(i).getText().trim().equals("-")) {
				listOfStartDatesFromLC.add(listStartDate.get(i).getText().trim());
			}
		}
		testLoggerInfo("Captured all Start Dates: " + listOfStartDatesFromLC);
		logger.info("Captured all Start Dates: " + listOfStartDatesFromLC);
		return listOfStartDatesFromLC;
	}

	/**
	 * This method is used to get Due Date list from Learner Center
	 * 
	 * @return
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 17 October 2019
	 */

	public List<String> getDueDatesFromLC() {
		waitForPageLoad();
		waitForAllElements(listDueDate);
		listOfDueDatesFromLC.clear();
		for (int i = 0; i < listDueDate.size(); i++) {
			if (!listDueDate.get(i).getText().trim().equals("-")) {
				listOfDueDatesFromLC.add(listDueDate.get(i).getText().trim());
			}
		}
		testLoggerInfo("Captured all Due Dates: " + listOfDueDatesFromLC);
		logger.info("Captured all Due Dates: " + listOfDueDatesFromLC);
		return listOfDueDatesFromLC;
	}

	/**
	 * This method is used to get Completion Date list from Learner Center
	 * 
	 * @return
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 17 October 2019
	 */

	public List<String> getCompletionDatesFromLC() {
		waitForPageLoad();
		waitForAllElements(listCompletionDate);
		listOfCompletionDatesFromLC.clear();
		for (int i = 0; i < listCompletionDate.size(); i++) {
			if (!listCompletionDate.get(i).getText().trim().equals("-")) {
				listOfCompletionDatesFromLC.add(listCompletionDate.get(i).getText().trim());
			}
		}
		testLoggerInfo("Captured all Completion Dates: " + listOfCompletionDatesFromLC);
		logger.info("Captured all Completion Dates: " + listOfCompletionDatesFromLC);
		return listOfCompletionDatesFromLC;
	}

	/**
	 * This method is to click on continue
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 14 October 2019
	 */
	public LCMyCoursesPage clickContinue() throws AcisException {
		waitForPageLoad();
		// maximizeWindow();
		if (isElementPresent(buttonContinueLocator)) {
			scrollDownTillPageEnd();
			waitForElement(buttonContinue);
			scrollingToElementofAPage(buttonContinue);
			clickWebElement(buttonContinue);
			testLoggerInfo("Clicked on continue button after launching course");
			logger.info("Clicked on continue button after launching course");
		}
		return this;

	}

	/**
	 * This method is to click on Resume button
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 14 October 2019
	 */
	public LCMyCoursesPage clickResume() throws AcisException {
		waitForPageLoad();
		waitForElement(resumeButton);
		scrollingToElementofAPage(resumeButton);

		clickWebElement(resumeButton);
		testLoggerInfo("Clicked on continue button after launching course");
		logger.info("Clicked on continue button after launching course");
		return this;

	}

	/**
	 * This method is to click on Restart button
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 14 October 2019
	 */
	public LCMyCoursesPage clickRestart() throws AcisException {
		waitForPageLoad();
		waitForElement(restartButton);

		scrollingToElementofAPage(restartButton);

		clickWebElement(restartButton);
		testLoggerInfo("Clicked on continue button after launching course");
		logger.info("Clicked on continue button after launching course");
		return this;

	}

	/**
	 * This method is to click on Next button
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 14 October 2019
	 */
	public LCMyCoursesPage clickNext() throws AcisException {
		waitForPageLoad();
		waitForElement(nextPageButton);
		scrollingToElementofAPage(nextPageButton);

		clickWebElement(nextPageButton);
		testLoggerInfo("Clicked on continue button after launching course");
		logger.info("Clicked on continue button after launching course");
		return this;

	}

	/**
	 * This method is to verify after restart course start from 1st page
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 14 October 2019
	 */
	public LCMyCoursesPage verifyRestartButtonBehaviour() throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(firstPageLocator);
		testLoggerPass("Verified that after clicking on Restart First page of course is displayed ");
		logger.info("Verified that after clicking on Restart First page of course is displayed ");
		return this;

	}

	/**
	 * This method is to verify after restart course start from 1st page
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 14 October 2019
	 */
	public LCMyCoursesPage verifyResumeButtonBehaviour() throws AcisException {
		waitForPageLoad();

		waitAndVerifyElement(randomPageLocator);
		testLoggerPass("Verified that after clicking on Resume last visited page of course is displayed ");
		logger.info("Verified that after clicking on Resume last visited page of course is displayed ");
		return this;

	}

	/**
	 * This method is to verify after relaunching course Restart and resume buttons
	 * are displayed
	 * 
	 * @throws AcisException
	 * @author Suraiya.Mulani
	 * @since 14 October 2019
	 */
	public LCMyCoursesPage verifyResumeRestartButtonDisplayed() throws AcisException {
		waitForPageLoad();

		waitAndVerifyElement(resumeButtonLocator);
		testLoggerPass("Verified that after relaunching course Resume button is displayed ");
		logger.info("Verified that after relaunching course Resume button is displayed ");

		waitAndVerifyElement(restartButtonLocator);
		testLoggerPass("Verified that after relaunching course Restart button is displayed ");
		logger.info("Verified that after relaunching course Restart button is displayed ");

		return this;

	}

	private By textRequirementType = By.xpath("//*[@class='ico-des-small course-type']/following::p[2]");

	@FindBy(xpath = "//*[@class='ico-des-small course-type']/following::p[1]")
	private WebElement textRequirementTypeMandatoryOptional;

	private By textCourseDescriptionTitile = By.xpath("//*[@class='page-title']");

	private By textEnrollDate = By.xpath("//*[@class='ico-des-small enroll-date']/following::p[2]");

	@FindBy(xpath = "//*[@class='ico-des-small enroll-date']/following::p[1]")
	private WebElement textEnrollDatevalue;

	private By textStartDate = By.xpath("//*[@class='ico-des-small start-date']/following::p[2]");
	@FindBy(xpath = "//*[@class='ico-des-small start-date']/following::p[1]")
	private WebElement textStartDatevalue;

	private By textDueDate = By.xpath("//*[@class='ico-des-small due-date']/following::p[2]");
	@FindBy(xpath = "//*[@class='ico-des-small due-date']/following::p[1]")
	private WebElement textDueDatevalue;

	private By textCompletionDate = By.xpath("//*[@class='ico-des-small completion-date']/following::p[2]");
	@FindBy(xpath = "//*[@class='ico-des-small completion-date']/following::p[1]")
	private WebElement textCompletionDatevalue;

	private By textCertificationStatus = By.xpath("//*[contains(@class,'ico-des-small cert-status')]/following::p[2]");
	@FindBy(xpath = "//*[contains(@class,'ico-des-small cert-status')]/following::p[1]")
	private WebElement textCertificationStatusValue;

	private By textStatus = By.xpath("//*[contains(@class,'ico-des-small status')]/following::p[2]");
	@FindBy(xpath = "//*[contains(@class,'ico-des-small status')]/following::p[1]")
	private WebElement textStatusValue;

	private By textHours = By.xpath("//*[@class='ico-des-small course-hours']/following::p[2]");
	@FindBy(xpath = "//*[@class='ico-des-small course-hours']/following::p[1]")
	private WebElement textHoursValue;

	private By textCredits = By.xpath("//*[@class='ico-des-small course-credits']/following::p[2]");
	@FindBy(xpath = "//*[@class='ico-des-small course-credits']/following::p[1]")
	private WebElement textCreditsValue;

	private By textLicenseExpiration = By.xpath("//*[@class='ico-des-small license-epx-dt']/following::p[2]");
	@FindBy(xpath = "//*[@class='ico-des-small license-epx-dt']/following::p[1]")
	private WebElement textLicenseExpirationValue;

	private By textCertificationExpiration = By.xpath("//*[@class='ico-des-small cert-exp-dt-normal']/following::p[2]");
	@FindBy(xpath = "//*[@class='ico-des-small cert-exp-dt-normal']/following::p[1]")
	private WebElement textCertificationExpirationValue;

	/**
	 * This method is to verify Requirement Type on Course description page at
	 * Learner Center
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 5 November 2019
	 */
	public LCMyCoursesPage verifyTitleOnCourseDescriptionPage(String strCourseDesc) throws AcisException {
		waitAndVerifyElement(textCourseDescriptionTitile);
		testLoggerPass("Verified that Page title is displayed as 'Course Description'");
		logger.info("Verified that Page titile is displayed as 'Course Description'");
		return this;

	}

	/**
	 * This method is to verify Course Requirement Type on Course description page
	 * at Learner Center
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 5 November 2019
	 */
	public LCMyCoursesPage verifyRequirementType(String strReqType) throws AcisException {
		waitAndVerifyElement(textRequirementType);
		testLoggerPass("Verified that label 'Type' is displayed");
		logger.info("Verified that label 'Type' is displayed");
		Assert.assertEquals(textRequirementTypeMandatoryOptional.getText().trim(), strReqType,
				"Verified that Course Requirement Type '" + strReqType + "' is not displayed as expected");
		testLoggerPass("Verified that Course Requirement Type '" + strReqType + "' is displayed as expected");
		logger.info("Verified that Course Requirement Type '" + strReqType + "' is displayed as expected");
		return this;

	}

	/**
	 * This method is to verify Course Enroll Date on Course description page at
	 * Learner Center
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 5 November 2019
	 */
	public LCMyCoursesPage verifyEnrollDate(String strEnrollDate) throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(textEnrollDate);
		testLoggerPass("Verified that label 'Enroll date' is displayed");
		logger.info("Verified that label 'Enroll Date' is displayed");
		Assert.assertEquals(textEnrollDatevalue.getText().trim(), strEnrollDate,
				"Verified that course Enroll date '" + strEnrollDate + "' is not displayed as expected");
		testLoggerPass("Verified that course Enroll date '" + strEnrollDate + "' is displayed as expected");
		logger.info("Verified that course Enroll date '" + strEnrollDate + "' is displayed as expected");
		return this;

	}

	/**
	 * This method is to verify Course Start Date on Course description page at
	 * Learner Center
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 5 November 2019
	 */
	public LCMyCoursesPage verifyStartDate(String strStartDate) throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(textStartDate);
		testLoggerPass("Verified that label 'Type' is displayed");
		logger.info("Verified that label 'Start date' is displayed");
		Assert.assertEquals(textStartDatevalue.getText().trim(), strStartDate,
				"Verified that course Start date '" + strStartDate + "' is not displayed as expected");
		testLoggerPass("Verified that course Start date '" + strStartDate + "' is displayed as expected");
		logger.info("Verified that course Start date '" + strStartDate + "' is displayed as expected");
		return this;

	}

	/**
	 * This method is to verify Course Completion Date on Course description page at
	 * Learner Center
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 5 November 2019
	 */
	public LCMyCoursesPage verifyCompletionDate(String strCompletionDate) throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(textCompletionDate);
		testLoggerPass("Verified that label 'Completion Date' is displayed");
		logger.info("Verified that label 'Completion Date' is displayed");
		Assert.assertEquals(textCompletionDatevalue.getText().trim(), strCompletionDate,
				"Verified that course Completion date '" + strCompletionDate + "' is not displayed as expected");
		testLoggerPass("Verified that course Completion date '" + strCompletionDate + "' is displayed as expected");
		logger.info("Verified that course Completion date '" + strCompletionDate + "' is displayed as expected");
		return this;

	}

	/**
	 * This method is to verify Course Due Date on Course description page at
	 * Learner Center
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 5 November 2019
	 */
	public LCMyCoursesPage verifyDueDate(String strDueDate) throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(textDueDate);
		testLoggerPass("Verified that label 'Due Date' is displayed");
		logger.info("Verified that label 'Due Date' is displayed");
		Assert.assertEquals(textDueDatevalue.getText().trim(), strDueDate,
				"Verified that course Due date '" + strDueDate + "' is not displayed as expected");
		testLoggerPass("Verified that course Due date '" + strDueDate + "' is displayed as expected");
		logger.info("Verified that course Due date '" + strDueDate + "' is displayed as expected");
		return this;

	}

	/**
	 * This method is to verify Due Date is not visible on Course description page
	 * at Learner Center for completed courses
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 5 November 2019
	 */
	public LCMyCoursesPage verifyDueDateIsNotVisisble() throws AcisException {
		waitForPageLoad();
		Assert.assertFalse(isElementPresent(textDueDate),
				"Verified that label 'Due Date' is not displayed for completed courses");
		testLoggerPass("Verified that label 'Due Date' is displayed for completed courses");
		logger.info("Verified that label 'Due Date' is displayed for completed courses");

		return this;

	}

	/**
	 * This method is to verify Due Date is not visible on Course description page
	 * at Learner Center for completed courses
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 5 November 2019
	 */
	public LCMyCoursesPage verifyCertificateExpirationIsNotVisisble() throws AcisException {
		waitForPageLoad();
		Assert.assertFalse(isElementPresent(textCertificationExpiration),
				"Verified that label 'Certification Expiration' is not displayed");
		testLoggerPass("Verified that label 'Certification Expiration' is displayed for curriculum");
		logger.info("Verified that label 'Certification Expiration' is displayed for curriculum");

		return this;

	}

	/**
	 * This method is to verify Course Status on Course description page at Learner
	 * Center
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 5 November 2019
	 */
	public LCMyCoursesPage verifyStatus(String strStatus) throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(textStatus);
		testLoggerPass("Verified that label 'Status' is displayed");
		logger.info("Verified that label 'Status' is displayed");
		Assert.assertEquals(textStatusValue.getText().trim(), strStatus,
				"Verified that Course Status '" + strStatus + "' is not displayed as expected");
		testLoggerPass("Verified that Course Status " + strStatus + " is displayed as expected");
		logger.info("Verified that Course Status '" + strStatus + "' is displayed as expected");
		return this;

	}

	/**
	 * This method is to verify Course Hours on Course description page at Learner
	 * Center
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 5 November 2019
	 */
	public LCMyCoursesPage verifyHours(String strHours) throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(textHours);
		testLoggerPass("Verified that label 'Hours' is displayed");
		logger.info("Verified that label 'Hours' is displayed");
		Assert.assertEquals(textHoursValue.getText().trim(), strHours,
				"Verified that Course Hours '" + strHours + "' is not displayed as expected");
		testLoggerPass("Verified that Course Hours '" + strHours + "' is displayed as expected");
		logger.info("Verified that Course Hours '" + strHours + "' is displayed as expected");
		return this;

	}

	/**
	 * This method is to verify Course Credits on Course description page at Learner
	 * Center
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 5 November 2019
	 */
	public LCMyCoursesPage verifyCredits(String strCredits) throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(textCredits);
		testLoggerPass("Verified that label 'Credits' is displayed");
		logger.info("Verified that label 'Credits' is displayed");
		Assert.assertEquals(textCreditsValue.getText().trim(), strCredits,
				"Verified that Course Credits '" + strCredits + "' is not displayed as expected");
		testLoggerPass("Verified that Course Credits '" + strCredits + "' is displayed as expected");
		logger.info("Verified that Course Credits '" + strCredits + "' is displayed as expected");
		return this;

	}

	/**
	 * This method is to verify License Expiration Date on Course description page
	 * at Learner Center
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 5 November 2019
	 */
	public LCMyCoursesPage verifyLicenseExpirationDate(String strLicenseExpDate) throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(textLicenseExpiration);
		testLoggerPass("Verified that label 'License Expiration Date' is displayed");
		logger.info("Verified that label 'Expiration Date' is displayed");
		Assert.assertEquals(textLicenseExpirationValue.getText().trim(), strLicenseExpDate,
				"Verified that Course License Expiration Date Date '" + strLicenseExpDate
						+ "' is not displayed as expected");
		testLoggerPass(
				"Verified that Course License Expiration Date '" + strLicenseExpDate + "' is displayed as expected");
		logger.info("Verified that Course LicenseExpiration Date '" + strLicenseExpDate + "' is displayed as expected");
		return this;
	}

	/**
	 * This method is to verify Certification Expiration Date on Course description
	 * page at Learner Center
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 5 November 2019
	 */
	public LCMyCoursesPage verifyCertificationExpirationDate(String strCertExpDate) throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(textCertificationExpiration);
		testLoggerPass("Verified that label 'Certification Expiration Date' is displayed");
		logger.info("Verified that label 'Certification Expiration Date' is displayed");
		Assert.assertEquals(textCertificationExpirationValue.getText().trim(), strCertExpDate,
				"Verified that Course Certification Expiration Date Date '" + strCertExpDate
						+ "' is not displayed as expected");
		testLoggerPass(
				"Verified that Course Certification Expiration Date '" + strCertExpDate + "' is displayed as expected");
		logger.info(
				"Verified that Course Certification Expiration Date '" + strCertExpDate + "' is displayed as expected");
		return this;

	}

	/**
	 * This method is to verify Certification Status on Course description page at
	 * Learner Center
	 * 
	 * @throws AcisException
	 * @author Chandrashekhar.Reddy
	 * @since 5 November 2019
	 */
	public LCMyCoursesPage verifyCertificationStatus(String strCertStatus) throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(textCertificationStatus);
		testLoggerPass("Verified that label 'Certification' is displayed");
		logger.info("Verified that label 'Certification' is displayed");
		Assert.assertEquals(textCertificationStatusValue.getText().trim(), strCertStatus,
				"Verified that Course Certification Status '" + strCertStatus + "' is not displayed as expected");
		testLoggerPass("Verified that Course Certification Status '" + strCertStatus + "' is displayed as expected");
		logger.info("Verified that Course Certification Status '" + strCertStatus + "' is displayed as expected");
		return this;

	}

	@FindBy(id = "videoMode2")
	WebElement btnTextModeLowBandwidth;

	@FindBy(xpath = "//*[@id='FreeFormDialogCloseButton']")
	WebElement btnPreTest;

	public LCMyCoursesPage clickOnTextModeLowBandwidthButton() throws AcisException, InterruptedException {
		waitForPageLoad();
		switchToWindow();
		waitForElement(btnTextModeLowBandwidth);
		clickWebElement(btnTextModeLowBandwidth);
		logger.info("Clicked on TextModeLowBandwidthButton");
		testLoggerInfo("Clicked on TextModeLowBandwidthButton");
		waitForWindowsToBeOpened(2);
		return this;
	}

	public LCMyCoursesPage clickOnPreTestButton() throws AcisException, InterruptedException {
		waitForPageLoad();
		waitForElement(btnPreTest);
		clickWebElement(btnPreTest);
		logger.info("Clicked on Pre-Test");
		testLoggerInfo("Clicked on Pre-Test");

		return this;
	}

	public String textAnswer = "//*[contains(text(),'ABC')]/preceding::td";

	@FindBy(xpath = "//*[@class='guest_title-paragraph form-font-16-question final_exam-fix']")
	WebElement textQuestion;

	@FindBy(xpath = "//*[@src='skins/play_blue.png']")
	WebElement arrowSubmitNext;

	@FindBy(xpath = "//*[@id='FreeFormDialogCloseButton']")
	WebElement arrowContinueNext;

	public <E, K> LCMyCoursesPage takePreTest() throws AcisException, InterruptedException {
		HashMap hs = new HashMap();
		hs.put("What should you do if you need to install an application to your computer",
				"Get proper approval and instructions on how to proceed");
		hs.put("Which of the following is a best practice for using a mobile device to store workplace information",
				"Remove workplace information when it is no longer needed");
		hs.put("Which of the following is a common technique a malicious insider might use to gain access to confidential information",
				"Rummaging through your desk to find your password");
		hs.put("Which of the following is an example of PII", "Your Bank Account number");
		hs.put("Which of the following is the strongest password", "I'mplanningonsellingmy1house");

		hs.put("Which of the following is TRUE1",
				"Information security pertains to the security of digital and non-digital hardcopy data");
		hs.put("Which of the following is TRUE2",
				"Electronic confidential information must be secured with encryption when it is stored or transmitted");
		hs.put("Which of the following is TRUE3",
				"You should avoid discussing confidential information over the phone or displaying confidential information on computer screens in public places, such as airports or cafes");
		hs.put("Which of the following is TRUE4",
				"It's a best practice to navigate to your bank or other website by typing in the website address rather than clicking a link from an email message");
		hs.put("Which of the following is TRUE5",
				"A social engineer might try to build a rapport with you by finding common interests and then asking you");

		Iterator<Map.Entry<String, String>> itr = hs.entrySet().iterator();

		while (itr.hasNext()) {

			Map.Entry<String, String> en = itr.next();
			String ss = en.getKey();

			if (ss.contains(textQuestion.getText().trim())) {

				WebElement element = getDynamicWebElement(textAnswer, en.getValue());
				clickWebElement(element);
				clickWebElement(arrowSubmitNext);
				clickWebElement(arrowContinueNext);

			}
		}

		return this;
	}
}
