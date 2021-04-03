package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PlacementSearchOmniscriptUpdatesTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(PlacementSearchOmniscriptUpdatesTest.class);

	public PlacementSearchOmniscriptUpdatesTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String fosterCaseID, allegationID;

	String childSecondFirstName = excel.generateRandomTestData("Am", 5);
	String childSecondMiddleName = excel.generateRandomTestData("Mb", 4);
	String childSecondLastName = excel.generateRandomTestData("Lb", 5);
	String placementName = excel.generateRandomTestData("PDemo", 3);
	String zip=excel.generateRandomNumber("2",4);

	@Test(description = "US:835 Case Management -  Placement Search Omniscript Updates-Create Foster Care Case", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 0)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			logger.info("Clicked on DownArrow" + placementName);
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.clickFirstRecord();
			// homePage_SFDCPage.selectAllCaseHeads();
			// homePage_SFDCPage.searchRecordAndClick("Case Head New");
			fosterCaseID = caseHeadPage.newFosterCase();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0835 Case Management - Placement Search Omniscript Updates-Create Foster Care Case");
		}

	}

	@Test(description = "US-835 Case Management - Placement Search Omniscript Updates-Create Placement Account", groups = {
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
//			placementResourcePage.setTextOnSite("LocationName", "Demo Location");
			placementResourcePage.setTextOnSite("Street", "510 S Burnside Ave");
			placementResourcePage.setTextOnSite("LocationName", "Demo Location");
			placementResourcePage.checkPrimaryCheckBox();
			placementResourcePage.setTextOnSite("City", "Los Angeles");
			placementResourcePage.setState("California");
			placementResourcePage.setTextOnSite("ZipCode", zip);
			providerAgencyAccountPage.clickOnSaveSite();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:770 Case Management -  Auto-create Placement Resource-Foster Child Relationship-Create Placement Account");
		}

	}

	@Test(description = "US:835 Case Management -  Placement Search Omniscript Updates- Foster Care Case Add Person", groups = {
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
			personsInvovled_CP_OmniscriptPage.searchNewPerson(childSecondFirstName);
			personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
			personsInvovled_CP_OmniscriptPage.setAllNames("first", childSecondFirstName, childSecondMiddleName, childSecondLastName);
			personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
			personsInvovled_CP_OmniscriptPage.clickSaveButton("next");
			personsInvovled_CP_OmniscriptPage.clickNextButton();
			establishRelationships_CP_OmniScriptPage.clickSubmit();
			


		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:835 Case Management - Placement Search Omniscript Updates- Foster Care Case Add Person");
		}

	}

	@Test(description = "US:835 Case Management -  Placement Search Omniscript Updates- Case Worker Login:Foster Care Case Person mapped with placement and Verify Placement name", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 3)
	public void fosterCareCaseMappedWithPlacementCaseWorker() throws AcisException, InterruptedException, IOException {
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
			
			newPlacement_OmniScriptPage.clickDownIconEdit();
			//newPlacement_OmniScriptPage.enterTextChildTextbox(childSecondFirstName + " " + childSecondLastName);
			newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
			newPlacement_OmniScriptPage.saveButton();
			newPlacement_OmniScriptPage.selectICPCPlacement("No");
			newPlacement_OmniScriptPage.selectTypeOfPlacement("Relative Foster");
			newPlacement_OmniScriptPage.enterZipCode(zip);
			newPlacement_OmniScriptPage.selectStartDate();
			newPlacement_OmniScriptPage.clickSearchButton();
			placementSearchResults_OmniScriptPage.verifyLabels();
			placementSearchResults_OmniScriptPage.verifyPlacementRecord(placementName);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:835 Case Management -Placement Search Omniscript Updates- Foster Care Case Person mapped with placement");
		}
	}
	@Test(description = "US:835 Case Management -  Placement Search Omniscript Updates- Investigator Login:Foster Care Case Person mapped with placement and Verify Placement name", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 4)
	public void fosterCareCaseMappedWithPlacementInvestigator() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickPlacementTab();
			fosterCareCase_Page.clickNewPlacement();
			
			newPlacement_OmniScriptPage.clickDownIconEdit();
			//newPlacement_OmniScriptPage.enterTextChildTextbox(childSecondFirstName + " " + childSecondLastName);
			newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
			newPlacement_OmniScriptPage.saveButton();
			newPlacement_OmniScriptPage.selectICPCPlacement("No");
			newPlacement_OmniScriptPage.selectTypeOfPlacement("Relative Foster");
			newPlacement_OmniScriptPage.enterZipCode(zip);
			newPlacement_OmniScriptPage.selectStartDate();
			newPlacement_OmniScriptPage.clickSearchButton();
			placementSearchResults_OmniScriptPage.verifyLabels();
			placementSearchResults_OmniScriptPage.verifyPlacementRecord(placementName);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:835 Case Management -Placement Search Omniscript Updates- Foster Care Case Person mapped with placement");
		}
	}
}