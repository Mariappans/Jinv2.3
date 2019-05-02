import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

WebUI.openBrowser('')

WebUI.navigateToUrl('https://staging.myconsole.co.uk/#/controlPanel/newUser')

WebUI.setText(findTestObject('Object Repository/myconsole/Project/Page_myConsole/Page_myConsole/input_My Account_username'), 
    'adminsbc')

WebUI.setEncryptedText(findTestObject('Object Repository/myconsole/Project/Page_myConsole/Page_myConsole/input_My Account_upw'), 
    '3Xg/pkzzd/GwTrXnAjMMhm5eBpluP3j8')

WebUI.click(findTestObject('Object Repository/myconsole/Project/Page_myConsole/Page_myConsole/span_Login to myConsole'))

WebUI.click(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/span_Toggle navigation_fa fa-home (1)'))

WebUI.click(findTestObject('myconsole/Project/Page_myConsole/span_Pipeline'))

WebUI.delay(5)

WebUI.click(findTestObject('myconsole/Project/Page_myConsole/a_NEW'))

WebUI.delay(5)

WebUI.setText(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/input_Project Name_opportunity_name'), 'Maari' + 
    new Random().nextInt(1000))

WebUI.setText(findTestObject('Object Repository/myconsole/Project/Page_myConsole/Page_myConsole/input_Project Alias_opportunity_alias'), 
    'test')

WebUI.delay(2)

//WebUI.selectOptionByValue(findTestObject('myconsole/client/select_-- Please select --branchthreebranchonebranchfourParent Org'),
//	'1', true)
WebUI.selectOptionByValue(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/select_type proj'), '1', true)

WebUI.selectOptionByValue(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/select_ branch proj'), '2', true)

WebUI.selectOptionByValue(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/select_bu unit proj'), '1', true)

WebUI.selectOptionByValue(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/select_sector'), '4', true)

WebUI.click(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/button_ client proj Add'))

WebUI.delay(2)

WebUI.setText(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/input_proj_new client'), 'Maariiia' + 
    new Random().nextInt(1000))

a = WebUI.getNumberOfTotalOption(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/project_client-type'))

Random rad = new Random()

rad.nextInt(a)

int count = rad.nextInt(a)

WebUI.selectOptionByIndex(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/project_client-type'), 
    count)

WebUI.selectOptionByValue(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/project_client-type'), 
    '1', true)

//b = WebUI.getNumberOfTotalOption(findTestObject('myconsole/client/newclient_branch'))
//Random radb = new Random()
//radb.nextInt(b)
//int count1 = radb.nextInt(b)
//WebUI.selectOptionByIndex(findTestObject('myconsole/client/newclient_branch'), count1)
c = WebUI.getNumberOfTotalOption(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/project_client_sector'))

Random radc = new Random()

radc.nextInt(c)

int count2 = radc.nextInt(c)

WebUI.selectOptionByIndex(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/project_client_sector'), 
    count2)

d = WebUI.getNumberOfTotalOption(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/proj_client classification'))

Random radd = new Random()

radd.nextInt(d)

int count3 = radd.nextInt(d)

WebUI.selectOptionByIndex(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/proj_client classification'), 
    count3)

WebUI.delay(5)

f = WebUI.getNumberOfTotalOption(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/proj_bu-dev'))

Random radf = new Random()

radf.nextInt(f)

int count5 = radf.nextInt(f)

WebUI.selectOptionByIndex(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/proj_bu-dev'), 
    count5)

WebUI.delay(2)

h = WebUI.getNumberOfTotalOption(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/proj_relation-owner'))

Random radh = new Random()

radh.nextInt(h)

int count6 = radh.nextInt(h)

WebUI.selectOptionByIndex(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/proj_relation-owner'), 
    count6)

WebUI.delay(3)

g = WebUI.getNumberOfTotalOption(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/proj_main board'))

Random radg = new Random()

radg.nextInt(g)

int count7 = radg.nextInt(g)
//KeywordLogger log = new KeywordLogger()
//log.logInfo(count7)
//println()
WebUI.selectOptionByIndex(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/proj_main board'), 
    count7)

WebUI.delay(2)

WebUI.setText(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/proj_target income'), '10000' + 
    new Random().nextInt(1000))

WebUI.delay(1)

WebUI.setText(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/proj_nxt review'), '19-02-2018')

WebUI.delay(3)

WebUI.click(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/proj_client_create_button'))

WebUI.delay(5)

WebUI.setText(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/proj_estimate contract value'), 
    '21000')

WebUI.selectOptionByValue(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/proj_bid leader'), 
    'Restricted UserOne', true)

WebUI.setText(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/proj_Estimated Tender Due Date'), 
    '29-03-2019')

WebUI.setText(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/proj_Estimated Target Gateway Approval Date'), 
    '08-09-2019')

WebUI.delay(2)

WebUI.click(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/proj_button_Create'))

WebUI.delay(5)

WebUI.click(findTestObject('myconsole/Project/Page_myConsole/Page_myConsole/Page_myConsole/proj_button_'))