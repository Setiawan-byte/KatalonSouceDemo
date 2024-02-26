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
import java.lang.StringBuffer as StringBuffer

WebUI.openBrowser('')

WebUI.navigateToUrl(GlobalVariable.DEV_URL)

WebUI.verifyElementPresent(findTestObject('Login Page/Page_Swag Labs/div_Swag Labs'), 0)

WebUI.setText(findTestObject('Login Page/Page_Swag Labs/input_Swag Labs_user-name'), GlobalVariable.USERNAME)

WebUI.setText(findTestObject('Login Page/Page_Swag Labs/input_Swag Labs_password'), GlobalVariable.PASSWORD)

WebUI.click(findTestObject('Login Page/Page_Swag Labs/input_Swag Labs_login-button'))

WebUI.verifyEqual(WebUI.getUrl(), 'https://www.saucedemo.com/inventory.html')

WebUI.verifyElementPresent(findTestObject('Product_Inventory/Page_Swag Labs/span_Products'), 0)

totalPriceCartMenu = WebUI.getAttribute(findTestObject('Product_Inventory/Page_Swag Labs/img_Name (A to Z)_inventory_item_img'), 
    'src')

//InventoryImage = WebUI.getAttribute(findTestObject('Product_Inventory/Page_Swag Labs/InventoryContainer'), 'class')

//	InventoryImage = WebUI.getAttribute(findTestObject(InventoryImage),'class')
//	InventoryImage = WebUI.getAttribute(findTestObject(InventoryImage),'src')
WebUI.click(findTestObject('Product_Inventory/Page_Swag Labs/img_Name (A to Z)_inventory_item_img'))

totalPriceInvoiceMenu = WebUI.getAttribute(findTestObject('Product_Inventory/Page_Swag Labs/img_Back to products_inventory_details_img'), 
    'src')

WebUI.verifyMatch(totalPriceCartMenu, totalPriceInvoiceMenu, false)

