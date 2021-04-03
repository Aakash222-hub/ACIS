package com.acis.automation.testcases.personmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

/**
 * This class contains test scripts related to My Courses tab of Learner
 * 
 * @author shahenshaha.mulani
 *
 */

public class FinanceTest extends TestBase {

	public FinanceTest() throws AcisException {
		super();
	}



	@Test(description = "US-0090 Finance creation using supervisor ", groups = { "High", "aCIS_Regression",
			"Akash" })

	public void financeTestSupervisor() throws AcisException, Exception {
	
			String startDate = testData.get(Constants.PersonIncomePage).get("startDate");
			String statusType = testData.get(Constants.PersonIncomePage).get("status");
			String end = testData.get(Constants.PersonIncomePage).get("endDate");
			String verification = testData.get(Constants.PersonIncomePage).get("verficationDate");
			String amount = testData.get(Constants.PersonIncomePage).get("amount");
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
	
			// userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("userName"),
			// testData.get(Constants.LOGINPAGE_SHEET).get("password"));
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAccount();
			homePage_SFDCPage.selectAllAccount();
			homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameThree"));
			personsInformationPage.clickRelatedTab();
			relatedPersonTabPage.clickFinanceTab();
			financeCreationPage.verifyFieldInInformation();
			financeCreationPage.status(statusType);
			financeCreationPage.amount(amount);
			financeCreationPage.verifyType();
			financeCreationPage.selectingType("Cash");
			financeCreationPage.verifyingSource();
			financeCreationPage.verifyFrequency();
			financeCreationPage.selectFrequency("Hourly");
		
			
			financeCreationPage.enterDate("start", startDate);
			financeCreationPage.enterDate("end", end);
			financeCreationPage.enterDate("verification", verification);
			financeCreationPage.submitFinance(); 
			financeCreationPage.verifyIncomeAccordingtoEndDate(startDate, end, statusType);
		//	financeCreationPage.deleteAllData();
	
	
	}

	
	@Test(enabled=true,description = "US-0090 Finance creation using intake", groups = { "High", "aCIS_Regression",
	"Akash" })

public void financeTestIntake() throws AcisException, Exception {

	String startDate = testData.get(Constants.PersonIncomePage).get("startDate");
	String statusType = testData.get(Constants.PersonIncomePage).get("status");
	String end = testData.get(Constants.PersonIncomePage).get("endDate");
	String verification = testData.get(Constants.PersonIncomePage).get("verficationDate");
	String amount = testData.get(Constants.PersonIncomePage).get("amount");
	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
			testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));

	// userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("userName"),
	// testData.get(Constants.LOGINPAGE_SHEET).get("password"));
	homePage_SFDCPage.closeTabs();
	homePage_SFDCPage.clickDownArrowAccount();
	homePage_SFDCPage.selectAllAccount();
	homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameThree"));
	personsInformationPage.clickRelatedTab();
	relatedPersonTabPage.clickFinanceTab();
	financeCreationPage.verifyFieldInInformation();
	financeCreationPage.status(statusType);
	financeCreationPage.amount(amount);
	financeCreationPage.verifyType();
	financeCreationPage.selectingType("Cash");
	financeCreationPage.verifyingSource();
	financeCreationPage.verifyFrequency();
	financeCreationPage.selectFrequency("Hourly");

	
	financeCreationPage.enterDate("start", startDate);
	financeCreationPage.enterDate("end", end);
	financeCreationPage.enterDate("verification", verification);
	financeCreationPage.submitFinance(); 
	financeCreationPage.verifyIncomeAccordingtoEndDate(startDate, end, statusType);



}
	

	
	@Test(enabled=true,description = "US-0090 Finance creation using investigation ", groups = { "High", "aCIS_Regression",
	"Akash" })

public void financeTestInvestigation() throws AcisException, Exception {

	String startDate = testData.get(Constants.PersonIncomePage).get("startDate");
	String statusType = testData.get(Constants.PersonIncomePage).get("status");
	String end = testData.get(Constants.PersonIncomePage).get("endDate");
	String verification = testData.get(Constants.PersonIncomePage).get("verficationDate");
	String amount = testData.get(Constants.PersonIncomePage).get("amount");
	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
			testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));

	// userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("userName"),
	// testData.get(Constants.LOGINPAGE_SHEET).get("password"));
	homePage_SFDCPage.closeTabs();
	homePage_SFDCPage.clickDownArrowAccount();
	homePage_SFDCPage.selectAllAccount();
	homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameThree"));
	personsInformationPage.clickRelatedTab();
	relatedPersonTabPage.clickFinanceTab();
	financeCreationPage.verifyFieldInInformation();
	financeCreationPage.status(statusType);
	financeCreationPage.amount(amount);
	financeCreationPage.verifyType();
	financeCreationPage.selectingType("Cash");
	financeCreationPage.verifyingSource();
	financeCreationPage.verifyFrequency();
	financeCreationPage.selectFrequency("Hourly");

	
	financeCreationPage.enterDate("start", startDate);
	financeCreationPage.enterDate("end", end);
	financeCreationPage.enterDate("verification", verification);
	financeCreationPage.submitFinance(); 
	financeCreationPage.verifyIncomeAccordingtoEndDate(startDate, end, statusType);



}
	
	@Test(enabled=true,description = "US-0090 Finance creation using admin", groups = { "High", "aCIS_Regression",
	"Akash" })

public void financeTestAdmin() throws AcisException, Exception {

	String startDate = testData.get(Constants.PersonIncomePage).get("startDate");
	String statusType = testData.get(Constants.PersonIncomePage).get("status");
	String end = testData.get(Constants.PersonIncomePage).get("endDate");
	String verification = testData.get(Constants.PersonIncomePage).get("verficationDate");
	String amount = testData.get(Constants.PersonIncomePage).get("amount");
	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
			testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));

	// userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("userName"),
	// testData.get(Constants.LOGINPAGE_SHEET).get("password"));
	homePage_SFDCPage.closeTabs();
	homePage_SFDCPage.clickDownArrowAccount();
	homePage_SFDCPage.selectAllAccount();
	homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameThree"));
	personsInformationPage.clickRelatedTab();
	relatedPersonTabPage.clickFinanceTab();
	financeCreationPage.verifyFieldInInformation();
	financeCreationPage.status(statusType);
	financeCreationPage.amount(amount);
	financeCreationPage.verifyType();
	financeCreationPage.selectingType("Cash");
	financeCreationPage.verifyingSource();
	financeCreationPage.verifyFrequency();
	financeCreationPage.selectFrequency("Hourly");

	
	financeCreationPage.enterDate("start", startDate);
	financeCreationPage.enterDate("end", end);
	financeCreationPage.enterDate("verification", verification);
	financeCreationPage.submitFinance(); 
	financeCreationPage.verifyIncomeAccordingtoEndDate(startDate, end, statusType);



}
	
}
