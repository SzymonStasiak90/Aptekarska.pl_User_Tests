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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://www.aptekarska.pl/oferta/course/index.php?categoryid=7')

WebUI.click(findTestObject('Object Repository/Oferta Aspekty Prawne/Page_Aptekarska Szkoa Zarzdzania Wszystkie kursy/span_Nie zgadzam si'))

WebUI.click(findTestObject('Spy - wyszukaj i kategorie/Page_Aptekarska Szkoa Zarzdzania/select_Opieka farmaceutyczna'))

WebUI.selectOptionByValue(findTestObject('Object Repository/Oferta Aspekty Prawne/Page_Aptekarska Szkoa Zarzdzania Wszystkie kursy/select_Opieka farmaceutyczna 0'), 
    '6', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Oferta Aspekty Prawne/Page_Aptekarska Szkoa Zarzdzania Wszystkie kursy/select_Opieka farmaceutyczna 1'), 
    '5', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Oferta Aspekty Prawne/Page_Aptekarska Szkoa Zarzdzania Wszystkie kursy/select_Opieka farmaceutyczna 2'), 
    '7', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Oferta Aspekty Prawne/Page_Aptekarska Szkoa Zarzdzania Wszystkie kursy/select_Opieka farmaceutyczna 3'), 
    '10', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Oferta Aspekty Prawne/Page_Aptekarska Szkoa Zarzdzania Wszystkie kursy/select_Opieka farmaceutyczna 4'), 
    '21', true)

WebUI.closeBrowser()

