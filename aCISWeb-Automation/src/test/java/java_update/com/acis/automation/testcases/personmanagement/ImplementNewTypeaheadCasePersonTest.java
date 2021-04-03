package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ImplementNewTypeaheadCasePersonTest extends TestBase  {

	public ImplementNewTypeaheadCasePersonTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String fosterCaseID;
	 String firstName = excel.generateRandomTestData(excel.generateRandomTestData("", 3), 4);
	 String middleName = excel.generateRandomTestData(excel.generateRandomTestData("", 4), 3);
	 String lastName = excel.generateRandomTestData(excel.generateRandomTestData("", 3), 4);
	
	
	@Test(description = "US:00872 Implement Updates - Implement New/Remove Typeahead-FC - Create foster case", groups = {
			"High", "acisRegression", "Mrunal" }, priority = 0)
	public void implementNewTypeaheadCasePersonCreateFosterCareCase() throws AcisException, InterruptedException, IOException {


			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
			homePage_SFDCPage.clickFirstRecord();
			fosterCaseID = caseHeadPage.newFosterCase();

	}
	
	@Test(description = "US:00872 Implement Updates - Implement New/Remove Typeahead-FC", groups = {
			"High", "acisRegression", "Mrunal" }, priority = 1)
	public void implementNewTypeaheadCasePersonValidation() throws AcisException, InterruptedException, IOException {
		
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				/*Create Case Person*/
				caseActionPage.clickRelatedTab();
				fosterCareCase_Page.clickPersonTab();
				fosterCareCase_Page.clickNewPerson();
				personsInvovled_CP_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
				personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
				personsInvovled_CP_OmniscriptPage.setAllNames("first", firstName, middleName, lastName);
				personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
				reviewAllegationReport_OmniScriptPage.searchPersonUsingvalidData("firstName", firstName);
				reviewAllegationReport_OmniScriptPage.searchRecordLabelsVerify();

				
		}	
	
}
