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
//Check navigation sub menu for 'Dresses'
WebUI.mouseOver(findTestObject('navigation menu/a_Dresses'))
//WebUI.waitForElementPresent('navigation menu/a_Casual_Dresses', 3)
WebUI.delay(3)
WebUI.verifyElementClickable(findTestObject('navigation menu/a_Casual_Dresses'))
WebUI.verifyElementClickable(findTestObject('navigation menu/a_Evening_Dresses'))
WebUI.verifyElementClickable(findTestObject('navigation menu/a_Summer_Dresses'))



WebUI.click(findTestObject('navigation menu/a_Casual_Dresses'))
assert WebUI.getWindowTitle() == 'Casual Dresses - My Store'
CurrentUrl10= WebUI.getUrl()
WebUI.verifyMatch(CurrentUrl10,'http://automationpractice.com/index.php?id_category=9&controller=category', false)


WebUI.mouseOver(findTestObject('navigation menu/a_Dresses'))
//WebUI.waitForElementPresent('navigation menu/a_Summer_Dresses', 3)
WebUI.delay(3)
WebUI.click(findTestObject('navigation menu/a_Summer_Dresses'))
assert WebUI.getWindowTitle() == 'Summer Dresses - My Store'
CurrentUrl9= WebUI.getUrl()
WebUI.verifyMatch(CurrentUrl9,'http://automationpractice.com/index.php?id_category=11&controller=category', false)

WebUI.mouseOver(findTestObject('navigation menu/a_Dresses'))
//WebUI.waitForElementPresent('navigation menu/a_Evening_Dresses', 3)
WebUI.delay(3)
WebUI.click(findTestObject('navigation menu/a_Evening_Dresses'))
assert WebUI.getWindowTitle() == 'Evening Dresses - My Store'
CurrentUrl11= WebUI.getUrl()
WebUI.verifyMatch(CurrentUrl11,'http://automationpractice.com/index.php?id_category=10&controller=category', false)

WebUI.closeBrowser()





