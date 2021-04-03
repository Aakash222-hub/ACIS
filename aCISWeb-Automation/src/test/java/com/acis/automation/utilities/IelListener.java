package com.acis.automation.utilities;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.acis.automation.library.PageBase;
import com.acis.automation.library.TestBase;
import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import io.restassured.filter.log.LogDetail;

/**
 * This class is used to create custom listener which implements ITestlistner
 * 
 * @author Suraiya.Mulani
 *
 */
public class IelListener extends TestBase implements ITestListener {

	final static Logger logger = LoggerFactory.getLogger(IelListener.class);
	PageBase page = new PageBase();

	/**
	 * default constructor to initiate Base class constructor
	 * 
	 * @throws AcisException
	 */
	public IelListener() throws AcisException {

		// super();
	}

	/**
	 * This belongs to ITestListener and will execute before starting of Test set
	 */
	public void onStart(ITestContext arg0) {

		logger.info("About to begin executing Test " + arg0.getName());

	}

	/**
	 * This belongs to ITestListener and will execute, once the Test set/batch is
	 * finished
	 */
	public void onFinish(ITestContext arg0) {
		logger.info("Completed executing test " + arg0.getName());

	}

	/**
	 * This belongs to ITestListener and will execute only when the test is pass
	 * 
	 */
	public void onTestSuccess(ITestResult arg0) {

		try {
			printTestResults(arg0);
			page.cleanUpAfterTestPassed(arg0);
		} catch (AcisException | IOException e) {
			try {
				getStackTrace(e, "Exception in passed test case execution");
			} catch (AcisException e1) {
				e1.printStackTrace();
			}
		}
	}

	/**
	 * This belongs to ITestListener and will execute only on the event of fail test
	 * 
	 */
	public void onTestFailure(ITestResult arg0) {

		try {
			printTestResults(arg0);
			if (suiteName.contains("iLMS_Learningpath")) {
				page.loginAfterTestFailedOrSkippedForLP(arg0);
			} else if (suiteName.contains("iLMS_OrgAdmin") || suiteName.contains("iLMS_Learner")) {
				if (!((arg0.getMethod().getTestClass().getName()).contains("OrgAdminLoginPageTest"))
						|| !((arg0.getMethod().getTestClass().getName()).contains("LearnerLoginPageTest")));
					//page.loginAfterTestFailedOrSkippedForAdmin(arg0); sk change
			} else if (suiteName.contains("iLMS_MasterSuperAdmin")) {
				if (!((arg0.getMethod().getTestClass().getName()).contains("MSALoginPageTest")))
					page.loginAfterTestFailedOrSkippedForMSA(arg0);
			}
		} catch (AcisException | Exception e) {
			try {
				getStackTrace(e, "Exception in failed test case execution");
			} catch (AcisException e1) {

				e1.printStackTrace();
			}
		}
	}

	/**
	 * This belongs to ITestListener and will execute before the main test
	 * start @Test
	 */
	public void onTestStart(ITestResult arg0) {

		logger.info("The execution of the main test starts now");
		try {
			if (((arg0.getMethod().getTestClass().getName()).contains("OrgAdminLoginPageTest"))
					|| ((arg0.getMethod().getTestClass().getName()).contains("ZoltarDashboardTest"))) {
				return;
			} else {
				home.verifyLogin();
			}
		} catch (AcisException e) {
			try {
				getStackTrace(e, "Exception in on Test Start");
			} catch (AcisException e1) {
				e1.printStackTrace();
			}
		}
	}

	/**
	 * This belongs to ITestListener and will execute only if any of the main
	 * test(@Test) get skipped
	 * 
	 */
	public void onTestSkipped(ITestResult arg0) {

		try {
			printTestResults(arg0);
			if (suiteName.contains("iLMS_Learningpath")) {
				page.loginAfterTestFailedOrSkippedForLP(arg0);
			} else if (suiteName.contains("iLMS_OrgAdmin") || suiteName.contains("iLMS_Learner")) {
				if (!((arg0.getMethod().getTestClass().getName()).contains("OrgAdminLoginPageTest"))
						|| !((arg0.getMethod().getTestClass().getName()).contains("LearnerLoginPageTest")));
					//page.loginAfterTestFailedOrSkippedForAdmin(arg0);sk change
			} else if (suiteName.contains("iLMS_MasterSuperAdmin")) {
				if (!((arg0.getMethod().getTestClass().getName()).contains("MSALoginPageTest")))
					page.loginAfterTestFailedOrSkippedForMSA(arg0);
			}
		} catch (AcisException | Exception e) {
			try {
				getStackTrace(e, "Exception in skipped test case execution");
			} catch (AcisException e1) {
				e1.printStackTrace();
			}
		}
	}

	/**
	 * This method is used by report generator class to log failed passed skipped
	 * test cases
	 * 
	 * @param result TestNg object which holds result of execution
	 * @throws AcisException when exception occurs in reading result
	 * @throws IOException
	 */
	private void printTestResults(ITestResult result) throws AcisException, IOException {

		String methodName = null;
		String logText = null;
		Markup m;

		logger.info("Test Method resides in " + result.getTestClass().getName());
		String strStatus = null;
		String strParams = null;

		if (result.getParameters().length != 0) {
			for (Object parameter : result.getParameters()) {
				strParams += parameter.toString() + ",";
			}
			logger.info("Test Method had the following parameters : " + strParams);
		}

		switch (result.getStatus()) {

		case ITestResult.SUCCESS:

			methodName = result.getMethod().getMethodName();
			logText = "<b>" + "Test Case:- " + methodName + " Passed" + "</b>";
			m = MarkupHelper.createLabel(logText, ExtentColor.GREEN);
			testCaseLogger.get().pass(m);
			logger.info("Test case Passed");

			break;

		case ITestResult.FAILURE:
			String failureLogg = "This Test case got Failed";
			String bugLink = "";
			strStatus = "Failed";
			testLogger().fail("Test Status " + strStatus + ": " + result.getThrowable());

			String excepionMessage = Arrays.toString(result.getThrowable().getStackTrace());
			m = MarkupHelper.createLabel(failureLogg, ExtentColor.RED);

			MediaEntityModelProvider mediaModel = MediaEntityBuilder
					.createScreenCaptureFromPath(CaptureScreen(result.getName())).build();
			testLogger().fail("<details>" + "<summary>" + "<b>" + "<font color=" + "red>"
					+ "Exception Occured:Click to see" + "</font>" + "</b >" + "</summary>"
					+ excepionMessage.replaceAll(",", "<br>") + "</details>" + " \n", mediaModel);

			testLogger().log(Status.FAIL, m);

			logger.info("Test case Failed" + excepionMessage);
			logger.info("Test Method result Failed : " + result.getThrowable());

			String testCaseID = result.getMethod().getDescription();

			for (String key : bugConfig.stringPropertyNames()) {

				if (testCaseID.contains(key)) {
					bugLink = bugConfig.getProperty(key);
					testLogger().fail("<font color=" + "red>" + "Application Bug : Click  " + "<a href=" + bugLink
							+ "> here </a>" + "  to see JIRA bug " + "</font>");

					testLogger().getModel()
							.setName(result.getMethod().getDescription()   
									+ "<a href=" + bugLink + ">" +  "<font color=" + "red>" +  "<span>"+ "&emsp;&emsp;&emsp;" +"BugID : #" +bugLink.substring(bugLink.lastIndexOf("/") + 1)
									+ "</span> </font></a>" + "</font>");

					break;
				}
			}

			break;

		case ITestResult.SKIP:
			methodName = result.getMethod().getMethodName();
			logText = "<b>" + "Test Case:- " + methodName + " Skipped" + "</b>";
			m = MarkupHelper.createLabel(logText, ExtentColor.ORANGE);
			testCaseLogger.get().skip(m);
			logger.info("Test case Skipped");

			break;

		}

	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
	}

}