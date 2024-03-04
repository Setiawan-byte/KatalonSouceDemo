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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Inventory TC/Inventory check'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Product_Inventory/Page_Swag Labs/inventoryImg'))

WebUI.verifyEqual(WebUI.getUrl(), 'https://www.saucedemo.com/inventory-item.html?id=4')

'images'
WebUI.verifyElementVisible(findTestObject('Product_Inventory/Page_Swag Labs/_DetailItem/detailImg'))

println(GlobalVariable.Thumbnail)

WebUI.verifyEqual(WebUI.getAttribute(findTestObject('Object Repository/Product_Inventory/Page_Swag Labs/_DetailItem/detailImg'), 
        'src'), GlobalVariable.Thumbnail, FailureHandling.CONTINUE_ON_FAILURE)

'Item name'
WebUI.verifyElementVisible(findTestObject('Product_Inventory/Page_Swag Labs/_DetailItem/detailTittle'), FailureHandling.STOP_ON_FAILURE)
WebUI.verifyEqual(WebUI.getText(findTestObject('Product_Inventory/Page_Swag Labs/_DetailItem/detailTittle')),'Sauce Labs Backpack')

'description'
WebUI.verifyElementVisible(findTestObject('Product_Inventory/Page_Swag Labs/_DetailItem/detailsDescLarge'), FailureHandling.STOP_ON_FAILURE)
WebUI.verifyEqual(WebUI.getText(findTestObject('Product_Inventory/Page_Swag Labs/_DetailItem/detailsDescLarge')),'carry.allTheThings() with the sleek, streamlined Sly Pack that melds uncompromising style with unequaled laptop and tablet protection.')
'price'
WebUI.verifyElementVisible(findTestObject('Object Repository/Product_Inventory/Page_Swag Labs/_DetailItem/detailPrice'), 
    FailureHandling.STOP_ON_FAILURE)
WebUI.verifyEqual(WebUI.getText(findTestObject('Object Repository/Product_Inventory/Page_Swag Labs/_DetailItem/detailPrice')),'$29.99')

'add to cart button'
WebUI.verifyElementVisible(findTestObject('Product_Inventory/Page_Swag Labs/button_Add to cart'), FailureHandling.STOP_ON_FAILURE)




