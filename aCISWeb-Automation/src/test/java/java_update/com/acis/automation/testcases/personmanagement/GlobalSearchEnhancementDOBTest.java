package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class GlobalSearchEnhancementDOBTest extends TestBase{

	public GlobalSearchEnhancementDOBTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(GlobalSearchEnhancementDOBTest.class);
	
	@Test(description = "S-1025: Global Search Enhancements - Person DOB by OOH case worker", groups = { "small",
			"ACIS_Regression", "Khushboo" })

	public void searchDOBOOH() throws AcisException, InterruptedException, IOException {
	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation(); 
		homePage_SFDCPage.searchGlobalDOB("1/1/2018");
}
	
	@Test(description = "S-1025: Global Search Enhancements - Person DOB by intake case worker", groups = { "small",
			"ACIS_Regression", "Khushboo" })

	public void searchDOBintake() throws AcisException, InterruptedException, IOException {
	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation(); 
		homePage_SFDCPage.searchGlobalDOB("1/1/2018");
}
	@Test(description = "S-1025: Global Search Enhancements - Person DOB by investigation case worker", groups = { "small",
			"ACIS_Regression", "Khushboo" })

	public void searchDOBinvestigation() throws AcisException, InterruptedException, IOException {
	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation(); 
		homePage_SFDCPage.searchGlobalDOB("1/1/2018");
}
}
