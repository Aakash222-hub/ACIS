package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class InvestigationAddPersonTest extends TestBase {

	public InvestigationAddPersonTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID;
	String firstPersonFirstName = testData.get(Constants.PersonInvolvedInvestigation_SHEET).get("firstPersonFirstName");
	String firstPersonMiddleName = testData.get(Constants.PersonInvolvedInvestigation_SHEET)
			.get("firstPersonMiddleName");
	String firstPersonLastName = testData.get(Constants.PersonInvolvedInvestigation_SHEET).get("firstPersonLastName");
	String newPersonFirstName = testData.get(Constants.PersonInvolvedInvestigation_SHEET).get("secondPersonFirstName");
	String newPersonMiddleName = testData.get(Constants.PersonInvolvedInvestigation_SHEET)
			.get("secondPersonMiddleName");
	String newPersonLastName = testData.get(Constants.PersonInvolvedInvestigation_SHEET).get("secondPersonLastName");
	String firstPerson = firstPersonFirstName.concat(" ").concat(firstPersonMiddleName);
	String secondPerson = newPersonFirstName.concat(" ").concat(newPersonMiddleName);
	int count = 0;
	final static Logger logger = LoggerFactory.getLogger(RiskAssessmentsTest.class);

	@Test(priority = 0, description = "S-0320 Investigation - Add Person(s) Omniscript Intake Creation", groups = {
			"Medium", "acisRegression", "Dharmesh" })
	public void intakeCreation() throws AcisException, InterruptedException, IOException {

		try {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();

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
					testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
					"",
					"",
					testData.get(Constants.REPORTDETAILSPAGE).get("role"));
			//testData.get(Constants.REPORTDETAILSPAGE).get("phone")
			//testData.get(Constants.REPORTDETAILSPAGE).get("email")
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
//			createIntakePerson_OmniscriptPage.provideContactInformation(
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//					testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"));
			createIntakePerson_OmniscriptPage.clickPrimaryAddress();
			createIntakePerson_OmniscriptPage
					.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage
					.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstGender"));

			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			// Options : screenOut||familyServices||investigation
			// screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			// Options : workerComments||supervisoryComments||narrative
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "");
			// Options : newCase||existingCase
			screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
			screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			screeningDecision_OmniscriptPage.verifyRequiredFields();
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
			allegationID = allegationReportPage.getAllegationID();
			count++;

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-0320 Investigation - Add Person(s) Omniscript Intake Creation");

		}
	}

	@Test(priority = 1, description = "S-0320 Investigation - Add Person(s) Omniscript Allegation Approval", groups = {
			"Medium", "acisRegression", "Dharmesh" })
	public void submitIntake() throws AcisException, InterruptedException, IOException {

		try {
			if (count == 1) {
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
				allegationReportPage.verifyingAllegationReportStatus();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-0320 Investigation - Add Person(s) Omniscript Allegation Approval");

		}
	}

	@Test(priority = 2, description = "S-0320 Investigation - Add Person(s) Omniscript Investigator", groups = {
			"Medium", "acisRegression", "Dharmesh" })
	public void riskAssessment() throws AcisException, InterruptedException, IOException {

		try {
			if (count == 2) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickRelatedTab();
				investigationCasePage.clickCasePersonTab();
				investigationCasePage.clickAddInvestigationPersonButton();
				personInvovled_IP_OmniScriptPage.clickCreateAddButton();
				personInvovled_IP_OmniScriptPage.verifyPersonData("first");
				personInvovled_IP_OmniScriptPage.clickCreateAddButton();
				personInvovled_IP_OmniScriptPage.searchNewPerson("sadwqdwqdwq");
				personInvovled_IP_OmniScriptPage.setAllNames("next", firstPersonFirstName, firstPersonMiddleName,
						firstPersonLastName);
				personInvovled_IP_OmniScriptPage.clickSaveButton("next");
				personInvovled_IP_OmniScriptPage.clickCreateAddButton();
				personInvovled_IP_OmniScriptPage.clickEditButton("next");
				personInvovled_IP_OmniScriptPage.setAllNames("next", newPersonFirstName, newPersonMiddleName,
						newPersonLastName);
				personInvovled_IP_OmniScriptPage.clickSaveButton("next");
				personInvovled_IP_OmniScriptPage.clickNextButton();
				establishRelations_IP_OmniScriptPage.clickCreateAddButton();
				establishRelations_IP_OmniScriptPage.searchText(firstPerson, "Person");
				establishRelations_IP_OmniScriptPage.searchText(secondPerson, "Related");
				establishRelations_IP_OmniScriptPage.clickSaveButton();
				establishRelations_IP_OmniScriptPage.verifyRequired();
				establishRelations_IP_OmniScriptPage.setRelationShip("Child-Mother");
				establishRelations_IP_OmniScriptPage.clickSaveButton();
				establishRelations_IP_OmniScriptPage.submitSafetyAssesment();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-0320 Investigation - Add Person(s) Omniscript Investigator");

		}
	}

	@Test(priority = 3, description = "S-0320 Investigation - Add Person(s) Omniscript Supervisor", groups = { "Medium",
			"acisRegression", "Dharmesh" })
	public void addPersonSupervisor() throws AcisException, InterruptedException, IOException {

		try {
			if (count == 3) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickRelatedTab();
				investigationCasePage.clickCasePersonTab();
				investigationCasePage.clickAddInvestigationPersonButton();
				personInvovled_IP_OmniScriptPage.clickNextButton();
				establishRelations_IP_OmniScriptPage.clickCreateAddButton();
				establishRelations_IP_OmniScriptPage.searchText(firstPerson, "Person");
				establishRelations_IP_OmniScriptPage.searchText(secondPerson, "Related");
				establishRelations_IP_OmniScriptPage.clickSaveButton();
				establishRelations_IP_OmniScriptPage.verifyRequired();
				establishRelations_IP_OmniScriptPage.setRelationShip("Child-Father");
				establishRelations_IP_OmniScriptPage.clickSaveButton();
				establishRelations_IP_OmniScriptPage.submitSafetyAssesment();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-0320 Investigation - Add Person(s) Omniscript Supervisor");

		}
	}

	@Test(priority = 4, description = "S-0320 Investigation - Add Person(s) Omniscript Check CaseHead Relationship", groups = {
			"Medium", "acisRegression", "Dharmesh" })
	public void checkCaseHead() throws AcisException, InterruptedException, IOException {

		try {
			if (count == 4) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickDetailsTabOfInvestigation();
				investigationCasePage.clickCaseHead();
				caseHeadPage.clickRelatedTabCase();
				caseHeadPage.verifyHouseHoldRelation(firstPerson, secondPerson, "Child-Father");
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, " Failed S-0320 Investigation - Add Person(s) Omniscript Check CaseHead Relationship");

		}
	}
}
