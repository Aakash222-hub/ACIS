package com.acis.automation.testcases.investigation;

import java.io.IOException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

import net.bytebuddy.asm.Advice.Enter;

public class PhoneEmailFieldsInSATest extends TestBase{

	public PhoneEmailFieldsInSATest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	

	final static Logger logger = LoggerFactory.getLogger(InvestigationCaseTest.class);
	public static String firstPersonName,allegationID , caseID,newtPersonName ;
	String phoneFirstPerson , emailFirstPerson ,phoneNewPerson ,emailNewPerson;
	int count1;
	
	

	@Test(description = " US : 0380 Phone and E-mail Fields Entered in SA OS are Created Separately on the Person :Intake Creation",
			groups = { "High","acisRegression", "Mrunal" }, priority = 0)

	public void verifyPhoneEmailFieldsInSAIntakeCreation() throws AcisException, Exception {
	
		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
				testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		home.verfiyHomePage();
		String firstName=excel.generateRandomTestData(excel.generateRandomTestData("", 3),4);
		String middleName=excel.generateRandomTestData(excel.generateRandomTestData("", 3),3);
		String lastName=excel.generateRandomTestData(excel.generateRandomTestData("", 3),5);
		
		String  victim = firstPersonName = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
 		
		String maltreator_FN = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstName"),4);
		String maltreator_MN = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonMiddleName"),2);
		String maltreator_LN = excel.generateRandomTestData(testData.get(Constants.PersonInvovledAllData).get("secondPersonLastName"),4);
		
		String maltreator =  maltreator_FN.concat(" ").concat(maltreator_MN).concat(" ").concat(maltreator_LN);
		
 		home.verfiyHomePage();
		homePage_SFDCPage.closeTabs();
		homePage_SFDCPage.clickDownArrowAllegation();
		homePage_SFDCPage.selectAllAllegation();
		homePage_SFDCPage.clickNewButton();
		reportDetailsOmniscriptPage.setDate("Intake");
		reportDetailsOmniscriptPage.selectIntakeMethod();
		reportDetailsOmniscriptPage.clickNextBtn();
		searchPerson_OmniscriptPage.searchPersonUsingvalidData("firstName", "first");
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(firstName, middleName, lastName);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Victim");
		createIntakePerson_OmniscriptPage.clickPrimaryCaregiver();
		createIntakePerson_OmniscriptPage.provideContactInformation(excel.generateRandomNumber(testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"), 4),
												excel.generateRandomOrgEmail(testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"), 4));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstCity"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("zipcode",
				testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstZipCode"));
		createIntakePerson_OmniscriptPage.clickPrimaryAddress();
		createIntakePerson_OmniscriptPage
				.provideBirthdate(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstBirthYear"));
		createIntakePerson_OmniscriptPage
				.prvoideGender(testData.get(Constants.PersonInvovledAllData).get("firstPersonFirstGender"));

		createIntakePerson_OmniscriptPage.clickSaveButton();
		createIntakePerson_OmniscriptPage.closeCreateIntakePerson();
		searchPerson_OmniscriptPage.linkToCreateNewPerson();

		createIntakePerson_OmniscriptPage.setAllNames(maltreator_FN, maltreator_MN, maltreator_LN);
		createIntakePerson_OmniscriptPage.provideRole("Alleged Maltreator");
		createIntakePerson_OmniscriptPage.provideContactInformation(
				excel.generateRandomNumber(testData.get(Constants.PersonInvovledAllData).get("firstPersonPhone"), 4),
				excel.generateRandomOrgEmail(testData.get(Constants.PersonInvovledAllData).get("firstPersonEmail"), 4));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street1",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet1"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("street2",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonstreet2"));
		createIntakePerson_OmniscriptPage.enterTextFieldValueOnPersonsInvovled("city",
				testData.get(Constants.PersonInvovledAllData).get("secondPersonFirstCity"));
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
		screeningDecision_OmniscriptPage.selectScreeningRecommendation("investigation");
		screeningDecision_OmniscriptPage.selectCaseHead(victim);
		screeningDecision_OmniscriptPage.enterTextFieldValue("workerComments", "Demo");
//		screeningDecision_OmniscriptPage.selectAllegationReportToCase("newCase");
		screeningDecision_OmniscriptPage.newAllegations("Abuse",maltreator, victim);
		screeningDecision_OmniscriptPage.clickSubmitbtn();
		allegationReportPage.verifyingAllegationReportStatusSubmitted();
	    allegationID=allegationReportPage.getAllegationID();
		homePage_SFDCPage.closeTabs();
		
		count1++;
		
	}
	
	
	@Test(description = " US : 0380 Phone and E-mail Fields Entered in SA OS are Created Separately on the Person :Approval",
			groups = { "High","acisRegression", "Mrunal" }, priority = 1)

	public void verifyPhoneEmailFieldsInSAApproval() throws AcisException, Exception {
	
		if(count1==1)
		{
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobal(allegationID);
			allegationReportPage.clickIntakeBtn();
			reportDetailsOmniscriptPage.clickNextBtn();
			personsInvovled_OmniscriptPage.clickNextButton();
			agencyHistory_OmniscriptPage.clickNextButton();
			structuredDecisionMakingOmniscriptPage.clickNextButton();
			screeningDecision_OmniscriptPage.selectAcceptAssign();
			screeningDecision_OmniscriptPage.clickSubmitbtn();
			allegationReportPage.closeIntakeOmniscript();
			
			allegationReportPage.verifyingAllegationReportStatus();
			allegationReportPage.clickRelatedTab();
			allegationReportPage.clickonAlligationRecord();
			caseID =caseActionPage.getCaseActionID();

			homePage_SFDCPage.closeTabs();
			
			count1++;
		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Intake Creation Does Not completed Successfully, so can not run this test");
	 	}
	  	
	}
	
	
	@Test(description = " US : 0380 Phone and E-mail Fields Entered in SA OS are Created Separately on the Person",
			groups = { "High","acisRegression", "Mrunal" }, priority = 2)

	public void verifyPhoneEmailFieldsInSATest() throws AcisException, Exception {
		
		if(count1==2)
		{
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
			home.verfiyHomePage();
			String firstName=excel.generateRandomTestData(testData.get(Constants.PhoneEmailSA_SHEET).get("NewPersonFirstName"),4);
			String middleName=excel.generateRandomTestData(testData.get(Constants.PhoneEmailSA_SHEET).get("NewPersonMiddleName"),3);
			String lastName=excel.generateRandomTestData(testData.get(Constants.PhoneEmailSA_SHEET).get("NewPersonLastName"),5);
			
			 phoneFirstPerson = excel.generateRandomNumber(testData.get(Constants.PhoneEmailSA_SHEET).get("firstPersonNewPhone"), 4);
			 emailFirstPerson = excel.generateRandomOrgEmail(testData.get(Constants.PhoneEmailSA_SHEET).get("firstPersonNewEmail"), 4);
			
			 phoneNewPerson = excel.generateRandomNumber(testData.get(Constants.PhoneEmailSA_SHEET).get("NewPersonNewPhone"), 4);
			 emailNewPerson = excel.generateRandomOrgEmail(testData.get(Constants.PhoneEmailSA_SHEET).get("NewPersonNewEmail"), 4);
			
			
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(caseID);
		
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickAssessmentsTab();
			investigationCasePage.clickNewSafetyAssessmentButton();
			//SA workflow
			//Review Allegation page
			reviewAllegationReport_SA_OmniScriptPage.clickNextButton();
			
			/*edit first person*/
			personsInvolved_SA_OmniscriptPage.clickEditRecordButton(firstPersonName);
			personsInvolved_SA_OmniscriptPage.enterTextFieldValueOnReviewAllegation_SA("first", "phone", phoneFirstPerson);
			personsInvolved_SA_OmniscriptPage.enterTextFieldValueOnReviewAllegation_SA("first", "emailId", emailFirstPerson);
			personsInvolved_SA_OmniscriptPage.clickSaveButtonUsingTab("first");
			
			/*Add new person*/
			personsInvolved_SA_OmniscriptPage.searchPersonUsingvalidData("firstName", "a");
			personsInvolved_SA_OmniscriptPage.linkToCreateNewPerson();
			personsInvolved_SA_OmniscriptPage.setAllNames(firstName, middleName, lastName);
			personsInvolved_SA_OmniscriptPage.enterTextFieldValueOnReviewAllegation_SA("first", "phone", phoneNewPerson);
			personsInvolved_SA_OmniscriptPage.enterTextFieldValueOnReviewAllegation_SA("first", "emailId", emailNewPerson);
			personsInvolved_SA_OmniscriptPage.clickSaveButton("next");
			personsInvolved_SA_OmniscriptPage.closeCreateIntakePerson();
			personsInvolved_SA_OmniscriptPage.clickRefresPersonButton();
			personsInvolved_SA_OmniscriptPage.clickNextButton();
		
			reviewAllegationReport_SA_OmniScriptPage.closeSafetyAssessmentTab();
			investigationCasePage.closeAssessmentsTab();
			caseActionPage.checkLabelsOnCaseActionPage("Case Action ID");
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickCasePerson(firstPersonName);
			investigationCasePage.clickRelatedTab();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", emailFirstPerson);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phoneFirstPerson);
		    phoneEmailInformationPage.closePhoneEmailTab();
		    personsInformationPage.closePersonTab(firstPersonName);
		    
		    newtPersonName = firstName.concat(" ").concat(middleName).concat(" ").concat(lastName);
		    investigationCasePage.clickCasePerson(newtPersonName);
			investigationCasePage.clickRelatedTab();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", emailNewPerson);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phoneNewPerson);
		    homePage_SFDCPage.closeTabs();
		    	
		    count1++;
		}
		else
	 	{
	 		throw new Exception("Pre-requisite for Intake Approval Does Not completed Successfully, so can not run this test");
	 	}
	  	
	}
	
	
	
	@Test(description = " US : 0380 Phone and E-mail Fields Entered in SA OS are Created Separately on the Person - Intake User", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 3)

	public void verifyPhoneEmailFieldsInSAIntakeTest() throws AcisException, Exception {
	
		if(count1==3)
		{
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(caseID);
			
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickCasePerson(firstPersonName);
			investigationCasePage.clickRelatedTab();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", emailFirstPerson);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phoneFirstPerson);
		    phoneEmailInformationPage.closePhoneEmailTab();
		    personsInformationPage.closePersonTab(firstPersonName);
		    
		    investigationCasePage.clickCasePerson(newtPersonName);
			investigationCasePage.clickRelatedTab();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", emailNewPerson);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phoneNewPerson);
		    homePage_SFDCPage.closeTabs();
		}
		else
	 	{
	 		throw new Exception("Pre requiste of Data Creation does not complete , CANNOT run this ts");
	 	}
		
		
	}
	
	
	@Test(description = " US : 0380 Phone and E-mail Fields Entered in SA OS are Created Separately on the Person - Supervisor User", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 4)

	public void verifyPhoneEmailFieldsInSASupervisorTest() throws AcisException, Exception {
	
		if(count1==3)
		{
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(caseID);
			
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickCasePerson(firstPersonName);
			investigationCasePage.clickRelatedTab();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", emailFirstPerson);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phoneFirstPerson);
		    phoneEmailInformationPage.closePhoneEmailTab();
		    personsInformationPage.closePersonTab(firstPersonName);
		    
		    investigationCasePage.clickCasePerson(newtPersonName);
			investigationCasePage.clickRelatedTab();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", emailNewPerson);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phoneNewPerson);
		    homePage_SFDCPage.closeTabs();
		}
		else
	 	{
	 		throw new Exception("Pre requiste of Data Creation does not complete , CANNOT run this ts");
	 	}
		
		
	}

	@Test(description = " US : 0380 Phone and E-mail Fields Entered in SA OS are Created Separately on the Person - SystemAdmin User", groups = { "High",
			"acisRegression", "Mrunal" }, priority = 5)

	public void verifyPhoneEmailFieldsInSASystemAdminTest() throws AcisException, Exception {
	
		if(count1==3)
		{
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowAllegation();
			homePage_SFDCPage.selectAllAllegation();
			homePage_SFDCPage.searchGlobalFosterCase(caseID);
		
			investigationCasePage.clickRelatedTab();
			investigationCasePage.clickCasePersonTab();
			investigationCasePage.clickCasePerson(firstPersonName);
			investigationCasePage.clickRelatedTab();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", emailFirstPerson);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phoneFirstPerson);
		    phoneEmailInformationPage.closePhoneEmailTab();
		    personsInformationPage.closePersonTab(firstPersonName);
		    
		    investigationCasePage.clickCasePerson(newtPersonName);
			investigationCasePage.clickRelatedTab();
		    relatedPersonTabPage.clickPhoneAndEmailTab();
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Email", emailNewPerson);
		    phoneEmailInformationPage.verifyRecordWithPrimaryCheck("Phone", phoneNewPerson);
		    homePage_SFDCPage.closeTabs();
			
		}
		else
	 	{
	 		throw new Exception("Pre requiste of Data Creation does not complete , CANNOT run this ts");
	 	}
		
	}
}
