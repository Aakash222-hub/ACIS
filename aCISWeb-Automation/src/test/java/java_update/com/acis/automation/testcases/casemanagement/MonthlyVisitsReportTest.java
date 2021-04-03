package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class MonthlyVisitsReportTest extends TestBase {

	public MonthlyVisitsReportTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	@Test(description = " US:0987  Monthly Visits Report Test updated requested for S-0415", groups = {
			"High", "acisRegression", "Khushboo" })
	public void monthlyVisitsReport() throws AcisException, InterruptedException, IOException {
		
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDashboards();
			newInteractionVisitsPage.clickChildWelFareReportingDashborads();
			newInteractionVisitsPage.selectFirstCaseID();
			newInteractionVisitsPage.clickNewbtnOfInteraction();
			newInteractionVisitsPage.selectVisitbtn();
			newInteractionVisitsPage.setDateandTime();
			newInteractionVisitsPage.selectType();
			newInteractionVisitsPage.selectSubtype("Child");
			newInteractionVisitsPage.txtNarrative("testing");
			newInteractionVisitsPage.txtProfessionalOpinion("testing");		
			newInteractionVisitsPage.selectMettingType("Scheduled");
			newInteractionVisitsPage.selectParticipants();
			newInteractionVisitsPage.clickSaveButton();
	}
}
