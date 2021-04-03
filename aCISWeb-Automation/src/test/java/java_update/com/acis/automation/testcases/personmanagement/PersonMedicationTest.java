package com.acis.automation.testcases.personmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.personaccount.PersonMedicationPage;
import com.acis.automation.utilities.AcisException;

public class PersonMedicationTest extends TestBase{

	public PersonMedicationTest() throws AcisException {
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(PersonMedicationTest.class);
	@Test(description = "US-065:Person Management - Medication List using Intake User", groups = { "Simple", "ACIS_Regression", "Dharmesh" })
	  public void medicationRecordIntake() throws AcisException, InterruptedException {
		 try {
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
			    homePage_SFDCPage.selectAllAccount();
			    homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameOne"));
			    personsInformationPage.clickHealthTab();
				personMedicationPage.clickMedicationTab();
				personMedicationPage.clickNewButton();
				//Options : Name||Diagnosis||Dose||Other_Frequency
				personMedicationPage.enterText("Name", "Medical Test");
				personMedicationPage.enterText("Diagnosis", "Diagnosis Test");
				personEducationPage.setDate("Start");
				personEducationPage.setDate("End");
				personMedicationPage.enterText("Dose", "Dose Test");
				personMedicationPage.verifyFrequencyType();
				personMedicationPage.enterText("Other_Frequency", "Other Frequency Test");
				personMedicationPage.clickSaveButton();
				personMedicationPage.verifyFields();
			    
	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "US-065:Person Management - Medication List using Intake User");
	        }
	
		 
	}

	@Test(description = "US-065:Person Management - Medication List using Investigator", groups = { "Simple", "ACIS_Regression", "Dharmesh" })
	  public void medicationRecordInvestigator() throws AcisException, InterruptedException {
		 try {
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			 home.verfiyHomePage();
			 homePage_SFDCPage.closeTabs();
			 homePage_SFDCPage.clickDownArrowAccount();
		     homePage_SFDCPage.selectAllAccount();
		     homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameOne"));
		     personsInformationPage.clickHealthTab();
			 personMedicationPage.clickMedicationTab();
			 personMedicationPage.clickNewButton();
			 //Options : Name||Diagnosis||Dose||Other_Frequency
			 personMedicationPage.enterText("Name", "Medical Test");
			 personMedicationPage.enterText("Diagnosis", "Diagnosis Test");
			 personEducationPage.setDate("Start");
			 personEducationPage.setDate("End");
			 personMedicationPage.enterText("Dose", "Dose Test");
			 personMedicationPage.verifyFrequencyType();
			 personMedicationPage.enterText("Other_Frequency", "Other Frequency Test");
			 personMedicationPage.clickSaveButton();
			 personMedicationPage.verifyFields();
			    
	      	} catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-065:Person Management - Medication List using Investigator");
	        }
	}
	
	
	@Test(description = "US-065:Person Management - Medication List using Supervisor", groups = { "Simple", "ACIS_Regression", "Dharmesh" })
	 public void medicationRecordSupervisor() throws AcisException, InterruptedException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
								testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
		    homePage_SFDCPage.selectAllAccount();
		    homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameOne"));
		    personsInformationPage.clickHealthTab();
			personMedicationPage.clickMedicationTab();
			personMedicationPage.clickNewButton();
			//Options : Name||Diagnosis||Dose||Other_Frequency
			personMedicationPage.enterText("Name", "Medical Test");
			personMedicationPage.enterText("Diagnosis", "Diagnosis Test");
			personEducationPage.setDate("Start");
			personEducationPage.setDate("End");
			personMedicationPage.enterText("Dose", "Dose Test");
			personMedicationPage.verifyFrequencyType();
			personMedicationPage.enterText("Other_Frequency", "Other Frequency Test");
			personMedicationPage.clickSaveButton();
			personMedicationPage.verifyFields();
			   
			} catch (Exception e) {
			   // TODO Auto-generated catch block
			   getStackTrace(e, "Failed US-065:Person Management - Medication List using Supervisor");
			 }
	}				
}
