package com.acis.automation.pages;

import org.apache.poi.hssf.record.formula.functions.If;
import org.codehaus.groovy.ast.stmt.SwitchStatement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

/**
 * /** This class is for defining objects of Login page and defining methods on
 * those objects.
 * 
 * @author Suraiya.Mulani
 * @since 15 Feb 2018
 *
 */

public class AdminLoginPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(AdminLoginPage.class);

	public AdminLoginPage() throws AcisException {
	}

	@FindBy(xpath = "//*[@id='txtUsername']")

	WebElement textBoxUserName;

	public By textBoxUserNameLocator = By.xpath("//*[@id='txtUsername']");

	public By labelOrgNameLocator = By.xpath("//*[@class='text-lg text-lg-orgname']");

	@FindBy(id = "txtPassword")

	WebElement textBoxPassword;

	@FindBy(xpath = "//*[contains(@id,'btnLogin')]")

	WebElement buttonLogin;

	@FindBy(xpath = "//*[text()='Logout']")
	WebElement buttonLogout;

	@FindBy(xpath = "//*[@id='errMsg']")

	WebElement messageInvalidCredential;

	public By messageInvalidCredentialLocator = By.xpath("//*[@id='errMsg']");

	public static By dashBoardLocator = By.xpath("//*[text()='Dashboard']");
	public static By menuHome = By.xpath("//*[text()='Home']");

	@FindBy(xpath = "//a[contains(text(),'Forgot password')]")
	WebElement linkForgotPassword;

	@FindBy(xpath = "(//*[contains(text(),'Register here')])[2]")
	WebElement linkRegisterhere;

	@FindBy(id = "txtFPUsername")
	WebElement textBoxUsernameFP;

	@FindBy(id = "btnFPSubmit")
	WebElement buttonSubmitFP;

	/**
	 * This method is used to enter User Email ID/Employee ID into User Name field
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 17 July 2019
	 */

	public void enterUserName(String strUserName) throws AcisException {
		waitForElement(textBoxUserName);
		enterText(textBoxUserName, strUserName);
		logger.info("Entered UserName as: " + strUserName);

	}

	/**
	 * This method is used to enter User password into Password field
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 17 July 2019
	 */

	public void enterPassword(String strPassword) throws AcisException {
		enterText(textBoxPassword, strPassword);
		logger.info("Entered Password as: " + strPassword);

	}
	
	public void enterTextFieldValue(String textFieldName, String strValue) throws AcisException {
	switch(textFieldName)
	{
	   case "uNameField":
		   waitForElement(textBoxUserName);
			enterText(textBoxUserName, strValue);
			//clickWebElement(textFieldName);
			logger.info("Entered Password as: " + strValue);
	      break;
	   
	   case "textBoxPassword":
		   enterText(textBoxPassword, strValue);
			logger.info("Entered Password as: " + strValue);
	   break;
	   
	   case "textBoxZip":
		   enterText(textBoxPassword, strValue);
			logger.info("Entered Password as: " + strValue);
	   break;
	   
	   case "textBoxAddress":
		   enterText(textBoxPassword, strValue);
			logger.info("Entered Password as: " + strValue);
	   break;
	  
	   default : 
		   logger.info("Text Field Value: " + textFieldName+"did not find");
	}
	}
	/**
	 * This method is used to click on Login button
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 17 July 2019
	 */

	public void clickLoginBtn() throws AcisException {
		clickWebElement(buttonLogin);
		logger.info("Clicked on Login button");

	}

	/**
	 * This method is used to click on Logout button
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 17 July 2019
	 */

	public void clickLogoutBtn() throws AcisException {
		waitForPageLoad();
		switchToDefaultContent();
		waitForElementClickable(buttonLogout);
		clickWebElement(buttonLogout);
		logger.info("Clicked on Logout button");
		testLoggerInfo("Clicked on Logout button");

	}

	/**
	 * This method is used to verify Admin Login page loaded
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 17 July 2019
	 */

	public AdminLoginPage verifyAdminLoginPageLoaded() throws AcisException {

		waitForPageLoad();
		waitAndVerifyElement(textBoxUserNameLocator);
		waitForPageLoad();
		testLoggerPass("Verified that After navigating to Admin URL Login Page is loaded");
		logger.info("Verified that After navigating to Admin URL Login Page is loaded");
		return this;

	}

	/**
	 * This method is used to verify Admin Portal Login page loaded
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 17 July 2019
	 */

	public AdminLoginPage verifyAdminPortalLoginPageLoaded() throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(labelOrgNameLocator);
		testLoggerPass("Verified that After navigating to Portal URL Login Page is loaded with Org Name");
		logger.info("Verified that After navigating to Portal URL Login Page is loaded with Org Name");
		return this;

	}

	/**
	 * This method is used to login to Application
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 17 July 2019
	 */

	public AdminLoginPage loginToApplicationForTestCase(String strUserName, String strPassword)
			throws AcisException, InterruptedException {
		enterUserName(strUserName);
		testLoggerInfo("Entered UserName as: " + strUserName);

		enterPassword(strPassword);
		testLoggerInfo("Entered Password");

		clickLoginBtn();
		testLoggerInfo("Clicked on Login Button");

		Thread.sleep(500);

		return this;

	}

	/**
	 * This method is used to login to Application with blank values
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 17 July 2019
	 */

	public AdminLoginPage loginToApplicationWithBlankValues() throws AcisException, InterruptedException {
		logger.info("Kept UserName as blank");
		testLoggerInfo("Kept UserName as blank");
		clickLoginBtn();
		testLoggerInfo("Clicked on Login Button");
		Thread.sleep(500);
		return this;

	}

	/**
	 * This method is used to verify invalid Login
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 17 July 2019
	 */

	public AdminLoginPage verifyInvalidLogin() throws AcisException {
		waitAndVerifyElement(messageInvalidCredentialLocator);
		testLoggerPass("Verified that After Entering Invalid Credential Error Message is displayed as: "
				+ messageInvalidCredential.getText().trim());
		logger.info("Verified that After Entering Invalid Credential Error Message is displayed as: "
				+ messageInvalidCredential.getText().trim());

		Assert.assertEquals(messageInvalidCredential.getText().trim(), Constants.INVALID_LOGIN_ERROR_MESSAGE,
				"For Invalid Login attempt,Actual Error message: " + messageInvalidCredential.getText().trim()
						+ " is matched with Expected: " + Constants.INVALID_LOGIN_ERROR_MESSAGE);
		testLoggerPass("For Invalid Login attempt,Actual Error message: " + messageInvalidCredential.getText().trim()
				+ " is not matched with Expected: " + Constants.INVALID_LOGIN_ERROR_MESSAGE);
		logger.info("For Invalid Login attempt,Actual Error message: " + messageInvalidCredential.getText().trim()
				+ " is matched with Expected: " + Constants.INVALID_LOGIN_ERROR_MESSAGE);

		return this;

	}

	/**
	 * This method is used to verify user login
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 17 July 2019
	 */

	public AdminLoginPage verifyLogin() throws AcisException {
		waitForPageLoad();
		switchToDefaultContent();
		Assert.assertTrue(verifyLoggedInUser(), "Failed to  Login ");
		testLoggerPass("Verified that after entering valid credential User is able to login");
		logger.info("Verified that after entering valid credential User is able to login");
		return this;

	}

	/**
	 * This method is used to verify invalid Login
	 * 
	 * @throws AcisException
	 * @author (Original) Unknown
	 * @author (Modified) Chandrashekhar.Reddy
	 * @since (Modified) 17 July 2019
	 */

	public boolean verifyLoggedInUser() throws AcisException {
		waitForPageLoad();
		if (isElementPresent(dashBoardLocator)) {
			logger.info("Homepage is verified successfully");
			return true;
		} else if (isElementPresent(menuHome)) {
			logger.info("Homepage is verified successfully");
			return true;
		} else
			return false;
	}

	/**
	 * This method is to click on Forgot password link
	 * 
	 * @throws AcisException
	 * 
	 * @author Shahenshaha.Mulani
	 * @since 15 July 2019
	 */

	public AdminLoginPage clickOnForgotPasswordLink() throws AcisException {
		waitForPageLoad();
		waitForElement(linkForgotPassword);
		clickWebElement(linkForgotPassword);
		waitForPageLoad();
		logger.info("Clicked on Forgot password link");

		testLoggerInfo("Clicked on Forgot password link");

		return this;
	}

	/**
	 * This method is to click on New user? Register here for Self Registration
	 * 
	 * @throws AcisException
	 * 
	 * @author Chandrashekhar.Reddy
	 * @since 25 June 2019
	 */

	public AdminLoginPage clickOnNewUserRegisterhereLinkOnCustomLoginScreen() throws AcisException {
		waitForPageLoad();
		waitForElement(linkRegisterhere);
		clickWebElement(linkRegisterhere);
		waitForPageLoad();
		logger.info("Clicked on 'New user? Register here' for 'Self Registration'");

		testLoggerInfo("Clicked on 'New user? Register here' for 'Self Registration'");

		return this;
	}

	/**
	 * This method is to enter Username for Forgot password
	 * 
	 * @throws AcisException
	 * 
	 * @author Shahenshaha.Mulani
	 * @since 15 July 2019
	 */

	public AdminLoginPage enterUsernameForForgotPassword(String strUsername) throws AcisException {
		waitForPageLoad();
		waitForElement(textBoxUsernameFP);
		enterText(textBoxUsernameFP, strUsername);
		logger.info("Entered Username for Forgot password as: " + strUsername);

		testLoggerInfo("Entered Username for Forgot password as: " + strUsername);
		return this;
	}

	/**
	 * This method is used to click on Submit button On Forgot password
	 * 
	 * @throws AcisException
	 * 
	 * @author Shahenshaha.Mulani
	 * @since 15 July 2019
	 */

	public AdminLoginPage clickOnSubmitButtonForFP() throws AcisException {
		waitForPageLoad();
		waitForElement(buttonSubmitFP);
		clickWebElement(buttonSubmitFP);
		waitForPageLoad();
		logger.info("Clicked on Submit button On Forgot password");

		testLoggerInfo("Clicked on Submit button On Forgot password");

		return this;
	}
}