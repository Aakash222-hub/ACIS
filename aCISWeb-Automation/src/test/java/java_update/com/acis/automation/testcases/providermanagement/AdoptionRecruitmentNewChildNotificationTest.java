package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.providermanagement.FosterPlacementPage;
import com.acis.automation.utilities.AcisException;

public class AdoptionRecruitmentNewChildNotificationTest extends TestBase{

	public AdoptionRecruitmentNewChildNotificationTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(AdoptionRecruitmentNewChildNotificationTest.class);
	String allegationID, fosterCaseID;
	String fname = excel.generateRandomTestData("AaniF", 4);
	//String fname="AaneFZKTW";
	String sname = excel.generateRandomTestData("PoneL", 4);
	
	
	@Test(priority=0,description = "S-207 Provider Management - Adoption Recruitment-New Child Notification", groups = { "Medium",
			"ACIS_Regression", "Virendra/Priyanka" })
	public void getInvestigationID() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.clickFirstRecord();
			fosterCaseID = caseHeadPage.newFosterCase();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed :S-207 Provider Management - Adoption Recruitment-New Child Notification");

		}
	}
	
	@Test( description = "S-207 Provider Management - Adoption Recruitment-New Child Notification- Foster Care Case Add Person", groups = {
			"High", "acisRegression", "Virendra" }, priority = 1)
	public void fosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
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
			personsInvovled_CP_OmniscriptPage.clickEditButton("first");
			personsInvovled_CP_OmniscriptPage.setAllNames("first", fname, "", sname);
			personsInvovled_CP_OmniscriptPage.prvoideSuffix("first", "I");
			personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
			personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
			personsInvovled_CP_OmniscriptPage.clickNextButton();
			establishRelationships_CP_OmniScriptPage.clickSubmit();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-207 Provider Management - Adoption Recruitment-New Child Notification- Foster Care Case Add Person");
		}

	}
	@Test(priority=2,description = "S-207 Provider Management - Adoption Recruitment-New Child Notification ", groups = { "High", "acisRegression", "Virendra" })
	
	public void setPermanencyPlanAsadoptionForAdoptionRcrutmentNewChldNotificn()throws AcisException,InterruptedException,IOException{
		try{
		//homePage_SFDCPage.clickDownArrowCaseHead();
		
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
                testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		
		homePage_SFDCPage.closeTabs();
		
		homePage_SFDCPage.clickDownArrowAllegation();
	    homePage_SFDCPage.selectAllAllegation();
	    homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
	    //permanencyPlan_OmniScriptPage.clickOnNewCasePlan();
	    fosterCareCase_Page.clickOnNewCasePlanTab();
	    
	    permanencyPlan_OmniScriptPage.setPermanencyGoalsFor(fname);
		
		permanencyPlan_OmniScriptPage.primaryFirst("adoption");
		permanencyPlan_OmniScriptPage.setPermanencyNarrative("demo");
		permanencyPlan_OmniScriptPage.clickNextButton();
		servicesToTheChildren_OmniScriptPage.clickNextButton();
		serviceAgreementWithParents_OmniScriptPage.clickNextButton();
		visitationPlan_OmniScriptPage.addParentalVisitationPlan("No");
		visitationPlan_OmniScriptPage.addSiblingVisitations("No");
		visitationPlan_OmniScriptPage.clickNext();
		serviceToProviderPage.clickSubmit();	    
	    
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-207 Provider Management - Adoption Recruitment-New Child Notification- Foster Care Case Add Person");
		}

	}
		
		
@Test(priority=3,description = "S-207 Provider Management - Adoption Recruitment-New Child Notification ", groups = { "High", "acisRegression", "Virendra" })
	
	public void setPermanencyPlanAsadoptionForAdoptionRcrutmentNewChldNotificn1()throws AcisException,InterruptedException,IOException{
		try{
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
                testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
		home.verfiyHomePage();
		
		//home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
	    homePage_SFDCPage.clickDownArrowHome();
	    
        adoptionRecruitmentNewChildNotificationPage.ClickOnAdoptionRecruitment();
        adoptionRecruitmentNewChildNotificationPage.getCaseActionvalueForAdoptionRecruitment(fosterCaseID);
        adoptionRecruitmentNewChildNotificationPage.getPersonNamevalueForAdoptionRecruitment(fname);
        
        adoptionRecruitmentNewChildNotificationPage.clickONPersonNameAdoptionRecruitment(fname);
        adoptionRecruitmentNewChildNotificationPage.clickOnDetailsTab();
        adoptionRecruitmentNewChildNotificationPage.getPersonORAccountvalueUnderDetailsTab(fname);
        adoptionRecruitmentNewChildNotificationPage.geCurrentURLvalueafterRedirectionAdopcnRecrment();
	   
}
		catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S:0207 Provider Management - Adoption Recruitment-New Child Notification-Setting permanency Plan as 'Adoption' ");
		}
}
	




}
