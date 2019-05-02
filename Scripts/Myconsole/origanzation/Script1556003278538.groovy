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

WebUI.click(findTestObject('Object Repository/Page_myConsole/span_Organisations'))

WebUI.delay(5)

WebUI.click(findTestObject('myconsole/Organisation/Page_myConsole/Page_myConsole/a_NEW'))

WebUI.delay(7)

WebUI.setText(findTestObject('myconsole/Organisation/Page_myConsole/Page_myConsole/input_Organisation Name'), 'Maariiia' + 
    new Random().nextInt(1000))

WebUI.selectOptionByValue(findTestObject('myconsole/Organisation/Page_myConsole/Page_myConsole/org_branch'), '1', true)

a = WebUI.getNumberOfTotalOption(findTestObject('myconsole/Organisation/Page_myConsole/Page_myConsole/org_Primary sector'))

Random rad = new Random()

rad.nextInt(a)

int count = rad.nextInt(a)

WebUI.selectOptionByIndex(findTestObject('myconsole/Organisation/Page_myConsole/Page_myConsole/org_Primary sector'), count)

b = WebUI.getNumberOfTotalOption(findTestObject('myconsole/Organisation/Page_myConsole/Page_myConsole/org_Status'))

Random rad1 = new Random()

rad1.nextInt(b)

int count1 = rad.nextInt(b)

WebUI.selectOptionByIndex(findTestObject('myconsole/Organisation/Page_myConsole/Page_myConsole/org_Status'), count1)

c = WebUI.getNumberOfTotalOption(findTestObject('myconsole/Organisation/Page_myConsole/Page_myConsole/org_classification'))

Random rad2 = new Random()

rad2.nextInt(c)

int count2 = rad2.nextInt(c)

WebUI.selectOptionByIndex(findTestObject('myconsole/Organisation/Page_myConsole/Page_myConsole/org_classification'), count2)

d = WebUI.getNumberOfTotalOption(findTestObject('myconsole/Organisation/Page_myConsole/Page_myConsole/org_Relation'))

Random rad3 = new Random()

rad3.nextInt(d)

int count3 = rad3.nextInt(d)

WebUI.selectOptionByIndex(findTestObject('myconsole/Organisation/Page_myConsole/Page_myConsole/org_Relation'), count3)

WebUI.click(findTestObject('Object Repository/Page_myConsole/button_Create'))

WebUI.click(findTestObject('Object Repository/Page_myConsole/div_Organisation Created Successfully'))

WebUI.click(findTestObject('Object Repository/Page_myConsole/button_'))

WebUI.closeBrowser()

