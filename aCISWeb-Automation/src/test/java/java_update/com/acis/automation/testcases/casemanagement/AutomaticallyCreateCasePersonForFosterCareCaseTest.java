package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class AutomaticallyCreateCasePersonForFosterCareCaseTest extends TestBase{

	public AutomaticallyCreateCasePersonForFosterCareCaseTest() throws AcisException {
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
	
	
	@Test(enabled=true, description = "S-0313 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"Medium", "acisRegression", "Pallavi" }, priority = 0)
	public void DisplayNameDobAndAge() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
			    homePage_SFDCPage.clickFirstRecord();
			    caseHeadPage.ClickNewFosterCare();
			    fosterCareCase_Page.HouseholdPersonField();
			    fosterCareCase_Page.SelectOneHouseholdPerson();
			    fosterCareCase_Page.provideClosedDate("2020");
			    fosterCareCase_Page.nextButton();
			    fosterCareCase_Page.DateClosedError();
			    homePage_SFDCPage.closeTabs();
			    homePage_SFDCPage.logoutUser();
			    
			    userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			    home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
			    homePage_SFDCPage.clickFirstRecord();
			    caseHeadPage.ClickNewFosterCare();
			    fosterCareCase_Page.HouseholdPersonField();
			    fosterCareCase_Page.SelectOneHouseholdPerson();
			    fosterCareCase_Page.provideClosedDate("2020");
			    fosterCareCase_Page.nextButton();
			    fosterCareCase_Page.DateClosedError();
			    homePage_SFDCPage.closeTabs();
			    
			    
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0313 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}
	
	@Test(description = "S-0313 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"Medium", "acisRegression", "Pallavi" }, priority = 1)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
			    homePage_SFDCPage.clickFirstRecord();
				fosterCaseID = caseHeadPage.newFosterCase();
				
						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0313 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}
	
	@Test(description = "S-0313 Case Management - selected  household persons should be on the foster care case", groups = {
			"Medium", "acisRegression", "Pallavi" }, priority = 2)
	public void VerifyHousholdPersonOnCasePerson() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickRelatedTab();
				fosterCareCase_Page.clickPersonTab();
				fosterCareCase_Page.houseHoldPersonOnFosterCare();
				homePage_SFDCPage.closeTabs();
			    homePage_SFDCPage.logoutUser();
			    
			    userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			    home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickRelatedTab();
				fosterCareCase_Page.clickPersonTab();
				fosterCareCase_Page.houseHoldPersonOnFosterCare();
				homePage_SFDCPage.closeTabs();
			    homePage_SFDCPage.logoutUser();
			    
			    userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			    home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickRelatedTab();
				fosterCareCase_Page.clickPersonTab();
				fosterCareCase_Page.houseHoldPersonOnFosterCare();
					    
			    
			    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0313 Case Management - selected  household persons should be on the foster care case");
		}

	}
	
	
	
}
