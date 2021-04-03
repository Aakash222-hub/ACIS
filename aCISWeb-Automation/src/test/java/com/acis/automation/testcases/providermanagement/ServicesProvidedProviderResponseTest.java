package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ServicesProvidedProviderResponseTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(ServicesProvidedProviderResponseTest.class);
	public ServicesProvidedProviderResponseTest() throws AcisException {
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

	@Test(enabled=true,description = "S-257 Provider Management - ServicesProvided - ProviderResponse Page - Create Service Referral Create Foster Care Case", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 0)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
				homePage_SFDCPage.clickFirstRecord();
		    //	homePage_SFDCPage.searchRecordAndClick("abc");
			//	homePage_SFDCPage.searchRecordAndClick(firstName+" "+middleName+" "+lastName);
				fosterCaseID = caseHeadPage.newFosterCase();
			
			

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-257 Provider Management - ServicesProvided - ProviderResponse Page - Create Service Referral Create Foster Care Case");
		}

	}
	
	
	@Test(enabled = true, description = "S-257 Provider Management - ServicesProvided - ProviderResponse Page", groups = { "High",
			"acisRegression", "Pallavi" },priority=1)
	public void fosterCareCreatePerson() throws AcisException {
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
		
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}
	}

	
	
	@Test(enabled = true, description = "S-257 Provider Management - ServicesProvided - ProviderResponse Page", groups = { "High",
			"acisRegression", "Pallavi" },priority=2)
	public void CreateServiceRefferal() throws AcisException {
		try {
			
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		home.verfiyHomePage();
		
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
		fosterCareCase_Page.clickServiceReferralTab();
		fosterCareCase_Page.clickNewServiceReferral();
		serviceReferralPage.enterTextNameTextbox(childFirstName+" "+childLastName);
		serviceReferralPage.selectingTypeOfService("ChildCare");
		serviceReferralPage.enteringText("zipcode", "90036");
		serviceReferralPage.searchPage();
		providerAgencySelectionPage.selectFirstRecord();
		providerAgencySelectionPage.clickSubmitButton();		
		
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}
	}
	
	@Test(enabled = false, description = "S-257 Provider Management - ServicesProvided - ProviderResponse Page", groups = { "High",
			"acisRegression", "Pallavi" },priority=3)
	public void LoginServiceProviderPortal() throws AcisException {
		try {
		String serviceProviderUserName = testData.get(Constants.LOGINPAGE_SHEET).get("serviceProviderPortalUserName");
		String serviceProviderPassword = testData.get(Constants.LOGINPAGE_SHEET).get("seviceProviderPortalPassword");
		
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
		
		homePage_SFDCPage.closeTabs();
		serviceProviderPage.switchToPortalPage();
		serviceProviderPage.frontPageImage();
		serviceProviderPage.enteringUsernamePassword(serviceProviderUserName, serviceProviderPassword);
		serviceProviderPage.loginToProviderPortal();
		//home.verfiyHomePage();
		serviceProviderPage.citizenTheme();
		serviceProviderPage.referralTab();
		serviceProviderPage.allReferral();
		serviceProviderPage.serviceReferralId();
		serviceProviderPage.approveButton();
		serviceProviderPage.selectEnrollmentdate();
		serviceProviderPage.selectDischargedate();
		serviceProviderPage.next();
		serviceProviderPage.approvePage();
		serviceProviderPage.next();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}
	}
	
	@Test(enabled = false, description = "S-257 Provider Management - ServicesProvided - ProviderResponse Page", groups = { "High",
			"acisRegression", "Pallavi" },priority=4)
	public void monthlyAssesmentId() throws AcisException {
		try {
		String serviceProviderUserName = testData.get(Constants.LOGINPAGE_SHEET).get("serviceProviderPortalUserName");
		String serviceProviderPassword = testData.get(Constants.LOGINPAGE_SHEET).get("seviceProviderPortalPassword");
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
		
		homePage_SFDCPage.closeTabs();
		serviceProviderPage.switchToPortalPage();
		serviceProviderPage.frontPageImage();
		serviceProviderPage.enteringUsernamePassword(serviceProviderUserName, serviceProviderPassword);
		serviceProviderPage.loginToProviderPortal();
		serviceProviderPage.clickMonthlyAssesmentTab();
		serviceProviderPage.accessListViewField();
		serviceProviderPage.monthlyAssessmentId();
		serviceProviderPage.enteringText("Attendance Rate", "56");
		serviceProviderPage.enteringText("Narrative", "New");
		serviceProviderPage.enteringText("Outecomes Measure", "67");		
		serviceProviderPage.clickSave();
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:432 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}
		
	}
}