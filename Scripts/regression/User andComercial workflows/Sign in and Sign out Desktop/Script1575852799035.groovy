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

WebUI.navigateToUrl('http://automationpractice.com/index.php')

//Click to go to form

WebUI.click(findTestObject('Page_My Store/a_Sign in'))

//add valid credentials 

WebUI.setText(findTestObject('SignInSignOut/Page_Login - My Store/input_Email address_email'), 
    'blagoja11@gmail.com')

WebUI.setEncryptedText(findTestObject('SignInSignOut/Page_Login - My Store/input_Password_passwd'), 
    'gfzG1VEcrbZGbK4KTMQXQw==')

// Sign in

WebUI.click(findTestObject('SignInSignOut/Page_Login - My Store/span_Sign in'))

//verify message 
WebUI.verifyElementVisible(findTestObject('SignInSignOut/Page_Login - My Store/p_Welcome to your account. Here you can manage all of your personal information and orders.'))
//sign out 
WebUI.click(findTestObject('SignInSignOut/Page_Login - My Store/a_Sign out'))
WebUI.delay(3)
WebUI.verifyTextNotPresent('Blagoja AOPEgkj', false)

WebUI.closeBrowser()



