package com.acis.automation.testcases.personmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PersonEducationTest extends TestBase{
	final static Logger logger = LoggerFactory.getLogger(PersonEducationTest.class);

	public PersonEducationTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(description = "US-063:Person Management - Add Education Information to a Person record", groups = { "Simple", "ACIS_Regression", "Dharmesh" })
	  public void educationRecord() throws AcisException, InterruptedException {
		 try {
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
			    homePage_SFDCPage.selectAllAccount();
			    homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameTwo"));
			    personsInformationPage.clickEducationTab();
			    personEducationPage.clickEducation();
				personEducationPage.verifyEducationRelated();
				personEducationPage.clickNewButton();
				personEducationPage.verifyEducationType();
				personEducationPage.clickNewSchool();
				personEducationPage.enterSchoolText("Name", testData.get(Constants.EDUCATIONPAGE).get("schoolName"));
				personEducationPage.setActive();
				personEducationPage.enterSchoolText("Address1", testData.get(Constants.EDUCATIONPAGE).get("address1"));
				personEducationPage.enterSchoolText("Address2", testData.get(Constants.EDUCATIONPAGE).get("address2"));
				personEducationPage.enterSchoolText("City", testData.get(Constants.EDUCATIONPAGE).get("city"));
				personEducationPage.enterSchoolText("State", testData.get(Constants.EDUCATIONPAGE).get("state"));
				personEducationPage.enterSchoolText("Zip", testData.get(Constants.EDUCATIONPAGE).get("zip"));
				personEducationPage.clickSaveButton("School");
				personEducationPage.selectGrade();
				personEducationPage.enterRateOfAttendance(testData.get(Constants.EDUCATIONPAGE).get("rateOfAttendance"));
				personEducationPage.setDate("Start");
				personEducationPage.setDate("End");
				personEducationPage.verifyIEP();
				personEducationPage.clickSaveButton("Education");
				personEducationPage.verifySchoolName(testData.get(Constants.EDUCATIONPAGE).get("schoolName"));
	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-063:Person Management - Add Education Information to a Person record");
	        }
		
	}
}
