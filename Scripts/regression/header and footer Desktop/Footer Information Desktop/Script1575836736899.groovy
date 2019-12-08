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

//Verify elements are present and links are accessible
WebUI.scrollToPosition(9999999, 9999999)

WebUI.verifyElementVisible(findTestObject('Footer elements/h4_Information'))

WebUI.verifyElementPresent(findTestObject('Footer elements/a_Specials'),1)

WebUI.verifyElementPresent(findTestObject('Footer elements/a_New products'),1)

WebUI.verifyElementPresent(findTestObject('Footer elements/a_Best sellers'),1)

WebUI.verifyElementPresent(findTestObject('Footer elements/a_Our stores'),1)

WebUI.verifyElementPresent(findTestObject('Footer elements/a_Contact us'),1)

WebUI.verifyElementPresent(findTestObject('Footer elements/a_Terms and conditions of use'),1)
WebUI.verifyElementPresent(findTestObject('Object Repository/Footer elements/a_About us'),1)

WebUI.verifyElementPresent(findTestObject('Footer elements/a_Sitemap'),1)

WebUI.verifyLinksAccessible(['http://automationpractice.com/index.php?controller=prices-drop','http://automationpractice.com/index.php?controller=new-products','http://automationpractice.com/index.php?controller=best-sales','http://automationpractice.com/index.php?controller=stores','http://automationpractice.com/index.php?controller=contact','http://automationpractice.com/index.php?id_cms=3&controller=cms','http://automationpractice.com/index.php?id_cms=4&controller=cms','http://automationpractice.com/index.php?controller=sitemap' ])

WebUI.closeBrowser()