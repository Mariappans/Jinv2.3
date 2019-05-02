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

WebUI.setText(findTestObject('Object Repository/JIN 2.3/Page_JIN Login/input_JIN_email'), 'roof@tahutex.online')

WebUI.setEncryptedText(findTestObject('Object Repository/JIN 2.3/Page_JIN Login/input_Email_password'), 'U8NeUUalMC6sqe9eTsnb2g==')

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_JIN Login/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/JIN User Profile/Jin Basic ifo/Page_Dashboard/span_Employer2'))

WebUI.click(findTestObject('Object Repository/JIN User Profile/Jin Basic ifo/Page_Dashboard/a_Profile'))

WebUI.click(findTestObject('Object Repository/JIN User Profile/Jin Basic ifo/Page_Employee Profile/i_create'))

not_run: WebUI.click(findTestObject('Object Repository/JIN User Profile/Jin Basic ifo/Page_Basic Info/label_Date of Birth'))

not_run: WebUI.setText(findTestObject('Object Repository/JIN User Profile/Jin Basic ifo/Page_Basic Info/input_Bank Account Info_dob'), 
    '1998-01-01')

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Jin Basic ifo/Page_Basic Info/textarea__addr1'), '123, testing')

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Jin Basic ifo/Page_Basic Info/textarea__addr2'), 'test2')

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Jin Basic ifo/Page_Basic Info/input_Address line 2_city'), 
    'city')

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Jin Basic ifo/Page_Basic Info/input__state'), 'state')

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Jin Basic ifo/Page_Basic Info/input__pin'), '643443')

WebUI.click(findTestObject('Object Repository/JIN User Profile/Jin Basic ifo/Page_Basic Info/label_Base Location'))

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Jin Basic ifo/Page_Basic Info/input__baseLocation'), 'chennai')

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Jin Basic ifo/Page_Basic Info/input_Base Location_currentLocation'), 
    'chennai1')

WebUI.click(findTestObject('Object Repository/JIN User Profile/Jin Basic ifo/Page_Basic Info/label_Emergency Contact Number'))

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Jin Basic ifo/Page_Basic Info/input_Current Location_emergencyContact'), 
    '8574985405')

WebUI.click(findTestObject('Object Repository/JIN User Profile/Jin Basic ifo/Page_Basic Info/label_Emergency Contact Name'))

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Jin Basic ifo/Page_Basic Info/input__emergencyContactName'), 
    'test sample')

WebUI.delay(5)

WebUI.click(findTestObject('JIN User Profile/Page_Basic Info/input_basic info_relationship'))

WebUI.click(findTestObject('JIN User Profile/Jin Basic ifo/Page_Basic Info/span_Father'))

WebUI.click(findTestObject('Object Repository/JIN User Profile/Jin Basic ifo/Page_Basic Info/button_Update'))

