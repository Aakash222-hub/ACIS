package com.acis.automation.testcases.intake;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.Test;

import com.acis.automation.constants.Constants;
import com.acis.automation.library.TestBase;
import com.acis.automation.utilities.AcisException;

public class SupervisorHomePageTest extends TestBase  {

	public SupervisorHomePageTest() throws AcisException {
		super();
		// TODO Auto-generated constructor stub
	}

	final static Logger logger = LoggerFactory.getLogger(SupervisorHomePageTest.class);
	
	
	@Test(description = "US-0008 AgentHomePageIntakeSupervisorTest ", groups = { "High", "acisRegression", "Akash" })
	
	/***This Class contains pages related to labels of Agent Home Page Intake Supervisor
	 * @author akash.a.gauravs
	 */
	
	public void verifyAgentHomePageIntakeSupervisorlabel() throws AcisException {
		 try {
			 	userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("supervisorUserName"),
						testData.get(Constants.LOGINPAGE_SHEET).get("supervisorPassword"));
				homePage_SFDCPage.clickDownArrowHome();
				supervisorHomePage.verifyingMyIntakeReviewColoumnlabel();
	       } catch (Exception e) {
	            // TODO Auto-generated catch block
	            getStackTrace(e, "Failed US-0008 AgentHomePageIntakeSupervisorTest");
	        }
		
	}
}
