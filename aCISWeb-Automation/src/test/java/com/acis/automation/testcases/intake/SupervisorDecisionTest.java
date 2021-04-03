package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.homepage.HomePage_SFDCPage;
import com.acis.automation.pages.intake.ScreeningDecision_OmniscriptPage;
import com.acis.automation.utilities.AcisException;

public class SupervisorDecisionTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(SupervisorDecisionTest.class);

	public SupervisorDecisionTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	public String AllegatnID;

	@Test(description = "US-0022:Screening Recommendation / Decision - Supervisor Approval", groups = { "Simple",
			"ACIS_Regression", "Khushboo" })
	public void supervisordecision() throws AcisException, InterruptedException, IOException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames("firstn", "middlen", "lastn");
		createIntakePerson_OmniscriptPage.prvoideSuffix("I");
	//	createIntakePerson_OmniscriptPage.provideContactInformation("(123) 456-7890", "demo@demo.com");
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1", "street");
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2", "street");
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city", "city");
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode", "12345");
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
		// Options :screenOut||familyServices||investigation //Options :
		// newCase||existingCase
		screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		// screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		AllegatnID = allegationReportPage.getAllegationID();
		homePage_SFDCPage.logoutUser();
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.searchGlobal(AllegatnID);
		allegationReportPage.clickIntakeBtn();
		// search allegation id steps
		reportDetailsOmniscriptPage.clickNextBtn();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		screeningDecision_OmniscriptPage.selectOverride();
		screeningDecision_OmniscriptPage.selectDisposition("familyServices");
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.getAllegatinID(AllegatnID);

	}

}
