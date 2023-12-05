import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://s1-astra-stage.dawlance.com.pk/')

WebUI.maximizeWindow()

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/span_Products'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/a_Technologies'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/a_Promotions'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/svg_icon icon-notification'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/img'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/a_Store Locator'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/a_Support'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/a_Sign In'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/div_Search'))

WebUI.verifyElementClickable(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/svg_icon icon-bag'))

WebUI.click(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/span_Products'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/span_Products'), 
    'Products')

WebUI.click(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/a_Technologies'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/a_Technologies'), 
    'Technologies')

WebUI.click(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/a_Promotions'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/a_Promotions'), 
    'Promotions')

WebUI.click(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/a_Store Locator'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/a_Store Locator'), 
    'Store Locator')

WebUI.click(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/div_Store LocatorSupportSign In'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/a_Support'), 
    'Support')

WebUI.click(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/a_Sign In'))

WebUI.verifyElementText(findTestObject('Object Repository/Page_Home Appliances in Pakistan Online At _8cbccb/a_Sign In'), 
    'Sign In')

WebUI.closeBrowser()

