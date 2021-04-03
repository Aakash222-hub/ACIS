package com.acis.automation.testcases.intake;

import java.io.IOException;
import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.LoginTest;
import com.acis.automation.utilities.AcisException;

public class IntakePersonBirthdateTest extends TestBase{

	public IntakePersonBirthdateTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	final static Logger logger = LoggerFactory.getLogger(IntakePersonBirthdateTest.class);
	
	
	@Test(description = "US-0060 : Capture Intake Person's Birthdate", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	   public void captureIntakeBirthdate() throws AcisException, InterruptedException, ParseException, IOException {
			 System.out.println("in test case 60");
			 String firstName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 4);
			 String middleName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
			 String lastName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 4);

			 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
												testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		      home.verfiyHomePage();
		      homePage_SFDCPage.closeTabs();
		      homePage_SFDCPage.clickDownArrowAllegation();
			  homePage_SFDCPage.selectAllAllegation();
			  homePage_SFDCPage.clickNewButton();   
		      
		      reportDetailsOmniscriptPage.clickNextBtn();
		      searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		      searchPerson_OmniscriptPage.linkToCreateNewPerson();
		      createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		      createIntakePerson_OmniscriptPage.provideBirthdate(testData.get(Constants.PersonInvolvedIntake_SHEET).get("birthYear"));
		      createIntakePerson_OmniscriptPage.clickSaveButton();
		      createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		      personsInvovled_OmniscriptPage.clickRefresPersonButton();
		      personsInvovled_OmniscriptPage.clickEditFirstRecordButton();
		      personsInvovled_OmniscriptPage.calculateAge();
		      personsInvovled_OmniscriptPage.clickCancelButton();
		      personsInvovled_OmniscriptPage.verifyAge(); 
		      homePage_SFDCPage.closeTabs();
	      
	   }
	
	/*######################################### INVALID ##########################################*/
	@Test(enabled = false,description = "US-0060 : Capture Intake Person's Birthdate", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	   public void captureIntakeBirthdateAge() throws AcisException, InterruptedException, ParseException, IOException {
			 System.out.println("in test case 60");

			 String firstName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 4);
			 String middleName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
			 String lastName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 4);


		      userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
												testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		      home.verfiyHomePage();
		      homePage_SFDCPage.closeTabs();
		      homePage_SFDCPage.clickDownArrowAllegation();
			  homePage_SFDCPage.selectAllAllegation();
			  homePage_SFDCPage.clickNewButton();   
			  /*Enter and verify age 0*/
		      reportDetailsOmniscriptPage.clickNextBtn();
		      searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		      searchPerson_OmniscriptPage.linkToCreateNewPerson();
		      createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		      createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("age",String.valueOf('0'));
		      createIntakePerson_OmniscriptPage.clickSaveButton();
		      createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		      personsInvovled_OmniscriptPage.clickRefresPersonButton();
		      createIntakePerson_OmniscriptPage.verifyAge(); 
		    		       
	      
	}
	
	
	/*###############################################INVALID ##################################################*/
	@Test(enabled = false,description = "US-0060 : Capture Intake Person's Birthdate", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	   public void captureIntakeFutureBirthdate() throws AcisException, InterruptedException, ParseException, IOException {
			 System.out.println("in test case 60");

			 System.out.println("in test case 60");
			 String firstName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 4);
			 String middleName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
			 String lastName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 4);


		      userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
												testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		      home.verfiyHomePage();
		      homePage_SFDCPage.closeTabs();
		      homePage_SFDCPage.clickDownArrowAllegation();
			  homePage_SFDCPage.selectAllAllegation();
			  homePage_SFDCPage.clickNewButton();   
			  /*Enter future birthday and verify age 0*/
		      reportDetailsOmniscriptPage.clickNextBtn();
		      searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		      searchPerson_OmniscriptPage.linkToCreateNewPerson();
		      createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		      createIntakePerson_OmniscriptPage.provideFutureBirthDate(testData.get(Constants.PersonInvolvedIntake_SHEET).get("futureBirthYear"));
		      createIntakePerson_OmniscriptPage.clickSaveButton();
		      createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		      personsInvovled_OmniscriptPage.clickRefresPersonButton();
		      createIntakePerson_OmniscriptPage.verifyAge(); 
		      homePage_SFDCPage.closeTabs();
	      
	}
	
}
