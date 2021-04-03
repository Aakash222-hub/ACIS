package com.acis.automation.testcases.personmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PersonFutureBirthdateTest extends TestBase {

	public PersonFutureBirthdateTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PersonFutureBirthdateTest.class);
	
	@Test(description = "US-0125 : Person Management - Future Birthdate Age -Intake User", groups = { "Simple",
			"aCIS_Regression", "Mrunal" })
	   public void verifyFutureBirthdateIntake() throws AcisException, InterruptedException {
		 try {
			 System.out.println("in test : 125 ");
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		      home.verfiyHomePage();
		      homePage_SFDCPage.closeTabs();
		      homePage_SFDCPage.clickDownArrowAccount();
			  homePage_SFDCPage.selectAllAccount();
			  homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameThree"));
			  editPersonAccountPage.clickEditButton();
		      editPersonAccountPage.enterFutureBirthDate();
		      editPersonAccountPage.clickSaveButton();
		      personsInformationPage.clickDetailsTab();
		      editPersonAccountPage.verifyAgeValue();
	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-0125 : Person Management - Future Birthdate Age -Intake User");
	        }
	      
	      
	      
	      
	
	}
	
	@Test(description = "US-0125 : Person Management - Future Birthdate Age -Investigation User", groups = { "Simple",
			"aCIS_Regression", "Mrunal" })
	   public void verifyFutureBirthdateInvestigation() throws AcisException, InterruptedException {
		 try {
			 System.out.println("in test : 125 ");
		      
		      userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
		      home.verfiyHomePage();
		      homePage_SFDCPage.closeTabs();
		      homePage_SFDCPage.clickDownArrowAccount();
			  homePage_SFDCPage.selectAllAccount();
			  homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameThree"));
			  editPersonAccountPage.clickEditButton();
		      editPersonAccountPage.enterFutureBirthDate();
		      editPersonAccountPage.clickSaveButton();
		      personsInformationPage.clickDetailsTab();
		      editPersonAccountPage.verifyAgeValue();
	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-0125 : Person Management - Future Birthdate Age -Investigation User");
	        }
	         
	
	}
	
	
	@Test(description = "US-0125 : Person Management - Future Birthdate Age -Supervisor User", groups = { "Simple",
			"aCIS_Regression", "Mrunal" })
	   public void verifyFutureBirthdateSupervisor() throws AcisException, InterruptedException {
		 try {
			 System.out.println("in test : 125 Supervisor");
		      
		      userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		      home.verfiyHomePage();
		      homePage_SFDCPage.closeTabs();
		      homePage_SFDCPage.clickDownArrowAccount();
			  homePage_SFDCPage.selectAllAccount();
			  homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameThree"));
			  editPersonAccountPage.clickEditButton();
		      editPersonAccountPage.enterFutureBirthDate();
		      editPersonAccountPage.clickSaveButton();
		      personsInformationPage.clickDetailsTab();
		      editPersonAccountPage.verifyAgeValue();
		      homePage_SFDCPage.closeTabs();

	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-0125 : Person Management - Future Birthdate Age -Supervisor User");
	        }
	      
	
	}
}
