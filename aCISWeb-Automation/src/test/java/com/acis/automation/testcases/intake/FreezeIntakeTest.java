package com.acis.automation.testcases.intake;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class FreezeIntakeTest extends TestBase  {

	public FreezeIntakeTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

final static Loger logger = LoggerFactory.getLogger(SupervisorHomePageTest.class);
	String allegationIDIntake,allegationIDAdmin,allegationIDSupervisor;
	int countIntake=0,countAdmin=0,countSupervisor=0;
	@Test(priority=0,description = "US-037:Freeze Intake using Intake Screening Agent User", groups = { "Medium", "acisRegression", "Dharmesh" })
	public void verifyDetailsGuidedFreezeIntake() throws AcisException {
		
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			String maltreator = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").concat(" ")
					.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"));
			String victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
					.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.setDate("Intake");
			reportDetailsOmniscriptPage.selectIntakeMethod();
			reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
					testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
					"",
					"",
					testData.get(Constants.REPORTDETAILSPAGE).get("role"));
			//testData.get(Constants.REPORTDETAILSPAGE).get("phone")
			//testData.get(Constants.REPORTDETAILSPAGE).get("email")
			reportDetailsOmniscriptPage
					.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
			reportDetailsOmniscriptPage.setDate("Incident");
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();

			createIntakePerson_OmniscriptPage.setAllNames(
					testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),
					testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),
					testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"));
			createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
			createIntakePerson_OmniscriptPage
					.prvoideSuffix(testData.get(Constants.PersonInvovledAllData).get("firstPersonSuffix"));
			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			searchPerson_OmniscriptPage.linkToCreateNewPerson();

			createIntakePerson_OmniscriptPage.setAllNames(
					testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"),
					testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"),
					testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"));
			createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
			createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			// Options : screenOut||familyServices||investigation
			// screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			// Options : workerComments||supervisoryComments||narrative
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "");
			// Options : newCase||existingCase
			screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
			screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			screeningDecision_OmniscriptPage.verifyRequiredFields();
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
			screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.verifyingAllegationReportStatusSubmitted();
			//Option : Check || Uncheck
			allegationReportPage.freezeIntake("Check");
			allegationIDIntake=allegationReportPage.getAllegationID();
			countIntake++;
			}
			catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-037:Freeze Intake using Intake Screening Agent User");
	        }
		
	}
	
	@Test(priority=1,description = "US-037:Freeze Intake using Intake Screening Agent User Check", groups = { "Medium", "acisRegression", "Dharmesh" })
	public void verifyDetailsGuidedFreezeIntakeCheck() throws AcisException {
		
		try {

			if (countIntake == 1) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationIDIntake);
				allegationReportPage.intakeDetailsCannotModify();
				allegationReportPage.intakeGuidedCannotModify();
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}

		}
			catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-037:Freeze Intake using Intake Screening Agent User Check");
	        }
		
	}
	
	@Test(priority=2,description = "US-037:Freeze Intake using ACIS System Admin User", groups = { "Medium", "acisRegression", "Dharmesh" })
	public void verifyRelatedFreezeIntakeAdmin() throws AcisException, InterruptedException {
		try {		
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				
				String maltreator = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").concat(" ")
						.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"));
				String victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
						.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.clickNewButton();
				reportDetailsOmniscriptPage.setDate("Intake");
				reportDetailsOmniscriptPage.selectIntakeMethod();
				reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
						"",
						"",
						testData.get(Constants.REPORTDETAILSPAGE).get("role"));
				//testData.get(Constants.REPORTDETAILSPAGE).get("phone")
				//testData.get(Constants.REPORTDETAILSPAGE).get("email")
				reportDetailsOmniscriptPage
						.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
				reportDetailsOmniscriptPage.setDate("Incident");
				reportDetailsOmniscriptPage.clickNextBtn();
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
				searchPerson_OmniscriptPage.linkToCreateNewPerson();

				createIntakePerson_OmniscriptPage.setAllNames(
						testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),
						testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),
						testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"));
				createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
				createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
				createIntakePerson_OmniscriptPage
						.prvoideSuffix(testData.get(Constants.PersonInvovledAllData).get("firstPersonSuffix"));
				createIntakePerson_OmniscriptPage.clickSaveButton();
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
				searchPerson_OmniscriptPage.linkToCreateNewPerson();

				createIntakePerson_OmniscriptPage.setAllNames(
						testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"),
						testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"),
						testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"));
				createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
				createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
				createIntakePerson_OmniscriptPage.clickSaveButton();
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				// Options : screenOut||familyServices||investigation
				// screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
				// Options : workerComments||supervisoryComments||narrative
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "");
				// Options : newCase||existingCase
				screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
				screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				screeningDecision_OmniscriptPage.verifyRequiredFields();
				screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				allegationReportPage.verifyingAllegationReportStatusSubmitted();
				//Option : Check || Uncheck
				allegationReportPage.freezeIntake("Check");
				allegationIDAdmin=allegationReportPage.getAllegationID();
				countAdmin++;
			 } 
			 catch (Exception e) {
		            // TODO Auto-generated catch block
		            getStackTrace(e, "Failed US-037:Freeze Intake using ACIS System Admin User");
		        }
	}
	
	@Test(priority=3,description = "US-037:Freeze Intake using ACIS System Admin User Check", groups = { "Medium", "acisRegression", "Dharmesh" })
	public void verifyRelatedFreezeIntakeAdminCheck() throws AcisException, InterruptedException {
		 try {
			if (countAdmin == 1) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationIDAdmin);
				allegationReportPage.clickRelatedTab();
				//allegationReportPage.clickIntakePersonsTab();
				allegationReportPage.intakeRelatedCannotModify();
				countAdmin++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
				
		
			 } 
			 catch (Exception e) {
		            // TODO Auto-generated catch block
		            getStackTrace(e, "Failed US-037:Freeze Intake using ACIS System Admin User Check");
		        }
	}
	
	@Test(priority=4,description = "US-037:Freeze Intake using ACIS System Admin User Uncheck", groups = { "Medium", "acisRegression", "Dharmesh" })
	public void verifyRelatedFreezeIntakeAdminUncheck() throws AcisException, InterruptedException {
		 try {
				if (countAdmin == 2) {
					userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
							testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
					home.verfiyHomePage();
					homePage_SFDCPage.closeTabs();
					homePage_SFDCPage.clickDownArrowAllegation();
					homePage_SFDCPage.selectAllAllegation();
					homePage_SFDCPage.searchGlobal(allegationIDAdmin);
					allegationReportPage.freezeIntake("Uncheck");
					allegationReportPage.clickRelatedTab();
					//allegationReportPage.clickIntakePersonsTab();
					allegationReportPage.intakeRelatedCanModify();
				} else {
					throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
				}
				
			 } 
			 catch (Exception e) {
		            // TODO Auto-generated catch block
		            getStackTrace(e, "Failed US-037:Freeze Intake using ACIS System Admin User Uncheck");
		        }
	}
	
	@Test(priority=4,description = "US-037:Freeze Intake using Supervisor User", groups = { "Medium", "acisRegression", "Dharmesh" })
	public void verifyRelatedFreezeIntakeSupervisor() throws AcisException, InterruptedException {
		try {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
				String maltreator = testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName").concat(" ")
						.concat(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"));
				String victim = testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName").concat(" ")
						.concat(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				home.verfiyHomePage();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.clickNewButton();
				reportDetailsOmniscriptPage.setDate("Intake");
				reportDetailsOmniscriptPage.selectIntakeMethod();
				reportDetailsOmniscriptPage.reporterAnonymousNo(testData.get(Constants.REPORTDETAILSPAGE).get("firstName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("lastName"),
						testData.get(Constants.REPORTDETAILSPAGE).get("middleName"),
						"",
						"",
						testData.get(Constants.REPORTDETAILSPAGE).get("role"));
				//testData.get(Constants.REPORTDETAILSPAGE).get("phone")
				//testData.get(Constants.REPORTDETAILSPAGE).get("email")
				reportDetailsOmniscriptPage
						.enterLocationOfIncident(testData.get(Constants.REPORTDETAILSPAGE).get("locationOfIncident"));
				reportDetailsOmniscriptPage.setDate("Incident");
				reportDetailsOmniscriptPage.clickNextBtn();
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
				searchPerson_OmniscriptPage.linkToCreateNewPerson();

				createIntakePerson_OmniscriptPage.setAllNames(
						testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),
						testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),
						testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"));
				createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
				createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
				createIntakePerson_OmniscriptPage
						.prvoideSuffix(testData.get(Constants.PersonInvovledAllData).get("firstPersonSuffix"));
				createIntakePerson_OmniscriptPage.clickSaveButton();
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
				searchPerson_OmniscriptPage.linkToCreateNewPerson();

				createIntakePerson_OmniscriptPage.setAllNames(
						testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"),
						testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"),
						testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"));
				createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
				createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
				createIntakePerson_OmniscriptPage.clickSaveButton();
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent();
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				// Options : screenOut||familyServices||investigation
				// screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
				// Options : workerComments||supervisoryComments||narrative
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "");
				// Options : newCase||existingCase
				screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
				screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				screeningDecision_OmniscriptPage.verifyRequiredFields();
				screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				allegationReportPage.verifyingAllegationReportStatusSubmitted();

				//Option : Check || Uncheck
				allegationReportPage.freezeIntake("Check");
				allegationIDSupervisor=allegationReportPage.getAllegationID();
				countSupervisor++;
		 	} catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-037:Freeze Intake using Supervisor User");
	        }
	}
	@Test(priority=5,description = "US-037:Freeze Intake using Supervisor User Check", groups = { "Medium", "acisRegression", "Dharmesh" })
	public void verifyRelatedFreezeIntakeSupervisorCheck() throws AcisException, InterruptedException {
		try {
			if (countSupervisor == 1) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				home.verfiyHomePage();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationIDSupervisor);
				allegationReportPage.clickRelatedTab();
				//allegationReportPage.clickIntakePersonsTab();
				allegationReportPage.intakeRelatedCannotModify();
				countSupervisor++;
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
				
			
		 	} catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-037:Freeze Intake using Supervisor User Check");
	        }
	}
	
	@Test(priority=6,description = "US-037:Freeze Intake using Supervisor User Uncheck", groups = { "Medium", "acisRegression", "Dharmesh" })
	public void verifyRelatedFreezeIntakeSupervisorUncheck() throws AcisException, InterruptedException {
		try {
			if (countSupervisor == 2) {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				home.verfiyHomePage();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobal(allegationIDSupervisor);
				allegationReportPage.freezeIntake("Uncheck");
				allegationReportPage.clickRelatedTab();
				//allegationReportPage.clickIntakePersonsTab();
				allegationReportPage.intakeRelatedCanModify();	
			} else {
				throw new Exception("Pre-requisite Does Not completed Successfully, so can not run this test");
			}
				
			
		 	} catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-037:Freeze Intake using Supervisor User Uncheck");
	        }
	}
}
