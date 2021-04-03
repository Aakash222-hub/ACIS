package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PlacementResourceAccountAddressTest extends TestBase {

	public PlacementResourceAccountAddressTest() throws AcisException {
		// TODO Auto-generated constructor stub
	}
	
	String firstName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 2);
	String middleName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 2);
	String lastName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 2);

	@Test(description = "US-0698 & US-0664 Placement Resource Account Address Test ", groups = { "High", "acisRegression", "Varun" })

	public void verifyAddEditPersonalEventAtLearnerCenterSupervisor()
			throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.setDate("Intake");
			reportDetailsOmniscriptPage.selectIntakeMethod();
			reportDetailsOmniscriptPage.reporterAnonymousNo(firstName,
					lastName,
					middleName,
					testData.get(Constants.REPORTDETAILSPAGE).get("phone"),
					testData.get(Constants.REPORTDETAILSPAGE).get("email"),
					testData.get(Constants.REPORTDETAILSPAGE).get("role"));
			reportDetailsOmniscriptPage.enterLocationOfIncident("17 toms dr bloomington Il 61701");
			reportDetailsOmniscriptPage.locationEditfield("17 toms dr","bloomington","61701");
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			createIntakePerson_OmniscriptPage.setAllNames(firstName,middleName,lastName);
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
			reportDetailsOmniscriptPage.addressAsSamelocationofIncident();
			createIntakePerson_OmniscriptPage
					.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage
					.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.searchGlobalEnter(firstName+" "+middleName+" "+lastName);
			System.out.println(firstName+" "+middleName+" "+lastName);
			reportDetailsOmniscriptPage.verifyPersonAddress("17 toms dr");
			

		}

		catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "S-0698:Placement Resource Account Address Test");
		}
	}
}
