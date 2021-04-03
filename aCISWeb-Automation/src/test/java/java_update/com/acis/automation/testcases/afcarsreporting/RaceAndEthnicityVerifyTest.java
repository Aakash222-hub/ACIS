package com.acis.automation.testcases.afcarsreporting;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class RaceAndEthnicityVerifyTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(RaceAndEthnicityVerifyTest.class);

	public RaceAndEthnicityVerifyTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String childFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 3);
	String childMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
	String childLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 3);

	@Test(description = "S-0572:Race and Ethnicity nonresponse options Intake", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void intakeVerify() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
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
		createIntakePerson_OmniscriptPage.verifyUnableToDetermineNotPresent();
		createIntakePerson_OmniscriptPage.selectRaceOptions("Choose not to disclose");

	}

	@Test(description = "S-0572:Race and Ethnicity nonresponse options Account", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void accountVerify() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount();

//		homePage_SFDCPage.searchGlobalAccountRecord("FirstNameAcMN middleefo lastNamePgd");
		homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameTwo"));
		personsInformationPage.clickDetailsTab();
		personsInformationPage.clickEditButton();
		personsInformationPage.verifyRace();
	}

	@Test(description = "S-0572:Race and Ethnicity nonresponse options Foster Care Case", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void fosterCaseVerify() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		String fosterCaseID;
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowCaseHead();
		homePage_SFDCPage.selectAllCaseHeads();
		homePage_SFDCPage.clickFirstRecord();
		fosterCaseID = caseHeadPage.newFosterCase();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.logoutUser();
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
		fosterCareCase_Page.clickRelatedTab();
		fosterCareCase_Page.clickPersonTab();
		fosterCareCase_Page.clickNewPerson();
		personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
		personsInvovled_CP_OmniscriptPage.searchNewPerson(childFirstName);
		personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
		personsInvovled_CP_OmniscriptPage.verifyUnableToDetermineNotPresent();
		personsInvovled_CP_OmniscriptPage.selectRaceOptions("Choose not to disclose");

	}

	@Test(description = "S-0572:Race and Ethnicity nonresponse options Investigation", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void investigationCaseVerify() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		String investigationID;
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowCaseActions();
		homePage_SFDCPage.selectMyInvestigation();
		investigationCasePage.clickFirstRecord();
		investigationID = investigationCasePage.getInvestigationID();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.logoutUser();
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(investigationID);
		investigationCasePage.clickInvestigationWorkflow();
		reviewAllegationReport_OmniScriptPage.searchPersonUsingvalidData("firstName", "first");
		reviewAllegationReport_OmniScriptPage.clickCreateAddButton();
		reviewAllegationReport_OmniScriptPage.setAllNames(
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),
				testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),
				testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"));
		reviewAllegationReport_OmniScriptPage.verifyUnableToDetermineNotPresent();
		reviewAllegationReport_OmniScriptPage.selectRaceOptions("Choose not to disclose");
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.logoutUser();
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(investigationID);
		investigationCasePage.clickRelatedTab();
		investigationCasePage.ClickCaseNewPerson();
		reviewAllegationReport_OmniScriptPage.searchPersonUsingvalidData("firstName", "first");
		reviewAllegationReport_OmniScriptPage.clickCreateAddButton();
		reviewAllegationReport_OmniScriptPage.setAllNames(
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),
				testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),
				testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"));
		reviewAllegationReport_OmniScriptPage.verifyUnableToDetermineNotPresent();
		reviewAllegationReport_OmniScriptPage.selectRaceOptions("Choose not to disclose");
	}

	@Test(description = "S-0572:Race and Ethnicity nonresponse options SafetyAssessment", groups = { "Medium",
			"ACIS_Regression", "Dharmesh" })
	public void safetyAssessmentVerify() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		String investigationID;
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowCaseActions();
		homePage_SFDCPage.selectMyInvestigation();
		investigationCasePage.clickFirstRecord();
		investigationID = investigationCasePage.getInvestigationID();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.logoutUser();
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(investigationID);
		investigationCasePage.clickRelatedTab();
		investigationCasePage.clickAssessmentsTab();
		investigationSafetyAssessmentPage.newSafetyAssesment();
		reviewAllegationReport_SA_OmniScriptPage.searchPersonUsingvalidData("firstName", "first");
		reviewAllegationReport_SA_OmniScriptPage.clickCreateAddButton();
		reviewAllegationReport_SA_OmniScriptPage.setAllNames(
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),
				testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),
				testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"));
		reviewAllegationReport_SA_OmniScriptPage.verifyUnableToDetermineNotPresent();
		reviewAllegationReport_SA_OmniScriptPage.selectRaceOptions("Choose not to disclose");
	}
}
