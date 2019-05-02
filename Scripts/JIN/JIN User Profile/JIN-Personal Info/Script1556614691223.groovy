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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://192.168.0.28:5051/')

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_JIN Login/input_JIN_email'), 'roof@tahutex.online')

WebUI.setEncryptedText(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_JIN Login/input_Email_password'), 
    'U8NeUUalMC6sqe9eTsnb2g==')

WebUI.click(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_JIN Login/button_LOGIN'))

WebUI.click(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_Dashboard/span_Employer2'))

WebUI.click(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_Dashboard/a_Profile'))

WebUI.click(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_Employee Profile/i_create'))

WebUI.click(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_Basic Info/a_Personal Info'))

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_Basic Info/input_Update_fatherName'), 
    'Test1')

WebUI.click(findTestObject('JIN User Profile/Personal Info/Page_Basic Info/Personal info_Blood Group'))

WebUI.click(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_Basic Info/span_O'))

WebUI.click(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_Basic Info/label_Driving Licence No'))

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_Basic Info/input_Blood Group_drivingLicenceNo'), 
    '12344345')

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_Basic Info/input_Driving Licence No_passportNo'), 
    '85439584')

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_Basic Info/textarea_Passport No_about'), 
    'Testsample content')

not_run: WebUI.setText(findTestObject('JIN User Profile/Personal Info/Page_Basic Info/input_What Describes You Better_47389f02-4568-158c-0d10-2fdfc3870331_spyweb'), 
    'Test')

not_run: WebUI.sendKeys(findTestObject('JIN User Profile/Personal Info/Page_Basic Info/input_What Describes You Better_f8621c93-b3b0-1f9d-261c-13f7c1df80ca'), 
    Keys.chord(Keys.ENTER))

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_Basic Info/textarea_DreamsWishes_dream'), 
    'Testsample content2')

not_run: WebUI.click(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_Basic Info/label_Yes'))

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_Basic Info/input__countryName'), 'Test1')

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_Basic Info/input__type'), 'Visa')

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_Basic Info/input__startDate'), '2019-04-17')

WebUI.setText(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_Basic Info/input__expiryDate'), '2019-04-29')

WebUI.click(findTestObject('Object Repository/JIN User Profile/Personal Info/Page_Basic Info/button_Update'))

WebUI.closeBrowser()

