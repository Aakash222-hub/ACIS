package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class SearchPersonTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(SearchPersonTest.class);

	public SearchPersonTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String date;
	String firstPersonFirstName = testData.get(Constants.SearchPerson_SHEET).get("firstPersonFirstName");
	String firstPersonMiddleName = testData.get(Constants.SearchPerson_SHEET).get("firstPersonMiddleName");
	String firstPersonLastName = testData.get(Constants.SearchPerson_SHEET).get("firstPersonLastName");
	String NewPersonFirstName = testData.get(Constants.SearchPerson_SHEET).get("NewPersonFirstName");
	String NewPersonMiddleName = testData.get(Constants.SearchPerson_SHEET).get("NewPersonMiddleName");
	String NewPersonLastName = testData.get(Constants.SearchPerson_SHEET).get("NewPersonLastName");
	int count = 0;

	@Test(priority = 0, description = "S-0613:Person Search Updates-Search and Table Intake", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void submitNewAllegation() throws AcisException, InterruptedException, IOException {
		try {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			String maltreator = testData.get(Constants.SearchPerson_SHEET).get("firstPersonFirstName").concat(" ")
					.concat(testData.get(Constants.SearchPerson_SHEET).get("firstPersonMiddleName"));
			String victim = testData.get(Constants.SearchPerson_SHEET).get("NewPersonFirstName").concat(" ")
					.concat(testData.get(Constants.SearchPerson_SHEET).get("NewPersonMiddleName"));

			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.setDate("Intake");
			reportDetailsOmniscriptPage.selectIntakeMethod();
			reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
					"",
					"",
					testData.get(Constants.REPORTDETAILSPAGE).get("role"));
			//testData.get(Constants.REPORTDETAILSPAGE).get("phone")
			//testData.get(Constants.REPORTDETAILSPAGE).get("email")
			reportDetailsOmniscriptPage
					.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
			reportDetailsOmniscriptPage.setDate("Incident");
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();

			createIntakePerson_OmniscriptPage.setAllNames(firstPersonFirstName, firstPersonMiddleName,
					firstPersonLastName);
			createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
//			createIntakePerson_OmniscriptPage.provideContactInformation(
//					testData.get(Constants.SearchPerson_SHEET).get("firstPersonNewPhone"),
//					testData.get(Constants.SearchPerson_SHEET).get("firstPersonNewEmail"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
//			createIntakePerson_OmniscriptPage
//					.provideState(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstState"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
			createIntakePerson_OmniscriptPage.clickPrimaryAddress();
			createIntakePerson_OmniscriptPage
					.provideBirthdate(testData.get(Constants.SearchPerson_SHEET).get("firstDOB"));
			date = createIntakePerson_OmniscriptPage.getDOB();
			createIntakePerson_OmniscriptPage
					.prvoideGender(testData.get(Constants.SearchPerson_SHEET).get("firstPersonGender"));

			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			searchPerson_OmniscriptPage.linkToCreateNewPerson();

			createIntakePerson_OmniscriptPage.setAllNames(NewPersonFirstName, NewPersonMiddleName, NewPersonLastName);
			createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
//			createIntakePerson_OmniscriptPage.provideContactInformation(
//					testData.get(Constants.SearchPerson_SHEET).get("NewPersonNewPhone"),
//					testData.get(Constants.SearchPerson_SHEET).get("NewPersonNewEmail"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
//			createIntakePerson_OmniscriptPage
//					.provideState(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstState"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"));
			createIntakePerson_OmniscriptPage.clickPrimaryAddress();
			createIntakePerson_OmniscriptPage
					.provideBirthdate(testData.get(Constants.SearchPerson_SHEET).get("NewDOB"));
			createIntakePerson_OmniscriptPage
					.prvoideGender(testData.get(Constants.SearchPerson_SHEET).get("NewPersonGender"));

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
			// Options : screenOut||familyServices||investigation
			// Options : workerComments||supervisoryComments||narrative
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "");
			// Options : newCase||existingCase
			screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			screeningDecision_OmniscriptPage.verifyRequiredFields();
			 screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
			count++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "S-0613:Person Search Updates-Search and Table Intake");
		}

	}

	@Test(priority = 1, description = "S-0613:Person Search Updates-Search and Table First Name", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void searchPersonFirstNameVerify() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 1) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.clickNewButton();
				reportDetailsOmniscriptPage.setDate("Intake");
				reportDetailsOmniscriptPage.selectIntakeMethod();
				reportDetailsOmniscriptPage.reporterAnonymousNo(
						testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
						"",
						"",
						testData.get(Constants.REPORTDETAILSPAGE).get("role"));
				//testData.get(Constants.REPORTDETAILSPAGE).get("phone")
				//testData.get(Constants.REPORTDETAILSPAGE).get("email")
				reportDetailsOmniscriptPage
						.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
				reportDetailsOmniscriptPage.setDate("Incident");
				reportDetailsOmniscriptPage.clickNextBtn();
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("dob", searchPerson_OmniscriptPage.checkDOBValue(date));
				searchPerson_OmniscriptPage.searchRecordVerify(date);
				searchPerson_OmniscriptPage.searchClearText();
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", firstPersonFirstName);
				searchPerson_OmniscriptPage.searchRecordLabelsVerify();
				searchPerson_OmniscriptPage.searchRecordVerify(firstPersonFirstName);
				searchPerson_OmniscriptPage.searchRecordVerify("Unk");
				searchPerson_OmniscriptPage.searchPersonUsingInvalidData("firstName", "iitz");
				searchPerson_OmniscriptPage.searchClearText();
				searchPerson_OmniscriptPage.searchPersonUsingMultipleValidData("firstlastName", firstPersonFirstName,
						firstPersonLastName);
				searchPerson_OmniscriptPage.searchRecordVerify(firstPersonFirstName);
				count++;
			}
			else
			{
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0613:Person Search Updates-Search and Table First Name");
		}

	}

	@Test(priority = 2, description = "S-0613:Person Search Updates-Search and Table Name", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void searchPersonNameVerify() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 2) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				String newDate;
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.clickNewButton();
				reportDetailsOmniscriptPage.setDate("Intake");
				reportDetailsOmniscriptPage.selectIntakeMethod();
				reportDetailsOmniscriptPage.reporterAnonymousNo(
						testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
						"",
						"",
						testData.get(Constants.REPORTDETAILSPAGE).get("role"));
				//testData.get(Constants.REPORTDETAILSPAGE).get("phone")
				//testData.get(Constants.REPORTDETAILSPAGE).get("email")
				reportDetailsOmniscriptPage
						.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
				reportDetailsOmniscriptPage.setDate("Incident");
				reportDetailsOmniscriptPage.clickNextBtn();
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("lastName", NewPersonLastName);
				searchPerson_OmniscriptPage.searchRecordVerify(NewPersonLastName);
				count++;
			}
			else
			{
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}


		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0613:Person Search Updates-Search and Table Name");
		}

	}

	@Test(priority = 3, description = "S-0613:Person Search Updates-Search and Table using Gender", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void searchPersonGenderVerify() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 3) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.clickNewButton();
				reportDetailsOmniscriptPage.setDate("Intake");
				reportDetailsOmniscriptPage.selectIntakeMethod();
				reportDetailsOmniscriptPage.reporterAnonymousNo(
						testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
						"",
						"",
						testData.get(Constants.REPORTDETAILSPAGE).get("role"));
				//testData.get(Constants.REPORTDETAILSPAGE).get("phone")
				//testData.get(Constants.REPORTDETAILSPAGE).get("email")
				reportDetailsOmniscriptPage
						.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
				reportDetailsOmniscriptPage.setDate("Incident");
				reportDetailsOmniscriptPage.clickNextBtn();
				searchPerson_OmniscriptPage.selectGender("male");
				searchPerson_OmniscriptPage.searchRecordVerify("Male");
				searchPerson_OmniscriptPage.searchPersonUsingMultipleValidData("firstNameGender", firstPersonFirstName,
						"male");
				searchPerson_OmniscriptPage.searchRecordVerify(firstPersonFirstName);
				searchPerson_OmniscriptPage
						.searchRecordVerify(testData.get(Constants.SearchPerson_SHEET).get("firstPersonGender"));
				searchPerson_OmniscriptPage.searchClearText();
				searchPerson_OmniscriptPage.searchPersonUsingMultipleValidData("lastNameGender", NewPersonLastName,
						"female");
				searchPerson_OmniscriptPage
						.searchRecordVerify(testData.get(Constants.SearchPerson_SHEET).get("NewPersonGender"));

			}
			else
			{
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}


		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0613:Person Search Updates-Search and Table using Gender");
		}

	}
}
