package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class FosterParentInquiryFormPageTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(FosterParentInquiryFormPageTest.class);
	String parentFirstName = excel.generateRandomTestData("PoneF", 4);
	String parentLastName = excel.generateRandomTestData("PoneL", 4);
	String parentTwoFirst = excel.generateRandomTestData("PTwo", 4);
	String parentTwoLast = excel.generateRandomTestData("PTwoL", 4);
	String phoneFirst = testData.get(Constants.AccountProviderManagemnt).get("PhoneNoFirst");
	String ProsFosterParentid;

	public FosterParentInquiryFormPageTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(description = "S:0201 Provider Management - New Foster ParentInquiryForm Page creation", groups = { "High",
			"acisRegression", "Virendra" }, priority = 0)
	public void createFosterParentInquiryForm() throws AcisException, InterruptedException, IOException {
		try {

			String street1 = testData.get(Constants.AccountProviderManagemnt).get("street1");
			String city = testData.get(Constants.AccountProviderManagemnt).get("city");
			String zip = testData.get(Constants.AccountProviderManagemnt).get("zip");

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));

			homePage_SFDCPage.closeTabs();

			homePage_SFDCPage.clickDownArrowHome();
			accountPage.swiitchInquiryPage();
			fosterParentInquiryFormPage.verifyFirstLast();
			fosterParentInquiryFormPage.setParent1FirstName(parentFirstName);
			fosterParentInquiryFormPage.setParent1LastName(parentLastName);
			fosterParentInquiryFormPage.setDateForP1();
			fosterParentInquiryFormPage.setParent1PhoneNumber(phoneFirst);
			fosterParentInquiryFormPage.setParent1EmailAddress("xirafak196@5y5u.com");
			fosterParentInquiryFormPage.setenterParent2FirstName(parentTwoFirst);
			fosterParentInquiryFormPage.setParent2LastName(parentTwoLast);
			fosterParentInquiryFormPage.setParent2EmailAddress("mattis.larson@extraale.com");
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
			fosterInquirySecondPage.clickRegisterNext();
			fosterInquirySecondPage.closeWindowsExceptParent();
			// homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowEventMember();
			accountPage.selectUnconvertedApplicants();
			accountPage.searchEventMember(parentFirstName);
			accountPage.verifyingEventMemberDetailsInUncoveredApplicants();
			ProsFosterParentid = accountPage.getprospectiveFosterParentID();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowHome();
			// Ac-001766
			accountPage.clickingFosterInquiry("Prospective Foster Parents");
			accountPage.selectAllParentId();
			accountPage.searchprospectiveFosterParentID(ProsFosterParentid);
			fosterParentInquiryFormPage.getFormSubmissionStatus();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S:0201Provider Management - New Foster Parent InquiryForm Page creted successfully");
		}

	}

	@Test(description = "S:0201 Provider Management - New Foster ParentInquiryForm Page creation", groups = { "High",
			"acisRegression", "Virendra" }, priority = 1)
	public void dataVerificationForFosterParentInquiryForm() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowHome();
			// Ac-001766
			accountPage.clickingFosterInquiry("Prospective Foster Parents");
			accountPage.selectAllParentId();
			accountPage.searchprospectiveFosterParentID(ProsFosterParentid);
			// fosterInquirySecondPage.clickOnFirstProsFosterParent();
			fosterParentInquiryFormPage.getFirstName(parentFirstName);
			fosterParentInquiryFormPage.getDateOfBirth();
			fosterParentInquiryFormPage.getEmailAddress();
			fosterParentInquiryFormPage.getPhoneNumber(phoneFirst);

			fosterParentInquiryFormPage.getFormSubmissionStatus();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S:0201 Provider Management - Data validation forFoster Parent ");
		}

	}
}
