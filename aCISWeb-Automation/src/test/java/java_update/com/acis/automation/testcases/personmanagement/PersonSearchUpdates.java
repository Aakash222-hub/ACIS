package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PersonSearchUpdates extends TestBase {

	public PersonSearchUpdates() throws AcisException{
		// TODO Auto-generated constructor stub
		super();
	}
	
	String firstName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 2);
	String middleName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 2);
	String lastName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 2);
	
	String email=excel.generateRandomOrgEmail("Demo", 2);

	// TODO Auto-generated method stub

	
	final static Logger logger = LoggerFactory.getLogger(PersonSearchUpdates.class);
	

	@Test(description = "US-0645 : Create Intake record", groups = { "High",
			"aCIS_Regression", "Varun" })
	public void createIntakeRecord() throws AcisException, InterruptedException, IOException{
	try {
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
		createIntakePerson_OmniscriptPage.setAllNames(firstName,middleName,lastName);
//		createIntakePerson_OmniscriptPage.provideContactInformation(phone,email);
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
//		createIntakePerson_OmniscriptPage
//				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
//		createIntakePerson_OmniscriptPage
//				.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));

		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(firstName,middleName,lastName);
//		createIntakePerson_OmniscriptPage.provideContactInformation(phone,email);
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
//		createIntakePerson_OmniscriptPage
//				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstBirthYear"));
//		createIntakePerson_OmniscriptPage
//				.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstGender"));

		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		
		createIntakePerson_OmniscriptPage.setAllNames(firstName,middleName,lastName);
//		createIntakePerson_OmniscriptPage.provideContactInformation(phone,email);
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
//		createIntakePerson_OmniscriptPage
//				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstBirthYear"));
//		createIntakePerson_OmniscriptPage
//				.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstGender"));

		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		
	} catch (Exception e) {
		// TODO Auto-generated catch block
		getStackTrace(e, "Failed US-040:Intake - Create Intake Record");
	}

}
	
	@Test(description = "US-0645 : Verify the Search Result", groups = { "High",
			"aCIS_Regression", "Varun" })
	public void submitNewAllegation() throws AcisException, InterruptedException, IOException{
	try {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
	    homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName","first");
		searchPerson_OmniscriptPage.SearchResult("fir");
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("lastName", "last");
		searchPerson_OmniscriptPage.lastnameSearchResult("las");
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.dateSearch("12-19-2010");
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("lastName", "last");
		searchPerson_OmniscriptPage.genderSearchResult("Male");
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("lastName", "last");
		searchPerson_OmniscriptPage.femalegenderSearchResult("Female");
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("lastName", "last");
		searchPerson_OmniscriptPage.searchByColumn("street1 street2 cityAB");
		searchPerson_OmniscriptPage.searchBymonthslastname("Unk");
	}
		
						 catch (Exception e) {
						// TODO Auto-generated catch block
						getStackTrace(e, "Failed US-040:Verify the Search Result");
					}
	}
}
