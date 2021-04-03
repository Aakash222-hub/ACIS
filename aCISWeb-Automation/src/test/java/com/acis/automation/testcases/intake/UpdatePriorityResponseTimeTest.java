package com.acis.automation.testcases.intake;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.pages.allegation.AllegationReportPage;
import com.acis.automation.utilities.AcisException;

public class UpdatePriorityResponseTimeTest  extends TestBase {

	public UpdatePriorityResponseTimeTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	final static Logger logger = LoggerFactory.getLogger(UpdatePriorityResponseTimeTest.class);
	String allegation_ID1;
	int count;
	
	
	@Test(description = " US-0070 : Create/Update Priority and Response Time - Intake User ", 
			groups = { "High", "acisRegression", "Mrunal" },priority = 0)
	/**
	 * Ts by Intake USer
	 * @throws AcisException
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void verifyUpdatePriorityResponseTimeIntake() throws AcisException, InterruptedException, IOException {
		 try {

			 System.out.println("In 70 intake");
			  
			 String firstName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstName"), 4);
			 String middleName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonMiddleName"), 3);
			 String lastName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonLastName"), 4);
			 
			 String secondfirstName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstName"), 4);
			 String secondMiddledName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonMiddleName"), 3);
			 String secondLastName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonLastName"), 4);


			  	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			 	home.verfiyHomePage();
			  	String allegation_ID;
		        homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.clickNewButton();
				reportDetailsOmniscriptPage.clickNextBtn();
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
				searchPerson_OmniscriptPage.linkToCreateNewPerson();
				createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
				createIntakePerson_OmniscriptPage.prvoideSuffix(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonSuffix"));
	//			createIntakePerson_OmniscriptPage.provideContactInformation(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonPhone"),
	//		    															testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonEmail"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1", testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonstreet1"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2", testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonstreet2"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city", testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstCity"));
				//createIntakePerson_OmniscriptPage.provideState(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstState"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode", testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstZipCode"));
				createIntakePerson_OmniscriptPage.clickPrimaryAddress();
				createIntakePerson_OmniscriptPage.provideBirthdate(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstBirthYear"));
				createIntakePerson_OmniscriptPage.prvoideGender(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstGender"));
				createIntakePerson_OmniscriptPage.clickSaveButton();
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		//		personsInvovled_OmniscriptPage.clickRefresPersonButton();
			   /*Add 2nd Person*/
				searchPerson_OmniscriptPage.linkToCreateNewPerson();
				createIntakePerson_OmniscriptPage.setAllNames(secondfirstName, secondMiddledName, secondLastName);
				createIntakePerson_OmniscriptPage.prvoideSuffix("I");
	//			createIntakePerson_OmniscriptPage.provideContactInformation("(123) 456-7890", "demo@demo.com");
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1", "street");
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2", "street");
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city", "city");
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode", "12345");
				createIntakePerson_OmniscriptPage.clickSaveButton();  
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
				personsInvovled_OmniscriptPage.clickRefresPersonButton();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent(); 
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
				screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				
			    allegation_ID = allegationReportPage.getAllegationID();
			    
			    allegationReportPage.checkStatusIntakeRecord("Submitted");
			    allegationReportPage.checkPriorityLabel();
			    allegationReportPage.checkResponseTimeLabel();
			    homePage_SFDCPage.closeTabs();
	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed  US-0070 : Create/Update Priority and Response Time - Intake User");
	        }  
		 	
		    	    
	}
	
	@Test(description = " US-0070 : Create/Update Priority and Response Time - Investigation User ", 
			groups = { "High", "acisRegression", "Mrunal" },priority = 1)
	/**
	 * Ts by Intake USer
	 * @throws AcisException
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void verifyUpdatePriorityResponseTimeInvestigation() throws AcisException, InterruptedException, IOException {
		 try {
			 System.out.println("In 70 intake");
			 String firstName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstName"), 4);
			 String middleName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonMiddleName"), 3);
			 String lastName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonLastName"), 4);
			 
			 String secondfirstName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstName"), 4);
			 String secondMiddledName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonMiddleName"), 3);
			 String secondLastName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonLastName"), 4);


			  
			  	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			 	home.verfiyHomePage();
			  	String allegation_ID;
		        homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.clickNewButton();
				reportDetailsOmniscriptPage.clickNextBtn();
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
				searchPerson_OmniscriptPage.linkToCreateNewPerson();
				createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
				createIntakePerson_OmniscriptPage.prvoideSuffix(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonSuffix"));
	//			createIntakePerson_OmniscriptPage.provideContactInformation(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonPhone"),
	//		    															testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonEmail"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1", testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonstreet1"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2", testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonstreet2"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city", testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstCity"));
				//createIntakePerson_OmniscriptPage.provideState(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstState"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode", testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstZipCode"));
				createIntakePerson_OmniscriptPage.clickPrimaryAddress();
				createIntakePerson_OmniscriptPage.provideBirthdate(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstBirthYear"));
				createIntakePerson_OmniscriptPage.prvoideGender(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstGender"));
				createIntakePerson_OmniscriptPage.clickSaveButton();
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			//	personsInvovled_OmniscriptPage.clickRefresPersonButton();
			   /*Add 2nd Person*/
				searchPerson_OmniscriptPage.linkToCreateNewPerson();
				createIntakePerson_OmniscriptPage.setAllNames(secondfirstName, secondMiddledName, secondLastName);
				createIntakePerson_OmniscriptPage.prvoideSuffix("I");
	//			createIntakePerson_OmniscriptPage.provideContactInformation("(123) 456-7890", "demo@demo.com");
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1", "street");
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2", "street");
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city", "city");
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode", "12345");
				createIntakePerson_OmniscriptPage.clickSaveButton();  
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
				personsInvovled_OmniscriptPage.clickRefresPersonButton();   
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent(); 
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
				screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				
			    allegation_ID = allegationReportPage.getAllegationID();
			    
			    allegationReportPage.checkStatusIntakeRecord("Submitted");
			    allegationReportPage.checkPriorityLabel();
			    allegationReportPage.checkResponseTimeLabel();
			    homePage_SFDCPage.closeTabs();

	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-0070 : Create/Update Priority and Response Time - Investigation User");
	        }
			
		    	    
	}

	@Test(description = " US-0070 : Create/Update Priority and Response Time - SystemAdmin User ", 
			groups = { "High", "acisRegression", "Mrunal" },priority = 2)
	/**
	 * Ts by Intake USer
	 * @throws AcisException
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void verifyUpdatePriorityResponseTimeSystemAdmin() throws AcisException, InterruptedException, IOException {
		
			 System.out.println("In 70 intake");
			  
			 String firstName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstName"), 4);
			 String middleName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonMiddleName"), 3);
			 String lastName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonLastName"), 4);
			 
			 String secondfirstName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstName"), 4);
			 String secondMiddledName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonMiddleName"), 3);
			 String secondLastName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonLastName"), 4);


			  	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
			 	home.verfiyHomePage();
			  	String allegation_ID;
		        homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.clickNewButton();
				reportDetailsOmniscriptPage.clickNextBtn();
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
				searchPerson_OmniscriptPage.linkToCreateNewPerson();
				createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
				createIntakePerson_OmniscriptPage.prvoideSuffix(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonSuffix"));
	//			createIntakePerson_OmniscriptPage.provideContactInformation(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonPhone"),
	//		    															testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonEmail"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1", testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonstreet1"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2", testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonstreet2"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city", testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstCity"));
				//createIntakePerson_OmniscriptPage.provideState(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstState"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode", testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstZipCode"));
				createIntakePerson_OmniscriptPage.clickPrimaryAddress();
				createIntakePerson_OmniscriptPage.provideBirthdate(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstBirthYear"));
				createIntakePerson_OmniscriptPage.prvoideGender(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstGender"));
				createIntakePerson_OmniscriptPage.clickSaveButton();
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			//	personsInvovled_OmniscriptPage.clickRefresPersonButton();
			   /*Add 2nd Person*/
				searchPerson_OmniscriptPage.linkToCreateNewPerson();
				createIntakePerson_OmniscriptPage.setAllNames(secondfirstName, secondMiddledName, secondLastName);
				createIntakePerson_OmniscriptPage.prvoideSuffix("I");
	//			createIntakePerson_OmniscriptPage.provideContactInformation("(123) 456-7890", "demo@demo.com");
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1", "street");
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2", "street");
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city", "city");
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode", "12345");
				createIntakePerson_OmniscriptPage.clickSaveButton();  
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
				personsInvovled_OmniscriptPage.clickRefresPersonButton();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent(); 
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
				screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				
			    allegation_ID = allegationReportPage.getAllegationID();
			    
			    allegationReportPage.checkStatusIntakeRecord("Submitted");
			    allegationReportPage.checkPriorityLabel();
			    allegationReportPage.checkResponseTimeLabel();
			    homePage_SFDCPage.closeTabs();
	       
		    	    
	}

	@Test(description = " US-0070 : Create/Update Priority and Response Time : Intake Creation ", 
			groups = { "High", "acisRegression", "Mrunal" },priority = 3)
	/**
	 * Ts by Supervisor USer
	 * @throws AcisException
	 * @throws InterruptedException
	 * @throws IOException
	 */
	public void verifyUpdatePriorityResponseTimeSupervisorIntakeCreation() throws AcisException, InterruptedException, IOException {
		
			 System.out.println("In 70 supervisor");
			 String firstName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstName"), 4);
			 String middleName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonMiddleName"), 3);
			 String lastName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonLastName"), 4);
			 
			 String secondfirstName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstName"), 4);
			 String secondMiddledName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonMiddleName"), 3);
			 String secondLastName = excel.generateRandomTestData(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonLastName"), 4);


			  
			  userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			  home.verfiyHomePage();
			   
			   String maltreator = firstName.concat(" ").concat(middleName);
				String victim = secondfirstName.concat(" ").concat(secondMiddledName);
		        homePage_SFDCPage.closeTabs();
				homePage_SFDCPage.clickDownArrowAllegation();
				homePage_SFDCPage.selectAllAllegation();
				homePage_SFDCPage.clickNewButton();
				reportDetailsOmniscriptPage.clickNextBtn();
				searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
				searchPerson_OmniscriptPage.linkToCreateNewPerson();
				createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
				createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
				createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
				createIntakePerson_OmniscriptPage.prvoideSuffix(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonSuffix"));
//				createIntakePerson_OmniscriptPage.provideContactInformation(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonPhone"),
//			    															testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonEmail"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1", testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonstreet1"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2", testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonstreet2"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city", testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstCity"));
				//createIntakePerson_OmniscriptPage.provideState(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstState"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode", testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstZipCode"));
				createIntakePerson_OmniscriptPage.clickPrimaryAddress();
				createIntakePerson_OmniscriptPage.provideBirthdate(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstBirthYear"));
				createIntakePerson_OmniscriptPage.prvoideGender(testData.get(Constants.PriorityResponseTime_SHEET).get("firstPersonFirstGender"));
				createIntakePerson_OmniscriptPage.clickSaveButton();
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			//	personsInvovled_OmniscriptPage.clickRefresPersonButton();
				
			   /*Add 2nd Person*/
				searchPerson_OmniscriptPage.linkToCreateNewPerson();
				createIntakePerson_OmniscriptPage.setAllNames(secondfirstName, secondMiddledName, secondLastName);
				createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
				createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
	//			createIntakePerson_OmniscriptPage.provideContactInformation(testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"),
	//					testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
						testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
						testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
						testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
		//		createIntakePerson_OmniscriptPage.provideState(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstState"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
						testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstZipCode"));
				createIntakePerson_OmniscriptPage.clickPrimaryAddress();
				createIntakePerson_OmniscriptPage
						.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstBirthYear"));
				createIntakePerson_OmniscriptPage
						.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstGender"));

				createIntakePerson_OmniscriptPage.clickSaveButton();
				createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
				personsInvovled_OmniscriptPage.clickRefresPersonButton();
				personsInvovled_OmniscriptPage.clickNextButton();
				agencyHistory_OmniscriptPage.clickNextButton();
				structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
				structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent(); 
				structuredDecisionMakingOmniscriptPage.clickNextButton();
				screeningDecision_OmniscriptPage.selectScreeningRecommendation("familyServices");
				screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
				screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
				screeningDecision_OmniscriptPage.newAllegations("Abuse", maltreator, victim);
				screeningDecision_OmniscriptPage.clickSubmitbtn();
				
			    allegation_ID1 = allegationReportPage.getAllegationID();
			    
			    allegationReportPage.checkStatusIntakeRecord("Submitted");
			    
			    homePage_SFDCPage.closeTabs();
				
			    count++;
				

	}
	
	/**
	 * Ts by Supervisor USer
	 * @throws AcisException
	 * @throws Exception 
	 */
	@Test(description = " US-0070 : Create/Update Priority and Response Time ", 
			groups = { "High", "acisRegression", "Mrunal" },priority = 4)
	
	public void verifyUpdatePriorityResponseTimeSupervisor() throws AcisException, Exception {
		
		if(count==1)
		{
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegation_ID1);
			
		    allegationReportPage.clickIntakeBtn();
		    
		    reportDetailsOmniscriptPage.clickNextBtn();  
		    personsInvovled_OmniscriptPage.clickNextButton();
		    agencyHistory_OmniscriptPage.clickNextButton();
		    structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectAcceptAssign();
			screeningDecision_OmniscriptPage.clickSubmitbtn();
		    
		    allegationReportPage.closeIntakeOmniscript();
		    allegationReportPage.verifyingAllegationReportStatus();
		//   allegationReportPage.checkStatusIntakeRecord("Approved");
		    allegationReportPage.checkPriorityLabel();
		    allegationReportPage.checkPriorityValue("High");
		    allegationReportPage.checkResponseTimeLabel();
		    allegationReportPage.checkResponseTimeValue("Immediate");
		    
		    allegationReportPage.clickIntakeBtn();
		    
		    reportDetailsOmniscriptPage.clickNextBtn();
		    personsInvovled_OmniscriptPage.clickNextButton();
		    agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.informationSuggestPresentDanger();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerChild();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerAdult();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingPresentDangerParent();
			structuredDecisionMakingOmniscriptPage.informationSuggestImpendingDangerParent(); 
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectAcceptAssign();
			screeningDecision_OmniscriptPage.clickSubmitbtn();
		    allegationReportPage.closeIntakeOmniscript();
		    
			allegationReportPage.checkPriorityLabel();
		    allegationReportPage.checkPriorityValue("Medium");
		    allegationReportPage.checkResponseTimeLabel();
		    allegationReportPage.checkResponseTimeValue("24 hours");
		   
		    allegationReportPage.clickEditButton();
		    allegationReportPage.checkNeglectCheckBox();
		    allegationReportPage.clickEditBoxSaveButton();
		    
		    allegationReportPage.checkPriorityLabel();
		    allegationReportPage.checkPriorityValue("Low");
		    allegationReportPage.checkResponseTimeLabel();
		    allegationReportPage.checkResponseTimeValue("5 days");
		    homePage_SFDCPage.closeTabs();
		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Intake Creation data Does Not completed Successfully, so can not run this test");
	 	}
	  	
	}

}
