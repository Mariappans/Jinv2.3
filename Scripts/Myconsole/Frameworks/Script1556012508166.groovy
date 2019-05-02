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

WebUI.setText(findTestObject('Object Repository/myconsole/Frameworks/Page_myConsole/Page_myConsole/input_My Account_username'), 
    'adminsbc')

WebUI.setEncryptedText(findTestObject('Object Repository/myconsole/Frameworks/Page_myConsole/Page_myConsole/input_My Account_upw'), 
    '3Xg/pkzzd/GwTrXnAjMMhm5eBpluP3j8')

WebUI.click(findTestObject('Object Repository/myconsole/Frameworks/Page_myConsole/Page_myConsole/span_Login to myConsole'))

WebUI.click(findTestObject('Object Repository/myconsole/Frameworks/Page_myConsole/Page_myConsole/span_Toggle navigation_fa fa-home'))

WebUI.click(findTestObject('Object Repository/myconsole/Frameworks/Page_myConsole/Page_myConsole/span_Frameworks'))

WebUI.delay(5)

WebUI.click(findTestObject('myconsole/Frameworks/Page_myConsole/Page_myConsole/Framework_span_NEW'))

WebUI.delay(5)

WebUI.selectOptionByValue(findTestObject('myconsole/Frameworks/Page_myConsole/Page_myConsole/Framework_Region'), '0', true)

WebUI.selectOptionByValue(findTestObject('myconsole/Frameworks/Page_myConsole/Page_myConsole/Framework_Framework'), '0', 
    true)

WebUI.setText(findTestObject('myconsole/Frameworks/Page_myConsole/Page_myConsole/Framework_version label'), 'Test FM1')

WebUI.click(findTestObject('myconsole/Frameworks/Page_myConsole/Page_myConsole/input_Framework Size_radio_group1'))

WebUI.selectOptionByValue(findTestObject('myconsole/Frameworks/Page_myConsole/Page_myConsole/Framework_Classification'), 
    '0', true)

WebUI.selectOptionByValue(findTestObject('myconsole/Frameworks/Page_myConsole/Page_myConsole/Framework_Bu Developer'), 'BUserOne', 
    true)

WebUI.selectOptionByValue(findTestObject('myconsole/Frameworks/Page_myConsole/Page_myConsole/Framework_Relation'), 'BUser One', 
    true)

WebUI.selectOptionByValue(findTestObject('myconsole/Frameworks/Page_myConsole/Page_myConsole/Framework_Mainboard'), 'BUser Two', 
    true)

WebUI.setText(findTestObject('myconsole/Frameworks/Page_myConsole/Page_myConsole/Framework_total framework value'), '10000')

WebUI.setText(findTestObject('myconsole/Frameworks/Page_myConsole/Page_myConsole/Framework_maximum income'), '50000')

WebUI.setText(findTestObject('myconsole/Frameworks/Page_myConsole/Page_myConsole/Framework_Nxt review'), '22-04-2019')

WebUI.click(findTestObject('Object Repository/myconsole/Frameworks/Page_myConsole/Page_myConsole/button_Create'))

WebUI.click(findTestObject('Object Repository/myconsole/Frameworks/Page_myConsole/Page_myConsole/button_'))

WebUI.closeBrowser()

