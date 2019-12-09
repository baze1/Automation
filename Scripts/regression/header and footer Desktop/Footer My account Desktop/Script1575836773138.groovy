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

// Checlk of My account and its elements are clickable and links are accessable

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer elements/Page_Login - My Store/a_My account'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer elements/Page_Login - My Store/a_My orders'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer elements/Page_Login - My Store/a_My credit slips'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer elements/Page_Login - My Store/a_My addresses'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Footer elements/Page_Login - My Store/a_My personal info'))

WebUI.verifyLinksAccessible(['http://automationpractice.com/index.php?controller=authentication&back=my-account','http://automationpractice.com/index.php?controller=authentication&back=history','http://automationpractice.com/index.php?controller=authentication&back=order-slip','http://automationpractice.com/index.php?controller=authentication&back=addresses','http://automationpractice.com/index.php?controller=authentication&back=identity'])

WebUI.closeBrowser()

