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



// Wybor Kursu 
WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania Wszystkie kursy/a_Diagnostyka, pielgnacja i leczenie ran pr_d1499e'))
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/oferta/course/info.php?id=662')
WebUI.back()

// Wybor kursu 2
WebUI.click(findTestObject('Object Repository/Page_Aptekarska Szkoa Zarzdzania Wszystkie kursy/a_Diagnostyka, pielgnacja i leczenie ran pr_d1499e'))
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/oferta/course/info.php?id=662')

// Wyswietl kurs

WebUI.click(findTestObject('Object Repository/Page_Streszczenie Diagnostyka, pielgnacja i_b9b23d/a_Diagnostyka, pielgnacja i leczenie ran pr_d1499e'))
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/oferta/login/index.php')
WebUI.back()

// Wyswietl kurs 2

WebUI.click(findTestObject('Object Repository/Page_Streszczenie Diagnostyka, pielgnacja i_b9b23d/a_Wywietl'))
WebUI.verifyEqual(WebUI.getUrl(), 'https://www.aptekarska.pl/oferta/login/index.php')



WebUI.closeBrowser()