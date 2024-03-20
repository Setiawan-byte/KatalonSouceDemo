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

WebUI.callTestCase(findTestCase('Inventory TC/Add Cart 2 Item'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Product_Inventory/Page_Swag Labs/shoppingCartIcon'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/button_Checkout'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_firstName'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_lastName'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_postalCode'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_continue'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/h3_Error First Name is required'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_firstName'), 'muhammad')

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_continue'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/h3_Error Last Name is required'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_lastName'), 'setiawan')

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_continue'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/h3_Error Postal Code is required'))

WebUI.setText(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_postalCode'), 'sdsd')

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/input_continue'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_Total 43.18'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_Tax 3.20'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_Item total 39.98'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_SauceCard 31337'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/div_QTYDescription1Sauce Labs Backpackcarry_5c1396'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/span_Checkout Overview'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/button_Finish'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/span_Checkout Complete'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/h2_Thank you for your order'))

WebUI.click(findTestObject('Object Repository/Checkout/Page_Swag Labs/button_Back Home'))

