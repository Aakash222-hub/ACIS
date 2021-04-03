package com.acis.automation.pages.Placement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class PlacementPersonAccountPage extends PageBase{

	public PlacementPersonAccountPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(PlacementPersonAccountPage.class);

	@FindBy(xpath = "//*[text()='Placement Type']/..//lightning-formatted-text")
	WebElement placementTypeValue;
	
	@FindBy(xpath = "(//a[text()='Details'])[2]")
	WebElement caseDetailsTab;
	
	
	
	
	
	/**
	 * check Placement type value
	 * @author mrunal.s.tilekar
	 */
	public void checkPlacementTypeValue(String value) {
		logger.info("checking Placement type value: " + value);
		waitForPageLoadTill(5);
		
		switch (value) {
		case "Kinship":
			Assert.assertTrue(((placementTypeValue.getText().contains(value))), "Placement Value does not match " + "Actual Value: " + value 
					+"Expected Value: " + placementTypeValue.getText());
			logger.info("checked Placement type value: " + value);
			break;

		default:
			break;
		}
	}
	
	/**
	 * Click on Details Tab of Placement account
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void clickDetailsTabOfPlacementAccount() throws AcisException {
		logger.info("Clicking Investigation Case Details Tab");
		waitForPageLoadTill(5);
		clickWebElemntUsingJavascriptExecutor(caseDetailsTab);
		waitForPageLoad();
		waitForPageLoadTill(5);
		logger.info("Clicked Investigation Case Details Tab");
	}
	
	
	/**
	 * Verify Parent 1 value
	 * @author mrunal.s.tilekar
	 */
	public void verifyParent1Value(String parentName) {
		logger.info("Verifying parent 1 value : " + parentName);
		waitForPageLoadTill(5);
		Assert.assertTrue((driver.findElement(By.xpath("//*[text()='Parent 1']/../..//*[text()='"+ parentName +"']")).isDisplayed()), "Parent 1 value does not match");
		logger.info("Verifyed parent 1 value : " + parentName);
	}
	
	/**
	 * Verify Address
	 * @author mrunal.s.tilekar
	 */
	public void verifyAddress(String address) {
		logger.info("Verifying address " + address);
		waitForPageLoadTill(5);
		Assert.assertTrue((driver.findElement(By.xpath("//div[contains(text(),'"+ address+"')]")).isDisplayed()), "Parent 1 value does not match");
		logger.info("Verifyed address : " + address);
	}
}
