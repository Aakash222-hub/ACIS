package com.acis.automation.testcases.checkout;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class BasicIntakeFlowTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(BasicIntakeFlowTest.class);

	public BasicIntakeFlowTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID, fosterCaseID;

	String firstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
	String middleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
	String lastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);

	String secondFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"), 3);
	String secondMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"), 3);
	String secondLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"), 3);
	
	String firstPersonPhone = excel
			.generateRandomNumber(testData.get(Constants.PersonAccountCreation_SHEET).get("firstPersonPhone"), 4);
	String secondPersonPhone = excel
			.generateRandomNumber(testData.get(Constants.PersonAccountCreation_SHEET).get("secondPersonPhone"), 3);
	String firstPersonEmail = excel
			.generateRandomTestData(testData.get(Constants.PersonAccountCreation_SHEET).get("firstPersonEmail"), 4);
	String secondPersonEmail = excel
			.generateRandomTestData(testData.get(Constants.PersonAccountCreation_SHEET).get("secondPersonEmail"), 3);
	
	int count = 0;
	String date;
	/***
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 * @throws IOException
	 */

	@Test(description = "US-040:Intake - Submit Intake to Supervisor", groups = { "Medium", "ACIS_Regression",
			"Dharmesh" })
	public void submitNewAllegation() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			String maltreator = firstName.concat(" ").concat(middleName);
			String victim = secondFirstName.concat(" ").concat(secondMiddleName);
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.setDate("Intake");
			reportDetailsOmniscriptPage.checkIntakeDateOverride();
			reportDetailsOmniscriptPage.selectIntakeMethod();
			reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
					"",
					"",
					testData.get(Constants.REPORTDETAILSPAGE).get("role"));
			reportDetailsOmniscriptPage.enterLocationOfIncident("17 toms dr bloomington Il 61701");
			reportDetailsOmniscriptPage.locationEditfield("17 toms dr","bloomington","61701");
//			reportDetailsOmniscriptPage.setDate("Incident");
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			createIntakePerson_OmniscriptPage.setAllNames(
					firstName,
					middleName,
					lastName);
			createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
					createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
			reportDetailsOmniscriptPage.addressAsSamelocationofIncident();
			createIntakePerson_OmniscriptPage.clickPrimaryAddress();
			createIntakePerson_OmniscriptPage.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
			date = createIntakePerson_OmniscriptPage.getDOB();
			createIntakePerson_OmniscriptPage
					.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));

			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			
			createIntakePerson_OmniscriptPage.setAllNames(
					secondFirstName,
					secondMiddleName,
					secondLastName);
			createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"));
			createIntakePerson_OmniscriptPage.clickPrimaryAddress();
			createIntakePerson_OmniscriptPage
					.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage
					.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstGender"));

			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			personsInvovled_OmniscriptPage.clickRefresPersonButton();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			
			// Options : workerComments||supervisoryComments||narrative
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			// Options : newCase||existingCase
			screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.searchGlobalEnter(firstName+" "+middleName+" "+lastName);
			System.out.println(firstName+" "+middleName+" "+lastName);
			reportDetailsOmniscriptPage.verifyPersonAddress("17 toms dr");
			count++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0613:Person Search Updates-Search and Table First Name");
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
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", firstName);
				searchPerson_OmniscriptPage.searchRecordLabelsVerify();
				searchPerson_OmniscriptPage.searchRecordVerify(firstName);
				searchPerson_OmniscriptPage.searchRecordVerify("Unk");
				searchPerson_OmniscriptPage.searchPersonUsingInvalidData("firstName", "iitz");
				searchPerson_OmniscriptPage.searchClearText();
				searchPerson_OmniscriptPage.searchPersonUsingMultipleValidData("firstlastName", firstName,
						firstName);
				searchPerson_OmniscriptPage.searchRecordVerify(firstName);
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
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("lastName", secondLastName);
				searchPerson_OmniscriptPage.searchRecordVerify(secondLastName);
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


}