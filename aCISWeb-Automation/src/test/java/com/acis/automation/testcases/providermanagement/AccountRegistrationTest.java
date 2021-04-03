package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.caseplan.PermanencyPlan_OmniScriptPage;
import com.acis.automation.pages.caseplan.ServiceToProviderPage;
import com.acis.automation.pages.caseplan.VisitationPlan_OmniScriptPage;
import com.acis.automation.pages.providermanagement.FosterInquirySecondPage;
import com.acis.automation.utilities.AcisException;

public class AccountRegistrationTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(AccountRegistrationTest.class);

	public AccountRegistrationTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(enabled = true, description = "US-0224 Provider Management - Account Registration - Portal Registration Page", groups = { "High",
			"acisRegression", "Akash" },priority=0)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {

		
		String parentFirstName = testData.get(Constants.AccountProviderManagemnt).get("ParentFirstName");
		
		String parentLastName = testData.get(Constants.AccountProviderManagemnt).get("ParentLastName");
		
		String phoneFirst = testData.get(Constants.AccountProviderManagemnt).get("PhoneNoFirst");
		

		String email1 = testData.get(Constants.AccountProviderManagemnt).get("emailFirst");
		String parentTwoFirst = testData.get(Constants.AccountProviderManagemnt).get("Parent2FirstName");
		String email2 = testData.get(Constants.AccountProviderManagemnt).get("emailSecond");
		String parentTwoLast = testData.get(Constants.AccountProviderManagemnt).get("Parent2LastName");
		String street1 = testData.get(Constants.AccountProviderManagemnt).get("street1");
		String city = testData.get(Constants.AccountProviderManagemnt).get("city");
		String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
		String whatname = testData.get(Constants.AccountProviderManagemnt).get("whatname");
		String zip = testData.get(Constants.AccountProviderManagemnt).get("zip");
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));

		home.verfiyHomePage();

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowHome();
		
		accountPage.swiitchInquiryPage();
		fosterParentInquiryFormPage.verifyFirstLast();
		fosterParentInquiryFormPage.setParent1FirstName(parentFirstName);
		fosterParentInquiryFormPage.setParent1LastName(parentLastName);
		fosterParentInquiryFormPage.setDate();
	
		fosterParentInquiryFormPage.setParent1PhoneNumber(phoneFirst);
		fosterParentInquiryFormPage.setParent1EmailAddress(email1);
		fosterParentInquiryFormPage.setenterParent2FirstName(parentTwoFirst);
		fosterParentInquiryFormPage.setParent2LastName(parentTwoLast);
		fosterParentInquiryFormPage.setParent2EmailAddress(email2);
		fosterParentInquiryFormPage.clickNextButton();
		fosterInquirySecondPage.enterText("street1", street1);
		fosterInquirySecondPage.enterText("city", city);
		fosterInquirySecondPage.provideState("California");
		fosterInquirySecondPage.providCountry("Allen");

		fosterInquirySecondPage.enterText("zip", zip);
		fosterInquirySecondPage.selectCheckBox();
		fosterInquirySecondPage.alreadyTalk("Yes");
		fosterInquirySecondPage.enterText("ifSo", whatname);
		fosterInquirySecondPage.selectNext();
		fosterInquirySecondPage.clickRegisterNext();

	

	

	}
	@Test(enabled = true, description = "US-0224 Provider Management - Account Registration - coming banck to application", groups = { "High",
			"acisRegression", "Akash" },priority=1)
	public void createPlacementaccountApplication() throws AcisException, InterruptedException, IOException {

	
		String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
		String convertYes = testData.get(Constants.AccountProviderManagemnt).get("convertYes");
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));

		home.verfiyHomePage();

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		accountPage.clickingFosterInquiry(prospective);
		accountPage.selectAll();
		accountPage.fosterParentAccountLink();
		//Relative Foster :Treatment Foster :Regular Foster
		accountPage.placement("Relative Foster");
		accountPage.verifyStatusConverttoPerson(convertYes);
		
	



	

	}
	@Test(enabled = false, description = "US-0224 Provider Management - Account Registration and verifying foster parent", groups = { "High",
			"acisRegression", "Akash" },priority=2)
	public void createPlacementaccountApplicationFosterParent() throws AcisException, InterruptedException, IOException {

	
		String username = testData.get(Constants.AccountProviderManagemnt).get("fosterUsername");
		String password = testData.get(Constants.AccountProviderManagemnt).get("fosterPassword");
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
System.out.println(password);
System.out.println(username);
		home.verfiyHomePage();

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();

		accountPage.loginToForestApplication(username, password);
		accountPage.fosterParentfields();
		
}}
