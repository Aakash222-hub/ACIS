package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class OOHServicesCasePageRelatedTabAssessments  extends TestBase {

	public OOHServicesCasePageRelatedTabAssessments() throws AcisException {
		// TODO Auto-generated constructor stub
		super();
	}

	String fosterCaseID, casePlanID;
	String childFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 3);
	String childMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
	String childLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 3);
	
	
	@Test(description = "S-0193 Case Management - Create Foster Care Case", groups = {
			"Medium", "acisRegression", "Varun" }, priority = 0)
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
			getStackTrace(e, "Failed S-0193 Case Management - Create Foster Care Case");
		}

	}
	
	@Test(description = "S-0193 Case Management - Verify New Family Assessment Page and option", groups = {
			"Medium", "acisRegression", "Varun" }, priority = 1)
	public void FosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickRelatedTab();
				investigationCasePage.clickAssessmentsTab();
				investigationCasePage.VerifyAssesmentspagendoption();
				fosterCareCase_Page.clickNewAssessment();
				fosterCareFamilyNeedsAssessmentpage.adequateAndReliableChildcareAssessmentDropdown("Stable");
				fosterCareFamilyNeedsAssessmentpage.careAttendSchoolRegularlyAssessmentDropdown("Stable");
				fosterCareFamilyNeedsAssessmentpage.livingarrangementsAssessmentDropdown("AtRisk");
				fosterCareFamilyNeedsAssessmentpage.emotionalHealthConditionsAssessmentDropdown("Average");
				fosterCareFamilyNeedsAssessmentpage.disorderAssessmentDropdown("Average");
				fosterCareFamilyNeedsAssessmentpage.livingWageAssessmentDropdown("Stable");
				fosterCareFamilyNeedsAssessmentpage.livingEnvironmentAssessmentDropdown("AtRisk");
				fosterCareFamilyNeedsAssessmentpage.nutritionalMealsAssessmentDropdown("Stable");
				fosterCareFamilyNeedsAssessmentpage.reliableTransportationAssessmentDropdown("Thriving");
				fosterCareFamilyNeedsAssessmentpage.clickSubmit();
				fosterCareCase_Page.clickAssessmentsTab();
				investigationCasePage.VerifyAssesmentspagendoption();
				investigationCasePage.verifyAssessmentField();
				
				} catch (Exception e) {
					// TODO Auto-generated catch block
					getStackTrace(e,
							"Failed S-0193 Case Management - Verify New Family Assessment Page and option");
				}
	}
		
}
