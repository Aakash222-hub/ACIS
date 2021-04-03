package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class IntakeHouseholdRelationshipsTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(IntakeHouseholdRelationshipsTest.class);

	public IntakeHouseholdRelationshipsTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	/***
	 * This script include US-0018 && US-007
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 * @throws IOException
	 */

	String firstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
	String middleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
	String lastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);

	  
	String secondFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"), 3);
	String secondMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"), 3);
	String secondLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"), 3);

	String thirdFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"), 4);
	String thirdMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"), 4);
	String thirdLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"), 4);

	String fourthFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("fourthPersonFirstName"), 4);
	String fourthMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("fourthPersonMiddleName"), 4);
	String fourthLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("fourthPersonLastName"), 4);

	String fifthFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("FifthPersonFirstName"), 4);
	String fifthMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("FifthPersonMiddleName"), 4);
	String fifthLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("FifthPersonLastName"), 4);
	
	String sixthFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("thirdPersonFirstName"), 4);
	String sixthMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("fourthPersonMiddleName"), 4);
	String sixthLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("fifthPersonLastName"), 4);

	String intakeCaseID, allegationIDFirst, allegationIDSecond;
	int count = 0;

	@Test(priority = 0, description = "S-1009:Intake Relationships Intake Part 2 CaseHeadCheck", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void createIntakeFirst() throws AcisException, InterruptedException, IOException {
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
					testData.get(Constants.REPORTDETAILSPAGE).get("middleName"), "", "",
					testData.get(Constants.REPORTDETAILSPAGE).get("role"));
			reportDetailsOmniscriptPage
					.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
			reportDetailsOmniscriptPage.setDate("Incident");
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();

			createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
			createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
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

			createIntakePerson_OmniscriptPage.setAllNames(secondFirstName, secondMiddleName, secondLastName);
			createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
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
			searchPerson_OmniscriptPage.linkToCreateNewPerson();

			createIntakePerson_OmniscriptPage.setAllNames(thirdFirstName, thirdMiddleName, thirdLastName);
			createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
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
			personsInvovled_OmniscriptPage.clickRefresPersonButton();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickCreateAddButton();
			agencyHistory_OmniscriptPage.searchText(secondFirstName.concat(" ").concat(secondLastName), "Person");
			agencyHistory_OmniscriptPage.searchText(firstName.concat(" ").concat(lastName), "Related");
			agencyHistory_OmniscriptPage.setRelationShip("Child-Mother");
			agencyHistory_OmniscriptPage.clickSaveButton();
			agencyHistory_OmniscriptPage.clickCreateAddButton();
			agencyHistory_OmniscriptPage.searchText(thirdFirstName.concat(" ").concat(thirdLastName), "Person");
			agencyHistory_OmniscriptPage.searchText(secondFirstName.concat(" ").concat(secondLastName), "Related");
			agencyHistory_OmniscriptPage.setRelationShip("Sibling-Sibling");
			agencyHistory_OmniscriptPage.clickSaveButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
			structuredDecisionMakingOmniscriptPage.clickNextButton();

			// Options : workerComments||supervisoryComments||narrative
			screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "");
			// Options : newCase||existingCase
			screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			screeningDecision_OmniscriptPage.verifyRequiredFields();
			// Options : screenOut||familyServices||investigation
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
			allegationIDFirst = allegationReportPage.getAllegationID();
			count++;
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-1009:Intake Relationships  Intake Part 2 CaseHeadCheck");
		}

	}

	@Test(priority = 1, description = "S-1009:Intake Relationships  intake approval", groups = {
			"High", "acisRegression", "Dharmesh" })
	public void OverrideSupervisorFirst() throws AcisException, InterruptedException, IOException {
		String maltreator = firstName.concat(" ").concat(middleName);
		try {
			if (count == 1) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();

				homePage_SFDCPage.searchGlobal(allegationIDFirst);
				allegationReportPage.clickIntakeBtn();
				reportDetailsOmniscriptPage.clickNextBtn();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.selectAcceptAssign();
				screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-1009:Intake Relationships  intake approval");
		}

	}

	@Test(description = "S-1009:Intake Relationships  Foster Care Case", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 2)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 2) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
				homePage_SFDCPage.searchRecordAndClick(firstName + " " + middleName + " " + lastName);
				caseHeadPage.clickRelatedTab("First Related tab");
				caseHeadPage.clickHouseholdRelationshipsLink();
				caseHeadPage.verifyHouseHoldRelation(secondFirstName + " " + secondMiddleName + " " + secondLastName,
						firstName + " " + middleName + " " + lastName,"Child-Mother");
				caseHeadPage.verifyHouseHoldRelation(thirdFirstName + " " + thirdMiddleName + " " + thirdLastName,
						secondFirstName + " " + secondMiddleName + " " + secondLastName,"Sibling-Sibling");
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-1009:Intake Relationships  Foster Care Case");
		}

	}

	@Test(priority = 3, description = "S-1009:Intake Relationships  CaseHeadCheck", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void createIntakeSecond() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 3) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				String maltreator = firstName.concat(" ").concat(middleName);
				String victim = fourthFirstName.concat(" ").concat(fourthMiddleName);
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.clickNewButton();
				reportDetailsOmniscriptPage.setDate("Intake");
				reportDetailsOmniscriptPage.selectIntakeMethod();
				reportDetailsOmniscriptPage.reporterAnonymousNo(
						testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("middleName"), "", "",
						testData.get(Constants.REPORTDETAILSPAGE).get("role"));
				reportDetailsOmniscriptPage
						.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
				reportDetailsOmniscriptPage.setDate("Incident");
				reportDetailsOmniscriptPage.clickNextBtn();
				searchPerson_OmniscriptPage.searchPersonUsingMultipleValidData("firstlastName", firstName, lastName);
				searchPerson_OmniscriptPage.selectPerson(firstName, lastName, "AllegedMallternator", "Yes");
				searchPerson_OmniscriptPage.linkToCreateNewPerson();

				createIntakePerson_OmniscriptPage.setAllNames(fourthFirstName, fourthMiddleName, fourthLastName);
				createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
						testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
						testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
						testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
						testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"));
				createIntakePerson_OmniscriptPage.clickPrimaryAddress();
				createIntakePerson_OmniscriptPage.provideBirthdate(
						testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstBirthYear"));
				createIntakePerson_OmniscriptPage
						.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstGender"));

				createIntakePerson_OmniscriptPage.clickSaveButton();
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
				searchPerson_OmniscriptPage.linkToCreateNewPerson();

				createIntakePerson_OmniscriptPage.setAllNames(fifthFirstName, fifthMiddleName, fifthLastName);
				createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
						testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
						testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
						testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
						testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"));
				createIntakePerson_OmniscriptPage.clickPrimaryAddress();
				createIntakePerson_OmniscriptPage.provideBirthdate(
						testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstBirthYear"));
				createIntakePerson_OmniscriptPage
						.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstGender"));
				createIntakePerson_OmniscriptPage.clickSaveButton();
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
				personsInvovled_OmniscriptPage.clickRefresPersonButton();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickCreateAddButton();
				agencyHistory_OmniscriptPage.searchText(fourthFirstName.concat(" ").concat(fourthLastName), "Person");
				agencyHistory_OmniscriptPage.searchText(firstName.concat(" ").concat(lastName), "Related");
				agencyHistory_OmniscriptPage.setRelationShip("Stepchild-Stepparent");
				agencyHistory_OmniscriptPage.clickSaveButton();
				agencyHistory_OmniscriptPage.clickCreateAddButton();
				agencyHistory_OmniscriptPage.searchText(fifthFirstName.concat(" ").concat(fifthLastName), "Person");
				agencyHistory_OmniscriptPage.searchText(fourthFirstName.concat(" ").concat(fourthLastName), "Related");
				agencyHistory_OmniscriptPage.setRelationShip("Cousin-Cousin");
				agencyHistory_OmniscriptPage.clickSaveButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
				structuredDecisionMakingOmniscriptPage.clickNextButton();

				// Options : workerComments||supervisoryComments||narrative
				screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "");
				// Options : newCase||existingCase
				screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				screeningDecision_OmniscriptPage.verifyRequiredFields();
				// Options : screenOut||familyServices||investigation
				screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				allegationReportPage.verifyingAllegationReportStatusSubmitted();
				allegationIDFirst = allegationReportPage.getAllegationID();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-1009:Intake Relationships  CaseHeadCheck");
		}

	}

	@Test(priority = 4, description = " S-1009:Intake Relationships  intake approval", groups = {
			"High", "acisRegression", "Dharmesh" })
	public void OverrideSupervisorSecond() throws AcisException, InterruptedException, IOException {
		String maltreator = firstName.concat(" ").concat(middleName);
		try {
			if (count == 4) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();

				homePage_SFDCPage.searchGlobal(allegationIDFirst);
				allegationReportPage.clickIntakeBtn();
				reportDetailsOmniscriptPage.clickNextBtn();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.selectAcceptAssign();
				screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-1009:Intake Relationships  intake approval");
		}

	}
	
	@Test(description = "S-1009:Intake Relationships  Foster Care Case", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 5)
	public void CreateFosterCareCaseCheck() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 5) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
				homePage_SFDCPage.searchRecordAndClick(firstName + " " + middleName + " " + lastName);
				caseHeadPage.clickRelatedTab("First Related tab");
				caseHeadPage.clickHouseholdRelationshipsLink();
				caseHeadPage.verifyHouseHoldRelation(secondFirstName + " " + secondMiddleName + " " + secondLastName,
						 firstName + " " + middleName + " " + lastName, "Child-Mother");
				caseHeadPage.verifyHouseHoldRelation(thirdFirstName + " " + thirdMiddleName + " " + thirdLastName,
						secondFirstName + " " + secondMiddleName + " " + secondLastName, "Sibling-Sibling");
				caseHeadPage.verifyHouseHoldRelation(fourthFirstName + " " + fourthMiddleName + " " + fourthLastName,
						firstName + " " + middleName + " " + lastName , "Stepchild-Stepparent");
				caseHeadPage.verifyHouseHoldRelation(fifthFirstName + " " + fifthMiddleName + " " + fifthLastName,
						fourthFirstName + " " + fourthMiddleName + " " + fourthLastName, "Cousin-Cousin");
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-1009:Intake Relationships  Foster Care Case");
		}

	}

	@Test(priority = 6, description = "S-1009:Intake Relationships  CaseHeadCheck", groups = {
			"Medium", "ACIS_Regression", "Dharmesh" })
	public void createIntakeThird() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 6) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				String maltreator = sixthFirstName.concat(" ").concat(sixthMiddleName);
				String victim = thirdFirstName.concat(" ").concat(thirdMiddleName);
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.clickNewButton();
				reportDetailsOmniscriptPage.setDate("Intake");
				reportDetailsOmniscriptPage.selectIntakeMethod();
				reportDetailsOmniscriptPage.reporterAnonymousNo(
						testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("middleName"), "", "",
						testData.get(Constants.REPORTDETAILSPAGE).get("role"));
				reportDetailsOmniscriptPage
						.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
				reportDetailsOmniscriptPage.setDate("Incident");
				reportDetailsOmniscriptPage.clickNextBtn();
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
				searchPerson_OmniscriptPage.linkToCreateNewPerson();
				createIntakePerson_OmniscriptPage.setAllNames(sixthFirstName, sixthMiddleName, sixthLastName);
				createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
				createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
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
				searchPerson_OmniscriptPage.searchPersonUsingMultipleValidData("firstlastName", thirdFirstName, thirdLastName);
				searchPerson_OmniscriptPage.selectPerson(thirdFirstName, thirdLastName, "AllegedVictim", "No");
				searchPerson_OmniscriptPage.searchPersonUsingMultipleValidData("firstlastName", secondFirstName, secondLastName);
				searchPerson_OmniscriptPage.selectPerson(secondFirstName, secondLastName, "AllegedVictim", "No");
				personsInvovled_OmniscriptPage.clickRefresPersonButton();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
				structuredDecisionMakingOmniscriptPage.clickNextButton();

				// Options : workerComments||supervisoryComments||narrative
				screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "");
				// Options : newCase||existingCase
				screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				screeningDecision_OmniscriptPage.verifyRequiredFields();
				// Options : screenOut||familyServices||investigation
				screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				allegationReportPage.verifyingAllegationReportStatusSubmitted();
				allegationIDFirst = allegationReportPage.getAllegationID();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-1009:Intake Relationships  CaseHeadCheck");
		}

	}

	@Test(priority = 7, description = " S-1009:Intake Relationships  intake approval", groups = {
			"High", "acisRegression", "Dharmesh" })
	public void OverrideSupervisorThird() throws AcisException, InterruptedException, IOException {
		String maltreator = firstName.concat(" ").concat(middleName);
		try {
			if (count == 7) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();

				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();

				homePage_SFDCPage.searchGlobal(allegationIDFirst);
				allegationReportPage.clickIntakeBtn();
				reportDetailsOmniscriptPage.clickNextBtn();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.selectAcceptAssign();
				screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				count++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed S-1009:Intake Relationships  intake approval");
		}

	}
	
	@Test(description = "S-1009:Intake Relationships  Foster Care Case", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 8)
	public void CreateFosterCareCaseThird() throws AcisException, InterruptedException, IOException {
		try {
			if (count == 8) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
						testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowCaseHead();
				homePage_SFDCPage.selectAllCaseHeads();
				homePage_SFDCPage.searchRecordAndClick(sixthFirstName + " " + sixthMiddleName + " " + sixthLastName);
				caseHeadPage.clickRelatedTab("First Related tab");
				caseHeadPage.clickHouseholdRelationshipsLink();
				caseHeadPage.verifyHouseHoldRelation(thirdFirstName + " " + thirdMiddleName + " " + thirdLastName,
						secondFirstName + " " + secondMiddleName + " " + secondLastName, "Sibling-Sibling");
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed S-1009:Intake Relationships  Foster Care Case");
		}

	}
}
