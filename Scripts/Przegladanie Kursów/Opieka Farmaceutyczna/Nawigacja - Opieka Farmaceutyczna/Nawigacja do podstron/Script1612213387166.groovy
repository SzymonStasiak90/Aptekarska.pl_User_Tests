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

WebUI.navigateToUrl('https://www.aptekarska.pl/oferta/course/index.php?categoryid=6')

WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania Wszystkie kursy/span_Nie zgadzam si'))

WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania Wszystkie kursy/a_Zarzdzanie aptek'))

WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/oferta/course/index.php?categoryid=5')

WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania Wszystkie kursy/a_Aspekty prawne'))

WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/oferta/course/index.php?categoryid=7')

WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania Wszystkie kursy/a_Inne produkty'))

WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/oferta/course/index.php?categoryid=10')

WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania Wszystkie kursy/a_Twj koszyk'))

WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/oferta/blocks/shoppingcart/shopping_cart.php')

WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania/img_Zaloguj si_site-logo'))

WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/oferta/')

WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania/a_Opieka farmaceutyczna'))

WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/oferta/course/index.php?categoryid=6')

