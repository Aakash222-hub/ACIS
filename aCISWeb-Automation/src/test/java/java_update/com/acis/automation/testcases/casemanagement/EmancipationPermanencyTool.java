package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class EmancipationPermanencyTool extends TestBase {

	public EmancipationPermanencyTool() throws AcisException {
		// TODO Auto-generated constructor stub
	}

	String fosterCaseID;

	String firstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
	String middleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
	String lastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);

	String childFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 3);
	String childMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
	String childLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 3);

	@Test(description = "US:618 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 0)
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
			getStackTrace(e, "Failed US:618 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}

	@Test(description = "US:0618 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 1)
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
			System.out.println("childFirstName" + childFirstName);
			personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
			personsInvovled_CP_OmniscriptPage.prvoideSuffix("first", "I");
			personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
			personsInvovled_CP_OmniscriptPage.clickSaveButton("next");
			personsInvovled_CP_OmniscriptPage.clickNextButton();
			establishRelationships_CP_OmniScriptPage.clickSubmit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0618 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}
	}

	@Test(description = "US:0618 Case Management - Permanency Dashboard viewing a child with a primary permanency goal of emancipation", groups = {
				"High", "acisRegression", "Varun" }, priority = 2)
		public void fosterCareCasePlan() throws AcisException, InterruptedException, IOException {
			try {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
		visitationPlan_OmniScriptPage.casePlan();
		permanencyPlan_OmniScriptPage.setPermanencyGoalsFor(childFirstName+" "+childLastName);
		permanencyPlan_OmniScriptPage.primaryFirst("Emancipation");
		permanencyPlan_OmniScriptPage.primarySecond("reunification");
		permanencyPlan_OmniScriptPage.setPermanencyNarrative("demo");
		permanencyPlan_OmniScriptPage.clickNextButton();
		servicesToTheChildren_OmniScriptPage.clickNextButton();
		serviceAgreementWithParents_OmniScriptPage.clickNextButton();
		visitationPlan_OmniScriptPage.addParentalVisitationPlan("No");
		visitationPlan_OmniScriptPage.addSiblingVisitations("No");
		visitationPlan_OmniScriptPage.clickNext();
		serviceToProviderPage.clickSubmit();
		serviceToProviderPage.closeWindowsExceptParent();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowHome();
		permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Prepare for Court");
		permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
		permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Conduct Case Plan Review");
		permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
		permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Transition to Housing Resource");
		permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
		permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Secure Training/Income Resources");
		permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
		permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Transition Services to Client");
		permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
		permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Transfer Medicaid");
		permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
		permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Transfer Vital Records to Client");
		permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
		permanencyHomePage.checkStatus(childFirstName+" "+childMiddleName+" "+childLastName, "Close Case");
		permanencyHomePage.clickGo(childFirstName+" "+childMiddleName+" "+childLastName);
		
			}
			
			catch (Exception e) {
				// TODO Auto-generated catch block
				getStackTrace(e,
						"Failed US:0618 Case Management - Permanency Dashboard viewing a child with a primary permanency goal of emancipation");
			}	
}

}
