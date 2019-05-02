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

WebUI.setText(findTestObject('myconsole/client/input_My Account_username'), 'adminsbc')

WebUI.setEncryptedText(findTestObject('myconsole/client/input_My Account_upw'), '3Xg/pkzzd/GwTrXnAjMMhm5eBpluP3j8')

WebUI.click(findTestObject('myconsole/client/span_Login to myConsole'))

WebUI.verifyElementPresent(findTestObject('myconsole/homepage_dashboard'), 0)

WebUI.click(findTestObject('myconsole/client/homepage_icon'))

WebUI.click(findTestObject('myconsole/client/homepage_Client icon'))

WebUI.verifyElementPresent(findTestObject('myconsole/client/Clentpage_header'), 0)

WebUI.click(findTestObject('myconsole/client/Clientpage_new'))

WebUI.verifyElementPresent(findTestObject('myconsole/client/Newclient_header'), 0)

WebUI.delay(7)

//for (int i = 1; i <= findTestData('Client_clientname').getRowNumbers(); i++) {
WebUI.setText(findTestObject('myconsole/client/Page_myConsole/input_Client Name_client_name'), 'Maariiia' + new Random().nextInt(
        1000))

a = WebUI.getNumberOfTotalOption(findTestObject('myconsole/client/newclient_client-type'))

Random rad = new Random()

rad.nextInt(a)

int count = rad.nextInt(a)

WebUI.selectOptionByIndex(findTestObject('myconsole/client/newclient_client-type'), count)

WebUI.selectOptionByValue(findTestObject('myconsole/client/select_-- Please select --branchthreebranchonebranchfourParent Org'), 
    '1', true)

//b = WebUI.getNumberOfTotalOption(findTestObject('myconsole/client/newclient_branch'))
//Random radb = new Random()
//radb.nextInt(b)
//int count1 = radb.nextInt(b)
//WebUI.selectOptionByIndex(findTestObject('myconsole/client/newclient_branch'), count1)
c = WebUI.getNumberOfTotalOption(findTestObject('myconsole/client/newclient_primarysector'))

Random radc = new Random()

radc.nextInt(c)

int count2 = radc.nextInt(c)

WebUI.selectOptionByIndex(findTestObject('myconsole/client/newclient_primarysector'), count2)

d = WebUI.getNumberOfTotalOption(findTestObject('myconsole/client/newclient_client classification'))

Random radd = new Random()

radd.nextInt(d)

int count3 = radd.nextInt(d)

WebUI.selectOptionByIndex(findTestObject('myconsole/client/newclient_client classification'), count3)

e = WebUI.getNumberOfTotalOption(findTestObject('myconsole/client/newclient_client ststus'))

Random rade = new Random()

rade.nextInt(e)

int count4 = rade.nextInt(e)

WebUI.selectOptionByIndex(findTestObject('myconsole/client/newclient_client ststus'), count4)

WebUI.delay(5)

f = WebUI.getNumberOfTotalOption(findTestObject('myconsole/client/newclient_business developer'))

Random radf = new Random()

radf.nextInt(f)

int count5 = radf.nextInt(f)

WebUI.selectOptionByIndex(findTestObject('myconsole/client/newclient_business developer'), count5)

WebUI.delay(2)

h = WebUI.getNumberOfTotalOption(findTestObject('myconsole/client/newclient_relationship owner'))

Random radh = new Random()

radh.nextInt(h)

int count6 = radh.nextInt(h)

WebUI.selectOptionByIndex(findTestObject('myconsole/client/newclient_relationship owner'), count6)

WebUI.delay(3)

g = WebUI.getNumberOfTotalOption(findTestObject('myconsole/client/newclient_main board sponsor'))

Random radg = new Random()

radg.nextInt(g)

int count7 = radg.nextInt(g)

WebUI.selectOptionByIndex(findTestObject('myconsole/client/newclient_main board sponsor'), count7)

WebUI.delay(2)

WebUI.setText(findTestObject('myconsole/client/newclient_totalincome'), '10000' + new Random().nextInt(1000))

WebUI.delay(1)

WebUI.setText(findTestObject('myconsole/client/input_Next Review_next_review'), '19-02-2018')

WebUI.delay(3)

WebUI.click(findTestObject('myconsole/client/button_Create'))

WebUI.click(findTestObject('myconsole/client/div_Client Info saved'))

WebUI.delay(2)

WebUI.click(findTestObject('myconsole/client/button_'))

WebUI.delay(2)

//} 
WebUI.click(findTestObject('myconsole/client/a_admin SBCustom'))

WebUI.click(findTestObject('myconsole/client/a_Sign Out'))

