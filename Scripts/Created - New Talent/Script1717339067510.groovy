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
if (GlobalVariable.DataUsername == 'mitracamp') {
    println('Login Berhasil')

    'Tampilan Login Berhasil'
}

WebUI.takeScreenshot()

WebUI.click(findTestObject('Object Repository/a_Talent'))

WebUI.click(findTestObject('Object Repository/a_New Talent'))

WebUI.click(findTestObject('Object Repository/a_'))

WebUI.setText(findTestObject('Object Repository/input_Nama Lengkap_inputFullName'), namaProfil)

WebUI.setText(findTestObject('Object Repository/input_Nomor KTP_inputKtp'), ktpProfil)

WebUI.setText(findTestObject('Object Repository/input__inputNationality'), negaraProfil)

WebUI.setText(findTestObject('Object Repository/input__inputBirthPlace'), tempatlahirProfil)

//WebUI.selectOptionByValue(findTestObject('Object Repository/Page_App  CV-ME/select_-- Pilih --                                            Single                                            Married'), 
//    status, true)
if(status == 'Single') 
	{
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_App  CV-ME/select_-- Pilih --                                            Single                                            Married'),
		'Single', true)
}
else 	
{
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_App  CV-ME/select_-- Pilih --                                            Single                                            Married'),
		'Married', true)
}

//MEMILIH AGAMA PROFIL
if(agama == '1')
{
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_App  CV-ME/select_-- Pilih --                                            Islam                                            Protestant                                            Catholic                                            Bud'), 
    '1', true)
} else if (agama == '2') 
	{
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_App  CV-ME/select_-- Pilih --                                            Islam                                            Protestant                                            Catholic                                            Bud'),
			'2', true)
} else if (agama == '3')
{
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_App  CV-ME/select_-- Pilih --                                            Islam                                            Protestant                                            Catholic                                            Bud'),
		'3', true)
} else if (agama == '4')
{
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_App  CV-ME/select_-- Pilih --                                            Islam                                            Protestant                                            Catholic                                            Bud'),
		'4', true)
}else if (agama == '5')
{
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_App  CV-ME/select_-- Pilih --                                            Islam                                            Protestant                                            Catholic                                            Bud'),
		'5', true)
}else (agama == '6')
{
	WebUI.selectOptionByValue(findTestObject('Object Repository/Page_App  CV-ME/select_-- Pilih --                                            Islam                                            Protestant                                            Catholic                                            Bud'),
		'6', true)
}

//MEMILIH JENIS KELAMI PROFIL
WebUI.selectOptionByValue(findTestObject('Object Repository/Page_App  CV-ME/select_-- Pilih --                                            Male                                            Female'), 
    jeniskelamin, true)

WebUI.setText(findTestObject('Object Repository/input_No Telepon_inputPhone'), noHp)

WebUI.setText(findTestObject('Object Repository/input_E-mail_inputEmail'), emailProfil)

WebUI.setText(findTestObject('Object Repository/input_Alamat_inputProvince'), provinsiProfil)

WebUI.setText(findTestObject('Object Repository/input_Alamat_inputCity'), kotaProfil)

WebUI.setText(findTestObject('Object Repository/textarea_Alamat_inputAddress'), alamatProfil)

WebUI.takeScreenshot()
WebUI.delay(GlobalVariable.Waiting)
WebUI.closeBrowser()

