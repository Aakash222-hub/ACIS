package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class CompleteRiskAssessmentTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(CompleteRiskAssessmentTest.class);
	public static String allegationID;

	public CompleteRiskAssessmentTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(description = "S:0094 Complete Risk Assessment-using investigator", groups = { "High", "acisRegression",
			"Khushboo" })
	public void completeRiskAssessment() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
		String allegationID;
		String maltreator = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").concat(" ")
				.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName")).concat(" ")
				.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"));
		String victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
				.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName")).concat(" ")
				.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"));
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
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
		createIntakePerson_OmniscriptPage.setAllNames(
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),
				testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),
				testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"));
		// createIntakePerson_OmniscriptPage.provideContactInformation(
		// testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
		// testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
		createIntakePerson_OmniscriptPage
				.provideState(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstState"));
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

		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
		createIntakePerson_OmniscriptPage.setAllNames(
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"),
				testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"),
				testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"));
		// createIntakePerson_OmniscriptPage.provideContactInformation(
		// testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
		// testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
		createIntakePerson_OmniscriptPage
				.provideState(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstState"));
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
		// searchPerson_OmniscriptPage.clickNextBtn();
		// personsInvovled_OmniscriptPage.clickEditRecordButton(maltreator);
		// personsInvovled_OmniscriptPage.provideRole("first", "Alleged Maltreator");
		// personsInvovled_OmniscriptPage.clickPrimaryCaregiver();
		// personsInvovled_OmniscriptPage.clickSaveButton("first");
		// personsInvovled_OmniscriptPage.clickEditRecordButton(victim);
		// personsInvovled_OmniscriptPage.provideRole("second", "Alleged Victim");
		// personsInvovled_OmniscriptPage.clickPrimaryCaregiver();
		// personsInvovled_OmniscriptPage.clickSaveButton("second");
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		// Options : screenOut||familyServices||investigation
		// screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
		// Options : workerComments||supervisoryComments||narrative
		// Options : newCase||existingCase
		// screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		// screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
		allegationID = allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.logoutUser();
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobal(allegationID);
		allegationReportPage.clickIntakeBtn();
		reportDetailsOmniscriptPage.clickNextBtn();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectAcceptAssign();
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.cancelIntakeOmniscript();
		allegationReportPage.verifyingAllegationReportStatus();
		// Pre-requisite for investigation flow completed
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.logoutUser();
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobal(allegationID);
		allegationReportPage.clickRelatedTab();
		allegationReportPage.clickonAlligationRecord();
		investigationCasePage.clickRelatedTab();
		Thread.sleep(10000);
		mandatoryPersonSearchSafetyAssesmentPage.clickOnNewSafetyAssessmentlink();
		Thread.sleep(10000);
		reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
		personsInvolved_SA_OmniscriptPage.clickNextButton();
		establishRelations_SA_OmniScriptPage.clickNextButton();
		interviewChildren_SA_OmniScriptPage.clickNextButton();
		interviewCaregivers_SA_OmniScriptPage.clickNextButton();
		assessTheHome_SA_OmniScriptPage.nextAccessTheHome();
		safetyScale_SA_OmniScriptPage.clickCreateAddButton();
		safetyScale_SA_OmniScriptPage.selectUnableDefend("Yes");
		safetyScale_SA_OmniScriptPage.clickSave();
	}
}
