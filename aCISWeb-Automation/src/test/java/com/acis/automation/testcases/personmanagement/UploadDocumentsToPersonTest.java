package com.acis.automation.testcases.personmanagement;

import java.awt.AWTException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class UploadDocumentsToPersonTest extends TestBase {

	public UploadDocumentsToPersonTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

final static Logger logger = LoggerFactory.getLogger(UploadDocumentsToPersonTest.class);
	
	@Test(enabled = false,description = " US-0066 : Upload Essential Documents Related to Person - Intake", groups = { "High",
			"aCIS_Regression", "Mrunal" })
	   public void uploadDcoumentsToPersonIntake() throws AcisException, InterruptedException, AWTException {
	      System.out.println("in test : 66 intake ");
	     
		  userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("intakeUserName"), 
				  							testData.get(Constants.LOGINPAGE_SHEET).get("intakePassword"));
		  home.verfiyHomePage();
		  System.out.println("File Path : " + Constants.UPLOAD_FILE_PATH + "DemoDoc.txt");
	      String fileupload = Constants.UPLOAD_FILE_PATH + "DemoDoc.txt";
		
		  homePage_SFDCPage.closeTabs();
		  homePage_SFDCPage.clickDownArrowAccount();
	      homePage_SFDCPage.selectAllAccount();
	 //     homePage_SFDCPage.searchGlobalAccountRecord(createdData.get(Constants.PersonAccountDataToUse_SHEET).get("fullNameOne"));
	      homePage_SFDCPage.searchGlobalAccountRecord("FirstNameA middle lastName");
	      
	      personsInformationPage.clickRelatedTab();
		  relatedPersonTabPage.clickFilesTab(); 
		  filesPage.clickAddFilesAndUpload(fileupload);
		  filesPage.verifyFileUploaded("DemoDoc");
		  filesPage.deleteFiles("DemoDoc");
		  homePage_SFDCPage.closeTabs();
		 
	}
	
}
