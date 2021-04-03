package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class UpdateSaveforLaterTest extends TestBase{

	final static Logger logger = LoggerFactory.getLogger(UpdateSaveforLaterTest.class);
	public UpdateSaveforLaterTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	String allegationID, fosterCaseID;

	String firstName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 2);
	String middleName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 2);
	String lastName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 2);
	
	String childFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 3);
	String childMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
	String childLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 3);


	@Test(enabled=true,description = "S-669 On all Omniscript - Update Save For Later", groups = { "High",
			"acisRegression", "Pallavi" }, priority = 0)

	public void OverrideScreeningDecission() throws AcisException, InterruptedException, IOException {
		try {
		String firstnameReporterDetail = excel
				.generateRandomTestData(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"), 6);
		String lastnameReporterDetail = excel
				.generateRandomTestData(testData.get(Constants.REPORTDETAILSPAGE).get("lastName"), 6);
		String middlenameReporterDetail = excel
				.generateRandomTestData(testData.get(Constants.REPORTDETAILSPAGE).get("middleName"), 6);

		String phoneReporterDetail = excel
				.generateRandomTestData(testData.get(Constants.REPORTDETAILSPAGE).get("phone"), 6);
		String emailReporterDetail = excel
				.generateRandomTestData(testData.get(Constants.REPORTDETAILSPAGE).get("email"), 6);
		String roleReporterDetail = excel.generateRandomTestData(testData.get(Constants.REPORTDETAILSPAGE).get("role"),
				6);
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				home.verfiyHomePage();
				
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.clickNewButton();
				reportDetailsOmniscriptPage.setDate("Intake");
				reportDetailsOmniscriptPage.selectIntakeMethod();
				reportDetailsOmniscriptPage.reporterAnonymousNo(firstnameReporterDetail, lastnameReporterDetail,
				middlenameReporterDetail, phoneReporterDetail, emailReporterDetail, roleReporterDetail);
				reportDetailsOmniscriptPage
						.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
				reportDetailsOmniscriptPage.setDate("Incident");
				reportDetailsOmniscriptPage.clickNextBtn();
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
				searchPerson_OmniscriptPage.linkToCreateNewPerson();

				createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
				createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
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
				screeningDecision_OmniscriptPage.clickSubmitbtn();

				allegationID = allegationReportPage.getAllegationID();
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-669 On all Omniscript - Update Save For Later - Create Service Referral intake creation");
		}

	}

	@Test(enabled=true,description = "S-669 On all Omniscript - Update Save For Later", groups = { "High",
			"acisRegression", "Pallavi" }, priority = 1)
	public void OverrideSupervisor() throws AcisException, InterruptedException, IOException {
		try {
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

//				allegationReportIdNoAfterIsApprove = allegationReportPage.verifyingAllegationReportStatus();
//				allegationReportPage.verifyingAllegationStatusAfterOveride(allegationReportIdNoAfterIsApprove);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-669 On all Omniscript - Update Save For Later");
		}

	}

	
	@Test(enabled=true,description = "S-669 On all Omniscript - Update Save For Later", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 2)
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
			//	homePage_SFDCPage.searchRecordAndClick(firstName+" "+middleName+" "+lastName);
				fosterCaseID = caseHeadPage.newFosterCase();
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-669 On all Omniscript - Update Save For Later");
		}

	}
	
	
	
	
	@Test(enabled = true, description = "S-669 On all Omniscript - Update Save For Later", groups = { "High",
			"acisRegression", "Pallavi" },priority=3)
	public void saveForLaterIntake() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
		//	reportDetailsOmniscriptPage.selectIntakeMethod();
			reportDetailsOmniscriptPage.clickSaveForLater();
			reportDetailsOmniscriptPage.clickOk();
			reportDetailsOmniscriptPage.verifySaveForLater();
			homePage_SFDCPage.clickDownArrowHome();
			reportDetailsOmniscriptPage.verifyColumnsTitles();
			reportDetailsOmniscriptPage.clickHereToContinue();
			

			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:669 On all Omniscript - Update Save For Later");
		}
	}
	
	
	@Test(enabled = true, description = "S-669 On all Omniscript - Update Save For Later", groups = { "High",
			"acisRegression", "Pallavi" },priority=4)
	public void existingIntakeSaveForLaterIntake() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID); 		
			reportDetailsOmniscriptPage.clickIntakeRecord();
			reportDetailsOmniscriptPage.clickSaveForLater();
			reportDetailsOmniscriptPage.clickOk();
			reportDetailsOmniscriptPage.verifySaveForLater();
			homePage_SFDCPage.clickDownArrowHome();
			reportDetailsOmniscriptPage.verifyColumnsTitles();
			reportDetailsOmniscriptPage.clickHereToContinue();
			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:669 On all Omniscript - Update Save For Later");
		}
	}
	
	
	
	@Test(enabled = true, description = "S-669 On all Omniscript - Update Save For Later", groups = { "High",
			"acisRegression", "Pallavi" },priority=5)
	public void saveForLaterInvestigation() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseActions();
			homePage_SFDCPage.selectMyInvestigation();
			investigationCasePage.clickOnFirstRecord();
			investigationCasePage.clickInvestigationWorkflow();
			reviewAllegationReport_OmniScriptPage.clickSaveForLater();
			reviewAllegationReport_OmniScriptPage.clickOk();
			reviewAllegationReport_OmniScriptPage.verifySaveForLater();
			homePage_SFDCPage.clickDownArrowHome();
			reportDetailsOmniscriptPage.verifyColumnsTitles();
			reportDetailsOmniscriptPage.clickHereToContinue();
			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:669 On all Omniscript - Update Save For Later");
		}
	}
	
	@Test(enabled = true, description = "S-669 On all Omniscript - Update Save For Later", groups = { "High",
			"acisRegression", "Pallavi" },priority=6)
	public void safetyAssessmentSaveForLaterInvestigation() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseActions();
			homePage_SFDCPage.selectMyInvestigation();
			investigationCasePage.clickOnFirstRecord();
				
			//Safety Assessment
			fosterCareCase_Page.clickRelatedTab();
			investigationCasePage.clickNewSafetyAssessmentButton();
			reviewAllegationReport_OmniScriptPage.clickSaveForLater();
			reviewAllegationReport_OmniScriptPage.clickOk();
			reviewAllegationReport_OmniScriptPage.verifySaveForLater();
			homePage_SFDCPage.clickDownArrowHome();
			reportDetailsOmniscriptPage.verifyColumnsTitles();
			reportDetailsOmniscriptPage.clickHereToContinue();
			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:669 On all Omniscript - Update Save For Later");
		}
	}
	@Test(enabled = true, description = "S-669 On all Omniscript - Update Save For Later", groups = { "High",
			"acisRegression", "Pallavi" },priority=7)
	public void decisionMakingSaveForLaterInvestigation() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseActions();
			homePage_SFDCPage.selectMyInvestigation();
			investigationCasePage.clickOnFirstRecord();
			
			//decision Making Tool
			fosterCareCase_Page.clickRelatedTab();
			fosterCareCase_Page.relatedAssessment();
			fosterCareCase_Page.clickDecisionMakingTool();
//			investigationCasePage.decisionMakingTool();
			reviewAllegationReport_OmniScriptPage.clickSaveForLater();
			reviewAllegationReport_OmniScriptPage.clickOk();
			reviewAllegationReport_OmniScriptPage.verifySaveForLater();
			homePage_SFDCPage.clickDownArrowHome();
			reportDetailsOmniscriptPage.verifyColumnsTitles();
			reportDetailsOmniscriptPage.clickHereToContinue();
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:669 On all Omniscript - Update Save For Later");
		}
	}
	@Test(enabled = true, description = "S-669 On all Omniscript - Update Save For Later", groups = { "High",
			"acisRegression", "Pallavi" },priority=8)
	public void investigatioPersonSaveForLaterInvestigation() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseActions();
			homePage_SFDCPage.selectMyInvestigation();
			investigationCasePage.clickOnFirstRecord();
	//		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID); //C-00001932

			//Investigation Person
			investigationCasePage.clickRelatedTab();
//			investigationCasePage.clickCasePersonTab();
			fosterCareCase_Page.clickNewPerson();
			investigationCasePage.clickSaveForLater();
			investigationCasePage.clickOk();
			investigationCasePage.verifySaveForLater();
			homePage_SFDCPage.clickDownArrowHome();
			reportDetailsOmniscriptPage.verifyColumnsTitles();
			reportDetailsOmniscriptPage.clickHereToContinue();
			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:669 On all Omniscript - Update Save For Later");
		}
	}
	
	@Test(enabled = true, description = "S-669 On all Omniscript - Update Save For Later", groups = { "High",
			"acisRegression", "Pallavi" },priority=9)
	public void saveForLaterOOH() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			
			//New Comprehensive Assessment
			newComprehensiveAssessmentpage.clickOnNewComprehenssieAssessment();
			newComprehensiveAssessmentpage.clickSaveForLater();
			newComprehensiveAssessmentpage.clickOk();
			newComprehensiveAssessmentpage.omniscriptSaveForLater();
			homePage_SFDCPage.clickDownArrowHome();
			reportDetailsOmniscriptPage.verifyColumnsTitles();
			reportDetailsOmniscriptPage.clickHereToContinue();
			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:669 On all Omniscript - Update Save For Later");
		}
	}
		
	@Test(enabled = true, description = "S-669 On all Omniscript - Update Save For Later", groups = { "High",
				"acisRegression", "Pallavi" },priority=10)
	public void placementSaveForLaterOOH() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();	
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();			
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			//Placement
			fosterCareCase_Page.clickPlacementTab();
			fosterCareCase_Page.clickNewPlacement();
			newPlacement_OmniScriptPage.clickSaveForLaterButton();
			newPlacement_OmniScriptPage.clickOk();
			newPlacement_OmniScriptPage.omniscriptSaveForLater();
			homePage_SFDCPage.clickDownArrowHome();
			reportDetailsOmniscriptPage.verifyColumnsTitles();
			reportDetailsOmniscriptPage.clickHereToContinue();
			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:669 On all Omniscript - Update Save For Later");
		}
	}
	
	@Test(enabled = true, description = "S-669 On all Omniscript - Update Save For Later", groups = { "High",
			"acisRegression", "Pallavi" },priority=11)
	public void courtActionSaveForLaterOOH() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			//Court Action
			fosterCareCase_Page.clickCourtAction();
			fosterCareCase_Page.clickNewCourtAction();
			courtActionOutcomesPage.clickSaveForLater();
			courtActionOutcomesPage.clickOk();
			courtActionOutcomesPage.omniscriptSaveForLater();
			homePage_SFDCPage.clickDownArrowHome();
			reportDetailsOmniscriptPage.verifyColumnsTitles();
			reportDetailsOmniscriptPage.clickHereToContinue();
			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:669 On all Omniscript - Update Save For Later");
		}
	}

	@Test(enabled = true, description = "S-669 On all Omniscript - Update Save For Later", groups = { "High",
			"acisRegression", "Pallavi" },priority=12)
	public void scheduleMeetingSaveForLaterOOH() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			//Schedule Meeting
			//fosterCareCase_Page.clickInteractions();
			addMeetingAttendeesPage.clickScheduleMeetingButton();
			addMeetingAttendeesPage.setMeetingType("TDM");
			addMeetingAttendeesPage.clickSaveForLater();
			addMeetingAttendeesPage.clickOk();
			addMeetingAttendeesPage.omniscriptSaveForLater();
			homePage_SFDCPage.clickDownArrowHome();
			reportDetailsOmniscriptPage.verifyColumnsTitles();
			reportDetailsOmniscriptPage.clickHereToContinue();
			
			
			}catch (Exception e) {
				// TODO Auto-generated catch block
				getStackTrace(e,
						"Failed US:669 On all Omniscript - Update Save For Later");
			}
			}
	@Test(enabled = true, description = "S-669 On all Omniscript - Update Save For Later", groups = { "High",
			"acisRegression", "Pallavi" },priority=13)
	public void serviceReferralSaveForLaterOOH() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			//Service Referral
			fosterCareCase_Page.clickServiceReferralTab();
			fosterCareCase_Page.clickNewServiceReferral();
			serviceReferralPage.selectingTypeOfService("ChildCare");
			serviceReferralPage.clickSaveForLater();
			serviceReferralPage.clickOk();
			serviceReferralPage.omniscriptSaveForLater();
			homePage_SFDCPage.clickDownArrowHome();
			reportDetailsOmniscriptPage.verifyColumnsTitles();
			reportDetailsOmniscriptPage.clickHereToContinue();
			
			
			}catch (Exception e) {
				// TODO Auto-generated catch block
				getStackTrace(e,
						"Failed US:669 On all Omniscript - Update Save For Later");
			}
			}
	@Test(enabled = true, description = "S-669 On all Omniscript - Update Save For Later", groups = { "High",
			"acisRegression", "Pallavi" },priority=14)
	public void familyAssessmentSaveForLaterOOH() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			//New Family Assessment
			fosterCareCase_Page.clickRelatedTab();
			fosterCareCase_Page.relatedAssessment();
			fosterCareCase_Page.clickNFAssessmentsTab();
		//	fosterCareFamilyNeedsAssessmentpage.livingarrangementsAssessmentDropdown("Crisis");
			fosterCareFamilyNeedsAssessmentpage.clickSaveForLater();
			fosterCareFamilyNeedsAssessmentpage.clickOk();
			fosterCareFamilyNeedsAssessmentpage.omniscriptSaveForLater();
			homePage_SFDCPage.clickDownArrowHome();
			reportDetailsOmniscriptPage.verifyColumnsTitles();
			reportDetailsOmniscriptPage.clickHereToContinue();
			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:669 On all Omniscript - Update Save For Later");
		}
	}

}

