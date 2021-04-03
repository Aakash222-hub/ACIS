package com.acis.automation.pages;

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
 * /** This class is for defining objects of MSA Login page and defining methods
 * on those objects.
 * 
 * @author Nivedita.Yeolekar
 * @since 31 July 2019
 *
 */

public class MSALoginPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(MSALoginPage.class);

	public MSALoginPage() throws AcisException {
	}

	@FindBy(xpath = "//*[@id='txtUsername']")
	WebElement textBoxUserName;

	public By textBoxUserNameLocator = By.xpath("//*[@id='txtUsername']");

	@FindBy(id = "txtPassword")
	WebElement textBoxPassword;

	@FindBy(xpath = "//input[@id='btnLogin_btn']")
	WebElement buttonLogin;

	@FindBy(xpath = "//span[@id='lblError']")
	WebElement messageInvalidCredential;

	public By messageInvalidCredentialLocator = By.xpath("//span[@id='lblError']");

	public static By dashBoardLocator = By.xpath("//*[text()='Dashboard']");
	public static By menuHome = By.xpath("//*[text()='Home']");

	@FindBy(xpath = "//a[contains(text(),'Forgot')]")
	WebElement linkForgotPassword;

	public static By linkHomeLocator = By.xpath("//a[contains(text(),'Home')]");

	@FindBy(xpath = "//a[contains(text(),'Home')]")
	WebElement linkHome;

	public static By linkForgotLocator = By.xpath("//a[contains(text(),'Forgot')]");

	/**
	 * This method is used to verify MSA Login page loaded
	 * 
	 * @author Nivedita.Yeolekar
	 * @since 31 July 2019
	 */

	public MSALoginPage verifyMSALoginPageLoaded() throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(textBoxUserNameLocator);
		testLoggerPass("Verified MSA Login Page is loaded after navigation to MSA URL");
		logger.info("Verified MSA Login Page is loaded after navigation to MSA URL");
		return this;

	}

	/**
	 * This method is used to verify blank MSA user name & password error message is
	 * displayed
	 * 
	 * @author Nivedita.Yeolekar
	 * @since 31 July 2019
	 */
	public MSALoginPage verifyEnterBlankUserNameAndPasswordErrorMessageMSALogin() {
		String alertMessage = getTheTextAndAcceptTheAlert();
		Assert.assertEquals(alertMessage, Constants.MSA_USER_NAME_PASSWORD_BLANK_ERROR_MESSAGE,
				"Username: The field cannot be blank.nPassword: The field cannot be blank not displayed as expected");
		testLoggerPass("Verified Blank User Name & Password Error Message successfully");
		logger.info("Verified Blank User Name & Password Error Message successfully");
		return this;
	}

	/**
	 * This method is used to verify invalid MSA Login
	 * 
	 * @author Nivedita.Yeolekar
	 * @since 31 July 2019
	 */

	public MSALoginPage verifyInvalidMSALogin() throws AcisException {
		waitAndVerifyElement(messageInvalidCredentialLocator);
		testLoggerPass("Verified that After Entering Invalid Credential Error Message is displayed as on MSA page: "
				+ messageInvalidCredential.getText().trim());
		logger.info("Verified that After Entering Invalid Credential Error Message is displayed as on MSA page: "
				+ messageInvalidCredential.getText().trim());
		Assert.assertEquals(messageInvalidCredential.getText().trim(), Constants.INVALID_LOGIN_ERROR_MESSAGE,
				"For Invalid Login attempt,Actual Error message on MSA page: "
						+ messageInvalidCredential.getText().trim() + " is not matched with Expected: "
						+ Constants.INVALID_LOGIN_ERROR_MESSAGE);
		testLoggerPass("For Invalid Login attempt,Actual Error message on MSA page: "
				+ messageInvalidCredential.getText().trim() + " is  matched with Expected: "
				+ Constants.INVALID_LOGIN_ERROR_MESSAGE);
		logger.info("For Invalid Login attempt,Actual Error message on MSA page: "
				+ messageInvalidCredential.getText().trim() + " is matched with Expected: "
				+ Constants.INVALID_LOGIN_ERROR_MESSAGE);
		return this;

	}

	/**
	 * This method is used to verify home link present on MSA page
	 * 
	 * @author Nivedita.Yeolekar
	 * @since 31 July 2019
	 */
	public MSALoginPage verifyHomeLinkOnMSALogin() throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(linkHomeLocator);
		testLoggerPass("Verified home link is present on MSA login page");
		logger.info("Verified home link is present on MSA login page");
		return this;

	}

	/**
	 * This method is used to verify forgot password link present on MSA page
	 * 
	 * @author Nivedita.Yeolekar
	 * @since 31 July 2019
	 */

	public MSALoginPage verifylinkForgotPasswordMSALogin() throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(linkForgotLocator);
		testLoggerPass("Verified forgot password link is present on MSA login page");
		logger.info("Verified forgot password link is present on MSA login page");
		return this;

	}

	/**
	 * This method is used to verify logged as super admin
	 * 
	 * @author Nivedita.Yeolekar
	 * @since 31 July 2019
	 */

	public boolean verifyLoggedInAsSuperAdmin() throws AcisException {
		waitForPageLoad();
		if (isElementPresent(dashBoardLocator)) {
			testLoggerInfo("Homepage is verified successfully on MSA Page");
			logger.info("Homepage is verified successfully on MSA Page");
			return true;
		} else if (isElementPresent(menuHome)) {
			testLoggerInfo("Homepage is verified successfully on MSA Page");
			logger.info("Homepage is verified successfully on MSA Page");
			return true;
		} else
			return false;
	}

}