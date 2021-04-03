package com.acis.automation.testcases.intake;

import java.io.IOException;
import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class RemoveRelationshipFieldTest extends TestBase{

	public RemoveRelationshipFieldTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(RemoveRelationshipFieldTest.class);
	
	@Test(description = "US-0311: Remove Relationship Field from Intake Omniscript", groups = { "Simple",
			"aCIS_Regression", "Mrunal" })
	   public void verifyRemoveRelationshipFieldTest() throws AcisException, InterruptedException, ParseException, IOException {
	
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
		personsInvovled_OmniscriptPage.verifyRealtionshipNotPresent();
		createIntakePerson_OmniscriptPage.verifyspecificFieldPresent();
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickEditFirstRecordButton();
		personsInvovled_OmniscriptPage.verifyRealtionshipNotPresent();
		personsInvovled_OmniscriptPage.verifyspecificFieldPresent();
		personsInvovled_OmniscriptPage.clickSaveButton("first");
		homePage_SFDCPage.closeTabs();
		
		
	}
	
}
