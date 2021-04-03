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
	String allegationID, fosterCaseID, fullName;
	String childFirstName = "child".concat(
			excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 4));
	String childMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
	String childLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 5);
	String childFullName = childFirstName + " " + childMiddleName + " " + childLastName;
	String childName = childFirstName + " " + childLastName;
	static int count, count1;
	
	@Test(description = "S-0431: Auto creation of Episode record  by OOH Case Worker", groups = { "Medium",
			"ACIS_Regression", "Khushboo" })

	public void episodeRecordCreation() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowCaseHead();
		caseHeadPage.createNewCaseHead(excel.generateRandomTestData("Demo", 4));
		caseHeadPage.newFosterCaseWithoutHousholdMember();
		caseHeadPage.clickRelatedTab("Second Related tab");
		caseHeadPage.clickOnNewPerson();
		personsInvovled_CP_OmniscriptPage.searchPersonUsingvalidData("firstName",
				excel.generateRandomTestData(excel.generateRandomTestData("", 6), 4));
		personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
		personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
		personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first", "age", "15");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
		
		personsInvovled_CP_OmniscriptPage.searchPersonUsingvalidData("firstName",
				excel.generateRandomTestData(excel.generateRandomTestData("", 6), 4));
		personsInvovled_CP_OmniscriptPage.linkToCreateNewPerson();
		personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
		personsInvovled_CP_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("first", "age", "15");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
		personsInvovled_CP_OmniscriptPage.clickNextButton();
		establishRelationships_CP_OmniScriptPage.clickSubmit();	
		caseActionPage.refreshPage();
		newLegalAction_OmniScriptPage.clickInsightsTab();
		newLegalAction_OmniScriptPage.clickOnCourtAction();
		Thread.sleep(10000);
		newLegalAction_OmniScriptPage.courtCaseNumber("1");
		newLegalAction_OmniScriptPage.dateTime("courtCaseActionDateTime");
		newLegalAction_OmniScriptPage.courtActionType("Court Order");
		newLegalAction_OmniScriptPage.courtActionParticipant("first child");
		newLegalAction_OmniScriptPage.saveButton();
		Thread.sleep(10000);
		/*
		newLegalAction_OmniScriptPage.clickOnCourtAction();
		Thread.sleep(10000);
		newLegalAction_OmniScriptPage.courtCaseNumber("2");
		newLegalAction_OmniScriptPage.dateTime("courtCaseActionDateTime");
		newLegalAction_OmniScriptPage.courtActionType("Emergency");
		newLegalAction_OmniScriptPage.courtActionParticipant("first child");
		newLegalAction_OmniScriptPage.saveButton();
		*/
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
		/*
		courtActionOutcomesPage.clickOnNewbtn();
		caseActionPage.openCourtActions("secondCourtAction");
		caseHeadPage.clickRelatedTab("third Related tab");
		courtActionOutcomesPage.enterCourtActionID("426");
		courtActionOutcomesPage.setDateandTime();
		courtActionOutcomesPage.setlectType("Shelter Granted");
		courtActionOutcomesPage.Savebutton();
		
		courtActionOutcomesPage.closeCourtOutComesTab();
		courtActionOutcomesPage.closeCourtOrder();
		*/
		driver.navigate().refresh();
		caseHeadPage.clickRelatedTab("Second Related tab");
		courtActionOutcomesPage.openChildRemoval();
}
}
