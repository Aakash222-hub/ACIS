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
		homePage_SFDCPage.clickDownArrowCaseActions();
		caseHeadPage.createNewCaseHead("Case");
		caseHeadPage.newFosterCase();
		caseHeadPage.clickRelatedTab("First Related tab");
		caseHeadPage.openCaseHead();
		caseHeadPage.clickRelatedTab("Second Related tab");
		caseHeadPage.clickOnNewPerson();
		establishRelationships_CP_OmniScriptPage.clickCreateAddButton();
		personsInvovled_CP_OmniscriptPage.selectExistingPerson("kiel");
		personsInvovled_CP_OmniscriptPage.clickSaveButton("second");
		establishRelationships_CP_OmniScriptPage.clickCreateAddButtonPlacementResourceRelationships();
		establishRelationships_CP_OmniScriptPage.searchText("Placement 2A", "Placement Resource");
		establishRelationships_CP_OmniScriptPage
				.setRelationShipPlacementResourceRelationships("Prospective Provider-Child");
		establishRelationships_CP_OmniScriptPage.searchText("Kieley", "Related");
		establishRelationships_CP_OmniScriptPage.clickSaveButtonPlacementResourceRelationships();

	}
}
