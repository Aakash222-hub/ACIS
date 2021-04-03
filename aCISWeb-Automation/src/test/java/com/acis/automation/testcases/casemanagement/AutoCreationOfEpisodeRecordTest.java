package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class AutoCreationOfEpisodeRecordTest extends TestBase {

	public AutoCreationOfEpisodeRecordTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(AutoCreationOfEpisodeRecordTest.class);
	@Test(description = "S-0431: Auto creation of Episode record  by OOH Case Worker", groups = { "Medium",
			"ACIS_Regression", "Khushboo" })

	public void episodeRecordCreation() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowCaseHead();
		caseHeadPage.createNewCaseHead("khushboo Case");
		caseHeadPage.newFosterCase();
		caseHeadPage.clickRelatedTab("First Related tab");
		caseHeadPage.openCaseHead();
		caseHeadPage.clickRelatedTab("Second Related tab");
		caseHeadPage.clickOnNewPerson();
		establishRelationships_CP_OmniScriptPage.clickCreateAddButton();
		personsInvovled_CP_OmniscriptPage.searchNewPerson("gyu");
		personsInvovled_CP_OmniscriptPage.setAllNames("first", "chgnhy", "abc", "child");
		personsInvovled_CP_OmniscriptPage.prvoideSuffix("first", "I");
		personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2005");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
		establishRelationships_CP_OmniScriptPage.clickCreateAddButton();
		personsInvovled_CP_OmniscriptPage.searchNewPerson("gyu");
		personsInvovled_CP_OmniscriptPage.setAllNames("second", "abvy", "abc", "Child");
		personsInvovled_CP_OmniscriptPage.prvoideSuffix("second", "I");
		personsInvovled_CP_OmniscriptPage.provideBirthdate("second", "2006");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("second");
		personsInvovled_CP_OmniscriptPage.clickNextButton();
		establishRelationships_CP_OmniScriptPage.clickSubmit();
		newLegalAction_OmniScriptPage.clickInsightsTab();
		newLegalAction_OmniScriptPage.clickOnCourtAction();
		Thread.sleep(10000);
		newLegalAction_OmniScriptPage.courtCaseNumber("1");
		newLegalAction_OmniScriptPage.dateTime("courtCaseActionDateTime");
		newLegalAction_OmniScriptPage.courtActionType("Court Order");
		newLegalAction_OmniScriptPage.courtActionParticipant("first child");
		newLegalAction_OmniScriptPage.saveButton();
		Thread.sleep(10000);
		newLegalAction_OmniScriptPage.clickOnCourtAction();
		Thread.sleep(10000);
		newLegalAction_OmniScriptPage.courtCaseNumber("2");
		newLegalAction_OmniScriptPage.dateTime("courtCaseActionDateTime");
		newLegalAction_OmniScriptPage.courtActionType("Emergency");
		newLegalAction_OmniScriptPage.courtActionParticipant("Second child");
		newLegalAction_OmniScriptPage.saveButton();
		casePlanPage.refreshPage();
		
		caseActionPage.openCourtActions("First");
		caseHeadPage.clickRelatedTab("Second Related tab");
		//court outcomes
		courtActionOutcomesPage.clickOnNewbtn();
		Thread.sleep(1000);
		courtActionOutcomesPage.enterCourtActionID("6488");
		courtActionOutcomesPage.setDateandTime();
		courtActionOutcomesPage.setlectType("Custody Granted");
		courtActionOutcomesPage.Savebutton();
		courtActionOutcomesPage.closeCourtOutComesTab();
		courtActionOutcomesPage.closeCourtOrder();
		courtActionOutcomesPage.clickOnNewbtn();
		caseActionPage.openCourtActions("secondCourtAction");
		caseHeadPage.clickRelatedTab("third Related tab");
		courtActionOutcomesPage.enterCourtActionID("426");
		courtActionOutcomesPage.setDateandTime();
		courtActionOutcomesPage.setlectType("Shelter Granted");
		courtActionOutcomesPage.Savebutton();
		courtActionOutcomesPage.closeCourtOutComesTab();
		courtActionOutcomesPage.closeCourtOrder();
		driver.navigate().refresh();
		caseHeadPage.clickRelatedTab("Second Related tab");
		courtActionOutcomesPage.openChildRemoval();
}
}
