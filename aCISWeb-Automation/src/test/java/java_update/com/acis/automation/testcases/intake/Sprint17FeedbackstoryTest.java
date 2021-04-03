package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class Sprint17FeedbackstoryTest extends TestBase {

	public Sprint17FeedbackstoryTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID, maltreator, victim, victimSecond;
	String fosterCaseID;
	int count = 0;

	@Test(priority=0,description = "US:841 Sprint 17 Technical Improvement Feedback story Test", groups = { "High",
			"acisRegression", "Khushboo" })
	public void intakeCreation() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();

			String allegationID;
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
					testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("phone"),
					testData.get(Constants.REPORTDETAILSPAGE).get("email"),
					testData.get(Constants.REPORTDETAILSPAGE).get("role"));
			reportDetailsOmniscriptPage
					.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
			reportDetailsOmniscriptPage.setDate("Incident");
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "Rachel");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
			createIntakePerson_OmniscriptPage.setAllNames("firstn", "middlen", "lastn");
			// createIntakePerson_OmniscriptPage.prvoideSuffix("I");
			// createIntakePerson_OmniscriptPage.provideContactInformation("(123) 456-7890",
			// "demo@demo.com");
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1", "street");
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2", "street");
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city", "city");
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode", "12345");
			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			personsInvovled_OmniscriptPage.clickRefresPersonButton();
			// AC 2235,2236 &2237
			searchPerson_OmniscriptPage.checkFirstName();
			personsInvovled_OmniscriptPage.clickNextButton();
			// Intake flow
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			// Options : screenOut||familyServices||investigation
			// screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
			// AC 2323
			screeningDecision_OmniscriptPage.selectAssociateExistingInvestigation("Yes");
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			// Options : workerComments||supervisoryComments||narrative
			// Options : newCase||existingCase
			//screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
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
			allegationReportPage.closeIntakeOmniscript();
			allegationReportPage.verifyingAllegationReportStatus();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.logoutUser();
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			// AC2324
			allegationReportPage.clickonAlligationRecord();
			caseHeadPage.verifyCaseHead();
			// AC 2213 Special needs
			personsInformationPage.clickOnPersonInvolved();
			personsInformationPage.clickHealthTab();
			specialNeedsPage.clickNewButton();
			specialNeedsPage.selectDisablities();
			specialNeedsPage.selectType();
			specialNeedsPage.clickOnSavebtn();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-841:Sprint 17 Technical Improvement Feedback story Test	sR4D");

		}
	}

	@Test(priority=1,description = "US:841 Sprint 17 placement record Technical Improvement Feedback story Test", groups = { "High",
			"acisRegression", "Khushboo" })
	public void createFoster() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
			homePage_SFDCPage.clickFirstRecord();
			fosterCaseID = caseHeadPage.newFosterCase();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickInteractionsTab();
			fosterCareCase_Page.clickscheduleMeetingButton();
			addMeetingAttendeesPage.setMeetingType("TDM");
			//AC 2327
			addMeetingAttendeesPage.checkErrorMessage();
			//AC 2328
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.logoutUser();
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickInteractionsTab();
			fosterCareCase_Page.clickscheduleMeetingButton();
			addMeetingAttendeesPage.setMeetingType("CasePlanReview");
			addMeetingAttendeesPage.checkErrorMessage();
			//AC2329
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.logoutUser();
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickInteractionsTab();
			fosterCareCase_Page.clickscheduleMeetingButton();
			addMeetingAttendeesPage.setMeetingType("Case Transfer");
			addMeetingAttendeesPage.checkErrorMessageCaseTransfer();
		}
			catch (Exception e) {
				// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-841:Sprint 17 placement record Technical Improvement Feedback story Test	sR4D");

			}
}
}