package com.acis.automation.pages.casemanagement;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.Assert;

import com.acis.automation.library.PageBase;
import com.acis.automation.utilities.AcisException;

public class PermanencyHomePage extends PageBase {

	public PermanencyHomePage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(PermanencyHomePage.class);
	
	@FindBy(xpath = "//span[@title='Status']")
	WebElement status;
	
	/**
	 * verify Labels on HomePage
	 * @author Dharmesh Krishna
	*/
	public void verifyLabelsHome() throws AcisException, InterruptedException, IOException {
		String labels[]= {"Status","Child's Name","Date of Birth","Age","Case ID","Date of Entry","Length of Stay","Permanency Goal","Transaction","Go","Insights"};
		waitForPageLoadTill(5);
		waitForPageLoad();
		waitForElement(status);
		for (int i = 1; i < 12; i++) {
			logger.info("Verified Label" + labels[i-1]);
			Assert.assertTrue(verifyTextEquals(driver.findElement(By.xpath("((//table/thead/tr//th)["+i+"]//span)[1]/span")), labels[i-1]), "Error"+labels[i-1]+" Label not found");
//			verifyTextEquals(driver.findElement(By.xpath("((//table/thead/tr//th)["+i+"]//span)[1]/span")), labels[i-1]);
			logger.info("Verified Label" + labels[i-1]);
		}
		
	}

	/**
	 * Check reunification label for child
	 * @author mrunal.s.tilekar
	 * @throws AcisException 
	 */
	public void clickGo(String childName) throws AcisException {
		logger.info("Clicking on Go Button");
		waitForPageLoad();
		waitForElement(driver.findElement(By.xpath("//*[text()='"+childName+"']//ancestor::td/following-sibling::td//button[@title='Go']")));
		clickWebElemntUsingJavascriptExecutor(driver.findElement(By.xpath("//*[text()='"+childName+"']//ancestor::td/following-sibling::td//button[@title='Go']")));
		logger.info("Clicked on Go Button");
	}
	
	/**
	 * Check Status label for child
	 * @author dharmesh
	 */
	public void checkStatus(String childName,String status) {
		logger.info("Checking "+status+" Status label for child");
		waitForPageLoad();
		Assert.assertTrue((driver.findElement(By.xpath("//*[text()='"+childName+"']//ancestor::td/following-sibling::td//*[text()='"+status+"']"))).isDisplayed(), 
				"Error : No "+status+" Status text present for child name : " + childName);
		logger.info("Checked "+status+" Status label for child");
	}
}
