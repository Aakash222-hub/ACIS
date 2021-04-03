package com.acis.automation.testcases.afcarsreporting;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;
import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class EducationalSettingTest extends TestBase {

	public EducationalSettingTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(EducationalSettingTest.class);

	@Test(description = "US-0575:Education setting ", groups = { "Medium", "ACIS_Regression", "khushboo" })
	public void educationSetting() throws AcisException, InterruptedException {
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("oohUsername"),
				testData.get(Constants.LOGINPAGE_SHEET).get("oohPassword"));
		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAccount();
		homePage_SFDCPage.selectAllAccount();
		//homePage_SFDCPage.searchGlobalAccountRecord(
			//	createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameThree"));
		homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameTwo"));
		personsInformationPage.clickEducationTab();
		personsInformationPage.clickNewbtn();
		personsInformationPage.selectEducationalSetting("K-12");
		personsInformationPage.selectPassFail("Pass");
		personsInformationPage.enterAttendance("possible days in previous month", "99");
		personsInformationPage.enterAttendance("attended in privous month", "99");
		personsInformationPage.selectMathProficiency("Basic");
		personsInformationPage.selectReadingProficiency("Proficient");
		personsInformationPage.clickSave();

	}
}
