package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PlacementResourceAccountTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(PlacementResourceAccountTest.class);

	public PlacementResourceAccountTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}


	@Test(description = "S-0684 Case Management - Placement Resource Account Address", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 0)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {
		try {
			String accountID;
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
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
			accountID=placementResourcePage.getAccountID();
			placementResourcePage.clickRelatedTab();
			placementResourcePage.clickSiteLocationsTab();
			placementResourcePage.clickNewSiteLocations();
			placementResourcePage.setTextOnSite("LocationName", "Demo Location");
			placementResourcePage.setTextOnSite("Street", "510 S Burnside Ave");
			placementResourcePage.checkPrimaryCheckBox();
			placementResourcePage.setTextOnSite("City", "Los Angeles");
			placementResourcePage.setState("California");
			placementResourcePage.setTextOnSite("ZipCode", "90036");
			placementResourcePage.setTextOnSite("Latitude", "34.0662764");
			placementResourcePage.setTextOnSite("Longitude", "-118.3501339");
			placementResourcePage.clickOnSaveSite();
			placementResourcePage.clickSiteAccount();
			placementResourcePage.verifyAccountID(accountID);
			placementResourcePage.clickRelatedTab();
			placementResourcePage.clickSiteLocationsTab();
			placementResourcePage.clickNewSiteLocations();
			placementResourcePage.setTextOnSite("LocationName", "Demo Location new");
			placementResourcePage.setTextOnSite("Street", "510 S Burnside Ave");
			placementResourcePage.checkPrimaryCheckBox();
			placementResourcePage.setTextOnSite("City", "Los Angeles");
			placementResourcePage.setState("California");
			placementResourcePage.setTextOnSite("ZipCode", "90036");
			placementResourcePage.setTextOnSite("Latitude", "34.0662764");
			placementResourcePage.setTextOnSite("Longitude", "-118.3501339");
			placementResourcePage.clickOnSaveSite();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0684 Case Management - Placement Resource Account Address");
		}

	}

	@Test(description = "S-0684 Case Management - Placement Resource Account Address Provider Agency", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 1)
	public void CreateProviderAccount() throws AcisException, InterruptedException, IOException {
		try {
			String accountID;
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.clickNewButton();
			providerAgencyAccountPage.selectRadioButton();
			providerAgencyAccountPage.setTextOnProvider("AccountName", excel.generateRandomTestData("Demo",4));
			//providerAgencyAccountPage.setProviderAgencyType("ChildCare");
			providerAgencyAccountPage.clickOnSave();
			accountID=providerAgencyAccountPage.getAccountID();
			providerAgencyAccountPage.clickRelatedTab();
			providerAgencyAccountPage.clickSiteLocationsTab();
			providerAgencyAccountPage.clickNewSiteLocations();
			providerAgencyAccountPage.setTextOnSite("LocationName", "Demo Location");
			providerAgencyAccountPage.setTextOnSite("Street", "510 S Burnside Ave");
			providerAgencyAccountPage.checkPrimaryCheckBox();
			providerAgencyAccountPage.setTextOnSite("City", "Los Angeles");
			providerAgencyAccountPage.setState("California");
			providerAgencyAccountPage.setTextOnSite("ZipCode", "90036");
			providerAgencyAccountPage.setTextOnSite("Latitude", "34.0662764");
			providerAgencyAccountPage.setTextOnSite("Longitude", "-118.3501339");
			providerAgencyAccountPage.clickOnSaveSite();
			providerAgencyAccountPage.clickSiteAccount();
			providerAgencyAccountPage.verifyAccountID(accountID);
			providerAgencyAccountPage.clickRelatedTab();
			providerAgencyAccountPage.clickSiteLocationsTab();
			providerAgencyAccountPage.clickNewSiteLocations();
			providerAgencyAccountPage.setTextOnSite("LocationName", "Demo Location new");
			providerAgencyAccountPage.setTextOnSite("Street", "510 S Burnside Ave");
			providerAgencyAccountPage.checkPrimaryCheckBox();
			providerAgencyAccountPage.setTextOnSite("City", "Los Angeles");
			providerAgencyAccountPage.setState("California");
			providerAgencyAccountPage.setTextOnSite("ZipCode", "90036");
			providerAgencyAccountPage.setTextOnSite("Latitude", "34.0662764");
			providerAgencyAccountPage.setTextOnSite("Longitude", "-118.3501339");
			providerAgencyAccountPage.clickOnSaveSite();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0684 Case Management - Placement Resource Account Address Provider Agency");
		}

	}


}
