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

WebUI.setText(findTestObject('Object Repository/Page_JIN Login/input_JIN_email'), 'roof@tahutex.online')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_JIN Login/input_Email_password'), 'U8NeUUalMC6sqe9eTsnb2g==')

WebUI.click(findTestObject('Object Repository/Page_JIN Login/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/span_Employer2'))

WebUI.click(findTestObject('Object Repository/Page_Dashboard/a_Profile'))

WebUI.click(findTestObject('Object Repository/Page_Employee Profile/i_create'))

WebUI.click(findTestObject('Object Repository/Page_Basic Info/a_Academic Info'))

WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input__qualification'), 'UG')

WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input__degree'), 'BE')

WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input__specialization'), 'ECE')

WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input__nameOfTheInstitution'), 'IIT')

WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input__university'), 'Madras')

WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input__text-center ng-valid ng-valid-maxlength ng-touched ng-not-empty ng-dirty ng-valid-parse'), 
    '2015')

WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input__text-center ng-valid ng-valid-maxlength ng-touched ng-not-empty ng-dirty ng-valid-number'), 
    '99')

WebUI.click(findTestObject('Object Repository/Page_Basic Info/i_add'))

WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input_remove_qualification'), 'PG')

WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input_remove_degree'), 'ME')

WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input_remove_specialization'), 'MECE')

WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input_remove_nameOfTheInstitution'), 'IIT')

WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input_remove_university'), 'Sathya')

WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input_remove_text-center ng-valid ng-valid-maxlength ng-touched ng-not-empty ng-dirty ng-valid-parse'), 
    '2019')

WebUI.setText(findTestObject('Object Repository/Page_Basic Info/input_remove_text-center ng-valid ng-valid-maxlength ng-touched ng-not-empty ng-dirty ng-valid-number'), 
    '98')

WebUI.click(findTestObject('Object Repository/Page_Basic Info/button_Update'))

