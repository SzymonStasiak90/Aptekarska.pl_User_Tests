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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://www.aptekarska.pl/oferta/course/index.php?categoryid=6')

WebUI.click(findTestObject('Object Repository/Oferta Aspekty Prawne/Page_Aptekarska Szkoa Zarzdzania Wszystkie kursy/span_Nie zgadzam si'))

WebUI.setText(findTestObject('Object Repository/Oferta Aspekty Prawne/Page_Aptekarska Szkoa Zarzdzania Wszystkie kursy/input_Wyszukaj_q'),
	'Diagnostyka')

WebUI.click(findTestObject('Object Repository/Oferta Aspekty Prawne/Page_Aptekarska Szkoa Zarzdzania Wszystkie kursy/button_Wykonaj'))

WebUI.click(findTestObject('Object Repository/Oferta Aspekty Prawne/Page_Aptekarska Szkoa/img_Wyniki wyszukiwania'))

WebUI.click(findTestObject('Object Repository/Oferta Aspekty Prawne/Page_Streszczenie Diagnostyk/a_Wywietl'))

WebUI.verifyEqual(WebUI.getUrl(),'https://www.aptekarska.pl/oferta/login/index.php')

WebUI.back()

WebUI.back()

WebUI.click(findTestObject('Object Repository/Oferta Aspekty Prawne/Page_Aptekarska Szkoa/a_Diagnostyka, pielgnacja'))

WebUI.click(findTestObject('Object Repository/Oferta Aspekty Prawne/Page_Streszczenie Diagnostyk/a_Wywietl'))


WebUI.verifyEqual(WebUI.getUrl(),'https://www.aptekarska.pl/oferta/login/index.php')