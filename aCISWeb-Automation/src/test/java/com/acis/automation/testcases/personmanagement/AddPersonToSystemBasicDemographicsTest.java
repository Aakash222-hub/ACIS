package com.acis.automation.testcases.personmanagement;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class AddPersonToSystemBasicDemographicsTest extends TestBase{

	public AddPersonToSystemBasicDemographicsTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	
	final static Logger logger = LoggerFactory.getLogger(AddPersonToSystemBasicDemographicsTest.class);
	
	@Test(description = "US-0042 : Add Person to the System Basic Demographics - Intake User", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	   public void AddPersonToSystemBasicDemographicsIntake() throws AcisException, Exception {
		
		 System.out.println("In 42");
		  
		  	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		 	home.verfiyHomePage();
		  	String allegation_ID,fullName, dob , intakePersonName;
			String firstName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),4);
			String middleName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),3);
			String lastName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"),5);
			
			String phone =excel.generateRandomNumber(testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"), 4);
			String email =excel.generateRandomOrgEmail(testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"), 4);
			
	        homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			createIntakePerson_OmniscriptPage.verifyFirstnameLastnamerequired();
			createIntakePerson_OmniscriptPage.verifyAllNamesNotAcceptNumbers();
			createIntakePerson_OmniscriptPage.verifyZipCodeFormat("1234");
			createIntakePerson_OmniscriptPage.verifyRaceOptions();
			createIntakePerson_OmniscriptPage.verifyMultipleSelectionError();
			createIntakePerson_OmniscriptPage.verifyFutureDeathError();
			createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
			createIntakePerson_OmniscriptPage.prvoideSuffix(testData.get(Constants.PersonInvovledAllData).get("firstPersonSuffix"));
		
	        createIntakePerson_OmniscriptPage.provideContactInformation(phone , email);
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1", testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2", testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city", testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode", testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
			createIntakePerson_OmniscriptPage.clickPrimaryAddress();
			createIntakePerson_OmniscriptPage.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
	//		dob=createIntakePerson_OmniscriptPage.getDOB();
			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			personsInvovled_OmniscriptPage.clickRefresPersonButton();
			personsInvovled_OmniscriptPage.clickEditFirstRecordButton();
			dob=personsInvovled_OmniscriptPage.getDOB();
			personsInvovled_OmniscriptPage.verifyFirstnameLastnamerequired();
			personsInvovled_OmniscriptPage.verifyAllNamesNotAcceptNumbers();
			personsInvovled_OmniscriptPage.verifyZipCodeFormat("1234");
			personsInvovled_OmniscriptPage.verifyFutureDeathError();
			personsInvovled_OmniscriptPage.verifyRaceOptions();
			personsInvovled_OmniscriptPage.verifyMultipleSelectionError();
			personsInvovled_OmniscriptPage.clickCancelButton();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			//Options : newCase||existingCase
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		    screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		    screeningDecision_OmniscriptPage.clickSubmitbtn();
		     allegation_ID = allegationReportPage.getAllegationID();
		    
		    allegationReportPage.checkStatusIntakeRecord("Submitted");

		    intakePersonName=firstName.concat(" ").concat(lastName);
		    
		    fullName=firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
		    allegationReportPage.clickRelatedTab();
		    allegationReportPage.clickIntakePerson(intakePersonName);
		    /*Verify Details on Details Tab*/
		    personsInformationPage.clickDetailsTabAfterIntakeOS();
		    detailsPersonTabPage.checkFullNameSuffix(fullName);
		    detailsPersonTabPage.checkPhoneValue(phone);
	//	    detailsPersonTabPage.checkEmailValue(email);
		    detailsPersonTabPage.checkGenderValue(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
		    detailsPersonTabPage.checkDOBValue(dob);
		    personsInformationPage.verifyPrimaryAddressDetails( testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"),
		    													testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"), 
		    													testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
		    /*Verify Details on Related Tab*/
		    personsInformationPage.clickRelatedTabAfterInatakeOS();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", email);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phone);
		    phoneEmailInformationPage.closePhoneEmailTab();
		    personsInformationPage.clickRelatedTabAfterInatakeOS();
		    relatedPersonTabPage.clickAddressTab();
		    addressPage.verifyRecordWithPrimaryCheck(testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		    homePage_SFDCPage.closeTabs();
			
		 
		 }


	@Test(description = "US-0042 : Add Person to the System Basic Demographics -Investigation User", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	   public void AddPersonToSystemBasicDemographicsInvestigation() throws AcisException, Exception {
		
		 System.out.println("In 42");
		  
		  	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
		 	home.verfiyHomePage();
		  	String allegation_ID,fullName, dob,intakePersonName;
		  	String firstName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),4);
			String middleName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),3);
			String lastName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"),5);
			
			String phone =excel.generateRandomNumber(testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"), 4);
			String email =excel.generateRandomOrgEmail(testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"), 4);
			
		  	
	        homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			createIntakePerson_OmniscriptPage.verifyFirstnameLastnamerequired();
			createIntakePerson_OmniscriptPage.verifyAllNamesNotAcceptNumbers();
			createIntakePerson_OmniscriptPage.verifyZipCodeFormat("1234");
			createIntakePerson_OmniscriptPage.verifyRaceOptions();
			createIntakePerson_OmniscriptPage.verifyMultipleSelectionError();
			createIntakePerson_OmniscriptPage.verifyFutureDeathError();
			createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
			createIntakePerson_OmniscriptPage.prvoideSuffix(testData.get(Constants.PersonInvovledAllData).get("firstPersonSuffix"));
		
	        createIntakePerson_OmniscriptPage.provideContactInformation(phone, email);
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1", testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2", testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city", testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode", testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
			createIntakePerson_OmniscriptPage.clickPrimaryAddress();
			createIntakePerson_OmniscriptPage.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
	//		dob=createIntakePerson_OmniscriptPage.getDOB();
			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			personsInvovled_OmniscriptPage.clickRefresPersonButton();
			personsInvovled_OmniscriptPage.clickEditFirstRecordButton();
			dob=personsInvovled_OmniscriptPage.getDOB();
			personsInvovled_OmniscriptPage.verifyFirstnameLastnamerequired();
			personsInvovled_OmniscriptPage.verifyAllNamesNotAcceptNumbers();
			personsInvovled_OmniscriptPage.verifyZipCodeFormat("1234");
			personsInvovled_OmniscriptPage.verifyFutureDeathError();
			personsInvovled_OmniscriptPage.verifyRaceOptions();
			personsInvovled_OmniscriptPage.verifyMultipleSelectionError();
			personsInvovled_OmniscriptPage.clickCancelButton();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		    screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		    screeningDecision_OmniscriptPage.clickSubmitbtn();
		     
		    allegation_ID = allegationReportPage.getAllegationID();
		    
		    allegationReportPage.checkStatusIntakeRecord("Submitted");
		    intakePersonName=firstName.concat(" ").concat(lastName);
	    
		    fullName=firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
		    
		    allegationReportPage.clickRelatedTab();
		    allegationReportPage.clickIntakePerson(intakePersonName);
		    
		    /*Verify Details on Details Tab*/
		    personsInformationPage.clickDetailsTabAfterIntakeOS();
		    detailsPersonTabPage.checkFullNameSuffix(fullName);
		    detailsPersonTabPage.checkPhoneValue(phone);
	//	    detailsPersonTabPage.checkEmailValue(email);
		    detailsPersonTabPage.checkGenderValue(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
		    detailsPersonTabPage.checkDOBValue(dob);
		    personsInformationPage.verifyPrimaryAddressDetails( testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"),
		    													testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"), 
		    													testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
		    /*Verify Details on Related Tab*/
		    personsInformationPage.clickRelatedTabAfterInatakeOS();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", email);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phone);
		    phoneEmailInformationPage.closePhoneEmailTab();
		    personsInformationPage.clickRelatedTabAfterInatakeOS();
		    relatedPersonTabPage.clickAddressTab();
		    addressPage.verifyRecordWithPrimaryCheck(testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		    homePage_SFDCPage.closeTabs();
			
		 
		 }

	
	@Test(description = "US-0042 : Add Person to the System Basic Demographics - SystemAdmin User", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	   public void AddPersonToSystemBasicDemographicsSystemAdmin() throws AcisException, Exception {
		
		 System.out.println("In 42");
		  
		  	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
		 	home.verfiyHomePage();
		  	String allegation_ID,fullName, dob,intakePersonName;
			String firstName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),4);
			String middleName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),3);
			String lastName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"),5);
			
			String phone =excel.generateRandomNumber(testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"), 4);
			String email =excel.generateRandomOrgEmail(testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"), 4);
			
	        homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			createIntakePerson_OmniscriptPage.verifyFirstnameLastnamerequired();
			createIntakePerson_OmniscriptPage.verifyAllNamesNotAcceptNumbers();
			createIntakePerson_OmniscriptPage.verifyZipCodeFormat("1234");
			createIntakePerson_OmniscriptPage.verifyRaceOptions();
			createIntakePerson_OmniscriptPage.verifyMultipleSelectionError();
			createIntakePerson_OmniscriptPage.verifyFutureDeathError();
			createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
			createIntakePerson_OmniscriptPage.prvoideSuffix(testData.get(Constants.PersonInvovledAllData).get("firstPersonSuffix"));
		
	        createIntakePerson_OmniscriptPage.provideContactInformation(phone, email);
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1", testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2", testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city", testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
				createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode", testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
			createIntakePerson_OmniscriptPage.clickPrimaryAddress();
			createIntakePerson_OmniscriptPage.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
	//		dob=createIntakePerson_OmniscriptPage.getDOB();
			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			personsInvovled_OmniscriptPage.clickRefresPersonButton();
			personsInvovled_OmniscriptPage.clickEditFirstRecordButton();
			dob=personsInvovled_OmniscriptPage.getDOB();
			personsInvovled_OmniscriptPage.verifyFirstnameLastnamerequired();
			personsInvovled_OmniscriptPage.verifyAllNamesNotAcceptNumbers();
			personsInvovled_OmniscriptPage.verifyZipCodeFormat("1234");
			personsInvovled_OmniscriptPage.verifyFutureDeathError();
			personsInvovled_OmniscriptPage.verifyRaceOptions();
			personsInvovled_OmniscriptPage.verifyMultipleSelectionError();
			personsInvovled_OmniscriptPage.clickCancelButton();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		    screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		    screeningDecision_OmniscriptPage.clickSubmitbtn();
		     
		    allegation_ID = allegationReportPage.getAllegationID();
		    
		    allegationReportPage.checkStatusIntakeRecord("Submitted");
		    intakePersonName=firstName.concat(" ").concat(lastName);
		    
		    fullName=firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
		    allegationReportPage.clickRelatedTab();
		    allegationReportPage.clickIntakePerson(intakePersonName);
		    
		    /*Verify Details on Details Tab*/
		    personsInformationPage.clickDetailsTabAfterIntakeOS();
		    detailsPersonTabPage.checkFullNameSuffix(fullName);
		    detailsPersonTabPage.checkPhoneValue(phone);
	//	    detailsPersonTabPage.checkEmailValue(email);
		    detailsPersonTabPage.checkGenderValue(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
		    detailsPersonTabPage.checkDOBValue(dob);
		    personsInformationPage.verifyPrimaryAddressDetails( testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"),
		    													testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"), 
		    													testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
		    /*Verify Details on Related Tab*/
		    personsInformationPage.clickRelatedTabAfterInatakeOS();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", email);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phone);
		    phoneEmailInformationPage.closePhoneEmailTab();
		    personsInformationPage.clickRelatedTabAfterInatakeOS();
		    relatedPersonTabPage.clickAddressTab();
		    addressPage.verifyRecordWithPrimaryCheck(testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		     homePage_SFDCPage.closeTabs();
		 
		 }

	
	
	@Test(description = "US-0042 : Add Person to the System Basic Demographics  -Supervisor User", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	   public void AddPersonToSystemBasicDemographicsSupervisor() throws AcisException, Exception {
		
		 System.out.println("In 42");
		  
		  	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		 	home.verfiyHomePage();
		  	String allegation_ID,fullName, dob,intakePersonName;
			String firstName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstName"),4);
			String middleName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonMiddleName"),3);
			String lastName=excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("firstPersonLastName"),5);
			
			String phone =excel.generateRandomNumber(testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"), 4);
			String email =excel.generateRandomOrgEmail(testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"), 4);
			
	        homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.clickNewButton();
			reportDetailsOmniscriptPage.clickNextBtn();
			searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
			searchPerson_OmniscriptPage.linkToCreateNewPerson();
			createIntakePerson_OmniscriptPage.verifyFirstnameLastnamerequired();
			createIntakePerson_OmniscriptPage.verifyAllNamesNotAcceptNumbers();
			createIntakePerson_OmniscriptPage.verifyZipCodeFormat("1234");
			createIntakePerson_OmniscriptPage.verifyRaceOptions();
			createIntakePerson_OmniscriptPage.verifyMultipleSelectionError();
			createIntakePerson_OmniscriptPage.verifyFutureDeathError();
			createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
			createIntakePerson_OmniscriptPage.prvoideSuffix(testData.get(Constants.PersonInvovledAllData).get("firstPersonSuffix"));
		
	        createIntakePerson_OmniscriptPage.provideContactInformation(phone, email);
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1", testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2", testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city", testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
			createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode", testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
			createIntakePerson_OmniscriptPage.clickPrimaryAddress();
			createIntakePerson_OmniscriptPage.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
			createIntakePerson_OmniscriptPage.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
	//		dob=createIntakePerson_OmniscriptPage.getDOB();
			createIntakePerson_OmniscriptPage.clickSaveButton();
			createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
			personsInvovled_OmniscriptPage.clickRefresPersonButton();
			personsInvovled_OmniscriptPage.clickEditFirstRecordButton();
			dob=personsInvovled_OmniscriptPage.getDOB();
			personsInvovled_OmniscriptPage.verifyFirstnameLastnamerequired();
			personsInvovled_OmniscriptPage.verifyAllNamesNotAcceptNumbers();
			personsInvovled_OmniscriptPage.verifyZipCodeFormat("1234");
			personsInvovled_OmniscriptPage.verifyFutureDeathError();
			personsInvovled_OmniscriptPage.verifyRaceOptions();
			personsInvovled_OmniscriptPage.verifyMultipleSelectionError();
			personsInvovled_OmniscriptPage.clickCancelButton();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		    screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
			screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		    screeningDecision_OmniscriptPage.clickSubmitbtn();
		     
		    allegation_ID = allegationReportPage.getAllegationID();
		    
		    allegationReportPage.checkStatusIntakeRecord("Submitted");
		    intakePersonName=firstName.concat(" ").concat(lastName);
		    
		    fullName=firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
		    allegationReportPage.clickRelatedTab();
		    allegationReportPage.clickIntakePerson(intakePersonName);
		    
		    /*Verify Details on Details Tab*/
		    personsInformationPage.clickDetailsTabAfterIntakeOS();
		    detailsPersonTabPage.checkFullNameSuffix(fullName);
		    detailsPersonTabPage.checkPhoneValue(phone);
	//	    detailsPersonTabPage.checkEmailValue(email);
		    detailsPersonTabPage.checkGenderValue(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));
		    detailsPersonTabPage.checkDOBValue(dob);
		    personsInformationPage.verifyPrimaryAddressDetails( testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"),
		    													testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"), 
		    													testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
		    /*Verify Details on Related Tab*/
		    personsInformationPage.clickRelatedTabAfterInatakeOS();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", email);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phone);
		    phoneEmailInformationPage.closePhoneEmailTab();
		    personsInformationPage.clickRelatedTabAfterInatakeOS();
		    relatedPersonTabPage.clickAddressTab();
		    addressPage.verifyRecordWithPrimaryCheck(testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		    homePage_SFDCPage.closeTabs();
		 
		 }

}
