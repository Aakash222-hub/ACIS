package com.acis.automation.testcases.casemanagement;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class AutocreatePlacementResourceFosterChildRelationshipTest extends TestBase{
	
	public  AutocreatePlacementResourceFosterChildRelationshipTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	final static Logger logger = LoggerFactory.getLogger(AutocreatePlacementResourceFosterChildRelationshipTest.class);
	String fosterCaseID,allegationID;
	
	String childSecondFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 4);
	String childSecondMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 4);
	String childSecondLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 4);
	String placementName = excel
			.generateRandomTestData("PDemo", 3);
	
	@Test(description = "US:770 Case Management -  Auto-create Placement Resource-Foster Child Relationship-Create Foster Care Case", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 0)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {logger.info("Clicked on DownArrow"+placementName);
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.clickFirstRecord();
			//homePage_SFDCPage.selectAllCaseHeads();
			//homePage_SFDCPage.searchRecordAndClick("Case Head New");
			fosterCaseID = caseHeadPage.newFosterCase();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0770 Case Management - Auto-create Placement Resource-Foster Child Relationship-Create Foster Care Case");
		}

	}
	
	
	 @Test(description = "US-770 Case Management -  Auto-create Placement Resource-Foster Child Relationship-Create Placement Account", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 1)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickNewButton();
			placementResourcePage.selectRadioButton();
			placementResourcePage.setTextOnPlacement("AccountName", placementName);
			placementResourcePage.setPlacementType("RelativeFoster");
			placementResourcePage.setTextOnPlacement("Capacity", "10");
			placementResourcePage.setTextOnPlacement("Occupancy", "1");
			placementResourcePage.setStatus("Licensed");
			placementResourcePage.selectSpecialNeeds("Medically Complex");
			placementResourcePage.clickOnSave();
			placementResourcePage.clickRelatedTab();
			placementResourcePage.clickSiteLocationsTab();
			placementResourcePage.clickNewSiteLocations();
			placementResourcePage.setTextOnSite("LocationName", "Demo Location");
			placementResourcePage.setTextOnSite("Street", "510 S Burnside Ave");
			placementResourcePage.checkPrimaryCheckBox();
			placementResourcePage.setTextOnSite("City", "Los Angeles");
			placementResourcePage.setState("California");
			placementResourcePage.setTextOnSite("ZipCode", "99366");
			providerAgencyAccountPage.clickOnSaveSite();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:770 Case Management -  Auto-create Placement Resource-Foster Child Relationship-Create Placement Account");
		}

	}
	

	@Test( description = "US:770 Case Management -  Auto-create Placement Resource-Foster Child Relationship- Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 2)
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
					"Failed US:770 Case Management - Auto-create Placement Resource-Foster Child Relationship- Foster Care Case Add Person");
		}

	}
	
	@Test( description = "US:770 Case Management -  Auto-create Placement Resource-Foster Child Relationship- Foster Care Case Person mapped with placement", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 3)
	public void fosterCareCaseMappedWithPlacement() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickPlacementTab();
			fosterCareCase_Page.clickNewPlacement();
			//newPlacement_OmniScriptPage.click
			newPlacement_OmniScriptPage.enterTextChildTextbox(childSecondFirstName+" "+childSecondLastName);
			newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
			newPlacement_OmniScriptPage.selectICPCPlacement("No");			
			newPlacement_OmniScriptPage.selectTypeOfPlacement("Relative Foster");
			newPlacement_OmniScriptPage.enterZipCode("99366");
			newPlacement_OmniScriptPage.selectStartDate();	
			newPlacement_OmniScriptPage.clickSearchButton();
			placementSearchResults_OmniScriptPage.verifyLabels();
			placementSearchResults_OmniScriptPage.selectFirstRecord();
			placementSearchResults_OmniScriptPage.clickSubmitButton();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:770 Case Management - Auto-create Placement Resource-Foster Child Relationship- Foster Care Case Person mapped with placement");
		}
	}
	

	@Test(description = "US:770 Case Management - Auto-create Placement Resource-Foster Child Relationship- Verify End/Start Dates", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 4)
	public void fosterCareCaseVerifyEndDate() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickPlacementTab();	
			String placementstartDate=newPlacement_OmniScriptPage.getPlacementStartDate();
			String placementEndDate=newPlacement_OmniScriptPage.editEndDateManuallyAndGetEndDate();	
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
		
			fosterCareCase_Page.clickOnCaseHeadValue();
			caseHeadPage.clickRelatedTab("Second Related tab");
			caseHeadPage.clickHouseholdRelationshipsLink();
			caseHeadPage.clickHouseholdRelationshipsId(placementName);
			householdRelationshipPage.VerifyEndDates(placementEndDate);
			householdRelationshipPage.VerifyStartDates(placementstartDate);
			householdRelationshipPage.VerifyEndDateIsReadOnly(placementEndDate);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:770 Case Management - Auto-create Placement Resource-Foster Child Relationship- Verify End Dates");
		}
	}
	
}