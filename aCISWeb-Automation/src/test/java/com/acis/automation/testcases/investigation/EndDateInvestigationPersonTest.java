package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class EndDateInvestigationPersonTest extends TestBase{

	public EndDateInvestigationPersonTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(InvestigationCaseTest.class);
//	String allegationID ,victim ,maltreator;
	String allegationID ;
	int count1;
	String firstName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 4);
	 String middleName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
	 String lastName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 4);

	 String secondfirstName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"), 4);
	 String secondmiddleName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"), 3);
	 String secondlastName = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"), 4);

	 String  victim = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
	 String maltreator = secondfirstName.concat(" ").concat(secondmiddleName).concat(" ").concat(secondlastName);
	
	
	@Test(description = " US:0114 Investigation - End date investigation person - Intake Creation", groups = { "High",
			"acisRegression", "Mrunal" },priority = 0)

	public void endDateInvestigationPersonIntakeCreation() throws AcisException, InterruptedException, IOException {
		
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
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
//		createIntakePerson_OmniscriptPage.provideContactInformation(
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
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
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
//		createIntakePerson_OmniscriptPage.provideContactInformation(
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
//				testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
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
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
	    allegationID=allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		count1++;
	
	}
	
	@Test(description = " US:0114 Investigation - End date investigation person - Intake Approval", groups = { "High",
			"acisRegression", "Mrunal" },priority = 1)

	public void endDateInvestigationPersonIntakeApproval() throws AcisException, Exception {

		if(count1 ==1) {
			
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
			homePage_SFDCPage.closeTabs();
			count1++;

		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
	 	}
	  	
	}
	
	
	
	@Test(description = " US:0114 Investigation - End date investigation person - Actual TS Investigation USer", groups = { "High",
			"acisRegression", "Mrunal" },priority = 2)

	public void endDateInvestigationPersonTest() throws AcisException, Exception {
		
		if(count1==2) {
			
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
	//		homePage_SFDCPage.searchGlobal("I-00005309");
			/*For Disposition Value : None*/
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickCasePersonID(victim);
			
			investigationCasePage.clickEditButton();
			investigationCasePage.verifyRuledOutError();
			investigationCasePage.clickSaveButton();
			investigationCasePage.closeCasePersonIdTab();
			investigationCasePage.closeCasePersonTab();
			
			/*For Disposition Value : Substantiated*/
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAllegationTab();
			investigationCasePage.clickCaseAllegationID(victim);
			investigationCasePage.clickEditButton();
			investigationCasePage.selectDispositionValue("Substantiated");
			investigationCasePage.clickSaveButton();
			investigationCasePage.closeAllegationIdTab();
			investigationCasePage.closeAllegationTab();
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickCasePersonID(victim);
			investigationCasePage.clickEditButton();
			investigationCasePage.verifyRuledOutError();
			investigationCasePage.clickSaveButton();
			investigationCasePage.closeCasePersonIdTab();
			investigationCasePage.closeCasePersonTab();
			
			/*For Disposition Value : Unsubstantiated*/
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAllegationTab();
			investigationCasePage.clickCaseAllegationID(victim);
			investigationCasePage.clickEditButton();
			investigationCasePage.selectDispositionValue("Unsubstantiated");
			investigationCasePage.clickSaveButton();
			investigationCasePage.closeAllegationIdTab();
			investigationCasePage.closeAllegationTab();
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickCasePersonID(victim);
			investigationCasePage.clickEditButton();
			investigationCasePage.verifyRuledOutError();
			investigationCasePage.clickSaveButton();
			investigationCasePage.closeCasePersonIdTab();
			investigationCasePage.closeCasePersonTab();
			
			/*For Disposition Value : Ruleout*/
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAllegationTab();
			investigationCasePage.clickCaseAllegationID(victim);
			investigationCasePage.clickEditButton();
			investigationCasePage.selectDispositionValue("Ruled Out");
			investigationCasePage.clickSaveButton();
			investigationCasePage.closeAllegationIdTab();
			investigationCasePage.closeAllegationTab();
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickCasePersonID(victim);
			investigationCasePage.clickEditButton();
			/*End Date error and adding next month end date*/
			investigationCasePage.verifyEndDateError();
			investigationCasePage.selectNextMonthEndDate();
			investigationCasePage.closeCasePersonIdTab();
			
			String newfirstName = excel.generateRandomTestData(testData.get(Constants.EndDateInvestigation_SHEET).get("firstName"), 4);
			 String newmiddleName = excel.generateRandomTestData(testData.get(Constants.EndDateInvestigation_SHEET).get("middleName"), 3);
			 String newlastName = excel.generateRandomTestData(testData.get(Constants.EndDateInvestigation_SHEET).get("lastName"), 4);

			/*Adding new Investigation person*/
			investigationCasePage.clickAddInvestigationPersonButton();
			personInvovled_IP_OmniScriptPage.clickCreateAddButton();
			personInvovled_IP_OmniScriptPage.clickEditButton("next");
			personInvovled_IP_OmniScriptPage.setAllNames("next", newfirstName, newmiddleName, newlastName);
			
			personInvovled_IP_OmniScriptPage.clickSaveButton("next");
			personInvovled_IP_OmniScriptPage.clickNextButton();
			establishRelations_IP_OmniScriptPage.submitSafetyAssesment();
			String newPerson=newfirstName.concat(" ").
							concat(newmiddleName).concat(" ").
							concat(newlastName);
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickCasePersonID(newPerson);
			investigationCasePage.clickEditButton();
			/*End Date error and adding next month end date*/
			investigationCasePage.verifyEndDateError();
			investigationCasePage.selectNextMonthEndDate();
			homePage_SFDCPage.closeTabs();
				
		}
		else
		{
	 		throw new Exception("Pre-requisite for Intake Approval Does Not completed Successfully, so can not run this test");
		 }
		  		
	}
}
