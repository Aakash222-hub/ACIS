package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class AllegationTransferTest extends TestBase {
	final static Logger logger = LoggerFactory.getLogger(AllegationTransferTest.class);

	public AllegationTransferTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	@Test(enabled=false,description = "S:0033 Person Involved allows the agent to select the New Case option by selecting Create New Case   using Intake User", groups = {
			"Simple", "ACIS_Regression", "Khushboo" })
	public void AllegationTransfer() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
		String allegation_ID;
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();
		createIntakePerson_OmniscriptPage.setAllNames("firstn", "middlen", "lastn");
		createIntakePerson_OmniscriptPage.prvoideSuffix("I");
		//createIntakePerson_OmniscriptPage.provideContactInformation("(123) 456-7890", "demo@demo.com");
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
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
		// Selecting existing Case
		screeningDecision_OmniscriptPage.selectAllegationReportToCase("existingCase");
		screeningDecision_OmniscriptPage.verifyAlligationErrononExistingworkcase();

	}
}