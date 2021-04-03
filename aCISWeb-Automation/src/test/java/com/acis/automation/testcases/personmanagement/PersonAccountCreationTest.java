package com.acis.automation.testcases.personmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PersonAccountCreationTest extends TestBase {

	public PersonAccountCreationTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String firstPersonFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonAccountCreation_SHEET).get("firstPersonFirstName"), 3);
	String firstPersonMiddleName = excel.generateRandomTestData(
			testData.get(Constants.PersonAccountCreation_SHEET).get("firstPersonMiddleName"), 3);
	String firstPersonLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonAccountCreation_SHEET).get("firstPersonLastName"), 3);
	String secondPersonFirstName = excel.generateRandomTestData(
			testData.get(Constants.PersonAccountCreation_SHEET).get("secondPersonFirstName"), 3);
	String secondPersonMiddleName = excel.generateRandomTestData(
			testData.get(Constants.PersonAccountCreation_SHEET).get("secondPersonMiddleName"), 3);
	String secondPersonLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonAccountCreation_SHEET).get("secondPersonLastName"), 3);
	String thirdPersonFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonAccountCreation_SHEET).get("thirdPersonFirstName"), 3);
	String thirdPersonMiddleName = excel.generateRandomTestData(
			testData.get(Constants.PersonAccountCreation_SHEET).get("thirdPersonMiddleName"), 3);
	String thirdPersonLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonAccountCreation_SHEET).get("thirdPersonLastName"), 3);

	String fullNameOne = firstPersonFirstName + " " + firstPersonMiddleName + " " + firstPersonLastName;
	String fullNameTwo = secondPersonFirstName + " " + secondPersonMiddleName + " " + secondPersonLastName;
	String fullNameThree = thirdPersonFirstName + " " + thirdPersonMiddleName + " " + thirdPersonLastName;
	String firstPersonPhone = excel
			.generateRandomNumber(testData.get(Constants.PersonAccountCreation_SHEET).get("firstPersonPhone"), 4);
	String secondPersonPhone = excel
			.generateRandomNumber(testData.get(Constants.PersonAccountCreation_SHEET).get("secondPersonPhone"), 3);
	String thirdPersonPhone = excel
			.generateRandomNumber(testData.get(Constants.PersonAccountCreation_SHEET).get("thirdPersonPhone"), 3);
	String firstPersonEmail = excel
			.generateRandomTestData(testData.get(Constants.PersonAccountCreation_SHEET).get("firstPersonEmail"), 4);
	String secondPersonEmail = excel
			.generateRandomTestData(testData.get(Constants.PersonAccountCreation_SHEET).get("secondPersonEmail"), 3);
	String thirdPersonEmail = excel
			.generateRandomTestData(testData.get(Constants.PersonAccountCreation_SHEET).get("thirdPersonEmail"), 3);
	final static Logger logger = LoggerFactory.getLogger(PersonAccountCreationTest.class);

	@Test(description = "Person Account Creation Test", groups = { "High", "aCIS_Regression", "Mrunal" }, priority = 0)
	public void personAccountCreationTest() throws AcisException, Exception {
		System.out.println("in Person Account Creation Test");
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
		createIntakePerson_OmniscriptPage.setAllNames(firstPersonFirstName, firstPersonMiddleName, firstPersonLastName);
		createIntakePerson_OmniscriptPage
				.prvoideSuffix(testData.get(Constants.PersonAccountCreation_SHEET).get("firstPersonSuffix"));
		createIntakePerson_OmniscriptPage.provideContactInformation(firstPersonPhone, firstPersonEmail);
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonAccountCreation_SHEET).get("firstPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonAccountCreation_SHEET).get("firstPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonAccountCreation_SHEET).get("firstPersonFirstCity"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.PersonAccountCreation_SHEET).get("firstPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonAccountCreation_SHEET).get("firstPersonFirstBirthYear"));
		createIntakePerson_OmniscriptPage
				.prvoideGender(testData.get(Constants.PersonAccountCreation_SHEET).get("firstPersonFirstGender"));
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		/* Add 2nd Person */
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(secondPersonFirstName, secondPersonMiddleName,
				secondPersonLastName);
		createIntakePerson_OmniscriptPage
				.prvoideSuffix(testData.get(Constants.PersonAccountCreation_SHEET).get("secondPersonSuffix"));
		createIntakePerson_OmniscriptPage.provideContactInformation(secondPersonPhone, secondPersonEmail);
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonAccountCreation_SHEET).get("secondPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonAccountCreation_SHEET).get("secondPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonAccountCreation_SHEET).get("secondPersonFirstCity"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.PersonAccountCreation_SHEET).get("secondPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		/* Add 3rd Person */
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(thirdPersonFirstName, thirdPersonMiddleName, thirdPersonLastName);
		createIntakePerson_OmniscriptPage
				.prvoideSuffix(testData.get(Constants.PersonAccountCreation_SHEET).get("thirdPersonSuffix"));
		createIntakePerson_OmniscriptPage.provideContactInformation(thirdPersonPhone, thirdPersonEmail);
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonAccountCreation_SHEET).get("thirdPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonAccountCreation_SHEET).get("thirdPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonAccountCreation_SHEET).get("thirdPersonFirstCity"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.PersonAccountCreation_SHEET).get("thirdPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "");
		// Options : newCase||existingCase
		screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		screeningDecision_OmniscriptPage.verifyRequiredFields();
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		screeningDecision_OmniscriptPage.clickSubmitbtn();

		allegation_ID = allegationReportPage.getAllegationID();

		homePage_SFDCPage.writeIntoExcel(Constants.TESTDATA_CREATEDDATAFILE_PATH,
				Constants.PersonAccountDataToUse_SHEET, 1, "fullNameOne", 0, fullNameOne, 1);
		homePage_SFDCPage.writeIntoExcel(Constants.TESTDATA_CREATEDDATAFILE_PATH,
				Constants.PersonAccountDataToUse_SHEET, 2, "fullNameTwo", 0, fullNameTwo, 1);
		homePage_SFDCPage.writeIntoExcel(Constants.TESTDATA_CREATEDDATAFILE_PATH,
				Constants.PersonAccountDataToUse_SHEET, 3, "fullNameThree", 0, fullNameThree, 1);

		/* Initializing excel data again */
		getCreatedData();

		System.out.println(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameOne"));
		System.out.println(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameTwo"));
		System.out.println(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameThree"));

	}

	@Test(enabled = false, description = "Person Account Creation Test", groups = { "High", "aCIS_Regression",
			"Mrunal" }, priority = 2)
	public void dataToExcel() throws AcisException, Exception {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		System.out.println(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameOne"));
		System.out.println(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameTwo"));
		System.out.println(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameThree"));

	}

}
