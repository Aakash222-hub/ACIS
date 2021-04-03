package com.acis.automation.testcases.casemanagement;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class UpdateChildPlacementsTest extends TestBase{
	
	public  UpdateChildPlacementsTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	final static Logger logger = LoggerFactory.getLogger(UpdateChildPlacementsTest.class);
	String fosterCaseID,allegationID;
	
	String firstName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
	String middleName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
	String lastName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);
	
	String childSecondFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 4);
	String childSecondMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 4);
	String childSecondLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 4);
	
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
			placementResourcePage.setTextOnPlacement("AccountName", excel.generateRandomTestData("Demo", 3));
			placementResourcePage.setPlacementType("RelativeFoster");
			placementResourcePage.setStatus("Applicant");
			placementResourcePage.selectSpecialNeeds("Medically Complex");
			placementResourcePage.setTextOnPlacement("Capacity",
					testData.get(Constants.PlacementAccount_SHEET).get("capacity"));
			placementResourcePage.setTextOnPlacement("Occupancy",
					testData.get(Constants.PlacementAccount_SHEET).get("occupancy"));
			placementResourcePage.clickOnSave();
			placementResourcePage.clickRelatedTab();
			placementResourcePage.clickSiteLocationsTab();
			placementResourcePage.clickNewSiteLocations();
			placementResourcePage.setTextOnSite("Street", testData.get(Constants.PlacementAccount_SHEET).get("street"));
			placementResourcePage.setTextOnSite("LocationName",
					testData.get(Constants.PlacementAccount_SHEET).get("locationName"));
			placementResourcePage.checkPrimaryCheckBox();
			placementResourcePage.setTextOnSite("City", testData.get(Constants.PlacementAccount_SHEET).get("city"));
			placementResourcePage.setState(testData.get(Constants.PlacementAccount_SHEET).get("state"));
			placementResourcePage.setTextOnSite("ZipCode",
					testData.get(Constants.PlacementAccount_SHEET).get("zipCode"));
			placementResourcePage.setTextOnSite("Latitude",
					testData.get(Constants.PlacementAccount_SHEET).get("latitude"));
			placementResourcePage.setTextOnSite("Longitude",
					testData.get(Constants.PlacementAccount_SHEET).get("longitude"));
			providerAgencyAccountPage.clickOnSaveSite();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0616 Case Management   Account");
		}

	}

	@Test(description = "US:432 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 1)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
   			homePage_SFDCPage.selectAllCaseHeads();
   		    homePage_SFDCPage.clickFirstRecord();
			fosterCaseID = caseHeadPage.newFosterCaseWithoutHousholdMember();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}
	

	@Test( description = "US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 2)
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
					"Failed US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}

	
	@Test( description = "US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 3)
	public void NewPlacementRequired() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);		//C-00004273
			fosterCareCase_Page.clickPlacementTab();
			fosterCareCase_Page.clickNewPlacement();
			newPlacement_OmniScriptPage.clickDownIconEdit();
//			newPlacement_OmniScriptPage.enterTextChildTextbox(childSecondFirstName+" "+childSecondLastName);
			newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
			newPlacement_OmniScriptPage.saveButton();
			newPlacement_OmniScriptPage.selectICPCPlacement("No");			
			newPlacement_OmniScriptPage.selectTypeOfPlacement("Relative Foster");
			newPlacement_OmniScriptPage.enterZipCode("90036");
			newPlacement_OmniScriptPage.selectStartDateRequired();	
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}
	}

	
	@Test( description = "US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 4)
	public void fosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
		
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);	//"C-00004172"
			fosterCareCase_Page.clickPlacementTab();
			fosterCareCase_Page.clickNewPlacement();
			newPlacement_OmniScriptPage.clickDownIconEdit();
//			newPlacement_OmniScriptPage.enterTextChildTextbox(childSecondFirstName+" "+childSecondLastName);
			newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
			newPlacement_OmniScriptPage.saveButton();
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
					"Failed US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}
	}
	
	
	@Test(description = "US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 5)
	public void fosterCareCaseSecondPlacement() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);		//514  UAT
			fosterCareCase_Page.clickPlacementTab();
			fosterCareCase_Page.clickNewPlacement();
			newPlacement_OmniScriptPage.clickDownIconEdit();
//			newPlacement_OmniScriptPage.enterTextChildTextbox(childSecondFirstName+" "+childSecondLastName);
			newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
			newPlacement_OmniScriptPage.saveButton();
			newPlacement_OmniScriptPage.selectICPCPlacement("No");
			newPlacement_OmniScriptPage.selectTypeOfPlacement("Relative Foster");
			newPlacement_OmniScriptPage.enterZipCode("90036");			
			newPlacement_OmniScriptPage.placementSecondStartdate();		
			newPlacement_OmniScriptPage.clickSearchButton();
			placementSearchResults_OmniScriptPage.verifyLabels();
			placementSearchResults_OmniScriptPage.selectFirstRecord();
			placementSearchResults_OmniScriptPage.clickSubmitButton();		
			fosterCareCase_Page.clickPlacementTab();
			newPlacement_OmniScriptPage.endDatePopulated();		

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}
	}
	
	@Test(description = "US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 6)
	public void placementStartDateBlank() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickPlacementTab();
			newPlacement_OmniScriptPage.editStartDateBlank();		
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}
	}
	
	
	@Test( enabled=false, description = "US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 7)
	public void fosterCareCaseStartDateConflict() throws AcisException, InterruptedException, IOException {
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
//			newPlacement_OmniScriptPage.enterTextChildTextbox(childSecondFirstName+" "+childSecondLastName);
			newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
			newPlacement_OmniScriptPage.saveButton();
			newPlacement_OmniScriptPage.selectICPCPlacement("No");
			newPlacement_OmniScriptPage.selectTypeOfPlacement("Relative Foster");
			newPlacement_OmniScriptPage.enterZipCode("90036");
			newPlacement_OmniScriptPage.selectStartDate();
			newPlacement_OmniScriptPage.clickSearchButton();
			newPlacement_OmniScriptPage.sameStartDateConflict();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}
	}
			
	@Test(description = "US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 8)
	public void fosterCareCaseVerify() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickPlacementTab();			
			newPlacement_OmniScriptPage.editEndDateManually();			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}
	}
	
	
	@Test(description = "US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 9)
	public void placementStartDateConflict() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickPlacementTab();			
			newPlacement_OmniScriptPage.verifyDurationLabel();
			newPlacement_OmniScriptPage.verifyDuration();
							
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}
		
		
	}


}