package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class FeedbackUserStoryTest extends TestBase{

	public FeedbackUserStoryTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(FeedbackUserStoryTest.class);
	String fosterCaseID;
	String childSecondFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 4);
	String childSecondMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 4);
	String childSecondLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 4);
	
	
	@Test(enabled=true,description = "US:0794 Person Management - Feedback User Story", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 0)
	public void VerifySearchResultTable() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.setDate("Intake");
			reportDetailsOmniscriptPage.selectIntakeMethod();
			reportDetailsOmniscriptPage
					.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
			reportDetailsOmniscriptPage.setDate("Incident");
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.VerifySearchResultTable();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0794 Person Management - Feedback User Story");
		}

	}
	
	
	
	@Test(enabled=true,description = "US:0794 Person Management - Feedback User Story", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 1)
	public void EditPlacementResourceAccountType() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickNewButton();
			placementResourcePage.selectRadioButton();
			placementResourcePage.setTextOnPlacement("AccountName", excel.generateRandomTestData("Demo", 3));
			placementResourcePage.setPlacementType("RelativeFoster");
			placementResourcePage.setStatus("Applicant");
			placementResourcePage.selectSpecialNeeds("Medically Complex");
			placementResourcePage.setTextOnPlacement("Capacity",
					testData.get(Constants.PlacementAccount_SHEET).get("capacity"));
			placementResourcePage.setTextOnPlacement("Occupancy",
					testData.get(Constants.PlacementAccount_SHEET).get("occupancy"));
			placementResourcePage.clickOnSave();
			providerAgencyAccountPage.clickEdit();
			placementResourcePage.setPlacementType("RelativeFoster");
			providerAgencyAccountPage.verifySubmittedNotStatusValue();
			placementResourcePage.setPlacementType("RegularFoster");
			providerAgencyAccountPage.verifySubmittedNotStatusValue();
			placementResourcePage.setPlacementType("TreatmentFoster");
			providerAgencyAccountPage.verifySubmittedNotStatusValue();
			placementResourcePage.setPlacementType("Kinship");
			providerAgencyAccountPage.verifySubmittedNotStatusValue();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0794 Person Management - Feedback User Story");
		}

	}
	
	
	@Test(enabled=true,description = "US:0794 Person Management - Feedback User Story", groups = {
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
   		    fosterCaseID = caseHeadPage.newFosterCase();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0794 Person Management - Feedback User Story");
		}

	}
	
	@Test(enabled=true,description = "US:0794 Person Management - Feedback User Story", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 3)
	public void fosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
		try {
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
			personsInvovled_CP_OmniscriptPage.clickEditButton("first");
			personsInvovled_CP_OmniscriptPage.setAllNames("first", childSecondFirstName, childSecondMiddleName, childSecondLastName);
			personsInvovled_CP_OmniscriptPage.prvoideSuffix("first", "I");
			personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
			personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
			personsInvovled_CP_OmniscriptPage.clickNextButton();
			establishRelationships_CP_OmniScriptPage.clickSubmit();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0794 Person Management - Feedback User Story");
		}

	}
	
	@Test(enabled=true,description = "US:0794 Person Management - Feedback User Story", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 4)
	public void verifyGenogramLabel() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickRelatedTab();
			fosterCareCase_Page.clickPersonTab();
			fosterCareCase_Page.ClickCasePersonName();
			placementResourcePage.verifyGenogramLabel();
			placementResourcePage.clickHealthTab();
			placementResourcePage.clickNewSpecialNeedsTab();
			placementResourcePage.selectClinicallyDiagnosedDisabilities("Yes");
			placementResourcePage.selectTypePhysicalDisability();
			placementResourcePage.selectConditionADD();
			placementResourcePage.saveButton();
			placementResourcePage.editSpecialNeeds();
			placementResourcePage.selectClinicallyDiagnosedDisabilities("No");
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0794 Person Management - Feedback User Story");
		}

	}
	
	@Test(enabled=true,description = "US:0794 Person Management - Feedback User Story", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 5)
	public void editingRelationShipEndDateReadOnly() throws AcisException, InterruptedException, IOException {
		try {
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
			personsInvovled_CP_OmniscriptPage.clickNextButton();
			establishRelationships_CP_OmniScriptPage.clickCreateAddButton();
			establishRelationships_CP_OmniScriptPage.setEstablishedRelationShip("Other-Other");
			establishRelationships_CP_OmniScriptPage.otherOtherRelationship();
			establishRelationships_CP_OmniScriptPage.cancelBtn();
			establishRelationships_CP_OmniScriptPage.clickCreateAddButtonPlacementResourceRelationships();
			establishRelationships_CP_OmniScriptPage.setRelationShipPlacementResourceRelationships("Foster Parent-Foster Child");
			establishRelationships_CP_OmniScriptPage.VerifyEndDateIsReadOnly();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0794 Person Management - Feedback User Story");
		}

	}
	
	@Test(enabled=true,description = "US:0794 Person Management - Feedback User Story", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 6)
	public void otherRelationship() throws AcisException, InterruptedException, IOException {
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
			personsInvovled_CP_OmniscriptPage.clickNextButton();
			establishRelationships_CP_OmniScriptPage.clickCreateAddButtonPlacementResourceRelationships();
			establishRelationships_CP_OmniScriptPage.setRelationShipPlacementResourceRelationships("Foster Parent-Foster Child");
			establishRelationships_CP_OmniScriptPage.VerifyEndDateIsReadOnly();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0794 Person Management - Feedback User Story");
		}

	}
}
