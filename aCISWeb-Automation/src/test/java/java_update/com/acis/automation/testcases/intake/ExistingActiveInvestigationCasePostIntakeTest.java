package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ExistingActiveInvestigationCasePostIntakeTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(ExistingActiveInvestigationCasePostIntakeTest.class);
	String allegation_ID, caseId, caseIdTwo, allegation_ID2;
	String maltreatorFN = excel.generateRandomTestData("B", 4);
	String maltreatorMN = excel.generateRandomTestData("Bl", 4);
	String maltreator = maltreatorFN.concat(" ").concat(maltreatorMN);
	String victimFN = excel.generateRandomTestData("Vic", 4);
	String victimLN = excel.generateRandomTestData("Vn", 4);
	String victim = victimFN.concat(" ").concat(victimLN);
	String victimTwoFN = excel.generateRandomTestData("Ab", 6);
	String victimTwoLN = excel.generateRandomTestData("An", 6);
	String victimTwo = victimTwoFN.concat(" ").concat(victimTwoLN);
	String victimExtraFN = excel.generateRandomTestData("Ec", 6);
	String victimExtraLN = excel.generateRandomTestData("El", 6);
	String victimExtra = victimExtraFN.concat(" ").concat(victimExtraLN);

	public ExistingActiveInvestigationCasePostIntakeTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(priority = 1,description = "US-0829:Intake - Existing Active Investigation Case(s) - Post Intake-Create New Allgation", groups = {
			"High", "ACIS_Regression", "priyanka" })
	public void submitNewAllegation() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(maltreatorFN, maltreatorMN, maltreatorFN);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();

		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));

		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(victimFN, victimLN, victimFN);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstBirthYear"));

		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(victimTwoFN, victimTwoLN, victimTwoFN);

		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstBirthYear"));

		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();

		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();

		structuredDecisionMakingOmniscriptPage.clickNextButton();
		// Options : screenOut||familyServices||investigation
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		// Options : workerComments||supervisoryComments||narrative
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "test");
		// Options : newCase||existingCase
	//	screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
		screeningDecision_OmniscriptPage.newAllegations("Neglect", maltreator, victimTwo);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegation_ID = allegationReportPage.getAllegationID();
		homePage_SFDCPage.logoutUser();
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.searchGlobal(allegation_ID);
		allegationReportPage.clickIntakeBtn();
		// search allegation id steps
		
		reportDetailsOmniscriptPage.clickNextBtn();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectAcceptAssign();
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.getAllegatinID(allegation_ID);
		allegationReportPage.clickRelatedTab();
		allegationReportPage.clickonAlligationRecord();
		caseId = investigationCasePage.getCaseId();
	}

	@Test(priority = 2,description = " US-0829 : Existing Active Investigation Case(s) - Post Intake-2nd Allegation", groups = {
			"High", "aCIS_Regression", "Priyanka" })
	public void verifySearchedAllegationReportInfoIntake() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(maltreatorFN, maltreatorMN, maltreatorFN);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();

		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));

		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();

		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(victimExtraFN, victimExtraLN, victimExtraFN);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstBirthYear"));

		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();

		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();

		structuredDecisionMakingOmniscriptPage.clickNextButton();

		// Options : newCase||existingCase
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		//screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victimExtra);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegation_ID2 = allegationReportPage.getAllegationID();
		homePage_SFDCPage.logoutUser();

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.searchGlobal(allegation_ID2);

		allegationReportPage.clickIntakeBtn();
		reportDetailsOmniscriptPage.clickNextBtn();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectAcceptAssign();
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.getAllegatinID(allegation_ID2);

		//allegationReportPage.clickEditButton();

		//allegationReportPage.checkChangeInvestigation(caseId);
		homePage_SFDCPage.logoutUser();

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobal(allegation_ID2);
		allegationReportPage.clickRelatedTab();
		allegationReportPage.clickonAlligationRecord();
		investigationCasePage.clickRelatedTabOfInvestigation();
		investigationCasePage.clickCasePersonTab();
		investigationCasePage.verifyCasePersondetails(victimExtraFN);

	}

	@Test(priority = 3,description = " US-0829 : Existing Active Investigation Case(s) - Investigation Case Status Change", groups = {
			"High", "aCIS_Regression", "Priyanka" })
	public void investigationStatusChange() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(caseId);
        investigationCasePage.clickDetailsTab();
		investigationCasePage.editInvestigationStatus();
		investigationCasePage.clickSaveButton();
	}
}
