package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.caseplan.PermanencyPlan_OmniScriptPage;
import com.acis.automation.pages.caseplan.ServiceToProviderPage;
import com.acis.automation.pages.caseplan.VisitationPlan_OmniScriptPage;
import com.acis.automation.utilities.AcisException;

public class NonmandatoryvalidationsCasePlanServiceTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(NonmandatoryvalidationsCasePlanServiceTest.class);

	public NonmandatoryvalidationsCasePlanServiceTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID;
	
	@Test(enabled=true,description = "S-0554 Non-mandatory validations-Case Plan, Service Referral, Placement", groups = { "High",
			"acisRegression", "Akash" }, priority = 0)
	public void CreatePlacementAccount() throws AcisException, InterruptedException, IOException {
		String zip = testData.get(Constants.OOhservicesCasePage)
				.get("zipcode");
		
		String zipinvalid = testData.get(Constants.OOhservicesCasePage)
				.get("zipInvalid");
			
		String caseId = testData.get(Constants.ValidationCasePlanPage)
				.get("CaseNo");
		
		
		String state = testData.get(Constants.ValidationCasePlanPage)
				.get("State");
		
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		

	

			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			investigationSafetyAssessmentPage.searchGlobalCaseId(caseId);
			serviceReferralPage.clickonServiceReferal("ServiceRefral");
			serviceReferralPage.searchPerson("referal", "a");
			serviceReferralPage.selectingTypeOfService("ChildCare");
			serviceReferralPage.verifyNoCityStateError("VerifyErrror");
			serviceReferralPage.enteringText("State", state);
			serviceReferralPage.searchPage();
			serviceReferralPage.verifyNoCityStateError("VerifyProvideHomePage");
			serviceReferralPage.closeserviceReferalPage();
			investigationSafetyAssessmentPage.searchGlobalCaseId(caseId);
			serviceReferralPage.clickonServiceReferal("Placement");
			newPlacement_OmniScriptPage.selectICPCPlacement("No");
			serviceReferralPage.searchPerson("placement", "a");
			newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
			newPlacement_OmniScriptPage.selectTypeOfPlacement("Relative Foster");
			newPlacement_OmniScriptPage.selectStartDate();
			newPlacement_OmniScriptPage.enterZipCode(zipinvalid);
			newPlacement_OmniScriptPage.clickSearchButton();
			placementSearchResults_OmniScriptPage.verifyPlacementResourceNF();
			placementSearchResults_OmniScriptPage.clickPreviousButton();
			newPlacement_OmniScriptPage.enterZipCode(zip);
			newPlacement_OmniScriptPage.clickSearchButton();
			serviceReferralPage.verifyNoCityStateError("VerifyPlacement");
	 
	  
	    
	    
	    
	  
	    

		}

	}
	
	

