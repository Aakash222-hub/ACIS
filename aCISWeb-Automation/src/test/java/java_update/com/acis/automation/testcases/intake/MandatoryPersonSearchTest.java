package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class MandatoryPersonSearchTest extends TestBase{
	
	final static Logger logger = LoggerFactory.getLogger(MandatoryPersonSearchTest.class);
	public MandatoryPersonSearchTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	//Invalid Test Script
	@Test(enabled= false,description = "US-077:Part 1 Mandatory Person Search before creating a new Person Record-Intake", groups = { "Medium", "ACIS_Regression", "Amit" })
	  public void mandatorySearchforexistingPersons() throws AcisException, InterruptedException, IOException {
	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
			testData.get(Constants.LOGINPAGE_SHEET).get("password"));
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
		reportDetailsOmniscriptPage.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
		reportDetailsOmniscriptPage.setDate("Incident");
		reportDetailsOmniscriptPage.clickNextBtn();
		personsInvovled_OmniscriptPage.clickCreateAddButton();
	    //personsInvovled_OmniscriptPage.clickEditButton("first");
	    personsInvovled_OmniscriptPage.verifyPersonData("first");
	    logger.info("Searched performed Successfully");
}
	
	@Test(enabled= false,description = "US-077:Part2 Mandatory Person Search before creating a new Person Record-Intake", groups = { "Medium", "ACIS_Regression", "Amit" })
	  public void mandatorySearchNonExixtingPerson() throws AcisException, InterruptedException, IOException {
	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
			testData.get(Constants.LOGINPAGE_SHEET).get("password"));
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
		reportDetailsOmniscriptPage.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
		reportDetailsOmniscriptPage.setDate("Incident");
		reportDetailsOmniscriptPage.clickNextBtn();
		personsInvovled_OmniscriptPage.clickCreateAddButton();
	    personsInvovled_OmniscriptPage.searchNewPerson(testData.get(Constants.PersonInvolvedIntake_SHEET).get("newPerson"));
	    logger.info("Searched person not present , Therefore we can add person by  using New Button");
}
	
	public String AllegatnID;
	
	@Test(enabled= false,description = "US-077:Part3 Mandatory Person Search before creating a new Person Record-Intake", groups = { "Medium", "ACIS_Regression", "Amit" })
	  public void mandatorySearchfromGuidedIntake() throws AcisException, InterruptedException, IOException {
	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
			testData.get(Constants.LOGINPAGE_SHEET).get("password"));
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
	reportDetailsOmniscriptPage.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
	reportDetailsOmniscriptPage.setDate("Incident");
	//reportDetailsOmniscriptPage.enterNarrative(testData.get(Constants.REPORTDETAILSPAGE).get("narrative"));
	reportDetailsOmniscriptPage.clickNextBtn();
	
	personsInvovled_OmniscriptPage.clickCreateAddButton();
    personsInvovled_OmniscriptPage.clickEditButton("first");
    personsInvovled_OmniscriptPage.provideRole("first","Alleged Victim");
    personsInvovled_OmniscriptPage.clickPrimaryCaregiver();
    personsInvovled_OmniscriptPage.setAllNames("first","first", "middle", "last");
    personsInvovled_OmniscriptPage.prvoideSuffix("first","I");
    personsInvovled_OmniscriptPage.provideContactInformation("first","(123) 456-7890", "demo@demo.com");
    personsInvovled_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first","street1", "street");
    personsInvovled_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first","street2", "street");
    personsInvovled_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first","city", "city");
    //personsInvovled_OmniscriptPage.prvoideState("Nevada");
    personsInvovled_OmniscriptPage.provideCountry("first","India");
    personsInvovled_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first","zipcode", "12345");
    personsInvovled_OmniscriptPage.provideBirthdate("first","2000");
    personsInvovled_OmniscriptPage.prvoideGender("first","Female");
    personsInvovled_OmniscriptPage.verifyRaceOptions();
    personsInvovled_OmniscriptPage.verifyMultipleSelectionError();
    personsInvovled_OmniscriptPage.clickSaveButton("first");
	personsInvovled_OmniscriptPage.clickCreateAddButton();
	personsInvovled_OmniscriptPage.clickEditButton("second");
	personsInvovled_OmniscriptPage.provideRole("second","Alleged Maltreator");
	personsInvovled_OmniscriptPage.setAllNames("second","firstn", "middlen", "lastn");
	personsInvovled_OmniscriptPage.prvoideSuffix("second","I");
	personsInvovled_OmniscriptPage.provideContactInformation("second","(123) 456-7890", "demo@demo.com");
	personsInvovled_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("second","street1", "street");
	personsInvovled_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("second","street2", "street");
	personsInvovled_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("second","city", "city");
	//personsInvovled_OmniscriptPage.prvoideState("Nevada");
	personsInvovled_OmniscriptPage.provideCountry("second","India");
	personsInvovled_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("second","zipcode", "12345");
//	personsInvovled_OmniscriptPage.provideBirthdate("second","2000");
//	personsInvovled_OmniscriptPage.prvoideGender("second","Female");
	personsInvovled_OmniscriptPage.clickSaveButton("second");     
	personsInvovled_OmniscriptPage.clickNextButton();
	structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
	
	structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
	structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
	structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
	structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent(); 
	//structuredDecisionMakingOmniscriptPage.narrativeTextBox();
	personsInvovled_OmniscriptPage.clickNextButton();
	//Options : screenOut||familyServices||investigation
	screeningDecision_OmniscriptPage.selectScreeningRecommendation("screenOut");
	//Options : workerComments||supervisoryComments||narrative
	screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
	//Options : newCase||existingCase
	screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
	screeningDecision_OmniscriptPage.newAllegations("Abuse", "first middle", "firstn middlen");
	//screeningDecision_OmniscriptPage.selectOverride();
	//Options : screenOut||familyServices||investigation
    //screeningDecision_OmniscriptPage.selectDisposition("familyServices");
    //screeningDecision_OmniscriptPage.enterTextFieldValue("supervisoryComments", "Demo");
    screeningDecision_OmniscriptPage.clickSubmitbtn();
	allegationReportPage.getAllegatinID(AllegatnID);
	homePage_SFDCPage.logoutUser();
	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("userName"),
			testData.get(Constants.LOGINPAGE_SHEET).get("password"));
	//search allegation id steps
	reportDetailsOmniscriptPage.clickNextBtn();
	personsInvovled_OmniscriptPage.clickCreateAddButton();
    personsInvovled_OmniscriptPage.searchNewPerson(testData.get(Constants.PersonInvolvedIntake_SHEET).get("newPerson"));
    logger.info("Searched person not present , Therefore we can add person by  using New Button");
}
}
