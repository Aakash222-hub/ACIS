package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class ChangeLinkedInvestigationonAllegationreportTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(ChangeLinkedInvestigationonAllegationreportTest.class);
	String allegation_ID, caseId, caseIdTwo, allegation_ID2;
	String maltreatorFN = excel.generateRandomTestData("M", 4);
	String maltreatorMN = excel.generateRandomTestData("Mt", 4);
	String maltreator = maltreatorFN.concat(" ").concat(maltreatorMN);
	String victimExtraFN = excel.generateRandomTestData("Ec", 6);
	String victimExtraLN = excel.generateRandomTestData("El", 6);
	String victimExtra = victimExtraFN.concat(" ").concat(victimExtraLN);

	public ChangeLinkedInvestigationonAllegationreportTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	
	@Test(priority = 0,description = " US-0935 : Change Linked Investigation on Allegation report", groups = {
			"High", "aCIS_Regression", "Priyanka" })
	public void verifySearchedAllegationReportInfoIntake() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(maltreatorFN, maltreatorMN, maltreatorFN);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();

		
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(victimExtraFN, victimExtraLN, victimExtraFN);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();

		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();

		structuredDecisionMakingOmniscriptPage.clickNextButton();

		// Options : newCase||existingCase
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		//screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victimExtra);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegation_ID2 = allegationReportPage.getAllegationID();
		
		homePage_SFDCPage.logoutUser();

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.searchGlobal(allegation_ID2);

		allegationReportPage.clickIntakeBtn();
		reportDetailsOmniscriptPage.clickNextBtn();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectAcceptAssign();
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.getAllegatinID(allegation_ID2);
		allegationReportPage.clickRelatedTab();
		allegationReportPage.clickonAlligationRecord();
		caseId = investigationCasePage.getCaseId();
	}

	@Test(priority = 1,description = " US-0935 : Change Linked Investigation on Allegation report", groups = {
			"High", "aCIS_Regression", "Priyanka" })
	public void investigationStatusChange() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobal(allegation_ID2);//I-00001622
		allegationReportPage.clickEditButton();
        //allegationReportPage.verifyChangeInvestigationAndHereLink(caseId);//00001369
	}
	
	
}
