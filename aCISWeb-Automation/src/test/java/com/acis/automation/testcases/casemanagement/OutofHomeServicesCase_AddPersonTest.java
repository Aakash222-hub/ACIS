package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class OutofHomeServicesCase_AddPersonTest extends TestBase {


	public OutofHomeServicesCase_AddPersonTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(OutofHomeServicesCase_AddPersonTest.class);

	@Test(description = "S-0236: Add person on service  case  by OOH Case Worker", groups = { "Medium",
			"ACIS_Regression", "Khushboo" })

	public void addPerson() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowCaseHead();
		homePage_SFDCPage.clickFirstRecord();
		caseHeadPage.newFosterCase();
		caseHeadPage.clickRelatedTab("First Related tab");
		caseHeadPage.openCaseHead();
		caseHeadPage.clickRelatedTab("Second Related tab");
		caseHeadPage.clickOnNewPerson();
		establishRelationships_CP_OmniScriptPage.clickCreateAddButton();
		personsInvovled_CP_OmniscriptPage.searchNewPerson("mto");
		personsInvovled_CP_OmniscriptPage.setAllNames("first", "random", "abc", "last");
		personsInvovled_CP_OmniscriptPage.prvoideSuffix("first", "I");
		personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "1999");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
		personsInvovled_CP_OmniscriptPage.clickNextButton();
		establishRelationships_CP_OmniScriptPage.clickSubmit();
		// A000662 adding existing person
		caseHeadPage.clickOnNewPerson();
		personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
		personsInvovled_CP_OmniscriptPage.selectExistingPerson("first");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
		personsInvovled_CP_OmniscriptPage.clickNextButton();
		establishRelationships_CP_OmniScriptPage.clickSubmit();
		caseHeadPage.clickRelatedTab("Second Related tab");
		// A000644 i am able add new person
		caseHeadPage.clickOnNewPerson();
		personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
		personsInvovled_CP_OmniscriptPage.searchNewPerson("gyuio");
		personsInvovled_CP_OmniscriptPage.setAllNames("first", "Lastadded", "abc", "last");
		personsInvovled_CP_OmniscriptPage.prvoideSuffix("first", "I");
		personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2002");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
		personsInvovled_CP_OmniscriptPage.clickNextButton();
		establishRelationships_CP_OmniScriptPage.clickSubmit();
		caseHeadPage.clickRelatedTab("Second Related tab");
		// A-00719
		caseActionPage.clickonCaseActionHistory();
		caseActionPage.checkLabelsOnCaseActionPage("Date");
		caseActionPage.checkLabelsOnCaseActionPage("Field");
		caseActionPage.checkLabelsOnCaseActionPage("User");
		caseActionPage.checkLabelsOnCaseActionHistory("Original Value");
		caseActionPage.checkLabelsOnCaseActionPage("New value");
		caseActionPage.closeActionHistory();
		
		
		
	}
}