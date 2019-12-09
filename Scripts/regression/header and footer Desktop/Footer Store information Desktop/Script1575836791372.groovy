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
WebUI.scrollToPosition(9999999, 9999999)
//Check info 
WebUI.verifyElementVisible(findTestObject('Object Repository/Footer elements/Page_My Store/h4_Store information'))
WebUI.verifyTextPresent('Selenium Framework, Research Triangle Park, North Carolina, USA', false)
WebUI.verifyTextPresent('(347) 466-7432', false)
WebUI.verifyTextPresent('Call us now', false)
WebUI.verifyTextPresent('Email', false)
WebUI.verifyTextPresent('support@seleniumframework.com', false)
WebUI.verifyTextPresent('Ecommerce software by PrestaShop™', false)
WebUI.verifyTextPresent('2014', false)
WebUI.verifyLinksAccessible(['https://www.prestashop.com/'])
WebUI.closeBrowser()