package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class CaseClosureReviewBySupervisorTest extends TestBase{

	public CaseClosureReviewBySupervisorTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String fosterCaseID;
	String childFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 7);
	String childMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 7);
	String childLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 7);
	
	@Test(enabled=true,description = "S-0220 Case Management - List view for 'My Child Welfare Cases to Review'", groups = {
			"Medium", "acisRegression", "Pallavi" }, priority = 0)
	public void ListViewFields() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseActions();
				homePage_SFDCPage.selectMyChildWefareCasesToReview();
				homePage_SFDCPage.CasesToReview();

						
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0220 Case Management -  List view for 'My Child Welfare Cases to Review'");
		}

	}
	
	@Test(description = "S-0220 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"Medium", "acisRegression", "Pallavi" }, priority = 1)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
			    homePage_SFDCPage.clickFirstRecord();
				fosterCaseID = caseHeadPage.newFosterCaseWithoutHousholdMember();
				
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0220 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}
	
	@Test(enabled=true,description = "S-0220 Case Management - Close Case Error Message On Foster Care Case", groups = {
			"Medium", "acisRegression", "Pallavi" }, priority = 2)
	public void CloseCaseErrorMessage() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				caseClosureDecisionPage.openCloseCase();
				caseClosureDecisionPage.verifyCaseClosureCriteria();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-0220 Case Management - Close Case Error Message On Foster Care Case");
		}

	}
	
	@Test(description = "S-0220 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
			"Medium", "acisRegression", "Pallavi" }, priority = 3)
	public void FosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickRelatedTab();
				fosterCareCase_Page.clickPersonTab();
				fosterCareCase_Page.clickNewPerson();
				personsInvovled_CP_OmniscriptPage.searchNewPerson(childFirstName);
				personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
				personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
				personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
				personsInvovled_CP_OmniscriptPage.clickSaveButton("next");
				personsInvovled_CP_OmniscriptPage.clickNextButton();
				establishRelationships_CP_OmniScriptPage.clickSubmit();

			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0220 Case Management - New Placement Search Criteria Foster Care Case Add Person");
		}

	}
	

	@Test(enabled=true,description = "S-0220 Case Management -Prepare Case Closure On Foster Care Case Add Person", groups = {
			"Medium", "acisRegression", "Pallavi" }, priority = 4)
	public void CreateTask() throws AcisException, InterruptedException, IOException {
		try {
			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickRelatedTab();
				caseActionPage.openCasePerson();
				detailsPersonTabPage.clickDetailsTab();
				detailsPersonTabPage.editDateOfDeath("2020");
				detailsPersonTabPage.selectCauseOfDeath();
				detailsPersonTabPage.clickOnSaveButton();
				
			    
			    
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0220 Case Management -Prepare Case Closure On Foster Care Case Add Person");
		}

	}
	@Test(enabled=true,description = "S-0220 Case Management -Prepare Case Closure On Foster Care Case Add Person", groups = {
			"Medium", "acisRegression", "Pallavi" }, priority = 5)
	public void PrepareCaseClosure() throws AcisException, InterruptedException, IOException {
		try {
			
				
			    userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				caseActionPage.openCaseclosure();
				
				/*You do not have permission to mark this case as complete */
				caseClosureDecisionPage.ClickOnComplete();
				caseClosureDecisionPage.verifyingCompletePermission();
				caseClosureDecisionPage.ClickingOnFinish();
				
				/*Case submitted to supervisor */
				caseClosureDecisionPage.ClickOnSubmit();
				caseClosureDecisionPage.verifyCaseSubmitted();
				caseClosureDecisionPage.ClickingOnFinish();
				
				/*Case resubmitted to supervisor */
				caseClosureDecisionPage.ClickOnSubmit();
				caseClosureDecisionPage.verifyCaseResubmitted();
				caseClosureDecisionPage.ClickingOnFinish();
				
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0220 Case Management -Prepare Case Closure On Foster Care Case Add Person");
		}

	}
	

	@Test(enabled=true,description = "S-0220 Case Management -Prepare Case Closure On Foster Care Case Add Person", groups = {
			"Medium", "acisRegression", "Pallavi" }, priority = 6)
	public void PrepareCaseClosurSupervisor() throws AcisException, InterruptedException, IOException {
		try {
			
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				caseActionPage.openCaseclosure();
				
				/* Case already submitted  */
				caseClosureDecisionPage.ClickOnSubmit();
				caseClosureDecisionPage.verifyCaseResubmitted();
				caseClosureDecisionPage.ClickingOnFinish();
				
				/* Case  marked complete*/
				caseClosureDecisionPage.ClickOnComplete();
				caseClosureDecisionPage.verifyingCaseMarkComplete();
				caseClosureDecisionPage.ClickingOnFinish();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0220 Case Management -Prepare Case Closure On Foster Care Case Add Person");
		}

	}
	
	
	
	@Test(description = "S-0220 Case Management -Prepare Case Closure On Foster Care Case Add Person", groups = {
			"Medium", "acisRegression", "Pallavi" }, priority = 7)
	public void ApproveOverideCase() throws AcisException, InterruptedException, IOException {
		try {
			
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				caseClosureDecisionPage.openCloseCase();//close case
				
				/* Updating the Status fields Approve or Override*/
				caseClosureDecisionPage.ClickOnSupervisoryApproval("Accept");
				caseClosureDecisionPage.enterTextFieldValue("Demo Worker");
//				caseClosureDecisionPage.ClickOnSupervisoryApproval("Accept");
				caseClosureDecisionPage.enterTextFieldSupervisoryComment("Comment");
				caseClosureDecisionPage.clickSubmitbtn();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0220 Case Management -Prepare Case Closure On Foster Care Case Add Person");
		}

	}
}
