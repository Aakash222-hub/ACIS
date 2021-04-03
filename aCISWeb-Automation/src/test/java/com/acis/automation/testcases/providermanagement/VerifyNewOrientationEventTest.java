package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class VerifyNewOrientationEventTest extends TestBase {

	public VerifyNewOrientationEventTest() throws AcisException{
		// TODO Auto-generated constructor stub
	
	super();
	}
	
	final static Logger logger = LoggerFactory.getLogger(VerifyNewOrientationEventTest.class); 
	
	@Test(description = "US:0143 Provider Management - New Orientation Event page verification", groups = {
			"High", "acisRegression", "Varun" }, priority = 0)
	public void CreateNewOrientation() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			newOrientationEventPage.selectEventsDropDown();
			newOrientationEventPage.clickonNewbtn();
			newOrientationEventPage.selectOrientationRadioButton();
//			newOrientationEventPage.verifyDefaultsate("IN");
			newOrientationEventPage.verifyMandatoryFields();
			newOrientationEventPage.verifyValidZipcode("Toms Dr", "Bloomington", "6170");
			
		}
		catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:US:0143 Provider Management - New Orientation Event page verification");
		}
		
	}
	   @Test(description = "US:0143 Provider Management - New Orientation Event page - phone & Email verification", groups = {
			"High", "acisRegression", "Varun" }, priority = 1)
		public void NewOrientationpagevalidation() throws AcisException, InterruptedException, IOException {
			try {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				newOrientationEventPage.selectEventsDropDown();
				newOrientationEventPage.clickonNewbtn();
				newOrientationEventPage.selectOrientationRadioButton();
				newOrientationEventPage.verifyvalidphoneNumber("TomDR", "Bloomington", "61701", "309");
				newOrientationEventPage.verifyValidEmail("TomDR", "Bloomington", "61701", "3095324686", "notvaildemail");
				newOrientationEventPage.titleVerification("TomDR", "Bloomington", "61701");
			}
			catch (Exception e) {
				// TODO Auto-generated catch block
				getStackTrace(e,
						"Failed US:US:0143 Provider Management - New Orientation Event page - phone & Email verification");
			}
		
		
		
		
		
		}

}
