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

WebUI.navigateToUrl('https://petstore.octoperf.com/actions/Catalog.action')

WebUI.click(findTestObject('Buy Pet Demo/Page_JPetStore Demo Payment/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Buy Pet Demo/Billing Address/Page_JPetStore Demo/input_Need a user name and password_username'), 
    'banana')

WebUI.setEncryptedText(findTestObject('Object Repository/Buy Pet Demo/Billing Address/Page_JPetStore Demo/input_Need a user name and password_password'), 
    'G4ixBcjSPZY=')

WebUI.sendKeys(findTestObject('Buy Pet Demo/Page_JPetStore Demo Payment/input_Need a user name and password_password'), 
    Keys.chord(Keys.ENTER))

WebUI.click(findTestObject('Buy Pet Demo/Page_JPetStore Demo Payment/area'))

WebUI.click(findTestObject('Buy Pet Demo/Page_JPetStore Demo Payment/a_AV-SB-02'))

WebUI.click(findTestObject('Buy Pet Demo/Page_JPetStore Demo Payment/a_Add to Cart'))

WebUI.click(findTestObject('Buy Pet Demo/Page_JPetStore Demo Payment/a_Proceed to Checkout'))

WebUI.click(findTestObject('Buy Pet Demo/Page_JPetStore Demo Payment/input_Expiry Date (MMYYYY)_order.expiryDate'))

WebUI.click(findTestObject('Buy Pet Demo/Page_JPetStore Demo Payment/input_Ship to different address_newOrder'))

WebUI.click(findTestObject('Buy Pet Demo/Page_JPetStore Demo Payment/a_Confirm'))

