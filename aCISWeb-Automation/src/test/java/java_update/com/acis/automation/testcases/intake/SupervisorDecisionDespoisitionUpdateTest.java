package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class SupervisorDecisionDespoisitionUpdateTest extends TestBase {

	public SupervisorDecisionDespoisitionUpdateTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	/***
	 * This class contains Test Script related to intake creation and
	 * supervisorDecissonDespositionUpdate Only applicable through supervisor login
	 */
	final static Logger logger = LoggerFactory.getLogger(SupervisorDecisionDespoisitionUpdateTest.class);
	String allegationID;
	int count1 = 0, count2 = 0;

	@Test(description = "S-0209 Intake - Supervisor Decision and Disposition Field Updates", groups = { "High",
			"acisRegression", "Akash" })

	public void SupervisorDecisionDespoisitionUpdate() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		String maltreator = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").concat(" ")
				.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"));
		String victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
				.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("middleName"), "", "",
				testData.get(Constants.REPORTDETAILSPAGE).get("role"));
		// testData.get(Constants.REPORTDETAILSPAGE).get("phone")
		// testData.get(Constants.REPORTDETAILSPAGE).get("email")
		reportDetailsOmniscriptPage
				.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
		reportDetailsOmniscriptPage.setDate("Incident");
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),
				testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),
				testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"));
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
//		createIntakePerson_OmniscriptPage.provideContactInformation(
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
//		createIntakePerson_OmniscriptPage
//				.provideState(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstState"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
		createIntakePerson_OmniscriptPage
				.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));

		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"),
				testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"),
				testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"));
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
//		createIntakePerson_OmniscriptPage.provideContactInformation(
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
//		createIntakePerson_OmniscriptPage
//				.provideState(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstState"));
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
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");

		// Options : workerComments||supervisoryComments||narrative
		screeningDecision_OmniscriptPage.selectCaseHead(maltreator);

		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		// screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "");
		// Options : newCase||existingCase
		screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);

		// Options : screenOut||familyServices||investigation

		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationID = allegationReportPage.getAllegationID();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();

	}

	@Test(enabled = true, description = "S-0209 Intake - Supervisor Decision and Disposition Field Updates final using supervisor", groups = {
			"High", "acisRegression", "Akash" }, priority = 1)
	public void AcceptAssign() throws AcisException, Exception {
		if (count1 == 0) {
			String allegationReportIdNoAfterIsApprove = "";

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);

			allegationReportPage.clickIntakeBtn();
			Thread.sleep(15000);
			reportDetailsOmniscriptPage.clickNextBtn();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();

			screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			// Options : workerComments||supervisoryComments||narrative
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			supervisorDecisionDepositionUpdatePage.scrollTill("scrolltwo");
			screeningDecision_OmniscriptPage.selectOverride();
			supervisorDecisionDepositionUpdatePage.verifyNoDispositionError(
					testData.get(Constants.SupervisorDecisionDepositionUpdatePage).get("depositionError"),
					testData.get(Constants.SupervisorDecisionDepositionUpdatePage).get("screeningLabel"));
			supervisorDecisionDepositionUpdatePage.scrollTill("scrolltwo");
			supervisorDecisionDepositionUpdatePage.selectingAcceptingAssign(
					testData.get(Constants.SupervisorDecisionDepositionUpdatePage).get("supervisorscreening"),
					testData.get(Constants.SupervisorDecisionDepositionUpdatePage).get("workerScreening"));
			supervisorDecisionDepositionUpdatePage.intakeNavigationToScreenDecission();
			supervisorDecisionDepositionUpdatePage.scrollTill("scrolltwo");
			screeningDecision_OmniscriptPage.selectOverride();
			supervisorDecisionDepositionUpdatePage.scrollTill("scrollUp");
			screeningDecision_OmniscriptPage.selectDisposition("investigation");
			screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			screeningDecision_OmniscriptPage.cancelButton();
			supervisorDecisionDepositionUpdatePage.verifyingSuperVisorOverride(
					testData.get(Constants.SupervisorDecisionDepositionUpdatePage).get("disposition"),
					testData.get(Constants.SupervisorDecisionDepositionUpdatePage).get("supervisorscreenDis"),
					testData.get(Constants.SupervisorDecisionDepositionUpdatePage).get("workerScreening"));

		}

		else {
			throw new Exception(
					"Pre-requisite for Intake ID Validation  Does Not completed Successfully, so can not run this test");
		}
	}
}
