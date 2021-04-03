package com.acis.automation.testcases.casemanagement;

import java.io.IOException;
import java.text.ParseException;

import org.apache.commons.io.filefilter.FalseFileFilter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.testcases.intake.IntakePersonBirthdateTest;
import com.acis.automation.utilities.AcisException;

public class PermanencyDashboardDefaultPermanencyGoalTest extends TestBase {

	public PermanencyDashboardDefaultPermanencyGoalTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	final static Logger logger = LoggerFactory.getLogger(PermanencyDashboardDefaultPermanencyGoalTest.class);
	String allegationID,fosterCaseID , fullName;
	int count;
	
	@Test(description = "US:0602 : Permanency Dashboard - Default Permanency Goal : Intake creation", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 0)

		public void permanencyDashboardDefaultPermanencyGoalCreation() throws AcisException, InterruptedException, IOException {
			try {

			String firstName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),4);
			String middleName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),3);
			String lastName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"),5);
			fullName = firstName+" "+middleName+" "+lastName;
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.setDate("Intake");
			reportDetailsOmniscriptPage.selectIntakeMethod();
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			
			createIntakePerson_OmniscriptPage.setAllNames(firstName,middleName,lastName);
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
			createIntakePerson_OmniscriptPage
					.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage
					.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();

			personsInvovled_OmniscriptPage.clickRefresPersonButton();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			screeningDecision_OmniscriptPage.selectCaseHead(fullName);
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
//			screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
			screeningDecision_OmniscriptPage.clickSubmitbtn();

			allegationID = allegationReportPage.getAllegationID();
			homePage_SFDCPage.closeTabs();
			count++;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0602 : Permanency Dashboard - Default Permanency Goal intake creation");
		}

	}

	@Test(description = "US:0602 : Permanency Dashboard - Default Permanency Goal : Intake approval", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 1)
	public void permanencyDashboardDefaultPermanencyGoalTestSupervisor() throws AcisException, Exception {
		if(count ==1)
		{
			String allegationReportIdNoAfterIsApprove = "";

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();

			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();

			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickIntakeBtn();
			reportDetailsOmniscriptPage.clickNextBtn();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectAcceptAssign();
			screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();

			allegationReportIdNoAfterIsApprove = allegationReportPage.verifyingAllegationReportStatus();
			allegationReportPage.verifyingAllegationStatusAfterOveride(allegationReportIdNoAfterIsApprove);
			homePage_SFDCPage.closeTabs();
			count++;
		}else {
			throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
		}


	}



	@Test(description = " US:0602 : Permanency Dashboard - Default Permanency Goal", groups = { "High",
				"aCIS_Regression", "Mrunal" },priority = 2)
		public void permanencyDashboardDefaultPermanencyGoalActual() throws AcisException, Exception {
	
		if(count==2)
		{	
			System.out.println("in test case 60");
			String childFirstName="child".concat(excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),4));
			String childMiddleName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),3);
			String childLastName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"),5);
			String childFullName= childFirstName + " " + childMiddleName + " " +childLastName;
			
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
			homePage_SFDCPage.searchRecordAndClick(fullName);
			fosterCaseID=caseHeadPage.newFosterCase();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
			
			/*Case management Pre-requisite*/
			caseActionPage.clickRelatedTab();
			fosterCareCase_Page.clickPersonTab();
			fosterCareCase_Page.clickNewPerson();
			personsInvovled_CP_OmniscriptPage.searchPersonUsingvalidData("firstName", childFirstName);
			personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
			personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
			personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first", "age", "15");
			personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
			personsInvovled_CP_OmniscriptPage.clickNextButton();
			establishRelationships_CP_OmniScriptPage.clickSubmit();
			 caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
			 homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowHome();
			fosterCareHomePage.checkPermanencyLabel();
			fosterCareHomePage.checkReunification(childFullName);
			homePage_SFDCPage.closeTabs(); 
		}
		else
		{
			throw new Exception("Pre-requisite for Intake Approval Does Not completed Successfully, so can not run this test");
			
		}
	}
}
