package com.acis.automation.testcases.intake;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ListViewAllegationTest extends TestBase {

	public ListViewAllegationTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
/***
 * This class contains Test Script related to intake creation
 */
	final static Logger logger = LoggerFactory.getLogger(ListViewAllegationTest.class);

	@Test(description = "US-0062 List View AllegationTest ", groups = { "High", "acisRegression", "Akash" },priority=-2)
	
	
	public void verifyListViewAllegationIntakeLogiin() throws AcisException, InterruptedException {
		
		 try {
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				allAllegationPage.verifyAllegationReportID();

	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-0062 List View AllegationTest");
	        }
		
		
		
	}
	

	@Test(description = "US-0062 List View AllegationTest ", groups = { "High", "acisRegression", "Akash" },priority=-2)
	
	
	public void verifyListViewAllegationInvestigationLogiin() throws AcisException, InterruptedException {
		
		 try {
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				allAllegationPage.verifyAllegationReportID();

	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-0062 List View AllegationTest");
	        }
		
		
		
	}
	

	@Test(description = "US-0062 List View AllegationTest ", groups = { "High", "acisRegression", "Akash" })
	
	
	public void verifyListViewAllegationAdminLogiin() throws AcisException, InterruptedException {
		
		 try {
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				allAllegationPage.verifyAllegationReportID();

	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-0062 List View AllegationTest");
	        }
		
		
		
	}
	

	@Test(description = "US-0062 List View AllegationTest ", groups = { "High", "acisRegression", "Akash" })
	
	
	public void verifyListViewAllegationSupervisorLogiin() throws AcisException, InterruptedException {
		
		 try {
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				allAllegationPage.verifyAllegationReportID();

	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-0062 List View AllegationTest");
	        }
		
		
		
	}
}
