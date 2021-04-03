package com.acis.automation.pages.intake;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class SearchReportInformationPage extends PageBase{

	public SearchReportInformationPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(SearchReportInformationPage.class);
	
	@FindBy(xpath = "//a[text()='Allegation Reports']")
	WebElement allegationReportTitleBy;
	
	@FindBy(xpath = "(//span[text()='Allegation Report ID'])[2]")
	WebElement allegationReportIDTitleBy;
	
	@FindBy(xpath = "//a[contains(text(),'Intake Person')]")
	WebElement intakePersonTitleBy;
	
	public By accountsTitle = By.xpath("//a[text()='Accounts']");
	
	public By intakePersonTitle = By.xpath("//a[contains(text(),'Intake Person')]");
	
	public By accountNameTitle = By.xpath("//span[text()='Account Name']");
	
	public By allegationReportTitle = By.xpath("//a[text()='Allegation Reports']");
	
	public By allegationReportIDTitle = By.xpath("(//span[text()='Allegation Report ID'])[2]");
	
	public By intakeDateTimeTitle = By.xpath("(//span[text()='Intake Date/Time'])[2]");
	
	public By dispositionTitle = By.xpath("(//span[text()='Disposition'])[2]");
	
	
	
	/**
	 * Verify search result for Person account name
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifySearchResultPersonName(String allegation_ID,String firstName,String middleName,String lastName) throws AcisException {
		
		waitAndVerifyElement(accountsTitle);
		waitAndVerifyElement(accountNameTitle);
		waitAndVerifyElement(By.xpath("(//a[text()='"+ firstName +" "+ middleName  +" "+lastName+"'])[1]"));
		testLoggerInfo("Name Searched : " + firstName+" "+ middleName  +" "+lastName);
		logger.info("Verify search result for Person account name");
		
		scrollingToElementofAPage(allegationReportIDTitleBy);
		waitAndVerifyElement(allegationReportIDTitle);
		waitAndVerifyElement(By.xpath("(//a[@title='"+ allegation_ID+"'])[2]"));
		logger.info("Verify search result for Person account name Allegation report");
		
		scrollingToElementofAPage(intakePersonTitleBy);
		waitAndVerifyElement(intakePersonTitle);
		waitAndVerifyElement(By.xpath("(//a[@title='"+ allegation_ID+"'])[2]"));
		logger.info("Verify search result for Person account name Intake Person");
	}
	
	/**
	 * Verify search result by address
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifySearchResultAddress(String firstName,String middleName ,String lastName) throws AcisException {
		
		waitAndVerifyElement(accountsTitle);
		waitAndVerifyElement(accountNameTitle);
		waitAndVerifyElement(By.xpath("(//a[text()='"+ firstName +" "+ middleName  +" "+lastName+"'])[1]"));
		logger.info("Verify search result for Person account name");

		logger.info("Verify search result by address");
	}
	
	/**
	 * Verify search result by Allegation report ID
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void verifySearchResultAllegationID() throws AcisException {
		
		waitAndVerifyElement(allegationReportTitle);
		waitAndVerifyElement(allegationReportIDTitle);
		waitAndVerifyElement(intakeDateTimeTitle);
		waitAndVerifyElement(dispositionTitle);
		logger.info("Verify search result by address");
	}
	
	
}
