package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class CaseTransferRequestInternalCaseTransferTest extends TestBase{

	public CaseTransferRequestInternalCaseTransferTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(CaseTransferRequestInternalCaseTransferTest.class);
	String fosterCaseID;
	
	@Test(enabled=true,description = "S:405 Case Management - Case Transfer Request- Internal case transfer", groups = {
			"High", "acisRegression", "Pallavi" }, priority =0 )
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
   			homePage_SFDCPage.selectAllCaseHeads();
   		    homePage_SFDCPage.clickFirstRecord();
   		    fosterCaseID = caseHeadPage.newFosterCase();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S:405 Case Management - Case Transfer Request- Internal case transfer");
		}

	}
	
	@Test(enabled=true,description = "S:405 Case Management - Case Transfer Request- Internal case transfer", groups = {
			"High", "acisRegression", "Pallavi" }, priority =1 )
	public void CreateCaseTransferMeeting() throws AcisException, InterruptedException, IOException {
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
			addMeetingAttendeesPage.setMeetingTypeCaseTransfer("Case Transfer");
			addMeetingAttendeesPage.EnterCaseOwner("Bhavya");
			addMeetingAttendeesPage.EnterReceivingCaseOwner("Bhavya");
			addMeetingAttendeesPage.EnterTransferringSupervisorCaseOwner("Bhavya");
			addMeetingAttendeesPage.EnterReceivingSupervisorCaseOwner("Bhavya");
			addMeetingAttendeesPage.clickCreateAddButton();
			addMeetingAttendeesPage.userTextBox("Bhavya");
			addMeetingAttendeesPage.ClickSave();
			addMeetingAttendeesPage.clickNextButton();
			selectMeetingLocationDateAndTimePage.selectMethod("Teleconference");
		//	selectMeetingLocationDateAndTimePage.setText("location", "Demo Location");
			selectMeetingLocationDateAndTimePage.setText("facilitator", "facilitator box");
			selectMeetingLocationDateAndTimePage.selectDateTime();
			selectMeetingLocationDateAndTimePage.clickNextButton();
			reviewEditSendPage.previewEmail();
			reviewEditSendPage.clickSubmitButton();
			interactionDetailPage.ClickRelatedTab();
			interactionDetailPage.clickUserTab();
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S:405 Case Management - Case Transfer Request- Internal case transfer");
		}

	}
	
	@Test(enabled=true,description = "S:405 Case Management - Case Transfer Request- Internal case transfer", groups = {
			"High", "acisRegression", "Pallavi" }, priority =2 )
	public void CaseTransferMeetingEdit() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase("C-00001348");
			fosterCareCase_Page.clickInteractionsTab();
			interactionDetailPage.clickCaseTransferInteractionId();
			interactionDetailPage.ClickShowMoreAction();
			addMeetingAttendeesPage.EnterCaseOwner("Bhavya");
			addMeetingAttendeesPage.EnterReceivingCaseOwner("Demo");
			addMeetingAttendeesPage.EnterTransferringSupervisorCaseOwner("Swathi");
			addMeetingAttendeesPage.EnterReceivingSupervisorCaseOwner("Travis");
			addMeetingAttendeesPage.clickNextButton();
	//		selectMeetingLocationDateAndTimePage.EditSetLocation("Edited Set Location");
			selectMeetingLocationDateAndTimePage.EditSetFacilator("Edited Facilator");
			selectMeetingLocationDateAndTimePage.clickNextButton();
			reviewEditSendPage.clickSubmitButton();
	//		interactionDetailPage.ClickEditbtn();
			
			interactionDetailPage.ClickRelatedTab();
			interactionDetailPage.clickUserTab();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S:405 Case Management - Case Transfer Request- Internal case transfer");
		}

	}
}
