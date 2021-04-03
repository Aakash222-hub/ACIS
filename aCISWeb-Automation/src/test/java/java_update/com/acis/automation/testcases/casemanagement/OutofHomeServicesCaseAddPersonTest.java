package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class OutofHomeServicesCaseAddPersonTest extends TestBase {


	public OutofHomeServicesCaseAddPersonTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(OutofHomeServicesCaseAddPersonTest.class);
	String childFirstName = "child".concat(
			excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 4));
	String childMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
	String childLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 5);
	String childFullName = childFirstName + " " + childMiddleName + " " + childLastName;
	String childName = childFirstName + " " + childLastName;
	static int count, count1;

	@Test(description = "S-0236: Add person on service  case  by OOH Case Worker", groups = { "Medium",
			"ACIS_Regression", "Khushboo" })

	public void addPerson() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowCaseHead();
		caseHeadPage.createNewCaseHead(excel.generateRandomTestData("Demo", 4));
		Thread.sleep(1000);
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
		caseHeadPage.clickRelatedTab("Second Related tab");
		// A-00719
		caseActionPage.clickonCaseActionHistory();
		caseActionPage.checkLabelsOnCaseActionHistory("Date");
		caseActionPage.checkLabelsOnCaseActionHistory("Field");
		caseActionPage.checkLabelsOnCaseActionHistory("User");
		caseActionPage.checkLabelsOnCaseActionHistory("Original Value");
		caseActionPage.checkLabelsOnCaseActionHistory("New value");
		
		
	}
}