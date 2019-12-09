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

// Check for invalid string 

WebUI.setText(findTestObject('Object Repository/Search/div_Search'), 'sefaesd')


WebUI.click(findTestObject('Object Repository/Search/button_Search'))
WebUI.verifyElementPresent(findTestObject('Search/no results'), 1)

//Clear text

WebUI.click(findTestObject('Search/div_Search'))
WebUI.clearText(findTestObject('Search/div_Search'))

//Check for relusts
WebUI.setText(findTestObject('Search/div_Search'), 'Printed Chiffon Dress')
WebUI.click(findTestObject('Object Repository/Search/button_Search'))
WebUI.verifyTextPresent('2 results have been found', false)

WebUI.closeBrowser()



