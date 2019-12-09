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

WebUI.mouseOver(findTestObject('Order/img_Best Sellers_replace-2x img-responsive'))

WebUI.click(findTestObject('Order/span_Add to cart'))

WebUI.delay(3)

WebUI.click(findTestObject('Order/span_Proceed to checkout'))

WebUI.click(findTestObject('Order/span_Proceed to checkout (1)'))

WebUI.setText(findTestObject('Order/input_Email address_email'), 'blagoja11@gmail.com')

WebUI.setEncryptedText(findTestObject('Order/input_Password_passwd'), 'gfzG1VEcrbZGbK4KTMQXQw==')

WebUI.click(findTestObject('Order/span_Sign in'))

WebUI.delay(1)

WebUI.click(findTestObject('Order/span_Proceed to checkout (1)'))

WebUI.click(findTestObject('Order/span_Proceed to checkout_1'))
WebUI.delay(1)


WebUI.waitForElementClickable(findTestObject('Order/Checkbox'), 5)
WebUI.click(findTestObject('Order/Checkbox'))

WebUI.delay(1)
WebUI.click(findTestObject('Order/span_Proceed to checkout_2'))

WebUI.click(findTestObject('Order/a_Pay by bank wire (order processing will be longer)'))

WebUI.click(findTestObject('Order/span_I confirm my order'))

WebUI.verifyElementVisible(findTestObject('Order/h1_Order confirmation'))

