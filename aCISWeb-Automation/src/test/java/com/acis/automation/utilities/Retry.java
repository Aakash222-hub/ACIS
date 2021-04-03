package com.acis.automation.utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

import com.acis.automation.library.TestBase;
import com.aventstack.extentreports.Status;

/**
 * This class is for the custom listener for the fail test
 *
 */
public class Retry extends TestBase implements IRetryAnalyzer {

	final static Logger logger = LoggerFactory.getLogger(Retry.class);

	public Retry() throws AcisException {
	}

	int retrycount = 0;
	int maxretyrcount = 1;

	/**
	 * This method is used to retry execution for failed the test case
	 * @param result
	 */
	@Override
	public boolean retry(ITestResult result) {
		if (retrycount < maxretyrcount) {
			testLogger().log(Status.INFO, "Retrying test " + result.getName() + " with status "
					+ getResultStatusName(result.getStatus()) + " for the " + (retrycount + 1) + " time(s).");
			logger.info("Retrying test " + result.getName() + " with status " + getResultStatusName(result.getStatus())
					+ " for the " + (retrycount + 1) + " time(s).");
			retrycount++;
			return true;
		}

		return false;
	}

	/**
	 * This method is used to get test result Status
	 * 
	 * @param status
	 */

	public String getResultStatusName(int status) {
		String resultName = null;
		if (status == 1)
			resultName = "SUCCESS";
		if (status == 2)
			resultName = "FAILURE";
		if (status == 3)
			resultName = "SKIP";
		return resultName;
	}
}
