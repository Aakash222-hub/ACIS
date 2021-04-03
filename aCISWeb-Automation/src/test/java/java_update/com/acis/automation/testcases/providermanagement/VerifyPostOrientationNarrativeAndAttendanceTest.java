package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class VerifyPostOrientationNarrativeAndAttendanceTest extends TestBase {

	public VerifyPostOrientationNarrativeAndAttendanceTest() throws AcisException {
		// TODO Auto-generated constructor stub
		super();
	}

	final static Logger logger = LoggerFactory.getLogger(VerifyPostOrientationNarrativeAndAttendanceTest.class);
	String EventDateTime;
	String parentFirstName = excel.generateRandomTestData("Ab", 6);
	String parentLastName = excel.generateRandomTestData("Ln", 6);
	String parentTwoFirst = excel.generateRandomTestData("Sn", 6);
	String parentTwoLast = excel.generateRandomTestData("An", 6);
	String emailFirstPerson = excel.generateRandomOrgEmail(testData.get(Constants.PhoneEmailSA_SHEET).get("firstPersonNewEmail"), 4);
	String emailNewPerson = excel.generateRandomOrgEmail(testData.get(Constants.PhoneEmailSA_SHEET).get("NewPersonNewEmail"), 4);
	 // A-001595

	@Test(description = "US:0712 Provider Management -Orientation - Post Orientation Narrative & Attendance-Fill Foaster inquiry form for parents and verify Event Details", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 0)
	public void SignupOrientation() throws AcisException, InterruptedException, IOException {
		try {
			String phoneFirst = testData.get(Constants.AccountProviderManagemnt).get("PhoneNoFirst");
			String street1 = testData.get(Constants.AccountProviderManagemnt).get("street1");
			String city = testData.get(Constants.AccountProviderManagemnt).get("city");
			String zip = testData.get(Constants.AccountProviderManagemnt).get("zip");
		
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));

			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();

			homePage_SFDCPage.clickDownArrowHome();
			accountPage.swiitchInquiryPage();
			fosterParentInquiryFormPage.verifyFirstLast();
			fosterParentInquiryFormPage.setParent1FirstName(parentFirstName);
			fosterParentInquiryFormPage.setParent1LastName(parentLastName);
			fosterParentInquiryFormPage.setDateForP1();
			fosterParentInquiryFormPage.setParent1PhoneNumber(phoneFirst);
			fosterParentInquiryFormPage.setParent1EmailAddress(emailFirstPerson);
			fosterParentInquiryFormPage.setenterParent2FirstName(parentTwoFirst);
			fosterParentInquiryFormPage.setParent2LastName(parentTwoLast);
			fosterParentInquiryFormPage.setParent2EmailAddress(emailNewPerson);
			fosterParentInquiryFormPage.clickNextButton();
			fosterInquirySecondPage.enterText("street1", street1);
			fosterInquirySecondPage.enterText("city", city);
			fosterInquirySecondPage.provideState("Indiana");
			fosterInquirySecondPage.providCountry("Adams");
			fosterInquirySecondPage.enterText("zip", zip);
			fosterInquirySecondPage.selectCheckBox();
			fosterInquirySecondPage.alreadyTalk("No");
			fosterInquirySecondPage.selectNext();
			// EventDateTime =fosterInquirySecondPage.getDateTimeOfEventText();
			EventDateTime = fosterInquirySecondPage.clickRegisterNext1();

			fosterInquirySecondPage.closeWindowsExceptParent();
			homePage_SFDCPage.clickDownArrowEvent();
			//accountPage.clickDownArrowEvents();
			accountPage.clickEventIdRecord(EventDateTime);
			accountPage.clickRelatedTab();
			accountPage.clickEventMemberLink();
			accountPage.clickEventMemberRecord(parentFirstName);
			accountPage.verifyingEventMemberDetails();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0712 Provider Management - Orientation - Post Orientation Narrative & Attendance-Fill Foaster inquiry form for parents and verify Event Details");
		}
	}

	// A-001593
	@Test(description = "US:0712 Provider Management - Orientation - Post Orientation Narrative & Attendance-Verify Details in Unconverted Applicants and create Account for parent", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 1)
	public void FosterAccountCreation() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));

			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			// AC-1789-verify UnConverted Applicants Details Of EventMember
			homePage_SFDCPage.clickDownArrowEventMember();
			accountPage.selectUnconvertedApplicants();
			accountPage.searchEventMember(parentFirstName);
			accountPage.verifyingEventMemberDetailsInUncoveredApplicants();
			String prospectiveParentId = accountPage.getprospectiveFosterParentID();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowHome();
			// Ac-001766
			accountPage.clickingFosterInquiry("Prospective Foster Parents");
			accountPage.selectAllParentId();
			accountPage.searchprospectiveFosterParentID(prospectiveParentId);
			accountPage.clickRelatedTab();
			accountPage.clickEventMemberLink();
			accountPage.clickEventMemberRecord(parentFirstName);
			accountPage.clickEditButtonforP1();
			accountPage.ClickconfirmOrientationAttendanceParent1();
			accountPage.ClickconfirmOrientationAttendanceParent2();
			accountPage.clickOnSaveButton();

		} catch (Exception e) { // TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0712 Provider Management - Orientation - Post Orientation Narrative & Attendance-Verify Details in Unconverted Applicants and create Account for parent");
		}
	}

	// Ac-1593
	@Test(description = "US:0712 Provider Management - Orientation - Post Orientation Narrative & Attendance-verify Placement Type and Status of foster parent account", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 2)
	public void PlacementTypeAndStatusCheck() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			accountPage.searchAccount(parentFirstName); // Ac-1596
			accountPage.verifyPlacementTypeField();
			accountPage.verifyStatusField();

		} catch (Exception e) { // TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0712 Provider Management - Orientation - Post Orientation Narrative & Attendance-verify Converted Applicants Details Of EventMember");
		}
	}

	// Ac-1789
	@Test(description = "US:0712 Provider Management - Orientation - Post Orientation Narrative & Attendance-verify Converted Applicants Details Of EventMember", groups = {
			"High", "acisRegression", "Priyanka" }, priority = 3)
	public void ConvertedApplicantsDetailsOfEventMember() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));

			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowEventMember();
			accountPage.selectConvertedApplicants();
			accountPage.searchEventMember(parentFirstName);
			accountPage.verifyingEventMemberDetailsInCoveredApplicants();

		} catch (Exception e) { // TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0712 Provider Management - Orientation - Post Orientation Narrative & Attendance-verify Converted Applicants Details Of EventMember");
		}

	}
}