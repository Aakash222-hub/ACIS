package com.acis.automation.testcases.casemanagement;

import java.awt.AWTException;
import java.io.IOException;
import java.text.ParseException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class OutOfHomeServicesCaseClosureTest  extends TestBase {
	
	public OutOfHomeServicesCaseClosureTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(OutOfHomeServicesCaseClosureTest.class);

	String allegationID,fosterCaseID , fullName;
	String allegationID1,fosterCaseID1 , fullName1;
	int count,count1;
	
	
	
	@Test(description = "US:0219 : Out-of-Home Services Case Closure by Case Worker : Intake creation", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 0)

		public void outOfHomeServicesCaseClosureIntake() throws AcisException, InterruptedException, IOException {
			try {

			String firstName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),4);
			String middleName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),3);
			String lastName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"),5);
			fullName = firstName+" "+middleName+" "+lastName;
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.setDate("Intake");
			reportDetailsOmniscriptPage.selectIntakeMethod();
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			
			createIntakePerson_OmniscriptPage.setAllNames(firstName,middleName,lastName);
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
			createIntakePerson_OmniscriptPage
					.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage
					.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
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
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
			screeningDecision_OmniscriptPage.clickSubmitbtn();

			allegationID = allegationReportPage.getAllegationID();
			homePage_SFDCPage.closeTabs();
			count++;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria intake creation");
		}

	}

	@Test(description = "US:0219 : Out-of-Home Services Case Closure by Case Worker : Intake approval", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 1)
	public void outOfHomeServicesCaseClosureTestSupervisor() throws AcisException, Exception {
		
		if(count==1)
		{	
			String allegationReportIdNoAfterIsApprove = "";

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

			allegationReportIdNoAfterIsApprove = allegationReportPage.verifyingAllegationReportStatus();
			allegationReportPage.verifyingAllegationStatusAfterOveride(allegationReportIdNoAfterIsApprove);
			homePage_SFDCPage.closeTabs();
			count++;
		} 
		else {
			throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
		}

	}



		@Test(description = " US:0219 : Out-of-Home Services Case Closure by Case Worker :Intake", groups = { "High",
				"aCIS_Regression", "Mrunal" },priority = 2)
		public void outOfHomeServicesCaseClosureActual() throws AcisException, Exception {
			
			if(count==2)
			{	
				
			System.out.println("in test case 60");
			

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			String file_one = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";
			String file_two = Constants.UPLOAD_FILE_PATH + "Akashdemo.txt";
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
			homePage_SFDCPage.searchRecordAndClick(fullName);
			fosterCaseID=caseHeadPage.newFosterCase();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			
			fosterCareCase_Page.clickCloseCaseButton();
			System.out.println(file_one);
			uploadSupportingDocumentationPage.uploadSupportFile(file_one);
			uploadSupportingDocumentationPage.uploadSupportFile(file_two);
			uploadSupportingDocumentationPage.deleteFileUploaded("Akashdemo.txt");
			uploadSupportingDocumentationPage.clickNextBtn();
			caseClosureDecisionPage.enterTextFieldValue("Demo comment");
			caseClosureDecisionPage.clickSubmitbtn();
			caseActionPage.checkStatusValue("Submitted");
			homePage_SFDCPage.closeTabs();
		}
		
		else {
			throw new Exception("Pre-requisite for Intake Approval Does Not completed Successfully, so can not run this test");
		}
			
		}
		
		
		@Test(description = "US:0219 : Out-of-Home Services Case Closure by Case Worker :Investigation: Intake creation", groups = { "High",
				"acisRegression", "Mrunal" }, priority = 3)

			public void outOfHomeServicesCaseClosureIntakeForInvestigation() throws AcisException, InterruptedException, IOException {
				try {

				String firstName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),4);
				String middleName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),3);
				String lastName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"),5);
				fullName1 = firstName+" "+middleName+" "+lastName;
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				home.verfiyHomePage();

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.clickNewButton();
				reportDetailsOmniscriptPage.setDate("Intake");
				reportDetailsOmniscriptPage.selectIntakeMethod();
				reportDetailsOmniscriptPage.clickNextBtn();
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
				searchPerson_OmniscriptPage.linkToCreateNewPerson();
				
				createIntakePerson_OmniscriptPage.setAllNames(firstName,middleName,lastName);
				createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
				createIntakePerson_OmniscriptPage
						.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
				createIntakePerson_OmniscriptPage
						.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
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
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
				screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
				screeningDecision_OmniscriptPage.clickSubmitbtn();

				allegationID1 = allegationReportPage.getAllegationID();
				homePage_SFDCPage.closeTabs();
				count1++;

			} catch (Exception e) {
				// TODO Auto-generated catch block
				getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria intake creation");
			}

		}

		@Test(description = "US:0219 : Out-of-Home Services Case Closure by Case Worker :Investigation: Intake approval", groups = { "High",
				"acisRegression", "Mrunal" }, priority = 4)
		public void outOfHomeServicesCaseClosureTestSupervisorForInvestigtion() throws AcisException, Exception {
			
			if(count1==1)
			{	
				String allegationReportIdNoAfterIsApprove = "";

				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();

				homePage_SFDCPage.searchGlobal(allegationID1);
				allegationReportPage.clickIntakeBtn();
				reportDetailsOmniscriptPage.clickNextBtn();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.selectAcceptAssign();
				screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
				screeningDecision_OmniscriptPage.clickSubmitbtn();

				allegationReportIdNoAfterIsApprove = allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.verifyingAllegationStatusAfterOveride(allegationReportIdNoAfterIsApprove);
				homePage_SFDCPage.closeTabs();
				count1++;
			} 
			else {
				throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
			}

		}



			@Test(description = " US:0219 : Out-of-Home Services Case Closure by Case Worker :Investigation", groups = { "High",
					"aCIS_Regression", "Mrunal" },priority = 5)
			public void outOfHomeServicesCaseClosureActualInvestigation() throws AcisException, Exception {
				
				if(count1==2)
				{	
					
				System.out.println("in test case 60");
				

				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
				home.verfiyHomePage();
				String file_one = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";
				String file_two = Constants.UPLOAD_FILE_PATH + "Akashdemo.txt";
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
				homePage_SFDCPage.searchRecordAndClick(fullName1);
				fosterCaseID1=caseHeadPage.newFosterCase();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID1);
				
				fosterCareCase_Page.clickCloseCaseButton();
				System.out.println(file_one);
				uploadSupportingDocumentationPage.uploadSupportFile(file_one);
				uploadSupportingDocumentationPage.uploadSupportFile(file_two);
				uploadSupportingDocumentationPage.deleteFileUploaded("Akashdemo.txt");
				uploadSupportingDocumentationPage.clickNextBtn();
				caseClosureDecisionPage.enterTextFieldValue("Demo comment");
				caseClosureDecisionPage.clickSubmitbtn();
				caseActionPage.checkStatusValue("Submitted");
				homePage_SFDCPage.closeTabs();
				
			}
			
			else {
				throw new Exception("Pre-requisite for Intake Approval Does Not completed Successfully, so can not run this test");
			}
				
			}	
}
