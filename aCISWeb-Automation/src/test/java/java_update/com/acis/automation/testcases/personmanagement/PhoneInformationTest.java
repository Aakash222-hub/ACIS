package com.acis.automation.testcases.personmanagement;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PhoneInformationTest extends TestBase {

	public PhoneInformationTest() throws AcisException {
		super();
	}

	/***
	 * This test case require date change once in a month
	 * 
	 * @throws AcisException
	 * @throws Exception
	 */

	@Test(description = "US:0055 Inactive Phone and Email Using Supervisor User ", groups = { "High", "aCIS_Regression",
			"Akash" })

	public void phoneEmailInformationPageSupervisorLogin() throws AcisException, Exception {

		
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.searchGlobalAccountRecord(
					createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameOne"));
			personsInformationPage.clickRelatedTab();
			relatedPersonTabPage.clickPhoneAndEmailTab();

			phoneEmailInformationPage.creatingNewPhone();

			phoneEmailInformationPage.editChangeEndDatePhone();

			phoneEmailInformationPage.creatingEmailDetails();

			phoneEmailInformationPage.editChangeEndDateEmailAndVerificationChangedDate();

		
	}

	/***
	 * This method loging through admin
	 * 
	 * @throws AcisException
	 * @throws Exception
	 */

	@Test(enabled = true, description = "US:0055 Inactive Phone and Email Using Admin User ", groups = { "High",
			"aCIS_Regression", "Akash" })

	public void phoneEmailInformationPageAdminLogin() throws AcisException, Exception {
		
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));

			homePage_SFDCPage.closeTabs();

			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.searchGlobalAccountRecord(
					createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameOne"));

			personsInformationPage.clickRelatedTab();

			relatedPersonTabPage.clickPhoneAndEmailTab();

			phoneEmailInformationPage.creatingNewPhone();

			phoneEmailInformationPage.editChangeEndDatePhone();

			phoneEmailInformationPage.creatingEmailDetails();

			phoneEmailInformationPage.editChangeEndDateEmailAndVerificationChangedDate();

		
	}

	/***
	 * This method login through intake username
	 * 
	 * @throws AcisException
	 * @throws Exception
	 */

	@Test(enabled = true, description = "US:0055 Inactive Phone and Email Using Intake User ", groups = { "High",
			"aCIS_Regression", "Akash" })

	public void phoneEmailInformationPageIntakeLogin() throws AcisException, Exception {
		
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			homePage_SFDCPage.closeTabs();

			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.searchGlobalAccountRecord(
					createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameOne"));

			personsInformationPage.clickRelatedTab();

			relatedPersonTabPage.clickPhoneAndEmailTab();

			phoneEmailInformationPage.creatingNewPhone();

			phoneEmailInformationPage.editChangeEndDatePhone();

			phoneEmailInformationPage.creatingEmailDetails();

			phoneEmailInformationPage.editChangeEndDateEmailAndVerificationChangedDate();
		
	}

	/***
	 * This method login through investigation login
	 * 
	 * @throws AcisException
	 * @throws Exception
	 */
	@Test(enabled = true, description = "US:0055 Inactive Phone and Email Using Investigation User ", groups = {
			"High", "aCIS_Regression", "Akash" })

	public void phoneEmailInformationPageInvestigationLogin() throws AcisException, Exception {
		
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			homePage_SFDCPage.closeTabs();

			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.searchGlobalAccountRecord(
					createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameOne"));

			personsInformationPage.clickRelatedTab();

			relatedPersonTabPage.clickPhoneAndEmailTab();

			phoneEmailInformationPage.creatingNewPhone();

			phoneEmailInformationPage.editChangeEndDatePhone();

			phoneEmailInformationPage.creatingEmailDetails();

			phoneEmailInformationPage.editChangeEndDateEmailAndVerificationChangedDate();

		
	}

}
