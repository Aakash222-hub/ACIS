package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class Sprint13FeedbackOnUserStoryTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(Sprint13FeedbackOnUserStoryTest.class);
	String fosterCaseID;

	public Sprint13FeedbackOnUserStoryTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	// A-001809 and A-001810
	@Test(enabled = false, description = "US-779 Case Management - Sprint 13 Feedback User Story-Verify  Events details", groups = {
			"Medium", "acisRegression", "Priyanka" }, priority = 0)
	public void VerifyEventDetails() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();

			newOrientationEventPage.selectEventsDropDown();
			newOrientationEventPage.selectAllEvent();
			newOrientationEventPage.verifyNewbtn();
//			newOrientationEventPage.clickonNewOrientationEventbtn();
//
//			// A-001813
//			homePage_SFDCPage.closeTabs();
//			newOrientationEventPage.selectEventsDropDown();
			newOrientationEventPage.clickonNewbtn();
			newRecruitmentEventPage.selectOrientationRadioButton();
			newOrientationEventPage.EnterMandatoryFieldNewOrientationEvent("xyz", "abc", "11111");
			newOrientationEventPage.EditDateAndVerityActiveCheckbox();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:779 Case Management - Sprint 13 Feedback User Story-Verify Event details");
		}
	}

	@Test(enabled = true, description = "US-779 Case Management - Sprint 13 Feedback User Story-Create Foster care case", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 1)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
			homePage_SFDCPage.clickFirstRecord();
			// homePage_SFDCPage.searchRecordAndClick("abc");
			// homePage_SFDCPage.searchRecordAndClick(firstName+" "+middleName+"
			// "+lastName);
			fosterCaseID = caseHeadPage.newFosterCase();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-779 Case Management - Sprint 13 Feedback User Story-");
		}

	}

	@Test(description = "US:779 Case Management - Sprint 13 Feedback User Story- Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 2)
	public void fosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickRelatedTab();
			fosterCareCase_Page.clickPersonTab();
			fosterCareCase_Page.clickNewPerson();
			personsInvovled_CP_OmniscriptPage.searchPersonUsingInvalidData("firstName", "MNJN");
			personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
			personsInvovled_CP_OmniscriptPage.setAllNames("first", "first", "", "last");
			personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
			personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
			personsInvovled_CP_OmniscriptPage.clickNextButton();
			establishRelationships_CP_OmniScriptPage.clickSubmit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:779 Case Management - Sprint 13 Feedback User Story- Foster Care Case Add Person");
		}

	}
	

	// A-001811
	@Test(enabled = true, description = "US-779 Case Management - Sprint 13 Feedback User Story-Verify Age at Time of Interaction", groups = {
			"Medium", "acisRegression", "Priyanka" }, priority = 3)
	public void personInformationInteractionDetailVerification() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);// C-00003987
			fosterCareCase_Page.clickInteractionsTab();
			fosterCareCase_Page.clickscheduleMeetingButton();
			addMeetingAttendeesPage.setMeetingType("TDM");
			addMeetingAttendeesPage.searchPerson("first");
			addMeetingAttendeesPage.setCollateral("FirstName", "Last Name", "1234567890", "email@hd.cos");
			addMeetingAttendeesPage.clickNextButton();
			selectMeetingLocationDateAndTimePage.selectDateTime();
			selectMeetingLocationDateAndTimePage.selectMethod("Teleconference");
			selectMeetingLocationDateAndTimePage.clickNextButton();
			reviewEditSendPage.clickSubmitButton();
			interactionDetailPage.clickSecondRelatedTab();
			addMeetingAttendeesPage.clickParticipantId();
			addMeetingAttendeesPage.checkAgeValue();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:779 Case Management -Sprint 13 Feedback User Story-Verify Age at Time of Interaction");
		}
	}

	// A-001811
	@Test(enabled = true, description = "US-779 Case Management - Sprint 13 Feedback User Story-Verify Age at Time of Interaction-Case Worker login", groups = {
			"Medium", "acisRegression", "Priyanka" }, priority = 4)
	public void personInformationInteractionDetailVerification2() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);// 3710
			fosterCareCase_Page.clickInteractionsTab();
			fosterCareCase_Page.clickscheduleMeetingButton();
			addMeetingAttendeesPage.setMeetingType("TDM");
			addMeetingAttendeesPage.searchPerson("first");
			addMeetingAttendeesPage.setCollateral("FirstName", "Last Name", "1234567890", "email@hd.cos");
			addMeetingAttendeesPage.clickNextButton();
			selectMeetingLocationDateAndTimePage.selectDateTime();
			selectMeetingLocationDateAndTimePage.selectMethod("Teleconference");
			selectMeetingLocationDateAndTimePage.clickNextButton();
			reviewEditSendPage.clickSubmitButton();
			interactionDetailPage.clickSecondRelatedTab();
			addMeetingAttendeesPage.clickParticipantId();
			addMeetingAttendeesPage.checkAgeValue();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:779 Case Management -Sprint 13 Feedback User Story-Verify Age at Time of Interaction");
		}
	}

	@Test(enabled = true, description = "US-779 Case Management - Sprint 13 Feedback User Story-Verfiy assigned task to Prepare for Case Closure and related fields", groups = {
			"Medium", "acisRegression", "Priyanka" }, priority = 5)
	public void VerifyTaskPrepareforCaseClosureFields() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickCourtAction();
			//fosterCareCase_Page.clickNewCourtAction();
			// courtActionOutcomesPage.setDateandTime();
			courtActionOutcomesPage.newlegalAction("abc");
			courtActionOutcomesPage.CourtActionSelectType("CourtOrder");
			courtActionOutcomesPage.addCourtActionParticipant("first");
			courtActionOutcomesPage.Savebutton();
			fosterCareCase_Page.clickCourtAction();
			String courtActionId = courtActionPage.clickFirstRecordCourtOrderAndGetCourtActionId();// ori
			courtActionPage.clickRelatedLink();
			courtActionOutcomesPage.clickCourtActionOutcomes();
			// courtActionOutcomesPage.clickOnNewbtn();
			courtActionOutcomesPage.setcourtActionOutcomeID("Name");
			courtActionOutcomesPage.setDateandTime();
			courtActionOutcomesPage.setlectType("ReunificationGranted");
			courtActionOutcomesPage.courtActionOutcomeSavebtn();
			courtActionOutcomesPage.ClickOnCourtActionId();
			courtActionPage.clickPrepareforCaseClosure();// ori
			courtActionPage.VerifyPrepopulatedFields(courtActionId);

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:779 Case Management -Sprint 13 Feedback User Story-Verfiy assigned task to Prepare for Case Closure and related fields");
		}
	}

}
