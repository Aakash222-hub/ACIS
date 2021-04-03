package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class OverrideNewButtonFunctionalityForAccountTest extends TestBase{

	public OverrideNewButtonFunctionalityForAccountTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	@Test(description = "S-1123 Provider Management - New Account Tab placement resource of type kinship ", groups = { "High",
			"acisRegression", "Pallavi" }, priority = 0)
	public void KinshipPlacementResource() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
				homePage_SFDCPage.selectAllAccount();
				homePage_SFDCPage.clickNewButton();
				placementResourcePage.verifyExistingAccountType();
				placementResourcePage.selectKPResourceRadioButton();
				
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-1123 Provider Management - New Account Tab placement resource of type kinship ");
		}
		
	}
	
	@Test(description = "S-1123 Provider Management - New Account Tab placement resource of type kinship ", groups = { "High",
			"acisRegression", "Pallavi" }, priority = 1)
	public void KinshipPlacementResourceLicensing() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
				home.verfiyHomePage();

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAccount();
				//homePage_SFDCPage.selectAllAccount();
				homePage_SFDCPage.clickNewButton();
				placementResourcePage.verifyExistingAccountType();
				placementResourcePage.selectKPResourceRadioButton();
				
				
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-1123 Provider Management - New Account Tab placement resource of type kinship ");
		}

}

}

