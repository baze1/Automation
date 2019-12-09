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

//Check if the navigation menu exist and is clickable 
WebUI.verifyElementClickable(findTestObject('navigation menu/a_Women'))
WebUI.verifyElementClickable(findTestObject('navigation menu/a_T-shirts'))
WebUI.verifyElementClickable(findTestObject('navigation menu/a_Dresses'))

//Check if the main navigation elements have good Title and URL 
WebUI.click(findTestObject('navigation menu/a_Women'))
assert WebUI.getWindowTitle() == 'Women - My Store'

CurrentUrl= WebUI.getUrl()
WebUI.verifyMatch(CurrentUrl,'http://automationpractice.com/index.php?id_category=3&controller=category', false)

WebUI.click(findTestObject('navigation menu/a_T-shirts'))
assert WebUI.getWindowTitle() == 'T-shirts - My Store'

CurrentUrl1= WebUI.getUrl()
WebUI.verifyMatch(CurrentUrl1,'http://automationpractice.com/index.php?id_category=5&controller=category', false)

WebUI.click(findTestObject('navigation menu/a_Dresses'))
assert WebUI.getWindowTitle() == 'Dresses - My Store'
	
CurrentUrl2= WebUI.getUrl()
WebUI.verifyMatch(CurrentUrl2,'http://automationpractice.com/index.php?id_category=8&controller=category', false)


WebUI.closeBrowser()