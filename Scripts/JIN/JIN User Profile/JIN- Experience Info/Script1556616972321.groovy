import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.0.28:5051/')

WebUI.click(findTestObject('Object Repository/JIN User Profile/JIN-Employee Experience/Page_JIN Login/label_Email'))

WebUI.setText(findTestObject('Object Repository/JIN User Profile/JIN-Employee Experience/Page_JIN Login/input_JIN_email'), 
    'roof@tahutex.online')

WebUI.click(findTestObject('Object Repository/JIN User Profile/JIN-Employee Experience/Page_JIN Login/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/JIN User Profile/JIN-Employee Experience/Page_JIN Login/input_Email_password'), 
    'U8NeUUalMC6sqe9eTsnb2g==')

WebUI.click(findTestObject('Object Repository/JIN User Profile/JIN-Employee Experience/Page_JIN Login/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/JIN User Profile/JIN-Employee Experience/Page_Dashboard/span_Employer2'))

WebUI.click(findTestObject('Object Repository/JIN User Profile/JIN-Employee Experience/Page_Dashboard/a_Profile'))

WebUI.click(findTestObject('Object Repository/JIN User Profile/JIN-Employee Experience/Page_Employee Profile/i_create'))

WebUI.click(findTestObject('Object Repository/JIN User Profile/JIN-Employee Experience/Page_Basic Info/a_Experience Info'))

WebUI.setText(findTestObject('Object Repository/JIN User Profile/JIN-Employee Experience/Page_Basic Info/input__companyName'), 
    'Company 1')

WebUI.setText(findTestObject('Object Repository/JIN User Profile/JIN-Employee Experience/Page_Basic Info/input__designation'), 
    'Designation 1')

WebUI.setText(findTestObject('Object Repository/JIN User Profile/JIN-Employee Experience/Page_Basic Info/input__startDate'), 
    '2015-04-01')

WebUI.setText(findTestObject('Object Repository/JIN User Profile/JIN-Employee Experience/Page_Basic Info/input__endDate'), 
    '2018-03-01')

WebUI.click(findTestObject('Object Repository/JIN User Profile/JIN-Employee Experience/Page_Basic Info/i_add'))

WebUI.setText(findTestObject('Object Repository/JIN User Profile/JIN-Employee Experience/Page_Basic Info/input_remove_companyName'), 
    'Company 2')

WebUI.setText(findTestObject('Object Repository/JIN User Profile/JIN-Employee Experience/Page_Basic Info/input_remove_designation'), 
    'Designation 2')

WebUI.setText(findTestObject('Object Repository/JIN User Profile/JIN-Employee Experience/Page_Basic Info/input_remove_startDate'), 
    '2018-03-02')

WebUI.setText(findTestObject('Object Repository/JIN User Profile/JIN-Employee Experience/Page_Basic Info/input_remove_endDate'), 
    '2018-10-01')

WebUI.click(findTestObject('JIN User Profile/JIN-Employee Experience/Page_Basic Info/Experience_info-Update button'))

