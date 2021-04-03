package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class CasePersonInformationAtTimeOfPlacementTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(CasePersonInformationAtTimeOfPlacementTest.class);
	public CasePersonInformationAtTimeOfPlacementTest() throws AcisException {
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

	
	@Test(enabled=true,description = "US:0616 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 0)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickNewButton();
			placementResourcePage.selectRadioButton();
			placementResourcePage.setTextOnPlacement("AccountName", excel.generateRandomTestData("Demo",3));
			placementResourcePage.setPlacementType("RelativeFoster");
			placementResourcePage.setStatus("Licensed");
			placementResourcePage.selectSpecialNeeds("Medically Complex");
			placementResourcePage.setTextOnPlacement("Capacity", testData.get(Constants.PlacementAccount_SHEET).get("capacity"));
			placementResourcePage.setTextOnPlacement("Occupancy", testData.get(Constants.PlacementAccount_SHEET).get("occupancy"));
			placementResourcePage.clickOnSave();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0616 Case Management   Account");
		}

	}

	@Test(enabled=true,description = "US:0616 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 1)
	public void CreateProviderAccount() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
				homePage_SFDCPage.selectAllAccount();
				homePage_SFDCPage.clickNewButton();
				providerAgencyAccountPage.selectRadioButton();
				providerAgencyAccountPage.setTextOnProvider("AccountName", excel.generateRandomTestData("Demo",4));
				providerAgencyAccountPage.setProviderAgencyType("ChildCare");
				providerAgencyAccountPage.clickOnSave();
				providerAgencyAccountPage.clickRelatedTab();
				providerAgencyAccountPage.clickSiteLocationsTab();
				providerAgencyAccountPage.clickNewSiteLocations();
				providerAgencyAccountPage.setTextOnSite("LocationName", testData.get(Constants.ProviderAgencyAccount_SHEET).get("locationName"));
				providerAgencyAccountPage.setTextOnSite("Street", testData.get(Constants.ProviderAgencyAccount_SHEET).get("street"));
				providerAgencyAccountPage.checkPrimaryCheckBox();
				providerAgencyAccountPage.setTextOnSite("City", testData.get(Constants.ProviderAgencyAccount_SHEET).get("city"));
				providerAgencyAccountPage.setState(testData.get(Constants.ProviderAgencyAccount_SHEET).get("state"));
				providerAgencyAccountPage.setTextOnSite("ZipCode", testData.get(Constants.ProviderAgencyAccount_SHEET).get("zipCode"));
				providerAgencyAccountPage.setTextOnSite("Latitude", testData.get(Constants.ProviderAgencyAccount_SHEET).get("latitude"));
				providerAgencyAccountPage.setTextOnSite("Longitude", testData.get(Constants.ProviderAgencyAccount_SHEET).get("longitude"));
				providerAgencyAccountPage.clickOnSaveSite();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0616 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}

	@Test(enabled=true,description = "US:0616 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = { "High",
			"acisRegression", "Pallavi" }, priority = 2)

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
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0616 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}

	@Test(enabled=true,description = "US:0616 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = { "High",
			"acisRegression", "Pallavi" }, priority = 3)
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

				allegationReportIdNoAfterIsApprove = allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.verifyingAllegationStatusAfterOveride(allegationReportIdNoAfterIsApprove);
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0616 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}

	@Test(enabled=true,description = "US:0616 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 4)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
				homePage_SFDCPage.clickFirstRecord();
			//	homePage_SFDCPage.searchRecordAndClick("abc");
			//	homePage_SFDCPage.searchRecordAndClick(firstName+" "+middleName+" "+lastName);
				fosterCaseID = caseHeadPage.newFosterCase();
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "US:0616 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}
	@Test(description = "US:0616 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 5)
	public void FosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
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
				personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
				personsInvovled_CP_OmniscriptPage.prvoideSuffix("first", "I");
				personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
				personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
				personsInvovled_CP_OmniscriptPage.clickNextButton();
				establishRelationships_CP_OmniScriptPage.clickSubmit();					

				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0616 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}
	

	@Test(description = "US:0616 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 6)
	public void FosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickPlacementTab();
				fosterCareCase_Page.clickNewPlacement();

				newPlacement_OmniScriptPage.enterTextChildTextbox(childFirstName+" "+childLastName);
				newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
				newPlacement_OmniScriptPage.selectICPCPlacement("No");
				newPlacement_OmniScriptPage.selectTypeOfPlacement("Relative Foster");
				newPlacement_OmniScriptPage.enterZipCode("90036");
				newPlacement_OmniScriptPage.selectStartDate();
				newPlacement_OmniScriptPage.clickSearchButton();				
				placementSearchResults_OmniScriptPage.verifyLabels();
				placementSearchResults_OmniScriptPage.selectFirstRecord();
				placementSearchResults_OmniScriptPage.clickSubmitButton();			

				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:616 Case Management - Case Person Information at Time of Placement");
		}

	}
	
	
	@Test(enabled = true, description = "S-616 Case Management - Case Person Information at Time of Placement", groups = { "Medium",
			"acisRegression", "Pallavi" },priority=7)
	public void personInformationPlacement() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickPlacementTab();
			newPlacement_OmniScriptPage.clickPlacementId();			
			newPlacement_OmniScriptPage.clickIconAgeAtTimeOfPlacement();
			newPlacement_OmniScriptPage.placementAddress();
			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:616 Case Management -Case Person Information at Time of Placement");
		}
	}
	
	@Test(enabled = true, description = "S-616 Case Management - Case Person Information at Time of Placement", groups = { "Medium",
			"acisRegression", "Pallavi" },priority=8)
	public void personInformationPlacementAdmin() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
			home.verfiyHomePage();
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickPlacementTab();
			newPlacement_OmniScriptPage.clickPlacementId();			
			newPlacement_OmniScriptPage.clickIconAgeAtTimeOfPlacement();
			newPlacement_OmniScriptPage.placementAddress();
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:616 Case Management -Case Person Information at Time of Placement");
		}
	}
	
	@Test(enabled = true, description = "S-616 Case Management - Case Person Information at Time of Placement", groups = { "Medium",
			"acisRegression", "Pallavi" },priority=9)
	public void personInformationPlacementIntake() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickPlacementTab();
			newPlacement_OmniScriptPage.clickPlacementId();			
			newPlacement_OmniScriptPage.clickIconAgeAtTimeOfPlacement();
			newPlacement_OmniScriptPage.placementAddress();
		
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:616 Case Management -Case Person Information at Time of Placement");
		}
	}
	@Test(enabled = true, description = "S-616 Case Management - Case Person Information at Time of Placement", groups = { "Medium",
			"acisRegression", "Pallavi" },priority=10)
	public void personInformationPlacementSupervisor() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickPlacementTab();
			newPlacement_OmniScriptPage.clickPlacementId();			
			newPlacement_OmniScriptPage.clickIconAgeAtTimeOfPlacement();
			newPlacement_OmniScriptPage.placementAddress();
			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:616 Case Management -Case Person Information at Time of Placement");
		}
	}
	@Test(enabled = true, description = "S-616 Case Management - Case Person Information at Time of Placement", groups = { "Medium",
			"acisRegression", "Pallavi" },priority=11)
	public void personInformationPlacementInvestigation() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickPlacementTab();
			newPlacement_OmniScriptPage.clickPlacementId();			
			newPlacement_OmniScriptPage.clickIconAgeAtTimeOfPlacement();
			newPlacement_OmniScriptPage.placementAddress();
			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:616 Case Management -Case Person Information at Time of Placement");
		}
	}
	
}
