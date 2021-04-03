package com.acis.automation.testcases.personmanagement;

import java.awt.AWTException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class NewRelationshipValidationTest extends TestBase  {

	public NewRelationshipValidationTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(NewRelationshipValidationTest.class);
	
	String allegationID ;
	int count1;
	
	String firstName = excel.generateRandomTestData(excel.generateRandomTestData("FP", 3), 4);
	 String middleName = excel.generateRandomTestData(excel.generateRandomTestData("FP", 4), 3);
	 String lastName = excel.generateRandomTestData(excel.generateRandomTestData("FP", 3), 4);
	
	 String secondfirstName = excel.generateRandomTestData(excel.generateRandomTestData("SP", 3), 4);
	 String secondmiddleName = excel.generateRandomTestData(excel.generateRandomTestData("SP", 3), 3);
	 String secondlastName = excel.generateRandomTestData(excel.generateRandomTestData("SP", 3), 4);
	 
	 String  victim = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
	 String maltreator = secondfirstName.concat(" ").concat(secondmiddleName).concat(" ").concat(secondlastName);

	
	@Test(description = "US01125 : New Relationship validation : Intake Person Creation" , groups = { "High",
			"aCIS_Regression", "Mrunal" } , priority = 0)
	   public void newRelationshipValidationTestIntake() throws AcisException, InterruptedException, AWTException, IOException 
	
	{
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(secondfirstName, secondmiddleName, secondlastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		personsInvovled_OmniscriptPage.clickRefresPersonButton();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.selectCaseHead(maltreator);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
//		screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
		homePage_SFDCPage.closeTabs();
		count1++;
	}

	
	
	@Test(description = "US01125 : New Relationship validation : Account Validation : Intake" , groups = { "High",
			"aCIS_Regression", "Mrunal" } , priority = 1)
	   public void newRelationshipValidationTestAccountValidationIntake() throws AcisException, InterruptedException, AWTException, IOException 
	
	{
	
		  userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
	      home.verfiyHomePage();
	      homePage_SFDCPage.closeTabs(); 
	      homePage_SFDCPage.clickDownArrowAccount();
	      homePage_SFDCPage.selectAllAccount();
	      homePage_SFDCPage.searchGlobalAccountRecord(victim);
	      personsInformationPage.clickInsightsTab();
	      insightsPage.clickNewRelationship();
	      personRelationshipPage.clickCreateAddButton();
	      personRelationshipPage.verifyErrorMessage(victim);
	      personRelationshipPage.searchTexT("Person", firstName+" ");
	      personRelationshipPage.searchTexT("Related", secondfirstName+" ");
	      personRelationshipPage.setRelationShip("Child-Mother");
	      personRelationshipPage.clickSaveButton();
	      homePage_SFDCPage.closeTabs(); 
	
	}
	
}
