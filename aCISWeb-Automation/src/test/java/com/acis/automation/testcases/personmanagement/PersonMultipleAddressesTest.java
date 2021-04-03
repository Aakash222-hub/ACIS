package com.acis.automation.testcases.personmanagement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class PersonMultipleAddressesTest extends TestBase{

	public PersonMultipleAddressesTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PersonMultipleAddressesTest.class);
	
	/*
	 * 
	 *  *** INVALID US ***
	 * 
	 */
	
	@Test(enabled = false,description = "US-0045 : Add Multiple Addresses to a Person -Intake User", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	   public void addMultipleAddressesIntake() throws AcisException, InterruptedException {
		 try {
			 System.out.println("in test : 45 intake ");
		      String addressID_1 ,addressID_2;
		      String primaryStreet1, primaryStreet2 , primaryCity;

		      userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		      home.verfiyHomePage();
		      homePage_SFDCPage.closeTabs(); 
		      homePage_SFDCPage.clickDownArrowAccount();
		      homePage_SFDCPage.selectAllAccount();
		      homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameOne"));
		      personsInformationPage.clickRelatedTab();
		      relatedPersonTabPage.clickAddressTab();
		      addressPage.clickNewBtn();
		      //verify zipcode and end date error 
		      addressPage.verifyEndDateError();
		      addressPage.verifyZipCodeFormatError(testData.get(Constants.NewAddresses_SHEET).get("wrongZipcode"));
		      /*Give address*/
		      addressPage.checkPrimaryAddress();
			  addressPage.enterTextFieldValue("street1Name",testData.get(Constants.NewAddresses_SHEET).get("street1"));
			  addressPage.enterTextFieldValue("street2Name",testData.get(Constants.NewAddresses_SHEET).get("street2"));
			  addressPage.enterTextFieldValue("cityName", testData.get(Constants.NewAddresses_SHEET).get("city"));
			  addressPage.enterTextFieldValue("zipCode",testData.get(Constants.NewAddresses_SHEET).get("zipcode"));
			  addressPage.selectCountry(testData.get(Constants.NewAddresses_SHEET).get("country")); 
			  addressPage.selectStartDate(); addressPage.selectEndDate();
			  addressPage.enterTextFieldValue("latitude",testData.get(Constants.NewAddresses_SHEET).get("latitude"));
			  addressPage.enterTextFieldValue("longitude", testData.get(Constants.NewAddresses_SHEET).get("longitude"));
		      addressPage.clickSaveBtn();
		      addressID_1=addressPage.closeNewAddressWindow();
		      addressPage.clickNewBtn();
		      addressPage.checkPrimaryAddress();
		      addressPage.enterTextFieldValue("street1Name",testData.get(Constants.NewAddresses_SHEET).get("primaryStreet1"));
			  addressPage.enterTextFieldValue("street2Name",testData.get(Constants.NewAddresses_SHEET).get("primaryStreet2"));
			  addressPage.enterTextFieldValue("cityName",testData.get(Constants.NewAddresses_SHEET).get("primaryCity"));
			  addressPage.enterTextFieldValue("zipCode",testData.get(Constants.NewAddresses_SHEET).get("zipcode"));
			  addressPage.selectCountry(testData.get(Constants.NewAddresses_SHEET).get("country"));
			  addressPage.selectStartDate(); 
			  addressPage.selectEndDate();
			  addressPage.enterTextFieldValue("latitude",testData.get(Constants.NewAddresses_SHEET).get("latitude"));
			  addressPage.enterTextFieldValue("longitude",testData.get(Constants.NewAddresses_SHEET).get("longitude"));
		      addressPage.clickSaveBtn();
		      addressID_2=addressPage.closeNewAddressWindow();
		      addressPage.clickAddressIDAndCheckPrimaryAddress(addressID_1, addressID_2);
		      addressPage.sortAddressIDColumn("Ascending");
		      addressPage.closeAddressTab();
		      primaryStreet1=testData.get(Constants.NewAddresses_SHEET).get("primaryStreet1");
		      primaryStreet2=testData.get(Constants.NewAddresses_SHEET).get("primaryStreet2");
		      primaryCity=testData.get(Constants.NewAddresses_SHEET).get("primaryCity");
		      personsInformationPage.verifyPrimaryAddressDetails(primaryStreet1, primaryStreet2, primaryCity);
		      homePage_SFDCPage.closeTabs();
	    
	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-0045 : Add Multiple Addresses to a Person -Intake User");
	        }
	}

	@Test(enabled = false,description = "US-0045 : Add Multiple Addresses to a Person -Investigation User", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	   public void addMultipleAddressesInvestigation() throws AcisException, InterruptedException {
		 try {

			 System.out.println("in test : 45 Investigation ");
		      String addressID_1 ,addressID_2;
		      String primaryStreet1, primaryStreet2 , primaryCity;

		      userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("investigatorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("investigatorPassword"));
		      home.verfiyHomePage();
		      homePage_SFDCPage.closeTabs();
		      homePage_SFDCPage.clickDownArrowAccount();
		      homePage_SFDCPage.selectAllAccount();
		      homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameOne"));
		      personsInformationPage.clickRelatedTab();
		      relatedPersonTabPage.clickAddressTab();
		      addressPage.clickNewBtn();
		      //verify zipcode and end date error 
		      addressPage.verifyEndDateError();
		      addressPage.verifyZipCodeFormatError(testData.get(Constants.NewAddresses_SHEET).get("wrongZipcode"));
		      /*Give address*/
		      addressPage.checkPrimaryAddress();
			  addressPage.enterTextFieldValue("street1Name",testData.get(Constants.NewAddresses_SHEET).get("street1"));
			  addressPage.enterTextFieldValue("street2Name",testData.get(Constants.NewAddresses_SHEET).get("street2"));
			  addressPage.enterTextFieldValue("cityName", testData.get(Constants.NewAddresses_SHEET).get("city"));
			  addressPage.enterTextFieldValue("zipCode",testData.get(Constants.NewAddresses_SHEET).get("zipcode"));
			  addressPage.selectCountry(testData.get(Constants.NewAddresses_SHEET).get("country")); 
			  addressPage.selectStartDate(); addressPage.selectEndDate();
			  addressPage.enterTextFieldValue("latitude",testData.get(Constants.NewAddresses_SHEET).get("latitude"));
			  addressPage.enterTextFieldValue("longitude", testData.get(Constants.NewAddresses_SHEET).get("longitude"));
		      addressPage.clickSaveBtn();
		      addressID_1=addressPage.closeNewAddressWindow();
		      addressPage.clickNewBtn();
		      addressPage.checkPrimaryAddress();
		      addressPage.enterTextFieldValue("street1Name",testData.get(Constants.NewAddresses_SHEET).get("primaryStreet1"));
			  addressPage.enterTextFieldValue("street2Name",testData.get(Constants.NewAddresses_SHEET).get("primaryStreet2"));
			  addressPage.enterTextFieldValue("cityName",testData.get(Constants.NewAddresses_SHEET).get("primaryCity"));
			  addressPage.enterTextFieldValue("zipCode",testData.get(Constants.NewAddresses_SHEET).get("zipcode"));
			  addressPage.selectCountry(testData.get(Constants.NewAddresses_SHEET).get("country"));
			  addressPage.selectStartDate(); 
			  addressPage.selectEndDate();
			  addressPage.enterTextFieldValue("latitude",testData.get(Constants.NewAddresses_SHEET).get("latitude"));
			  addressPage.enterTextFieldValue("longitude",testData.get(Constants.NewAddresses_SHEET).get("longitude"));
		      addressPage.clickSaveBtn();
		      addressID_2=addressPage.closeNewAddressWindow();
		      addressPage.clickAddressIDAndCheckPrimaryAddress(addressID_1, addressID_2);
		      addressPage.sortAddressIDColumn("Ascending");
		      addressPage.closeAddressTab();
		      primaryStreet1=testData.get(Constants.NewAddresses_SHEET).get("primaryStreet1");
		      primaryStreet2=testData.get(Constants.NewAddresses_SHEET).get("primaryStreet2");
		      primaryCity=testData.get(Constants.NewAddresses_SHEET).get("primaryCity");
		      personsInformationPage.verifyPrimaryAddressDetails(primaryStreet1, primaryStreet2, primaryCity);
		      homePage_SFDCPage.closeTabs();
	      
	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-0045 : Add Multiple Addresses to a Person -Investigation User");
	        }

	}

	@Test(enabled = false,description = "US-0045 : Add Multiple Addresses to a Person - SystemAdmin User", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	   public void addMultipleAddressesSysteAdmin() throws AcisException, InterruptedException {
		 try {
			 System.out.println("in 45 : system Admin");
			 String addressID_1 ,addressID_2;
	          String primaryStreet1, primaryStreet2 , primaryCity;
	         
	          userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("adminUserName"),
	                    testData.get(Constants.LOGINPAGE_SHEET).get("adminPassword"));
	          home.verfiyHomePage();
		      homePage_SFDCPage.closeTabs();
		      homePage_SFDCPage.clickDownArrowAccount();
		      homePage_SFDCPage.selectAllAccount();
		      homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameOne"));
		       personsInformationPage.clickRelatedTab();
		      relatedPersonTabPage.clickAddressTab();
		      addressPage.clickNewBtn();
		      //verify zipcode and end date error 
		      addressPage.verifyEndDateError();
		      addressPage.verifyZipCodeFormatError(testData.get(Constants.NewAddresses_SHEET).get("wrongZipcode"));
		      /*Give address*/
		      addressPage.checkPrimaryAddress();
			  addressPage.enterTextFieldValue("street1Name",testData.get(Constants.NewAddresses_SHEET).get("street1"));
			  addressPage.enterTextFieldValue("street2Name",testData.get(Constants.NewAddresses_SHEET).get("street2"));
			  addressPage.enterTextFieldValue("cityName", testData.get(Constants.NewAddresses_SHEET).get("city"));
			  addressPage.enterTextFieldValue("zipCode",testData.get(Constants.NewAddresses_SHEET).get("zipcode"));
			  addressPage.selectCountry(testData.get(Constants.NewAddresses_SHEET).get("country")); 
			  addressPage.selectStartDate(); addressPage.selectEndDate();
			  addressPage.enterTextFieldValue("latitude",testData.get(Constants.NewAddresses_SHEET).get("latitude"));
			  addressPage.enterTextFieldValue("longitude", testData.get(Constants.NewAddresses_SHEET).get("longitude"));
		      addressPage.clickSaveBtn();
		      addressID_1=addressPage.closeNewAddressWindow();
		      addressPage.clickNewBtn();
		      addressPage.checkPrimaryAddress();
		      addressPage.enterTextFieldValue("street1Name",testData.get(Constants.NewAddresses_SHEET).get("primaryStreet1"));
			  addressPage.enterTextFieldValue("street2Name",testData.get(Constants.NewAddresses_SHEET).get("primaryStreet2"));
			  addressPage.enterTextFieldValue("cityName",testData.get(Constants.NewAddresses_SHEET).get("primaryCity"));
			  addressPage.enterTextFieldValue("zipCode",testData.get(Constants.NewAddresses_SHEET).get("zipcode"));
			  addressPage.selectCountry(testData.get(Constants.NewAddresses_SHEET).get("country"));
			  addressPage.selectStartDate(); 
			  addressPage.selectEndDate();
			  addressPage.enterTextFieldValue("latitude",testData.get(Constants.NewAddresses_SHEET).get("latitude"));
			  addressPage.enterTextFieldValue("longitude",testData.get(Constants.NewAddresses_SHEET).get("longitude"));
		      addressPage.clickSaveBtn();
		      addressID_2=addressPage.closeNewAddressWindow();
		      addressPage.clickAddressIDAndCheckPrimaryAddress(addressID_1, addressID_2);
		      addressPage.sortAddressIDColumn("Ascending");
		      addressPage.closeAddressTab();
		      primaryStreet1=testData.get(Constants.NewAddresses_SHEET).get("primaryStreet1");
		      primaryStreet2=testData.get(Constants.NewAddresses_SHEET).get("primaryStreet2");
		      primaryCity=testData.get(Constants.NewAddresses_SHEET).get("primaryCity");
		      personsInformationPage.verifyPrimaryAddressDetails(primaryStreet1, primaryStreet2, primaryCity);
		      homePage_SFDCPage.closeTabs();
	      	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-0045 : Add Multiple Addresses to a Person - SysteAdmin User");
	        }
	      
	}

	@Test(enabled = false,description = "US-0045 : Add Multiple Addresses to a Person -Supervisor User", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	   public void addMultipleAddressesSupervisor() throws AcisException, InterruptedException {
		 try {
			 System.out.println("in test : 45 Supervisor");
			  
		      String addressID_1 ,addressID_2;
		      String primaryStreet1, primaryStreet2 , primaryCity;
		      
		      userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
		      home.verfiyHomePage();
		      homePage_SFDCPage.closeTabs();
		      homePage_SFDCPage.clickDownArrowAccount();
		      homePage_SFDCPage.selectAllAccount();
		      homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameOne"));
		      personsInformationPage.clickRelatedTab();
		      relatedPersonTabPage.clickAddressTab();
		      addressPage.clickNewBtn();
		      //verify zipcode and end date error 
		      addressPage.verifyEndDateError();
		      addressPage.verifyZipCodeFormatError(testData.get(Constants.NewAddresses_SHEET).get("wrongZipcode"));
		      /*Give address*/
		      addressPage.checkPrimaryAddress();
			  addressPage.enterTextFieldValue("street1Name",testData.get(Constants.NewAddresses_SHEET).get("street1"));
			  addressPage.enterTextFieldValue("street2Name",testData.get(Constants.NewAddresses_SHEET).get("street2"));
			  addressPage.enterTextFieldValue("cityName", testData.get(Constants.NewAddresses_SHEET).get("city"));
			  addressPage.enterTextFieldValue("zipCode",testData.get(Constants.NewAddresses_SHEET).get("zipcode"));
			  addressPage.selectCountry(testData.get(Constants.NewAddresses_SHEET).get("country")); 
			  addressPage.selectStartDate(); addressPage.selectEndDate();
			  addressPage.enterTextFieldValue("latitude",testData.get(Constants.NewAddresses_SHEET).get("latitude"));
			  addressPage.enterTextFieldValue("longitude", testData.get(Constants.NewAddresses_SHEET).get("longitude"));
		      addressPage.clickSaveBtn();
		      addressID_1=addressPage.closeNewAddressWindow();
		      addressPage.clickNewBtn();
		      addressPage.checkPrimaryAddress();
		      addressPage.enterTextFieldValue("street1Name",testData.get(Constants.NewAddresses_SHEET).get("primaryStreet1"));
			  addressPage.enterTextFieldValue("street2Name",testData.get(Constants.NewAddresses_SHEET).get("primaryStreet2"));
			  addressPage.enterTextFieldValue("cityName",testData.get(Constants.NewAddresses_SHEET).get("primaryCity"));
			  addressPage.enterTextFieldValue("zipCode",testData.get(Constants.NewAddresses_SHEET).get("zipcode"));
			  addressPage.selectCountry(testData.get(Constants.NewAddresses_SHEET).get("country"));
			  addressPage.selectStartDate(); 
			  addressPage.selectEndDate();
			  addressPage.enterTextFieldValue("latitude",testData.get(Constants.NewAddresses_SHEET).get("latitude"));
			  addressPage.enterTextFieldValue("longitude",testData.get(Constants.NewAddresses_SHEET).get("longitude"));
		      addressPage.clickSaveBtn();
		      addressID_2=addressPage.closeNewAddressWindow();
		      addressPage.clickAddressIDAndCheckPrimaryAddress(addressID_1, addressID_2);
		      addressPage.sortAddressIDColumn("Ascending");
		      addressPage.closeAddressTab();
		      primaryStreet1=testData.get(Constants.NewAddresses_SHEET).get("primaryStreet1");
		      primaryStreet2=testData.get(Constants.NewAddresses_SHEET).get("primaryStreet2");
		      primaryCity=testData.get(Constants.NewAddresses_SHEET).get("primaryCity");
		      personsInformationPage.verifyPrimaryAddressDetails(primaryStreet1, primaryStreet2, primaryCity);
		      
		      /*Delete created address*/
		      personsInformationPage.clickRelatedTab();
		      relatedPersonTabPage.clickAddressTab();
		     addressPage.deleteAddress();
		      homePage_SFDCPage.closeTabs();
	      	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-0045 : Add Multiple Addresses to a Person - Supervisor User");
	        }  
		 
	}
	      

	
		
}
