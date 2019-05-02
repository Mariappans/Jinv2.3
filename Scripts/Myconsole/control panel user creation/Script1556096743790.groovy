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

WebUI.navigateToUrl('https://staging.myconsole.co.uk/#/controlPanel/newUser')

WebUI.setText(findTestObject('Object Repository/Page_myConsole/input_My Account_username'), 'adminsbc')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_myConsole/input_My Account_upw'), '3Xg/pkzzd/GwTrXnAjMMhm5eBpluP3j8')

WebUI.click(findTestObject('Object Repository/Page_myConsole/span_Login to myConsole'))

WebUI.click(findTestObject('Object Repository/Page_myConsole/span_Toggle navigation_fa fa-home'))

WebUI.click(findTestObject('Object Repository/Page_myConsole/span_Control Panel'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_myConsole/span_Users'))

WebUI.delay(15)

WebUI.click(findTestObject('Page_myConsole/Page_myConsole/h4_Users'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/Page_myConsole/span_NEW'))

WebUI.delay(5)

WebUI.setText(findTestObject('myconsole/user creation/Page_myConsole/Page_myConsole/User_Firstname'), 'Jhon victor')

WebUI.setText(findTestObject('Object Repository/Page_myConsole/input_Surname_surname'), 'Raj')

WebUI.setText(findTestObject('Object Repository/Page_myConsole/input_Phone number_phone_number'), '888-555-7777')

WebUI.setText(findTestObject('Object Repository/Page_myConsole/input_Mobile number_mobile_number'), '555-789-7774')

WebUI.setText(findTestObject('Object Repository/Page_myConsole/input_Email_email'), 'testemail@test.com')

WebUI.setText(findTestObject('Object Repository/Page_myConsole/input_Username_username'), 'John')

WebUI.setText(findTestObject('Object Repository/Page_myConsole/input_Hourly Rate ()_hourlyrate'), '100')

WebUI.selectOptionByValue(findTestObject('myconsole/user creation/Page_myConsole/Page_myConsole/User_Branch'), '5a4f6a5603f4bde5796d9c5d', 
    true)

WebUI.selectOptionByValue(findTestObject('myconsole/user creation/Page_myConsole/Page_myConsole/User_Responsibility'), 'Estimating Director', 
    true)

WebUI.selectOptionByValue(findTestObject('myconsole/user creation/Page_myConsole/Page_myConsole/User_BusinessUnit'), '0', 
    true)

WebUI.selectOptionByValue(findTestObject('myconsole/user creation/Page_myConsole/Page_myConsole/User_Status'), 'inactive', 
    true)

WebUI.click(findTestObject('Object Repository/Page_myConsole/label_Yes'))

WebUI.click(findTestObject('Object Repository/Page_myConsole/label_No'))

WebUI.click(findTestObject('Object Repository/Page_myConsole/button_Create User'))

WebUI.click(findTestObject('Object Repository/Page_myConsole/div_User Created Successfully'))

