package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class UpdatePlacementTypeTest extends TestBase {

	public UpdatePlacementTypeTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID, fosterCaseID;
	String childFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 3);
	String childMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
	String childLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 3);

	/***
	 * This class contains Test Script related to intake creation and and changing
	 * the addresses and checking primary address marked accordingly
	 */
	final static Logger logger = LoggerFactory.getLogger(UpdatePlacementTypeTest.class);

	@Test(enabled = true, description = "S-0880 Update Placement Type creating foster care id", groups = { "High",
			"acisRegression", "Akash" }, priority = 0)

	public void UpdatePlacementTypeCreateFosterCreate() throws AcisException, InterruptedException, IOException {

		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
			homePage_SFDCPage.clickFirstRecord();
//		homePage_SFDCPage.searchRecordAndClick(firstName+" "+middleName+" "+lastName);
			fosterCaseID = caseHeadPage.newFosterCase();
		} catch (Exception e) {
			// TODO Auto-generated catch block

		}
	}

	@Test(enabled = true, description = "S-0880 Update Placement Type child creation", groups = { "High",
			"acisRegression", "Akash" }, priority = 1)

	public void UpdatePlacementTypeCreateFosterCreateChild() throws AcisException, InterruptedException, IOException {

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
			personsInvovled_CP_OmniscriptPage.searchNewPerson(childFirstName);
			personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
			personsInvovled_CP_OmniscriptPage.prvoideSuffix("first", "I");
			personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
			personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
			personsInvovled_CP_OmniscriptPage.clickNextButton();
			establishRelationships_CP_OmniScriptPage.clickSubmit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test(enabled = false, description = "S-0880 Update Placement Type verification placement", groups = { "High",
			"acisRegression", "Akash" }, priority = 2)

	public void UpdatePlacementTypeCreateFosterCreateChildVerification()
			throws AcisException, InterruptedException, IOException {

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
			visitationPlan_OmniScriptPage.edittingSelectingType();
			newPlacement_OmniScriptPage.selectICPCPlacement("No");
			newPlacement_OmniScriptPage.selectTypeOfPlacement("Own Home");

			newPlacement_OmniScriptPage.selectStartDate();
	
			newPlacement_OmniScriptPage.clickSearchButton();
			placementSearchResults_OmniScriptPage.clickSubmitButton();
			visitationPlan_OmniScriptPage.verifyProviderAgencyOwnHomeRunAway();
			visitationPlan_OmniScriptPage.verifyZipcode();
			
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickPlacementTab();
			fosterCareCase_Page.clickNewPlacement();
			visitationPlan_OmniScriptPage.edittingSelectingType();
			newPlacement_OmniScriptPage.selectICPCPlacement("No");
			newPlacement_OmniScriptPage.selectTypeOfPlacement("Regular Foster");

			newPlacement_OmniScriptPage.selectStartDate();
			newPlacement_OmniScriptPage.enterZipCode("66666");
			newPlacement_OmniScriptPage.clickSearchButton();
			visitationPlan_OmniScriptPage.selectCheckBox();
			placementSearchResults_OmniScriptPage.clickSubmitButton();
			visitationPlan_OmniScriptPage.verifyPlacementResorce();
	
	

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
	}
	
	@Test(enabled = false, description = "S-0880 Update Placement Type verification placement", groups = { "High",
			"acisRegression", "Akash" }, priority = 2)

	public void UpdatePlacementTypeViewingeditingPlacementResource()
			throws AcisException, InterruptedException, IOException {

		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickNewButton();
			placementResourcePage.selectRadioButton();
			placementResourcePage.verifytPlacementType();
			
	
	

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		
		
		
	}
	
	
	@Test(enabled = true, description = "S-0880 Update Placement TypeI am searching for a placement for a child on a Foster Care Case and have selected \"Adoptive Home\" as the placement type", groups = { "High",
			"acisRegression", "Akash" }, priority = 2)

	public void UpdatePlacementTypeViewingeditingPlacementResourceAdoptive()
			throws AcisException, InterruptedException, IOException {

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
			visitationPlan_OmniScriptPage.edittingSelectingType();
			newPlacement_OmniScriptPage.selectICPCPlacement("No");
			newPlacement_OmniScriptPage.selectTypeOfPlacement("Regular Foster");

			newPlacement_OmniScriptPage.selectStartDate();
			newPlacement_OmniScriptPage.enterZipCode("66666");
			newPlacement_OmniScriptPage.clickSearchButton();
			visitationPlan_OmniScriptPage.selectCheckBox();
			placementSearchResults_OmniScriptPage.clickSubmitButton();
			visitationPlan_OmniScriptPage.verifyPlacementResorce();
			
			
			
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickPlacementTab();
			fosterCareCase_Page.clickNewPlacement();
			visitationPlan_OmniScriptPage.edittingSelectingType();
			newPlacement_OmniScriptPage.selectICPCPlacement("No");
			newPlacement_OmniScriptPage.selectTypeOfPlacement("Regular Foster");

			newPlacement_OmniScriptPage.selectStartDate();
			newPlacement_OmniScriptPage.enterZipCode("66666");
			newPlacement_OmniScriptPage.clickSearchButton();
			visitationPlan_OmniScriptPage.selectCheckBox();
			placementSearchResults_OmniScriptPage.clickSubmitButton();
			visitationPlan_OmniScriptPage.verifyPlacementResorce();
			
			
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickPlacementTab();
			fosterCareCase_Page.clickNewPlacement();
			visitationPlan_OmniScriptPage.edittingSelectingType();
			newPlacement_OmniScriptPage.selectICPCPlacement("No");
			newPlacement_OmniScriptPage.selectTypeOfPlacement("Kinship");

			newPlacement_OmniScriptPage.selectStartDate();
			newPlacement_OmniScriptPage.enterZipCode("66666");
			newPlacement_OmniScriptPage.clickSearchButton();
			visitationPlan_OmniScriptPage.selectCheckBox();
			placementSearchResults_OmniScriptPage.clickSubmitButton();
			visitationPlan_OmniScriptPage.verifyPlacementResorce();
			
			
			

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			fosterCareCase_Page.clickPlacementTab();
			fosterCareCase_Page.clickNewPlacement();
			visitationPlan_OmniScriptPage.edittingSelectingType();
			newPlacement_OmniScriptPage.selectICPCPlacement("No");
			newPlacement_OmniScriptPage.selectTypeOfPlacement("Treatment Foster");

			newPlacement_OmniScriptPage.selectStartDate();
			newPlacement_OmniScriptPage.enterZipCode("66666");
			newPlacement_OmniScriptPage.clickSearchButton();
			visitationPlan_OmniScriptPage.selectCheckBox();
			placementSearchResults_OmniScriptPage.clickSubmitButton();
			visitationPlan_OmniScriptPage.verifyPlacementResorce();
	
	
	
	
	

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	

}}