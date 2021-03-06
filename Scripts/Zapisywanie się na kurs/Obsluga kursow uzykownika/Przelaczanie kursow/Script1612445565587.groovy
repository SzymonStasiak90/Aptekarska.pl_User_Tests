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

WebUI.navigateToUrl('https://www.aptekarska.pl/oferta/')

WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania/span_Nie zgadzam si'))

WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania/a_Opieka farmaceutyczna_item-link'))

WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania Wszystkie kursy/img_Punkty edukacyjne mikkie_course-thumb'))

WebUI.click(findTestObject('Object Repository/Page_Streszczenie Oczyszczanie i zaopatrywa_317a20/a_Wywietl'))

WebUI.setText(findTestObject('FORMULARZ LOGOWANIA/Page_Aptekarska Szkoa Zarzdzania Zaloguj si do serwisu/input_Nazwa uytkownika'), 
    'szymon.stasiak.intersiec@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania Zaloguj si_5afc5b/input_Haso_password'), 
    'FagcKBWqMgwn3VnWyA1KYw==')

WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania Zaloguj si_5afc5b/button_Zaloguj si'))

WebUI.click(findTestObject('SZKOLENIE DIAGNOSTYKA I PIELEGNACJA/Page_Kurs Diagnostyka, pielgnacja/span_Film Pielgnacja'))

WebUI.click(findTestObject('Page_Kurs Oczyszczanie i zaopatrywanie ran _c1ba81/a_Moje szkolenia'))

WebUI.click(findTestObject('Page_Moje szkolenia/span_Moje szkolenia'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Page_Moje szkolenia/span_Moje szkolenia'))

WebUI.click(findTestObject('SZKOLENIE DIAGNOSTYKA I PIELEGNACJA/Page_Moje szkolenia/span_Oczyszczanie'))

WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/oferta/course/view.php?id=662')

WebUI.closeBrowser()

