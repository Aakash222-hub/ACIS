package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class AssoicatedAllegationsTest extends TestBase {

	public AssoicatedAllegationsTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String allegationID, maltreator, victim, victimSecond;
	int count=0;
	final static Logger logger = LoggerFactory.getLogger(AssoicatedAllegationsTest.class);

	@Test(priority = 1, description = "US:0023 Carry over / store allegations and associate to alleged victims/maltreators", groups = {
			"Medium", "acisRegression", "Dharmesh" })
	public void CarryOverAllegationIntakeCreation() throws AcisException, InterruptedException, IOException {

		try {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			maltreator = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").concat(" ")
					.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"));
			victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
					.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"));
			victimSecond = testData.get(Constants.PersonInvovledAllData).get("thirdPersonFirstName").concat(" ")
					.concat(testData.get(Constants.PersonInvovledAllData).get("thirdPersonMiddleName"));
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
			
			
			createIntakePerson_OmniscriptPage.prvoideSuffix(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonSuffix"));
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
			createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
			createIntakePerson_OmniscriptPage.setAllNames(
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"),
					testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"),
					testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"));
			createIntakePerson_OmniscriptPage.prvoideSuffix(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonSuffix"));
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
			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			createIntakePerson_OmniscriptPage.setAllNames(
					testData.get(Constants.PersonInvovledAllData).get("thirdPersonFirstName"),
					testData.get(Constants.PersonInvovledAllData).get("thirdPersonMiddleName"),
					testData.get(Constants.PersonInvovledAllData).get("thirdPersonLastName"));
			createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			//personsInvovled_OmniscriptPage.clickRefresPersonButton();
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
			// Options : newCase||existingCase
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
			screeningDecision_OmniscriptPage.selectAssociateExistingInvestigation("No");
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			// Options : workerComments||supervisoryComments||narrative
			// Options : newCase||existingCase
			screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
			screeningDecision_OmniscriptPage.newAllegations("Neglect", maltreator, victimSecond);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationID = allegationReportPage.getAllegationID();
			count++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0023 Carry over / store allegations and associate to alleged victims/maltreators");
		}

	}

	@Test(priority = 2, description = "US:0023 Carry over / store allegations and associate to alleged victims/maltreators Approve and Verify Supervisor", groups = {
			"Medium", "acisRegression", "Dharmesh" })
	public void CarryOverAllegationApproved() throws AcisException, InterruptedException, IOException {

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
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickRelatedTab();
				investigationCasePage.clickAllegationTab();
				investigationCasePage.verifyAllegationRecord("Abuse", "Neglect", maltreator, victim, victimSecond);
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0023 Carry over / store allegations and associate to alleged victims/maltreators Approve and Verify Supervisor");
		}

	}

	@Test(priority = 3, description = "US:0023 Carry over / store allegations and associate to alleged victims/maltreators Verify Intake", groups = {
			"Medium", "acisRegression", "Dharmesh" })
	public void CarryOverAllegationVerifyIntake() throws AcisException, InterruptedException, IOException {

		try {
			if (count == 2) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickRelatedTab();
				investigationCasePage.clickAllegationTab();
				investigationCasePage.verifyAllegationRecord("Abuse", "Neglect", maltreator, victim, victimSecond);
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0023 Carry over / store allegations and associate to alleged victims/maltreators Verify Intake");
		}
	}

	@Test(priority = 4, description = "US:0023 Carry over / store allegations and associate to alleged victims/maltreators Verify Investigator", groups = {
			"Medium", "acisRegression", "Dharmesh" })
	public void CarryOverAllegationVerifyInvestigator() throws AcisException, InterruptedException, IOException {

		try {
			if (count == 3) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickRelatedTab();
				investigationCasePage.clickAllegationTab();
				investigationCasePage.verifyAllegationRecord("Abuse", "Neglect", maltreator, victim, victimSecond);
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0023 Carry over / store allegations and associate to alleged victims/maltreators Verify Investigator");
		}
	}

	@Test(priority = 5, description = "US:0023 Carry over / store allegations and associate to alleged victims/maltreators Verify Admin", groups = {
			"Medium", "acisRegression", "Dharmesh" })
	public void CarryOverAllegationVerifyAdmin() throws AcisException, InterruptedException, IOException {

		try {
			if (count == 4) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.verifyingAllegationReportStatus();
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				investigationCasePage.clickRelatedTab();
				investigationCasePage.clickAllegationTab();
				investigationCasePage.verifyAllegationRecord("Abuse", "Neglect", maltreator, victim, victimSecond);
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:0023 Carry over / store allegations and associate to alleged victims/maltreators Verify Admin");
		}
	}
}
