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

WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania/button_Nie zgadzam si'))

WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania/a_Zaloguj si'))

WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania Zaloguj si_5afc5b/button_Utwrz nowe konto'))

WebUI.setText(findTestObject('FORMULARZ REJESTRACJI/Page_Nowe konto/input_E-mail_email'), 'szymon.stasiak.intersiec@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Nowe konto/input_Haso_password'), 'FagcKBWqMgwn3VnWyA1KYw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Nowe konto/input_Powtrz haso_password2'), 'FagcKBWqMgwn3VnWyA1KYw==')

WebUI.setText(findTestObject('Object Repository/Page_Nowe konto/input_Imi_firstname'), 'Szymon')

WebUI.setText(findTestObject('Object Repository/Page_Nowe konto/input_Nazwisko_lastname'), 'Stasiak')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Nowe konto/select_Wybierz...            Nie dotyczy   _184801'), 
    'OIA w Opolu', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Nowe konto/select_Wybierz...            waciciel (nie _04b8a7'), 
    'student', true)

WebUI.setText(findTestObject('Object Repository/Page_Nowe konto/input_Telefon_profile_field_billing_phone'), '608111765')

WebUI.setText(findTestObject('Object Repository/Page_Nowe konto/input_Nazwa firmy  Imi i nazwisko_profile_f_cc8957'), 'Szymon Stasiak')

WebUI.setText(findTestObject('Object Repository/Page_Nowe konto/input_Ulica, nr budynku  lokalu_profile_fie_9b231d'), '6')

WebUI.setText(findTestObject('Object Repository/Page_Nowe konto/input_Kod pocztowy_profile_field_billing_postcode'), '43-523')

WebUI.setText(findTestObject('Object Repository/Page_Nowe konto/input_Miejscowo_profile_field_billing_city'), 'Opole')

WebUI.setText(findTestObject('Object Repository/Page_Nowe konto/input_Miejscowo_profile_field_billing_city'), 'Katowice')

WebUI.setText(findTestObject('Object Repository/Page_Nowe konto/input_WojewdztwoRegion_profile_field_billing_state'), 'Śląskie')

WebUI.click(findTestObject('Object Repository/Page_Nowe konto/input_Zgoda na regulamin_profile_field_zgoda1'))

WebUI.click(findTestObject('FORMULARZ REJESTRACJI/Page_Nowe konto/input_httpswww.aptekarska.pl'))

WebUI.closeBrowser()

