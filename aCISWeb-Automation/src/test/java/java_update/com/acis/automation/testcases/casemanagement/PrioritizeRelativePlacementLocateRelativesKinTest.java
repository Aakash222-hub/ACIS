package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PrioritizeRelativePlacementLocateRelativesKinTest extends TestBase {

	public PrioritizeRelativePlacementLocateRelativesKinTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PrioritizeRelativePlacementLocateRelativesKinTest.class);

	public static String allegationID,fosterCaseID,fosterCaseID1 ;
	
	String firstName=excel.generateRandomTestData(excel.generateRandomTestData("", 4),4);
	String middleName=excel.generateRandomTestData(excel.generateRandomTestData("", 3),3);
	String lastName=excel.generateRandomTestData(excel.generateRandomTestData("", 3),3);
	
	String secondfirstName = excel.generateRandomTestData(excel.generateRandomTestData("", 4), 4);
	String secondmiddleName = excel.generateRandomTestData(excel.generateRandomTestData("", 3), 3);
	String secondlastName = excel.generateRandomTestData(excel.generateRandomTestData("", 3), 4);

	String thirdfirstName = excel.generateRandomTestData(excel.generateRandomTestData("TP", 4), 4);
	String thirdmiddleName = excel.generateRandomTestData(excel.generateRandomTestData("TP", 3), 3);
	String thirdlastName = excel.generateRandomTestData(excel.generateRandomTestData("TP", 3), 4);
	
	String fourthfirstName = excel.generateRandomTestData(excel.generateRandomTestData("P", 4), 4);
	String fourthmiddleName = excel.generateRandomTestData(excel.generateRandomTestData("P", 3), 3);
	String fourthlastName = excel.generateRandomTestData(excel.generateRandomTestData("P", 3), 4);

	String fifthfirstName = excel.generateRandomTestData(excel.generateRandomTestData("FV", 4), 4);
	String fifthmiddleName = excel.generateRandomTestData(excel.generateRandomTestData("FV", 3), 3);
	String fifthlastName = excel.generateRandomTestData(excel.generateRandomTestData("FV", 3), 4);

	String sixthfirstName = excel.generateRandomTestData(excel.generateRandomTestData("S", 4), 4);
	String sixthmiddleName = excel.generateRandomTestData(excel.generateRandomTestData("S", 3), 3);
	String sixthlastName = excel.generateRandomTestData(excel.generateRandomTestData("S", 3), 4);

	String seventhfirstName = excel.generateRandomTestData(excel.generateRandomTestData("Se", 4), 4);
	String seventhmiddleName = excel.generateRandomTestData(excel.generateRandomTestData("Se", 3), 3);
	String seventhlastName = excel.generateRandomTestData(excel.generateRandomTestData("Se", 3), 4);

	String eighthfirstName = excel.generateRandomTestData(excel.generateRandomTestData("E", 4), 4);
	String eighthhmiddleName = excel.generateRandomTestData(excel.generateRandomTestData("e", 3), 3);
	String eighthlastName = excel.generateRandomTestData(excel.generateRandomTestData("E", 3), 4);

	String ninethfirstName = excel.generateRandomTestData(excel.generateRandomTestData("N", 4), 4);
	String ninethmiddleName = excel.generateRandomTestData(excel.generateRandomTestData("N", 3), 3);
	String ninethlastName = excel.generateRandomTestData(excel.generateRandomTestData("N", 3), 4);


	String maltreator  = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
	String victim = secondfirstName.concat(" ").concat(secondmiddleName).concat(" ").concat(secondlastName);

	String maltreator_OOH  = fourthfirstName.concat(" ").concat(fourthmiddleName).concat(" ").concat(fourthlastName);
	String victim_OOH = fifthfirstName.concat(" ").concat(fifthmiddleName).concat(" ").concat(fifthlastName);

	String maltreator_IntakeSupervisor  = sixthfirstName.concat(" ").concat(sixthmiddleName).concat(" ").concat(sixthlastName);
	String victim_IntakeSupervisor = seventhfirstName.concat(" ").concat(seventhmiddleName).concat(" ").concat(seventhlastName);

	String maltreator_OOHSupervisor  = eighthfirstName.concat(" ").concat(eighthhmiddleName).concat(" ").concat(eighthlastName);
	String victim_OOHSupervisor = ninethfirstName.concat(" ").concat(ninethmiddleName).concat(" ").concat(ninethlastName);

	String firstPersonName  = firstName.concat(" ").concat(lastName);
	String fourthPersonName = fourthfirstName.concat(" ").concat(fourthlastName);
	String sixthPersonName = sixthfirstName.concat(" ").concat(sixthlastName);
	String eighthPersonName = eighthfirstName.concat(" ").concat(eighthlastName);
	
	int count1, count2,count3,count4 ;

	@Test(description = " US:0962 Prioritize Relative Placement - Locate Relatives/Kin - Intake Login Part", groups = { "High", "acisRegression",
			"Mrunal" },priority = 0)

	public void prioritizeRelativePlacementLocateRelativesKinIntakeLogin() throws AcisException, InterruptedException, IOException {

			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
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
			reportDetailsOmniscriptPage
					.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
			reportDetailsOmniscriptPage.setDate("Incident");
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();

			createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
			createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
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
			createIntakePerson_OmniscriptPage.setAllNames(secondfirstName, secondmiddleName, secondlastName);
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
			screeningDecision_OmniscriptPage.selectCaseHead(victim);
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		//	screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
			screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
			allegationID = allegationReportPage.getAllegationID();
			homePage_SFDCPage.closeTabs();
			
			count1++;
		
	}

	@Test(description = " US:0962 Prioritize Relative Placement - Locate Relatives/Kin- Supervisor Approval Part", groups = { "High",
			"acisRegression", "Mrunal" },priority = 1)

	public void prioritizeRelativePlacementLocateRelativesKinSupervisorApproval()
			throws AcisException, Exception {

		
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
				allegationReportPage.verifyingAllegationReportStatus();
				count1++;
			}
			else
		 	{
		 		throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
		 	}
		  	
		

	}

	@Test(description = " US:0962 Create Investigation Case - Actual Ts", groups = { "High", "acisRegression",
			"Mrunal" },priority = 2)

	public void prioritizeRelativePlacementLocateRelativesKin() throws AcisException, Exception {

	
			if (count1 == 2) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationID);
				allegationReportPage.clickRelatedTab();
				allegationReportPage.clickonAlligationRecord();
				
				investigationCasePage.clickLocateRelativeKin();
				
				locateRelativesPage.verifyMessages();
				locateRelativesPage.selectCheckBox("Ask family members");
				locateRelativesPage.enterInitials("ABC");
				locateRelativesPage.clickNextButton();
				personsInvovledPage.searchPersonUsingvalidData("firstName", "a");
				personsInvovledPage.linkToCreateNewPerson();
				personsInvovledPage.setAllNames("first",thirdfirstName, thirdmiddleName, thirdlastName);
				personsInvovledPage.clickSaveButton("first");
				personsInvovledPage.clickNextButton();
				// Add relationship 
				establishRelationshipsPage.clickCreateAddButton();
				establishRelationshipsPage.searchText(victim, "Person");
				establishRelationshipsPage.setRelationShip("Child-Mother");
				establishRelationshipsPage.searchText( maltreator, "Related");
				establishRelationshipsPage.clickSaveButton("first");
				establishRelationshipsPage.clickNext();
				createPlacementResourcePage.selectPlacementCreate("Yes");
				createPlacementResourcePage.selectParent(firstPersonName, "Parent 1");
				createPlacementResourcePage.selectAddressSame();
				createPlacementResourcePage.clickSubmitButton();
				
				investigationCasePage.closeLocateRelativeKinTab();
				investigationCasePage.clickRelatedTabOfInvestigation();
				investigationCasePage.clickCasePersonTab();
				investigationCasePage.sortAddressIDColumn("Descedning");
				investigationCasePage.clickCasePerson(maltreator);
				placementPersonAccountPage.checkPlacementTypeValue("Kinship");
				placementPersonAccountPage.clickDetailsTabOfPlacementAccount();
				placementPersonAccountPage.verifyParent1Value(maltreator);
				placementPersonAccountPage.verifyAddress(testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
				placementPersonAccountPage.verifyAddress(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
				homePage_SFDCPage.closeTabs();
				
				
			}
			else
		 	{
		 		throw new Exception("Pre-requisite for Intake Approval Does Not completed Successfully, so can not run this test");
		 	}
		  	

	
	}



	@Test(description = " US:0962 Prioritize Relative Placement - Locate Relatives/Kin - Intake Login Part", groups = { "High", "acisRegression",
	"Mrunal" },priority = 3)

	public void prioritizeRelativePlacementLocateRelativesKinOOHCaseIntakeLogin() throws AcisException, InterruptedException, IOException {
	
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
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
		reportDetailsOmniscriptPage
				.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
		reportDetailsOmniscriptPage.setDate("Incident");
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
	
		createIntakePerson_OmniscriptPage.setAllNames(fourthfirstName, fourthmiddleName, fourthlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
	//	createIntakePerson_OmniscriptPage.provideContactInformation(
	//			testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
	//			testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
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
		createIntakePerson_OmniscriptPage.setAllNames(fifthfirstName, fifthmiddleName, fifthlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
	//	createIntakePerson_OmniscriptPage.provideContactInformation(
	//			testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
	//			testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
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
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
		screeningDecision_OmniscriptPage.selectCaseHead(maltreator_OOH);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
	//	screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator_OOH, victim_OOH);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
		allegationID = allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		
		count2++;
	
	}

	@Test(description = " US:0962 Prioritize Relative Placement - Locate Relatives/Kin- Supervisor Approval Part", groups = { "High",
			"acisRegression", "Mrunal" },priority = 4)

	public void prioritizeRelativePlacementLocateRelativesKinOOHCaseSupervisorApproval()
			throws AcisException, Exception {


		if (count2 == 1) {
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
			count2++;
		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
	 	}
  	


}

	
	@Test(description = " US:0962 Prioritize Relative Placement - Locate Relatives/Kin : OOH User", groups = { "High",
			"aCIS_Regression", "Mrunal" },priority = 5)
	public void prioritizeRelativePlacementLocateRelativesKinOOHCase() throws AcisException, Exception {
	
	if(count2==2)	
	{
		System.out.println("in test case 60");

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowCaseHead();
		homePage_SFDCPage.selectAllCaseHeads();
		homePage_SFDCPage.searchRecordAndClick(maltreator_OOH);
		fosterCaseID=caseHeadPage.newFosterCaseBySelectingMaltreatorAndVictim();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
		
		investigationCasePage.clickLocateRelativeKin();
		
		locateRelativesPage.verifyMessages();
		locateRelativesPage.selectCheckBox("Ask family members");
		locateRelativesPage.enterInitials("ABC");
		locateRelativesPage.clickNextButton();
		personsInvovledPage.searchPersonUsingvalidData("firstName", "a");
		personsInvovledPage.linkToCreateNewPerson();
		personsInvovledPage.setAllNames("first",thirdfirstName, thirdmiddleName, thirdlastName);
		personsInvovledPage.clickSaveButton("first");
		personsInvovledPage.clickNextButton();
		// Add relationship 
		establishRelationshipsPage.clickCreateAddButton();
		establishRelationshipsPage.searchText(victim_OOH, "Person");
		establishRelationshipsPage.setRelationShip("Child-Mother");
		establishRelationshipsPage.searchText( maltreator_OOH, "Related");
		establishRelationshipsPage.clickSaveButton("first");
		establishRelationshipsPage.clickNext();
		createPlacementResourcePage.selectPlacementCreate("Yes");
		createPlacementResourcePage.selectParent(fourthPersonName, "Parent 1");
		createPlacementResourcePage.selectAddressSame();
		createPlacementResourcePage.clickSubmitButton();
		
		investigationCasePage.closeLocateRelativeKinTab();
		caseActionPage.clickRelatedTab();
		investigationCasePage.clickCasePersonTab();
		investigationCasePage.sortAddressIDColumn("Descedning");
		investigationCasePage.clickCasePerson(maltreator_OOH);
		placementPersonAccountPage.checkPlacementTypeValue("Kinship");
		placementPersonAccountPage.clickDetailsTabOfPlacementAccount();
		placementPersonAccountPage.verifyParent1Value(maltreator_OOH);
		placementPersonAccountPage.verifyAddress(testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		placementPersonAccountPage.verifyAddress(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
		homePage_SFDCPage.closeTabs();
		   
	}
	else {
		throw new Exception("Pre-requisite for Intake Approval Does Not completed Successfully, so can not run this test");
	}

	}
	
	
	@Test(description = " US:0962 Prioritize Relative Placement - Locate Relatives/Kin - Intake Login Part", groups = { "High", "acisRegression",
	"Mrunal" },priority = 6)

	public void prioritizeRelativePlacementLocateRelativesKinIntakeLoginForSupervisor() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
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
		reportDetailsOmniscriptPage
				.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
		reportDetailsOmniscriptPage.setDate("Incident");
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
	
		createIntakePerson_OmniscriptPage.setAllNames(sixthfirstName, sixthmiddleName, sixthlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
	//	createIntakePerson_OmniscriptPage.provideContactInformation(
	//			testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
	//			testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
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
		createIntakePerson_OmniscriptPage.setAllNames(seventhfirstName, seventhmiddleName, seventhlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
	//	createIntakePerson_OmniscriptPage.provideContactInformation(
	//			testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
	//			testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
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
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.selectCaseHead(victim_IntakeSupervisor);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
	//	screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator_IntakeSupervisor, victim_IntakeSupervisor);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
		allegationID = allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		
		count3++;

	}

	@Test(description = " US:0962 Prioritize Relative Placement - Locate Relatives/Kin- Supervisor Approval Part", groups = { "High",
	"acisRegression", "Mrunal" },priority = 7)

	public void prioritizeRelativePlacementLocateRelativesKinSupervisorApprovalForSupervisor()
		throws AcisException, Exception {


		if (count3 == 1) {
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
			count3++;
		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
	 	}
	  	


}

	@Test(description = " US:0962 Create Investigation Case - Actual Ts", groups = { "High", "acisRegression",
		"Mrunal" },priority = 8)
	
	public void prioritizeRelativePlacementLocateRelativesKinForSupervisor() throws AcisException, Exception {
	
	
		if (count3 == 2) {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			
			investigationCasePage.clickLocateRelativeKin();
			
			locateRelativesPage.verifyMessages();
			locateRelativesPage.selectCheckBox("Ask family members");
			locateRelativesPage.enterInitials("ABC");
			locateRelativesPage.clickNextButton();
			personsInvovledPage.searchPersonUsingvalidData("firstName", "a");
			personsInvovledPage.linkToCreateNewPerson();
			personsInvovledPage.setAllNames("first",thirdfirstName, thirdmiddleName, thirdlastName);
			personsInvovledPage.clickSaveButton("first");
			personsInvovledPage.clickNextButton();
			// Add relationship 
			establishRelationshipsPage.clickCreateAddButton();
			establishRelationshipsPage.searchText(victim_IntakeSupervisor, "Person");
			establishRelationshipsPage.setRelationShip("Child-Mother");
			establishRelationshipsPage.searchText( maltreator_IntakeSupervisor, "Related");
			establishRelationshipsPage.clickSaveButton("first");
			establishRelationshipsPage.clickNext();
			createPlacementResourcePage.selectPlacementCreate("Yes");
			createPlacementResourcePage.selectParent(sixthPersonName, "Parent 1");
			createPlacementResourcePage.selectAddressSame();
			createPlacementResourcePage.clickSubmitButton();
			
			investigationCasePage.closeLocateRelativeKinTab();
			investigationCasePage.clickRelatedTabOfInvestigation();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.sortAddressIDColumn("Descedning");
			investigationCasePage.clickCasePerson(maltreator_IntakeSupervisor);
			placementPersonAccountPage.checkPlacementTypeValue("Kinship");
			placementPersonAccountPage.clickDetailsTabOfPlacementAccount();
			placementPersonAccountPage.verifyParent1Value(maltreator_IntakeSupervisor);
			placementPersonAccountPage.verifyAddress(testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
			placementPersonAccountPage.verifyAddress(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
			homePage_SFDCPage.closeTabs();
			
			
		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Intake Approval Does Not completed Successfully, so can not run this test");
	 	}
	  	


}


	
	@Test(description = " US:0962 Prioritize Relative Placement - Locate Relatives/Kin - Intake Login Part", groups = { "High", "acisRegression",
	"Mrunal" },priority = 9)

	public void prioritizeRelativePlacementLocateRelativesKinOOHCaseIntakeLoginForSupervsior() throws AcisException, InterruptedException, IOException {
	
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
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
		reportDetailsOmniscriptPage
				.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
		reportDetailsOmniscriptPage.setDate("Incident");
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
	
		createIntakePerson_OmniscriptPage.setAllNames(eighthfirstName, eighthhmiddleName, eighthlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
	//	createIntakePerson_OmniscriptPage.provideContactInformation(
	//			testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
	//			testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
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
		createIntakePerson_OmniscriptPage.setAllNames(ninethfirstName, ninethmiddleName, ninethlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
	//	createIntakePerson_OmniscriptPage.provideContactInformation(
	//			testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
	//			testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
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
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
		screeningDecision_OmniscriptPage.selectCaseHead(maltreator_OOHSupervisor);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
	//	screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator_OOHSupervisor, victim_OOHSupervisor);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
		allegationID = allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		
		count4++;
	
	}

	@Test(description = " US:0962 Prioritize Relative Placement - Locate Relatives/Kin- Supervisor Approval Part", groups = { "High",
			"acisRegression", "Mrunal" },priority = 10)

	public void prioritizeRelativePlacementLocateRelativesKinOOHCaseSupervisorApprovalForSupervsior()
			throws AcisException, Exception {


		if (count4 == 1) {
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
			count4++;
		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
	 	}
  	


}

	
	@Test(description = " US:0962 Prioritize Relative Placement - Locate Relatives/Kin : OOH User", groups = { "High",
			"aCIS_Regression", "Mrunal" },priority = 11)
	public void prioritizeRelativePlacementLocateRelativesKinOOHCaseForSupervsior() throws AcisException, Exception {
	
	if(count4==2)	
	{
		System.out.println("in test case 60");

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowCaseHead();
		homePage_SFDCPage.selectAllCaseHeads();
		homePage_SFDCPage.searchRecordAndClick(maltreator_OOHSupervisor);
		fosterCaseID1=caseHeadPage.newFosterCaseBySelectingMaltreatorAndVictim();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID1);
		
		investigationCasePage.clickLocateRelativeKin();
		
		locateRelativesPage.verifyMessages();
		locateRelativesPage.selectCheckBox("Ask family members");
		locateRelativesPage.enterInitials("ABC");
		locateRelativesPage.clickNextButton();
		personsInvovledPage.searchPersonUsingvalidData("firstName", "a");
		personsInvovledPage.linkToCreateNewPerson();
		personsInvovledPage.setAllNames("first",thirdfirstName, thirdmiddleName, thirdlastName);
		personsInvovledPage.clickSaveButton("first");
		personsInvovledPage.clickNextButton();
		// Add relationship 
		establishRelationshipsPage.clickCreateAddButton();
		establishRelationshipsPage.searchText(victim_OOHSupervisor, "Person");
		establishRelationshipsPage.setRelationShip("Child-Mother");
		establishRelationshipsPage.searchText( maltreator_OOHSupervisor, "Related");
		establishRelationshipsPage.clickSaveButton("first");
		establishRelationshipsPage.clickNext();
		createPlacementResourcePage.selectPlacementCreate("Yes");
		createPlacementResourcePage.selectParent(eighthPersonName, "Parent 1");
		createPlacementResourcePage.selectAddressSame();
		createPlacementResourcePage.clickSubmitButton();
		
		investigationCasePage.closeLocateRelativeKinTab();
		caseActionPage.clickRelatedTab();
		investigationCasePage.clickCasePersonTab();
		investigationCasePage.sortAddressIDColumn("Descedning");
		investigationCasePage.clickCasePerson(maltreator_OOHSupervisor);
		placementPersonAccountPage.checkPlacementTypeValue("Kinship");
		placementPersonAccountPage.clickDetailsTabOfPlacementAccount();
		placementPersonAccountPage.verifyParent1Value(maltreator_OOHSupervisor);
		placementPersonAccountPage.verifyAddress(testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		placementPersonAccountPage.verifyAddress(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
		homePage_SFDCPage.closeTabs();
		   
	}
	else {
		throw new Exception("Pre-requisite for Intake Approval Does Not completed Successfully, so can not run this test");
	}

	}
	

}
