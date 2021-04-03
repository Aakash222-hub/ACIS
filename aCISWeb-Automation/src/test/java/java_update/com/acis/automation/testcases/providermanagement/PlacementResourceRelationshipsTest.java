package com.acis.automation.testcases.providermanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PlacementResourceRelationshipsTest extends TestBase {

	public PlacementResourceRelationshipsTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PlacementResourceRelationshipsTest.class);

	@Test(description = "S-0208: Add Placement Resources Relationships ", groups = { "Medium", "ACIS_Regression",
			"Khushboo" })

	public void addPlacementResourceRelationships() throws AcisException, InterruptedException, IOException {

		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowCaseHead();
		//caseHeadPage.createNewCaseHead("Caseghj");
		caseHeadPage.createNewCaseHead(excel.generateRandomTestData("Demo", 4));
		caseHeadPage.newFosterCase();
		caseHeadPage.clickRelatedTab("First Related tab");
		caseHeadPage.openCaseHead();
		caseHeadPage.clickRelatedTab("Second Related tab");
		caseHeadPage.clickOnNewPerson();
		establishRelationships_CP_OmniScriptPage.clickCreateAddButton();
		personsInvovled_CP_OmniscriptPage.searchNewPerson("gyi");
		personsInvovled_CP_OmniscriptPage.setAllNames("first", "chgnhy", "abc", "child");
		personsInvovled_CP_OmniscriptPage.prvoideSuffix("first", "I");
		personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2005");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
		personsInvovled_CP_OmniscriptPage.clickAddButton();
		personsInvovled_CP_OmniscriptPage.selectExistingPlacementResources("FirstN");
		personsInvovled_CP_OmniscriptPage.clickOnSave();
		personsInvovled_CP_OmniscriptPage.clickNextButton();
			establishRelationships_CP_OmniScriptPage.clickCreateAddButtonPlacementResourceRelationships();
		establishRelationships_CP_OmniScriptPage.searchTextPlacementResourceRelationships("FirstNameAxq", "Placement Resource");
		establishRelationships_CP_OmniScriptPage
				.setRelationShipPlacementResourceRelationships("Foster Parent-Foster Child");
		establishRelationships_CP_OmniScriptPage.searchTextPlacementResourceRelationships("chgnhy abc child", "Related");
		establishRelationships_CP_OmniScriptPage.clickSaveButtonPlacementResourceRelationships();

	}
}
