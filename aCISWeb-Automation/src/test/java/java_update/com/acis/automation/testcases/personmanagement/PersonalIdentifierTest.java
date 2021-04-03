package com.acis.automation.testcases.personmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PersonalIdentifierTest extends TestBase{
	final static Logger logger = LoggerFactory.getLogger(PersonalIdentifierTest.class);

	public PersonalIdentifierTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(description = "US-067:Person Management - Related Personal Identifiers using Intake User", groups = { "Simple", "ACIS_Regression", "Dharmesh" })
	  public void personalIdentifierNonSSNIntake() throws AcisException {
		 try {
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
			    homePage_SFDCPage.selectAllAccount();
			    homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameTwo"));
			    personsInformationPage.clickRelatedTab();
				relatedPersonTabPage.clickPersonIdentifierTab();
				personalIdentifierPage.clickNewButton();
				personalIdentifierPage.selectPersonalIdentifierType("Non-SSN");
				personalIdentifierPage.clickNextButton();
				personalIdentifierPage.verifyIdentiferTypeNonSSN();
				personalIdentifierPage.enterIdentifierNumberNonSSN(testData.get(Constants.PERSONALIDENTIFIERPAGE).get("nonSSNNumber"));
				personalIdentifierPage.setDate("Issued");
				personalIdentifierPage.setDate("Expiry");
				personalIdentifierPage.clickSaveButton();
				personalIdentifierPage.verifyNonSSNRecord();
	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-067:Person Management - Related Personal Identifiers using Intake User");
	        }
		
	}
	
	@Test(description = "US-067:Person Management - Related Personal Identifiers using Supervisor User", groups = { "Simple", "ACIS_Regression", "Dharmesh" })
	  public void personalIdentifierNonSSNSupervisor() throws AcisException {
		 try {
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
			    homePage_SFDCPage.selectAllAccount();
			    homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameTwo"));
			    personsInformationPage.clickRelatedTab();
				relatedPersonTabPage.clickPersonIdentifierTab();
				personalIdentifierPage.clickNewButton();
				personalIdentifierPage.selectPersonalIdentifierType("Non-SSN");
				personalIdentifierPage.clickNextButton();
				personalIdentifierPage.verifyIdentiferTypeNonSSN();
				personalIdentifierPage.enterIdentifierNumberNonSSN(testData.get(Constants.PERSONALIDENTIFIERPAGE).get("nonSSNNumber"));
				personalIdentifierPage.setDate("Issued");
				personalIdentifierPage.setDate("Expiry");
				personalIdentifierPage.clickSaveButton();
				personalIdentifierPage.verifyNonSSNRecord();
	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-067:Person Management - Related Personal Identifiers using Supervisor User");
	        }
		
	}
	
	@Test(description = "US-067:Person Management - Related Personal Identifiers using Investigator User", groups = { "Simple", "ACIS_Regression", "Dharmesh" })
	  public void personalIdentifierNonSSNInvestigator() throws AcisException {
		 try {
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
			    homePage_SFDCPage.selectAllAccount();
			    homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameTwo"));
			    personsInformationPage.clickRelatedTab();
				relatedPersonTabPage.clickPersonIdentifierTab();
				personalIdentifierPage.clickNewButton();
				personalIdentifierPage.selectPersonalIdentifierType("Non-SSN");
				personalIdentifierPage.clickNextButton();
				personalIdentifierPage.verifyIdentiferTypeNonSSN();
				personalIdentifierPage.enterIdentifierNumberNonSSN(testData.get(Constants.PERSONALIDENTIFIERPAGE).get("nonSSNNumber"));
				personalIdentifierPage.setDate("Issued");
				personalIdentifierPage.setDate("Expiry");
				personalIdentifierPage.clickSaveButton();
				personalIdentifierPage.verifyNonSSNRecord();
	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-067:Person Management - Related Personal Identifiers using Investigator User");
	        }
		
	}
	
	@Test(description = "US-067:Person Management - Related Personal Identifiers using Admin User", groups = { "Simple", "ACIS_Regression", "Dharmesh" })
	  public void personalIdentifierNonSSNAdmin() throws AcisException {
		 try {
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
			    homePage_SFDCPage.selectAllAccount();
			    homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameTwo"));
			    personsInformationPage.clickRelatedTab();
				relatedPersonTabPage.clickPersonIdentifierTab();
				personalIdentifierPage.clickNewButton();
				personalIdentifierPage.selectPersonalIdentifierType("Non-SSN");
				personalIdentifierPage.clickNextButton();
				personalIdentifierPage.verifyIdentiferTypeNonSSN();
				personalIdentifierPage.enterIdentifierNumberNonSSN(testData.get(Constants.PERSONALIDENTIFIERPAGE).get("nonSSNNumber"));
				personalIdentifierPage.setDate("Issued");
				personalIdentifierPage.setDate("Expiry");
				personalIdentifierPage.clickSaveButton();
				personalIdentifierPage.verifyNonSSNRecord();
	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-067:Person Management - Related Personal Identifiers using Admin User");
	        }
		
	}
	
	@Test(description = "US-126:Person Management - SSN Personal Identifier using Intake User", groups = { "Simple", "ACIS_Regression", "Dharmesh" })
	  public void personalIdentifierSSNIntake() throws AcisException {
		 try {
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
			    homePage_SFDCPage.selectAllAccount();
			    homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameTwo"));
			    personsInformationPage.clickRelatedTab();
				relatedPersonTabPage.clickPersonIdentifierTab();
				personalIdentifierPage.clickNewButton();
				personalIdentifierPage.selectPersonalIdentifierType("SSN");
				personalIdentifierPage.clickNextButton();
				personalIdentifierPage.verifyIdentifierTypeSSN();
				personalIdentifierPage.enterSocialSecurityNumber("Wrong", testData.get(Constants.PERSONALIDENTIFIERPAGE).get("wrongSSNNumber"));
				personalIdentifierPage.enterSocialSecurityNumber("Right", testData.get(Constants.PERSONALIDENTIFIERPAGE).get("ssnNumber"));
				personalIdentifierPage.setDate("Issued");
				personalIdentifierPage.clickSaveButton();
				personalIdentifierPage.verifySSNRecord();

	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-126:Person Management - SSN Personal Identifier using Intake User");
	        }
		
		}
	
	@Test(description = "US-126:Person Management - SSN Personal Identifier using Supervisor User", groups = { "Simple", "ACIS_Regression", "Dharmesh" })
	  public void personalIdentifierSSNSupervisor() throws AcisException {
		 try {
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
			    homePage_SFDCPage.selectAllAccount();
			    homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameTwo"));
			    personsInformationPage.clickRelatedTab();
				relatedPersonTabPage.clickPersonIdentifierTab();
				personalIdentifierPage.clickNewButton();
				personalIdentifierPage.selectPersonalIdentifierType("SSN");
				personalIdentifierPage.clickNextButton();
				personalIdentifierPage.verifyIdentifierTypeSSN();
				personalIdentifierPage.enterSocialSecurityNumber("Wrong", testData.get(Constants.PERSONALIDENTIFIERPAGE).get("wrongSSNNumber"));
				personalIdentifierPage.enterSocialSecurityNumber("Right", testData.get(Constants.PERSONALIDENTIFIERPAGE).get("ssnNumber"));
				personalIdentifierPage.setDate("Issued");
				personalIdentifierPage.clickSaveButton();
				personalIdentifierPage.verifySSNRecord();
	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-126:Person Management - SSN Personal Identifier using Supervisor User");
	        }
		
		}
	
	@Test(description = "US-126:Person Management - SSN Personal Identifier using Investigator User", groups = { "Simple", "ACIS_Regression", "Dharmesh" })
	  public void personalIdentifierSSNInvestigator() throws AcisException {
		 try {
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
			    homePage_SFDCPage.selectAllAccount();
			    homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameTwo"));
			    personsInformationPage.clickRelatedTab();
				relatedPersonTabPage.clickPersonIdentifierTab();
				personalIdentifierPage.clickNewButton();
				personalIdentifierPage.selectPersonalIdentifierType("SSN");
				personalIdentifierPage.clickNextButton();
				personalIdentifierPage.verifyIdentifierTypeSSN();
				personalIdentifierPage.enterSocialSecurityNumber("Wrong", testData.get(Constants.PERSONALIDENTIFIERPAGE).get("wrongSSNNumber"));
				personalIdentifierPage.enterSocialSecurityNumber("Right", testData.get(Constants.PERSONALIDENTIFIERPAGE).get("ssnNumber"));
				personalIdentifierPage.setDate("Issued");
				personalIdentifierPage.clickSaveButton();
				personalIdentifierPage.verifySSNRecord();
	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-126:Person Management - SSN Personal Identifier using Investigator User");
	        }
		
		}
	
	@Test(description = "US-126:Person Management - SSN Personal Identifier using Admin User", groups = { "Simple", "ACIS_Regression", "Dharmesh" })
	  public void personalIdentifierSSNAdmin() throws AcisException {
		 try {
			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
			    homePage_SFDCPage.selectAllAccount();
			    homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameTwo"));
			    personsInformationPage.clickRelatedTab();
				relatedPersonTabPage.clickPersonIdentifierTab();
				personalIdentifierPage.clickNewButton();
				personalIdentifierPage.selectPersonalIdentifierType("SSN");
				personalIdentifierPage.clickNextButton();
				personalIdentifierPage.verifyIdentifierTypeSSN();
				personalIdentifierPage.enterSocialSecurityNumber("Wrong", testData.get(Constants.PERSONALIDENTIFIERPAGE).get("wrongSSNNumber"));
				personalIdentifierPage.enterSocialSecurityNumber("Right", testData.get(Constants.PERSONALIDENTIFIERPAGE).get("ssnNumber"));
				personalIdentifierPage.setDate("Issued");
				personalIdentifierPage.clickSaveButton();
				personalIdentifierPage.verifySSNRecord();
	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-126:Person Management - SSN Personal Identifier using Admin User");
	        }
		
		}
	
}
