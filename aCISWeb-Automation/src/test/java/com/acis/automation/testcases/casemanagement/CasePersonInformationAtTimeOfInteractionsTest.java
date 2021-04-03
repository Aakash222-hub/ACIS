package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class CasePersonInformationAtTimeOfInteractionsTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(CasePersonInformationAtTimeOfInteractionsTest.class);
	String fosterCaseID;
	public CasePersonInformationAtTimeOfInteractionsTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	@Test(enabled=true,description = "S-615 Case Management - Case Person Information at Time of Interaction-Create Foster care case", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 0)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
				homePage_SFDCPage.clickFirstRecord();
			    //homePage_SFDCPage.searchRecordAndClick("abc");
				//homePage_SFDCPage.searchRecordAndClick(firstName+" "+middleName+" "+lastName);
				fosterCaseID = caseHeadPage.newFosterCase();
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-615 Case Management - Case Person Information at Time of Interaction");
		}

	}
	
	@Test( description = "US:615 Case Management - Case Person Information at Time of Interaction- Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 1)
	public void fosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickRelatedTab();
			fosterCareCase_Page.clickPersonTab();
			fosterCareCase_Page.clickNewPerson();
			personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
			personsInvovled_CP_OmniscriptPage.clickEditButton("first");
			personsInvovled_CP_OmniscriptPage.setAllNames("first", "first","", "last");
			personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
			personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
			personsInvovled_CP_OmniscriptPage.clickNextButton();
			establishRelationships_CP_OmniScriptPage.clickSubmit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:S-615 Case Management - Case Person Information at Time of Interaction- Foster Care Case Add Person");
		}

	}
	
	@Test(enabled = true, description = "S-615 Case Management - Case Person Information at Time of Interaction-Admin Login", groups = {
			"Medium", "acisRegression", "Priyanka" }, priority = 2)
	public void personInformationInteractionAdmin() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickInteractionsTab();
			fosterCareCase_Page.clickscheduleMeetingButton();
			addMeetingAttendeesPage.setMeetingType("TDM");
			addMeetingAttendeesPage.searchPerson("first");
			addMeetingAttendeesPage.clickNextButton();
			selectMeetingLocationDateAndTimePage.selectDateTime();
			selectMeetingLocationDateAndTimePage.selectMethod("Teleconference");
			selectMeetingLocationDateAndTimePage.clickNextButton();
			reviewEditSendPage.clickSubmitButton();
			addMeetingAttendeesPage.clickRelatedTab();
			addMeetingAttendeesPage.clickParticipantId();
			addMeetingAttendeesPage.checkAgeValue();
			addMeetingAttendeesPage.verifyParticipantDetailsField();
		} catch (Exception e) { // TODO Auto-generated catch block
			getStackTrace(e, "Failed US:615 Case Management -Case Person Information at Time of Interaction");
		}
	}

	@Test(enabled = true, description = "S-615 Case Management - Case Person Information at Time of Interaction-Supervisor Login", groups = {
			"Medium", "acisRegression", "Priyanka" }, priority = 3)
	public void personInformationInteractionSupervisor() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickInteractionsTab();
			fosterCareCase_Page.clickscheduleMeetingButton();
			addMeetingAttendeesPage.setMeetingType("TDM");
			addMeetingAttendeesPage.searchPerson("first");
			addMeetingAttendeesPage.clickNextButton();
			selectMeetingLocationDateAndTimePage.selectDateTime();
			selectMeetingLocationDateAndTimePage.selectMethod("Teleconference");
			selectMeetingLocationDateAndTimePage.clickNextButton();
			reviewEditSendPage.clickSubmitButton();
			addMeetingAttendeesPage.clickRelatedTab();
			addMeetingAttendeesPage.clickParticipantId();
			addMeetingAttendeesPage.checkAgeValue();
			addMeetingAttendeesPage.verifyParticipantDetailsField();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:615 Case Management -Case Person Information at Time of Interaction");
		}
	}

	@Test(enabled = true, description = "S-615 Case Management - Case Person Information at Time of Interaction-Investigator Login", groups = {
			"Medium", "acisRegression", "Priyanka" }, priority = 4)
	public void personInformationInteractionInvestigation() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickInteractionsTab();
			fosterCareCase_Page.clickscheduleMeetingButton();
			addMeetingAttendeesPage.setMeetingType("TDM");
			addMeetingAttendeesPage.searchPerson("first");
			addMeetingAttendeesPage.clickNextButton();
			selectMeetingLocationDateAndTimePage.selectDateTime();
			selectMeetingLocationDateAndTimePage.selectMethod("Teleconference");
			selectMeetingLocationDateAndTimePage.clickNextButton();
			reviewEditSendPage.clickSubmitButton();
			addMeetingAttendeesPage.clickRelatedTab();
			addMeetingAttendeesPage.clickParticipantId();
			addMeetingAttendeesPage.checkAgeValue();
			addMeetingAttendeesPage.verifyParticipantDetailsField();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:615 Case Management -Case Person Information at Time of Interaction");
		}
	}
}
