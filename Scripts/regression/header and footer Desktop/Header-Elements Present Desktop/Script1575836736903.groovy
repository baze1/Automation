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


WebUI.verifyElementPresent(findTestObject('header elements/img_Sign in_img-responsive'),1)

WebUI.verifyElementPresent(findTestObject('header elements/span_Call us now 0123-456-789'),1)

WebUI.verifyElementPresent(findTestObject('header elements/strong_0123-456-789'),1)
WebUI.verifyElementText(findTestObject('header elements/strong_0123-456-789'), '0123-456-789')

WebUI.verifyElementPresent(findTestObject('header elements/i_Call us now_icon-phone'),1)

WebUI.verifyElementPresent(findTestObject('header elements/a_Contact us'),1)
WebUI.verifyElementText(findTestObject('header elements/a_Contact us'), 'Contact us')

WebUI.verifyElementPresent(findTestObject('header elements/a_Sign in'),1)
WebUI.verifyElementText(findTestObject('header elements/a_Sign in'), 'Sign in')

WebUI.verifyElementPresent(findTestObject('header elements/img_Call us now_logo img-responsive'),1)

WebUI.verifyElementPresent(findTestObject('header elements/a_Cart0ProductProducts(empty)'),1)

WebUI.verifyElementPresent(findTestObject('header elements/div_Search'),1)

WebUI.verifyElementPresent(findTestObject('header elements/ul_WomenTopsT-shirtsBlousesDressesCasual DressesEvening DressesSummer DressesDressesCasual DressesEvening DressesSummer DressesT-shirts'),1)
WebUI.takeScreenshot('TestScreenShots/header.png')



WebUI.closeBrowser()

