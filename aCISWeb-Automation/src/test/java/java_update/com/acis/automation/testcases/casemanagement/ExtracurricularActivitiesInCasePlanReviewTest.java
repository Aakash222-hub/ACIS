package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ExtracurricularActivitiesInCasePlanReviewTest extends TestBase{

	public ExtracurricularActivitiesInCasePlanReviewTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String fosterCaseID;
	
	String childFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 3);
	String childMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
	String childLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 3);
	
	@Test(description = "S-986 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"Medium", "acisRegression", "Pallavi" }, priority = 0)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
			    homePage_SFDCPage.clickFirstRecord();
				fosterCaseID = caseHeadPage.newFosterCase();
				
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-986 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}
	
	
	@Test(description = "S-986 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"Medium", "acisRegression", "Pallavi" }, priority = 1)
	public void FosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
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
					"Failed S-986 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}

	@Test(description = "S-986 Case Management - New Case Plan Review", groups = {"Medium", "acisRegression", "Pallavi" }, priority = 2)
	public void CasePlanReview() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickCasePlanTab();
				casePlanPage.clickNewCasePlan();
				permanencyPlan_OmniScriptPage.setPermanencyGoalsFor(childMiddleName+" "+childLastName);
				permanencyPlan_OmniScriptPage.primaryFirst("guardianship");
				permanencyPlan_OmniScriptPage.setPermanencyNarrative("demo");
				permanencyPlan_OmniScriptPage.nextBtn();
				servicesToTheChildren_OmniScriptPage.clickNextButton();
				serviceAgreementWithParents_OmniScriptPage.clickNextButton();
				visitationPlan_OmniScriptPage.addParentalVisitationPlan("No");
				visitationPlan_OmniScriptPage.addSiblingVisitations("No");
				visitationPlan_OmniScriptPage.clickNext();
				serviceToProviderPage.clickNext();
				decisionPage.clickSubmit();
				casePlanReviewPage.clickOnCasePlanReview();
				casePlanReviewPage.editingAgenyPlan();
				
				casePlanReviewPage.fillingFamilyAgencyform("PermanencyPlan"); 
				casePlanReviewPage.fillingFamilyAgencyform("PermanencyPlan1");
				casePlanReviewPage.fillingExtracuricularActivities("ExtracuricularActivitiesAP");
				casePlanReviewPage.fillingExtracuricularActivities("ExtracuricularActivitiesPP");
				casePlanReviewPage.savingClickingNewCasePlan();
				

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-986 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}
}
