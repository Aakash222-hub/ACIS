package com.acis.automation.pages.learner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

/**
 * /** This class is for defining objects of Leaner Center Catalog page and
 * defining methods on those objects.
 * 
 * @author Shahenshaha.Mulani
 * @since 30 October 2019
 *
 */

public class LCCatalogPage extends PageBase {

	final static Logger logger = LoggerFactory.getLogger(LCCatalogPage.class);

	public LCCatalogPage() throws AcisException {
	}

	@FindBy(id = "historyEnabledLinks_Main_Catalog")
	private WebElement linkCatalog;

	@FindBy(xpath = "//a[contains(@id,'btnCloseEnrollment')]")
	private WebElement linkClosedEnrollment;

	private By linkClosedEnrollmentLocator = By.xpath("//a[contains(@id,'btnCloseEnrollment')]");

	@FindBy(xpath = "//a[contains(@id,'btnViewDetails')]")
	private WebElement linkViewDetails;

	private By linkViewDetailsLocator = By.xpath("//a[contains(@id,'btnViewDetails')]");

	private By textCourseDescriptionLocator = By.xpath("//*[text()='Course Description']");

	/**
	 * This method is used to click on Catalog link from Learner Center
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 30 October 2019
	 */

	public LCCatalogPage clickOnCatalogLinkFromLC() throws AcisException {
		waitForElement(linkCatalog);
		clickWebElement(linkCatalog);
		testLoggerInfo("Clicked on Catalog link from Learner Center");
		logger.info("Clicked on Catalog link from Learner Center");
		return this;
	}

	/**
	 * This method is to verify Closed Enrollment link
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 30 October 2019
	 */
	public LCCatalogPage verifyClosedEnrollmentLink() throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(linkClosedEnrollmentLocator);
		testLoggerPass("Verified that 'Closed Enrollment' link is visible for respective course under Catalog tab");
		logger.info("Verified that 'Closed Enrollment' link is visible for respective course under Catalog tab");

		Assert.assertTrue(linkClosedEnrollment.getAttribute("class").contains("disabled"),
				"Closed Enrollment link is not in disabled state");
		testLoggerPass("Verified that 'Closed Enrollment' link is in disabled state");
		logger.info("Verified that 'Closed Enrollment' link is in disabled state");

		return this;
	}

	/**
	 * This method is to verify View Details link
	 * 
	 * @throws AcisException
	 * @author Shahenshaha.Mulani
	 * @since 30 October 2019
	 */
	public LCCatalogPage verifyViewDetailsLink() throws AcisException {
		waitForPageLoad();
		waitAndVerifyElement(linkViewDetailsLocator);
		testLoggerPass("Verified that 'View Details' link is visible for respective course under Catalog tab");
		logger.info("Verified that 'View Details' link is visible for respective course under Catalog tab");

		clickWebElement(linkViewDetails);
		testLoggerInfo("Clicked on 'View Details' link");
		logger.info("Clicked on 'View Details' link");

		waitAndVerifyElement(textCourseDescriptionLocator);
		testLoggerPass("Verified that User is redirected to course details page");
		logger.info("Verified that User is redirected to course details page");

		return this;
	}

}