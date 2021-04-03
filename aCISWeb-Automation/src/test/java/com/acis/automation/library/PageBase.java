package com.acis.automation.library;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Base64;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import java.util.function.BiPredicate;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.Color;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.supercsv.io.CsvMapReader;
import org.supercsv.io.ICsvMapReader;
import org.supercsv.prefs.CsvPreference;
import org.testng.Assert;
import org.testng.ITestResult;

import com.acis.automation.constants.Constants;
import com.acis.automation.utilities.AcisConfigProperties;
import com.acis.automation.utilities.AcisException;
import com.acis.automation.utilities.OSInfo;
import com.acis.automation.utilities.OSInfo.OS;
import com.aventstack.extentreports.Status;
import com.opencsv.CSVReader;
import com.opencsv.CSVWriter;

/**
 * This class is for the purpose of defining methods for commonly used actions
 */
public class PageBase extends TestBase {
	private static final String DOCUMENT_READY_STATE = "return document.readyState";
	private static final String COMPLETE_STATE = "complete";
	final static Logger logger = LoggerFactory.getLogger(PageBase.class);
	public static String strOldBorder = "";

	protected Map<String, String> columnData = new HashMap<String, String>();
	@FindBy(xpath = "//*[text()='Organizations']")
	WebElement menuOrganizations;

	@FindBy(xpath = "//*[text()='Courses']")
	WebElement menuCourses;

	@FindBy(xpath = "//*[text()='Users']")
	WebElement menuUsers;

	@FindBy(xpath = "//*[text()='Applications']")
	WebElement menuApplications;

	@FindBy(xpath = "//*[text()='Reports']")
	WebElement menuReports;

	@FindBy(xpath = "//*[text()='Logs']")
	WebElement menuLogs;

	@FindBy(xpath = "//*[text()='Settings']")
	WebElement menuSettings;

	public PageBase() throws AcisException {

	}

	public static String getImplicitWait() {
		if (appConfig.getProperty(Constants.IMPLICIT_WAIT).equalsIgnoreCase(Constants.IMPLICITWAIT_VALUE_FROM_JENKINS))
			implicitWait = System.getProperty("ImplicitWaitTime");
		else
			implicitWait = appConfig.getProperty(Constants.IMPLICIT_WAIT);

		return implicitWait;

	}

	public static String getExplicitWait() {
		if (appConfig.getProperty(Constants.EXPLICIT_WAIT).equalsIgnoreCase(Constants.EXPLICITWAIT_VALUE_FROM_JENKINS))
			explicitWait = System.getProperty("ExplicitWaitTime");
		else
			explicitWait = appConfig.getProperty(Constants.EXPLICIT_WAIT);
		return explicitWait;
	}

	public static String getPageLoadWait() {
		if (appConfig.getProperty(Constants.PAGE_LOAD_WAIT_TIME)
				.equalsIgnoreCase(Constants.PAGELOADWAIT_VALUE_FROM_JENKINS))
			pageLoadWait = System.getProperty("PageLoadWaitTime");
		else
			pageLoadWait = appConfig.getProperty(Constants.PAGE_LOAD_WAIT_TIME);
		return pageLoadWait;
	}

	private static String implicitWait;
	private static String explicitWait;
	private static String pageLoadWait;

	@FindBy(xpath = "//*[@id='contnetframe']")
	public WebElement frameContent;

	/**
	 * This method is used to scroll down till page end
	 * 
	 */
	public void scrollDownTillPageEnd() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		logger.info("Scoll till the Page End");

	}

	/**
	 * This method is used to check if the element is present of not.
	 * 
	 */
	public static boolean isElementPresent(By elementLocator) throws AcisException {

		int size = driver.findElements(elementLocator).size();

		if (size > 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * This method is used to scroll up till page start
	 * 
	 */
	public void scrollUpTillPageStart() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollTo(0, -document.body.scrollHeight);");

	}

	/**
	 * This method is used to scroll till the given WebElement visible
	 * 
	 */
	public void scrollingToElementofAPage(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView(true);", element);

	}

	/**
	 * This method is used to move the mouse pointer on the element
	 * 
	 */
	public void hoverOverElement(WebElement element) throws AcisException {
		String strOldBorder = getOldBoredr(element);
		highlightElement(element);

		Actions actions = new Actions(driver);
		actions.moveToElement(element).build().perform();
		unHighlightElement(element, strOldBorder);

	}

	/**
	 * This method is used to switch to a Frame by using Index
	 * 
	 */
	public void switchToFrameByIndex(int intIndex) {
		driver.switchTo().frame(intIndex);

	}

	/**
	 * This method is used to switch to a Frame by using ID or Name
	 * 
	 */
	public void switchToFrameByIdorName(String strFrame) {
		driver.switchTo().frame(strFrame);

	}

	/**
	 * This method is used to switch to a Frame by using WebElement
	 * 
	 */
	public void switchToFrameByWebElement(WebElement element) {
		driver.switchTo().frame(element);

	}

	/**
	 * This method is used to navigate to a window by its Title
	 * 
	 * @param strTitle
	 * @throws AcisException
	 */
	public void switchToWindowBytitle(String strTitle) throws AcisException {
		String strCurrentWindow = driver.getWindowHandle();
		Set<String> availableWindows = driver.getWindowHandles();
		if (!availableWindows.isEmpty()) {
			for (String windowId : availableWindows) {
				if (driver.switchTo().window(windowId).getTitle().equals(strTitle)) {

				} else {

					driver.switchTo().window(strCurrentWindow);
					if (OSInfo.getOs().equals(OS.MAC)) {
						driver.manage().window().fullscreen();

					}
				}
			}
		}

	}

	/**
	 * This method is used to navigate to a window
	 * 
	 * 
	 */
	public void switchToWindow() {

		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		// String currentWindowHandle = driver.getWindowHandle();

		Set<String> availableWindows = driver.getWindowHandles();

		for (String strWinHandle : availableWindows) {
			// if (!currentWindowHandle.equals(strWinHandle)) {
			driver.switchTo().window(strWinHandle);

			if (OSInfo.getOs().equals(OS.MAC)) {
				driver.manage().window().fullscreen();

			}
			// }
		}
		logger.info("Switched to new window " + driver.getTitle());
	}

	/**
	 * This method is used to check the alert present or not and returns boolean
	 * value
	 * 
	 * @return true for alert is present or false for alert is not present
	 */
	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException ex) {
			return false;
		}
	}

	/**
	 * This method is used to accept the alert
	 * 
	 */
	public void acceptTheAlert() {
		if (isAlertPresent()) {
			do {
				Alert alert = driver.switchTo().alert();
				alert.accept();
			} while (isAlertPresent());
		}
	}

	/**
	 * This method is used to cancel the alert
	 * 
	 */
	public void cancelTheAlert() {
		if (isAlertPresent()) {
			do {
				Alert alert = driver.switchTo().alert();
				alert.dismiss();
			} while (isAlertPresent());
		}
	}

	/**
	 * This method is used to get the text present on alert and then accept the
	 * alert
	 * 
	 * @return strAlertText returns text of alert and accept the alert
	 */
	public String getTheTextAndAcceptTheAlert() {
		String strAlertText = null;
		if (isAlertPresent()) {
			do {
				Alert alert = driver.switchTo().alert();
				strAlertText = alert.getText().trim();
				alert.accept();
			} while (isAlertPresent());
		}
		return strAlertText;
	}

	/**
	 * This method is used to get the text and then cancel the alert
	 * 
	 * @return strAlertText returns text of alert and cancel the alert
	 */
	public String getTheTextAndCancelTheAlert() {
		String strAlertText = null;
		if (isAlertPresent()) {
			do {
				Alert alert = driver.switchTo().alert();
				strAlertText = alert.getText().trim();
				alert.dismiss();
			} while (isAlertPresent());
		}
		return strAlertText;
	}

	/**
	 * This method is used to select the option from drop down by using index value
	 * 
	 * @param element
	 * @param intIndex
	 * @throws AcisException
	 */
	public void selectDropdownByIndex(WebElement element, int intIndex) throws AcisException {

		Select select = new Select(element);
		String strOldBorder = getOldBoredr(element);
		highlightElement(element);
		select.selectByIndex(intIndex);
		unHighlightElement(element, strOldBorder);
	}

	/**
	 * This method is used to get the text of default selected option on drop down
	 * by using WebElement
	 * 
	 * @param element
	 * @throws AcisException
	 * 
	 * 
	 *        <<<<<<< HEAD ======= getFirstSelectedOption >>>>>>> AutoDev
	 */
	public String getSelectedOptionTextOnSelectDropdown(WebElement element) throws AcisException {

		Select select = new Select(element);
		return select.getFirstSelectedOption().getText().trim();

	}

	/**
	 * This method is used to select the option from drop down by using its value
	 * 
	 * @param element
	 * @param strOptionValue
	 * @throws AcisException
	 */
	public void selectDropdownByValue(WebElement element, String strOptionValue) throws AcisException {
		String strOldBorder = getOldBoredr(element);

		highlightElement(element);

		Select select = new Select(element);
		select.selectByValue(strOptionValue);
		unHighlightElement(element, strOldBorder);
	}

	/**
	 * This method is used to select the option from drop down by using actual text
	 * of the option
	 * 
	 * @param element
	 * @param strOptionText
	 * @throws AcisException
	 */
	public void selectDropdownByVisibleText(WebElement element, String strOptionText) throws AcisException {
		String strOldBorder = getOldBoredr(element);

		highlightElement(element);
		Select select = new Select(element);
		select.selectByVisibleText(strOptionText);
		unHighlightElement(element, strOldBorder);

	}

	/**
	 * This method is used to enter text into input text box
	 * 
	 * @param strText
	 * @param element
	 * @throws AcisException
	 */
	public void enterText(WebElement element, String strText) throws AcisException {
		highlightElement(element);
		element.clear();
		element.sendKeys(strText);
		unHighlightElement(element, strOldBorder);
	}

	/**
	 * This method is used to enter text into tags other than Input using Javascript
	 * 
	 * @param strText
	 * @param element
	 * @throws AcisException
	 */
	public void enterTextUsingJavascript(WebElement element, String strText) throws AcisException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].value = '" + strText + "'", element);
	}

	/**
	 * This method is used to refresh the page
	 * 
	 */
	public void refreshPage() {
		driver.navigate().refresh();
	}

	/**
	 * This method is used to load the new web page with provided URL
	 * 
	 * @param strUrl
	 */
	public void navigateToApp(String strUrl) {
		driver.navigate().to(strUrl);

	}

	/**
	 * This method does the same operation as clicking on the Forward Button of any
	 * browser.
	 * 
	 */
	public void navigateForward() {
		driver.navigate().forward();
	}

	/**
	 * This method does the same operation as clicking on the Back Button of any
	 * browser
	 * 
	 */
	public void navigateBack() {
		driver.navigate().back();
	}

	/**
	 * This method is used to keep WebDriver wait till specified
	 * 
	 */
	public void waitImplicitly() {
		driver.manage().timeouts().implicitlyWait(Integer.parseInt(getImplicitWait()), TimeUnit.SECONDS);
	}

	/**
	 * This method is used to keep WebDriver wait till expected element is visible
	 * 
	 * @param element
	 */
	public void waitForElement(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(getExplicitWait()));
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	/**
	 * This method is used to keep WebDriver wait till expected text of element is
	 * visible
	 * 
	 * @param element
	 */
	public void waitForElementTextToBe(WebElement element, String strtext) {
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(getExplicitWait()));
		wait.until(ExpectedConditions.visibilityOf(element));
		wait.until(ExpectedConditions.textToBePresentInElement(element, strtext));
	}

	/**
	 * This method is used to keep WebDriver wait till expected title is visible
	 * 
	 * @param strTitle
	 */
	public void waitForTitle(String strTitle) {
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(getExplicitWait()));
		wait.until(ExpectedConditions.titleContains(strTitle));
	}

	/**
	 * This method is used to keep WebDriver wait till expected alert is visible
	 * 
	 */
	public void waitForAlert() {
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(getExplicitWait()));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	/**
	 * This method is used to keep WebDriver wait till expected element is to be
	 * clickable
	 * 
	 * @param element
	 * @throws AcisException
	 */
	public void waitForElementClickable(WebElement element) throws AcisException {

		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(getExplicitWait()));
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}

	/**
	 * This method is used to keep WebDriver wait till expected element is to be
	 * selected
	 * 
	 * @param element
	 * @throws AcisException
	 */
	public void waitForElementSelected(WebElement element) throws AcisException {

		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(getExplicitWait()));
		wait.until(ExpectedConditions.elementToBeSelected(element));
	}

	/**
	 * This method is used to keep WebDriver wait till expected elements are visible
	 * 
	 * @param elements
	 */
	public void waitForAllElements(List<WebElement> elements) {
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(getExplicitWait()));
		wait.until(ExpectedConditions.visibilityOfAllElements(elements));

	}

	/**
	 * This method is used to keep WebDriver wait till expected no of windows to be
	 * loaded
	 * 
	 * @param elements
	 */
	public void waitForWindowsToBeOpened(int noOfWindows) {
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(getExplicitWait()));
		wait.until(ExpectedConditions.numberOfWindowsToBe(noOfWindows));
	}

	public void waitForPageLoad() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		int pagLoadWaitTime = Integer.parseInt(getPageLoadWait());

		for (int i = 0; i < pagLoadWaitTime; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}

			if (js.executeScript(DOCUMENT_READY_STATE).toString().equals(COMPLETE_STATE)) {
				break;
			}
		}
	}
	
	/**
	 * This method is for explicit wait till 
	 */
	
	public void waitForPageLoadTill(int i) {
		
			try {
				Thread.sleep(i*1000);
			} catch (InterruptedException e) {
				
			}
	         }
		
	

	/**
	 * This method is used to switch to a base frame of web page
	 * 
	 */

	public void switchToBaseFrame() {
		switchToDefaultContent();
		waitForElement(frameContent);
		switchToFrameByWebElement(frameContent);
	}

	/**
	 * This method is used to switch to default content
	 * 
	 */

	public void switchToDefaultContent() {
		driver.switchTo().defaultContent();

	}

	/**
	 * This method is used to keep WebDriver wait till alert is visible
	 * 
	 */
	public void waitForAlertPresent() {
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(getExplicitWait()));
		wait.until(ExpectedConditions.alertIsPresent());
	}

	/**
	 * This method is used to close all opened windows except parent window
	 * 
	 * @param element
	 */

	public void closeWindowsExceptParent() {
		try {
			int intcount = driver.getWindowHandles().size();
			for (int i = 1; i < intcount; i++) {
				switchToWindow();
				waitForPageLoad();
				driver.close();
				logger.info("Closed " + i + " window");

				waitForWindowsToBeOpened(intcount - i);

			}
		} catch (

		Exception e) {
			logger.info(e.getMessage());

		}
		if (driver.getWindowHandles().size() > 1) {
			closeWindowsExceptParent();
		}

		switchToWindow();
		logger.info("Closed All the Windows except Parent window");

	}

	/**
	 * This method is used to keep WebDriver wait till element get invisible
	 * 
	 * 
	 * @param elementLocator
	 * @author Shreyas.Khandekar
	 */
	public void waitForElementTobeInvisible(By elementLocator) {
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(getExplicitWait()));
		wait.until(ExpectedConditions.invisibilityOfElementLocated(elementLocator));
	}

	/**
	 * This method is used to keep WebDriver wait till element get invisible
	 * 
	 * 
	 * @param elementLocator
	 * @author Shreyas.Khandekar
	 */
	public void waitForElementTobeInvisible(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(getExplicitWait()));
		wait.until(ExpectedConditions.invisibilityOfAllElements(element));
	}

	// cs
	/**
	 * 
	 * @author Shreyas.Khandekar
	 * @throws AcisException
	 * @throws InterruptedException
	 */
	public void loginAfterTestFailedOrSkippedForLP(ITestResult result) throws AcisException, InterruptedException {
		logger.info("In loginAfterTestFailedOrSkipped method for LP");
		handleSessionAlert();
		if (driver.getWindowHandles().size() > 1) {
			closeWindowsExceptParent();

		}

		/*if (userLogin.isUserNameTextBoxPresent()) {
			logger.info("User is on Login page");
			try {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
				home.verifyLogin();
			} catch (Exception e) {
				handleSessionAlert();

				getStackTrace(e, "Failed in In loginAfterTestFailedOrSkipped method for verify login");
			}
		}*/

		try {
			if (Arrays.asList(result.getMethod().getGroups()).contains("EndToEnd")) {
				//enrollmentAndDueDate.hoveronCoursesMenu().clickOnEnrollmentAndDueDates().clearAllCourses();
				logger.info("Cleared All the Enrollments");

			}
		} catch (Exception e) {
			handleSessionAlert();

			getStackTrace(e, "Failed in loginAfterTestFailedOrSkipped method for LP while clearing all enrollments");
		}

	}

	/**
	 * This method is used to login to application in case script got Fail or
	 * Skipped
	 * 
	 * @throws AcisException
	 */
//SK changes
	/*public void loginAfterTestFailedOrSkippedForAdmin(ITestResult result) throws AcisException, InterruptedException {
		logger.info("In loginAfterTestFailedOrSkipped method for Admin");

		handleSessionAlert();
		if (driver.getWindowHandles().size() > 1) {
			closeWindowsExceptParent();
		}
		if (userLogin.isUserNameTextBoxPresent()) {
			logger.info("User is on Login page");
			try {
				if ((result.getMethod().getTestClass().getName()).contains("PasswordsTest")
						|| (result.getMethod().getTestClass().getName()).contains("ZoltarDashboardTest")) {
					userLogin.loginUserToApplication(organizations.getOrgEmailIDForTestCaseSetup(),
							testData.get(Constants.ORGNIZATION_SHEET).get("Password"));
				} else {
					userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
							testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
				}
				home.verifyLogin();
			} catch (Exception e) {
				handleSessionAlert();
				getStackTrace(e, "Failed in loginAfterTestFailedOrSkippedForAdmin method for verify login");
			}
		}

	}*/

	/**
	 * This method is used to login to application in case script got Fail or
	 * Skipped
	 * 
	 * @throws AcisException
	 */

	public void loginAfterTestFailedOrSkippedForMSA(ITestResult result) throws AcisException, InterruptedException {
		logger.info("In loginAfterTestFailedOrSkipped method for MSA");

		handleSessionAlert();
		if (driver.getWindowHandles().size() > 1) {
			closeWindowsExceptParent();
		}
		/*if (userLogin.isUserNameTextBoxPresent()) {
			logger.info("User is on Login page");
			try {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("username"),
						testData.get(Constants.LOGINPAGE_SHEET).get("password"));
				home.verifyLogin();
			} catch (Exception e) {
				handleSessionAlert();
				getStackTrace(e, "Failed in loginAfterTestFailedOrSkippedForMSA method for verify login");
			}
		}*/

	}

	/**
	 * This method is used to handling Session expired/other unexpected alerts
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Shreyas.Khandekar
	 */

	private void handleSessionAlert() throws AcisException {
		if (isAlertPresent()) {
			String alertText = getTheTextAndCancelTheAlert();
			logger.info("Handled unexpected alert " + alertText);

			testLoggerInfo("Handled unexpected alert " + alertText);

			/*if (alertText.contains("Session expired")) {
				try {
					userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("orgusername"),
							testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
					home.verifyLogin();
				} catch (Exception e) {

					getStackTrace(e, "Failed in handleSessionAlert while handling Session expired/unexpected alert");

				}
			}*/
		}

	}

	/**
	 * This method is used to accept/cancel alert and close all child windows after
	 * test got passed
	 * 
	 * @author Shreyas.Khandekar
	 * @throws AcisException
	 */
	public void cleanUpAfterTestPassed(ITestResult result) throws AcisException {
		logger.info("In cleanUpAfterTestPassed method");

		if (isAlertPresent()) {
			cancelTheAlert();
			logger.info("Handled unexpected alert");
		}
		if (driver.getWindowHandles().size() > 1) {
			closeWindowsExceptParent();
		}
		refreshPage();
	}

	/**
	 * This method is used to verify if drop down is empty
	 * 
	 * 
	 * @param element
	 * @author Shreyas.Khandekar
	 * @throws AcisException
	 */
	public boolean verifyGroupBucketIsEmpty(WebElement element) throws AcisException {
		String strOldBorder = getOldBoredr(element);

		highlightElement(element);
		Select select = new Select(element);
		boolean flag = select.getOptions().isEmpty();
		unHighlightElement(element, strOldBorder);

		return flag;
	}

	/**
	 * This is method is to click on web element
	 *
	 * @param element
	 * @throws AcisException
	 * @author Shreyas.Khandekar
	 */

	public void clickWebElement(WebElement element) throws AcisException {
		// String strOldBorder = getOldBoredr(element);
		highlightElement(element);
		element.click();
		// unHighlightElement(element, strOldBorder);

	}

	private String getOldBoredr(WebElement element) {
		return element.getCssValue("border");
	}

	/**
	 * To highlight Failed element
	 * 
	 * @param webdriver
	 * @param element
	 * @throws AcisException
	 * @author Shreyas.Khandekar
	 */

	public void highlightElement(WebElement element) throws AcisException {
		try {
			if (appConfig.getProperty(Constants.HIGHLIGHT_FLAG).equals("true")) {
				scrollingToElementofAPage(element);
				strOldBorder = getOldBoredr(element);
				JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
				jsDriver.executeScript("arguments[0].style.border='3px solid red'", element);

				Thread.sleep(1000);
			}

		} catch (InterruptedException e) {
			throw new AcisException("Exception occured while highlighting element");
		}
	}

	/**
	 * This method is used to unhighlight webElement
	 * 
	 * @param element
	 * 
	 * @throws AcisException
	 * 
	 */
	public void unHighlightElement(WebElement element, String strOldBorder) throws AcisException {
		try {
			if (appConfig.getProperty(Constants.HIGHLIGHT_FLAG).equals("true")) {
				scrollingToElementofAPage(element);

				JavascriptExecutor jsDriver = (JavascriptExecutor) driver;
				jsDriver.executeScript("arguments[0].style.border='" + strOldBorder + "'", element);
				Thread.sleep(1000);

			}
		} catch (InterruptedException e) {
			throw new AcisException("Exception occured while Unhighlighting element");
		}
	}

	/**
	 * This method is used to wait till web element is present
	 * 
	 * @param elementLocator
	 * @author Shreyas.Khandekar
	 * 
	 */
	public void waitAndVerifyElement(By elementLocator) throws AcisException {
		WebDriverWait wait = new WebDriverWait(driver, Integer.parseInt(getExplicitWait()));
		wait.until(ExpectedConditions.visibilityOfElementLocated(elementLocator));
		Assert.assertTrue(isElementPresent(elementLocator), elementLocator + " Element is not present ");
	}

	/**
	 * This method is used to get past date
	 * 
	 * @author Shreyas.Khandekar
	 * @param intDays
	 */
	public String getPastDate(int intDays) {
		// String DATE_FORMAT = "MM/dd/yyyy";
		String date = "";
		String DATE_FORMAT = "MM/dd/yyyy";
		DateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		// TimeZone timeZone = TimeZone.getTimeZone("GMT-06:00");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -intDays);
		Date pastdate = cal.getTime();
		sdf.setTimeZone(TimeZone.getTimeZone("GMT-06:00"));
		date = sdf.format(pastdate);

		return date;
	}

	/**
	 * This method is used to click Using JavascriptExecutor
	 * 
	 * @author Shreyas.Khandekar
	 * @param element
	 */
	public void clickWebElemntUsingJavascriptExecutor(WebElement element) throws AcisException {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].click();", element);
	}

	/**
	 * This method is used to click on Stale Element
	 * 
	 * @author Shreyas.Khandekar
	 * @param element
	 */

	public void clickOnStaleElement(WebElement element) throws AcisException {

		new WebDriverWait(driver, Integer.parseInt(getExplicitWait())).ignoring(StaleElementReferenceException.class)
				.until(ExpectedConditions.elementToBeClickable(element));
		element.click();
	}

	/**
	 * This method is used to perform drag and drop operation
	 * 
	 * @param sourceElement
	 * @param destinationElement
	 */
	public void dragAndDrop(WebElement sourceElement, WebElement destinationElement) {

		Actions builder = new Actions(driver);
		scrollingToElementofAPage(sourceElement);
		builder.moveToElement(sourceElement).clickAndHold(sourceElement).build().perform();
		scrollingToElementofAPage(destinationElement);
		builder.moveToElement(destinationElement).release(destinationElement).build().perform();

	}

	/**
	 * This method is used to select the option from drop down by using actual text
	 * of the option on the application using JavascriptExecutor
	 * 
	 * @param element
	 * @param stroptiontext
	 * @author Shreyas.Khandekar
	 * @throws AcisException
	 */
	public void selectDropdownByVisibleTextUsingJavascriptExecutor(WebElement element, String stroptiontext)
			throws AcisException {
		String strOldBorder = getOldBoredr(element);

		highlightElement(element);
		((JavascriptExecutor) driver).executeScript(
				"var select = arguments[0]; for(var i = 0; i < select.options.length; i++){ if(select.options[i].text == arguments[1]){ select.options[i].selected = true; } }",
				element, stroptiontext);
		unHighlightElement(element, strOldBorder);

	}

	/**
	 * This method is used to select the option from dropdown by using Index of the
	 * option on the application using JavascriptExecutor
	 * 
	 * @param element
	 * @param index
	 * @author Shreyas.Khandekar
	 * @throws AcisException
	 */
	public void selectDropdownByIndexUsingJavascriptExecutor(WebElement element, int index) throws AcisException {
		String strOldBorder = getOldBoredr(element);

		highlightElement(element);

		((JavascriptExecutor) driver).executeScript("return arguments[0].selectedIndex = '" + index + "';", element);

		unHighlightElement(element, strOldBorder);
	}

	/**
	 * This method is used to perform drag and drop operation for course simulation
	 * section at LP tree
	 * 
	 * @author Shreyas.Khandekar
	 */

	public void dragAndDrop(WebElement sourceElement, WebElement destinationElement, int xOffset, int yOffset) {

		Actions builder = new Actions(driver);

		if (currentBrowserName.equals(Constants.EDGE_BROWSER)) {
			Action draganddrop = builder.dragAndDropBy(sourceElement, xOffset, yOffset).build();
			draganddrop.perform();

		}

		else {

			String xto = Integer.toString(destinationElement.getLocation().x);
			String yto = Integer.toString(destinationElement.getLocation().y);
			((JavascriptExecutor) driver).executeScript(
					"function simulate(f,c,d,e){var b,a=null;for(b in eventMatchers)if(eventMatchers[b].test(c)){a=b;break}if(!a)return!1;document.createEvent?(b=document.createEvent(a),a==\"HTMLEvents\"?b.initEvent(c,!0,!0):b.initMouseEvent(c,!0,!0,document.defaultView,0,d,e,d,e,!1,!1,!1,!1,0,null),f.dispatchEvent(b)):(a=document.createEventObject(),a.detail=0,a.screenX=d,a.screenY=e,a.clientX=d,a.clientY=e,a.ctrlKey=!1,a.altKey=!1,a.shiftKey=!1,a.metaKey=!1,a.button=1,f.fireEvent(\"on\"+c,a));return!0} var eventMatchers={HTMLEvents:/^(?:load|unload|abort|error|select|change|submit|reset|focus|blur|resize|scroll)$/,MouseEvents:/^(?:click|dblclick|mouse(?:down|up|over|move|out))$/}; "
							+ "simulate(arguments[0],\"mousedown\",0,0); simulate(arguments[0],\"mousemove\",arguments[1],arguments[2]); simulate(arguments[0],\"mouseup\",arguments[1],arguments[2]); ",
					sourceElement, xto, yto);

		}

	}

	/**
	 * This method is used to generate random string
	 * 
	 * @throws AcisException
	 */

	public String generateRandomString() {
		String alphabet = new String("0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz");
		int n = alphabet.length();
		Random r = new Random();

		String strRandom = "";
		for (int i = 0; i < 6; i++) {
			strRandom = strRandom + alphabet.charAt(r.nextInt(n));
		}
		return strRandom;
	}

	/**
	 * This method is used to Forcefully click on WebElement
	 * 
	 * @throws IOException
	 * @author Shreyas.Khandekar
	 * @throws IOException
	 */

	public void forceClickWebElement(WebElement element) throws IOException {
		Actions action = new Actions(driver);
		action.moveToElement(element).click().build().perform();

	}

	/**
	 * This method is used to wait and refresh till required time for PhishProof
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 * @author (Original) Unknown
	 * @author (Modified) Shreyas.Khandekar *
	 */

	public void waitAndRefreshTillRequiredTimePhishProof() throws AcisException, InterruptedException {

		int waitTime = Integer.parseInt(appConfig.getProperty("waitForSessionActive"));
		logger.info("Waiting for Phishproof to complete the campaign");

		testLoggerInfo("Waiting for Phishproof to complete the campaign");
		for (

				int i = 0; i < waitTime; i++) {
			Thread.sleep(10000);
			refreshPage();
			waitForPageLoad();
		}
	}

	/**
	 * This method is used to wait and refresh till required time
	 * 
	 * @param intWaitTimeMin
	 * @throws ParseException
	 * @author (Original) Unknown
	 * @author (Modified) Shreyas.Khandekar
	 * 
	 */

	public void waitAndRefreshTillRequiredTimeInMinutes(int intWaitTimeMin) throws AcisException, InterruptedException {
		int waitTime = 1 * 65000;
		Thread.sleep(waitTime);
		logger.info("Waiting for " + intWaitTimeMin + " waiting to get completed");

		testLoggerInfo("Waiting for " + intWaitTimeMin + " waiting to get completed");

		waitForPageLoad();

	}

	/**
	 * This method is used to convert Date format
	 * 
	 * @throws ParseException
	 * @author(Original) Unknown
	 * @author(Modified) Shreyas.Khandekar
	 */

	public String convertDateFormat(String stringDateFormat, String pastDate) throws ParseException {

		Date date1 = new SimpleDateFormat("MM/dd/yyyy").parse(pastDate);

		DateFormat sdf = new SimpleDateFormat(stringDateFormat);

		String givenFormatDat = sdf.format(date1);

		return givenFormatDat;

	}

	/**
	 * This method is used to convert Date format including Time
	 * 
	 * @throws ParseException
	 * @author(Original) Unknown
	 * @author(Modified) Shreyas.Khandekar
	 */

	public String convertDateFormatWithTime(String stringDateFormat, String pastDate) throws ParseException {

		Date date1 = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss").parse(pastDate);

		DateFormat sdf = new SimpleDateFormat(stringDateFormat);

		String givenFormatDat = sdf.format(date1);

		return givenFormatDat;

	}
	
	
	
	/**
	 * This method is used to convert Date format including Time in 12 hour format
	 * 
	 * @throws ParseException
	 * @author(Original) Unknown
	 * @author(Modified) Shreyas.Khandekar
	 */

	public String convertDateFormatWithTimeInAMPM(String stringDateFormat, String pastDate) throws ParseException {

		Date date1 = new SimpleDateFormat("MM/dd/yyyy hh:mm aa").parse(pastDate);

		DateFormat sdf = new SimpleDateFormat(stringDateFormat);

		String givenFormatDat = sdf.format(date1);

		return givenFormatDat;

	}

	/**
	 * This method is used to get past Date with Time
	 * 
	 * @author(Original) Unknown
	 * @author(Modified) Shreyas.Khandekar
	 */

	public String getPastDateWithTime(int intDays) {
		// String DATE_FORMAT = "MM/dd/yyyy";
		String date = "";
		String DATE_FORMAT = "MM/dd/yyyy HH:mm:ss";
		DateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -intDays);
		Date pastdate = cal.getTime();
		sdf.setTimeZone(TimeZone.getTimeZone("GMT-06:00"));
		date = sdf.format(pastdate);

		return date;
	}
	
	
	/**
	 * This method is used to get past Date with Time
	 * 
	 * @author(Original) Unknown
	 * @author(Modified) Shreyas.Khandekar
	 */

	public String getPastDateWithAMPMTime(int intDays) {
		// String DATE_FORMAT = "MM/dd/yyyy";
		String date = "";
		String DATE_FORMAT = "MM/dd/yyyy HH:mm aa";
		DateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -intDays);
		Date pastdate = cal.getTime();
		sdf.setTimeZone(TimeZone.getTimeZone("GMT-06:00"));
		date = sdf.format(pastdate);

		return date;
	}

	/**
	 * This method is used to get organization name
	 * 
	 * @throws ParseException
	 * @author(Original) Unknown
	 * @author(Modified) Shreyas.Khandekar
	 */

	public String getOrgname() throws ParseException {
		String strOrgName;
		strOrgName = "AutoOrg_iLMSUI_" + convertDateFormatWithTime("ddMMMyy_HH-mm-ss", getPastDateWithTime(0));
		logger.info("Org Name is : " + strOrgName);

		testLoggerInfo("Org Name is : " + strOrgName);
		return strOrgName;

	}

	/**
	 * This method is used to right click on WebElement
	 * 
	 * @author Shreyas.Khandekar
	 * @throws IOException
	 */

	public void rightClickOnWebElement(WebElement element) throws IOException, AcisException {
		Actions action = new Actions(driver);
		action.moveToElement(element).contextClick(element).build().perform();

	}

	/**
	 * This method is used to double click on WebElement
	 * 
	 * @author Shreyas.Khandekar
	 * @throws IOException
	 */

	public void doubleClickOnWebElement(WebElement element) throws IOException {
		Actions action = new Actions(driver);
		action.doubleClick(element).build().perform();

	}

	public static boolean isClickable(WebElement webe) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, 5);
			wait.until(ExpectedConditions.elementToBeClickable(webe));
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	/**
	 * This method is used to upload Any file in application
	 * 
	 * 
	 * @param strUploadFileName - File name to be uploaded
	 * @author Shreyas.Khandekar
	 * @throws InterruptedException
	 */
	public void uploadFile(String uploadPath, String uploadPathForSendKeys, String strUploadFileName,
			WebElement elementFileTag) throws AcisException, InterruptedException {

		try {
			String strFilePath = uploadPath + strUploadFileName;
			if (currentBrowserName.equalsIgnoreCase(Constants.EDGE_BROWSER)) {
				waitForElement(elementFileTag);
				elementFileTag.sendKeys(uploadPathForSendKeys + strUploadFileName);
				logger.info("Uploaded file ");
				testLoggerPass("Uploaded file ");
			} else {
				scrollingToElementofAPage(elementFileTag);
				if (currentBrowserName.equalsIgnoreCase(Constants.CHROME_BROWSER)) {
					waitForElementClickable(elementFileTag);
					forceClickWebElement(elementFileTag);
					testLoggerInfo("Clicked on Select File Button");
					logger.info("Clicked on Select File Button");
					Thread.sleep(3000);
					Runtime.getRuntime().exec(Constants.AUTOIT_FILE_CHROME + " " + strFilePath);
				} else if (currentBrowserName.equalsIgnoreCase(Constants.FF_BROWSER)) {
					waitForElementClickable(elementFileTag);
					forceClickWebElement(elementFileTag);
					testLoggerInfo("Clicked on Select File Button");
					logger.info("Clicked on Select File Button");
					Runtime.getRuntime().exec(Constants.AUTOIT_FILE_FF + " " + strFilePath);
				} else if (currentBrowserName.equalsIgnoreCase(Constants.IE_BROWSER)) {
					forceClickWebElement(elementFileTag);
					Thread.sleep(3000);
					testLoggerInfo("Clicked on Select File Button");
					logger.info("Clicked on Select File Button");
					Runtime.getRuntime().exec(Constants.AUTOIT_FILE_IE + " " + strFilePath);
				}
				Thread.sleep(3000);
			}
		} catch (IOException e) {

			getStackTrace(e, "Exception while uploading file");

		}

	}

	/**
	 * This method is used to get column number by passing column name
	 * 
	 * @param strFileName
	 * @param colName
	 * @return
	 * @throws IOException
	 * @author Shreyas.Khandekar
	 */

	public int getCSVColumnNumberByColumnName(String strFileName, String colName) throws IOException {

		String inputFile = Constants.FILE_PATH + strFileName;
		CSVReader reader = new CSVReader(new FileReader(inputFile), ',');
		List<String[]> csvBody = reader.readAll();

		int counter = 0;
		String[] col = csvBody.get(0);
		for (String c1 : col) {
			if (c1.equalsIgnoreCase(colName)) {
				break;
			}
			counter++;

		}
		logger.info("Captured the column number of " + colName + "column in CSV as: " + counter);

		testLoggerInfo("Captured the column number of " + colName + "column in CSV as: " + counter);
		return counter;

	}

	/**
	 * This method is used to get all columns data of first row and add into map
	 * 
	 * @param strFileName
	 * @author Shreyas.Khandekar
	 * 
	 * @throws IOException
	 */

	public void getEachColumnDataFromCSV(String strFileName) throws IOException {

		String inputFile = Constants.FILE_PATH + strFileName;

		ICsvMapReader mapReader = new CsvMapReader(new FileReader(inputFile), CsvPreference.EXCEL_PREFERENCE);
		try {
			final String[] headers = mapReader.getHeader(true);

			Map<String, String> map = mapReader.read(headers);

			for (int i = 0; i < headers.length; i++) {

				columnData.put(String.valueOf(getCSVColumnNumberByColumnName(strFileName, headers[i])),
						map.get(headers[i]));
			}

		} finally {
			mapReader.close();
		}
	}

	/**
	 * This method is to update the cell value from CSV by passing row and column
	 * 
	 * @param fileName CSV file path to update
	 * @param fileName CSV file path to update
	 * @param replace  Replacement for your cell value
	 * @param rowNo    Row for which need to update
	 * @param colNo    Column for which you need to update
	 * @param fileName CSV file path to update
	 * @param replace  Replacement for your cell value
	 * @param rowNo    Row for which need to update
	 * @param colNo    Column for which you need to update
	 * @author Shreyas.Khandekar
	 * 
	 * @throws IOException
	 */
	public void updateCellDataInCSV(String strFileName, String replace, int rowNo, String colNo) throws IOException {

		String inputFile = Constants.FILE_PATH + strFileName;
		// Read existing file
		CSVReader reader = new CSVReader(new FileReader(inputFile), ',');
		List<String[]> csvBody = reader.readAll();
		// get CSV row column and replace with by using row and column
		csvBody.get(rowNo)[Integer.parseInt(colNo)] = replace;
		reader.close();

		// Write to CSV file which is open
		CSVWriter writer = new CSVWriter(new FileWriter(inputFile), ',');
		writer.writeAll(csvBody);
		writer.flush();
		writer.close();
	}

	/**
	 * This method is to read CSV file and get all data of all rows
	 * 
	 * @throws AcisException
	 * @author Shreyas.Khandekar
	 */

	public List<List<String>> csvReaderCustom(String csvFilename) throws IOException {

		String[] row = null;
		CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
		List content = csvReader.readAll();

		List<List<String>> listRows = new ArrayList<>();

		for (Object object : content) {

			row = (String[]) object;

			listRows.add(Arrays.asList(row));

		}
		// ...
		csvReader.close();
		return listRows;

	}

	/**
	 * This method is to get all values of desired column from CSV file
	 * 
	 * @throws AcisException
	 * @author Shreyas.Khandekar
	 */

	public List<String> getSingleColumnData(String strFileName, int column) throws IOException {

		List<String> columnDataList = new ArrayList<>();
		List<List<String>> dataList = csvReaderCustom(strFileName);

		for (int i = 1; i < dataList.size(); i++) {
			List<String> rowData = dataList.get(i);
			columnDataList.add(rowData.get(column));
		}

		logger.info("Captured all data from column " + column + "as: " + columnDataList);

		testLoggerInfo("Captured all data from column " + column + "as: " + columnDataList);
		return columnDataList;

	}

	/**
	 * This method is to prepare Organization admin custom URL for test case
	 * specific Organization Organization
	 * 
	 * @throws AcisException
	 * @author Shreyas.Khandekar
	 */

	public String createCustomURL(String customUrl) throws AcisException {
		String strAdminCustomURL = configProperties.adminCustomturl() + customUrl;
		logger.info("Created Org admin custom URL as :" + strAdminCustomURL);

		testLoggerInfo("Created Org admin custom URL as :" + strAdminCustomURL);
		return strAdminCustomURL;

	}

	
	/***
	 * This method is used for custom URl
	 * @author akash.a.gaurav
	 */
	
	public String customUrL(String urlName) {
		if (urlName.equalsIgnoreCase("FosterInquiry")) {
           System.out.println(configProperties.fosterinquiryurl());
   		//Actions act = new Actions(driver);
   		((JavascriptExecutor)driver).executeScript("window.open()");
   	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
   	    driver.switchTo().window(tabs.get(1));
   	    waitForPageLoad();
   		driver.get(configProperties.fosterinquiryurl());
   	
        //act.keyDown(Keys.CONTROL).sendKeys(String.valueOf('\u0084')).keyUp(Keys.CONTROL).perform();
   		//driver.findElement(By.linkText(configProperties.fosterinquiryurl())).sendKeys(selectLinkOpeninNewTab);
			switchToWindow();
		
		}
		else if (urlName.equalsIgnoreCase("fosterParenturl")) {
		     System.out.println(configProperties.fosterParenturl());
		   		//Actions act = new Actions(driver);
		   		((JavascriptExecutor)driver).executeScript("window.open()");
		   	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		   	    driver.switchTo().window(tabs.get(1));
		   		driver.get(configProperties.fosterParenturl());
		   		waitForPageLoad();
		   		switchToWindow();
		}
		else if (urlName.equalsIgnoreCase("providerPortalurl")) {
			
			 System.out.println(configProperties.providerPortalurl());
		   		//Actions act = new Actions(driver);
		   		((JavascriptExecutor)driver).executeScript("window.open()");
		   	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
		   	    driver.switchTo().window(tabs.get(1));
		   		driver.get(configProperties.providerPortalurl());
		   		switchToWindow();
		}
		return strfileName;	
	}
	
	/**
	 * This method is to update the cell value from CSV by passing row and column
	 * 
	 * 
	 * 
	 * @param fileName CSV file path to update
	 * @param replace  Replacement for your cell value
	 * @param rowNo    Row for which need to update
	 * @param colNo    Column for which you need to update
	 * 
	 * @author Shreyas.Khandekar
	 * 
	 * @throws IOException
	 */
	public void updateSingleColumnDataOfAllRowsInCSV(String strFileName, String replace, String colNo)
			throws IOException {

		String inputFile = Constants.FILE_PATH + strFileName;

		// Read existing file
		CSVReader reader = new CSVReader(new FileReader(inputFile), ',');
		List<String[]> csvBody = reader.readAll();
		// get CSV row column and replace with by using row and column
		CSVWriter writer = new CSVWriter(new FileWriter(inputFile), ',');

		for (int i = 1; i < csvBody.size(); i++) {
			csvBody.get(i)[Integer.parseInt(colNo)] = replace;
		}

		reader.close();

		// Write to CSV file which is open
		writer.writeAll(csvBody);
		writer.flush();
		writer.close();
	}

	/**
	 * This method is to update the cell value from CSV by passing row and column
	 *
	 * @param fileName CSV file path to update
	 * @param fileName CSV file path to update
	 * @param replace  Replacement for your cell value
	 * @param rowNo    Row for which need to update
	 * @param colNo    Column for which you need to update
	 * @author Shreyas.Khandekar
	 * 
	 * @throws IOException
	 */
	public String getCellDataFromCSV(String strFileName, int rowNo, int colNo) throws IOException {

		String inputFile = Constants.FILE_PATH + strFileName;
		CSVReader reader = new CSVReader(new FileReader(inputFile), ',');
		List<String[]> csvBody = reader.readAll();
		String strCellData = csvBody.get(rowNo)[(colNo)];
		logger.info("Retrieved the cell data of row no " + rowNo + " and Column number" + colNo);

		return strCellData;

	}


	/**
	 * To convert RGB to Hex
	 * 
	 * @param color
	 * @return
	 */
	public String convertColorToHexadeimal(String color) {
		return Color.fromString(color).asHex();
	}
	
	/**
	 * This method is to create and return dynamic WebElement
	 * 
	 * @author Shreyas.Khandekar
	 */

	public WebElement getDynamicWebElement(String strXPath, String strReplaceText) {
		WebElement dynamicWebElement = driver.findElement(By.xpath(strXPath.replace("ABC", strReplaceText)));
		logger.info("Created dynamic WebElemnt as: " + dynamicWebElement);

		return dynamicWebElement;
	}

	/**
	 * This method is to create and return list of dynamic WebElements list
	 * 
	 * @author Shreyas.Khandekar
	 */

	public List<WebElement> getDynamicWebElementList(String strXPath, String strReplaceText) {
		List<WebElement> dynamicWebElementsList = driver
				.findElements(By.xpath(strXPath.replace("ABC", strReplaceText)));
		logger.info("Created dynamic WebElemnt list as: " + dynamicWebElementsList);
		return dynamicWebElementsList;
	}

	/**
	 * This method is to create and return list of dynamic WebElements
	 * 
	 * @author Shreyas.Khandekar
	 */

	public List<WebElement> getDynamicWebElementList(String strXPath, Object... replacementStrings) {
		List<WebElement> dynamicWebElementList = null;
		/*
		 * String finalString = strXPath;
		 * 
		 * //for (int i = 0; i < replacementStrings.length; i++) {
		 * 
		 * String tempString = (String.format(finalString, replacementStrings[0]));
		 * finalString = tempString;
		 * 
		 * }
		 */
		dynamicWebElementList = driver
				.findElements(By.xpath(String.format(strXPath, replacementStrings[0], replacementStrings[1])));

		logger.info("Created dynamic WebElemnt as: " + dynamicWebElementList);
		return dynamicWebElementList;
	}

	/**
	 * This method is to create and return dynamic WebElement using String.format
	 * 
	 * @author Shreyas.Khandekar
	 */

	public WebElement getDynamicWebElement(String strXPath, Object... replacementStrings) {
		WebElement dynamicWebElement = null;
		/*
		 * String finalString = strXPath; for (int i = 0; i < replacementStrings.length;
		 * i++) { String tempString = String.format(finalString,
		 * String.valueOf(replacementStrings[i])); finalString = tempString; }
		 */

		dynamicWebElement = driver
				.findElement(By.xpath(String.format(strXPath, replacementStrings[0], replacementStrings[1])));

		logger.info("Created dynamic WebElemnt as: " + dynamicWebElement);
		return dynamicWebElement;
	}

	/**
	 * This method is used to navigate to Parent window
	 * 
	 * @author Shreyas.Khandekar
	 * 
	 */
	public void switchToParentWindow() {
		Set<String> availableWindows = driver.getWindowHandles();
		driver.switchTo().window(availableWindows.iterator().next());

		logger.info("Switched to window " + driver.getTitle());

		testLoggerInfo("Switched to window " + driver.getTitle());

	}

	/**
	 * This method is used to upload Any file in application for potter application
	 * 
	 * 
	 * @param strUploadFileName - File name to be uploaded
	 * @author Shreyas.Khandekar
	 * @throws InterruptedException
	 */

	public void uploadFileForPotter(String uploadPath, String uploadPathForSendKeys, String strUploadFileName,
			WebElement elementFileTag, WebElement elementButton) throws AcisException, InterruptedException {

		try {

			// String strFilePath = Constants.UPLOAD_PATH + strUploadFileName;
			String strFilePath = uploadPath + strUploadFileName;

			if (currentBrowserName.equalsIgnoreCase(Constants.EDGE_BROWSER)) {
				waitForElement(elementFileTag);
				// elementFileTag.sendKeys(Constants.UPLOAD_PATH_USING_SENDKEYS +
				// strUploadFileName);
				elementFileTag.sendKeys(uploadPathForSendKeys + strUploadFileName);
				logger.info("Uploaded file ");
				testLoggerInfo("Uploaded file ");

			} else {

				scrollingToElementofAPage(elementButton);

				if (currentBrowserName.equalsIgnoreCase(Constants.CHROME_BROWSER)) {
					waitForElementClickable(elementButton);
					forceClickWebElement(elementButton);
					testLoggerInfo("Clicked on Select File Button");
					logger.info("Clicked on Select File Button");
					Runtime.getRuntime().exec(Constants.AUTOIT_FILE_CHROME + " " + strFilePath);
				} else if (currentBrowserName.equalsIgnoreCase(Constants.FF_BROWSER)) {
					waitForElementClickable(elementButton);
					forceClickWebElement(elementButton);
					testLoggerInfo("Clicked on Select File Button");
					logger.info("Clicked on Select File Button");
					Runtime.getRuntime().exec(Constants.AUTOIT_FILE_FF + " " + strFilePath);

				} else if (currentBrowserName.equalsIgnoreCase(Constants.IE_BROWSER)) {
					forceClickWebElement(elementButton);
					Thread.sleep(3000);

					testLoggerInfo("Clicked on Select File Button");
					logger.info("Clicked on Select File Button");
					Runtime.getRuntime().exec(Constants.AUTOIT_FILE_IE + " " + strFilePath);
				}
				Thread.sleep(3000);
			}
		} catch (IOException e) {
			getStackTrace(e, "Exception while uploading file.");
			// throw new IelException("Exception while uploading file");
		}

	}

	/**
	 * This method is used to Maximize Window
	 * 
	 * @author Shreyas.Khandekar
	 */
	public void maximizeWindow() {
		driver.manage().window().maximize();
		logger.info("Maximize the Window");

	}

	/**
	 * This method is used to Maximize Window
	 * 
	 * @author Shreyas.Khandekar
	 */
	public void closeDriver() {
		driver.close();

	}

	/**
	 * This method is used to add test logger for INFO
	 * 
	 * @author Shreyas.Khandekar
	 */
	public void testLoggerInfo(String strLoggerText) {
		if (testLogger() != null) {
			testCaseLogger.get().log(Status.INFO, strLoggerText);
		}

	}

	/**
	 * This method is used to add test logger on reports
	 * 
	 * @author Shreyas.Khandekar
	 */
	public void testLoggerPass(String strLoggerText) {
		if (testLogger() != null) {

			testCaseLogger.get().log(Status.PASS, strLoggerText);
		}

	}

	/**
	 * This method is used to add test logger on reports for SKIP
	 * 
	 * @author Shreyas.Khandekar
	 */
	public void testLoggerSkip(String strLoggerText) {
		if (testLogger() != null) {

			testCaseLogger.get().log(Status.SKIP, strLoggerText);
		}

	}

	/**
	 * This method is used to Maximize Window
	 * 
	 * @author Shreyas.Khandekar
	 */
	public String getTitle() {
		String strTitle = driver.getTitle();
		logger.info("Captured the page title");

		testLoggerInfo("Captured the page title");
		return strTitle;

	}

	/**
	 * This method is used to get current URL
	 * 
	 * @author Shreyas.Khandekar
	 */
	public String getCurrentURL() {
		String strURL = driver.getCurrentUrl();
		logger.info("Captured current URL" + strURL);
		testLoggerInfo("Captured current URL" + strURL);
		return strURL;

	}

	/**
	 * 
	 * This method is used to add test logger for FAIL
	 * 
	 * @author Shreyas.Khandekar
	 */
	public void testLoggerFail(String strLoggerText) {
		if (testLogger() != null) {
			testCaseLogger.get().log(Status.FAIL, strLoggerText);
		}
	}

	/**
	 * This method is used to get date in CST format - intDays gives past date +
	 * intDays gives future date 0 intDays current date
	 * 
	 * @author Shreyas.Khandekar
	 * @param intDays
	 */
	public String getDateInCST(int intDays) {
		String date = "";
		String DATE_FORMAT = "MM/dd/yyyy HH:mm a";
		DateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, +intDays);
		Date pastdate = cal.getTime();
		sdf.setTimeZone(TimeZone.getTimeZone("CST"));
		date = sdf.format(pastdate);
		return date;
	}

	public String decryptString(String strEncryptedString) {

		Base64.Decoder decoder = Base64.getDecoder();
		// Decoding string
		return new String(decoder.decode(strEncryptedString));
	}

	/**
	 * This method is to Delete old down loaded reports from download folder
	 * 
	 * @return
	 * @throws AcisException
	 * @author Shreyas.Khandekar
	 */

	public void deleteAlreadyDownloadedReportFiles(String filNameStartsWith, String fileNameEndsWith)
			throws InterruptedException, AcisException {
		try {

			String folderName = Constants.DOWNLOAD_PATH; // Give your folderName
			File[] listFiles = new File(folderName).listFiles();
			String fileName = null;

			for (int i = 0; i < listFiles.length; i++) {

				if (listFiles[i].isFile()) {
					fileName = listFiles[i].getName();
					if (fileName.startsWith(filNameStartsWith) && fileName.endsWith(fileNameEndsWith)) {
						Files.deleteIfExists(Paths.get(folderName + fileName));
						Thread.sleep(2000);
					}

				}

			}

		} catch (NoSuchFileException e) {
			getStackTrace(e, "No such file/directory exists");
		} catch (DirectoryNotEmptyException e) {
			getStackTrace(e, "Directory is not empty.");
		} catch (IOException e) {
			getStackTrace(e, "Invalid permissions.");
		}

		logger.info("Deletion successful.");
	}

	public String strfileName;

	public String getFileToBeRead() {
		return strfileName;
	}

	public void setFileNameToBeRead(String fileName) {
		strfileName = fileName;
	}

	/**
	 * This method is to get file Name of which content is to be verified
	 * 
	 * @return
	 * @throws AcisException
	 * @author Shreyas.Khandekar
	 */

	public void getFileNameToVerifyContent(String filNameStartsWith, String fileNameEndsWith)
			throws InterruptedException, NoSuchFileException, DirectoryNotEmptyException, IOException {
		String folderName = Constants.DOWNLOAD_PATH;
		File[] listFiles = new File(folderName).listFiles();
		String fileName = null;

		for (int i = 0; i < listFiles.length; i++) {

			if (listFiles[i].isFile()) {
				fileName = listFiles[i].getName();
				if (fileName.startsWith(filNameStartsWith) && fileName.endsWith(fileNameEndsWith)) {
					setFileNameToBeRead(folderName + fileName);
					Thread.sleep(2000);
				}
			}
		}
		logger.info("File name is copied to get opened" + getFileToBeRead());

	}

	/**
	 * This method is to read CSV file
	 * 
	 * @return
	 * @throws AcisException
	 * @author Shreyas.Khandekar
	 */
	public List<List<String>> csvReader(String csvFilename) throws IOException {

		String[] row = null;

		CSVReader csvReader = new CSVReader(new FileReader(csvFilename));
		List content = csvReader.readAll();
		List<List<String>> listRows = new ArrayList<>();

		for (Object object : content) {

			row = (String[]) object;

			listRows.add(Arrays.asList(row));

		}
		// ...
		csvReader.close();
		return listRows;

	}

	/**
	 * This method is to get column data value from file
	 * 
	 * @return
	 * @throws AcisException
	 * @author Shreyas.Khandekar
	 */

	public String getColumnData(int row, int column, String strfileName) throws IOException {
		String data = null;
		List<List<String>> dataList = csvReader(strfileName);
		List<String> rowData = dataList.get(row);
		data = rowData.get(column).trim();
		return data;

	}

	/**
	 * This method is to create and return dynamic WebElement locator
	 * 
	 * @throws AcisException
	 * 
	 * @author Shreyas.Khandekar
	 */

	public By getDynamicWebElementLocator(String strXPath, String strReplaceText) {
		By dynamicWebElementLocator = By.xpath(strXPath.replace("ABC", strReplaceText));
		return dynamicWebElementLocator;
	}

	// Org Creation ,search & click Methods for Test cases start
	/**
	 * This method is to hover on Organization Menu
	 * 
	 * @throws AcisException
	 * @author Shreyas.Khandekar
	 */

	public void hoverOnOrganizationsMenu() throws AcisException {
		waitForPageLoad();
		switchToDefaultContent();
		waitForElement(menuOrganizations);
		hoverOverElement(menuOrganizations);
		logger.info("Mouse hovered on organization Menu");

		testLoggerInfo("Mouse hovered on organization Menu ");

	}

	/**
	 * This method is to hover on Applications menu
	 * 
	 * @throws AcisException
	 * @author Shreyas.Khandekar
	 * @throws InterruptedException
	 */
	public void hoverOnApplicationsMenu() throws AcisException, InterruptedException {
		waitForPageLoad();
		switchToDefaultContent();
		waitForElement(menuApplications);
		hoverOverElement(menuApplications);
		Thread.sleep(1000);
		logger.info("Mouse hover on Applications menu");
		testLoggerInfo("Mouse hover on Applications menu");

	}

	/**
	 * This method is to mouse over on Users menu
	 * 
	 * @return
	 * @throws AcisException
	 * @author Shreyas.Khandekar
	 * @throws InterruptedException
	 */
	public void hoverOnUsersMenu() throws AcisException, InterruptedException {
		waitForPageLoad();
		switchToDefaultContent();
		waitForElement(menuUsers);
		hoverOverElement(menuUsers);
		Thread.sleep(3000);
		logger.info("Mouse hover on Users menu");

		testLoggerInfo("Mouse hover on Users menu");

	}

	/**
	 * This method is to mouse over on Reports menu
	 * 
	 * @return
	 * @throws AcisException
	 * @author Shreyas.Khandekar
	 * @throws InterruptedException
	 */
	public void hoverOnReportsMenu() throws AcisException, InterruptedException {
		waitForPageLoad();
		switchToDefaultContent();
		waitForElement(menuReports);
		hoverOverElement(menuReports);
		Thread.sleep(1000);
		logger.info("Mouse hover on Reports menu");

		testLoggerInfo("Mouse hover on Reports menu");

	}

	/**
	 * This method is to mouse over on Logs menu
	 * 
	 * @return
	 * @throws AcisException
	 * @author Shreyas.Khandekar
	 * @throws InterruptedException
	 */
	public void hoverOnLogsMenu() throws AcisException, InterruptedException {
		waitForPageLoad();
		switchToDefaultContent();
		waitForElement(menuLogs);
		hoverOverElement(menuLogs);
		Thread.sleep(1000);
		logger.info("Mouse hover on Logs menu");

		testLoggerInfo("Mouse hover on Logs menu");

	}

	/**
	 * This method is to mouse over on Courses menu
	 * 
	 * @return
	 * @throws AcisException
	 * @author Shreyas.Khandekar
	 * @throws InterruptedException
	 */
	public void hoverOnCoursesMenu() throws AcisException, InterruptedException {
		waitForPageLoad();
		switchToDefaultContent();
		waitForElement(menuCourses);
		hoverOverElement(menuCourses);
		Thread.sleep(1000);
		logger.info("Mouse hover on Courses menu");

		testLoggerInfo("Mouse hover on Courses menu");

	}

	/***
     * This method is used to verify text of a element present
     * @author akash.a.gaurav
     * @param element
     * @param expectedText
     * @return
     */
    public static synchronized boolean verifyTextEquals( WebElement element,String expectedText) {
        boolean flag = false;
        try {
            String actualText=element.getText().trim();
            if(actualText.equals(expectedText)) {
                logger.info("actualText is :"+actualText+" expected text is: "+expectedText);
                return flag=true;
            }
            else {
                
                logger.info("actualText is :"+actualText+" expected text is: "+expectedText);
                return flag;
            }
        }
        catch(Exception ex) {
            
        	logger.error("actualText is :"+element.getText()+" expected text is: "+expectedText);
			logger.info("text not matching" + ex);
			return flag;
            
          
        }
    }
	

    
    /***
     * Verifying element is present or not
     * @param element
     * @return
     * @author akash.a.gaurav
     */
    public static synchronized boolean verifyElementNotPresent( WebElement element) {
        boolean isDispalyed = false;
        try {
             element.isDisplayed();
             logger.info(element.getText()+" is dispalyed");
        }
        catch(Exception ex) {
            logger.error("Element not found " + ex);
            isDispalyed = true;
        }
       
        return isDispalyed;
    }

    
	/**
	 * This method is to mouse over on Settings menu
	 * 
	 * @return
	 * @throws AcisException
	 * @author Shreyas.Khandekar
	 * @throws InterruptedException
	 */
	public void hoverOnSettingsMenu() throws AcisException, InterruptedException {
		waitForPageLoad();
		switchToDefaultContent();
		waitForElement(menuSettings);
		hoverOverElement(menuSettings);
		Thread.sleep(1000);
		logger.info("Mouse hover on Settings menu");
		testLoggerInfo("Mouse hover on Settings menu");
	}

	public static final BiPredicate<List<String>, List<String>> isHasSameOrder = (one, two) -> {
		Iterator<String> it1 = one.iterator();
		Iterator<String> it2 = two.iterator();

		nextWord: while (it1.hasNext()) {
			String word = it1.next();

			while (it2.hasNext())
				if (word.equals(it2.next()))
					continue nextWord;

			return false;
		}

		return true;
	};

	protected static void sortDatesInAscendingOrder(List<String> datesListStringFormat) {
		Collections.sort(datesListStringFormat, new Comparator<String>() {
			DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");

			@Override
			public int compare(String DATE_1, String DATE_2) {
				try {
					return dateFormat.parse(DATE_1).compareTo(dateFormat.parse(DATE_2));
				} catch (ParseException e) {
					throw new IllegalArgumentException(e);
				}

			}

		});
	}
	/***
	 * This method is used to upload file using robot
	 * @param pathFile
	 * @throws InterruptedException
	 * @throws AWTException
	 * @author akash.a.gaurav
	 */
	public static void uploadFileUsingRobot(String pathFile) throws InterruptedException, AWTException {
		
		Robot robo= new Robot();
		Thread.sleep(4000);
		StringSelection path=new StringSelection(pathFile);
		
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(path, null);
		robo.keyPress(KeyEvent.VK_CONTROL);
		robo.keyPress(KeyEvent.VK_V);
		robo.keyRelease(KeyEvent.VK_CONTROL);
		robo.keyRelease(KeyEvent.VK_V);
		robo.keyPress(KeyEvent.VK_ENTER);
		robo.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(10000);
		robo.keyPress(KeyEvent.VK_ESCAPE);
		robo.keyRelease(KeyEvent.VK_ESCAPE);
	}
	/***
	 * This method is used to give dynamic wait for element
	 * @param element
	 * @param timeOutInSeconds
	 * @author akash.a.gaurav
	 */
	public static void waitForElementNew(WebElement element,long timeOutInSeconds){
		logger.info("waiting for element visibilityOf..");
		WebDriverWait wait = new WebDriverWait(driver, timeOutInSeconds);
		wait.until(ExpectedConditions.visibilityOf(element));

	}
	
	/***
	 * 
	 *Dynamic Wait for Element clickable 
	 * @author akash.a.gaurav
	 */
	public WebElement waitForElement(WebDriver driver,long time,WebElement element){
		WebDriverWait wait = new WebDriverWait(driver, time);
		return wait.until(ExpectedConditions.elementToBeClickable(element));
	}
	
	/***
	 * Scroll using pixel in javascript executor
	 */
	
	public void scrollUsingPixel(int i) {
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,i)");
	}
	
	/**
	 * Update data in excel
	 * 
	 * Excel all index start from 0 ,so provide row number, cell number accordingly
	 * @author mrunal.s.tilekar
	 */
	 public void writeIntoExcel(String pathName,String sheetName ,int rowNumber ,String attributeName, int attributeNameColNumber ,String attributeValue , int attributeValueColNumber ) throws IOException {
		 System.out.println("ADD");
		 String path = pathName;
		 Row row = null;
		 FileInputStream fs = new FileInputStream(path);
		 Workbook wb = new XSSFWorkbook(fs);
		 Sheet sh= wb.getSheet(sheetName);
         row = sh.getRow(rowNumber);
         if(row==null)
             row = sh.createRow(rowNumber);

         Cell cell = row.getCell(attributeNameColNumber);
         if(cell == null)
             cell = row.createCell(attributeNameColNumber);
         cell.setCellValue(attributeName);
	
         cell = row.getCell(attributeValueColNumber);
         if(cell == null)
             cell = row.createCell(attributeValueColNumber);
         cell.setCellValue(attributeValue);
	
         FileOutputStream fos = new FileOutputStream(path);
		 wb.write(fos);
		 fos.close();
		 testLoggerInfo("Data updated into excel successfully");
		 
		 
	 }
	 
	 public void switchToWindowIndex(int index) {
		    Set<String> windows = driver.getWindowHandles();
		    int totalWin= windows.size();
		    String winTitle = null;
		    for(int i=0;i<totalWin;i++) {
		        if(i==index) {
		        winTitle = windows.toArray()[i].toString();
		    }
		    }
		    driver.switchTo().window(winTitle);
		    System.out.println(winTitle);
		}
	
}
