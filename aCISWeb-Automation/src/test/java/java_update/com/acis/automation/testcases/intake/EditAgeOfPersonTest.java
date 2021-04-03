package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class EditAgeOfPersonTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(EditAgeOfPersonTest.class);

	public EditAgeOfPersonTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	public static String allegationID;

	@Test(priority = 1, description = "S-0382:Edit Age of person of  saftey assessment workflow- Intake User", groups = {
			"Medium", "ACIS_Regression", "Khushboo" })
	
	public void editAgeOfPersonIntake() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
				testData.get(Constants.REPORTDETAILSPAGE).get("phone"),
				testData.get(Constants.REPORTDETAILSPAGE).get("email"),
				testData.get(Constants.REPORTDETAILSPAGE).get("role"));
		reportDetailsOmniscriptPage
				.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
		reportDetailsOmniscriptPage.setDate("Incident");
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames(
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),
				testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),
				testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"));
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
//		createIntakePerson_OmniscriptPage.provideContactInformation(
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
//		createIntakePerson_OmniscriptPage
//				.provideState(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstState"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
		createIntakePerson_OmniscriptPage
				.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		//searchPerson_OmniscriptPage.clickNextBtn();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
		// structuredDecisionMakingOmniscriptPage.narrativeTextBox();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		// Options : screenOut||familyServices||investigation
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		// Options : workerComments||supervisoryComments||narrative
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		// Options : newCase||existingCase
		//screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationID = allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.logoutUser();
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobal(allegationID);
		allegationReportPage.clickIntakeBtn();
		reportDetailsOmniscriptPage.clickNextBtn();
		//searchPerson_OmniscriptPage.clickNextBtn();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
		// Options : workerComments||supervisoryComments||narrative
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		screeningDecision_OmniscriptPage.selectOverride();
		screeningDecision_OmniscriptPage.selectDisposition("investigation");// family
		screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.closeIntakeOmniscript();
		allegationID = allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobal(allegationID);
		allegationReportPage.clickRelatedTab();
		allegationReportPage.clickonAlligationRecord();
		allegationReportPage.clickRelatedTabInvestigation();
		mandatoryPersonSearchSafetyAssesmentPage.clickOnNewSafetyAssessmentlink();
		reviewAllegationReport_SA_OmniScriptPage.clickEditFirstRecordButton();
//		mandatoryPersonSearchSafetyAssesmentPage.clickSafetyAssessment();
		reviewAllegationReport_SA_OmniScriptPage.EditApproxAge();
		reviewAllegationReport_SA_OmniScriptPage.clickSaveButton("first");
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.logoutUser();
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation(); //
		homePage_SFDCPage.searchGlobal(allegationID);
		allegationReportPage.clickRelatedTab();
		allegationReportPage.clickonAlligationRecord();
		allegationReportPage.clickRelatedTabInvestigation();
		mandatoryPersonSearchSafetyAssesmentPage.clickOnNewSafetyAssessmentlink();
		reviewAllegationReport_SA_OmniScriptPage.clickEditFirstRecordButton();
		reviewAllegationReport_SA_OmniScriptPage.EditApproxAge();
		reviewAllegationReport_SA_OmniScriptPage.clickSaveButton("first");
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.logoutUser();
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation(); //
		homePage_SFDCPage.searchGlobal(allegationID);
		allegationReportPage.clickRelatedTab();
		allegationReportPage.clickonAlligationRecord();
		allegationReportPage.clickRelatedTabInvestigation();
		mandatoryPersonSearchSafetyAssesmentPage.clickOnNewSafetyAssessmentlink();
		reviewAllegationReport_SA_OmniScriptPage.clickEditFirstRecordButton();
		reviewAllegationReport_SA_OmniScriptPage.EditApproxAge();
		reviewAllegationReport_SA_OmniScriptPage.clickSaveButton("first");

	}

	@Test(enabled=true,priority=2,description = "S-0382:Edit Age of person of  Investigation   workflow", groups = {
		  "Medium", "ACIS_Regression", "Khushboo" })
		  
		  public void editAgeOfPersonInvestigationSupervisor() throws AcisException, InterruptedException, IOException {
		 userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"), 
				 testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		  home.verfiyHomePage(); 
		  homePage_SFDCPage.closeTabs();
		  homePage_SFDCPage.clickDownArrowAllegation();
		  homePage_SFDCPage.selectAllAllegation();
		  homePage_SFDCPage.searchGlobal(allegationID);
		  allegationReportPage.clickRelatedTab();
		  allegationReportPage.clickonAlligationRecord();
		  investigationCasePage.clickInvestigationWorkflow();
		  reviewAllegationReport_SA_OmniScriptPage.clickEditFirstRecordButton();
		  reviewAllegationReport_SA_OmniScriptPage.EditApproxAge();
		  reviewAllegationReport_SA_OmniScriptPage.clickSaveButton("first");
		  homePage_SFDCPage.closeTabs(); 
		  homePage_SFDCPage.logoutUser();
		  userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get( "investigatorUserName"),
		  testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
		  home.verfiyHomePage();
		  homePage_SFDCPage.closeTabs();
		  homePage_SFDCPage.clickDownArrowAllegation();
		  homePage_SFDCPage.selectAllAllegation();
		  homePage_SFDCPage.searchGlobal(allegationID);
		  allegationReportPage.clickRelatedTab();
		  allegationReportPage.clickonAlligationRecord();
		  investigationCasePage.clickInvestigationWorkflow();
		  reviewAllegationReport_SA_OmniScriptPage.clickEditFirstRecordButton();
		  reviewAllegationReport_SA_OmniScriptPage.EditApproxAge();
		  reviewAllegationReport_SA_OmniScriptPage.clickSaveButton("first");
		  homePage_SFDCPage.closeTabs(); 
		  homePage_SFDCPage.logoutUser();		  
		  userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
		  testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
		  home.verfiyHomePage(); 
		  homePage_SFDCPage.closeTabs();
		  homePage_SFDCPage.clickDownArrowAllegation();
		  homePage_SFDCPage.selectAllAllegation();
		  homePage_SFDCPage.searchGlobal(allegationID);
		  allegationReportPage.clickRelatedTab();
		  allegationReportPage.clickonAlligationRecord();
		  investigationCasePage.clickInvestigationWorkflow();
		  reviewAllegationReport_SA_OmniScriptPage.clickEditFirstRecordButton();
		  reviewAllegationReport_SA_OmniScriptPage.EditApproxAge();
		  reviewAllegationReport_SA_OmniScriptPage.clickSaveButton("first");
		  homePage_SFDCPage.closeTabs();
		  homePage_SFDCPage.logoutUser(); }


}