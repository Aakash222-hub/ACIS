package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PersonSearchUpdatesCreatingNewTest extends TestBase {

	public PersonSearchUpdatesCreatingNewTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	/***
	 * This class contains Test Script related to intake creation
	 */
	final static Logger logger = LoggerFactory.getLogger(PersonSearchUpdatesCreatingNewTest.class);

	@Test(description = "US-0644 Person Search Test using supervisor login ", groups = { "High", "acisRegression",
			"Akash" })

	public void personSearchSupervisor() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		home.verfiyHomePage();

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
				testData.get(Constants.REPORTDETAILSPAGE).get("phone"),
				testData.get(Constants.REPORTDETAILSPAGE).get("email"),
				testData.get(Constants.REPORTDETAILSPAGE).get("role"));
		reportDetailsOmniscriptPage
				.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
		reportDetailsOmniscriptPage.setDate("Incident");
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.selectingAddingPerson();
		searchPerson_OmniscriptPage.selectingRoleAndClickingcheckBoxSearchPage("AllegedMallternator");
		searchPerson_OmniscriptPage.refreshButton();
		verificationLabelsAfterIntakeCreationPage.verifyCreateLink();

		personsInvovled_OmniscriptPage.clickEditFirstRecordButton();
		personsInvovled_OmniscriptPage.verifyspecificFieldPresent();
		personsInvovled_OmniscriptPage.verifyRealtionshipNotPresent();

	}

	@Test(enabled = true, description = "US-0644 Person Search Test using intake login", groups = { "High",
			"acisRegression", "Akash" })

	public void personSearchIntake() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();

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
				testData.get(Constants.REPORTDETAILSPAGE).get("phone"),
				testData.get(Constants.REPORTDETAILSPAGE).get("email"),
				testData.get(Constants.REPORTDETAILSPAGE).get("role"));
		reportDetailsOmniscriptPage
				.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
		reportDetailsOmniscriptPage.setDate("Incident");
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.selectingAddingPerson();
		searchPerson_OmniscriptPage.selectingRoleAndClickingcheckBoxSearchPage("AllegedMallternator");
		searchPerson_OmniscriptPage.refreshButton();
		verificationLabelsAfterIntakeCreationPage.verifyCreateLink();

		personsInvovled_OmniscriptPage.clickEditFirstRecordButton();
		personsInvovled_OmniscriptPage.verifyspecificFieldPresent();
		personsInvovled_OmniscriptPage.verifyRealtionshipNotPresent();

	}

	@Test(enabled = true, description = "US-0644 Person Search Test using investigation login", groups = { "High",
			"acisRegression", "Akash" })

	public void personSearchInvestigation() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
		home.verfiyHomePage();

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
				testData.get(Constants.REPORTDETAILSPAGE).get("phone"),
				testData.get(Constants.REPORTDETAILSPAGE).get("email"),
				testData.get(Constants.REPORTDETAILSPAGE).get("role"));
		reportDetailsOmniscriptPage
				.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
		reportDetailsOmniscriptPage.setDate("Incident");
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.selectingAddingPerson();
		searchPerson_OmniscriptPage.selectingRoleAndClickingcheckBoxSearchPage("AllegedMallternator");
		searchPerson_OmniscriptPage.refreshButton();
		verificationLabelsAfterIntakeCreationPage.verifyCreateLink();

		personsInvovled_OmniscriptPage.clickEditFirstRecordButton();
		personsInvovled_OmniscriptPage.verifyspecificFieldPresent();
		personsInvovled_OmniscriptPage.verifyRealtionshipNotPresent();


	}

}
