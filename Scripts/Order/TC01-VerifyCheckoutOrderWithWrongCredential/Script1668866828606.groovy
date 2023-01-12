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

Mobile.comment('Story: Verify checkout order functionality')

Mobile.waitForElementPresent(findTestObject('RupaRupa/HomePage/PopupButton'), GlobalVariable.timeout)

Mobile.tap(findTestObject('RupaRupa/HomePage/PopupButton'), GlobalVariable.timeout)

//Mobile.waitForElementPresent(findTestObject('RupaRupa/HomePage/BannerButton'), GlobalVariable.longTimeout)
//
//Mobile.tapAtPosition(1332, 802)

Mobile.comment('When the user tap on Rumah tangga category button')

Mobile.tap(findTestObject('RupaRupa/HomePage/RumahTanggaButton'), GlobalVariable.timeout)

Mobile.comment('And the user tap on Lihat Semua Rumah tangga category button')

Mobile.waitForElementPresent(findTestObject('RupaRupa/HomePage/LihatSemuaRumahTanggaButton'), GlobalVariable.timeout)

Mobile.tap(findTestObject('RupaRupa/HomePage/LihatSemuaRumahTanggaButton'), GlobalVariable.timeout)

Mobile.comment('And the user tap on Filter button')

Mobile.waitForElementPresent(findTestObject('RupaRupa/RumahTanggaCategoryProductPage/FilterButton'), GlobalVariable.timeout)

Mobile.tap(findTestObject('RupaRupa/RumahTanggaCategoryProductPage/FilterButton'), GlobalVariable.timeout)

Mobile.waitForElementPresent(findTestObject('RupaRupa/RumahTanggaCategoryProductPage/FilterSaveButton'), GlobalVariable.timeout)

Mobile.comment('And the user tap on Promo button')

scrollToText = 'Promo'

Mobile.scrollToText(scrollToText, FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('RupaRupa/RumahTanggaCategoryProductPage/LihatSemuaPromoButton'), GlobalVariable.timeout)

Mobile.comment('And the user tap on Buy1get1 checkbox')

promoCategoryLocalVar = 'Buy 1 Get 1'

Mobile.waitForElementPresent(findTestObject('RupaRupa/RumahTanggaCategoryProductPage/PromoCheckbox', [('promoCategory') : promoCategoryLocalVar]), 
    GlobalVariable.timeout)

Mobile.tap(findTestObject('RupaRupa/RumahTanggaCategoryProductPage/PromoCheckbox', [('promoCategory') : promoCategoryLocalVar]), 
    GlobalVariable.timeout)

Mobile.comment('And the user tap on New Arrivals checkbox')

promoCategoryLocalVar2 = 'New Arrivals'

Mobile.tap(findTestObject('RupaRupa/RumahTanggaCategoryProductPage/PromoCheckbox', [('promoCategory') : promoCategoryLocalVar2]), 
    GlobalVariable.timeout)

Mobile.comment('And the user tap on Simpan button')

Mobile.tap(findTestObject('RupaRupa/RumahTanggaCategoryProductPage/PromoSaveButton'), GlobalVariable.timeout)

Mobile.comment('And the user tap on Terapkan button')

Mobile.waitForElementPresent(findTestObject('RupaRupa/RumahTanggaCategoryProductPage/FilterSaveButton'), GlobalVariable.timeout)

Mobile.tap(findTestObject('RupaRupa/RumahTanggaCategoryProductPage/FilterSaveButton'), GlobalVariable.timeout)

Mobile.waitForElementPresent(findTestObject('RupaRupa/RumahTanggaCategoryProductPage/FilterIcon'), GlobalVariable.timeout)

Mobile.comment('And the user scroll down to products')

scrollToText = promoCategoryLocalVar

Mobile.scrollToText(scrollToText, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('And the user tap on first product')

rowLocalVar = 1

columnLocalVar = 1

Mobile.waitForElementPresent(findTestObject('RupaRupa/RumahTanggaCategoryProductPage/Product', [('row') : rowLocalVar, ('column') : columnLocalVar]), 
    GlobalVariable.timeout)

Mobile.tap(findTestObject('RupaRupa/RumahTanggaCategoryProductPage/Product', [('row') : rowLocalVar, ('column') : columnLocalVar]), 
    GlobalVariable.timeout)

Mobile.comment('And the user tap on tambah ke keranjang button')

Mobile.waitForElementPresent(findTestObject('RupaRupa/HomePage/PopupButton'), GlobalVariable.timeout)

Mobile.tap(findTestObject('RupaRupa/ProductDetailPage/PopupTutupButton'), GlobalVariable.timeout)

Mobile.tap(findTestObject('RupaRupa/ProductDetailPage/TambahKeKeranjangButton'), GlobalVariable.timeout)

Mobile.waitForElementPresent(findTestObject('RupaRupa/ProductDetailPage/MetodePengirimanPilihButton'), GlobalVariable.timeout)

Mobile.tap(findTestObject('RupaRupa/ProductDetailPage/MetodePengirimanPilihButton'), GlobalVariable.timeout)

Mobile.comment('And the user tap on lanjut ke keranjang button')

Mobile.waitForElementPresent(findTestObject('RupaRupa/ProductDetailPage/LanjutKeKeranjangButton'), GlobalVariable.timeout)

Mobile.tap(findTestObject('RupaRupa/ProductDetailPage/LanjutKeKeranjangButton'), GlobalVariable.timeout)

Mobile.waitForElementPresent(findTestObject('RupaRupa/ProductCartPage/PopupOkButton'), GlobalVariable.timeout)

Mobile.tap(findTestObject('RupaRupa/ProductCartPage/PopupOkButton'), GlobalVariable.timeout)

Mobile.tap(findTestObject('RupaRupa/ProductCartPage/LanjutKePembayaranButton'), GlobalVariable.timeout)

Mobile.comment('And the user tap on sign in section')

Mobile.waitForElementPresent(findTestObject('RupaRupa/ProductCheckoutPage/LoginButton'), GlobalVariable.longTimeout)

Mobile.comment('And the user fill on random email and password in sign in form')

Mobile.setText(findTestObject('RupaRupa/ProductCheckoutPage/EmailTextField'), GlobalVariable.email, GlobalVariable.timeout)

Mobile.setText(findTestObject('RupaRupa/ProductCheckoutPage/PasswordTextField'), GlobalVariable.email, GlobalVariable.timeout)

Mobile.tap(findTestObject('RupaRupa/ProductCheckoutPage/LoginButton'), GlobalVariable.timeout)

Mobile.comment('Then the login error message should be displayed')

Mobile.waitForElementPresent(findTestObject('RupaRupa/ProductCheckoutPage/LoginErrorMessage'), GlobalVariable.timeout)

Mobile.verifyElementText(findTestObject('RupaRupa/ProductCheckoutPage/LoginErrorMessage'), ' Alamat email atau nomor telepon dan password Anda salah')

@com.kms.katalon.core.annotation.SetUp
def setup() {
    Mobile.comment('Given the user has started an application')

    Mobile.startApplication(GlobalVariable.appPath, true)
}

@com.kms.katalon.core.annotation.TearDown
def tearDown() {
    Mobile.comment('And the application is closed')

    Mobile.closeApplication()
}

