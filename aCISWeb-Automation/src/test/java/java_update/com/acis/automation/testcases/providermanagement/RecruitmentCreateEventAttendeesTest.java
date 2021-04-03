package com.acis.automation.testcases.providermanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class RecruitmentCreateEventAttendeesTest extends TestBase{

	public RecruitmentCreateEventAttendeesTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(RecruitmentCreateEventAttendeesTest.class); 
	String recruitmentEventId , prospectiveFosterParentID1 ,prospectiveFosterParentID2 , prospectiveFosterParentID3 , prospectiveFosterParentID4;
	
	String street1 = testData.get(Constants.AccountProviderManagemnt).get("street1");
	String city = testData.get(Constants.AccountProviderManagemnt).get("city");
	String zip = testData.get(Constants.AccountProviderManagemnt).get("zip");


	@Test(enabled=true, description = "US:0777 Provider Management - New Orientation Event page verification", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 0)
	public void CreateNewOrientation() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowEvent();
			homePage_SFDCPage.selectAllEvent();
//			homePage_SFDCPage.clickNewOrientationEvent();
			newOrientationEventPage.clickonNewbtn();
			newRecruitmentEventPage.selectOrientationRadioButton();
			newRecruitmentEventPage.setDateTime();
			newRecruitmentEventPage.setAddressInformation("Street1", "sugar 123");
		    newRecruitmentEventPage.setAddressInformation("City", "Richland City");
		    newRecruitmentEventPage.setState();
			newRecruitmentEventPage.setAddressInformation("ZipPostalCode" , "12345");
			newRecruitmentEventPage.clickSubmit();
			newRecruitmentEventPage.verifySubjectField();
//			homePage_SFDCPage.clickDownArrowHome();
//			newRecruitmentEventPage.verifyEventOnCalender();
			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:US:0777 Provider Management - New Orientation Event page verification");
		}
		
	}
	

	
	@Test(enabled=true, description = "US:0777 Provider Management - Search for interested person by first name , last name , Phone and email", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 1)
	public void createRecruitmentEvent() throws AcisException {
		try {
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			homePage_SFDCPage.clickDownArrowEvent();
			homePage_SFDCPage.selectAllEvent();
//			homePage_SFDCPage.clickNewRecruitment();
			newOrientationEventPage.clickonNewbtn();
			newRecruitmentEventPage.selectRecruitmentRadioButton();
			newRecruitmentEventPage.EventType();
			newRecruitmentEventPage.selectDateTime();
			newRecruitmentEventPage.setAddressInformation("Street1", "sugar 123");
		    newRecruitmentEventPage.setAddressInformation("City", "Richland City");
		    newRecruitmentEventPage.setState();
			newRecruitmentEventPage.setAddressInformation("ZipPostalCode" , "12345");
			newRecruitmentEventPage.next();
			newRecruitmentEventPage.searchPersonUsingvalidData("firstName", "first");
			newRecruitmentEventPage.clickingCheckBoxOrExistingError();
			newRecruitmentEventPage.next();
			newRecruitmentEventPage.next();
			newRecruitmentEventPage.clickSubmit();
			
			recruitmentEventId = newRecruitmentEventPage.getRecruitmentID();
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:US:0777 Provider Management - Search for interested person by first name , last name , Phone and email");
		}
		
	}
	

	@Test(description = "US:0777 Provider Management - Parent 1Info exist in system, Adding Parent 1 same as in system and parent 2 info in foster parent enquiry form Update existing prospective foster parent record", groups = {
"High", "acisRegression", "Pallavi" }, priority = 2)
	public void parent1InfoExistInSystem() throws AcisException {
		try {
			String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");			
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			accountPage.clickingFosterInquiry(prospective);
			homePage_SFDCPage.ClickNewProspective();
			newRecruitmentEventPage.setP1Info("FirstP1", "Smith");
			newRecruitmentEventPage.setP1Info("lastP1", "Johnson");
			newRecruitmentEventPage.setP1Info("PhoneP1", "1231231233");
			newRecruitmentEventPage.setP1Info("EmailP1", "smith@gmail.com");
			newRecruitmentEventPage.saveBtn();
			

			prospectiveFosterParentID1 = newRecruitmentEventPage.getProspectiveID();
			
			//switch to community portal
			accountPage.swiitchInquiryPage();
			//Parent1
			fosterParentInquiryFormPage.setParent1FirstName("Smith");
			fosterParentInquiryFormPage.setParent1MiddleName("Brown");
			fosterParentInquiryFormPage.setParent1LastName("Johnson");
			fosterParentInquiryFormPage.setDate();			
			fosterParentInquiryFormPage.setParent1PhoneNumber("1231231233");
			fosterParentInquiryFormPage.setParent1EmailAddress("smith@gmail.com");
			
			//parent2
			fosterParentInquiryFormPage.setenterParent2FirstName("Aaron");
			fosterParentInquiryFormPage.setParent2LastName("James");
			fosterParentInquiryFormPage.setParent2EmailAddress("aaron@gj.jd");
			
			fosterParentInquiryFormPage.clickNextButton();
			fosterInquirySecondPage.enterText("street1", street1);
			fosterInquirySecondPage.enterText("city", city);
			fosterInquirySecondPage.provideState("California");
			fosterInquirySecondPage.providCountry("Allen");

			fosterInquirySecondPage.enterText("zip", zip);
			fosterInquirySecondPage.alreadyTalk("No");
			fosterInquirySecondPage.selectNext();
			fosterInquirySecondPage.clickRegisterNext();

			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:US:0777 Provider Management - Update existing prospective foster parent record");
		}

	}
	
	
		@Test(description = "US:0777 Provider Management - Update existing prospective foster parent record", groups = {
	"High", "acisRegression", "Pallavi" }, priority = 3)
		public void updateExistingFosterParentForm() throws AcisException {
			try {
				String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");			
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				accountPage.clickingFosterInquiry(prospective);
				homePage_SFDCPage.ClickNewProspective();
//				newRecruitmentEventPage.clickProspectiveFosterParent();
//				newRecruitmentEventPage.newProspectiveFosterParent();
				newRecruitmentEventPage.setP1Info("FirstP1", "Smith");
				newRecruitmentEventPage.setP1Info("lastP1", "Johnson");
				newRecruitmentEventPage.setP1Info("PhoneP1", "1231231233");
				newRecruitmentEventPage.setP1Info("EmailP1", "smith@gmail.com");
				newRecruitmentEventPage.saveBtn();
				prospectiveFosterParentID1 = newRecruitmentEventPage.getProspectiveID();
				
				//switch to community portal
				accountPage.swiitchInquiryPage();
				fosterParentInquiryFormPage.setParent1FirstName("Smith");
				fosterParentInquiryFormPage.setParent1MiddleName("Brown");
				fosterParentInquiryFormPage.setParent1LastName("Johnson");
				fosterParentInquiryFormPage.setDate();			
				fosterParentInquiryFormPage.setParent1PhoneNumber("1231231233");
				fosterParentInquiryFormPage.setParent1EmailAddress("smith@gmail.com");
				fosterParentInquiryFormPage.clickNextButton();
				fosterInquirySecondPage.enterText("street1", street1);
				fosterInquirySecondPage.enterText("city", city);
				fosterInquirySecondPage.provideState("California");
				fosterInquirySecondPage.providCountry("Allen");

				fosterInquirySecondPage.enterText("zip", zip);
				fosterInquirySecondPage.alreadyTalk("No");
				fosterInquirySecondPage.selectNext();
				fosterInquirySecondPage.clickRegisterNext();

				
			}catch (Exception e) {
				// TODO Auto-generated catch block
				getStackTrace(e,
						"Failed US:US:0777 Provider Management - Update existing prospective foster parent record");
			}

		}
		
		
		

	@Test(description = "US:0777 Provider Management - Update existing prospective foster parent record", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 4)
		public void P1P2PresentCreateNewRecord() throws AcisException {
			try {
				String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");							
				userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
				home.verfiyHomePage();
				homePage_SFDCPage.closeTabs();
				accountPage.clickingFosterInquiry(prospective);
				homePage_SFDCPage.ClickNewProspective();
				//newRecruitmentEventPage.clickProspectiveFosterParent();
//				newRecruitmentEventPage.newProspectiveFosterParent();
				//Parent 1
				newRecruitmentEventPage.setP1Info("FirstP1", "Jones");
				newRecruitmentEventPage.setP1Info("lastP1", "Garcia");
				newRecruitmentEventPage.setP1Info("PhoneP1", "1234123434");
				newRecruitmentEventPage.setP1Info("EmailP1", "jones@gmail.com");
				//Parent 2
				newRecruitmentEventPage.setP2Info("FirstP2", "Miller");
				newRecruitmentEventPage.setP2Info("lastP2", "Davis");
				newRecruitmentEventPage.saveBtn();
				prospectiveFosterParentID2 = newRecruitmentEventPage.getProspectiveID();
							
				//switch to community portal
				accountPage.swiitchInquiryPage();
				fosterParentInquiryFormPage.setParent1FirstName("Jones");
				fosterParentInquiryFormPage.setParent1MiddleName("Wilson");
				fosterParentInquiryFormPage.setParent1LastName("Garcia");
				fosterParentInquiryFormPage.setDate();			
				fosterParentInquiryFormPage.setParent1PhoneNumber("2342342344");
				fosterParentInquiryFormPage.setParent1EmailAddress("jones@gmail.com");
				fosterParentInquiryFormPage.clickNextButton();
				fosterInquirySecondPage.enterText("street1", street1);
				fosterInquirySecondPage.enterText("city", city);
				fosterInquirySecondPage.provideState("California");
				fosterInquirySecondPage.providCountry("Allen");

				fosterInquirySecondPage.enterText("zip", zip);
				fosterInquirySecondPage.alreadyTalk("No");
				fosterInquirySecondPage.selectNext();
				fosterInquirySecondPage.clickRegisterNext();

							
				
			}catch (Exception e) {
				// TODO Auto-generated catch block
					getStackTrace(e,
							"Failed US:US:0777 Provider Management - Update existing prospective foster parent record");
				}

		}
	
	

	@Test(description = "US:0777 Provider Management - Update existing prospective foster parent record", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 5)
		public void P1P2emailMatch() throws AcisException {
		try {
			String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			accountPage.clickingFosterInquiry(prospective);
			homePage_SFDCPage.ClickNewProspective();
		//	newRecruitmentEventPage.clickProspectiveFosterParent();
//			newRecruitmentEventPage.newProspectiveFosterParent();
			//Parent 1
			newRecruitmentEventPage.setP1Info("FirstP1", "Anderson");
			newRecruitmentEventPage.setP1Info("lastP1", "Taylor");
			newRecruitmentEventPage.setP1Info("PhoneP1", "1234567890");
			newRecruitmentEventPage.setP1Info("EmailP1", "anderson@gmail.com");
			//Parent 2
			newRecruitmentEventPage.setP2Info("EmailP1", "anderson@gmail.com");
			newRecruitmentEventPage.saveBtn();
			prospectiveFosterParentID3 = newRecruitmentEventPage.getProspectiveID();
			
			//switch to community portal
			accountPage.swiitchInquiryPage();
			fosterParentInquiryFormPage.setParent1FirstName("Anderson");
			fosterParentInquiryFormPage.setParent1MiddleName("Martin");
			fosterParentInquiryFormPage.setParent1LastName("Taylor");
			fosterParentInquiryFormPage.setDate();			
			fosterParentInquiryFormPage.setParent1PhoneNumber("1234567890");
			fosterParentInquiryFormPage.setParent1EmailAddress("anderson@gmail.com");
			fosterParentInquiryFormPage.setenterParent2FirstName("Moore");
			fosterParentInquiryFormPage.setParent2LastName("Jackson");
			fosterParentInquiryFormPage.setParent2EmailAddress("moore@gmail.com");
			fosterParentInquiryFormPage.clickNextButton();
			fosterInquirySecondPage.enterText("street1", street1);
			fosterInquirySecondPage.enterText("city", city);
			fosterInquirySecondPage.provideState("California");
			fosterInquirySecondPage.providCountry("Allen");
			fosterInquirySecondPage.enterText("zip", zip);
			fosterInquirySecondPage.alreadyTalk("No");
			fosterInquirySecondPage.selectNext();
			fosterInquirySecondPage.clickRegisterNext();

			
			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:US:0777 Provider Management - Update existing prospective foster parent record");
		}
		
	}
	

	
	@Test(description = "US:0777 Provider Management - Update existing prospective foster parent record", groups = {
			"High", "acisRegression", "Pallavi" }, priority = 6)
		public void P1P2emailNotMatch() throws AcisException {
		try {
			String prospective = testData.get(Constants.AccountProviderManagemnt).get("inputArea");
			userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerUserName"),
					testData.get(Constants.LOGINPAGE_SHEET).get("licensingWorkerPassword"));
			home.verfiyHomePage();
			homePage_SFDCPage.closeTabs();
			accountPage.clickingFosterInquiry(prospective);
			homePage_SFDCPage.ClickNewProspective();
//			newRecruitmentEventPage.newProspectiveFosterParent();
			//Parent 1
			newRecruitmentEventPage.setP1Info("FirstP1", "Lewis");
			newRecruitmentEventPage.setP1Info("lastP1", "Clark");
			newRecruitmentEventPage.setP1Info("PhoneP1", "9898989898");
			newRecruitmentEventPage.setP1Info("EmailP1", "lewis@gmail.com");
			//Parent 2
			newRecruitmentEventPage.setP2Info("EmailP1", "walker@gma.com");
			newRecruitmentEventPage.saveBtn();
			prospectiveFosterParentID4 = newRecruitmentEventPage.getProspectiveID();
			
			//switch to community portal
			accountPage.swiitchInquiryPage();
			fosterParentInquiryFormPage.setParent1FirstName("Rose");
			fosterParentInquiryFormPage.setParent1MiddleName("sina");
			fosterParentInquiryFormPage.setParent1LastName("Sullivan");
			fosterParentInquiryFormPage.setDate();			
			fosterParentInquiryFormPage.setParent1PhoneNumber("1212121212");
			fosterParentInquiryFormPage.setParent1EmailAddress("axeos@temp.com");
			fosterParentInquiryFormPage.setenterParent2FirstName("John");
			fosterParentInquiryFormPage.setParent2LastName("Johnson");
			fosterParentInquiryFormPage.setParent2EmailAddress("john@gmail.con");
			fosterParentInquiryFormPage.clickNextButton();
			fosterInquirySecondPage.enterText("street1", street1);
			fosterInquirySecondPage.enterText("city", city);
			fosterInquirySecondPage.provideState("California");
			fosterInquirySecondPage.providCountry("Allen");
			fosterInquirySecondPage.enterText("zip", zip);
			fosterInquirySecondPage.alreadyTalk("No");
			fosterInquirySecondPage.selectNext();
			fosterInquirySecondPage.clickRegisterNext();


			
		}catch (Exception e) {
			// TODO Auto-generated catch block
			getStackTrace(e,
					"Failed US:US:0777 Provider Management - Update existing prospective foster parent record");
		}
		
	}
	
	
}
