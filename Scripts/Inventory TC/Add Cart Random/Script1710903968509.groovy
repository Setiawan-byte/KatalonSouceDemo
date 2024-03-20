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
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.Keys as Keys
import org.openqa.selenium.WebElement as WebElement
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

WebUI.callTestCase(findTestCase('Login TC/Positive'), [:], FailureHandling.STOP_ON_FAILURE)

// How many item clicked
'How many Item want to click (Min:1)'
int numRandomClicks = 3

// Get all "Add to cart" buttons
List<WebElement> addToCartButtons = DriverFactory.getWebDriver().findElements(By.xpath('//button[(text() = "Add to cart")]'))

//print the list
println('Length of the list: ' + addToCartButtons.size())

println('Contents of the list:')

addToCartButtons.each({ def button ->
        println(button.getText())
    })

// Perform random button clicks without repetition
for (int i = 0; (i < numRandomClicks) && !(addToCartButtons.isEmpty()); i++) {
    // Generate a random index within the current range of the buttons
    int randomIndex = ((Math.random() * addToCartButtons.size()) as int)

    // Click on the button at the randomly generated index
    WebElement randomButton = addToCartButtons.get(randomIndex)

    randomButton.click()

    // Remove the clicked button from the list
    addToCartButtons.remove(randomButton)
}

WebUI.delay(2)

// Get all "Remove" buttons / Clicked 
List<WebElement> removeButtons = DriverFactory.getWebDriver().findElements(By.xpath('//button[(text() = "Remove")]'))
GlobalVariable.removeButtons = removeButtons    //store to Global variable

// Get the id attribute of the clicked button
removeButtons.each({ def idAttribute ->
        println(idAttribute.getAttribute('id'))
    })

WebUI.delay(3)

