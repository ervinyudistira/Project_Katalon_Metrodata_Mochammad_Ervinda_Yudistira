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

//LOGIN WEBSITE PICKME METRODATA
'Open Browser'
WebUI.openBrowser('')

WebUI.maximizeWindow()
'Menampilkan Website Pickme'
WebUI.navigateToUrl(GlobalVariable.URL)
WebUI.takeScreenshot()

'Menu Login'
WebUI.click(findTestObject('Object Repository/i_About_fa fa-user'))
'Input Username'
WebUI.setText(findTestObject('Object Repository/input_Username_username'), GlobalVariable.DataUsername)
'Input Password'
WebUI.setText(findTestObject('Object Repository/input_Kata Sandi_password'), GlobalVariable.DataPassword)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/button_LOGIN'))

//VERIFIKASI LOGIN BERHASIL
if(GlobalVariable.DataUsername == 'mitracamp')
{
	println('Login Berhasil')
	'Tampilan Login Berhasil'
}
WebUI.takeScreenshot()

WebUI.delay(GlobalVariable.Waiting)

WebUI.closeBrowser()

