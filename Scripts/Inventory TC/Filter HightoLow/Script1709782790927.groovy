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
import com.kms.katalon.core.util.KeywordUtil as KeywordUtil
import org.openqa.selenium.WebElement as WebElement

WebUI.callTestCase(findTestCase('Login TC/Positive'), [:], FailureHandling.STOP_ON_FAILURE)

try {
    WebUI.selectOptionByValue(findTestObject('Object Repository/Product_Inventory/Page_Swag Labs/Filter/selectFilter'), 
        'hilo', true)
}
catch (Exception e) {
    println('Filter changed to High to Low')
} 

List<WebElement> HargaList = WebUI.findWebElements(findTestObject('Product_Inventory/Page_Swag Labs/inventoryPrice'), 10)

List<WebElement> hargaOri = new ArrayList()

List<WebElement> hargaSort = new ArrayList()

for (def data : HargaList) {
    hargaOri.add(Double.parseDouble(data.getText().replace('$','')))		//jadikan desimal
    hargaSort.add(Double.parseDouble(data.getText().replace('$','')))
    println((('Ori: ' + (hargaOri[-1])) + ' |  Sort: ') + (hargaSort[-1]))
}

Collections.sort(hargaSort)
println(hargaSort)
println(hargaOri)

//Collection.sort(sortedList, Collections.reverseOrder())
if (!(hargaOri.equals(hargaSort.reverse()))) {    //reverse here
    KeywordUtil.markFailed('Sorting tidak sesuai')
} else {
    println('Sorting sesuai')
}

