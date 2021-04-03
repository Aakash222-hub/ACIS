package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;


public class FamilyNeedsAssessmentPageTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(FamilyNeedsAssessmentPageTest.class);

	public FamilyNeedsAssessmentPageTest() throws AcisException  {
		// TODO Auto-generated constructor stub
	}
	
	String allegationID,fosterCaseID;

	
	@Test(description = "US:0173 Case Management - New Placement Search Criteria Create Foster Care Case", groups = { "High",
			"acisRegression", "Dharmesh" }, priority = 1)
	
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.clickFirstRecord();
			fosterCaseID=caseHeadPage.newFosterCase();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}
	
	@Test(description = "US:0327 Case Management - Verify Assessment type Foster Care Case", groups = { "High",
			"acisRegression", "Varun" }, priority = 2)
	public void fosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			System.out.println("Password"+testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
//			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			System.out.println("fosterCaseID"+fosterCaseID);
//			homePage_SFDCPage.searchGlobalFosterCase("C-00000007");
			fosterCareCase_Page.clickAssessmentsTab();
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
			fosterCareFamilyNeedsAssessmentpage.verifyAssesmentstatus();
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
			fosterCareFamilyNeedsAssessmentpage.verifyAssesmentstatus();
			
	} catch (Exception e) {
		// TODO Auto-generated catch block
		getStackTrace(e, "Failed US:0327 Case Management - Verify Assessment type Foster Care Case");
	}

	
	}
}
