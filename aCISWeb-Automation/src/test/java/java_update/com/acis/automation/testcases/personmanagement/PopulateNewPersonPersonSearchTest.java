package com.acis.automation.testcases.personmanagement;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.investigation.PersonsInvovled_IP_OmniscriptPage;
import com.acis.automation.utilities.AcisException;

public class PopulateNewPersonPersonSearchTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(PopulateNewPersonPersonSearchTest.class);

	public PopulateNewPersonPersonSearchTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	String allegationID, investigationCaseId;
	String firstPersonFirstName = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName");
	String firstPersonMiddleName = testData.get(Constants.PersonInvovledAllData)
			.get("firstPersonMiddleName");
	String firstPersonLastName = testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName");
	String newPersonFirstName = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName");
	String newPersonMiddleName = testData.get(Constants.PersonInvovledAllData)
			.get("secondPersonMiddleName");
	String newPersonLastName = testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName");
	String firstPerson = firstPersonFirstName.concat(" ").concat(firstPersonMiddleName);
	String secondPerson = newPersonFirstName.concat(" ").concat(newPersonMiddleName);
	String  maltreator, victim, victimSecond, riskAssessmentID, safetyAssessmentID,nameVerify;
	int count1 = 0;

//safety assessmnet
		
	@Test(enabled = true, description = "S-1015:Auto-populate new person information with Person Search info", groups = {
			"High", "ACIS_Regressions", "Akash" }, priority = 3)
	public void validatingInvestigationSafetyAssesment() throws AcisException, InterruptedException, IOException {
		try {
			String narrativeData1 = testData.get(Constants.InvestigationSafetyFeature).get("narrativeTextInterview1");

			String professionalData1 = testData.get(Constants.InvestigationSafetyFeature).get("professionalText1");

			String typeField = testData.get(Constants.InvestigationSafetyFeature).get("type");

			String subType = testData.get(Constants.InvestigationSafetyFeature).get("subType");
			String firstName_Sa = excel
					.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			String errorPerson = testData.get(Constants.EstablishRelationshipPage).get("errorPerson");
			
			
			String firstName_Ip = excel
					.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			String middleName_Sa = excel
					.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
			String lastName_Sa = excel
					.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);

			
			
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalforInvestigation(investigationCaseId);
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickAddInvestigationPersonButtonVerfiying();
			reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
			searchPerson_OmniscriptPage.searchPersonUsingvalidDataforReviewAllegation(firstName_Sa);
			personsInvovled_IP_OmniscriptPage.personSearchErrorVerfication(errorPerson);
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			personsInvovled_IP_OmniscriptPage.cancel();
			investigationCasePage.clickInvestigationWorkflow();
			searchPerson_OmniscriptPage.searchPersonUsingvalidDataforReviewAllegation(firstName_Sa);
			personsInvovled_IP_OmniscriptPage.personSearchErrorVerfication(errorPerson);
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			personsInvovled_IP_OmniscriptPage.setAllNamesafterClickingWorkflow("first", firstName_Ip, middleName_Sa, lastName_Sa);
			personsInvovled_IP_OmniscriptPage.clickSaveButton("saveforIp");
			
			
			

			
		} catch (AcisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	
	
	@Test(enabled = true, description = "S-1015:Auto-populate new person information with Person Search info  this is verifying created add  person in new safety assesmsnt", groups = {
			"High", "ACIS_Regressions", "Akash" }, priority = 4)
	public void validatingnewSafetyAssesmment() throws AcisException, InterruptedException, IOException, UnsupportedFlavorException {
		try {
			String narrativeData1 = testData.get(Constants.InvestigationSafetyFeature).get("narrativeTextInterview1");

			String professionalData1 = testData.get(Constants.InvestigationSafetyFeature).get("professionalText1");

			String typeField = testData.get(Constants.InvestigationSafetyFeature).get("type");

			String subType = testData.get(Constants.InvestigationSafetyFeature).get("subType");
			String firstName_Sa = excel
					.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			String errorPerson = testData.get(Constants.EstablishRelationshipPage).get("errorPerson");
			
			
			String firstName_Ip = excel
					.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
			String middleName_Sa = excel
					.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
			String lastName_Sa = excel
					.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);

			
			
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalforInvestigation(investigationCaseId);
			investigationCasePage.clickRelatedTab();
			mandatoryPersonSearchSafetyAssesmentPage.clickNewSafetyAssessment();
			reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
			searchPerson_OmniscriptPage.searchPersonUsingvalidDataforReviewAllegation(firstName_Sa);
			personsInvovled_IP_OmniscriptPage.personSearchErrorVerfication(errorPerson);
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			nameVerify=	personsInvovled_IP_OmniscriptPage.setAllNamesafterClickingWorkflowPopulate("first", firstName_Ip, middleName_Sa, lastName_Sa);
			personsInvovled_IP_OmniscriptPage.clickSaveButton("saveforIp");
			
		
			personsInvovled_IP_OmniscriptPage.verifyName(nameVerify);
			
			

			
		} catch (AcisException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Test(enabled = true, description = "S-1015 Auto-populate new person information with Person Search info pre-requisite 1", groups = {
			"High", "ACIS_Regression", "Akash" }, priority = 0)
	public void validatingInvestigationWorkflowCreatingIntake() throws AcisException, Exception {

		if (count1 == 0) {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			String maltreator = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").concat(" ")
					.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"));
			String victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
					.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.setDate("Intake");
			reportDetailsOmniscriptPage.selectIntakeMethod();
			reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("middleName"), "", "",
					testData.get(Constants.REPORTDETAILSPAGE).get("role"));
			// testData.get(Constants.REPORTDETAILSPAGE).get("phone")
			// testData.get(Constants.REPORTDETAILSPAGE).get("email")
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
//			createIntakePerson_OmniscriptPage.provideContactInformation(
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
//			createIntakePerson_OmniscriptPage
//					.provideState(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstState"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
			createIntakePerson_OmniscriptPage.clickPrimaryAddress();
			createIntakePerson_OmniscriptPage
					.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage
					.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));

			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			searchPerson_OmniscriptPage.linkToCreateNewPerson();

			createIntakePerson_OmniscriptPage.setAllNames(
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"),
					testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"),
					testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"));
			createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
//			createIntakePerson_OmniscriptPage.provideContactInformation(
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
//			createIntakePerson_OmniscriptPage
//					.provideState(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstState"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"));
			createIntakePerson_OmniscriptPage.clickPrimaryAddress();
			createIntakePerson_OmniscriptPage
					.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage
					.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstGender"));

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
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");

			// Options : workerComments||supervisoryComments||narrative
			screeningDecision_OmniscriptPage.selectCaseHead(maltreator);

			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			// screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "");
			// Options : newCase||existingCase
			screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);

			// Options : screenOut||familyServices||investigation

			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationID = allegationReportPage.getAllegationID();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
			
			count1++;
		} else {
			throw new Exception(
					"Pre-requisite for Intake ID Validation  Does Not completed Successfully, so can not run this test");
		}

	}

	@Test(enabled = true, description = "S-1015:Auto-populate new person information with Person Search info submitting intake pre-Requesit 2", groups = {
			"High", "ACIS_Regression", "Akash" }, priority = 1)
	public void validatingInvestigationWorkflowSubmititngIntake() throws AcisException, Exception {

		if (count1 == 1) {
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
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			screeningDecision_OmniscriptPage.cancelButton();
			allegationReportPage.verifyingAllegationReportStatus();
		
			investigationCaseId = allegationReportPage.getInvestigationCaseID();
			count1++;
		} else {
			throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
		}

	}


}
