package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;


public class ServiceReferralCreationTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(ServiceReferralCreationTest.class);

	public ServiceReferralCreationTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID, fosterCaseID;

	String firstName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
	String middleName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
	String lastName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);
	
	String childFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 3);
	String childMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
	String childLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 3);

	int count = 0;
	
	@Test(description = "US:0174 Case Management - Case Management - Create Service Referral Create Placement Resource Account", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 0)
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
			count++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0174 Case Management - Case Management - Create Service Referral Create Placement Resource Account");
		}

	}

	@Test(description = "US:0174 Case Management - Case Management - Create Service Referral Create Provider Agency Account", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 1)
	public void CreateProviderAccount() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 1) {
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
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0174 Case Management - Case Management - Create Service Referral Create Provider Agency Account");
		}

	}

	@Test(description = "US:0174 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 2)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 2) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
				homePage_SFDCPage.clickFirstRecord();
				fosterCaseID = caseHeadPage.newFosterCase();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria Create Foster Care Case");
		}
	}

	@Test(description = "US:0174 Case Management - Case Management - Create Service Referral Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 3)
	public void fosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 3) {
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
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0174 Case Management - Case Management - Create Service Referral Foster Care Case Add Person");
		}

	}

	@Test(description = "US:0174 Case Management - Case Management - Create Service Referral Error Check", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 4)
	public void ErrorVerify() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 4) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickServiceReferralTab();
				fosterCareCase_Page.clickNewServiceReferral();
				serviceReferralPage.enterTextNameTextbox(childFirstName+" "+childLastName);
				serviceReferralPage.selectingTypeOfService("ChildCare");
				serviceReferralPage.enteringText("City", "alabama");
				serviceReferralPage.searchPage();
				providerAgencySelectionPage.verifyError("CityState");
				providerAgencySelectionPage.clickPreviousButton();
				serviceReferralPage.resetData();
				serviceReferralPage.enterTextNameTextbox(childFirstName+" "+childLastName);
				serviceReferralPage.selectingTypeOfService("ChildCare");
				serviceReferralPage.enteringText("zipcode", "32324");
				serviceReferralPage.searchPage();
				providerAgencySelectionPage.verifyError("ZipCode");
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0174 Case Management - Case Management - Create Service Referral Error Check");
		}

	}
	
	@Test(description = "US:0174 Case Management - Case Management - Create Service Referral Error Check Investigator", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 5)
	public void ErrorVerifyInvestigator() throws AcisException, InterruptedException, IOException {
		try {
			if (count >= 5) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickServiceReferralTab();
				fosterCareCase_Page.clickNewServiceReferral();
				serviceReferralPage.enterTextNameTextbox(childFirstName+" "+childLastName);
				serviceReferralPage.selectingTypeOfService("ChildCare");
				serviceReferralPage.enteringText("City", "alabama");
				serviceReferralPage.searchPage();
				providerAgencySelectionPage.verifyError("CityState");
				providerAgencySelectionPage.clickPreviousButton();
				serviceReferralPage.resetData();
				serviceReferralPage.enterTextNameTextbox(childFirstName+" "+childLastName);
				serviceReferralPage.selectingTypeOfService("ChildCare");
				serviceReferralPage.enteringText("zipcode", "32324");
				serviceReferralPage.searchPage();
				providerAgencySelectionPage.verifyError("ZipCode");
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0174 Case Management - Case Management - Create Service Referral Error Check");
		}

	}
	
	
	@Test(description = "US:0174 Case Management - Case Management - Create Service Referral OOH User", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 6)
	public void ServiceRefferalOOHUser() throws AcisException, InterruptedException, IOException {
		try {
			if (count >= 5) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickServiceReferralTab();
				fosterCareCase_Page.clickNewServiceReferral();
				serviceReferralPage.enterTextNameTextbox(childFirstName+" "+childLastName);
				serviceReferralPage.selectingTypeOfService("ChildCare");
				serviceReferralPage.enteringText("zipcode", testData.get(Constants.ProviderAgencyAccount_SHEET).get("zipCode"));
				serviceReferralPage.searchPage();
				providerAgencySelectionPage.selectFirstRecord();
				providerAgencySelectionPage.clickSubmitButton();
				providerAgencySelectionPage.verifySubmitted();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"US:0174 Case Management - Case Management - Create Service Referral OOH User");
		}
	}
		
		@Test(description = "US:0174 Case Management - Case Management - Create Service Referral Investigation User", groups = {
				"High", "acisRegression", "Dharmesh" }, priority = 7)
		public void ServiceRefferalInvestigator() throws AcisException, InterruptedException, IOException {
			try {
				if (count >= 5) {
					userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
							testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
					home.verfiyHomePage();
					homePage_SFDCPage.closeTabs();
					homePage_SFDCPage.clickDownArrowAllegation();
					homePage_SFDCPage.selectAllAllegation();
					homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
					fosterCareCase_Page.clickServiceReferralTab();
					fosterCareCase_Page.clickNewServiceReferral();
					serviceReferralPage.enterTextNameTextbox(childFirstName+" "+childLastName);
					serviceReferralPage.selectingTypeOfService("ChildCare");
					serviceReferralPage.enteringText("zipcode", testData.get(Constants.ProviderAgencyAccount_SHEET).get("zipCode"));
					serviceReferralPage.searchPage();
					providerAgencySelectionPage.selectFirstRecord();
					providerAgencySelectionPage.clickSubmitButton();
					providerAgencySelectionPage.verifySubmitted();
					count++;
				} else {
					throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
				}
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				getStackTrace(e,
						"Failed US:0174 Case Management - Case Management - Create Service Referral Investigation User");
			}
		}
}
