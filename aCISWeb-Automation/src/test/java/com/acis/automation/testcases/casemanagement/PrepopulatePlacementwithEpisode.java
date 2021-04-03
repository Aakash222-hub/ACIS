package com.acis.automation.testcases.casemanagement;

import java.io.IOException;

import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.PageBase;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.Placement.NewPlacement_OmniScriptPage;
import com.acis.automation.pages.homepage.HomePage_SFDCPage;
import com.acis.automation.utilities.AcisException;

public class PrepopulatePlacementwithEpisode extends TestBase{

	public PrepopulatePlacementwithEpisode()throws AcisException {
		
		
		// TODO Auto-generated constructor stub
		super();
	}
	String allegationID, fosterCaseID;

	String firstName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 6);
	String middleName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 6);
	String lastName = excel.generateRandomTestData(
			testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 6);
	
	String childFirstName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"), 3);
	String childMiddleName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"), 3);
	String childLastName = excel
			.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"), 3);




	@Test(description = "US:0173 Case Management - New Placement Search Criteria Create Foster Care Case", groups = {
			"High", "acisRegression", "Dharmesh" }, priority = 0)
	public void CreateFosterCareCase() throws AcisException, InterruptedException, IOException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowCaseHead();
			homePage_SFDCPage.selectAllCaseHeads();
			homePage_SFDCPage.clickFirstRecord();
//			homePage_SFDCPage.searchRecordAndClick(firstName+" "+middleName+" "+lastName);
			fosterCaseID = caseHeadPage.newFosterCase();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e, "Failed US:0173 Case Management - New Placement Search Criteria Create Foster Care Case");
		}

	}
		@Test(description = "US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person", groups = {
				"High", "acisRegression", "Dharmesh" }, priority = 1)
		public void fosterCareCreatePerson() throws AcisException, InterruptedException, IOException {
			try {
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
				fosterCareCase_Page.clickRelatedTab();
				fosterCareCase_Page.clickPersonTab();
				fosterCareCase_Page.clickNewPerson();
				personsInvovled_CP_OmniscriptPage.clickCreateAddButton();
				personsInvovled_CP_OmniscriptPage.clickEditButton("first");
				System.out.println("childFirstName"+childFirstName);
				personsInvovled_CP_OmniscriptPage.setAllNames("first", childFirstName, childMiddleName, childLastName);
				personsInvovled_CP_OmniscriptPage.prvoideSuffix("first", "I");
				personsInvovled_CP_OmniscriptPage.provideBirthdate("first", "2010");
				personsInvovled_CP_OmniscriptPage.clickSaveButton("first");
				personsInvovled_CP_OmniscriptPage.clickNextButton();
				establishRelationships_CP_OmniScriptPage.clickSubmit();

			} catch (Exception e) {
				// TODO Auto-generated catch block
				getStackTrace(e,
						"Failed US:0173 Case Management - New Placement Search Criteria Foster Care Case Add Person");
			}

		}
			
			@Test(description = "US:0614 Case Management - Adding New Court Action & Verify Court Action Type list box ", groups = {
					"High", "acisRegression", "Varun" }, priority = 2)
			public void CourtActionField() throws AcisException, InterruptedException, IOException {
				try {
					userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
							testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));			
					System.out.println("Username :"+testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"));		
					System.out.println("Password :"+testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
					home.verfiyHomePage();
					homePage_SFDCPage.closeTabs();
					homePage_SFDCPage.clickDownArrowAllegation();
					homePage_SFDCPage.selectAllAllegation();
					homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
					caseActionPage.clickInsightsTab();
			        fosterCareCase_Page.clickCourtAction();
			        courtActionOutcomesPage.newlegalAction("12345");
			        courtActionOutcomesPage.CourtActionSelectType("CourtOrder");
//			        System.out.println(childFirstName+" "+childMiddleName+" "+childLastName);
			        courtActionOutcomesPage.addCourtActionParticipant(childFirstName+" "+childMiddleName+" "+childLastName);
//                    courtActionOutcomesPage.addCourtActionParticipant("FirstNameAasV middleIlM lastNamehGq");
			        courtActionOutcomesPage.Savebutton();
			              
				}
					
				catch (Exception e) {
					// TODO Auto-generated catch block
					getStackTrace(e,
							"Failed US:0614 Case Management - Adding New Court Action & Verify Court Action Type list box");
				}
			}
			
	
			@Test(description = "US:0614 Case Management -Creating New Court Action Outcome", groups = {
					"High", "acisRegression", "Varun" }, priority = 3)
			public void Addparticipant() throws AcisException, InterruptedException, IOException {
				
				try {
					userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
							testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));			
					homePage_SFDCPage.closeTabs();
					homePage_SFDCPage.clickDownArrowAllegation();
					homePage_SFDCPage.selectAllAllegation();
					homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
					caseActionPage.clickInsightsTab();
					fosterCareCase_Page.clickCourtAction();
			        courtActionOutcomesPage.clickCourtActionId("12345"); 
			        courtActionOutcomesPage.setlectType("Custody Granted");    
			        courtActionOutcomesPage.setDateandTime();
			        courtActionOutcomesPage.courtActionOutcomeSavebtn();			        	       
				}
				
				catch(Exception e) {
					
					getStackTrace(e,
							"Failed US:0614 Case Management - Creating New Court Action Outcome");
					
				}
			}

			@Test(description = "US:0614 Case Management -Verifying the child Removal Episode Status", groups = {
					"High", "acisRegression", "Varun" }, priority = 4)
			public void childRemovalEpisode() throws AcisException, InterruptedException, IOException {
				
				try {
					userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
							testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));			
					homePage_SFDCPage.closeTabs();
					homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
					fosterCareCase_Page.clickRelatedTab();
			        courtActionOutcomesPage.childEpisode();
				}
				
				catch(Exception e) {
					
					getStackTrace(e,
							"Failed US:0614 Case Management - Verifying the child Removal Episode Status");
					
				}
			}
			
			@Test(description = "US:0614 Case Management -Verifying the child Removal Episode Status", groups = {
					"High", "acisRegression", "Varun" }, priority = 5)
			public void placementRemovalEpisode() throws AcisException, InterruptedException, IOException {
				
				try {
					userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
							testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));			
					homePage_SFDCPage.closeTabs();
					homePage_SFDCPage.searchGlobalFosterCase(fosterCaseID);
					caseActionPage.clickInsightsTab();
			        courtActionOutcomesPage.createPlacementEpisode(childFirstName+" "+childMiddleName+" "+childLastName);
			        newPlacement_OmniScriptPage.selectSpecialNeeds("Medically Complex");
			        newPlacement_OmniScriptPage.selectICPCPlacement("No");
			        newPlacement_OmniScriptPage.selectTypeOfPlacement("Relative Foster");
			        newPlacement_OmniScriptPage.enterZipCode("00001");
			        newPlacement_OmniScriptPage.selectStartDate();
			        newPlacement_OmniScriptPage.clickSearchButton();
			        courtActionOutcomesPage.verifyPlacementChildEpisode();
			        
				}
				
				catch(Exception e) {
					
					getStackTrace(e,
							"Failed US:0614 Case Management - Verifying the child Removal Episode Status");
					
				}
			}

	
	
	
}
