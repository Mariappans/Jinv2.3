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

WebUI.setText(findTestObject('Object Repository/JIN Employee Edit/Page_JIN Login/input_JIN_email'), 'muralikrishnansubramanian@jmangroup.com')

WebUI.click(findTestObject('Object Repository/JIN Employee Edit/Page_JIN Login/label_Password'))

WebUI.setEncryptedText(findTestObject('Object Repository/JIN Employee Edit/Page_JIN Login/input_Email_password'), 'U8NeUUalMC6sqe9eTsnb2g==')

WebUI.click(findTestObject('Object Repository/JIN Employee Edit/Page_JIN Login/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/JIN Employee Edit/Page_Dashboard/i_menu'))

WebUI.click(findTestObject('Object Repository/JIN Employee Edit/Page_Dashboard/div_people Employees'))

WebUI.click(findTestObject('Object Repository/JIN Employee Edit/Page_Employees/label_Search Name Grade DesignationJob Title'))

WebUI.setText(findTestObject('Object Repository/JIN Employee Edit/Page_Employees/input_search_search'), 'first')

WebUI.click(findTestObject('Object Repository/JIN Employee Edit/Page_Employees/p_First Test Employee'))

WebUI.click(findTestObject('Object Repository/JIN Employee Edit/Page_Employees/i_create'))

WebUI.click(findTestObject('Object Repository/JIN Employee Edit/Page_Employees/span_Single'))

WebUI.click(findTestObject('Object Repository/JIN Employee Edit/Page_Employees/a_Married                                    done'))

WebUI.click(findTestObject('Object Repository/JIN Employee Edit/Page_Employees/button_3                                select'))

WebUI.click(findTestObject('Object Repository/JIN Employee Edit/Page_Employees/a_1                                done'))

WebUI.click(findTestObject('Object Repository/JIN Employee Edit/Page_Employees/button_QA Enabler                                select'))

WebUI.click(findTestObject('Object Repository/JIN Employee Edit/Page_Employees/a_QA Engineer                                done'))

WebUI.click(findTestObject('Object Repository/JIN Employee Edit/Page_Employees/a_Save'))

