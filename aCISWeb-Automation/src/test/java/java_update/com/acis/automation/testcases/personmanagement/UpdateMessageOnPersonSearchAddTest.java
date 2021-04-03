package com.acis.automation.testcases.personmanagement;

import java.awt.AWTException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class UpdateMessageOnPersonSearchAddTest extends TestBase  {

	public UpdateMessageOnPersonSearchAddTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(UploadDocumentsToPersonTest.class);
	
	 String firstName = excel.generateRandomTestData(excel.generateRandomTestData("", 3), 4);
	 String middleName = excel.generateRandomTestData(excel.generateRandomTestData("", 4), 3);
	 String lastName = excel.generateRandomTestData(excel.generateRandomTestData("", 3), 4);
	

	
	@Test(description = "US 884 : Update Message on Person Search/Add : Data Creation" , groups = { "High",
			"aCIS_Regression", "Mrunal" } , priority = 0)
	   public void updateMessageOnPersonSearchAddIntakeCreation() throws AcisException, InterruptedException, AWTException, IOException 
	
	{
		
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
		String allegation_ID;
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);

/*		createIntakePerson_OmniscriptPage
				.prvoideSuffix(testData.get(Constants.SearchAllegationInfo_SHEET).get("firstPersonSuffix"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.SearchAllegationInfo_SHEET).get("firstPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.SearchAllegationInfo_SHEET).get("firstPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.SearchAllegationInfo_SHEET).get("firstPersonFirstCity"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.SearchAllegationInfo_SHEET).get("firstPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.SearchAllegationInfo_SHEET).get("firstPersonFirstBirthYear"));
		createIntakePerson_OmniscriptPage
				.prvoideGender(testData.get(Constants.SearchAllegationInfo_SHEET).get("firstPersonFirstGender"));
*/		createIntakePerson_OmniscriptPage.clickSaveButton();

		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		
		// Options : newCase||existingCase
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
//		screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegation_ID = allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		
	}
	    
	
	@Test(description = "US 884 : Update Message on Person Search/Add : Data Creation" , groups = { "High",
			"aCIS_Regression", "Mrunal" },priority = 1)
	   public void updateMessageOnPersonSearchAddIntake() throws AcisException, InterruptedException, AWTException, IOException 
	
	{
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
		String allegation_ID;
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingMultipleValidData("firstlastName", firstName, lastName);
		searchPerson_OmniscriptPage.selectPerson(firstName, lastName, "AllegedVictim", "No");
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.selectPerson("first", "last", "AllegedVictim", "No");
		searchPerson_OmniscriptPage.searchPersonUsingMultipleValidData("firstlastName", firstName, lastName);
		searchPerson_OmniscriptPage.selectPerson(firstName, lastName, "AllegedVictim", "No");
		searchPerson_OmniscriptPage.verifyPersonAddMessage();
	}
}
