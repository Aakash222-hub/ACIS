package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.caseplan.PermanencyPlan_OmniScriptPage;
import com.acis.automation.pages.caseplan.ServiceToProviderPage;
import com.acis.automation.pages.caseplan.VisitationPlan_OmniScriptPage;
import com.acis.automation.utilities.AcisException;

public class NonmandatoryvalidationsCasePlanServiceTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(NonmandatoryvalidationsCasePlanServiceTest.class);

	public NonmandatoryvalidationsCasePlanServiceTest() throws AcisException {
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

	@Test(enabled = true, description = "US:0183  Foster Id creation for case management pre requisite 1", groups = {
			"High", "acisRegression", "Akash" }, priority = 0)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
			homePage_SFDCPage.clickFirstRecord();
//			homePage_SFDCPage.searchRecordAndClick(firstName+" "+middleName+" "+lastName);
			fosterCaseID = caseHeadPage.newFosterCase();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}

	@Test(enabled = true, description = "US:0183  Case Management - Case Management - Creating child", groups = {
			"High", "acisRegression", "Akash" }, priority = 1)
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
			System.out.println(childFirstName + " " + childMiddleName + " " + childLastName);
			personsInvovled_CP_OmniscriptPage.searchNewPerson(childFirstName);
			personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
			personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
			personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
			personsInvovled_CP_OmniscriptPage.clickSaveButton("next");
			personsInvovled_CP_OmniscriptPage.clickNextButton();
			establishRelationships_CP_OmniScriptPage.clickSubmit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0183  Case Management - Case Management - Create Service Referral Foster Care Case Add Person");
		}

	}

	@Test(enabled = true, description = "S-0554 Non-mandatory validations-Case Plan, Service Referral, Placement", groups = {
			"High", "acisRegression", "Akash" }, priority = 2)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {
		String zip = testData.get(Constants.OOhservicesCasePage).get("zipcode");

		String zipinvalid = testData.get(Constants.OOhservicesCasePage).get("zipInvalid");

		String caseId = testData.get(Constants.ValidationCasePlanPage).get("CaseNo");

		String state = testData.get(Constants.ValidationCasePlanPage).get("State");

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
		fosterCareCase_Page.clickServiceReferralTab();
		fosterCareCase_Page.clickNewServiceReferral();
		// serviceReferralPage.enterTextNameTextbox("FirstNameAjLy lastNameMyg");
		serviceReferralPage.enterTextNameTextbox(childFirstName + " " + childLastName);
		serviceReferralPage.selectingTypeOfService("ChildCare");
		serviceReferralPage.scrollEnd();
		serviceReferralPage.verifyNoCityStateError("VerifyErrror");
		serviceReferralPage.closeserviceReferalPage();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
		fosterCareCase_Page.clickPlacementTab();
		fosterCareCase_Page.clickNewPlacement();

//			newPlacement_OmniScriptPage.selectICPCPlacement("Yes");
//			newPlacement_OmniScriptPage.verifyPlacementTypeDisabled();
		newPlacement_OmniScriptPage.clickDownIconEdit();
		newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
		newPlacement_OmniScriptPage.saveButton();
		newPlacement_OmniScriptPage.selectICPCPlacement("No");
		newPlacement_OmniScriptPage.selectTypeOfPlacement("Relative Foster");
		newPlacement_OmniScriptPage.enterZipCode("94115");
		newPlacement_OmniScriptPage.selectStartDate();
		newPlacement_OmniScriptPage.clickSearchButton();
		placementSearchResults_OmniScriptPage.verifyPlacementResourceNF();
		placementSearchResults_OmniScriptPage.clickPreviousButton();
		newPlacement_OmniScriptPage.clearZipCode();
		newPlacement_OmniScriptPage.enterZipCode("90036");
		newPlacement_OmniScriptPage.clickSearchButton();
		placementSearchResults_OmniScriptPage.verifyLabels();
		placementSearchResults_OmniScriptPage.selectFirstRecord();
		placementSearchResults_OmniScriptPage.clickSubmitButton();

	}

}
