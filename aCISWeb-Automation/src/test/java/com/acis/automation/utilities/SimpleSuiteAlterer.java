package com.acis.automation.utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.nio.file.DirectoryNotEmptyException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Properties;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Result;
import javax.xml.transform.Source;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathFactory;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.IAlterSuiteListener;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import com.acis.automation.constants.Constants;

public class SimpleSuiteAlterer implements IAlterSuiteListener {
	final static Logger logger = LoggerFactory.getLogger(SimpleSuiteAlterer.class);
	public static Properties appConfigForListener = new Properties();
	public static FileInputStream fis;

	public static List<String> suiteList = new ArrayList<String>();

	/**
	 * This is overridden method of Listener & used to create testNg dynamically &
	 * will do cleanup activity for old run reports
	 * 
	 * 
	 */

	@Override
	public void alter(List suites) {
		try {
			getSuiteName();
			cleanOldRunReports(Constants.HTMLFOLDER);
			cleanOldRunReports(Constants.OUTPUT_FOLDER);
			cleanOldRunReports(Constants.SCREENSHOT_FOLDER_PATH);

		} catch (AcisException e) {
			logger.error("Error in Suite alter listener" + e.getMessage());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/**
	 * This method is used to load AppProperties
	 * 
	 * @throws AcisException
	 */

	private void loadAppProperties() throws AcisException {

		try {
			fis = new FileInputStream(Constants.APPCONFIG_FILE_PATH);
			appConfigForListener.load(fis);
		} catch (IOException e) {
			logger.error("Error in loading prop file" + e.getMessage());
			throw new AcisException("Error in loading prop file");
		}
	}

	/**
	 * This method is used to clean old run Reports
	 * 
	 * @throws AcisException
	 */
	public static void cleanOldRunReports(String strFolderName) throws InterruptedException {
		try {

			File[] listFiles = new File(strFolderName).listFiles();
			String fileName = null;

			for (int i = 0; i < listFiles.length; i++) {

				if (listFiles[i].isFile()) {
					fileName = listFiles[i].getName();
					if (fileName.endsWith(".html") || fileName.endsWith(".png") || fileName.endsWith(".zip")) {
						Files.deleteIfExists(Paths.get(strFolderName + fileName));
						Thread.sleep(2000);
					}

				}

			}

		} catch (NoSuchFileException e) {
			logger.info("No such file/directory exists");
		} catch (DirectoryNotEmptyException e) {
			logger.info("Directory is not empty.");
		} catch (IOException e) {
			logger.info("Invalid permissions.");
		}

		logger.info("Old Output files Deletion successful under folder :" + strFolderName);

	}

	/**
	 * This method is used to get Suite Name
	 * 
	 * @throws AcisException
	 */

	public void getSuiteName() throws AcisException {

		try {
			loadAppProperties();

			// Create a document by parsing a XML file
			DocumentBuilderFactory builderFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder builder = builderFactory.newDocumentBuilder();
			Document document = builder.parse(new File(Constants.TESTNGFILE_PATH));

			XPath xPath = XPathFactory.newInstance().newXPath();

			// single Node
			Node suiteNode = (Node) xPath.evaluate(Constants.SUITEFILE_NODE, document, XPathConstants.NODE);

			NodeList suiteFileNodes = (NodeList) xPath.evaluate(Constants.SUITEFILE_NODE, document,
					XPathConstants.NODESET);

			NodeList suiteNameFileNodes = (NodeList) xPath.evaluate(Constants.XPATHEXPRESSION_NODE, document,
					XPathConstants.NODESET);

			// List of all Suiet File Nodes

			// System.setProperty("SuiteName", "Potter-Login,Potter-Client");
			if (appConfigForListener.getProperty("suiteName").equalsIgnoreCase(Constants.SUITE_VALUE_FROM_JENKINS)) {

				String[] suites = System.getProperty("SuiteName").split(",");

				List<String> suiteListsFromArray = Arrays.asList(suites);

				// testng suites if nothing sent from jenkins
				boolean emptyListFromJenkins = true;

				for (String s : suiteListsFromArray) {
					if (s == "") {
						emptyListFromJenkins = false;
						break;
					}
				}

				if (emptyListFromJenkins) {

					if (suiteNameFileNodes.getLength() > 0) {

						for (int k = 0; k < suiteNameFileNodes.getLength(); k++) {

							suiteList.add(suiteNameFileNodes.item(k).getAttributes()
									.getNamedItem(Constants.SUITEATTRIBUTE_PATH).getNodeValue());

						}
					} else
						logger.info("Invalid testng");

				}

				// jenkin suites in testng
				else {
					for (String s : suiteListsFromArray) {
						suiteList.add(("aCIS_").concat(s).concat("_testng.xml"));
						System.out.println("size" + suiteList.size());

					}

					// remove already avaialble tags
					if (suiteNode.hasChildNodes()) {

						while (suiteNode.hasChildNodes()) {
							suiteNode.removeChild(suiteNode.getFirstChild());

						}

					}

					// create new tags
					for (int i = 0; i < suiteList.size(); i++) {

						Element child = (Element) document.createElement(Constants.SUITE_NODE);

						child.setAttribute("path", suiteList.get(i));
						suiteNode.appendChild(child);

					}
				}

			} else {
				suiteList.add(("aCIS_").concat(appConfigForListener.getProperty("suiteName").concat("_testng.xml")));
			}

			Transformer transformer = TransformerFactory.newInstance().newTransformer();
			Result output = new StreamResult(new File(Constants.TESTNGFILE_PATH));

			logger.info("Suite List" + suiteList);
			Source input = new DOMSource(document);
			transformer.transform(input, output);
			Thread.sleep(3000);
		} catch (Exception e) {
			logger.info(Constants.EXCEPTION_MESSAGE + e.getMessage());
		}
	}

}