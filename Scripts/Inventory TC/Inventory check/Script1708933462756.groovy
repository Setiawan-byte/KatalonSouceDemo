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

WebUI.setText(findTestObject('Object Repository/Login Page/Page_Swag Labs/input_user-name'), 'standard_user')

WebUI.setText(findTestObject('Object Repository/Login Page/Page_Swag Labs/input_password'), 'secret_sauce')

WebUI.click(findTestObject('Object Repository/Login Page/Page_Swag Labs/input_login-button'))

//check image between inventory and inventory item a.k.a detail
GlobalVariable.Thumbnail = WebUI.getAttribute(findTestObject('Object Repository/Product_Inventory/Page_Swag Labs/inventoryImg'), 
    'src')

println(GlobalVariable.Thumbnail)

//List<WebElement> thumbnails = WebUI.findWebElements(findTestObject('Object Repository/Product_Inventory/Page_Swag Labs/inventoryImg'), 10)
//for (def data : thumbnails) {
//	WebUI.getAttribute(data, 'src')
//}
WebUI.verifyElementVisible(findTestObject('Product_Inventory/Page_Swag Labs/inventoryImg'))

WebUI.verifyElementVisible(findTestObject('Product_Inventory/Page_Swag Labs/inventoryItemTittle'))

WebUI.verifyElementVisible(findTestObject('Product_Inventory/Page_Swag Labs/inventoryItemDesc'))

WebUI.verifyElementVisible(findTestObject('Product_Inventory/Page_Swag Labs/inventoryPrice'))

WebUI.verifyElementVisible(findTestObject('Product_Inventory/Page_Swag Labs/button_Add to cart'))

List<WebElement> TittleList = WebUI.findWebElements(findTestObject('Object Repository/Product_Inventory/Page_Swag Labs/List_Item'), 
    10)

List<WebElement> DescList = WebUI.findWebElements(findTestObject('Object Repository/Product_Inventory/Page_Swag Labs/inventoryItemDesc'), 
    10)

List<WebElement> PriceList = WebUI.findWebElements(findTestObject('Object Repository/Product_Inventory/Page_Swag Labs/inventoryPrice'), 
    10)

WebUI.verifyEqual(TittleList.size(),DescList.size())
WebUI.verifyEqual(TittleList.size(),PriceList.size())


for (def data : TittleList) {
    println(data.getText())
}

for (def data : DescList) {
    println(data.getText())
}

for (def data : PriceList) {
    println(data.getText())
}

