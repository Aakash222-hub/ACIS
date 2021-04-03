package com.acis.automation.testcases.personmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PersonHealthTest extends TestBase{

	public PersonHealthTest() throws AcisException{
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PersonHealthTest.class);
	@Test(description = "US-051:Person Management - Health Appointments-Previous Month using Intake User", groups = { "Simple", "ACIS_Regression", "Dharmesh" })
	  public void healthRecordPreviousMonth() throws AcisException {
		 try {
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
				homePage_SFDCPage.selectAllAccount();
				homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameThree"));
				personsInformationPage.clickHealthTab();
				personHealthAppointmentsPage.clickHealthAppointmentsTab();
				personHealthAppointmentsPage.clickNewButton();
				personHealthAppointmentsPage.enterText("Name", "demo");
				personHealthAppointmentsPage.enterText("Type", "demo");
				personHealthAppointmentsPage.enterText("Contact", "demo");
				personHealthAppointmentsPage.setDatePriorVerify();
				personHealthAppointmentsPage.setDatePrevious("Last");
				personHealthAppointmentsPage.setDatePrevious("Next");
				personHealthAppointmentsPage.clickSaveButton();
			    personHealthAppointmentsPage.verifyFields();
	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-051:Person Management - Health Appointments-Previous Month using Intake User");
	        }
		
	}
	
	@Test(description = "US-051:Person Management - Health Appointments-Future Month using Investigator User", groups = { "Simple", "ACIS_Regression", "Dharmesh" })
	  public void healthRecordFutureMonth() throws AcisException {
		 try {
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
				homePage_SFDCPage.selectAllAccount();
				homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameThree"));
				personsInformationPage.clickHealthTab();
				personHealthAppointmentsPage.clickHealthAppointmentsTab();
				personHealthAppointmentsPage.clickNewButton();
				personHealthAppointmentsPage.enterText("Name", "demo");
				personHealthAppointmentsPage.enterText("Type", "demo");
				personHealthAppointmentsPage.enterText("Contact", "demo");
				personHealthAppointmentsPage.setDatePriorVerify();
				personHealthAppointmentsPage.setDateNext("Last");
				personHealthAppointmentsPage.setDateNext("Next");
				personHealthAppointmentsPage.clickSaveButton();
			    personHealthAppointmentsPage.verifyFields();
	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-051:Person Management - Health Appointments-Future Month using Investigator User");
	        }
		
	}
	
	@Test(description = "US-051:Person Management - Health Appointments using Supervisor User", groups = { "Simple", "ACIS_Regression", "Dharmesh" })
	  public void healthRecordSupervisor() throws AcisException {
		 try {
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
				homePage_SFDCPage.selectAllAccount();
				homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameThree"));
				personsInformationPage.clickHealthTab();
				personHealthAppointmentsPage.clickHealthAppointmentsTab();
				personHealthAppointmentsPage.clickNewButton();
				personHealthAppointmentsPage.enterText("Name", "demo");
				personHealthAppointmentsPage.enterText("Type", "demo");
				personHealthAppointmentsPage.enterText("Contact", "demo");
				personHealthAppointmentsPage.setDateNext("Last");
				personHealthAppointmentsPage.setDateNext("Next");
				personHealthAppointmentsPage.clickSaveButton();
			    personHealthAppointmentsPage.verifyFields();
	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-051:Person Management - Health Appointments using Supervisor User");
	        }
		
	}
}
