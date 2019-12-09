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

//Check navigation sub menu for 'Women'  
WebUI.mouseOver(findTestObject('navigation menu/a_Women'))
WebUI.delay(3)
WebUI.verifyElementClickable(findTestObject('navigation menu/a_Tops'))
WebUI.verifyElementClickable(findTestObject('navigation menu/a_Blouses'))
WebUI.verifyElementClickable(findTestObject('Object Repository/navigation menu/a_T-shirts - sub'))

//Check navigation sub menu for 'Women' Tops
WebUI.click(findTestObject('navigation menu/a_Tops'))
assert WebUI.getWindowTitle() == 'Tops - My Store'
CurrentUrl3= WebUI.getUrl()
WebUI.verifyMatch(CurrentUrl3,'http://automationpractice.com/index.php?id_category=4&controller=category', false)

WebUI.mouseOver(findTestObject('navigation menu/a_Women'))
WebUI.delay(3)
WebUI.click(findTestObject('navigation menu/a_Blouses'))
assert WebUI.getWindowTitle() == 'Blouses - My Store'
CurrentUrl4= WebUI.getUrl()
WebUI.verifyMatch(CurrentUrl4,'http://automationpractice.com/index.php?id_category=7&controller=category', false)

WebUI.mouseOver(findTestObject('navigation menu/a_Women'))
//WebUI.waitForElementPresent('navigation menu/a_T-shirts - Sub', 3)
WebUI.delay(3)
WebUI.click(findTestObject('navigation menu/a_T-shirts - sub'))
assert WebUI.getWindowTitle() == 'T-shirts - My Store'
CurrentUrl5= WebUI.getUrl()
WebUI.verifyMatch(CurrentUrl5,'http://automationpractice.com/index.php?id_category=5&controller=category', false)

//Check navigation sub menu for 'Women' Dresses
WebUI.mouseOver(findTestObject('navigation menu/a_Women'))
//WebUI.waitForElementPresent('navigation menu/a_Dresses - Sub', 3)
WebUI.delay(3)
WebUI.verifyElementClickable(findTestObject('navigation menu/a_Dresses - Sub'))
WebUI.verifyElementClickable(findTestObject('navigation menu/a_Casual Dresses'))
WebUI.verifyElementClickable(findTestObject('navigation menu/a_Evening Dresses'))
WebUI.verifyElementClickable(findTestObject('navigation menu/a_Summer Dresses'))


WebUI.click(findTestObject('navigation menu/a_Dresses - Sub'))
assert WebUI.getWindowTitle() == 'Dresses - My Store'
CurrentUrl8= WebUI.getUrl()
WebUI.verifyMatch(CurrentUrl8,'http://automationpractice.com/index.php?id_category=8&controller=category', false)

WebUI.mouseOver(findTestObject('navigation menu/a_Women'))
//WebUI.waitForElementPresent('navigation menu/a_Casual Dresse', 3)
WebUI.delay(3)
WebUI.click(findTestObject('navigation menu/a_Casual Dresses'))
assert WebUI.getWindowTitle() == 'Casual Dresses - My Store'
CurrentUrl8= WebUI.getUrl()
WebUI.verifyMatch(CurrentUrl8,'http://automationpractice.com/index.php?id_category=9&controller=category', false)

WebUI.mouseOver(findTestObject('navigation menu/a_Women'))
//WebUI.waitForElementPresent('navigation menu/a_Evening Dresses', 3)
WebUI.delay(3)
WebUI.click(findTestObject('navigation menu/a_Evening Dresses'))
assert WebUI.getWindowTitle() == 'Evening Dresses - My Store'
CurrentUrl6= WebUI.getUrl()
WebUI.verifyMatch(CurrentUrl6,'http://automationpractice.com/index.php?id_category=10&controller=category', false)

WebUI.mouseOver(findTestObject('navigation menu/a_Women'))
//WebUI.waitForElementPresent('navigation menu/a_Summer Dresses', 3)
WebUI.delay(3)
WebUI.click(findTestObject('navigation menu/a_Summer Dresses'))
assert WebUI.getWindowTitle() == 'Summer Dresses - My Store'
CurrentUrl7= WebUI.getUrl()
WebUI.verifyMatch(CurrentUrl7,'http://automationpractice.com/index.php?id_category=11&controller=category', false)

WebUI.closeBrowser()