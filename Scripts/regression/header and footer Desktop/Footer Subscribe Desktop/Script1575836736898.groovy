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

//Subscribe with invalid email address

WebUI.setText(findTestObject('Footer elements/subscribe/input_Newsletter_email'), 'Testtest.com')

WebUI.click(findTestObject('Footer elements/subscribe/button_Ok'))

WebUI.verifyElementVisible(findTestObject('Footer elements/subscribe/p_Newsletter  Invalid email address.'))
//Subscribe with existing email address

WebUI.setText(findTestObject('Footer elements/subscribe/input_Newsletter_email'), 'Test@Test.com')

WebUI.click(findTestObject('Footer elements/subscribe/button_Ok'))

WebUI.verifyElementVisible(findTestObject('Footer elements/subscribe/p_Newsletter  This email address is already registered.'))

//Subscribe with new email address

WebUI.setText(findTestObject('Footer elements/subscribe/input_Newsletter_email'), 'Blagoja@blagoja1.com')

WebUI.click(findTestObject('Footer elements/subscribe/button_Ok'))

WebUI.verifyElementVisible(findTestObject('Footer elements/subscribe/p_Newsletter  You have successfully subscribed to this newsletter.'))

WebUI.closeBrowser()