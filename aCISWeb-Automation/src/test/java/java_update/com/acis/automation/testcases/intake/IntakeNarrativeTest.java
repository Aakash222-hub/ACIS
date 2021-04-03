package com.acis.automation.testcases.intake;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class IntakeNarrativeTest extends TestBase {

	final static Logger logger = LoggerFactory.getLogger(IntakeNarrativeTest.class);

	public IntakeNarrativeTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	/***
	 * This script include US-0018 && US-007
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 * @throws IOException
	 * @throws UnsupportedFlavorException
	 */

	@Test(description = "USS-0029:Intake - Narrative Intake Test", groups = { "Medium", "ACIS_Regression", "Akash" })
	public void intkaeNarrativeTest()
			throws AcisException, InterruptedException, IOException, UnsupportedFlavorException {

		String narrativeData = testData.get(Constants.Narrative).get("narrativeTextReport");

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));

		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		supervisorDecisionDepositionUpdatePage.narrativeReporterDetailPage(narrativeData);
		supervisorDecisionDepositionUpdatePage.saveForLater(narrativeData);
		reportDetailsOmniscriptPage.clickNextBtn();
		supervisorDecisionDepositionUpdatePage.switchWindow();
		//searchPerson_OmniscriptPage.clickNextBtn();
		personsInvovled_OmniscriptPage.clickNextButton();
		agencyHistory_OmniscriptPage.clickNextButton();
		supervisorDecisionDepositionUpdatePage.switchWindow();
		structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
		structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
		structuredDecisionMakingOmniscriptPage.clickNextButton();
		// Options : screenOut||familyServices||investigation
		supervisorDecisionDepositionUpdatePage.switchWindow();
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
		// Options : workerComments||supervisoryComments||narrative


		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
	//	screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.selectAcceptAssign();
		screeningDecision_OmniscriptPage.clickSubmitbtn();

		allegationReportPage.verifyingAllegationReportStatusSubmitted();
		allegationReportPage.clickRelatedTab();
		supervisorDecisionDepositionUpdatePage.narrativeLink();

	}

}
