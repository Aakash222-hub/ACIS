package com.acis.automation.library;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringWriter;
import java.lang.reflect.Method;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.TimeZone;

import org.aeonbits.owner.ConfigFactory;
import org.apache.commons.io.output.WriterOutputStream;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.safari.SafariOptions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.zeroturnaround.zip.ZipUtil;

import com.acis.automation.constants.Constants;
import com.acis.automation.pages.HomePage;
import com.acis.automation.pages.UserLoginPage;
import com.acis.automation.pages.Placement.EditPlacementPage;
import com.acis.automation.pages.Placement.NewPlacement_OmniScriptPage;
import com.acis.automation.pages.Placement.PlacementSearchResults_OmniScriptPage;
import com.acis.automation.pages.allegation.AllegationReportPage;
import com.acis.automation.pages.casemanagement.CaseActionPage;
import com.acis.automation.pages.casemanagement.CaseClosureDecisionPage;
import com.acis.automation.pages.casemanagement.CaseHead_page;
import com.acis.automation.pages.casemanagement.CasePlanPage;
import com.acis.automation.pages.casemanagement.ChildRemovalEpisodePage;
import com.acis.automation.pages.casemanagement.CourtActionOutcomesPage;
import com.acis.automation.pages.casemanagement.CourtActionPage;
import com.acis.automation.pages.casemanagement.DetailsCaseActionTabPage;
import com.acis.automation.pages.casemanagement.EstablishRelationships_CP_OmniScriptPage;
import com.acis.automation.pages.casemanagement.FosterCareCase_Page;
import com.acis.automation.pages.casemanagement.FosterCareFamilyNeedsAssessmentpage;
import com.acis.automation.pages.casemanagement.HouseholdRelationshipPage;
import com.acis.automation.pages.casemanagement.NewComprehensiveAssessmentpage;
import com.acis.automation.pages.casemanagement.PermanencyHomePage;
import com.acis.automation.pages.casemanagement.PersonsInvovled_CP_OmniscriptPage;
import com.acis.automation.pages.casemanagement.UploadSupportingDocumentationPage;
import com.acis.automation.pages.caseplan.CasePlanReviewPage;
import com.acis.automation.pages.caseplan.FamilyPlacebookPage;
import com.acis.automation.pages.caseplan.NewLegalAction_OmniScriptPage;
import com.acis.automation.pages.caseplan.PermanencyPlan_OmniScriptPage;
import com.acis.automation.pages.caseplan.ProviderAgencySelectionPage;
import com.acis.automation.pages.caseplan.ServiceAgreementWithParents_OmniScriptPage;
import com.acis.automation.pages.caseplan.ServiceReferralPage;
import com.acis.automation.pages.caseplan.ServiceToProviderPage;
import com.acis.automation.pages.caseplan.ServicesToTheChildren_OmniScriptPage;
import com.acis.automation.pages.caseplan.VisitationPlan_OmniScriptPage;
import com.acis.automation.pages.homepage.AllAllegationPage;
import com.acis.automation.pages.homepage.FosterCareHomePage;
import com.acis.automation.pages.homepage.HomePage_SFDCPage;
import com.acis.automation.pages.homepage.PlacementResourcePage;
import com.acis.automation.pages.homepage.ProviderAgencyAccountPage;
import com.acis.automation.pages.homepage.SupervisorHomePage;
import com.acis.automation.pages.intake.AgencyHistory_OmniscriptPage;
import com.acis.automation.pages.intake.CreateIntakePerson_OmniscriptPage;
import com.acis.automation.pages.intake.PersonsInvovled_OmniscriptPage;
import com.acis.automation.pages.intake.ReportDetailsOmniscriptPage;
import com.acis.automation.pages.intake.ScreeningDecision_OmniscriptPage;
import com.acis.automation.pages.intake.SearchPerson_OmniscriptPage;
import com.acis.automation.pages.intake.SearchReportInformationPage;
import com.acis.automation.pages.intake.StructuredDecisionMakingOmniscriptPage;
import com.acis.automation.pages.intake.SupervisorDecisionDepositionUpdatePage;
import com.acis.automation.pages.intake.VerificationLabelsAfterIntakeCreationPage;
import com.acis.automation.pages.investigation.AssignInvestigationPage;
import com.acis.automation.pages.investigation.Collaterals_OmniScriptPage;
import com.acis.automation.pages.investigation.EstablishRelationships_IP_OmniScriptPage;
import com.acis.automation.pages.investigation.EstablishRelationships__OmniScriptPage;
import com.acis.automation.pages.investigation.Findings_OmniScriptPage;
import com.acis.automation.pages.investigation.Interview_OmniScriptPage;
import com.acis.automation.pages.investigation.InvestigationCasePage;
import com.acis.automation.pages.investigation.InvestigationReviewsPage;
import com.acis.automation.pages.investigation.PersonsInvovled_IP_OmniscriptPage;
import com.acis.automation.pages.investigation.RecordReview_OmniScriptPage;
import com.acis.automation.pages.investigation.ReviewAllegationReport_OmniScriptPage;
import com.acis.automation.pages.personaccount.AddressCreationIntakeOmniScriptPage;
//import com.acis.automation.pages.intake.VerificationLabelsAfterIntakeCreationPage;
import com.acis.automation.pages.personaccount.AddressesPage;
import com.acis.automation.pages.personaccount.DetailsPersonTabPage;
import com.acis.automation.pages.personaccount.EditPersonAccountPage;
import com.acis.automation.pages.personaccount.FilesPage;
import com.acis.automation.pages.personaccount.MandatoryPersonSearchSafetyAssesmentPage;
import com.acis.automation.pages.personaccount.NewPlacement_Pm_OmniScriptPage;
import com.acis.automation.pages.personaccount.PersonEducationPage;
import com.acis.automation.pages.personaccount.PersonHealthAppointmentsPage;
import com.acis.automation.pages.personaccount.FinanceCreationPage;
import com.acis.automation.pages.personaccount.PersonMedicationPage;
import com.acis.automation.pages.personaccount.PersonalIdentifierPage;
import com.acis.automation.pages.personaccount.PersonsInformationPage;
import com.acis.automation.pages.personaccount.PhoneEmailInformationPage;
import com.acis.automation.pages.personaccount.RelatedPersonTabPage;
import com.acis.automation.pages.providermanagement.AccountPage;
import com.acis.automation.pages.providermanagement.FosterInquirySecondPage;
import com.acis.automation.pages.providermanagement.FosterParentInquiryFormPage;
import com.acis.automation.pages.providermanagement.FosterPlacementPage;
import com.acis.automation.pages.providermanagement.LicensingApplicationpage;
import com.acis.automation.pages.providermanagement.NewOrientationEventPage;
import com.acis.automation.pages.providermanagement.NewRecruitmentEventPage;
import com.acis.automation.pages.providermanagement.RecordTypePage;
import com.acis.automation.pages.providermanagement.ServiceContractPage;
import com.acis.automation.pages.providermanagement.ServiceProviderPage;
import com.acis.automation.pages.safetyassessment.AssessTheHome_SA_OmniScriptPage;
import com.acis.automation.pages.safetyassessment.EstablishRelationships_SA_OmniScriptPage;
import com.acis.automation.pages.safetyassessment.InterviewCaregivers_SA_OmniScriptPage;
import com.acis.automation.pages.safetyassessment.InterviewChildren_SA_OmniScriptPage;
import com.acis.automation.pages.safetyassessment.InvestigationSafetyAssessmentPage;
import com.acis.automation.pages.safetyassessment.ReviewAllegationReport_SA_OmniScriptPage;
import com.acis.automation.pages.safetyassessment.SafetyDecision_SA_OmniScriptPage;
import com.acis.automation.pages.safetyassessment.SafetyScale_SA_OmniScriptPage;
import com.acis.automation.pages.servicemanagement.PermanencyPlanPage;
import com.acis.automation.pages.servicemanagement.ServicesToTheChildrenPage;
import com.acis.automation.pages.tdm.AddMeetingAttendeesPage;
import com.acis.automation.pages.tdm.InteractionDetailPage;
import com.acis.automation.pages.tdm.NewCollateralPage;
import com.acis.automation.pages.tdm.ReviewEditSendPage;
import com.acis.automation.pages.tdm.SelectMeetingLocationDateAndTimePage;
import com.acis.automation.utilities.AcisConfigProperties;
import com.acis.automation.utilities.AcisException;
import com.acis.automation.utilities.OSInfo;
import com.acis.automation.utilities.SimpleSuiteAlterer;
import com.acis.automation.utilities.TestDataHelper;
import com.aventstack.extentreports.AnalysisStrategy;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.response.Response;

/**
 * This class is used for set up and tear down of execution runs. Implement
 * different custom listeners for this.
 * 
 * 
 */

// @Listeners(com.iel.automation.utilities.IelListener.class)
public class TestBase {

	public static ExtentReports extent;
	public static ExtentTest test;
	public static ExtentTest parentTest;
	public static String suiteName;
	public static PrintStream captor;
	public static StringWriter writer;

	public static ThreadLocal<ExtentTest> classLevelExtentTest = new ThreadLocal<ExtentTest>();
	public static ThreadLocal<ExtentTest> testCaseLogger = new ThreadLocal<ExtentTest>();

	final static Logger logger = LoggerFactory.getLogger(TestBase.class);

	public static WebDriverWait wait;
	public static Properties appConfig = new Properties();
	public static Properties bugConfig = new Properties();

	public static WebDriver driver;
	private static int browserDetailsCount;
	public static String currentBrowserName;

	public static AcisConfigProperties configProperties;

	public static FileInputStream fis;
	public static Response response;
	public static String accessToken;

	public static TestDataHelper excel = new TestDataHelper();
	public static TestDataHelper createdDataExcel = new TestDataHelper();

	/* All objects creation */
	public static HomePage home;
	public static AllegationReportPage allegationReportPage;
	public static AllAllegationPage allAllegationPage;
	public static HomePage_SFDCPage homePage_SFDCPage;
	public static ReportDetailsOmniscriptPage reportDetailsOmniscriptPage;
	public static PersonsInvovled_OmniscriptPage personsInvovled_OmniscriptPage;
	public static ScreeningDecision_OmniscriptPage screeningDecision_OmniscriptPage;
	public static StructuredDecisionMakingOmniscriptPage structuredDecisionMakingOmniscriptPage;
	public static AddressesPage addressPage;
	public static EditPersonAccountPage editPersonAccountPage;
	public static PersonsInformationPage personsInformationPage;
	public static PersonMedicationPage personMedicationPage;
	public static PersonHealthAppointmentsPage personHealthAppointmentsPage;
	public static RelatedPersonTabPage relatedPersonTabPage;
	public static DetailsPersonTabPage detailsPersonTabPage;
	public static InteractionDetailPage interactionDetailPage;
	public static SearchPerson_OmniscriptPage searchPerson_OmniscriptPage;

	public static PermanencyPlanPage permanencyPlanPage;
	public static ServicesToTheChildrenPage servicesToTheChildrenPage;
	public static PersonalIdentifierPage personalIdentifierPage;
	public static PersonEducationPage personEducationPage;
	public static PhoneEmailInformationPage phoneEmailInformationPage;
	public static SupervisorHomePage supervisorHomePage;
	public static FinanceCreationPage financeCreationPage;
	public static SearchReportInformationPage searchReportInformationPage;
	public static VerificationLabelsAfterIntakeCreationPage verificationLabelsAfterIntakeCreationPage;
	public static SupervisorDecisionDepositionUpdatePage supervisorDecisionDepositionUpdatePage;
	public static FilesPage filesPage;
	public static AddressCreationIntakeOmniScriptPage addressCreationIntakeOmniScriptPage;
	public static InvestigationCasePage investigationCasePage;
	public static MandatoryPersonSearchSafetyAssesmentPage mandatoryPersonSearchSafetyAssesmentPage;
	// SafetyAssessment
	public static AssessTheHome_SA_OmniScriptPage assessTheHome_SA_OmniScriptPage;
	public static InterviewCaregivers_SA_OmniScriptPage interviewCaregivers_SA_OmniScriptPage;
	public static InterviewChildren_SA_OmniScriptPage interviewChildren_SA_OmniScriptPage;
	public static ReviewAllegationReport_SA_OmniScriptPage reviewAllegationReport_SA_OmniScriptPage;
	public static SafetyDecision_SA_OmniScriptPage safetyDecision_SA_OmniScriptPage;
	public static SafetyScale_SA_OmniScriptPage safetyScale_SA_OmniScriptPage;
	public static EstablishRelationships_SA_OmniScriptPage establishRelations_SA_OmniScriptPage;
	public static InvestigationSafetyAssessmentPage investigationSafetyAssessmentPage;
	// Investigation
	public static Collaterals_OmniScriptPage collaterals_OmniScriptPage;
	public static EstablishRelationships__OmniScriptPage establishRelationships__OmniScriptPage;
	public static Findings_OmniScriptPage findings_OmniScriptPage;
	public static Interview_OmniScriptPage interview_OmniScriptPage;
	public static RecordReview_OmniScriptPage recordReview_OmniScriptPage;
	public static ReviewAllegationReport_OmniScriptPage reviewAllegationReport_OmniScriptPage;
	public static AssignInvestigationPage assignInvestigationPage;
	public static InvestigationReviewsPage investigationReviesPage;

	// provider management
	public static AccountPage accountPage;
	public static FosterPlacementPage fosterPlacementPage;
	public static LicensingApplicationpage licensingApplicationpage;
	public static NewOrientationEventPage newOrientationEventPage;

	public static FosterParentInquiryFormPage fosterParentInquiryFormPage;

	public static ServiceContractPage serviceContractPage;

	public static VisitationPlan_OmniScriptPage visitationPlan_OmniScriptPage;
	// public static AssignInvestigationPage assignInvestigationPage;
	public static PersonsInvovled_IP_OmniscriptPage personInvovled_IP_OmniScriptPage;
	public static EstablishRelationships_IP_OmniScriptPage establishRelations_IP_OmniScriptPage;
	public static CreateIntakePerson_OmniscriptPage createIntakePerson_OmniscriptPage;

	public static FamilyPlacebookPage familyPlacebookPage;

	public static ServiceToProviderPage serviceToProviderPage;

	public static ServiceProviderPage serviceProviderPage;
	public static NewRecruitmentEventPage newRecruitmentEventPage;
	 
	
	public static NewLegalAction_OmniScriptPage newLegalAction_OmniScriptPage;
	public static NewPlacement_OmniScriptPage newPlacement_OmniScriptPage;
	public static PlacementSearchResults_OmniScriptPage placementSearchResults_OmniScriptPage;
	public static ServiceReferralPage serviceReferralPage;

	public static PermanencyPlan_OmniScriptPage permanencyPlan_OmniScriptPage;
	public static RecordTypePage recordTypePage;
	public static CasePlanReviewPage casePlanReviewPage;
	public static CaseHead_page caseHeadPage;
	public static FosterCareCase_Page fosterCareCase_Page;
	public static AddMeetingAttendeesPage addMeetingAttendeesPage;
	public static SelectMeetingLocationDateAndTimePage selectMeetingLocationDateAndTimePage;
	public static CaseActionPage caseActionPage;
	public static DetailsCaseActionTabPage detailsCaseActionPage;
	public static CourtActionOutcomesPage courtActionOutcomesPage;
	public static ServicesToTheChildren_OmniScriptPage servicesToTheChildren_OmniScriptPage;
	public static ServiceAgreementWithParents_OmniScriptPage serviceAgreementWithParents_OmniScriptPage;
	public static CasePlanPage casePlanPage;
	public static PermanencyHomePage permanencyHomePage;
	public static NewCollateralPage newCollateralPage;
	public static EstablishRelationships_CP_OmniScriptPage establishRelationships_CP_OmniScriptPage;
	public static HouseholdRelationshipPage householdRelationshipPage;
	public static PersonsInvovled_CP_OmniscriptPage personsInvovled_CP_OmniscriptPage;
	public static EditPlacementPage editPlacementPage;
	public static ProviderAgencyAccountPage providerAgencyAccountPage;
	public static PlacementResourcePage placementResourcePage;
	public static FosterCareHomePage fosterCareHomePage;
	public static FosterCareFamilyNeedsAssessmentpage fosterCareFamilyNeedsAssessmentpage;
	public static ChildRemovalEpisodePage childRemovalEpisodePage;
	public static ProviderAgencySelectionPage providerAgencySelectionPage;
	public static CourtActionPage courtActionPage;
	public static ReviewEditSendPage reviewEditSendPage;
	public static NewComprehensiveAssessmentpage newComprehensiveAssessmentpage;
	public static String strAppBuildVersion;
	public static UserLoginPage userLogin;
	public static FosterInquirySecondPage fosterInquirySecondPage;
	public static NewPlacement_Pm_OmniScriptPage newPlacement_Pm_OmniScriptPage;

	public static AgencyHistory_OmniscriptPage agencyHistory_OmniscriptPage;
	public static UploadSupportingDocumentationPage uploadSupportingDocumentationPage;
	public static CaseClosureDecisionPage caseClosureDecisionPage;

	private static final String ERROR_SCREENSHOT = "Unable to take screenshot : ";
	private static final String OUTPUT_FOLDER_NAME = "Output";
	private static final String SCREENSHOT_FOLDER_NAME = "Screenshots";
	private static final String PATH_SEPARATOR = "_";
	private static final String SCREENSHOT_FILETYPE = ".png";
	private static final String LOADPROPERTIES_ERROR = "Error in loading properties files";
	private static final String LOADPROPERTIES_MESSAGE = "Loading app config file";
	private static final String EXTENTSTARTED_MESSAGE = "Extent report started";
	private static final String BROWSERCREATED_MESSAGE = "Browser instance created";
	private static final String URLLAUNCHED_MESSAGE = "URL launched";
	private static final String AFTERMETHOD_MESSAGE = "	Test Case executed";
	private static final String AFTERSUITEMETHOD_MESSAGE = "In after Suite method ";
	private static final String REPORTGENERATED_MESSAGE = "Output Report generated";
	private static final String DRIVERCLOSED_MESSAGE = "Driver Closed";
	private static final String BROWSER_NAME = "Browser Name";
	private static final String BROWSER_VERSION = "Browser Version";
	private static final String DATEFORMAT_STRING = "yyyyMMddhhmmss";
	private static final String BEFOREMETHOD_MESSAGE = " Test case execution started";
	private static final String HOMEPAGE_MESSAGE = "Navigated to Home page";
	private static final String LOGOUT_MESSAGE = "Logged out successfully";
	private static final String EXCEPTION_LOGOUT_MESSAGE = "Exception Occured while doing logOut  :";

	public static String EnvironmentName = "";

	// Mrunal
	public static Map<String, Map<String, String>> createdData = new HashMap<>();

	public static Map<String, Map<String, String>> testData = new HashMap<>();
	public static Map<String, Map<String, String>> csvData = new HashMap<>();
	public static List<String> listCoursesSimulationsInPackage = new ArrayList<String>();
	public static HashMap<String, String> bugDetailsMap = new HashMap<String, String>();

	/**
	 * Default constructor of TestBase
	 * 
	 * @throws AcisException
	 */
	public TestBase() throws AcisException {
		testData = excel.getInputSheetIntoMap();
		createdData = createdDataExcel.getInputSheetIntoMapCreatedData();
		PageFactory.initElements(driver, this);
	}

	/**
	 * This method is used to initialize all page objects
	 * 
	 * @throws AcisException
	 */
	public void initializePageObjects() throws AcisException {

		userLogin = new UserLoginPage();
		home = new HomePage();

		allegationReportPage = new AllegationReportPage();

		allAllegationPage = new AllAllegationPage();
		homePage_SFDCPage = new HomePage_SFDCPage();
		reportDetailsOmniscriptPage = new ReportDetailsOmniscriptPage();
		personsInvovled_OmniscriptPage = new PersonsInvovled_OmniscriptPage();
		screeningDecision_OmniscriptPage = new ScreeningDecision_OmniscriptPage();
		structuredDecisionMakingOmniscriptPage = new StructuredDecisionMakingOmniscriptPage();
		agencyHistory_OmniscriptPage = new AgencyHistory_OmniscriptPage();
		addressPage = new AddressesPage();
		editPersonAccountPage = new EditPersonAccountPage();
		personsInformationPage = new PersonsInformationPage();
		personMedicationPage = new PersonMedicationPage();
		personHealthAppointmentsPage = new PersonHealthAppointmentsPage();
		relatedPersonTabPage = new RelatedPersonTabPage();
		detailsPersonTabPage = new DetailsPersonTabPage();
		permanencyPlanPage = new PermanencyPlanPage();
		servicesToTheChildrenPage = new ServicesToTheChildrenPage();
		personalIdentifierPage = new PersonalIdentifierPage();
		personEducationPage = new PersonEducationPage();
		phoneEmailInformationPage = new PhoneEmailInformationPage();
		supervisorHomePage = new SupervisorHomePage();
		financeCreationPage = new FinanceCreationPage();
		searchReportInformationPage = new SearchReportInformationPage();
		verificationLabelsAfterIntakeCreationPage = new VerificationLabelsAfterIntakeCreationPage();
		supervisorDecisionDepositionUpdatePage = new SupervisorDecisionDepositionUpdatePage();
		fosterInquirySecondPage = new FosterInquirySecondPage();
		filesPage = new FilesPage();
		// SafetyAssessment
		assessTheHome_SA_OmniScriptPage = new AssessTheHome_SA_OmniScriptPage();
		interviewCaregivers_SA_OmniScriptPage = new InterviewCaregivers_SA_OmniScriptPage();
		interviewChildren_SA_OmniScriptPage = new InterviewChildren_SA_OmniScriptPage();
		reviewAllegationReport_SA_OmniScriptPage = new ReviewAllegationReport_SA_OmniScriptPage();
		safetyDecision_SA_OmniScriptPage = new SafetyDecision_SA_OmniScriptPage();
		safetyScale_SA_OmniScriptPage = new SafetyScale_SA_OmniScriptPage();
		establishRelations_SA_OmniScriptPage = new EstablishRelationships_SA_OmniScriptPage();
		addressCreationIntakeOmniScriptPage = new AddressCreationIntakeOmniScriptPage();
		mandatoryPersonSearchSafetyAssesmentPage = new MandatoryPersonSearchSafetyAssesmentPage();
		investigationCasePage = new InvestigationCasePage();
		assignInvestigationPage = new AssignInvestigationPage();
		investigationSafetyAssessmentPage = new InvestigationSafetyAssessmentPage();
		// Investigation
		collaterals_OmniScriptPage = new Collaterals_OmniScriptPage();
		establishRelationships__OmniScriptPage = new EstablishRelationships__OmniScriptPage();
		findings_OmniScriptPage = new Findings_OmniScriptPage();
		interview_OmniScriptPage = new Interview_OmniScriptPage();
		recordReview_OmniScriptPage = new RecordReview_OmniScriptPage();
		reviewAllegationReport_OmniScriptPage = new ReviewAllegationReport_OmniScriptPage();
		investigationReviesPage = new InvestigationReviewsPage();
		personInvovled_IP_OmniScriptPage = new PersonsInvovled_IP_OmniscriptPage();
		establishRelations_IP_OmniScriptPage = new EstablishRelationships_IP_OmniScriptPage();
		searchPerson_OmniscriptPage = new SearchPerson_OmniscriptPage();
		createIntakePerson_OmniscriptPage = new CreateIntakePerson_OmniscriptPage();
		newLegalAction_OmniScriptPage = new NewLegalAction_OmniScriptPage();
		visitationPlan_OmniScriptPage = new VisitationPlan_OmniScriptPage();
		permanencyPlan_OmniScriptPage = new PermanencyPlan_OmniScriptPage();
		
		// placement
		newPlacement_OmniScriptPage = new NewPlacement_OmniScriptPage();
		placementSearchResults_OmniScriptPage = new PlacementSearchResults_OmniScriptPage();
		serviceReferralPage = new ServiceReferralPage();
		// casehead
		caseHeadPage = new CaseHead_page();
		fosterCareCase_Page = new FosterCareCase_Page();

		establishRelationships_CP_OmniScriptPage = new EstablishRelationships_CP_OmniScriptPage();
		personsInvovled_CP_OmniscriptPage = new PersonsInvovled_CP_OmniscriptPage();
		householdRelationshipPage=new HouseholdRelationshipPage();
		// provider management
		accountPage = new AccountPage();
		fosterParentInquiryFormPage = new FosterParentInquiryFormPage();
		fosterPlacementPage = new FosterPlacementPage();
		licensingApplicationpage = new LicensingApplicationpage();
		serviceContractPage = new ServiceContractPage();
		newOrientationEventPage = new NewOrientationEventPage();
		serviceProviderPage = new ServiceProviderPage();
		newRecruitmentEventPage = new NewRecruitmentEventPage();
		
		// case management
		caseActionPage = new CaseActionPage();
		detailsCaseActionPage = new DetailsCaseActionTabPage();
		serviceToProviderPage = new ServiceToProviderPage();
		fosterCareFamilyNeedsAssessmentpage = new FosterCareFamilyNeedsAssessmentpage();
		courtActionOutcomesPage = new CourtActionOutcomesPage();
		casePlanPage = new CasePlanPage();
		servicesToTheChildren_OmniScriptPage = new ServicesToTheChildren_OmniScriptPage();
		serviceAgreementWithParents_OmniScriptPage = new ServiceAgreementWithParents_OmniScriptPage();
		newPlacement_Pm_OmniScriptPage = new NewPlacement_Pm_OmniScriptPage();
		courtActionPage = new CourtActionPage();

		// interactions
		addMeetingAttendeesPage = new AddMeetingAttendeesPage();
		selectMeetingLocationDateAndTimePage = new SelectMeetingLocationDateAndTimePage();
		reviewEditSendPage = new ReviewEditSendPage();
		interactionDetailPage= new InteractionDetailPage();
		// Accounts
		placementResourcePage = new PlacementResourcePage();
		providerAgencyAccountPage = new ProviderAgencyAccountPage();

		fosterCareHomePage = new FosterCareHomePage();
		childRemovalEpisodePage = new ChildRemovalEpisodePage();
		familyPlacebookPage = new FamilyPlacebookPage();
		providerAgencySelectionPage = new ProviderAgencySelectionPage();
		newCollateralPage = new NewCollateralPage();
		permanencyHomePage = new PermanencyHomePage();
		editPlacementPage = new EditPlacementPage();
		newComprehensiveAssessmentpage = new NewComprehensiveAssessmentpage();
		recordTypePage = new RecordTypePage();
		casePlanReviewPage = new CasePlanReviewPage();
		uploadSupportingDocumentationPage = new UploadSupportingDocumentationPage();
		caseClosureDecisionPage = new CaseClosureDecisionPage();
		
	}

	/**
	 * To updated the Created Data excel
	 * 
	 * @author mrunal.s.tilekar
	 * @throws AcisException
	 */
	public void getCreatedData() throws AcisException {
		createdData = createdDataExcel.getInputSheetIntoMapCreatedData();
	}

	public void getCurrentSuiteName(ITestContext context) {

		if (SimpleSuiteAlterer.suiteList.contains(context.getSuite().getName().concat("_testng.xml"))) {
			suiteName = context.getSuite().getName().concat("_testng.xml");
		}
		logger.info("Suite Name " + suiteName);
	}

	/**
	 * This method gets executed before each test suite
	 * 
	 * @throws AcisException
	 * @throws InterruptedException
	 * @throws UnknownHostException
	 * 
	 */
	@BeforeSuite(alwaysRun = true)
	public void setUp(ITestContext context) throws AcisException, InterruptedException, UnknownHostException {
		loadAppProperties();
		loadBugPropertiesInMap();
		getCurrentSuiteName(context);

		if (appConfig.getProperty(Constants.ENVIRONMENT_NAME).equals(Constants.ENVIRONMENT_DEVQA) || ((appConfig
				.getProperty(Constants.ENVIRONMENT_NAME).equalsIgnoreCase(Constants.ENVIRONMENT_VALUE_FROM_JENKINS))
				&& (System.getProperty("Environment").equalsIgnoreCase(Constants.ENVIRONMENT_DEVQA)))) {

			ConfigFactory.setProperty(Constants.ENVIRONMENT_STRING,
					Constants.CONFIG_FILE_PREFIX + Constants.ENVIRONMENT_DEVQA);

		} else if (appConfig.getProperty(Constants.ENVIRONMENT_NAME).equals(Constants.ENVIRONMENT_STAGING)
				|| ((appConfig.getProperty(Constants.ENVIRONMENT_NAME)
						.equalsIgnoreCase(Constants.ENVIRONMENT_VALUE_FROM_JENKINS))
						&& (System.getProperty("Environment").equalsIgnoreCase(Constants.ENVIRONMENT_STAGING)))) {
			ConfigFactory.setProperty(Constants.ENVIRONMENT_STRING,
					Constants.CONFIG_FILE_PREFIX + Constants.ENVIRONMENT_STAGING);

		}
		configProperties = ConfigFactory.create(AcisConfigProperties.class);

		reportSetup(context);
		launchBrowser();
		initializePageObjects();
		/*
		 * accessToken = createAccessToken().jsonPath().get("Token.access_token");
		 * logger.info("Token code value :- " + accessToken);
		 * 
		 * if (suiteName.contains("iLMS_Learningpath")) { if
		 * (appConfig.getProperty(Constants.LP_TESTDATASETUP_FLAG).equals("true")) {
		 * //testdataSetup.createTestDataSetUpForLP(); } } else if
		 * (suiteName.contains("iLMS_OrgAdmin")) { if
		 * (appConfig.getProperty(Constants.ORGADMIN_TESTDATASETUP_FLAG).equals("true"))
		 * { //testdataSetup.createTestDataSetUpForOrgAdmin(); } } else if
		 * (suiteName.contains("iLMS_Learner")) { if
		 * (appConfig.getProperty(Constants.LEARNER_TESTDATASETUP_FLAG).equals("true"))
		 * { //testdataSetup.createTestDataSetUpForLearner(); } } else if
		 * (suiteName.contains("iLMS_MasterSuperAdmin")) { if
		 * (appConfig.getProperty(Constants.MSA_TESTDATASETUP_FLAG).equals("true")) {
		 * //testdataSetup.createTestDataSetUpForMSA(); } }
		 */
		driver.get(configProperties.acisurl());
		Thread.sleep(5000);
		// strAppBuildVersion = getApplicationBuildVersion();
		addBrowserDetails();
	}

	/**
	 * This method is to get class name from testNg XML
	 * 
	 * @param context
	 * @throws AcisException
	 * @throws InterruptedException
	 */

	@BeforeClass(alwaysRun = true)
	public void getClassName(ITestContext context) throws AcisException, InterruptedException {

		/*
		 * if (suiteName.contains("iLMS_OrgAdmin") || suiteName.contains("iLMS_Learner")
		 * || suiteName.contains("iLMS_Learningpath")) { // Before login test classes if
		 * ((this.getClass().getSimpleName()).equals("OrgAdminLoginPageTest") ||
		 * (this.getClass().getSimpleName()).equals("LearnerLoginPageTest")) {
		 * driver.navigate().refresh(); driver.get(configProperties.adminDefaulturl());
		 * logger.info("No need to login for this class test cases : " +
		 * this.getClass().getSimpleName()); } // After Login Test classes else {
		 * driver.navigate().refresh(); driver.get(configProperties.adminDefaulturl());
		 * userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get(
		 * "orgusername"), testData.get(Constants.LOGINPAGE_SHEET).get("orgpassword"));
		 * home.verifyLogin(); } }
		 */
		/*
		 * if (suiteName.contains("iLMS_MasterSuperAdmin")) { // Before login test
		 * classes if ((this.getClass().getSimpleName()).equals("MSALoginPageTest")) {
		 * driver.navigate().refresh();
		 * msaLogin.navigateToApp(configProperties.msaUrl());
		 * logger.info("No need to login for this class test cases : " +
		 * this.getClass().getSimpleName()); } // After Login Test classes else {
		 * driver.navigate().refresh();
		 * msaLogin.navigateToApp(configProperties.msaUrl());
		 * userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get(
		 * "userName"), testData.get(Constants.LOGINPAGE_SHEET).get("password"));
		 * home.verifyLogin(); } }
		 */
//		userLogin.loginUserToApplication(testData.get(Constants.LOGINPAGE_SHEET).get("userName"),
//				testData.get(Constants.LOGINPAGE_SHEET).get("password"));
//		Thread.sleep(8000);

		parentTest = extent.createTest(this.getClass().getSimpleName());
		// parent = extent.createTest(getClass().getSimpleName());
		classLevelExtentTest.set(parentTest);

	}

	/**
	 * This method will be executed before each test method
	 * 
	 * @param method- to get currently executing test method description
	 * 
	 * @throws AcisException
	 */
	@BeforeMethod(alwaysRun = true)
	public void reportSetUp(Method method) throws AcisException {
		logger.info(BEFOREMETHOD_MESSAGE + method.getAnnotation(Test.class).description());
		startReport(method.getAnnotation(Test.class).description(), method);
		writer = new StringWriter();
		captor = new PrintStream(new WriterOutputStream(writer), true);

	}

	/**
	 * To create object of Extent report
	 * 
	 * @param context
	 * @throws AcisException
	 * @throws InterruptedException
	 * @throws UnknownHostException
	 */
	public void reportSetup(ITestContext context) throws AcisException, InterruptedException, UnknownHostException {

		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter(
				String.format(Constants.EXTENT_OUTPUT_REPORT_PATH, context.getCurrentXmlTest().getSuite().getName()));
		htmlReporter.setAppendExisting(false);

		htmlReporter.config().setCSS("css-string");

		htmlReporter.config().setJS("js-string");

		htmlReporter.config().setDocumentTitle(suiteName.split("_testng")[0].toUpperCase());

		htmlReporter.config().setTimeStampFormat("yyyy-MM-dd hh:mm:ss a");

		htmlReporter.config().setChartVisibilityOnOpen(false);
		htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
		htmlReporter.config().setFilePath(".Output/HtmlReports/");

		htmlReporter.loadXMLConfig(new File(Constants.REPORTCONFIG_FILE_PATH));
		extent = new ExtentReports();
		extent.attachReporter(htmlReporter);

		InetAddress inetAddress = InetAddress.getLocalHost();
		extent.setSystemInfo("OS name", System.getProperty("os.name"));
		extent.setSystemInfo("Host Name", inetAddress.getCanonicalHostName());
		extent.setSystemInfo("User Name", System.getProperty("user.name"));
		extent.setSystemInfo("Execution-Env", getEnvironmentName().toUpperCase());
		extent.setSystemInfo("SuiteName", suiteName.split("_testng")[0].toUpperCase());
		extent.setAnalysisStrategy(AnalysisStrategy.CLASS);
	}

	/**
	 * This is a method to log messages in extent report for test cases
	 * 
	 * @param method
	 */
	public static ExtentTest testLogger() {

		return testCaseLogger.get();
	}

	/**
	 * To start extent report for test case
	 * 
	 * 
	 * @param strTestName - name of test case
	 * @param method
	 */
	public void startReport(String strTestName, Method method) {
		// test = extent.createTest(strTestName);

		test = classLevelExtentTest.get().createNode(strTestName);
		testCaseLogger.set(test);

		// test = parentTest.createNode(strTestName);
		for (String category : method.getAnnotation(Test.class).groups()) {

			if (category.equals("Shreyas") || category.equals("Dharmesh")) {
				testLogger().assignAuthor(category);
				logger.info("Author assigned is :" + category);
			} else {
				testLogger().assignCategory(category);
				logger.info("Category assigned is :" + category);
			}
		}
		testLogger().log(Status.INFO, BEFOREMETHOD_MESSAGE);
		logger.info(EXTENTSTARTED_MESSAGE);
	}

	public void createZIP(String zipDest, File rootDirectory) {
		ZipUtil.pack(rootDirectory, new File(zipDest));
	}

	/**
	 * This method is executed after each test method
	 * 
	 * @throws AcisException when there is any error while generating report
	 */
	@AfterMethod(alwaysRun = true)
	public void testCleanUp() throws AcisException {
		extent.flush();
	}

	/**
	 * This method is executed after test suite execution is completed
	 * 
	 * @throws AcisException
	 * @throws IOException
	 */

	@AfterSuite(alwaysRun = true)
	public void tearDown() throws AcisException, IOException {
		try {
			logger.info(AFTERSUITEMETHOD_MESSAGE);
			// if (suiteName.contains("iLMS_MasterSuperAdmin")) {
			// String orgNames = "AutoOrg_iLMSUI_" + convertDateFormat("ddMMMyy",
			// getPastDate(0));
			// organizations.deleteOrganizations(orgNames);
			// organizations.purgeOrgnizations(orgNames);
			//sk changes
			// }
			quitWebDriver();
		} catch (Exception e) {
			logger.info(EXCEPTION_LOGOUT_MESSAGE);
			throw new AcisException(EXCEPTION_LOGOUT_MESSAGE);
		} finally {
			quitWebDriver();
			createZIP(Constants.OUTPUT_FOLDER_ZIP, new File(Constants.HTMLFOLDER));
		}
	}

	/**
	 * This method is used to load app config properties file in java Properties
	 * 
	 * @throws AcisException when error in loading properties file
	 * 
	 */
	private void loadAppProperties() throws AcisException {

		try {
			fis = new FileInputStream(Constants.APPCONFIG_FILE_PATH);
			appConfig.load(fis);
			logger.info(LOADPROPERTIES_MESSAGE);
			logger.info("Highlight webElement Flag is set To : " + getHighlighterFlag());
		} catch (IOException e) {
			logger.error(LOADPROPERTIES_ERROR);
			throw new AcisException(LOADPROPERTIES_ERROR);
		}
	}

	/**
	 * This method is used to load app config properties file in Map for bugs
	 * 
	 * @throws AcisException when error in loading properties file
	 * 
	 */
	private void loadBugPropertiesInMap() throws AcisException {

		try {
			fis = new FileInputStream(Constants.BUGCONFIG_FILE_PATH);
			bugConfig.load(fis);
			logger.info(LOADPROPERTIES_MESSAGE);

		} catch (IOException e) {
			logger.error(LOADPROPERTIES_ERROR);
			throw new AcisException(LOADPROPERTIES_ERROR);
		}
	}

	/**
	 * This method is used to create screenshot
	 * 
	 * @param strScreenshotName Name of screenshot file to be captured
	 * @return path of screenshot as a base 64 string
	 * @throws AcisException while creating screenshot for failed test
	 */

	public String captureScreen(String imageName) throws AcisException {

		// This is temporary solution to take screenshot while alert is present
		if (isAlertPresent()) {
			cancelTheAlert();
			logger.info("Handled unexpected alert");
		}

		String strDateValue = new SimpleDateFormat(DATEFORMAT_STRING).format(new Date());

		File sourceFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

		FileInputStream fileInputStreamReader = null;
		String strDestination = null;
		try {

			fileInputStreamReader = new FileInputStream(sourceFile);
			byte[] bytes = new byte[(int) sourceFile.length()];
			fileInputStreamReader.read(bytes);
			strDestination = SCREENSHOT_FOLDER_NAME + OSInfo.getFileSeparator() + imageName + PATH_SEPARATOR
					+ strDateValue + SCREENSHOT_FILETYPE;

			File destination = new File(
					Constants.SCREENSHOT_FOLDER_PATH + imageName + PATH_SEPARATOR + strDateValue + SCREENSHOT_FILETYPE);
			FileHandler.copy(sourceFile, destination);

		} catch (IOException e) {
			logger.error(ERROR_SCREENSHOT + e.getMessage());
			throw new AcisException(ERROR_SCREENSHOT);
		}
		// return "data:image/png;base64," + encodedBase64;
		return strDestination;
	}

	/**
	 * This method is used to launch the browser
	 * 
	 * @throws AcisException
	 */

	public void launchBrowser() {

		if (appConfig.getProperty(Constants.BROWSER_NAME).equalsIgnoreCase(Constants.FF_BROWSER) || ((appConfig
				.getProperty(Constants.BROWSER_NAME).equalsIgnoreCase(Constants.BROWSER_VALUE_FROM_JENKINS))
				&& ((System.getProperty("Browser")).equalsIgnoreCase(Constants.FF_BROWSER)))) {

			// System.setProperty(Constants.FF_SYSTEM_PROPERTY,
			// Constants.GECKODRIVER_EXE_PATH);

			WebDriverManager.firefoxdriver().setup();

			FirefoxOptions options = new FirefoxOptions();

			FirefoxProfile firefoxProfile = new FirefoxProfile();

			firefoxProfile.setPreference("browser.download.dir",
					System.getProperty("user.dir") + "/src/resources/downloads");
			firefoxProfile.setPreference("browser.download.folderList", 2);
			firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/pdf");
			firefoxProfile.setPreference("pdfjs.disabled", true);
			firefoxProfile.setPreference("browser.downloadmanager.showWhenStarting", false);

			firefoxProfile.setPreference("browser.download.dir", Constants.DOWNLOAD_PATH);
			firefoxProfile.setPreference("browser.download.folderList", 2);
			firefoxProfile.setPreference("browser.helperApps.neverAsk.saveToDisk",
					"application/pdf,application/x-pdf,application/octet-stream");
			firefoxProfile.setPreference("browser.download.useDownloadDir", true);
			firefoxProfile.setPreference("xpinstall.signatures.required", false);

			firefoxProfile.setPreference("pdfjs.disabled", true);
			firefoxProfile.setPreference("browser.download.manager.showWhenStarting", false);

			firefoxProfile.setPreference("plugin.state.default", 2);
			firefoxProfile.setPreference("dom.disable_open_during_load", false);
			firefoxProfile.setPreference("capability.policy.strict.Window.alert", "noAccess");
			firefoxProfile.setPreference("capability.policy.strict.Window.confirm", "noAccess");
			firefoxProfile.setPreference("capability.policy.strict.Window.prompt", "noAccess");
			firefoxProfile.setPreference("extensions.firebug.console.enableSites", true);
			firefoxProfile.setPreference("dom.disable_beforeunload", true);
			firefoxProfile.setAcceptUntrustedCertificates(true);
			firefoxProfile.setAssumeUntrustedCertificateIssuer(false);
			firefoxProfile.setPreference("dom.max_script_run_time", 0);
			firefoxProfile.setPreference("dom.max_chrome_script_run_time", 0);
			firefoxProfile.setPreference("webdriver_unexpected_alert_behaviour",
					UnexpectedAlertBehaviour.ACCEPT.toString());
			firefoxProfile.setPreference("app.update.auto", false);
			firefoxProfile.setPreference("app.update.enabled", false);
			firefoxProfile.setPreference("app.update.silent", false);

			options.setCapability(FirefoxDriver.PROFILE, firefoxProfile);
			options.setCapability("handlesAlerts", true);
			options.setCapability("ignoreZoomSetting", true);

			options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.IGNORE);
			options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, "Accept");
			options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);

			driver = new FirefoxDriver(options);
			logger.info("Firefox browser is launched");

			currentBrowserName = Constants.FF_BROWSER;

		} else if (appConfig.getProperty(Constants.BROWSER_NAME).equalsIgnoreCase(Constants.CHROME_BROWSER)
				|| ((appConfig.getProperty(Constants.BROWSER_NAME)
						.equalsIgnoreCase(Constants.BROWSER_VALUE_FROM_JENKINS))
						&& ((System.getProperty("Browser")).equalsIgnoreCase(Constants.CHROME_BROWSER)))) {

			// System.setProperty(Constants.CHROME_SYSTEM_PROPERTY,
			// Constants.CHROMEDRIVER_EXE_PATH);

			WebDriverManager.chromedriver().setup();

			ChromeOptions options = new ChromeOptions();

			// options.setCapability(CapabilityType.SUPPORTS_ALERTS, true);
			// options.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR,
			// UnexpectedAlertBehaviour.ACCEPT);
			options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
			options.setCapability("nativeEvents", false);
			options.setCapability("ignoreZoomSetting", true);

			options.addArguments("start-maximized");
			options.addArguments("disable-infobars");
			options.addArguments("test-type");
			options.addArguments("--disable-notifications");
			options.addArguments("--disable-extensions");
			options.addArguments("chrome.switches", "--disable-extensions");
			options.addArguments("no-sandbox");
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("profile.default_content_settings.popups", 0);

			prefs.put("credentials_enable_service", false);
			prefs.put("password_manager_enabled", false);
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("chrome.switches", "--disable-extensions");

			prefs.put("download.default_directory", Constants.DOWNLOAD_PATH);

			// options.addArguments("--headless");
			// options.addArguments("--disable-gpu");
			// options.addArguments("--incognito");

			// options.setCapability(ChromeOptions.CAPABILITY, options);

			driver = new ChromeDriver(options);
			logger.info("Chrome browser is launched");

			currentBrowserName = Constants.CHROME_BROWSER;

		} else if (appConfig.getProperty(Constants.BROWSER_NAME).equalsIgnoreCase(Constants.IE_BROWSER) || ((appConfig
				.getProperty(Constants.BROWSER_NAME).equalsIgnoreCase(Constants.BROWSER_VALUE_FROM_JENKINS))
				&& ((System.getProperty("Browser")).equalsIgnoreCase(Constants.IE_BROWSER)))) {

			// System.setProperty(Constants.IE_SYSTEM_PROPERTY,
			// Constants.IEDRIVER_EXE_PATH);

			WebDriverManager.iedriver().arch32().setup();

			InternetExplorerOptions options = new InternetExplorerOptions();
			options.setCapability("EnableNativeEvents", false);
			options.setCapability("ignoreZoomSetting", true);
			options.setCapability("enablePersistentHover", true);

			options.takeFullPageScreenshot();
			options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

			driver = new InternetExplorerDriver(options);
			driver.manage().window().maximize();
			logger.info("IE browser is launched");
			currentBrowserName = Constants.IE_BROWSER;

		} else if (appConfig.getProperty(Constants.BROWSER_NAME).equalsIgnoreCase(Constants.EDGE_BROWSER) || ((appConfig
				.getProperty(Constants.BROWSER_NAME).equalsIgnoreCase(Constants.BROWSER_VALUE_FROM_JENKINS))
				&& ((System.getProperty("Browser")).equalsIgnoreCase(Constants.EDGE_BROWSER)))) {

			WebDriverManager.edgedriver().version("5.16299").forceDownload();

			EdgeOptions options = new EdgeOptions();
			options.setCapability("EnableNativeEvents", false);
			options.setCapability("ignoreZoomSetting", true);
			options.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			options.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);

			driver = new EdgeDriver(options);
			logger.info("Edge browser is launched");

			currentBrowserName = Constants.EDGE_BROWSER;

		} else if (appConfig.getProperty(Constants.BROWSER_NAME).equalsIgnoreCase(Constants.SAFARI_BROWSER)
				|| ((appConfig.getProperty(Constants.BROWSER_NAME)
						.equalsIgnoreCase(Constants.BROWSER_VALUE_FROM_JENKINS))
						&& ((System.getProperty("Browser")).equalsIgnoreCase(Constants.SAFARI_BROWSER)))) {

			SafariOptions options = new SafariOptions();

			options.setCapability("browserName", "safari");
			options.setCapability("applicationName", "desktop");
			options.setCapability("javascriptEnable", "true");
			options.setCapability("cssSelectorsEnable", "true");
			options.setCapability("secureSsl", "true");

			driver = new SafariDriver(options);
			driver.manage().window().maximize();
			logger.info("Safari browser is launched");
			currentBrowserName = Constants.SAFARI_BROWSER;

		} else if (appConfig.getProperty(Constants.BROWSER_NAME).equalsIgnoreCase(Constants.CHROME_BROWSER_ON_MAC)
				|| ((appConfig.getProperty(Constants.BROWSER_NAME)
						.equalsIgnoreCase(Constants.BROWSER_VALUE_FROM_JENKINS))
						&& ((System.getProperty("Browser")).equalsIgnoreCase(Constants.CHROME_BROWSER_ON_MAC)))) {

			ChromeOptions options = new ChromeOptions();
			options.addArguments("test-type");
			options.addArguments("start-maximized");
			options.addArguments("--enable-automation");
			options.addArguments("test-type=browser");
			options.addArguments("disable-infobars");
			driver = new ChromeDriver(options);
			driver.manage().window().fullscreen();

			// driver.manage().window().maximize();
			logger.info("Chrome browser on MAC is launched");
			currentBrowserName = Constants.CHROME_BROWSER_ON_MAC;
		}
		logger.info(BROWSERCREATED_MESSAGE);
		driver.manage().deleteAllCookies();

	}

	/**
	 * This method is used to return HighlighterFlag as boolean
	 * 
	 * @throws AcisException
	 */

	private String getHighlighterFlag() {
		String highlighterFlag;

		if (appConfig.getProperty(Constants.HIGHLIGHT_FLAG)
				.equalsIgnoreCase(Constants.HIGHLIGHTERFLAG_VALUE_FROM_JENKINS)) {
			highlighterFlag = System.getProperty("HighlighterFlag");
		} else
			highlighterFlag = appConfig.getProperty(Constants.HIGHLIGHT_FLAG);
		return highlighterFlag;
	}

	public boolean isAlertPresent() {
		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException ex) {
			return false;
		}
	}

	public void cancelTheAlert() {
		if (isAlertPresent()) {
			do {
				Alert alert = driver.switchTo().alert();
				alert.dismiss();
			} while (isAlertPresent());
		}
	}

	/**
	 * This method is used to return Environment Name
	 * 
	 * @throws AcisException
	 */

	public String getEnvironmentName() {
		String strEnvironment = null;

		if (appConfig.getProperty("environment").equalsIgnoreCase(Constants.ENVIRONMENT_VALUE_FROM_JENKINS)) {
			strEnvironment = System.getProperty("Environment");

		} else {
			strEnvironment = appConfig.getProperty("environment");
		}
		logger.info("Environment is : " + strEnvironment);
		return strEnvironment;

	}

	/**
	 * This method is used to return Application build version
	 * 
	 * @throws AcisException
	 */

	public String getApplicationBuildVersion() {
		String strBuildVersion = "";

		WebDriverWait wait = new WebDriverWait(driver, 180);
		wait.until(ExpectedConditions.titleContains("iLMS"));

		String strTitle = driver.getTitle();
		String Title[] = strTitle.split(" ");
		strBuildVersion = Title[1];
		return strBuildVersion;
	}

	/**
	 * This method is used to display current Browser Name and Application build
	 * version on Extent report and console logger
	 * 
	 * @throws AcisException
	 */

	private void addBrowserDetails() {
		Capabilities cap = ((RemoteWebDriver) driver).getCapabilities();
		extent.setSystemInfo("Browser Details",
				cap.getBrowserName().toString().toUpperCase() + "  " + cap.getVersion().toString());
		// extent.setSystemInfo("App Build Version", strAppBuildVersion);

		logger.info("The Browser Detail is : " + cap.getBrowserName().toString().toUpperCase() + "  "
				+ cap.getVersion().toString());
		// logger.info("The Application Build Version is : " + strAppBuildVersion);

	}

	/**
	 * This method is used to quit web driver
	 * 
	 * @throws AcisException
	 */

	public void quitWebDriver() {
		if (!(driver == null)) {
			driver.quit();
			logger.info("WebDriver session is quited successully");
		}
	}

	/**
	 * This method is summarize system generated exception message and display
	 * actual root cause for exception
	 * 
	 * @throws AcisException
	 */

	public void getStackTrace(Throwable e, String exception_message) throws AcisException {

		String ExcepionMessage = Arrays.toString(e.getStackTrace());

		logger.error(exception_message + "\n"
				+ ExcepionMessage.replaceAll("\\[", "").replaceAll(", ", "\n").replaceAll("]", "") + "\n");
		throw new AcisException(exception_message);
	}

	/**
	 * This method is to get past date with time
	 * 
	 * @throws AcisException
	 */
	public static String getPastDateWithTimeForPotter(int intDays) {
		// String DATE_FORMAT = "MM/dd/yyyy";
		String date = "";
		String DATE_FORMAT = "MM/dd/yyyy HH:mm:ss";
		DateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -intDays);
		Date pastdate = cal.getTime();
		sdf.setTimeZone(TimeZone.getTimeZone("GMT-06:00"));
		date = sdf.format(pastdate);
		return date;
	}

	/**
	 * This method is used to get past date
	 * 
	 * @param intDays
	 */
	public String getPastDate(int intDays) {
		// String DATE_FORMAT = "MM/dd/yyyy";
		String date = "";
		String DATE_FORMAT = "MM/dd/yyyy";
		DateFormat sdf = new SimpleDateFormat(DATE_FORMAT);
		// TimeZone timeZone = TimeZone.getTimeZone("GMT-06:00");
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DATE, -intDays);
		Date pastdate = cal.getTime();
		sdf.setTimeZone(TimeZone.getTimeZone("GMT-06:00"));
		date = sdf.format(pastdate);

		return date;
	}

	/**
	 * This method is used to convert Date format
	 * 
	 * @throws ParseException
	 */

	public String convertDateFormat(String stringDateFormat, String pastDate) throws ParseException {

		Date date1 = new SimpleDateFormat("MM/dd/yyyy").parse(pastDate);

		DateFormat sdf = new SimpleDateFormat(stringDateFormat);

		String givenFormatDat = sdf.format(date1);

		return givenFormatDat;

	}

}
