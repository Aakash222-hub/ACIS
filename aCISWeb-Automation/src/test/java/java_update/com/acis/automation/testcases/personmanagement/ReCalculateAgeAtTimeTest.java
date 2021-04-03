package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ReCalculateAgeAtTimeTest extends TestBase {

	public ReCalculateAgeAtTimeTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String allegationID, fosterCaseID;

	String firstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
	String middleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
	String lastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);

	String childFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 3);
	String childMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
	String childLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 3);
	final static Logger logger = LoggerFactory.getLogger(ReCalculateAgeAtTimeTest.class);

	@Test(description = "US-0916:ReCalculate Age at Time of...Fields When DOB is updated of intake creation", groups = {
			"High", "acisRegression", "Khushboo" }, priority = 1)

	public void OverrideScreeningDecission() throws AcisException, InterruptedException, IOException {
		try {
			{
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
						testData.get(Constants.REPORTDETAILSPAGE).get("middleName"), "", "",
						testData.get(Constants.REPORTDETAILSPAGE).get("role"));
//				testData.get(Constants.REPORTDETAILSPAGE).get("phone")
//				testData.get(Constants.REPORTDETAILSPAGE).get("email")
				reportDetailsOmniscriptPage
						.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
				reportDetailsOmniscriptPage.setDate("Incident");
				reportDetailsOmniscriptPage.clickNextBtn();
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
				searchPerson_OmniscriptPage.linkToCreateNewPerson();

				createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
				createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
				createIntakePerson_OmniscriptPage.provideBirthdate(
						testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
				createIntakePerson_OmniscriptPage
						.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
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
				screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
				screeningDecision_OmniscriptPage.selectCaseHead(firstName + " " + middleName + " " + lastName);
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
				// screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				allegationID = allegationReportPage.getAllegationID();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0164 Case Management - New Placement Search Criteria intake creation");
		}
	}

	@Test(description = "US-0916:ReCalculate Age at Time of...Fields When DOB is updated  intake approval", groups = {
			"High", "acisRegression", "khushboo" }, priority = 2)
	public void OverrideSupervisor() throws AcisException, InterruptedException, IOException {
		try {
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
			screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationID = allegationReportPage.getAllegationID();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0164 Case Management - New Placement Search Criteria intake approval");
		}
	}

	@Test(description = "US-0916:ReCalculate Age at Time of...Fields When DOB is updated create foster care case", groups = {
			"High", "acisRegression", "Khushboo" }, priority = 3)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			{
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
				homePage_SFDCPage.searchRecordAndClick(firstName + " " + middleName + " " + lastName);
				fosterCaseID = caseHeadPage.newFosterCase();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US-0916:ReCalculate Age at Time of...Fields When DOB is updated create foster care case");
		}
	}

	@Test(description = "US-0916:ReCalculate Age at Time of...Fields When DOB is updated by foster care case", groups = {
			"High", "acisRegression", "Khushboo" }, priority = 4)
	public void checkAgeAtTimeOFReport() throws AcisException, InterruptedException, IOException {
		try {
			{
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickRelatedTab();
				caseHeadPage.clickOnNewPerson();
				establishRelationships_CP_OmniScriptPage.clickCreateAddButton();
				personsInvovled_CP_OmniscriptPage.searchNewPerson("gyu");
				personsInvovled_CP_OmniscriptPage.setAllNames("first", "chgnhy", "abc", "child");
				personsInvovled_CP_OmniscriptPage.prvoideSuffix("first", "I");
				personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2005");
				personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
				personsInvovled_CP_OmniscriptPage.clickNextButton();
				establishRelationships_CP_OmniScriptPage.clickSubmit();

			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US-0916:ReCalculate Age at Time of...Fields When DOB is updated by foster care case");
		}

	}

	@Test(description = "US-0916:ReCalculate Age at Time of...Fields When DOB is updated of investigation", groups = {
			"High", "acisRegression", "Khushboo" }, priority = 5)
	public void checkInvestigation() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation(); 
		homePage_SFDCPage.searchGlobal(allegationID);
		allegationReportPage.clickRelatedTab();
	//	allegationReportPage.clickonAlligationRecord();
		personsInformationPage.clickOnPersonInvolved();
		caseHeadPage.clickRelatedTab("Second Related tab");
		personsInformationPage.openCaseHistory("second");
		personsInformationPage.checkfield();

	}

}