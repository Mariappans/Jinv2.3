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

WebUI.setText(findTestObject('Object Repository/JIN 2.3/JIN Bank Account Details/Page_JIN Login/input_JIN_email'), 'roof@tahutex.online')

WebUI.click(findTestObject('Object Repository/JIN 2.3/JIN Bank Account Details/Page_JIN Login/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/JIN 2.3/JIN Bank Account Details/Page_JIN Login/input_Email_password'), 
    'U8NeUUalMC6sqe9eTsnb2g==')

WebUI.click(findTestObject('Object Repository/JIN 2.3/JIN Bank Account Details/Page_JIN Login/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/JIN 2.3/JIN Bank Account Details/Page_Dashboard/span_Employer2'))

WebUI.click(findTestObject('Object Repository/JIN 2.3/JIN Bank Account Details/Page_Dashboard/a_Profile'))

WebUI.click(findTestObject('Object Repository/JIN 2.3/JIN Bank Account Details/Page_Employee Profile/i_create'))

WebUI.click(findTestObject('Object Repository/JIN 2.3/JIN Bank Account Details/Page_Basic Info/a_Bank Account Info'))

WebUI.click(findTestObject('Object Repository/JIN 2.3/JIN Bank Account Details/Page_Basic Info/label_Name Of The Bank'))

WebUI.setText(findTestObject('Object Repository/JIN 2.3/JIN Bank Account Details/Page_Basic Info/input_Update_nameOfBank'), 
    'Axis bank')

WebUI.click(findTestObject('Object Repository/JIN 2.3/JIN Bank Account Details/Page_Basic Info/label_Name As Per The Bank Branch'))

WebUI.setText(findTestObject('Object Repository/JIN 2.3/JIN Bank Account Details/Page_Basic Info/input__name'), 'Name First')

WebUI.click(findTestObject('Object Repository/JIN 2.3/JIN Bank Account Details/Page_Basic Info/span_'))

WebUI.setText(findTestObject('Object Repository/JIN 2.3/JIN Bank Account Details/Page_Basic Info/input__accountNo'), '010122003')

WebUI.click(findTestObject('JIN 2.3/JIN Bank Account Details/Page_Basic Info/Bank Details button_Update'))

