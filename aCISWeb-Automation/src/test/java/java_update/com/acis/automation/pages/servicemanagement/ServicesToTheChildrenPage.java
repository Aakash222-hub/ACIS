package com.acis.automation.pages.servicemanagement;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.acis.automation.library.PageBase;
import com.acis.automation.pages.intake.PersonsInvovled_OmniscriptPage;
import com.acis.automation.utilities.AcisException;

public class ServicesToTheChildrenPage extends PageBase {
	
	
	
	public ServicesToTheChildrenPage() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}
	final static Logger logger = LoggerFactory.getLogger(PersonsInvovled_OmniscriptPage.class);
	
	@FindBy(id="ServicesChildBlock")
	WebElement childTextBox;
	
	@FindBy(id="Plan6Months")
	WebElement childMovementDropdown;
	
	
	@FindBy(id="HealthNarrative")
	WebElement healthNarrativeTextBox;
	
	@FindBy (id="EducationNarrative")
	WebElement educationNarrativeTextBox;
	
	@FindBy (id="MentalNarrative")
	WebElement mentalNarrativeTextBox;
	
	
	
	@FindBy (id="OtherNarrative")
	WebElement otherNarrativeBox;
	

	@FindBy(xpath="//iframe[@title='accessibility title']")
	WebElement frame_element;  
	
	@FindBy(xpath= "//div[@id='PermanencyPlan_nextBtn']/p[contains(text(),'Next')]")
	WebElement nextBtn;
	
	
	public By serviceAgreementWithParents=By.xpath("//*[@id='ServiceAgreement']/section/div/div/div/h1");
	
	
	/**
	 * 
	 * @author akash.a.gaurav
	 * Entering Data in Services to the Children Page
	 * @throws AcisException 
	 */
	
	
	public void serviceToTheChildrenPage() throws AcisException   {
		
		try {
			switchToFrameByWebElement(frame_element);
			enterText(childTextBox, "Riya");
			Robot robot = new Robot();
			robot.keyPress(KeyEvent.VK_TAB);
			selectDropdownByVisibleText(childMovementDropdown, "Yes");
			enterText(healthNarrativeTextBox, "Health input text");
			enterText(educationNarrativeTextBox, "Education input text");
			enterText(mentalNarrativeTextBox, "Mental input text");
			enterText(otherNarrativeBox, "Other input text");
			logger.info("Filling Service to Child Form");
			nextBtn.click();
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	/**
	 * Verifying User lands on Service Agreement To The Parent Page
	 * @throws AcisException 
	 */
	
	
	public void verifyingUserlandsOnServiceAgreementToTheParent() throws AcisException {
		
		try {
			waitForElement(frame_element);
			switchToFrameByWebElement(frame_element);
			waitAndVerifyElement(serviceAgreementWithParents);
			logger.info("Verifying user lands up to the Service Agreement to the Parent page");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
