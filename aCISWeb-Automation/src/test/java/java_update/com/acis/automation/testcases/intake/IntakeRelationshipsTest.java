package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class IntakeRelationshipsTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(IntakeRelationshipsTest.class);

	public IntakeRelationshipsTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	String firstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
	String middleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
	String lastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);

	String secondFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"), 6);
	String secondMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"), 6);
	String secondLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"), 6);
	
	int count = 0;
	String allegationID;
	
	@Test(priority=0,description = "S-0971:Intake Relationships (Person Relationships)", groups = { "Medium", "ACIS_Regression",
			"Dharmesh" })
	public void intakeRelationship() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			String maltreator = firstName.concat(" ").concat(middleName);
			String victim = secondFirstName.concat(" ").concat(secondMiddleName);
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
					firstName,
					middleName,
					lastName);
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
			createIntakePerson_OmniscriptPage.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage
					.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));

			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			
			createIntakePerson_OmniscriptPage.setAllNames(
					secondFirstName,
					secondMiddleName,
					secondLastName);
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
			agencyHistory_OmniscriptPage.clickCreateAddButton();
			agencyHistory_OmniscriptPage.searchText(firstName.concat(" ").concat(lastName),"Person");
			agencyHistory_OmniscriptPage.searchText(secondFirstName.concat(" ").concat(secondLastName),"Related");
			agencyHistory_OmniscriptPage.setRelationShip("Child-Mother");
			agencyHistory_OmniscriptPage.clickSaveButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			
			// Options : workerComments||supervisoryComments||narrative
			screeningDecision_OmniscriptPage.selectCaseHead(maltreator);;
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "");
			// Options : newCase||existingCase
			screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			screeningDecision_OmniscriptPage.verifyRequiredFields();
			// Options : screenOut||familyServices||investigation
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
			allegationID = allegationReportPage.getAllegationID();
			allegationReportPage.clickRelatedTab();
		    allegationReportPage.clickIntakePerson(firstName.concat(" ").concat(lastName));
		    insightsPage.verifyRelationship(firstName.concat(" ").concat(middleName).concat(" ").concat(lastName), "Child-Mother", secondFirstName.concat(" ").concat(secondMiddleName).concat(" ").concat(secondLastName));
		    count++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0971:Intake Relationships (Person Relationships)");
		}
		

	}


	@Test(priority=1,description = "S-0971:Intake Relationships (Person Relationships) Investigator", groups = { "Medium", "ACIS_Regression",
			"Dharmesh" })
	public void intakeRelationshipInvestigationVerify() throws AcisException, InterruptedException, IOException {
		try {
				if (count == 1) {
					userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
							testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
					home.verfiyHomePage();
					homePage_SFDCPage.closeTabs();
					homePage_SFDCPage.clickDownArrowAllegation();
					homePage_SFDCPage.selectAllAllegation();
					homePage_SFDCPage.searchGlobal(allegationID);
					allegationReportPage.clickIntakeBtn();
					reportDetailsOmniscriptPage.clickNextBtn();
					personsInvovled_OmniscriptPage.clickNextButton();
					agencyHistory_OmniscriptPage.verifyRelationship(firstName.concat(" ").concat(middleName).concat(" ").concat(lastName), "Child-Mother", secondFirstName.concat(" ").concat(secondMiddleName).concat(" ").concat(secondLastName));
					agencyHistory_OmniscriptPage.clickNextButton();
					structuredDecisionMakingOmniscriptPage.clickNextButton();
					screeningDecision_OmniscriptPage.clickSubmitbtn();
					allegationReportPage.verifyingAllegationReportStatus();
					allegationReportPage.clickRelatedTab();
				    allegationReportPage.clickIntakePerson(firstName.concat(" ").concat(lastName));
				    insightsPage.verifyRelationship(firstName.concat(" ").concat(middleName).concat(" ").concat(lastName), "Child-Mother", secondFirstName.concat(" ").concat(secondMiddleName).concat(" ").concat(secondLastName));
					count++;
				} else {
					throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
				}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-0971:Intake Relationships (Person Relationships)");
		}

	}
	@Test(priority=2,description = "S-0971:Intake Relationships (Person Relationships) Case Worker", groups = { "Medium", "ACIS_Regression",
	"Dharmesh" })
public void intakeRelationshipCaseVerify() throws AcisException, InterruptedException, IOException {
try {
		if (count == 2) {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
					testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickIntakeBtn();
			reportDetailsOmniscriptPage.clickNextBtn();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.verifyRelationship(firstName.concat(" ").concat(middleName).concat(" ").concat(lastName), "Child-Mother", secondFirstName.concat(" ").concat(secondMiddleName).concat(" ").concat(secondLastName));
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatus();
			allegationReportPage.clickRelatedTab();
		    allegationReportPage.clickIntakePerson(firstName.concat(" ").concat(lastName));
		    insightsPage.verifyRelationship(firstName.concat(" ").concat(middleName).concat(" ").concat(lastName), "Child-Mother", secondFirstName.concat(" ").concat(secondMiddleName).concat(" ").concat(secondLastName));
		} else {
			throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
		}
} catch (Exception e) {
	// TODO Auto-generated catch block
	getStackTrace(e,
			"Failed S-0971:Intake Relationships (Person Relationships)");
}

}
}
