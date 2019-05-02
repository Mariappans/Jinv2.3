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

WebUI.setText(findTestObject('Object Repository/JIN 2.3/Page_JIN Login/input_JIN_email'), 'muralikrishnansubramanian@jmangroup.com')

WebUI.setEncryptedText(findTestObject('Object Repository/JIN 2.3/Page_JIN Login/input_Email_password'), 'U8NeUUalMC6sqe9eTsnb2g==')

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_JIN Login/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_Dashboard/i_menu'))

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_Dashboard/div_people Employees'))

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_Employees/i_add'))

WebUI.delay(5)

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_Employees/label_First Name'))

WebUI.setText(findTestObject('Object Repository/JIN 2.3/Page_Employees/input_close_first_name'), 'Employer2')

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_Employees/label_Last Name'))

WebUI.setText(findTestObject('Object Repository/JIN 2.3/Page_Employees/input__last_name'), 'Testing4')

WebUI.setText(findTestObject('Object Repository/JIN 2.3/Page_Employees/input__email'), 'roof@tahutex.online')

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_Employees/label_Contact Number'))

WebUI.setText(findTestObject('Object Repository/JIN 2.3/Page_Employees/input__mobileNumber'), '9940012345')

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_Employees/label_Date of Joining'))

WebUI.setText(findTestObject('Object Repository/JIN 2.3/Page_Employees/input__doj'), '2001-04-20')

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_Employees/label_Male'))

WebUI.click(findTestObject('JIN 2.3/Page_Employees/span_select-marital'))

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_Employees/a_Single                                        done'))

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_Employees/label_Yes'))

WebUI.delay(5)

WebUI.click(findTestObject('JIN 2.3/Page_Employees/span_select-reporting to'))

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_Employees/a_MaryS                                done'))

WebUI.click(findTestObject('JIN 2.3/Page_Employees/span_select-status'))

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_Employees/a_Training                                  done'))

WebUI.click(findTestObject('JIN 2.3/Page_Employees/span_select-designation'))

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_Employees/a_QA Enabler                                done'))

WebUI.click(findTestObject('JIN 2.3/Page_Employees/span_select-grade'))

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_Employees/a_1                                done'))

WebUI.click(findTestObject('JIN 2.3/Page_Employees/span_select-department'))

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_Employees/a_Quality                                done'))

WebUI.click(findTestObject('JIN 2.3/Page_Employees/span_select-role'))

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_Employees/a_User                            done'))

WebUI.click(findTestObject('JIN 2.3/Page_Employees/span_select-team'))

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_Employees/a_Mumbai-Devero                                done'))

WebUI.click(findTestObject('Object Repository/JIN 2.3/Page_Employees/a_Create'))

